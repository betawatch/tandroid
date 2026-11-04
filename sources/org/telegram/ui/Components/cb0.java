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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class cb0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public static final xq y0 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public ab0 K;
    public za0 L;
    public ya0 M;
    public long N;
    public final SparseArray O;
    public int[] P;
    public final Paint Q;
    public int R;
    public int S;
    public int T;
    public final al0 U;
    public final al0 V;
    public int W;
    public boolean a;
    public xa0 a0;
    public int b;
    public float b0;
    public int c;
    public long c0;
    public int d;
    public float d0;
    public final TextView e;
    public VelocityTracker e0;
    public final int f;
    public final int f0;
    public final int g0;
    public final int h;
    public final int h0;
    public boolean i0;
    public boolean j0;
    public final Paint k0;
    public final int l0;
    public int m0;
    public final int n;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public int r;
    public final bb0 r0;
    public final boolean s;
    public int s0;
    public final org.telegram.ui.ActionBar.e6 t0;
    public boolean u0;
    public org.telegram.messenger.v10 v0;
    public final int w;
    public Integer w0;
    public int x;
    public int x0;
    public String[] y;

    public cb0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i3, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i3);
            int mode = View.MeasureSpec.getMode(i3);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), TLObject.FLAG_30);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(k2.p1.i(mode, "Unknown measure mode: "));
            }
        }
        return i3;
    }

    public static int k(int i3, int i10, int i11) {
        if (i3 == -1) {
            return i10;
        }
        int max = Math.max(i3, i10);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? max : size : size < max ? 16777216 | size : max;
    }

    public final void a(boolean z10) {
        this.e.setVisibility(4);
        if (!h(this.U)) {
            h(this.V);
        }
        this.W = 0;
        if (z10) {
            this.U.d(-this.R, org.telegram.messenger.hs.X4);
        } else {
            this.U.d(this.R, org.telegram.messenger.hs.X4);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    public final void b(int i3) {
        String str;
        SparseArray sparseArray = this.O;
        if (((String) sparseArray.get(i3)) != null) {
            return;
        }
        int i10 = this.E;
        if (i3 < i10 || i3 > this.G) {
            str = "";
        } else {
            String[] strArr = this.y;
            if (strArr != null) {
                str = strArr[i3 - i10];
            } else {
                ya0 ya0Var = this.M;
                str = ya0Var != null ? ya0Var.e(i3) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
            }
        }
        sparseArray.put(i3, str);
    }

    public final boolean c() {
        int i3 = this.S - this.T;
        if (i3 == 0) {
            return false;
        }
        this.W = 0;
        int abs = Math.abs(i3);
        int i10 = this.R;
        if (abs > i10 / 2) {
            if (i3 > 0) {
                i10 = -i10;
            }
            i3 += i10;
        }
        this.V.d(i3, 800);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        al0 al0Var = this.U;
        if (al0Var.q) {
            al0Var = this.V;
            if (al0Var.q) {
                return;
            }
        }
        al0Var.b();
        int i3 = al0Var.k;
        if (this.W == 0) {
            this.W = al0Var.c;
        }
        scrollBy(0, i3 - this.W);
        this.W = i3;
        if (!al0Var.q) {
            invalidate();
            return;
        }
        if (al0Var == this.U) {
            if (!c()) {
                n();
            }
            i(0);
        } else if (this.m0 != 1) {
            n();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.T;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return ((this.G - this.E) + 1) * this.R;
    }

    public CharSequence d(int i3) {
        return this.e.getText();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        requestFocus();
        r5.s0 = r0;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r5.U.q == false) goto L34;
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
                if (action == 1 && this.s0 == keyCode) {
                    this.s0 = -1;
                    return true;
                }
            } else if (!this.i0) {
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

    public final int e(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        return (!this.H || i3 <= (i13 = this.G) || (i15 = i13 - (i14 = this.E)) == 0) ? (!this.F || i3 >= (i10 = this.E) || (i12 = (i11 = this.G) - i10) == 0) ? i3 : (i11 - ((i10 - i3) % i12)) + 1 : (((i3 - i13) % i15) + i14) - 1;
    }

    public final void f() {
        this.O.clear();
        int[] iArr = this.P;
        int value = getValue();
        for (int i3 = 0; i3 < this.P.length; i3++) {
            int i10 = (i3 - this.c) + value;
            if (this.i0) {
                i10 = e(i10);
            }
            iArr[i3] = i10;
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
        return this.G;
    }

    public int getMinValue() {
        return this.E;
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
        return this.I;
    }

    public boolean getWrapSelectorWheel() {
        return this.i0;
    }

    public final boolean h(al0 al0Var) {
        al0Var.q = true;
        int i3 = al0Var.e - al0Var.k;
        int i10 = this.S - ((this.T + i3) % this.R);
        if (i10 == 0) {
            return false;
        }
        int abs = Math.abs(i10);
        int i11 = this.R;
        if (abs > i11 / 2) {
            i10 = i10 > 0 ? i10 - i11 : i10 + i11;
        }
        scrollBy(0, i3 + i10);
        return true;
    }

    public final void i(int i3) {
        String str;
        if (this.m0 == i3) {
            return;
        }
        this.m0 = i3;
        za0 za0Var = this.L;
        if (za0Var != null) {
            za0Var.d(i3);
        }
        if (i3 == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.y;
                if (strArr == null) {
                    int i10 = this.I;
                    ya0 ya0Var = this.M;
                    str = ya0Var != null ? ya0Var.e(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
                } else {
                    str = strArr[this.I - this.E];
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(TLObject.FLAG_14);
                obtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final void j() {
        xa0 xa0Var = this.a0;
        if (xa0Var != null) {
            removeCallbacks(xa0Var);
        }
        this.r0.a();
    }

    public final void l(int i3, boolean z10) {
        za0 za0Var;
        ab0 ab0Var;
        if (this.I == i3) {
            return;
        }
        int e10 = this.i0 ? e(i3) : Math.min(Math.max(i3, this.E), this.G);
        int i10 = this.I;
        this.J = e10;
        this.I = e10;
        n();
        if (Math.abs(i10 - e10) > 0.9f) {
            org.telegram.messenger.g0.c4(this);
        }
        if (z10 && (ab0Var = this.K) != null) {
            ab0Var.l(this, this.I);
        }
        f();
        invalidate();
        if (this.m0 != 0 || (za0Var = this.L) == null) {
            return;
        }
        za0Var.d(0);
    }

    public final void m() {
        int i3;
        if (this.s) {
            String[] strArr = this.y;
            Paint paint = this.Q;
            int i10 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i11 = 0; i11 <= 9; i11++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i12 = this.G; i12 > 0; i12 /= 10) {
                    i10++;
                }
                i3 = (int) (i10 * f10);
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
                i3 = i13;
            }
            TextView textView = this.e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i3;
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
            int i3 = this.I;
            ya0 ya0Var = this.M;
            str = ya0Var != null ? ya0Var.e(i3) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
        } else {
            str = strArr[this.I - this.E];
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
        boolean z10;
        int i3;
        int i10 = this.x0;
        if (i10 == 5) {
            this.Q.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i10 == 3) {
            this.Q.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.Q.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.d;
        float f11 = this.T;
        int[] iArr = this.P;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            String str = (String) this.O.get(iArr[i11]);
            if (str != null && (i11 != this.c || this.e.getVisibility() != 0)) {
                if (this.b > 3) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    float measuredHeight3 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.Q.getTextSize() / 2.0f);
                    if (textSize < measuredHeight2) {
                        measuredHeight = textSize / measuredHeight3;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight3;
                        z10 = false;
                    }
                    float interpolation = y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.Q.getTextSize() * (1.0f - interpolation);
                    if (!z10) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i3 = this.Q.getAlpha();
                        this.Q.setAlpha((int) ((i3 * interpolation) / 0.1f));
                    } else {
                        i3 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.Q);
                    canvas.restore();
                    if (i3 != -1) {
                        this.Q.setAlpha(i3);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.Q);
                }
            }
            f11 += this.R;
        }
        if (this.u0) {
            canvas.drawRect(0.0f, this.n0, getRight(), this.l0 + r0, this.k0);
            canvas.drawRect(0.0f, r15 - this.l0, getRight(), this.o0, this.k0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.e.setVisibility(4);
        float y9 = motionEvent.getY();
        this.b0 = y9;
        this.d0 = y9;
        this.c0 = motionEvent.getEventTime();
        float f10 = this.b0;
        if (f10 < this.n0) {
            if (this.m0 == 0) {
                bb0 bb0Var = this.r0;
                bb0Var.a();
                bb0Var.c = 1;
                bb0Var.b = 2;
                ((cb0) bb0Var.d).postDelayed(bb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.o0 && this.m0 == 0) {
            bb0 bb0Var2 = this.r0;
            bb0Var2.a();
            bb0Var2.c = 1;
            bb0Var2.b = 1;
            ((cb0) bb0Var2.d).postDelayed(bb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        al0 al0Var = this.U;
        if (!al0Var.q) {
            al0Var.q = true;
            this.V.q = true;
            i(0);
            return true;
        }
        al0 al0Var2 = this.V;
        if (!al0Var2.q) {
            al0Var.q = true;
            al0Var2.q = true;
            return true;
        }
        float f11 = this.b0;
        if (f11 < this.n0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.a0;
            if (runnable == null) {
                this.a0 = new xa0(this);
            } else {
                removeCallbacks(runnable);
            }
            xa0 xa0Var = this.a0;
            xa0Var.a = false;
            postDelayed(xa0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.o0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.a0;
            if (runnable2 == null) {
                this.a0 = new xa0(this);
            } else {
                removeCallbacks(runnable2);
            }
            xa0 xa0Var2 = this.a0;
            xa0Var2.a = true;
            postDelayed(xa0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.e.getMeasuredWidth();
        int measuredHeight2 = this.e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int length = this.P.length;
            int i15 = this.w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / r2.length) + 0.5f);
            this.x = bottom;
            this.R = bottom + i15;
            int top = (this.e.getTop() + this.e.getBaseline()) - (this.R * this.c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.n0 = ((getHeight() - i15) - this.x) / 2;
            this.o0 = ((getHeight() + i15) + this.x) / 2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(g(i3, this.r), g(i10, this.h));
        setMeasuredDimension(k(this.n, getMeasuredWidth(), i3), k(this.f, getMeasuredHeight(), i10));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.e0 == null) {
            this.e0 = VelocityTracker.obtain();
        }
        this.e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y9 = motionEvent.getY();
            if (this.m0 == 1) {
                scrollBy(0, (int) (y9 - this.d0));
                invalidate();
            } else if (((int) Math.abs(y9 - this.b0)) > this.f0) {
                j();
                i(1);
            }
            this.d0 = y9;
            return true;
        }
        xa0 xa0Var = this.a0;
        if (xa0Var != null) {
            removeCallbacks(xa0Var);
        }
        this.r0.a();
        VelocityTracker velocityTracker = this.e0;
        velocityTracker.computeCurrentVelocity(1000, this.h0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.g0) {
            this.W = 0;
            if (yVelocity > 0) {
                this.U.c(0, 0, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            } else {
                this.U.c(0, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            invalidate();
            i(2);
        } else {
            int y10 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y10 - this.b0);
            long eventTime = motionEvent.getEventTime() - this.c0;
            if (abs > this.f0 || eventTime >= ViewConfiguration.getTapTimeout()) {
                c();
            } else {
                int i3 = (y10 / this.R) - this.c;
                if (i3 > 0) {
                    a(true);
                    bb0 bb0Var = this.r0;
                    bb0Var.a();
                    bb0Var.c = 2;
                    bb0Var.b = 1;
                    ((cb0) bb0Var.d).post(bb0Var);
                } else if (i3 < 0) {
                    a(false);
                    bb0 bb0Var2 = this.r0;
                    bb0Var2.a();
                    bb0Var2.c = 2;
                    bb0Var2.b = 2;
                    ((cb0) bb0Var2.d).post(bb0Var2);
                }
            }
            i(0);
        }
        this.e0.recycle();
        this.e0 = null;
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i10) {
        int[] iArr = this.P;
        boolean z10 = this.i0;
        if (!z10 && i10 > 0 && iArr[this.c] <= this.E) {
            int i11 = this.T + i10;
            int i12 = this.S;
            if (i11 > i12) {
                this.T = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.c] >= this.G) {
            int i13 = this.T + i10;
            int i14 = this.S;
            if (i13 < i14) {
                this.T = i14;
                return;
            }
        }
        this.T += i10;
        while (true) {
            int i15 = this.T;
            if (i15 - this.S <= this.x) {
                break;
            }
            this.T = i15 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.i0 && i16 < this.E) {
                i16 = this.G;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.i0 && iArr[this.c] <= this.E) {
                int i17 = this.T;
                int i18 = this.S;
                if (i17 > i18) {
                    this.T = i18;
                }
            }
        }
        while (true) {
            int i19 = this.T;
            if (i19 - this.S >= (-this.x)) {
                l(iArr[this.c], true);
                return;
            }
            this.T = i19 + this.R;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i20 = iArr[iArr.length - 2] + 1;
            if (this.i0 && i20 > this.G) {
                i20 = this.E;
            }
            iArr[iArr.length - 1] = i20;
            b(i20);
            if (!this.i0 && iArr[this.c] >= this.G) {
                int i21 = this.T;
                int i22 = this.S;
                if (i21 < i22) {
                    this.T = i22;
                }
            }
        }
    }

    public void setAllItemsCount(int i3) {
        this.w0 = Integer.valueOf(i3);
        setWrapSelectorWheel(this.j0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.v10 v10Var) {
        this.v0 = v10Var;
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

    public void setDrawDividers(boolean z10) {
        this.u0 = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setEnabled(z10);
    }

    public void setFormatter(ya0 ya0Var) {
        if (ya0Var == this.M) {
            return;
        }
        this.M = ya0Var;
        f();
        n();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i3) {
        this.x0 = i3;
        super.setGravity(i3);
    }

    public void setItemCount(int i3) {
        if (this.b == i3) {
            return;
        }
        this.b = i3;
        this.c = i3 / 2;
        this.P = new int[i3];
        f();
    }

    public void setMaxValue(int i3) {
        za0 za0Var;
        this.H = true;
        if (this.G == i3) {
            return;
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.G = i3;
        if (i3 < this.I) {
            int i10 = this.J;
            if (i3 >= i10) {
                this.I = i10;
            } else {
                this.I = i3;
            }
        }
        setWrapSelectorWheel(this.j0);
        f();
        n();
        m();
        invalidate();
        if (this.m0 != 0 || (za0Var = this.L) == null) {
            return;
        }
        za0Var.d(0);
    }

    public void setMinValue(int i3) {
        za0 za0Var;
        this.F = true;
        if (this.E == i3) {
            return;
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.E = i3;
        if (i3 > this.I) {
            int i10 = this.J;
            if (i3 <= i10) {
                this.I = i10;
            } else {
                this.I = i3;
            }
        }
        setWrapSelectorWheel(this.j0);
        f();
        n();
        m();
        invalidate();
        if (this.m0 != 0 || (za0Var = this.L) == null) {
            return;
        }
        za0Var.d(0);
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.N = j10;
    }

    public void setOnScrollListener(za0 za0Var) {
        this.L = za0Var;
    }

    public void setOnValueChangedListener(ab0 ab0Var) {
        this.K = ab0Var;
    }

    public void setSelectorColor(int i3) {
        this.a = true;
        this.k0.setColor(i3);
    }

    public void setTextColor(int i3) {
        org.telegram.ui.ActionBar.r6.r(this.e);
        this.e.setTextColor(i3);
        this.Q.setColor(i3);
    }

    public void setTextOffset(int i3) {
        this.d = i3;
        invalidate();
    }

    public void setValue(int i3) {
        l(i3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r5 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setWrapSelectorWheel(boolean z10) {
        Integer num;
        boolean z11 = true;
        if (!this.H || !this.F || ((num = this.w0) != null && (this.G - this.E) + 1 >= num.intValue())) {
            this.j0 = z10;
        }
        z11 = false;
        this.i0 = z11;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Paint paint;
        try {
            if (this.a || (paint = this.k0) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.t0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public cb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(18, context, e6Var);
    }

    public cb0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = 3;
        this.c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.b];
        this.S = TLObject.FLAG_31;
        this.m0 = 0;
        this.s0 = -1;
        this.u0 = true;
        this.t0 = e6Var;
        int L = org.telegram.messenger.g0.L(i3);
        this.w = L;
        Paint paint = new Paint();
        this.k0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        this.l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
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
        this.r0 = new bb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.e = textView;
        textView.setGravity(17);
        this.e.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(this.e, org.telegram.ui.ActionBar.k6.j5, e6Var);
        this.e.setBackgroundResource(0);
        float f10 = L;
        this.e.setTextSize(0, f10);
        this.e.setVisibility(4);
        addView(this.e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f0 = viewConfiguration.getScaledTouchSlop();
        this.g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.e.getTypeface());
        paint2.setColor(this.e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new al0(getContext(), null);
        this.V = new al0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new wa0(this));
    }
}
