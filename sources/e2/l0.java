package e2;

import a8.ia;
import android.net.Uri;
import android.os.Bundle;
import h9.y1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l0 {
    public static final l0 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final g0 b;
    public final f0 c;
    public final o0 d;
    public final b0 e;
    public final h0 f;

    static {
        z zVar = new z();
        h9.g0 g0Var = h9.i0.b;
        h9.t1 t1Var = h9.t1.e;
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var2 = h9.t1.e;
        e0 e0Var = new e0();
        g = new l0("", new b0(zVar), null, new f0(e0Var), o0.L, h0.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public l0(String str, b0 b0Var, g0 g0Var, f0 f0Var, o0 o0Var, h0 h0Var) {
        this.a = str;
        this.b = g0Var;
        this.c = f0Var;
        this.d = o0Var;
        this.e = b0Var;
        this.f = h0Var;
    }

    public static l0 a(int i7, Bundle bundle) {
        f0 f0Var;
        b0 b0Var;
        h0 h0Var;
        Map b10;
        d0 d0Var;
        y yVar;
        h9.t1 f10;
        h9.t1 b11;
        g0 g0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            f0Var = f0.f;
        } else {
            e0 e0Var = new e0();
            String str = f0.g;
            f0 f0Var2 = f0.f;
            e0Var.a = bundle2.getLong(str, f0Var2.a);
            e0Var.b = bundle2.getLong(f0.h, f0Var2.b);
            e0Var.c = bundle2.getLong(f0.i, f0Var2.c);
            e0Var.d = bundle2.getFloat(f0.j, f0Var2.d);
            e0Var.e = bundle2.getFloat(f0.k, f0Var2.e);
            f0Var = new f0(e0Var);
        }
        f0 f0Var3 = f0Var;
        Bundle bundle3 = bundle.getBundle(j);
        o0 b12 = bundle3 == null ? o0.L : o0.b(i7, bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        boolean z9 = false;
        if (bundle4 == null) {
            b0Var = b0.r;
        } else {
            z zVar = new z();
            String str2 = a0.j;
            a0 a0Var = a0.i;
            long j3 = a0Var.a;
            long j10 = a0Var.d;
            long j11 = a0Var.b;
            long S = h2.m0.S(bundle4.getLong(str2, j3));
            boolean z10 = true;
            ia.f(S >= 0);
            zVar.a = S;
            long S2 = h2.m0.S(bundle4.getLong(a0.k, a0Var.c));
            ia.f(S2 == Long.MIN_VALUE || S2 >= 0);
            zVar.b = S2;
            zVar.c = bundle4.getBoolean(a0.l, a0Var.e);
            zVar.d = bundle4.getBoolean(a0.m, a0Var.f);
            zVar.e = bundle4.getBoolean(a0.n, a0Var.g);
            zVar.f = bundle4.getBoolean(a0.q, a0Var.h);
            long j12 = bundle4.getLong(a0.o, j11);
            if (j12 != j11) {
                ia.f(j12 >= 0);
                zVar.a = j12;
            }
            long j13 = bundle4.getLong(a0.p, j10);
            if (j13 != j10) {
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z10 = false;
                }
                ia.f(z10);
                zVar.b = j13;
            }
            b0Var = new b0(zVar);
        }
        b0 b0Var2 = b0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            h0Var = h0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(20, z9);
            a0Var2.b = (Uri) bundle5.getParcelable(h0.e);
            a0Var2.c = bundle5.getString(h0.f);
            a0Var2.d = h2.m0.o(bundle5.getBundle(h0.g));
            h0Var = new h0(a0Var2);
        }
        h0 h0Var2 = h0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            g0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(g0.k);
            if (bundle7 == null) {
                d0Var = null;
            } else {
                String string2 = bundle7.getString(d0.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(d0.j);
                String str3 = d0.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b10 = y1.h;
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
                    b10 = h9.l0.b(hashMap);
                }
                boolean z11 = bundle7.getBoolean(d0.l, false);
                boolean z12 = bundle7.getBoolean(d0.m, false);
                boolean z13 = bundle7.getBoolean(d0.n, false);
                String str5 = d0.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                h9.i0 q10 = h9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(d0.p);
                c0 c0Var = new c0();
                c0Var.a = fromString;
                c0Var.b = uri;
                c0Var.c = h9.l0.b(b10);
                c0Var.d = z11;
                c0Var.f = z13;
                c0Var.e = z12;
                c0Var.g = h9.i0.q(q10);
                c0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                d0Var = new d0(c0Var);
            }
            Bundle bundle10 = bundle6.getBundle(g0.l);
            if (bundle10 == null) {
                yVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(y.b);
                uri2.getClass();
                x0 x0Var = new x0();
                x0Var.a = uri2;
                yVar = new y(x0Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(g0.m);
            if (parcelableArrayList == null) {
                h9.g0 g0Var2 = h9.i0.b;
                f10 = h9.t1.e;
            } else {
                h9.f0 p10 = h9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new f1(bundle11.getInt(f1.d, 0), bundle11.getInt(f1.e, 0), bundle11.getInt(f1.f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            h9.t1 t1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(g0.o);
            if (parcelableArrayList2 == null) {
                h9.g0 g0Var3 = h9.i0.b;
                b11 = h9.t1.e;
            } else {
                b11 = h2.e.b(new di.a1(7), parcelableArrayList2);
            }
            h9.t1 t1Var2 = b11;
            long j14 = bundle6.getLong(g0.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(g0.i);
            uri3.getClass();
            g0Var = new g0(uri3, bundle6.getString(g0.j), d0Var, yVar, t1Var, bundle6.getString(g0.n), t1Var2, j14);
        }
        return new l0(string, b0Var2, g0Var, f0Var3, b12, h0Var2);
    }

    public static l0 b(Uri uri) {
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        ia.p(c0Var.b == null || c0Var.a != null);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        return new l0("", new b0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
    }

    public final Bundle c(int i7, boolean z9) {
        g0 g0Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        f0 f0Var = f0.f;
        f0 f0Var2 = this.c;
        if (!f0Var2.equals(f0Var)) {
            bundle.putBundle(i, f0Var2.b());
        }
        o0 o0Var = o0.L;
        o0 o0Var2 = this.d;
        if (!o0Var2.equals(o0Var)) {
            bundle.putBundle(j, o0Var2.c(i7));
        }
        a0 a0Var = a0.i;
        b0 b0Var = this.e;
        if (!b0Var.equals(a0Var)) {
            Bundle bundle2 = new Bundle();
            long j3 = b0Var.a;
            if (j3 != a0Var.a) {
                bundle2.putLong(a0.j, j3);
            }
            long j10 = b0Var.c;
            if (j10 != a0Var.c) {
                bundle2.putLong(a0.k, j10);
            }
            long j11 = b0Var.b;
            if (j11 != a0Var.b) {
                bundle2.putLong(a0.o, j11);
            }
            long j12 = b0Var.d;
            if (j12 != a0Var.d) {
                bundle2.putLong(a0.p, j12);
            }
            boolean z10 = b0Var.e;
            if (z10 != a0Var.e) {
                bundle2.putBoolean(a0.l, z10);
            }
            boolean z11 = b0Var.f;
            if (z11 != a0Var.f) {
                bundle2.putBoolean(a0.m, z11);
            }
            boolean z12 = b0Var.g;
            if (z12 != a0Var.g) {
                bundle2.putBoolean(a0.n, z12);
            }
            boolean z13 = b0Var.h;
            if (z13 != a0Var.h) {
                bundle2.putBoolean(a0.q, z13);
            }
            bundle.putBundle(k, bundle2);
        }
        h0 h0Var = h0.d;
        h0 h0Var2 = this.f;
        if (!h0Var2.equals(h0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = h0Var2.a;
            if (uri != null) {
                bundle3.putParcelable(h0.e, uri);
            }
            String str2 = h0Var2.b;
            if (str2 != null) {
                bundle3.putString(h0.f, str2);
            }
            Bundle bundle4 = h0Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(h0.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z9 && (g0Var = this.b) != null) {
            h9.i0 i0Var = g0Var.g;
            List list = g0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(g0.i, g0Var.a);
            String str3 = g0Var.b;
            if (str3 != null) {
                bundle5.putString(g0.j, str3);
            }
            d0 d0Var = g0Var.c;
            if (d0Var != null) {
                String str4 = g0.k;
                h9.i0 i0Var2 = d0Var.g;
                h9.l0 l0Var = d0Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(d0.i, d0Var.a.toString());
                Uri uri2 = d0Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(d0.j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = d0.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z14 = d0Var.d;
                if (z14) {
                    bundle6.putBoolean(d0.l, z14);
                }
                boolean z15 = d0Var.e;
                if (z15) {
                    bundle6.putBoolean(d0.m, z15);
                }
                boolean z16 = d0Var.f;
                if (z16) {
                    bundle6.putBoolean(d0.n, z16);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(d0.o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = d0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(d0.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            y yVar = g0Var.d;
            if (yVar != null) {
                String str6 = g0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(y.b, yVar.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(g0.m, h2.e.h(list, new di.a1(5)));
            }
            String str7 = g0Var.f;
            if (str7 != null) {
                bundle5.putString(g0.n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(g0.o, h2.e.h(i0Var, new di.a1(6)));
            }
            long j13 = g0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(g0.p, j13);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Objects.equals(this.a, l0Var.a) && this.e.equals(l0Var.e) && Objects.equals(this.b, l0Var.b) && Objects.equals(this.c, l0Var.c) && Objects.equals(this.d, l0Var.d) && Objects.equals(this.f, l0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g0 g0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
