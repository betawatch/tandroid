package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yd0 extends l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ be0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd0(be0 be0Var, int i9) {
        super("thumbAnimationProgress", 0);
        this.b = i9;
        switch (i9) {
            case 1:
                this.c = be0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = be0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((be0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
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
