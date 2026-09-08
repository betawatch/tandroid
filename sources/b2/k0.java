package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k0 {
    public static final k0 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final f0 b;
    public final e0 c;
    public final n0 d;
    public final a0 e;
    public final g0 f;

    static {
        y yVar = new y();
        e9.g0 g0Var = e9.i0.b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        d0 d0Var = new d0();
        g = new k0("", new a0(yVar), null, new e0(d0Var), n0.K, g0.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.a = str;
        this.b = f0Var;
        this.c = e0Var;
        this.d = n0Var;
        this.e = a0Var;
        this.f = g0Var;
    }

    public static k0 a(Bundle bundle) {
        e0 e0Var;
        a0 a0Var;
        g0 g0Var;
        Map a2;
        c0 c0Var;
        x xVar;
        e9.a1 i10;
        e9.a1 j3;
        f0 f0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            e0Var = e0.f;
        } else {
            d0 d0Var = new d0();
            String str = e0.g;
            e0 e0Var2 = e0.f;
            d0Var.a = bundle2.getLong(str, e0Var2.a);
            d0Var.b = bundle2.getLong(e0.h, e0Var2.b);
            d0Var.c = bundle2.getLong(e0.i, e0Var2.c);
            d0Var.d = bundle2.getFloat(e0.j, e0Var2.d);
            d0Var.e = bundle2.getFloat(e0.k, e0Var2.e);
            e0Var = new e0(d0Var);
        }
        e0 e0Var3 = e0Var;
        Bundle bundle3 = bundle.getBundle(j);
        n0 b10 = bundle3 == null ? n0.K : n0.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            a0Var = a0.r;
        } else {
            y yVar = new y();
            String str2 = z.j;
            z zVar = z.i;
            long j10 = zVar.a;
            long j11 = zVar.d;
            long j12 = zVar.b;
            long Q = e2.d0.Q(bundle4.getLong(str2, j10));
            boolean z10 = true;
            e2.d.b(Q >= 0);
            yVar.a = Q;
            long Q2 = e2.d0.Q(bundle4.getLong(z.k, zVar.c));
            e2.d.b(Q2 == Long.MIN_VALUE || Q2 >= 0);
            yVar.b = Q2;
            yVar.c = bundle4.getBoolean(z.l, zVar.e);
            yVar.d = bundle4.getBoolean(z.m, zVar.f);
            yVar.e = bundle4.getBoolean(z.n, zVar.g);
            yVar.f = bundle4.getBoolean(z.q, zVar.h);
            long j13 = bundle4.getLong(z.o, j12);
            if (j13 != j12) {
                e2.d.b(j13 >= 0);
                yVar.a = j13;
            }
            long j14 = bundle4.getLong(z.p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z10 = false;
                }
                e2.d.b(z10);
                yVar.b = j14;
            }
            a0Var = new a0(yVar);
        }
        a0 a0Var2 = a0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            g0Var = g0.d;
        } else {
            aa.a aVar = new aa.a(4);
            aVar.c = (Uri) bundle5.getParcelable(g0.e);
            aVar.b = bundle5.getString(g0.f);
            aVar.d = bundle5.getBundle(g0.g);
            g0Var = new g0(aVar);
        }
        g0 g0Var2 = g0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            f0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(f0.k);
            if (bundle7 == null) {
                c0Var = null;
            } else {
                String string2 = bundle7.getString(c0.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(c0.j);
                String str3 = c0.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a2 = e9.f1.h;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str4 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str4);
                            if (string3 != null) {
                                hashMap.put(str4, string3);
                            }
                        }
                    }
                    a2 = e9.k0.a(hashMap);
                }
                boolean z11 = bundle7.getBoolean(c0.l, false);
                boolean z12 = bundle7.getBoolean(c0.m, false);
                boolean z13 = bundle7.getBoolean(c0.n, false);
                String str5 = c0.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.i0 v = e9.i0.v(arrayList);
                byte[] byteArray = bundle7.getByteArray(c0.p);
                b0 b0Var = new b0();
                b0Var.a = fromString;
                b0Var.b = uri;
                b0Var.c = e9.k0.a(a2);
                b0Var.d = z11;
                b0Var.f = z13;
                b0Var.e = z12;
                b0Var.g = e9.i0.v(v);
                b0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                c0Var = new c0(b0Var);
            }
            Bundle bundle10 = bundle6.getBundle(f0.l);
            if (bundle10 == null) {
                xVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(x.b);
                uri2.getClass();
                w0 w0Var = new w0();
                w0Var.a = uri2;
                xVar = new x(w0Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(f0.m);
            if (parcelableArrayList == null) {
                e9.g0 g0Var3 = e9.i0.b;
                i10 = e9.a1.e;
            } else {
                e9.f0 u10 = e9.i0.u();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    u10.b(new e1(bundle11.getInt(e1.d, 0), bundle11.getInt(e1.e, 0), bundle11.getInt(e1.f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                i10 = u10.i();
            }
            e9.a1 a1Var = i10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(f0.o);
            if (parcelableArrayList2 == null) {
                e9.g0 g0Var4 = e9.i0.b;
                j3 = e9.a1.e;
            } else {
                j3 = e2.d.j(new androidx.emoji2.text.w(6), parcelableArrayList2);
            }
            e9.a1 a1Var2 = j3;
            long j15 = bundle6.getLong(f0.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(f0.i);
            uri3.getClass();
            f0Var = new f0(uri3, bundle6.getString(f0.j), c0Var, xVar, a1Var, bundle6.getString(f0.n), a1Var2, j15);
        }
        return new k0(string, a0Var2, f0Var, e0Var3, b10, g0Var2);
    }

    public final Bundle b(boolean z10) {
        f0 f0Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        e0 e0Var = e0.f;
        e0 e0Var2 = this.c;
        if (!e0Var2.equals(e0Var)) {
            bundle.putBundle(i, e0Var2.b());
        }
        n0 n0Var = n0.K;
        n0 n0Var2 = this.d;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(j, n0Var2.c());
        }
        z zVar = z.i;
        a0 a0Var = this.e;
        if (!a0Var.equals(zVar)) {
            Bundle bundle2 = new Bundle();
            long j3 = a0Var.a;
            if (j3 != zVar.a) {
                bundle2.putLong(z.j, j3);
            }
            long j10 = a0Var.c;
            if (j10 != zVar.c) {
                bundle2.putLong(z.k, j10);
            }
            long j11 = a0Var.b;
            if (j11 != zVar.b) {
                bundle2.putLong(z.o, j11);
            }
            long j12 = a0Var.d;
            if (j12 != zVar.d) {
                bundle2.putLong(z.p, j12);
            }
            boolean z11 = a0Var.e;
            if (z11 != zVar.e) {
                bundle2.putBoolean(z.l, z11);
            }
            boolean z12 = a0Var.f;
            if (z12 != zVar.f) {
                bundle2.putBoolean(z.m, z12);
            }
            boolean z13 = a0Var.g;
            if (z13 != zVar.g) {
                bundle2.putBoolean(z.n, z13);
            }
            boolean z14 = a0Var.h;
            if (z14 != zVar.h) {
                bundle2.putBoolean(z.q, z14);
            }
            bundle.putBundle(k, bundle2);
        }
        g0 g0Var = g0.d;
        g0 g0Var2 = this.f;
        if (!g0Var2.equals(g0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = g0Var2.a;
            if (uri != null) {
                bundle3.putParcelable(g0.e, uri);
            }
            String str2 = g0Var2.b;
            if (str2 != null) {
                bundle3.putString(g0.f, str2);
            }
            Bundle bundle4 = g0Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(g0.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z10 && (f0Var = this.b) != null) {
            e9.i0 i0Var = f0Var.g;
            List list = f0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(f0.i, f0Var.a);
            String str3 = f0Var.b;
            if (str3 != null) {
                bundle5.putString(f0.j, str3);
            }
            c0 c0Var = f0Var.c;
            if (c0Var != null) {
                String str4 = f0.k;
                e9.i0 i0Var2 = c0Var.g;
                e9.k0 k0Var = c0Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(c0.i, c0Var.a.toString());
                Uri uri2 = c0Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(c0.j, uri2);
                }
                if (!k0Var.isEmpty()) {
                    String str5 = c0.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = c0Var.d;
                if (z15) {
                    bundle6.putBoolean(c0.l, z15);
                }
                boolean z16 = c0Var.e;
                if (z16) {
                    bundle6.putBoolean(c0.m, z16);
                }
                boolean z17 = c0Var.f;
                if (z17) {
                    bundle6.putBoolean(c0.n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(c0.o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = c0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(c0.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            x xVar = f0Var.d;
            if (xVar != null) {
                String str6 = f0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(x.b, xVar.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(f0.m, e2.d.p(list, new androidx.emoji2.text.w(4)));
            }
            String str7 = f0Var.f;
            if (str7 != null) {
                bundle5.putString(f0.n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(f0.o, e2.d.p(i0Var, new androidx.emoji2.text.w(5)));
            }
            long j13 = f0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(f0.p, j13);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Objects.equals(this.a, k0Var.a) && this.e.equals(k0Var.e) && Objects.equals(this.b, k0Var.b) && Objects.equals(this.c, k0Var.c) && Objects.equals(this.d, k0Var.d) && Objects.equals(this.f, k0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f0 f0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
