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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class bc0 extends LinearLayout {
    public static final gr r0 = new gr(0.0f, 0.5f, 0.5f, 1.0f);
    public int A;
    public boolean B;
    public int C;
    public int D;
    public zb0 E;
    public yb0 F;
    public xb0 G;
    public long H;
    public final SparseArray I;
    public int[] J;
    public final Paint K;
    public int L;
    public int M;
    public int N;
    public final yl0 O;
    public final yl0 P;
    public int Q;
    public wb0 R;
    public float S;
    public long T;
    public float U;
    public VelocityTracker V;
    public final int W;
    public int a;
    public final int a0;
    public int b;
    public final int b0;
    public int c;
    public boolean c0;
    public final TextView d;
    public boolean d0;
    public final int e;
    public final Paint e0;
    public final int f;
    public final int f0;
    public int g0;
    public final int h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final ac0 l0;
    public int m0;
    public int n;
    public boolean n0;
    public Utilities.CallbackReturn o0;
    public Integer p0;
    public int q0;
    public final boolean r;
    public final int s;
    public int v;
    public String[] w;
    public int x;
    public boolean y;

    public bc0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i9, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i9);
            int mode = View.MeasureSpec.getMode(i9);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), TLObject.FLAG_30);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(j3.r0.l(mode, "Unknown measure mode: "));
            }
        }
        return i9;
    }

    public static int k(int i9, int i10, int i11) {
        if (i9 == -1) {
            return i10;
        }
        int max = Math.max(i9, i10);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? max : size : size < max ? 16777216 | size : max;
    }

    public final void a(boolean z10) {
        this.d.setVisibility(4);
        if (!h(this.O)) {
            h(this.P);
        }
        this.Q = 0;
        if (z10) {
            this.O.d(-this.L, 300);
        } else {
            this.O.d(this.L, 300);
        }
        invalidate();
    }

    public final void b(int i9) {
        String str;
        SparseArray sparseArray = this.I;
        if (((String) sparseArray.get(i9)) != null) {
            return;
        }
        int i10 = this.x;
        if (i9 < i10 || i9 > this.A) {
            str = "";
        } else {
            String[] strArr = this.w;
            if (strArr != null) {
                str = strArr[i9 - i10];
            } else {
                xb0 xb0Var = this.G;
                str = xb0Var != null ? xb0Var.g(i9) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i9));
            }
        }
        sparseArray.put(i9, str);
    }

    public final boolean c() {
        int i9 = this.M - this.N;
        if (i9 == 0) {
            return false;
        }
        this.Q = 0;
        int abs = Math.abs(i9);
        int i10 = this.L;
        if (abs > i10 / 2) {
            if (i9 > 0) {
                i10 = -i10;
            }
            i9 += i10;
        }
        this.P.d(i9, 800);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        yl0 yl0Var = this.O;
        if (yl0Var.q) {
            yl0Var = this.P;
            if (yl0Var.q) {
                return;
            }
        }
        yl0Var.b();
        int i9 = yl0Var.k;
        if (this.Q == 0) {
            this.Q = yl0Var.c;
        }
        scrollBy(0, i9 - this.Q);
        this.Q = i9;
        if (!yl0Var.q) {
            invalidate();
            return;
        }
        if (yl0Var == this.O) {
            if (!c()) {
                n();
            }
            i(0);
        } else if (this.g0 != 1) {
            n();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.N;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return ((this.A - this.x) + 1) * this.L;
    }

    public CharSequence d(int i9) {
        return this.d.getText();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        requestFocus();
        r5.m0 = r0;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r5.O.q == false) goto L34;
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
                if (action == 1 && this.m0 == keyCode) {
                    this.m0 = -1;
                    return true;
                }
            } else if (!this.c0) {
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

    public final int e(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        return (!this.B || i9 <= (i13 = this.A) || (i15 = i13 - (i14 = this.x)) == 0) ? (!this.y || i9 >= (i10 = this.x) || (i12 = (i11 = this.A) - i10) == 0) ? i9 : (i11 - ((i10 - i9) % i12)) + 1 : (((i9 - i13) % i15) + i14) - 1;
    }

    public final void f() {
        this.I.clear();
        int[] iArr = this.J;
        int value = getValue();
        for (int i9 = 0; i9 < this.J.length; i9++) {
            int i10 = (i9 - this.b) + value;
            if (this.c0) {
                i10 = e(i10);
            }
            iArr[i9] = i10;
            b(i10);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.w;
    }

    public int getItemsCount() {
        return this.a;
    }

    public int getMaxValue() {
        return this.A;
    }

    public int getMinValue() {
        return this.x;
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
        return this.C;
    }

    public boolean getWrapSelectorWheel() {
        return this.c0;
    }

    public final boolean h(yl0 yl0Var) {
        yl0Var.q = true;
        int i9 = yl0Var.e - yl0Var.k;
        int i10 = this.M - ((this.N + i9) % this.L);
        if (i10 == 0) {
            return false;
        }
        int abs = Math.abs(i10);
        int i11 = this.L;
        if (abs > i11 / 2) {
            i10 = i10 > 0 ? i10 - i11 : i10 + i11;
        }
        scrollBy(0, i9 + i10);
        return true;
    }

    public final void i(int i9) {
        String str;
        if (this.g0 == i9) {
            return;
        }
        this.g0 = i9;
        yb0 yb0Var = this.F;
        if (yb0Var != null) {
            yb0Var.j(i9);
        }
        if (i9 == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.w;
                if (strArr == null) {
                    int i10 = this.C;
                    xb0 xb0Var = this.G;
                    str = xb0Var != null ? xb0Var.g(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
                } else {
                    str = strArr[this.C - this.x];
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final void j() {
        wb0 wb0Var = this.R;
        if (wb0Var != null) {
            removeCallbacks(wb0Var);
        }
        this.l0.a();
    }

    public final void l(int i9, boolean z10) {
        yb0 yb0Var;
        zb0 zb0Var;
        if (this.C == i9) {
            return;
        }
        int e10 = this.c0 ? e(i9) : Math.min(Math.max(i9, this.x), this.A);
        int i10 = this.C;
        this.D = e10;
        this.C = e10;
        n();
        if (Math.abs(i10 - e10) > 0.9f) {
            AndroidUtilities.vibrateCursor(this);
        }
        if (z10 && (zb0Var = this.E) != null) {
            zb0Var.m(this, this.C);
        }
        f();
        invalidate();
        if (this.g0 != 0 || (yb0Var = this.F) == null) {
            return;
        }
        yb0Var.j(0);
    }

    public final void m() {
        int i9;
        if (this.r) {
            String[] strArr = this.w;
            Paint paint = this.K;
            int i10 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i11 = 0; i11 <= 9; i11++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i12 = this.A; i12 > 0; i12 /= 10) {
                    i10++;
                }
                i9 = (int) (i10 * f10);
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
                i9 = i13;
            }
            TextView textView = this.d;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i9;
            if (this.n != paddingRight) {
                int i14 = this.h;
                if (paddingRight > i14) {
                    this.n = paddingRight;
                } else {
                    this.n = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.w;
        if (strArr == null) {
            int i9 = this.C;
            xb0 xb0Var = this.G;
            str = xb0Var != null ? xb0Var.g(i9) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i9));
        } else {
            str = strArr[this.C - this.x];
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.d;
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
        int i9;
        int i10 = this.q0;
        if (i10 == 5) {
            this.K.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i10 == 3) {
            this.K.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.K.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.c;
        float f11 = this.N;
        int[] iArr = this.J;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            String str = (String) this.I.get(iArr[i11]);
            if (str != null && (i11 != this.b || this.d.getVisibility() != 0)) {
                if (this.a > 3) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    float measuredHeight3 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.K.getTextSize() / 2.0f);
                    if (textSize < measuredHeight2) {
                        measuredHeight = textSize / measuredHeight3;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight3;
                        z10 = false;
                    }
                    float interpolation = r0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.K.getTextSize() * (1.0f - interpolation);
                    if (!z10) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i9 = this.K.getAlpha();
                        this.K.setAlpha((int) ((i9 * interpolation) / 0.1f));
                    } else {
                        i9 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.K);
                    canvas.restore();
                    if (i9 != -1) {
                        this.K.setAlpha(i9);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.K);
                }
            }
            f11 += this.L;
        }
        if (this.n0) {
            canvas.drawRect(0.0f, this.h0, getRight(), this.f0 + r0, this.e0);
            canvas.drawRect(0.0f, r15 - this.f0, getRight(), this.i0, this.e0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.d.setVisibility(4);
        float y10 = motionEvent.getY();
        this.S = y10;
        this.U = y10;
        this.T = motionEvent.getEventTime();
        float f10 = this.S;
        if (f10 < this.h0) {
            if (this.g0 == 0) {
                ac0 ac0Var = this.l0;
                ac0Var.a();
                ac0Var.c = 1;
                ac0Var.b = 2;
                ((bc0) ac0Var.d).postDelayed(ac0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.i0 && this.g0 == 0) {
            ac0 ac0Var2 = this.l0;
            ac0Var2.a();
            ac0Var2.c = 1;
            ac0Var2.b = 1;
            ((bc0) ac0Var2.d).postDelayed(ac0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        yl0 yl0Var = this.O;
        if (!yl0Var.q) {
            yl0Var.q = true;
            this.P.q = true;
            i(0);
            return true;
        }
        yl0 yl0Var2 = this.P;
        if (!yl0Var2.q) {
            yl0Var.q = true;
            yl0Var2.q = true;
            return true;
        }
        float f11 = this.S;
        if (f11 < this.h0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.R;
            if (runnable == null) {
                this.R = new wb0(this);
            } else {
                removeCallbacks(runnable);
            }
            wb0 wb0Var = this.R;
            wb0Var.a = false;
            postDelayed(wb0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.i0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.R;
            if (runnable2 == null) {
                this.R = new wb0(this);
            } else {
                removeCallbacks(runnable2);
            }
            wb0 wb0Var2 = this.R;
            wb0Var2.a = true;
            postDelayed(wb0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.d.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int length = this.J.length;
            int i15 = this.s;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / r2.length) + 0.5f);
            this.v = bottom;
            this.L = bottom + i15;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.L * this.b);
            this.M = top;
            this.N = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.h0 = ((getHeight() - i15) - this.v) / 2;
            this.i0 = ((getHeight() + i15) + this.v) / 2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(g(i9, this.n), g(i10, this.f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i9), k(this.e, getMeasuredHeight(), i10));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.V == null) {
            this.V = VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.g0 == 1) {
                scrollBy(0, (int) (y10 - this.U));
                invalidate();
            } else if (((int) Math.abs(y10 - this.S)) > this.W) {
                j();
                i(1);
            }
            this.U = y10;
            return true;
        }
        wb0 wb0Var = this.R;
        if (wb0Var != null) {
            removeCallbacks(wb0Var);
        }
        this.l0.a();
        VelocityTracker velocityTracker = this.V;
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.b0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.a0) {
            this.Q = 0;
            if (yVelocity > 0) {
                this.O.c(0, 0, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            } else {
                this.O.c(0, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            invalidate();
            i(2);
        } else {
            int y11 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y11 - this.S);
            long eventTime = motionEvent.getEventTime() - this.T;
            if (abs > this.W || eventTime >= ViewConfiguration.getTapTimeout()) {
                c();
            } else {
                int i9 = (y11 / this.L) - this.b;
                if (i9 > 0) {
                    a(true);
                    ac0 ac0Var = this.l0;
                    ac0Var.a();
                    ac0Var.c = 2;
                    ac0Var.b = 1;
                    ((bc0) ac0Var.d).post(ac0Var);
                } else if (i9 < 0) {
                    a(false);
                    ac0 ac0Var2 = this.l0;
                    ac0Var2.a();
                    ac0Var2.c = 2;
                    ac0Var2.b = 2;
                    ((bc0) ac0Var2.d).post(ac0Var2);
                }
            }
            i(0);
        }
        this.V.recycle();
        this.V = null;
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i9, int i10) {
        int[] iArr = this.J;
        boolean z10 = this.c0;
        if (!z10 && i10 > 0 && iArr[this.b] <= this.x) {
            int i11 = this.N + i10;
            int i12 = this.M;
            if (i11 > i12) {
                this.N = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.b] >= this.A) {
            int i13 = this.N + i10;
            int i14 = this.M;
            if (i13 < i14) {
                this.N = i14;
                return;
            }
        }
        this.N += i10;
        while (true) {
            int i15 = this.N;
            if (i15 - this.M <= this.v) {
                break;
            }
            this.N = i15 - this.L;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.c0 && i16 < this.x) {
                i16 = this.A;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.c0 && iArr[this.b] <= this.x) {
                int i17 = this.N;
                int i18 = this.M;
                if (i17 > i18) {
                    this.N = i18;
                }
            }
        }
        while (true) {
            int i19 = this.N;
            if (i19 - this.M >= (-this.v)) {
                l(iArr[this.b], true);
                return;
            }
            this.N = i19 + this.L;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i20 = iArr[iArr.length - 2] + 1;
            if (this.c0 && i20 > this.A) {
                i20 = this.x;
            }
            iArr[iArr.length - 1] = i20;
            b(i20);
            if (!this.c0 && iArr[this.b] >= this.A) {
                int i21 = this.N;
                int i22 = this.M;
                if (i21 < i22) {
                    this.N = i22;
                }
            }
        }
    }

    public void setAllItemsCount(int i9) {
        this.p0 = Integer.valueOf(i9);
        setWrapSelectorWheel(this.d0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.o0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.w == strArr) {
            return;
        }
        this.w = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.n0 = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.d.setEnabled(z10);
    }

    public void setFormatter(xb0 xb0Var) {
        if (xb0Var == this.G) {
            return;
        }
        this.G = xb0Var;
        f();
        n();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i9) {
        this.q0 = i9;
        super.setGravity(i9);
    }

    public void setItemCount(int i9) {
        if (this.a == i9) {
            return;
        }
        this.a = i9;
        this.b = i9 / 2;
        this.J = new int[i9];
        f();
    }

    public void setMaxValue(int i9) {
        yb0 yb0Var;
        this.B = true;
        if (this.A == i9) {
            return;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.A = i9;
        if (i9 < this.C) {
            int i10 = this.D;
            if (i9 >= i10) {
                this.C = i10;
            } else {
                this.C = i9;
            }
        }
        setWrapSelectorWheel(this.d0);
        f();
        n();
        m();
        invalidate();
        if (this.g0 != 0 || (yb0Var = this.F) == null) {
            return;
        }
        yb0Var.j(0);
    }

    public void setMinValue(int i9) {
        yb0 yb0Var;
        this.y = true;
        if (this.x == i9) {
            return;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.x = i9;
        if (i9 > this.C) {
            int i10 = this.D;
            if (i9 <= i10) {
                this.C = i10;
            } else {
                this.C = i9;
            }
        }
        setWrapSelectorWheel(this.d0);
        f();
        n();
        m();
        invalidate();
        if (this.g0 != 0 || (yb0Var = this.F) == null) {
            return;
        }
        yb0Var.j(0);
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.H = j10;
    }

    public void setOnScrollListener(yb0 yb0Var) {
        this.F = yb0Var;
    }

    public void setOnValueChangedListener(zb0 zb0Var) {
        this.E = zb0Var;
    }

    public void setSelectorColor(int i9) {
        this.e0.setColor(i9);
    }

    public void setTextColor(int i9) {
        this.d.setTextColor(i9);
        this.K.setColor(i9);
    }

    public void setTextOffset(int i9) {
        this.c = i9;
        invalidate();
    }

    public void setValue(int i9) {
        l(i9, false);
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
        if (!this.B || !this.y || ((num = this.p0) != null && (this.A - this.x) + 1 >= num.intValue())) {
            this.d0 = z10;
        }
        z11 = false;
        this.c0 = z11;
    }

    public bc0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, 18, b6Var);
    }

    public bc0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 3;
        this.b = 1;
        this.H = 300L;
        this.I = new SparseArray();
        this.J = new int[this.a];
        this.M = TLObject.FLAG_31;
        this.g0 = 0;
        this.m0 = -1;
        this.n0 = true;
        int dp = AndroidUtilities.dp(i9);
        this.s = dp;
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        this.f0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f = applyDimension;
        int i10 = this.e;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.n = -1;
        this.r = true;
        this.l0 = new ac0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        this.d.setBackgroundResource(0);
        float f10 = dp;
        this.d.setTextSize(0, f10);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.W = viewConfiguration.getScaledTouchSlop();
        this.a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.K = paint2;
        this.O = new yl0(getContext(), null);
        this.P = new yl0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new vb0(this));
    }
}
