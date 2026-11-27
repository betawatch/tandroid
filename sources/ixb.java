// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ixb extends djc {
    public boolean a = false;
    public final /* synthetic */ byte b;
    public final /* synthetic */ jxb c;

    /* JADX WARN: Multi-variable type inference failed */
    public ixb(jxb jxbVar, int i) {
        this.c = jxbVar;
        this.b = i;
    }

    @Override // djc, cjc
    public final void a() {
        this.a = true;
    }

    @Override // djc, cjc
    public final void b() {
        this.c.a.setVisibility(0);
    }

    @Override // cjc
    public final void c() {
        if (this.a) {
            return;
        }
        this.c.a.setVisibility(this.b);
    }
}
