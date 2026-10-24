package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f41 extends View implements org.telegram.ui.ActionBar.b6 {
    public int a;
    public float b;
    public final Paint c;
    public final Paint d;
    public Drawable e;
    public boolean f;
    public int h;
    public final RectF n;

    public f41(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f = true;
        this.h = 0;
        this.n = new RectF();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
        this.a = x02;
        paint.setColor(x02);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f7, float f10) {
        super.drawableHotspotChanged(f7, f10);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f) {
            float dp = AndroidUtilities.dp(((this.h == 0 ? this.b : 1.0f) * 26.0f) + 6.0f);
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.n;
            rectF.set(0.0f, 0.0f, width, height);
            canvas2.drawRoundRect(rectF, dp, dp, this.c);
        }
        int i10 = this.h;
        Paint paint = this.d;
        if (i10 == 0) {
            float max = (Math.max(0.4f, this.b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float B = (org.telegram.messenger.sl.B(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, B, height2, paint);
                double dp2 = AndroidUtilities.dp(9.0f) * max;
                float cos = (float) (B - (Math.cos(0.7853981633974483d) * dp2));
                float sin = (float) (Math.sin(0.7853981633974483d) * dp2);
                canvas2 = canvas;
                canvas2.drawLine(B, height2, cos, height2 - sin, paint);
                canvas2.drawLine(B, height2, cos, height2 + sin, paint);
            } else {
                canvas2 = canvas;
            }
        } else if (i10 == 1) {
            float dp3 = AndroidUtilities.dp(21.0f);
            float width2 = getWidth() - AndroidUtilities.dp(21.0f);
            float height3 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.b, 0.0f);
            canvas2.rotate(this.b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(dp3 + ((width2 - dp3) * this.b), height3, width2, height3, paint);
            int dp4 = AndroidUtilities.dp((this.b * (-1.0f)) + 9.0f);
            int dp5 = AndroidUtilities.dp((this.b * 7.0f) + 9.0f);
            double d = width2;
            double d10 = dp4;
            double d11 = height3;
            canvas.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d10)), (float) ((Math.sin(0.7853981633974483d) * d10) + d11), paint);
            double d12 = dp5;
            canvas2 = canvas;
            canvas2.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d12)), (float) (d11 - (Math.sin(0.7853981633974483d) * d12)), paint);
            canvas.restore();
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.e.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.e.draw(canvas2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.d.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f = z10;
    }

    public void setProgress(float f7) {
        this.b = f7;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.h = i10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Paint paint = this.c;
        try {
            if (paint.getColor() == this.a) {
                this.a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
                int color = paint.getColor();
                int i10 = this.a;
                if (color != i10) {
                    paint.setColor(i10);
                    invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.e;
        return drawable2 != null && drawable == drawable2;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
