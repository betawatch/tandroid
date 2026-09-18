package dd;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
