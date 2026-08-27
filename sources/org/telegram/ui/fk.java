package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fk extends org.telegram.ui.Components.ad {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ rn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(rn rnVar, Context context, boolean z10) {
        super(context);
        this.f = rnVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.ad
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.g6.ve;
        rn rnVar = this.f;
        setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), 436207615 & rnVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(rnVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(rnVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.ad
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
