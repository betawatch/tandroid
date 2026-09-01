package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class we0 extends m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ af0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we0(af0 af0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = af0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = af0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((af0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((af0) obj).invalidate();
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
