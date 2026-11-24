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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k66 extends FrameLayout implements tjb {
    public final /* synthetic */ m66 E;
    public final ch0 a;
    public final SpannableStringBuilder b;
    public final yf2 c;
    public final TextView d;
    public final yf2 e;
    public final TextView f;
    public final av9 h;
    public final i66 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k66(m66 m66Var, Context context) {
        super(context);
        this.E = m66Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(k96.a0 ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z = true;
        ir2.t(textView, 1, 15.0f);
        int i = bkb.K6;
        zkb.X(textView, i, null);
        textView.setGravity(k96.a0 ? 5 : 3);
        textView.setText(k96.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, nme.r(-2, -2, 16));
        yf2 yf2Var = new yf2(context, z, false, 0 == true ? 1 : 0);
        yf2Var.w = bkb.b0(gl.L(4.0f), bkb.p1(0.15f, bkb.w0(null, i, false)));
        this.c = yf2Var;
        yf2Var.setTypeface(gl.o());
        yf2Var.setPadding(gl.L(5.33f), gl.L(2.0f), gl.L(5.33f), gl.L(2.0f));
        yf2Var.setTextSize(gl.L(12.0f));
        zkb.U(yf2Var, i, null);
        linearLayout.addView(yf2Var, nme.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, nme.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        av9 av9Var = new av9(null, context, true);
        this.h = av9Var;
        av9Var.setReportChanges(true);
        av9Var.setDelegate(new pj4(this, (byte) 10));
        av9Var.setProgress(e66.c() / 100.0f);
        av9Var.setImportantForAccessibility(2);
        addView(av9Var, nme.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i2 = bkb.x6;
        textView2.setTextColor(bkb.w0(null, i2, false));
        textView2.setGravity(3);
        textView2.setText(k96.M0(2131748682, null));
        frameLayout.addView(textView2, nme.e(-2, -2, 19));
        yf2 yf2Var2 = new yf2(this, context);
        this.e = yf2Var2;
        yf2Var2.b(0.45f, 240L, s33.h);
        yf2Var2.setGravity(1);
        yf2Var2.setTextSize(gl.L(13.0f));
        zkb.U(yf2Var2, bkb.m6, null);
        frameLayout.addView(yf2Var2, nme.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        ch0 ch0Var = new ch0();
        this.a = ch0Var;
        ch0Var.a = yf2Var2.getPaint();
        ch0Var.f = gl.L(1.5f);
        ch0Var.setBounds(gl.L(3.0f), gl.L(-20.0f), gl.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(ch0Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(bkb.w0(null, i2, false));
        textView3.setGravity(5);
        textView3.setText(k96.M0(2131748681, null));
        frameLayout.addView(textView3, nme.e(-2, -2, 21));
        addView(frameLayout, nme.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new i66(this, 0 == true ? 1 : 0);
        a();
    }

    public final void a() {
        int c = e66.c();
        yf2 yf2Var = this.e;
        yf2Var.a();
        final byte b = 0;
        final byte b2 = 1;
        if (c <= 0) {
            yf2Var.c(k96.M0(2131748684, null), !k96.a0, true);
        } else if (c >= 100) {
            yf2Var.c(k96.M0(2131748683, null), !k96.a0, true);
        } else {
            float f = c;
            this.a.a(true, f / 100.0f);
            yf2Var.c(gl.H2(k96.M0(2131748675, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f))), this.b), "%s"), !k96.a0, true);
        }
        String upperCase = k96.M0(e66.f() ? 2131748681 : 2131748682, null).toUpperCase();
        yf2 yf2Var2 = this.c;
        yf2Var2.setText(upperCase);
        boolean z = c > 0 && c < 100;
        if (z != this.r) {
            this.r = z;
            yf2Var2.clearAnimation();
            ug8.t(yf2Var2.animate().alpha(z ? 1.0f : 0.0f), s33.h, 220L);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h66
                public final /* synthetic */ k66 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b3 = b;
                    k66 k66Var = this.b;
                    switch (b3) {
                        case 0:
                            TextView textView = k66Var.f;
                            int w0 = bkb.w0(null, bkb.x6, false);
                            int w02 = bkb.w0(null, bkb.m6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            k66Var.s = floatValue;
                            textView.setTextColor(bm2.f(floatValue, w0, w02));
                            break;
                        default:
                            TextView textView2 = k66Var.d;
                            int w03 = bkb.w0(null, bkb.x6, false);
                            int w04 = bkb.w0(null, bkb.m6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            k66Var.x = floatValue2;
                            textView2.setTextColor(bm2.f(floatValue2, w03, w04));
                            break;
                    }
                }
            });
            this.w.addListener(new j66(this, f2, (byte) 0));
            this.w.setInterpolator(s33.h);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h66
                public final /* synthetic */ k66 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b3 = b2;
                    k66 k66Var = this.b;
                    switch (b3) {
                        case 0:
                            TextView textView = k66Var.f;
                            int w0 = bkb.w0(null, bkb.x6, false);
                            int w02 = bkb.w0(null, bkb.m6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            k66Var.s = floatValue;
                            textView.setTextColor(bm2.f(floatValue, w0, w02));
                            break;
                        default:
                            TextView textView2 = k66Var.d;
                            int w03 = bkb.w0(null, bkb.x6, false);
                            int w04 = bkb.w0(null, bkb.m6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            k66Var.x = floatValue2;
                            textView2.setTextColor(bm2.f(floatValue2, w03, w04));
                            break;
                    }
                }
            });
            this.y.addListener(new j66(this, f3, (byte) 1));
            this.y.setInterpolator(s33.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.x6));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(112.0f), TLObject.FLAG_30));
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

    @Override // tjb
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.w;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    textView.setTextColor(bm2.f(this.s, bkb.w0(null, bkb.x6, false), bkb.w0(null, bkb.m6, false)));
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(bm2.f(this.x, bkb.w0(null, bkb.x6, false), bkb.w0(null, bkb.m6, false)));
        }
        yf2 yf2Var = this.c;
        if (yf2Var != null) {
            yf2Var.invalidate();
        }
    }
}
