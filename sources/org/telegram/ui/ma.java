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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ma extends FrameLayout {
    public final org.telegram.ui.Components.p80 a;
    public final org.telegram.ui.Cells.w1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ na e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(na naVar, Activity activity) {
        super(activity);
        this.e = naVar;
        naVar.B = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(activity, null);
        this.a = p80Var;
        p80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.F6;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        p80Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.g6.J6;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.g6.K6;
        p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        p80Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        naVar.C = w1Var;
        this.b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        w1Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(p80Var, h7.z5.e(-1, -2, 48));
        addView(w1Var, h7.z5.e(-1, -2, 48));
        if (naVar.x == 0) {
            org.telegram.ui.Cells.pa.q(R.string.UsernameHelp, p80Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41("https://fragment.com", (org.telegram.ui.Components.xz0) null), indexOf, lastIndexOf - 1, 33);
        }
        p80Var.setText(spannableStringBuilder);
    }

    public static void a(final ma maVar) {
        org.telegram.ui.Components.p80 p80Var = maVar.a;
        org.telegram.ui.Cells.w1 w1Var = maVar.b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((maVar.getMeasuredWidth() - maVar.getPaddingLeft()) - maVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = maVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = maVar.c;
        final int measuredHeight = num == null ? maVar.getMeasuredHeight() : num.intValue();
        final int height = p80Var.getHeight() + AndroidUtilities.dp(27.0f) + ((w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight());
        final float translationY = p80Var.getTranslationY();
        final float dp = (w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        maVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.la
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ma maVar2 = ma.this;
                maVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                maVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                maVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                maVar2.requestLayout();
            }
        });
        maVar.d.setDuration(200L);
        maVar.d.setInterpolator(org.telegram.ui.Components.er.h);
        maVar.d.start();
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
