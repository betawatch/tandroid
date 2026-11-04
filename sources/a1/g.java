package a1;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.j0;
import b4.l;
import b4.m;
import b8.e0;
import b8.z;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.vision.r0;
import g9.f0;
import g9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static float A(float f10, float f11, float f12, float f13) {
        return ((f10 / f11) * f12) + f13;
    }

    public static int B(int i3, int i10, int i11) {
        return r0.T(i3) + i10 + i11;
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static float D(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) * f12);
    }

    public static int E(int i3, int i10, int i11) {
        return (r0.y(i3) * i10) + i11;
    }

    public static b4.b a(m mVar, byte[] bArr, int i3) {
        f0 p10 = i0.p();
        mVar.F(bArr, 0, i3, l.c, new c(p10, 7));
        return new b4.b(p10.f());
    }

    public static final void b(int i3, View view, ViewGroup container) {
        j.e(view, "view");
        j.e(container, "container");
        if (j0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c2 = o1.g.c(i3);
        if (c2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (j0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (c2 == 1) {
            if (j0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (j0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (c2 == 2) {
            if (j0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (c2 != 3) {
            return;
        }
        if (j0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int c(int i3) {
        if (i3 == 90) {
            return 81;
        }
        if (i3 == 91) {
            return 82;
        }
        if (i3 == 93) {
            return 84;
        }
        if (i3 == 94) {
            return 85;
        }
        switch (i3) {
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
            case hs.T /* 30 */:
                return 31;
            case hs.U /* 31 */:
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
            case hs.o0 /* 51 */:
                return 52;
            case hs.p0 /* 52 */:
                return 53;
            case hs.q0 /* 53 */:
                return 54;
            case hs.r0 /* 54 */:
                return 55;
            case hs.s0 /* 55 */:
                return 56;
            case hs.t0 /* 56 */:
                return 57;
            case hs.u0 /* 57 */:
                return 58;
            case hs.v0 /* 58 */:
                return 59;
            case hs.w0 /* 59 */:
                return 60;
            case hs.x0 /* 60 */:
                return 61;
            case hs.y0 /* 61 */:
                return 62;
            case hs.z0 /* 62 */:
                return 63;
            case hs.A0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case hs.D0 /* 66 */:
                return 67;
            case hs.E0 /* 67 */:
                return 68;
            case hs.F0 /* 68 */:
                return 69;
            case hs.G0 /* 69 */:
                return 70;
            case hs.H0 /* 70 */:
                return 71;
            case hs.I0 /* 71 */:
                return 72;
            case hs.J0 /* 72 */:
                return 73;
            case hs.K0 /* 73 */:
                return 74;
            case hs.L0 /* 74 */:
                return 75;
            case hs.M0 /* 75 */:
                return 76;
            case hs.N0 /* 76 */:
                return 77;
            case hs.O0 /* 77 */:
                return 78;
            case hs.P0 /* 78 */:
                return 79;
            case hs.Q0 /* 79 */:
                return 80;
            default:
                switch (i3) {
                    case 96:
                        return 87;
                    case hs.i1 /* 97 */:
                        return 88;
                    case hs.j1 /* 98 */:
                        return 89;
                    case hs.k1 /* 99 */:
                        return 90;
                    case hs.l1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case hs.n1 /* 102 */:
                        return 83;
                    case hs.o1 /* 103 */:
                        return 86;
                    case hs.p1 /* 104 */:
                        return 93;
                    case hs.q1 /* 105 */:
                        return 94;
                    case hs.r1 /* 106 */:
                        return 95;
                    case hs.s1 /* 107 */:
                        return 96;
                    case hs.t1 /* 108 */:
                        return 97;
                    case hs.u1 /* 109 */:
                        return 98;
                    case hs.v1 /* 110 */:
                        return 99;
                    case hs.w1 /* 111 */:
                        return 100;
                    case hs.x1 /* 112 */:
                        return 101;
                    case hs.y1 /* 113 */:
                        return hs.n1;
                    case hs.z1 /* 114 */:
                        return hs.o1;
                    case hs.A1 /* 115 */:
                        return hs.p1;
                    case hs.B1 /* 116 */:
                        return hs.q1;
                    case hs.C1 /* 117 */:
                        return hs.r1;
                    case hs.D1 /* 118 */:
                        return hs.s1;
                    case hs.E1 /* 119 */:
                        return hs.t1;
                    case 120:
                        return hs.u1;
                    case hs.F1 /* 121 */:
                        return hs.v1;
                    case hs.G1 /* 122 */:
                        return hs.w1;
                    case hs.H1 /* 123 */:
                        return hs.x1;
                    case hs.I1 /* 124 */:
                        return hs.y1;
                    case hs.J1 /* 125 */:
                        return hs.z1;
                    case hs.K1 /* 126 */:
                        return hs.C1;
                    case hs.L1 /* 127 */:
                        return hs.E1;
                    case 128:
                        return 120;
                    case hs.N1 /* 129 */:
                        return hs.F1;
                    case hs.O1 /* 130 */:
                        return hs.G1;
                    case hs.P1 /* 131 */:
                        return hs.H1;
                    case hs.Q1 /* 132 */:
                        return hs.I1;
                    case 133:
                        return hs.J1;
                    case 134:
                        return hs.K1;
                    case hs.R1 /* 135 */:
                        return hs.L1;
                    case hs.S1 /* 136 */:
                        return 128;
                    case hs.T1 /* 137 */:
                        return hs.N1;
                    case hs.U1 /* 138 */:
                        return hs.O1;
                    case hs.V1 /* 139 */:
                        return hs.P1;
                    case hs.W1 /* 140 */:
                        return hs.Q1;
                    case hs.X1 /* 141 */:
                        return 133;
                    case hs.Y1 /* 142 */:
                        return 134;
                    case hs.Z1 /* 143 */:
                        return hs.R1;
                    case hs.a2 /* 144 */:
                        return hs.S1;
                    case hs.b2 /* 145 */:
                        return hs.A1;
                    case hs.c2 /* 146 */:
                        return hs.B1;
                    case hs.d2 /* 147 */:
                        return hs.D1;
                    case hs.e2 /* 148 */:
                        return hs.T1;
                    case hs.f2 /* 149 */:
                        return hs.U1;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int d(int i3) {
        switch (i3) {
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
            case hs.T /* 30 */:
                return 29;
            case hs.U /* 31 */:
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
            case hs.o0 /* 51 */:
                return 50;
            case hs.p0 /* 52 */:
                return 51;
            case hs.q0 /* 53 */:
                return 52;
            case hs.r0 /* 54 */:
                return 53;
            case hs.s0 /* 55 */:
                return 54;
            case hs.t0 /* 56 */:
                return 55;
            case hs.u0 /* 57 */:
                return 56;
            case hs.v0 /* 58 */:
                return 57;
            case hs.w0 /* 59 */:
                return 58;
            case hs.x0 /* 60 */:
                return 59;
            case hs.y0 /* 61 */:
                return 60;
            case hs.z0 /* 62 */:
                return 61;
            case hs.A0 /* 63 */:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case hs.D0 /* 66 */:
                return 65;
            case hs.E0 /* 67 */:
                return 66;
            case hs.F0 /* 68 */:
                return 67;
            case hs.G0 /* 69 */:
                return 68;
            case hs.H0 /* 70 */:
                return 69;
            case hs.I0 /* 71 */:
                return 70;
            case hs.J0 /* 72 */:
                return 71;
            case hs.K0 /* 73 */:
                return 72;
            case hs.L0 /* 74 */:
                return 73;
            case hs.M0 /* 75 */:
                return 74;
            case hs.N0 /* 76 */:
                return 75;
            case hs.O0 /* 77 */:
                return 76;
            case hs.P0 /* 78 */:
                return 77;
            case hs.Q0 /* 79 */:
                return 78;
            case 80:
                return 79;
            case hs.S0 /* 81 */:
                return 90;
            case hs.T0 /* 82 */:
                return 91;
            case hs.U0 /* 83 */:
                return hs.n1;
            case hs.V0 /* 84 */:
                return 93;
            case hs.W0 /* 85 */:
                return 94;
            case hs.X0 /* 86 */:
                return hs.o1;
            case hs.Y0 /* 87 */:
                return 96;
            case hs.Z0 /* 88 */:
                return 97;
            case hs.a1 /* 89 */:
                return 98;
            case hs.b1 /* 90 */:
                return 99;
            case hs.c1 /* 91 */:
                return 100;
            case hs.d1 /* 92 */:
                return 101;
            case hs.e1 /* 93 */:
                return hs.p1;
            case hs.f1 /* 94 */:
                return hs.q1;
            case hs.g1 /* 95 */:
                return hs.r1;
            case 96:
                return hs.s1;
            case hs.i1 /* 97 */:
                return hs.t1;
            case hs.j1 /* 98 */:
                return hs.u1;
            case hs.k1 /* 99 */:
                return hs.v1;
            case hs.l1 /* 100 */:
                return hs.w1;
            case 101:
                return hs.x1;
            case hs.n1 /* 102 */:
                return hs.y1;
            case hs.o1 /* 103 */:
                return hs.z1;
            case hs.p1 /* 104 */:
                return hs.A1;
            case hs.q1 /* 105 */:
                return hs.B1;
            case hs.r1 /* 106 */:
                return hs.C1;
            case hs.s1 /* 107 */:
                return hs.D1;
            case hs.t1 /* 108 */:
                return hs.E1;
            case hs.u1 /* 109 */:
                return 120;
            case hs.v1 /* 110 */:
                return hs.F1;
            case hs.w1 /* 111 */:
                return hs.G1;
            case hs.x1 /* 112 */:
                return hs.H1;
            case hs.y1 /* 113 */:
                return hs.I1;
            case hs.z1 /* 114 */:
                return hs.J1;
            case hs.A1 /* 115 */:
                return hs.b2;
            case hs.B1 /* 116 */:
                return hs.c2;
            case hs.C1 /* 117 */:
                return hs.K1;
            case hs.D1 /* 118 */:
                return hs.d2;
            case hs.E1 /* 119 */:
                return hs.L1;
            case 120:
                return 128;
            case hs.F1 /* 121 */:
                return hs.N1;
            case hs.G1 /* 122 */:
                return hs.O1;
            case hs.H1 /* 123 */:
                return hs.P1;
            case hs.I1 /* 124 */:
                return hs.Q1;
            case hs.J1 /* 125 */:
                return 133;
            case hs.K1 /* 126 */:
                return 134;
            case hs.L1 /* 127 */:
                return hs.R1;
            case 128:
                return hs.S1;
            case hs.N1 /* 129 */:
                return hs.T1;
            case hs.O1 /* 130 */:
                return hs.U1;
            case hs.P1 /* 131 */:
                return hs.V1;
            case hs.Q1 /* 132 */:
                return hs.W1;
            case 133:
                return hs.X1;
            case 134:
                return hs.Y1;
            case hs.R1 /* 135 */:
                return hs.Z1;
            case hs.S1 /* 136 */:
                return hs.a2;
            case hs.T1 /* 137 */:
                return hs.e2;
            case hs.U1 /* 138 */:
                return hs.f2;
            default:
                throw null;
        }
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) / f12) + f13;
    }

    public static int f(int i3, int i10, int i11) {
        return w4.o(i3) + i10 + i11;
    }

    public static int g(int i3, int i10, int i11, int i12) {
        return r0.T(i3) + i10 + i11 + i12;
    }

    public static int h(int i3, int i10, long j10, ArrayList arrayList) {
        arrayList.add(Long.valueOf(j10));
        return i3 + i10;
    }

    public static int i(Float f10, float f11) {
        return g0.L(f10.floatValue() * f11);
    }

    public static Bundle j(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static Bundle k(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        return bundle;
    }

    public static z l(HashMap hashMap, int i3) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z(i3);
    }

    public static ClassCastException m(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String n(int i3, int i10, String str, String str2) {
        return str + i3 + str2 + i10;
    }

    public static String o(int i3, String str, StringBuilder sb2) {
        sb2.append(i3);
        sb2.append(str);
        return sb2.toString();
    }

    public static String p(long j10, String str) {
        return str + j10;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder t(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
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
        h8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap w(Class cls, z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zVar);
        return hashMap;
    }

    public static ma.c x(int i3, tf.b bVar) {
        z zVar = new z(i3);
        if (((HashMap) bVar.b) == null) {
            bVar.b = new HashMap();
        }
        ((HashMap) bVar.b).put(e0.class, zVar);
        return new ma.c((String) bVar.a, ((HashMap) bVar.b) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) bVar.b)));
    }

    public static void y(int i3, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i3);
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}
