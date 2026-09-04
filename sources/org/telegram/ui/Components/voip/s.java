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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.i9;
import org.telegram.ui.i60;
import org.telegram.ui.j60;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s extends View {
    public i60 E;
    public int F;
    public float G;
    public final /* synthetic */ t H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final i9 c;
    public final ca d;
    public final ca e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final i60[] x;
    public i60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new i9((f6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new i60[3];
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
        paint.setColor(i0.a.d(0.0f, j6.w0(null, j6.pg, false), j6.w0(null, j6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        i60[] i60VarArr = sVar.x;
        o0 o0Var = sVar.H.n0;
        int i10 = (o0Var.k || !((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : o0Var.e ? 1 : 0;
        if (i10 == sVar.F) {
            return;
        }
        sVar.F = i10;
        if (i60VarArr[i10] == null) {
            i60VarArr[i10] = new i60(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                i60VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{j6.w0(null, j6.ih, false), j6.w0(null, j6.kh, false), j6.w0(null, j6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                i60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Fg, false), j6.w0(null, j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                i60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Jg, false), j6.w0(null, j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        i60 i60Var = i60VarArr[sVar.F];
        i60 i60Var2 = sVar.y;
        if (i60Var != i60Var2) {
            sVar.E = i60Var2;
            sVar.y = i60Var;
            if (i60Var2 == null || !z10) {
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
        i60 i60Var;
        float f7;
        i60 i60Var2;
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
        i60 i60Var3 = this.y;
        if (i60Var3 != null) {
            i60Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        ca caVar = this.e;
        caVar.e(f19, 1.0f);
        float f20 = this.n;
        ca caVar2 = this.d;
        caVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (i60Var2 = this.E) == null) {
                if (i10 == 1 && (i60Var = this.y) != null) {
                    paint.setShader(i60Var.g);
                    f7 = this.G;
                }
            } else {
                paint.setShader(i60Var2.g);
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
        this.w = (getMeasuredHeight() >> 1) + (j60.F3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f7 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f7);
        imageReceiver.setImageCoords(this.v - f7, this.w - f7, dp, dp);
    }
}
