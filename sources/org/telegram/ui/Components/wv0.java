package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wv0 extends im0 {
    public final Context c;
    public final /* synthetic */ yv0 d;

    public wv0(yv0 yv0Var, Context context) {
        this.d = yv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
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
            ((org.telegram.ui.Cells.v7) b1Var.a).setDialog(yv0.q(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout v7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.c;
        yv0 yv0Var = this.d;
        if (i10 != 0) {
            v7Var = new ci.i4(context, 18);
            v7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            yv0Var.e = textView;
            textView.setTextColor(yv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            yv0Var.e.setTextSize(1, 14.0f);
            yv0Var.e.setGravity(17);
            yv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            v7Var.addView(yv0Var.e, w7.z5.c(40.0f, -1));
        } else {
            d6Var = ((org.telegram.ui.ActionBar.f3) yv0Var).resourcesProvider;
            v7Var = new org.telegram.ui.Cells.v7(54, context, d6Var, false);
        }
        return new tl0(v7Var);
    }
}
