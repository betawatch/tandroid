package dh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.a6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d extends Drawable implements a6 {
    public final Paint D;
    public int E;
    public boolean F;
    public int G;
    public final Paint a;
    public final fh.g b;
    public final Matrix c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f;
    public BitmapShader h;
    public ComposeShader n;
    public final Matrix r;
    public final Paint s;
    public Bitmap w;
    public int x;
    public boolean y;

    public d(fh.g gVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.r = new Matrix();
        Paint paint2 = new Paint(1);
        this.s = paint2;
        a5.b bVar = new a5.b(this, 3);
        this.D = new Paint(1);
        this.G = qs.e4;
        this.b = gVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(g0.L(40.0f), false);
        gVar.setCallback(bVar);
    }

    public static LinearGradient a(int i7, boolean z9) {
        int alpha = Color.alpha(i7);
        return z9 ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, 0), i0.a.o(i7, (alpha * 96) / qs.I4), i0.a.o(i7, (alpha * qs.G2) / qs.I4), i0.a.o(i7, (alpha * qs.I3) / qs.I4)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, 0), i0.a.o(i7, (alpha * 96) / qs.e4), i0.a.o(i7, (alpha * qs.G2) / qs.e4), i0.a.o(i7, (alpha * qs.I3) / qs.e4), i0.a.o(i7, (alpha * qs.e4) / qs.e4)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i7, boolean z9) {
        if (this.x == i7 && this.y == z9) {
            return;
        }
        this.x = i7;
        this.y = z9;
        LinearGradient a10 = a(-16777216, z9);
        this.d = a10;
        this.a.setShader(a10);
        this.D.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i7);
        if (i7 < 0) {
            matrix.postTranslate(0.0f, -i7);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        int i7;
        boolean z9;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.G == 0) {
            return;
        }
        fh.g gVar = this.b;
        ri.a v = fh.g.v(gVar.r);
        boolean z10 = this.F;
        Matrix matrix = this.c;
        Matrix matrix2 = this.e;
        if (!z10 && (v instanceof ri.c)) {
            int i10 = ((ri.c) v).b;
            int i11 = this.E;
            Paint paint = this.D;
            if (i11 != i10 || this.f == null) {
                LinearGradient a10 = a(i10, this.y);
                this.f = a10;
                this.E = i10;
                paint.setShader(a10);
            }
            height = this.x < 0 ? bounds.height() + this.x : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + height);
            this.f.setLocalMatrix(matrix2);
            paint.setAlpha(this.G);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z10 || !(v instanceof ri.b) || (i7 = Build.VERSION.SDK_INT) < 28) {
            int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
            height = this.x < 0 ? bounds.height() + this.x : 0;
            gVar.draw(canvas);
            canvas.translate(bounds.left, bounds.top + height);
            canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.a);
            canvas.restoreToCount(saveLayerAlpha);
            return;
        }
        ri.b bVar = (ri.b) v;
        Bitmap bitmap = bVar.d;
        if (bitmap == null) {
            return;
        }
        boolean z11 = true;
        if (this.E != -16777216 || this.f == null) {
            this.f = a(-16777216, this.y);
            this.E = -16777216;
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.h == null || this.w != bitmap) {
            this.w = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.h = bitmapShader;
            if (i7 >= 33) {
                bitmapShader.setFilterMode(2);
            }
        } else {
            z11 = z9;
        }
        Paint paint2 = this.s;
        if (z11 || this.n == null) {
            ComposeShader composeShader = new ComposeShader(this.h, this.f, PorterDuff.Mode.DST_IN);
            this.n = composeShader;
            paint2.setShader(composeShader);
        }
        height = this.x < 0 ? bounds.height() + this.x : 0;
        matrix2.set(matrix);
        matrix2.postTranslate(bounds.left, bounds.top + height);
        this.f.setLocalMatrix(matrix2);
        Matrix matrix3 = bVar.b;
        Matrix matrix4 = this.r;
        matrix4.set(matrix3);
        matrix4.postTranslate(-gVar.d, -gVar.e);
        this.h.setLocalMatrix(matrix4);
        paint2.setAlpha(this.G);
        canvas.drawRect(bounds, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.G = i7;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.b.updateColors();
            invalidateSelf();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
