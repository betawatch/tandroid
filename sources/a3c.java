// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
