package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class me0 extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ pe0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(pe0 pe0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = pe0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = pe0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        switch (this.b) {
            case 0:
                this.c.r = f9;
                ((pe0) obj).invalidate();
                break;
            default:
                this.c.n = f9;
                ((pe0) obj).invalidate();
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
