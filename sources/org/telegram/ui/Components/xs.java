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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xs extends org.telegram.ui.ActionBar.f3 {
    public static /* synthetic */ void m(xs xsVar) {
        xsVar.dismiss();
        DownloadController.getInstance(xsVar.currentAccount).clearRecentDownloadedFiles();
    }

    public static void n(Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null || activity == null) {
            return;
        }
        final xs xsVar = new xs(activity, false);
        xsVar.setApplyBottomPadding(false);
        xsVar.setApplyTopPadding(false);
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        xsVar.fixNavigationBar(xsVar.getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(activity);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(xsVar.getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        imageView.setColorFilter(xsVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(xsVar) { // from class: org.telegram.ui.Components.ws
            public final /* synthetic */ xs b;

            {
                this.b = xsVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        xs.m(this.b);
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, i7.f6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        rw0 rw0Var = new rw0(activity, xsVar.currentAccount);
        rw0Var.setStickerNum(9);
        rw0Var.getImageReceiver().setAutoRepeat(1);
        linearLayout.addView(rw0Var, i7.f6.t(110, 110, 1, 0, 26, 0, 0));
        TextView textView = new TextView(activity);
        textView.setGravity(1);
        int i12 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.DownloadedFiles));
        linearLayout.addView(textView, i7.f6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
        linearLayout.addView(textView2, i7.f6.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        textView3.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        textView3.setSingleLine(true);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, w02, k9, k9));
        linearLayout.addView(textView3, i7.f6.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
        TextView textView4 = new TextView(activity);
        textView4.setGravity(17);
        textView4.setEllipsize(truncateAt);
        textView4.setSingleLine(true);
        textView4.setTextSize(1, 14.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int dp3 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 120);
        textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, k10, k10));
        textView4.setLetterSpacing(0.025f);
        linearLayout.addView(textView4, i7.f6.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
        NestedScrollView nestedScrollView = new NestedScrollView(activity);
        nestedScrollView.addView(frameLayout);
        xsVar.setCustomView(nestedScrollView);
        textView3.setOnClickListener(new t2(18, xsVar, o2Var));
        final int i14 = 1;
        textView4.setOnClickListener(new View.OnClickListener(xsVar) { // from class: org.telegram.ui.Components.ws
            public final /* synthetic */ xs b;

            {
                this.b = xsVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        xs.m(this.b);
                        break;
                }
            }
        });
        xsVar.show();
    }
}
