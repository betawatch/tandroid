package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.a50;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q extends View implements k6 {
    public a50 D;
    public a50 E;
    public int F;
    public float G;
    public final /* synthetic */ r H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final r8 c;
    public final m9 d;
    public final m9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final a50[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context) {
        super(context);
        this.H = rVar;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new r8((p6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new a50[3];
        this.F = -1;
        this.G = 1.0f;
        m9 m9Var = new m9(9);
        this.d = m9Var;
        m9 m9Var2 = new m9(12);
        this.e = m9Var2;
        m9Var.a = org.telegram.messenger.i0.L(76.0f);
        m9Var.b = org.telegram.messenger.i0.L(92.0f);
        m9Var.b();
        m9Var2.a = org.telegram.messenger.i0.L(80.0f);
        m9Var2.b = org.telegram.messenger.i0.L(95.0f);
        m9Var2.b();
        paint.setColor(i0.b.f(0.0f, t6.x0(null, t6.dh, false), t6.x0(null, t6.eh, false)));
        paint.setAlpha(zs.n1);
        paint2.setColor(i0.b.o(-16777216, zs.L1));
    }

    public static void a(q qVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        a50[] a50VarArr = qVar.y;
        z zVar = qVar.H.n0;
        int i10 = (zVar.k || !((groupCallParticipant = zVar.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : zVar.e ? 1 : 0;
        if (i10 == qVar.F) {
            return;
        }
        qVar.F = i10;
        if (a50VarArr[i10] == null) {
            a50VarArr[i10] = new a50(i10);
            int i11 = qVar.F;
            if (i11 == 2) {
                a50VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{t6.x0(null, t6.Wh, false), t6.x0(null, t6.Yh, false), t6.x0(null, t6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                a50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{t6.x0(null, t6.th, false), t6.x0(null, t6.vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                a50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{t6.x0(null, t6.xh, false), t6.x0(null, t6.wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        a50 a50Var = a50VarArr[qVar.F];
        a50 a50Var2 = qVar.D;
        if (a50Var != a50Var2) {
            qVar.E = a50Var2;
            qVar.D = a50Var;
            if (a50Var2 == null || !z10) {
                qVar.G = 1.0f;
                qVar.E = null;
            } else {
                qVar.G = 0.0f;
            }
        }
        qVar.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
        this.b.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        this.b.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a50 a50Var;
        float f7;
        a50 a50Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        n nVar = this.H.a;
        rectF.set(nVar.getX() + nVar.O, nVar.getY() + nVar.N, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.O, nVar.getY() + nVar.getMeasuredHeight() + nVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f10, f11, width, height);
        imageReceiver.J0((int) nVar.b);
        imageReceiver.h(canvas, null);
        float f12 = nVar.b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.r;
        float f14 = this.n;
        if (f13 != f14) {
            float f15 = this.s;
            float f16 = (16.0f * f15) + f14;
            this.n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.n = f13;
                }
            } else if (f16 < f13) {
                this.n = f13;
            }
        }
        float f17 = this.G;
        if (f17 != 1.0f) {
            if (this.E != null) {
                this.G = f17 + 0.07272727f;
            }
            if (this.G >= 1.0f) {
                this.G = 1.0f;
                this.E = null;
            }
        }
        float f18 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.w, this.x);
        a50 a50Var3 = this.D;
        if (a50Var3 != null) {
            a50Var3.b((int) (this.x - org.telegram.messenger.i0.L(100.0f)), (int) (this.w - org.telegram.messenger.i0.L(100.0f)), org.telegram.messenger.i0.L(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        m9 m9Var = this.e;
        m9Var.e(f19, 1.0f);
        float f20 = this.n;
        m9 m9Var2 = this.d;
        m9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (a50Var2 = this.E) == null) {
                if (i10 == 1 && (a50Var = this.D) != null) {
                    paint.setShader(a50Var.g);
                    f7 = this.G;
                }
            } else {
                paint.setShader(a50Var2.g);
                f7 = 1.0f - this.G;
            }
            paint.setAlpha((int) (f7 * 76.0f));
            m9Var.a(this.w, this.x, canvas, paint);
            m9Var2.a(this.w, this.x, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.w, this.x);
        this.a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(157.0f);
        this.w = getMeasuredWidth() >> 1;
        this.x = (getMeasuredHeight() >> 1) + (b50.w5 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f7 = L / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.J0((int) f7);
        imageReceiver.y0(this.w - f7, this.x - f7, L, L);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.f.setColor(i0.b.f(0.0f, t6.x0(null, t6.dh, false), t6.x0(null, t6.eh, false)));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
