// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class nw0 extends cja implements wx0 {
    public final Paint m0;
    public boolean n0;
    public final RectF o0;
    public final Path p0;
    public final /* synthetic */ ow0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.q0 = ow0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.m0 = new Paint(1);
        this.o0 = new RectF();
        this.p0 = new Path();
    }

    @Override // cja, tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.t8));
        hashSet.add(Integer.valueOf(bkb.F8));
        hashSet.add(Integer.valueOf(bkb.D8));
        hashSet.add(Integer.valueOf(bkb.E8));
        hashSet.add(Integer.valueOf(bkb.H5));
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Paint paint;
        ow0 ow0Var = this.q0;
        yv7 yv7Var = ow0Var.u0;
        Rect rect = ow0Var.n;
        Rect rect2 = ow0Var.h;
        if (this.n0) {
            return;
        }
        int visibility = yv7Var.getVisibility();
        Paint paint2 = this.m0;
        if (visibility != 0) {
            float f = ow0Var.h0;
            if (f < 1.0f && f > 0.0f) {
                paint2.setColor(bkb.p1(ow0Var.S0, ow0Var.T));
                int i = rect2.left;
                if (i > 0) {
                    canvas.drawRect(0.0f, 0.0f, i, getHeight(), paint2);
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), rect2.top, paint2);
                }
                if (rect2.bottom > 0) {
                    canvas.drawRect(0.0f, getHeight() - rect2.bottom, getWidth(), getHeight(), paint2);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(getWidth() - rect2.right, 0.0f, getWidth(), getHeight(), paint2);
                }
            }
        }
        if (ow0Var.w == null || gl.O1()) {
            z = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - ow0Var.h0) * rect.left, 0.0f);
            gl2 gl2Var = ow0Var.w;
            int U1 = gl.U1(ow0Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            gl2Var.m(canvas, true, false, U1, 1.0f - ow0Var.h0);
            canvas.translate((1.0f - ow0Var.h0) * (-rect.left), 0.0f);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
        if (yv7Var.getVisibility() != 0) {
            paint2.setColor(bkb.p1(ow0Var.S0, ow0Var.T));
            int i2 = rect2.left;
            if (i2 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - ow0Var.h0) * i2, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - ow0Var.h0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f2 = rect2.bottom;
                kw0 kw0Var = ow0Var.n0;
                canvas.drawRect(0.0f, height - (f2 * ((kw0Var == null || kw0Var.getTotalHeight() <= 0) ? 1.0f - ow0Var.h0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(ls6.B(1.0f, ow0Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ow0 ow0Var = this.q0;
        Rect rect = ow0Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        qx0 O = launchActivity != null ? launchActivity.O() : null;
        if (O != null && rect != null) {
            int i = (int) ((1.0f - ow0Var.h0) * ((int) O.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i && motionEvent.getY() <= getHeight() - rect.bottom && !gl.O1()) {
                return O.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ow0 ow0Var = this.q0;
        Rect rect = ow0Var.n;
        Paint paint = ow0Var.P;
        lw0 lw0Var = ow0Var.Y;
        Drawable drawable = ow0Var.a0;
        if (this.n0) {
            return;
        }
        super.draw(canvas);
        float f = gl.O1() ? 0.0f : ow0Var.c;
        paint.setColor(ow0Var.a);
        paint.setAlpha((int) ((1.0f - ow0Var.h0) * (1.0f - (Math.min(0.5f, f) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f2 = 1.0f - f;
        boolean O1 = gl.O1();
        fw0 fw0Var = ow0Var.x;
        float R1 = O1 ? gl.R1(fw0Var.getTranslationY() + gl.L(12.0f), gl.m / 2.0f, ow0Var.c) : gl.R1(fw0Var.getTranslationY(), (a.getCurrentActionBarHeight() / 2.0f) + gl.m, f) + gl.L(12.0f);
        canvas.scale(f2, f2, getWidth() / 2.0f, R1);
        canvas.drawLine((getWidth() / 2.0f) - gl.L(16.0f), R1, (getWidth() / 2.0f) + gl.L(16.0f), R1, paint);
        canvas.restore();
        drawable.setAlpha((int) (lw0Var.getAlpha() * 255.0f));
        float translationY = lw0Var.getTranslationY() + lw0Var.getY() + lw0Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        ow0 ow0Var = this.q0;
        if (view != ow0Var.x || !ow0Var.j0 || ow0Var.l0 <= 0 || ow0Var.k0 <= 0) {
            z = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + gl.U1(ow0Var.i0, ow0Var.k0, view.getWidth()), view.getY() + gl.U1(ow0Var.i0, ow0Var.l0, view.getHeight()));
            z = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // wx0
    public RectF getRect() {
        fw0 fw0Var = this.q0.x;
        float left = fw0Var.getLeft();
        float translationY = fw0Var.getTranslationY() + gl.L(24.0f);
        float right = fw0Var.getRight();
        float height = getHeight();
        RectF rectF = this.o0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new oy((byte) 2));
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ow0 ow0Var = this.q0;
        Paint paint = ow0Var.V;
        Paint paint2 = ow0Var.R;
        fw0 fw0Var = ow0Var.x;
        if (this.n0) {
            return;
        }
        super.onDraw(canvas);
        if (ow0Var.u0.getVisibility() != 0) {
            canvas.save();
            gl2 gl2Var = ow0Var.w;
            if (gl2Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                gl2Var.m(canvas2, false, false, width, 1.0f - ow0Var.h0);
            } else {
                canvas2 = canvas;
            }
            if (!ow0Var.X) {
                int v0 = bkb.v0(bkb.c6, ow0Var.G);
                paint2.setColor(v0);
                ow0Var.E.setFlickerViewColor(v0);
                cw cwVar = ow0Var.Z0;
                if (cwVar != null) {
                    cwVar.b(gl.B(paint2.getColor()) <= 0.721f, false);
                    ow0Var.Z0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, ow0Var.Q);
            qx0 qx0Var = ow0Var.s;
            int i = qx0Var != null ? (int) qx0Var.H : 0;
            paint.setColor(ow0Var.S);
            float L = gl.L(16.0f) * (gl.O1() ? 1.0f : 1.0f - ow0Var.c);
            rectF.set(gl.U1(ow0Var.h0, fw0Var.getLeft(), 0), gl.R1(fw0Var.getTranslationY(), 0.0f, ow0Var.c), fw0Var.getRight(), fw0Var.getTranslationY() + gl.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(gl.U1(ow0Var.h0, fw0Var.getLeft(), 0), fw0Var.getTranslationY() + gl.L(24.0f), gl.U1(ow0Var.h0, fw0Var.getRight(), getWidth()), getHeight() - i);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ow0 ow0Var = this.q0;
        fw0 fw0Var = ow0Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > gl.R1(fw0Var.getTranslationY() + gl.L(24.0f), 0.0f, ow0Var.c) && motionEvent.getX() <= fw0Var.getRight() && motionEvent.getX() >= fw0Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        ow0Var.m(true);
        return true;
    }

    @Override // wx0
    public void setDrawingFromOverlay(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            invalidate();
            ow0 ow0Var = this.q0;
            ow0Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || !ow0Var.f0) {
                return;
            }
            launchActivity.D0(ow0Var.T);
        }
    }

    @Override // cja, tjb
    public final void updateColors() {
        int v0;
        ow0 ow0Var = this.q0;
        Paint paint = ow0Var.R;
        nw0 nw0Var = ow0Var.f;
        lw0 lw0Var = ow0Var.Y;
        wjb wjbVar = ow0Var.G;
        if (lw0Var == null || nw0Var == null) {
            return;
        }
        try {
            if (ow0Var.E == null || paint == null) {
                return;
            }
            if (!ow0Var.W) {
                int i = ow0Var.w0;
                if (i < 0) {
                    i = bkb.c6;
                }
                int v02 = bkb.v0(i, wjbVar);
                int i2 = ow0Var.S;
                if (v02 != i2) {
                    ow0Var.S = v02;
                    if ((lw0Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) lw0Var.getBackground()).getColor() == i2) {
                        lw0Var.setBackgroundColor(ow0Var.S);
                    }
                }
            }
            if (ow0Var.J0 && ow0Var.n0 != null && (v0 = bkb.v0(bkb.Z6, wjbVar)) != ow0Var.T) {
                ow0Var.D(v0, false);
                ow0Var.J0 = true;
            }
            if (ow0Var.a == ow0Var.b) {
                int w0 = bkb.w0(null, bkb.yj, false);
                ow0Var.b = w0;
                ow0Var.a = w0;
            }
            int color = paint.getColor();
            if (!ow0Var.W) {
                color = (((((((((((color * 31) + bkb.v0(bkb.F6, wjbVar)) * 31) + bkb.v0(bkb.t8, wjbVar)) * 31) + bkb.v0(bkb.F8, wjbVar)) * 31) + bkb.v0(bkb.D8, wjbVar)) * 31) + bkb.v0(bkb.E8, wjbVar)) * 31) + bkb.v0(bkb.H5, wjbVar);
            }
            if (!ow0Var.K0 || color != ow0Var.L0) {
                ow0Var.K0 = true;
                ow0Var.L0 = color;
                ow0Var.F();
            }
            ow0Var.J();
            nw0Var.invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // wx0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        ow0 ow0Var = this.q0;
        fw0 fw0Var = ow0Var.x;
        float left = fw0Var.getLeft();
        float translationY = fw0Var.getTranslationY() + gl.L(24.0f);
        float right = fw0Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.o0;
        rectF3.set(left, translationY, right, height);
        gl.a2(rectF3, rectF, f, rectF2);
        canvas.save();
        Path path = this.p0;
        path.rewind();
        float R1 = gl.R1(gl.L(16.0f) * (gl.O1() ? 1.0f : 1.0f - ow0Var.c), gl.L(18.0f), f);
        path.addRoundRect(rectF2, R1, R1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(ow0Var.R);
        if (fw0Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f * gl.L(51.0f)) + Math.max(fw0Var.getY(), rectF2.top));
            fw0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return R1;
    }
}
