package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ClippingImageView extends View {
    public static final float[] R = new float[8];
    public final int[] E;
    public BitmapShader F;
    public final Paint G;
    public final RectF H;
    public final RectF I;
    public final Matrix J;
    public final Path K;
    public boolean L;
    public float M;
    public boolean N;
    public float[][] O;
    public float P;
    public float Q;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final RectF r;
    public final Paint s;
    public jn5 w;
    public final Matrix x;
    public boolean y;

    public ClippingImageView(Context context) {
        super(context);
        this.E = new int[4];
        this.K = new Path();
        Paint paint = new Paint(2);
        this.s = paint;
        paint.setFilterBitmap(true);
        this.x = new Matrix();
        this.r = new RectF();
        this.I = new RectF();
        this.G = new Paint(3);
        this.H = new RectF();
        this.J = new Matrix();
    }

    public float getAnimationProgress() {
        return this.M;
    }

    public Bitmap getBitmap() {
        jn5 jn5Var = this.w;
        if (jn5Var != null) {
            return jn5Var.c;
        }
        return null;
    }

    public jn5 getBitmapHolder() {
        return this.w;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        return (getScaleX() * (((getWidth() - (this.c / scaleY)) + (this.b / scaleY)) / 2.0f)) + getTranslationX();
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        return (getScaleY() * (((getHeight() - (this.a / scaleY)) + (this.d / scaleY)) / 2.0f)) + getTranslationY();
    }

    public int getClipBottom() {
        return this.a;
    }

    public int getClipHorizontal() {
        return this.c;
    }

    public int getClipLeft() {
        return this.b;
    }

    public int getClipRight() {
        return this.c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.e;
    }

    public int[] getRadius() {
        return this.E;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return super.getTranslationY() - this.P;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jn5 jn5Var;
        Bitmap bitmap;
        float height;
        float width;
        float height2;
        boolean z;
        float[] fArr;
        if (getVisibility() != 0 || (jn5Var = this.w) == null || (bitmap = jn5Var.c) == null || bitmap.isRecycled()) {
            return;
        }
        float scaleY = getScaleY();
        canvas.save();
        boolean z2 = this.y;
        RectF rectF = this.I;
        if (z2) {
            Matrix matrix = this.J;
            matrix.reset();
            RectF rectF2 = this.H;
            rectF2.set(this.n / scaleY, this.h / scaleY, getWidth() - (this.n / scaleY), getHeight() - (this.h / scaleY));
            Bitmap bitmap2 = this.w.c;
            int i = 0;
            rectF.set(0.0f, 0.0f, bitmap2 != null ? bitmap2.getWidth() : 0, this.w.c != null ? r14.getHeight() : 0);
            int i2 = this.e;
            int i3 = this.f;
            Typeface typeface = gm.a;
            if (i2 == 90 || i2 == 270) {
                height = rectF2.height() / rectF.width();
                width = rectF2.width();
                height2 = rectF.height();
            } else {
                height = rectF2.width() / rectF.width();
                width = rectF2.height();
                height2 = rectF.height();
            }
            float f = width / height2;
            if (height < f) {
                height = f;
                z = true;
            } else {
                z = false;
            }
            if (i2 == 90) {
                matrix.preRotate(90.0f);
                if (i3 == 1) {
                    matrix.preScale(-1.0f, 1.0f);
                } else if (i3 == 2) {
                    matrix.preScale(1.0f, -1.0f);
                }
                matrix.preTranslate(0.0f, -rectF2.width());
            } else if (i2 == 180) {
                matrix.preRotate(180.0f);
                if (i3 == 1) {
                    matrix.preScale(-1.0f, 1.0f);
                } else if (i3 == 2) {
                    matrix.preScale(1.0f, -1.0f);
                }
                matrix.preTranslate(-rectF2.width(), -rectF2.height());
            } else if (i2 == 270) {
                matrix.preRotate(270.0f);
                if (i3 == 1) {
                    matrix.preScale(-1.0f, 1.0f);
                } else if (i3 == 2) {
                    matrix.preScale(1.0f, -1.0f);
                }
                matrix.preTranslate(-rectF2.height(), 0.0f);
            }
            if (z) {
                rectF2.width();
                rectF.width();
            } else {
                rectF2.height();
                rectF.height();
            }
            matrix.preScale(height, height);
            this.F.setLocalMatrix(matrix);
            canvas.clipRect(this.b / scaleY, this.d / scaleY, getWidth() - (this.c / scaleY), getHeight() - (this.a / scaleY));
            while (true) {
                int[] iArr = this.E;
                int length = iArr.length;
                fArr = R;
                if (i >= length) {
                    break;
                }
                int i4 = i << 1;
                float f2 = iArr[i];
                fArr[i4] = f2;
                fArr[i4 + 1] = f2;
                i++;
            }
            Path path = this.K;
            path.reset();
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            path.close();
            canvas.drawPath(path, this.G);
        } else {
            int i5 = this.e;
            RectF rectF3 = this.r;
            Matrix matrix2 = this.x;
            if (i5 == 90 || i5 == 270) {
                rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i6 = this.f;
                if (i6 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i6 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.e, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else if (i5 == 180) {
                rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i7 = this.f;
                if (i7 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i7 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.e, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else {
                rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                int i8 = this.f;
                if (i8 == 1) {
                    matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                } else if (i8 == 2) {
                    matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                }
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
            }
            canvas.clipRect(this.b / scaleY, this.d / scaleY, getWidth() - (this.c / scaleY), getHeight() - (this.a / scaleY));
            try {
                canvas.drawBitmap(this.w.c, matrix2, this.s);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        canvas.restore();
    }

    public void setAdditionalTranslationX(float f) {
        this.Q = f;
    }

    public void setAdditionalTranslationY(float f) {
        this.P = f;
    }

    public void setAnimationProgress(float f) {
        float[][] fArr;
        this.M = f;
        float[][] fArr2 = this.O;
        float f2 = fArr2[0][0];
        setScaleX(((fArr2[1][0] - f2) * f) + f2);
        float[][] fArr3 = this.O;
        float f3 = fArr3[0][1];
        setScaleY(((fArr3[1][1] - f3) * this.M) + f3);
        float[][] fArr4 = this.O;
        float f4 = fArr4[0][2];
        float f5 = this.Q;
        setTranslationX(((((fArr4[1][2] + f5) - f4) - f5) * this.M) + f4 + f5);
        float[][] fArr5 = this.O;
        float f6 = fArr5[0][3];
        setTranslationY(((fArr5[1][3] - f6) * this.M) + f6);
        float[][] fArr6 = this.O;
        float f7 = fArr6[0][4];
        setClipHorizontal((int) (((fArr6[1][4] - f7) * this.M) + f7));
        float[][] fArr7 = this.O;
        float f8 = fArr7[0][5];
        setClipTop((int) (((fArr7[1][5] - f8) * this.M) + f8));
        float[][] fArr8 = this.O;
        float f9 = fArr8[0][6];
        setClipBottom((int) (((fArr8[1][6] - f9) * this.M) + f9));
        int i = 0;
        while (true) {
            int[] iArr = this.E;
            int length = iArr.length;
            fArr = this.O;
            if (i >= length) {
                break;
            }
            int i2 = i + 7;
            float f10 = fArr[0][i2];
            iArr[i] = (int) (((fArr[1][i2] - f10) * this.M) + f10);
            setRadius(iArr);
            i++;
        }
        float[] fArr9 = fArr[0];
        if (fArr9.length > 11) {
            float f11 = fArr9[11];
            setImageY((int) (((fArr[1][11] - f11) * this.M) + f11));
            float[][] fArr10 = this.O;
            float f12 = fArr10[0][12];
            setImageX((int) (((fArr10[1][12] - f12) * this.M) + f12));
        }
        if (this.N) {
            if (!this.L) {
                f = 1.0f - f;
            }
            setAlpha(f);
        }
        invalidate();
    }

    public void setClipBottom(int i) {
        this.a = i;
        invalidate();
    }

    public void setClipHorizontal(int i) {
        this.c = i;
        this.b = i;
        invalidate();
    }

    public void setClipLeft(int i) {
        this.b = i;
        invalidate();
    }

    public void setClipRight(int i) {
        this.c = i;
        invalidate();
    }

    public void setClipTop(int i) {
        this.d = i;
        invalidate();
    }

    public void setClipVertical(int i) {
        this.a = i;
        this.d = i;
        invalidate();
    }

    public void setImageBitmap(jn5 jn5Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        jn5 jn5Var2 = this.w;
        if (jn5Var2 != null) {
            jn5Var2.a();
            this.F = null;
        }
        if (jn5Var != null && ((bitmap2 = jn5Var.c) == null || bitmap2.isRecycled())) {
            jn5Var = null;
        }
        this.w = jn5Var;
        if (jn5Var != null && (bitmap = jn5Var.c) != null) {
            this.I.set(0.0f, 0.0f, bitmap != null ? bitmap.getWidth() : 0, jn5Var.c != null ? r4.getHeight() : 0);
            Bitmap bitmap3 = this.w.c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            this.F = bitmapShader;
            this.G.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i) {
        this.n = i;
    }

    public void setImageY(int i) {
        this.h = i;
    }

    public void setOrientation(int i) {
        this.e = i;
        this.f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.E;
        if (iArr == null) {
            this.y = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.y = false;
        for (int i : iArr) {
            if (i != 0) {
                this.y = true;
                return;
            }
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f + this.P);
    }
}
