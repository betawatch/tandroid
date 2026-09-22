package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.m6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y0 extends m6 {
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
