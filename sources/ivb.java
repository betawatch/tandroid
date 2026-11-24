// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ivb extends ehc {
    public boolean a = false;
    public final /* synthetic */ byte b;
    public final /* synthetic */ jvb c;

    /* JADX WARN: Multi-variable type inference failed */
    public ivb(jvb jvbVar, int i) {
        this.c = jvbVar;
        this.b = i;
    }

    @Override // ehc, dhc
    public final void a() {
        this.a = true;
    }

    @Override // ehc, dhc
    public final void b() {
        this.c.a.setVisibility(0);
    }

    @Override // dhc
    public final void c() {
        if (this.a) {
            return;
        }
        this.c.a.setVisibility(this.b);
    }
}
