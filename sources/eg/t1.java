package eg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.fa;
import qh.h5;
import qh.n4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t1 extends org.telegram.ui.Cells.t1 {
    public final fa Ce;
    public final float[] De;
    public final Path Ee;
    public final Paint Fe;
    public final Rect Ge;
    public final RectF He;
    public final /* synthetic */ u1 Ie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, Context context, int i10, a9.a aVar) {
        super(context, i10, false, null, aVar);
        this.Ie = u1Var;
        this.Ce = new fa(u1Var.d, this, 10, false);
        this.De = new float[8];
        this.Ee = new Path();
        Paint paint = new Paint();
        this.Fe = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Ge = new Rect();
        this.He = new RectF();
    }

    @Override // org.telegram.ui.Cells.t1
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Ie.h.s0 = true;
            Paint c3 = this.Ce.c(1.0f);
            if (c3 != null) {
                return c3;
            }
        }
        return super.M2(str);
    }

    @Override // org.telegram.ui.Cells.t1
    public final boolean a2(Canvas canvas) {
        h5 h5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        u1 u1Var = this.Ie;
        n4 n4Var = u1Var.h;
        if (!u1Var.f || photoImage == null || (((h5Var = u1Var.e) == null || !h5Var.g || !h5Var.d || !n4Var.u0) && !n4Var.r0 && (n4Var.t0 == null || !n4Var.J0.F0))) {
            return super.a2(canvas);
        }
        int i10 = 0;
        while (true) {
            int length = photoImage.getRoundRadius().length;
            fArr = this.De;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 * 2;
            fArr[i11] = photoImage.getRoundRadius()[i10];
            fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
            i10++;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
        Path path = this.Ee;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = n4Var.t0;
        if (textureView == null || !n4Var.J0.F0) {
            canvas.drawPath(path, this.Fe);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.a2(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.getImageWidth() / n4Var.v0, photoImage.getImageHeight() / n4Var.w0);
        canvas.translate(photoImage.getCenterX() - ((n4Var.v0 * max) / 2.0f), photoImage.getCenterY() - ((n4Var.w0 * max) / 2.0f));
        canvas.scale((n4Var.v0 / n4Var.t0.getWidth()) * max, (n4Var.w0 / n4Var.t0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Ge;
        rect.set(0, 0, width, height);
        float width2 = n4Var.t0.getWidth();
        float height2 = n4Var.t0.getHeight();
        RectF rectF2 = this.He;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        u1 u1Var = this.Ie;
        h5 h5Var = u1Var.e;
        if ((h5Var != null && h5Var.g && h5Var.d) || u1Var.h.r0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        S1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
