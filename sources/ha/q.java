package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public q(String str, int i9, int i10, boolean z10) {
        this.a = str;
        this.b = i9;
        this.c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.i.a(this.a, qVar.a) && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        boolean z10 = this.d;
        int i9 = z10;
        if (z10 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
