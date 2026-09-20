package m4;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ o0(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((j1) obj).a(this.b);
                break;
            default:
                ((j1) obj).U(this.b);
                break;
        }
    }
}
