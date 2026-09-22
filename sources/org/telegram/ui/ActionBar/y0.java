package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y0 extends n6 {
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
