package le;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
