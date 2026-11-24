// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class eb8 extends NestedScrollView {
    public final Paint W;
    public final zna a0;
    public boolean b0;
    public float c0;
    public float d0;
    public float e0;
    public final Method f0;
    public final OverScroller g0;
    public boolean h0;
    public int i0;
    public int j0;
    public float k0;
    public boolean l0;
    public int m0;
    public final hb8 n0;
    public final FrameLayout o0;

    public eb8(Context context, hb8 hb8Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.k0 = 1.0f;
        this.m0 = -1;
        this.n0 = hb8Var;
        this.o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(gm.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        zna znaVar = new zna((Object) hb8Var, (vk4) zna.p, 0.0f);
        this.a0 = znaVar;
        znaVar.m.b(100.0f);
        znaVar.f(1.0f);
        znaVar.b(new h20(this, (byte) 11));
        znaVar.a(new hx0(this, (byte) 6));
        znaVar.m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.f0 = null;
            fc4.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.g0 = null;
            fc4.g(e2, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i, int i2) {
        if (i2 == 0) {
            this.a0.d();
            this.b0 = true;
            this.c0 = this.n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i) {
        OverScroller overScroller;
        if (this.b0 && i == 0) {
            this.b0 = false;
            if (this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
                float f = this.e0;
                zna znaVar = this.a0;
                if (!znaVar.f) {
                    znaVar.a = f;
                    znaVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r4 > 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r10 = r10 - r2.getMeasuredHeight();
        r9 = r1.getPaddingBottom();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r1 = java.lang.Math.min(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r1 <= 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r4 = r1 - 1;
        r5 = r9.getLineStart(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r5 >= r9.getLineEnd(r4)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (java.lang.Character.isWhitespace(r3.charAt(r5)) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r10 = r10 - (r2.getPaint().getFontMetricsInt(null) * r1);
        r9 = gm.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (r4 <= 5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i, int i2) {
        int i3;
        int fontMetricsInt;
        int L;
        if (i != 0 && i2 != 0) {
            hb8 hb8Var = this.n0;
            TextView currentView = hb8Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = gm.q;
            boolean z = point.x > point.y;
            if (this.i0 != hashCode || this.h0 != z || this.j0 != i2) {
                this.i0 = hashCode;
                this.h0 = z;
                this.j0 = i2;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                int i4 = z ? 2 : 5;
                i3 = fontMetricsInt - L;
                if (i3 < 0) {
                    if (this.l0) {
                        this.m0 = i3;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin = i3;
                        this.m0 = -1;
                        return;
                    }
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
        if (!this.b0 && this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
            zna znaVar = this.a0;
            if (!znaVar.f) {
                znaVar.a = 0.0f;
                znaVar.h();
            }
        }
        G();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.b0) {
            float f = this.c0;
            if ((f > 0.0f && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f2 = i2;
                float f3 = f - f2;
                if (f > 0.0f) {
                    if (f3 < 0.0f) {
                        this.c0 = 0.0f;
                        iArr[1] = (int) (f2 + f3 + 0.0f);
                    } else {
                        this.c0 = f3;
                        iArr[1] = i2;
                    }
                } else if (f3 > 0.0f) {
                    this.c0 = 0.0f;
                    iArr[1] = (int) (f2 + f3 + 0.0f);
                } else {
                    this.c0 = f3;
                    iArr[1] = i2;
                }
                G();
                this.n0.setTranslationY(this.c0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, i);
        int i2 = (int) (this.k0 * 127.0f);
        Paint paint = this.W;
        paint.setAlpha(i2);
        canvas.drawRect(0.0f, this.n0.getTranslationY() + this.o0.getTop(), width, i, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        float f;
        if (i4 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.c0) / (this.o0.getTop() - (a.getCurrentActionBarHeight() + (D() ? gm.m : 0))))) * i4);
            if (round != 0) {
                boolean z = this.b0;
                hb8 hb8Var = this.n0;
                if (z) {
                    float f2 = this.c0 - round;
                    this.c0 = f2;
                    hb8Var.setTranslationY(f2);
                } else {
                    zna znaVar = this.a0;
                    if (!znaVar.f) {
                        OverScroller overScroller = this.g0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f = 0.0f;
                        } else {
                            Point point = gm.q;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f = min * (-this.d0);
                        }
                        if (round != 0) {
                            float f3 = this.c0 - round;
                            this.c0 = f3;
                            hb8Var.setTranslationY(f3);
                        }
                        if (!znaVar.f) {
                            znaVar.a = f;
                            znaVar.h();
                        }
                    }
                }
            }
            G();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i = this.m0;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i) {
        super.i(i);
        this.d0 = Math.signum(i);
        this.e0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        H(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.n0.getTranslationY() + (this.o0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }
}
