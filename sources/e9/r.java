package e9;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class r extends t {
    public final /* synthetic */ int f;
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, int i10) {
        super(vVar);
        this.f = i10;
        this.h = vVar;
    }

    @Override // e9.t
    public final Object a(int i10) {
        switch (this.f) {
            case 0:
                return this.h.i()[i10];
            case 1:
                return new u(this.h, i10);
            default:
                return this.h.j()[i10];
        }
    }
}
