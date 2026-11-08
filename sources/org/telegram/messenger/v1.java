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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class v1 {
    public static volatile v1[] f = new v1[4];
    public static final Object[] g = new Object[4];
    public final int a;
    public long b;
    public t1 c;
    public final Set d;
    public boolean e;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            g[i7] = new Object();
        }
    }

    public v1(int i7) {
        v1 v1Var;
        Exception exc;
        u1 u1Var;
        this.a = i7;
        SharedPreferences sharedPreferences = qp.s1(i7).e7;
        this.b = sharedPreferences.getLong("bday_check", 0L);
        u1 u1Var2 = null;
        String string = sharedPreferences.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                int readInt32 = serializedData.readInt32(true);
                if (readInt32 != 290452237) {
                    try {
                        int i10 = u1.b;
                    } catch (Exception e10) {
                        exc = e10;
                        v1Var = this;
                        a8.g(exc, true);
                        v1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                } else {
                    u1Var2 = new u1();
                }
                u1Var = (u1) TLObject.TLdeserialize(u1.class, u1Var2, serializedData, readInt32, true);
            } catch (Exception e11) {
                e = e11;
                v1Var = this;
            }
            if (u1Var != null && !u1Var.a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < u1Var.a.size(); i11++) {
                    arrayList.add(Long.valueOf(((TL_account.TL_contactBirthday) u1Var.a.get(i11)).contact_id));
                }
                v1Var = this;
                try {
                    yr.a0(i7).a.c(new dg(v1Var, i7, arrayList, u1Var, 2));
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    a8.g(exc, true);
                    v1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                }
                v1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
            }
        }
        v1Var = this;
        v1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
    }

    public static v1 a(int i7) {
        v1 v1Var;
        v1 v1Var2 = f[i7];
        if (v1Var2 != null) {
            return v1Var2;
        }
        synchronized (g[i7]) {
            try {
                v1Var = f[i7];
                if (v1Var == null) {
                    v1[] v1VarArr = f;
                    v1 v1Var3 = new v1(i7);
                    v1VarArr[i7] = v1Var3;
                    v1Var = v1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v1Var;
    }

    public static boolean d(TLRPC.UserFull userFull) {
        return (userFull == null || !e(userFull.birthday) || t10.b(userFull)) ? false : true;
    }

    public static boolean e(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        return tL_birthday.day == calendar.get(5) && tL_birthday.month == calendar.get(2) + 1;
    }

    public final t1 b() {
        t1 t1Var = this.c;
        if (t1Var == null || this.d.contains(t1Var.a)) {
            return null;
        }
        return this.c;
    }

    public final boolean c(long j3) {
        t1 t1Var = this.c;
        if (t1Var != null && t1Var.a(j3)) {
            return true;
        }
        TLRPC.UserFull b22 = qp.s1(this.a).b2(j3);
        return (b22 == null || !e(b22.birthday) || t10.b(b22)) ? false : true;
    }
}
