package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c3 extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final org.telegram.ui.Components.k9 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final gi.d h;
    public ValueAnimator n;
    public boolean r;

    public c3(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, b8.mf.e(-2, -2, 17));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        linearLayout.addView(k9Var, b8.mf.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 15.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(false);
        f10.setMaxLines(3);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, f10, b8.mf.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = f11;
        f11.setTextSize(1, 12.0f);
        f11.setTextColor(-1);
        f11.setAlpha(0.4f);
        linearLayout.addView(f11, b8.mf.r(-2, -2, 3));
        gi.d dVar = new gi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(org.telegram.messenger.g0.L(140.0f));
        dVar.i(org.telegram.messenger.bd.M0(2131746348, null), false, true);
        linearLayout.addView(dVar, b8.mf.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.bd.M0(2131742932, null));
        org.telegram.messenger.k5.r(null, null, 2131742934, new Object[]{str}, this.e);
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
            ofFloat.addUpdateListener(new b3(this, 0));
            this.n.start();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 != 0 || this.b) {
            return;
        }
        this.b = true;
        org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).c2(this.c, "tg_placeholders_android", "🧐", "100_100");
    }
}
