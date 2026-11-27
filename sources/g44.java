// default package

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class g44 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final mm e;
    public boolean f;
    public final /* synthetic */ h44 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g44(h44 h44Var, Context context) {
        super(context);
        this.h = h44Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new mm(this, 0L, 250L, k43.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{hl.L(10.0f), hl.L(10.0f)}, 0.5f));
        paint.setShadowLayer(hl.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(hl.N(2.66f));
        paint3.setShadowLayer(hl.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f, float f2);

    public final void b() {
        h44 h44Var = this.h;
        a69 selectionBounds = h44Var.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(h44Var.getRotation());
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
        f44 f44Var;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        h44 h44Var = this.h;
        f44 f44Var2 = h44Var.H;
        c44 c44Var = h44Var.K;
        float[] fArr = h44Var.h0;
        float[] fArr2 = h44Var.g0;
        f44Var2.u(rawX, rawY, fArr2);
        boolean z3 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z3) {
            if (Build.VERSION.SDK_INT < 29) {
                z = false;
                float[] fArr3 = h44Var.i0;
                if (z) {
                    fArr3[0] = fArr2[0];
                    fArr3[1] = fArr2[1];
                } else {
                    fArr3[0] = (fArr2[0] + fArr[0]) / 2.0f;
                    fArr3[1] = (fArr2[1] + fArr[1]) / 2.0f;
                }
                if (h44Var.e0 != z) {
                    h44Var.b = fArr2[0];
                    h44Var.c = fArr2[1];
                    h44Var.d = fArr[0];
                    h44Var.e = fArr[1];
                    h44Var.f = fArr3[0];
                    h44Var.h = fArr3[1];
                    this.f = !z;
                    invalidate();
                }
                h44Var.e0 = z;
                float[] fArr4 = h44Var.i0;
                float f = fArr4[0];
                float f2 = fArr4[1];
                if (actionMasked == 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i = this.d;
                            if (i == 3) {
                                float[] fArr5 = h44Var.g0;
                                float f3 = fArr5[0];
                                float f4 = fArr5[1];
                                float[] fArr6 = h44Var.h0;
                                z2 = h44Var.c(f3, f4, fArr6[0], fArr6[1], z);
                            } else if (i != 0) {
                                float f5 = f - h44Var.b;
                                float f6 = f2 - h44Var.c;
                                if (h44Var.w || Math.abs(f5) > hl.L(2.0f) || Math.abs(f6) > hl.L(2.0f)) {
                                    if (!h44Var.w && (f44Var = h44Var.H) != null) {
                                        f44Var.x();
                                    }
                                    h44Var.w = true;
                                    hl.r(c44Var);
                                    int[] v = h44Var.H.v(h44Var);
                                    float a = dte.a(v[0], v[1], h44Var.b, h44Var.c);
                                    float a2 = dte.a(v[0], v[1], f, f2);
                                    float f7 = 0.0f;
                                    if (a > 0.0f) {
                                        h44Var.j(a2 / a);
                                    }
                                    int i2 = this.d;
                                    if (i2 == 1) {
                                        atan2 = Math.atan2(v[1] - f2, v[0] - f);
                                    } else {
                                        if (i2 == 2) {
                                            atan2 = Math.atan2(f2 - v[1], f - v[0]);
                                        }
                                        h44Var.f((float) Math.toDegrees(f7));
                                        h44Var.b = f;
                                        h44Var.c = f2;
                                    }
                                    f7 = (float) atan2;
                                    h44Var.f((float) Math.toDegrees(f7));
                                    h44Var.b = f;
                                    h44Var.c = f2;
                                }
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    h44Var.d(actionMasked == 3);
                    this.d = 0;
                    this.f = true;
                    invalidate();
                    z2 = true;
                } else {
                    h44Var.f0 = false;
                    int a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != 0) {
                        this.d = a3;
                        h44Var.b = fArr2[0];
                        h44Var.c = fArr2[1];
                        h44Var.f = f;
                        h44Var.h = f2;
                        h44Var.r = false;
                        h44Var.s = true;
                        if (getParent() instanceof a44) {
                            ((a44) getParent()).invalidate();
                        }
                        if (a3 == 3 && (h44Var instanceof s39)) {
                            hl.d3(c44Var, ViewConfiguration.getLongPressTimeout());
                        }
                        z2 = true;
                    }
                    z2 = false;
                }
                h44Var.f0 = z;
                return !super.onTouchEvent(motionEvent) || z2;
            }
            h44Var.H.u(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr);
        }
        z = z3;
        float[] fArr32 = h44Var.i0;
        if (z) {
        }
        if (h44Var.e0 != z) {
        }
        h44Var.e0 = z;
        float[] fArr42 = h44Var.i0;
        float f8 = fArr42[0];
        float f22 = fArr42[1];
        if (actionMasked == 0) {
        }
        h44Var.f0 = z;
        if (super.onTouchEvent(motionEvent)) {
        }
    }
}
