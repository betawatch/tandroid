// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class myb extends FrameLayout {
    public final bf0 a;
    public final Paint b;
    public final RectF c;
    public final ln d;
    public lyb e;
    public String f;
    public vm h;
    public int n;
    public boolean r;
    public final /* synthetic */ oyb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myb(oyb oybVar, Context context) {
        super(context);
        this.s = oybVar;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new ln(this, 0L, 260L, d53.h);
        setWillNotDraw(false);
        rve.a(this);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        lyb lybVar = this.e;
        if (lybVar != null) {
            long j = lybVar.a;
            oyb oybVar = this.s;
            if (j == 0 ? lybVar.b.equals(oybVar.W) : j == oybVar.V) {
                z2 = true;
                this.r = z2;
                if (!z) {
                    this.d.e(true, z2 ? 1.0f : 0.0f);
                }
                invalidate();
            }
        }
        z2 = false;
        this.r = z2;
        if (!z) {
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        oyb oybVar = this.s;
        TextPaint textPaint = oybVar.l0;
        ylb ylbVar = oybVar.e;
        float e = this.d.e(false, this.r ? 1.0f : 0.0f);
        int v0 = cmb.v0(cmb.sk, ylbVar);
        RectF rectF = this.c;
        rectF.set(gm.L(3.0f), (getHeight() - gm.L(28.0f)) / 2.0f, getWidth() - gm.L(3.0f), (gm.L(28.0f) + getHeight()) / 2.0f);
        int f = on2.f(e, cmb.v0(cmb.N5, ylbVar), v0);
        Paint paint = this.b;
        paint.setColor(f);
        canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
        int f2 = on2.f(e, cmb.v0(cmb.F6, ylbVar), cmb.v0(cmb.vk, ylbVar));
        vm vmVar = this.h;
        if (vmVar != null && this.n != f2) {
            this.n = f2;
            vmVar.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            textPaint.setColor(f2);
            canvas.drawText(this.f, gm.L(15.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        if (this.f == null) {
            L = gm.L(44.0f);
        } else {
            L = gm.L(15.0f) + gm.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), i2);
    }
}
