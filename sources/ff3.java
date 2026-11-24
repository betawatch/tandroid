// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ff3 extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ hf3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff3(hf3 hf3Var, Context context) {
        super(context);
        this.n = hf3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        if (!hf3Var.n) {
            return false;
        }
        if (!hf3Var.s) {
            if (Math.abs(gf3VarArr[1].getTranslationX()) < 1.0f) {
                gf3VarArr[0].setTranslationX(r1.getMeasuredWidth() * (hf3Var.r ? -1 : 1));
                gf3VarArr[1].setTranslationX(0.0f);
                animatorSet = hf3Var.h;
                if (animatorSet != null) {
                }
                hf3Var.n = false;
            }
            return hf3Var.n;
        }
        if (Math.abs(gf3VarArr[0].getTranslationX()) < 1.0f) {
            gf3VarArr[0].setTranslationX(0.0f);
            gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth() * (hf3Var.r ? 1 : -1));
            animatorSet = hf3Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                hf3Var.h = null;
            }
            hf3Var.n = false;
        }
        return hf3Var.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        a aVar;
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = hf3Var.e;
        int i = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        aVar = ((d) hf3Var).actionBar;
        aVar.setEnabled(false);
        hf3Var.e.setEnabled(false);
        gf3 gf3Var = gf3VarArr[1];
        gf3Var.f = i;
        gf3Var.setVisibility(0);
        hf3Var.r = z;
        hf3Var.q0(true);
        if (z) {
            gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth());
            return true;
        }
        gf3VarArr[1].setTranslationX(-gf3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ui5 ui5Var;
        ui5 ui5Var2;
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        hf3 hf3Var = this.n;
        ui5Var = ((d) hf3Var).parentLayout;
        if (ui5Var != null) {
            ui5Var2 = ((d) hf3Var).parentLayout;
            aVar = ((d) hf3Var).actionBar;
            int measuredHeight = aVar.getMeasuredHeight();
            aVar2 = ((d) hf3Var).actionBar;
            ((ActionBarLayout) ui5Var2).o(canvas, measuredHeight + ((int) aVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        hf3 hf3Var = this.n;
        Paint paint = hf3Var.d;
        paint.setColor(bkb.w0(null, bkb.c6, false));
        aVar = ((d) hf3Var).actionBar;
        float measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) hf3Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        aVar = ((d) hf3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) hf3Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        this.h = true;
        for (int i3 = 0; i3 < gf3VarArr.length; i3++) {
            gf3 gf3Var = gf3VarArr[i3];
            if (gf3Var != null) {
                o39 o39Var = gf3Var.d;
                if (o39Var != null) {
                    o39Var.setPadding(0, measuredHeight, 0, 0);
                }
                ns9 ns9Var = gf3VarArr[i3].e;
                if (ns9Var != null) {
                    ns9Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar3 = ((d) hf3Var).actionBar;
                if (childAt != aVar3) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui5 ui5Var;
        float f;
        float f2;
        a aVar;
        float measuredWidth;
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        ui5Var = ((d) hf3Var).parentLayout;
        if (((ActionBarLayout) ui5Var).h() || a()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.f = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.b && !this.c) {
            this.a = motionEvent.getPointerId(0);
            this.c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.a) {
            int x = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (!hf3Var.r ? x < 0 : x > 0)) {
                if (!b(motionEvent, x < 0)) {
                    this.c = true;
                    this.b = false;
                    gf3VarArr[0].setTranslationX(0.0f);
                    gf3VarArr[1].setTranslationX(hf3Var.r ? gf3VarArr[0].getMeasuredWidth() : -gf3VarArr[0].getMeasuredWidth());
                    hf3Var.e.i(0.0f, gf3VarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    gf3VarArr[0].setTranslationX(x);
                    if (hf3Var.r) {
                        gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth() + x);
                    } else {
                        gf3VarArr[1].setTranslationX(x - gf3VarArr[0].getMeasuredWidth());
                    }
                    hf3Var.e.i(Math.abs(x) / gf3VarArr[0].getMeasuredWidth(), gf3VarArr[1].f);
                }
            } else if (Math.abs(x) >= gl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                b(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, hf3Var.w);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.f.getXVelocity();
                f2 = this.f.getYVelocity();
                if (!this.b && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    b(motionEvent, f < 0.0f);
                }
            }
            if (this.b) {
                float x2 = gf3VarArr[0].getX();
                hf3Var.h = new AnimatorSet();
                boolean z = Math.abs(x2) < ((float) gf3VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                hf3Var.s = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z2 = hf3Var.r;
                    AnimatorSet animatorSet = hf3Var.h;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], (Property<gf3, Float>) property, 0.0f), ObjectAnimator.ofFloat(gf3VarArr[1], (Property<gf3, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], (Property<gf3, Float>) property, 0.0f), ObjectAnimator.ofFloat(gf3VarArr[1], (Property<gf3, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = gf3VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z3 = hf3Var.r;
                    AnimatorSet animatorSet2 = hf3Var.h;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], (Property<gf3, Float>) property, -r7.getMeasuredWidth()), ObjectAnimator.ofFloat(gf3VarArr[1], (Property<gf3, Float>) property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], (Property<gf3, Float>) property, r7.getMeasuredWidth()), ObjectAnimator.ofFloat(gf3VarArr[1], (Property<gf3, Float>) property, 0.0f));
                    }
                }
                hf3Var.h.setInterpolator(hf3.y);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (gl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                hf3Var.h.setDuration(Math.max(kk7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                hf3Var.h.addListener(new im2(this, (byte) 5));
                hf3Var.h.start();
                hf3Var.n = true;
                this.b = false;
            } else {
                this.c = false;
                aVar = ((d) hf3Var).actionBar;
                aVar.setEnabled(true);
                hf3Var.e.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f = null;
            }
        }
        return this.b;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
