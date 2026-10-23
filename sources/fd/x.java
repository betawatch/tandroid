package fd;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
