package org.telegram.messenger;

import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dr(yr yrVar, boolean z9, int i7) {
        this.a = i7;
        this.b = yrVar;
        this.c = z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0175, code lost:
    
        if (r15 != null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a0 A[Catch: all -> 0x019a, Exception -> 0x019d, TryCatch #1 {Exception -> 0x019d, blocks: (B:86:0x017f, B:88:0x01ab, B:90:0x01b1, B:92:0x01bd, B:94:0x01df, B:95:0x01e1, B:97:0x01e5, B:98:0x01e7, B:99:0x01ea, B:104:0x01f5, B:108:0x0205, B:110:0x020b, B:112:0x0211, B:113:0x0215, B:117:0x0239, B:123:0x01a0), top: B:84:0x017d, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #5 {all -> 0x0166, blocks: (B:69:0x0120, B:71:0x0130), top: B:68:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f A[Catch: all -> 0x019a, Exception -> 0x019d, TRY_ENTER, TryCatch #1 {Exception -> 0x019d, blocks: (B:86:0x017f, B:88:0x01ab, B:90:0x01b1, B:92:0x01bd, B:94:0x01df, B:95:0x01e1, B:97:0x01e5, B:98:0x01e7, B:99:0x01ea, B:104:0x01f5, B:108:0x0205, B:110:0x020b, B:112:0x0211, B:113:0x0215, B:117:0x0239, B:123:0x01a0), top: B:84:0x017d, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1 A[Catch: all -> 0x019a, Exception -> 0x019d, TryCatch #1 {Exception -> 0x019d, blocks: (B:86:0x017f, B:88:0x01ab, B:90:0x01b1, B:92:0x01bd, B:94:0x01df, B:95:0x01e1, B:97:0x01e5, B:98:0x01e7, B:99:0x01ea, B:104:0x01f5, B:108:0x0205, B:110:0x020b, B:112:0x0211, B:113:0x0215, B:117:0x0239, B:123:0x01a0), top: B:84:0x017d, outer: #6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        int i7;
        int i10;
        int i11;
        HashMap hashMap;
        SQLiteCursor queryFinalized;
        SQLiteCursor queryFinalized2;
        boolean next;
        switch (this.a) {
            case 0:
                yr yrVar = this.b;
                boolean z9 = this.c;
                int i12 = 4;
                int i13 = 6;
                try {
                    queryFinalized2 = yrVar.b.queryFinalized("SELECT name FROM sqlite_master WHERE type='table' AND name='user_contacts_v6'", new Object[0]);
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
                    sQLiteCursor = yrVar.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                    if (sQLiteCursor.next()) {
                        i7 = 0;
                        i10 = 0;
                        i11 = 16;
                    } else {
                        i7 = sQLiteCursor.intValue(0);
                        try {
                            i11 = Math.min(5000, i7);
                            i10 = i7 > 5000 ? i7 - 5000 : 0;
                        } catch (Throwable th4) {
                            th = th4;
                            i10 = 0;
                            i11 = 16;
                            try {
                                yrVar.o(th, true);
                                break;
                            } finally {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                            }
                        }
                        try {
                            if (r2.a) {
                                a8.b(yrVar.currentAccount + " current cached contacts count = " + i7);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            yrVar.o(th, true);
                        }
                    }
                    sQLiteCursor.dispose();
                    hashMap = new HashMap(i11);
                    if (i10 == 0) {
                        queryFinalized = yrVar.b.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1 LIMIT 0," + i7, new Object[0]);
                    } else {
                        queryFinalized = yrVar.b.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    while (sQLiteCursor.next()) {
                        String stringValue = sQLiteCursor.stringValue(0);
                        d5 d5Var = (d5) hashMap.get(stringValue);
                        if (d5Var == null) {
                            d5Var = new d5();
                            d5Var.a = sQLiteCursor.intValue(1);
                            d5Var.i = sQLiteCursor.stringValue(2);
                            d5Var.j = sQLiteCursor.stringValue(3);
                            d5Var.l = sQLiteCursor.intValue(7);
                            if (d5Var.i == null) {
                                d5Var.i = "";
                            }
                            if (d5Var.j == null) {
                                d5Var.j = "";
                            }
                            hashMap.put(stringValue, d5Var);
                        }
                        String stringValue2 = sQLiteCursor.stringValue(i12);
                        if (stringValue2 != null) {
                            d5Var.e.add(stringValue2);
                            String stringValue3 = sQLiteCursor.stringValue(5);
                            if (stringValue3 != null) {
                                if (stringValue3.length() == 8 && stringValue2.length() != 8) {
                                    stringValue3 = pf.b.d(stringValue2, false);
                                }
                                d5Var.g.add(stringValue3);
                                d5Var.h.add(Integer.valueOf(sQLiteCursor.intValue(6)));
                                d5Var.f.add("");
                                if (hashMap.size() == 5000) {
                                    sQLiteCursor.dispose();
                                    yrVar.getContactsController().F(hashMap, true, true, false, false, !z9, false);
                                    return;
                                }
                            }
                        }
                        i12 = 4;
                    }
                    sQLiteCursor.dispose();
                    yrVar.getContactsController().F(hashMap, true, true, false, false, !z9, false);
                    return;
                }
                queryFinalized2 = yrVar.b.queryFinalized("SELECT COUNT(uid) FROM user_contacts_v6 WHERE 1", new Object[0]);
                int min = queryFinalized2.next() ? Math.min(5000, queryFinalized2.intValue(0)) : 16;
                queryFinalized2.dispose();
                SparseArray sparseArray = new SparseArray(min);
                SQLiteCursor queryFinalized3 = yrVar.b.queryFinalized("SELECT us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v6 as us LEFT JOIN user_phones_v6 as up ON us.uid = up.uid WHERE 1", new Object[0]);
                while (queryFinalized3.next()) {
                    try {
                        int intValue = queryFinalized3.intValue(0);
                        d5 d5Var2 = (d5) sparseArray.get(intValue);
                        if (d5Var2 == null) {
                            d5Var2 = new d5();
                            d5Var2.i = queryFinalized3.stringValue(1);
                            d5Var2.j = queryFinalized3.stringValue(2);
                            d5Var2.l = queryFinalized3.intValue(i13);
                            if (d5Var2.i == null) {
                                d5Var2.i = "";
                            }
                            if (d5Var2.j == null) {
                                d5Var2.j = "";
                            }
                            d5Var2.a = intValue;
                            sparseArray.put(intValue, d5Var2);
                        }
                        String stringValue4 = queryFinalized3.stringValue(3);
                        if (stringValue4 != null) {
                            d5Var2.e.add(stringValue4);
                            String stringValue5 = queryFinalized3.stringValue(4);
                            if (stringValue5 != null) {
                                if (stringValue5.length() == 8 && stringValue4.length() != 8) {
                                    stringValue5 = pf.b.d(stringValue4, false);
                                }
                                d5Var2.g.add(stringValue5);
                                d5Var2.h.add(Integer.valueOf(queryFinalized3.intValue(5)));
                                d5Var2.f.add("");
                                if (sparseArray.size() == 5000) {
                                    queryFinalized3.dispose();
                                    g5 contactsController = yrVar.getContactsController();
                                    contactsController.getClass();
                                    Utilities.e.c(new x4(0, contactsController, sparseArray));
                                    return;
                                }
                                i13 = 6;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = queryFinalized3;
                        try {
                            yrVar.o(th, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            try {
                                sQLiteCursor = yrVar.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                                if (sQLiteCursor.next()) {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                i7 = 0;
                                i10 = 0;
                            }
                            sQLiteCursor.dispose();
                            hashMap = new HashMap(i11);
                            try {
                                try {
                                    if (i10 == 0) {
                                    }
                                    sQLiteCursor = queryFinalized;
                                    while (sQLiteCursor.next()) {
                                    }
                                    sQLiteCursor.dispose();
                                } catch (Exception e10) {
                                    hashMap.clear();
                                    yrVar.o(e10, true);
                                }
                                yrVar.getContactsController().F(hashMap, true, true, false, false, !z9, false);
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
                g5 contactsController2 = yrVar.getContactsController();
                contactsController2.getClass();
                Utilities.e.c(new x4(0, contactsController2, sparseArray));
                return;
            default:
                yr yrVar2 = this.b;
                boolean z10 = this.c;
                yrVar2.p(true);
                yrVar2.V0(1);
                if (z10) {
                    Utilities.d.c(new rq(yrVar2, 29));
                    return;
                }
                return;
        }
    }
}
