package b2;

import android.net.Uri;
import android.os.Bundle;
import e9.c2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class o0 {
    public static final o0 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final j0 b;
    public final i0 c;
    public final r0 d;
    public final e0 e;
    public final k0 f;

    static {
        c0 c0Var = new c0();
        e9.l0 l0Var = e9.n0.b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var2 = e9.x1.e;
        h0 h0Var = new h0();
        g = new o0("", new e0(c0Var), null, new i0(h0Var), r0.L, k0.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public o0(String str, e0 e0Var, j0 j0Var, i0 i0Var, r0 r0Var, k0 k0Var) {
        this.a = str;
        this.b = j0Var;
        this.c = i0Var;
        this.d = r0Var;
        this.e = e0Var;
        this.f = k0Var;
    }

    public static o0 a(int i10, Bundle bundle) {
        i0 i0Var;
        e0 e0Var;
        k0 k0Var;
        Map a2;
        g0 g0Var;
        b0 b0Var;
        e9.x1 f7;
        e9.x1 b10;
        j0 j0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            i0Var = i0.f;
        } else {
            h0 h0Var = new h0();
            String str = i0.g;
            i0 i0Var2 = i0.f;
            h0Var.a = bundle2.getLong(str, i0Var2.a);
            h0Var.b = bundle2.getLong(i0.h, i0Var2.b);
            h0Var.c = bundle2.getLong(i0.i, i0Var2.c);
            h0Var.d = bundle2.getFloat(i0.j, i0Var2.d);
            h0Var.e = bundle2.getFloat(i0.k, i0Var2.e);
            i0Var = new i0(h0Var);
        }
        i0 i0Var3 = i0Var;
        Bundle bundle3 = bundle.getBundle(j);
        r0 b11 = bundle3 == null ? r0.L : r0.b(i10, bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            e0Var = e0.r;
        } else {
            c0 c0Var = new c0();
            String str2 = d0.j;
            d0 d0Var = d0.i;
            long j10 = d0Var.a;
            long j11 = d0Var.d;
            long j12 = d0Var.b;
            long S = e2.m0.S(bundle4.getLong(str2, j10));
            boolean z10 = true;
            u6.g(S >= 0);
            c0Var.a = S;
            long S2 = e2.m0.S(bundle4.getLong(d0.k, d0Var.c));
            u6.g(S2 == Long.MIN_VALUE || S2 >= 0);
            c0Var.b = S2;
            c0Var.c = bundle4.getBoolean(d0.l, d0Var.e);
            c0Var.d = bundle4.getBoolean(d0.m, d0Var.f);
            c0Var.e = bundle4.getBoolean(d0.n, d0Var.g);
            c0Var.f = bundle4.getBoolean(d0.q, d0Var.h);
            long j13 = bundle4.getLong(d0.o, j12);
            if (j13 != j12) {
                u6.g(j13 >= 0);
                c0Var.a = j13;
            }
            long j14 = bundle4.getLong(d0.p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z10 = false;
                }
                u6.g(z10);
                c0Var.b = j14;
            }
            e0Var = new e0(c0Var);
        }
        e0 e0Var2 = e0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            k0Var = k0.d;
        } else {
            androidx.biometric.e eVar = new androidx.biometric.e(3);
            eVar.b = (Uri) bundle5.getParcelable(k0.e);
            eVar.c = bundle5.getString(k0.f);
            eVar.d = e2.m0.o(bundle5.getBundle(k0.g));
            k0Var = new k0(eVar);
        }
        k0 k0Var2 = k0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            j0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(j0.k);
            if (bundle7 == null) {
                g0Var = null;
            } else {
                String string2 = bundle7.getString(g0.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(g0.j);
                String str3 = g0.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a2 = c2.h;
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
                    a2 = e9.q0.a(hashMap);
                }
                boolean z11 = bundle7.getBoolean(g0.l, false);
                boolean z12 = bundle7.getBoolean(g0.m, false);
                boolean z13 = bundle7.getBoolean(g0.n, false);
                String str5 = g0.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.n0 u10 = e9.n0.u(arrayList);
                byte[] byteArray = bundle7.getByteArray(g0.p);
                f0 f0Var = new f0();
                f0Var.a = fromString;
                f0Var.b = uri;
                f0Var.c = e9.q0.a(a2);
                f0Var.d = z11;
                f0Var.f = z13;
                f0Var.e = z12;
                f0Var.g = e9.n0.u(u10);
                f0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                g0Var = new g0(f0Var);
            }
            Bundle bundle10 = bundle6.getBundle(j0.l);
            if (bundle10 == null) {
                b0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(b0.b);
                uri2.getClass();
                a1 a1Var = new a1();
                a1Var.a = uri2;
                b0Var = new b0(a1Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(j0.m);
            if (parcelableArrayList == null) {
                e9.l0 l0Var = e9.n0.b;
                f7 = e9.x1.e;
            } else {
                e9.k0 t10 = e9.n0.t();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    t10.c(new i1(bundle11.getInt(i1.d, 0), bundle11.getInt(i1.e, 0), bundle11.getInt(i1.f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                f7 = t10.f();
            }
            e9.x1 x1Var = f7;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(j0.o);
            if (parcelableArrayList2 == null) {
                e9.l0 l0Var2 = e9.n0.b;
                b10 = e9.x1.e;
            } else {
                b10 = e2.e.b(new aa.a(24), parcelableArrayList2);
            }
            e9.x1 x1Var2 = b10;
            long j15 = bundle6.getLong(j0.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(j0.i);
            uri3.getClass();
            j0Var = new j0(uri3, bundle6.getString(j0.j), g0Var, b0Var, x1Var, bundle6.getString(j0.n), x1Var2, j15);
        }
        return new o0(string, e0Var2, j0Var, i0Var3, b11, k0Var2);
    }

    public static o0 b(Uri uri) {
        j0 j0Var;
        c0 c0Var = new c0();
        f0 f0Var = new f0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        h0 h0Var = new h0();
        k0 k0Var = k0.d;
        u6.p(f0Var.b == null || f0Var.a != null);
        g0 g0Var = null;
        if (uri != null) {
            if (f0Var.a != null) {
                g0Var = new g0(f0Var);
            }
            j0Var = new j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            j0Var = null;
        }
        return new o0("", new e0(c0Var), j0Var, new i0(h0Var), r0.L, k0Var);
    }

    public final Bundle c(int i10, boolean z10) {
        j0 j0Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        i0 i0Var = i0.f;
        i0 i0Var2 = this.c;
        if (!i0Var2.equals(i0Var)) {
            bundle.putBundle(i, i0Var2.b());
        }
        r0 r0Var = r0.L;
        r0 r0Var2 = this.d;
        if (!r0Var2.equals(r0Var)) {
            bundle.putBundle(j, r0Var2.c(i10));
        }
        d0 d0Var = d0.i;
        e0 e0Var = this.e;
        if (!e0Var.equals(d0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = e0Var.a;
            if (j10 != d0Var.a) {
                bundle2.putLong(d0.j, j10);
            }
            long j11 = e0Var.c;
            if (j11 != d0Var.c) {
                bundle2.putLong(d0.k, j11);
            }
            long j12 = e0Var.b;
            if (j12 != d0Var.b) {
                bundle2.putLong(d0.o, j12);
            }
            long j13 = e0Var.d;
            if (j13 != d0Var.d) {
                bundle2.putLong(d0.p, j13);
            }
            boolean z11 = e0Var.e;
            if (z11 != d0Var.e) {
                bundle2.putBoolean(d0.l, z11);
            }
            boolean z12 = e0Var.f;
            if (z12 != d0Var.f) {
                bundle2.putBoolean(d0.m, z12);
            }
            boolean z13 = e0Var.g;
            if (z13 != d0Var.g) {
                bundle2.putBoolean(d0.n, z13);
            }
            boolean z14 = e0Var.h;
            if (z14 != d0Var.h) {
                bundle2.putBoolean(d0.q, z14);
            }
            bundle.putBundle(k, bundle2);
        }
        k0 k0Var = k0.d;
        k0 k0Var2 = this.f;
        if (!k0Var2.equals(k0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = k0Var2.a;
            if (uri != null) {
                bundle3.putParcelable(k0.e, uri);
            }
            String str2 = k0Var2.b;
            if (str2 != null) {
                bundle3.putString(k0.f, str2);
            }
            Bundle bundle4 = k0Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(k0.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z10 && (j0Var = this.b) != null) {
            e9.n0 n0Var = j0Var.g;
            List list = j0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(j0.i, j0Var.a);
            String str3 = j0Var.b;
            if (str3 != null) {
                bundle5.putString(j0.j, str3);
            }
            g0 g0Var = j0Var.c;
            if (g0Var != null) {
                String str4 = j0.k;
                e9.n0 n0Var2 = g0Var.g;
                e9.q0 q0Var = g0Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(g0.i, g0Var.a.toString());
                Uri uri2 = g0Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(g0.j, uri2);
                }
                if (!q0Var.isEmpty()) {
                    String str5 = g0.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : q0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = g0Var.d;
                if (z15) {
                    bundle6.putBoolean(g0.l, z15);
                }
                boolean z16 = g0Var.e;
                if (z16) {
                    bundle6.putBoolean(g0.m, z16);
                }
                boolean z17 = g0Var.f;
                if (z17) {
                    bundle6.putBoolean(g0.n, z17);
                }
                if (!n0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(g0.o, new ArrayList<>(n0Var2));
                }
                byte[] bArr = g0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(g0.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            b0 b0Var = j0Var.d;
            if (b0Var != null) {
                String str6 = j0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(b0.b, b0Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(j0.m, e2.e.h(list, new aa.a(22)));
            }
            String str7 = j0Var.f;
            if (str7 != null) {
                bundle5.putString(j0.n, str7);
            }
            if (!n0Var.isEmpty()) {
                bundle5.putParcelableArrayList(j0.o, e2.e.h(n0Var, new aa.a(23)));
            }
            long j14 = j0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(j0.p, j14);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Objects.equals(this.a, o0Var.a) && this.e.equals(o0Var.e) && Objects.equals(this.b, o0Var.b) && Objects.equals(this.c, o0Var.c) && Objects.equals(this.d, o0Var.d) && Objects.equals(this.f, o0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j0 j0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
