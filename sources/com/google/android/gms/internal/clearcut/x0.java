package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class x0 {
    public Object A;
    public final y0 a;
    public final Object[] b;
    public final Class c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int[] m;
    public int n;
    public int o;
    public int p = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int q = TLObject.FLAG_31;
    public int r = 0;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Field x;
    public Object y;
    public Object z;

    public x0(Class cls, String str, Object[] objArr) {
        this.c = cls;
        y0 y0Var = new y0(str, 0);
        this.a = y0Var;
        this.b = objArr;
        this.d = y0Var.a();
        int a10 = y0Var.a();
        this.e = a10;
        if (a10 == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            this.l = 0;
            this.m = null;
            return;
        }
        int a11 = y0Var.a();
        this.f = a11;
        int a12 = y0Var.a();
        this.g = y0Var.a();
        this.h = y0Var.a();
        this.k = y0Var.a();
        this.j = y0Var.a();
        this.i = y0Var.a();
        this.l = y0Var.a();
        int a13 = y0Var.a();
        this.m = a13 != 0 ? new int[a13] : null;
        this.n = (a11 << 1) + a12;
    }

    public static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            throw new RuntimeException(a8.p0.s(sb2, " not found. Known fields are ", arrays));
        }
    }

    public final boolean a() {
        y0 y0Var = this.a;
        if (y0Var.b >= y0Var.c.length()) {
            return false;
        }
        this.s = y0Var.a();
        int a10 = y0Var.a();
        this.t = a10;
        int i7 = a10 & ks.e4;
        this.u = i7;
        int i10 = this.s;
        if (i10 < this.p) {
            this.p = i10;
        }
        if (i10 > this.q) {
            this.q = i10;
        }
        t tVar = t.s;
        int i11 = tVar.a;
        if (i7 != i11 && i7 >= t.e.a) {
            int i12 = t.r.a;
        }
        int i13 = this.r + 1;
        this.r = i13;
        int i14 = this.p;
        Class cls = a1.a;
        if (i10 >= 40) {
            long j3 = i13;
            int i15 = (((i10 - i14) + 10) > (((j3 + 3) * 3) + (2 * j3) + 3) ? 1 : (((i10 - i14) + 10) == (((j3 + 3) * 3) + (2 * j3) + 3) ? 0 : -1));
        }
        if ((a10 & 1024) != 0) {
            int i16 = this.o;
            this.o = i16 + 1;
            this.m[i16] = i10;
        }
        this.y = null;
        this.z = null;
        this.A = null;
        int i17 = this.d;
        if (i7 > i11) {
            this.v = y0Var.a();
            int i18 = this.u;
            if (i18 == t.b.a + 51 || i18 == t.d.a + 51) {
                this.y = c();
                return true;
            }
            if (i18 == t.c.a + 51 && (i17 & 1) == 1) {
                this.z = c();
            }
            return true;
        }
        this.x = b(this.c, (String) c());
        if ((i17 & 1) == 1 && this.u <= t.d.a) {
            this.w = y0Var.a();
        }
        int i19 = this.u;
        if (i19 == t.b.a || i19 == t.d.a) {
            this.y = this.x.getType();
            return true;
        }
        if (i19 == t.f.a || i19 == t.r.a) {
            this.y = c();
            return true;
        }
        if (i19 == t.c.a || i19 == t.h.a || i19 == t.n.a) {
            if ((i17 & 1) == 1) {
                this.z = c();
            }
            return true;
        }
        if (i19 == tVar.a) {
            this.A = c();
            if ((this.t & 2048) != 0) {
                this.z = c();
            }
        }
        return true;
    }

    public final Object c() {
        int i7 = this.n;
        this.n = i7 + 1;
        return this.b[i7];
    }
}
