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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ig0 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final sg0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e41 f;
    public final org.telegram.ui.Components.c20 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public ig0(Context context, ViewGroup viewGroup, View view, String str, final sg0 sg0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = sg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new fg0(this));
        addView(view2, w7.z5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.e41 e41Var = new org.telegram.ui.Components.e41(getContext());
        this.f = e41Var;
        e41Var.setTransformType(1);
        e41Var.setDrawBackground(false);
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, null, false);
        this.h = c20Var;
        c20Var.addView(e41Var, w7.z5.e(56, 56, 17));
        c20Var.a(e41Var);
        final int i10 = 0;
        c20Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        sg0Var.a(this);
                        break;
                    default:
                        sg0Var.a(this);
                        break;
                }
            }
        });
        c20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(c20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, w7.z5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView i11 = org.telegram.ui.Cells.c1.i(frameLayout, textView, w7.z5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = i11;
        i11.setText(str);
        i11.setTextSize(1, 18.0f);
        i11.setTypeface(AndroidUtilities.bold());
        i11.setSingleLine();
        frameLayout.addView(i11, w7.z5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i12 = org.telegram.ui.ActionBar.i6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.i6.G0(dp2, org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        textView2.setOnClickListener(new fg0(this, sg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i13 = dp / 2;
        textView2.setPadding(dp, i13, dp, i13);
        float f7 = 8;
        TextView i14 = org.telegram.ui.Cells.c1.i(frameLayout, textView2, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f7, f7, f7, f7), context);
        this.v = i14;
        i14.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        i14.setSingleLine();
        i14.setTextSize(1, 16.0f);
        i14.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        final int i15 = 1;
        i14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i15) {
                    case 0:
                        sg0Var.a(this);
                        break;
                    default:
                        sg0Var.a(this);
                        break;
                }
            }
        });
        i14.setTypeface(typeface);
        i14.setPadding(dp, i13, dp, i13);
        frameLayout.addView(i14, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f7, f7, f7, f7));
        hh.k.b(view, viewGroup, pointF);
        c20Var.setTranslationX(pointF.x);
        c20Var.setTranslationY(pointF.y);
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
        duration.addListener(new hg0(this, 1));
        duration.addUpdateListener(new eg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.tr.f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.O9, false);
        org.telegram.ui.Components.e41 e41Var = this.f;
        e41Var.setColor(w02);
        e41Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false));
        this.w.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false)));
        this.n.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        int i10 = org.telegram.ui.ActionBar.i6.Wh;
        this.s.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
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
