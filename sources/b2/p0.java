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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class p0 {
    public static final p0 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final k0 b;
    public final j0 c;
    public final s0 d;
    public final f0 e;
    public final l0 f;

    static {
        d0 d0Var = new d0();
        e9.l0 l0Var = e9.n0.b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var2 = e9.x1.e;
        i0 i0Var = new i0();
        g = new p0("", new f0(d0Var), null, new j0(i0Var), s0.L, l0.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public p0(String str, f0 f0Var, k0 k0Var, j0 j0Var, s0 s0Var, l0 l0Var) {
        this.a = str;
        this.b = k0Var;
        this.c = j0Var;
        this.d = s0Var;
        this.e = f0Var;
        this.f = l0Var;
    }

    public static p0 a(int i10, Bundle bundle) {
        j0 j0Var;
        f0 f0Var;
        l0 l0Var;
        Map a2;
        h0 h0Var;
        c0 c0Var;
        e9.x1 f7;
        e9.x1 b10;
        k0 k0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            j0Var = j0.f;
        } else {
            i0 i0Var = new i0();
            String str = j0.g;
            j0 j0Var2 = j0.f;
            i0Var.a = bundle2.getLong(str, j0Var2.a);
            i0Var.b = bundle2.getLong(j0.h, j0Var2.b);
            i0Var.c = bundle2.getLong(j0.i, j0Var2.c);
            i0Var.d = bundle2.getFloat(j0.j, j0Var2.d);
            i0Var.e = bundle2.getFloat(j0.k, j0Var2.e);
            j0Var = new j0(i0Var);
        }
        j0 j0Var3 = j0Var;
        Bundle bundle3 = bundle.getBundle(j);
        s0 b11 = bundle3 == null ? s0.L : s0.b(i10, bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            f0Var = f0.r;
        } else {
            d0 d0Var = new d0();
            String str2 = e0.j;
            e0 e0Var = e0.i;
            long j10 = e0Var.a;
            long j11 = e0Var.d;
            long j12 = e0Var.b;
            long S = e2.m0.S(bundle4.getLong(str2, j10));
            boolean z10 = true;
            u6.g(S >= 0);
            d0Var.a = S;
            long S2 = e2.m0.S(bundle4.getLong(e0.k, e0Var.c));
            u6.g(S2 == Long.MIN_VALUE || S2 >= 0);
            d0Var.b = S2;
            d0Var.c = bundle4.getBoolean(e0.l, e0Var.e);
            d0Var.d = bundle4.getBoolean(e0.m, e0Var.f);
            d0Var.e = bundle4.getBoolean(e0.n, e0Var.g);
            d0Var.f = bundle4.getBoolean(e0.q, e0Var.h);
            long j13 = bundle4.getLong(e0.o, j12);
            if (j13 != j12) {
                u6.g(j13 >= 0);
                d0Var.a = j13;
            }
            long j14 = bundle4.getLong(e0.p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z10 = false;
                }
                u6.g(z10);
                d0Var.b = j14;
            }
            f0Var = new f0(d0Var);
        }
        f0 f0Var2 = f0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            l0Var = l0.d;
        } else {
            androidx.biometric.e eVar = new androidx.biometric.e(3);
            eVar.b = (Uri) bundle5.getParcelable(l0.e);
            eVar.c = bundle5.getString(l0.f);
            eVar.d = e2.m0.o(bundle5.getBundle(l0.g));
            l0Var = new l0(eVar);
        }
        l0 l0Var2 = l0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            k0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(k0.k);
            if (bundle7 == null) {
                h0Var = null;
            } else {
                String string2 = bundle7.getString(h0.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(h0.j);
                String str3 = h0.k;
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
                boolean z11 = bundle7.getBoolean(h0.l, false);
                boolean z12 = bundle7.getBoolean(h0.m, false);
                boolean z13 = bundle7.getBoolean(h0.n, false);
                String str5 = h0.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.n0 u10 = e9.n0.u(arrayList);
                byte[] byteArray = bundle7.getByteArray(h0.p);
                g0 g0Var = new g0();
                g0Var.a = fromString;
                g0Var.b = uri;
                g0Var.c = e9.q0.a(a2);
                g0Var.d = z11;
                g0Var.f = z13;
                g0Var.e = z12;
                g0Var.g = e9.n0.u(u10);
                g0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                h0Var = new h0(g0Var);
            }
            Bundle bundle10 = bundle6.getBundle(k0.l);
            if (bundle10 == null) {
                c0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(c0.b);
                uri2.getClass();
                b1 b1Var = new b1();
                b1Var.a = uri2;
                c0Var = new c0(b1Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(k0.m);
            if (parcelableArrayList == null) {
                e9.l0 l0Var3 = e9.n0.b;
                f7 = e9.x1.e;
            } else {
                e9.k0 t10 = e9.n0.t();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    t10.c(new j1(bundle11.getInt(j1.d, 0), bundle11.getInt(j1.e, 0), bundle11.getInt(j1.f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                f7 = t10.f();
            }
            e9.x1 x1Var = f7;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(k0.o);
            if (parcelableArrayList2 == null) {
                e9.l0 l0Var4 = e9.n0.b;
                b10 = e9.x1.e;
            } else {
                b10 = e2.e.b(new aa.a(20), parcelableArrayList2);
            }
            e9.x1 x1Var2 = b10;
            long j15 = bundle6.getLong(k0.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(k0.i);
            uri3.getClass();
            k0Var = new k0(uri3, bundle6.getString(k0.j), h0Var, c0Var, x1Var, bundle6.getString(k0.n), x1Var2, j15);
        }
        return new p0(string, f0Var2, k0Var, j0Var3, b11, l0Var2);
    }

    public static p0 b(Uri uri) {
        k0 k0Var;
        d0 d0Var = new d0();
        g0 g0Var = new g0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        i0 i0Var = new i0();
        l0 l0Var = l0.d;
        u6.p(g0Var.b == null || g0Var.a != null);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        return new p0("", new f0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
    }

    public final Bundle c(int i10, boolean z10) {
        k0 k0Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        j0 j0Var = j0.f;
        j0 j0Var2 = this.c;
        if (!j0Var2.equals(j0Var)) {
            bundle.putBundle(i, j0Var2.b());
        }
        s0 s0Var = s0.L;
        s0 s0Var2 = this.d;
        if (!s0Var2.equals(s0Var)) {
            bundle.putBundle(j, s0Var2.c(i10));
        }
        e0 e0Var = e0.i;
        f0 f0Var = this.e;
        if (!f0Var.equals(e0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = f0Var.a;
            if (j10 != e0Var.a) {
                bundle2.putLong(e0.j, j10);
            }
            long j11 = f0Var.c;
            if (j11 != e0Var.c) {
                bundle2.putLong(e0.k, j11);
            }
            long j12 = f0Var.b;
            if (j12 != e0Var.b) {
                bundle2.putLong(e0.o, j12);
            }
            long j13 = f0Var.d;
            if (j13 != e0Var.d) {
                bundle2.putLong(e0.p, j13);
            }
            boolean z11 = f0Var.e;
            if (z11 != e0Var.e) {
                bundle2.putBoolean(e0.l, z11);
            }
            boolean z12 = f0Var.f;
            if (z12 != e0Var.f) {
                bundle2.putBoolean(e0.m, z12);
            }
            boolean z13 = f0Var.g;
            if (z13 != e0Var.g) {
                bundle2.putBoolean(e0.n, z13);
            }
            boolean z14 = f0Var.h;
            if (z14 != e0Var.h) {
                bundle2.putBoolean(e0.q, z14);
            }
            bundle.putBundle(k, bundle2);
        }
        l0 l0Var = l0.d;
        l0 l0Var2 = this.f;
        if (!l0Var2.equals(l0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = l0Var2.a;
            if (uri != null) {
                bundle3.putParcelable(l0.e, uri);
            }
            String str2 = l0Var2.b;
            if (str2 != null) {
                bundle3.putString(l0.f, str2);
            }
            Bundle bundle4 = l0Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(l0.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z10 && (k0Var = this.b) != null) {
            e9.n0 n0Var = k0Var.g;
            List list = k0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(k0.i, k0Var.a);
            String str3 = k0Var.b;
            if (str3 != null) {
                bundle5.putString(k0.j, str3);
            }
            h0 h0Var = k0Var.c;
            if (h0Var != null) {
                String str4 = k0.k;
                e9.n0 n0Var2 = h0Var.g;
                e9.q0 q0Var = h0Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(h0.i, h0Var.a.toString());
                Uri uri2 = h0Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(h0.j, uri2);
                }
                if (!q0Var.isEmpty()) {
                    String str5 = h0.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : q0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = h0Var.d;
                if (z15) {
                    bundle6.putBoolean(h0.l, z15);
                }
                boolean z16 = h0Var.e;
                if (z16) {
                    bundle6.putBoolean(h0.m, z16);
                }
                boolean z17 = h0Var.f;
                if (z17) {
                    bundle6.putBoolean(h0.n, z17);
                }
                if (!n0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(h0.o, new ArrayList<>(n0Var2));
                }
                byte[] bArr = h0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(h0.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            c0 c0Var = k0Var.d;
            if (c0Var != null) {
                String str6 = k0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(c0.b, c0Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(k0.m, e2.e.h(list, new aa.a(18)));
            }
            String str7 = k0Var.f;
            if (str7 != null) {
                bundle5.putString(k0.n, str7);
            }
            if (!n0Var.isEmpty()) {
                bundle5.putParcelableArrayList(k0.o, e2.e.h(n0Var, new aa.a(19)));
            }
            long j14 = k0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(k0.p, j14);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Objects.equals(this.a, p0Var.a) && this.e.equals(p0Var.e) && Objects.equals(this.b, p0Var.b) && Objects.equals(this.c, p0Var.c) && Objects.equals(this.d, p0Var.d) && Objects.equals(this.f, p0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k0 k0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
