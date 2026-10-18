package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class uv0 extends hm0 {
    public final Context c;
    public final /* synthetic */ wv0 d;

    public uv0(wv0 wv0Var, Context context) {
        this.d = wv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TextView textView;
        int i11 = b1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.v7) b1Var.a).setDialog(wv0.q(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout v7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.c;
        wv0 wv0Var = this.d;
        if (i10 != 0) {
            v7Var = new ci.i4(context, 18);
            v7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            wv0Var.e = textView;
            textView.setTextColor(wv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            wv0Var.e.setTextSize(1, 14.0f);
            wv0Var.e.setGravity(17);
            wv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            v7Var.addView(wv0Var.e, w7.z5.d(40.0f, -1));
        } else {
            d6Var = ((org.telegram.ui.ActionBar.f3) wv0Var).resourcesProvider;
            v7Var = new org.telegram.ui.Cells.v7(54, context, d6Var, false);
        }
        return new sl0(v7Var);
    }
}
