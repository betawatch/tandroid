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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class y10 extends org.telegram.ui.ActionBar.f3 {
    public y10(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        pi0 pi0Var = new pi0(context);
        pi0Var.setAutoRepeat(true);
        pi0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        pi0Var.d();
        linearLayout.addView(pi0Var, g7.e6.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(24.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, g7.e6.t(-2, -2, 1, 0, 12, 0, 0));
        for (int i9 = 0; i9 < 3; i9++) {
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
            linearLayout2.addView(f10, g7.e6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i10 = org.telegram.ui.ActionBar.f6.r5;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i9 == 0) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
            } else if (i9 == 1) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
            } else if (i9 == 2) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
            }
            if (LocaleController.isRTL) {
                f10.addView(textView2, g7.e6.n(-2, -2));
                f10.addView(imageView, g7.e6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                f10.addView(imageView, g7.e6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                f10.addView(textView2, g7.e6.n(-2, -2));
            }
        }
        x10 x10Var = new x10(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
        x10Var.addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView3 = new TextView(context);
        x10Var.a = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        org.telegram.messenger.l0.q(textView3, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), 1, 14.0f);
        x10Var.addView(textView3, g7.e6.e(-2, -2, 17));
        x10Var.setBackground(null);
        x10Var.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
        view.setOnClickListener(new fg.f(this, context, o2Var, 27));
        linearLayout.addView(x10Var, g7.e6.t(-1, 50, 51, 0, 29, 0, 0));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n5, false));
        org.telegram.messenger.ll.l(R.string.GigagroupConvertCancelButton, textView4, 17);
        linearLayout.addView(textView4, g7.e6.t(-2, 48, 49, 17, 0, 17, 16));
        textView4.setOnClickListener(new f0(this, 20));
    }

    public abstract void m();

    public abstract void n();
}
