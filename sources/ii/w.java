package ii;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class w extends FrameLayout {
    public ObjectAnimator a;
    public d2.t0 b;
    public ci.j1 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public gh.g r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        ci.j1 j1Var = this.c;
        gh.g gVar = this.r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            j1Var.invalidateOutline();
            j1Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        ci.j1 j1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j1Var, (Property<ci.j1, Float>) FrameLayout.TRANSLATION_Y, j1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new ai.e1(this, 28));
        this.a.setDuration(150L);
        this.a.setInterpolator(xq.f);
        this.a.start();
        a0 a0Var = ((te) this).w.m0;
        if (a0Var != null) {
            a0Var.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f) {
            return;
        }
        ci.j1 j1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j1Var, (Property<ci.j1, Float>) FrameLayout.TRANSLATION_Y, j1Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(xq.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - org.telegram.messenger.g0.L(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public tj0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        ci.j1 j1Var = this.c;
        super.onMeasure(i3, i10);
        if (this.n && !this.f) {
            j1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (j1Var.getMeasuredHeight() - j1Var.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        ci.j1 j1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = j1Var.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        j1Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        ci.j1 j1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = j1Var.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            j1Var.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.b.a = i3;
        if (this.f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return !this.f && i3 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.b.a = 0;
        boolean z10 = this.f;
        if (z10 || z10) {
            return;
        }
        if (this.c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(gh.g gVar) {
        this.r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.r.q(org.telegram.messenger.g0.L(5.0f));
        ci.j1 j1Var = this.c;
        if (gVar.S == null) {
            gVar.S = new gh.a(gVar, 0);
        }
        j1Var.setOutlineProvider(gVar.S);
    }
}
