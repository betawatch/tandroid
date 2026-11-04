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
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.w30;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q extends View implements z5 {
    public w30 E;
    public w30 F;
    public int G;
    public float H;
    public final /* synthetic */ r I;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final u8 c;
    public final q9 d;
    public final q9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final w30[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context) {
        super(context);
        this.I = rVar;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new u8((e6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new w30[3];
        this.G = -1;
        this.H = 1.0f;
        q9 q9Var = new q9(9);
        this.d = q9Var;
        q9 q9Var2 = new q9(12);
        this.e = q9Var2;
        q9Var.a = org.telegram.messenger.g0.L(76.0f);
        q9Var.b = org.telegram.messenger.g0.L(92.0f);
        q9Var.b();
        q9Var2.a = org.telegram.messenger.g0.L(80.0f);
        q9Var2.b = org.telegram.messenger.g0.L(95.0f);
        q9Var2.b();
        paint.setColor(i0.a.f(0.0f, k6.x0(null, k6.dh, false), k6.x0(null, k6.eh, false)));
        paint.setAlpha(hs.n1);
        paint2.setColor(i0.a.o(-16777216, hs.L1));
    }

    public static void a(q qVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        w30[] w30VarArr = qVar.y;
        a0 a0Var = qVar.I.o0;
        int i3 = (a0Var.k || !((groupCallParticipant = a0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : a0Var.e ? 1 : 0;
        if (i3 == qVar.G) {
            return;
        }
        qVar.G = i3;
        if (w30VarArr[i3] == null) {
            w30VarArr[i3] = new w30(i3);
            int i10 = qVar.G;
            if (i10 == 2) {
                w30VarArr[i10].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.x0(null, k6.Wh, false), k6.x0(null, k6.Yh, false), k6.x0(null, k6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                w30VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.th, false), k6.x0(null, k6.vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                w30VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.xh, false), k6.x0(null, k6.wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        w30 w30Var = w30VarArr[qVar.G];
        w30 w30Var2 = qVar.E;
        if (w30Var != w30Var2) {
            qVar.F = w30Var2;
            qVar.E = w30Var;
            if (w30Var2 == null || !z10) {
                qVar.H = 1.0f;
                qVar.F = null;
            } else {
                qVar.H = 0.0f;
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
        w30 w30Var;
        float f10;
        w30 w30Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        n nVar = this.I.a;
        rectF.set(nVar.getX() + nVar.P, nVar.getY() + nVar.O, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.P, nVar.getY() + nVar.getMeasuredHeight() + nVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) nVar.b);
        imageReceiver.h(canvas, null);
        float f13 = nVar.b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.r;
        float f15 = this.n;
        if (f14 != f15) {
            float f16 = this.s;
            float f17 = (16.0f * f16) + f15;
            this.n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.n = f14;
                }
            } else if (f17 < f14) {
                this.n = f14;
            }
        }
        float f18 = this.H;
        if (f18 != 1.0f) {
            if (this.F != null) {
                this.H = f18 + 0.07272727f;
            }
            if (this.H >= 1.0f) {
                this.H = 1.0f;
                this.F = null;
            }
        }
        float f19 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.w, this.x);
        w30 w30Var3 = this.E;
        if (w30Var3 != null) {
            w30Var3.b((int) (this.x - org.telegram.messenger.g0.L(100.0f)), (int) (this.w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        q9 q9Var = this.e;
        q9Var.e(f20, 1.0f);
        float f21 = this.n;
        q9 q9Var2 = this.d;
        q9Var2.e(f21, 1.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            Paint paint = this.f;
            if (i3 != 0 || (w30Var2 = this.F) == null) {
                if (i3 == 1 && (w30Var = this.E) != null) {
                    paint.setShader(w30Var.g);
                    f10 = this.H;
                }
            } else {
                paint.setShader(w30Var2.g);
                f10 = 1.0f - this.H;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            q9Var.a(this.w, this.x, canvas, paint);
            q9Var2.a(this.w, this.x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.w, this.x);
        this.a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.w = getMeasuredWidth() >> 1;
        this.x = (getMeasuredHeight() >> 1) + (x30.x5 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = L / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.J0((int) f10);
        imageReceiver.y0(this.w - f10, this.x - f10, L, L);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.f.setColor(i0.a.f(0.0f, k6.x0(null, k6.dh, false), k6.x0(null, k6.eh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
