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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class mt0 extends NestedScrollView {
    public final Paint S;
    public final o1.j T;
    public boolean U;
    public float V;
    public float W;
    public float a0;
    public final Method b0;
    public final OverScroller c0;
    public boolean d0;
    public int e0;
    public int f0;
    public float g0;
    public boolean h0;
    public int i0;
    public final pt0 j0;
    public final FrameLayout k0;

    public mt0(Context context, pt0 pt0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.S = paint;
        this.g0 = 1.0f;
        this.i0 = -1;
        this.j0 = pt0Var;
        this.k0 = frameLayout;
        setClipChildren(false);
        int i9 = 2;
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(pt0Var, o1.h.n, 0.0f);
        this.T = jVar;
        jVar.u.b(100.0f);
        jVar.j = 1.0f;
        jVar.b(new ad0(this, i9));
        jVar.a(new l9(this, i9));
        jVar.u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.b0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.b0 = null;
            FileLog.e(e10);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.c0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.c0 = null;
            FileLog.e(e11);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i9) {
        OverScroller overScroller;
        if (this.U && i9 == 0) {
            this.U = false;
            if (this.V != 0.0f && (overScroller = this.c0) != null && overScroller.isFinished()) {
                float f10 = this.a0;
                o1.j jVar = this.T;
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
    public final void H(int i9, int i10) {
        int i11;
        int fontMetricsInt;
        int dp;
        if (i9 != 0 && i10 != 0) {
            pt0 pt0Var = this.j0;
            TextView currentView = pt0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.e0 != hashCode || this.d0 != z10 || this.f0 != i10) {
                this.e0 = hashCode;
                this.d0 = z10;
                this.f0 = i10;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z10 || lineCount > 2) && (z10 || lineCount > 5)) {
                    int min = Math.min(z10 ? 2 : 5, lineCount);
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
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    fontMetricsInt = i10 - currentView.getMeasuredHeight();
                    dp = pt0Var.getPaddingBottom();
                }
                i11 = fontMetricsInt - dp;
                if (i11 < 0) {
                    if (this.h0) {
                        this.i0 = i11;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.k0.getLayoutParams()).topMargin = i11;
                        this.i0 = -1;
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
        if (!this.U && this.V != 0.0f && (overScroller = this.c0) != null && overScroller.isFinished()) {
            o1.j jVar = this.T;
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
        int i9 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i9);
        int i10 = (int) (this.g0 * 127.0f);
        Paint paint = this.S;
        paint.setAlpha(i10);
        canvas.drawRect(0.0f, this.j0.getTranslationY() + this.k0.getTop(), width, i9, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.U) {
            float f10 = this.V;
            if ((f10 > 0.0f && i10 > 0) || (f10 < 0.0f && i10 < 0)) {
                float f11 = i10;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.V = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.V = f12;
                        iArr[1] = i10;
                    }
                } else if (f12 > 0.0f) {
                    this.V = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.V = f12;
                    iArr[1] = i10;
                }
                G();
                this.j0.setTranslationY(this.V);
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
        int i9 = this.i0;
        if (i9 >= 0) {
            return i9 - ((ViewGroup.MarginLayoutParams) this.k0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.V) / (this.k0.getTop() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))))) * i12);
            if (round != 0) {
                boolean z10 = this.U;
                pt0 pt0Var = this.j0;
                if (z10) {
                    float f11 = this.V - round;
                    this.V = f11;
                    pt0Var.setTranslationY(f11);
                } else {
                    o1.j jVar = this.T;
                    if (!jVar.f) {
                        OverScroller overScroller = this.c0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f10 = 0.0f;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f10 = min * (-this.W);
                        }
                        if (round != 0) {
                            float f12 = this.V - round;
                            this.V = f12;
                            pt0Var.setTranslationY(f12);
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
    public final void k(int i9) {
        super.k(i9);
        this.W = Math.signum(i9);
        this.a0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        H(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        super.onMeasure(i9, i10);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.j0.getTranslationY() + (this.k0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i9, int i10) {
        if (i10 == 0) {
            this.T.c();
            this.U = true;
            this.V = this.j0.getTranslationY();
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
