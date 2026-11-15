package di;

import org.telegram.ui.Components.et0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a9 implements te.b, et0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ a9(lb lbVar, int i7) {
        this.a = i7;
        this.b = lbVar;
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
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

    @Override // org.telegram.ui.Components.et0
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
