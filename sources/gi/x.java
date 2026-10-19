package gi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.nf;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class x extends FrameLayout {
    public ObjectAnimator a;
    public b2.u0 b;
    public ai.u1 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public dh.d r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        ai.u1 u1Var = this.c;
        dh.d dVar = this.r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            u1Var.invalidateOutline();
            u1Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        ai.u1 u1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, (Property<ai.u1, Float>) FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new ah.b(this, 25));
        this.a.setDuration(150L);
        this.a.setInterpolator(bs.f);
        this.a.start();
        b0 b0Var = ((nf) this).v.l0;
        if (b0Var != null) {
            b0Var.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f) {
            return;
        }
        ai.u1 u1Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, (Property<ai.u1, Float>) FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(bs.f);
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

    public im0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ai.u1 u1Var = this.c;
        super.onMeasure(i10, i11);
        if (this.n && !this.f) {
            u1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (u1Var.getMeasuredHeight() - u1Var.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        ai.u1 u1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = u1Var.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f7 = translationY - i11;
        iArr[1] = i11;
        u1Var.setTranslationY(f7 >= 0.0f ? f7 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        ai.u1 u1Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = u1Var.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            u1Var.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.b.a = i10;
        if (this.f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return !this.f && i10 == 2;
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

    public void setBackgroundDrawable(dh.d dVar) {
        this.r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.r.p(AndroidUtilities.dp(5.0f));
        ai.u1 u1Var = this.c;
        if (dVar.k == null) {
            dVar.k = new dh.b(dVar, 0);
        }
        u1Var.setOutlineProvider(dVar.k);
    }
}
