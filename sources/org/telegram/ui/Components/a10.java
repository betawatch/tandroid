package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class a10 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int j1 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, true);
        int i3 = 1;
        this.w0 = false;
        this.v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        fh0 fh0Var = new fh0(context);
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        fh0Var.d();
        f10.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.j5, null, null, 2131749562);
        f10.addView(textView, b8.mf.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, b8.mf.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                z00 z00Var = new z00(context);
                View view = new View(context);
                z00Var.a = view;
                view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                z00Var.addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(context);
                z00Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
                z00Var.addView(textView2, b8.mf.e(-2, -2, 17));
                z00Var.setBackground(null);
                z00Var.setText(org.telegram.messenger.bd.M0(2131749563, null));
                view.setOnClickListener(new ct(this, context, d2Var, i3));
                f10.addView(z00Var, b8.mf.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                org.telegram.messenger.camera.q.o(textView3, org.telegram.ui.ActionBar.k6.n5, null, null, 2131749568);
                textView3.setGravity(17);
                f10.addView(textView3, b8.mf.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new f0(this, 19));
                return;
            }
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            linearLayout.addView(f11, b8.mf.t(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.k6.r5;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView4, i11, null);
            textView4.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
            if (i10 == 0) {
                textView4.setText(org.telegram.messenger.bd.M0(2131749566, null));
            } else if (i10 == 1) {
                textView4.setText(org.telegram.messenger.bd.M0(2131749565, null));
            } else if (i10 == 2) {
                textView4.setText(org.telegram.messenger.bd.M0(2131749564, null));
            }
            if (org.telegram.messenger.bd.a0) {
                f11.addView(textView4, b8.mf.o(-2, -2));
                f11.addView(imageView, b8.mf.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                f11.addView(imageView, b8.mf.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                f11.addView(textView4, b8.mf.o(-2, -2));
            }
            i10++;
        }
    }

    public abstract void I0();

    public abstract void J0();
}
