package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class md0 extends p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ qd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(qd0 qd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = qd0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = qd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((qd0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((qd0) obj).invalidate();
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
