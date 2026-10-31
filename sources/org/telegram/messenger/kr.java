package org.telegram.messenger;

import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kr(hs hsVar, boolean z10, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0176, code lost:
    
        if (r15 != null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a1 A[Catch: all -> 0x019b, Exception -> 0x019e, TryCatch #1 {Exception -> 0x019e, blocks: (B:86:0x0180, B:88:0x01ac, B:90:0x01b2, B:92:0x01be, B:94:0x01e0, B:95:0x01e2, B:97:0x01e6, B:98:0x01e8, B:99:0x01eb, B:104:0x01f6, B:108:0x0206, B:110:0x020c, B:112:0x0212, B:113:0x0216, B:117:0x023a, B:123:0x01a1), top: B:84:0x017e, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #6 {all -> 0x0167, blocks: (B:69:0x0121, B:71:0x0131), top: B:68:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180 A[Catch: all -> 0x019b, Exception -> 0x019e, TRY_ENTER, TryCatch #1 {Exception -> 0x019e, blocks: (B:86:0x0180, B:88:0x01ac, B:90:0x01b2, B:92:0x01be, B:94:0x01e0, B:95:0x01e2, B:97:0x01e6, B:98:0x01e8, B:99:0x01eb, B:104:0x01f6, B:108:0x0206, B:110:0x020c, B:112:0x0212, B:113:0x0216, B:117:0x023a, B:123:0x01a1), top: B:84:0x017e, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2 A[Catch: all -> 0x019b, Exception -> 0x019e, TryCatch #1 {Exception -> 0x019e, blocks: (B:86:0x0180, B:88:0x01ac, B:90:0x01b2, B:92:0x01be, B:94:0x01e0, B:95:0x01e2, B:97:0x01e6, B:98:0x01e8, B:99:0x01eb, B:104:0x01f6, B:108:0x0206, B:110:0x020c, B:112:0x0212, B:113:0x0216, B:117:0x023a, B:123:0x01a1), top: B:84:0x017e, outer: #7 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        int i10;
        int i11;
        int i12;
        HashMap hashMap;
        SQLiteCursor queryFinalized;
        SQLiteCursor queryFinalized2;
        boolean next;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                boolean z10 = this.c;
                int i13 = 4;
                int i14 = 6;
                try {
                    queryFinalized2 = hsVar.b.queryFinalized("SELECT name FROM sqlite_master WHERE type='table' AND name='user_contacts_v6'", new Object[0]);
                    try {
                        next = queryFinalized2.next();
                        queryFinalized2.dispose();
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = queryFinalized2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                if (!next) {
                    sQLiteCursor = null;
                    sQLiteCursor = hsVar.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                    if (sQLiteCursor.next()) {
                        i10 = 0;
                        i11 = 0;
                        i12 = 16;
                    } else {
                        i10 = sQLiteCursor.intValue(0);
                        try {
                            i12 = Math.min(5000, i10);
                            i11 = i10 > 5000 ? i10 - 5000 : 0;
                            try {
                                if (v2.a) {
                                    f8.b(hsVar.currentAccount + " current cached contacts count = " + i10);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    hsVar.o(th, true);
                                    break;
                                } finally {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            i11 = 0;
                            i12 = 16;
                            hsVar.o(th, true);
                        }
                    }
                    sQLiteCursor.dispose();
                    hashMap = new HashMap(i12);
                    if (i11 == 0) {
                        queryFinalized = hsVar.b.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1 LIMIT 0," + i10, new Object[0]);
                    } else {
                        queryFinalized = hsVar.b.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    while (sQLiteCursor.next()) {
                        String stringValue = sQLiteCursor.stringValue(0);
                        f5 f5Var = (f5) hashMap.get(stringValue);
                        if (f5Var == null) {
                            f5Var = new f5();
                            f5Var.a = sQLiteCursor.intValue(1);
                            f5Var.i = sQLiteCursor.stringValue(2);
                            f5Var.j = sQLiteCursor.stringValue(3);
                            f5Var.l = sQLiteCursor.intValue(7);
                            if (f5Var.i == null) {
                                f5Var.i = "";
                            }
                            if (f5Var.j == null) {
                                f5Var.j = "";
                            }
                            hashMap.put(stringValue, f5Var);
                        }
                        String stringValue2 = sQLiteCursor.stringValue(i13);
                        if (stringValue2 != null) {
                            f5Var.e.add(stringValue2);
                            String stringValue3 = sQLiteCursor.stringValue(5);
                            if (stringValue3 != null) {
                                if (stringValue3.length() == 8 && stringValue2.length() != 8) {
                                    stringValue3 = af.b.d(stringValue2, false);
                                }
                                f5Var.g.add(stringValue3);
                                f5Var.h.add(Integer.valueOf(sQLiteCursor.intValue(6)));
                                f5Var.f.add("");
                                if (hashMap.size() == 5000) {
                                    sQLiteCursor.dispose();
                                    hsVar.getContactsController().F(hashMap, true, true, false, false, !z10, false);
                                    return;
                                }
                            }
                        }
                        i13 = 4;
                    }
                    sQLiteCursor.dispose();
                    hsVar.getContactsController().F(hashMap, true, true, false, false, !z10, false);
                    return;
                }
                queryFinalized2 = hsVar.b.queryFinalized("SELECT COUNT(uid) FROM user_contacts_v6 WHERE 1", new Object[0]);
                int min = queryFinalized2.next() ? Math.min(5000, queryFinalized2.intValue(0)) : 16;
                queryFinalized2.dispose();
                SparseArray sparseArray = new SparseArray(min);
                SQLiteCursor queryFinalized3 = hsVar.b.queryFinalized("SELECT us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v6 as us LEFT JOIN user_phones_v6 as up ON us.uid = up.uid WHERE 1", new Object[0]);
                while (queryFinalized3.next()) {
                    try {
                        int intValue = queryFinalized3.intValue(0);
                        f5 f5Var2 = (f5) sparseArray.get(intValue);
                        if (f5Var2 == null) {
                            f5Var2 = new f5();
                            f5Var2.i = queryFinalized3.stringValue(1);
                            f5Var2.j = queryFinalized3.stringValue(2);
                            f5Var2.l = queryFinalized3.intValue(i14);
                            if (f5Var2.i == null) {
                                f5Var2.i = "";
                            }
                            if (f5Var2.j == null) {
                                f5Var2.j = "";
                            }
                            f5Var2.a = intValue;
                            sparseArray.put(intValue, f5Var2);
                        }
                        String stringValue4 = queryFinalized3.stringValue(3);
                        if (stringValue4 != null) {
                            f5Var2.e.add(stringValue4);
                            String stringValue5 = queryFinalized3.stringValue(4);
                            if (stringValue5 != null) {
                                if (stringValue5.length() == 8 && stringValue4.length() != 8) {
                                    stringValue5 = af.b.d(stringValue4, false);
                                }
                                f5Var2.g.add(stringValue5);
                                f5Var2.h.add(Integer.valueOf(queryFinalized3.intValue(5)));
                                f5Var2.f.add("");
                                if (sparseArray.size() == 5000) {
                                    queryFinalized3.dispose();
                                    i5 contactsController = hsVar.getContactsController();
                                    contactsController.getClass();
                                    Utilities.e.c(new e4(28, contactsController, sparseArray));
                                    return;
                                }
                                i14 = 6;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = queryFinalized3;
                        try {
                            hsVar.o(th, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            try {
                                sQLiteCursor = hsVar.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                                if (sQLiteCursor.next()) {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                i10 = 0;
                                i11 = 0;
                            }
                            sQLiteCursor.dispose();
                            hashMap = new HashMap(i12);
                            try {
                                try {
                                    if (i11 == 0) {
                                    }
                                    sQLiteCursor = queryFinalized;
                                    while (sQLiteCursor.next()) {
                                    }
                                    sQLiteCursor.dispose();
                                } catch (Exception e) {
                                    hashMap.clear();
                                    hsVar.o(e, true);
                                }
                                hsVar.getContactsController().F(hashMap, true, true, false, false, !z10, false);
                                return;
                            } catch (Throwable th8) {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th8;
                            }
                        } finally {
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        }
                    }
                }
                queryFinalized3.dispose();
                i5 contactsController2 = hsVar.getContactsController();
                contactsController2.getClass();
                Utilities.e.c(new e4(28, contactsController2, sparseArray));
                return;
            default:
                hs hsVar2 = this.b;
                boolean z11 = this.c;
                hsVar2.p(true);
                hsVar2.V0(1);
                if (z11) {
                    Utilities.d.c(new br(hsVar2, 28));
                    return;
                }
                return;
        }
    }
}
