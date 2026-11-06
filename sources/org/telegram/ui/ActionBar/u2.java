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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u2 extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public u2(Context context) {
        this.a = 2;
        this.d = new org.telegram.ui.Components.w5(new org.telegram.ui.Components.j0(this, 0), 1200L, xq.h, 0);
        this.b = jg.g.h(context, R.drawable.input_ai);
        this.c = jg.g.h(context, R.drawable.input_ai_star);
    }

    public void c(int i7) {
        Rect rect = (Rect) this.c;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i7) {
            return;
        }
        rect.set(0, 0, 0, i7);
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
                float e10 = ((org.telegram.ui.Components.w5) this.d).e(false, 1.0f);
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
                mo0 mo0Var = (mo0) this.d;
                float min = Math.min(f10, mo0Var.o1 - mo0Var.i1.getY());
                Paint paint3 = (Paint) this.b;
                paint3.setColor(k6.w0(k6.h5, mo0Var.I0));
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(bounds2.left, min, bounds2.right, bounds2.bottom + L, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds2);
                canvas.drawPath(path, paint3);
                canvas.restore();
                break;
            default:
                int i7 = getBounds().left;
                int centerY = getBounds().centerY();
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = centerY;
                rectF.set(i7, f11 - (org.telegram.messenger.g0.L(18.33f) / 2.0f), getIntrinsicWidth() + i7, (org.telegram.messenger.g0.L(18.33f) / 2.0f) + f11);
                ug.y0 y0Var = (ug.y0) this.d;
                y0Var.e(rectF);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), y0Var.f);
                Drawable drawable3 = (Drawable) this.c;
                drawable3.setBounds(org.telegram.messenger.g0.L(3.33f) + i7, (int) (f11 - ((drawable3.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(3.33f) + i7), (int) a8.p0.f(drawable3.getIntrinsicHeight(), 0.875f, 2.0f, f11));
                drawable3.draw(canvas);
                ((my0) this.b).c((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(3.66f) + i7, f11, 1.0f, -1, canvas);
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
                return (int) (((my0) this.b).k() + (((Drawable) this.c).getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(9.66f));
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
                int i7 = rect2.left;
                Rect rect3 = (Rect) this.c;
                rect2.left = Math.max(0, rect3.left) + i7;
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
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                ((Paint) this.b).setAlpha(i7);
                invalidateSelf();
                break;
            case 1:
                ((Paint) this.b).setAlpha(k6.r1(i7 / 255.0f, ((int[]) this.d)[0]));
                break;
            case 2:
                ((Drawable) this.b).setAlpha(i7);
                ((Drawable) this.c).setAlpha(i7);
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

    public u2() {
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Rect();
        this.d = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public u2(org.telegram.ui.Cells.q1 q1Var, int[] iArr, Paint paint) {
        this.a = 1;
        this.c = q1Var;
        this.d = iArr;
        this.b = paint;
    }

    public u2(mo0 mo0Var) {
        this.a = 3;
        this.d = mo0Var;
        this.b = new Paint(1);
        this.c = new Path();
    }

    public u2(int i7, Context context, f6 f6Var, boolean z9) {
        this.a = 4;
        this.b = new my0(hd.G(i7, z9 ? "BoostLevelPlus" : "BoostLevel", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
        Drawable h = jg.g.h(context, R.drawable.mini_switch_lock);
        this.c = h;
        h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = new ug.y0(k6.zk, k6.Ak, -1, -1, f6Var);
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
