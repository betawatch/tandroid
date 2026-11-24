// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n3c implements dla {
    public int a;
    public boolean b;
    public final /* synthetic */ o3c c;

    public n3c(o3c o3cVar) {
        this.c = o3cVar;
    }

    @Override // dla
    public final void L(int i, boolean z) {
        if (this.a == i && this.b == z) {
            return;
        }
        this.a = i;
        this.b = z;
        if (i > gm.L(20.0f)) {
            o3c o3cVar = this.c;
            if (o3cVar.n0) {
                return;
            }
            o3cVar.u0.r0 = false;
            o3cVar.n0 = true;
        }
    }
}
