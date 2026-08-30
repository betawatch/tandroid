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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bg0 extends FrameLayout {
    public static final /* synthetic */ int B = 0;
    public final lg0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e31 f;
    public final org.telegram.ui.Components.z10 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public bg0(Context context, ViewGroup viewGroup, View view, String str, final lg0 lg0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = lg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new yf0(this));
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
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, null, false);
        this.h = z10Var;
        z10Var.addView(e31Var, k7.b6.e(56, 56, 17));
        z10Var.a(e31Var);
        final int i10 = 0;
        z10Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.zf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        lg0Var.a(this);
                        break;
                    default:
                        lg0Var.a(this);
                        break;
                }
            }
        });
        z10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(z10Var, k7.b6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, k7.b6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView i11 = yh.i(frameLayout, textView, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = i11;
        i11.setText(str);
        i11.setTextSize(1, 18.0f);
        i11.setTypeface(AndroidUtilities.bold());
        i11.setSingleLine();
        frameLayout.addView(i11, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        textView2.setOnClickListener(new yf0(this, lg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i13 = dp / 2;
        textView2.setPadding(dp, i13, dp, i13);
        float f10 = 8;
        TextView i14 = yh.i(frameLayout, textView2, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, f10, f10, f10), context);
        this.v = i14;
        i14.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        i14.setSingleLine();
        i14.setTextSize(1, 16.0f);
        i14.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        final int i15 = 1;
        i14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.zf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i15) {
                    case 0:
                        lg0Var.a(this);
                        break;
                    default:
                        lg0Var.a(this);
                        break;
                }
            }
        });
        i14.setTypeface(typeface);
        i14.setPadding(dp, i13, dp, i13);
        frameLayout.addView(i14, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f10, f10, f10, f10));
        ug.i.b(view, viewGroup, pointF);
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
        this.a.a.S.Y = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ag0(this, 1));
        duration.addUpdateListener(new xf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.nr.f);
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
