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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cd8 extends View {
    public final Paint a;
    public final hn b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final hn h;
    public String n;
    public boolean r;
    public final mm s;
    public boolean w;
    public int x;

    public cd8(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        k43 k43Var = k43.h;
        this.s = new mm(this, 0L, 350L, k43Var);
        paint.setColor(2130706432);
        hn hnVar = new hn(false, true, true);
        this.b = hnVar;
        hnVar.n(0.3f, 320L, k43Var);
        hnVar.u(-1);
        hnVar.w(hl.L(14.0f));
        hnVar.x(hl.o());
        hnVar.setCallback(this);
        hnVar.t("0", true, true);
        Point point = hl.q;
        hnVar.N = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setTypeface(hl.o());
        c();
        hn hnVar2 = new hn(false, true, true);
        this.h = hnVar2;
        hnVar2.n(0.3f, 320L, k43Var);
        hnVar2.u(-1);
        hnVar2.w(hl.L(14.0f));
        hnVar2.x(hl.o());
        hnVar2.setCallback(this);
        hnVar2.t("0", true, true);
        hnVar2.N = point.x;
    }

    public final void a(int i, int i2) {
        b(i, i2, true);
    }

    public final void b(int i, int i2, boolean z) {
        boolean z2 = false;
        int max = Math.max(0, i);
        int max2 = Math.max(max, i2);
        if (ob6.D0().B != null && !TextUtils.equals(this.n, ob6.D0().B.c)) {
            c();
        }
        this.b.t(String.format("%d", Integer.valueOf(ob6.a0 ? max2 : max)), (!z || this.w || ob6.a0) ? false : true, true);
        if (!ob6.a0) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z && !this.w && !ob6.a0) {
            z2 = true;
        }
        this.h.t(format, z2, true);
        this.w = !z;
    }

    public final void c() {
        this.n = ob6.D0().B.c;
        StaticLayout staticLayout = new StaticLayout(ob6.M0(2131747556, null).replace("%1$d", "").replace("%2$d", ""), this.c, hl.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        hn hnVar = this.b;
        float c = hnVar.c() + this.e;
        hn hnVar2 = this.h;
        float c2 = hnVar2.c() + c + hl.L(18.0f);
        float f = ((1.0f - e) * (-hl.L(8.0f))) + this.x;
        RectF rectF = hl.P;
        rectF.set((getWidth() - c2) / 2.0f, hl.N(10.0f) + f, (getWidth() + c2) / 2.0f, hl.N(33.0f) + f);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e));
        canvas.drawRoundRect(rectF, hl.N(12.0f), hl.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c2) / 2.0f) + hl.L(9.0f), f + hl.L(9.5f));
        hnVar.setBounds(0, 0, (int) hnVar.c(), hl.L(23.0f));
        int i = (int) (e * 255.0f);
        hnVar.C = i;
        hnVar.draw(canvas);
        canvas.translate(hnVar.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (hl.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        hnVar2.setBounds(0, 0, (int) hnVar2.c(), hl.L(23.0f));
        hnVar2.C = i;
        hnVar2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.x = a.getCurrentActionBarHeight() + hl.m;
        this.b.N = size;
        this.h.N = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), ik8.E(43.0f, this.x, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
