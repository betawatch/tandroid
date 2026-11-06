package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c7 extends Drawable {
    public final Paint a;
    public final zg0 b;
    public final Drawable c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;
    public int f;
    public int g;

    public c7(Context context, View view, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.g = qs.e4;
        this.d = f6Var;
        this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vk, f6Var);
        this.f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, f6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z9) {
            this.b = null;
            Drawable h = jg.g.h(context, i7);
            this.c = h;
            h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        zg0 zg0Var = new zg0(R.raw.story_repost, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
        this.b = zg0Var;
        zg0Var.R(view);
        org.telegram.messenger.g0.i3(new o0(zg0Var, 1), 450L);
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int w02;
        int w03;
        Paint paint = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        try {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vk, f6Var);
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, f6Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (w02 == this.e) {
            if (w03 != this.f) {
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
            paint.setAlpha(this.g);
            float min = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
            drawable = this.b;
            int L = org.telegram.messenger.g0.L(drawable == null ? 20.0f : 15.0f);
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            if (drawable == null) {
                drawable = this.c;
            }
            if (drawable == null) {
                drawable.setBounds(rect);
                drawable.setAlpha(this.g);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        this.e = w02;
        this.f = w03;
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), new int[]{w02, w03}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        paint.setAlpha(this.g);
        float min2 = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF2, min2, min2, paint);
        canvas.restore();
        drawable = this.b;
        int L2 = org.telegram.messenger.g0.L(drawable == null ? 20.0f : 15.0f);
        Rect rect2 = org.telegram.messenger.g0.Q;
        rect2.set(getBounds().centerX() - L2, getBounds().centerY() - L2, getBounds().centerX() + L2, getBounds().centerY() + L2);
        if (drawable == null) {
        }
        if (drawable == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.g = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
