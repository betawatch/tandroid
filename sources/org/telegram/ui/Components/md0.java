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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class md0 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public static final ds x0 = new ds(0.0f, 0.5f, 0.5f, 1.0f);
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public kd0 J;
    public jd0 K;
    public id0 L;
    public long M;
    public final SparseArray N;
    public int[] O;
    public final Paint P;
    public int Q;
    public int R;
    public int S;
    public final un0 T;
    public final un0 U;
    public int V;
    public hd0 W;
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
    public final ld0 q0;
    public int r;
    public int r0;
    public final boolean s;
    public final org.telegram.ui.ActionBar.u6 s0;
    public boolean t0;
    public Utilities.CallbackReturn u0;
    public final int v;
    public Integer v0;
    public int w;
    public int w0;
    public String[] x;
    public int y;

    public md0(LaunchActivity launchActivity) {
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
                throw new IllegalArgumentException(ic.a.i(mode, "Unknown measure mode: "));
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
        this.e.setVisibility(4);
        if (!h(this.T)) {
            h(this.U);
        }
        this.V = 0;
        if (z10) {
            this.T.d(-this.Q, 300);
        } else {
            this.T.d(this.Q, 300);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
    }

    public final void b(int i10) {
        String str;
        SparseArray sparseArray = this.N;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.y;
        if (i10 < i11 || i10 > this.F) {
            str = "";
        } else {
            String[] strArr = this.x;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                id0 id0Var = this.L;
                str = id0Var != null ? id0Var.f(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        }
        sparseArray.put(i10, str);
    }

    public final boolean c() {
        int i10 = this.R - this.S;
        if (i10 == 0) {
            return false;
        }
        this.V = 0;
        int abs = Math.abs(i10);
        int i11 = this.Q;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.U.d(i10, 800);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        un0 un0Var = this.T;
        if (un0Var.q) {
            un0Var = this.U;
            if (un0Var.q) {
                return;
            }
        }
        un0Var.b();
        int i10 = un0Var.k;
        if (this.V == 0) {
            this.V = un0Var.c;
        }
        scrollBy(0, i10 - this.V);
        this.V = i10;
        if (!un0Var.q) {
            invalidate();
            return;
        }
        if (un0Var == this.T) {
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
        return ((this.F - this.y) + 1) * this.Q;
    }

    public CharSequence d(int i10) {
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

    public final int e(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        return (!this.G || i10 <= (i14 = this.F) || (i16 = i14 - (i15 = this.y)) == 0) ? (!this.E || i10 >= (i11 = this.y) || (i13 = (i12 = this.F) - i11) == 0) ? i10 : (i12 - ((i11 - i10) % i13)) + 1 : (((i10 - i14) % i16) + i15) - 1;
    }

    public final void f() {
        this.N.clear();
        int[] iArr = this.O;
        int value = getValue();
        for (int i10 = 0; i10 < this.O.length; i10++) {
            int i11 = (i10 - this.c) + value;
            if (this.h0) {
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
        return this.x;
    }

    public int getItemsCount() {
        return this.b;
    }

    public int getMaxValue() {
        return this.F;
    }

    public int getMinValue() {
        return this.y;
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

    public final boolean h(un0 un0Var) {
        un0Var.q = true;
        int i10 = un0Var.e - un0Var.k;
        int i11 = this.R - ((this.S + i10) % this.Q);
        if (i11 == 0) {
            return false;
        }
        int abs = Math.abs(i11);
        int i12 = this.Q;
        if (abs > i12 / 2) {
            i11 = i11 > 0 ? i11 - i12 : i11 + i12;
        }
        scrollBy(0, i10 + i11);
        return true;
    }

    public final void i(int i10) {
        String str;
        if (this.l0 == i10) {
            return;
        }
        this.l0 = i10;
        jd0 jd0Var = this.K;
        if (jd0Var != null) {
            jd0Var.m(i10);
        }
        if (i10 == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.x;
                if (strArr == null) {
                    int i11 = this.H;
                    id0 id0Var = this.L;
                    str = id0Var != null ? id0Var.f(i11) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                } else {
                    str = strArr[this.H - this.y];
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final void j() {
        hd0 hd0Var = this.W;
        if (hd0Var != null) {
            removeCallbacks(hd0Var);
        }
        this.q0.a();
    }

    public final void l(int i10, boolean z10) {
        jd0 jd0Var;
        kd0 kd0Var;
        if (this.H == i10) {
            return;
        }
        int e = this.h0 ? e(i10) : Math.min(Math.max(i10, this.y), this.F);
        int i11 = this.H;
        this.I = e;
        this.H = e;
        n();
        if (Math.abs(i11 - e) > 0.9f) {
            AndroidUtilities.vibrateCursor(this);
        }
        if (z10 && (kd0Var = this.J) != null) {
            kd0Var.q(this, this.H);
        }
        f();
        invalidate();
        if (this.l0 != 0 || (jd0Var = this.K) == null) {
            return;
        }
        jd0Var.m(0);
    }

    public final void m() {
        int i10;
        if (this.s) {
            String[] strArr = this.x;
            Paint paint = this.P;
            int i11 = 0;
            if (strArr == null) {
                float f7 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
                    if (measureText > f7) {
                        f7 = measureText;
                    }
                }
                for (int i13 = this.F; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f7);
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
            TextView textView = this.e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i10;
            if (this.r != paddingRight) {
                int i15 = this.n;
                if (paddingRight > i15) {
                    this.r = paddingRight;
                } else {
                    this.r = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.x;
        if (strArr == null) {
            int i10 = this.H;
            id0 id0Var = this.L;
            str = id0Var != null ? id0Var.f(i10) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
        } else {
            str = strArr[this.H - this.y];
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
        int i10;
        int i11 = this.w0;
        if (i11 == 5) {
            this.P.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i11 == 3) {
            this.P.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.P.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f7 = width + this.d;
        float f10 = this.S;
        int[] iArr = this.O;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String str = (String) this.N.get(iArr[i12]);
            if (str != null && (i12 != this.c || this.e.getVisibility() != 0)) {
                if (this.b > 3) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    float measuredHeight3 = getMeasuredHeight() * 0.5f;
                    float textSize = f10 - (this.P.getTextSize() / 2.0f);
                    if (textSize < measuredHeight2) {
                        measuredHeight = textSize / measuredHeight3;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight3;
                        z10 = false;
                    }
                    float interpolation = x0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.P.getTextSize() * (1.0f - interpolation);
                    if (!z10) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f7, textSize);
                    if (interpolation < 0.1f) {
                        i10 = this.P.getAlpha();
                        this.P.setAlpha((int) ((i10 * interpolation) / 0.1f));
                    } else {
                        i10 = -1;
                    }
                    canvas.drawText(str, f7, f10, this.P);
                    canvas.restore();
                    if (i10 != -1) {
                        this.P.setAlpha(i10);
                    }
                } else {
                    canvas.drawText(str, f7, f10, this.P);
                }
            }
            f10 += this.Q;
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
        float y3 = motionEvent.getY();
        this.a0 = y3;
        this.c0 = y3;
        this.b0 = motionEvent.getEventTime();
        float f7 = this.a0;
        if (f7 < this.m0) {
            if (this.l0 == 0) {
                ld0 ld0Var = this.q0;
                ld0Var.a();
                ld0Var.c = 1;
                ld0Var.b = 2;
                ((md0) ld0Var.d).postDelayed(ld0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f7 > this.n0 && this.l0 == 0) {
            ld0 ld0Var2 = this.q0;
            ld0Var2.a();
            ld0Var2.c = 1;
            ld0Var2.b = 1;
            ((md0) ld0Var2.d).postDelayed(ld0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        un0 un0Var = this.T;
        if (!un0Var.q) {
            un0Var.q = true;
            this.U.q = true;
            i(0);
            return true;
        }
        un0 un0Var2 = this.U;
        if (!un0Var2.q) {
            un0Var.q = true;
            un0Var2.q = true;
            return true;
        }
        float f10 = this.a0;
        if (f10 < this.m0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.W;
            if (runnable == null) {
                this.W = new hd0(this);
            } else {
                removeCallbacks(runnable);
            }
            hd0 hd0Var = this.W;
            hd0Var.a = false;
            postDelayed(hd0Var, longPressTimeout);
            return true;
        }
        if (f10 > this.n0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.W;
            if (runnable2 == null) {
                this.W = new hd0(this);
            } else {
                removeCallbacks(runnable2);
            }
            hd0 hd0Var2 = this.W;
            hd0Var2.a = true;
            postDelayed(hd0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.e.getMeasuredWidth();
        int measuredHeight2 = this.e.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.e.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        if (z10) {
            f();
            int length = this.O.length;
            int i16 = this.v;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / r2.length) + 0.5f);
            this.w = bottom;
            this.Q = bottom + i16;
            int top = (this.e.getTop() + this.e.getBaseline()) - (this.Q * this.c);
            this.R = top;
            this.S = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.m0 = ((getHeight() - i16) - this.w) / 2;
            this.n0 = ((getHeight() + i16) + this.w) / 2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.r), g(i11, this.h));
        setMeasuredDimension(k(this.n, getMeasuredWidth(), i10), k(this.f, getMeasuredHeight(), i11));
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
            float y3 = motionEvent.getY();
            if (this.l0 == 1) {
                scrollBy(0, (int) (y3 - this.c0));
                invalidate();
            } else if (((int) Math.abs(y3 - this.a0)) > this.e0) {
                j();
                i(1);
            }
            this.c0 = y3;
            return true;
        }
        hd0 hd0Var = this.W;
        if (hd0Var != null) {
            removeCallbacks(hd0Var);
        }
        this.q0.a();
        VelocityTracker velocityTracker = this.d0;
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.g0);
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
            int y10 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y10 - this.a0);
            long eventTime = motionEvent.getEventTime() - this.b0;
            if (abs > this.e0 || eventTime >= ViewConfiguration.getTapTimeout()) {
                c();
            } else {
                int i10 = (y10 / this.Q) - this.c;
                if (i10 > 0) {
                    a(true);
                    ld0 ld0Var = this.q0;
                    ld0Var.a();
                    ld0Var.c = 2;
                    ld0Var.b = 1;
                    ((md0) ld0Var.d).post(ld0Var);
                } else if (i10 < 0) {
                    a(false);
                    ld0 ld0Var2 = this.q0;
                    ld0Var2.a();
                    ld0Var2.c = 2;
                    ld0Var2.b = 2;
                    ((md0) ld0Var2.d).post(ld0Var2);
                }
            }
            i(0);
        }
        this.d0.recycle();
        this.d0 = null;
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.O;
        boolean z10 = this.h0;
        if (!z10 && i11 > 0 && iArr[this.c] <= this.y) {
            int i12 = this.S + i11;
            int i13 = this.R;
            if (i12 > i13) {
                this.S = i13;
                return;
            }
        }
        if (!z10 && i11 < 0 && iArr[this.c] >= this.F) {
            int i14 = this.S + i11;
            int i15 = this.R;
            if (i14 < i15) {
                this.S = i15;
                return;
            }
        }
        this.S += i11;
        while (true) {
            int i16 = this.S;
            if (i16 - this.R <= this.w) {
                break;
            }
            this.S = i16 - this.Q;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i17 = iArr[1] - 1;
            if (this.h0 && i17 < this.y) {
                i17 = this.F;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.h0 && iArr[this.c] <= this.y) {
                int i18 = this.S;
                int i19 = this.R;
                if (i18 > i19) {
                    this.S = i19;
                }
            }
        }
        while (true) {
            int i20 = this.S;
            if (i20 - this.R >= (-this.w)) {
                l(iArr[this.c], true);
                return;
            }
            this.S = i20 + this.Q;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i21 = iArr[iArr.length - 2] + 1;
            if (this.h0 && i21 > this.F) {
                i21 = this.y;
            }
            iArr[iArr.length - 1] = i21;
            b(i21);
            if (!this.h0 && iArr[this.c] >= this.F) {
                int i22 = this.S;
                int i23 = this.R;
                if (i22 < i23) {
                    this.S = i23;
                }
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.v0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.i0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.u0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.x == strArr) {
            return;
        }
        this.x = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.t0 = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setEnabled(z10);
    }

    public void setFormatter(id0 id0Var) {
        if (id0Var == this.L) {
            return;
        }
        this.L = id0Var;
        f();
        n();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i10) {
        this.w0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.b == i10) {
            return;
        }
        this.b = i10;
        this.c = i10 / 2;
        this.O = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        jd0 jd0Var;
        this.G = true;
        if (this.F == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.F = i10;
        if (i10 < this.H) {
            int i11 = this.I;
            if (i10 >= i11) {
                this.H = i11;
            } else {
                this.H = i10;
            }
        }
        setWrapSelectorWheel(this.i0);
        f();
        n();
        m();
        invalidate();
        if (this.l0 != 0 || (jd0Var = this.K) == null) {
            return;
        }
        jd0Var.m(0);
    }

    public void setMinValue(int i10) {
        jd0 jd0Var;
        this.E = true;
        if (this.y == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.y = i10;
        if (i10 > this.H) {
            int i11 = this.I;
            if (i10 <= i11) {
                this.H = i11;
            } else {
                this.H = i10;
            }
        }
        setWrapSelectorWheel(this.i0);
        f();
        n();
        m();
        invalidate();
        if (this.l0 != 0 || (jd0Var = this.K) == null) {
            return;
        }
        jd0Var.m(0);
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.M = j10;
    }

    public void setOnScrollListener(jd0 jd0Var) {
        this.K = jd0Var;
    }

    public void setOnValueChangedListener(kd0 kd0Var) {
        this.J = kd0Var;
    }

    public void setSelectorColor(int i10) {
        this.a = true;
        this.j0.setColor(i10);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.ActionBar.f7.r(this.e);
        this.e.setTextColor(i10);
        this.P.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.d = i10;
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
        if (!this.G || !this.E || ((num = this.v0) != null && (this.F - this.y) + 1 >= num.intValue())) {
            this.i0 = z10;
        }
        z11 = false;
        this.h0 = z11;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        Paint paint;
        try {
            if (this.a || (paint = this.j0) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.s0));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public md0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, 18, u6Var);
    }

    public md0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
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
        this.s0 = u6Var;
        int dp = AndroidUtilities.dp(i10);
        this.v = dp;
        Paint paint = new Paint();
        this.j0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
        this.k0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i11 = this.f;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.r = -1;
        this.s = true;
        this.q0 = new ld0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.e = textView;
        textView.setGravity(17);
        this.e.setSingleLine(true);
        org.telegram.ui.ActionBar.f7.V(this.e, org.telegram.ui.ActionBar.y6.j5, u6Var);
        this.e.setBackgroundResource(0);
        float f7 = dp;
        this.e.setTextSize(0, f7);
        this.e.setVisibility(4);
        addView(this.e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.e0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.g0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f7);
        paint2.setTypeface(this.e.getTypeface());
        paint2.setColor(this.e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.P = paint2;
        this.T = new un0(getContext(), null);
        this.U = new un0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new gd0(this));
    }
}
