// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ed7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ed7(kf7 kf7Var, boolean z, ArrayList arrayList) {
        this.a = (byte) 2;
        this.b = kf7Var;
        this.d = z;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Exception e;
        SQLiteDatabase sQLiteDatabase;
        byte b = this.a;
        int i = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = this.c;
        boolean z = this.d;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                kf7Var.getClass();
                try {
                    try {
                        if (z) {
                            kf7Var.b.beginTransaction();
                            SQLitePreparedStatement executeFast = kf7Var.b.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                            try {
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    TLRPC.User user = (TLRPC.User) arrayList.get(i2);
                                    executeFast.requery();
                                    TLRPC.UserStatus userStatus = user.status;
                                    if (userStatus != null) {
                                        executeFast.bindInteger(1, userStatus.expires);
                                    } else {
                                        executeFast.bindInteger(1, 0);
                                    }
                                    executeFast.bindLong(2, user.id);
                                    executeFast.step();
                                }
                                executeFast.dispose();
                                kf7Var.b.commitTransaction();
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast;
                                kf7Var.p(e, true);
                                SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLitePreparedStatement = executeFast;
                                SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            zh6 zh6Var = new zh6();
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                TLRPC.User user2 = (TLRPC.User) arrayList.get(i3);
                                arrayList2.add(Long.valueOf(user2.id));
                                zh6Var.k(user2.id, user2);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            kf7Var.m0(arrayList2, arrayList3, false);
                            int size3 = arrayList3.size();
                            while (i < size3) {
                                TLRPC.User user3 = (TLRPC.User) arrayList3.get(i);
                                TLRPC.User user4 = (TLRPC.User) zh6Var.f(user3.id);
                                if (user4 != null) {
                                    if (user4.first_name == null || user4.last_name == null) {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                                        if (userProfilePhoto != null) {
                                            user3.photo = userProfilePhoto;
                                        } else {
                                            String str = user4.phone;
                                            if (str != null) {
                                                user3.phone = str;
                                            }
                                        }
                                    } else {
                                        if (!lbc.y(user3)) {
                                            user3.first_name = user4.first_name;
                                            user3.last_name = user4.last_name;
                                        }
                                        user3.username = user4.username;
                                    }
                                }
                                i++;
                            }
                            if (!arrayList3.isEmpty()) {
                                kf7Var.b.beginTransaction();
                                kf7Var.p1(arrayList3);
                                kf7Var.b.commitTransaction();
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = kf7Var.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case 1:
                kf7Var.h1(arrayList, z);
                return;
            default:
                try {
                    if (z) {
                        try {
                            kf7Var.b.executeFast("DELETE FROM contacts WHERE 1").stepThis().dispose();
                        } catch (Exception e4) {
                            e = e4;
                            kf7Var.p(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            sQLiteDatabase = kf7Var.b;
                            if (sQLiteDatabase == null) {
                                return;
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        }
                    }
                    kf7Var.b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("REPLACE INTO contacts VALUES(?, ?)");
                    while (i < arrayList.size()) {
                        try {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i);
                            executeFast2.requery();
                            executeFast2.bindLong(1, tL_contact.user_id);
                            executeFast2.bindInteger(2, tL_contact.mutual ? 1 : 0);
                            executeFast2.step();
                            i++;
                        } catch (Exception e5) {
                            sQLitePreparedStatement = executeFast2;
                            e = e5;
                            kf7Var.p(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            sQLiteDatabase = kf7Var.b;
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        } catch (Throwable th3) {
                            sQLitePreparedStatement = executeFast2;
                            th = th3;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            SQLiteDatabase sQLiteDatabase5 = kf7Var.b;
                            if (sQLiteDatabase5 != null) {
                                sQLiteDatabase5.commitTransaction();
                            }
                            throw th;
                        }
                    }
                    executeFast2.dispose();
                    kf7Var.b.commitTransaction();
                    sQLiteDatabase = kf7Var.b;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLiteDatabase.commitTransaction();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }

    public /* synthetic */ ed7(kf7 kf7Var, ArrayList arrayList, boolean z, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = arrayList;
        this.d = z;
    }
}
