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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.c60;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class t extends View {
    public c60 B;
    public int C;
    public float D;
    public final /* synthetic */ u E;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final z8 c;
    public final u9 d;
    public final u9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final c60[] x;
    public c60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.E = uVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new z8((g6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new c60[3];
        this.C = -1;
        this.D = 1.0f;
        u9 u9Var = new u9(9);
        this.d = u9Var;
        u9 u9Var2 = new u9(12);
        this.e = u9Var2;
        u9Var.a = AndroidUtilities.dp(76.0f);
        u9Var.b = AndroidUtilities.dp(92.0f);
        u9Var.b();
        u9Var2.a = AndroidUtilities.dp(80.0f);
        u9Var2.b = AndroidUtilities.dp(95.0f);
        u9Var2.b();
        paint.setColor(i0.a.d(0.0f, k6.w0(null, k6.pg, false), k6.w0(null, k6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z4) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        c60[] c60VarArr = tVar.x;
        o0 o0Var = tVar.E.k0;
        int i10 = (o0Var.k || !((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : o0Var.e ? 1 : 0;
        if (i10 == tVar.C) {
            return;
        }
        tVar.C = i10;
        if (c60VarArr[i10] == null) {
            c60VarArr[i10] = new c60(i10);
            int i11 = tVar.C;
            if (i11 == 2) {
                c60VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.w0(null, k6.ih, false), k6.w0(null, k6.kh, false), k6.w0(null, k6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                c60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.w0(null, k6.Fg, false), k6.w0(null, k6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                c60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.w0(null, k6.Jg, false), k6.w0(null, k6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        c60 c60Var = c60VarArr[tVar.C];
        c60 c60Var2 = tVar.y;
        if (c60Var != c60Var2) {
            tVar.B = c60Var2;
            tVar.y = c60Var;
            if (c60Var2 == null || !z4) {
                tVar.D = 1.0f;
                tVar.B = null;
            } else {
                tVar.D = 0.0f;
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
        c60 c60Var;
        float f10;
        c60 c60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.E.a;
        rectF.set(pVar.getX() + pVar.L, pVar.getY() + pVar.K, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.L, pVar.getY() + pVar.getMeasuredHeight() + pVar.K);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(f11, f12, width, height);
        imageReceiver.setRoundRadius((int) pVar.b);
        imageReceiver.draw(canvas);
        float f13 = pVar.b;
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
        float f18 = this.D;
        if (f18 != 1.0f) {
            if (this.B != null) {
                this.D = f18 + 0.07272727f;
            }
            if (this.D >= 1.0f) {
                this.D = 1.0f;
                this.B = null;
            }
        }
        float f19 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.v, this.w);
        c60 c60Var3 = this.y;
        if (c60Var3 != null) {
            c60Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        u9 u9Var = this.e;
        u9Var.e(f20, 1.0f);
        float f21 = this.n;
        u9 u9Var2 = this.d;
        u9Var2.e(f21, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (c60Var2 = this.B) == null) {
                if (i10 == 1 && (c60Var = this.y) != null) {
                    paint.setShader(c60Var.g);
                    f10 = this.D;
                }
            } else {
                paint.setShader(c60Var2.g);
                f10 = 1.0f - this.D;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            u9Var.a(this.v, this.w, canvas, paint);
            u9Var2.a(this.v, this.w, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.v, this.w);
        this.a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        this.w = (getMeasuredHeight() >> 1) + (d60.C3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.w - f10, dp, dp);
    }
}
