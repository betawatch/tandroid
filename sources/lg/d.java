package lg;

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
import g.y;
import gf.m0;
import h7.l6;
import h7.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float a;
    public float b;
    public mg.a c;
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
    public final y y;
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
        this.y = new y();
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
    public static void e(Canvas canvas, float f10, float f11, float[] fArr, float f12, boolean z10, Paint paint) {
        boolean z11;
        float f13;
        if (z10) {
            float f14 = fArr[0];
            float f15 = fArr[1];
            if (f14 == f15) {
                float f16 = fArr[2];
                if (f15 == f16) {
                }
            }
            z11 = false;
        } else {
            float f17 = fArr[4];
            float f18 = fArr[5];
            if (f17 == f18) {
                float f19 = fArr[6];
                if (f18 == f19) {
                }
            }
            z11 = false;
        }
        float f20 = f12 / 2.0f;
        if (z10) {
            if (z11) {
                canvas.save();
                if (canvas.clipRect(0.0f, 0.0f, f10, n.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f11))) {
                    float f21 = fArr[0];
                    canvas.drawRoundRect(0.0f - f20, 0.0f + f20, f10 + f20, f11 + f20, f21, f21, paint);
                }
                canvas.restore();
                return;
            }
            float f22 = (0.0f + f10) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f22, n.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f11))) {
                f13 = 0.0f;
                canvas.drawRoundRect(0.0f - f20, 0.0f + f20, f10 + f20, f11 + f20, fArr[0], fArr[1], paint);
            } else {
                f13 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f22, f13, f10, n.a((fArr[0] * 2.0f) + f13, f13, f11))) {
                canvas.drawRoundRect(f13 - f20, f13 + f20, f10 + f20, f11 + f20, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z11) {
            canvas.save();
            if (canvas.clipRect(0.0f, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f10, f11)) {
                float f23 = 0.0f - f20;
                float f24 = fArr[4];
                canvas.drawRoundRect(f23, f23, f10 + f20, f11 - f20, f24, f24, paint);
            }
            canvas.restore();
            return;
        }
        float f25 = (0.0f + f10) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f25, f11)) {
            float f26 = 0.0f - f20;
            canvas.drawRoundRect(f26, f26, f10 + f20, f11 - f20, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f25, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f10, f11)) {
            float f27 = 0.0f - f20;
            canvas.drawRoundRect(f27, f27, f10 + f20, f11 - f20, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public static void f(Canvas canvas, RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        float f16 = f11 / 2.0f;
        canvas.save();
        if (z10) {
            float f17 = f12 - f16;
            float f18 = f14 + f16;
            if (canvas.clipRect(f17, f13, f18, n.a((2.0f * f10) + f13, f13, f15))) {
                canvas.drawRoundRect(f17, f13 + f16, f18, f15 + f16, f10, f10, paint);
            }
        } else {
            float f19 = f12 - f16;
            float f20 = f14 + f16;
            if (canvas.clipRect(f19, n.a(f15 - (2.0f * f10), f13, f15), f20, f15)) {
                canvas.drawRoundRect(f19, f13 - f16, f20, f15 - f16, f10, f10, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (m0.c(fArr)) {
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
        y yVar = this.y;
        yVar.a = 0L;
        yVar.b = false;
        yVar.a(i10);
        yVar.a(this.d);
        c cVar = this.h;
        for (float f10 : cVar.b) {
            yVar.c(f10);
        }
        yVar.c(this.l);
        yVar.c(0.0f);
        yVar.c(this.m);
        yVar.b(z10);
        if (z10) {
            yVar.a(this.f);
            yVar.a(this.g);
            yVar.c(cVar.i);
            yVar.c(cVar.j);
        }
        long j10 = yVar.b ? -1L : yVar.a;
        if (this.A == null || this.B != j10) {
            this.B = j10;
            NinePatchDrawable b10 = l6.b(null, cVar.b, this.l, this.m, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
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

    public final void c(Canvas canvas, og.a aVar) {
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
        if (aVar instanceof og.c) {
            d(canvas, ((og.c) aVar).a.getColor());
            return;
        }
        if (aVar instanceof og.b) {
            og.b bVar = (og.b) aVar;
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
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof og.d)) {
            og.d dVar = (og.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            c(canvas, dVar.a);
            return;
        }
        if (aVar instanceof og.e) {
            c(canvas, ((og.e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.j) == 0) {
            return;
        }
        int l12 = g6.l1(i10 / 255.0f, this.e);
        if (Color.alpha(this.d) > 0 && this.j == 255) {
            float f10 = this.n;
            if (f10 > 0.0f) {
                float f11 = this.l;
                float f12 = this.m;
                int l13 = g6.l1(f10, this.d);
                Paint paint3 = this.s;
                paint3.setShadowLayer(f11, 0.0f, f12, l13);
                cVar.c(canvas, paint3, this.k);
            }
        }
        float f13 = this.a;
        float f14 = this.b;
        float f15 = rect2.left;
        float f16 = f15 + f13;
        float f17 = rect2.top;
        float f18 = f17 + f14;
        float f19 = rect2.right;
        float f20 = f19 + f13;
        float f21 = rect2.bottom;
        float f22 = f21 + f14;
        int i12 = this.j;
        boolean z10 = i12 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f15, f17, f19, f21, i12);
        }
        canvas.save();
        canvas.clipPath(cVar.k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f16, -f18);
        aVar.T0(canvas, f16, f18, f20, f22);
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
        int h = i0.b.h(this.e, i10);
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

    public abstract og.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(mg.a aVar) {
        this.c = aVar;
        u();
        if (aVar instanceof mg.d) {
            mg.d dVar = (mg.d) aVar;
            float f10 = dVar.f;
            float f11 = dVar.h;
            c cVar = this.h;
            cVar.i = f10;
            cVar.j = f11;
            float f12 = dVar.n;
            float f13 = dVar.r;
            this.l = f12;
            this.m = f13;
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

    public final void p(float f10) {
        c cVar = this.h;
        Arrays.fill(cVar.b, f10);
        Arrays.fill(cVar.c, f10);
        cVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        c cVar = this.h;
        float[] fArr = cVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = f12;
        fArr[4] = f12;
        fArr[7] = f13;
        fArr[6] = f13;
        cVar.a();
        j();
    }

    public final void r(float f10, float f11, float f12, float f13) {
        c cVar = this.h;
        float[] fArr = cVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.c;
        fArr2[1] = f10;
        fArr2[0] = f10;
        fArr2[3] = f11;
        fArr2[2] = f11;
        fArr2[5] = f12;
        fArr2[4] = f12;
        fArr2[7] = f13;
        fArr2[6] = f13;
        cVar.a();
        j();
    }

    public final void s(float f10, float f11) {
        if (this.a == f10 && this.b == f11) {
            return;
        }
        this.a = f10;
        this.b = f11;
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
        mg.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.p2();
        this.d = this.c.J1();
        this.f = this.c.h0();
        this.g = this.c.K0();
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
