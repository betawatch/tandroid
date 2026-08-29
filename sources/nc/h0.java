package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum h0 extends b2 {
    public h0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        int[] c3 = lVar.c(null, false);
        if (c3 == null) {
            lVar.f('&');
        } else {
            lVar.g(new String(c3, 0, c3.length));
        }
        lVar.c = b2.a;
    }
}
