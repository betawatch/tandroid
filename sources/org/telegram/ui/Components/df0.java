package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class df0 extends r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ gf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(gf0 gf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = gf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = gf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((gf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((gf0) obj).invalidate();
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
