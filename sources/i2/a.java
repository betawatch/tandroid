package i2;

import a8.ia;
import c8.e1;
import e2.n0;
import e2.p0;
import h2.m0;
import h2.x;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a implements p0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public a(String str, byte[] bArr, int i7, int i10) {
        boolean z9;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z9 = true;
                }
                ia.f(z9);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z9 = true;
                }
                ia.f(z9);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z9 = true;
                }
                ia.f(z9);
                break;
            case "auxiliary.tracks.map":
                ia.f(i10 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i7;
        this.d = i10;
    }

    @Override // e2.p0
    public final /* synthetic */ e2.u a() {
        return null;
    }

    @Override // e2.p0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        ia.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b10; i7 = com.google.android.recaptcha.internal.a.f(bArr[i7 + 2], i7, 1, arrayList)) {
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
        return ((((Arrays.hashCode(this.b) + com.google.android.recaptcha.internal.a.h(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        String str = this.a;
        byte[] bArr = this.b;
        int i7 = this.d;
        if (i7 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m("track types = ");
                new g9.l(String.valueOf(','), 0).a(m10, d.iterator());
                sb2 = m10.toString();
            }
            sb2 = m0.f0(bArr);
        } else if (i7 == 1) {
            sb2 = m0.r(bArr);
        } else if (i7 == 23) {
            ia.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb2 = String.valueOf(Float.intBitsToFloat(e1.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i7 == 67) {
            ia.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb2 = String.valueOf(e1.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i7 != 75) {
            if (i7 == 78) {
                sb2 = String.valueOf(new x(bArr).G());
            }
            sb2 = m0.f0(bArr);
        } else {
            sb2 = String.valueOf(bArr[0] & 255);
        }
        return com.google.android.recaptcha.internal.a.l("mdta: key=", str, ", value=", sb2);
    }

    @Override // e2.p0
    public final /* synthetic */ void b(n0 n0Var) {
    }
}
