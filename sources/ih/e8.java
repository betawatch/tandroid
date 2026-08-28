package ih;

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
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class e8 extends NestedScrollView implements w60 {
    public final x9 S;
    public final o1.j T;
    public final d8 U;
    public boolean V;
    public float W;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final OverScroller g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final FrameLayout n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public boolean r0;
    public boolean s0;

    public e8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.m0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.n0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        d8 d8Var = new d8(this, getContext());
        this.U = d8Var;
        x9 x9Var = new x9(d8Var, b6Var);
        this.S = x9Var;
        x9Var.i0 = false;
        frameLayout.addView(d8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(d8Var, o1.h.n, 0.0f);
        this.T = jVar;
        jVar.u.b(100.0f);
        jVar.j = 1.0f;
        jVar.b(new x7(0, this));
        jVar.u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.g0 = null;
            FileLog.e(e11);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i9) {
        OverScroller overScroller;
        if (this.V && i9 == 0) {
            this.V = false;
            if (this.W == 0.0f || (overScroller = this.g0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.b0);
        }
    }

    public final void C() {
        if (this.r0) {
            this.r0 = false;
            float scrollY = getScrollY();
            float f10 = this.U.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w7(this, scrollY, f10, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
        }
    }

    public final void D(boolean z10) {
        if (!this.r0 || z10) {
            this.r0 = true;
            float scrollY = getScrollY();
            float f10 = this.U.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w7(this, scrollY, f10, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.r0 = false;
        d8 d8Var = this.U;
        d8Var.w = 0.0f;
        d8Var.invalidate();
    }

    public final void K(float f10) {
        o1.j jVar = this.T;
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
    public final void L(int i9, int i10) {
        int i11;
        if (i9 != 0 && i10 != 0) {
            d8 d8Var = this.U;
            c8 c8Var = d8Var.r[0];
            CharSequence charSequence = c8Var.n;
            z7 z7Var = c8Var.o;
            SpannableStringBuilder spannableStringBuilder = z7Var != null ? z7Var.k : null;
            String str = z7Var != null ? z7Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.i0 != hashCode || this.j0 != hashCode2 || this.k0 != hashCode3 || this.h0 != z10 || this.l0 != i10 || d8Var.D) {
                this.i0 = hashCode;
                this.j0 = hashCode2;
                this.k0 = hashCode3;
                this.h0 = z10;
                this.l0 = i10;
                d8Var.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                c8[] c8VarArr = d8Var.r;
                int a2 = c8VarArr[0].a(i10);
                c8 c8Var2 = c8VarArr[1];
                i11 = AndroidUtilities.lerp(a2, c8Var2 != null ? c8Var2.a(i10) : 0, d8Var.C);
                if (i11 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.n0.getLayoutParams()).topMargin = i11;
                    this.m0 = -1;
                    return;
                }
                return;
            }
        }
        i11 = -1;
        if (i11 < 0) {
        }
    }

    @Override // org.telegram.ui.Components.w60
    public final void a(RectF rectF) {
        c8 c8Var;
        d8 d8Var = this.U;
        c8[] c8VarArr = d8Var.r;
        if (c8VarArr == null || (c8Var = c8VarArr[0]) == null || c8Var.p == null) {
            return;
        }
        float f10 = d8Var.A;
        float lerp = (AndroidUtilities.lerp(c8Var.m, c8Var.l, d8Var.w) + d8Var.B) - d8Var.r[0].p.b();
        float width = getWidth() - d8Var.A;
        int i9 = d8Var.B;
        c8 c8Var2 = d8Var.r[0];
        rectF.set(f10, lerp, width, AndroidUtilities.lerp(c8Var2.m, c8Var2.l, d8Var.w) + i9);
        float x10 = d8Var.getX() - getScrollX();
        FrameLayout frameLayout = this.n0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (d8Var.getY() - getScrollY()));
    }

    @Override // org.telegram.ui.Components.w60
    public final void b(Canvas canvas, float f10) {
        c8 c8Var;
        d8 d8Var = this.U;
        c8[] c8VarArr = d8Var.r;
        c8[] c8VarArr2 = d8Var.r;
        if (c8VarArr == null || (c8Var = c8VarArr[0]) == null || c8Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = d8Var.getX() - getScrollX();
        FrameLayout frameLayout = this.n0;
        float x11 = frameLayout.getX() + x10 + d8Var.A;
        float y10 = frameLayout.getY() + (d8Var.getY() - getScrollY()) + d8Var.B;
        c8 c8Var2 = c8VarArr2[0];
        canvas.translate(x11, (y10 + AndroidUtilities.lerp(c8Var2.m, c8Var2.l, d8Var.w)) - c8VarArr2[0].p.b());
        z7 z7Var = c8VarArr2[0].p;
        int width = getWidth();
        int i9 = d8Var.A;
        z7Var.a(canvas, (width - i9) - i9);
        canvas.restore();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.V || this.W == 0.0f || (overScroller = this.g0) == null || !overScroller.isFinished()) {
            return;
        }
        K(0.0f);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.p0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i9 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.q0 + i9);
        canvas.clipRect(0, scrollY, width, i9);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.V) {
            float f10 = this.W;
            if ((f10 > 0.0f && i10 > 0) || (f10 < 0.0f && i10 < 0)) {
                float f11 = i10;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.W = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.W = f12;
                        iArr[1] = i10;
                    }
                } else if (f12 > 0.0f) {
                    this.W = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.W = f12;
                    iArr[1] = i10;
                }
                this.U.setTranslationY(this.W);
                this.S.x();
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
        FrameLayout frameLayout = this.n0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i9 = this.m0;
        if (i9 >= 0) {
            return i9 - ((ViewGroup.MarginLayoutParams) this.n0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.U.getTranslationY()) / Math.min(this.l0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.U.getTranslationY() + this.n0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.W) / this.n0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.V;
                d8 d8Var = this.U;
                if (z10) {
                    float f11 = this.W - round;
                    this.W = f11;
                    d8Var.setTranslationY(f11);
                } else if (!this.T.f) {
                    OverScroller overScroller = this.g0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f10 = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f10 = min * (-this.a0);
                    }
                    if (round != 0) {
                        float f12 = this.W - round;
                        this.W = f12;
                        d8Var.setTranslationY(f12);
                    }
                    K(f10);
                }
            }
        }
        this.S.x();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.S.x();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void k(int i9) {
        super.k(i9);
        this.a0 = Math.signum(i9);
        this.b0 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.n0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d8 d8Var = this.U;
        if (d8Var.w == 1.0f && !this.o0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.s0 = true;
                invalidate();
            } else if (this.s0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.s0 = false;
                invalidate();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.s0) {
            this.s0 = false;
            invalidate();
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        L(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        super.onMeasure(i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.n0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d8 d8Var = this.U;
        if (d8Var.w == 1.0f && !this.o0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.s0 = true;
                invalidate();
            } else if (this.s0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.s0 = false;
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.s0) {
            this.s0 = false;
            invalidate();
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i9, int i10) {
        super.scrollBy(i9, i10);
        invalidate();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i9, int i10) {
        if (i10 == 0) {
            this.T.c();
            this.V = true;
            this.W = this.U.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.t5 t5Var) {
    }

    public void I(z7 z7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, g gVar) {
    }
}
