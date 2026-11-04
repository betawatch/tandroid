package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s2 extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public s2(Context context) {
        this.a = 2;
        this.d = new org.telegram.ui.Components.u5(new org.telegram.ui.Components.h0(this, 0), 1200L, xq.h, 0);
        this.b = k2.p1.g(context, R.drawable.input_ai);
        this.c = k2.p1.g(context, R.drawable.input_ai_star);
    }

    public void c(int i3) {
        Rect rect = (Rect) this.c;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i3) {
            return;
        }
        rect.set(0, 0, 0, i3);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                Rect rect = (Rect) this.d;
                if (!rect.isEmpty() && paint.getAlpha() != 0 && !org.telegram.messenger.g0.m0) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                int w10 = k6.w(k6.w0(k6.ra, q1Var.Pb), k6.r1(0.5f, k6.w0(k6.y6, q1Var.Pb)));
                int[] iArr = (int[]) this.d;
                if (w10 != iArr[0]) {
                    int alpha = paint2.getAlpha();
                    iArr[0] = w10;
                    paint2.setColor(w10);
                    paint2.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint2);
                break;
            case 2:
                Rect bounds = getBounds();
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                float e10 = ((org.telegram.ui.Components.u5) this.d).e(false, 1.0f);
                float width = (bounds.width() * 0.352f) + bounds.left;
                float height = (bounds.height() * 0.248f) + bounds.top;
                float width2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(org.telegram.messenger.g0.s(e10, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                float width3 = (bounds.width() * 0.215f) + bounds.left;
                float height2 = (bounds.height() * 0.43f) + bounds.top;
                float width4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(org.telegram.messenger.g0.s(e10, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                Drawable drawable2 = (Drawable) this.c;
                drawable2.setBounds((int) (width - width2), (int) (height - width2), (int) (width + width2), (int) (height + width2));
                drawable2.draw(canvas);
                drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
                drawable2.draw(canvas);
                break;
            case 3:
                Rect bounds2 = getBounds();
                float L = org.telegram.messenger.g0.L(25.0f);
                float f10 = bounds2.top;
                oo0 oo0Var = (oo0) this.d;
                float min = Math.min(f10, oo0Var.p1 - oo0Var.j1.getY());
                Paint paint3 = (Paint) this.b;
                paint3.setColor(k6.w0(k6.h5, oo0Var.J0));
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(bounds2.left, min, bounds2.right, bounds2.bottom + L, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds2);
                canvas.drawPath(path, paint3);
                canvas.restore();
                break;
            default:
                int i3 = getBounds().left;
                int centerY = getBounds().centerY();
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = centerY;
                rectF.set(i3, f11 - (org.telegram.messenger.g0.L(18.33f) / 2.0f), getIntrinsicWidth() + i3, (org.telegram.messenger.g0.L(18.33f) / 2.0f) + f11);
                vg.x0 x0Var = (vg.x0) this.d;
                x0Var.e(rectF);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), x0Var.f);
                Drawable drawable3 = (Drawable) this.c;
                drawable3.setBounds(org.telegram.messenger.g0.L(3.33f) + i3, (int) (f11 - ((drawable3.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(3.33f) + i3), (int) a1.g.e(drawable3.getIntrinsicHeight(), 0.875f, 2.0f, f11));
                drawable3.draw(canvas);
                ((ly0) this.b).c((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(3.66f) + i3, f11, 1.0f, -1, canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 0:
                return ((Paint) this.b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return ((Drawable) this.b).getIntrinsicHeight();
            case 3:
            default:
                return super.getIntrinsicHeight();
            case 4:
                return org.telegram.messenger.g0.L(18.33f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return ((Drawable) this.b).getIntrinsicWidth();
            case 3:
            default:
                return super.getIntrinsicWidth();
            case 4:
                return (int) (((ly0) this.b).k() + (((Drawable) this.c).getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(9.66f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return -2;
            case 2:
                return -2;
            case 3:
                return -3;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                Rect rect2 = (Rect) this.d;
                rect2.set(rect);
                int i3 = rect2.left;
                Rect rect3 = (Rect) this.c;
                rect2.left = Math.max(0, rect3.left) + i3;
                rect2.top = Math.max(0, rect3.top) + rect2.top;
                rect2.right -= Math.max(0, rect3.right);
                rect2.bottom -= Math.max(0, rect3.bottom);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        switch (this.a) {
            case 0:
                ((Paint) this.b).setAlpha(i3);
                invalidateSelf();
                break;
            case 1:
                ((Paint) this.b).setAlpha(k6.r1(i3 / 255.0f, ((int[]) this.d)[0]));
                break;
            case 2:
                ((Drawable) this.b).setAlpha(i3);
                ((Drawable) this.c).setAlpha(i3);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((Paint) this.b).setColorFilter(colorFilter);
                break;
            case 1:
                ((Paint) this.b).setColorFilter(colorFilter);
                break;
            case 2:
                ((Drawable) this.b).setColorFilter(colorFilter);
                ((Drawable) this.c).setColorFilter(colorFilter);
                break;
        }
    }

    public s2() {
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Rect();
        this.d = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public s2(org.telegram.ui.Cells.q1 q1Var, int[] iArr, Paint paint) {
        this.a = 1;
        this.c = q1Var;
        this.d = iArr;
        this.b = paint;
    }

    public s2(oo0 oo0Var) {
        this.a = 3;
        this.d = oo0Var;
        this.b = new Paint(1);
        this.c = new Path();
    }

    public s2(int i3, Context context, e6 e6Var, boolean z10) {
        this.a = 4;
        this.b = new ly0(bd.G(i3, z10 ? "BoostLevelPlus" : "BoostLevel", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
        Drawable g7 = k2.p1.g(context, R.drawable.mini_switch_lock);
        this.c = g7;
        g7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = new vg.x0(k6.zk, k6.Ak, -1, -1, e6Var);
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
