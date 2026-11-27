// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a3c implements ez5, dz5 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ icc c;

    public /* synthetic */ a3c(icc iccVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = iccVar;
    }

    @Override // ez5
    public final void a(String str) {
        r3c.E0(this.a, str, this.b, this.c);
    }

    @Override // dz5
    public final void l(Exception exc) {
        r3c.E0(this.a, "en", this.b, this.c);
    }
}
