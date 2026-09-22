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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class n20 extends org.telegram.ui.ActionBar.f3 {
    public n20(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
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
        linearLayout.addView(aj0Var, w7.x5.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.vl.k(24.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.x5.t(-2, -2, 1, 0, 12, 0, 0));
        for (int i10 = 0; i10 < 3; i10++) {
            LinearLayout f7 = org.telegram.messenger.vl.f(context, 0);
            linearLayout2.addView(f7, w7.x5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.i6.r5;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
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
                f7.addView(textView2, w7.x5.n(-2, -2));
                f7.addView(imageView, w7.x5.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                f7.addView(imageView, w7.x5.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                f7.addView(textView2, w7.x5.n(-2, -2));
            }
        }
        m20 m20Var = new m20(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
        m20Var.addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView3 = new TextView(context);
        m20Var.a = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        org.telegram.messenger.y0.q(textView3, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false), 1, 14.0f);
        m20Var.addView(textView3, w7.x5.e(-2, -2, 17));
        m20Var.setBackground(null);
        m20Var.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
        view.setOnClickListener(new ai.d0(this, context, n2Var, 22));
        linearLayout.addView(m20Var, w7.x5.t(-1, 50, 51, 0, 29, 0, 0));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.n5, false));
        org.telegram.messenger.vl.l(R.string.GigagroupConvertCancelButton, textView4, 17);
        linearLayout.addView(textView4, w7.x5.t(-2, 48, 49, 17, 0, 17, 16));
        textView4.setOnClickListener(new f0(this, 20));
    }

    public abstract void m();

    public abstract void n();
}
