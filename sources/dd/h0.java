package dd;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
