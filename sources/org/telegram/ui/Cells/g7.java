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
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g7 extends Drawable {
    public final Paint a;
    public final bi0 b;
    public final Drawable c;
    public final org.telegram.ui.ActionBar.p6 d;
    public int e;
    public int f;
    public int g;

    public g7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.g = zs.e4;
        this.d = p6Var;
        this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vk, p6Var);
        this.f = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wk, p6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z10) {
            this.b = null;
            Drawable f7 = i0.a.f(context, i10);
            this.c = f7;
            f7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        bi0 bi0Var = new bi0(R.raw.story_repost, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), true, null);
        this.b = bi0Var;
        bi0Var.R(view);
        org.telegram.messenger.i0.h3(new o0(bi0Var, 1), 450L);
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
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        try {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vk, p6Var);
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wk, p6Var);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (w02 == this.e) {
            if (w03 != this.f) {
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
            paint.setAlpha(this.g);
            float min = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
            drawable = this.b;
            int L = org.telegram.messenger.i0.L(drawable == null ? 20.0f : 15.0f);
            Rect rect = org.telegram.messenger.i0.Q;
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
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), new int[]{w02, w03}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        paint.setAlpha(this.g);
        float min2 = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF2, min2, min2, paint);
        canvas.restore();
        drawable = this.b;
        int L2 = org.telegram.messenger.i0.L(drawable == null ? 20.0f : 15.0f);
        Rect rect2 = org.telegram.messenger.i0.Q;
        rect2.set(getBounds().centerX() - L2, getBounds().centerY() - L2, getBounds().centerX() + L2, getBounds().centerY() + L2);
        if (drawable == null) {
        }
        if (drawable == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.g = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
