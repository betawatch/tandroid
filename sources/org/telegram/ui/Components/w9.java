package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w9 {
    public final s9 a;
    public final View b;
    public final ColorMatrix c;
    public final boolean d;
    public boolean e;
    public float f;
    public Paint g;
    public Paint h;
    public final int i;
    public final Integer j;
    public final Path k;
    public int l;
    public int m;
    public Bitmap n;
    public BitmapShader o;
    public final Matrix p;
    public final RectF q;
    public boolean r;
    public Paint[] s;
    public ValueAnimator t;
    public final int[] u;
    public final int[] v;

    public w9(s9 s9Var, View view) {
        this(s9Var, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        s9 s9Var = this.a;
        if (!s9Var.c() || Build.VERSION.SDK_INT < 31) {
            Paint c10 = c(1.0f);
            if (c10 != null) {
                canvas.drawPaint(c10);
                return;
            }
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        Integer num = this.j;
        if (!isHardwareAccelerated) {
            canvas.drawColor(num != null ? num.intValue() : s9Var.i);
            return;
        }
        RenderNode renderNode = (RenderNode) s9Var.l;
        if (!renderNode.hasDisplayList()) {
            RenderNode renderNode2 = (RenderNode) s9Var.k;
            renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
            RecordingCanvas beginRecording = renderNode.beginRecording();
            beginRecording.drawColor(num != null ? num.intValue() : s9Var.i);
            beginRecording.drawRenderNode(renderNode2);
            renderNode.endRecording();
        }
        if (!renderNode.hasDisplayList()) {
            canvas.drawColor(num != null ? num.intValue() : s9Var.i);
            return;
        }
        canvas.drawColor(num != null ? num.intValue() : s9Var.i);
        f(renderNode.getWidth(), renderNode.getHeight(), true);
        if (renderNode.hasDisplayList()) {
            Matrix matrix = this.p;
            matrix.postTranslate(-0.0f, -0.0f);
            this.h.setAlpha((int) 255.0f);
            canvas.saveLayer(null, this.h);
            canvas.concat(matrix);
            if (z10) {
                int i10 = this.l;
                int width = renderNode.getWidth();
                Path path = this.k;
                if (i10 != width || this.m != renderNode.getHeight()) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.i0.P;
                    int width2 = renderNode.getWidth();
                    this.l = width2;
                    int height = renderNode.getHeight();
                    this.m = height;
                    rectF.set(0.0f, 0.0f, width2, height);
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                }
                canvas.clipPath(path);
            }
            canvas.drawRenderNode(renderNode);
            canvas.restore();
        }
    }

    public final Paint c(float f7) {
        Bitmap b10;
        Bitmap bitmap;
        s9 s9Var = this.a;
        if (s9Var == null || (b10 = s9Var.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.o;
        if (bitmapShader == null || this.n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.g;
                this.g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                this.f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 6));
                this.t.start();
            }
            this.n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f7 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint c10 = c(1.0f);
        boolean z10 = this.e;
        Paint paint = z10 ? this.g : null;
        if (c10 != null && z10) {
            c10.setAlpha((int) org.telegram.messenger.m5.A(1.0f, this.f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.s == null) {
            this.s = new Paint[2];
        }
        Paint[] paintArr = this.s;
        paintArr[0] = paint;
        paintArr[1] = c10;
        return paintArr;
    }

    public final void e(float f7, float f10, float f11, float f12) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = this.q;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        Bitmap b10 = this.a.b();
        if (b10 == null) {
            return;
        }
        if (this.o == null || this.n != b10) {
            this.n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
            this.o = bitmapShader;
            this.h.setShader(bitmapShader);
        }
        float width = rectF2.width() / this.n.getWidth();
        float height = rectF2.height() / this.n.getHeight();
        Matrix matrix = this.p;
        matrix.reset();
        matrix.postTranslate(rectF2.left, rectF2.top);
        matrix.preScale(width, height);
        this.o.setLocalMatrix(matrix);
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        Matrix matrix = this.p;
        matrix.reset();
        s9 s9Var = this.a;
        View view2 = s9Var != null ? z10 ? s9Var.j : s9Var.b : null;
        if (s9Var != null) {
            ArrayList arrayList = s9Var.c;
            View view3 = this.b;
            do {
                matrix.preScale(1.0f / view3.getScaleX(), 1.0f / view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                matrix.preRotate(-view3.getRotation(), view3.getPivotX(), view3.getPivotY());
                matrix.preTranslate(-view3.getX(), -view3.getY());
                if (!(view3.getParent() instanceof View) || (view3 = (View) view3.getParent()) == null) {
                    break;
                }
            } while (!arrayList.contains(view3));
            if (view2 != view3) {
                int indexOf = arrayList.indexOf(view3) + 1;
                if (indexOf == 0 && (view = (View) arrayList.get(indexOf)) != null) {
                    view3.getLocationOnScreen(this.u);
                    view.getLocationOnScreen(this.v);
                    matrix.preTranslate(r2[0] - r6[0], r2[1] - r6[1]);
                }
                while (indexOf >= 0 && indexOf < arrayList.size()) {
                    View view4 = (View) arrayList.get(indexOf);
                    if (view4 != null) {
                        matrix.preScale(view4.getScaleX(), view4.getScaleY(), view4.getPivotX(), view4.getPivotY());
                        matrix.preRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                        matrix.preTranslate(view4.getX(), view4.getY());
                        indexOf++;
                    }
                }
            }
        }
        if (view2 != null) {
            matrix.preScale(view2.getWidth() / i10, view2.getHeight() / i11);
        }
    }

    public w9(s9 s9Var, View view, int i10, boolean z10) {
        this.g = new Paint(3);
        this.h = new Paint(3);
        this.k = new Path();
        this.p = new Matrix();
        this.q = new RectF();
        this.r = false;
        this.u = new int[2];
        this.v = new int[2];
        this.a = s9Var;
        this.b = view;
        this.i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.c = colorMatrix;
        if (i10 == 0) {
            org.telegram.messenger.i0.i(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.g.setXfermode(new PorterDuffXfermode(mode));
            org.telegram.messenger.i0.i(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.g.setXfermode(new PorterDuffXfermode(mode2));
            org.telegram.messenger.i0.h(colorMatrix, 0.4f);
            org.telegram.messenger.i0.i(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            org.telegram.messenger.i0.i(colorMatrix, 0.35f);
            org.telegram.messenger.i0.h(colorMatrix, 0.7f);
            org.telegram.messenger.i0.n2(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            org.telegram.messenger.i0.i(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.j = -10329502;
            org.telegram.messenger.i0.i(colorMatrix, 0.6f);
            org.telegram.messenger.i0.h(colorMatrix, 0.3f);
            org.telegram.messenger.i0.n2(colorMatrix, 1.2f);
        } else if (i10 == 6) {
            org.telegram.messenger.i0.i(colorMatrix, 0.4f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.35f);
        } else if (i10 == 7) {
            org.telegram.messenger.i0.i(colorMatrix, 0.5f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.95f);
        } else if (i10 == 8) {
            org.telegram.messenger.i0.h(colorMatrix, -0.15f);
            org.telegram.messenger.i0.i(colorMatrix, 0.47f);
        } else if (i10 == 9) {
            Paint paint3 = this.h;
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode3));
            this.g.setXfermode(new PorterDuffXfermode(mode3));
            org.telegram.messenger.i0.h(colorMatrix, 0.4f);
            org.telegram.messenger.i0.i(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.i0.n2(colorMatrix, this.r ? 0.97f : 0.92f);
            org.telegram.messenger.i0.h(colorMatrix, this.r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && s9Var != null) {
            s9Var.d.add(this);
        }
        view.addOnAttachStateChangeListener(new u9(0, this, s9Var));
    }
}
