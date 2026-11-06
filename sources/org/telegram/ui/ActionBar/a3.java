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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a3 {
    public final Path A;
    public final c3 a;
    public final View b;
    public int c;
    public int d;
    public final org.telegram.ui.Components.w5 e;
    public final org.telegram.ui.Components.w5 f;
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i;
    public final Paint j;
    public int k;
    public final org.telegram.ui.Cells.y l;
    public int m;
    public final int n;
    public boolean o;
    public final boolean p;
    public final float q;
    public final Bitmap r;
    public final Drawable s;
    public int t;
    public final my0 u;
    public my0 v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public a3(View view, c3 c3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        org.telegram.ui.Cells.y h02 = k6.h0(822083583, 1, -1);
        this.l = h02;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = c3Var;
        h02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        xq xqVar = xq.h;
        this.e = new org.telegram.ui.Components.w5(view, 320L, xqVar);
        this.f = new org.telegram.ui.Components.w5(view, 320L, xqVar);
        this.r = c3Var.F;
        String b10 = c3Var.b();
        textPaint = d3.getTextPaint();
        this.u = new my0(org.telegram.messenger.i6.m(b10, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, org.telegram.messenger.g0.o());
        int i7 = c3Var.q;
        this.n = i7;
        this.p = org.telegram.messenger.g0.B(i7) < 0.721f;
        org.telegram.ui.g4 g4Var = c3Var.J;
        if (g4Var != null) {
            ArrayList arrayList = g4Var.d0;
            if (!arrayList.isEmpty()) {
                Object i10 = jg.g.i(1, arrayList);
                if ((i10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i10).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.q = c3Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        path.moveTo(org.telegram.messenger.g0.L(12.0f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, org.telegram.messenger.g0.L(6.33f) / 2.0f);
        path2.lineTo(org.telegram.messenger.g0.L(12.66f) / 2.0f, (-org.telegram.messenger.g0.L(6.33f)) / 2.0f);
        path2.lineTo(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        float f13;
        Canvas canvas2 = canvas;
        int f14 = i0.a.f(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(f14);
        float f15 = f11 * 255.0f;
        paint.setAlpha((int) f15);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(1.0f), k6.r1(f11, TLObject.FLAG_28));
        float[] fArr = this.x;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i7 = 0;
        fArr[0] = f10;
        float T1 = org.telegram.messenger.g0.T1(f10, 0.0f, this.w);
        fArr[7] = T1;
        fArr[6] = T1;
        fArr[5] = T1;
        fArr[4] = T1;
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f16 = this.q;
        if (f16 > 0.0f && this.w > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            int r12 = k6.r1(0.07f * f11 * this.w, org.telegram.messenger.g0.B(f14) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.h;
            paint2.setColor(r12);
            float f17 = rectF.left;
            canvas.drawRect(f17, rectF.top, (rectF.width() * f16) + f17, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        float T12 = org.telegram.messenger.g0.T1(this.o ? 1.0f : 0.0f, this.p ? 1.0f : 0.0f, this.w);
        int f18 = i0.a.f(T12, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(f18);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f19 = i0.a.f(T12, 553648127, 553648127);
        int L = org.telegram.messenger.g0.L(25.0f) + (-org.telegram.messenger.g0.L(25.0f));
        int i10 = -org.telegram.messenger.g0.L(25.0f);
        int L2 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(25.0f);
        int L3 = org.telegram.messenger.g0.L(25.0f);
        org.telegram.ui.Cells.y yVar = this.l;
        yVar.setBounds(L, i10, L2, L3);
        if (this.k != f19) {
            this.k = f19;
            k6.H1(yVar, f19, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + org.telegram.messenger.g0.L(18.0f), rectF.centerY() - org.telegram.messenger.g0.L(6.0f));
        float f20 = f15 * f12;
        int i11 = (int) f20;
        paint3.setAlpha(i11);
        canvas2.drawPath(this.z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - org.telegram.messenger.g0.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f20));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int L4 = org.telegram.messenger.g0.L(24.0f);
            canvas2.save();
            Rect rect = org.telegram.messenger.g0.Q;
            float f21 = L4;
            float f22 = f21 / 2.0f;
            rect.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f22), (int) (rectF.left + org.telegram.messenger.g0.L(56.0f) + f21), (int) (rectF.centerY() + f22));
            Paint paint4 = this.j;
            paint4.setAlpha(i11);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i7 = org.telegram.messenger.g0.L(4.0f) + L4;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float L5 = org.telegram.messenger.g0.L(24.0f);
                int intrinsicHeight = (int) ((L5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = org.telegram.messenger.g0.Q;
                float f23 = (L5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() - f23), (int) ((intrinsicHeight * 0.7f) + rectF.left + org.telegram.messenger.g0.L(56.0f)), (int) (rectF.centerY() + f23));
                if (f18 != this.t) {
                    this.t = f18;
                    drawable.setColorFilter(new PorterDuffColorFilter(f18, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i11);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i7 = intrinsicHeight - org.telegram.messenger.g0.L(2.0f);
            }
        }
        my0 my0Var = this.v;
        if (my0Var != null) {
            my0Var.p = (int) ((rectF.width() - org.telegram.messenger.g0.L(100.0f)) - r3);
            f13 = 1.0f;
            my0Var.c(rectF.left + org.telegram.messenger.g0.L(60.0f) + i7, rectF.centerY(), org.telegram.messenger.k5.A(1.0f, this.w, f11, f12), f18, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - org.telegram.messenger.g0.L(100.0f);
        float f24 = i7;
        my0 my0Var2 = this.u;
        my0Var2.p = (int) (width - f24);
        my0Var2.c(f24 + rectF.left + org.telegram.messenger.g0.L(60.0f), rectF.centerY(), (this.v == null ? f13 : this.w) * f11 * f12, f18, canvas);
    }

    public final float b() {
        float c10 = c();
        return this.f.d(this.d >= 0) * (c10 < 0.0f ? c10 + 1.0f : (c10 < 0.0f || c10 >= 1.0f) ? (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f : org.telegram.messenger.g0.T1(1.0f, 0.87f, c10));
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.e(false, this.c);
    }
}
