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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class j20 extends org.telegram.ui.ActionBar.f3 {
    public j20(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        aj0 aj0Var = new aj0(context);
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        aj0Var.d();
        linearLayout.addView(aj0Var, i7.f6.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, i7.f6.t(-2, -2, 1, 0, 12, 0, 0));
        for (int i10 = 0; i10 < 3; i10++) {
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
            linearLayout2.addView(g10, i7.f6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.r5;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
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
                g10.addView(textView2, i7.f6.n(-2, -2));
                g10.addView(imageView, i7.f6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                g10.addView(imageView, i7.f6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                g10.addView(textView2, i7.f6.n(-2, -2));
            }
        }
        i20 i20Var = new i20(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        i20Var.addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView3 = new TextView(context);
        i20Var.a = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        org.telegram.messenger.x3.t(textView3, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
        i20Var.addView(textView3, i7.f6.e(-2, -2, 17));
        i20Var.setBackground(null);
        i20Var.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
        view.setOnClickListener(new bg.q(this, context, o2Var, 28));
        linearLayout.addView(i20Var, i7.f6.t(-1, 50, 51, 0, 29, 0, 0));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n5, false));
        org.telegram.ui.b.i(R.string.GigagroupConvertCancelButton, textView4, 17);
        linearLayout.addView(textView4, i7.f6.t(-2, 48, 49, 17, 0, 17, 16));
        textView4.setOnClickListener(new h0(this, 20));
    }

    public abstract void m();

    public abstract void n();
}
