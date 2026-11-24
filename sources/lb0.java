// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class lb0 extends FrameLayout {
    public float E;
    public float F;
    public final /* synthetic */ mb0 G;
    public long a;
    public TLRPC.Document b;
    public final kb0 c;
    public final kz4 d;
    public final kz4 e;
    public float f;
    public hb0 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final lm s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(mb0 mb0Var, Activity activity) {
        super(activity);
        this.G = mb0Var;
        this.d = new kz4();
        this.e = new kz4();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new lm(200L, this, s33.g);
        this.x = -1.0f;
        kb0 kb0Var = new kb0((byte) 0, activity, this);
        this.c = kb0Var;
        kb0Var.getImageReceiver().N(1);
        kb0Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(kb0Var, nme.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = this.s.c;
        if (f5 == 0.0f) {
            canvas.drawCircle(f, f2, f4, paint);
            return;
        }
        float R1 = gl.R1(f3, 0.0f, f5);
        RectF rectF = gl.P;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawRoundRect(rectF, R1, R1, paint);
    }

    public final void b(hb0 hb0Var, boolean z) {
        hb0 hb0Var2 = this.h;
        if (hb0Var2 != null) {
            this.e.d(hb0Var2.c, hb0Var2.d, hb0Var2.e, hb0Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = hb0Var;
        this.n = z;
        kk7.e().k(kk7.t4, new Object[0]);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lb0 lb0Var;
        Canvas canvas2;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        mb0 mb0Var = this.G;
        float measuredWidth = mb0Var.V ? getMeasuredWidth() * 0.3f : gl.L(50.0f);
        float f = this.w ? 1.0f : 0.0f;
        lm lmVar = this.s;
        lmVar.e(false, f);
        float f2 = this.x;
        if (f2 >= 0.0f) {
            lmVar.e(true, f2);
        }
        float R1 = gl.R1(measuredWidth, getMeasuredWidth() / 2.0f, lmVar.c);
        this.y = R1;
        this.y = gl.R1(R1, gl.L(21.0f), mb0Var.O);
        this.E = gl.R1(this.E, (getMeasuredWidth() - gl.L(12.0f)) - gl.L(21.0f), mb0Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((mb0Var.d - mb0Var.c) / 2.0f) * mb0Var.F) + getMeasuredHeight());
        hb0 hb0Var = this.h;
        if (hb0Var != null) {
            int i = hb0Var.c;
            int i2 = hb0Var.d;
            int i3 = hb0Var.e;
            int i4 = hb0Var.f;
            kz4 kz4Var = this.d;
            kz4Var.d(i, i2, i3, i4);
            Paint paint = kz4Var.c;
            float f3 = this.E;
            float f4 = this.y;
            float f5 = this.F;
            kz4Var.b(f3 - f4, f5 - f4, f3 + f4, f5 + f4);
            if (this.f != 1.0f) {
                float f6 = this.E;
                float f7 = this.y;
                float f8 = f6 - f7;
                float f9 = this.F;
                float f10 = f9 - f7;
                float f11 = f6 + f7;
                float f12 = f9 + f7;
                kz4 kz4Var2 = this.e;
                kz4Var2.b(f8, f10, f11, f12);
                Paint paint2 = kz4Var2.c;
                paint2.setAlpha(kk7.d4);
                lb0Var = this;
                lb0Var.a(canvas, this.E, this.F, measuredWidth, this.y, paint2);
                paint.setAlpha((int) (lb0Var.f * 255.0f));
                lb0Var.a(canvas, lb0Var.E, lb0Var.F, measuredWidth, lb0Var.y, paint);
                float f13 = lb0Var.f + 0.064f;
                lb0Var.f = f13;
                if (f13 > 1.0f) {
                    lb0Var.f = 1.0f;
                }
                lb0Var.invalidate();
                canvas2 = canvas;
            } else {
                lb0Var = this;
                paint.setAlpha(kk7.d4);
                canvas2 = canvas;
                lb0Var.a(canvas2, lb0Var.E, lb0Var.F, measuredWidth, lb0Var.y, paint);
            }
        } else {
            lb0Var = this;
            canvas2 = canvas;
        }
        float R12 = gl.R1(gl.U1(lmVar.c, mb0Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : gl.L(70.0f), (int) (lb0Var.getMeasuredWidth() * 0.7f)), (int) (gl.L(42.0f) * 0.7f), mb0Var.O) / 2.0f;
        kb0 kb0Var = lb0Var.c;
        vl vlVar = kb0Var.e;
        if (vlVar == null) {
            ImageReceiver imageReceiver = kb0Var.a;
            float f14 = lb0Var.E - R12;
            float f15 = lb0Var.F - R12;
            float f16 = R12 * 2.0f;
            imageReceiver.i0(f14, f15, f16, f16);
            kb0Var.a.q0((int) (f16 * 0.13f));
            kb0Var.a.h(canvas2, null);
            return;
        }
        ml mlVar = vlVar.k;
        if (mlVar != null) {
            mlVar.q0((int) (2.0f * R12 * 0.13f));
        }
        vl vlVar2 = kb0Var.e;
        float f17 = lb0Var.E;
        float f18 = lb0Var.F;
        vlVar2.setBounds((int) (f17 - R12), (int) (f18 - R12), (int) (f17 + R12), (int) (f18 + R12));
        kb0Var.e.setColorFilter(lb0Var.r);
        kb0Var.e.draw(canvas2);
    }

    public long getDuration() {
        kb0 kb0Var = this.c;
        ImageReceiver imageReceiver = kb0Var.getImageReceiver();
        vl vlVar = kb0Var.e;
        if (vlVar != null) {
            imageReceiver = vlVar.k;
        }
        if (imageReceiver == null || imageReceiver.y() == null) {
            return 5000L;
        }
        return imageReceiver.y().m();
    }

    public ImageReceiver getImageReceiver() {
        kb0 kb0Var = this.c;
        ImageReceiver imageReceiver = kb0Var.getImageReceiver();
        vl vlVar = kb0Var.e;
        if (vlVar == null) {
            return imageReceiver;
        }
        ml mlVar = vlVar.k;
        vlVar.setColorFilter(this.r);
        return mlVar;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.G.V) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z) {
        ml mlVar;
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (z) {
            kb0 kb0Var = this.c;
            vl vlVar = kb0Var.e;
            if (vlVar != null && (mlVar = vlVar.k) != null) {
                mlVar.w0(false);
            }
            kb0Var.a.w0(false);
        }
        kk7.e().k(kk7.t4, new Object[0]);
        invalidate();
    }
}
