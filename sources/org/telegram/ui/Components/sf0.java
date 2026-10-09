package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sf0 extends t6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ vf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(vf0 vf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = vf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = vf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.t6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((vf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((vf0) obj).invalidate();
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
