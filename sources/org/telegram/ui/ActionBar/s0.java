package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s0 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ w0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.d0 = i7;
        this.e0 = w0Var;
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
