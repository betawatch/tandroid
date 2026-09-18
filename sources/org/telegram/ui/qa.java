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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qa extends FrameLayout {
    public final org.telegram.ui.Components.l90 a;
    public final org.telegram.ui.Cells.y1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ ra e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(ra raVar, Activity activity) {
        super(activity);
        this.e = raVar;
        raVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(activity, null);
        this.a = l90Var;
        l90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.F6;
        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        l90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.j6.J6;
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.K6;
        l90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        l90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        raVar.G = y1Var;
        this.b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(l90Var, w7.y5.e(-1, -2, 48));
        addView(y1Var, w7.y5.e(-1, -2, 48));
        if (raVar.x == 0) {
            org.telegram.ui.Cells.c1.o(R.string.UsernameHelp, l90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b61("https://fragment.com", (org.telegram.ui.Components.d11) null), indexOf, lastIndexOf - 1, 33);
        }
        l90Var.setText(spannableStringBuilder);
    }

    public static void a(final qa qaVar) {
        org.telegram.ui.Components.l90 l90Var = qaVar.a;
        org.telegram.ui.Cells.y1 y1Var = qaVar.b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((qaVar.getMeasuredWidth() - qaVar.getPaddingLeft()) - qaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = qaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = qaVar.c;
        final int measuredHeight = num == null ? qaVar.getMeasuredHeight() : num.intValue();
        final int height = l90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight());
        final float translationY = l90Var.getTranslationY();
        final float dp = (y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
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
        qaVar.d.setInterpolator(org.telegram.ui.Components.qr.h);
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
