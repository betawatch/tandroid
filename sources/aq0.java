// default package

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class aq0 extends FrameLayout {
    public ObjectAnimator a;
    public az8 b;
    public fv c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public im0 r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        fv fvVar = this.c;
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.setBounds(0, ((int) this.h) - gm.L(25.0f), getMeasuredWidth(), gm.L(5.0f) + getMeasuredHeight());
            fvVar.invalidateOutline();
            fvVar.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        fv fvVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fvVar, (Property<fv, Float>) FrameLayout.TRANSLATION_Y, fvVar.getTranslationY(), (getMeasuredHeight() - this.h) + gm.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new g0(this, (byte) 25));
        this.a.setDuration(150L);
        this.a.setInterpolator(d53.f);
        this.a.start();
        eq0 eq0Var = ((py1) this).w.m0;
        if (eq0Var != null) {
            eq0Var.setOpened(false);
        }
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        fv fvVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fvVar, (Property<fv, Float>) FrameLayout.TRANSLATION_Y, fvVar.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(d53.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - gm.L(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public r59 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        fv fvVar = this.c;
        super.onMeasure(i, i2);
        if (this.n && !this.f) {
            fvVar.setTranslationY(gm.L(16.0f) + (fvVar.getMeasuredHeight() - fvVar.getPaddingTop()));
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
        fv fvVar = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = fvVar.getTranslationY();
        if (translationY <= 0.0f || i2 <= 0) {
            return;
        }
        float f = translationY - i2;
        iArr[1] = i2;
        fvVar.setTranslationY(f >= 0.0f ? f : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        fv fvVar = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i4 != 0) {
            float translationY = fvVar.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            fvVar.setTranslationY(translationY);
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
        if (this.c.getTranslationY() > gm.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(im0 im0Var) {
        this.r = im0Var;
        im0Var.r(gm.L(22.0f));
        this.r.q(gm.L(5.0f));
        fv fvVar = this.c;
        cm0 cm0Var = im0Var.T;
        if (cm0Var == null) {
            cm0Var = new cm0(im0Var, (byte) 0);
            im0Var.T = cm0Var;
        }
        fvVar.setOutlineProvider(cm0Var);
    }
}
