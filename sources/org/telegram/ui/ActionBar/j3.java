package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j3 {
    public final l3 a;
    public int b;
    public int c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 e;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h;
    public final Paint i;
    public int j;
    public final org.telegram.ui.Cells.z k;
    public int l;
    public final int m;
    public boolean n;
    public final boolean o;
    public final float p;
    public final Bitmap q;
    public final Drawable r;
    public int s;
    public final pz0 t;
    public pz0 u;
    public float v;
    public final float[] w;
    public final Path x;
    public final Path y;
    public final Path z;

    public j3(View view, l3 l3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.i = new Paint(3);
        org.telegram.ui.Cells.z f02 = g6.f0(822083583, 1, -1);
        this.k = f02;
        this.s = -1;
        this.w = new float[8];
        this.x = new Path();
        Path path = new Path();
        this.y = path;
        Path path2 = new Path();
        this.z = path2;
        this.a = l3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        er erVar = er.h;
        this.d = new org.telegram.ui.Components.y5(view, 320L, erVar);
        this.e = new org.telegram.ui.Components.y5(view, 320L, erVar);
        this.q = l3Var.D;
        String b10 = l3Var.b();
        textPaint = m3.getTextPaint();
        this.t = new pz0(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = l3Var.o;
        this.m = i10;
        this.o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.m4 m4Var = l3Var.H;
        if (m4Var != null) {
            ArrayList arrayList = m4Var.Z;
            if (!arrayList.isEmpty()) {
                Object i11 = i0.a.i(1, arrayList);
                if ((i11 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i11).cached_page) == null || page.local == null)) {
                    this.r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.p = l3Var.G;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        path.moveTo(AndroidUtilities.dp(12.0f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, AndroidUtilities.dp(6.33f) / 2.0f);
        path2.lineTo(AndroidUtilities.dp(12.66f) / 2.0f, (-AndroidUtilities.dp(6.33f)) / 2.0f);
        path2.lineTo(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        Canvas canvas2 = canvas;
        int d = i0.b.d(this.v, this.l, this.m);
        Paint paint = this.f;
        paint.setColor(d);
        float f13 = f11 * 255.0f;
        paint.setAlpha((int) f13);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), g6.l1(f11, TLObject.FLAG_28));
        float[] fArr = this.w;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i10 = 0;
        fArr[0] = f10;
        float lerp = AndroidUtilities.lerp(f10, 0.0f, this.v);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f14 = this.p;
        if (f14 > 0.0f && this.v > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            int l1 = g6.l1(0.07f * f11 * this.v, AndroidUtilities.computePerceivedBrightness(d) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.g;
            paint2.setColor(l1);
            float f15 = rectF.left;
            canvas.drawRect(f15, rectF.top, (rectF.width() * f14) + f15, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        float lerp2 = AndroidUtilities.lerp(this.n ? 1.0f : 0.0f, this.o ? 1.0f : 0.0f, this.v);
        int d10 = i0.b.d(lerp2, -16777216, -1);
        Paint paint3 = this.h;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.b.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f));
        int i11 = -AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f);
        int dp3 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.k;
        zVar.setBounds(dp, i11, dp2, dp3);
        if (this.j != d11) {
            this.j = d11;
            g6.B1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f16 = f13 * f12;
        int i12 = (int) f16;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f16));
        canvas2.drawPath(this.z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            int dp4 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = dp4;
            float f18 = f17 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f18), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f17), (int) (rectF.centerY() + f18));
            Paint paint4 = this.i;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = AndroidUtilities.dp(4.0f) + dp4;
        } else {
            Drawable drawable = this.r;
            if (drawable != null) {
                float dp5 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f19 = (dp5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f19), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f19));
                if (d10 != this.s) {
                    this.s = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i10 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        pz0 pz0Var = this.u;
        if (pz0Var != null) {
            pz0Var.p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - r3);
            pz0Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i10, rectF.centerY(), org.telegram.messenger.y1.z(1.0f, this.v, f11, f12), d10, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        float f20 = i10;
        pz0 pz0Var2 = this.t;
        pz0Var2.p = (int) (width - f20);
        pz0Var2.c(f20 + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), (this.u == null ? 1.0f : this.v) * f11 * f12, d10, canvas);
    }

    public final float b() {
        float c10 = c();
        return this.e.e(this.c >= 0) * (c10 < 0.0f ? c10 + 1.0f : (c10 < 0.0f || c10 >= 1.0f) ? (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f : AndroidUtilities.lerp(1.0f, 0.87f, c10));
    }

    public final float c() {
        if (this.c < 0) {
            return this.b;
        }
        return this.d.d(this.b, false);
    }
}
