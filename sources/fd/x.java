package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public enum x extends a2 {
    public x() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.m('-')) {
            kVar.c = a2.f;
        } else {
            kVar.f('-');
            kVar.a(a2.M);
        }
    }
}
