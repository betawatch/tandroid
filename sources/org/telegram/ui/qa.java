package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qa extends FrameLayout {
    public final org.telegram.ui.Components.f90 a;
    public final org.telegram.ui.Cells.w1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ ra e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(ra raVar, Activity activity) {
        super(activity);
        this.e = raVar;
        raVar.C = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(activity, null);
        this.a = f90Var;
        f90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.F6;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        f90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.j6.J6;
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.K6;
        f90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        f90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        raVar.D = w1Var;
        this.b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        w1Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(f90Var, k7.b6.e(-1, -2, 48));
        addView(w1Var, k7.b6.e(-1, -2, 48));
        if (raVar.x == 0) {
            b.n(R.string.UsernameHelp, f90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.m51("https://fragment.com", (org.telegram.ui.Components.s01) null), indexOf, lastIndexOf - 1, 33);
        }
        f90Var.setText(spannableStringBuilder);
    }

    public static void a(final qa qaVar) {
        org.telegram.ui.Components.f90 f90Var = qaVar.a;
        org.telegram.ui.Cells.w1 w1Var = qaVar.b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((qaVar.getMeasuredWidth() - qaVar.getPaddingLeft()) - qaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = qaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = qaVar.c;
        final int measuredHeight = num == null ? qaVar.getMeasuredHeight() : num.intValue();
        final int height = f90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight());
        final float translationY = f90Var.getTranslationY();
        final float dp = (w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        qaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pa
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                qa qaVar2 = qa.this;
                qaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                qaVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                qaVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                qaVar2.requestLayout();
            }
        });
        qaVar.d.setDuration(200L);
        qaVar.d.setInterpolator(org.telegram.ui.Components.mr.h);
        qaVar.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Integer num = this.c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
