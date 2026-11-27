// default package

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class ap0 extends FrameLayout {
    public ObjectAnimator a;
    public l09 b;
    public gu c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public jl0 r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        gu guVar = this.c;
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.setBounds(0, ((int) this.h) - hl.L(25.0f), getMeasuredWidth(), hl.L(5.0f) + getMeasuredHeight());
            guVar.invalidateOutline();
            guVar.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        gu guVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(guVar, (Property<gu, Float>) FrameLayout.TRANSLATION_Y, guVar.getTranslationY(), (getMeasuredHeight() - this.h) + hl.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new h0(this, (byte) 23));
        this.a.setDuration(150L);
        this.a.setInterpolator(k43.f);
        this.a.start();
        ep0 ep0Var = ((qx1) this).w.m0;
        if (ep0Var != null) {
            ep0Var.setOpened(false);
        }
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        gu guVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(guVar, (Property<gu, Float>) FrameLayout.TRANSLATION_Y, guVar.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(k43.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - hl.L(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public d79 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        gu guVar = this.c;
        super.onMeasure(i, i2);
        if (this.n && !this.f) {
            guVar.setTranslationY(hl.L(16.0f) + (guVar.getMeasuredHeight() - guVar.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        gu guVar = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = guVar.getTranslationY();
        if (translationY <= 0.0f || i2 <= 0) {
            return;
        }
        float f = translationY - i2;
        iArr[1] = i2;
        guVar.setTranslationY(f >= 0.0f ? f : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        gu guVar = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i4 != 0) {
            float translationY = guVar.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            guVar.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.b.b = i;
        if (this.f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return !this.f && i == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.b.b = 0;
        boolean z = this.f;
        if (z || z) {
            return;
        }
        if (this.c.getTranslationY() > hl.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(jl0 jl0Var) {
        this.r = jl0Var;
        jl0Var.r(hl.L(22.0f));
        this.r.q(hl.L(5.0f));
        gu guVar = this.c;
        dl0 dl0Var = jl0Var.T;
        if (dl0Var == null) {
            dl0Var = new dl0(jl0Var, (byte) 0);
            jl0Var.T = dl0Var;
        }
        guVar.setOutlineProvider(dl0Var);
    }
}
