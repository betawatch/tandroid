package dd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public enum h0 extends b2 {
    public h0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        int[] c10 = lVar.c(null, false);
        if (c10 == null) {
            lVar.f('&');
        } else {
            lVar.h(new String(c10, 0, c10.length));
        }
        lVar.c = b2.a;
    }
}
