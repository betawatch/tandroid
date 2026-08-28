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
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ClippingImageView extends View {
    public static final float[] M = new float[8];
    public BitmapShader A;
    public final Paint B;
    public final RectF C;
    public final RectF D;
    public final Matrix E;
    public final Path F;
    public boolean G;
    public float H;
    public boolean I;
    public float[][] J;
    public float K;
    public float L;
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
    public ImageReceiver.BitmapHolder v;
    public final Matrix w;
    public boolean x;
    public final int[] y;

    public ClippingImageView(Context context) {
        super(context);
        this.y = new int[4];
        this.F = new Path();
        Paint paint = new Paint(2);
        this.s = paint;
        paint.setFilterBitmap(true);
        this.w = new Matrix();
        this.r = new RectF();
        this.D = new RectF();
        this.B = new Paint(3);
        this.C = new RectF();
        this.E = new Matrix();
    }

    public float getAnimationProgress() {
        return this.H;
    }

    public Bitmap getBitmap() {
        ImageReceiver.BitmapHolder bitmapHolder = this.v;
        if (bitmapHolder != null) {
            return bitmapHolder.bitmap;
        }
        return null;
    }

    public ImageReceiver.BitmapHolder getBitmapHolder() {
        return this.v;
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
        return this.y;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return super.getTranslationY() - this.K;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver.BitmapHolder bitmapHolder;
        float[] fArr;
        if (getVisibility() != 0 || (bitmapHolder = this.v) == null || bitmapHolder.isRecycled()) {
            return;
        }
        float scaleY = getScaleY();
        canvas.save();
        boolean z10 = this.x;
        RectF rectF = this.D;
        if (z10) {
            Matrix matrix = this.E;
            matrix.reset();
            RectF rectF2 = this.C;
            rectF2.set(this.n / scaleY, this.h / scaleY, getWidth() - (this.n / scaleY), getHeight() - (this.h / scaleY));
            rectF.set(0.0f, 0.0f, this.v.getWidth(), this.v.getHeight());
            AndroidUtilities.setRectToRect(matrix, rectF, rectF2, this.e, this.f, false);
            this.A.setLocalMatrix(matrix);
            canvas.clipRect(this.b / scaleY, this.d / scaleY, getWidth() - (this.c / scaleY), getHeight() - (this.a / scaleY));
            int i9 = 0;
            while (true) {
                int[] iArr = this.y;
                int length = iArr.length;
                fArr = M;
                if (i9 >= length) {
                    break;
                }
                int i10 = i9 * 2;
                float f10 = iArr[i9];
                fArr[i10] = f10;
                fArr[i10 + 1] = f10;
                i9++;
            }
            Path path = this.F;
            path.reset();
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            path.close();
            canvas.drawPath(path, this.B);
        } else {
            int i11 = this.e;
            RectF rectF3 = this.r;
            Matrix matrix2 = this.w;
            if (i11 == 90 || i11 == 270) {
                rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i12 = this.f;
                if (i12 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i12 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.e, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else if (i11 == 180) {
                rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i13 = this.f;
                if (i13 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i13 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.e, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else {
                rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                int i14 = this.f;
                if (i14 == 1) {
                    matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                } else if (i14 == 2) {
                    matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                }
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
            }
            canvas.clipRect(this.b / scaleY, this.d / scaleY, getWidth() - (this.c / scaleY), getHeight() - (this.a / scaleY));
            try {
                canvas.drawBitmap(this.v.bitmap, matrix2, this.s);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        canvas.restore();
    }

    public void setAdditionalTranslationX(float f10) {
        this.L = f10;
    }

    public void setAdditionalTranslationY(float f10) {
        this.K = f10;
    }

    public void setAnimationProgress(float f10) {
        this.H = f10;
        float[][] fArr = this.J;
        float f11 = fArr[0][0];
        setScaleX(((fArr[1][0] - f11) * f10) + f11);
        float[][] fArr2 = this.J;
        float f12 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f12) * this.H) + f12);
        float[][] fArr3 = this.J;
        float f13 = fArr3[0][2];
        float f14 = this.L;
        setTranslationX(((((fArr3[1][2] + f14) - f13) - f14) * this.H) + f13 + f14);
        float[][] fArr4 = this.J;
        float f15 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f15) * this.H) + f15);
        float[][] fArr5 = this.J;
        float f16 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f16) * this.H) + f16));
        float[][] fArr6 = this.J;
        float f17 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f17) * this.H) + f17));
        float[][] fArr7 = this.J;
        float f18 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f18) * this.H) + f18));
        int i9 = 0;
        while (true) {
            int[] iArr = this.y;
            if (i9 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.J;
            int i10 = i9 + 7;
            float f19 = fArr8[0][i10];
            iArr[i9] = (int) (((fArr8[1][i10] - f19) * this.H) + f19);
            setRadius(iArr);
            i9++;
        }
        float[][] fArr9 = this.J;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f20 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f20) * this.H) + f20));
            float[][] fArr11 = this.J;
            float f21 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f21) * this.H) + f21));
        }
        if (this.I) {
            if (!this.G) {
                f10 = 1.0f - f10;
            }
            setAlpha(f10);
        }
        invalidate();
    }

    public void setClipBottom(int i9) {
        this.a = i9;
        invalidate();
    }

    public void setClipHorizontal(int i9) {
        this.c = i9;
        this.b = i9;
        invalidate();
    }

    public void setClipLeft(int i9) {
        this.b = i9;
        invalidate();
    }

    public void setClipRight(int i9) {
        this.c = i9;
        invalidate();
    }

    public void setClipTop(int i9) {
        this.d = i9;
        invalidate();
    }

    public void setClipVertical(int i9) {
        this.a = i9;
        this.d = i9;
        invalidate();
    }

    public void setImageBitmap(ImageReceiver.BitmapHolder bitmapHolder) {
        ImageReceiver.BitmapHolder bitmapHolder2 = this.v;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.A = null;
        }
        if (bitmapHolder != null && bitmapHolder.isRecycled()) {
            bitmapHolder = null;
        }
        this.v = bitmapHolder;
        if (bitmapHolder != null && bitmapHolder.bitmap != null) {
            this.D.set(0.0f, 0.0f, bitmapHolder.getWidth(), bitmapHolder.getHeight());
            Bitmap bitmap = this.v.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.A = bitmapShader;
            this.B.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i9) {
        this.n = i9;
    }

    public void setImageY(int i9) {
        this.h = i9;
    }

    public void setOrientation(int i9) {
        this.e = i9;
        this.f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.y;
        if (iArr == null) {
            this.x = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.x = false;
        for (int i9 : iArr) {
            if (i9 != 0) {
                this.x = true;
                return;
            }
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10 + this.K);
    }
}
