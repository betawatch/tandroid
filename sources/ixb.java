// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
