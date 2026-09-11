package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class y0 {
    public Object A;
    public final aa.b a;
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
        aa.b bVar = new aa.b(str);
        this.a = bVar;
        this.b = objArr;
        this.d = bVar.a();
        int a2 = bVar.a();
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
        int a10 = bVar.a();
        this.f = a10;
        int a11 = bVar.a();
        this.g = bVar.a();
        this.h = bVar.a();
        this.k = bVar.a();
        this.j = bVar.a();
        this.i = bVar.a();
        this.l = bVar.a();
        int a12 = bVar.a();
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
            StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            throw new RuntimeException(a4.a.s(sb2, " not found. Known fields are ", arrays));
        }
    }

    public final boolean a() {
        aa.b bVar = this.a;
        if (bVar.c >= bVar.b.length()) {
            return false;
        }
        this.s = bVar.a();
        int a2 = bVar.a();
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
        t tVar = t.s;
        int i12 = tVar.a;
        if (i10 != i12 && i10 >= t.e.a) {
            int i13 = t.r.a;
        }
        int i14 = this.r + 1;
        this.r = i14;
        int i15 = this.p;
        Class cls = a1.a;
        if (i11 >= 40) {
            long j3 = i14;
            int i16 = (((i11 - i15) + 10) > (((j3 + 3) * 3) + (2 * j3) + 3) ? 1 : (((i11 - i15) + 10) == (((j3 + 3) * 3) + (2 * j3) + 3) ? 0 : -1));
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
            this.v = bVar.a();
            int i19 = this.u;
            if (i19 == t.b.a + 51 || i19 == t.d.a + 51) {
                this.y = c();
                return true;
            }
            if (i19 == t.c.a + 51 && (i18 & 1) == 1) {
                this.z = c();
            }
            return true;
        }
        this.x = b(this.c, (String) c());
        if ((i18 & 1) == 1 && this.u <= t.d.a) {
            this.w = bVar.a();
        }
        int i20 = this.u;
        if (i20 == t.b.a || i20 == t.d.a) {
            this.y = this.x.getType();
            return true;
        }
        if (i20 == t.f.a || i20 == t.r.a) {
            this.y = c();
            return true;
        }
        if (i20 == t.c.a || i20 == t.h.a || i20 == t.n.a) {
            if ((i18 & 1) == 1) {
                this.z = c();
            }
            return true;
        }
        if (i20 == tVar.a) {
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
