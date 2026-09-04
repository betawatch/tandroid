package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class l2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final k2 a;
    public final RectF b;
    public final Path c;
    public final zh.h8 d;
    public final org.telegram.ui.Components.e6 e;
    public final org.telegram.ui.Components.e6 f;
    public final org.telegram.ui.Components.p6 h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final bh.j v;
    public int w;
    public boolean x;
    public long y;

    public l2(Context context, k2 k2Var, eh.b bVar) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        pr prVar = pr.h;
        this.e = new org.telegram.ui.Components.e6(this, 320L, prVar);
        this.f = new org.telegram.ui.Components.e6(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.a = k2Var;
        w7.z5.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        bh.j jVar = new bh.j();
        this.v = jVar;
        jVar.a(bVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.h = p6Var;
        p6Var.r(-9866632);
        p6Var.t(AndroidUtilities.dp(9.0f));
        p6Var.setCallback(this);
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new nq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new zh.h8(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(38.0f);
        float e7 = this.e.e(this.x);
        float e10 = this.f.e(this.w > 0);
        float width = (getWidth() - dp) / 2.0f;
        float height = (getHeight() - dp) / 2.0f;
        float width2 = (getWidth() + dp) / 2.0f;
        float height2 = (getHeight() + dp) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int d = i0.a.d(e7, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(d);
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        bh.j jVar = this.v;
        jVar.setBounds(i10, i11, i12, i13);
        jVar.g.setColor(d);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        int width3 = (getWidth() - dp2) / 2;
        int height3 = (getHeight() - dp2) / 2;
        int width4 = (getWidth() + dp2) / 2;
        int height4 = (getHeight() + dp2) / 2;
        Drawable drawable = this.s;
        drawable.setBounds(width3, height3, width4, height4);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e7);
        zh.h8 h8Var = this.d;
        h8Var.h = lerp;
        h8Var.g(rectF);
        h8Var.d();
        h8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e7));
        invalidate();
        canvas.restore();
        if (e10 > 0.0f) {
            float dp3 = AndroidUtilities.dp(12.0f);
            float dp4 = AndroidUtilities.dp(6.0f);
            org.telegram.ui.Components.p6 p6Var = this.h;
            float max = Math.max(dp3, p6Var.d() + dp4);
            float g10 = p6Var.g() * this.G * e10;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - p6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            p6Var.r(i0.a.d(e7, -9866632, -1));
            p6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.c(this);
    }

    public void setCount(int i10) {
        this.w = i10;
        org.telegram.ui.Components.p6 p6Var = this.h;
        if (i10 > 50000) {
            p6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            p6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
