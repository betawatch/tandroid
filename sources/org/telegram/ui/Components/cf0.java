package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class cf0 extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ff0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(ff0 ff0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ff0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ff0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((ff0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((ff0) obj).invalidate();
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
