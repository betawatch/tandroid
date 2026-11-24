// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class le1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final l46 a;
    public final ke1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ me1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le1(me1 me1Var, Activity activity) {
        super(activity);
        this.e = me1Var;
        me1Var.G = this;
        setPadding(gl.L(18.0f), gl.L(10.0f), gl.L(18.0f), gl.L(17.0f));
        byte b = 0;
        setClipChildren(false);
        l46 l46Var = new l46(activity, null);
        this.a = l46Var;
        l46Var.setTextSize(1, 15.0f);
        int i = bkb.E6;
        zkb.X(l46Var, i, null);
        l46Var.setGravity(k96.a0 ? 5 : 3);
        int i2 = bkb.I6;
        zkb.G(l46Var, i2, null);
        int i3 = bkb.J6;
        zkb.C(l46Var, i3, null);
        l46Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        ke1 ke1Var = new ke1(b, activity, this);
        me1Var.H = ke1Var;
        this.b = ke1Var;
        ke1Var.setTextSize(1, 15.0f);
        zkb.X(ke1Var, i, null);
        ke1Var.setGravity(k96.a0 ? 5 : 3);
        zkb.G(ke1Var, i2, null);
        zkb.C(ke1Var, i3, null);
        ke1Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        addView(l46Var, nme.e(-1, -2, 48));
        addView(ke1Var, nme.e(-1, -2, 48));
        if (me1Var.y == 0) {
            l46Var.setText(gl.T2(k96.M0(2131743421, null)));
            return;
        }
        String M0 = k96.M0(2131752926, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new g4c("https://fragment.com", (vib) null), indexOf, lastIndexOf - 1, 33);
        }
        l46Var.setText(spannableStringBuilder);
    }

    public final void a() {
        ke1 ke1Var = this.b;
        if (ke1Var.getVisibility() == 0) {
            ke1Var.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), -2137483649);
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = this.c;
        final int measuredHeight = num == null ? getMeasuredHeight() : num.intValue();
        int L = gl.L(27.0f);
        l46 l46Var = this.a;
        final int height = l46Var.getHeight() + L + ((ke1Var.getVisibility() != 0 || TextUtils.isEmpty(ke1Var.getText())) ? 0 : gl.L(8.0f) + ke1Var.getMeasuredHeight());
        final float translationY = l46Var.getTranslationY();
        final float L2 = (ke1Var.getVisibility() != 0 || TextUtils.isEmpty(ke1Var.getText())) ? 0.0f : gl.L(8.0f) + ke1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: je1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                le1 le1Var = le1.this;
                le1Var.a.setTranslationY(gl.R1(translationY, L2, floatValue));
                le1Var.c = Integer.valueOf(gl.U1(floatValue, measuredHeight, height));
                le1Var.requestLayout();
            }
        });
        this.d.setDuration(200L);
        this.d.setInterpolator(s33.h);
        this.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num = this.c;
        if (num != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(num.intValue(), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
