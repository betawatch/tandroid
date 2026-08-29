package ng;

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
import g.x;
import i7.n7;
import i7.w;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jf.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float a;
    public float b;
    public og.a c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final c h;
    public b i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public final Paint o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Matrix t;
    public final WeakReference u;
    public BitmapShader v;
    public final RectF w;
    public final RectF x;
    public final x y;
    public final Rect z;

    public d() {
        c cVar = new c();
        this.h = cVar;
        this.j = 255;
        this.n = 1.0f;
        this.o = new Paint(1);
        this.p = new Paint(1);
        Paint paint = new Paint(1);
        this.q = paint;
        this.r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.t = new Matrix();
        this.u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.w = new RectF();
        this.x = new RectF();
        this.y = new x();
        this.z = new Rect();
        cVar.i = AndroidUtilities.dpf2(1.0f);
        cVar.j = AndroidUtilities.dpf2(0.6666667f);
        this.l = AndroidUtilities.dpf2(1.0f);
        this.m = AndroidUtilities.dpf2(0.33333334f);
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
    public static void e(Canvas canvas, float f9, float f10, float[] fArr, float f11, boolean z10, Paint paint) {
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
                if (canvas.clipRect(0.0f, 0.0f, f9, w.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                    float f20 = fArr[0];
                    canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f9 + f19, f10 + f19, f20, f20, paint);
                }
                canvas.restore();
                return;
            }
            float f21 = (0.0f + f9) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f21, w.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                f12 = 0.0f;
                canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f9 + f19, f10 + f19, fArr[0], fArr[1], paint);
            } else {
                f12 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f21, f12, f9, w.a((fArr[0] * 2.0f) + f12, f12, f10))) {
                canvas.drawRoundRect(f12 - f19, f12 + f19, f9 + f19, f10 + f19, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z11) {
            canvas.save();
            if (canvas.clipRect(0.0f, w.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f9, f10)) {
                float f22 = 0.0f - f19;
                float f23 = fArr[4];
                canvas.drawRoundRect(f22, f22, f9 + f19, f10 - f19, f23, f23, paint);
            }
            canvas.restore();
            return;
        }
        float f24 = (0.0f + f9) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, w.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f24, f10)) {
            float f25 = 0.0f - f19;
            canvas.drawRoundRect(f25, f25, f9 + f19, f10 - f19, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f24, w.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f9, f10)) {
            float f26 = 0.0f - f19;
            canvas.drawRoundRect(f26, f26, f9 + f19, f10 - f19, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public static void f(Canvas canvas, RectF rectF, float f9, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, w.a((2.0f * f9) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f9, f9, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, w.a(f14 - (2.0f * f9), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f9, f9, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (l0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = D;
        if (path == null) {
            D = new Path();
        } else {
            path.rewind();
        }
        D.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(D);
    }

    public final NinePatchDrawable a(int i10, boolean z10) {
        x xVar = this.y;
        xVar.a = 0L;
        xVar.b = false;
        xVar.a(i10);
        xVar.a(this.d);
        c cVar = this.h;
        for (float f9 : cVar.b) {
            xVar.c(f9);
        }
        xVar.c(this.l);
        xVar.c(0.0f);
        xVar.c(this.m);
        xVar.b(z10);
        if (z10) {
            xVar.a(this.f);
            xVar.a(this.g);
            xVar.c(cVar.i);
            xVar.c(cVar.j);
        }
        long j10 = xVar.b ? -1L : xVar.a;
        if (this.A == null || this.B != j10) {
            this.B = j10;
            NinePatchDrawable b10 = n7.b(null, cVar.b, this.l, this.m, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
            this.A = b10;
            b10.getPadding(this.z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.m;
        RectF rectF = this.w;
        rectF.set(rect);
        rectF.offset(this.a, this.b);
        RectF rectF2 = this.x;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        l();
    }

    public final void c(Canvas canvas, qg.a aVar) {
        int i10;
        c cVar = this.h;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.e) == 255) {
            d(canvas, 0);
            return;
        }
        if (aVar instanceof qg.c) {
            d(canvas, ((qg.c) aVar).a.getColor());
            return;
        }
        if (aVar instanceof qg.b) {
            qg.b bVar = (qg.b) aVar;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.u.get();
            Paint paint = this.q;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.v = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.v = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.d) > 0) {
                NinePatchDrawable a2 = a(0, false);
                int i11 = rect2.left;
                Rect rect3 = this.z;
                a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                a2.setAlpha(this.j);
                a2.draw(canvas);
            }
            if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.j > 0) {
                Matrix matrix = bVar.b;
                Matrix matrix2 = this.t;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.a, -this.b);
                this.v.setLocalMatrix(matrix2);
                paint.setAlpha(this.j);
                cVar.b(canvas, paint);
            }
            int l1 = g6.l1(this.j / 255.0f, this.e);
            if (Color.alpha(l1) > 0) {
                Paint paint2 = this.r;
                paint2.setColor(l1);
                cVar.b(canvas, paint2);
            }
            g(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof qg.d)) {
            qg.d dVar = (qg.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            c(canvas, dVar.a);
            return;
        }
        if (aVar instanceof qg.e) {
            c(canvas, ((qg.e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.j) == 0) {
            return;
        }
        int l12 = g6.l1(i10 / 255.0f, this.e);
        if (Color.alpha(this.d) > 0 && this.j == 255) {
            float f9 = this.n;
            if (f9 > 0.0f) {
                float f10 = this.l;
                float f11 = this.m;
                int l13 = g6.l1(f9, this.d);
                Paint paint3 = this.s;
                paint3.setShadowLayer(f10, 0.0f, f11, l13);
                cVar.c(canvas, paint3, this.k);
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
        int i12 = this.j;
        boolean z10 = i12 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
        }
        canvas.save();
        canvas.clipPath(cVar.k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f15, -f17);
        aVar.E0(canvas, f15, f17, f19, f21);
        canvas.restore();
        if (Color.alpha(l12) > 0) {
            Paint paint4 = this.o;
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
        Rect rect = this.h.m;
        int i11 = rect.left;
        Rect rect2 = this.z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = g6.l1(this.j / 255.0f, this.f);
        int l12 = g6.l1(this.j / 255.0f, this.g);
        int alpha = Color.alpha(l1);
        c cVar = this.h;
        Paint paint = this.p;
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
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c cVar = this.h;
        h(outline, cVar.m, cVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.h;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    public abstract qg.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(og.a aVar) {
        this.c = aVar;
        u();
        if (aVar instanceof og.d) {
            og.d dVar = (og.d) aVar;
            float f9 = dVar.f;
            float f10 = dVar.h;
            c cVar = this.h;
            cVar.i = f9;
            cVar.j = f10;
            float f11 = dVar.n;
            float f12 = dVar.r;
            this.l = f11;
            this.m = f12;
        }
    }

    public final void o(int i10) {
        c cVar = this.h;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            j();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.h;
        cVar.a.set(rect);
        cVar.a();
        j();
    }

    public final void p(float f9) {
        c cVar = this.h;
        Arrays.fill(cVar.b, f9);
        Arrays.fill(cVar.c, f9);
        cVar.a();
        j();
    }

    public final void q(float f9, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.b;
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        j();
    }

    public final void r(float f9, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.b;
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.c;
        fArr2[1] = f9;
        fArr2[0] = f9;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        j();
    }

    public final void s(float f9, float f10) {
        if (this.a == f9 && this.b == f10) {
            return;
        }
        this.a = f9;
        this.b = f10;
        k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.j = i10;
    }

    public final void t(int i10) {
        this.h.f = i10;
        j();
    }

    public void u() {
        og.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.z();
        this.d = this.c.v();
        this.f = this.c.h();
        this.g = this.c.m();
    }

    public void l() {
    }

    public d m() {
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
