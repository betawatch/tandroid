package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jq(hs hsVar, ArrayList arrayList, boolean z10, int i10) {
        this.a = i10;
        this.b = hsVar;
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
        Exception e;
        SQLiteDatabase sQLiteDatabase;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                hsVar.getClass();
                ArrayList arrayList = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        if (this.d) {
                            hsVar.b.beginTransaction();
                            SQLitePreparedStatement executeFast = hsVar.b.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                            try {
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    TLRPC.User user = (TLRPC.User) arrayList.get(i10);
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
                                hsVar.b.commitTransaction();
                            } catch (Exception e7) {
                                e = e7;
                                sQLitePreparedStatement = executeFast;
                                hsVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase2 = hsVar.b;
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
                                SQLiteDatabase sQLiteDatabase3 = hsVar.b;
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
                            for (int i11 = 0; i11 < size2; i11++) {
                                TLRPC.User user2 = (TLRPC.User) arrayList.get(i11);
                                arrayList2.add(Long.valueOf(user2.id));
                                hVar.k(user2, user2.id);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            hsVar.n0(arrayList2, arrayList3, false);
                            int size3 = arrayList3.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                TLRPC.User user3 = (TLRPC.User) arrayList3.get(i12);
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
                                        if (!h20.w(user3)) {
                                            user3.first_name = user4.first_name;
                                            user3.last_name = user4.last_name;
                                        }
                                        user3.username = user4.username;
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                hsVar.b.beginTransaction();
                                hsVar.o1(arrayList3);
                                hsVar.b.commitTransaction();
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = hsVar.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                break;
            case 1:
                this.b.g1(this.c, this.d);
                return;
            default:
                ArrayList arrayList4 = this.c;
                hs hsVar2 = this.b;
                hsVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    if (this.d) {
                        try {
                            hsVar2.b.executeFast("DELETE FROM contacts WHERE 1").stepThis().dispose();
                        } catch (Exception e11) {
                            e = e11;
                            hsVar2.o(e, true);
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            sQLiteDatabase = hsVar2.b;
                            if (sQLiteDatabase == null) {
                                return;
                            }
                            sQLiteDatabase.commitTransaction();
                            return;
                        }
                    }
                    hsVar2.b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = hsVar2.b.executeFast("REPLACE INTO contacts VALUES(?, ?)");
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        try {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i13);
                            executeFast2.requery();
                            executeFast2.bindLong(1, tL_contact.user_id);
                            executeFast2.bindInteger(2, tL_contact.mutual ? 1 : 0);
                            executeFast2.step();
                        } catch (Exception e12) {
                            e = e12;
                            sQLitePreparedStatement2 = executeFast2;
                            hsVar2.o(e, true);
                            if (sQLitePreparedStatement2 != null) {
                            }
                            sQLiteDatabase = hsVar2.b;
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
                            SQLiteDatabase sQLiteDatabase5 = hsVar2.b;
                            if (sQLiteDatabase5 != null) {
                                sQLiteDatabase5.commitTransaction();
                            }
                            throw th;
                        }
                    }
                    executeFast2.dispose();
                    hsVar2.b.commitTransaction();
                    sQLiteDatabase = hsVar2.b;
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

    public /* synthetic */ jq(hs hsVar, boolean z10, ArrayList arrayList) {
        this.a = 2;
        this.b = hsVar;
        this.d = z10;
        this.c = arrayList;
    }
}
