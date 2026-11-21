package a3;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class k implements Comparable {
    public final boolean a;
    public final boolean b;

    public k(e2.u uVar, int i7) {
        this.a = (uVar.e & 1) != 0;
        this.b = i5.c.b(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        return h9.w.a.c(this.b, kVar.b).c(this.a, kVar.a).e();
    }
}
