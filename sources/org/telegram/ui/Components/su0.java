package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class su0 extends il0 {
    public final Context c;
    public final /* synthetic */ uu0 d;

    public su0(uu0 uu0Var, Context context) {
        this.d = uu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
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
    public final void v(f2.n1 n1Var, int i10) {
        TextView textView;
        int i11 = n1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.s7) n1Var.a).setDialog(uu0.p(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout s7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.c;
        uu0 uu0Var = this.d;
        if (i10 != 0) {
            s7Var = new bh.d(context, 19);
            s7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            uu0Var.e = textView;
            textView.setTextColor(uu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.J5));
            uu0Var.e.setTextSize(1, 14.0f);
            uu0Var.e.setGravity(17);
            uu0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            s7Var.addView(uu0Var.e, i7.f6.c(40.0f, -1));
        } else {
            c6Var = ((org.telegram.ui.ActionBar.f3) uu0Var).resourcesProvider;
            s7Var = new org.telegram.ui.Cells.s7(54, context, c6Var, false);
        }
        return new vk0(s7Var);
    }
}
