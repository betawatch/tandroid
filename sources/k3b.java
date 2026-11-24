// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public class k3b extends NestedScrollView implements bs5 {
    public final oib W;
    public final yla a0;
    public final j3b b0;
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

    public k3b(Context context, f53 f53Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, bm2.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        kk7.i(this);
        j3b j3bVar = new j3b(this, getContext());
        this.b0 = j3bVar;
        oib oibVar = new oib(j3bVar, f53Var);
        this.W = oibVar;
        oibVar.h0 = false;
        frameLayout.addView(j3bVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(gl.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        yla ylaVar = new yla((Object) j3bVar, (ri4) yla.p, 0.0f);
        this.a0 = ylaVar;
        ylaVar.m.b(100.0f);
        ylaVar.f(1.0f);
        ylaVar.b(new h10(this, (byte) 17));
        ylaVar.m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.k0 = null;
            fa4.g(e2, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i, int i2) {
        if (i2 == 0) {
            this.a0.d();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i) {
        OverScroller overScroller;
        if (this.c0 && i == 0) {
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
            float f = this.b0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d3b(this, scrollY, f, (byte) 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(s33.f);
            ofFloat.start();
        }
    }

    public final void E(boolean z) {
        if (!this.v0 || z) {
            this.v0 = true;
            float scrollY = getScrollY();
            float f = this.b0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d3b(this, scrollY, f, (byte) 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(s33.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        j3b j3bVar = this.b0;
        j3bVar.x = 0.0f;
        j3bVar.invalidate();
    }

    public final void K(float f) {
        yla ylaVar = this.a0;
        if (!ylaVar.f) {
            ylaVar.a = f;
            ylaVar.h();
        }
        if (getScrollY() < gl.L(2.0f)) {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i, int i2) {
        int i3;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        if (i != 0 && i2 != 0) {
            j3b j3bVar = this.b0;
            i3b i3bVar = j3bVar.r[0];
            CharSequence charSequence = i3bVar.n;
            f3b f3bVar = i3bVar.o;
            if (f3bVar != null) {
                spannableStringBuilder = f3bVar.k;
                str = f3bVar.l;
            } else {
                spannableStringBuilder = null;
                str = null;
            }
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = gl.q;
            boolean z = point.x > point.y;
            if (this.m0 != hashCode || this.n0 != hashCode2 || this.o0 != hashCode3 || this.l0 != z || this.p0 != i2 || j3bVar.I) {
                this.m0 = hashCode;
                this.n0 = hashCode2;
                this.o0 = hashCode3;
                this.l0 = z;
                this.p0 = i2;
                j3bVar.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
                i3b[] i3bVarArr = j3bVar.r;
                int a = i3bVarArr[0].a(i2);
                i3b i3bVar2 = i3bVarArr[1];
                i3 = gl.U1(j3bVar.H, a, i3bVar2 != null ? i3bVar2.a(i2) : 0);
                if (i3 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin = i3;
                    this.q0 = -1;
                    return;
                }
                return;
            }
        }
        i3 = -1;
        if (i3 < 0) {
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
    public final boolean d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f = this.d0;
            float f2 = 0.0f;
            if ((f > 0.0f && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f3 = i2;
                float f4 = f - f3;
                if (f > 0.0f) {
                    if (f4 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f3 + f4 + 0.0f);
                    } else {
                        this.d0 = f4;
                        iArr[1] = i2;
                        f2 = f4;
                    }
                } else if (f4 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f3 + f4 + 0.0f);
                } else {
                    this.d0 = f4;
                    iArr[1] = i2;
                    f2 = f4;
                }
                this.b0.setTranslationY(f2);
                this.W.v();
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
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.u0 + i);
        canvas.clipRect(0, scrollY, width, i);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // bs5
    public final void e(RectF rectF) {
        i3b i3bVar;
        j3b j3bVar = this.b0;
        i3b[] i3bVarArr = j3bVar.r;
        if (i3bVarArr == null || (i3bVar = i3bVarArr[0]) == null || i3bVar.p == null) {
            return;
        }
        float f = j3bVar.F;
        float U1 = (gl.U1(j3bVar.x, i3bVar.m, i3bVar.l) + j3bVar.G) - j3bVar.r[0].p.b();
        float width = getWidth() - j3bVar.F;
        int i = j3bVar.G;
        i3b i3bVar2 = j3bVar.r[0];
        rectF.set(f, U1, width, gl.U1(j3bVar.x, i3bVar2.m, i3bVar2.l) + i);
        float x = j3bVar.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        rectF.offset(frameLayout.getX() + x, frameLayout.getY() + (j3bVar.getY() - getScrollY()));
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        float f;
        if (i4 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i4);
            if (round != 0) {
                boolean z = this.c0;
                j3b j3bVar = this.b0;
                if (z) {
                    float f2 = this.d0 - round;
                    this.d0 = f2;
                    j3bVar.setTranslationY(f2);
                } else if (!this.a0.f) {
                    OverScroller overScroller = this.k0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f = 0.0f;
                    } else {
                        Point point = gl.q;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f = min * (-this.e0);
                    }
                    if (round != 0) {
                        float f3 = this.d0 - round;
                        this.d0 = f3;
                        j3bVar.setTranslationY(f3);
                    }
                    K(f);
                }
            }
        }
        this.W.v();
    }

    @Override // bs5
    public final void g(Canvas canvas, float f) {
        i3b i3bVar;
        j3b j3bVar = this.b0;
        i3b[] i3bVarArr = j3bVar.r;
        i3b[] i3bVarArr2 = j3bVar.r;
        if (i3bVarArr == null || (i3bVar = i3bVarArr[0]) == null || i3bVar.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x = j3bVar.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        float x2 = frameLayout.getX() + x + j3bVar.F;
        float y = frameLayout.getY() + (j3bVar.getY() - getScrollY()) + j3bVar.G;
        i3b i3bVar2 = i3bVarArr2[0];
        canvas.translate(x2, (y + gl.U1(j3bVar.x, i3bVar2.m, i3bVar2.l)) - i3bVarArr2[0].p.b());
        f3b f3bVar = i3bVarArr2[0].p;
        int width = getWidth();
        int i = j3bVar.F;
        f3bVar.a(canvas, (width - i) - i);
        canvas.restore();
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
        int i = this.q0;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, gl.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i) {
        super.i(i);
        this.e0 = Math.signum(i);
        this.f0 = 0.0f;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() >= (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L10;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j3b j3bVar = this.b0;
        if (j3bVar.x == 1.0f && !this.s0) {
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
    public final void onMeasure(int i, int i2) {
        L(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() >= (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L10;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j3b j3bVar = this.b0;
        if (j3bVar.x == 1.0f && !this.s0) {
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
    public final void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        invalidate();
    }

    @Override // bs5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        tb4.a(this, z);
    }

    public void F(gm gmVar) {
    }

    public void I(f3b f3bVar) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, kya kyaVar) {
    }
}
