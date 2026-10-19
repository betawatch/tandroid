package fd;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public enum t extends a2 {
    public t() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.c = a2.H;
        } else {
            kVar.h("</");
            kVar.c = a2.f;
        }
    }
}
