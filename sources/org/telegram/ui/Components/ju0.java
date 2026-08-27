package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ju0 extends yk0 {
    public final Context c;
    public final /* synthetic */ lu0 d;

    public ju0(lu0 lu0Var, Context context) {
        this.d = lu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    @Override // f2.q0
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        TextView textView;
        int i11 = o1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.r7) o1Var.a).setDialog(lu0.q(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout r7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.c;
        lu0 lu0Var = this.d;
        if (i10 != 0) {
            r7Var = new ag.d(context, 17);
            r7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            lu0Var.e = textView;
            textView.setTextColor(lu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.J5));
            lu0Var.e.setTextSize(1, 14.0f);
            lu0Var.e.setGravity(17);
            lu0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            r7Var.addView(lu0Var.e, h7.z5.c(40.0f, -1));
        } else {
            c6Var = ((org.telegram.ui.ActionBar.e3) lu0Var).resourcesProvider;
            r7Var = new org.telegram.ui.Cells.r7(54, context, c6Var, false);
        }
        return new lk0(r7Var);
    }
}
