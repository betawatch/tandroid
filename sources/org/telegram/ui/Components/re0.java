package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class re0 extends s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ue0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(ue0 ue0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ue0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ue0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((ue0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((ue0) obj).invalidate();
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
