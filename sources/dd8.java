// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dd8 extends FrameLayout implements fn7 {
    public final FrameLayout a;
    public final b6 b;
    public final ema[] c;
    public final in d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public dd8(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(hl.L(56.0f), 0, 0, 0);
        addView(frameLayout, tre.e(-1, -1, jn7.D1));
        b6 b6Var = new b6(activity, (byte) 25);
        this.b = b6Var;
        b6Var.setPivotX(hl.L(16.0f));
        b6Var.setPadding(hl.L(16.0f), 0, 0, 0);
        b6Var.setClipToPadding(false);
        frameLayout.addView(b6Var, tre.e(-1, -1, jn7.D1));
        this.c = new ema[2];
        for (int i = 0; i < 2; i++) {
            this.c[i] = new ema(activity);
            this.c[i].setGravity(19);
            this.c[i].setTextColor(-1);
            this.c[i].setTextSize(20);
            this.c[i].setTypeface(hl.o());
            this.c[i].setDrawablePadding(hl.L(4.0f));
            this.c[i].setScrollNonFitText(true);
            this.b.addView(this.c[i], tre.e(-1, -2, 19));
        }
        in inVar = new in(activity, true, false, false);
        this.d = inVar;
        inVar.b(0.4f, 320L, k43.h);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setGravity(19);
        inVar.setTextColor(-1);
        inVar.setEllipsizeByGradient(true);
        inVar.setImportantForAccessibility(1);
        inVar.setAccessibilityLiveRegion(1);
        this.a.addView(inVar, tre.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !isEmpty;
        boolean z3 = this.h;
        in inVar = this.d;
        if (z2 != z3) {
            this.h = z2;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = hl.q;
            int L = hl.L((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            b6 b6Var = this.b;
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(inVar, (Property<in, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(inVar, (Property<in, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<b6, Float>) property, isEmpty ? 0.0f : hl.L(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<b6, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<b6, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(k43.h);
                this.f.start();
            } else {
                inVar.setAlpha(!isEmpty ? 1.0f : 0.0f);
                inVar.setTranslationY(L);
                b6Var.setTranslationY(isEmpty ? 0.0f : hl.L(-12.0f));
                b6Var.setScaleX(!isEmpty ? 0.87f : 1.0f);
                b6Var.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        inVar.c(charSequence, z, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        inVar.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        ema[] emaVarArr = this.c;
        emaVarArr[0].getPaint().setShadowLayer(hl.N(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        emaVarArr[1].getPaint().setShadowLayer(hl.N(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        this.d.getDrawable().s(hl.N(0.66f), 1.0f, z ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        ema[] emaVarArr = this.c;
        emaVarArr[1].setAlpha(0.0f);
        emaVarArr[1].setVisibility(8);
        CharSequence text = emaVarArr[0].getText();
        if (!(text == null ? false : TextUtils.equals(text.toString(), charSequence.toString()))) {
            ema emaVar = emaVarArr[0];
            emaVar.S = 0.0f;
            emaVar.b();
        }
        emaVarArr[0].k(charSequence);
        emaVarArr[0].setAlpha(1.0f);
        emaVarArr[0].setTranslationX(0.0f);
        emaVarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z, boolean z2) {
        ema[] emaVarArr = this.c;
        CharSequence text = emaVarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        ema emaVar = emaVarArr[1];
        ema emaVar2 = emaVarArr[0];
        emaVar.getClass();
        emaVar.S = emaVar2.S;
        emaVar.b();
        emaVarArr[1].k(emaVarArr[0].getText());
        emaVarArr[1].setRightPadding((int) this.r);
        ema emaVar3 = emaVarArr[0];
        emaVar3.S = 0.0f;
        emaVar3.b();
        emaVarArr[0].k(charSequence);
        float L = hl.L(8.0f) * (z2 ? 1 : -1);
        emaVarArr[1].setTranslationX(0.0f);
        emaVarArr[1].setTranslationY(0.0f);
        if (z) {
            emaVarArr[0].setTranslationX(0.0f);
            emaVarArr[0].setTranslationY(-L);
        } else {
            emaVarArr[0].setTranslationX(-L);
            emaVarArr[0].setTranslationY(0.0f);
        }
        emaVarArr[0].setAlpha(0.0f);
        emaVarArr[1].setAlpha(1.0f);
        emaVarArr[0].setVisibility(0);
        emaVarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(emaVarArr[1], (Property<ema, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(emaVarArr[0], (Property<ema, Float>) property, 1.0f));
        ema emaVar4 = emaVarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(emaVar4, (Property<ema, Float>) (z ? property3 : property2), L));
        ema emaVar5 = emaVarArr[0];
        if (z) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(emaVar5, (Property<ema, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new n88(this, (byte) 11));
        this.e.setDuration(320L);
        this.e.setInterpolator(k43.h);
        this.e.start();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            ema[] emaVarArr = this.c;
            emaVarArr[0].invalidate();
            emaVarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, hl.m, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = hl.m;
        int i4 = this.s;
        int i5 = hl.q.y;
        if (i4 != i5) {
            this.s = i5;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i3, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
