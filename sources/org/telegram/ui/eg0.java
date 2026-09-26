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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class eg0 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final og0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.s31 f;
    public final org.telegram.ui.Components.z10 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public eg0(Context context, ViewGroup viewGroup, View view, String str, final og0 og0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = og0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new bg0(this));
        addView(view2, w7.y5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.s31 s31Var = new org.telegram.ui.Components.s31(getContext());
        this.f = s31Var;
        s31Var.setTransformType(1);
        s31Var.setDrawBackground(false);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, null, false);
        this.h = z10Var;
        z10Var.addView(s31Var, w7.y5.e(56, 56, 17));
        z10Var.a(s31Var);
        final int i10 = 0;
        z10Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.cg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        og0Var.a(this);
                        break;
                    default:
                        og0Var.a(this);
                        break;
                }
            }
        });
        z10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(z10Var, w7.y5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, w7.y5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, w7.y5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = h;
        h.setText(str);
        h.setTextSize(1, 18.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine();
        frameLayout.addView(h, w7.y5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.h6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.G0(dp2, org.telegram.ui.ActionBar.h6.w0(null, i11, false)));
        textView2.setOnClickListener(new bg0(this, og0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i12 = dp / 2;
        textView2.setPadding(dp, i12, dp, i12);
        float f7 = 8;
        TextView h10 = org.telegram.ui.Cells.c1.h(frameLayout, textView2, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f7, f7, f7, f7), context);
        this.v = h10;
        h10.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        h10.setSingleLine();
        h10.setTextSize(1, 16.0f);
        h10.setBackground(org.telegram.ui.ActionBar.h6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.w0(null, i11, false)));
        final int i13 = 1;
        h10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.cg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        og0Var.a(this);
                        break;
                    default:
                        og0Var.a(this);
                        break;
                }
            }
        });
        h10.setTypeface(typeface);
        h10.setPadding(dp, i12, dp, i12);
        frameLayout.addView(h10, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f7, f7, f7, f7));
        hh.k.b(view, viewGroup, pointF);
        z10Var.setTranslationX(pointF.x);
        z10Var.setTranslationY(pointF.y);
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
        duration.addListener(new dg0(this, 1));
        duration.addUpdateListener(new ag0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.rr.f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.O9, false);
        org.telegram.ui.Components.s31 s31Var = this.f;
        s31Var.setColor(w02);
        s31Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.P9, false));
        this.w.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false)));
        this.n.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
        int i10 = org.telegram.ui.ActionBar.h6.Wh;
        this.s.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
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
