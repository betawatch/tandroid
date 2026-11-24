// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gc extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gc(int i, wjb wjbVar, Context context, boolean z) {
        this.a = (byte) 3;
        this.c = new tgb(k96.G(i, z ? "BoostLevelPlus" : "BoostLevel", new Object[0]), 12.0f, gl.o());
        Drawable d = b00.d(context, R.drawable.mini_switch_lock);
        this.b = d;
        d.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = new mh8(bkb.Bk, bkb.Ck, -1, -1, wjbVar);
    }

    public final void c(int i) {
        Rect rect = (Rect) this.c;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i) {
            return;
        }
        rect.set(0, 0, 0, i);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj2;
                drawable.setBounds(getBounds());
                drawable.draw(canvas);
                float e = ((lm) obj3).e(false, 1.0f);
                float width = (r0.width() * 0.352f) + r0.left;
                float height = (r0.height() * 0.248f) + r0.top;
                float width2 = r0.width() * 0.105f * ((float) (1.0d - Math.sin(gl.s(e, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                float width3 = (r0.width() * 0.215f) + r0.left;
                float height2 = (r0.height() * 0.43f) + r0.top;
                float width4 = r0.width() * 0.09f * ((float) (1.0d - Math.sin(gl.s(e, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                Drawable drawable2 = (Drawable) obj;
                drawable2.setBounds((int) (width - width2), (int) (height - width2), (int) (width + width2), (int) (height + width2));
                drawable2.draw(canvas);
                drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
                drawable2.draw(canvas);
                break;
            case 1:
                Paint paint = (Paint) obj2;
                Rect rect = (Rect) obj3;
                if (!rect.isEmpty() && paint.getAlpha() != 0 && !gl.m0) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
            case 2:
                Paint paint2 = (Paint) obj3;
                gb2 gb2Var = (gb2) obj2;
                int v = bkb.v(bkb.v0(bkb.qa, gb2Var.cc), bkb.p1(0.5f, bkb.v0(bkb.x6, gb2Var.cc)));
                int[] iArr = (int[]) obj;
                if (v != iArr[0]) {
                    int alpha = paint2.getAlpha();
                    iArr[0] = v;
                    paint2.setColor(v);
                    paint2.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint2);
                break;
            case 3:
                int i = getBounds().left;
                int centerY = getBounds().centerY();
                RectF rectF = gl.P;
                float f = centerY;
                rectF.set(i, f - (gl.L(18.33f) / 2.0f), getIntrinsicWidth() + i, (gl.L(18.33f) / 2.0f) + f);
                mh8 mh8Var = (mh8) obj3;
                mh8Var.e(rectF);
                canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), mh8Var.f);
                Drawable drawable3 = (Drawable) obj2;
                drawable3.setBounds(gl.L(3.33f) + i, (int) (f - ((drawable3.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable3.getIntrinsicWidth() * 0.875f) + gl.L(3.33f) + i), (int) ls6.d(drawable3.getIntrinsicHeight(), 0.875f, 2.0f, f));
                drawable3.draw(canvas);
                ((tgb) obj).c(gl.L(3.66f) + i + (drawable3.getIntrinsicWidth() * 0.875f), f, 1.0f, -1, canvas);
                break;
            default:
                Rect bounds = getBounds();
                float L = gl.L(25.0f);
                taa taaVar = (taa) obj3;
                float min = Math.min(bounds.top, taaVar.r1 - taaVar.l1.getY());
                Paint paint3 = (Paint) obj2;
                paint3.setColor(bkb.v0(bkb.g5, taaVar.J0));
                Path path = (Path) obj;
                path.rewind();
                path.addRoundRect(bounds.left, min, bounds.right, bounds.bottom + L, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds);
                canvas.drawPath(path, paint3);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.a) {
            case 1:
                return ((Paint) this.b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.b).getIntrinsicHeight();
            case 3:
                return gl.L(18.33f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.b).getIntrinsicWidth();
            case 3:
                return (int) (((tgb) this.c).j() + (((Drawable) this.b).getIntrinsicWidth() * 0.875f) + gl.L(9.66f));
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 2:
            case 3:
                return -2;
            case 1:
                return 0;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 1:
                super.onBoundsChange(rect);
                Rect rect2 = (Rect) this.d;
                rect2.set(rect);
                int i = rect2.left;
                Rect rect3 = (Rect) this.c;
                rect2.left = Math.max(0, rect3.left) + i;
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
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((Drawable) obj).setAlpha(i);
                ((Drawable) obj2).setAlpha(i);
                break;
            case 1:
                ((Paint) obj).setAlpha(i);
                invalidateSelf();
                break;
            case 2:
                ((Paint) this.d).setAlpha(bkb.p1(i / 255.0f, ((int[]) obj2)[0]));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Drawable) obj).setColorFilter(colorFilter);
                ((Drawable) this.c).setColorFilter(colorFilter);
                break;
            case 1:
                ((Paint) obj).setColorFilter(colorFilter);
                break;
            case 2:
                ((Paint) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    public gc() {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Rect();
        this.d = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public gc(gb2 gb2Var, int[] iArr, Paint paint) {
        this.a = (byte) 2;
        this.b = gb2Var;
        this.c = iArr;
        this.d = paint;
    }

    public gc(taa taaVar) {
        this.a = (byte) 4;
        this.d = taaVar;
        this.b = new Paint(1);
        this.c = new Path();
    }

    public gc(Context context) {
        this.a = (byte) 0;
        this.d = new lm(new fc(this, (byte) 0), 1200L, s33.h, 0);
        this.b = b00.d(context, R.drawable.input_ai);
        this.c = b00.d(context, R.drawable.input_ai_star);
    }
}
