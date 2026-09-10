package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class af0 extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ df0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(df0 df0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = df0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = df0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((df0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((df0) obj).invalidate();
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
