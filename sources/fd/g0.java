package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public enum g0 extends a2 {
    public g0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        int[] c10 = kVar.c(null, false);
        if (c10 == null) {
            kVar.f('&');
        } else {
            kVar.h(new String(c10, 0, c10.length));
        }
        kVar.c = a2.a;
    }
}
