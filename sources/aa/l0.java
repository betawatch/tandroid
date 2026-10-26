package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l0 extends o1 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public l0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.a = i10;
        this.b = str;
        this.c = i11;
        this.d = j10;
        this.e = j11;
        this.f = z10;
        this.g = i12;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            l0 l0Var = (l0) ((o1) obj);
            if (this.a == l0Var.a && this.b.equals(l0Var.b) && this.c == l0Var.c && this.d == l0Var.d && this.e == l0Var.e && this.f == l0Var.f && this.g == l0Var.g && this.h.equals(l0Var.h) && this.i.equals(l0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j10 = this.d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
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
        return a1.g.s(sb2, this.i, "}");
    }
}
