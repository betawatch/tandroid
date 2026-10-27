package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mf0 extends u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ pf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(pf0 pf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = pf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = pf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((pf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((pf0) obj).invalidate();
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
