package f2;

import b2.r0;
import b2.t0;
import b2.x;
import c3.i0;
import e2.l0;
import java.util.ArrayList;
import java.util.Arrays;
import v7.c8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements t0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public b(String str, byte[] bArr, int i10, int i11) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                t6.f(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                t6.f(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                t6.f(z10);
                break;
            case "auxiliary.tracks.map":
                t6.f(i11 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    @Override // b2.t0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        t6.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = i0.j(bArr[i10 + 2], i10, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && Arrays.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + a1.g.f(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        String str = this.a;
        byte[] bArr = this.b;
        int i10 = this.d;
        if (i10 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder t10 = a1.g.t("track types = ");
                new com.google.android.gms.internal.clearcut.e(String.valueOf(','), 1).a(t10, d.iterator());
                sb2 = t10.toString();
            }
            sb2 = l0.f0(bArr);
        } else if (i10 == 1) {
            sb2 = l0.r(bArr);
        } else if (i10 == 23) {
            t6.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb2 = String.valueOf(Float.intBitsToFloat(c8.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i10 == 67) {
            t6.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb2 = String.valueOf(c8.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i10 != 75) {
            if (i10 == 78) {
                sb2 = String.valueOf(new e2.x(bArr).G());
            }
            sb2 = l0.f0(bArr);
        } else {
            sb2 = String.valueOf(bArr[0] & 255);
        }
        return i0.n("mdta: key=", str, ", value=", sb2);
    }

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
