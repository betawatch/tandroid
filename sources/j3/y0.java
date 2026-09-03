package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y0 implements g {
    public static final String B;
    public static final q0 C;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final Uri a;
    public final String b;
    public final w0 c;
    public final r0 d;
    public final List e;
    public final String f;
    public final s8.v h;
    public final Object n;

    static {
        int i10 = h5.d0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = new q0(4);
    }

    public y0(Uri uri, String str, w0 w0Var, r0 r0Var, List list, String str2, s8.v vVar, Object obj) {
        this.a = uri;
        this.b = str;
        this.c = w0Var;
        this.d = r0Var;
        this.e = list;
        this.f = str2;
        this.h = vVar;
        s8.t tVar = s8.v.b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (i10 < vVar.size()) {
            b1 b1Var = (b1) vVar.get(i10);
            c9.a aVar = new c9.a();
            aVar.d = b1Var.a;
            aVar.a = b1Var.b;
            aVar.e = b1Var.c;
            aVar.b = b1Var.d;
            aVar.c = b1Var.e;
            aVar.f = b1Var.f;
            aVar.g = b1Var.h;
            a1 a1Var = new a1(aVar);
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i12));
            } else if (z4) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = a1Var;
                i10++;
                i11++;
            }
            z4 = false;
            objArr[i11] = a1Var;
            i10++;
            i11++;
        }
        s8.v.s(i11, objArr);
        this.n = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a.equals(y0Var.a) && h5.d0.a(this.b, y0Var.b) && h5.d0.a(this.c, y0Var.c) && h5.d0.a(this.d, y0Var.d) && this.e.equals(y0Var.e) && h5.d0.a(this.f, y0Var.f) && this.h.equals(y0Var.h) && h5.d0.a(this.n, y0Var.n);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w0 w0Var = this.c;
        int hashCode3 = (hashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        r0 r0Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (r0Var == null ? 0 : r0Var.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int hashCode5 = (this.h.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.n;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }
}
