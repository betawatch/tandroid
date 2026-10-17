package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kf0 extends s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ nf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(nf0 nf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = nf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = nf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((nf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((nf0) obj).invalidate();
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
