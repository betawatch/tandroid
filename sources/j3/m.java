package j3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m implements g {
    public final int a;
    public final int b;
    public final int c;
    public final String d = null;

    static {
        new e8.a(0).a();
        int i10 = h5.d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public m(e8.a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && h5.d0.a(this.d, mVar.d);
    }

    public final int hashCode() {
        int i10 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i10 + (str == null ? 0 : str.hashCode());
    }
}
