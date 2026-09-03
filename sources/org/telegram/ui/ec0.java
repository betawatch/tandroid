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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ec0 extends FrameLayout {
    public final org.telegram.ui.Components.r9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.v1 c;
    public final TextView d;
    public final org.telegram.ui.Cells.v1 e;
    public final TextView f;
    public final org.telegram.ui.Components.jo0 h;
    public final cc0 n;
    public boolean r;
    public float s;
    public ValueAnimator v;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ gc0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec0(gc0 gc0Var, Context context) {
        super(context);
        this.y = gc0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z4 = true;
        ai.o(15.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        boolean z10 = false;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, k7.b6.q(-2, -2, 16));
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(context, z4, z10, z10);
        v1Var.v = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.c = v1Var;
        v1Var.setTypeface(AndroidUtilities.bold());
        v1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        v1Var.setTextSize(AndroidUtilities.dp(12.0f));
        v1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        linearLayout.addView(v1Var, k7.b6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, k7.b6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0(context, null, true);
        this.h = jo0Var;
        jo0Var.setReportChanges(true);
        jo0Var.setDelegate(new h(this, 23));
        jo0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        jo0Var.setImportantForAccessibility(2);
        addView(jo0Var, k7.b6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        ai.s(i11, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, k7.b6.e(-2, -2, 19));
        org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(this, context);
        this.e = v1Var2;
        v1Var2.b(0.45f, 240L, org.telegram.ui.Components.mr.h);
        v1Var2.setGravity(1);
        v1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        v1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false));
        frameLayout.addView(v1Var2, k7.b6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9();
        this.a = r9Var;
        r9Var.a = v1Var2.getPaint();
        r9Var.f = AndroidUtilities.dp(1.5f);
        r9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(r9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        ai.s(i11, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, k7.b6.e(-2, -2, 21));
        addView(frameLayout, k7.b6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new cc0(this);
        a();
    }

    public final void a() {
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.v1 v1Var = this.e;
        v1Var.a();
        final int i10 = 0;
        final int i11 = 1;
        if (powerSaverLevel <= 0) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f10 = powerSaverLevel;
            this.a.a(f10 / 100.0f, true);
            v1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f10))), this.b)), !LocaleController.isRTL, true);
        }
        String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
        org.telegram.ui.Cells.v1 v1Var2 = this.c;
        v1Var2.setText(upperCase);
        boolean z4 = powerSaverLevel > 0 && powerSaverLevel < 100;
        if (z4 != this.r) {
            this.r = z4;
            v1Var2.clearAnimation();
            b.p(v1Var2.animate().alpha(z4 ? 1.0f : 0.0f), org.telegram.ui.Components.mr.h, 220L);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bc0
                public final /* synthetic */ ec0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            ec0 ec0Var = this.b;
                            TextView textView = ec0Var.f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ec0Var.s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            break;
                        default:
                            ec0 ec0Var2 = this.b;
                            TextView textView2 = ec0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ec0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            break;
                    }
                }
            });
            this.v.addListener(new dc0(this, f11, 0));
            this.v.setInterpolator(org.telegram.ui.Components.mr.h);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bc0
                public final /* synthetic */ ec0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i11) {
                        case 0:
                            ec0 ec0Var = this.b;
                            TextView textView = ec0Var.f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ec0Var.s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            break;
                        default:
                            ec0 ec0Var2 = this.b;
                            TextView textView2 = ec0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ec0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            break;
                    }
                }
            });
            this.x.addListener(new dc0(this, f12, 1));
            this.x.setInterpolator(org.telegram.ui.Components.mr.h);
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
