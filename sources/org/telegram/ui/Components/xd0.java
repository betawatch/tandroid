package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xd0 extends h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ be0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd0(be0 be0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = be0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = be0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((be0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((be0) obj).invalidate();
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
