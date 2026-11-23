package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.m80 a;
    public final org.telegram.ui.Cells.c2 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ la e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(la laVar, Activity activity) {
        super(activity);
        this.e = laVar;
        laVar.G = this;
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(activity, null);
        this.a = m80Var;
        m80Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.m6.F6;
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, null);
        m80Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.m6.J6;
        org.telegram.ui.ActionBar.t6.G(m80Var, i10, null);
        int i11 = org.telegram.ui.ActionBar.m6.K6;
        org.telegram.ui.ActionBar.t6.C(m80Var, i11, null);
        m80Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(2, activity, this);
        laVar.H = c2Var;
        this.b = c2Var;
        c2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(c2Var, i7, null);
        c2Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        org.telegram.ui.ActionBar.t6.G(c2Var, i10, null);
        org.telegram.ui.ActionBar.t6.C(c2Var, i11, null);
        c2Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(m80Var, c8.ma.e(-1, -2, 48));
        addView(c2Var, c8.ma.e(-1, -2, 48));
        if (laVar.y == 0) {
            m80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743415, null)));
            return;
        }
        String N0 = org.telegram.messenger.hd.N0(2131752926, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        int indexOf = N0.indexOf(42);
        int lastIndexOf = N0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.s41("https://fragment.com", (org.telegram.ui.Components.fz0) null), indexOf, lastIndexOf - 1, 33);
        }
        m80Var.setText(spannableStringBuilder);
    }

    public static void a(final ka kaVar) {
        org.telegram.ui.Components.m80 m80Var = kaVar.a;
        org.telegram.ui.Cells.c2 c2Var = kaVar.b;
        if (c2Var.getVisibility() == 0) {
            c2Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.c;
        final int measuredHeight = num == null ? kaVar.getMeasuredHeight() : num.intValue();
        final int height = m80Var.getHeight() + org.telegram.messenger.g0.L(27.0f) + ((c2Var.getVisibility() != 0 || TextUtils.isEmpty(c2Var.getText())) ? 0 : org.telegram.messenger.g0.L(8.0f) + c2Var.getMeasuredHeight());
        final float translationY = m80Var.getTranslationY();
        final float L = (c2Var.getVisibility() != 0 || TextUtils.isEmpty(c2Var.getText())) ? 0.0f : org.telegram.messenger.g0.L(8.0f) + c2Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        kaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ja
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ka kaVar2 = ka.this;
                kaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                kaVar2.a.setTranslationY(org.telegram.messenger.g0.T1(translationY, L, floatValue));
                kaVar2.c = Integer.valueOf(org.telegram.messenger.g0.W1(floatValue, measuredHeight, height));
                kaVar2.requestLayout();
            }
        });
        kaVar.d.setDuration(200L);
        kaVar.d.setInterpolator(org.telegram.ui.Components.nr.h);
        kaVar.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        Integer num = this.c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
