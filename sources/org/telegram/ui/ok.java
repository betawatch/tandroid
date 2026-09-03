package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.ed {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ zn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(zn znVar, Context context, boolean z4) {
        super(context);
        this.f = znVar;
        this.e = z4;
    }

    @Override // org.telegram.ui.Components.ed
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.j6.ve;
        zn znVar = this.f;
        setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), 436207615 & znVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(znVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(znVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.ed
    public final void setEditButton(boolean z4) {
        super.setEditButton(z4);
        if (this.e) {
            getTextView().setMaxWidth(z4 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
