package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class av0 extends ql0 {
    public final Context c;
    public final /* synthetic */ cv0 d;

    public av0(cv0 cv0Var, Context context) {
        this.d = cv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TextView textView;
        int i11 = l1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.t7) l1Var.a).setDialog(cv0.p(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout t7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        cv0 cv0Var = this.d;
        if (i10 != 0) {
            t7Var = new dh.d(context, 18);
            t7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            cv0Var.e = textView;
            textView.setTextColor(cv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.J5));
            cv0Var.e.setTextSize(1, 14.0f);
            cv0Var.e.setGravity(17);
            cv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            t7Var.addView(cv0Var.e, k7.b6.c(40.0f, -1));
        } else {
            f6Var = ((org.telegram.ui.ActionBar.g3) cv0Var).resourcesProvider;
            t7Var = new org.telegram.ui.Cells.t7(54, context, f6Var, false);
        }
        return new dl0(t7Var);
    }
}
