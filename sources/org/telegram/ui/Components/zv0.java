package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zv0 extends lm0 {
    public final Context c;
    public final /* synthetic */ bw0 d;

    public zv0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
            ((org.telegram.ui.Cells.v7) b1Var.a).setDialog(bw0.r(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout v7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        Context context = this.c;
        bw0 bw0Var = this.d;
        if (i10 != 0) {
            v7Var = new ci.h4(context, 18);
            v7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            bw0Var.e = textView;
            int i11 = org.telegram.ui.ActionBar.k6.J5;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) bw0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var2);
            bw0Var.e.setTextSize(1, 14.0f);
            bw0Var.e.setGravity(17);
            bw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            v7Var.addView(bw0Var.e, w7.z5.c(40.0f, -1));
        } else {
            g6Var = ((org.telegram.ui.ActionBar.h3) bw0Var).resourcesProvider;
            v7Var = new org.telegram.ui.Cells.v7(54, context, g6Var, false);
        }
        return new wl0(v7Var);
    }
}
