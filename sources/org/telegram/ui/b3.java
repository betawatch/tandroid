package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final org.telegram.ui.Components.i9 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final hi.d h;
    public ValueAnimator n;
    public boolean r;

    public b3(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, c8.ja.e(-2, -2, 17));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.c = i9Var;
        linearLayout.addView(i9Var, c8.ja.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 15.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(false);
        f10.setMaxLines(3);
        TextView f11 = org.telegram.messenger.i20.f(linearLayout, f10, c8.ja.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = f11;
        f11.setTextSize(1, 12.0f);
        f11.setTextColor(-1);
        f11.setAlpha(0.4f);
        linearLayout.addView(f11, c8.ja.r(-2, -2, 3));
        hi.d dVar = new hi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(org.telegram.messenger.g0.L(140.0f));
        dVar.i(org.telegram.messenger.hd.M0(2131746340, null), false, true);
        linearLayout.addView(dVar, c8.ja.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.hd.M0(2131742922, null));
        org.telegram.messenger.k5.q(null, null, 2131742924, new Object[]{str}, this.e);
        this.f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            this.d.setTextColor(!z10 ? -16777216 : -1);
            this.e.setTextColor(!z10 ? -16777216 : -1);
            this.f.setTextColor(z10 ? -1 : -16777216);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 0));
            this.n.start();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0 || this.b) {
            return;
        }
        this.b = true;
        org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).c2(this.c, "tg_placeholders_android", "🧐", "100_100");
    }
}
