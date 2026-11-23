package a8;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class p0 {
    public static /* synthetic */ void A(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static boolean B(String str) {
        return new File(str).exists();
    }

    public static float C(float f10, float f11, float f12, float f13) {
        return Math.max(f13, Math.min(f12, f10 / f11));
    }

    public static int D(int i7, int i10, int i11) {
        return com.google.android.gms.internal.vision.r0.T(i7) + i10 + i11;
    }

    public static String E(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static c4.b a(c4.m mVar, byte[] bArr, int i7) {
        h9.f0 p10 = h9.i0.p();
        mVar.v(bArr, 0, i7, c4.l.c, new a1.c(p10, 18));
        return new c4.b(p10.f());
    }

    public static final void b(int i7, View view, ViewGroup container) {
        kotlin.jvm.internal.j.e(view, "view");
        kotlin.jvm.internal.j.e(container, "container");
        if (androidx.fragment.app.j0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c10 = p1.g.c(i7);
        if (c10 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (androidx.fragment.app.j0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (c10 == 1) {
            if (androidx.fragment.app.j0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.j0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (c10 == 2) {
            if (androidx.fragment.app.j0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (c10 != 3) {
            return;
        }
        if (androidx.fragment.app.j0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int c(int i7) {
        if (i7 == 90) {
            return 81;
        }
        if (i7 == 91) {
            return 82;
        }
        if (i7 == 93) {
            return 84;
        }
        if (i7 == 94) {
            return 85;
        }
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case ls.T /* 30 */:
                return 31;
            case ls.U /* 31 */:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case ls.o0 /* 51 */:
                return 52;
            case ls.p0 /* 52 */:
                return 53;
            case ls.q0 /* 53 */:
                return 54;
            case ls.r0 /* 54 */:
                return 55;
            case ls.s0 /* 55 */:
                return 56;
            case ls.t0 /* 56 */:
                return 57;
            case ls.u0 /* 57 */:
                return 58;
            case ls.v0 /* 58 */:
                return 59;
            case ls.w0 /* 59 */:
                return 60;
            case ls.x0 /* 60 */:
                return 61;
            case ls.y0 /* 61 */:
                return 62;
            case ls.z0 /* 62 */:
                return 63;
            case ls.A0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case ls.D0 /* 66 */:
                return 67;
            case ls.E0 /* 67 */:
                return 68;
            case ls.F0 /* 68 */:
                return 69;
            case ls.G0 /* 69 */:
                return 70;
            case ls.H0 /* 70 */:
                return 71;
            case ls.I0 /* 71 */:
                return 72;
            case ls.J0 /* 72 */:
                return 73;
            case ls.K0 /* 73 */:
                return 74;
            case ls.L0 /* 74 */:
                return 75;
            case ls.M0 /* 75 */:
                return 76;
            case ls.N0 /* 76 */:
                return 77;
            case ls.O0 /* 77 */:
                return 78;
            case ls.P0 /* 78 */:
                return 79;
            case ls.Q0 /* 79 */:
                return 80;
            default:
                switch (i7) {
                    case 96:
                        return 87;
                    case ls.i1 /* 97 */:
                        return 88;
                    case ls.j1 /* 98 */:
                        return 89;
                    case ls.k1 /* 99 */:
                        return 90;
                    case ls.l1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case ls.n1 /* 102 */:
                        return 83;
                    case ls.o1 /* 103 */:
                        return 86;
                    case ls.p1 /* 104 */:
                        return 93;
                    case ls.q1 /* 105 */:
                        return 94;
                    case ls.r1 /* 106 */:
                        return 95;
                    case ls.s1 /* 107 */:
                        return 96;
                    case ls.t1 /* 108 */:
                        return 97;
                    case ls.u1 /* 109 */:
                        return 98;
                    case ls.v1 /* 110 */:
                        return 99;
                    case ls.w1 /* 111 */:
                        return 100;
                    case ls.x1 /* 112 */:
                        return 101;
                    case ls.y1 /* 113 */:
                        return ls.n1;
                    case ls.z1 /* 114 */:
                        return ls.o1;
                    case ls.A1 /* 115 */:
                        return ls.p1;
                    case ls.B1 /* 116 */:
                        return ls.q1;
                    case ls.C1 /* 117 */:
                        return ls.r1;
                    case ls.D1 /* 118 */:
                        return ls.s1;
                    case ls.E1 /* 119 */:
                        return ls.t1;
                    case 120:
                        return ls.u1;
                    case ls.F1 /* 121 */:
                        return ls.v1;
                    case ls.G1 /* 122 */:
                        return ls.w1;
                    case ls.H1 /* 123 */:
                        return ls.x1;
                    case ls.I1 /* 124 */:
                        return ls.y1;
                    case ls.J1 /* 125 */:
                        return ls.z1;
                    case ls.K1 /* 126 */:
                        return ls.C1;
                    case ls.L1 /* 127 */:
                        return ls.E1;
                    case 128:
                        return 120;
                    case ls.N1 /* 129 */:
                        return ls.F1;
                    case ls.O1 /* 130 */:
                        return ls.G1;
                    case ls.P1 /* 131 */:
                        return ls.H1;
                    case ls.Q1 /* 132 */:
                        return ls.I1;
                    case 133:
                        return ls.J1;
                    case 134:
                        return ls.K1;
                    case ls.R1 /* 135 */:
                        return ls.L1;
                    case ls.S1 /* 136 */:
                        return 128;
                    case ls.T1 /* 137 */:
                        return ls.N1;
                    case ls.U1 /* 138 */:
                        return ls.O1;
                    case ls.V1 /* 139 */:
                        return ls.P1;
                    case ls.W1 /* 140 */:
                        return ls.Q1;
                    case ls.X1 /* 141 */:
                        return 133;
                    case ls.Y1 /* 142 */:
                        return 134;
                    case ls.Z1 /* 143 */:
                        return ls.R1;
                    case ls.a2 /* 144 */:
                        return ls.S1;
                    case ls.b2 /* 145 */:
                        return ls.A1;
                    case ls.c2 /* 146 */:
                        return ls.B1;
                    case ls.d2 /* 147 */:
                        return ls.D1;
                    case ls.e2 /* 148 */:
                        return ls.T1;
                    case ls.f2 /* 149 */:
                        return ls.U1;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int d(int i7) {
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    if (i7 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int e(int i7) {
        switch (i7) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case ls.T /* 30 */:
                return 29;
            case ls.U /* 31 */:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case ls.o0 /* 51 */:
                return 50;
            case ls.p0 /* 52 */:
                return 51;
            case ls.q0 /* 53 */:
                return 52;
            case ls.r0 /* 54 */:
                return 53;
            case ls.s0 /* 55 */:
                return 54;
            case ls.t0 /* 56 */:
                return 55;
            case ls.u0 /* 57 */:
                return 56;
            case ls.v0 /* 58 */:
                return 57;
            case ls.w0 /* 59 */:
                return 58;
            case ls.x0 /* 60 */:
                return 59;
            case ls.y0 /* 61 */:
                return 60;
            case ls.z0 /* 62 */:
                return 61;
            case ls.A0 /* 63 */:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case ls.D0 /* 66 */:
                return 65;
            case ls.E0 /* 67 */:
                return 66;
            case ls.F0 /* 68 */:
                return 67;
            case ls.G0 /* 69 */:
                return 68;
            case ls.H0 /* 70 */:
                return 69;
            case ls.I0 /* 71 */:
                return 70;
            case ls.J0 /* 72 */:
                return 71;
            case ls.K0 /* 73 */:
                return 72;
            case ls.L0 /* 74 */:
                return 73;
            case ls.M0 /* 75 */:
                return 74;
            case ls.N0 /* 76 */:
                return 75;
            case ls.O0 /* 77 */:
                return 76;
            case ls.P0 /* 78 */:
                return 77;
            case ls.Q0 /* 79 */:
                return 78;
            case 80:
                return 79;
            case ls.S0 /* 81 */:
                return 90;
            case ls.T0 /* 82 */:
                return 91;
            case ls.U0 /* 83 */:
                return ls.n1;
            case ls.V0 /* 84 */:
                return 93;
            case ls.W0 /* 85 */:
                return 94;
            case ls.X0 /* 86 */:
                return ls.o1;
            case ls.Y0 /* 87 */:
                return 96;
            case ls.Z0 /* 88 */:
                return 97;
            case ls.a1 /* 89 */:
                return 98;
            case ls.b1 /* 90 */:
                return 99;
            case ls.c1 /* 91 */:
                return 100;
            case ls.d1 /* 92 */:
                return 101;
            case ls.e1 /* 93 */:
                return ls.p1;
            case ls.f1 /* 94 */:
                return ls.q1;
            case ls.g1 /* 95 */:
                return ls.r1;
            case 96:
                return ls.s1;
            case ls.i1 /* 97 */:
                return ls.t1;
            case ls.j1 /* 98 */:
                return ls.u1;
            case ls.k1 /* 99 */:
                return ls.v1;
            case ls.l1 /* 100 */:
                return ls.w1;
            case 101:
                return ls.x1;
            case ls.n1 /* 102 */:
                return ls.y1;
            case ls.o1 /* 103 */:
                return ls.z1;
            case ls.p1 /* 104 */:
                return ls.A1;
            case ls.q1 /* 105 */:
                return ls.B1;
            case ls.r1 /* 106 */:
                return ls.C1;
            case ls.s1 /* 107 */:
                return ls.D1;
            case ls.t1 /* 108 */:
                return ls.E1;
            case ls.u1 /* 109 */:
                return 120;
            case ls.v1 /* 110 */:
                return ls.F1;
            case ls.w1 /* 111 */:
                return ls.G1;
            case ls.x1 /* 112 */:
                return ls.H1;
            case ls.y1 /* 113 */:
                return ls.I1;
            case ls.z1 /* 114 */:
                return ls.J1;
            case ls.A1 /* 115 */:
                return ls.b2;
            case ls.B1 /* 116 */:
                return ls.c2;
            case ls.C1 /* 117 */:
                return ls.K1;
            case ls.D1 /* 118 */:
                return ls.d2;
            case ls.E1 /* 119 */:
                return ls.L1;
            case 120:
                return 128;
            case ls.F1 /* 121 */:
                return ls.N1;
            case ls.G1 /* 122 */:
                return ls.O1;
            case ls.H1 /* 123 */:
                return ls.P1;
            case ls.I1 /* 124 */:
                return ls.Q1;
            case ls.J1 /* 125 */:
                return 133;
            case ls.K1 /* 126 */:
                return 134;
            case ls.L1 /* 127 */:
                return ls.R1;
            case 128:
                return ls.S1;
            case ls.N1 /* 129 */:
                return ls.T1;
            case ls.O1 /* 130 */:
                return ls.U1;
            case ls.P1 /* 131 */:
                return ls.V1;
            case ls.Q1 /* 132 */:
                return ls.W1;
            case 133:
                return ls.X1;
            case 134:
                return ls.Y1;
            case ls.R1 /* 135 */:
                return ls.Z1;
            case ls.S1 /* 136 */:
                return ls.a2;
            case ls.T1 /* 137 */:
                return ls.e2;
            case ls.U1 /* 138 */:
                return ls.f2;
            default:
                throw null;
        }
    }

    public static float f(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) / f12) + f13;
    }

    public static int g(int i7, int i10, int i11) {
        return com.google.android.gms.internal.cast.v4.o(i7) + i10 + i11;
    }

    public static int h(Float f10, float f11) {
        return org.telegram.messenger.g0.L(f10.floatValue() * f11);
    }

    public static j0 i(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new j0(i7);
    }

    public static Bundle j(long j3, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j3);
        return bundle;
    }

    public static Bundle k(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        return bundle;
    }

    public static c8.s l(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new c8.s(i7);
    }

    public static String m(int i7, int i10, String str, String str2) {
        return str + i7 + str2 + i10;
    }

    public static String n(int i7, String str, StringBuilder sb2) {
        sb2.append(i7);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(long j3, String str) {
        return str + j3;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String r(StringBuilder sb2, long j3, String str) {
        sb2.append(j3);
        sb2.append(str);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder t(long j3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j3);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static UnsupportedOperationException v(Parcel parcel) {
        i8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap w(Class cls, j0 j0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, j0Var);
        return hashMap;
    }

    public static HashMap x(Class cls, c8.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static na.c y(int i7, ji.l lVar) {
        c8.s sVar = new c8.s(i7);
        if (((HashMap) lVar.c) == null) {
            lVar.c = new HashMap();
        }
        ((HashMap) lVar.c).put(c8.w.class, sVar);
        return new na.c((String) lVar.b, ((HashMap) lVar.c) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) lVar.c)));
    }

    public static void z(int i7, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i7);
    }
}
