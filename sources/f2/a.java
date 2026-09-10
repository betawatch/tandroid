package f2;

import b2.m0;
import b2.o0;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.v;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;
import v7.y7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements o0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                e2.d.b(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                e2.d.b(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                e2.d.b(z10);
                break;
            case "auxiliary.tracks.map":
                e2.d.b(i11 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
    }

    @Override // b2.o0
    public final /* synthetic */ b2.s a() {
        return null;
    }

    @Override // b2.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        e2.d.f("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = e2.d(bArr[i10 + 2], i10, 1, arrayList)) {
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
        return ((((Arrays.hashCode(this.b) + a4.a.h(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        String str = this.a;
        byte[] bArr = this.b;
        int i10 = this.d;
        if (i10 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder u10 = a4.a.u("track types = ");
                new a4.m(String.valueOf(',')).O(u10, d.iterator());
                sb2 = u10.toString();
            }
            sb2 = d0.c0(bArr);
        } else if (i10 == 1) {
            sb2 = d0.p(bArr);
        } else if (i10 == 23) {
            boolean z10 = bArr.length >= 4;
            int length = bArr.length;
            if (!z10) {
                throw new IllegalArgumentException(u6.a("array too small: %s < %s", Integer.valueOf(length), 4));
            }
            sb2 = String.valueOf(Float.intBitsToFloat(y7.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i10 == 67) {
            boolean z11 = bArr.length >= 4;
            int length2 = bArr.length;
            if (!z11) {
                throw new IllegalArgumentException(u6.a("array too small: %s < %s", Integer.valueOf(length2), 4));
            }
            sb2 = String.valueOf(y7.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i10 != 75) {
            if (i10 == 78) {
                sb2 = String.valueOf(new v(bArr).C());
            }
            sb2 = d0.c0(bArr);
        } else {
            sb2 = String.valueOf(bArr[0] & 255);
        }
        return e2.i("mdta: key=", str, ", value=", sb2);
    }

    @Override // b2.o0
    public final /* synthetic */ void b(m0 m0Var) {
    }
}
