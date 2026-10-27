package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dw0 extends mm0 {
    public final Context c;
    public final /* synthetic */ fw0 d;

    public dw0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
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
    public final void v(s4.e1 e1Var, int i10) {
        TextView textView;
        int i11 = e1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.z7) e1Var.a).setDialog(fw0.q(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout z7Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        Context context = this.c;
        fw0 fw0Var = this.d;
        if (i10 != 0) {
            z7Var = new di.i4(context, 17);
            z7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            fw0Var.e = textView;
            int i11 = org.telegram.ui.ActionBar.y6.J5;
            u6Var2 = ((org.telegram.ui.ActionBar.k3) fw0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var2);
            fw0Var.e.setTextSize(1, 14.0f);
            fw0Var.e.setGravity(17);
            fw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            z7Var.addView(fw0Var.e, kb1.g(40.0f, -1));
        } else {
            u6Var = ((org.telegram.ui.ActionBar.k3) fw0Var).resourcesProvider;
            z7Var = new org.telegram.ui.Cells.z7(54, context, u6Var, false);
        }
        return new wl0(z7Var);
    }
}
