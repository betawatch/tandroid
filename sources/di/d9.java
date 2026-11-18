package di;

import org.telegram.ui.Components.mt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements te.b, mt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ d9(pb pbVar, int i7) {
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
