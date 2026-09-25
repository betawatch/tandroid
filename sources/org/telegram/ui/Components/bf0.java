package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bf0 extends r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ef0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(ef0 ef0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ef0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ef0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                this.c.r = f7;
                ((ef0) obj).invalidate();
                break;
            default:
                this.c.n = f7;
                ((ef0) obj).invalidate();
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
