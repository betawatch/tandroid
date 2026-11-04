package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum e1 extends c2 {
    public e1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        int[] c2 = mVar.c(null, false);
        if (c2 == null) {
            mVar.f('&');
        } else {
            mVar.h(new String(c2, 0, c2.length));
        }
        mVar.c = c2.c;
    }
}
