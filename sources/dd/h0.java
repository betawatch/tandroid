package dd;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
