package di;

import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements le.d, xv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 0:
                this.b.L0();
                break;
            case 1:
                this.b.L0();
                break;
            default:
                this.b.U.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public int b() {
        return this.b.Y;
    }

    private final /* synthetic */ void a(float f7, int i10) {
    }

    private final /* synthetic */ void c(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }
}
