package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dd0 extends j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ gd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(gd0 gd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = gd0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = gd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((gd0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((gd0) obj).invalidate();
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
