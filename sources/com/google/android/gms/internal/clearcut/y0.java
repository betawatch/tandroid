package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class y0 {
    public Object A;
    public final z0 a;
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

    public y0(Class cls, String str, Object[] objArr) {
        this.c = cls;
        z0 z0Var = new z0(str);
        this.a = z0Var;
        this.b = objArr;
        this.d = z0Var.a();
        int a2 = z0Var.a();
        this.e = a2;
        if (a2 == 0) {
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
        int a10 = z0Var.a();
        this.f = a10;
        int a11 = z0Var.a();
        this.g = z0Var.a();
        this.h = z0Var.a();
        this.k = z0Var.a();
        this.j = z0Var.a();
        this.i = z0Var.a();
        this.l = z0Var.a();
        int a12 = z0Var.a();
        this.m = a12 != 0 ? new int[a12] : null;
        this.n = (a10 << 1) + a11;
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
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(android.support.v4.media.a.r(sb, " not found. Known fields are ", arrays));
        }
    }

    public final boolean a() {
        z0 z0Var = this.a;
        if (z0Var.b >= z0Var.c.length()) {
            return false;
        }
        this.s = z0Var.a();
        int a2 = z0Var.a();
        this.t = a2;
        int i10 = a2 & 255;
        this.u = i10;
        int i11 = this.s;
        if (i11 < this.p) {
            this.p = i11;
        }
        if (i11 > this.q) {
            this.q = i11;
        }
        u uVar = u.s;
        int i12 = uVar.a;
        if (i10 != i12 && i10 >= u.e.a) {
            int i13 = u.r.a;
        }
        int i14 = this.r + 1;
        this.r = i14;
        int i15 = this.p;
        Class cls = b1.a;
        if (i11 >= 40) {
            long j10 = i14;
            int i16 = (((i11 - i15) + 10) > (((j10 + 3) * 3) + (2 * j10) + 3) ? 1 : (((i11 - i15) + 10) == (((j10 + 3) * 3) + (2 * j10) + 3) ? 0 : -1));
        }
        if ((a2 & 1024) != 0) {
            int i17 = this.o;
            this.o = i17 + 1;
            this.m[i17] = i11;
        }
        this.y = null;
        this.z = null;
        this.A = null;
        int i18 = this.d;
        if (i10 > i12) {
            this.v = z0Var.a();
            int i19 = this.u;
            if (i19 == u.b.a + 51 || i19 == u.d.a + 51) {
                this.y = c();
                return true;
            }
            if (i19 == u.c.a + 51 && (i18 & 1) == 1) {
                this.z = c();
            }
            return true;
        }
        this.x = b(this.c, (String) c());
        if ((i18 & 1) == 1 && this.u <= u.d.a) {
            this.w = z0Var.a();
        }
        int i20 = this.u;
        if (i20 == u.b.a || i20 == u.d.a) {
            this.y = this.x.getType();
            return true;
        }
        if (i20 == u.f.a || i20 == u.r.a) {
            this.y = c();
            return true;
        }
        if (i20 == u.c.a || i20 == u.h.a || i20 == u.n.a) {
            if ((i18 & 1) == 1) {
                this.z = c();
            }
            return true;
        }
        if (i20 == uVar.a) {
            this.A = c();
            if ((this.t & 2048) != 0) {
                this.z = c();
            }
        }
        return true;
    }

    public final Object c() {
        int i10 = this.n;
        this.n = i10 + 1;
        return this.b[i10];
    }
}
