// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class khf extends p9f {
    public final /* synthetic */ yif n;

    public khf(yif yifVar) {
        this.n = yifVar;
    }

    @Override // p9f
    public final String a() {
        ybf ybfVar = (ybf) this.n.a.get();
        return ybfVar == null ? "Completer object has been garbage collected, future will fail soon" : qd4.y("tag=[", String.valueOf(ybfVar.a), "]");
    }
}
