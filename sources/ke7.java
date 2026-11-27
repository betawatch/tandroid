// default package

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ke7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ke7(kf7 kf7Var, boolean z, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b0 A[Catch: Exception -> 0x023d, all -> 0x025f, TryCatch #2 {Exception -> 0x023d, blocks: (B:82:0x0194, B:84:0x0198, B:86:0x01b9, B:88:0x01bf, B:90:0x01cb, B:92:0x01ed, B:93:0x01ef, B:95:0x01f3, B:96:0x01f5, B:97:0x01f8, B:100:0x01fe, B:103:0x0209, B:105:0x020f, B:107:0x0215, B:108:0x0219, B:111:0x0239, B:120:0x01b0), top: B:81:0x0194, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #1 {all -> 0x0182, blocks: (B:65:0x012d, B:67:0x013d), top: B:64:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198 A[Catch: Exception -> 0x023d, all -> 0x025f, TryCatch #2 {Exception -> 0x023d, blocks: (B:82:0x0194, B:84:0x0198, B:86:0x01b9, B:88:0x01bf, B:90:0x01cb, B:92:0x01ed, B:93:0x01ef, B:95:0x01f3, B:96:0x01f5, B:97:0x01f8, B:100:0x01fe, B:103:0x0209, B:105:0x020f, B:107:0x0215, B:108:0x0219, B:111:0x0239, B:120:0x01b0), top: B:81:0x0194, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bf A[Catch: Exception -> 0x023d, all -> 0x025f, TryCatch #2 {Exception -> 0x023d, blocks: (B:82:0x0194, B:84:0x0198, B:86:0x01b9, B:88:0x01bf, B:90:0x01cb, B:92:0x01ed, B:93:0x01ef, B:95:0x01f3, B:96:0x01f5, B:97:0x01f8, B:100:0x01fe, B:103:0x0209, B:105:0x020f, B:107:0x0215, B:108:0x0219, B:111:0x0239, B:120:0x01b0), top: B:81:0x0194, outer: #8 }] */
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
        int min;
        int i5;
        SQLiteCursor queryFinalized2;
        boolean next;
        byte b = 2;
        switch (this.a) {
            case 0:
                kf7 kf7Var = this.b;
                boolean z = this.c;
                int i6 = 6;
                try {
                    queryFinalized2 = kf7Var.b.queryFinalized("SELECT name FROM sqlite_master WHERE type='table' AND name='user_contacts_v6'", new Object[0]);
                    try {
                        next = queryFinalized2.next();
                        queryFinalized2.dispose();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized2;
                        try {
                            kf7Var.p(th, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            try {
                                sQLiteCursor = kf7Var.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
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
                                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                                    if (i4 == 0) {
                                    }
                                    sQLiteCursor = queryFinalized;
                                    while (sQLiteCursor.next()) {
                                    }
                                    sQLiteCursor.dispose();
                                } catch (Exception e) {
                                    hashMap.clear();
                                    kf7Var.p(e, true);
                                }
                                kf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                                return;
                            } catch (Throwable th3) {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th3;
                            }
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
                    SQLiteCursor queryFinalized3 = kf7Var.b.queryFinalized("SELECT COUNT(uid) FROM user_contacts_v6 WHERE 1", new Object[0]);
                    int min2 = queryFinalized3.next() ? Math.min(5000, queryFinalized3.intValue(0)) : 16;
                    queryFinalized3.dispose();
                    SparseArray sparseArray = new SparseArray(min2);
                    queryFinalized2 = kf7Var.b.queryFinalized("SELECT us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v6 as us LEFT JOIN user_phones_v6 as up ON us.uid = up.uid WHERE 1", new Object[0]);
                    while (queryFinalized2.next()) {
                        int intValue = queryFinalized2.intValue(0);
                        iv2 iv2Var = (iv2) sparseArray.get(intValue);
                        if (iv2Var == null) {
                            iv2Var = new iv2();
                            iv2Var.i = queryFinalized2.stringValue(1);
                            iv2Var.j = queryFinalized2.stringValue(2);
                            iv2Var.l = queryFinalized2.intValue(i6);
                            if (iv2Var.i == null) {
                                iv2Var.i = "";
                            }
                            if (iv2Var.j == null) {
                                iv2Var.j = "";
                            }
                            iv2Var.a = intValue;
                            sparseArray.put(intValue, iv2Var);
                        }
                        String stringValue = queryFinalized2.stringValue(3);
                        if (stringValue != null) {
                            iv2Var.e.add(stringValue);
                            String stringValue2 = queryFinalized2.stringValue(4);
                            if (stringValue2 == null) {
                                continue;
                            } else {
                                if (stringValue2.length() == 8 && stringValue.length() != 8) {
                                    stringValue2 = f78.h(stringValue, false);
                                }
                                iv2Var.g.add(stringValue2);
                                iv2Var.h.add(Integer.valueOf(queryFinalized2.intValue(5)));
                                iv2Var.f.add("");
                                if (sparseArray.size() == 5000) {
                                    queryFinalized2.dispose();
                                    lv2 contactsController = kf7Var.getContactsController();
                                    contactsController.getClass();
                                    Utilities.e.c(new bv2(contactsController, sparseArray, (byte) 1));
                                    return;
                                }
                                i6 = 6;
                            }
                        }
                    }
                    queryFinalized2.dispose();
                    lv2 contactsController2 = kf7Var.getContactsController();
                    contactsController2.getClass();
                    Utilities.e.c(new bv2(contactsController2, sparseArray, (byte) 1));
                    return;
                }
                sQLiteCursor = null;
                sQLiteCursor = kf7Var.b.queryFinalized("SELECT COUNT(key) FROM user_contacts_v7 WHERE 1", new Object[0]);
                if (sQLiteCursor.next()) {
                    i4 = 0;
                    i = 0;
                    i3 = 16;
                } else {
                    i = sQLiteCursor.intValue(0);
                    try {
                        min = Math.min(5000, i);
                        i5 = i > 5000 ? i - 5000 : 0;
                    } catch (Throwable th5) {
                        th = th5;
                        i2 = 0;
                        i3 = 16;
                        try {
                            kf7Var.p(th, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            i4 = i2;
                            hashMap = new HashMap(i3);
                            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                            if (i4 == 0) {
                            }
                            sQLiteCursor = queryFinalized;
                            while (sQLiteCursor.next()) {
                            }
                            sQLiteCursor.dispose();
                            kf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                            return;
                        } finally {
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        }
                    }
                    try {
                        if (f11.a) {
                            cc4.b(kf7Var.currentAccount + " current cached contacts count = " + i);
                        }
                        i4 = i5;
                        i3 = min;
                    } catch (Throwable th6) {
                        th = th6;
                        i2 = i5;
                        i3 = min;
                        kf7Var.p(th, true);
                        if (sQLiteCursor != null) {
                        }
                        i4 = i2;
                        hashMap = new HashMap(i3);
                        SQLiteDatabase sQLiteDatabase22 = kf7Var.b;
                        if (i4 == 0) {
                        }
                        sQLiteCursor = queryFinalized;
                        while (sQLiteCursor.next()) {
                        }
                        sQLiteCursor.dispose();
                        kf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                        return;
                    }
                }
                sQLiteCursor.dispose();
                hashMap = new HashMap(i3);
                SQLiteDatabase sQLiteDatabase222 = kf7Var.b;
                if (i4 == 0) {
                    queryFinalized = sQLiteDatabase222.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1 LIMIT 0," + i, new Object[0]);
                } else {
                    queryFinalized = sQLiteDatabase222.queryFinalized("SELECT us.key, us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted, us.imported FROM user_contacts_v7 as us LEFT JOIN user_phones_v7 as up ON us.key = up.key WHERE 1", new Object[0]);
                }
                sQLiteCursor = queryFinalized;
                while (sQLiteCursor.next()) {
                    String stringValue3 = sQLiteCursor.stringValue(0);
                    iv2 iv2Var2 = (iv2) hashMap.get(stringValue3);
                    if (iv2Var2 == null) {
                        iv2Var2 = new iv2();
                        iv2Var2.a = sQLiteCursor.intValue(1);
                        iv2Var2.i = sQLiteCursor.stringValue(2);
                        iv2Var2.j = sQLiteCursor.stringValue(3);
                        iv2Var2.l = sQLiteCursor.intValue(7);
                        if (iv2Var2.i == null) {
                            iv2Var2.i = "";
                        }
                        if (iv2Var2.j == null) {
                            iv2Var2.j = "";
                        }
                        hashMap.put(stringValue3, iv2Var2);
                    }
                    String stringValue4 = sQLiteCursor.stringValue(4);
                    if (stringValue4 != null) {
                        iv2Var2.e.add(stringValue4);
                        String stringValue5 = sQLiteCursor.stringValue(5);
                        if (stringValue5 == null) {
                            continue;
                        } else {
                            if (stringValue5.length() == 8 && stringValue4.length() != 8) {
                                stringValue5 = f78.h(stringValue4, false);
                            }
                            iv2Var2.g.add(stringValue5);
                            iv2Var2.h.add(Integer.valueOf(sQLiteCursor.intValue(6)));
                            iv2Var2.f.add("");
                            if (hashMap.size() == 5000) {
                                sQLiteCursor.dispose();
                                kf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                                return;
                            }
                        }
                    }
                }
                sQLiteCursor.dispose();
                kf7Var.getContactsController().F(hashMap, true, true, false, false, !z, false);
                return;
            case 1:
                kf7 kf7Var2 = this.b;
                boolean z2 = this.c;
                kf7Var2.q(true);
                kf7Var2.W0(1);
                if (z2) {
                    Utilities.d.c(new we7(kf7Var2, b));
                    return;
                }
                return;
            default:
                kf7 kf7Var3 = this.b;
                boolean z3 = this.c;
                kf7Var3.a0 = false;
                if (!z3) {
                    kf7Var3.F1(60000L);
                    return;
                } else {
                    kf7Var3.b0 = SystemClock.elapsedRealtime();
                    kf7Var3.F1(0L);
                    return;
                }
        }
    }
}
