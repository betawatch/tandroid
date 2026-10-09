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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k3 {
    public final Path A;
    public final m3 a;
    public final View b;
    public int c;
    public int d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.g6 f;
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i;
    public final Paint j;
    public int k;
    public final org.telegram.ui.Cells.z l;
    public int m;
    public final int n;
    public boolean o;
    public final boolean p;
    public final float q;
    public final Bitmap r;
    public final Drawable s;
    public int t;
    public final l11 u;
    public l11 v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public k3(View view, m3 m3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        org.telegram.ui.Cells.z g02 = i6.g0(822083583, 1, -1);
        this.l = g02;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = m3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        hs hsVar = hs.h;
        this.e = new org.telegram.ui.Components.g6(view, 320L, hsVar);
        this.f = new org.telegram.ui.Components.g6(view, 320L, hsVar);
        this.r = m3Var.F;
        String b10 = m3Var.b();
        textPaint = n3.getTextPaint();
        this.u = new l11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = m3Var.q;
        this.n = i10;
        this.p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.i4 i4Var = m3Var.J;
        if (i4Var != null) {
            ArrayList arrayList = i4Var.d0;
            if (!arrayList.isEmpty()) {
                Object g10 = hg.c.g(1, arrayList);
                if ((g10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g10).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.q = m3Var.I;
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

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, float f11) {
        float f12;
        Canvas canvas2 = canvas;
        int d = i0.a.d(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(d);
        float f13 = f10 * 255.0f;
        paint.setAlpha((int) f13);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), i6.m1(f10, TLObject.FLAG_28));
        float[] fArr = this.x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i10 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f14 = this.q;
        if (f14 > 0.0f && this.w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            int m12 = i6.m1(0.07f * f10 * this.w, AndroidUtilities.computePerceivedBrightness(d) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.h;
            paint2.setColor(m12);
            float f15 = rectF.left;
            canvas.drawRect(f15, rectF.top, (rectF.width() * f14) + f15, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        float lerp2 = AndroidUtilities.lerp(this.o ? 1.0f : 0.0f, this.p ? 1.0f : 0.0f, this.w);
        int d10 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f));
        int i11 = -AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f);
        int dp3 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.l;
        zVar.setBounds(dp, i11, dp2, dp3);
        if (this.k != d11) {
            this.k = d11;
            i6.C1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f16 = f13 * f11;
        int i12 = (int) f16;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f16));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int dp4 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = dp4;
            float f18 = f17 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f18), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f17), (int) (rectF.centerY() + f18));
            Paint paint4 = this.j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = AndroidUtilities.dp(4.0f) + dp4;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float dp5 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f19 = (dp5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f19), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f19));
                if (d10 != this.t) {
                    this.t = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i10 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        l11 l11Var = this.v;
        if (l11Var != null) {
            l11Var.p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - r3);
            f12 = 1.0f;
            l11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i10, rectF.centerY(), org.telegram.messenger.q.z(1.0f, this.w, f10, f11), d10, canvas2);
        } else {
            f12 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        float f20 = i10;
        l11 l11Var2 = this.u;
        l11Var2.p = (int) (width - f20);
        l11Var2.c(f20 + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), (this.v == null ? f12 : this.w) * f10 * f11, d10, canvas);
    }

    public final float b() {
        float c10 = c();
        return this.f.e(this.d >= 0) * (c10 < 0.0f ? c10 + 1.0f : (c10 < 0.0f || c10 >= 1.0f) ? (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f : AndroidUtilities.lerp(1.0f, 0.87f, c10));
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.d(this.c, false);
    }
}
