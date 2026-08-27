package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pr extends Drawable {
    public final org.telegram.ui.ActionBar.c6 a;
    public final Paint b = new Paint(1);
    public final Paint c;
    public final Drawable d;
    public final RectF e;
    public final org.telegram.ui.Components.i6 f;
    public final org.telegram.ui.Components.i6 g;
    public final Paint h;
    public final Path i;
    public final Drawable j;
    public int k;
    public boolean l;
    public final org.telegram.ui.Components.y5 m;

    public pr(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new RectF();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
        this.g = i6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.i = path;
        this.m = new org.telegram.ui.Components.y5(new ti(this, 12), 320L, org.telegram.ui.Components.er.h, 0);
        or orVar = new or(0, this);
        this.a = c6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.r(-16777216);
        i6Var.t(AndroidUtilities.dp(7.0f));
        i6Var.setCallback(orVar);
        i6Var.b = 17;
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var2.r(-16777216);
        i6Var2.t(AndroidUtilities.dp(7.0f));
        i6Var2.setCallback(orVar);
        i6Var2.b = 17;
        i6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.l == z10) {
            return;
        }
        this.l = z10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float e9 = this.m.e(this.l);
        float dp = AndroidUtilities.dp(5.0f);
        org.telegram.ui.Components.i6 i6Var = this.f;
        float d = i6Var.d() + (i6Var.g() * dp);
        float dp2 = AndroidUtilities.dp(5.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.g;
        float d10 = i6Var2.d() + (i6Var2.g() * dp2);
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        if (d > 0.0f || d10 > 0.0f || e9 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        } else {
            canvas2 = canvas;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp3 = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.c;
        RectF rectF = this.e;
        if (d > 0.0f) {
            f10 = dp3;
            float f14 = f10 / 2.0f;
            f11 = height;
            f12 = height2;
            rectF.set(width - d, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f10 = dp3;
            f11 = height;
            f12 = height2;
        }
        int i11 = (d10 > 0.0f ? 1 : (d10 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            float f15 = f10 / 2.0f;
            i10 = i11;
            rectF.set(width - d10, f12 - f15, width, f12 + f15);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            i10 = i11;
        }
        float f16 = 1.0f - e9;
        if (d * f16 > 0.0f) {
            paint.setAlpha((int) (i6Var.g() * 255.0f * f16));
            i6Var.w = (int) (i6Var.g() * 255.0f * f16);
            float f17 = f10 / 2.0f;
            rectF.set(width - d, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            i6Var.m(rectF);
            i6Var.draw(canvas2);
        }
        if (e9 > 0.0f) {
            canvas2.save();
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.a);
            int i12 = this.k;
            Drawable drawable2 = this.j;
            if (i12 != v02) {
                this.k = v02;
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            f13 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e9 * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e9);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e9 > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (i6Var2.g() * f13));
            i6Var2.w = (int) (i6Var2.g() * f13);
            float f18 = f10 / 2.0f;
            rectF.set(width - d10, f12 - f18, width, f12 + f18);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            i6Var2.m(rectF);
            i6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
