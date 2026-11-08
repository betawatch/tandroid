package bi;

import org.telegram.ui.Components.dt0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements te.b, dt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;

    public /* synthetic */ ka(dd ddVar, int i7) {
        this.a = i7;
        this.b = ddVar;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 0:
                this.b.r1();
                break;
            case 1:
                this.b.r1();
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
