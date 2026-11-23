package dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.I;
        } else {
            lVar.h("</");
            lVar.c = b2.f;
        }
    }
}
