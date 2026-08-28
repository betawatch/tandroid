package ig;

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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public final Paint a;
    public final kg.d b;
    public final Matrix c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f;
    public BitmapShader g;
    public ComposeShader h;
    public final Matrix i;
    public final Paint j;
    public Bitmap k;
    public int l;
    public boolean m;
    public final Paint n;
    public int o;
    public boolean p;
    public int q;

    public b(kg.d dVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.i = new Matrix();
        Paint paint2 = new Paint(1);
        this.j = paint2;
        this.n = new Paint(1);
        this.q = 255;
        this.b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i9, boolean z10) {
        int alpha = Color.alpha(i9);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i9, 0), i0.a.k(i9, (alpha * 96) / 285), i0.a.k(i9, (alpha * 176) / 285), i0.a.k(i9, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i9, 0), i0.a.k(i9, (alpha * 96) / 255), i0.a.k(i9, (alpha * 176) / 255), i0.a.k(i9, (alpha * 232) / 255), i0.a.k(i9, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i9, boolean z10) {
        if (this.l == i9 && this.m == z10) {
            return;
        }
        this.l = i9;
        this.m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.a.setShader(a2);
        this.n.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i9);
        if (i9 < 0) {
            matrix.postTranslate(0.0f, -i9);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        int i9;
        boolean z10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.q == 0) {
            return;
        }
        kg.d dVar = this.b;
        ng.a i10 = dVar.i();
        while (i10 instanceof ng.e) {
            i10 = ((ng.e) i10).a;
        }
        boolean z11 = this.p;
        Matrix matrix = this.c;
        Matrix matrix2 = this.e;
        if (!z11 && (i10 instanceof ng.c)) {
            int color = ((ng.c) i10).a.getColor();
            int i11 = this.o;
            Paint paint = this.n;
            if (i11 != color || this.f == null) {
                LinearGradient a2 = a(color, this.m);
                this.f = a2;
                this.o = color;
                paint.setShader(a2);
            }
            height = this.l < 0 ? bounds.height() + this.l : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + height);
            this.f.setLocalMatrix(matrix2);
            paint.setAlpha(this.q);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z11 || !(i10 instanceof ng.b) || (i9 = Build.VERSION.SDK_INT) < 28) {
            int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.q);
            height = this.l < 0 ? bounds.height() + this.l : 0;
            dVar.draw(canvas);
            canvas.translate(bounds.left, bounds.top + height);
            canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.a);
            canvas.restoreToCount(saveLayerAlpha);
            return;
        }
        ng.b bVar = (ng.b) i10;
        Bitmap bitmap = bVar.d;
        if (bitmap == null) {
            return;
        }
        boolean z12 = true;
        if (this.o != -16777216 || this.f == null) {
            this.f = a(-16777216, this.m);
            this.o = -16777216;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.g == null || this.k != bitmap) {
            this.k = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.g = bitmapShader;
            if (i9 >= 33) {
                bitmapShader.setFilterMode(2);
            }
        } else {
            z12 = z10;
        }
        Paint paint2 = this.j;
        if (z12 || this.h == null) {
            ComposeShader composeShader = new ComposeShader(this.g, this.f, PorterDuff.Mode.DST_IN);
            this.h = composeShader;
            paint2.setShader(composeShader);
        }
        height = this.l < 0 ? bounds.height() + this.l : 0;
        matrix2.set(matrix);
        matrix2.postTranslate(bounds.left, bounds.top + height);
        this.f.setLocalMatrix(matrix2);
        Matrix matrix3 = bVar.b;
        Matrix matrix4 = this.i;
        matrix4.set(matrix3);
        matrix4.postTranslate(-dVar.a, -dVar.b);
        this.g.setLocalMatrix(matrix4);
        paint2.setAlpha(this.q);
        canvas.drawRect(bounds, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
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
    public final void setAlpha(int i9) {
        this.q = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
