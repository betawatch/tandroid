package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.hd {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(tn tnVar, Context context, boolean z10) {
        super(context);
        this.f = tnVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.hd
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.g6.ve;
        tn tnVar = this.f;
        setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), 436207615 & tnVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(tnVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(tnVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.hd
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
