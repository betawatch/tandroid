package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class de0 extends l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ge0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(ge0 ge0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ge0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ge0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((ge0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((ge0) obj).invalidate();
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
