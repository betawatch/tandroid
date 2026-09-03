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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dg0 extends FrameLayout {
    public static final /* synthetic */ int B = 0;
    public final ng0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e31 f;
    public final org.telegram.ui.Components.a20 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public dg0(Context context, ViewGroup viewGroup, View view, String str, final ng0 ng0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = ng0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new ag0(this));
        addView(view2, k7.b6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(getContext());
        this.f = e31Var;
        e31Var.setTransformType(1);
        e31Var.setDrawBackground(false);
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, null, false);
        this.h = a20Var;
        a20Var.addView(e31Var, k7.b6.e(56, 56, 17));
        a20Var.a(e31Var);
        final int i10 = 0;
        a20Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        ng0Var.a(this);
                        break;
                    default:
                        ng0Var.a(this);
                        break;
                }
            }
        });
        a20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(a20Var, k7.b6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, k7.b6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView h = ai.h(frameLayout, textView, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = h;
        h.setText(str);
        h.setTextSize(1, 18.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine();
        frameLayout.addView(h, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        textView2.setOnClickListener(new ag0(this, ng0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i12 = dp / 2;
        textView2.setPadding(dp, i12, dp, i12);
        float f10 = 8;
        TextView h9 = ai.h(frameLayout, textView2, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, f10, f10, f10), context);
        this.v = h9;
        h9.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        h9.setSingleLine();
        h9.setTextSize(1, 16.0f);
        h9.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        final int i13 = 1;
        h9.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        ng0Var.a(this);
                        break;
                    default:
                        ng0Var.a(this);
                        break;
                }
            }
        });
        h9.setTypeface(typeface);
        h9.setPadding(dp, i12, dp, i12);
        frameLayout.addView(h9, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f10, f10, f10, f10));
        ug.i.b(view, viewGroup, pointF);
        a20Var.setTranslationX(pointF.x);
        a20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.a.a.S.Y = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new cg0(this, 1));
        duration.addUpdateListener(new zf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.mr.f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.e31 e31Var = this.f;
        e31Var.setColor(w02);
        e31Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        this.w.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false)));
        this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        int i10 = org.telegram.ui.ActionBar.j6.Wh;
        this.s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.h.g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        FrameLayout frameLayout = this.w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
