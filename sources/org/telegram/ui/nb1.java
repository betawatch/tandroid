package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nb1 extends org.telegram.ui.ActionBar.h3 {
    public static nb1 b;

    public static /* synthetic */ void m(nb1 nb1Var, wy wyVar) {
        if (wyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(nb1Var.currentAccount).clearQueryTime();
        wyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(wy wyVar) {
        if (b == null) {
            nb1 nb1Var = new nb1(wyVar.getParentActivity(), false);
            Activity parentActivity = wyVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.a2.f(parentActivity, 1);
            org.telegram.ui.Components.kx0 kx0Var = new org.telegram.ui.Components.kx0(parentActivity, nb1Var.currentAccount);
            kx0Var.setStickerNum(7);
            kx0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(kx0Var, w7.a6.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.j6.j5;
            org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, w7.a6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(wyVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, w7.a6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
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
            f7.addView(textView3, w7.a6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new w71(5, nb1Var, wyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            nb1Var.setCustomView(scrollView);
            b = nb1Var;
            nb1Var.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        b = null;
    }
}
