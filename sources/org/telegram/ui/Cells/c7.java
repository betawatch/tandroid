package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.z8 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(g6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((e7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((f7) this.E).a.invalidate();
                break;
        }
    }
}
