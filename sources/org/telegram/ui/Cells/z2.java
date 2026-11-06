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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class z2 extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public float a;
    public Runnable b;
    public q0.a c;
    public boolean d;
    public ValueAnimator e;
    public final ch0 f;
    public final TextView h;
    public final wy0 n;
    public int r;
    public int s;
    public final int w;

    public z2(final Context context) {
        super(context);
        this.r = -1;
        this.w = p10.s0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new ei.b(5));
        ch0 ch0Var = new ch0(context);
        this.f = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ch0Var, c8.ha.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        ch0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        wy0 wy0Var = new wy0(context);
        this.n = wy0Var;
        wy0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.Cells.w2
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        wy0Var.setInAnimation(context, R.anim.alpha_in);
        wy0Var.setOutAnimation(context, R.anim.alpha_out);
        addView(wy0Var, c8.ha.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z9) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z9) {
            String M0 = hd.M0(2131748228, null);
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(ks.d);
        this.e.addUpdateListener(new x2(this, 0));
        this.e.addListener(new y2(this, 1));
        this.e.start();
    }

    public final void b() {
        int i7;
        int i10 = 0;
        if ((getParent() instanceof View) && (((i7 = this.r) == 2 || i7 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i10 = 0 - (getTop() / 2);
        }
        int i11 = this.r;
        if (i11 == 0 || i11 == 1) {
            i10 -= (int) ((1.0f - this.a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i10;
        this.f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.n.setTranslationY(f10);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i7) {
        super.offsetTopAndBottom(i7);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size;
        int size2;
        int i11 = this.r;
        if (i11 == 0 || i11 == 1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i10);
            }
            if (size == 0) {
                size = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((org.telegram.messenger.g0.L(320.0f) - size) * this.a) + size), TLObject.FLAG_30));
            return;
        }
        if (i11 != 2 && i11 != 3) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), TLObject.FLAG_30));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= org.telegram.messenger.g0.m;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i10);
        }
        if (size2 == 0) {
            size2 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
        }
        if (getParent() instanceof org.telegram.ui.Components.x9) {
            size2 -= ((org.telegram.ui.Components.x9) getParent()).e3;
        }
        ArrayList arrayList = qp.s1(this.w).s;
        if (!arrayList.isEmpty()) {
            size2 = org.telegram.messenger.camera.q.w(50.0f, (arrayList.size() + (arrayList.size() * org.telegram.messenger.g0.L(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.c = aVar;
    }
}
