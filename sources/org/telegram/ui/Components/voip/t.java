package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.h9;
import org.telegram.ui.g60;
import org.telegram.ui.h60;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class t extends View {
    public g60 E;
    public int F;
    public float G;
    public final /* synthetic */ u H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final h9 c;
    public final ca d;
    public final ca e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final g60[] x;
    public g60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new h9((d6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new g60[3];
        this.F = -1;
        this.G = 1.0f;
        ca caVar = new ca(9);
        this.d = caVar;
        ca caVar2 = new ca(12);
        this.e = caVar2;
        caVar.a = AndroidUtilities.dp(76.0f);
        caVar.b = AndroidUtilities.dp(92.0f);
        caVar.b();
        caVar2.a = AndroidUtilities.dp(80.0f);
        caVar2.b = AndroidUtilities.dp(95.0f);
        caVar2.b();
        paint.setColor(i0.a.d(0.0f, i6.w0(null, i6.pg, false), i6.w0(null, i6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        g60[] g60VarArr = tVar.x;
        p0 p0Var = tVar.H.n0;
        int i10 = (p0Var.k || !((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : p0Var.e ? 1 : 0;
        if (i10 == tVar.F) {
            return;
        }
        tVar.F = i10;
        if (g60VarArr[i10] == null) {
            g60VarArr[i10] = new g60(i10);
            int i11 = tVar.F;
            if (i11 == 2) {
                g60VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{i6.w0(null, i6.ih, false), i6.w0(null, i6.kh, false), i6.w0(null, i6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                g60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.w0(null, i6.Fg, false), i6.w0(null, i6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                g60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.w0(null, i6.Jg, false), i6.w0(null, i6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        g60 g60Var = g60VarArr[tVar.F];
        g60 g60Var2 = tVar.y;
        if (g60Var != g60Var2) {
            tVar.E = g60Var2;
            tVar.y = g60Var;
            if (g60Var2 == null || !z10) {
                tVar.G = 1.0f;
                tVar.E = null;
            } else {
                tVar.G = 0.0f;
            }
        }
        tVar.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAttachedToWindow();
        this.b.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g60 g60Var;
        float f7;
        g60 g60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.H.a;
        rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, pVar.getY() + pVar.getMeasuredHeight() + pVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.b);
        imageReceiver.draw(canvas);
        float f12 = pVar.b;
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
        canvas.scale(f18, f18, this.v, this.w);
        g60 g60Var3 = this.y;
        if (g60Var3 != null) {
            g60Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        ca caVar = this.e;
        caVar.e(f19, 1.0f);
        float f20 = this.n;
        ca caVar2 = this.d;
        caVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (g60Var2 = this.E) == null) {
                if (i10 == 1 && (g60Var = this.y) != null) {
                    paint.setShader(g60Var.g);
                    f7 = this.G;
                }
            } else {
                paint.setShader(g60Var2.g);
                f7 = 1.0f - this.G;
            }
            paint.setAlpha((int) (f7 * 76.0f));
            caVar.a(this.v, this.w, canvas, paint);
            caVar2.a(this.v, this.w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.w);
        this.a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        this.w = (getMeasuredHeight() >> 1) + (h60.F3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f7 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f7);
        imageReceiver.setImageCoords(this.v - f7, this.w - f7, dp, dp);
    }
}
