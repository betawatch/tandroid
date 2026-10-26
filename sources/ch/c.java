package ch;

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
import bh.u0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c extends Drawable implements p6 {
    public int E;
    public boolean F;
    public int G;
    public final Paint a;
    public final eh.d b;
    public final Matrix c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f;
    public BitmapShader h;
    public ComposeShader n;
    public final Matrix r;
    public final Paint s;
    public Bitmap v;
    public int w;
    public boolean x;
    public final Paint y;

    public c(eh.d dVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.r = new Matrix();
        Paint paint2 = new Paint(1);
        this.s = paint2;
        u0 u0Var = new u0(this, 2);
        this.y = new Paint(1);
        this.G = 255;
        this.b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
        dVar.setCallback(u0Var);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, 0), i0.a.o(i10, (alpha * 96) / 285), i0.a.o(i10, (alpha * 176) / 285), i0.a.o(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, 0), i0.a.o(i10, (alpha * 96) / 255), i0.a.o(i10, (alpha * 176) / 255), i0.a.o(i10, (alpha * 232) / 255), i0.a.o(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.w == i10 && this.x == z10) {
            return;
        }
        this.w = i10;
        this.x = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.a.setShader(a2);
        this.y.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i10);
        if (i10 < 0) {
            matrix.postTranslate(0.0f, -i10);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.G == 0) {
            return;
        }
        eh.d dVar = this.b;
        hh.a s10 = dVar.s();
        while (s10 instanceof hh.e) {
            s10 = ((hh.e) s10).a;
        }
        boolean z11 = this.F;
        Matrix matrix = this.c;
        Matrix matrix2 = this.e;
        if (!z11 && (s10 instanceof hh.c)) {
            int i11 = ((hh.c) s10).b;
            int i12 = this.E;
            Paint paint = this.y;
            if (i12 != i11 || this.f == null) {
                LinearGradient a2 = a(i11, this.x);
                this.f = a2;
                this.E = i11;
                paint.setShader(a2);
            }
            height = this.w < 0 ? bounds.height() + this.w : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + height);
            this.f.setLocalMatrix(matrix2);
            paint.setAlpha(this.G);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z11 || !(s10 instanceof hh.b) || (i10 = Build.VERSION.SDK_INT) < 28) {
            int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
            height = this.w < 0 ? bounds.height() + this.w : 0;
            dVar.draw(canvas);
            canvas.translate(bounds.left, bounds.top + height);
            canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.a);
            canvas.restoreToCount(saveLayerAlpha);
            return;
        }
        hh.b bVar = (hh.b) s10;
        Bitmap bitmap = bVar.d;
        if (bitmap == null) {
            return;
        }
        boolean z12 = true;
        if (this.E != -16777216 || this.f == null) {
            this.f = a(-16777216, this.x);
            this.E = -16777216;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.h == null || this.v != bitmap) {
            this.v = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.h = bitmapShader;
            if (i10 >= 33) {
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
        height = this.w < 0 ? bounds.height() + this.w : 0;
        matrix2.set(matrix);
        matrix2.postTranslate(bounds.left, bounds.top + height);
        this.f.setLocalMatrix(matrix2);
        Matrix matrix3 = bVar.b;
        Matrix matrix4 = this.r;
        matrix4.set(matrix3);
        matrix4.postTranslate(-dVar.c, -dVar.d);
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
    public final void setAlpha(int i10) {
        this.G = i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.b.updateColors();
            invalidateSelf();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
