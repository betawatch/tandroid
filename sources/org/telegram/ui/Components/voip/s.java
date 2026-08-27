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
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.r50;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s extends View {
    public r50 A;
    public int B;
    public float C;
    public final /* synthetic */ t D;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final y8 c;
    public final s9 d;
    public final s9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final r50[] x;
    public r50 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context) {
        super(context);
        this.D = tVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new y8((c6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new r50[3];
        this.B = -1;
        this.C = 1.0f;
        s9 s9Var = new s9(9);
        this.d = s9Var;
        s9 s9Var2 = new s9(12);
        this.e = s9Var2;
        s9Var.a = AndroidUtilities.dp(76.0f);
        s9Var.b = AndroidUtilities.dp(92.0f);
        s9Var.b();
        s9Var2.a = AndroidUtilities.dp(80.0f);
        s9Var2.b = AndroidUtilities.dp(95.0f);
        s9Var2.b();
        paint.setColor(i0.b.d(0.0f, g6.w0(null, g6.pg, false), g6.w0(null, g6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.b.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        r50[] r50VarArr = sVar.x;
        n0 n0Var = sVar.D.j0;
        int i10 = (n0Var.k || !((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : n0Var.e ? 1 : 0;
        if (i10 == sVar.B) {
            return;
        }
        sVar.B = i10;
        if (r50VarArr[i10] == null) {
            r50VarArr[i10] = new r50(i10);
            int i11 = sVar.B;
            if (i11 == 2) {
                r50VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{g6.w0(null, g6.ih, false), g6.w0(null, g6.kh, false), g6.w0(null, g6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                r50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Fg, false), g6.w0(null, g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                r50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Jg, false), g6.w0(null, g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        r50 r50Var = r50VarArr[sVar.B];
        r50 r50Var2 = sVar.y;
        if (r50Var != r50Var2) {
            sVar.A = r50Var2;
            sVar.y = r50Var;
            if (r50Var2 == null || !z10) {
                sVar.C = 1.0f;
                sVar.A = null;
            } else {
                sVar.C = 0.0f;
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
        r50 r50Var;
        float f10;
        r50 r50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.D.a;
        rectF.set(oVar.getX() + oVar.K, oVar.getY() + oVar.J, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.K, oVar.getY() + oVar.getMeasuredHeight() + oVar.J);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(f11, f12, width, height);
        imageReceiver.setRoundRadius((int) oVar.b);
        imageReceiver.draw(canvas);
        float f13 = oVar.b;
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
        float f18 = this.C;
        if (f18 != 1.0f) {
            if (this.A != null) {
                this.C = f18 + 0.07272727f;
            }
            if (this.C >= 1.0f) {
                this.C = 1.0f;
                this.A = null;
            }
        }
        float f19 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.v, this.w);
        r50 r50Var3 = this.y;
        if (r50Var3 != null) {
            r50Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        s9 s9Var = this.e;
        s9Var.e(f20, 1.0f);
        float f21 = this.n;
        s9 s9Var2 = this.d;
        s9Var2.e(f21, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (r50Var2 = this.A) == null) {
                if (i10 == 1 && (r50Var = this.y) != null) {
                    paint.setShader(r50Var.g);
                    f10 = this.C;
                }
            } else {
                paint.setShader(r50Var2.g);
                f10 = 1.0f - this.C;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            s9Var.a(this.v, this.w, canvas, paint);
            s9Var2.a(this.v, this.w, canvas, paint);
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
        this.w = (getMeasuredHeight() >> 1) + (s50.B3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.w - f10, dp, dp);
    }
}
