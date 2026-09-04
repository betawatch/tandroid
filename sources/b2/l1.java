package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l1 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final s[] d;
    public int e;

    static {
        String str = e2.d0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        e2.d.b(sVarArr.length > 0);
        this.b = str;
        this.d = sVarArr;
        this.a = sVarArr.length;
        int h = r0.h(sVarArr[0].r);
        this.c = h == -1 ? r0.h(sVarArr[0].q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str2;
        int i10 = sVarArr[0].f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str3)) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else {
                if (i10 != (sVarArr[i11].f | 16384)) {
                    b("role flags", i11, Integer.toBinaryString(sVarArr[0].f), Integer.toBinaryString(sVarArr[i11].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder w10 = a4.a.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w10.append(str3);
        w10.append("' (track ");
        w10.append(i10);
        w10.append(")");
        e2.a.f("TrackGroup", "", new IllegalStateException(w10.toString()));
    }

    public final int a(s sVar) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.d;
            if (i10 >= sVarArr.length) {
                return -1;
            }
            if (sVar == sVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        s[] sVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(sVarArr.length);
        int length = sVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            s sVar = sVarArr[i10];
            List list = sVar.u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.a);
            bundle2.putString(s.W, sVar.b);
            String str = s.A0;
            e9.i0 i0Var = sVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = i0Var.get(i11);
                i11++;
                w wVar = (w) obj;
                wVar.getClass();
                Bundle bundle3 = new Bundle();
                s[] sVarArr2 = sVarArr;
                String str2 = wVar.a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.c, str2);
                }
                bundle3.putString(w.d, wVar.b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.e);
            bundle2.putInt(s.Z, sVar.f);
            int i14 = sVar.g;
            if (i14 != s.U.g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.a0, sVar.h);
            bundle2.putInt(s.b0, sVar.i);
            bundle2.putString(s.c0, sVar.k);
            bundle2.putString(s.d0, sVar.q);
            bundle2.putString(s.e0, sVar.r);
            bundle2.putInt(s.f0, sVar.s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.h0, sVar.v);
            bundle2.putLong(s.i0, sVar.w);
            bundle2.putInt(s.j0, sVar.y);
            bundle2.putInt(s.k0, sVar.z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.n0, sVar.E);
            bundle2.putByteArray(s.o0, sVar.F);
            bundle2.putInt(s.p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.i, jVar.a);
                bundle4.putInt(j.j, jVar.b);
                bundle4.putInt(j.k, jVar.c);
                bundle4.putByteArray(j.l, jVar.d);
                bundle4.putInt(j.m, jVar.e);
                bundle4.putInt(j.n, jVar.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.r0, sVar.J);
            bundle2.putInt(s.s0, sVar.K);
            bundle2.putInt(s.t0, sVar.L);
            bundle2.putInt(s.u0, sVar.M);
            bundle2.putInt(s.v0, sVar.N);
            bundle2.putInt(s.w0, sVar.O);
            bundle2.putInt(s.y0, sVar.Q);
            bundle2.putInt(s.z0, sVar.R);
            bundle2.putInt(s.x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
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
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.b.equals(l1Var.b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a4.a.h(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
