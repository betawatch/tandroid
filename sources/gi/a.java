package gi;

import org.telegram.ui.Components.dt0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements te.b, dt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ a(f fVar, int i7) {
        this.a = i7;
        this.b = fVar;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 0:
                this.b.H0();
                break;
            case 1:
                this.b.H0();
                break;
            default:
                this.b.W.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dt0
    public int b() {
        return this.b.a0;
    }

    private final /* synthetic */ void a(float f10, int i7) {
    }

    private final /* synthetic */ void c(float f10, int i7) {
    }

    private final /* synthetic */ void d(float f10, int i7) {
    }
}
