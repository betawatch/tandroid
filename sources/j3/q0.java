package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import mh.c3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements f, j4.g, c9.e, h5.j {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i10) {
        this.a = i10;
    }

    @Override // j4.g
    public boolean a(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // j3.f
    public g c(Bundle bundle) {
        s8.x a2;
        s8.i0 s6;
        s8.i0 s9;
        Bundle bundle2;
        Bundle bundle3;
        int i10 = 5;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) bundle.getParcelable(r0.b);
                uri.getClass();
                ja.c cVar = new ja.c();
                cVar.a = uri;
                return new r0(cVar);
            case 1:
                s0 s0Var = new s0();
                String str = t0.h;
                u0 u0Var = t0.f;
                long j10 = bundle.getLong(str, u0Var.a);
                h5.a.f(j10 >= 0);
                s0Var.a = j10;
                long j11 = bundle.getLong(t0.n, u0Var.b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    r13 = false;
                }
                h5.a.f(r13);
                s0Var.b = j11;
                s0Var.c = bundle.getBoolean(t0.r, u0Var.c);
                s0Var.d = bundle.getBoolean(t0.s, u0Var.d);
                s0Var.e = bundle.getBoolean(t0.v, u0Var.e);
                return new u0(s0Var);
            case 2:
                String string = bundle.getString(w0.r);
                string.getClass();
                UUID fromString = UUID.fromString(string);
                Uri uri2 = (Uri) bundle.getParcelable(w0.s);
                String str2 = w0.v;
                Bundle bundle4 = Bundle.EMPTY;
                Bundle bundle5 = bundle.getBundle(str2);
                if (bundle5 == null) {
                    bundle5 = bundle4;
                }
                s8.n0 n0Var = s8.n0.h;
                if (bundle5 == bundle4) {
                    a2 = n0Var;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle5 != bundle4) {
                        for (String str3 : bundle5.keySet()) {
                            String string2 = bundle5.getString(str3);
                            if (string2 != null) {
                                hashMap.put(str3, string2);
                            }
                        }
                    }
                    a2 = s8.x.a(hashMap);
                }
                boolean z10 = bundle.getBoolean(w0.w, false);
                boolean z11 = bundle.getBoolean(w0.x, false);
                boolean z12 = bundle.getBoolean(w0.y, false);
                String str4 = w0.B;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                s8.v t6 = s8.v.t(arrayList);
                byte[] byteArray = bundle.getByteArray(w0.C);
                v0 v0Var = new v0();
                v0Var.a = fromString;
                v0Var.c = n0Var;
                v0Var.g = s8.i0.e;
                v0Var.b = uri2;
                v0Var.c = s8.x.a(a2);
                v0Var.d = z10;
                v0Var.f = z12;
                v0Var.e = z11;
                v0Var.g = s8.v.t(t6);
                v0Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                return new w0(v0Var);
            case 3:
                return new x0(bundle.getLong(x0.h, -9223372036854775807L), bundle.getLong(x0.n, -9223372036854775807L), bundle.getLong(x0.r, -9223372036854775807L), bundle.getFloat(x0.s, -3.4028235E38f), bundle.getFloat(x0.v, -3.4028235E38f));
            case 4:
                Bundle bundle6 = bundle.getBundle(y0.v);
                w0 w0Var = bundle6 == null ? null : (w0) w0.D.c(bundle6);
                Bundle bundle7 = bundle.getBundle(y0.w);
                r0 r0Var = bundle7 != null ? (r0) r0.c.c(bundle7) : null;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y0.x);
                if (parcelableArrayList == null) {
                    s8.t tVar = s8.v.b;
                    s6 = s8.i0.e;
                } else {
                    s6 = h5.a.s(new q0(i10), parcelableArrayList);
                }
                s8.i0 i0Var = s6;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(y0.B);
                if (parcelableArrayList2 == null) {
                    s8.t tVar2 = s8.v.b;
                    s9 = s8.i0.e;
                } else {
                    s9 = h5.a.s(b1.B, parcelableArrayList2);
                }
                s8.i0 i0Var2 = s9;
                Uri uri3 = (Uri) bundle.getParcelable(y0.r);
                uri3.getClass();
                return new y0(uri3, bundle.getString(y0.s), w0Var, r0Var, i0Var, bundle.getString(y0.y), i0Var2, null);
            case 5:
                return new n4.b(bundle.getInt(n4.b.d, 0), bundle.getInt(n4.b.e, 0), bundle.getInt(n4.b.f, 0));
            case 6:
                androidx.biometric.e eVar = new androidx.biometric.e(19, z4);
                eVar.b = (Uri) bundle.getParcelable(z0.d);
                eVar.c = bundle.getString(z0.e);
                eVar.d = bundle.getBundle(z0.f);
                return new z0(eVar);
            case 7:
                Uri uri4 = (Uri) bundle.getParcelable(b1.n);
                uri4.getClass();
                String string3 = bundle.getString(b1.r);
                String string4 = bundle.getString(b1.s);
                int i11 = bundle.getInt(b1.v, 0);
                int i12 = bundle.getInt(b1.w, 0);
                String string5 = bundle.getString(b1.x);
                String string6 = bundle.getString(b1.y);
                c9.a aVar = new c9.a();
                aVar.d = uri4;
                aVar.a = string3;
                aVar.e = string4;
                aVar.b = i11;
                aVar.c = i12;
                aVar.f = string5;
                aVar.g = string6;
                return new b1(aVar);
            case 8:
                d1 d1Var = new d1();
                d1Var.a = bundle.getCharSequence(e1.W);
                d1Var.b = bundle.getCharSequence(e1.X);
                d1Var.c = bundle.getCharSequence(e1.Y);
                d1Var.d = bundle.getCharSequence(e1.Z);
                d1Var.e = bundle.getCharSequence(e1.a0);
                d1Var.f = bundle.getCharSequence(e1.b0);
                d1Var.g = bundle.getCharSequence(e1.c0);
                byte[] byteArray2 = bundle.getByteArray(e1.f0);
                String str5 = e1.y0;
                Integer valueOf = bundle.containsKey(str5) ? Integer.valueOf(bundle.getInt(str5)) : null;
                d1Var.j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                d1Var.k = valueOf;
                d1Var.l = (Uri) bundle.getParcelable(e1.g0);
                d1Var.x = bundle.getCharSequence(e1.r0);
                d1Var.y = bundle.getCharSequence(e1.s0);
                d1Var.z = bundle.getCharSequence(e1.t0);
                d1Var.C = bundle.getCharSequence(e1.w0);
                d1Var.D = bundle.getCharSequence(e1.x0);
                d1Var.E = bundle.getCharSequence(e1.z0);
                d1Var.G = bundle.getBundle(e1.C0);
                String str6 = e1.d0;
                if (bundle.containsKey(str6) && (bundle3 = bundle.getBundle(str6)) != null) {
                    d1Var.h = (f2) f2.b.c(bundle3);
                }
                String str7 = e1.e0;
                if (bundle.containsKey(str7) && (bundle2 = bundle.getBundle(str7)) != null) {
                    d1Var.i = (f2) f2.b.c(bundle2);
                }
                String str8 = e1.h0;
                if (bundle.containsKey(str8)) {
                    d1Var.m = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = e1.i0;
                if (bundle.containsKey(str9)) {
                    d1Var.n = Integer.valueOf(bundle.getInt(str9));
                }
                String str10 = e1.j0;
                if (bundle.containsKey(str10)) {
                    d1Var.o = Integer.valueOf(bundle.getInt(str10));
                }
                String str11 = e1.B0;
                if (bundle.containsKey(str11)) {
                    d1Var.p = Boolean.valueOf(bundle.getBoolean(str11));
                }
                String str12 = e1.k0;
                if (bundle.containsKey(str12)) {
                    d1Var.q = Boolean.valueOf(bundle.getBoolean(str12));
                }
                String str13 = e1.l0;
                if (bundle.containsKey(str13)) {
                    d1Var.r = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = e1.m0;
                if (bundle.containsKey(str14)) {
                    d1Var.s = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = e1.n0;
                if (bundle.containsKey(str15)) {
                    d1Var.t = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = e1.o0;
                if (bundle.containsKey(str16)) {
                    d1Var.u = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = e1.p0;
                if (bundle.containsKey(str17)) {
                    d1Var.v = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = e1.q0;
                if (bundle.containsKey(str18)) {
                    d1Var.w = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = e1.u0;
                if (bundle.containsKey(str19)) {
                    d1Var.A = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = e1.v0;
                if (bundle.containsKey(str20)) {
                    d1Var.B = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = e1.A0;
                if (bundle.containsKey(str21)) {
                    d1Var.F = Integer.valueOf(bundle.getInt(str21));
                }
                return new e1(d1Var);
            case 9:
                h5.a.f(bundle.getInt(f2.a, -1) == 1);
                float f10 = bundle.getFloat(s1.d, -1.0f);
                return f10 == -1.0f ? new s1() : new s1(f10);
            case 10:
                int i13 = bundle.getInt(f2.a, -1);
                if (i13 == 0) {
                    return (f2) o0.h.c(bundle);
                }
                if (i13 == 1) {
                    return (f2) s1.e.c(bundle);
                }
                if (i13 == 2) {
                    return (f2) j2.h.c(bundle);
                }
                if (i13 == 3) {
                    return (f2) k2.h.c(bundle);
                }
                throw new IllegalArgumentException(l.d.j(i13, "Unknown RatingType: "));
            case 11:
                h5.a.f(bundle.getInt(f2.a, -1) == 2);
                int i14 = bundle.getInt(j2.e, 5);
                float f11 = bundle.getFloat(j2.f, -1.0f);
                return f11 == -1.0f ? new j2(i14) : new j2(i14, f11);
            case 12:
                h5.a.f(bundle.getInt(f2.a, -1) == 3);
                return bundle.getBoolean(k2.e, false) ? new k2(bundle.getBoolean(k2.f, false)) : new k2();
            case 13:
                int i15 = bundle.getInt(m2.n, 0);
                long j12 = bundle.getLong(m2.r, -9223372036854775807L);
                long j13 = bundle.getLong(m2.s, 0L);
                boolean z13 = bundle.getBoolean(m2.v, false);
                Bundle bundle8 = bundle.getBundle(m2.w);
                p4.b bVar = bundle8 != null ? (p4.b) p4.b.w.c(bundle8) : p4.b.f;
                m2 m2Var = new m2();
                m2Var.i(null, null, i15, j12, j13, bVar, z13);
                return m2Var;
            case 14:
                Bundle bundle9 = bundle.getBundle(n2.H);
                c1 c1Var = bundle9 != null ? (c1) c1.y.c(bundle9) : c1.h;
                long j14 = bundle.getLong(n2.I, -9223372036854775807L);
                long j15 = bundle.getLong(n2.J, -9223372036854775807L);
                long j16 = bundle.getLong(n2.K, -9223372036854775807L);
                boolean z14 = bundle.getBoolean(n2.L, false);
                boolean z15 = bundle.getBoolean(n2.M, false);
                Bundle bundle10 = bundle.getBundle(n2.N);
                x0 x0Var = bundle10 != null ? (x0) x0.w.c(bundle10) : null;
                boolean z16 = bundle.getBoolean(n2.O, false);
                long j17 = bundle.getLong(n2.P, 0L);
                long j18 = bundle.getLong(n2.Q, -9223372036854775807L);
                int i16 = bundle.getInt(n2.R, 0);
                int i17 = bundle.getInt(n2.S, 0);
                long j19 = bundle.getLong(n2.T, 0L);
                n2 n2Var = new n2();
                n2Var.b(n2.F, c1Var, null, j14, j15, j16, z14, z15, x0Var, j17, j18, i16, i17, j19);
                n2Var.w = z16;
                return n2Var;
            default:
                c3 c3Var = o4.s0.n;
                Bundle bundle11 = bundle.getBundle(p2.f);
                bundle11.getClass();
                o4.s0 s0Var2 = (o4.s0) c3Var.c(bundle11);
                int[] intArray = bundle.getIntArray(p2.h);
                int i18 = s0Var2.a;
                int[] iArr = new int[i18];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(p2.n);
                boolean[] zArr = new boolean[i18];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new p2(s0Var2, bundle.getBoolean(p2.r, false), intArray, booleanArray);
        }
    }

    @Override // c9.e
    public Object e0(c5.j jVar) {
        Set w10 = jVar.w(ja.a.class);
        ja.c cVar = ja.c.b;
        if (cVar == null) {
            synchronized (ja.c.class) {
                try {
                    cVar = ja.c.b;
                    if (cVar == null) {
                        cVar = new ja.c(0);
                        ja.c.b = cVar;
                    }
                } finally {
                }
            }
        }
        return new ja.b(w10, cVar);
    }

    @Override // h5.j
    public void invoke(Object obj) {
        k3.b bVar = (k3.b) obj;
        switch (this.a) {
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            case 24:
                bVar.getClass();
                break;
            case 25:
                bVar.getClass();
                break;
            case 26:
                bVar.getClass();
                break;
            case 27:
                bVar.getClass();
                break;
            case 28:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ q0(k3.a aVar, int i10, int i11) {
        this.a = 27;
    }

    public /* synthetic */ q0(k3.a aVar, g gVar, int i10) {
        this.a = i10;
    }

    public /* synthetic */ q0(k3.a aVar, c1 c1Var, int i10) {
        this.a = 28;
    }

    public /* synthetic */ q0(k3.a aVar, Object obj, Object obj2, int i10) {
        this.a = i10;
    }

    public /* synthetic */ q0(k3.a aVar, boolean z4) {
        this.a = 19;
    }

    public /* synthetic */ q0(k3.a aVar, boolean z4, int i10, int i11) {
        this.a = i11;
    }
}
