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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jwb extends FrameLayout {
    public final be0 a;
    public final Paint b;
    public final RectF c;
    public final lm d;
    public iwb e;
    public String f;
    public vl h;
    public int n;
    public boolean r;
    public final /* synthetic */ lwb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwb(lwb lwbVar, Context context) {
        super(context);
        this.s = lwbVar;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new lm(this, 0L, 260L, s33.h);
        setWillNotDraw(false);
        ote.a(this);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        iwb iwbVar = this.e;
        if (iwbVar != null) {
            long j = iwbVar.a;
            lwb lwbVar = this.s;
            if (j == 0 ? iwbVar.b.equals(lwbVar.W) : j == lwbVar.V) {
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
        lwb lwbVar = this.s;
        TextPaint textPaint = lwbVar.l0;
        wjb wjbVar = lwbVar.e;
        float e = this.d.e(false, this.r ? 1.0f : 0.0f);
        int v0 = bkb.v0(bkb.sk, wjbVar);
        RectF rectF = this.c;
        rectF.set(gl.L(3.0f), (getHeight() - gl.L(28.0f)) / 2.0f, getWidth() - gl.L(3.0f), (gl.L(28.0f) + getHeight()) / 2.0f);
        int f = bm2.f(e, bkb.v0(bkb.N5, wjbVar), v0);
        Paint paint = this.b;
        paint.setColor(f);
        canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
        int f2 = bm2.f(e, bkb.v0(bkb.F6, wjbVar), bkb.v0(bkb.vk, wjbVar));
        vl vlVar = this.h;
        if (vlVar != null && this.n != f2) {
            this.n = f2;
            vlVar.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            textPaint.setColor(f2);
            canvas.drawText(this.f, gl.L(15.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        if (this.f == null) {
            L = gl.L(44.0f);
        } else {
            L = gl.L(15.0f) + gl.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), i2);
    }
}
