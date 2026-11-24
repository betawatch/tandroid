// default package

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ap0 extends FrameLayout {
    public ObjectAnimator a;
    public zw8 b;
    public fu c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public il0 r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        fu fuVar = this.c;
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.setBounds(0, ((int) this.h) - gl.L(25.0f), getMeasuredWidth(), gl.L(5.0f) + getMeasuredHeight());
            fuVar.invalidateOutline();
            fuVar.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        fu fuVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fuVar, (Property<fu, Float>) FrameLayout.TRANSLATION_Y, fuVar.getTranslationY(), (getMeasuredHeight() - this.h) + gl.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new g0(this, (byte) 23));
        this.a.setDuration(150L);
        this.a.setInterpolator(s33.f);
        this.a.start();
        ep0 ep0Var = ((cx1) this).w.m0;
        if (ep0Var != null) {
            ep0Var.setOpened(false);
        }
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        fu fuVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fuVar, (Property<fu, Float>) FrameLayout.TRANSLATION_Y, fuVar.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(s33.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - gl.L(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public o39 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        fu fuVar = this.c;
        super.onMeasure(i, i2);
        if (this.n && !this.f) {
            fuVar.setTranslationY(gl.L(16.0f) + (fuVar.getMeasuredHeight() - fuVar.getPaddingTop()));
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
        fu fuVar = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = fuVar.getTranslationY();
        if (translationY <= 0.0f || i2 <= 0) {
            return;
        }
        float f = translationY - i2;
        iArr[1] = i2;
        fuVar.setTranslationY(f >= 0.0f ? f : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        fu fuVar = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i4 != 0) {
            float translationY = fuVar.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            fuVar.setTranslationY(translationY);
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
        if (this.c.getTranslationY() > gl.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(il0 il0Var) {
        this.r = il0Var;
        il0Var.r(gl.L(22.0f));
        this.r.q(gl.L(5.0f));
        fu fuVar = this.c;
        cl0 cl0Var = il0Var.T;
        if (cl0Var == null) {
            cl0Var = new cl0(il0Var, (byte) 0);
            il0Var.T = cl0Var;
        }
        fuVar.setOutlineProvider(cl0Var);
    }
}
