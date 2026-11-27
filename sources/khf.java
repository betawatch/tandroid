// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
