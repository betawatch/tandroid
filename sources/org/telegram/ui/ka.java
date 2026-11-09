package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.x70 a;
    public final org.telegram.ui.Cells.b2 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ la e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(la laVar, Activity activity) {
        super(activity);
        this.e = laVar;
        laVar.F = this;
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(activity, null);
        this.a = x70Var;
        x70Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.l6.F6;
        org.telegram.ui.ActionBar.s6.U(x70Var, i7, null);
        x70Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.l6.J6;
        org.telegram.ui.ActionBar.s6.G(x70Var, i10, null);
        int i11 = org.telegram.ui.ActionBar.l6.K6;
        org.telegram.ui.ActionBar.s6.C(x70Var, i11, null);
        x70Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(2, activity, this);
        laVar.G = b2Var;
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.s6.U(b2Var, i7, null);
        b2Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        org.telegram.ui.ActionBar.s6.G(b2Var, i10, null);
        org.telegram.ui.ActionBar.s6.C(b2Var, i11, null);
        b2Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(x70Var, c8.ha.e(-1, -2, 48));
        addView(b2Var, c8.ha.e(-1, -2, 48));
        if (laVar.y == 0) {
            x70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743660, null)));
            return;
        }
        String M0 = org.telegram.messenger.id.M0(2131752938, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.c41("https://fragment.com", (org.telegram.ui.Components.vy0) null), indexOf, lastIndexOf - 1, 33);
        }
        x70Var.setText(spannableStringBuilder);
    }

    public static void a(final ka kaVar) {
        org.telegram.ui.Components.x70 x70Var = kaVar.a;
        org.telegram.ui.Cells.b2 b2Var = kaVar.b;
        if (b2Var.getVisibility() == 0) {
            b2Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.c;
        final int measuredHeight = num == null ? kaVar.getMeasuredHeight() : num.intValue();
        final int height = x70Var.getHeight() + org.telegram.messenger.g0.L(27.0f) + ((b2Var.getVisibility() != 0 || TextUtils.isEmpty(b2Var.getText())) ? 0 : org.telegram.messenger.g0.L(8.0f) + b2Var.getMeasuredHeight());
        final float translationY = x70Var.getTranslationY();
        final float L = (b2Var.getVisibility() != 0 || TextUtils.isEmpty(b2Var.getText())) ? 0.0f : org.telegram.messenger.g0.L(8.0f) + b2Var.getMeasuredHeight();
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
        kaVar.d.setInterpolator(org.telegram.ui.Components.xq.h);
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
