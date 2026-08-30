package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cc0 extends FrameLayout {
    public final org.telegram.ui.Components.r9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.w1 c;
    public final TextView d;
    public final org.telegram.ui.Cells.w1 e;
    public final TextView f;
    public final org.telegram.ui.Components.ko0 h;
    public final ac0 n;
    public boolean r;
    public float s;
    public ValueAnimator v;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ ec0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(ec0 ec0Var, Context context) {
        super(context);
        this.y = ec0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z4 = true;
        yh.p(15.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        boolean z10 = false;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, k7.b6.q(-2, -2, 16));
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(context, z4, z10, z10);
        w1Var.v = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.c = w1Var;
        w1Var.setTypeface(AndroidUtilities.bold());
        w1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        w1Var.setTextSize(AndroidUtilities.dp(12.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        linearLayout.addView(w1Var, k7.b6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, k7.b6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(context, null, true);
        this.h = ko0Var;
        ko0Var.setReportChanges(true);
        ko0Var.setDelegate(new h(this, 23));
        ko0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        ko0Var.setImportantForAccessibility(2);
        addView(ko0Var, k7.b6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        yh.t(i11, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, k7.b6.e(-2, -2, 19));
        org.telegram.ui.Cells.w1 w1Var2 = new org.telegram.ui.Cells.w1(this, context);
        this.e = w1Var2;
        w1Var2.b(0.45f, 240L, org.telegram.ui.Components.nr.h);
        w1Var2.setGravity(1);
        w1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        w1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false));
        frameLayout.addView(w1Var2, k7.b6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9();
        this.a = r9Var;
        r9Var.a = w1Var2.getPaint();
        r9Var.f = AndroidUtilities.dp(1.5f);
        r9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(r9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        yh.t(i11, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, k7.b6.e(-2, -2, 21));
        addView(frameLayout, k7.b6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new ac0(this);
        a();
    }

    public final void a() {
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.w1 w1Var = this.e;
        w1Var.a();
        final int i10 = 0;
        final int i11 = 1;
        if (powerSaverLevel <= 0) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f10 = powerSaverLevel;
            this.a.a(f10 / 100.0f, true);
            w1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f10))), this.b)), !LocaleController.isRTL, true);
        }
        String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
        org.telegram.ui.Cells.w1 w1Var2 = this.c;
        w1Var2.setText(upperCase);
        boolean z4 = powerSaverLevel > 0 && powerSaverLevel < 100;
        if (z4 != this.r) {
            this.r = z4;
            w1Var2.clearAnimation();
            b.p(w1Var2.animate().alpha(z4 ? 1.0f : 0.0f), org.telegram.ui.Components.nr.h, 220L);
        }
        float f11 = powerSaverLevel >= 100 ? 1.0f : 0.0f;
        if (this.s != f11) {
            this.s = f11;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f11);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zb0
                public final /* synthetic */ cc0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            cc0 cc0Var = this.b;
                            TextView textView = cc0Var.f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            cc0Var.s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            break;
                        default:
                            cc0 cc0Var2 = this.b;
                            TextView textView2 = cc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            cc0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            break;
                    }
                }
            });
            this.v.addListener(new bc0(this, f11, 0));
            this.v.setInterpolator(org.telegram.ui.Components.nr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        float f12 = powerSaverLevel <= 0 ? 1.0f : 0.0f;
        if (this.w != f12) {
            this.w = f12;
            ValueAnimator valueAnimator2 = this.x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, f12);
            this.x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zb0
                public final /* synthetic */ cc0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i11) {
                        case 0:
                            cc0 cc0Var = this.b;
                            TextView textView = cc0Var.f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            cc0Var.s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            break;
                        default:
                            cc0 cc0Var2 = this.b;
                            TextView textView2 = cc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            cc0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            break;
                    }
                }
            });
            this.x.addListener(new bc0(this, f12, 1));
            this.x.setInterpolator(org.telegram.ui.Components.nr.h);
            this.x.setDuration(320L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i10, bundle);
    }
}
