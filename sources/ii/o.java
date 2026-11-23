package ii;

import org.telegram.ui.Components.pt0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements te.b, pt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ o(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 0:
                this.b.H0();
                break;
            case 1:
                this.b.H0();
                break;
            default:
                this.b.X.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pt0
    public int b() {
        return this.b.b0;
    }

    private final /* synthetic */ void a(float f10, int i7) {
    }

    private final /* synthetic */ void c(float f10, int i7) {
    }

    private final /* synthetic */ void d(float f10, int i7) {
    }
}
