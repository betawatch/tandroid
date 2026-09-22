package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.md {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ bo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(bo boVar, Context context, boolean z10) {
        super(context);
        this.f = boVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.md
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.i6.ve;
        bo boVar = this.f;
        setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(19.0f), 436207615 & boVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(boVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(boVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.md
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
