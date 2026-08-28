package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gu0 extends vk0 {
    public final Context c;
    public final /* synthetic */ iu0 d;

    public gu0(iu0 iu0Var, Context context) {
        this.d = iu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == 0 ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TextView textView;
        int i10 = q1Var.f;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.u7) q1Var.a).setDialog(iu0.p(i9 - 1));
        } else if (i10 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout u7Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.c;
        iu0 iu0Var = this.d;
        if (i9 != 0) {
            u7Var = new dh.g(context, 17);
            u7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            iu0Var.e = textView;
            textView.setTextColor(iu0Var.getThemedColor(org.telegram.ui.ActionBar.f6.J5));
            iu0Var.e.setTextSize(1, 14.0f);
            iu0Var.e.setGravity(17);
            iu0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            u7Var.addView(iu0Var.e, g7.e6.c(40.0f, -1));
        } else {
            b6Var = ((org.telegram.ui.ActionBar.f3) iu0Var).resourcesProvider;
            u7Var = new org.telegram.ui.Cells.u7(54, context, b6Var, false);
        }
        return new ik0(u7Var);
    }
}
