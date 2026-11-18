package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
