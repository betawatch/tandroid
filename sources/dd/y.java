package dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
            lVar.a(b2.N);
        }
    }
}
