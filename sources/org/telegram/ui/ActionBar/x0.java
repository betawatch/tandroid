package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x0 extends p6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ b1 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.d0 = i10;
        this.e0 = b1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.d0) {
            case 0:
                this.e0.invalidate();
                break;
            default:
                this.e0.invalidate();
                break;
        }
    }
}
