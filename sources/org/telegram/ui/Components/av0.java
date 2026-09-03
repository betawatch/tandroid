package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class av0 extends rl0 {
    public final Context c;
    public final /* synthetic */ cv0 d;

    public av0(cv0 cv0Var, Context context) {
        this.d = cv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TextView textView;
        int i11 = m1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.u7) m1Var.a).setDialog(cv0.p(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout u7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.c;
        cv0 cv0Var = this.d;
        if (i10 != 0) {
            u7Var = new eh.d(context, 18);
            u7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            cv0Var.e = textView;
            textView.setTextColor(cv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.J5));
            cv0Var.e.setTextSize(1, 14.0f);
            cv0Var.e.setGravity(17);
            cv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            u7Var.addView(cv0Var.e, k7.c6.c(40.0f, -1));
        } else {
            g6Var = ((org.telegram.ui.ActionBar.h3) cv0Var).resourcesProvider;
            u7Var = new org.telegram.ui.Cells.u7(54, context, g6Var, false);
        }
        return new el0(u7Var);
    }
}
