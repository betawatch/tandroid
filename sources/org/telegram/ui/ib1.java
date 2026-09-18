package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.ActionBar.g3 {
    public static ib1 b;

    public static /* synthetic */ void m(ib1 ib1Var, wy wyVar) {
        if (wyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(ib1Var.currentAccount).clearQueryTime();
        wyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(wy wyVar) {
        if (b == null) {
            ib1 ib1Var = new ib1(wyVar.getParentActivity(), false);
            Activity parentActivity = wyVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.w1.f(parentActivity, 1);
            org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(parentActivity, ib1Var.currentAccount);
            ax0Var.setStickerNum(7);
            ax0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(ax0Var, w7.x5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.j6.j5;
            org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, w7.x5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(wyVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, w7.x5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, k10, k10));
            f7.addView(textView3, w7.x5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new xy0(8, ib1Var, wyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            ib1Var.setCustomView(scrollView);
            b = ib1Var;
            ib1Var.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        b = null;
    }
}
