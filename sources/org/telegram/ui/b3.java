package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final org.telegram.ui.Components.q9 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final hi.e h;
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
        addView(linearLayout, c8.ma.e(-2, -2, 17));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        linearLayout.addView(q9Var, c8.ma.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 15.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(false);
        f10.setMaxLines(3);
        TextView f11 = org.telegram.messenger.o10.f(linearLayout, f10, c8.ma.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = f11;
        f11.setTextSize(1, 12.0f);
        f11.setTextColor(-1);
        f11.setAlpha(0.4f);
        linearLayout.addView(f11, c8.ma.r(-2, -2, 3));
        hi.e eVar = new hi.e(context, null, true);
        this.h = eVar;
        eVar.setMinWidth(org.telegram.messenger.g0.L(140.0f));
        eVar.i(org.telegram.messenger.hd.N0(2131746144, null), false, true);
        linearLayout.addView(eVar, c8.ma.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.hd.N0(2131742656, null));
        org.telegram.messenger.f3.q(null, null, 2131742658, new Object[]{str}, this.e);
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
        org.telegram.messenger.si.d0(org.telegram.messenger.k10.t0).h2(this.c, "tg_placeholders_android", "🧐", "100_100");
    }
}
