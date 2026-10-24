package b2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.TranslateController;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class p1 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final w[] d;
    public int e;

    static {
        String str = e2.m0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public p1(String str, w... wVarArr) {
        u6.g(wVarArr.length > 0);
        this.b = str;
        this.d = wVarArr;
        this.a = wVarArr.length;
        String str2 = wVarArr[0].s;
        this.c = TextUtils.isEmpty(str2) ? v0.h(wVarArr[0].r) : v0.h(str2);
        String str3 = wVarArr[0].d;
        str3 = (str3 == null || str3.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str3;
        int i10 = wVarArr[0].f | 16384;
        for (int i11 = 1; i11 < wVarArr.length; i11++) {
            String str4 = wVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str4)) {
                b("languages", i11, wVarArr[0].d, wVarArr[i11].d);
                return;
            } else {
                if (i10 != (wVarArr[i11].f | 16384)) {
                    b("role flags", i11, Integer.toBinaryString(wVarArr[0].f), Integer.toBinaryString(wVarArr[i11].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder w9 = a1.g.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w9.append(str3);
        w9.append("' (track ");
        w9.append(i10);
        w9.append(")");
        e2.a.d("TrackGroup", "", new IllegalStateException(w9.toString()));
    }

    public final int a(w wVar) {
        int i10 = 0;
        while (true) {
            w[] wVarArr = this.d;
            if (i10 >= wVarArr.length) {
                return -1;
            }
            if (wVar == wVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        w[] wVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(wVarArr.length);
        int length = wVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            w wVar = wVarArr[i10];
            List list = wVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(w.W, wVar.a);
            bundle2.putString(w.X, wVar.b);
            String str = w.B0;
            e9.n0 n0Var = wVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(n0Var.size());
            int size = n0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = n0Var.get(i11);
                i11++;
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                Bundle bundle3 = new Bundle();
                w[] wVarArr2 = wVarArr;
                String str2 = a0Var.a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(a0.c, str2);
                }
                bundle3.putString(a0.d, a0Var.b);
                arrayList2.add(bundle3);
                wVarArr = wVarArr2;
                length = i12;
            }
            w[] wVarArr3 = wVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(w.Y, wVar.d);
            bundle2.putInt(w.Z, wVar.e);
            bundle2.putInt(w.a0, wVar.f);
            int i14 = wVar.g;
            if (i14 != w.V.g) {
                bundle2.putInt(w.C0, i14);
            }
            bundle2.putInt(w.b0, wVar.h);
            bundle2.putInt(w.c0, wVar.i);
            bundle2.putString(w.d0, wVar.k);
            String str3 = wVar.m;
            if (str3 != null) {
                bundle2.putString(w.G0, str3);
            }
            bundle2.putString(w.e0, wVar.r);
            bundle2.putString(w.f0, wVar.s);
            bundle2.putInt(w.g0, wVar.t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(w.h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(w.i0, wVar.w);
            bundle2.putLong(w.j0, wVar.x);
            bundle2.putInt(w.k0, wVar.z);
            bundle2.putInt(w.l0, wVar.A);
            bundle2.putInt(w.E0, wVar.B);
            bundle2.putInt(w.F0, wVar.C);
            bundle2.putFloat(w.m0, wVar.D);
            bundle2.putInt(w.n0, wVar.E);
            bundle2.putFloat(w.o0, wVar.F);
            bundle2.putByteArray(w.p0, wVar.G);
            bundle2.putInt(w.q0, wVar.H);
            n nVar = wVar.I;
            if (nVar != null) {
                String str4 = w.r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(n.i, nVar.a);
                bundle4.putInt(n.j, nVar.b);
                bundle4.putInt(n.k, nVar.c);
                bundle4.putByteArray(n.l, nVar.d);
                bundle4.putInt(n.m, nVar.e);
                bundle4.putInt(n.n, nVar.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(w.D0, wVar.J);
            bundle2.putInt(w.s0, wVar.K);
            bundle2.putInt(w.t0, wVar.L);
            bundle2.putInt(w.u0, wVar.M);
            bundle2.putInt(w.v0, wVar.N);
            bundle2.putInt(w.w0, wVar.O);
            bundle2.putInt(w.x0, wVar.P);
            bundle2.putInt(w.z0, wVar.R);
            bundle2.putInt(w.A0, wVar.S);
            bundle2.putInt(w.y0, wVar.T);
            arrayList.add(bundle2);
            i10++;
            wVarArr = wVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.b.equals(p1Var.b) && Arrays.equals(this.d, p1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.g(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
