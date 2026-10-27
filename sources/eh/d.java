package eh;

import a8.ee;
import a8.w0;
import a8.yc;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class d extends oi.e implements p6 {
    public static final float[] W = new float[8];
    public static Path X = new Path();
    public boolean E;
    public float F;
    public float G;
    public float H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public final Paint M;
    public final Matrix N;
    public final WeakReference O;
    public BitmapShader P;
    public final RectF Q;
    public final RectF R;
    public final ch.a S;
    public final Rect T;
    public NinePatchDrawable U;
    public long V;
    public fh.a e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w = f7.b;
    public final c x;
    public b y;

    public d() {
        c cVar = new c();
        this.x = cVar;
        this.H = 1.0f;
        this.I = new Paint(1);
        this.J = new Paint(1);
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new Paint(1);
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.N = new Matrix();
        this.O = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new ch.a();
        this.T = new Rect();
        cVar.i = AndroidUtilities.dpf2(1.0f);
        cVar.j = AndroidUtilities.dpf2(0.6666667f);
        this.F = AndroidUtilities.dpf2(1.0f);
        this.G = AndroidUtilities.dpf2(0.33333334f);
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
    public static void o(Canvas canvas, float f7, float f10, float[] fArr, float f11, boolean z10, Paint paint) {
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
                if (canvas.clipRect(0.0f, 0.0f, f7, ee.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                    float f20 = fArr[0];
                    canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f7 + f19, f10 + f19, f20, f20, paint);
                }
                canvas.restore();
                return;
            }
            float f21 = (0.0f + f7) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f21, ee.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                f12 = 0.0f;
                canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f7 + f19, f10 + f19, fArr[0], fArr[1], paint);
            } else {
                f12 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f21, f12, f7, ee.a((fArr[0] * 2.0f) + f12, f12, f10))) {
                canvas.drawRoundRect(f12 - f19, f12 + f19, f7 + f19, f10 + f19, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z11) {
            canvas.save();
            if (canvas.clipRect(0.0f, ee.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f7, f10)) {
                float f22 = 0.0f - f19;
                float f23 = fArr[4];
                canvas.drawRoundRect(f22, f22, f7 + f19, f10 - f19, f23, f23, paint);
            }
            canvas.restore();
            return;
        }
        float f24 = (0.0f + f7) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, ee.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f24, f10)) {
            float f25 = 0.0f - f19;
            canvas.drawRoundRect(f25, f25, f7 + f19, f10 - f19, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f24, ee.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f7, f10)) {
            float f26 = 0.0f - f19;
            canvas.drawRoundRect(f26, f26, f7 + f19, f10 - f19, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public static void p(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, ee.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, ee.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f7, f7, paint);
            }
        }
        canvas.restore();
    }

    public static void r(Outline outline, Rect rect, float[] fArr) {
        if (w0.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = X;
        if (path == null) {
            X = new Path();
        } else {
            path.rewind();
        }
        X.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(X);
    }

    public final void A(int i10) {
        this.x.f = i10;
        t();
    }

    @Override // oi.e
    public final void b(Rect rect) {
        rect.set(this.x.m);
    }

    @Override // oi.e
    public final int c() {
        return this.s;
    }

    @Override // oi.e
    public final int d() {
        return this.v;
    }

    @Override // oi.e
    public boolean e() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c cVar = this.x;
        r(outline, cVar.m, cVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.x;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    @Override // oi.e
    public void h() {
        l();
    }

    @Override // oi.e
    public boolean j() {
        return this instanceof e;
    }

    public final NinePatchDrawable k(int i10, boolean z10) {
        ch.a aVar = this.S;
        aVar.b = 0L;
        aVar.a = false;
        aVar.a(i10);
        aVar.a(this.f);
        c cVar = this.x;
        for (float f7 : cVar.b) {
            aVar.c(f7);
        }
        aVar.c(this.F);
        aVar.c(0.0f);
        aVar.c(this.G);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.n);
            aVar.a(this.r);
            aVar.c(cVar.i);
            aVar.c(cVar.j);
        }
        long j10 = aVar.a ? -1L : aVar.b;
        if (this.U == null || this.V != j10) {
            this.V = j10;
            NinePatchDrawable b10 = yc.b(null, cVar.b, this.F, this.G, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
            this.U = b10;
            b10.getPadding(this.T);
        }
        return this.U;
    }

    public final void l() {
        Rect rect = this.x.m;
        RectF rectF = this.Q;
        rectF.set(rect);
        rectF.offset(this.c, this.d);
        RectF rectF2 = this.R;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
    }

    public final void m(Canvas canvas, hh.a aVar) {
        int i10;
        c cVar = this.x;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.h) == 255) {
            n(canvas, 0);
            return;
        }
        if (aVar instanceof hh.c) {
            n(canvas, ((hh.c) aVar).b);
            return;
        }
        if (aVar instanceof hh.b) {
            hh.b bVar = (hh.b) aVar;
            int i11 = this.b;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.O.get();
            Paint paint = this.K;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.P = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.P = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.f) > 0) {
                NinePatchDrawable k10 = k(0, false);
                int i12 = rect2.left;
                Rect rect3 = this.T;
                k10.setBounds(i12 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                k10.setAlpha(i11);
                k10.draw(canvas);
            }
            if (this.P != null && bitmap != null && !bitmap.isRecycled() && i11 > 0) {
                Matrix matrix = bVar.b;
                Matrix matrix2 = this.N;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.c, -this.d);
                this.P.setLocalMatrix(matrix2);
                paint.setAlpha(i11);
                cVar.b(canvas, paint);
            }
            int o12 = y6.o1(i11 / 255.0f, this.h);
            if (Color.alpha(o12) > 0) {
                Paint paint2 = this.L;
                paint2.setColor(o12);
                cVar.b(canvas, paint2);
            }
            q(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof hh.d)) {
            hh.d dVar = (hh.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            m(canvas, dVar.a);
            return;
        }
        if (aVar instanceof hh.e) {
            m(canvas, ((hh.e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.b) == 0) {
            return;
        }
        int o13 = y6.o1(i10 / 255.0f, this.h);
        if (Color.alpha(this.f) > 0 && i10 == 255) {
            float f7 = this.H;
            if (f7 > 0.0f) {
                float f10 = this.F;
                float f11 = this.G;
                int o14 = y6.o1(f7, this.f);
                Paint paint3 = this.M;
                paint3.setShadowLayer(f10, 0.0f, f11, o14);
                cVar.c(canvas, paint3, this.E);
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
        aVar.w(canvas, f15, f17, f19, f21);
        canvas.restore();
        if (Color.alpha(o13) > 0) {
            Paint paint4 = this.I;
            paint4.setColor(o13);
            cVar.b(canvas, paint4);
        }
        q(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    public final void n(Canvas canvas, int i10) {
        int i11 = this.b;
        int k10 = i0.a.k(this.h, i10);
        if (Color.alpha(k10) == 0 && Color.alpha(this.f) == 0) {
            return;
        }
        NinePatchDrawable k11 = k(k10, true);
        Rect rect = this.x.m;
        int i12 = rect.left;
        Rect rect2 = this.T;
        k11.setBounds(i12 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        k11.setAlpha(i11);
        k11.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.x;
        cVar.a.set(rect);
        cVar.a();
        t();
    }

    public final void q(Canvas canvas) {
        float f7 = this.b / 255.0f;
        int o12 = y6.o1(f7, this.n);
        int o13 = y6.o1(f7, this.r);
        int alpha = Color.alpha(o12);
        c cVar = this.x;
        Paint paint = this.J;
        if (alpha > 0) {
            paint.setColor(o12);
            canvas.drawPath(cVar.n, paint);
        }
        if (Color.alpha(o13) > 0) {
            paint.setColor(o13);
            canvas.drawPath(cVar.o, paint);
        }
    }

    public abstract hh.a s();

    public void t() {
        l();
    }

    @Override // oi.e, org.telegram.ui.ActionBar.p6
    public void updateColors() {
        this.w = f7.b;
        fh.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).c();
        }
        this.h = this.e.v0();
        this.f = this.e.f0();
        this.n = this.e.t();
        this.r = this.e.A();
    }

    public final void v(fh.a aVar) {
        this.e = aVar;
        updateColors();
        if (aVar instanceof fh.e) {
            fh.e eVar = (fh.e) aVar;
            float f7 = eVar.f;
            float f10 = eVar.h;
            c cVar = this.x;
            cVar.i = f7;
            cVar.j = f10;
            float f11 = eVar.n;
            float f12 = eVar.r;
            this.F = f11;
            this.G = f12;
        }
    }

    public final void w(int i10) {
        c cVar = this.x;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            t();
        }
    }

    public final void x(float f7) {
        c cVar = this.x;
        Arrays.fill(cVar.b, f7);
        Arrays.fill(cVar.c, f7);
        cVar.a();
        t();
    }

    public final void y(float f7, float f10, float f11, float f12) {
        c cVar = this.x;
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
        t();
    }

    public final void z(float f7, float f10, float f11, float f12) {
        c cVar = this.x;
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
        t();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // oi.e
    public void a() {
    }

    public d u() {
        return this;
    }
}
