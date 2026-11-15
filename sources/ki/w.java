package ki;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ve;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public abstract class w extends FrameLayout {
    public ObjectAnimator a;
    public e2.r0 b;
    public di.c1 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public fh.g r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        di.c1 c1Var = this.c;
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            c1Var.invalidateOutline();
            c1Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        di.c1 c1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var, (Property<di.c1, Float>) FrameLayout.TRANSLATION_Y, c1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new ai.i0(this, 28));
        this.a.setDuration(150L);
        this.a.setInterpolator(er.f);
        this.a.start();
        a0 a0Var = ((ve) this).w.m0;
        if (a0Var != null) {
            a0Var.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f) {
            return;
        }
        di.c1 c1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var, (Property<di.c1, Float>) FrameLayout.TRANSLATION_Y, c1Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(er.f);
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

    public uj0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        di.c1 c1Var = this.c;
        super.onMeasure(i7, i10);
        if (this.n && !this.f) {
            c1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (c1Var.getMeasuredHeight() - c1Var.getPaddingTop()));
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
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        di.c1 c1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = c1Var.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        c1Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        di.c1 c1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = c1Var.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            c1Var.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.b.a = i7;
        if (this.f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return !this.f && i7 == 2;
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

    public void setBackgroundDrawable(fh.g gVar) {
        this.r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.r.q(org.telegram.messenger.g0.L(5.0f));
        di.c1 c1Var = this.c;
        if (gVar.S == null) {
            gVar.S = new fh.a(gVar, 0);
        }
        c1Var.setOutlineProvider(gVar.S);
    }
}
