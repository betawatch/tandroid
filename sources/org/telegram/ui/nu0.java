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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class nu0 extends NestedScrollView {
    public final Paint W;
    public final o1.k a0;
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
    public final qu0 n0;
    public final FrameLayout o0;

    public nu0(Context context, qu0 qu0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.k0 = 1.0f;
        this.m0 = -1;
        this.n0 = qu0Var;
        this.o0 = frameLayout;
        setClipChildren(false);
        int i10 = 2;
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(qu0Var, o1.h.n, 0.0f);
        this.a0 = kVar;
        kVar.u.b(100.0f);
        kVar.j = 1.0f;
        kVar.b(new td0(this, i10));
        kVar.a(new n9(this, i10));
        kVar.u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e7) {
            this.f0 = null;
            FileLog.e(e7);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.g0 = null;
            FileLog.e(e10);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.b0 && i10 == 0) {
            this.b0 = false;
            if (this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
                float f7 = this.e0;
                o1.k kVar = this.a0;
                if (!kVar.f) {
                    kVar.a = f7;
                    kVar.f();
                }
            }
            D();
        }
    }

    public boolean C() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i10, int i11) {
        int i12;
        int fontMetricsInt;
        int dp;
        if (i10 != 0 && i11 != 0) {
            qu0 qu0Var = this.n0;
            TextView currentView = qu0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.i0 != hashCode || this.h0 != z10 || this.j0 != i11) {
                this.i0 = hashCode;
                this.h0 = z10;
                this.j0 = i11;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z10 || lineCount > 2) && (z10 || lineCount > 5)) {
                    int min = Math.min(z10 ? 2 : 5, lineCount);
                    loop0: while (min > 1) {
                        int i13 = min - 1;
                        for (int lineStart = layout.getLineStart(i13); lineStart < layout.getLineEnd(i13); lineStart++) {
                            if (!Character.isWhitespace(text.charAt(lineStart))) {
                                break loop0;
                            }
                        }
                        min--;
                    }
                    fontMetricsInt = i11 - (currentView.getPaint().getFontMetricsInt(null) * min);
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    fontMetricsInt = i11 - currentView.getMeasuredHeight();
                    dp = qu0Var.getPaddingBottom();
                }
                i12 = fontMetricsInt - dp;
                if (i12 < 0) {
                    if (this.l0) {
                        this.m0 = i12;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin = i12;
                        this.m0 = -1;
                        return;
                    }
                }
                return;
            }
        }
        i12 = -1;
        if (i12 < 0) {
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.b0 && this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
            o1.k kVar = this.a0;
            if (!kVar.f) {
                kVar.a = 0.0f;
                kVar.f();
            }
        }
        G();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i10);
        int i11 = (int) (this.k0 * 127.0f);
        Paint paint = this.W;
        paint.setAlpha(i11);
        canvas.drawRect(0.0f, this.n0.getTranslationY() + this.o0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.b0) {
            float f7 = this.c0;
            if ((f7 > 0.0f && i11 > 0) || (f7 < 0.0f && i11 < 0)) {
                float f10 = i11;
                float f11 = f7 - f10;
                if (f7 > 0.0f) {
                    if (f11 < 0.0f) {
                        this.c0 = 0.0f;
                        iArr[1] = (int) (f10 + f11 + 0);
                    } else {
                        this.c0 = f11;
                        iArr[1] = i11;
                    }
                } else if (f11 > 0.0f) {
                    this.c0 = 0.0f;
                    iArr[1] = (int) (f10 + f11 + 0);
                } else {
                    this.c0 = f11;
                    iArr[1] = i11;
                }
                G();
                this.n0.setTranslationY(this.c0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.c0) / (this.o0.getTop() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))))) * i13);
            if (round != 0) {
                boolean z10 = this.b0;
                qu0 qu0Var = this.n0;
                if (z10) {
                    float f10 = this.c0 - round;
                    this.c0 = f10;
                    qu0Var.setTranslationY(f10);
                } else {
                    o1.k kVar = this.a0;
                    if (!kVar.f) {
                        OverScroller overScroller = this.g0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f7 = 0.0f;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f7 = min * (-this.d0);
                        }
                        if (round != 0) {
                            float f11 = this.c0 - round;
                            this.c0 = f11;
                            qu0Var.setTranslationY(f11);
                        }
                        if (!kVar.f) {
                            kVar.a = f7;
                            kVar.f();
                        }
                    }
                }
            }
            G();
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void k(int i10) {
        super.k(i10);
        this.d0 = Math.signum(i10);
        this.e0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
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

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.a0.c();
            this.b0 = true;
            this.c0 = this.n0.getTranslationY();
            F();
        }
        return true;
    }

    public void D() {
    }

    public void F() {
    }

    public void G() {
    }
}
