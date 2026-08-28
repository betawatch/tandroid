package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import gh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t1 extends View {
    public float A;
    public final int[] B;
    public final float C;
    public final s1 a;
    public final RectF b;
    public final Path c;
    public final bb d;
    public final org.telegram.ui.Components.y5 e;
    public final org.telegram.ui.Components.y5 f;
    public final org.telegram.ui.Components.i6 h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final ig.i v;
    public int w;
    public boolean x;
    public long y;

    public t1(Context context, s1 s1Var, lg.b bVar) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        gr grVar = gr.h;
        this.e = new org.telegram.ui.Components.y5(this, 320L, grVar);
        this.f = new org.telegram.ui.Components.y5(this, 320L, grVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.B = new int[2];
        this.C = 1.0f;
        this.a = s1Var;
        g7.g6.a(this);
        this.s = context.getResources().getDrawable(R.drawable.star).mutate();
        ig.i iVar = new ig.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.h = i6Var;
        i6Var.r(-9866632);
        i6Var.t(AndroidUtilities.dp(9.0f));
        i6Var.setCallback(this);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new eq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new bb(1, 50);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(38.0f);
        float e10 = this.e.e(this.x);
        float e11 = this.f.e(this.w > 0);
        float width = (getWidth() - dp) / 2.0f;
        float height = (getHeight() - dp) / 2.0f;
        float width2 = (getWidth() + dp) / 2.0f;
        float height2 = (getHeight() + dp) / 2.0f;
        RectF rectF = this.b;
        rectF.set(width, height, width2, height2);
        int d = i0.a.d(e10, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(d);
        int i9 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        ig.i iVar = this.v;
        iVar.setBounds(i9, i10, i11, i12);
        iVar.g.setColor(d);
        iVar.invalidateSelf();
        iVar.draw(canvas);
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
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e10);
        bb bbVar = this.d;
        bbVar.h = lerp;
        bbVar.g(rectF);
        bbVar.d();
        bbVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e10));
        invalidate();
        canvas.restore();
        if (e11 > 0.0f) {
            float dp3 = AndroidUtilities.dp(12.0f);
            float dp4 = AndroidUtilities.dp(6.0f);
            org.telegram.ui.Components.i6 i6Var = this.h;
            float max = Math.max(dp3, i6Var.d() + dp4);
            float g10 = i6Var.g() * this.C * e11;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - i6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            i6Var.r(i0.a.d(e10, -9866632, -1));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.a.c(this);
    }

    public void setCount(int i9) {
        this.w = i9;
        org.telegram.ui.Components.i6 i6Var = this.h;
        if (i9 > 50000) {
            i6Var.q(AndroidUtilities.formatWholeNumber(i9, 0), true, true);
        } else {
            i6Var.q(LocaleController.formatNumber(i9, ','), true, true);
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
