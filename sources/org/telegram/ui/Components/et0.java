package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class et0 extends ClippingImageView {
    public final /* synthetic */ mm0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(Context context, pu0 pu0Var) {
        super(context);
        this.R = pu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
