package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class lg0 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final vg0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.u31 f;
    public final org.telegram.ui.Components.y10 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public lg0(Context context, ViewGroup viewGroup, View view, String str, final vg0 vg0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = vg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new ig0(this));
        addView(view2, w7.y5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.u31 u31Var = new org.telegram.ui.Components.u31(getContext());
        this.f = u31Var;
        u31Var.setTransformType(1);
        u31Var.setDrawBackground(false);
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, null, false);
        this.h = y10Var;
        y10Var.addView(u31Var, w7.y5.e(56, 56, 17));
        y10Var.a(u31Var);
        final int i10 = 0;
        y10Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        vg0Var.a(this);
                        break;
                    default:
                        vg0Var.a(this);
                        break;
                }
            }
        });
        y10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(y10Var, w7.y5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, w7.y5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.y5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = g10;
        g10.setText(str);
        g10.setTextSize(1, 18.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setSingleLine();
        frameLayout.addView(g10, w7.y5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        textView2.setOnClickListener(new ig0(this, vg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i12 = dp / 2;
        textView2.setPadding(dp, i12, dp, i12);
        float f7 = 8;
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout, textView2, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f7, f7, f7, f7), context);
        this.v = g11;
        g11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        g11.setSingleLine();
        g11.setTextSize(1, 16.0f);
        g11.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        final int i13 = 1;
        g11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        vg0Var.a(this);
                        break;
                    default:
                        vg0Var.a(this);
                        break;
                }
            }
        });
        g11.setTypeface(typeface);
        g11.setPadding(dp, i12, dp, i12);
        frameLayout.addView(g11, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f7, f7, f7, f7));
        hh.k.b(view, viewGroup, pointF);
        y10Var.setTranslationX(pointF.x);
        y10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.a.a.V.b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new kg0(this, 1));
        duration.addUpdateListener(new hg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.qr.f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.u31 u31Var = this.f;
        u31Var.setColor(w02);
        u31Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        this.w.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false)));
        this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        int i10 = org.telegram.ui.ActionBar.j6.Wh;
        this.s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.h.g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
