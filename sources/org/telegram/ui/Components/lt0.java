package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lt0 extends ClippingImageView {
    public final /* synthetic */ mm0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(Context context, su0 su0Var) {
        super(context);
        this.R = su0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
