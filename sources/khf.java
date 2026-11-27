// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
