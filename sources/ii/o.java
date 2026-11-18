package ii;

import org.telegram.ui.Components.mt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements te.b, mt0 {
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

    @Override // org.telegram.ui.Components.mt0
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
