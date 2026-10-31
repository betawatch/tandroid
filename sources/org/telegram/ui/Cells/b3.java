package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b3 extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public float a;
    public Runnable b;
    public q0.a c;
    public boolean d;
    public ValueAnimator e;
    public final ei0 f;
    public final TextView h;
    public final a01 n;
    public int r;
    public int s;
    public final int w;

    public b3(final Context context) {
        super(context);
        this.r = -1;
        this.w = d20.s0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(4));
        ei0 ei0Var = new ei0(context);
        this.f = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ei0Var, w7.b6.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        ei0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        a01 a01Var = new a01(context);
        this.n = a01Var;
        a01Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.Cells.y2
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        a01Var.setInAnimation(context, R.anim.alpha_in);
        a01Var.setOutAnimation(context, R.anim.alpha_out);
        addView(a01Var, w7.b6.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String L0 = cd.L0(2131748246, null);
            if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.P1()) {
                L0 = L0.replace('\n', ' ');
            }
            this.n.a(L0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(vs.d);
        this.e.addUpdateListener(new z2(this, 0));
        this.e.addListener(new a3(this, 1));
        this.e.start();
    }

    public final void b() {
        int i10;
        int i11 = 0;
        if ((getParent() instanceof View) && (((i10 = this.r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i11 = 0 - (getTop() / 2);
        }
        int i12 = this.r;
        if (i12 == 0 || i12 == 1) {
            i11 -= (int) ((1.0f - this.a) * (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
        }
        float f7 = i11;
        this.f.setTranslationY(f7);
        this.h.setTranslationY(f7);
        this.n.setTranslationY(f7);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i10) {
        super.offsetTopAndBottom(i10);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size;
        int size2;
        int i12 = this.r;
        if (i12 == 0 || i12 == 1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i11);
            }
            if (size == 0) {
                size = (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((org.telegram.messenger.i0.L(320.0f) - size) * this.a) + size), TLObject.FLAG_30));
            return;
        }
        if (i12 != 2 && i12 != 3) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(166.0f), TLObject.FLAG_30));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= org.telegram.messenger.i0.m;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i11);
        }
        if (size2 == 0) {
            size2 = (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m;
        }
        if (getParent() instanceof org.telegram.ui.Components.r9) {
            size2 -= ((org.telegram.ui.Components.r9) getParent()).e3;
        }
        ArrayList arrayList = vp.r1(this.w).s;
        if (!arrayList.isEmpty()) {
            size2 = z20.w(50.0f, (arrayList.size() + (arrayList.size() * org.telegram.messenger.i0.L(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.c = aVar;
    }
}
