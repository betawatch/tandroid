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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class ClippingImageView extends View {
    public static final float[] Q = new float[8];
    public final int[] D;
    public BitmapShader E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Matrix I;
    public final Path J;
    public boolean K;
    public float L;
    public boolean M;
    public float[][] N;
    public float O;
    public float P;
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
    public org.telegram.messenger.jc w;
    public final Matrix x;
    public boolean y;

    public ClippingImageView(Context context) {
        super(context);
        this.D = new int[4];
        this.J = new Path();
        Paint paint = new Paint(2);
        this.s = paint;
        paint.setFilterBitmap(true);
        this.x = new Matrix();
        this.r = new RectF();
        this.H = new RectF();
        this.F = new Paint(3);
        this.G = new RectF();
        this.I = new Matrix();
    }

    public float getAnimationProgress() {
        return this.L;
    }

    public Bitmap getBitmap() {
        org.telegram.messenger.jc jcVar = this.w;
        if (jcVar != null) {
            return jcVar.c;
        }
        return null;
    }

    public org.telegram.messenger.jc getBitmapHolder() {
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
        return this.D;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return super.getTranslationY() - this.O;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.messenger.jc jcVar;
        Bitmap bitmap;
        float height;
        float width;
        float height2;
        boolean z9;
        float[] fArr;
        if (getVisibility() != 0 || (jcVar = this.w) == null || (bitmap = jcVar.c) == null || bitmap.isRecycled()) {
            return;
        }
        float scaleY = getScaleY();
        canvas.save();
        boolean z10 = this.y;
        RectF rectF = this.H;
        if (z10) {
            Matrix matrix = this.I;
            matrix.reset();
            RectF rectF2 = this.G;
            rectF2.set(this.n / scaleY, this.h / scaleY, getWidth() - (this.n / scaleY), getHeight() - (this.h / scaleY));
            Bitmap bitmap2 = this.w.c;
            int i7 = 0;
            rectF.set(0.0f, 0.0f, bitmap2 != null ? bitmap2.getWidth() : 0, this.w.c != null ? r14.getHeight() : 0);
            int i10 = this.e;
            int i11 = this.f;
            Typeface typeface = org.telegram.messenger.g0.a;
            if (i10 == 90 || i10 == 270) {
                height = rectF2.height() / rectF.width();
                width = rectF2.width();
                height2 = rectF.height();
            } else {
                height = rectF2.width() / rectF.width();
                width = rectF2.height();
                height2 = rectF.height();
            }
            float f10 = width / height2;
            if (height < f10) {
                height = f10;
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 == 90) {
                matrix.preRotate(90.0f);
                if (i11 == 1) {
                    matrix.preScale(-1.0f, 1.0f);
                } else if (i11 == 2) {
                    matrix.preScale(1.0f, -1.0f);
                }
                matrix.preTranslate(0.0f, -rectF2.width());
            } else if (i10 == 180) {
                matrix.preRotate(180.0f);
                if (i11 == 1) {
                    matrix.preScale(-1.0f, 1.0f);
                } else if (i11 == 2) {
                    matrix.preScale(1.0f, -1.0f);
                }
                matrix.preTranslate(-rectF2.width(), -rectF2.height());
            } else if (i10 == 270) {
                matrix.preRotate(270.0f);
                if (i11 == 1) {
                    matrix.preScale(-1.0f, 1.0f);
                } else if (i11 == 2) {
                    matrix.preScale(1.0f, -1.0f);
                }
                matrix.preTranslate(-rectF2.height(), 0.0f);
            }
            if (z9) {
                rectF2.width();
                rectF.width();
            } else {
                rectF2.height();
                rectF.height();
            }
            matrix.preScale(height, height);
            this.E.setLocalMatrix(matrix);
            canvas.clipRect(this.b / scaleY, this.d / scaleY, getWidth() - (this.c / scaleY), getHeight() - (this.a / scaleY));
            while (true) {
                int[] iArr = this.D;
                int length = iArr.length;
                fArr = Q;
                if (i7 >= length) {
                    break;
                }
                int i12 = i7 * 2;
                float f11 = iArr[i7];
                fArr[i12] = f11;
                fArr[i12 + 1] = f11;
                i7++;
            }
            Path path = this.J;
            path.reset();
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            path.close();
            canvas.drawPath(path, this.F);
        } else {
            int i13 = this.e;
            RectF rectF3 = this.r;
            Matrix matrix2 = this.x;
            if (i13 == 90 || i13 == 270) {
                rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i14 = this.f;
                if (i14 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i14 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.e, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else if (i13 == 180) {
                rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i15 = this.f;
                if (i15 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i15 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.e, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else {
                rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                int i16 = this.f;
                if (i16 == 1) {
                    matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                } else if (i16 == 2) {
                    matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                }
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
            }
            canvas.clipRect(this.b / scaleY, this.d / scaleY, getWidth() - (this.c / scaleY), getHeight() - (this.a / scaleY));
            try {
                canvas.drawBitmap(this.w.c, matrix2, this.s);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        canvas.restore();
    }

    public void setAdditionalTranslationX(float f10) {
        this.P = f10;
    }

    public void setAdditionalTranslationY(float f10) {
        this.O = f10;
    }

    public void setAnimationProgress(float f10) {
        this.L = f10;
        float[][] fArr = this.N;
        float f11 = fArr[0][0];
        setScaleX(((fArr[1][0] - f11) * f10) + f11);
        float[][] fArr2 = this.N;
        float f12 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f12) * this.L) + f12);
        float[][] fArr3 = this.N;
        float f13 = fArr3[0][2];
        float f14 = this.P;
        setTranslationX(((((fArr3[1][2] + f14) - f13) - f14) * this.L) + f13 + f14);
        float[][] fArr4 = this.N;
        float f15 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f15) * this.L) + f15);
        float[][] fArr5 = this.N;
        float f16 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f16) * this.L) + f16));
        float[][] fArr6 = this.N;
        float f17 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f17) * this.L) + f17));
        float[][] fArr7 = this.N;
        float f18 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f18) * this.L) + f18));
        int i7 = 0;
        while (true) {
            int[] iArr = this.D;
            if (i7 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.N;
            int i10 = i7 + 7;
            float f19 = fArr8[0][i10];
            iArr[i7] = (int) (((fArr8[1][i10] - f19) * this.L) + f19);
            setRadius(iArr);
            i7++;
        }
        float[][] fArr9 = this.N;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f20 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f20) * this.L) + f20));
            float[][] fArr11 = this.N;
            float f21 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f21) * this.L) + f21));
        }
        if (this.M) {
            if (!this.K) {
                f10 = 1.0f - f10;
            }
            setAlpha(f10);
        }
        invalidate();
    }

    public void setClipBottom(int i7) {
        this.a = i7;
        invalidate();
    }

    public void setClipHorizontal(int i7) {
        this.c = i7;
        this.b = i7;
        invalidate();
    }

    public void setClipLeft(int i7) {
        this.b = i7;
        invalidate();
    }

    public void setClipRight(int i7) {
        this.c = i7;
        invalidate();
    }

    public void setClipTop(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setClipVertical(int i7) {
        this.a = i7;
        this.d = i7;
        invalidate();
    }

    public void setImageBitmap(org.telegram.messenger.jc jcVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.messenger.jc jcVar2 = this.w;
        if (jcVar2 != null) {
            jcVar2.a();
            this.E = null;
        }
        if (jcVar != null && ((bitmap2 = jcVar.c) == null || bitmap2.isRecycled())) {
            jcVar = null;
        }
        this.w = jcVar;
        if (jcVar != null && (bitmap = jcVar.c) != null) {
            this.H.set(0.0f, 0.0f, bitmap != null ? bitmap.getWidth() : 0, jcVar.c != null ? r4.getHeight() : 0);
            Bitmap bitmap3 = this.w.c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            this.E = bitmapShader;
            this.F.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i7) {
        this.n = i7;
    }

    public void setImageY(int i7) {
        this.h = i7;
    }

    public void setOrientation(int i7) {
        this.e = i7;
        this.f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.D;
        if (iArr == null) {
            this.y = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.y = false;
        for (int i7 : iArr) {
            if (i7 != 0) {
                this.y = true;
                return;
            }
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10 + this.O);
    }
}
