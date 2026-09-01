package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.ed {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(xn xnVar, Context context, boolean z4) {
        super(context);
        this.f = xnVar;
        this.e = z4;
    }

    @Override // org.telegram.ui.Components.ed
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.k6.ve;
        xn xnVar = this.f;
        setBackground(org.telegram.ui.ActionBar.k6.W(AndroidUtilities.dp(19.0f), 436207615 & xnVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(xnVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(xnVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.ed
    public final void setEditButton(boolean z4) {
        super.setEditButton(z4);
        if (this.e) {
            getTextView().setMaxWidth(z4 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
