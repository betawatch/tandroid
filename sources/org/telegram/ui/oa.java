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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout {
    public final org.telegram.ui.Components.g90 a;
    public final org.telegram.ui.Cells.x1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ pa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(pa paVar, Activity activity) {
        super(activity);
        this.e = paVar;
        paVar.C = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(activity, null);
        this.a = g90Var;
        g90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.k6.F6;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        g90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.k6.J6;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.k6.K6;
        g90Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        g90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        paVar.D = x1Var;
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        x1Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        x1Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(g90Var, k7.c6.e(-1, -2, 48));
        addView(x1Var, k7.c6.e(-1, -2, 48));
        if (paVar.x == 0) {
            b.n(R.string.UsernameHelp, g90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l51("https://fragment.com", (org.telegram.ui.Components.s01) null), indexOf, lastIndexOf - 1, 33);
        }
        g90Var.setText(spannableStringBuilder);
    }

    public static void a(final oa oaVar) {
        org.telegram.ui.Components.g90 g90Var = oaVar.a;
        org.telegram.ui.Cells.x1 x1Var = oaVar.b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((oaVar.getMeasuredWidth() - oaVar.getPaddingLeft()) - oaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = oaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = oaVar.c;
        final int measuredHeight = num == null ? oaVar.getMeasuredHeight() : num.intValue();
        final int height = g90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight());
        final float translationY = g90Var.getTranslationY();
        final float dp = (x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        oaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.na
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                oa oaVar2 = oa.this;
                oaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                oaVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                oaVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                oaVar2.requestLayout();
            }
        });
        oaVar.d.setDuration(200L);
        oaVar.d.setInterpolator(org.telegram.ui.Components.pr.h);
        oaVar.d.start();
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
