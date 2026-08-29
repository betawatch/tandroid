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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class kt0 extends NestedScrollView {
    public final Paint S;
    public final o1.k T;
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
    public final nt0 j0;
    public final FrameLayout k0;

    public kt0(Context context, nt0 nt0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.S = paint;
        this.g0 = 1.0f;
        this.i0 = -1;
        this.j0 = nt0Var;
        this.k0 = frameLayout;
        setClipChildren(false);
        int i10 = 2;
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(nt0Var, o1.i.n, 0.0f);
        this.T = kVar;
        kVar.u.b(100.0f);
        kVar.j = 1.0f;
        kVar.b(new cd0(this, i10));
        kVar.a(new k9(this, i10));
        kVar.u.a(1.0f);
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
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.U && i10 == 0) {
            this.U = false;
            if (this.V != 0.0f && (overScroller = this.c0) != null && overScroller.isFinished()) {
                float f9 = this.a0;
                o1.k kVar = this.T;
                if (!kVar.f) {
                    kVar.a = f9;
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
            nt0 nt0Var = this.j0;
            TextView currentView = nt0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.e0 != hashCode || this.d0 != z10 || this.f0 != i11) {
                this.e0 = hashCode;
                this.d0 = z10;
                this.f0 = i11;
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
                    dp = nt0Var.getPaddingBottom();
                }
                i12 = fontMetricsInt - dp;
                if (i12 < 0) {
                    if (this.h0) {
                        this.i0 = i12;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.k0.getLayoutParams()).topMargin = i12;
                        this.i0 = -1;
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
        if (!this.U && this.V != 0.0f && (overScroller = this.c0) != null && overScroller.isFinished()) {
            o1.k kVar = this.T;
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
        int i11 = (int) (this.g0 * 127.0f);
        Paint paint = this.S;
        paint.setAlpha(i11);
        canvas.drawRect(0.0f, this.j0.getTranslationY() + this.k0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.U) {
            float f9 = this.V;
            if ((f9 > 0.0f && i11 > 0) || (f9 < 0.0f && i11 < 0)) {
                float f10 = i11;
                float f11 = f9 - f10;
                if (f9 > 0.0f) {
                    if (f11 < 0.0f) {
                        this.V = 0.0f;
                        iArr[1] = (int) (f10 + f11 + 0);
                    } else {
                        this.V = f11;
                        iArr[1] = i11;
                    }
                } else if (f11 > 0.0f) {
                    this.V = 0.0f;
                    iArr[1] = (int) (f10 + f11 + 0);
                } else {
                    this.V = f11;
                    iArr[1] = i11;
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
        int i10 = this.i0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.k0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f9;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.V) / (this.k0.getTop() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))))) * i13);
            if (round != 0) {
                boolean z10 = this.U;
                nt0 nt0Var = this.j0;
                if (z10) {
                    float f10 = this.V - round;
                    this.V = f10;
                    nt0Var.setTranslationY(f10);
                } else {
                    o1.k kVar = this.T;
                    if (!kVar.f) {
                        OverScroller overScroller = this.c0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f9 = 0.0f;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f9 = min * (-this.W);
                        }
                        if (round != 0) {
                            float f11 = this.V - round;
                            this.V = f11;
                            nt0Var.setTranslationY(f11);
                        }
                        if (!kVar.f) {
                            kVar.a = f9;
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
        this.W = Math.signum(i10);
        this.a0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
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
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
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
