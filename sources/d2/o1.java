package d2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import b8.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o1 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final v[] d;
    public int e;

    static {
        String str = g2.n0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public o1(String str, v... vVarArr) {
        zb.f(vVarArr.length > 0);
        this.b = str;
        this.d = vVarArr;
        this.a = vVarArr.length;
        String str2 = vVarArr[0].s;
        this.c = TextUtils.isEmpty(str2) ? u0.h(vVarArr[0].r) : u0.h(str2);
        String str3 = vVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i3 = vVarArr[0].f | TLObject.FLAG_14;
        for (int i10 = 1; i10 < vVarArr.length; i10++) {
            String str4 = vVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", i10, vVarArr[0].d, vVarArr[i10].d);
                return;
            } else {
                if (i3 != (vVarArr[i10].f | TLObject.FLAG_14)) {
                    b("role flags", i10, Integer.toBinaryString(vVarArr[0].f), Integer.toBinaryString(vVarArr[i10].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i3, String str2, String str3) {
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        n4.append(str3);
        n4.append("' (track ");
        n4.append(i3);
        n4.append(")");
        g2.a.d("TrackGroup", "", new IllegalStateException(n4.toString()));
    }

    public final int a(v vVar) {
        int i3 = 0;
        while (true) {
            v[] vVarArr = this.d;
            if (i3 >= vVarArr.length) {
                return -1;
            }
            if (vVar == vVarArr[i3]) {
                return i3;
            }
            i3++;
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        v[] vVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(vVarArr.length);
        int length = vVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            v vVar = vVarArr[i3];
            List list = vVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(v.W, vVar.a);
            bundle2.putString(v.X, vVar.b);
            String str = v.B0;
            g9.i0 i0Var = vVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                z zVar = (z) obj;
                zVar.getClass();
                Bundle bundle3 = new Bundle();
                v[] vVarArr2 = vVarArr;
                String str2 = zVar.a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(z.c, str2);
                }
                bundle3.putString(z.d, zVar.b);
                arrayList2.add(bundle3);
                vVarArr = vVarArr2;
                length = i11;
            }
            v[] vVarArr3 = vVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(v.Y, vVar.d);
            bundle2.putInt(v.Z, vVar.e);
            bundle2.putInt(v.a0, vVar.f);
            int i13 = vVar.g;
            if (i13 != v.V.g) {
                bundle2.putInt(v.C0, i13);
            }
            bundle2.putInt(v.b0, vVar.h);
            bundle2.putInt(v.c0, vVar.i);
            bundle2.putString(v.d0, vVar.k);
            String str3 = vVar.m;
            if (str3 != null) {
                bundle2.putString(v.G0, str3);
            }
            bundle2.putString(v.e0, vVar.r);
            bundle2.putString(v.f0, vVar.s);
            bundle2.putInt(v.g0, vVar.t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(v.h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(v.i0, vVar.w);
            bundle2.putLong(v.j0, vVar.x);
            bundle2.putInt(v.k0, vVar.z);
            bundle2.putInt(v.l0, vVar.A);
            bundle2.putInt(v.E0, vVar.B);
            bundle2.putInt(v.F0, vVar.C);
            bundle2.putFloat(v.m0, vVar.D);
            bundle2.putInt(v.n0, vVar.E);
            bundle2.putFloat(v.o0, vVar.F);
            bundle2.putByteArray(v.p0, vVar.G);
            bundle2.putInt(v.q0, vVar.H);
            n nVar = vVar.I;
            if (nVar != null) {
                String str4 = v.r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(n.i, nVar.a);
                bundle4.putInt(n.j, nVar.b);
                bundle4.putInt(n.k, nVar.c);
                bundle4.putByteArray(n.l, nVar.d);
                bundle4.putInt(n.m, nVar.e);
                bundle4.putInt(n.n, nVar.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(v.D0, vVar.J);
            bundle2.putInt(v.s0, vVar.K);
            bundle2.putInt(v.t0, vVar.L);
            bundle2.putInt(v.u0, vVar.M);
            bundle2.putInt(v.v0, vVar.N);
            bundle2.putInt(v.w0, vVar.O);
            bundle2.putInt(v.x0, vVar.P);
            bundle2.putInt(v.z0, vVar.R);
            bundle2.putInt(v.A0, vVar.S);
            bundle2.putInt(v.y0, vVar.T);
            arrayList.add(bundle2);
            i3++;
            vVarArr = vVarArr3;
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
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.b.equals(o1Var.b) && Arrays.equals(this.d, o1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + com.google.android.recaptcha.internal.a.g(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
