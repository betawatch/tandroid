package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class na extends FrameLayout {
    public final org.telegram.ui.Components.p80 a;
    public final org.telegram.ui.Cells.b2 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ oa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(oa oaVar, Activity activity) {
        super(activity);
        this.e = oaVar;
        oaVar.F = this;
        setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(activity, null);
        this.a = p80Var;
        p80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.t6.F6;
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, null);
        p80Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.t6.J6;
        org.telegram.ui.ActionBar.a7.H(p80Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.t6.K6;
        org.telegram.ui.ActionBar.a7.D(p80Var, i12, null);
        p80Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, activity, 2);
        oaVar.G = b2Var;
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(b2Var, i10, null);
        b2Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        org.telegram.ui.ActionBar.a7.H(b2Var, i11, null);
        org.telegram.ui.ActionBar.a7.D(b2Var, i12, null);
        b2Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        addView(p80Var, w7.b6.e(-1, -2, 48));
        addView(b2Var, w7.b6.e(-1, -2, 48));
        if (oaVar.y == 0) {
            p80Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743686, null)));
            return;
        }
        String L0 = org.telegram.messenger.cd.L0(2131752938, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
        int indexOf = L0.indexOf(42);
        int lastIndexOf = L0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51("https://fragment.com", (org.telegram.ui.Components.yz0) null), indexOf, lastIndexOf - 1, 33);
        }
        p80Var.setText(spannableStringBuilder);
    }

    public static void a(final na naVar) {
        org.telegram.ui.Components.p80 p80Var = naVar.a;
        org.telegram.ui.Cells.b2 b2Var = naVar.b;
        if (b2Var.getVisibility() == 0) {
            b2Var.measure(View.MeasureSpec.makeMeasureSpec((naVar.getMeasuredWidth() - naVar.getPaddingLeft()) - naVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = naVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = naVar.c;
        final int measuredHeight = num == null ? naVar.getMeasuredHeight() : num.intValue();
        final int height = p80Var.getHeight() + org.telegram.messenger.i0.L(27.0f) + ((b2Var.getVisibility() != 0 || TextUtils.isEmpty(b2Var.getText())) ? 0 : org.telegram.messenger.i0.L(8.0f) + b2Var.getMeasuredHeight());
        final float translationY = p80Var.getTranslationY();
        final float L = (b2Var.getVisibility() != 0 || TextUtils.isEmpty(b2Var.getText())) ? 0.0f : org.telegram.messenger.i0.L(8.0f) + b2Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        naVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ma
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                na naVar2 = na.this;
                naVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                naVar2.a.setTranslationY(org.telegram.messenger.i0.T1(translationY, L, floatValue));
                naVar2.c = Integer.valueOf(org.telegram.messenger.i0.W1(floatValue, measuredHeight, height));
                naVar2.requestLayout();
            }
        });
        naVar.d.setDuration(200L);
        naVar.d.setInterpolator(org.telegram.ui.Components.gr.h);
        naVar.d.start();
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
