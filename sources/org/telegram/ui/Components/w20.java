package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class w20 extends org.telegram.ui.ActionBar.h3 {
    public w20(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
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
        linearLayout.addView(bk0Var, w7.z5.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.sl.k(24.0f, 1, textView);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                v20 v20Var = new v20(context);
                View view = new View(context);
                v20Var.a = view;
                view.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                v20Var.addView(view, w7.z5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(context);
                v20Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.Sh, null, 1, 14.0f);
                v20Var.addView(textView2, w7.z5.e(-2, -2, 17));
                v20Var.setBackground(null);
                v20Var.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
                view.setOnClickListener(new ai.v0(this, context, o2Var, 25));
                linearLayout.addView(v20Var, w7.z5.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.n5, null);
                org.telegram.messenger.sl.m(R.string.GigagroupConvertCancelButton, textView3, 17);
                linearLayout.addView(textView3, w7.z5.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new f0(this, 19));
                return;
            }
            LinearLayout e = org.telegram.messenger.sl.e(context, 0);
            linearLayout2.addView(e, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.k6.r5;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(textView4, i11, null);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i10 == 0) {
                textView4.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
            } else if (i10 == 1) {
                textView4.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
            } else if (i10 == 2) {
                textView4.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
            }
            if (LocaleController.isRTL) {
                e.addView(textView4, w7.z5.n(-2, -2));
                e.addView(imageView, w7.z5.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                e.addView(imageView, w7.z5.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                e.addView(textView4, w7.z5.n(-2, -2));
            }
            i10++;
        }
    }

    public abstract void m();

    public abstract void n();
}
