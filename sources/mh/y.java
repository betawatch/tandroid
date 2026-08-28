package mh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout {
    public ObjectAnimator a;
    public d5.p b;
    public gh.f1 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public kg.d r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        gh.f1 f1Var = this.c;
        kg.d dVar = this.r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            f1Var.invalidateOutline();
            f1Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        gh.f1 f1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f1Var, (Property<gh.f1, Float>) FrameLayout.TRANSLATION_Y, f1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new x(this, 0));
        this.a.setDuration(150L);
        this.a.setInterpolator(gr.f);
        this.a.start();
        c0 c0Var = ((df) this).v.h0;
        if (c0Var != null) {
            c0Var.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f) {
            return;
        }
        gh.f1 f1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f1Var, (Property<gh.f1, Float>) FrameLayout.TRANSLATION_Y, f1Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(gr.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - AndroidUtilities.dp(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public wk0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        d5.p pVar = this.b;
        return pVar.b | pVar.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        gh.f1 f1Var = this.c;
        super.onMeasure(i9, i10);
        if (this.n && !this.f) {
            f1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (f1Var.getMeasuredHeight() - f1Var.getPaddingTop()));
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
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        gh.f1 f1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = f1Var.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        f1Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        gh.f1 f1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = f1Var.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            f1Var.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        this.b.a = i9;
        if (this.f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        return !this.f && i9 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.b.a = 0;
        boolean z10 = this.f;
        if (z10 || z10) {
            return;
        }
        if (this.c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(kg.d dVar) {
        this.r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.r.o(AndroidUtilities.dp(5.0f));
        gh.f1 f1Var = this.c;
        if (dVar.i == null) {
            dVar.i = new kg.b(dVar, 0);
        }
        f1Var.setOutlineProvider(dVar.i);
    }
}
