package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cd0 extends l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ fd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(fd0 fd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = fd0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = fd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((fd0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((fd0) obj).invalidate();
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
