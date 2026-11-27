// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ee1 extends Drawable {
    public final /* synthetic */ byte a;
    public float b;
    public Object c;
    public Object d;

    public ee1(Context context, int i) {
        this.a = (byte) 2;
        this.b = 0.75f;
        this.c = c00.e(context, R.drawable.filled_stream_crown);
        pkb pkbVar = new pkb(String.valueOf(i), 8.0f, hl.n1("fonts/num.otf"));
        this.d = pkbVar;
        pkbVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                fe1 fe1Var = (fe1) this.d;
                int i = fe1Var.e;
                Matrix matrix = fe1Var.i;
                fe1Var.f = getBounds().width();
                RectF rectF = hl.P;
                rectF.set(getBounds());
                fe1Var.a(this.b, canvas, rectF, null);
                ggb ggbVar = (ggb) this.c;
                if (ggbVar != null) {
                    ggbVar.c = fe1Var.a;
                    int i2 = fe1Var.f;
                    float f = (((i << 1) + i2) * fe1Var.g) - i;
                    int i3 = (int) (i2 * 0.5f);
                    int width = getBounds().width();
                    float f2 = width / ggbVar.e;
                    float height = getBounds().height() / ggbVar.f;
                    float max = ggbVar.s ? Math.max(f2, height) : Math.min(f2, height);
                    matrix.reset();
                    matrix.setScale(1.0f / max, 0.0f, i / 2.0f, 0.0f);
                    matrix.setTranslate((f - ggbVar.getBounds().left) - (i / max), 0.0f);
                    fe1Var.b.setLocalMatrix(matrix);
                    int i4 = i3 / 2;
                    ggbVar.setBounds(getBounds().centerX() - i4, getBounds().centerY() - i4, getBounds().centerX() + i4, getBounds().centerY() + i4);
                    ggbVar.draw(canvas);
                }
                fe1Var.o.invalidate();
                break;
            case 1:
                float f3 = getBounds().left;
                float f4 = getBounds().top;
                float f5 = getBounds().right;
                float f6 = getBounds().bottom;
                float f7 = this.b;
                canvas.drawRoundRect(f3, f4, f5, f6, f7, f7, (Paint) this.d);
                br3.e((Drawable) this.c, getBounds().exactCenterX(), getBounds().exactCenterY(), hl.L(36.0f), hl.L(36.0f), 17);
                ((Drawable) this.c).draw(canvas);
                break;
            case 2:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, jn7.d4, 31);
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((pkb) this.d).c(bounds.centerX() - (((pkb) this.d).c / 2.0f), hl.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.d;
                if (this.b != hl.p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.c, paint);
                canvas.drawRect(hl.N(7.56f), hl.N(8.0f), hl.L(18.0f) - hl.N(7.56f), hl.N(11.1f), paint);
                canvas.restore();
                break;
        }
    }

    public final void f() {
        int L = hl.L(18.0f);
        Path path = (Path) this.c;
        path.reset();
        float f = L >> 1;
        path.moveTo(f, hl.N(4.98f));
        path.lineTo(hl.N(4.95f), hl.N(9.0f));
        path.lineTo(L - hl.N(4.95f), hl.N(9.0f));
        path.lineTo(f, hl.N(4.98f));
        Paint paint = (Paint) this.d;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.N(1.0f));
        this.b = hl.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.a) {
            case 2:
                return ((Drawable) this.c).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return (int) (((Drawable) this.c).getIntrinsicHeight() * this.b);
            case 3:
                return hl.L(18.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return (int) (((Drawable) this.c).getIntrinsicWidth() * this.b);
            case 3:
                return hl.L(18.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 1:
                return -3;
            case 2:
                return -2;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                fe1 fe1Var = (fe1) this.d;
                fe1Var.a.setAlpha(i);
                fe1Var.c.setAlpha(i);
                break;
            case 2:
                ((Drawable) this.c).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 2:
                ((Drawable) this.c).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    public ee1(Context context, float f) {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.c = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(aob.p1(0.1552f, -16777216));
        this.b = f;
    }

    public ee1(fe1 fe1Var, ggb ggbVar) {
        this.a = (byte) 0;
        this.d = fe1Var;
        this.c = ggbVar;
    }

    public /* synthetic */ ee1() {
        this.a = (byte) 3;
    }
}
