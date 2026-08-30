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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class wc0 extends LinearLayout {
    public static final nr s0 = new nr(0.0f, 0.5f, 0.5f, 1.0f);
    public int B;
    public boolean C;
    public int D;
    public int E;
    public uc0 F;
    public tc0 G;
    public sc0 H;
    public long I;
    public final SparseArray J;
    public int[] K;
    public final Paint L;
    public int M;
    public int N;
    public int O;
    public final vm0 P;
    public final vm0 Q;
    public int R;
    public rc0 S;
    public float T;
    public long U;
    public float V;
    public VelocityTracker W;
    public int a;
    public final int a0;
    public int b;
    public final int b0;
    public int c;
    public final int c0;
    public final TextView d;
    public boolean d0;
    public final int e;
    public boolean e0;
    public final int f;
    public final Paint f0;
    public final int g0;
    public final int h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public final vc0 m0;
    public int n;
    public int n0;
    public boolean o0;
    public Utilities.CallbackReturn p0;
    public Integer q0;
    public final boolean r;
    public int r0;
    public final int s;
    public int v;
    public String[] w;
    public int x;
    public boolean y;

    public wc0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), TLObject.FLAG_30);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(kh.a2.j(mode, "Unknown measure mode: "));
            }
        }
        return i10;
    }

    public static int k(int i10, int i11, int i12) {
        if (i10 == -1) {
            return i11;
        }
        int max = Math.max(i10, i11);
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? max : size : size < max ? 16777216 | size : max;
    }

    public final void a(boolean z4) {
        this.d.setVisibility(4);
        if (!h(this.P)) {
            h(this.Q);
        }
        this.R = 0;
        if (z4) {
            this.P.d(-this.M, 300);
        } else {
            this.P.d(this.M, 300);
        }
        invalidate();
    }

    public final void b(int i10) {
        String str;
        SparseArray sparseArray = this.J;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.x;
        if (i10 < i11 || i10 > this.B) {
            str = "";
        } else {
            String[] strArr = this.w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                sc0 sc0Var = this.H;
                str = sc0Var != null ? sc0Var.e(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        }
        sparseArray.put(i10, str);
    }

    public final boolean c() {
        int i10 = this.N - this.O;
        if (i10 == 0) {
            return false;
        }
        this.R = 0;
        int abs = Math.abs(i10);
        int i11 = this.M;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.Q.d(i10, 800);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        vm0 vm0Var = this.P;
        if (vm0Var.q) {
            vm0Var = this.Q;
            if (vm0Var.q) {
                return;
            }
        }
        vm0Var.b();
        int i10 = vm0Var.k;
        if (this.R == 0) {
            this.R = vm0Var.c;
        }
        scrollBy(0, i10 - this.R);
        this.R = i10;
        if (!vm0Var.q) {
            invalidate();
            return;
        }
        if (vm0Var == this.P) {
            if (!c()) {
                n();
            }
            i(0);
        } else if (this.h0 != 1) {
            n();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.O;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return ((this.B - this.x) + 1) * this.M;
    }

    public CharSequence d(int i10) {
        return this.d.getText();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        requestFocus();
        r5.n0 = r0;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r5.P.q == false) goto L34;
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
                if (action == 1 && this.n0 == keyCode) {
                    this.n0 = -1;
                    return true;
                }
            } else if (!this.d0) {
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

    public final int e(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        return (!this.C || i10 <= (i14 = this.B) || (i16 = i14 - (i15 = this.x)) == 0) ? (!this.y || i10 >= (i11 = this.x) || (i13 = (i12 = this.B) - i11) == 0) ? i10 : (i12 - ((i11 - i10) % i13)) + 1 : (((i10 - i14) % i16) + i15) - 1;
    }

    public final void f() {
        this.J.clear();
        int[] iArr = this.K;
        int value = getValue();
        for (int i10 = 0; i10 < this.K.length; i10++) {
            int i11 = (i10 - this.b) + value;
            if (this.d0) {
                i11 = e(i11);
            }
            iArr[i10] = i11;
            b(i11);
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
        return this.B;
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
        return this.D;
    }

    public boolean getWrapSelectorWheel() {
        return this.d0;
    }

    public final boolean h(vm0 vm0Var) {
        vm0Var.q = true;
        int i10 = vm0Var.e - vm0Var.k;
        int i11 = this.N - ((this.O + i10) % this.M);
        if (i11 == 0) {
            return false;
        }
        int abs = Math.abs(i11);
        int i12 = this.M;
        if (abs > i12 / 2) {
            i11 = i11 > 0 ? i11 - i12 : i11 + i12;
        }
        scrollBy(0, i10 + i11);
        return true;
    }

    public final void i(int i10) {
        String str;
        if (this.h0 == i10) {
            return;
        }
        this.h0 = i10;
        tc0 tc0Var = this.G;
        if (tc0Var != null) {
            tc0Var.m(i10);
        }
        if (i10 == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.w;
                if (strArr == null) {
                    int i11 = this.D;
                    sc0 sc0Var = this.H;
                    str = sc0Var != null ? sc0Var.e(i11) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                } else {
                    str = strArr[this.D - this.x];
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final void j() {
        rc0 rc0Var = this.S;
        if (rc0Var != null) {
            removeCallbacks(rc0Var);
        }
        this.m0.a();
    }

    public final void l(int i10, boolean z4) {
        tc0 tc0Var;
        uc0 uc0Var;
        if (this.D == i10) {
            return;
        }
        int e = this.d0 ? e(i10) : Math.min(Math.max(i10, this.x), this.B);
        int i11 = this.D;
        this.E = e;
        this.D = e;
        n();
        if (Math.abs(i11 - e) > 0.9f) {
            AndroidUtilities.vibrateCursor(this);
        }
        if (z4 && (uc0Var = this.F) != null) {
            uc0Var.q(this, this.D);
        }
        f();
        invalidate();
        if (this.h0 != 0 || (tc0Var = this.G) == null) {
            return;
        }
        tc0Var.m(0);
    }

    public final void m() {
        int i10;
        if (this.r) {
            String[] strArr = this.w;
            Paint paint = this.L;
            int i11 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i13 = this.B; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f10);
            } else {
                int length = strArr.length;
                int i14 = 0;
                while (i11 < length) {
                    float measureText2 = paint.measureText(strArr[i11]);
                    if (measureText2 > i14) {
                        i14 = (int) measureText2;
                    }
                    i11++;
                }
                i10 = i14;
            }
            TextView textView = this.d;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i10;
            if (this.n != paddingRight) {
                int i15 = this.h;
                if (paddingRight > i15) {
                    this.n = paddingRight;
                } else {
                    this.n = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.w;
        if (strArr == null) {
            int i10 = this.D;
            sc0 sc0Var = this.H;
            str = sc0Var != null ? sc0Var.e(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
        } else {
            str = strArr[this.D - this.x];
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
        boolean z4;
        int i10;
        int i11 = this.r0;
        if (i11 == 5) {
            this.L.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i11 == 3) {
            this.L.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.L.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.c;
        float f11 = this.O;
        int[] iArr = this.K;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String str = (String) this.J.get(iArr[i12]);
            if (str != null && (i12 != this.b || this.d.getVisibility() != 0)) {
                if (this.a > 3) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    float measuredHeight3 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.L.getTextSize() / 2.0f);
                    if (textSize < measuredHeight2) {
                        measuredHeight = textSize / measuredHeight3;
                        z4 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight3;
                        z4 = false;
                    }
                    float interpolation = s0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.L.getTextSize() * (1.0f - interpolation);
                    if (!z4) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i10 = this.L.getAlpha();
                        this.L.setAlpha((int) ((i10 * interpolation) / 0.1f));
                    } else {
                        i10 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.L);
                    canvas.restore();
                    if (i10 != -1) {
                        this.L.setAlpha(i10);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.L);
                }
            }
            f11 += this.M;
        }
        if (this.o0) {
            canvas.drawRect(0.0f, this.i0, getRight(), this.g0 + r0, this.f0);
            canvas.drawRect(0.0f, r15 - this.g0, getRight(), this.j0, this.f0);
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
        this.T = y10;
        this.V = y10;
        this.U = motionEvent.getEventTime();
        float f10 = this.T;
        if (f10 < this.i0) {
            if (this.h0 == 0) {
                vc0 vc0Var = this.m0;
                vc0Var.a();
                vc0Var.c = 1;
                vc0Var.b = 2;
                ((wc0) vc0Var.d).postDelayed(vc0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.j0 && this.h0 == 0) {
            vc0 vc0Var2 = this.m0;
            vc0Var2.a();
            vc0Var2.c = 1;
            vc0Var2.b = 1;
            ((wc0) vc0Var2.d).postDelayed(vc0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        vm0 vm0Var = this.P;
        if (!vm0Var.q) {
            vm0Var.q = true;
            this.Q.q = true;
            i(0);
            return true;
        }
        vm0 vm0Var2 = this.Q;
        if (!vm0Var2.q) {
            vm0Var.q = true;
            vm0Var2.q = true;
            return true;
        }
        float f11 = this.T;
        if (f11 < this.i0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.S;
            if (runnable == null) {
                this.S = new rc0(this);
            } else {
                removeCallbacks(runnable);
            }
            rc0 rc0Var = this.S;
            rc0Var.a = false;
            postDelayed(rc0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.j0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.S;
            if (runnable2 == null) {
                this.S = new rc0(this);
            } else {
                removeCallbacks(runnable2);
            }
            rc0 rc0Var2 = this.S;
            rc0Var2.a = true;
            postDelayed(rc0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.d.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        if (z4) {
            f();
            int length = this.K.length;
            int i16 = this.s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / r2.length) + 0.5f);
            this.v = bottom;
            this.M = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.M * this.b);
            this.N = top;
            this.O = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.i0 = ((getHeight() - i16) - this.v) / 2;
            this.j0 = ((getHeight() + i16) + this.v) / 2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.n), g(i11, this.f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i10), k(this.e, getMeasuredHeight(), i11));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.h0 == 1) {
                scrollBy(0, (int) (y10 - this.V));
                invalidate();
            } else if (((int) Math.abs(y10 - this.T)) > this.a0) {
                j();
                i(1);
            }
            this.V = y10;
            return true;
        }
        rc0 rc0Var = this.S;
        if (rc0Var != null) {
            removeCallbacks(rc0Var);
        }
        this.m0.a();
        VelocityTracker velocityTracker = this.W;
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.c0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.b0) {
            this.R = 0;
            if (yVelocity > 0) {
                this.P.c(0, 0, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            } else {
                this.P.c(0, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, yVelocity, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            invalidate();
            i(2);
        } else {
            int y11 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y11 - this.T);
            long eventTime = motionEvent.getEventTime() - this.U;
            if (abs > this.a0 || eventTime >= ViewConfiguration.getTapTimeout()) {
                c();
            } else {
                int i10 = (y11 / this.M) - this.b;
                if (i10 > 0) {
                    a(true);
                    vc0 vc0Var = this.m0;
                    vc0Var.a();
                    vc0Var.c = 2;
                    vc0Var.b = 1;
                    ((wc0) vc0Var.d).post(vc0Var);
                } else if (i10 < 0) {
                    a(false);
                    vc0 vc0Var2 = this.m0;
                    vc0Var2.a();
                    vc0Var2.c = 2;
                    vc0Var2.b = 2;
                    ((wc0) vc0Var2.d).post(vc0Var2);
                }
            }
            i(0);
        }
        this.W.recycle();
        this.W = null;
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.K;
        boolean z4 = this.d0;
        if (!z4 && i11 > 0 && iArr[this.b] <= this.x) {
            int i12 = this.O + i11;
            int i13 = this.N;
            if (i12 > i13) {
                this.O = i13;
                return;
            }
        }
        if (!z4 && i11 < 0 && iArr[this.b] >= this.B) {
            int i14 = this.O + i11;
            int i15 = this.N;
            if (i14 < i15) {
                this.O = i15;
                return;
            }
        }
        this.O += i11;
        while (true) {
            int i16 = this.O;
            if (i16 - this.N <= this.v) {
                break;
            }
            this.O = i16 - this.M;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i17 = iArr[1] - 1;
            if (this.d0 && i17 < this.x) {
                i17 = this.B;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.d0 && iArr[this.b] <= this.x) {
                int i18 = this.O;
                int i19 = this.N;
                if (i18 > i19) {
                    this.O = i19;
                }
            }
        }
        while (true) {
            int i20 = this.O;
            if (i20 - this.N >= (-this.v)) {
                l(iArr[this.b], true);
                return;
            }
            this.O = i20 + this.M;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i21 = iArr[iArr.length - 2] + 1;
            if (this.d0 && i21 > this.B) {
                i21 = this.x;
            }
            iArr[iArr.length - 1] = i21;
            b(i21);
            if (!this.d0 && iArr[this.b] >= this.B) {
                int i22 = this.O;
                int i23 = this.N;
                if (i22 < i23) {
                    this.O = i23;
                }
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.q0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.e0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.p0 = callbackReturn;
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

    public void setDrawDividers(boolean z4) {
        this.o0 = z4;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.d.setEnabled(z4);
    }

    public void setFormatter(sc0 sc0Var) {
        if (sc0Var == this.H) {
            return;
        }
        this.H = sc0Var;
        f();
        n();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i10) {
        this.r0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.a == i10) {
            return;
        }
        this.a = i10;
        this.b = i10 / 2;
        this.K = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        tc0 tc0Var;
        this.C = true;
        if (this.B == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.B = i10;
        if (i10 < this.D) {
            int i11 = this.E;
            if (i10 >= i11) {
                this.D = i11;
            } else {
                this.D = i10;
            }
        }
        setWrapSelectorWheel(this.e0);
        f();
        n();
        m();
        invalidate();
        if (this.h0 != 0 || (tc0Var = this.G) == null) {
            return;
        }
        tc0Var.m(0);
    }

    public void setMinValue(int i10) {
        tc0 tc0Var;
        this.y = true;
        if (this.x == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.x = i10;
        if (i10 > this.D) {
            int i11 = this.E;
            if (i10 <= i11) {
                this.D = i11;
            } else {
                this.D = i10;
            }
        }
        setWrapSelectorWheel(this.e0);
        f();
        n();
        m();
        invalidate();
        if (this.h0 != 0 || (tc0Var = this.G) == null) {
            return;
        }
        tc0Var.m(0);
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.I = j10;
    }

    public void setOnScrollListener(tc0 tc0Var) {
        this.G = tc0Var;
    }

    public void setOnValueChangedListener(uc0 uc0Var) {
        this.F = uc0Var;
    }

    public void setSelectorColor(int i10) {
        this.f0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.L.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.c = i10;
        invalidate();
    }

    public void setValue(int i10) {
        l(i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r5 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setWrapSelectorWheel(boolean z4) {
        Integer num;
        boolean z10 = true;
        if (!this.C || !this.y || ((num = this.q0) != null && (this.B - this.x) + 1 >= num.intValue())) {
            this.e0 = z4;
        }
        z10 = false;
        this.d0 = z10;
    }

    public wc0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 18, f6Var);
    }

    public wc0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 3;
        this.b = 1;
        this.I = 300L;
        this.J = new SparseArray();
        this.K = new int[this.a];
        this.N = TLObject.FLAG_31;
        this.h0 = 0;
        this.n0 = -1;
        this.o0 = true;
        int dp = AndroidUtilities.dp(i10);
        this.s = dp;
        Paint paint = new Paint();
        this.f0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        this.g0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f = applyDimension;
        int i11 = this.e;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.n = -1;
        this.r = true;
        this.m0 = new vc0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        this.d.setBackgroundResource(0);
        float f10 = dp;
        this.d.setTextSize(0, f10);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.L = paint2;
        this.P = new vm0(getContext(), null);
        this.Q = new vm0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new qc0(this));
    }
}
