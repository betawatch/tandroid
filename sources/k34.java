// default package

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class k34 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final lm e;
    public boolean f;
    public final /* synthetic */ l34 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k34(l34 l34Var, Context context) {
        super(context);
        this.h = l34Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new lm(this, 0L, 250L, s33.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{gl.L(10.0f), gl.L(10.0f)}, 0.5f));
        paint.setShadowLayer(gl.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gl.N(2.66f));
        paint3.setShadowLayer(gl.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f, float f2);

    public final void b() {
        l34 l34Var = this.h;
        l29 selectionBounds = l34Var.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(l34Var.getRotation());
    }

    public float getShowAlpha() {
        return this.e.d(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r0 != 3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        double atan2;
        j34 j34Var;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        l34 l34Var = this.h;
        j34 j34Var2 = l34Var.H;
        g34 g34Var = l34Var.K;
        float[] fArr = l34Var.h0;
        float[] fArr2 = l34Var.g0;
        j34Var2.u(rawX, rawY, fArr2);
        boolean z3 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z3) {
            if (Build.VERSION.SDK_INT < 29) {
                z = false;
                float[] fArr3 = l34Var.i0;
                if (z) {
                    fArr3[0] = fArr2[0];
                    fArr3[1] = fArr2[1];
                } else {
                    fArr3[0] = (fArr2[0] + fArr[0]) / 2.0f;
                    fArr3[1] = (fArr2[1] + fArr[1]) / 2.0f;
                }
                if (l34Var.e0 != z) {
                    l34Var.b = fArr2[0];
                    l34Var.c = fArr2[1];
                    l34Var.d = fArr[0];
                    l34Var.e = fArr[1];
                    l34Var.f = fArr3[0];
                    l34Var.h = fArr3[1];
                    this.f = !z;
                    invalidate();
                }
                l34Var.e0 = z;
                float[] fArr4 = l34Var.i0;
                float f = fArr4[0];
                float f2 = fArr4[1];
                if (actionMasked == 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i = this.d;
                            if (i == 3) {
                                float[] fArr5 = l34Var.g0;
                                float f3 = fArr5[0];
                                float f4 = fArr5[1];
                                float[] fArr6 = l34Var.h0;
                                z2 = l34Var.c(f3, f4, fArr6[0], fArr6[1], z);
                            } else if (i != 0) {
                                float f5 = f - l34Var.b;
                                float f6 = f2 - l34Var.c;
                                if (l34Var.w || Math.abs(f5) > gl.L(2.0f) || Math.abs(f6) > gl.L(2.0f)) {
                                    if (!l34Var.w && (j34Var = l34Var.H) != null) {
                                        j34Var.x();
                                    }
                                    l34Var.w = true;
                                    gl.r(g34Var);
                                    int[] v = l34Var.H.v(l34Var);
                                    float a = loe.a(v[0], v[1], l34Var.b, l34Var.c);
                                    float a2 = loe.a(v[0], v[1], f, f2);
                                    float f7 = 0.0f;
                                    if (a > 0.0f) {
                                        l34Var.j(a2 / a);
                                    }
                                    int i2 = this.d;
                                    if (i2 == 1) {
                                        atan2 = Math.atan2(v[1] - f2, v[0] - f);
                                    } else {
                                        if (i2 == 2) {
                                            atan2 = Math.atan2(f2 - v[1], f - v[0]);
                                        }
                                        l34Var.f((float) Math.toDegrees(f7));
                                        l34Var.b = f;
                                        l34Var.c = f2;
                                    }
                                    f7 = (float) atan2;
                                    l34Var.f((float) Math.toDegrees(f7));
                                    l34Var.b = f;
                                    l34Var.c = f2;
                                }
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    l34Var.d(actionMasked == 3);
                    this.d = 0;
                    this.f = true;
                    invalidate();
                    z2 = true;
                } else {
                    l34Var.f0 = false;
                    int a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != 0) {
                        this.d = a3;
                        l34Var.b = fArr2[0];
                        l34Var.c = fArr2[1];
                        l34Var.f = f;
                        l34Var.h = f2;
                        l34Var.r = false;
                        l34Var.s = true;
                        if (getParent() instanceof e34) {
                            ((e34) getParent()).invalidate();
                        }
                        if (a3 == 3 && (l34Var instanceof e09)) {
                            gl.e3(g34Var, ViewConfiguration.getLongPressTimeout());
                        }
                        z2 = true;
                    }
                    z2 = false;
                }
                l34Var.f0 = z;
                return !super.onTouchEvent(motionEvent) || z2;
            }
            l34Var.H.u(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr);
        }
        z = z3;
        float[] fArr32 = l34Var.i0;
        if (z) {
        }
        if (l34Var.e0 != z) {
        }
        l34Var.e0 = z;
        float[] fArr42 = l34Var.i0;
        float f8 = fArr42[0];
        float f22 = fArr42[1];
        if (actionMasked == 0) {
        }
        l34Var.f0 = z;
        if (super.onTouchEvent(motionEvent)) {
        }
    }
}
