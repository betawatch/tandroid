package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ze0 extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ cf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze0(cf0 cf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = cf0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = cf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((cf0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((cf0) obj).invalidate();
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
