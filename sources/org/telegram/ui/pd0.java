package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pd0 extends FrameLayout {
    public static final /* synthetic */ int F = 0;
    public final PointF D;
    public int E;
    public final f a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.n11 f;
    public final org.telegram.ui.Components.p00 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView w;
    public final FrameLayout x;
    public boolean y;

    public pd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        PointF pointF = new PointF();
        this.D = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new g40(this, 9));
        addView(view2, c8.ha.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(getContext());
        this.f = n11Var;
        final int i7 = 1;
        n11Var.setTransformType(1);
        final int i10 = 0;
        n11Var.setDrawBackground(false);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null, false);
        this.h = p00Var;
        p00Var.addView(n11Var, c8.ha.e(56, 56, 17));
        p00Var.a(n11Var);
        p00Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.X1(pd0Var);
                        break;
                    case 1:
                        pd0 pd0Var2 = this;
                        pd0Var2.getClass();
                        fVar.getClass();
                        pd0Var2.a();
                        break;
                    default:
                        pd0 pd0Var3 = this;
                        pd0Var3.getClass();
                        fVar.X1(pd0Var3);
                        break;
                }
            }
        });
        p00Var.setContentDescription(org.telegram.messenger.hd.M0(2131751355, null));
        addView(p00Var, c8.ha.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, c8.ha.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = i11;
        i11.setText(str);
        i11.setTextSize(1, 18.0f);
        i11.setTypeface(org.telegram.messenger.g0.o());
        i11.setSingleLine();
        frameLayout.addView(i11, c8.ha.d(-1, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(org.telegram.messenger.hd.M0(2131751336, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.J0(L2, org.telegram.ui.ActionBar.k6.x0(null, i12, false)));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i7) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.X1(pd0Var);
                        break;
                    case 1:
                        pd0 pd0Var2 = this;
                        pd0Var2.getClass();
                        fVar.getClass();
                        pd0Var2.a();
                        break;
                    default:
                        pd0 pd0Var3 = this;
                        pd0Var3.getClass();
                        fVar.X1(pd0Var3);
                        break;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i13 = L / 2;
        textView2.setPadding(L, i13, L, i13);
        float f10 = 8;
        TextView i14 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 80, f10, f10, f10, f10), context);
        this.w = i14;
        i14.setText(org.telegram.messenger.hd.M0(2131752152, null));
        i14.setSingleLine();
        i14.setTextSize(1, 16.0f);
        i14.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false)));
        final int i15 = 2;
        i14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i15) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.X1(pd0Var);
                        break;
                    case 1:
                        pd0 pd0Var2 = this;
                        pd0Var2.getClass();
                        fVar.getClass();
                        pd0Var2.a();
                        break;
                    default:
                        pd0 pd0Var3 = this;
                        pd0Var3.getClass();
                        fVar.X1(pd0Var3);
                        break;
                }
            }
        });
        i14.setTypeface(typeface);
        i14.setPadding(L, i13, L, i13);
        frameLayout.addView(i14, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        p00Var.setTranslationX(pointF.x);
        p00Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((be0) this.a.b).g0.b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new od0(this, 1));
        duration.addUpdateListener(new md0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.xq.f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false);
        org.telegram.ui.Components.n11 n11Var = this.f;
        n11Var.setColor(x02);
        n11Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        FrameLayout frameLayout = this.x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.k6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
        int i7 = org.telegram.ui.ActionBar.k6.Ki;
        this.s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        FrameLayout frameLayout = this.x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
