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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f3 {
    public final Path A;
    public final h3 a;
    public final View b;
    public int c;
    public int d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f;
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
    public final qz0 u;
    public qz0 v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public f3(View view, h3 h3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        org.telegram.ui.Cells.y h02 = t6.h0(822083583, 1, -1);
        this.l = h02;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = h3Var;
        h02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        gr grVar = gr.h;
        this.e = new org.telegram.ui.Components.t5(view, 320L, grVar);
        this.f = new org.telegram.ui.Components.t5(view, 320L, grVar);
        this.r = h3Var.F;
        String b10 = h3Var.b();
        textPaint = i3.getTextPaint();
        this.u = new qz0(org.telegram.messenger.k6.m(b10, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, org.telegram.messenger.i0.o());
        int i10 = h3Var.q;
        this.n = i10;
        this.p = org.telegram.messenger.i0.B(i10) < 0.721f;
        org.telegram.ui.h4 h4Var = h3Var.J;
        if (h4Var != null) {
            ArrayList arrayList = h4Var.d0;
            if (!arrayList.isEmpty()) {
                Object g10 = i0.a.g(1, arrayList);
                if ((g10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g10).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.q = h3Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        path.moveTo(org.telegram.messenger.i0.L(12.0f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, org.telegram.messenger.i0.L(6.33f) / 2.0f);
        path2.lineTo(org.telegram.messenger.i0.L(12.66f) / 2.0f, (-org.telegram.messenger.i0.L(6.33f)) / 2.0f);
        path2.lineTo(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, float f11) {
        float f12;
        Canvas canvas2 = canvas;
        int f13 = i0.b.f(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(f13);
        float f14 = f10 * 255.0f;
        paint.setAlpha((int) f14);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(1.0f), t6.r1(f10, TLObject.FLAG_28));
        float[] fArr = this.x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i10 = 0;
        fArr[0] = f7;
        float T1 = org.telegram.messenger.i0.T1(f7, 0.0f, this.w);
        fArr[7] = T1;
        fArr[6] = T1;
        fArr[5] = T1;
        fArr[4] = T1;
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f15 = this.q;
        if (f15 > 0.0f && this.w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            int r12 = t6.r1(0.07f * f10 * this.w, org.telegram.messenger.i0.B(f13) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.h;
            paint2.setColor(r12);
            float f16 = rectF.left;
            canvas.drawRect(f16, rectF.top, (rectF.width() * f15) + f16, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        float T12 = org.telegram.messenger.i0.T1(this.o ? 1.0f : 0.0f, this.p ? 1.0f : 0.0f, this.w);
        int f17 = i0.b.f(T12, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(f17);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f18 = i0.b.f(T12, 553648127, 553648127);
        int L = org.telegram.messenger.i0.L(25.0f) + (-org.telegram.messenger.i0.L(25.0f));
        int i11 = -org.telegram.messenger.i0.L(25.0f);
        int L2 = org.telegram.messenger.i0.L(25.0f) + org.telegram.messenger.i0.L(25.0f);
        int L3 = org.telegram.messenger.i0.L(25.0f);
        org.telegram.ui.Cells.y yVar = this.l;
        yVar.setBounds(L, i11, L2, L3);
        if (this.k != f18) {
            this.k = f18;
            t6.H1(yVar, f18, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + org.telegram.messenger.i0.L(18.0f), rectF.centerY() - org.telegram.messenger.i0.L(6.0f));
        float f19 = f14 * f11;
        int i12 = (int) f19;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - org.telegram.messenger.i0.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f19));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int L4 = org.telegram.messenger.i0.L(24.0f);
            canvas2.save();
            Rect rect = org.telegram.messenger.i0.Q;
            float f20 = L4;
            float f21 = f20 / 2.0f;
            rect.set((int) (rectF.left + org.telegram.messenger.i0.L(56.0f)), (int) (rectF.centerY() - f21), (int) (rectF.left + org.telegram.messenger.i0.L(56.0f) + f20), (int) (rectF.centerY() + f21));
            Paint paint4 = this.j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = org.telegram.messenger.i0.L(4.0f) + L4;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float L5 = org.telegram.messenger.i0.L(24.0f);
                int intrinsicHeight = (int) ((L5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = org.telegram.messenger.i0.Q;
                float f22 = (L5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + org.telegram.messenger.i0.L(56.0f)), (int) (rectF.centerY() - f22), (int) ((intrinsicHeight * 0.7f) + rectF.left + org.telegram.messenger.i0.L(56.0f)), (int) (rectF.centerY() + f22));
                if (f17 != this.t) {
                    this.t = f17;
                    drawable.setColorFilter(new PorterDuffColorFilter(f17, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i10 = intrinsicHeight - org.telegram.messenger.i0.L(2.0f);
            }
        }
        qz0 qz0Var = this.v;
        if (qz0Var != null) {
            qz0Var.p = (int) ((rectF.width() - org.telegram.messenger.i0.L(100.0f)) - r3);
            f12 = 1.0f;
            qz0Var.c(rectF.left + org.telegram.messenger.i0.L(60.0f) + i10, rectF.centerY(), org.telegram.messenger.m5.A(1.0f, this.w, f10, f11), f17, canvas2);
        } else {
            f12 = 1.0f;
        }
        float width = rectF.width() - org.telegram.messenger.i0.L(100.0f);
        float f23 = i10;
        qz0 qz0Var2 = this.u;
        qz0Var2.p = (int) (width - f23);
        qz0Var2.c(f23 + rectF.left + org.telegram.messenger.i0.L(60.0f), rectF.centerY(), (this.v == null ? f12 : this.w) * f10 * f11, f17, canvas);
    }

    public final float b() {
        float c10 = c();
        return this.f.d(this.d >= 0) * (c10 < 0.0f ? c10 + 1.0f : (c10 < 0.0f || c10 >= 1.0f) ? (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f : org.telegram.messenger.i0.T1(1.0f, 0.87f, c10));
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.e(false, this.c);
    }
}
