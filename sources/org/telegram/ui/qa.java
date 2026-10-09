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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qa extends FrameLayout {
    public final org.telegram.ui.Components.ea0 a;
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
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(activity, null);
        this.a = ea0Var;
        ea0Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.i6.F6;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        ea0Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.i6.J6;
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.i6.K6;
        ea0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        ea0Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        raVar.G = y1Var;
        this.b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(ea0Var, w7.x5.e(-1, -2, 48));
        addView(y1Var, w7.x5.e(-1, -2, 48));
        if (raVar.x == 0) {
            org.telegram.ui.Cells.c1.o(R.string.UsernameHelp, ea0Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t61("https://fragment.com", (org.telegram.ui.Components.t11) null), indexOf, lastIndexOf - 1, 33);
        }
        ea0Var.setText(spannableStringBuilder);
    }

    public static void a(final qa qaVar) {
        org.telegram.ui.Components.ea0 ea0Var = qaVar.a;
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
        final int height = ea0Var.getHeight() + AndroidUtilities.dp(27.0f) + ((y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight());
        final float translationY = ea0Var.getTranslationY();
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
        qaVar.d.setInterpolator(org.telegram.ui.Components.hs.h);
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
