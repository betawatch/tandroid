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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pa extends FrameLayout {
    public final org.telegram.ui.Components.d90 a;
    public final org.telegram.ui.Cells.x1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ qa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(qa qaVar, Activity activity) {
        super(activity);
        this.e = qaVar;
        qaVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(activity, null);
        this.a = d90Var;
        d90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.F6;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        d90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.j6.J6;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.K6;
        d90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        d90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        qaVar.G = x1Var;
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        x1Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(d90Var, w7.x5.e(-1, -2, 48));
        addView(x1Var, w7.x5.e(-1, -2, 48));
        if (qaVar.x == 0) {
            org.telegram.ui.Cells.p6.p(R.string.UsernameHelp, d90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l51("https://fragment.com", (org.telegram.ui.Components.n01) null), indexOf, lastIndexOf - 1, 33);
        }
        d90Var.setText(spannableStringBuilder);
    }

    public static void a(final pa paVar) {
        org.telegram.ui.Components.d90 d90Var = paVar.a;
        org.telegram.ui.Cells.x1 x1Var = paVar.b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((paVar.getMeasuredWidth() - paVar.getPaddingLeft()) - paVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = paVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = paVar.c;
        final int measuredHeight = num == null ? paVar.getMeasuredHeight() : num.intValue();
        final int height = d90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight());
        final float translationY = d90Var.getTranslationY();
        final float dp = (x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        paVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.oa
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                pa paVar2 = pa.this;
                paVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                paVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                paVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                paVar2.requestLayout();
            }
        });
        paVar.d.setDuration(200L);
        paVar.d.setInterpolator(org.telegram.ui.Components.pr.h);
        paVar.d.start();
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
