package e2;

import a8.ia;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m1 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final u[] d;
    public int e;

    static {
        String str = h2.m0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public m1(String str, u... uVarArr) {
        ia.f(uVarArr.length > 0);
        this.b = str;
        this.d = uVarArr;
        this.a = uVarArr.length;
        String str2 = uVarArr[0].s;
        this.c = TextUtils.isEmpty(str2) ? s0.h(uVarArr[0].r) : s0.h(str2);
        String str3 = uVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i7 = uVarArr[0].f | TLObject.FLAG_14;
        for (int i10 = 1; i10 < uVarArr.length; i10++) {
            String str4 = uVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", i10, uVarArr[0].d, uVarArr[i10].d);
                return;
            } else {
                if (i7 != (uVarArr[i10].f | TLObject.FLAG_14)) {
                    b("role flags", i10, Integer.toBinaryString(uVarArr[0].f), Integer.toBinaryString(uVarArr[i10].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i7, String str2, String str3) {
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        n10.append(str3);
        n10.append("' (track ");
        n10.append(i7);
        n10.append(")");
        h2.a.d("TrackGroup", "", new IllegalStateException(n10.toString()));
    }

    public final int a(u uVar) {
        int i7 = 0;
        while (true) {
            u[] uVarArr = this.d;
            if (i7 >= uVarArr.length) {
                return -1;
            }
            if (uVar == uVarArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        u[] uVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(uVarArr.length);
        int length = uVarArr.length;
        int i7 = 0;
        while (i7 < length) {
            u uVar = uVarArr[i7];
            List list = uVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(u.W, uVar.a);
            bundle2.putString(u.X, uVar.b);
            String str = u.B0;
            h9.i0 i0Var = uVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                x xVar = (x) obj;
                xVar.getClass();
                Bundle bundle3 = new Bundle();
                u[] uVarArr2 = uVarArr;
                String str2 = xVar.a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(x.c, str2);
                }
                bundle3.putString(x.d, xVar.b);
                arrayList2.add(bundle3);
                uVarArr = uVarArr2;
                length = i11;
            }
            u[] uVarArr3 = uVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(u.Y, uVar.d);
            bundle2.putInt(u.Z, uVar.e);
            bundle2.putInt(u.a0, uVar.f);
            int i13 = uVar.g;
            if (i13 != u.V.g) {
                bundle2.putInt(u.C0, i13);
            }
            bundle2.putInt(u.b0, uVar.h);
            bundle2.putInt(u.c0, uVar.i);
            bundle2.putString(u.d0, uVar.k);
            String str3 = uVar.m;
            if (str3 != null) {
                bundle2.putString(u.G0, str3);
            }
            bundle2.putString(u.e0, uVar.r);
            bundle2.putString(u.f0, uVar.s);
            bundle2.putInt(u.g0, uVar.t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(u.h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(u.i0, uVar.w);
            bundle2.putLong(u.j0, uVar.x);
            bundle2.putInt(u.k0, uVar.z);
            bundle2.putInt(u.l0, uVar.A);
            bundle2.putInt(u.E0, uVar.B);
            bundle2.putInt(u.F0, uVar.C);
            bundle2.putFloat(u.m0, uVar.D);
            bundle2.putInt(u.n0, uVar.E);
            bundle2.putFloat(u.o0, uVar.F);
            bundle2.putByteArray(u.p0, uVar.G);
            bundle2.putInt(u.q0, uVar.H);
            m mVar = uVar.I;
            if (mVar != null) {
                String str4 = u.r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(m.i, mVar.a);
                bundle4.putInt(m.j, mVar.b);
                bundle4.putInt(m.k, mVar.c);
                bundle4.putByteArray(m.l, mVar.d);
                bundle4.putInt(m.m, mVar.e);
                bundle4.putInt(m.n, mVar.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(u.D0, uVar.J);
            bundle2.putInt(u.s0, uVar.K);
            bundle2.putInt(u.t0, uVar.L);
            bundle2.putInt(u.u0, uVar.M);
            bundle2.putInt(u.v0, uVar.N);
            bundle2.putInt(u.w0, uVar.O);
            bundle2.putInt(u.x0, uVar.P);
            bundle2.putInt(u.z0, uVar.R);
            bundle2.putInt(u.A0, uVar.S);
            bundle2.putInt(u.y0, uVar.T);
            arrayList.add(bundle2);
            i7++;
            uVarArr = uVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.b.equals(m1Var.b) && Arrays.equals(this.d, m1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + com.google.android.recaptcha.internal.a.h(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
