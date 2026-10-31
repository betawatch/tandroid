package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fq extends Drawable {
    public final /* synthetic */ int a;
    public Object b;
    public float c;
    public Object d;

    public /* synthetic */ fq() {
        this.a = 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float f7 = getBounds().left;
                float f10 = getBounds().top;
                float f11 = getBounds().right;
                float f12 = getBounds().bottom;
                float f13 = this.c;
                canvas.drawRoundRect(f7, f10, f11, f12, f13, f13, (Paint) this.b);
                rf.o.e((Drawable) this.d, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), 17);
                ((Drawable) this.d).draw(canvas);
                break;
            case 1:
                Paint paint = (Paint) this.b;
                if (this.c != org.telegram.messenger.i0.p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.d, paint);
                canvas.drawRect(org.telegram.messenger.i0.N(7.56f), org.telegram.messenger.i0.N(8.0f), org.telegram.messenger.i0.L(18.0f) - org.telegram.messenger.i0.N(7.56f), org.telegram.messenger.i0.N(11.1f), paint);
                canvas.restore();
                break;
            case 2:
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.b;
                int i10 = gVar.e;
                Matrix matrix = gVar.i;
                gVar.f = getBounds().width();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(getBounds());
                gVar.a(this.c, canvas, rectF, null);
                org.telegram.messenger.c00 c00Var = (org.telegram.messenger.c00) this.d;
                if (c00Var != null) {
                    c00Var.c = gVar.a;
                    int i11 = gVar.f;
                    float f14 = (((i10 * 2) + i11) * gVar.g) - i10;
                    int i12 = (int) (i11 * 0.5f);
                    int width = getBounds().width();
                    float f15 = width / c00Var.e;
                    float height = getBounds().height() / c00Var.f;
                    float max = c00Var.s ? Math.max(f15, height) : Math.min(f15, height);
                    matrix.reset();
                    matrix.setScale(1.0f / max, 0.0f, i10 / 2.0f, 0.0f);
                    matrix.setTranslate((f14 - c00Var.getBounds().left) - (i10 / max), 0.0f);
                    gVar.b.setLocalMatrix(matrix);
                    int i13 = i12 / 2;
                    c00Var.setBounds(getBounds().centerX() - i13, getBounds().centerY() - i13, getBounds().centerX() + i13, getBounds().centerY() + i13);
                    c00Var.draw(canvas);
                }
                gVar.o.invalidate();
                break;
            default:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, org.telegram.messenger.zs.e4, 31);
                Drawable drawable = (Drawable) this.d;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((qz0) this.b).c(bounds.centerX() - (((qz0) this.b).c / 2.0f), org.telegram.messenger.i0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                break;
        }
    }

    public void f() {
        int L = org.telegram.messenger.i0.L(18.0f);
        Path path = (Path) this.d;
        path.reset();
        float f7 = L >> 1;
        path.moveTo(f7, org.telegram.messenger.i0.N(4.98f));
        path.lineTo(org.telegram.messenger.i0.N(4.95f), org.telegram.messenger.i0.N(9.0f));
        path.lineTo(L - org.telegram.messenger.i0.N(4.95f), org.telegram.messenger.i0.N(9.0f));
        path.lineTo(f7, org.telegram.messenger.i0.N(4.98f));
        Paint paint = (Paint) this.b;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.0f));
        this.c = org.telegram.messenger.i0.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 3:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.i0.L(18.0f);
            case 2:
            default:
                return super.getIntrinsicHeight();
            case 3:
                return (int) (((Drawable) this.d).getIntrinsicHeight() * this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.i0.L(18.0f);
            case 2:
            default:
                return super.getIntrinsicWidth();
            case 3:
                return (int) (((Drawable) this.d).getIntrinsicWidth() * this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -3;
            case 1:
                return 0;
            case 2:
                return -3;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.b;
                gVar.a.setAlpha(i10);
                gVar.c.setAlpha(i10);
                break;
            default:
                ((Drawable) this.d).setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                ((Drawable) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    public fq(Context context, float f7) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1552f, -16777216));
        this.c = f7;
    }

    public fq(org.telegram.ui.Components.voip.g gVar, org.telegram.messenger.c00 c00Var) {
        this.a = 2;
        this.b = gVar;
        this.d = c00Var;
    }

    public fq(Context context, int i10) {
        this.a = 3;
        this.c = 0.75f;
        this.d = i0.a.f(context, R.drawable.filled_stream_crown);
        qz0 qz0Var = new qz0(i0.a.i(i10, ""), 8.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
        this.b = qz0Var;
        qz0Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
