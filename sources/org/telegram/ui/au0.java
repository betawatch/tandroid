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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class au0 extends NestedScrollView {
    public final Paint T;
    public final o1.j U;
    public boolean V;
    public float W;
    public float a0;
    public float b0;
    public final Method c0;
    public final OverScroller d0;
    public boolean e0;
    public int f0;
    public int g0;
    public float h0;
    public boolean i0;
    public int j0;
    public final du0 k0;
    public final FrameLayout l0;

    public au0(Context context, du0 du0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.T = paint;
        this.h0 = 1.0f;
        this.j0 = -1;
        this.k0 = du0Var;
        this.l0 = frameLayout;
        setClipChildren(false);
        int i10 = 2;
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(du0Var, o1.h.n, 0.0f);
        this.U = jVar;
        jVar.u.b(100.0f);
        jVar.j = 1.0f;
        jVar.b(new md0(this, i10));
        jVar.a(new o9(this, i10));
        jVar.u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.c0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e6) {
            this.c0 = null;
            FileLog.e(e6);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.d0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.d0 = null;
            FileLog.e(e10);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.V && i10 == 0) {
            this.V = false;
            if (this.W != 0.0f && (overScroller = this.d0) != null && overScroller.isFinished()) {
                float f10 = this.b0;
                o1.j jVar = this.U;
                if (!jVar.f) {
                    jVar.a = f10;
                    jVar.f();
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
            du0 du0Var = this.k0;
            TextView currentView = du0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z4 = point.x > point.y;
            if (this.f0 != hashCode || this.e0 != z4 || this.g0 != i11) {
                this.f0 = hashCode;
                this.e0 = z4;
                this.g0 = i11;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z4 || lineCount > 2) && (z4 || lineCount > 5)) {
                    int min = Math.min(z4 ? 2 : 5, lineCount);
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
                    dp = du0Var.getPaddingBottom();
                }
                i12 = fontMetricsInt - dp;
                if (i12 < 0) {
                    if (this.i0) {
                        this.j0 = i12;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.l0.getLayoutParams()).topMargin = i12;
                        this.j0 = -1;
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
        if (!this.V && this.W != 0.0f && (overScroller = this.d0) != null && overScroller.isFinished()) {
            o1.j jVar = this.U;
            if (!jVar.f) {
                jVar.a = 0.0f;
                jVar.f();
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
        int i11 = (int) (this.h0 * 127.0f);
        Paint paint = this.T;
        paint.setAlpha(i11);
        canvas.drawRect(0.0f, this.k0.getTranslationY() + this.l0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.V) {
            float f10 = this.W;
            if ((f10 > 0.0f && i11 > 0) || (f10 < 0.0f && i11 < 0)) {
                float f11 = i11;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.W = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.W = f12;
                        iArr[1] = i11;
                    }
                } else if (f12 > 0.0f) {
                    this.W = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.W = f12;
                    iArr[1] = i11;
                }
                G();
                this.k0.setTranslationY(this.W);
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
        int i10 = this.j0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.l0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f10;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.W) / (this.l0.getTop() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))))) * i13);
            if (round != 0) {
                boolean z4 = this.V;
                du0 du0Var = this.k0;
                if (z4) {
                    float f11 = this.W - round;
                    this.W = f11;
                    du0Var.setTranslationY(f11);
                } else {
                    o1.j jVar = this.U;
                    if (!jVar.f) {
                        OverScroller overScroller = this.d0;
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
                            du0Var.setTranslationY(f12);
                        }
                        if (!jVar.f) {
                            jVar.a = f10;
                            jVar.f();
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
        this.a0 = Math.signum(i10);
        this.b0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.k0.getTranslationY() + (this.l0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.U.c();
            this.V = true;
            this.W = this.k0.getTranslationY();
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
