package org.telegram.ui;

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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class iq0 extends NestedScrollView {
    public final Paint W;
    public final r1.g a0;
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
    public final lq0 n0;
    public final FrameLayout o0;

    public iq0(Context context, lq0 lq0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.k0 = 1.0f;
        this.m0 = -1;
        this.n0 = lq0Var;
        this.o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) lq0Var, (r1.e) r1.g.p, 0.0f);
        this.a0 = gVar;
        gVar.m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new ab0(this, 2));
        gVar.a(new l9(this, 2));
        gVar.m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f0 = null;
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.g0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.a0.d();
            this.b0 = true;
            this.c0 = this.n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.b0 && i7 == 0) {
            this.b0 = false;
            if (this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
                float f10 = this.e0;
                r1.g gVar = this.a0;
                if (!gVar.f) {
                    gVar.a = f10;
                    gVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i7, int i10) {
        int i11;
        int fontMetricsInt;
        int L;
        if (i7 != 0 && i10 != 0) {
            lq0 lq0Var = this.n0;
            TextView currentView = lq0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = org.telegram.messenger.g0.q;
            boolean z9 = point.x > point.y;
            if (this.i0 != hashCode || this.h0 != z9 || this.j0 != i10) {
                this.i0 = hashCode;
                this.h0 = z9;
                this.j0 = i10;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z9 || lineCount > 2) && (z9 || lineCount > 5)) {
                    int min = Math.min(z9 ? 2 : 5, lineCount);
                    loop0: while (min > 1) {
                        int i12 = min - 1;
                        for (int lineStart = layout.getLineStart(i12); lineStart < layout.getLineEnd(i12); lineStart++) {
                            if (!Character.isWhitespace(text.charAt(lineStart))) {
                                break loop0;
                            }
                        }
                        min--;
                    }
                    fontMetricsInt = i10 - (currentView.getPaint().getFontMetricsInt(null) * min);
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    fontMetricsInt = i10 - currentView.getMeasuredHeight();
                    L = lq0Var.getPaddingBottom();
                }
                i11 = fontMetricsInt - L;
                if (i11 < 0) {
                    if (this.l0) {
                        this.m0 = i11;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin = i11;
                        this.m0 = -1;
                        return;
                    }
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
        if (!this.b0 && this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
            r1.g gVar = this.a0;
            if (!gVar.f) {
                gVar.a = 0.0f;
                gVar.h();
            }
        }
        G();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.b0) {
            float f10 = this.c0;
            if ((f10 > 0.0f && i10 > 0) || (f10 < 0.0f && i10 < 0)) {
                float f11 = i10;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.c0 = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.c0 = f12;
                        iArr[1] = i10;
                    }
                } else if (f12 > 0.0f) {
                    this.c0 = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.c0 = f12;
                    iArr[1] = i10;
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
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i7);
        int i10 = (int) (this.k0 * 127.0f);
        Paint paint = this.W;
        paint.setAlpha(i10);
        canvas.drawRect(0.0f, this.n0.getTranslationY() + this.o0.getTop(), width, i7, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void e(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.c0) / (this.o0.getTop() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (D() ? org.telegram.messenger.g0.m : 0))))) * i12);
            if (round != 0) {
                boolean z9 = this.b0;
                lq0 lq0Var = this.n0;
                if (z9) {
                    float f11 = this.c0 - round;
                    this.c0 = f11;
                    lq0Var.setTranslationY(f11);
                } else {
                    r1.g gVar = this.a0;
                    if (!gVar.f) {
                        OverScroller overScroller = this.g0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f10 = 0.0f;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f10 = min * (-this.d0);
                        }
                        if (round != 0) {
                            float f12 = this.c0 - round;
                            this.c0 = f12;
                            lq0Var.setTranslationY(f12);
                        }
                        if (!gVar.f) {
                            gVar.a = f10;
                            gVar.h();
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
        int i7 = this.m0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i7) {
        super.i(i7);
        this.d0 = Math.signum(i7);
        this.e0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        H(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
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
