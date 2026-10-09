package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dw0 extends pm0 {
    public final Context c;
    public final /* synthetic */ fw0 d;

    public dw0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // s4.i0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        TextView textView;
        int i11 = d1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.w7) d1Var.a).setDialog(fw0.r(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.c;
        fw0 fw0Var = this.d;
        if (i10 != 0) {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            fw0Var.e = textView;
            textView.setTextColor(fw0Var.getThemedColor(org.telegram.ui.ActionBar.i6.J5));
            fw0Var.e.setTextSize(1, 14.0f);
            fw0Var.e.setGravity(17);
            fw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(fw0Var.e, w7.x5.d(40.0f, -1));
        } else {
            e6Var = ((org.telegram.ui.ActionBar.f3) fw0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, e6Var, false);
        }
        return new am0(w7Var);
    }
}
