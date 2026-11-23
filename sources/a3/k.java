package a3;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
