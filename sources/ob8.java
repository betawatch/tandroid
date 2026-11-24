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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ob8 extends FrameLayout implements jm7 {
    public final FrameLayout a;
    public final a6 b;
    public final lka[] c;
    public final io d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public ob8(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(gm.L(56.0f), 0, 0, 0);
        addView(frameLayout, qoe.e(-1, -1, nm7.D1));
        a6 a6Var = new a6(activity, (byte) 24);
        this.b = a6Var;
        a6Var.setPivotX(gm.L(16.0f));
        a6Var.setPadding(gm.L(16.0f), 0, 0, 0);
        a6Var.setClipToPadding(false);
        frameLayout.addView(a6Var, qoe.e(-1, -1, nm7.D1));
        this.c = new lka[2];
        for (int i = 0; i < 2; i++) {
            this.c[i] = new lka(activity);
            this.c[i].setGravity(19);
            this.c[i].setTextColor(-1);
            this.c[i].setTextSize(20);
            this.c[i].setTypeface(gm.o());
            this.c[i].setDrawablePadding(gm.L(4.0f));
            this.c[i].setScrollNonFitText(true);
            this.b.addView(this.c[i], qoe.e(-1, -2, 19));
        }
        io ioVar = new io(activity, true, false, false);
        this.d = ioVar;
        ioVar.b(0.4f, 320L, d53.h);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setGravity(19);
        ioVar.setTextColor(-1);
        ioVar.setEllipsizeByGradient(true);
        ioVar.setImportantForAccessibility(1);
        ioVar.setAccessibilityLiveRegion(1);
        this.a.addView(ioVar, qoe.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !isEmpty;
        boolean z3 = this.h;
        io ioVar = this.d;
        if (z2 != z3) {
            this.h = z2;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = gm.q;
            int L = gm.L((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            a6 a6Var = this.b;
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(ioVar, (Property<io, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(ioVar, (Property<io, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) property, isEmpty ? 0.0f : gm.L(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(d53.h);
                this.f.start();
            } else {
                ioVar.setAlpha(!isEmpty ? 1.0f : 0.0f);
                ioVar.setTranslationY(L);
                a6Var.setTranslationY(isEmpty ? 0.0f : gm.L(-12.0f));
                a6Var.setScaleX(!isEmpty ? 0.87f : 1.0f);
                a6Var.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        ioVar.c(charSequence, z, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        ioVar.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        lka[] lkaVarArr = this.c;
        lkaVarArr[0].getPaint().setShadowLayer(gm.N(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        lkaVarArr[1].getPaint().setShadowLayer(gm.N(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        this.d.getDrawable().s(gm.N(0.66f), 1.0f, z ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        lka[] lkaVarArr = this.c;
        lkaVarArr[1].setAlpha(0.0f);
        lkaVarArr[1].setVisibility(8);
        CharSequence text = lkaVarArr[0].getText();
        if (!(text == null ? false : TextUtils.equals(text.toString(), charSequence.toString()))) {
            lka lkaVar = lkaVarArr[0];
            lkaVar.S = 0.0f;
            lkaVar.b();
        }
        lkaVarArr[0].k(charSequence);
        lkaVarArr[0].setAlpha(1.0f);
        lkaVarArr[0].setTranslationX(0.0f);
        lkaVarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z, boolean z2) {
        lka[] lkaVarArr = this.c;
        CharSequence text = lkaVarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        lka lkaVar = lkaVarArr[1];
        lka lkaVar2 = lkaVarArr[0];
        lkaVar.getClass();
        lkaVar.S = lkaVar2.S;
        lkaVar.b();
        lkaVarArr[1].k(lkaVarArr[0].getText());
        lkaVarArr[1].setRightPadding((int) this.r);
        lka lkaVar3 = lkaVarArr[0];
        lkaVar3.S = 0.0f;
        lkaVar3.b();
        lkaVarArr[0].k(charSequence);
        float L = gm.L(8.0f) * (z2 ? 1 : -1);
        lkaVarArr[1].setTranslationX(0.0f);
        lkaVarArr[1].setTranslationY(0.0f);
        if (z) {
            lkaVarArr[0].setTranslationX(0.0f);
            lkaVarArr[0].setTranslationY(-L);
        } else {
            lkaVarArr[0].setTranslationX(-L);
            lkaVarArr[0].setTranslationY(0.0f);
        }
        lkaVarArr[0].setAlpha(0.0f);
        lkaVarArr[1].setAlpha(1.0f);
        lkaVarArr[0].setVisibility(0);
        lkaVarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(lkaVarArr[1], (Property<lka, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(lkaVarArr[0], (Property<lka, Float>) property, 1.0f));
        lka lkaVar4 = lkaVarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(lkaVar4, (Property<lka, Float>) (z ? property3 : property2), L));
        lka lkaVar5 = lkaVarArr[0];
        if (z) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(lkaVar5, (Property<lka, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new s38(this, (byte) 14));
        this.e.setDuration(320L);
        this.e.setInterpolator(d53.h);
        this.e.start();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            lka[] lkaVarArr = this.c;
            lkaVarArr[0].invalidate();
            lkaVarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, gm.m, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = gm.m;
        int i4 = this.s;
        int i5 = gm.q.y;
        if (i4 != i5) {
            this.s = i5;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i3, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
