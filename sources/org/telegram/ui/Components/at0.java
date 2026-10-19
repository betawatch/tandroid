package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class at0 extends ClippingImageView {
    public final /* synthetic */ im0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(Context context, lu0 lu0Var) {
        super(context);
        this.R = lu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
