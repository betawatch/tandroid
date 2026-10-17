package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.nd {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ sn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(sn snVar, Context context, boolean z10) {
        super(context);
        this.f = snVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.nd
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.h6.ve;
        sn snVar = this.f;
        setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), 436207615 & snVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(snVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(snVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.nd
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
