package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class a30 extends org.telegram.ui.ActionBar.e3 {
    public a30(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        bk0 bk0Var = new bk0(context);
        bk0Var.setAutoRepeat(true);
        bk0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        bk0Var.d();
        linearLayout.addView(bk0Var, w7.a6.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.yh.k(24.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.a6.t(-2, -2, 1, 0, 12, 0, 0));
        for (int i10 = 0; i10 < 3; i10++) {
            LinearLayout e = org.telegram.messenger.yh.e(context, 0);
            linearLayout2.addView(e, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.r5;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i10 == 0) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
            } else if (i10 == 1) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
            } else if (i10 == 2) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
            }
            if (LocaleController.isRTL) {
                e.addView(textView2, w7.a6.n(-2, -2));
                e.addView(imageView, w7.a6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                e.addView(imageView, w7.a6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                e.addView(textView2, w7.a6.n(-2, -2));
            }
        }
        z20 z20Var = new z20(context);
        View view = new View(context);
        z20Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        z20Var.addView(view, w7.a6.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        TextView textView3 = new TextView(context);
        z20Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        org.telegram.messenger.q.n(14.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, textView3);
        z20Var.addView(textView3, w7.a6.e(-2, -2, 17));
        z20Var.setBackground(null);
        z20Var.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
        view.setOnClickListener(new bi.x(this, context, m2Var, 22));
        linearLayout.addView(z20Var, w7.a6.t(-1, 50, 51, 0, 29, 0, 0));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n5, false));
        org.telegram.messenger.yh.l(R.string.GigagroupConvertCancelButton, textView4, 17);
        linearLayout.addView(textView4, w7.a6.t(-2, 48, 49, 17, 0, 17, 16));
        textView4.setOnClickListener(new f0(this, 19));
    }

    public abstract void n();

    public abstract void o();
}
