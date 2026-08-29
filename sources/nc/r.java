package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.A;
        } else {
            lVar.g("</");
            lVar.c = b2.e;
        }
    }
}
