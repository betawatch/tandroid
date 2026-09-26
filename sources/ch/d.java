package ch;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import v7.v7;
import w7.q;
import yf.e0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class d extends Drawable {
    public static final float[] E = new float[8];
    public static Path F = new Path();
    public final ah.a A;
    public final Rect B;
    public NinePatchDrawable C;
    public long D;
    public float a;
    public float b;
    public dh.a c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final c j;
    public b k;
    public int l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Matrix v;
    public final WeakReference w;
    public BitmapShader x;
    public final RectF y;
    public final RectF z;

    public d() {
        c cVar = new c();
        this.j = cVar;
        this.l = 255;
        this.p = 1.0f;
        this.q = new Paint(1);
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.t = new Paint(1);
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new Matrix();
        this.w = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.y = new RectF();
        this.z = new RectF();
        this.A = new ah.a();
        this.B = new Rect();
        cVar.i = AndroidUtilities.dpf2(1.0f);
        cVar.j = AndroidUtilities.dpf2(0.6666667f);
        this.n = AndroidUtilities.dpf2(1.0f);
        this.o = AndroidUtilities.dpf2(0.33333334f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
    
        if (r4 == r20[7]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == r20[3]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Canvas canvas, float f7, float f10, float[] fArr, float f11, boolean z10, Paint paint) {
        boolean z11;
        float f12;
        if (z10) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (f13 == f14) {
                float f15 = fArr[2];
                if (f14 == f15) {
                }
            }
            z11 = false;
        } else {
            float f16 = fArr[4];
            float f17 = fArr[5];
            if (f16 == f17) {
                float f18 = fArr[6];
                if (f17 == f18) {
                }
            }
            z11 = false;
        }
        float f19 = f11 / 2.0f;
        if (z10) {
            if (z11) {
                canvas.save();
                if (canvas.clipRect(0.0f, 0.0f, f7, q.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                    float f20 = fArr[0];
                    canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f7 + f19, f10 + f19, f20, f20, paint);
                }
                canvas.restore();
                return;
            }
            float f21 = (0.0f + f7) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f21, q.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                f12 = 0.0f;
                canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f7 + f19, f10 + f19, fArr[0], fArr[1], paint);
            } else {
                f12 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f21, f12, f7, q.a((fArr[0] * 2.0f) + f12, f12, f10))) {
                canvas.drawRoundRect(f12 - f19, f12 + f19, f7 + f19, f10 + f19, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z11) {
            canvas.save();
            if (canvas.clipRect(0.0f, q.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f7, f10)) {
                float f22 = 0.0f - f19;
                float f23 = fArr[4];
                canvas.drawRoundRect(f22, f22, f7 + f19, f10 - f19, f23, f23, paint);
            }
            canvas.restore();
            return;
        }
        float f24 = (0.0f + f7) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, q.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f24, f10)) {
            float f25 = 0.0f - f19;
            canvas.drawRoundRect(f25, f25, f7 + f19, f10 - f19, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f24, q.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f7, f10)) {
            float f26 = 0.0f - f19;
            canvas.drawRoundRect(f26, f26, f7 + f19, f10 - f19, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public static void f(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, q.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, q.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f7, f7, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (e0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = F;
        if (path == null) {
            F = new Path();
        } else {
            path.rewind();
        }
        F.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(F);
    }

    public final NinePatchDrawable a(int i10, boolean z10) {
        ah.a aVar = this.A;
        aVar.b = 0L;
        aVar.a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.j;
        for (float f7 : cVar.b) {
            aVar.c(f7);
        }
        aVar.c(this.n);
        aVar.c(0.0f);
        aVar.c(this.o);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f);
            aVar.a(this.g);
            aVar.c(cVar.i);
            aVar.c(cVar.j);
        }
        long j3 = aVar.a ? -1L : aVar.b;
        if (this.C == null || this.D != j3) {
            this.D = j3;
            NinePatchDrawable b10 = v7.b(null, cVar.b, this.n, this.o, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
            this.C = b10;
            b10.getPadding(this.B);
        }
        return this.C;
    }

    public final void b() {
        Rect rect = this.j.m;
        RectF rectF = this.y;
        rectF.set(rect);
        rectF.offset(this.a, this.b);
        RectF rectF2 = this.z;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        m();
    }

    public final void c(Canvas canvas, fh.a aVar) {
        int i10;
        c cVar = this.j;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.e) == 255) {
            d(canvas, 0);
            return;
        }
        if (aVar instanceof fh.c) {
            d(canvas, ((fh.c) aVar).a.getColor());
            return;
        }
        if (aVar instanceof fh.b) {
            fh.b bVar = (fh.b) aVar;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.w.get();
            Paint paint = this.s;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.x = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.x = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.d) > 0) {
                NinePatchDrawable a2 = a(0, false);
                int i11 = rect2.left;
                Rect rect3 = this.B;
                a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                a2.setAlpha(this.l);
                a2.draw(canvas);
            }
            if (this.x != null && bitmap != null && !bitmap.isRecycled() && this.l > 0) {
                Matrix matrix = bVar.b;
                Matrix matrix2 = this.v;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.a, -this.b);
                this.x.setLocalMatrix(matrix2);
                paint.setAlpha(this.l);
                cVar.b(canvas, paint);
            }
            int l1 = h6.l1(this.l / 255.0f, this.e);
            if (Color.alpha(l1) > 0) {
                Paint paint2 = this.t;
                paint2.setColor(l1);
                cVar.b(canvas, paint2);
            }
            g(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof fh.d)) {
            fh.d dVar = (fh.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            c(canvas, dVar.a);
            return;
        }
        if (aVar instanceof fh.e) {
            c(canvas, ((fh.e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.l) == 0) {
            return;
        }
        int l12 = h6.l1(i10 / 255.0f, this.e);
        if (Color.alpha(this.d) > 0 && this.l == 255) {
            float f7 = this.p;
            if (f7 > 0.0f) {
                float f10 = this.n;
                float f11 = this.o;
                int l13 = h6.l1(f7, this.d);
                Paint paint3 = this.u;
                paint3.setShadowLayer(f10, 0.0f, f11, l13);
                cVar.c(canvas, paint3, this.m);
            }
        }
        float f12 = this.a;
        float f13 = this.b;
        float f14 = rect2.left;
        float f15 = f14 + f12;
        float f16 = rect2.top;
        float f17 = f16 + f13;
        float f18 = rect2.right;
        float f19 = f18 + f12;
        float f20 = rect2.bottom;
        float f21 = f20 + f13;
        int i12 = this.l;
        boolean z10 = i12 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
        }
        canvas.save();
        canvas.clipPath(cVar.k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f15, -f17);
        aVar.y(canvas, f15, f17, f19, f21);
        canvas.restore();
        if (Color.alpha(l12) > 0) {
            Paint paint4 = this.q;
            paint4.setColor(l12);
            cVar.b(canvas, paint4);
        }
        g(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    public final void d(Canvas canvas, int i10) {
        int h = i0.a.h(this.e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.j.m;
        int i11 = rect.left;
        Rect rect2 = this.B;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.l);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = h6.l1(this.l / 255.0f, this.f);
        int l12 = h6.l1(this.l / 255.0f, this.g);
        int alpha = Color.alpha(l1);
        c cVar = this.j;
        Paint paint = this.r;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.o, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c cVar = this.j;
        h(outline, cVar.m, cVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.j;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    public abstract fh.a i();

    public boolean j() {
        return false;
    }

    public void k() {
        b();
    }

    public void l() {
        b();
    }

    public final void o(dh.a aVar) {
        this.c = aVar;
        v();
        if (aVar instanceof dh.e) {
            dh.e eVar = (dh.e) aVar;
            float f7 = eVar.f;
            float f10 = eVar.h;
            c cVar = this.j;
            cVar.i = f7;
            cVar.j = f10;
            float f11 = eVar.n;
            float f12 = eVar.r;
            this.n = f11;
            this.o = f12;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.j;
        cVar.a.set(rect);
        cVar.a();
        k();
    }

    public final void p(int i10) {
        c cVar = this.j;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            k();
        }
    }

    public final void q(float f7) {
        c cVar = this.j;
        Arrays.fill(cVar.b, f7);
        Arrays.fill(cVar.c, f7);
        cVar.a();
        k();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.j;
        float[] fArr = cVar.b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        k();
    }

    public final void s(float f7, float f10, float f11, float f12) {
        c cVar = this.j;
        float[] fArr = cVar.b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.l = i10;
    }

    public final void t(float f7, float f10) {
        if (this.a == f7 && this.b == f10) {
            return;
        }
        this.a = f7;
        this.b = f10;
        l();
    }

    public final void u(int i10) {
        this.j.f = i10;
        k();
    }

    public void v() {
        dh.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.H();
        this.d = this.c.m();
        this.f = this.c.a();
        this.g = this.c.c();
    }

    public void m() {
    }

    public d n() {
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void w() {
    }
}
