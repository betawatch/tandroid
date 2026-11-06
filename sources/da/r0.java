package da;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class r0 extends c2 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z9, int i11, String str2, String str3) {
        this.a = i7;
        this.b = str;
        this.c = i10;
        this.d = j3;
        this.e = j10;
        this.f = z9;
        this.g = i11;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.a == r0Var.a && this.b.equals(r0Var.b) && this.c == r0Var.c && this.d == r0Var.d && this.e == r0Var.e && this.f == r0Var.f && this.g == r0Var.g && this.h.equals(r0Var.h) && this.i.equals(r0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j3 = this.d;
        int i7 = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.e;
        return ((((((((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.a);
        sb2.append(", model=");
        sb2.append(this.b);
        sb2.append(", cores=");
        sb2.append(this.c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f);
        sb2.append(", state=");
        sb2.append(this.g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.i, "}");
    }
}
