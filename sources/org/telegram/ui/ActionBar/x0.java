package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x0 extends p6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ b1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.e0 = i10;
        this.f0 = b1Var;
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
