package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zs0 extends ClippingImageView {
    public final /* synthetic */ im0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs0(Context context, ku0 ku0Var) {
        super(context);
        this.R = ku0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
