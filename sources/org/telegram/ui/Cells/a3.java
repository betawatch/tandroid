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
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.ws;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a3 extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public float a;
    public Runnable b;
    public q0.a c;
    public boolean d;
    public ValueAnimator e;
    public final qh0 f;
    public final TextView h;
    public final gz0 n;
    public int r;
    public int s;
    public final int w;

    public a3(final Context context) {
        super(context);
        this.r = -1;
        this.w = i10.t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new gi.a(5));
        qh0 qh0Var = new qh0(context);
        this.f = qh0Var;
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(qh0Var, c8.na.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        qh0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, c8.na.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        gz0 gz0Var = new gz0(context);
        this.n = gz0Var;
        gz0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.Cells.x2
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
        gz0Var.setInAnimation(context, R.anim.alpha_in);
        gz0Var.setOutAnimation(context, R.anim.alpha_out);
        addView(gz0Var, c8.na.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String N0 = gd.N0(2131748036, null);
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                N0 = N0.replace('\n', ' ');
            }
            this.n.a(N0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(ws.d);
        this.e.addUpdateListener(new y2(this, 0));
        this.e.addListener(new z2(this, 1));
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
        if (getParent() instanceof org.telegram.ui.Components.aa) {
            size2 -= ((org.telegram.ui.Components.aa) getParent()).f3;
        }
        ArrayList arrayList = mp.u1(this.w).s;
        if (!arrayList.isEmpty()) {
            size2 = m10.x(50.0f, (arrayList.size() + (arrayList.size() * org.telegram.messenger.g0.L(72.0f))) - 1, size2);
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
