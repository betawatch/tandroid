package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import b8.pf;
import ci.lc;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w1 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final v1 a;
    public final RectF b;
    public final Path c;
    public final lc d;
    public final org.telegram.ui.Components.u5 e;
    public final org.telegram.ui.Components.u5 f;
    public final org.telegram.ui.Components.g6 h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final eh.j w;
    public int x;
    public boolean y;

    public w1(Context context, v1 v1Var, hh.b bVar) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        xq xqVar = xq.h;
        this.e = new org.telegram.ui.Components.u5(this, 320L, xqVar);
        this.f = new org.telegram.ui.Components.u5(this, 320L, xqVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.a = v1Var;
        pf.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        eh.j jVar = new eh.j();
        this.w = jVar;
        jVar.a = bVar;
        jVar.a();
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.h = g6Var;
        g6Var.u(-9866632);
        g6Var.w(org.telegram.messenger.g0.L(9.0f));
        g6Var.setCallback(this);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        wp wpVar = new wp(R.drawable.star, 0);
        wpVar.I = 1.8f;
        wpVar.J = 1.8f;
        setCount(0);
        this.d = new lc(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(38.0f);
        float d = this.e.d(this.y);
        float d10 = this.f.d(this.x > 0);
        float width = (getWidth() - L) / 2.0f;
        float height = (getHeight() - L) / 2.0f;
        float width2 = (getWidth() + L) / 2.0f;
        float height2 = (getHeight() + L) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(f10);
        int i3 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        eh.j jVar = this.w;
        jVar.setBounds(i3, i10, i11, i12);
        jVar.g.setColor(f10);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int width3 = (getWidth() - L2) / 2;
        int height3 = (getHeight() - L2) / 2;
        int width4 = (getWidth() + L2) / 2;
        int height4 = (getHeight() + L2) / 2;
        Drawable drawable = this.s;
        drawable.setBounds(width3, height3, width4, height4);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.g0.T1(5.0f, 15.0f, d);
        lc lcVar = this.d;
        lcVar.h = T1;
        lcVar.g(rectF);
        lcVar.d();
        lcVar.b(canvas, -1, org.telegram.messenger.g0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d10 > 0.0f) {
            float L3 = org.telegram.messenger.g0.L(12.0f);
            float L4 = org.telegram.messenger.g0.L(6.0f);
            org.telegram.ui.Components.g6 g6Var = this.h;
            float max = Math.max(L3, g6Var.c() + L4);
            float i13 = g6Var.i() * this.H * d10;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i13, i13, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - g6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            g6Var.u(i0.a.f(d, -9866632, -1));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.a.c(this);
    }

    public void setCount(int i3) {
        this.x = i3;
        org.telegram.ui.Components.g6 g6Var = this.h;
        if (i3 > 50000) {
            g6Var.t(org.telegram.messenger.g0.o0(i3, 0), true, true);
        } else {
            g6Var.t(bd.E(i3, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
