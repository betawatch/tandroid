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
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import v7.u7;
import w7.e9;
import w7.q;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class d extends li.e {
    public static final float[] F = new float[8];
    public static Path G = new Path();
    public final RectF A;
    public final ah.a B;
    public final Rect C;
    public NinePatchDrawable D;
    public long E;
    public dh.a e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final c l;
    public b m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Paint v;
    public final Matrix w;
    public final WeakReference x;
    public BitmapShader y;
    public final RectF z;

    public d() {
        c cVar = new c();
        this.l = cVar;
        this.q = 1.0f;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.t = paint;
        this.u = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new Matrix();
        this.x = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.z = new RectF();
        this.A = new RectF();
        this.B = new ah.a();
        this.C = new Rect();
        cVar.i = AndroidUtilities.dpf2(1.0f);
        cVar.j = AndroidUtilities.dpf2(0.6666667f);
        this.o = AndroidUtilities.dpf2(1.0f);
        this.p = AndroidUtilities.dpf2(0.33333334f);
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
    public static void p(Canvas canvas, float f7, float f10, float[] fArr, float f11, boolean z10, Paint paint) {
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

    public static void q(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
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

    public static void s(Outline outline, Rect rect, float[] fArr) {
        if (e9.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = G;
        if (path == null) {
            G = new Path();
        } else {
            path.rewind();
        }
        G.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(G);
    }

    public final void A(float f7, float f10, float f11, float f12) {
        c cVar = this.l;
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
        u();
    }

    public final void B(int i10) {
        this.l.f = i10;
        u();
    }

    @Override // li.e
    public final void b(Rect rect) {
        rect.set(this.l.m);
    }

    @Override // li.e
    public final int c() {
        return this.j;
    }

    @Override // li.e
    public final int d() {
        return this.k;
    }

    @Override // li.e
    public boolean e() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c cVar = this.l;
        s(outline, cVar.m, cVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.l;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    @Override // li.e
    public void h() {
        m();
    }

    @Override // li.e
    public boolean j() {
        return this instanceof e;
    }

    @Override // li.e
    public void k() {
        dh.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        this.g = aVar.H();
        this.f = this.e.B();
        this.h = this.e.a();
        this.i = this.e.c();
    }

    public final NinePatchDrawable l(int i10, boolean z10) {
        ah.a aVar = this.B;
        aVar.b = 0L;
        aVar.a = false;
        aVar.a(i10);
        aVar.a(this.f);
        c cVar = this.l;
        for (float f7 : cVar.b) {
            aVar.c(f7);
        }
        aVar.c(this.o);
        aVar.c(0.0f);
        aVar.c(this.p);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.h);
            aVar.a(this.i);
            aVar.c(cVar.i);
            aVar.c(cVar.j);
        }
        long j3 = aVar.a ? -1L : aVar.b;
        if (this.D == null || this.E != j3) {
            this.E = j3;
            NinePatchDrawable b10 = u7.b(null, cVar.b, this.o, this.p, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
            this.D = b10;
            b10.getPadding(this.C);
        }
        return this.D;
    }

    public final void m() {
        Rect rect = this.l.m;
        RectF rectF = this.z;
        rectF.set(rect);
        rectF.offset(this.c, this.d);
        RectF rectF2 = this.A;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
    }

    public final void n(Canvas canvas, fh.a aVar) {
        int i10;
        c cVar = this.l;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.g) == 255) {
            o(canvas, 0);
            return;
        }
        if (aVar instanceof fh.c) {
            o(canvas, ((fh.c) aVar).b);
            return;
        }
        if (aVar instanceof fh.b) {
            fh.b bVar = (fh.b) aVar;
            int i11 = this.b;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.x.get();
            Paint paint = this.t;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.y = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.y = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.f) > 0) {
                NinePatchDrawable l4 = l(0, false);
                int i12 = rect2.left;
                Rect rect3 = this.C;
                l4.setBounds(i12 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                l4.setAlpha(i11);
                l4.draw(canvas);
            }
            if (this.y != null && bitmap != null && !bitmap.isRecycled() && i11 > 0) {
                Matrix matrix = bVar.b;
                Matrix matrix2 = this.w;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.c, -this.d);
                this.y.setLocalMatrix(matrix2);
                paint.setAlpha(i11);
                cVar.b(canvas, paint);
            }
            int l1 = i6.l1(i11 / 255.0f, this.g);
            if (Color.alpha(l1) > 0) {
                Paint paint2 = this.u;
                paint2.setColor(l1);
                cVar.b(canvas, paint2);
            }
            r(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof fh.d)) {
            fh.d dVar = (fh.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            n(canvas, dVar.a);
            return;
        }
        if (aVar instanceof fh.e) {
            n(canvas, ((fh.e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.b) == 0) {
            return;
        }
        int l12 = i6.l1(i10 / 255.0f, this.g);
        if (Color.alpha(this.f) > 0 && i10 == 255) {
            float f7 = this.q;
            if (f7 > 0.0f) {
                float f10 = this.o;
                float f11 = this.p;
                int l13 = i6.l1(f7, this.f);
                Paint paint3 = this.v;
                paint3.setShadowLayer(f10, 0.0f, f11, l13);
                cVar.c(canvas, paint3, this.n);
            }
        }
        float f12 = this.c;
        float f13 = this.d;
        float f14 = rect2.left;
        float f15 = f14 + f12;
        float f16 = rect2.top;
        float f17 = f16 + f13;
        float f18 = rect2.right;
        float f19 = f18 + f12;
        float f20 = rect2.bottom;
        float f21 = f20 + f13;
        boolean z10 = i10 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f14, f16, f18, f20, i10);
        }
        canvas.save();
        canvas.clipPath(cVar.k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f15, -f17);
        aVar.v(canvas, f15, f17, f19, f21);
        canvas.restore();
        if (Color.alpha(l12) > 0) {
            Paint paint4 = this.r;
            paint4.setColor(l12);
            cVar.b(canvas, paint4);
        }
        r(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    public final void o(Canvas canvas, int i10) {
        int i11 = this.b;
        int h = i0.a.h(this.g, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.f) == 0) {
            return;
        }
        NinePatchDrawable l4 = l(h, true);
        Rect rect = this.l.m;
        int i12 = rect.left;
        Rect rect2 = this.C;
        l4.setBounds(i12 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        l4.setAlpha(i11);
        l4.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.l;
        cVar.a.set(rect);
        cVar.a();
        u();
    }

    public final void r(Canvas canvas) {
        float f7 = this.b / 255.0f;
        int l1 = i6.l1(f7, this.h);
        int l12 = i6.l1(f7, this.i);
        int alpha = Color.alpha(l1);
        c cVar = this.l;
        Paint paint = this.s;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.o, paint);
        }
    }

    public abstract fh.a t();

    public void u() {
        m();
    }

    public final void w(dh.a aVar) {
        this.e = aVar;
        k();
        if (aVar instanceof dh.e) {
            dh.e eVar = (dh.e) aVar;
            float f7 = eVar.f;
            float f10 = eVar.h;
            c cVar = this.l;
            cVar.i = f7;
            cVar.j = f10;
            float f11 = eVar.n;
            float f12 = eVar.r;
            this.o = f11;
            this.p = f12;
        }
    }

    public final void x(int i10) {
        c cVar = this.l;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            u();
        }
    }

    public final void y(float f7) {
        c cVar = this.l;
        Arrays.fill(cVar.b, f7);
        Arrays.fill(cVar.c, f7);
        cVar.a();
        u();
    }

    public final void z(float f7, float f10, float f11, float f12) {
        c cVar = this.l;
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
        u();
    }

    @Override // li.e
    public void a() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public d v() {
        return this;
    }
}
