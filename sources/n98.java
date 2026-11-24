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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n98 extends FrameLayout implements gk7 {
    public final FrameLayout a;
    public final a6 b;
    public final jia[] c;
    public final hn d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public n98(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(gl.L(56.0f), 0, 0, 0);
        addView(frameLayout, nme.e(-1, -1, kk7.D1));
        a6 a6Var = new a6(activity, (byte) 24);
        this.b = a6Var;
        a6Var.setPivotX(gl.L(16.0f));
        a6Var.setPadding(gl.L(16.0f), 0, 0, 0);
        a6Var.setClipToPadding(false);
        frameLayout.addView(a6Var, nme.e(-1, -1, kk7.D1));
        this.c = new jia[2];
        for (int i = 0; i < 2; i++) {
            this.c[i] = new jia(activity);
            this.c[i].setGravity(19);
            this.c[i].setTextColor(-1);
            this.c[i].setTextSize(20);
            this.c[i].setTypeface(gl.o());
            this.c[i].setDrawablePadding(gl.L(4.0f));
            this.c[i].setScrollNonFitText(true);
            this.b.addView(this.c[i], nme.e(-1, -2, 19));
        }
        hn hnVar = new hn(activity, true, false, false);
        this.d = hnVar;
        hnVar.b(0.4f, 320L, s33.h);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setGravity(19);
        hnVar.setTextColor(-1);
        hnVar.setEllipsizeByGradient(true);
        hnVar.setImportantForAccessibility(1);
        hnVar.setAccessibilityLiveRegion(1);
        this.a.addView(hnVar, nme.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !isEmpty;
        boolean z3 = this.h;
        hn hnVar = this.d;
        if (z2 != z3) {
            this.h = z2;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = gl.q;
            int L = gl.L((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            a6 a6Var = this.b;
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(hnVar, (Property<hn, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(hnVar, (Property<hn, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) property, isEmpty ? 0.0f : gl.L(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(s33.h);
                this.f.start();
            } else {
                hnVar.setAlpha(!isEmpty ? 1.0f : 0.0f);
                hnVar.setTranslationY(L);
                a6Var.setTranslationY(isEmpty ? 0.0f : gl.L(-12.0f));
                a6Var.setScaleX(!isEmpty ? 0.87f : 1.0f);
                a6Var.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        hnVar.c(charSequence, z, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        hnVar.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        jia[] jiaVarArr = this.c;
        jiaVarArr[0].getPaint().setShadowLayer(gl.N(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        jiaVarArr[1].getPaint().setShadowLayer(gl.N(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        this.d.getDrawable().s(gl.N(0.66f), 1.0f, z ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        jia[] jiaVarArr = this.c;
        jiaVarArr[1].setAlpha(0.0f);
        jiaVarArr[1].setVisibility(8);
        CharSequence text = jiaVarArr[0].getText();
        if (!(text == null ? false : TextUtils.equals(text.toString(), charSequence.toString()))) {
            jia jiaVar = jiaVarArr[0];
            jiaVar.S = 0.0f;
            jiaVar.b();
        }
        jiaVarArr[0].k(charSequence);
        jiaVarArr[0].setAlpha(1.0f);
        jiaVarArr[0].setTranslationX(0.0f);
        jiaVarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z, boolean z2) {
        jia[] jiaVarArr = this.c;
        CharSequence text = jiaVarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        jia jiaVar = jiaVarArr[1];
        jia jiaVar2 = jiaVarArr[0];
        jiaVar.getClass();
        jiaVar.S = jiaVar2.S;
        jiaVar.b();
        jiaVarArr[1].k(jiaVarArr[0].getText());
        jiaVarArr[1].setRightPadding((int) this.r);
        jia jiaVar3 = jiaVarArr[0];
        jiaVar3.S = 0.0f;
        jiaVar3.b();
        jiaVarArr[0].k(charSequence);
        float L = gl.L(8.0f) * (z2 ? 1 : -1);
        jiaVarArr[1].setTranslationX(0.0f);
        jiaVarArr[1].setTranslationY(0.0f);
        if (z) {
            jiaVarArr[0].setTranslationX(0.0f);
            jiaVarArr[0].setTranslationY(-L);
        } else {
            jiaVarArr[0].setTranslationX(-L);
            jiaVarArr[0].setTranslationY(0.0f);
        }
        jiaVarArr[0].setAlpha(0.0f);
        jiaVarArr[1].setAlpha(1.0f);
        jiaVarArr[0].setVisibility(0);
        jiaVarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(jiaVarArr[1], (Property<jia, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(jiaVarArr[0], (Property<jia, Float>) property, 1.0f));
        jia jiaVar4 = jiaVarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(jiaVar4, (Property<jia, Float>) (z ? property3 : property2), L));
        jia jiaVar5 = jiaVarArr[0];
        if (z) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(jiaVar5, (Property<jia, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new l48(this, (byte) 12));
        this.e.setDuration(320L);
        this.e.setInterpolator(s33.h);
        this.e.start();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            jia[] jiaVarArr = this.c;
            jiaVarArr[0].invalidate();
            jiaVarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, gl.m, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = gl.m;
        int i4 = this.s;
        int i5 = gl.q.y;
        if (i4 != i5) {
            this.s = i5;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i3, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
