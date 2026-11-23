package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public class db extends View implements m2 {
    public final Path a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public final org.telegram.ui.Components.d6 e;
    public Drawable f;
    public Bitmap h;
    public int n;
    public ValueAnimator r;

    public db(Context context) {
        super(context);
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(3);
        this.c = paint2;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 380L, nr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(w wVar, boolean z10) {
        if (this.f == wVar) {
            return;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (!z10) {
            setDrawable(wVar);
            return;
        }
        this.r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        this.r.addUpdateListener(new fi.z2(this, new AtomicBoolean(), wVar, 2));
        this.r.start();
    }

    public final void b(boolean z10, boolean z11) {
        this.d = z10;
        if (!z11) {
            this.e.e(true, z10 ? 1.0f : 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        float d = this.e.d(this.d);
        int intrinsicWidth = this.f.getIntrinsicWidth();
        int intrinsicHeight = this.f.getIntrinsicHeight();
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (d <= 0.0f) {
            this.f.setBounds(rect);
            this.f.draw(canvas);
        } else if (d < 1.0f) {
            canvas.save();
            Path path = this.a;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            this.f.setBounds(rect);
            this.f.draw(canvas);
            canvas.restore();
        }
        if (d > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ls.e4, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, this.b);
            canvas.save();
            Bitmap bitmap = this.h;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.c);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h != null || this.n == 0) {
            return;
        }
        this.h = BitmapFactory.decodeResource(getResources(), this.n);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
    }

    public void setDrawable(int i7) {
        this.f = getContext().getResources().getDrawable(i7).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i7 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i7);
        }
        invalidate();
    }

    @Override // hi.m2
    public void setInvert(float f10) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.b.setColor(i0.a.f(f10, -1, -16777216));
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            drawable.setBounds(0, 0, createBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
