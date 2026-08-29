package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class rb extends View implements o2 {
    public final Path a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public final org.telegram.ui.Components.d6 e;
    public Drawable f;
    public Bitmap h;
    public int n;
    public ValueAnimator r;

    public rb(Context context) {
        super(context);
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(3);
        this.c = paint2;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 380L, jr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(u uVar, boolean z10) {
        if (this.f == uVar) {
            return;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (!z10) {
            setDrawable(uVar);
            return;
        }
        this.r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        this.r.addUpdateListener(new bg.s(this, new AtomicBoolean(), uVar, 3));
        this.r.start();
    }

    public final void b(boolean z10, boolean z11) {
        this.d = z10;
        if (!z11) {
            this.e.d(z10 ? 1.0f : 0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        float e10 = this.e.e(this.d);
        int intrinsicWidth = this.f.getIntrinsicWidth();
        int intrinsicHeight = this.f.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e10 <= 0.0f) {
            this.f.setBounds(rect);
            this.f.draw(canvas);
        } else if (e10 < 1.0f) {
            canvas.save();
            Path path = this.a;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e10, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            this.f.setBounds(rect);
            this.f.draw(canvas);
            canvas.restore();
        }
        if (e10 > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e10, this.b);
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

    public void setDrawable(int i10) {
        this.f = getContext().getResources().getDrawable(i10).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i10 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i10);
        }
        invalidate();
    }

    @Override // nh.o2
    public void setInvert(float f9) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.b.setColor(i0.a.d(f9, -1, -16777216));
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
