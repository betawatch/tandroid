package hi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import bi.t5;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public abstract class u extends FrameLayout {
    public ObjectAnimator a;
    public e2.r0 b;
    public bi.q1 c;
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
        bi.q1 q1Var = this.c;
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            q1Var.invalidateOutline();
            q1Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        bi.q1 q1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q1Var, (Property<bi.q1, Float>) FrameLayout.TRANSLATION_Y, q1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new t5(this, 26));
        this.a.setDuration(150L);
        this.a.setInterpolator(xq.f);
        this.a.start();
        y yVar = ((ve) this).w.l0;
        if (yVar != null) {
            yVar.setOpened(false);
        }
    }

    public final void d(boolean z9) {
        if (this.f) {
            return;
        }
        bi.q1 q1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q1Var, (Property<bi.q1, Float>) FrameLayout.TRANSLATION_Y, q1Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z9) {
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

    public qj0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        bi.q1 q1Var = this.c;
        super.onMeasure(i7, i10);
        if (this.n && !this.f) {
            q1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (q1Var.getMeasuredHeight() - q1Var.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        bi.q1 q1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = q1Var.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        q1Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        bi.q1 q1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = q1Var.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            q1Var.setTranslationY(translationY);
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
        boolean z9 = this.f;
        if (z9 || z9) {
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
        bi.q1 q1Var = this.c;
        if (gVar.R == null) {
            gVar.R = new fh.a(gVar, 0);
        }
        q1Var.setOutlineProvider(gVar.R);
    }
}
