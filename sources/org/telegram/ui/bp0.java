package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bp0 extends LinearLayout {
    public final org.telegram.ui.Components.g90 a;
    public final org.telegram.ui.Components.g90 b;
    public final /* synthetic */ dp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(dp0 dp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.c = dp0Var;
        setOrientation(1);
        ip0 ip0Var = dp0Var.g0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        p9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), "utyan_draw", AndroidUtilities.dp(120.0f)));
        addView(p9Var, k7.c6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
        org.telegram.ui.Components.g90 a2 = k7.g6.a(context2, 14.0f, i10, false, g6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(dp0Var.d0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, k7.c6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.k6.gc;
        g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
        org.telegram.ui.Components.g90 a10 = k7.g6.a(context3, 14.0f, i11, false, g6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new gl0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, k7.c6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        ip0 ip0Var = this.c.g0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.a.setTextColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.y6));
        int i10 = org.telegram.ui.ActionBar.k6.gc;
        int themedColor = ip0Var.getThemedColor(i10);
        org.telegram.ui.Components.g90 g90Var = this.b;
        g90Var.setTextColor(themedColor);
        g90Var.setLinkTextColor(ip0Var.getThemedColor(i10));
    }
}
