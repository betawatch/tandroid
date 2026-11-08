package di;

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
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j0 extends Drawable {
    public final /* synthetic */ int a;
    public Object b;
    public float c;
    public Object d;

    public /* synthetic */ j0() {
        this.a = 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, qs.e4, 31);
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((my0) this.d).c(bounds.centerX() - (((my0) this.d).c / 2.0f), org.telegram.messenger.g0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                break;
            case 1:
                float f10 = getBounds().left;
                float f11 = getBounds().top;
                float f12 = getBounds().right;
                float f13 = getBounds().bottom;
                float f14 = this.c;
                canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, (Paint) this.d);
                bg.s.e((Drawable) this.b, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), 17);
                ((Drawable) this.b).draw(canvas);
                break;
            case 2:
                Paint paint = (Paint) this.d;
                if (this.c != org.telegram.messenger.g0.p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.b, paint);
                canvas.drawRect(org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.L(18.0f) - org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(11.1f), paint);
                canvas.restore();
                break;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                int i7 = nVar.e;
                Matrix matrix = nVar.i;
                nVar.f = getBounds().width();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                nVar.a(this.c, canvas, rectF, null);
                rz rzVar = (rz) this.b;
                if (rzVar != null) {
                    rzVar.c = nVar.a;
                    int i10 = nVar.f;
                    float f15 = (((i7 * 2) + i10) * nVar.g) - i7;
                    int i11 = (int) (i10 * 0.5f);
                    int width = getBounds().width();
                    float f16 = width / rzVar.e;
                    float height = getBounds().height() / rzVar.f;
                    float max = rzVar.s ? Math.max(f16, height) : Math.min(f16, height);
                    matrix.reset();
                    matrix.setScale(1.0f / max, 0.0f, i7 / 2.0f, 0.0f);
                    matrix.setTranslate((f15 - rzVar.getBounds().left) - (i7 / max), 0.0f);
                    nVar.b.setLocalMatrix(matrix);
                    int i12 = i11 / 2;
                    rzVar.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
                    rzVar.draw(canvas);
                }
                nVar.o.invalidate();
                break;
        }
    }

    public void f() {
        int L = org.telegram.messenger.g0.L(18.0f);
        Path path = (Path) this.b;
        path.reset();
        float f10 = L >> 1;
        path.moveTo(f10, org.telegram.messenger.g0.N(4.98f));
        path.lineTo(org.telegram.messenger.g0.N(4.95f), org.telegram.messenger.g0.N(9.0f));
        path.lineTo(L - org.telegram.messenger.g0.N(4.95f), org.telegram.messenger.g0.N(9.0f));
        path.lineTo(f10, org.telegram.messenger.g0.N(4.98f));
        Paint paint = (Paint) this.d;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        this.c = org.telegram.messenger.g0.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return (int) (((Drawable) this.b).getIntrinsicHeight() * this.c);
            case 1:
            default:
                return super.getIntrinsicHeight();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return (int) (((Drawable) this.b).getIntrinsicWidth() * this.c);
            case 1:
            default:
                return super.getIntrinsicWidth();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            case 1:
                return -3;
            case 2:
                return 0;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                ((Drawable) this.b).setAlpha(i7);
                break;
            case 1:
            case 2:
                break;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                nVar.a.setAlpha(i7);
                nVar.c.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((Drawable) this.b).setColorFilter(colorFilter);
                break;
        }
    }

    public j0(Context context, float f10) {
        this.a = 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.b = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1552f, -16777216));
        this.c = f10;
    }

    public j0(org.telegram.ui.Components.voip.n nVar, rz rzVar) {
        this.a = 3;
        this.d = nVar;
        this.b = rzVar;
    }

    public j0(Context context, int i7) {
        this.a = 0;
        this.c = 0.75f;
        this.b = jg.g.h(context, R.drawable.filled_stream_crown);
        my0 my0Var = new my0(jg.g.j(i7, ""), 8.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.d = my0Var;
        my0Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
