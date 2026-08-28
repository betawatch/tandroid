package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.dd {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(qn qnVar, Context context, boolean z10) {
        super(context);
        this.f = qnVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i9 = org.telegram.ui.ActionBar.f6.ve;
        qn qnVar = this.f;
        setBackground(org.telegram.ui.ActionBar.f6.W(AndroidUtilities.dp(19.0f), 436207615 & qnVar.getThemedColor(i9), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(qnVar.getThemedColor(i9), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(qnVar.getThemedColor(i9));
    }

    @Override // org.telegram.ui.Components.dd
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
