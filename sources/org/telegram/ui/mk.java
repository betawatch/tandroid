package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.pd {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ wn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(wn wnVar, Context context, boolean z10) {
        super(context);
        this.f = wnVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.pd
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.h6.ve;
        wn wnVar = this.f;
        setBackground(org.telegram.ui.ActionBar.h6.W(AndroidUtilities.dp(19.0f), 436207615 & wnVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(wnVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(wnVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.pd
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
