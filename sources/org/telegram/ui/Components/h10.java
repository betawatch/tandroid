package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class h10 extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int m1 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, true);
        int i7 = 1;
        this.w0 = false;
        this.v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        fh0 fh0Var = new fh0(context);
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        fh0Var.d();
        f10.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.q2, org.telegram.messenger.ns.q2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 24.0f);
        org.telegram.messenger.i20.q(textView, org.telegram.ui.ActionBar.j6.j5, null, null, 2131749554);
        f10.addView(textView, c8.ja.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, c8.ja.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                g10 g10Var = new g10(context);
                View view = new View(context);
                g10Var.a = view;
                view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
                g10Var.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(context);
                g10Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, null, 1, 14.0f);
                g10Var.addView(textView2, c8.ja.e(-2, -2, 17));
                g10Var.setBackground(null);
                g10Var.setText(org.telegram.messenger.hd.M0(2131749555, null));
                view.setOnClickListener(new lt(this, context, e2Var, i7));
                f10.addView(g10Var, c8.ja.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                org.telegram.messenger.i20.q(textView3, org.telegram.ui.ActionBar.j6.n5, null, null, 2131749560);
                textView3.setGravity(17);
                f10.addView(textView3, c8.ja.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new e0(this, 20));
                return;
            }
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            linearLayout.addView(f11, c8.ja.t(-2, -2, org.telegram.messenger.hd.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.j6.r5;
            org.telegram.ui.ActionBar.q6.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.q6.U(textView4, i11, null);
            textView4.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
            if (i10 == 0) {
                textView4.setText(org.telegram.messenger.hd.M0(2131749558, null));
            } else if (i10 == 1) {
                textView4.setText(org.telegram.messenger.hd.M0(2131749557, null));
            } else if (i10 == 2) {
                textView4.setText(org.telegram.messenger.hd.M0(2131749556, null));
            }
            if (org.telegram.messenger.hd.a0) {
                f11.addView(textView4, c8.ja.o(-2, -2));
                f11.addView(imageView, c8.ja.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                f11.addView(imageView, c8.ja.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                f11.addView(textView4, c8.ja.o(-2, -2));
            }
            i10++;
        }
    }

    public abstract void I0();

    public abstract void J0();
}
