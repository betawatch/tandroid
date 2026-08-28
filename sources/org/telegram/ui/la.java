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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class la extends FrameLayout {
    public final org.telegram.ui.Components.l80 a;
    public final org.telegram.ui.Cells.x1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ ma e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(ma maVar, Activity activity) {
        super(activity);
        this.e = maVar;
        maVar.B = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(activity, null);
        this.a = l80Var;
        l80Var.setTextSize(1, 15.0f);
        int i9 = org.telegram.ui.ActionBar.f6.F6;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        l80Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.f6.J6;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.f6.K6;
        l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        l80Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        maVar.C = x1Var;
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        x1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        x1Var.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(l80Var, g7.e6.e(-1, -2, 48));
        addView(x1Var, g7.e6.e(-1, -2, 48));
        if (maVar.x == 0) {
            org.telegram.ui.Cells.j2.p(R.string.UsernameHelp, l80Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41("https://fragment.com", (org.telegram.ui.Components.vz0) null), indexOf, lastIndexOf - 1, 33);
        }
        l80Var.setText(spannableStringBuilder);
    }

    public static void a(final la laVar) {
        org.telegram.ui.Components.l80 l80Var = laVar.a;
        org.telegram.ui.Cells.x1 x1Var = laVar.b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((laVar.getMeasuredWidth() - laVar.getPaddingLeft()) - laVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = laVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = laVar.c;
        final int measuredHeight = num == null ? laVar.getMeasuredHeight() : num.intValue();
        final int height = l80Var.getHeight() + AndroidUtilities.dp(27.0f) + ((x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight());
        final float translationY = l80Var.getTranslationY();
        final float dp = (x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        laVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ka
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                la laVar2 = la.this;
                laVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                laVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                laVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                laVar2.requestLayout();
            }
        });
        laVar.d.setDuration(200L);
        laVar.d.setInterpolator(org.telegram.ui.Components.gr.h);
        laVar.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        Integer num = this.c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), TLObject.FLAG_30);
        }
        super.onMeasure(i9, i10);
    }
}
