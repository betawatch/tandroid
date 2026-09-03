package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fp0 extends LinearLayout {
    public final org.telegram.ui.Components.f90 a;
    public final org.telegram.ui.Components.f90 b;
    public final /* synthetic */ hp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(hp0 hp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.c = hp0Var;
        setOrientation(1);
        np0 np0Var = hp0Var.m0;
        setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        p9Var.setImageDrawable(new org.telegram.ui.Components.gj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(p9Var, k7.b6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        f6Var = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
        org.telegram.ui.Components.f90 a2 = k7.f6.a(context2, 14.0f, i10, false, f6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(hp0Var.j0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, k7.b6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
        org.telegram.ui.Components.f90 a10 = k7.f6.a(context3, 14.0f, i11, false, f6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new gl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, k7.b6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        np0 np0Var = this.c.m0;
        setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.a.setTextColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = np0Var.getThemedColor(i10);
        org.telegram.ui.Components.f90 f90Var = this.b;
        f90Var.setTextColor(themedColor);
        f90Var.setLinkTextColor(np0Var.getThemedColor(i10));
    }
}
