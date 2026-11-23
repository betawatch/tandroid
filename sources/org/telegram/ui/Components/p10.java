package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class p10 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int m1 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, true);
        int i7 = 1;
        this.w0 = false;
        this.v0 = false;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        this.O = g10;
        qh0 qh0Var = new qh0(context);
        qh0Var.setAutoRepeat(true);
        qh0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        qh0Var.d();
        g10.addView(qh0Var, c8.na.t(org.telegram.messenger.ks.q2, org.telegram.messenger.ks.q2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.m10.p(textView, 1, 24.0f);
        org.telegram.messenger.m10.r(textView, org.telegram.ui.ActionBar.n6.j5, null, null, 2131749378);
        g10.addView(textView, c8.na.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g10.addView(linearLayout, c8.na.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                o10 o10Var = new o10(context);
                View view = new View(context);
                o10Var.a = view;
                view.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
                o10Var.addView(view, c8.na.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(context);
                o10Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.Ji, null, 1, 14.0f);
                o10Var.addView(textView2, c8.na.e(-2, -2, 17));
                o10Var.setBackground(null);
                o10Var.setText(org.telegram.messenger.gd.N0(2131749379, null));
                view.setOnClickListener(new qt(this, context, g2Var, i7));
                g10.addView(o10Var, c8.na.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                org.telegram.messenger.m10.r(textView3, org.telegram.ui.ActionBar.n6.n5, null, null, 2131749384);
                textView3.setGravity(17);
                g10.addView(textView3, c8.na.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new n0(this, 21));
                return;
            }
            LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
            linearLayout.addView(g11, c8.na.t(-2, -2, org.telegram.messenger.gd.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.n6.r5;
            org.telegram.ui.ActionBar.u6.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.u6.U(textView4, i11, null);
            textView4.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
            if (i10 == 0) {
                textView4.setText(org.telegram.messenger.gd.N0(2131749382, null));
            } else if (i10 == 1) {
                textView4.setText(org.telegram.messenger.gd.N0(2131749381, null));
            } else if (i10 == 2) {
                textView4.setText(org.telegram.messenger.gd.N0(2131749380, null));
            }
            if (org.telegram.messenger.gd.a0) {
                g11.addView(textView4, c8.na.o(-2, -2));
                g11.addView(imageView, c8.na.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                g11.addView(imageView, c8.na.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                g11.addView(textView4, c8.na.o(-2, -2));
            }
            i10++;
        }
    }

    public abstract void J0();

    public abstract void K0();
}
