package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class lf0 extends s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ of0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(of0 of0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = of0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = of0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((of0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((of0) obj).invalidate();
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
