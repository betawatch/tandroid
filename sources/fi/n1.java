package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import c8.ra;
import di.ec;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class n1 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final m1 a;
    public final RectF b;
    public final Path c;
    public final ec d;
    public final org.telegram.ui.Components.c6 e;
    public final org.telegram.ui.Components.c6 f;
    public final org.telegram.ui.Components.m6 h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final dh.j w;
    public int x;
    public boolean y;

    public n1(Context context, m1 m1Var, gh.b bVar) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        lr lrVar = lr.h;
        this.e = new org.telegram.ui.Components.c6(this, 320L, lrVar);
        this.f = new org.telegram.ui.Components.c6(this, 320L, lrVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.a = m1Var;
        ra.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        dh.j jVar = new dh.j();
        this.w = jVar;
        jVar.a = bVar;
        jVar.a();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.h = m6Var;
        m6Var.u(-9866632);
        m6Var.w(org.telegram.messenger.g0.L(9.0f));
        m6Var.setCallback(this);
        m6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        lq lqVar = new lq(R.drawable.star, 0);
        lqVar.I = 1.8f;
        lqVar.J = 1.8f;
        setCount(0);
        this.d = new ec(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(38.0f);
        float d = this.e.d(this.y);
        float d2 = this.f.d(this.x > 0);
        float width = (getWidth() - L) / 2.0f;
        float height = (getHeight() - L) / 2.0f;
        float width2 = (getWidth() + L) / 2.0f;
        float height2 = (getHeight() + L) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(f10);
        int i7 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        dh.j jVar = this.w;
        jVar.setBounds(i7, i10, i11, i12);
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
        ec ecVar = this.d;
        ecVar.h = T1;
        ecVar.g(rectF);
        ecVar.d();
        ecVar.b(canvas, -1, org.telegram.messenger.g0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            float L3 = org.telegram.messenger.g0.L(12.0f);
            float L4 = org.telegram.messenger.g0.L(6.0f);
            org.telegram.ui.Components.m6 m6Var = this.h;
            float max = Math.max(L3, m6Var.c() + L4);
            float i13 = m6Var.i() * this.H * d2;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i13, i13, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - m6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            m6Var.u(i0.a.f(d, -9866632, -1));
            m6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a.c(this);
    }

    public void setCount(int i7) {
        this.x = i7;
        org.telegram.ui.Components.m6 m6Var = this.h;
        if (i7 > 50000) {
            m6Var.t(org.telegram.messenger.g0.o0(i7, 0), true, true);
        } else {
            m6Var.t(gd.E(i7, ','), true, true);
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
