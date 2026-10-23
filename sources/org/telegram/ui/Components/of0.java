package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class of0 extends s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ rf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(rf0 rf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = rf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = rf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((rf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((rf0) obj).invalidate();
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
