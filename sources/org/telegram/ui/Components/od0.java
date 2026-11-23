package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class od0 extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ rd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(rd0 rd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = rd0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = rd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((rd0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((rd0) obj).invalidate();
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
