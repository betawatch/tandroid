// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ dd7(jf7 jf7Var, boolean z, ArrayList arrayList) {
        this.a = (byte) 2;
        this.b = jf7Var;
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
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                jf7Var.getClass();
                try {
                    try {
                        if (z) {
                            jf7Var.b.beginTransaction();
                            SQLitePreparedStatement executeFast = jf7Var.b.executeFast("UPDATE users SET status = ? WHERE uid = ?");
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
                                jf7Var.b.commitTransaction();
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast;
                                jf7Var.n(e, true);
                                SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
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
                                SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
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
                            jf7Var.k0(arrayList2, arrayList3, false);
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
                                jf7Var.b.beginTransaction();
                                jf7Var.l1(arrayList3);
                                jf7Var.b.commitTransaction();
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = jf7Var.b;
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
                jf7Var.d1(arrayList, z);
                return;
            default:
                try {
                    if (z) {
                        try {
                            jf7Var.b.executeFast("DELETE FROM contacts WHERE 1").stepThis().dispose();
                        } catch (Exception e4) {
                            e = e4;
                            jf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            sQLiteDatabase = jf7Var.b;
                            if (sQLiteDatabase == null) {
                                return;
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        }
                    }
                    jf7Var.b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = jf7Var.b.executeFast("REPLACE INTO contacts VALUES(?, ?)");
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
                            jf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            sQLiteDatabase = jf7Var.b;
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
                            SQLiteDatabase sQLiteDatabase5 = jf7Var.b;
                            if (sQLiteDatabase5 != null) {
                                sQLiteDatabase5.commitTransaction();
                            }
                            throw th;
                        }
                    }
                    executeFast2.dispose();
                    jf7Var.b.commitTransaction();
                    sQLiteDatabase = jf7Var.b;
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

    public /* synthetic */ dd7(jf7 jf7Var, ArrayList arrayList, boolean z, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = arrayList;
        this.d = z;
    }
}
