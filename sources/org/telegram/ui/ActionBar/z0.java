package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z0 extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ d1 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(d1 d1Var, int i10) {
        super(false, true, true);
        this.d0 = i10;
        this.e0 = d1Var;
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
