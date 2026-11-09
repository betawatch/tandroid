package bi;

import org.telegram.ui.Components.ft0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements te.b, ft0 {
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

    @Override // org.telegram.ui.Components.ft0
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
