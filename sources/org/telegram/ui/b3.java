package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final org.telegram.ui.Components.k9 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final fi.d h;
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
        addView(linearLayout, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        linearLayout.addView(k9Var, c8.ha.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 15.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(false);
        f10.setMaxLines(3);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, f10, c8.ha.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = f11;
        f11.setTextSize(1, 12.0f);
        f11.setTextColor(-1);
        f11.setAlpha(0.4f);
        linearLayout.addView(f11, c8.ha.r(-2, -2, 3));
        fi.d dVar = new fi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(org.telegram.messenger.g0.L(140.0f));
        dVar.i(org.telegram.messenger.id.M0(2131746340, null), false, true);
        linearLayout.addView(dVar, c8.ha.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.id.M0(2131742922, null));
        org.telegram.messenger.k5.r(null, null, 2131742924, new Object[]{str}, this.e);
        this.f.setText(str2);
    }

    public final void b(boolean z9, boolean z10) {
        if (this.r == z9) {
            return;
        }
        this.r = z9;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.d.setTextColor(!z9 ? -16777216 : -1);
            this.e.setTextColor(!z9 ? -16777216 : -1);
            this.f.setTextColor(z9 ? -1 : -16777216);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
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
        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).c2(this.c, "tg_placeholders_android", "🧐", "100_100");
    }
}
