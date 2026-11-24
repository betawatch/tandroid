// default package

import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ee7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ee7(cf7 cf7Var, boolean z, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0197 A[Catch: Exception -> 0x0224, all -> 0x0246, TryCatch #6 {Exception -> 0x0224, blocks: (B:76:0x017b, B:78:0x017f, B:80:0x01a0, B:82:0x01a6, B:84:0x01b2, B:86:0x01d4, B:87:0x01d6, B:89:0x01da, B:90:0x01dc, B:91:0x01df, B:94:0x01e5, B:97:0x01f0, B:99:0x01f6, B:101:0x01fc, B:102:0x0200, B:105:0x0220, B:114:0x0197), top: B:75:0x017b, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #4 {all -> 0x0169, blocks: (B:59:0x0114, B:61:0x0124), top: B:58:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f A[Catch: Exception -> 0x0224, all -> 0x0246, TryCatch #6 {Exception -> 0x0224, blocks: (B:76:0x017b, B:78:0x017f, B:80:0x01a0, B:82:0x01a6, B:84:0x01b2, B:86:0x01d4, B:87:0x01d6, B:89:0x01da, B:90:0x01dc, B:91:0x01df, B:94:0x01e5, B:97:0x01f0, B:99:0x01f6, B:101:0x01fc, B:102:0x0200, B:105:0x0220, B:114:0x0197), top: B:75:0x017b, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6 A[Catch: Exception -> 0x0224, all -> 0x0246, TryCatch #6 {Exception -> 0x0224, blocks: (B:76:0x017b, B:78:0x017f, B:80:0x01a0, B:82:0x01a6, B:84:0x01b2, B:86:0x01d4, B:87:0x01d6, B:89:0x01da, B:90:0x01dc, B:91:0x01df, B:94:0x01e5, B:97:0x01f0, B:99:0x01f6, B:101:0x01fc, B:102:0x0200, B:105:0x0220, B:114:0x0197), top: B:75:0x017b, outer: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        int i;
        int i2;
        int i3;
        int i4;
        HashMap hashMap;
        SQLiteCursor queryFinalized;
        SQLiteCursor queryFinalized2;
        boolean next;
        switch (this.a) {
            case 0:
                cf7 cf7Var = this.b;
                boolean z = this.c;
                int i5 = 6;
                try {
                    queryFinalized2 = cf7Var.b.queryFinalized("SELECT name FROM sqlite_master WHERE type='table' AND name='user_contacts_v6'", new Object[0]);
                    try {
                        next = queryFinalized2.next();
                        queryFinalized2.dispose();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized2;
                        try {
                            cf7Var.n(th, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            try {
                                sQLiteCursor = cf7Var.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                                if (sQLiteCursor.next()) {
                                }
                                sQLiteCursor.dispose();
                            } catch (Throwable th2) {
                                th = th2;
                                i = 0;
                                i2 = 0;
                            }
                            hashMap = new HashMap(i3);
                            try {
                                try {
                                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                                    if (i4 == 0) {
                                    }
                                    sQLiteCursor = queryFinalized;
                                    while (sQLiteCursor.next()) {
                                    }
                                    sQLiteCursor.dispose();
                                } catch (Throwable th3) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th3;
                                }
                            } catch (Exception e) {
                                hashMap.clear();
                                cf7Var.n(e, true);
                            }
                            cf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                            return;
                        } finally {
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                if (next) {
                    SQLiteCursor queryFinalized3 = cf7Var.b.queryFinalized("SELECT COUNT(uid) FROM user_contacts_v6 WHERE 1", new Object[0]);
                    int min = queryFinalized3.next() ? Math.min(5000, queryFinalized3.intValue(0)) : 16;
                    queryFinalized3.dispose();
                    SparseArray sparseArray = new SparseArray(min);
                    queryFinalized2 = cf7Var.b.queryFinalized("SELECT us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v6 as us LEFT JOIN user_phones_v6 as up ON us.uid = up.uid WHERE 1", new Object[0]);
                    while (queryFinalized2.next()) {
                        int intValue = queryFinalized2.intValue(0);
                        yv2 yv2Var = (yv2) sparseArray.get(intValue);
                        if (yv2Var == null) {
                            yv2Var = new yv2();
                            yv2Var.i = queryFinalized2.stringValue(1);
                            yv2Var.j = queryFinalized2.stringValue(2);
                            yv2Var.l = queryFinalized2.intValue(i5);
                            if (yv2Var.i == null) {
                                yv2Var.i = "";
                            }
                            if (yv2Var.j == null) {
                                yv2Var.j = "";
                            }
                            yv2Var.a = intValue;
                            sparseArray.put(intValue, yv2Var);
                        }
                        String stringValue = queryFinalized2.stringValue(3);
                        if (stringValue != null) {
                            yv2Var.e.add(stringValue);
                            String stringValue2 = queryFinalized2.stringValue(4);
                            if (stringValue2 == null) {
                                continue;
                            } else {
                                if (stringValue2.length() == 8 && stringValue.length() != 8) {
                                    stringValue2 = r58.h(stringValue, false);
                                }
                                yv2Var.g.add(stringValue2);
                                yv2Var.h.add(Integer.valueOf(queryFinalized2.intValue(5)));
                                yv2Var.f.add("");
                                if (sparseArray.size() == 5000) {
                                    queryFinalized2.dispose();
                                    bw2 contactsController = cf7Var.getContactsController();
                                    contactsController.getClass();
                                    Utilities.e.c(new mv2(contactsController, sparseArray, (byte) 3));
                                    return;
                                }
                                i5 = 6;
                            }
                        }
                    }
                    queryFinalized2.dispose();
                    bw2 contactsController2 = cf7Var.getContactsController();
                    contactsController2.getClass();
                    Utilities.e.c(new mv2(contactsController2, sparseArray, (byte) 3));
                    return;
                }
                sQLiteCursor = null;
                sQLiteCursor = cf7Var.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                if (sQLiteCursor.next()) {
                    i4 = 0;
                    i = 0;
                    i3 = 16;
                } else {
                    i = sQLiteCursor.intValue(0);
                    try {
                        int min2 = Math.min(5000, i);
                        int i6 = i > 5000 ? i - 5000 : 0;
                        try {
                            if (e21.a) {
                                fc4.b(cf7Var.currentAccount + " current cached contacts count = " + i);
                            }
                            i4 = i6;
                            i3 = min2;
                        } catch (Throwable th5) {
                            th = th5;
                            i2 = i6;
                            i3 = min2;
                            try {
                                cf7Var.n(th, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i4 = i2;
                                hashMap = new HashMap(i3);
                                SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
                                if (i4 == 0) {
                                }
                                sQLiteCursor = queryFinalized;
                                while (sQLiteCursor.next()) {
                                }
                                sQLiteCursor.dispose();
                                cf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                                return;
                            } finally {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i2 = 0;
                        i3 = 16;
                        cf7Var.n(th, true);
                        if (sQLiteCursor != null) {
                        }
                        i4 = i2;
                        hashMap = new HashMap(i3);
                        SQLiteDatabase sQLiteDatabase22 = cf7Var.b;
                        if (i4 == 0) {
                        }
                        sQLiteCursor = queryFinalized;
                        while (sQLiteCursor.next()) {
                        }
                        sQLiteCursor.dispose();
                        cf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                        return;
                    }
                }
                sQLiteCursor.dispose();
                hashMap = new HashMap(i3);
                SQLiteDatabase sQLiteDatabase222 = cf7Var.b;
                if (i4 == 0) {
                    queryFinalized = sQLiteDatabase222.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1 LIMIT 0," + i, new Object[0]);
                } else {
                    queryFinalized = sQLiteDatabase222.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1", new Object[0]);
                }
                sQLiteCursor = queryFinalized;
                while (sQLiteCursor.next()) {
                    String stringValue3 = sQLiteCursor.stringValue(0);
                    yv2 yv2Var2 = (yv2) hashMap.get(stringValue3);
                    if (yv2Var2 == null) {
                        yv2Var2 = new yv2();
                        yv2Var2.a = sQLiteCursor.intValue(1);
                        yv2Var2.i = sQLiteCursor.stringValue(2);
                        yv2Var2.j = sQLiteCursor.stringValue(3);
                        yv2Var2.l = sQLiteCursor.intValue(7);
                        if (yv2Var2.i == null) {
                            yv2Var2.i = "";
                        }
                        if (yv2Var2.j == null) {
                            yv2Var2.j = "";
                        }
                        hashMap.put(stringValue3, yv2Var2);
                    }
                    String stringValue4 = sQLiteCursor.stringValue(4);
                    if (stringValue4 != null) {
                        yv2Var2.e.add(stringValue4);
                        String stringValue5 = sQLiteCursor.stringValue(5);
                        if (stringValue5 == null) {
                            continue;
                        } else {
                            if (stringValue5.length() == 8 && stringValue4.length() != 8) {
                                stringValue5 = r58.h(stringValue4, false);
                            }
                            yv2Var2.g.add(stringValue5);
                            yv2Var2.h.add(Integer.valueOf(sQLiteCursor.intValue(6)));
                            yv2Var2.f.add("");
                            if (hashMap.size() == 5000) {
                                sQLiteCursor.dispose();
                                cf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                                return;
                            }
                        }
                    }
                }
                sQLiteCursor.dispose();
                cf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                return;
            default:
                cf7 cf7Var2 = this.b;
                boolean z2 = this.c;
                cf7Var2.o(true);
                cf7Var2.S0(1);
                if (z2) {
                    Utilities.d.c(new xd7(cf7Var2, (byte) 29));
                    return;
                }
                return;
        }
    }
}
