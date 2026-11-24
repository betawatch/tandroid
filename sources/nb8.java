// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nb8 extends View {
    public final Paint a;
    public final ho b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final ho h;
    public String n;
    public boolean r;
    public final ln s;
    public boolean w;
    public int x;

    public nb8(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        d53 d53Var = d53.h;
        this.s = new ln(this, 0L, 350L, d53Var);
        paint.setColor(2130706432);
        ho hoVar = new ho(false, true, true);
        this.b = hoVar;
        hoVar.n(0.3f, 320L, d53Var);
        hoVar.u(-1);
        hoVar.w(gm.L(14.0f));
        hoVar.x(gm.o());
        hoVar.setCallback(this);
        hoVar.t("0", true, true);
        Point point = gm.q;
        hoVar.N = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setTypeface(gm.o());
        c();
        ho hoVar2 = new ho(false, true, true);
        this.h = hoVar2;
        hoVar2.n(0.3f, 320L, d53Var);
        hoVar2.u(-1);
        hoVar2.w(gm.L(14.0f));
        hoVar2.x(gm.o());
        hoVar2.setCallback(this);
        hoVar2.t("0", true, true);
        hoVar2.N = point.x;
    }

    public final void a(int i, int i2) {
        b(i, i2, true);
    }

    public final void b(int i, int i2, boolean z) {
        boolean z2 = false;
        int max = Math.max(0, i);
        int max2 = Math.max(max, i2);
        if (jb6.D0().B != null && !TextUtils.equals(this.n, jb6.D0().B.c)) {
            c();
        }
        this.b.t(String.format("%d", Integer.valueOf(jb6.a0 ? max2 : max)), (!z || this.w || jb6.a0) ? false : true, true);
        if (!jb6.a0) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z && !this.w && !jb6.a0) {
            z2 = true;
        }
        this.h.t(format, z2, true);
        this.w = !z;
    }

    public final void c() {
        this.n = jb6.D0().B.c;
        StaticLayout staticLayout = new StaticLayout(jb6.M0(2131747562, null).replace("%1$d", "").replace("%2$d", ""), this.c, gm.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f = this.d.getLineDescent(0);
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
        }
    }

    public final void d(boolean z, boolean z2) {
        if (this.r != z) {
            this.r = z;
            if (!z) {
                this.w = true;
            }
            if (!z2) {
                this.s.e(true, z ? 1.0f : 0.0f);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.s.e(false, this.r ? 1.0f : 0.0f);
        if (e <= 0.0f) {
            return;
        }
        ho hoVar = this.b;
        float c = hoVar.c() + this.e;
        ho hoVar2 = this.h;
        float c2 = hoVar2.c() + c + gm.L(18.0f);
        float f = ((1.0f - e) * (-gm.L(8.0f))) + this.x;
        RectF rectF = gm.P;
        rectF.set((getWidth() - c2) / 2.0f, gm.N(10.0f) + f, (getWidth() + c2) / 2.0f, gm.N(33.0f) + f);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e));
        canvas.drawRoundRect(rectF, gm.N(12.0f), gm.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c2) / 2.0f) + gm.L(9.0f), f + gm.L(9.5f));
        hoVar.setBounds(0, 0, (int) hoVar.c(), gm.L(23.0f));
        int i = (int) (e * 255.0f);
        hoVar.C = i;
        hoVar.draw(canvas);
        canvas.translate(hoVar.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (gm.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        hoVar2.setBounds(0, 0, (int) hoVar2.c(), gm.L(23.0f));
        hoVar2.C = i;
        hoVar2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.x = a.getCurrentActionBarHeight() + gm.m;
        this.b.N = size;
        this.h.N = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), wi8.E(43.0f, this.x, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
