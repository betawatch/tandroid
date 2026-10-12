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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.k9;
import org.telegram.ui.m60;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s extends View {
    public m60 E;
    public int F;
    public float G;
    public final /* synthetic */ t H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final k9 c;
    public final ea d;
    public final ea e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final m60[] x;
    public m60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new k9((c6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new m60[3];
        this.F = -1;
        this.G = 1.0f;
        ea eaVar = new ea(9);
        this.d = eaVar;
        ea eaVar2 = new ea(12);
        this.e = eaVar2;
        eaVar.a = AndroidUtilities.dp(76.0f);
        eaVar.b = AndroidUtilities.dp(92.0f);
        eaVar.b();
        eaVar2.a = AndroidUtilities.dp(80.0f);
        eaVar2.b = AndroidUtilities.dp(95.0f);
        eaVar2.b();
        paint.setColor(i0.a.d(0.0f, g6.x0(null, g6.pg, false), g6.x0(null, g6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        m60[] m60VarArr = sVar.x;
        o0 o0Var = sVar.H.n0;
        int i10 = (o0Var.k || !((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : o0Var.e ? 1 : 0;
        if (i10 == sVar.F) {
            return;
        }
        sVar.F = i10;
        if (m60VarArr[i10] == null) {
            m60VarArr[i10] = new m60(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                m60VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{g6.x0(null, g6.ih, false), g6.x0(null, g6.kh, false), g6.x0(null, g6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                m60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.x0(null, g6.Fg, false), g6.x0(null, g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                m60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.x0(null, g6.Jg, false), g6.x0(null, g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        m60 m60Var = m60VarArr[sVar.F];
        m60 m60Var2 = sVar.y;
        if (m60Var != m60Var2) {
            sVar.E = m60Var2;
            sVar.y = m60Var;
            if (m60Var2 == null || !z10) {
                sVar.G = 1.0f;
                sVar.E = null;
            } else {
                sVar.G = 0.0f;
            }
        }
        sVar.invalidate();
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
        m60 m60Var;
        float f7;
        m60 m60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.b);
        imageReceiver.draw(canvas);
        float f12 = oVar.b;
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
        m60 m60Var3 = this.y;
        if (m60Var3 != null) {
            m60Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        ea eaVar = this.e;
        eaVar.e(f19, 1.0f);
        float f20 = this.n;
        ea eaVar2 = this.d;
        eaVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (m60Var2 = this.E) == null) {
                if (i10 == 1 && (m60Var = this.y) != null) {
                    paint.setShader(m60Var.g);
                    f7 = this.G;
                }
            } else {
                paint.setShader(m60Var2.g);
                f7 = 1.0f - this.G;
            }
            paint.setAlpha((int) (f7 * 76.0f));
            eaVar.a(this.v, this.w, canvas, paint);
            eaVar2.a(this.v, this.w, canvas, paint);
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
        this.w = (getMeasuredHeight() >> 1) + (n60.F3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f7 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f7);
        imageReceiver.setImageCoords(this.v - f7, this.w - f7, dp, dp);
    }
}
