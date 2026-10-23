package f2;

import b2.q0;
import b2.s0;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e2.x;
import java.util.ArrayList;
import java.util.Arrays;
import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class b implements s0 {
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
                u6.g(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                u6.g(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                u6.g(z10);
                break;
            case "auxiliary.tracks.map":
                u6.g(i11 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
    }

    @Override // b2.s0
    public final /* synthetic */ b2.w a() {
        return null;
    }

    @Override // b2.s0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        u6.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = k3.f(bArr[i10 + 2], i10, 1, arrayList)) {
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
        return ((((Arrays.hashCode(this.b) + a1.g.g(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
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
                new d9.l(String.valueOf(','), 0).a(u10, d.iterator());
                sb2 = u10.toString();
            }
            sb2 = m0.f0(bArr);
        } else if (i10 == 1) {
            sb2 = m0.r(bArr);
        } else if (i10 == 23) {
            u6.d("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
            sb2 = String.valueOf(Float.intBitsToFloat(b8.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i10 == 67) {
            u6.d("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
            sb2 = String.valueOf(b8.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i10 != 75) {
            if (i10 == 78) {
                sb2 = String.valueOf(new x(bArr).G());
            }
            sb2 = m0.f0(bArr);
        } else {
            sb2 = String.valueOf(bArr[0] & 255);
        }
        return k3.k("mdta: key=", str, ", value=", sb2);
    }

    @Override // b2.s0
    public final /* synthetic */ void b(q0 q0Var) {
    }
}
