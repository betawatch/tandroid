package dg;

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
import ph.j5;
import ph.o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v1 extends org.telegram.ui.Cells.s1 {
    public final fa Ce;
    public final float[] De;
    public final Path Ee;
    public final Paint Fe;
    public final Rect Ge;
    public final RectF He;
    public final /* synthetic */ w1 Ie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, Context context, int i10, a9.a aVar) {
        super(context, i10, false, null, aVar);
        this.Ie = w1Var;
        this.Ce = new fa(w1Var.d, this, 10, false);
        this.De = new float[8];
        this.Ee = new Path();
        Paint paint = new Paint();
        this.Fe = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Ge = new Rect();
        this.He = new RectF();
    }

    @Override // org.telegram.ui.Cells.s1
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

    @Override // org.telegram.ui.Cells.s1
    public final boolean a2(Canvas canvas) {
        j5 j5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        w1 w1Var = this.Ie;
        o4 o4Var = w1Var.h;
        if (!w1Var.f || photoImage == null || (((j5Var = w1Var.e) == null || !j5Var.g || !j5Var.d || !o4Var.u0) && !o4Var.r0 && (o4Var.t0 == null || !o4Var.J0.F0))) {
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
        TextureView textureView = o4Var.t0;
        if (textureView == null || !o4Var.J0.F0) {
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
        float max = Math.max(photoImage.getImageWidth() / o4Var.v0, photoImage.getImageHeight() / o4Var.w0);
        canvas.translate(photoImage.getCenterX() - ((o4Var.v0 * max) / 2.0f), photoImage.getCenterY() - ((o4Var.w0 * max) / 2.0f));
        canvas.scale((o4Var.v0 / o4Var.t0.getWidth()) * max, (o4Var.w0 / o4Var.t0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Ge;
        rect.set(0, 0, width, height);
        float width2 = o4Var.t0.getWidth();
        float height2 = o4Var.t0.getHeight();
        RectF rectF2 = this.He;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        w1 w1Var = this.Ie;
        j5 j5Var = w1Var.e;
        if ((j5Var != null && j5Var.g && j5Var.d) || w1Var.h.r0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        S1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
