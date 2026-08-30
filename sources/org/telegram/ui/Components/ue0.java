package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ue0 extends m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ye0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(ye0 ye0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ye0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ye0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((ye0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((ye0) obj).invalidate();
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
