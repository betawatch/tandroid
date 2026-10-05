package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.pd {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ yn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(yn ynVar, Context context, boolean z10) {
        super(context);
        this.f = ynVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.pd
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.i6.ve;
        yn ynVar = this.f;
        setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(19.0f), 436207615 & ynVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(ynVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(ynVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.pd
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
