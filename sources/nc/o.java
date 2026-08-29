package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.g("</");
            lVar.c = b2.c;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.i(String.valueOf(i10));
        lVar.h.append(aVar.i());
        lVar.a(b2.w);
    }
}
