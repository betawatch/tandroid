package h2;

import b8.od;
import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
import g2.n0;
import g2.y;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements r0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public a(String str, byte[] bArr, int i3, int i10) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                zb.f(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                zb.f(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                zb.f(z10);
                break;
            case "auxiliary.tracks.map":
                zb.f(i10 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i3;
        this.d = i10;
    }

    @Override // d2.r0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // d2.r0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        zb.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < b10; i3 = com.google.android.recaptcha.internal.a.f(bArr[i3 + 2], i3, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && Arrays.equals(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + com.google.android.recaptcha.internal.a.g(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        String str = this.a;
        byte[] bArr = this.b;
        int i3 = this.d;
        if (i3 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l("track types = ");
                new com.google.android.gms.internal.clearcut.e(String.valueOf(',')).a(l10, d.iterator());
                sb2 = l10.toString();
            }
            sb2 = n0.f0(bArr);
        } else if (i3 == 1) {
            sb2 = n0.r(bArr);
        } else if (i3 == 23) {
            zb.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb2 = String.valueOf(Float.intBitsToFloat(od.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i3 == 67) {
            zb.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb2 = String.valueOf(od.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i3 != 75) {
            if (i3 == 78) {
                sb2 = String.valueOf(new y(bArr).G());
            }
            sb2 = n0.f0(bArr);
        } else {
            sb2 = String.valueOf(bArr[0] & 255);
        }
        return com.google.android.recaptcha.internal.a.k("mdta: key=", str, ", value=", sb2);
    }

    @Override // d2.r0
    public final /* synthetic */ void a(p0 p0Var) {
    }
}
