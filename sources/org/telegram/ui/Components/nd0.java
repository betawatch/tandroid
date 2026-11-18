package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nd0 extends p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ qd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(qd0 qd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = qd0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = qd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((qd0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((qd0) obj).invalidate();
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
