package b2;

import a8.yb;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q1 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final x[] d;
    public int e;

    static {
        String str = e2.n0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public q1(String str, x... xVarArr) {
        yb.g(xVarArr.length > 0);
        this.b = str;
        this.d = xVarArr;
        this.a = xVarArr.length;
        String str2 = xVarArr[0].s;
        this.c = TextUtils.isEmpty(str2) ? w0.h(xVarArr[0].r) : w0.h(str2);
        String str3 = xVarArr[0].d;
        str3 = (str3 == null || str3.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str3;
        int i10 = xVarArr[0].f | 16384;
        for (int i11 = 1; i11 < xVarArr.length; i11++) {
            String str4 = xVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str4)) {
                b("languages", i11, xVarArr[0].d, xVarArr[i11].d);
                return;
            } else {
                if (i10 != (xVarArr[i11].f | 16384)) {
                    b("role flags", i11, Integer.toBinaryString(xVarArr[0].f), Integer.toBinaryString(xVarArr[i11].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder w10 = a1.g.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w10.append(str3);
        w10.append("' (track ");
        w10.append(i10);
        w10.append(")");
        e2.a.d("TrackGroup", "", new IllegalStateException(w10.toString()));
    }

    public final int a(x xVar) {
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.d;
            if (i10 >= xVarArr.length) {
                return -1;
            }
            if (xVar == xVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        x[] xVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(xVarArr.length);
        int length = xVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            x xVar = xVarArr[i10];
            List list = xVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(x.W, xVar.a);
            bundle2.putString(x.X, xVar.b);
            String str = x.B0;
            f9.i0 i0Var = xVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = i0Var.get(i11);
                i11++;
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                Bundle bundle3 = new Bundle();
                x[] xVarArr2 = xVarArr;
                String str2 = b0Var.a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(b0.c, str2);
                }
                bundle3.putString(b0.d, b0Var.b);
                arrayList2.add(bundle3);
                xVarArr = xVarArr2;
                length = i12;
            }
            x[] xVarArr3 = xVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(x.Y, xVar.d);
            bundle2.putInt(x.Z, xVar.e);
            bundle2.putInt(x.a0, xVar.f);
            int i14 = xVar.g;
            if (i14 != x.V.g) {
                bundle2.putInt(x.C0, i14);
            }
            bundle2.putInt(x.b0, xVar.h);
            bundle2.putInt(x.c0, xVar.i);
            bundle2.putString(x.d0, xVar.k);
            String str3 = xVar.m;
            if (str3 != null) {
                bundle2.putString(x.G0, str3);
            }
            bundle2.putString(x.e0, xVar.r);
            bundle2.putString(x.f0, xVar.s);
            bundle2.putInt(x.g0, xVar.t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(x.h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(x.i0, xVar.w);
            bundle2.putLong(x.j0, xVar.x);
            bundle2.putInt(x.k0, xVar.z);
            bundle2.putInt(x.l0, xVar.A);
            bundle2.putInt(x.E0, xVar.B);
            bundle2.putInt(x.F0, xVar.C);
            bundle2.putFloat(x.m0, xVar.D);
            bundle2.putInt(x.n0, xVar.E);
            bundle2.putFloat(x.o0, xVar.F);
            bundle2.putByteArray(x.p0, xVar.G);
            bundle2.putInt(x.q0, xVar.H);
            o oVar = xVar.I;
            if (oVar != null) {
                String str4 = x.r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(o.i, oVar.a);
                bundle4.putInt(o.j, oVar.b);
                bundle4.putInt(o.k, oVar.c);
                bundle4.putByteArray(o.l, oVar.d);
                bundle4.putInt(o.m, oVar.e);
                bundle4.putInt(o.n, oVar.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(x.D0, xVar.J);
            bundle2.putInt(x.s0, xVar.K);
            bundle2.putInt(x.t0, xVar.L);
            bundle2.putInt(x.u0, xVar.M);
            bundle2.putInt(x.v0, xVar.N);
            bundle2.putInt(x.w0, xVar.O);
            bundle2.putInt(x.x0, xVar.P);
            bundle2.putInt(x.z0, xVar.R);
            bundle2.putInt(x.A0, xVar.S);
            bundle2.putInt(x.y0, xVar.T);
            arrayList.add(bundle2);
            i10++;
            xVarArr = xVarArr3;
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
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.b.equals(q1Var.b) && Arrays.equals(this.d, q1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.f(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
