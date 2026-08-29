package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.c();
            lVar.c = b2.d0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.c = b2.j0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.c = b2.z0;
        } else {
            lVar.m(this);
            lVar.a(b2.b0);
        }
    }
}
