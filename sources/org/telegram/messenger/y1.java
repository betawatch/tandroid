package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y1 {
    public static volatile y1[] f = new y1[4];
    public static final Object[] g = new Object[4];
    public final int a;
    public long b;
    public w1 c;
    public final Set d;
    public boolean e;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            g[i10] = new Object();
        }
    }

    public y1(int i10) {
        y1 y1Var;
        Exception exc;
        x1 x1Var;
        this.a = i10;
        SharedPreferences sharedPreferences = vp.r1(i10).f7;
        this.b = sharedPreferences.getLong("bday_check", 0L);
        x1 x1Var2 = null;
        String string = sharedPreferences.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                int readInt32 = serializedData.readInt32(true);
                if (readInt32 != 290452237) {
                    try {
                        int i11 = x1.b;
                    } catch (Exception e) {
                        exc = e;
                        y1Var = this;
                        f8.g(exc, true);
                        y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                } else {
                    x1Var2 = new x1();
                }
                x1Var = (x1) TLObject.TLdeserialize(x1.class, x1Var2, serializedData, readInt32, true);
            } catch (Exception e7) {
                e = e7;
                y1Var = this;
            }
            if (x1Var != null && !x1Var.a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < x1Var.a.size(); i12++) {
                    arrayList.add(Long.valueOf(((TL_account.TL_contactBirthday) x1Var.a.get(i12)).contact_id));
                }
                y1Var = this;
                try {
                    hs.a0(i10).a.c(new cg(y1Var, i10, arrayList, x1Var, 2));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    f8.g(exc, true);
                    y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                }
                y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
            }
        }
        y1Var = this;
        y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
    }

    public static y1 a(int i10) {
        y1 y1Var;
        y1 y1Var2 = f[i10];
        if (y1Var2 != null) {
            return y1Var2;
        }
        synchronized (g[i10]) {
            try {
                y1Var = f[i10];
                if (y1Var == null) {
                    y1[] y1VarArr = f;
                    y1 y1Var3 = new y1(i10);
                    y1VarArr[i10] = y1Var3;
                    y1Var = y1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y1Var;
    }

    public static boolean d(TLRPC.UserFull userFull) {
        return (userFull == null || !e(userFull.birthday) || h20.b(userFull)) ? false : true;
    }

    public static boolean e(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        return tL_birthday.day == calendar.get(5) && tL_birthday.month == calendar.get(2) + 1;
    }

    public final w1 b() {
        w1 w1Var = this.c;
        if (w1Var == null || this.d.contains(w1Var.a)) {
            return null;
        }
        return this.c;
    }

    public final boolean c(long j10) {
        w1 w1Var = this.c;
        if (w1Var != null && w1Var.a(j10)) {
            return true;
        }
        TLRPC.UserFull a2 = vp.r1(this.a).a2(j10);
        return (a2 == null || !e(a2.birthday) || h20.b(a2)) ? false : true;
    }
}
