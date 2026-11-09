package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class ib0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public static final xq x0 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
    public int D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public gb0 J;
    public fb0 K;
    public eb0 L;
    public long M;
    public final SparseArray N;
    public int[] O;
    public final Paint P;
    public int Q;
    public int R;
    public int S;
    public final xk0 T;
    public final xk0 U;
    public int V;
    public db0 W;
    public boolean a;
    public float a0;
    public int b;
    public long b0;
    public int c;
    public float c0;
    public int d;
    public VelocityTracker d0;
    public final TextView e;
    public final int e0;
    public final int f;
    public final int f0;
    public final int g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public final Paint j0;
    public final int k0;
    public int l0;
    public int m0;
    public final int n;
    public int n0;
    public boolean o0;
    public boolean p0;
    public final hb0 q0;
    public int r;
    public int r0;
    public final boolean s;
    public final org.telegram.ui.ActionBar.g6 s0;
    public boolean t0;
    public org.telegram.messenger.d20 u0;
    public Integer v0;
    public final int w;
    public int w0;
    public int x;
    public String[] y;

    public ib0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i7, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), TLObject.FLAG_30);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(jg.g.j(mode, "Unknown measure mode: "));
            }
        }
        return i7;
    }

    public static int k(int i7, int i10, int i11) {
        if (i7 == -1) {
            return i10;
        }
        int max = Math.max(i7, i10);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? max : size : size < max ? 16777216 | size : max;
    }

    public final void a(boolean z9) {
        this.e.setVisibility(4);
        if (!h(this.T)) {
            h(this.U);
        }
        this.V = 0;
        if (z9) {
            this.T.d(-this.Q, org.telegram.messenger.qs.X4);
        } else {
            this.T.d(this.Q, org.telegram.messenger.qs.X4);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
    }

    public final void b(int i7) {
        String str;
        SparseArray sparseArray = this.N;
        if (((String) sparseArray.get(i7)) != null) {
            return;
        }
        int i10 = this.D;
        if (i7 < i10 || i7 > this.F) {
            str = "";
        } else {
            String[] strArr = this.y;
            if (strArr != null) {
                str = strArr[i7 - i10];
            } else {
                eb0 eb0Var = this.L;
                str = eb0Var != null ? eb0Var.h(i7) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
            }
        }
        sparseArray.put(i7, str);
    }

    public final boolean c() {
        int i7 = this.R - this.S;
        if (i7 == 0) {
            return false;
        }
        this.V = 0;
        int abs = Math.abs(i7);
        int i10 = this.Q;
        if (abs > i10 / 2) {
            if (i7 > 0) {
                i10 = -i10;
            }
            i7 += i10;
        }
        this.U.d(i7, 800);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        xk0 xk0Var = this.T;
        if (xk0Var.q) {
            xk0Var = this.U;
            if (xk0Var.q) {
                return;
            }
        }
        xk0Var.b();
        int i7 = xk0Var.k;
        if (this.V == 0) {
            this.V = xk0Var.c;
        }
        scrollBy(0, i7 - this.V);
        this.V = i7;
        if (!xk0Var.q) {
            invalidate();
            return;
        }
        if (xk0Var == this.T) {
            if (!c()) {
                n();
            }
            i(0);
        } else if (this.l0 != 1) {
            n();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.S;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return ((this.F - this.D) + 1) * this.Q;
    }

    public CharSequence d(int i7) {
        return this.e.getText();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        requestFocus();
        r5.r0 = r0;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r5.T.q == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r0 != 20) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.r0 == keyCode) {
                    this.r0 = -1;
                    return true;
                }
            } else if (!this.h0) {
            }
        } else if (keyCode == 23 || keyCode == 66) {
            j();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            j();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final int e(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        return (!this.G || i7 <= (i13 = this.F) || (i15 = i13 - (i14 = this.D)) == 0) ? (!this.E || i7 >= (i10 = this.D) || (i12 = (i11 = this.F) - i10) == 0) ? i7 : (i11 - ((i10 - i7) % i12)) + 1 : (((i7 - i13) % i15) + i14) - 1;
    }

    public final void f() {
        this.N.clear();
        int[] iArr = this.O;
        int value = getValue();
        for (int i7 = 0; i7 < this.O.length; i7++) {
            int i10 = (i7 - this.c) + value;
            if (this.h0) {
                i10 = e(i10);
            }
            iArr[i7] = i10;
            b(i10);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.y;
    }

    public int getItemsCount() {
        return this.b;
    }

    public int getMaxValue() {
        return this.F;
    }

    public int getMinValue() {
        return this.D;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.H;
    }

    public boolean getWrapSelectorWheel() {
        return this.h0;
    }

    public final boolean h(xk0 xk0Var) {
        xk0Var.q = true;
        int i7 = xk0Var.e - xk0Var.k;
        int i10 = this.R - ((this.S + i7) % this.Q);
        if (i10 == 0) {
            return false;
        }
        int abs = Math.abs(i10);
        int i11 = this.Q;
        if (abs > i11 / 2) {
            i10 = i10 > 0 ? i10 - i11 : i10 + i11;
        }
        scrollBy(0, i7 + i10);
        return true;
    }

    public final void i(int i7) {
        String str;
        if (this.l0 == i7) {
            return;
        }
        this.l0 = i7;
        fb0 fb0Var = this.K;
        if (fb0Var != null) {
            fb0Var.d(i7);
        }
        if (i7 == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.y;
                if (strArr == null) {
                    int i10 = this.H;
                    eb0 eb0Var = this.L;
                    str = eb0Var != null ? eb0Var.h(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
                } else {
                    str = strArr[this.H - this.D];
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(TLObject.FLAG_14);
                obtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final void j() {
        db0 db0Var = this.W;
        if (db0Var != null) {
            removeCallbacks(db0Var);
        }
        this.q0.a();
    }

    public final void l(int i7, boolean z9) {
        fb0 fb0Var;
        gb0 gb0Var;
        if (this.H == i7) {
            return;
        }
        int e10 = this.h0 ? e(i7) : Math.min(Math.max(i7, this.D), this.F);
        int i10 = this.H;
        this.I = e10;
        this.H = e10;
        n();
        if (Math.abs(i10 - e10) > 0.9f) {
            org.telegram.messenger.g0.c4(this);
        }
        if (z9 && (gb0Var = this.J) != null) {
            gb0Var.n(this, this.H);
        }
        f();
        invalidate();
        if (this.l0 != 0 || (fb0Var = this.K) == null) {
            return;
        }
        fb0Var.d(0);
    }

    public final void m() {
        int i7;
        if (this.s) {
            String[] strArr = this.y;
            Paint paint = this.P;
            int i10 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i11 = 0; i11 <= 9; i11++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i12 = this.F; i12 > 0; i12 /= 10) {
                    i10++;
                }
                i7 = (int) (i10 * f10);
            } else {
                int length = strArr.length;
                int i13 = 0;
                while (i10 < length) {
                    float measureText2 = paint.measureText(strArr[i10]);
                    if (measureText2 > i13) {
                        i13 = (int) measureText2;
                    }
                    i10++;
                }
                i7 = i13;
            }
            TextView textView = this.e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i7;
            if (this.r != paddingRight) {
                int i14 = this.n;
                if (paddingRight > i14) {
                    this.r = paddingRight;
                } else {
                    this.r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.y;
        if (strArr == null) {
            int i7 = this.H;
            eb0 eb0Var = this.L;
            str = eb0Var != null ? eb0Var.h(i7) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
        } else {
            str = strArr[this.H - this.D];
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.e;
        if (str.equals(textView.getText().toString())) {
            return;
        }
        textView.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float width;
        float measuredHeight;
        boolean z9;
        int i7;
        int i10 = this.w0;
        if (i10 == 5) {
            this.P.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i10 == 3) {
            this.P.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.P.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.d;
        float f11 = this.S;
        int[] iArr = this.O;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            String str = (String) this.N.get(iArr[i11]);
            if (str != null && (i11 != this.c || this.e.getVisibility() != 0)) {
                if (this.b > 3) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    float measuredHeight3 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.P.getTextSize() / 2.0f);
                    if (textSize < measuredHeight2) {
                        measuredHeight = textSize / measuredHeight3;
                        z9 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight3;
                        z9 = false;
                    }
                    float interpolation = x0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.P.getTextSize() * (1.0f - interpolation);
                    if (!z9) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i7 = this.P.getAlpha();
                        this.P.setAlpha((int) ((i7 * interpolation) / 0.1f));
                    } else {
                        i7 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.P);
                    canvas.restore();
                    if (i7 != -1) {
                        this.P.setAlpha(i7);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.P);
                }
            }
            f11 += this.Q;
        }
        if (this.t0) {
            canvas.drawRect(0.0f, this.m0, getRight(), this.k0 + r0, this.j0);
            canvas.drawRect(0.0f, r15 - this.k0, getRight(), this.n0, this.j0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.e.setVisibility(4);
        float y10 = motionEvent.getY();
        this.a0 = y10;
        this.c0 = y10;
        this.b0 = motionEvent.getEventTime();
        float f10 = this.a0;
        if (f10 < this.m0) {
            if (this.l0 == 0) {
                hb0 hb0Var = this.q0;
                hb0Var.a();
                hb0Var.c = 1;
                hb0Var.b = 2;
                ((ib0) hb0Var.d).postDelayed(hb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.n0 && this.l0 == 0) {
            hb0 hb0Var2 = this.q0;
            hb0Var2.a();
            hb0Var2.c = 1;
            hb0Var2.b = 1;
            ((ib0) hb0Var2.d).postDelayed(hb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        xk0 xk0Var = this.T;
        if (!xk0Var.q) {
            xk0Var.q = true;
            this.U.q = true;
            i(0);
            return true;
        }
        xk0 xk0Var2 = this.U;
        if (!xk0Var2.q) {
            xk0Var.q = true;
            xk0Var2.q = true;
            return true;
        }
        float f11 = this.a0;
        if (f11 < this.m0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.W;
            if (runnable == null) {
                this.W = new db0(this);
            } else {
                removeCallbacks(runnable);
            }
            db0 db0Var = this.W;
            db0Var.a = false;
            postDelayed(db0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.n0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.W;
            if (runnable2 == null) {
                this.W = new db0(this);
            } else {
                removeCallbacks(runnable2);
            }
            db0 db0Var2 = this.W;
            db0Var2.a = true;
            postDelayed(db0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.e.getMeasuredWidth();
        int measuredHeight2 = this.e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z9) {
            f();
            int length = this.O.length;
            int i15 = this.w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / r2.length) + 0.5f);
            this.x = bottom;
            this.Q = bottom + i15;
            int top = (this.e.getTop() + this.e.getBaseline()) - (this.Q * this.c);
            this.R = top;
            this.S = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.m0 = ((getHeight() - i15) - this.x) / 2;
            this.n0 = ((getHeight() + i15) + this.x) / 2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(g(i7, this.r), g(i10, this.h));
        setMeasuredDimension(k(this.n, getMeasuredWidth(), i7), k(this.f, getMeasuredHeight(), i10));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.l0 == 1) {
                scrollBy(0, (int) (y10 - this.c0));
                invalidate();
            } else if (((int) Math.abs(y10 - this.a0)) > this.e0) {
                j();
                i(1);
            }
            this.c0 = y10;
            return true;
        }
        db0 db0Var = this.W;
        if (db0Var != null) {
            removeCallbacks(db0Var);
        }
        this.q0.a();
        VelocityTracker velocityTracker = this.d0;
        velocityTracker.computeCurrentVelocity(1000, this.g0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f0) {
            this.V = 0;
            if (yVelocity > 0) {
                this.T.c(0, 0, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            } else {
                this.T.c(0, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            invalidate();
            i(2);
        } else {
            int y11 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y11 - this.a0);
            long eventTime = motionEvent.getEventTime() - this.b0;
            if (abs > this.e0 || eventTime >= ViewConfiguration.getTapTimeout()) {
                c();
            } else {
                int i7 = (y11 / this.Q) - this.c;
                if (i7 > 0) {
                    a(true);
                    hb0 hb0Var = this.q0;
                    hb0Var.a();
                    hb0Var.c = 2;
                    hb0Var.b = 1;
                    ((ib0) hb0Var.d).post(hb0Var);
                } else if (i7 < 0) {
                    a(false);
                    hb0 hb0Var2 = this.q0;
                    hb0Var2.a();
                    hb0Var2.c = 2;
                    hb0Var2.b = 2;
                    ((ib0) hb0Var2.d).post(hb0Var2);
                }
            }
            i(0);
        }
        this.d0.recycle();
        this.d0 = null;
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        int[] iArr = this.O;
        boolean z9 = this.h0;
        if (!z9 && i10 > 0 && iArr[this.c] <= this.D) {
            int i11 = this.S + i10;
            int i12 = this.R;
            if (i11 > i12) {
                this.S = i12;
                return;
            }
        }
        if (!z9 && i10 < 0 && iArr[this.c] >= this.F) {
            int i13 = this.S + i10;
            int i14 = this.R;
            if (i13 < i14) {
                this.S = i14;
                return;
            }
        }
        this.S += i10;
        while (true) {
            int i15 = this.S;
            if (i15 - this.R <= this.x) {
                break;
            }
            this.S = i15 - this.Q;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.h0 && i16 < this.D) {
                i16 = this.F;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.h0 && iArr[this.c] <= this.D) {
                int i17 = this.S;
                int i18 = this.R;
                if (i17 > i18) {
                    this.S = i18;
                }
            }
        }
        while (true) {
            int i19 = this.S;
            if (i19 - this.R >= (-this.x)) {
                l(iArr[this.c], true);
                return;
            }
            this.S = i19 + this.Q;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i20 = iArr[iArr.length - 2] + 1;
            if (this.h0 && i20 > this.F) {
                i20 = this.D;
            }
            iArr[iArr.length - 1] = i20;
            b(i20);
            if (!this.h0 && iArr[this.c] >= this.F) {
                int i21 = this.S;
                int i22 = this.R;
                if (i21 < i22) {
                    this.S = i22;
                }
            }
        }
    }

    public void setAllItemsCount(int i7) {
        this.v0 = Integer.valueOf(i7);
        setWrapSelectorWheel(this.i0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.d20 d20Var) {
        this.u0 = d20Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.y == strArr) {
            return;
        }
        this.y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z9) {
        this.t0 = z9;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.e.setEnabled(z9);
    }

    public void setFormatter(eb0 eb0Var) {
        if (eb0Var == this.L) {
            return;
        }
        this.L = eb0Var;
        f();
        n();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i7) {
        this.w0 = i7;
        super.setGravity(i7);
    }

    public void setItemCount(int i7) {
        if (this.b == i7) {
            return;
        }
        this.b = i7;
        this.c = i7 / 2;
        this.O = new int[i7];
        f();
    }

    public void setMaxValue(int i7) {
        fb0 fb0Var;
        this.G = true;
        if (this.F == i7) {
            return;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.F = i7;
        if (i7 < this.H) {
            int i10 = this.I;
            if (i7 >= i10) {
                this.H = i10;
            } else {
                this.H = i7;
            }
        }
        setWrapSelectorWheel(this.i0);
        f();
        n();
        m();
        invalidate();
        if (this.l0 != 0 || (fb0Var = this.K) == null) {
            return;
        }
        fb0Var.d(0);
    }

    public void setMinValue(int i7) {
        fb0 fb0Var;
        this.E = true;
        if (this.D == i7) {
            return;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.D = i7;
        if (i7 > this.H) {
            int i10 = this.I;
            if (i7 <= i10) {
                this.H = i10;
            } else {
                this.H = i7;
            }
        }
        setWrapSelectorWheel(this.i0);
        f();
        n();
        m();
        invalidate();
        if (this.l0 != 0 || (fb0Var = this.K) == null) {
            return;
        }
        fb0Var.d(0);
    }

    public void setOnLongPressUpdateInterval(long j3) {
        this.M = j3;
    }

    public void setOnScrollListener(fb0 fb0Var) {
        this.K = fb0Var;
    }

    public void setOnValueChangedListener(gb0 gb0Var) {
        this.J = gb0Var;
    }

    public void setSelectorColor(int i7) {
        this.a = true;
        this.j0.setColor(i7);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.s6.q(this.e);
        this.e.setTextColor(i7);
        this.P.setColor(i7);
    }

    public void setTextOffset(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setValue(int i7) {
        l(i7, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r5 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setWrapSelectorWheel(boolean z9) {
        Integer num;
        boolean z10 = true;
        if (!this.G || !this.E || ((num = this.v0) != null && (this.F - this.D) + 1 >= num.intValue())) {
            this.i0 = z9;
        }
        z10 = false;
        this.h0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Paint paint;
        try {
            if (this.a || (paint = this.j0) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.s0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ib0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(18, context, g6Var);
    }

    public ib0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.b = 3;
        this.c = 1;
        this.M = 300L;
        this.N = new SparseArray();
        this.O = new int[this.b];
        this.R = TLObject.FLAG_31;
        this.l0 = 0;
        this.r0 = -1;
        this.t0 = true;
        this.s0 = g6Var;
        int L = org.telegram.messenger.g0.L(i7);
        this.w = L;
        Paint paint = new Paint();
        this.j0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
        this.k0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.r = -1;
        this.s = true;
        this.q0 = new hb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.e = textView;
        textView.setGravity(17);
        this.e.setSingleLine(true);
        org.telegram.ui.ActionBar.s6.U(this.e, org.telegram.ui.ActionBar.l6.j5, g6Var);
        this.e.setBackgroundResource(0);
        float f10 = L;
        this.e.setTextSize(0, f10);
        this.e.setVisibility(4);
        addView(this.e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.e0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.g0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.e.getTypeface());
        paint2.setColor(this.e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.P = paint2;
        this.T = new xk0(getContext(), null);
        this.U = new xk0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new cb0(this));
    }
}
