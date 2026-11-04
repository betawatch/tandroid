package d2;

import android.net.Uri;
import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 {
    public static final n0 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final i0 b;
    public final h0 c;
    public final q0 d;
    public final d0 e;
    public final j0 f;

    static {
        b0 b0Var = new b0();
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var2 = g9.s1.e;
        g0 g0Var2 = new g0();
        g = new n0("", new d0(b0Var), null, new h0(g0Var2), q0.L, j0.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public n0(String str, d0 d0Var, i0 i0Var, h0 h0Var, q0 q0Var, j0 j0Var) {
        this.a = str;
        this.b = i0Var;
        this.c = h0Var;
        this.d = q0Var;
        this.e = d0Var;
        this.f = j0Var;
    }

    public static n0 a(int i3, Bundle bundle) {
        h0 h0Var;
        d0 d0Var;
        j0 j0Var;
        Map b10;
        f0 f0Var;
        a0 a0Var;
        g9.s1 f10;
        g9.s1 b11;
        i0 i0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            h0Var = h0.f;
        } else {
            g0 g0Var = new g0();
            String str = h0.g;
            h0 h0Var2 = h0.f;
            g0Var.a = bundle2.getLong(str, h0Var2.a);
            g0Var.b = bundle2.getLong(h0.h, h0Var2.b);
            g0Var.c = bundle2.getLong(h0.i, h0Var2.c);
            g0Var.d = bundle2.getFloat(h0.j, h0Var2.d);
            g0Var.e = bundle2.getFloat(h0.k, h0Var2.e);
            h0Var = new h0(g0Var);
        }
        h0 h0Var3 = h0Var;
        Bundle bundle3 = bundle.getBundle(j);
        q0 b12 = bundle3 == null ? q0.L : q0.b(i3, bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        boolean z10 = false;
        if (bundle4 == null) {
            d0Var = d0.r;
        } else {
            b0 b0Var = new b0();
            String str2 = c0.j;
            c0 c0Var = c0.i;
            long j10 = c0Var.a;
            long j11 = c0Var.d;
            long j12 = c0Var.b;
            long S = g2.n0.S(bundle4.getLong(str2, j10));
            boolean z11 = true;
            zb.f(S >= 0);
            b0Var.a = S;
            long S2 = g2.n0.S(bundle4.getLong(c0.k, c0Var.c));
            zb.f(S2 == Long.MIN_VALUE || S2 >= 0);
            b0Var.b = S2;
            b0Var.c = bundle4.getBoolean(c0.l, c0Var.e);
            b0Var.d = bundle4.getBoolean(c0.m, c0Var.f);
            b0Var.e = bundle4.getBoolean(c0.n, c0Var.g);
            b0Var.f = bundle4.getBoolean(c0.q, c0Var.h);
            long j13 = bundle4.getLong(c0.o, j12);
            if (j13 != j12) {
                zb.f(j13 >= 0);
                b0Var.a = j13;
            }
            long j14 = bundle4.getLong(c0.p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z11 = false;
                }
                zb.f(z11);
                b0Var.b = j14;
            }
            d0Var = new d0(b0Var);
        }
        d0 d0Var2 = d0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            j0Var = j0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(13, z10);
            a0Var2.b = (Uri) bundle5.getParcelable(j0.e);
            a0Var2.c = bundle5.getString(j0.f);
            a0Var2.d = g2.n0.o(bundle5.getBundle(j0.g));
            j0Var = new j0(a0Var2);
        }
        j0 j0Var2 = j0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            i0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(i0.k);
            if (bundle7 == null) {
                f0Var = null;
            } else {
                String string2 = bundle7.getString(f0.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(f0.j);
                String str3 = f0.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b10 = g9.x1.h;
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
                    b10 = g9.l0.b(hashMap);
                }
                boolean z12 = bundle7.getBoolean(f0.l, false);
                boolean z13 = bundle7.getBoolean(f0.m, false);
                boolean z14 = bundle7.getBoolean(f0.n, false);
                String str5 = f0.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                g9.i0 q10 = g9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(f0.p);
                e0 e0Var = new e0();
                e0Var.a = fromString;
                e0Var.b = uri;
                e0Var.c = g9.l0.b(b10);
                e0Var.d = z12;
                e0Var.f = z14;
                e0Var.e = z13;
                e0Var.g = g9.i0.q(q10);
                e0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                f0Var = new f0(e0Var);
            }
            Bundle bundle10 = bundle6.getBundle(i0.l);
            if (bundle10 == null) {
                a0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(a0.b);
                uri2.getClass();
                z0 z0Var = new z0();
                z0Var.a = uri2;
                a0Var = new a0(z0Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(i0.m);
            if (parcelableArrayList == null) {
                g9.g0 g0Var2 = g9.i0.b;
                f10 = g9.s1.e;
            } else {
                g9.f0 p10 = g9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new h1(bundle11.getInt(h1.d, 0), bundle11.getInt(h1.e, 0), bundle11.getInt(h1.f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            g9.s1 s1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(i0.o);
            if (parcelableArrayList2 == null) {
                g9.g0 g0Var3 = g9.i0.b;
                b11 = g9.s1.e;
            } else {
                b11 = g2.f.b(new a3.j(27), parcelableArrayList2);
            }
            g9.s1 s1Var2 = b11;
            long j15 = bundle6.getLong(i0.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(i0.i);
            uri3.getClass();
            i0Var = new i0(uri3, bundle6.getString(i0.j), f0Var, a0Var, s1Var, bundle6.getString(i0.n), s1Var2, j15);
        }
        return new n0(string, d0Var2, i0Var, h0Var3, b12, j0Var2);
    }

    public static n0 b(Uri uri) {
        i0 i0Var;
        b0 b0Var = new b0();
        e0 e0Var = new e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.e;
        g0 g0Var = new g0();
        j0 j0Var = j0.d;
        zb.p(e0Var.b == null || e0Var.a != null);
        f0 f0Var = null;
        if (uri != null) {
            if (e0Var.a != null) {
                f0Var = new f0(e0Var);
            }
            i0Var = new i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            i0Var = null;
        }
        return new n0("", new d0(b0Var), i0Var, new h0(g0Var), q0.L, j0Var);
    }

    public final Bundle c(int i3, boolean z10) {
        i0 i0Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        h0 h0Var = h0.f;
        h0 h0Var2 = this.c;
        if (!h0Var2.equals(h0Var)) {
            bundle.putBundle(i, h0Var2.b());
        }
        q0 q0Var = q0.L;
        q0 q0Var2 = this.d;
        if (!q0Var2.equals(q0Var)) {
            bundle.putBundle(j, q0Var2.c(i3));
        }
        c0 c0Var = c0.i;
        d0 d0Var = this.e;
        if (!d0Var.equals(c0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = d0Var.a;
            if (j10 != c0Var.a) {
                bundle2.putLong(c0.j, j10);
            }
            long j11 = d0Var.c;
            if (j11 != c0Var.c) {
                bundle2.putLong(c0.k, j11);
            }
            long j12 = d0Var.b;
            if (j12 != c0Var.b) {
                bundle2.putLong(c0.o, j12);
            }
            long j13 = d0Var.d;
            if (j13 != c0Var.d) {
                bundle2.putLong(c0.p, j13);
            }
            boolean z11 = d0Var.e;
            if (z11 != c0Var.e) {
                bundle2.putBoolean(c0.l, z11);
            }
            boolean z12 = d0Var.f;
            if (z12 != c0Var.f) {
                bundle2.putBoolean(c0.m, z12);
            }
            boolean z13 = d0Var.g;
            if (z13 != c0Var.g) {
                bundle2.putBoolean(c0.n, z13);
            }
            boolean z14 = d0Var.h;
            if (z14 != c0Var.h) {
                bundle2.putBoolean(c0.q, z14);
            }
            bundle.putBundle(k, bundle2);
        }
        j0 j0Var = j0.d;
        j0 j0Var2 = this.f;
        if (!j0Var2.equals(j0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = j0Var2.a;
            if (uri != null) {
                bundle3.putParcelable(j0.e, uri);
            }
            String str2 = j0Var2.b;
            if (str2 != null) {
                bundle3.putString(j0.f, str2);
            }
            Bundle bundle4 = j0Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(j0.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z10 && (i0Var = this.b) != null) {
            g9.i0 i0Var2 = i0Var.g;
            List list = i0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(i0.i, i0Var.a);
            String str3 = i0Var.b;
            if (str3 != null) {
                bundle5.putString(i0.j, str3);
            }
            f0 f0Var = i0Var.c;
            if (f0Var != null) {
                String str4 = i0.k;
                g9.i0 i0Var3 = f0Var.g;
                g9.l0 l0Var = f0Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(f0.i, f0Var.a.toString());
                Uri uri2 = f0Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(f0.j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = f0.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = f0Var.d;
                if (z15) {
                    bundle6.putBoolean(f0.l, z15);
                }
                boolean z16 = f0Var.e;
                if (z16) {
                    bundle6.putBoolean(f0.m, z16);
                }
                boolean z17 = f0Var.f;
                if (z17) {
                    bundle6.putBoolean(f0.n, z17);
                }
                if (!i0Var3.isEmpty()) {
                    bundle6.putIntegerArrayList(f0.o, new ArrayList<>(i0Var3));
                }
                byte[] bArr = f0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(f0.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            a0 a0Var = i0Var.d;
            if (a0Var != null) {
                String str6 = i0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(a0.b, a0Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(i0.m, g2.f.h(list, new a3.j(25)));
            }
            String str7 = i0Var.f;
            if (str7 != null) {
                bundle5.putString(i0.n, str7);
            }
            if (!i0Var2.isEmpty()) {
                bundle5.putParcelableArrayList(i0.o, g2.f.h(i0Var2, new a3.j(26)));
            }
            long j14 = i0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(i0.p, j14);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Objects.equals(this.a, n0Var.a) && this.e.equals(n0Var.e) && Objects.equals(this.b, n0Var.b) && Objects.equals(this.c, n0Var.c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.f, n0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i0 i0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
