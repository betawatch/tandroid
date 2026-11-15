package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s0 extends org.telegram.ui.Components.g6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ w0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.e0 = i7;
        this.f0 = w0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.e0) {
            case 0:
                this.f0.invalidate();
                break;
            default:
                this.f0.invalidate();
                break;
        }
    }
}
