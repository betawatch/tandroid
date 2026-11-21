package di;

import org.telegram.ui.Components.pt0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements te.b, pt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ e9(pb pbVar, int i7) {
        this.a = i7;
        this.b = pbVar;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 0:
                this.b.s1();
                break;
            case 1:
                this.b.s1();
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
