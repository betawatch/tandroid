package eh;

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
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d extends Drawable implements z5 {
    public final Paint E;
    public int F;
    public boolean G;
    public int H;
    public final Paint a;
    public final gh.g b;
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

    public d(gh.g gVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.r = new Matrix();
        Paint paint2 = new Paint(1);
        this.s = paint2;
        ah.a aVar = new ah.a(this, 4);
        this.E = new Paint(1);
        this.H = hs.e4;
        this.b = gVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(g0.L(40.0f), false);
        gVar.setCallback(aVar);
    }

    public static LinearGradient a(int i3, boolean z10) {
        int alpha = Color.alpha(i3);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i3, 0), i0.a.o(i3, (alpha * 96) / hs.I4), i0.a.o(i3, (alpha * hs.G2) / hs.I4), i0.a.o(i3, (alpha * hs.I3) / hs.I4)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i3, 0), i0.a.o(i3, (alpha * 96) / hs.e4), i0.a.o(i3, (alpha * hs.G2) / hs.e4), i0.a.o(i3, (alpha * hs.I3) / hs.e4), i0.a.o(i3, (alpha * hs.e4) / hs.e4)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i3, boolean z10) {
        if (this.x == i3 && this.y == z10) {
            return;
        }
        this.x = i3;
        this.y = z10;
        LinearGradient a10 = a(-16777216, z10);
        this.d = a10;
        this.a.setShader(a10);
        this.E.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i3);
        if (i3 < 0) {
            matrix.postTranslate(0.0f, -i3);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        int i3;
        boolean z10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.H == 0) {
            return;
        }
        gh.g gVar = this.b;
        si.a v = gh.g.v(gVar.r);
        boolean z11 = this.G;
        Matrix matrix = this.c;
        Matrix matrix2 = this.e;
        if (!z11 && (v instanceof si.c)) {
            int i10 = ((si.c) v).b;
            int i11 = this.F;
            Paint paint = this.E;
            if (i11 != i10 || this.f == null) {
                LinearGradient a10 = a(i10, this.y);
                this.f = a10;
                this.F = i10;
                paint.setShader(a10);
            }
            height = this.x < 0 ? bounds.height() + this.x : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + height);
            this.f.setLocalMatrix(matrix2);
            paint.setAlpha(this.H);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z11 || !(v instanceof si.b) || (i3 = Build.VERSION.SDK_INT) < 28) {
            int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.H);
            height = this.x < 0 ? bounds.height() + this.x : 0;
            gVar.draw(canvas);
            canvas.translate(bounds.left, bounds.top + height);
            canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.a);
            canvas.restoreToCount(saveLayerAlpha);
            return;
        }
        si.b bVar = (si.b) v;
        Bitmap bitmap = bVar.d;
        if (bitmap == null) {
            return;
        }
        boolean z12 = true;
        if (this.F != -16777216 || this.f == null) {
            this.f = a(-16777216, this.y);
            this.F = -16777216;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.h == null || this.w != bitmap) {
            this.w = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.h = bitmapShader;
            if (i3 >= 33) {
                bitmapShader.setFilterMode(2);
            }
        } else {
            z12 = z10;
        }
        Paint paint2 = this.s;
        if (z12 || this.n == null) {
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
        paint2.setAlpha(this.H);
        canvas.drawRect(bounds, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H;
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
    public final void setAlpha(int i3) {
        this.H = i3;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.b.updateColors();
            invalidateSelf();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
