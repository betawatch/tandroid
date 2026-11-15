package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class a8 extends NestedScrollView implements l60 {
    public final org.telegram.ui.Cells.r9 a0;
    public final r1.g b0;
    public final z7 c0;
    public boolean d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public final OverScroller l0;
    public boolean m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public final FrameLayout s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public boolean w0;
    public boolean x0;

    public a8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.r0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.s0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        ns.i(this);
        z7 z7Var = new z7(this, getContext());
        this.c0 = z7Var;
        org.telegram.ui.Cells.r9 r9Var = new org.telegram.ui.Cells.r9(z7Var, e6Var);
        this.a0 = r9Var;
        r9Var.h0 = false;
        frameLayout.addView(z7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) z7Var, (r1.e) r1.g.p, 0.0f);
        this.b0 = gVar;
        gVar.m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new t7(0, this));
        gVar.m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.l0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.l0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.b0.d();
            this.d0 = true;
            this.e0 = this.c0.getTranslationY();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.d0 && i7 == 0) {
            this.d0 = false;
            if (this.e0 == 0.0f || (overScroller = this.l0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.g0);
        }
    }

    public final void D() {
        if (this.w0) {
            this.w0 = false;
            float scrollY = getScrollY();
            float f10 = this.c0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new s7(this, scrollY, f10, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(er.f);
            ofFloat.start();
        }
    }

    public final void E(boolean z10) {
        if (!this.w0 || z10) {
            this.w0 = true;
            float scrollY = getScrollY();
            float f10 = this.c0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new s7(this, scrollY, f10, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(er.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.w0 = false;
        z7 z7Var = this.c0;
        z7Var.x = 0.0f;
        z7Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.b0;
        if (!gVar.f) {
            gVar.a = f10;
            gVar.h();
        }
        if (getScrollY() < org.telegram.messenger.g0.L(2.0f)) {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i7, int i10) {
        int i11;
        if (i7 != 0 && i10 != 0) {
            z7 z7Var = this.c0;
            y7 y7Var = z7Var.r[0];
            CharSequence charSequence = y7Var.n;
            v7 v7Var = y7Var.o;
            SpannableStringBuilder spannableStringBuilder = v7Var != null ? v7Var.k : null;
            String str = v7Var != null ? v7Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = org.telegram.messenger.g0.q;
            boolean z10 = point.x > point.y;
            if (this.n0 != hashCode || this.o0 != hashCode2 || this.p0 != hashCode3 || this.m0 != z10 || this.q0 != i10 || z7Var.I) {
                this.n0 = hashCode;
                this.o0 = hashCode2;
                this.p0 = hashCode3;
                this.m0 = z10;
                this.q0 = i10;
                z7Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                y7[] y7VarArr = z7Var.r;
                int a10 = y7VarArr[0].a(i10);
                y7 y7Var2 = y7VarArr[1];
                i11 = org.telegram.messenger.g0.W1(z7Var.H, a10, y7Var2 != null ? y7Var2.a(i10) : 0);
                if (i11 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.s0.getLayoutParams()).topMargin = i11;
                    this.r0 = -1;
                    return;
                }
                return;
            }
        }
        i11 = -1;
        if (i11 < 0) {
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.d0 || this.e0 == 0.0f || (overScroller = this.l0) == null || !overScroller.isFinished()) {
            return;
        }
        K(0.0f);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.d0) {
            float f10 = this.e0;
            if ((f10 > 0.0f && i10 > 0) || (f10 < 0.0f && i10 < 0)) {
                float f11 = i10;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.e0 = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.e0 = f12;
                        iArr[1] = i10;
                    }
                } else if (f12 > 0.0f) {
                    this.e0 = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.e0 = f12;
                    iArr[1] = i10;
                }
                this.c0.setTranslationY(this.e0);
                this.a0.w();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.u0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.v0 + i7);
        canvas.clipRect(0, scrollY, width, i7);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void e(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.e0) / this.s0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.d0;
                z7 z7Var = this.c0;
                if (z10) {
                    float f11 = this.e0 - round;
                    this.e0 = f11;
                    z7Var.setTranslationY(f11);
                } else if (!this.b0.f) {
                    OverScroller overScroller = this.l0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f10 = 0.0f;
                    } else {
                        Point point = org.telegram.messenger.g0.q;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f10 = min * (-this.f0);
                    }
                    if (round != 0) {
                        float f12 = this.e0 - round;
                        this.e0 = f12;
                        z7Var.setTranslationY(f12);
                    }
                    K(f10);
                }
            }
        }
        this.a0.w();
    }

    @Override // org.telegram.ui.Components.l60
    public final void f(RectF rectF) {
        y7 y7Var;
        z7 z7Var = this.c0;
        y7[] y7VarArr = z7Var.r;
        if (y7VarArr == null || (y7Var = y7VarArr[0]) == null || y7Var.p == null) {
            return;
        }
        float f10 = z7Var.F;
        float W1 = (org.telegram.messenger.g0.W1(z7Var.x, y7Var.m, y7Var.l) + z7Var.G) - z7Var.r[0].p.b();
        float width = getWidth() - z7Var.F;
        int i7 = z7Var.G;
        y7 y7Var2 = z7Var.r[0];
        rectF.set(f10, W1, width, org.telegram.messenger.g0.W1(z7Var.x, y7Var2.m, y7Var2.l) + i7);
        float x10 = z7Var.getX() - getScrollX();
        FrameLayout frameLayout = this.s0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (z7Var.getY() - getScrollY()));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.s0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.r0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.s0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.c0.getTranslationY()) / Math.min(this.q0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.c0.getTranslationY() + this.s0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // org.telegram.ui.Components.l60
    public final void h(Canvas canvas, float f10) {
        y7 y7Var;
        z7 z7Var = this.c0;
        y7[] y7VarArr = z7Var.r;
        y7[] y7VarArr2 = z7Var.r;
        if (y7VarArr == null || (y7Var = y7VarArr[0]) == null || y7Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = z7Var.getX() - getScrollX();
        FrameLayout frameLayout = this.s0;
        float x11 = frameLayout.getX() + x10 + z7Var.F;
        float y10 = frameLayout.getY() + (z7Var.getY() - getScrollY()) + z7Var.G;
        y7 y7Var2 = y7VarArr2[0];
        canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(z7Var.x, y7Var2.m, y7Var2.l)) - y7VarArr2[0].p.b());
        v7 v7Var = y7VarArr2[0].p;
        int width = getWidth();
        int i7 = z7Var.F;
        v7Var.a(canvas, (width - i7) - i7);
        canvas.restore();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i7) {
        super.i(i7);
        this.f0 = Math.signum(i7);
        this.g0 = 0.0f;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.a0.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.s0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z7 z7Var = this.c0;
        if (z7Var.x == 1.0f && !this.t0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.x0 = true;
                invalidate();
            } else if (this.x0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.x0 = false;
                invalidate();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.x0) {
            this.x0 = false;
            invalidate();
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        L(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.s0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        z7 z7Var = this.c0;
        if (z7Var.x == 1.0f && !this.t0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.x0 = true;
                invalidate();
            } else if (this.x0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.x0 = false;
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.x0) {
            this.x0 = false;
            invalidate();
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        super.scrollBy(i7, i10);
        invalidate();
    }

    public void F(org.telegram.ui.Components.p5 p5Var) {
    }

    public void I(v7 v7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, c1 c1Var) {
    }
}
