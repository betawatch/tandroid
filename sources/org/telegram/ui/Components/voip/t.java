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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.j9;
import org.telegram.ui.f60;
import org.telegram.ui.g60;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class t extends View {
    public f60 E;
    public int F;
    public float G;
    public final /* synthetic */ u H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final j9 c;
    public final da d;
    public final da e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final f60[] x;
    public f60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new j9((e6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new f60[3];
        this.F = -1;
        this.G = 1.0f;
        da daVar = new da(9);
        this.d = daVar;
        da daVar2 = new da(12);
        this.e = daVar2;
        daVar.a = AndroidUtilities.dp(76.0f);
        daVar.b = AndroidUtilities.dp(92.0f);
        daVar.b();
        daVar2.a = AndroidUtilities.dp(80.0f);
        daVar2.b = AndroidUtilities.dp(95.0f);
        daVar2.b();
        paint.setColor(i0.a.d(0.0f, i6.x0(null, i6.pg, false), i6.x0(null, i6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        f60[] f60VarArr = tVar.x;
        p0 p0Var = tVar.H.n0;
        int i10 = (p0Var.k || !((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : p0Var.e ? 1 : 0;
        if (i10 == tVar.F) {
            return;
        }
        tVar.F = i10;
        if (f60VarArr[i10] == null) {
            f60VarArr[i10] = new f60(i10);
            int i11 = tVar.F;
            if (i11 == 2) {
                f60VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{i6.x0(null, i6.ih, false), i6.x0(null, i6.kh, false), i6.x0(null, i6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                f60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.x0(null, i6.Fg, false), i6.x0(null, i6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                f60VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.x0(null, i6.Jg, false), i6.x0(null, i6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        f60 f60Var = f60VarArr[tVar.F];
        f60 f60Var2 = tVar.y;
        if (f60Var != f60Var2) {
            tVar.E = f60Var2;
            tVar.y = f60Var;
            if (f60Var2 == null || !z10) {
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
        f60 f60Var;
        float f7;
        f60 f60Var2;
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
        f60 f60Var3 = this.y;
        if (f60Var3 != null) {
            f60Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        da daVar = this.e;
        daVar.e(f19, 1.0f);
        float f20 = this.n;
        da daVar2 = this.d;
        daVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (f60Var2 = this.E) == null) {
                if (i10 == 1 && (f60Var = this.y) != null) {
                    paint.setShader(f60Var.g);
                    f7 = this.G;
                }
            } else {
                paint.setShader(f60Var2.g);
                f7 = 1.0f - this.G;
            }
            paint.setAlpha((int) (f7 * 76.0f));
            daVar.a(this.v, this.w, canvas, paint);
            daVar2.a(this.v, this.w, canvas, paint);
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
        this.w = (getMeasuredHeight() >> 1) + (g60.F3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f7 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f7);
        imageReceiver.setImageCoords(this.v - f7, this.w - f7, dp, dp);
    }
}
