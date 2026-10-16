package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rf0 extends u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ uf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(uf0 uf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = uf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = uf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((uf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((uf0) obj).invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.r);
            default:
                return Float.valueOf(this.c.n);
        }
    }
}
