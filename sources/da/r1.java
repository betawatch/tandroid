package da;

import android.os.Build;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r1 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public r1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i7;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = z9;
        this.f = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.a != r1Var.a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.b != r1Var.b || this.c != r1Var.c || this.d != r1Var.d || this.e != r1Var.e || this.f != r1Var.f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.b) * 1000003;
        long j3 = this.c;
        int i7 = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.d;
        return ((((((((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.b);
        sb2.append(", totalRam=");
        sb2.append(this.c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, Build.PRODUCT, "}");
    }
}
