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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class fc0 extends LinearLayout {
    public static final er r0 = new er(0.0f, 0.5f, 0.5f, 1.0f);
    public int A;
    public boolean B;
    public int C;
    public int D;
    public dc0 E;
    public cc0 F;
    public bc0 G;
    public long H;
    public final SparseArray I;
    public int[] J;
    public final Paint K;
    public int L;
    public int M;
    public int N;
    public final bm0 O;
    public final bm0 P;
    public int Q;
    public ac0 R;
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
    public final ec0 l0;
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

    public fc0(LaunchActivity launchActivity) {
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
                throw new IllegalArgumentException(i0.a.k(mode, "Unknown measure mode: "));
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

    public final void b(int i10) {
        String str;
        SparseArray sparseArray = this.I;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.x;
        if (i10 < i11 || i10 > this.A) {
            str = "";
        } else {
            String[] strArr = this.w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                bc0 bc0Var = this.G;
                str = bc0Var != null ? bc0Var.g(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        }
        sparseArray.put(i10, str);
    }

    public final boolean c() {
        int i10 = this.M - this.N;
        if (i10 == 0) {
            return false;
        }
        this.Q = 0;
        int abs = Math.abs(i10);
        int i11 = this.L;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.P.d(i10, 800);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        bm0 bm0Var = this.O;
        if (bm0Var.q) {
            bm0Var = this.P;
            if (bm0Var.q) {
                return;
            }
        }
        bm0Var.b();
        int i10 = bm0Var.k;
        if (this.Q == 0) {
            this.Q = bm0Var.c;
        }
        scrollBy(0, i10 - this.Q);
        this.Q = i10;
        if (!bm0Var.q) {
            invalidate();
            return;
        }
        if (bm0Var == this.O) {
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

    public CharSequence d(int i10) {
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

    public final int e(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        return (!this.B || i10 <= (i14 = this.A) || (i16 = i14 - (i15 = this.x)) == 0) ? (!this.y || i10 >= (i11 = this.x) || (i13 = (i12 = this.A) - i11) == 0) ? i10 : (i12 - ((i11 - i10) % i13)) + 1 : (((i10 - i14) % i16) + i15) - 1;
    }

    public final void f() {
        this.I.clear();
        int[] iArr = this.J;
        int value = getValue();
        for (int i10 = 0; i10 < this.J.length; i10++) {
            int i11 = (i10 - this.b) + value;
            if (this.c0) {
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

    public final boolean h(bm0 bm0Var) {
        bm0Var.q = true;
        int i10 = bm0Var.e - bm0Var.k;
        int i11 = this.M - ((this.N + i10) % this.L);
        if (i11 == 0) {
            return false;
        }
        int abs = Math.abs(i11);
        int i12 = this.L;
        if (abs > i12 / 2) {
            i11 = i11 > 0 ? i11 - i12 : i11 + i12;
        }
        scrollBy(0, i10 + i11);
        return true;
    }

    public final void i(int i10) {
        String str;
        if (this.g0 == i10) {
            return;
        }
        this.g0 = i10;
        cc0 cc0Var = this.F;
        if (cc0Var != null) {
            cc0Var.j(i10);
        }
        if (i10 == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.w;
                if (strArr == null) {
                    int i11 = this.C;
                    bc0 bc0Var = this.G;
                    str = bc0Var != null ? bc0Var.g(i11) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
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
        ac0 ac0Var = this.R;
        if (ac0Var != null) {
            removeCallbacks(ac0Var);
        }
        this.l0.a();
    }

    public final void l(int i10, boolean z10) {
        cc0 cc0Var;
        dc0 dc0Var;
        if (this.C == i10) {
            return;
        }
        int e9 = this.c0 ? e(i10) : Math.min(Math.max(i10, this.x), this.A);
        int i11 = this.C;
        this.D = e9;
        this.C = e9;
        n();
        if (Math.abs(i11 - e9) > 0.9f) {
            AndroidUtilities.vibrateCursor(this);
        }
        if (z10 && (dc0Var = this.E) != null) {
            dc0Var.m(this, this.C);
        }
        f();
        invalidate();
        if (this.g0 != 0 || (cc0Var = this.F) == null) {
            return;
        }
        cc0Var.j(0);
    }

    public final void m() {
        int i10;
        if (this.r) {
            String[] strArr = this.w;
            Paint paint = this.K;
            int i11 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i13 = this.A; i13 > 0; i13 /= 10) {
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
            int i10 = this.C;
            bc0 bc0Var = this.G;
            str = bc0Var != null ? bc0Var.g(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
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
        int i10;
        int i11 = this.q0;
        if (i11 == 5) {
            this.K.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i11 == 3) {
            this.K.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.K.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.c;
        float f11 = this.N;
        int[] iArr = this.J;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String str = (String) this.I.get(iArr[i12]);
            if (str != null && (i12 != this.b || this.d.getVisibility() != 0)) {
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
                        i10 = this.K.getAlpha();
                        this.K.setAlpha((int) ((i10 * interpolation) / 0.1f));
                    } else {
                        i10 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.K);
                    canvas.restore();
                    if (i10 != -1) {
                        this.K.setAlpha(i10);
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
                ec0 ec0Var = this.l0;
                ec0Var.a();
                ec0Var.c = 1;
                ec0Var.b = 2;
                ((fc0) ec0Var.d).postDelayed(ec0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.i0 && this.g0 == 0) {
            ec0 ec0Var2 = this.l0;
            ec0Var2.a();
            ec0Var2.c = 1;
            ec0Var2.b = 1;
            ((fc0) ec0Var2.d).postDelayed(ec0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        bm0 bm0Var = this.O;
        if (!bm0Var.q) {
            bm0Var.q = true;
            this.P.q = true;
            i(0);
            return true;
        }
        bm0 bm0Var2 = this.P;
        if (!bm0Var2.q) {
            bm0Var.q = true;
            bm0Var2.q = true;
            return true;
        }
        float f11 = this.S;
        if (f11 < this.h0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.R;
            if (runnable == null) {
                this.R = new ac0(this);
            } else {
                removeCallbacks(runnable);
            }
            ac0 ac0Var = this.R;
            ac0Var.a = false;
            postDelayed(ac0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.i0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.R;
            if (runnable2 == null) {
                this.R = new ac0(this);
            } else {
                removeCallbacks(runnable2);
            }
            ac0 ac0Var2 = this.R;
            ac0Var2.a = true;
            postDelayed(ac0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.d.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        if (z10) {
            f();
            int length = this.J.length;
            int i16 = this.s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / r2.length) + 0.5f);
            this.v = bottom;
            this.L = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.L * this.b);
            this.M = top;
            this.N = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.h0 = ((getHeight() - i16) - this.v) / 2;
            this.i0 = ((getHeight() + i16) + this.v) / 2;
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
        ac0 ac0Var = this.R;
        if (ac0Var != null) {
            removeCallbacks(ac0Var);
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
                int i10 = (y11 / this.L) - this.b;
                if (i10 > 0) {
                    a(true);
                    ec0 ec0Var = this.l0;
                    ec0Var.a();
                    ec0Var.c = 2;
                    ec0Var.b = 1;
                    ((fc0) ec0Var.d).post(ec0Var);
                } else if (i10 < 0) {
                    a(false);
                    ec0 ec0Var2 = this.l0;
                    ec0Var2.a();
                    ec0Var2.c = 2;
                    ec0Var2.b = 2;
                    ((fc0) ec0Var2.d).post(ec0Var2);
                }
            }
            i(0);
        }
        this.V.recycle();
        this.V = null;
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.J;
        boolean z10 = this.c0;
        if (!z10 && i11 > 0 && iArr[this.b] <= this.x) {
            int i12 = this.N + i11;
            int i13 = this.M;
            if (i12 > i13) {
                this.N = i13;
                return;
            }
        }
        if (!z10 && i11 < 0 && iArr[this.b] >= this.A) {
            int i14 = this.N + i11;
            int i15 = this.M;
            if (i14 < i15) {
                this.N = i15;
                return;
            }
        }
        this.N += i11;
        while (true) {
            int i16 = this.N;
            if (i16 - this.M <= this.v) {
                break;
            }
            this.N = i16 - this.L;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i17 = iArr[1] - 1;
            if (this.c0 && i17 < this.x) {
                i17 = this.A;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.c0 && iArr[this.b] <= this.x) {
                int i18 = this.N;
                int i19 = this.M;
                if (i18 > i19) {
                    this.N = i19;
                }
            }
        }
        while (true) {
            int i20 = this.N;
            if (i20 - this.M >= (-this.v)) {
                l(iArr[this.b], true);
                return;
            }
            this.N = i20 + this.L;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i21 = iArr[iArr.length - 2] + 1;
            if (this.c0 && i21 > this.A) {
                i21 = this.x;
            }
            iArr[iArr.length - 1] = i21;
            b(i21);
            if (!this.c0 && iArr[this.b] >= this.A) {
                int i22 = this.N;
                int i23 = this.M;
                if (i22 < i23) {
                    this.N = i23;
                }
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.p0 = Integer.valueOf(i10);
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

    public void setFormatter(bc0 bc0Var) {
        if (bc0Var == this.G) {
            return;
        }
        this.G = bc0Var;
        f();
        n();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i10) {
        this.q0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.a == i10) {
            return;
        }
        this.a = i10;
        this.b = i10 / 2;
        this.J = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        cc0 cc0Var;
        this.B = true;
        if (this.A == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.A = i10;
        if (i10 < this.C) {
            int i11 = this.D;
            if (i10 >= i11) {
                this.C = i11;
            } else {
                this.C = i10;
            }
        }
        setWrapSelectorWheel(this.d0);
        f();
        n();
        m();
        invalidate();
        if (this.g0 != 0 || (cc0Var = this.F) == null) {
            return;
        }
        cc0Var.j(0);
    }

    public void setMinValue(int i10) {
        cc0 cc0Var;
        this.y = true;
        if (this.x == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.x = i10;
        if (i10 > this.C) {
            int i11 = this.D;
            if (i10 <= i11) {
                this.C = i11;
            } else {
                this.C = i10;
            }
        }
        setWrapSelectorWheel(this.d0);
        f();
        n();
        m();
        invalidate();
        if (this.g0 != 0 || (cc0Var = this.F) == null) {
            return;
        }
        cc0Var.j(0);
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.H = j10;
    }

    public void setOnScrollListener(cc0 cc0Var) {
        this.F = cc0Var;
    }

    public void setOnValueChangedListener(dc0 dc0Var) {
        this.E = dc0Var;
    }

    public void setSelectorColor(int i10) {
        this.e0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.K.setColor(i10);
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
    public void setWrapSelectorWheel(boolean z10) {
        Integer num;
        boolean z11 = true;
        if (!this.B || !this.y || ((num = this.p0) != null && (this.A - this.x) + 1 >= num.intValue())) {
            this.d0 = z10;
        }
        z11 = false;
        this.c0 = z11;
    }

    public fc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 18, c6Var);
    }

    public fc0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
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
        int dp = AndroidUtilities.dp(i10);
        this.s = dp;
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        this.f0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
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
        this.l0 = new ec0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
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
        this.O = new bm0(getContext(), null);
        this.P = new bm0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new zb0(this));
    }
}
