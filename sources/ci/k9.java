package ci;

import org.telegram.ui.Components.ct0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements qe.b, ct0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ k9(wb wbVar, int i3) {
        this.a = i3;
        this.b = wbVar;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
        int i10 = this.a;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.a) {
            case 0:
                this.b.r1();
                break;
            case 1:
                this.b.r1();
                break;
            default:
                this.b.X.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ct0
    public int c() {
        return this.b.b0;
    }

    private final /* synthetic */ void a(float f10, int i3) {
    }

    private final /* synthetic */ void b(float f10, int i3) {
    }

    private final /* synthetic */ void d(float f10, int i3) {
    }
}
