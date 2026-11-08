package di;

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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class h8 extends NestedScrollView implements j60 {
    public final org.telegram.ui.Cells.s9 W;
    public final r1.g a0;
    public final g8 b0;
    public boolean c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public final OverScroller k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final FrameLayout r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean v0;
    public boolean w0;

    public h8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        qs.i(this);
        g8 g8Var = new g8(this, getContext());
        this.b0 = g8Var;
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9(g8Var, f6Var);
        this.W = s9Var;
        s9Var.h0 = false;
        frameLayout.addView(g8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) g8Var, (r1.e) r1.g.p, 0.0f);
        this.a0 = gVar;
        gVar.m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new a8(0, this));
        gVar.m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.k0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.a0.d();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.c0 && i7 == 0) {
            this.c0 = false;
            if (this.d0 == 0.0f || (overScroller = this.k0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.f0);
        }
    }

    public final void D() {
        if (this.v0) {
            this.v0 = false;
            float scrollY = getScrollY();
            float f10 = this.b0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new z7(this, scrollY, f10, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(xq.f);
            ofFloat.start();
        }
    }

    public final void E(boolean z9) {
        if (!this.v0 || z9) {
            this.v0 = true;
            float scrollY = getScrollY();
            float f10 = this.b0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new z7(this, scrollY, f10, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(xq.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        g8 g8Var = this.b0;
        g8Var.x = 0.0f;
        g8Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.a0;
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
            g8 g8Var = this.b0;
            f8 f8Var = g8Var.r[0];
            CharSequence charSequence = f8Var.n;
            c8 c8Var = f8Var.o;
            SpannableStringBuilder spannableStringBuilder = c8Var != null ? c8Var.k : null;
            String str = c8Var != null ? c8Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = org.telegram.messenger.g0.q;
            boolean z9 = point.x > point.y;
            if (this.m0 != hashCode || this.n0 != hashCode2 || this.o0 != hashCode3 || this.l0 != z9 || this.p0 != i10 || g8Var.H) {
                this.m0 = hashCode;
                this.n0 = hashCode2;
                this.o0 = hashCode3;
                this.l0 = z9;
                this.p0 = i10;
                g8Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                f8[] f8VarArr = g8Var.r;
                int a10 = f8VarArr[0].a(i10);
                f8 f8Var2 = f8VarArr[1];
                i11 = org.telegram.messenger.g0.W1(g8Var.G, a10, f8Var2 != null ? f8Var2.a(i10) : 0);
                if (i11 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin = i11;
                    this.q0 = -1;
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
        if (this.c0 || this.d0 == 0.0f || (overScroller = this.k0) == null || !overScroller.isFinished()) {
            return;
        }
        K(0.0f);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f10 = this.d0;
            if ((f10 > 0.0f && i10 > 0) || (f10 < 0.0f && i10 < 0)) {
                float f11 = i10;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.d0 = f12;
                        iArr[1] = i10;
                    }
                } else if (f12 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.d0 = f12;
                    iArr[1] = i10;
                }
                this.b0.setTranslationY(this.d0);
                this.W.w();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.u0 + i7);
        canvas.clipRect(0, scrollY, width, i7);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void e(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i12);
            if (round != 0) {
                boolean z9 = this.c0;
                g8 g8Var = this.b0;
                if (z9) {
                    float f11 = this.d0 - round;
                    this.d0 = f11;
                    g8Var.setTranslationY(f11);
                } else if (!this.a0.f) {
                    OverScroller overScroller = this.k0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f10 = 0.0f;
                    } else {
                        Point point = org.telegram.messenger.g0.q;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f10 = min * (-this.e0);
                    }
                    if (round != 0) {
                        float f12 = this.d0 - round;
                        this.d0 = f12;
                        g8Var.setTranslationY(f12);
                    }
                    K(f10);
                }
            }
        }
        this.W.w();
    }

    @Override // org.telegram.ui.Components.j60
    public final void g(RectF rectF) {
        f8 f8Var;
        g8 g8Var = this.b0;
        f8[] f8VarArr = g8Var.r;
        if (f8VarArr == null || (f8Var = f8VarArr[0]) == null || f8Var.p == null) {
            return;
        }
        float f10 = g8Var.E;
        float W1 = (org.telegram.messenger.g0.W1(g8Var.x, f8Var.m, f8Var.l) + g8Var.F) - g8Var.r[0].p.b();
        float width = getWidth() - g8Var.E;
        int i7 = g8Var.F;
        f8 f8Var2 = g8Var.r[0];
        rectF.set(f10, W1, width, org.telegram.messenger.g0.W1(g8Var.x, f8Var2.m, f8Var2.l) + i7);
        float x10 = g8Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (g8Var.getY() - getScrollY()));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.q0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // org.telegram.ui.Components.j60
    public final void h(Canvas canvas, float f10) {
        f8 f8Var;
        g8 g8Var = this.b0;
        f8[] f8VarArr = g8Var.r;
        f8[] f8VarArr2 = g8Var.r;
        if (f8VarArr == null || (f8Var = f8VarArr[0]) == null || f8Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = g8Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        float x11 = frameLayout.getX() + x10 + g8Var.E;
        float y10 = frameLayout.getY() + (g8Var.getY() - getScrollY()) + g8Var.F;
        f8 f8Var2 = f8VarArr2[0];
        canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(g8Var.x, f8Var2.m, f8Var2.l)) - f8VarArr2[0].p.b());
        c8 c8Var = f8VarArr2[0].p;
        int width = getWidth();
        int i7 = g8Var.E;
        c8Var.a(canvas, (width - i7) - i7);
        canvas.restore();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i7) {
        super.i(i7);
        this.e0 = Math.signum(i7);
        this.f0 = 0.0f;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g8 g8Var = this.b0;
        if (g8Var.x == 1.0f && !this.s0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.w0 = true;
                invalidate();
            } else if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.w0 = false;
                invalidate();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.w0) {
            this.w0 = false;
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
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g8 g8Var = this.b0;
        if (g8Var.x == 1.0f && !this.s0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.w0 = true;
                invalidate();
            } else if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.w0 = false;
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.w0) {
            this.w0 = false;
            invalidate();
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        super.scrollBy(i7, i10);
        invalidate();
    }

    public void F(org.telegram.ui.Components.r5 r5Var) {
    }

    public void I(c8 c8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, s7 s7Var) {
    }
}
