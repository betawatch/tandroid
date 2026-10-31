package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s31 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final LinearLayout h;
    public final ep n;
    public final LinearLayout r;
    public final ImageView s;
    public final TextView w;

    public s31(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(6.0f));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        addView(f7, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rextrabold.ttf"));
        f7.addView(textView, w7.b6.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f));
        w7.e6.a(linearLayout);
        f7.addView(linearLayout, w7.b6.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, w7.b6.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(org.telegram.messenger.i0.L(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o1("fonts/rextrabold.ttf"));
        f7.addView(textView3, w7.b6.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        ep epVar = new ep(20, context, p6Var);
        this.n = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.h7, org.telegram.ui.ActionBar.t6.j7, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(epVar, w7.b6.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.m5.m(textView4, org.telegram.ui.ActionBar.t6.j5, p6Var, 1, 14.0f);
        textView4.setText(org.telegram.messenger.cd.L0(2131754995, null));
        linearLayout2.addView(textView4, w7.b6.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.b6.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        w7.e6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.r = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        w7.e6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, w7.b6.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(org.telegram.messenger.i0.o());
        textView5.setText(org.telegram.messenger.cd.L0(2131755003, null));
        linearLayout3.addView(textView5, w7.b6.r(-2, -2, 16));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.b;
        linearLayout.setBackground(linearLayout.isClickable() ? org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f)) : null);
        if (linearLayout.isClickable()) {
            w7.e6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        this.s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), PorterDuff.Mode.SRC_IN));
        this.w.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        this.r.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f)));
    }
}
