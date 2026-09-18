package dd;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public enum y extends b2 {
    public y() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.m('-')) {
            lVar.c = b2.f;
        } else {
            lVar.f('-');
            lVar.a(b2.M);
        }
    }
}
