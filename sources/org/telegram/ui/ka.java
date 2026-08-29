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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.y80 a;
    public final org.telegram.ui.Cells.w1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ la e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(la laVar, Activity activity) {
        super(activity);
        this.e = laVar;
        laVar.B = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(activity, null);
        this.a = y80Var;
        y80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.F6;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        y80Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.g6.J6;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.g6.K6;
        y80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        y80Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        laVar.C = w1Var;
        this.b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        w1Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(y80Var, i7.f6.e(-1, -2, 48));
        addView(w1Var, i7.f6.e(-1, -2, 48));
        if (laVar.x == 0) {
            b.o(R.string.UsernameHelp, y80Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.a51("https://fragment.com", (org.telegram.ui.Components.h01) null), indexOf, lastIndexOf - 1, 33);
        }
        y80Var.setText(spannableStringBuilder);
    }

    public static void a(final ka kaVar) {
        org.telegram.ui.Components.y80 y80Var = kaVar.a;
        org.telegram.ui.Cells.w1 w1Var = kaVar.b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.c;
        final int measuredHeight = num == null ? kaVar.getMeasuredHeight() : num.intValue();
        final int height = y80Var.getHeight() + AndroidUtilities.dp(27.0f) + ((w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight());
        final float translationY = y80Var.getTranslationY();
        final float dp = (w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        kaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ja
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ka kaVar2 = ka.this;
                kaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                kaVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                kaVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                kaVar2.requestLayout();
            }
        });
        kaVar.d.setDuration(200L);
        kaVar.d.setInterpolator(org.telegram.ui.Components.jr.h);
        kaVar.d.start();
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
