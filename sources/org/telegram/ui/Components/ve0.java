package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ve0 extends m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ze0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve0(ze0 ze0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ze0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.c = ze0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                this.c.r = f10;
                ((ze0) obj).invalidate();
                break;
            default:
                this.c.n = f10;
                ((ze0) obj).invalidate();
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
