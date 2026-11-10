package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class d10 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int l1 = 0;

    public d10(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, true);
        this.v0 = false;
        this.u0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.N = f10;
        ch0 ch0Var = new ch0(context);
        ch0Var.setAutoRepeat(true);
        ch0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        ch0Var.d();
        f10.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.m6.j5, null, null, 2131749554);
        f10.addView(textView, c8.ha.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, c8.ha.t(-2, -2, 1, 0, 12, 0, 0));
        int i7 = 0;
        while (true) {
            if (i7 >= 3) {
                c10 c10Var = new c10(context);
                View view = new View(context);
                c10Var.a = view;
                view.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                c10Var.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(context);
                c10Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.Gi, null, 1, 14.0f);
                c10Var.addView(textView2, c8.ha.e(-2, -2, 17));
                c10Var.setBackground(null);
                c10Var.setText(org.telegram.messenger.id.M0(2131749555, null));
                view.setOnClickListener(new ah.g(this, context, f2Var, 26));
                f10.addView(c10Var, c8.ha.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                org.telegram.messenger.camera.q.o(textView3, org.telegram.ui.ActionBar.m6.n5, null, null, 2131749560);
                textView3.setGravity(17);
                f10.addView(textView3, c8.ha.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new g0(this, 19));
                return;
            }
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            linearLayout.addView(f11, c8.ha.t(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i10 = org.telegram.ui.ActionBar.m6.r5;
            org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView4, i10, null);
            textView4.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
            if (i7 == 0) {
                textView4.setText(org.telegram.messenger.id.M0(2131749558, null));
            } else if (i7 == 1) {
                textView4.setText(org.telegram.messenger.id.M0(2131749557, null));
            } else if (i7 == 2) {
                textView4.setText(org.telegram.messenger.id.M0(2131749556, null));
            }
            if (org.telegram.messenger.id.a0) {
                f11.addView(textView4, c8.ha.o(-2, -2));
                f11.addView(imageView, c8.ha.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                f11.addView(imageView, c8.ha.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                f11.addView(textView4, c8.ha.o(-2, -2));
            }
            i7++;
        }
    }

    public abstract void I0();

    public abstract void J0();
}
