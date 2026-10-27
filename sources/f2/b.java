package f2;

import a8.ed;
import a8.yb;
import b2.r0;
import b2.t0;
import b2.x;
import c3.h0;
import e2.n0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                yb.g(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                yb.g(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                yb.g(z10);
                break;
            case "auxiliary.tracks.map":
                yb.g(i11 == 0);
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
        yb.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = h0.i(bArr[i10 + 2], i10, 1, arrayList)) {
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
                StringBuilder u10 = a1.g.u("track types = ");
                new d5.j(String.valueOf(',')).a(u10, d.iterator());
                sb2 = u10.toString();
            }
            sb2 = n0.f0(bArr);
        } else if (i10 == 1) {
            sb2 = n0.r(bArr);
        } else if (i10 == 23) {
            yb.d("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
            sb2 = String.valueOf(Float.intBitsToFloat(ed.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i10 == 67) {
            yb.d("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
            sb2 = String.valueOf(ed.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i10 != 75) {
            if (i10 == 78) {
                sb2 = String.valueOf(new e2.x(bArr).G());
            }
            sb2 = n0.f0(bArr);
        } else {
            sb2 = String.valueOf(bArr[0] & 255);
        }
        return h0.m("mdta: key=", str, ", value=", sb2);
    }

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
