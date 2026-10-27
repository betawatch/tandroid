package oe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i {
    public final f a;
    public final m b = new m(0.0f);
    public final m c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f = new m(0.0f);
    public final m g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.c;
        m mVar2 = iVar.b;
        if (z10) {
            mVar2.c = i10;
            mVar.c = i10 > 0 ? 1.0f : 0.0f;
        } else {
            mVar2.d(i10);
            mVar.d(i10 > 0 ? 1.0f : 0.0f);
        }
    }
}
