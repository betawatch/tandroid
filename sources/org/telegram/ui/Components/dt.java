package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dt extends org.telegram.ui.ActionBar.h3 {
    public static /* synthetic */ void m(dt dtVar) {
        dtVar.dismiss();
        DownloadController.getInstance(dtVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void n(Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == null || activity == null) {
            return;
        }
        final dt dtVar = new dt(activity, false);
        dtVar.setApplyBottomPadding(false);
        dtVar.setApplyTopPadding(false);
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        dtVar.fixNavigationBar(dtVar.getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(activity);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(dtVar.getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
        imageView.setColorFilter(dtVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(dtVar) { // from class: org.telegram.ui.Components.ct
            public final /* synthetic */ dt b;

            {
                this.b = dtVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        dt.m(this.b);
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, k7.c6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        bx0 bx0Var = new bx0(activity, dtVar.currentAccount);
        bx0Var.setStickerNum(9);
        bx0Var.getImageReceiver().setAutoRepeat(1);
        linearLayout.addView(bx0Var, k7.c6.t(110, 110, 1, 0, 26, 0, 0));
        TextView textView = new TextView(activity);
        textView.setGravity(1);
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.DownloadedFiles));
        linearLayout.addView(textView, k7.c6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
        linearLayout.addView(textView2, k7.c6.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        textView3.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        textView3.setSingleLine(true);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i13, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, w02, k10, k10));
        linearLayout.addView(textView3, k7.c6.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
        TextView textView4 = new TextView(activity);
        textView4.setGravity(17);
        textView4.setEllipsize(truncateAt);
        textView4.setSingleLine(true);
        textView4.setTextSize(1, 14.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
        textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        int dp3 = AndroidUtilities.dp(8.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i13, false), 120);
        textView4.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        textView4.setLetterSpacing(0.025f);
        linearLayout.addView(textView4, k7.c6.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
        NestedScrollView nestedScrollView = new NestedScrollView(activity);
        nestedScrollView.addView(frameLayout);
        dtVar.setCustomView(nestedScrollView);
        textView3.setOnClickListener(new w2(15, dtVar, p2Var));
        final int i14 = 1;
        textView4.setOnClickListener(new View.OnClickListener(dtVar) { // from class: org.telegram.ui.Components.ct
            public final /* synthetic */ dt b;

            {
                this.b = dtVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        dt.m(this.b);
                        break;
                }
            }
        });
        dtVar.show();
    }
}
