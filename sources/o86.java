// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o86 extends FrameLayout implements snb {
    public final /* synthetic */ q86 E;
    public final dh0 a;
    public final SpannableStringBuilder b;
    public final qg2 c;
    public final TextView d;
    public final qg2 e;
    public final TextView f;
    public final uy9 h;
    public final m86 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o86(q86 q86Var, Context context) {
        super(context);
        this.E = q86Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(ob6.a0 ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z = true;
        bs2.t(textView, 1, 15.0f);
        int i = aob.L6;
        yob.X(textView, i, null);
        textView.setGravity(ob6.a0 ? 5 : 3);
        textView.setText(ob6.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        qg2 qg2Var = new qg2(context, z, false, 0 == true ? 1 : 0);
        qg2Var.w = aob.b0(hl.L(4.0f), aob.p1(0.15f, aob.w0(null, i, false)));
        this.c = qg2Var;
        qg2Var.setTypeface(hl.o());
        qg2Var.setPadding(hl.L(5.33f), hl.L(2.0f), hl.L(5.33f), hl.L(2.0f));
        qg2Var.setTextSize(hl.L(12.0f));
        yob.U(qg2Var, i, null);
        linearLayout.addView(qg2Var, tre.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, tre.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        uy9 uy9Var = new uy9(null, context, true);
        this.h = uy9Var;
        uy9Var.setReportChanges(true);
        uy9Var.setDelegate(new v34(this, (byte) 11));
        uy9Var.setProgress(i86.c() / 100.0f);
        uy9Var.setImportantForAccessibility(2);
        addView(uy9Var, tre.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i2 = aob.y6;
        textView2.setTextColor(aob.w0(null, i2, false));
        textView2.setGravity(3);
        textView2.setText(ob6.M0(2131748628, null));
        frameLayout.addView(textView2, tre.e(-2, -2, 19));
        qg2 qg2Var2 = new qg2(this, context);
        this.e = qg2Var2;
        qg2Var2.b(0.45f, 240L, k43.h);
        qg2Var2.setGravity(1);
        qg2Var2.setTextSize(hl.L(13.0f));
        yob.U(qg2Var2, aob.n6, null);
        frameLayout.addView(qg2Var2, tre.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        dh0 dh0Var = new dh0();
        this.a = dh0Var;
        dh0Var.a = qg2Var2.getPaint();
        dh0Var.f = hl.L(1.5f);
        dh0Var.setBounds(hl.L(3.0f), hl.L(-20.0f), hl.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(dh0Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(aob.w0(null, i2, false));
        textView3.setGravity(5);
        textView3.setText(ob6.M0(2131748627, null));
        frameLayout.addView(textView3, tre.e(-2, -2, 21));
        addView(frameLayout, tre.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new m86(this, 0 == true ? 1 : 0);
        a();
    }

    public final void a() {
        int c = i86.c();
        qg2 qg2Var = this.e;
        qg2Var.a();
        final byte b = 0;
        final byte b2 = 1;
        if (c <= 0) {
            qg2Var.c(ob6.M0(2131748630, null), !ob6.a0, true);
        } else if (c >= 100) {
            qg2Var.c(ob6.M0(2131748629, null), !ob6.a0, true);
        } else {
            float f = c;
            this.a.a(true, f / 100.0f);
            qg2Var.c(hl.G2(ob6.M0(2131748621, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f))), this.b), "%s"), !ob6.a0, true);
        }
        String upperCase = ob6.M0(i86.f() ? 2131748627 : 2131748628, null).toUpperCase();
        qg2 qg2Var2 = this.c;
        qg2Var2.setText(upperCase);
        boolean z = c > 0 && c < 100;
        if (z != this.r) {
            this.r = z;
            qg2Var2.clearAnimation();
            ik8.t(qg2Var2.animate().alpha(z ? 1.0f : 0.0f), k43.h, 220L);
        }
        float f2 = c >= 100 ? 1.0f : 0.0f;
        if (this.s != f2) {
            this.s = f2;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f2);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l86
                public final /* synthetic */ o86 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b3 = b;
                    o86 o86Var = this.b;
                    switch (b3) {
                        case 0:
                            TextView textView = o86Var.f;
                            int w0 = aob.w0(null, aob.y6, false);
                            int w02 = aob.w0(null, aob.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            o86Var.s = floatValue;
                            textView.setTextColor(vm2.f(floatValue, w0, w02));
                            break;
                        default:
                            TextView textView2 = o86Var.d;
                            int w03 = aob.w0(null, aob.y6, false);
                            int w04 = aob.w0(null, aob.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            o86Var.x = floatValue2;
                            textView2.setTextColor(vm2.f(floatValue2, w03, w04));
                            break;
                    }
                }
            });
            this.w.addListener(new n86(this, f2, (byte) 0));
            this.w.setInterpolator(k43.h);
            this.w.setDuration(320L);
            this.w.start();
        }
        float f3 = c <= 0 ? 1.0f : 0.0f;
        if (this.x != f3) {
            this.x = f3;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.x, f3);
            this.y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l86
                public final /* synthetic */ o86 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b3 = b2;
                    o86 o86Var = this.b;
                    switch (b3) {
                        case 0:
                            TextView textView = o86Var.f;
                            int w0 = aob.w0(null, aob.y6, false);
                            int w02 = aob.w0(null, aob.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            o86Var.s = floatValue;
                            textView.setTextColor(vm2.f(floatValue, w0, w02));
                            break;
                        default:
                            TextView textView2 = o86Var.d;
                            int w03 = aob.w0(null, aob.y6, false);
                            int w04 = aob.w0(null, aob.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            o86Var.x = floatValue2;
                            textView2.setTextColor(vm2.f(floatValue2, w03, w04));
                            break;
                    }
                }
            });
            this.y.addListener(new n86(this, f3, (byte) 1));
            this.y.setInterpolator(k43.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.y6));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(112.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i, bundle);
    }

    @Override // snb
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.w;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    textView.setTextColor(vm2.f(this.s, aob.w0(null, aob.y6, false), aob.w0(null, aob.n6, false)));
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(vm2.f(this.x, aob.w0(null, aob.y6, false), aob.w0(null, aob.n6, false)));
        }
        qg2 qg2Var = this.c;
        if (qg2Var != null) {
            qg2Var.invalidate();
        }
    }
}
