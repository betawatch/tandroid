// default package

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
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nx0 {
    public final Path A;
    public final px0 a;
    public final View b;
    public int c;
    public int d;
    public final lm e;
    public final lm f;
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i;
    public final Paint j;
    public int k;
    public final ff0 l;
    public int m;
    public final int n;
    public boolean o;
    public final boolean p;
    public final float q;
    public final Bitmap r;
    public final Drawable s;
    public int t;
    public final tgb u;
    public tgb v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public nx0(View view, px0 px0Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        ff0 f0 = bkb.f0(822083583, 1, -1);
        this.l = f0;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = px0Var;
        f0.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        s33 s33Var = s33.h;
        this.e = new lm(320L, view, s33Var);
        this.f = new lm(320L, view, s33Var);
        this.r = px0Var.F;
        String b = px0Var.b();
        textPaint = qx0.getTextPaint();
        this.u = new tgb(vu3.m(b, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, gl.o());
        int i = px0Var.q;
        this.n = i;
        this.p = gl.B(i) < 0.721f;
        o oVar = px0Var.J;
        if (oVar != null) {
            ArrayList arrayList = oVar.e0;
            if (!arrayList.isEmpty()) {
                Object f = b00.f(1, arrayList);
                if ((f instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) f).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.q = px0Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(gl.L(12.0f), gl.L(12.0f));
        path.moveTo(gl.L(12.0f), 0.0f);
        path.lineTo(0.0f, gl.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, gl.L(6.33f) / 2.0f);
        path2.lineTo(gl.L(12.66f) / 2.0f, (-gl.L(6.33f)) / 2.0f);
        path2.lineTo(gl.L(12.66f), gl.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        float f4;
        int f5 = bm2.f(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(f5);
        float f6 = f2 * 255.0f;
        paint.setAlpha((int) f6);
        paint.setShadowLayer(gl.L(2.33f), 0.0f, gl.L(1.0f), bkb.p1(f2, TLObject.FLAG_28));
        float[] fArr = this.x;
        fArr[3] = f;
        fArr[2] = f;
        fArr[1] = f;
        int i = 0;
        fArr[0] = f;
        float R1 = gl.R1(f, 0.0f, this.w);
        fArr[7] = R1;
        fArr[6] = R1;
        fArr[5] = R1;
        fArr[4] = R1;
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        float f7 = this.q;
        if (f7 > 0.0f && this.w > 0.0f && f2 > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            int p1 = bkb.p1(0.07f * f2 * this.w, gl.B(f5) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.h;
            paint2.setColor(p1);
            float f8 = rectF.left;
            canvas.drawRect(f8, rectF.top, (rectF.width() * f7) + f8, rectF.bottom, paint2);
            canvas.restore();
        }
        float R12 = gl.R1(this.o ? 1.0f : 0.0f, this.p ? 1.0f : 0.0f, this.w);
        int f9 = bm2.f(R12, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(f9);
        paint3.setStrokeWidth(gl.L(2.0f));
        canvas.save();
        canvas.translate(rectF.left, rectF.centerY());
        int f10 = bm2.f(R12, 553648127, 553648127);
        int L = gl.L(25.0f) + (-gl.L(25.0f));
        int i2 = -gl.L(25.0f);
        int L2 = gl.L(25.0f) + gl.L(25.0f);
        int L3 = gl.L(25.0f);
        ff0 ff0Var = this.l;
        ff0Var.setBounds(L, i2, L2, L3);
        if (this.k != f10) {
            this.k = f10;
            bkb.F1(ff0Var, f10, false);
        }
        ff0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.left + gl.L(18.0f), rectF.centerY() - gl.L(6.0f));
        float f11 = f6 * f3;
        int i3 = (int) f11;
        paint3.setAlpha(i3);
        canvas.drawPath(this.z, paint3);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.right - gl.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f11));
        canvas.drawPath(this.A, paint3);
        canvas.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int L4 = gl.L(24.0f);
            canvas.save();
            Rect rect = gl.Q;
            float f12 = L4;
            float f13 = f12 / 2.0f;
            rect.set((int) (rectF.left + gl.L(56.0f)), (int) (rectF.centerY() - f13), (int) (rectF.left + gl.L(56.0f) + f12), (int) (rectF.centerY() + f13));
            Paint paint4 = this.j;
            paint4.setAlpha(i3);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas.restore();
            i = gl.L(4.0f) + L4;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float L5 = gl.L(24.0f);
                int intrinsicHeight = (int) ((L5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = gl.Q;
                float f14 = (L5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + gl.L(56.0f)), (int) (rectF.centerY() - f14), (int) ((intrinsicHeight * 0.7f) + rectF.left + gl.L(56.0f)), (int) (rectF.centerY() + f14));
                if (f9 != this.t) {
                    this.t = f9;
                    drawable.setColorFilter(new PorterDuffColorFilter(f9, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i3);
                drawable.setBounds(rect2);
                drawable.draw(canvas);
                i = intrinsicHeight - gl.L(2.0f);
            }
        }
        tgb tgbVar = this.v;
        if (tgbVar != null) {
            tgbVar.p = (int) ((rectF.width() - gl.L(100.0f)) - r3);
            f4 = 1.0f;
            tgbVar.c(rectF.left + gl.L(60.0f) + i, rectF.centerY(), tb4.z(1.0f, this.w, f2, f3), f9, canvas);
            f9 = f9;
        } else {
            f4 = 1.0f;
        }
        float width = rectF.width() - gl.L(100.0f);
        float f15 = i;
        tgb tgbVar2 = this.u;
        tgbVar2.p = (int) (width - f15);
        tgbVar2.c(rectF.left + gl.L(60.0f) + f15, rectF.centerY(), (this.v == null ? f4 : this.w) * f2 * f3, f9, canvas);
    }

    public final float b() {
        float c = c();
        return this.f.d(this.d >= 0) * (c < 0.0f ? c + 1.0f : (c < 0.0f || c >= 1.0f) ? (1.0f - Math.min(1.0f, c - 1.0f)) * 0.87f : gl.R1(1.0f, 0.87f, c));
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.e(false, this.c);
    }
}
