package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ up(qr qrVar, ArrayList arrayList, boolean z10, int i3) {
        this.a = i3;
        this.b = qrVar;
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
                qr qrVar = this.b;
                qrVar.getClass();
                ArrayList arrayList = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        if (this.d) {
                            qrVar.b.beginTransaction();
                            SQLitePreparedStatement executeFast = qrVar.b.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                            try {
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    TLRPC.User user = (TLRPC.User) arrayList.get(i3);
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
                                qrVar.b.commitTransaction();
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement = executeFast;
                                qrVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase2 = qrVar.b;
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
                                SQLiteDatabase sQLiteDatabase3 = qrVar.b;
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
                            qrVar.n0(arrayList2, arrayList3, false);
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
                                        if (!l10.w(user3)) {
                                            user3.first_name = user4.first_name;
                                            user3.last_name = user4.last_name;
                                        }
                                        user3.username = user4.username;
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                qrVar.b.beginTransaction();
                                qrVar.o1(arrayList3);
                                qrVar.b.commitTransaction();
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = qrVar.b;
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
                qr qrVar2 = this.b;
                qrVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    if (this.d) {
                        try {
                            qrVar2.b.executeFast("DELETE FROM contacts WHERE 1").stepThis().dispose();
                        } catch (Exception e13) {
                            e10 = e13;
                            qrVar2.o(e10, true);
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            sQLiteDatabase = qrVar2.b;
                            if (sQLiteDatabase == null) {
                                return;
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        }
                    }
                    qrVar2.b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = qrVar2.b.executeFast("REPLACE INTO contacts VALUES(?, ?)");
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
                            qrVar2.o(e10, true);
                            if (sQLitePreparedStatement2 != null) {
                            }
                            sQLiteDatabase = qrVar2.b;
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
                            SQLiteDatabase sQLiteDatabase5 = qrVar2.b;
                            if (sQLiteDatabase5 != null) {
                                sQLiteDatabase5.commitTransaction();
                            }
                            throw th;
                        }
                    }
                    executeFast2.dispose();
                    qrVar2.b.commitTransaction();
                    sQLiteDatabase = qrVar2.b;
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

    public /* synthetic */ up(qr qrVar, boolean z10, ArrayList arrayList) {
        this.a = 2;
        this.b = qrVar;
        this.d = z10;
        this.c = arrayList;
    }
}
