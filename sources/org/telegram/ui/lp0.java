package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class lp0 extends LinearLayout {
    public final org.telegram.ui.Components.n90 a;
    public final org.telegram.ui.Components.n90 b;
    public final /* synthetic */ np0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(np0 np0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.c = np0Var;
        setOrientation(1);
        tp0 tp0Var = np0Var.p0;
        setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.y5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.h6.y6;
        d6Var = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
        org.telegram.ui.Components.n90 a2 = w7.c6.a(context2, 14.0f, i10, false, d6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(np0Var.m0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, w7.y5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        d6Var2 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
        org.telegram.ui.Components.n90 a10 = w7.c6.a(context3, 14.0f, i11, false, d6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new il0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.y5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        tp0 tp0Var = this.c.p0;
        setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        this.a.setTextColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        int themedColor = tp0Var.getThemedColor(i10);
        org.telegram.ui.Components.n90 n90Var = this.b;
        n90Var.setTextColor(themedColor);
        n90Var.setLinkTextColor(tp0Var.getThemedColor(i10));
    }
}
