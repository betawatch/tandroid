// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ed3 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ed3(ko4 ko4Var, int i) {
        this.a = (ko4Var.e & 1) != 0;
        this.b = qu6.c(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ed3 ed3Var = (ed3) obj;
        return pp2.a.c(this.b, ed3Var.b).c(this.a, ed3Var.a).e();
    }
}
