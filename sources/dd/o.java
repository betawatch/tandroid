package dd;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.h("</");
            lVar.c = b2.c;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i7 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i7));
        lVar.h.append(aVar.i());
        lVar.a(b2.x);
    }
}
