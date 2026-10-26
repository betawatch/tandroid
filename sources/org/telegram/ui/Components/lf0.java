package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lf0 extends u6 {
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

    @Override // org.telegram.ui.Components.u6
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
