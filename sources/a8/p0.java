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
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public static int C(int i7, int i10, int i11) {
        return com.google.android.gms.internal.vision.r0.T(i7) + i10 + i11;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int E(int i7, int i10, int i11) {
        return (com.google.android.gms.internal.vision.r0.y(i7) * i10) + i11;
    }

    public static c4.b a(c4.m mVar, byte[] bArr, int i7) {
        h9.f0 p10 = h9.i0.p();
        mVar.z(bArr, 0, i7, c4.l.c, new a1.c(p10, 22));
        return new c4.b(p10.f());
    }

    public static final void b(int i7, View view, ViewGroup container) {
        kotlin.jvm.internal.j.e(view, "view");
        kotlin.jvm.internal.j.e(container, "container");
        if (androidx.fragment.app.i0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c10 = p1.g.c(i7);
        if (c10 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (androidx.fragment.app.i0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (c10 == 1) {
            if (androidx.fragment.app.i0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.i0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (c10 == 2) {
            if (androidx.fragment.app.i0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (c10 != 3) {
            return;
        }
        if (androidx.fragment.app.i0.K(2)) {
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
            case qs.T /* 30 */:
                return 31;
            case qs.U /* 31 */:
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
            case qs.o0 /* 51 */:
                return 52;
            case qs.p0 /* 52 */:
                return 53;
            case qs.q0 /* 53 */:
                return 54;
            case qs.r0 /* 54 */:
                return 55;
            case qs.s0 /* 55 */:
                return 56;
            case qs.t0 /* 56 */:
                return 57;
            case qs.u0 /* 57 */:
                return 58;
            case qs.v0 /* 58 */:
                return 59;
            case qs.w0 /* 59 */:
                return 60;
            case qs.x0 /* 60 */:
                return 61;
            case qs.y0 /* 61 */:
                return 62;
            case qs.z0 /* 62 */:
                return 63;
            case qs.A0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case qs.D0 /* 66 */:
                return 67;
            case qs.E0 /* 67 */:
                return 68;
            case qs.F0 /* 68 */:
                return 69;
            case qs.G0 /* 69 */:
                return 70;
            case qs.H0 /* 70 */:
                return 71;
            case qs.I0 /* 71 */:
                return 72;
            case qs.J0 /* 72 */:
                return 73;
            case qs.K0 /* 73 */:
                return 74;
            case qs.L0 /* 74 */:
                return 75;
            case qs.M0 /* 75 */:
                return 76;
            case qs.N0 /* 76 */:
                return 77;
            case qs.O0 /* 77 */:
                return 78;
            case qs.P0 /* 78 */:
                return 79;
            case qs.Q0 /* 79 */:
                return 80;
            default:
                switch (i7) {
                    case 96:
                        return 87;
                    case qs.i1 /* 97 */:
                        return 88;
                    case qs.j1 /* 98 */:
                        return 89;
                    case qs.k1 /* 99 */:
                        return 90;
                    case qs.l1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case qs.n1 /* 102 */:
                        return 83;
                    case qs.o1 /* 103 */:
                        return 86;
                    case qs.p1 /* 104 */:
                        return 93;
                    case qs.q1 /* 105 */:
                        return 94;
                    case qs.r1 /* 106 */:
                        return 95;
                    case qs.s1 /* 107 */:
                        return 96;
                    case qs.t1 /* 108 */:
                        return 97;
                    case qs.u1 /* 109 */:
                        return 98;
                    case qs.v1 /* 110 */:
                        return 99;
                    case qs.w1 /* 111 */:
                        return 100;
                    case qs.x1 /* 112 */:
                        return 101;
                    case qs.y1 /* 113 */:
                        return qs.n1;
                    case qs.z1 /* 114 */:
                        return qs.o1;
                    case qs.A1 /* 115 */:
                        return qs.p1;
                    case qs.B1 /* 116 */:
                        return qs.q1;
                    case qs.C1 /* 117 */:
                        return qs.r1;
                    case qs.D1 /* 118 */:
                        return qs.s1;
                    case qs.E1 /* 119 */:
                        return qs.t1;
                    case 120:
                        return qs.u1;
                    case qs.F1 /* 121 */:
                        return qs.v1;
                    case qs.G1 /* 122 */:
                        return qs.w1;
                    case qs.H1 /* 123 */:
                        return qs.x1;
                    case qs.I1 /* 124 */:
                        return qs.y1;
                    case qs.J1 /* 125 */:
                        return qs.z1;
                    case qs.K1 /* 126 */:
                        return qs.C1;
                    case qs.L1 /* 127 */:
                        return qs.E1;
                    case 128:
                        return 120;
                    case qs.N1 /* 129 */:
                        return qs.F1;
                    case qs.O1 /* 130 */:
                        return qs.G1;
                    case qs.P1 /* 131 */:
                        return qs.H1;
                    case qs.Q1 /* 132 */:
                        return qs.I1;
                    case 133:
                        return qs.J1;
                    case 134:
                        return qs.K1;
                    case qs.R1 /* 135 */:
                        return qs.L1;
                    case qs.S1 /* 136 */:
                        return 128;
                    case qs.T1 /* 137 */:
                        return qs.N1;
                    case qs.U1 /* 138 */:
                        return qs.O1;
                    case qs.V1 /* 139 */:
                        return qs.P1;
                    case qs.W1 /* 140 */:
                        return qs.Q1;
                    case qs.X1 /* 141 */:
                        return 133;
                    case qs.Y1 /* 142 */:
                        return 134;
                    case qs.Z1 /* 143 */:
                        return qs.R1;
                    case qs.a2 /* 144 */:
                        return qs.S1;
                    case qs.b2 /* 145 */:
                        return qs.A1;
                    case qs.c2 /* 146 */:
                        return qs.B1;
                    case qs.d2 /* 147 */:
                        return qs.D1;
                    case qs.e2 /* 148 */:
                        return qs.T1;
                    case qs.f2 /* 149 */:
                        return qs.U1;
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
            case qs.T /* 30 */:
                return 29;
            case qs.U /* 31 */:
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
            case qs.o0 /* 51 */:
                return 50;
            case qs.p0 /* 52 */:
                return 51;
            case qs.q0 /* 53 */:
                return 52;
            case qs.r0 /* 54 */:
                return 53;
            case qs.s0 /* 55 */:
                return 54;
            case qs.t0 /* 56 */:
                return 55;
            case qs.u0 /* 57 */:
                return 56;
            case qs.v0 /* 58 */:
                return 57;
            case qs.w0 /* 59 */:
                return 58;
            case qs.x0 /* 60 */:
                return 59;
            case qs.y0 /* 61 */:
                return 60;
            case qs.z0 /* 62 */:
                return 61;
            case qs.A0 /* 63 */:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case qs.D0 /* 66 */:
                return 65;
            case qs.E0 /* 67 */:
                return 66;
            case qs.F0 /* 68 */:
                return 67;
            case qs.G0 /* 69 */:
                return 68;
            case qs.H0 /* 70 */:
                return 69;
            case qs.I0 /* 71 */:
                return 70;
            case qs.J0 /* 72 */:
                return 71;
            case qs.K0 /* 73 */:
                return 72;
            case qs.L0 /* 74 */:
                return 73;
            case qs.M0 /* 75 */:
                return 74;
            case qs.N0 /* 76 */:
                return 75;
            case qs.O0 /* 77 */:
                return 76;
            case qs.P0 /* 78 */:
                return 77;
            case qs.Q0 /* 79 */:
                return 78;
            case 80:
                return 79;
            case qs.S0 /* 81 */:
                return 90;
            case qs.T0 /* 82 */:
                return 91;
            case qs.U0 /* 83 */:
                return qs.n1;
            case qs.V0 /* 84 */:
                return 93;
            case qs.W0 /* 85 */:
                return 94;
            case qs.X0 /* 86 */:
                return qs.o1;
            case qs.Y0 /* 87 */:
                return 96;
            case qs.Z0 /* 88 */:
                return 97;
            case qs.a1 /* 89 */:
                return 98;
            case qs.b1 /* 90 */:
                return 99;
            case qs.c1 /* 91 */:
                return 100;
            case qs.d1 /* 92 */:
                return 101;
            case qs.e1 /* 93 */:
                return qs.p1;
            case qs.f1 /* 94 */:
                return qs.q1;
            case qs.g1 /* 95 */:
                return qs.r1;
            case 96:
                return qs.s1;
            case qs.i1 /* 97 */:
                return qs.t1;
            case qs.j1 /* 98 */:
                return qs.u1;
            case qs.k1 /* 99 */:
                return qs.v1;
            case qs.l1 /* 100 */:
                return qs.w1;
            case 101:
                return qs.x1;
            case qs.n1 /* 102 */:
                return qs.y1;
            case qs.o1 /* 103 */:
                return qs.z1;
            case qs.p1 /* 104 */:
                return qs.A1;
            case qs.q1 /* 105 */:
                return qs.B1;
            case qs.r1 /* 106 */:
                return qs.C1;
            case qs.s1 /* 107 */:
                return qs.D1;
            case qs.t1 /* 108 */:
                return qs.E1;
            case qs.u1 /* 109 */:
                return 120;
            case qs.v1 /* 110 */:
                return qs.F1;
            case qs.w1 /* 111 */:
                return qs.G1;
            case qs.x1 /* 112 */:
                return qs.H1;
            case qs.y1 /* 113 */:
                return qs.I1;
            case qs.z1 /* 114 */:
                return qs.J1;
            case qs.A1 /* 115 */:
                return qs.b2;
            case qs.B1 /* 116 */:
                return qs.c2;
            case qs.C1 /* 117 */:
                return qs.K1;
            case qs.D1 /* 118 */:
                return qs.d2;
            case qs.E1 /* 119 */:
                return qs.L1;
            case 120:
                return 128;
            case qs.F1 /* 121 */:
                return qs.N1;
            case qs.G1 /* 122 */:
                return qs.O1;
            case qs.H1 /* 123 */:
                return qs.P1;
            case qs.I1 /* 124 */:
                return qs.Q1;
            case qs.J1 /* 125 */:
                return 133;
            case qs.K1 /* 126 */:
                return 134;
            case qs.L1 /* 127 */:
                return qs.R1;
            case 128:
                return qs.S1;
            case qs.N1 /* 129 */:
                return qs.T1;
            case qs.O1 /* 130 */:
                return qs.U1;
            case qs.P1 /* 131 */:
                return qs.V1;
            case qs.Q1 /* 132 */:
                return qs.W1;
            case 133:
                return qs.X1;
            case 134:
                return qs.Y1;
            case qs.R1 /* 135 */:
                return qs.Z1;
            case qs.S1 /* 136 */:
                return qs.a2;
            case qs.T1 /* 137 */:
                return qs.e2;
            case qs.U1 /* 138 */:
                return qs.f2;
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

    public static int h(int i7, int i10, int i11, int i12) {
        return com.google.android.gms.internal.vision.r0.T(i7) + i10 + i11 + i12;
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

    public static Bundle k(String str, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z9);
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

    public static na.c y(int i7, m4.d0 d0Var) {
        c8.s sVar = new c8.s(i7);
        if (((HashMap) d0Var.b) == null) {
            d0Var.b = new HashMap();
        }
        ((HashMap) d0Var.b).put(c8.w.class, sVar);
        return new na.c((String) d0Var.a, ((HashMap) d0Var.b) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) d0Var.b)));
    }

    public static void z(int i7, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i7);
    }
}
