package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bv0 extends ll0 {
    public final Context c;
    public final /* synthetic */ dv0 d;

    public bv0(dv0 dv0Var, Context context) {
        this.d = dv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TextView textView;
        int i11 = c1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.w7) c1Var.a).setDialog(dv0.p(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        dv0 dv0Var = this.d;
        if (i10 != 0) {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            dv0Var.e = textView;
            textView.setTextColor(dv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.J5));
            dv0Var.e.setTextSize(1, 14.0f);
            dv0Var.e.setGravity(17);
            dv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(dv0Var.e, w7.x5.c(40.0f, -1));
        } else {
            f6Var = ((org.telegram.ui.ActionBar.g3) dv0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, f6Var, false);
        }
        return new wk0(w7Var);
    }
}
