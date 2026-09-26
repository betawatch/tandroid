package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x0 extends o6 {
    public final /* synthetic */ int W;
    public final /* synthetic */ b1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(b1 b1Var, int i10) {
        super(false, true, true, false);
        this.W = i10;
        this.X = b1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidate();
                break;
            default:
                this.X.invalidate();
                break;
        }
    }
}
