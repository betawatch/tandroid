package bi;

import org.telegram.ui.Components.iw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements oe.d, iw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;

    public /* synthetic */ ab(dd ddVar, int i10) {
        this.a = i10;
        this.b = ddVar;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        switch (this.a) {
            case 0:
                this.b.n1();
                break;
            case 1:
                this.b.n1();
                break;
            default:
                this.b.W.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.iw0
    public int c() {
        return this.b.a0;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
        int i11 = this.a;
    }

    private final /* synthetic */ void a(float f7, int i10) {
    }

    private final /* synthetic */ void b(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }
}
