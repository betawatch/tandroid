package fh;

import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ag1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements GenericProvider, org.telegram.ui.ActionBar.b2, n8.e, d5.k, h3.f, h9.b {
    public final /* synthetic */ int a;

    public /* synthetic */ y5(int i9) {
        this.a = i9;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    @Override // h9.b
    public Object a(JsonReader jsonReader) {
        String str;
        String str2 = null;
        switch (this.a) {
            case 28:
                jsonReader.beginObject();
                String str3 = null;
                String str4 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName) {
                        case "libraryName":
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case "arch":
                            str2 = jsonReader.nextString();
                            if (str2 == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                        case "buildId":
                            str4 = jsonReader.nextString();
                            if (str4 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                str = str2 == null ? " arch" : "";
                if (str3 == null) {
                    str = str.concat(" libraryName");
                }
                if (str4 == null) {
                    str = ta.b.j(str, " buildId");
                }
                if (str.isEmpty()) {
                    return new g9.c0(str2, str3, str4);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            default:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("filename")) {
                        str2 = jsonReader.nextString();
                        if (str2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (nextName2.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                str = str2 == null ? " filename" : "";
                if (bArr == null) {
                    str = str.concat(" contents");
                }
                if (str.isEmpty()) {
                    return new g9.f0(str2, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    @Override // n8.e
    public Object apply(Object obj) {
        return new i3.f((d5.a0) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h3.f
    public h3.g c(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        int i9 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 14:
                h3.t0 t0Var = h3.t0.Y;
                h3.s0 s0Var = new h3.s0();
                if (bundle != null) {
                    ClassLoader classLoader = d5.a.class.getClassLoader();
                    int i10 = d5.f0.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(h3.t0.Z);
                String str = t0Var.a;
                if (string == null) {
                    string = str;
                }
                s0Var.a = string;
                String string2 = bundle.getString(h3.t0.a0);
                String str2 = t0Var.b;
                if (string2 == null) {
                    string2 = str2;
                }
                s0Var.b = string2;
                String string3 = bundle.getString(h3.t0.b0);
                String str3 = t0Var.c;
                if (string3 == null) {
                    string3 = str3;
                }
                s0Var.c = string3;
                s0Var.d = bundle.getInt(h3.t0.c0, t0Var.d);
                s0Var.e = bundle.getInt(h3.t0.d0, t0Var.e);
                s0Var.f = bundle.getInt(h3.t0.e0, t0Var.f);
                s0Var.g = bundle.getInt(h3.t0.f0, t0Var.h);
                String string4 = bundle.getString(h3.t0.g0);
                String str4 = t0Var.r;
                if (string4 == null) {
                    string4 = str4;
                }
                s0Var.h = string4;
                z3.c cVar = (z3.c) bundle.getParcelable(h3.t0.h0);
                z3.c cVar2 = t0Var.s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                s0Var.i = cVar;
                String string5 = bundle.getString(h3.t0.i0);
                String str5 = t0Var.A;
                if (string5 == null) {
                    string5 = str5;
                }
                s0Var.n = string5;
                String string6 = bundle.getString(h3.t0.j0);
                String str6 = t0Var.B;
                if (string6 == null) {
                    string6 = str6;
                }
                s0Var.o = string6;
                s0Var.p = bundle.getInt(h3.t0.k0, t0Var.C);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(h3.t0.l0 + "_" + Integer.toString(i9, 36));
                    if (byteArray == null) {
                        s0Var.q = arrayList;
                        s0Var.r = (l3.c) bundle.getParcelable(h3.t0.m0);
                        s0Var.s = bundle.getLong(h3.t0.n0, t0Var.F);
                        s0Var.t = bundle.getInt(h3.t0.o0, t0Var.G);
                        s0Var.u = bundle.getInt(h3.t0.p0, t0Var.H);
                        s0Var.v = bundle.getFloat(h3.t0.q0, t0Var.I);
                        s0Var.w = bundle.getInt(h3.t0.r0, t0Var.J);
                        s0Var.x = bundle.getFloat(h3.t0.s0, t0Var.K);
                        s0Var.y = bundle.getByteArray(h3.t0.t0);
                        s0Var.z = bundle.getInt(h3.t0.u0, t0Var.M);
                        Bundle bundle4 = bundle.getBundle(h3.t0.v0);
                        if (bundle4 != null) {
                            s0Var.A = (e5.b) e5.b.s.c(bundle4);
                        }
                        s0Var.B = bundle.getInt(h3.t0.w0, t0Var.O);
                        s0Var.C = bundle.getInt(h3.t0.x0, t0Var.P);
                        s0Var.D = bundle.getInt(h3.t0.y0, t0Var.Q);
                        s0Var.E = bundle.getInt(h3.t0.z0, t0Var.R);
                        s0Var.F = bundle.getInt(h3.t0.A0, t0Var.S);
                        s0Var.G = bundle.getInt(h3.t0.B0, t0Var.T);
                        s0Var.H = bundle.getInt(h3.t0.D0, t0Var.U);
                        s0Var.I = bundle.getInt(h3.t0.E0, t0Var.V);
                        s0Var.J = bundle.getInt(h3.t0.C0, t0Var.W);
                        return new h3.t0(s0Var);
                    }
                    arrayList.add(byteArray);
                    i9++;
                }
            case 15:
                d5.a.f(bundle.getInt(h3.g2.a, -1) == 0);
                return bundle.getBoolean(h3.v0.e, false) ? new h3.v0(bundle.getBoolean(h3.v0.f, false)) : new h3.v0();
            case 16:
                String string7 = bundle.getString(h3.f1.n, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(h3.f1.r);
                h3.b1 b1Var = bundle5 == null ? h3.b1.f : (h3.b1) h3.b1.w.c(bundle5);
                Bundle bundle6 = bundle.getBundle(h3.f1.s);
                h3.h1 h1Var = bundle6 == null ? h3.h1.U : (h3.h1) h3.h1.C0.c(bundle6);
                Bundle bundle7 = bundle.getBundle(h3.f1.v);
                h3.z0 z0Var = bundle7 == null ? h3.z0.x : (h3.z0) h3.y0.w.c(bundle7);
                Bundle bundle8 = bundle.getBundle(h3.f1.w);
                return new h3.f1(string7, z0Var, null, b1Var, h1Var, bundle8 == null ? h3.d1.c : (h3.d1) h3.d1.h.c(bundle8));
            case 17:
                h3.x0 x0Var = new h3.x0();
                String str7 = h3.y0.h;
                h3.z0 z0Var2 = h3.y0.f;
                long j10 = bundle.getLong(str7, z0Var2.a);
                d5.a.f(j10 >= 0);
                x0Var.a = j10;
                long j11 = bundle.getLong(h3.y0.n, z0Var2.b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    r12 = false;
                }
                d5.a.f(r12);
                x0Var.b = j11;
                x0Var.c = bundle.getBoolean(h3.y0.r, z0Var2.c);
                x0Var.d = bundle.getBoolean(h3.y0.s, z0Var2.d);
                x0Var.e = bundle.getBoolean(h3.y0.v, z0Var2.e);
                return new h3.z0(x0Var);
            case 18:
                return new h3.b1(bundle.getLong(h3.b1.h, -9223372036854775807L), bundle.getLong(h3.b1.n, -9223372036854775807L), bundle.getLong(h3.b1.r, -9223372036854775807L), bundle.getFloat(h3.b1.s, -3.4028235E38f), bundle.getFloat(h3.b1.v, -3.4028235E38f));
            case 19:
                a5.m mVar = new a5.m(20, (boolean) (objArr == true ? 1 : 0));
                mVar.b = (Uri) bundle.getParcelable(h3.d1.d);
                mVar.c = bundle.getString(h3.d1.e);
                mVar.d = bundle.getBundle(h3.d1.f);
                return new h3.d1(mVar);
            case 20:
                h3.g1 g1Var = new h3.g1();
                g1Var.a = bundle.getCharSequence(h3.h1.V);
                g1Var.b = bundle.getCharSequence(h3.h1.W);
                g1Var.c = bundle.getCharSequence(h3.h1.X);
                g1Var.d = bundle.getCharSequence(h3.h1.Y);
                g1Var.e = bundle.getCharSequence(h3.h1.Z);
                g1Var.f = bundle.getCharSequence(h3.h1.a0);
                g1Var.g = bundle.getCharSequence(h3.h1.b0);
                byte[] byteArray2 = bundle.getByteArray(h3.h1.e0);
                String str8 = h3.h1.x0;
                Integer valueOf = bundle.containsKey(str8) ? Integer.valueOf(bundle.getInt(str8)) : null;
                g1Var.j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                g1Var.k = valueOf;
                g1Var.l = (Uri) bundle.getParcelable(h3.h1.f0);
                g1Var.x = bundle.getCharSequence(h3.h1.q0);
                g1Var.y = bundle.getCharSequence(h3.h1.r0);
                g1Var.z = bundle.getCharSequence(h3.h1.s0);
                g1Var.C = bundle.getCharSequence(h3.h1.v0);
                g1Var.D = bundle.getCharSequence(h3.h1.w0);
                g1Var.E = bundle.getCharSequence(h3.h1.y0);
                g1Var.G = bundle.getBundle(h3.h1.B0);
                String str9 = h3.h1.c0;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    g1Var.h = (h3.g2) h3.g2.b.c(bundle3);
                }
                String str10 = h3.h1.d0;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    g1Var.i = (h3.g2) h3.g2.b.c(bundle2);
                }
                String str11 = h3.h1.g0;
                if (bundle.containsKey(str11)) {
                    g1Var.m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = h3.h1.h0;
                if (bundle.containsKey(str12)) {
                    g1Var.n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = h3.h1.i0;
                if (bundle.containsKey(str13)) {
                    g1Var.o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = h3.h1.A0;
                if (bundle.containsKey(str14)) {
                    g1Var.p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = h3.h1.j0;
                if (bundle.containsKey(str15)) {
                    g1Var.q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = h3.h1.k0;
                if (bundle.containsKey(str16)) {
                    g1Var.r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = h3.h1.l0;
                if (bundle.containsKey(str17)) {
                    g1Var.s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = h3.h1.m0;
                if (bundle.containsKey(str18)) {
                    g1Var.t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = h3.h1.n0;
                if (bundle.containsKey(str19)) {
                    g1Var.u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = h3.h1.o0;
                if (bundle.containsKey(str20)) {
                    g1Var.v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = h3.h1.p0;
                if (bundle.containsKey(str21)) {
                    g1Var.w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = h3.h1.t0;
                if (bundle.containsKey(str22)) {
                    g1Var.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = h3.h1.u0;
                if (bundle.containsKey(str23)) {
                    g1Var.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = h3.h1.z0;
                if (bundle.containsKey(str24)) {
                    g1Var.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new h3.h1(g1Var);
            case 21:
                d5.a.f(bundle.getInt(h3.g2.a, -1) == 1);
                float f10 = bundle.getFloat(h3.u1.d, -1.0f);
                return f10 == -1.0f ? new h3.u1() : new h3.u1(f10);
            case 22:
                int i11 = bundle.getInt(h3.g2.a, -1);
                if (i11 == 0) {
                    return (h3.g2) h3.v0.h.c(bundle);
                }
                if (i11 == 1) {
                    return (h3.g2) h3.u1.e.c(bundle);
                }
                if (i11 == 2) {
                    return (h3.g2) h3.l2.h.c(bundle);
                }
                if (i11 == 3) {
                    return (h3.g2) h3.n2.h.c(bundle);
                }
                throw new IllegalArgumentException(j3.r0.l(i11, "Unknown RatingType: "));
            case 23:
                d5.a.f(bundle.getInt(h3.g2.a, -1) == 2);
                int i12 = bundle.getInt(h3.l2.e, 5);
                float f11 = bundle.getFloat(h3.l2.f, -1.0f);
                return f11 == -1.0f ? new h3.l2(i12) : new h3.l2(i12, f11);
            case 24:
                d5.a.f(bundle.getInt(h3.g2.a, -1) == 3);
                return bundle.getBoolean(h3.n2.e, false) ? new h3.n2(bundle.getBoolean(h3.n2.f, false)) : new h3.n2();
            case 25:
                int i13 = bundle.getInt(h3.p2.n, 0);
                long j12 = bundle.getLong(h3.p2.r, -9223372036854775807L);
                long j13 = bundle.getLong(h3.p2.s, 0L);
                boolean z10 = bundle.getBoolean(h3.p2.v, false);
                Bundle bundle9 = bundle.getBundle(h3.p2.w);
                k4.b bVar = bundle9 != null ? (k4.b) k4.b.w.c(bundle9) : k4.b.f;
                h3.p2 p2Var = new h3.p2();
                p2Var.h(null, null, i13, j12, j13, bVar, z10);
                return p2Var;
            case 26:
                Bundle bundle10 = bundle.getBundle(h3.q2.G);
                h3.f1 f1Var = bundle10 != null ? (h3.f1) h3.f1.x.c(bundle10) : h3.f1.h;
                long j14 = bundle.getLong(h3.q2.H, -9223372036854775807L);
                long j15 = bundle.getLong(h3.q2.I, -9223372036854775807L);
                long j16 = bundle.getLong(h3.q2.J, -9223372036854775807L);
                boolean z11 = bundle.getBoolean(h3.q2.K, false);
                boolean z12 = bundle.getBoolean(h3.q2.L, false);
                Bundle bundle11 = bundle.getBundle(h3.q2.M);
                h3.b1 b1Var2 = bundle11 != null ? (h3.b1) h3.b1.w.c(bundle11) : null;
                boolean z13 = bundle.getBoolean(h3.q2.N, false);
                long j17 = bundle.getLong(h3.q2.O, 0L);
                long j18 = bundle.getLong(h3.q2.P, -9223372036854775807L);
                int i14 = bundle.getInt(h3.q2.Q, 0);
                int i15 = bundle.getInt(h3.q2.R, 0);
                long j19 = bundle.getLong(h3.q2.S, 0L);
                h3.q2 q2Var = new h3.q2();
                q2Var.b(h3.q2.E, f1Var, null, j14, j15, j16, z11, z12, b1Var2, j17, j18, i14, i15, j19);
                q2Var.w = z13;
                return q2Var;
            default:
                i3.i iVar = j4.i1.n;
                Bundle bundle12 = bundle.getBundle(h3.s2.f);
                bundle12.getClass();
                j4.i1 i1Var = (j4.i1) iVar.c(bundle12);
                int[] intArray = bundle.getIntArray(h3.s2.h);
                int i16 = i1Var.a;
                int[] iArr = new int[i16];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(h3.s2.n);
                boolean[] zArr = new boolean[i16];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new h3.s2(i1Var, bundle.getBoolean(h3.s2.r, false), intArray, booleanArray);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 6:
                gh.k5.d2(new ag1(6, null));
                break;
            default:
                int i10 = gh.k5.m1;
                break;
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        h3.a2 a2Var = (h3.a2) obj;
        switch (this.a) {
            case 9:
                a2Var.onPlayerError(new h3.n(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            case 10:
                a2Var.onSeekProcessed();
                break;
            default:
                a2Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i9 = f6.g0;
        return 0;
    }

    public /* synthetic */ y5(gh.k5 k5Var) {
        this.a = 6;
    }
}
