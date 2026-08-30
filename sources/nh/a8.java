package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class a8 extends NestedScrollView implements n70 {
    public final w9 T;
    public final o1.j U;
    public final z7 V;
    public boolean W;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public final OverScroller h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public final FrameLayout o0;
    public boolean p0;
    public boolean q0;
    public int r0;
    public boolean s0;
    public boolean t0;

    public a8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.n0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        z7 z7Var = new z7(this, getContext());
        this.V = z7Var;
        w9 w9Var = new w9(z7Var, f6Var);
        this.T = w9Var;
        w9Var.i0 = false;
        frameLayout.addView(z7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(z7Var, o1.h.n, 0.0f);
        this.U = jVar;
        jVar.u.b(100.0f);
        jVar.j = 1.0f;
        jVar.b(new dg.y(1, this));
        jVar.u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.h0 = (OverScroller) declaredField.get(this);
        } catch (Exception e6) {
            this.h0 = null;
            FileLog.e(e6);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.W && i10 == 0) {
            this.W = false;
            if (this.a0 == 0.0f || (overScroller = this.h0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.c0);
        }
    }

    public final void C() {
        if (this.s0) {
            this.s0 = false;
            float scrollY = getScrollY();
            float f10 = this.V.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new t7(this, scrollY, f10, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(nr.f);
            ofFloat.start();
        }
    }

    public final void D(boolean z4) {
        if (!this.s0 || z4) {
            this.s0 = true;
            float scrollY = getScrollY();
            float f10 = this.V.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new t7(this, scrollY, f10, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(nr.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.s0 = false;
        z7 z7Var = this.V;
        z7Var.w = 0.0f;
        z7Var.invalidate();
    }

    public final void K(float f10) {
        o1.j jVar = this.U;
        if (!jVar.f) {
            jVar.a = f10;
            jVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i10, int i11) {
        int i12;
        if (i10 != 0 && i11 != 0) {
            z7 z7Var = this.V;
            y7 y7Var = z7Var.r[0];
            CharSequence charSequence = y7Var.n;
            v7 v7Var = y7Var.o;
            SpannableStringBuilder spannableStringBuilder = v7Var != null ? v7Var.k : null;
            String str = v7Var != null ? v7Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = AndroidUtilities.displaySize;
            boolean z4 = point.x > point.y;
            if (this.j0 != hashCode || this.k0 != hashCode2 || this.l0 != hashCode3 || this.i0 != z4 || this.m0 != i11 || z7Var.E) {
                this.j0 = hashCode;
                this.k0 = hashCode2;
                this.l0 = hashCode3;
                this.i0 = z4;
                this.m0 = i11;
                z7Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                y7[] y7VarArr = z7Var.r;
                int a2 = y7VarArr[0].a(i11);
                y7 y7Var2 = y7VarArr[1];
                i12 = AndroidUtilities.lerp(a2, y7Var2 != null ? y7Var2.a(i11) : 0, z7Var.D);
                if (i12 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin = i12;
                    this.n0 = -1;
                    return;
                }
                return;
            }
        }
        i12 = -1;
        if (i12 < 0) {
        }
    }

    @Override // org.telegram.ui.Components.n70
    public final void a(RectF rectF) {
        y7 y7Var;
        z7 z7Var = this.V;
        y7[] y7VarArr = z7Var.r;
        if (y7VarArr == null || (y7Var = y7VarArr[0]) == null || y7Var.p == null) {
            return;
        }
        float f10 = z7Var.B;
        float lerp = (AndroidUtilities.lerp(y7Var.m, y7Var.l, z7Var.w) + z7Var.C) - z7Var.r[0].p.b();
        float width = getWidth() - z7Var.B;
        int i10 = z7Var.C;
        y7 y7Var2 = z7Var.r[0];
        rectF.set(f10, lerp, width, AndroidUtilities.lerp(y7Var2.m, y7Var2.l, z7Var.w) + i10);
        float x10 = z7Var.getX() - getScrollX();
        FrameLayout frameLayout = this.o0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (z7Var.getY() - getScrollY()));
    }

    @Override // org.telegram.ui.Components.n70
    public final void b(Canvas canvas, float f10) {
        y7 y7Var;
        z7 z7Var = this.V;
        y7[] y7VarArr = z7Var.r;
        y7[] y7VarArr2 = z7Var.r;
        if (y7VarArr == null || (y7Var = y7VarArr[0]) == null || y7Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = z7Var.getX() - getScrollX();
        FrameLayout frameLayout = this.o0;
        float x11 = frameLayout.getX() + x10 + z7Var.B;
        float y10 = frameLayout.getY() + (z7Var.getY() - getScrollY()) + z7Var.C;
        y7 y7Var2 = y7VarArr2[0];
        canvas.translate(x11, (y10 + AndroidUtilities.lerp(y7Var2.m, y7Var2.l, z7Var.w)) - y7VarArr2[0].p.b());
        v7 v7Var = y7VarArr2[0].p;
        int width = getWidth();
        int i10 = z7Var.B;
        v7Var.a(canvas, (width - i10) - i10);
        canvas.restore();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.W || this.a0 == 0.0f || (overScroller = this.h0) == null || !overScroller.isFinished()) {
            return;
        }
        K(0.0f);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.q0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.r0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.W) {
            float f10 = this.a0;
            if ((f10 > 0.0f && i11 > 0) || (f10 < 0.0f && i11 < 0)) {
                float f11 = i11;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.a0 = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.a0 = f12;
                        iArr[1] = i11;
                    }
                } else if (f12 > 0.0f) {
                    this.a0 = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.a0 = f12;
                    iArr[1] = i11;
                }
                this.V.setTranslationY(this.a0);
                this.T.x();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.o0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.n0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.V.getTranslationY()) / Math.min(this.m0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.V.getTranslationY() + this.o0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f10;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.a0) / this.o0.getTop())) * i13);
            if (round != 0) {
                boolean z4 = this.W;
                z7 z7Var = this.V;
                if (z4) {
                    float f11 = this.a0 - round;
                    this.a0 = f11;
                    z7Var.setTranslationY(f11);
                } else if (!this.U.f) {
                    OverScroller overScroller = this.h0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f10 = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f10 = min * (-this.b0);
                    }
                    if (round != 0) {
                        float f12 = this.a0 - round;
                        this.a0 = f12;
                        z7Var.setTranslationY(f12);
                    }
                    K(f10);
                }
            }
        }
        this.T.x();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.T.x();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void k(int i10) {
        super.k(i10);
        this.b0 = Math.signum(i10);
        this.c0 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.o0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z7 z7Var = this.V;
        if (z7Var.w == 1.0f && !this.p0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.t0 = true;
                invalidate();
            } else if (this.t0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.t0 = false;
                invalidate();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.t0) {
            this.t0 = false;
            invalidate();
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.o0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        z7 z7Var = this.V;
        if (z7Var.w == 1.0f && !this.p0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.t0 = true;
                invalidate();
            } else if (this.t0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.t0 = false;
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.t0) {
            this.t0 = false;
            invalidate();
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.U.c();
            this.W = true;
            this.a0 = this.V.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.u5 u5Var) {
    }

    public void I(v7 v7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, n5 n5Var) {
    }
}
