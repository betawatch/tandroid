package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zp(ur urVar, ArrayList arrayList, boolean z10, int i7) {
        this.a = i7;
        this.b = urVar;
        this.c = arrayList;
        this.d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Exception e10;
        SQLiteDatabase sQLiteDatabase;
        switch (this.a) {
            case 0:
                ur urVar = this.b;
                urVar.getClass();
                ArrayList arrayList = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        if (this.d) {
                            urVar.b.beginTransaction();
                            SQLitePreparedStatement executeFast = urVar.b.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                            try {
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    TLRPC.User user = (TLRPC.User) arrayList.get(i7);
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
                                urVar.b.commitTransaction();
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement = executeFast;
                                urVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase2 = urVar.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement = executeFast;
                                SQLiteDatabase sQLiteDatabase3 = urVar.b;
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
                            a0.h hVar = new a0.h();
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                TLRPC.User user2 = (TLRPC.User) arrayList.get(i10);
                                arrayList2.add(Long.valueOf(user2.id));
                                hVar.k(user2, user2.id);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            urVar.n0(arrayList2, arrayList3, false);
                            int size3 = arrayList3.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                TLRPC.User user3 = (TLRPC.User) arrayList3.get(i11);
                                TLRPC.User user4 = (TLRPC.User) hVar.f(user3.id);
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
                                        if (!p10.x(user3)) {
                                            user3.first_name = user4.first_name;
                                            user3.last_name = user4.last_name;
                                        }
                                        user3.username = user4.username;
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                urVar.b.beginTransaction();
                                urVar.o1(arrayList3);
                                urVar.b.commitTransaction();
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = urVar.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
                break;
            case 1:
                this.b.g1(this.c, this.d);
                return;
            default:
                ArrayList arrayList4 = this.c;
                ur urVar2 = this.b;
                urVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    if (this.d) {
                        try {
                            urVar2.b.executeFast("DELETE FROM contacts WHERE 1").stepThis().dispose();
                        } catch (Exception e13) {
                            e10 = e13;
                            urVar2.o(e10, true);
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            sQLiteDatabase = urVar2.b;
                            if (sQLiteDatabase == null) {
                                return;
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        }
                    }
                    urVar2.b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = urVar2.b.executeFast("REPLACE INTO contacts VALUES(?, ?)");
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        try {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i12);
                            executeFast2.requery();
                            executeFast2.bindLong(1, tL_contact.user_id);
                            executeFast2.bindInteger(2, tL_contact.mutual ? 1 : 0);
                            executeFast2.step();
                        } catch (Exception e14) {
                            e10 = e14;
                            sQLitePreparedStatement2 = executeFast2;
                            urVar2.o(e10, true);
                            if (sQLitePreparedStatement2 != null) {
                            }
                            sQLiteDatabase = urVar2.b;
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLitePreparedStatement2 = executeFast2;
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            SQLiteDatabase sQLiteDatabase5 = urVar2.b;
                            if (sQLiteDatabase5 != null) {
                                sQLiteDatabase5.commitTransaction();
                            }
                            throw th;
                        }
                    }
                    executeFast2.dispose();
                    urVar2.b.commitTransaction();
                    sQLiteDatabase = urVar2.b;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLiteDatabase.commitTransaction();
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
        }
    }

    public /* synthetic */ zp(ur urVar, boolean z10, ArrayList arrayList) {
        this.a = 2;
        this.b = urVar;
        this.d = z10;
        this.c = arrayList;
    }
}
