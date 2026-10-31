package jg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.w9;
import vh.j4;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e1 extends org.telegram.ui.Cells.q1 {
    public final w9 hd;
    public final float[] id;
    public final Path jd;
    public final Paint kd;
    public final Rect ld;
    public final RectF md;
    public final /* synthetic */ f1 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, Context context, int i10, i1 i1Var) {
        super(context, i10, false, null, i1Var);
        this.nd = f1Var;
        this.hd = new w9(f1Var.d, this, 10, false);
        this.id = new float[8];
        this.jd = new Path();
        Paint paint = new Paint();
        this.kd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.ld = new Rect();
        this.md = new RectF();
    }

    @Override // org.telegram.ui.Cells.q1
    public final Paint X1(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.nd.h.v0 = true;
            Paint c10 = this.hd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.X1(str);
    }

    @Override // org.telegram.ui.Cells.q1
    public final boolean j1(Canvas canvas) {
        j4 j4Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        f1 f1Var = this.nd;
        s3 s3Var = f1Var.h;
        if (!f1Var.f || photoImage == null || (((j4Var = f1Var.e) == null || !j4Var.g || !j4Var.d || !s3Var.x0) && !s3Var.u0 && (s3Var.w0 == null || !s3Var.M0.r0))) {
            return super.j1(canvas);
        }
        int i10 = 0;
        while (true) {
            int[] iArr = photoImage.W0;
            int length = iArr.length;
            fArr = this.id;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 * 2;
            float f7 = iArr[i10];
            fArr[i11] = f7;
            fArr[i11 + 1] = f7;
            i10++;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(photoImage.K0, photoImage.L0, photoImage.y(), photoImage.A());
        Path path = this.jd;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = s3Var.w0;
        if (textureView == null || !s3Var.M0.r0) {
            canvas.drawPath(path, this.kd);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.j1(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.M0 / s3Var.y0, photoImage.N0 / s3Var.z0);
        canvas.translate(photoImage.r() - ((s3Var.y0 * max) / 2.0f), photoImage.s() - ((s3Var.z0 * max) / 2.0f));
        canvas.scale((s3Var.y0 / s3Var.w0.getWidth()) * max, (s3Var.z0 / s3Var.w0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.ld;
        rect.set(0, 0, width, height);
        float width2 = s3Var.w0.getWidth();
        float height2 = s3Var.w0.getHeight();
        RectF rectF2 = this.md;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        f1 f1Var = this.nd;
        j4 j4Var = f1Var.e;
        if ((j4Var != null && j4Var.g && j4Var.d) || f1Var.h.u0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        b1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
