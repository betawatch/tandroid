package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class af0 extends r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ df0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(df0 df0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = df0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = df0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((df0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((df0) obj).invalidate();
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
