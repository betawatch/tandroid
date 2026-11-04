package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xc0 extends j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ad0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(ad0 ad0Var, int i3) {
        super("thumbAnimationProgress", 0);
        this.b = i3;
        switch (i3) {
            case 1:
                this.c = ad0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ad0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((ad0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((ad0) obj).invalidate();
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
