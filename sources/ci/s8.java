package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h80;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public class s8 extends NestedScrollView implements h80 {
    public final org.telegram.ui.Cells.x9 W;
    public final o1.k a0;
    public final r8 b0;
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

    public s8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        r8 r8Var = new r8(this, getContext());
        this.b0 = r8Var;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(r8Var, d6Var);
        this.W = x9Var;
        x9Var.h0 = false;
        frameLayout.addView(r8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(r8Var, o1.h.n, 0.0f);
        this.a0 = kVar;
        kVar.u.b(100.0f);
        kVar.e(1.0f);
        kVar.b(new l8(0, this));
        kVar.u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.k0 = null;
            FileLog.e(e7);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.c0 && i10 == 0) {
            this.c0 = false;
            if (this.d0 == 0.0f || (overScroller = this.k0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.f0);
        }
    }

    public final void C() {
        if (this.v0) {
            this.v0 = false;
            float scrollY = getScrollY();
            float f7 = this.b0.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new k8(this, scrollY, f7, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(bs.f);
            ofFloat.start();
        }
    }

    public final void D(boolean z10) {
        if (!this.v0 || z10) {
            this.v0 = true;
            float scrollY = getScrollY();
            float f7 = this.b0.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new k8(this, scrollY, f7, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(bs.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        r8 r8Var = this.b0;
        r8Var.w = 0.0f;
        r8Var.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.a0;
        if (!kVar.f) {
            kVar.a = f7;
            kVar.h();
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
            r8 r8Var = this.b0;
            q8 q8Var = r8Var.r[0];
            CharSequence charSequence = q8Var.n;
            n8 n8Var = q8Var.o;
            SpannableStringBuilder spannableStringBuilder = n8Var != null ? n8Var.k : null;
            String str = n8Var != null ? n8Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.m0 != hashCode || this.n0 != hashCode2 || this.o0 != hashCode3 || this.l0 != z10 || this.p0 != i11 || r8Var.H) {
                this.m0 = hashCode;
                this.n0 = hashCode2;
                this.o0 = hashCode3;
                this.l0 = z10;
                this.p0 = i11;
                r8Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                q8[] q8VarArr = r8Var.r;
                int a2 = q8VarArr[0].a(i11);
                q8 q8Var2 = q8VarArr[1];
                i12 = AndroidUtilities.lerp(a2, q8Var2 != null ? q8Var2.a(i11) : 0, r8Var.G);
                if (i12 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin = i12;
                    this.q0 = -1;
                    return;
                }
                return;
            }
        }
        i12 = -1;
        if (i12 < 0) {
        }
    }

    @Override // org.telegram.ui.Components.h80
    public final void a(RectF rectF) {
        q8 q8Var;
        r8 r8Var = this.b0;
        q8[] q8VarArr = r8Var.r;
        if (q8VarArr == null || (q8Var = q8VarArr[0]) == null || q8Var.p == null) {
            return;
        }
        float f7 = r8Var.E;
        float lerp = (AndroidUtilities.lerp(q8Var.m, q8Var.l, r8Var.w) + r8Var.F) - r8Var.r[0].p.b();
        float width = getWidth() - r8Var.E;
        int i10 = r8Var.F;
        q8 q8Var2 = r8Var.r[0];
        rectF.set(f7, lerp, width, AndroidUtilities.lerp(q8Var2.m, q8Var2.l, r8Var.w) + i10);
        float x10 = r8Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (r8Var.getY() - getScrollY()));
    }

    @Override // org.telegram.ui.Components.h80
    public final void c(Canvas canvas, float f7) {
        q8 q8Var;
        r8 r8Var = this.b0;
        q8[] q8VarArr = r8Var.r;
        q8[] q8VarArr2 = r8Var.r;
        if (q8VarArr == null || (q8Var = q8VarArr[0]) == null || q8Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = r8Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        float x11 = frameLayout.getX() + x10 + r8Var.E;
        float y3 = frameLayout.getY() + (r8Var.getY() - getScrollY()) + r8Var.F;
        q8 q8Var2 = q8VarArr2[0];
        canvas.translate(x11, (y3 + AndroidUtilities.lerp(q8Var2.m, q8Var2.l, r8Var.w)) - q8VarArr2[0].p.b());
        n8 n8Var = q8VarArr2[0].p;
        int width = getWidth();
        int i10 = r8Var.E;
        n8Var.a(canvas, (width - i10) - i10);
        canvas.restore();
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

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f7 = this.d0;
            if ((f7 > 0.0f && i11 > 0) || (f7 < 0.0f && i11 < 0)) {
                float f10 = i11;
                float f11 = f7 - f10;
                if (f7 > 0.0f) {
                    if (f11 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f10 + f11 + 0);
                    } else {
                        this.d0 = f11;
                        iArr[1] = i11;
                    }
                } else if (f11 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f10 + f11 + 0);
                } else {
                    this.d0 = f11;
                    iArr[1] = i11;
                }
                this.b0.setTranslationY(this.d0);
                this.W.w();
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
        FrameLayout frameLayout = this.r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.c0;
                r8 r8Var = this.b0;
                if (z10) {
                    float f10 = this.d0 - round;
                    this.d0 = f10;
                    r8Var.setTranslationY(f10);
                } else if (!this.a0.f) {
                    OverScroller overScroller = this.k0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f7 = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f7 = min * (-this.e0);
                    }
                    if (round != 0) {
                        float f11 = this.d0 - round;
                        this.d0 = f11;
                        r8Var.setTranslationY(f11);
                    }
                    K(f7);
                }
            }
        }
        this.W.w();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.w();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void k(int i10) {
        super.k(i10);
        this.e0 = Math.signum(i10);
        this.f0 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r8 r8Var = this.b0;
        if (r8Var.w == 1.0f && !this.s0) {
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
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        r8 r8Var = this.b0;
        if (r8Var.w == 1.0f && !this.s0) {
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
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.a0.c();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.a6 a6Var) {
    }

    public void I(n8 n8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, androidx.fragment.app.d dVar) {
    }
}
