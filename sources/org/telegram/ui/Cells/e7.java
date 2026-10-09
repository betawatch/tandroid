package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.j9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(e6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((g7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((h7) this.E).a.invalidate();
                break;
        }
    }
}
