package dd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
