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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class lc0 extends FrameLayout {
    public float E;
    public float F;
    public final /* synthetic */ mc0 G;
    public long a;
    public TLRPC.Document b;
    public final kc0 c;
    public final j15 d;
    public final j15 e;
    public float f;
    public hc0 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final ln s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc0(mc0 mc0Var, Activity activity) {
        super(activity);
        this.G = mc0Var;
        this.d = new j15();
        this.e = new j15();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new ln(200L, this, d53.g);
        this.x = -1.0f;
        kc0 kc0Var = new kc0((byte) 0, activity, this);
        this.c = kc0Var;
        kc0Var.getImageReceiver().N(1);
        kc0Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(kc0Var, qoe.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = this.s.c;
        if (f5 == 0.0f) {
            canvas.drawCircle(f, f2, f4, paint);
            return;
        }
        float R1 = gm.R1(f3, 0.0f, f5);
        RectF rectF = gm.P;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawRoundRect(rectF, R1, R1, paint);
    }

    public final void b(hc0 hc0Var, boolean z) {
        hc0 hc0Var2 = this.h;
        if (hc0Var2 != null) {
            this.e.d(hc0Var2.c, hc0Var2.d, hc0Var2.e, hc0Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = hc0Var;
        this.n = z;
        nm7.e().k(nm7.v4, new Object[0]);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lc0 lc0Var;
        Canvas canvas2;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        mc0 mc0Var = this.G;
        float measuredWidth = mc0Var.V ? getMeasuredWidth() * 0.3f : gm.L(50.0f);
        float f = this.w ? 1.0f : 0.0f;
        ln lnVar = this.s;
        lnVar.e(false, f);
        float f2 = this.x;
        if (f2 >= 0.0f) {
            lnVar.e(true, f2);
        }
        float R1 = gm.R1(measuredWidth, getMeasuredWidth() / 2.0f, lnVar.c);
        this.y = R1;
        this.y = gm.R1(R1, gm.L(21.0f), mc0Var.O);
        this.E = gm.R1(this.E, (getMeasuredWidth() - gm.L(12.0f)) - gm.L(21.0f), mc0Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((mc0Var.d - mc0Var.c) / 2.0f) * mc0Var.F) + getMeasuredHeight());
        hc0 hc0Var = this.h;
        if (hc0Var != null) {
            int i = hc0Var.c;
            int i2 = hc0Var.d;
            int i3 = hc0Var.e;
            int i4 = hc0Var.f;
            j15 j15Var = this.d;
            j15Var.d(i, i2, i3, i4);
            Paint paint = j15Var.c;
            float f3 = this.E;
            float f4 = this.y;
            float f5 = this.F;
            j15Var.b(f3 - f4, f5 - f4, f3 + f4, f5 + f4);
            if (this.f != 1.0f) {
                float f6 = this.E;
                float f7 = this.y;
                float f8 = f6 - f7;
                float f9 = this.F;
                float f10 = f9 - f7;
                float f11 = f6 + f7;
                float f12 = f9 + f7;
                j15 j15Var2 = this.e;
                j15Var2.b(f8, f10, f11, f12);
                Paint paint2 = j15Var2.c;
                paint2.setAlpha(nm7.d4);
                lc0Var = this;
                lc0Var.a(canvas, this.E, this.F, measuredWidth, this.y, paint2);
                paint.setAlpha((int) (lc0Var.f * 255.0f));
                lc0Var.a(canvas, lc0Var.E, lc0Var.F, measuredWidth, lc0Var.y, paint);
                float f13 = lc0Var.f + 0.064f;
                lc0Var.f = f13;
                if (f13 > 1.0f) {
                    lc0Var.f = 1.0f;
                }
                lc0Var.invalidate();
                canvas2 = canvas;
            } else {
                lc0Var = this;
                paint.setAlpha(nm7.d4);
                canvas2 = canvas;
                lc0Var.a(canvas2, lc0Var.E, lc0Var.F, measuredWidth, lc0Var.y, paint);
            }
        } else {
            lc0Var = this;
            canvas2 = canvas;
        }
        float R12 = gm.R1(gm.U1(lnVar.c, mc0Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : gm.L(70.0f), (int) (lc0Var.getMeasuredWidth() * 0.7f)), (int) (gm.L(42.0f) * 0.7f), mc0Var.O) / 2.0f;
        kc0 kc0Var = lc0Var.c;
        vm vmVar = kc0Var.e;
        if (vmVar == null) {
            ImageReceiver imageReceiver = kc0Var.a;
            float f14 = lc0Var.E - R12;
            float f15 = lc0Var.F - R12;
            float f16 = R12 * 2.0f;
            imageReceiver.i0(f14, f15, f16, f16);
            kc0Var.a.q0((int) (f16 * 0.13f));
            kc0Var.a.h(canvas2, null);
            return;
        }
        mm mmVar = vmVar.k;
        if (mmVar != null) {
            mmVar.q0((int) (2.0f * R12 * 0.13f));
        }
        vm vmVar2 = kc0Var.e;
        float f17 = lc0Var.E;
        float f18 = lc0Var.F;
        vmVar2.setBounds((int) (f17 - R12), (int) (f18 - R12), (int) (f17 + R12), (int) (f18 + R12));
        kc0Var.e.setColorFilter(lc0Var.r);
        kc0Var.e.draw(canvas2);
    }

    public long getDuration() {
        kc0 kc0Var = this.c;
        ImageReceiver imageReceiver = kc0Var.getImageReceiver();
        vm vmVar = kc0Var.e;
        if (vmVar != null) {
            imageReceiver = vmVar.k;
        }
        if (imageReceiver == null || imageReceiver.y() == null) {
            return 5000L;
        }
        return imageReceiver.y().m();
    }

    public ImageReceiver getImageReceiver() {
        kc0 kc0Var = this.c;
        ImageReceiver imageReceiver = kc0Var.getImageReceiver();
        vm vmVar = kc0Var.e;
        if (vmVar == null) {
            return imageReceiver;
        }
        mm mmVar = vmVar.k;
        vmVar.setColorFilter(this.r);
        return mmVar;
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
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z) {
        mm mmVar;
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (z) {
            kc0 kc0Var = this.c;
            vm vmVar = kc0Var.e;
            if (vmVar != null && (mmVar = vmVar.k) != null) {
                mmVar.w0(false);
            }
            kc0Var.a.w0(false);
        }
        nm7.e().k(nm7.v4, new Object[0]);
        invalidate();
    }
}
