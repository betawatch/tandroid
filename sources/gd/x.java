package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum x extends a2 {
    public x() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.m('-')) {
            kVar.c = a2.f;
        } else {
            kVar.f('-');
            kVar.a(a2.M);
        }
    }
}
