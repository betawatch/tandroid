package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class y0 extends o6 {
    public final /* synthetic */ int W;
    public final /* synthetic */ c1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(c1 c1Var, int i10) {
        super(false, true, true, false);
        this.W = i10;
        this.X = c1Var;
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
