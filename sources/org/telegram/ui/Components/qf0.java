package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qf0 extends u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ tf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(tf0 tf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = tf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = tf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((tf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((tf0) obj).invalidate();
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
