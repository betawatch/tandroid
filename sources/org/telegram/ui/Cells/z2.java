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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z2 extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public float a;
    public Runnable b;
    public q0.a c;
    public boolean d;
    public ValueAnimator e;
    public final ph0 f;
    public final TextView h;
    public final fz0 n;
    public int r;
    public int s;
    public final int w;

    public z2(final Context context) {
        super(context);
        this.r = -1;
        this.w = j10.t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new gi.a(5));
        ph0 ph0Var = new ph0(context);
        this.f = ph0Var;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ph0Var, c8.ma.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        ph0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        fz0 fz0Var = new fz0(context);
        this.n = fz0Var;
        fz0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.Cells.w2
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        fz0Var.setInAnimation(context, R.anim.alpha_in);
        fz0Var.setOutAnimation(context, R.anim.alpha_out);
        addView(fz0Var, c8.ma.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String M0 = gd.M0(2131748037, null);
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(xs.d);
        this.e.addUpdateListener(new x2(this, 0));
        this.e.addListener(new y2(this, 1));
        this.e.start();
    }

    public final void b() {
        int i7;
        int i10 = 0;
        if ((getParent() instanceof View) && (((i7 = this.r) == 2 || i7 == 3 || i7 == 4) && ((View) getParent()).getPaddingTop() != 0)) {
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
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
        if (i11 != 2 && i11 != 3 && i11 != 4) {
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
        if (getParent() instanceof org.telegram.ui.Components.ba) {
            size2 -= ((org.telegram.ui.Components.ba) getParent()).f3;
        }
        ArrayList arrayList = mp.u1(this.w).s;
        if (!arrayList.isEmpty()) {
            size2 = n10.x(50.0f, (arrayList.size() + (arrayList.size() * org.telegram.messenger.g0.L(72.0f))) - 1, size2);
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
