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
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.q50;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t extends View {
    public q50 A;
    public int B;
    public float C;
    public final /* synthetic */ u D;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final e9 c;
    public final y9 d;
    public final y9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final q50[] x;
    public q50 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.D = uVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new e9((c6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new q50[3];
        this.B = -1;
        this.C = 1.0f;
        y9 y9Var = new y9(9);
        this.d = y9Var;
        y9 y9Var2 = new y9(12);
        this.e = y9Var2;
        y9Var.a = AndroidUtilities.dp(76.0f);
        y9Var.b = AndroidUtilities.dp(92.0f);
        y9Var.b();
        y9Var2.a = AndroidUtilities.dp(80.0f);
        y9Var2.b = AndroidUtilities.dp(95.0f);
        y9Var2.b();
        paint.setColor(i0.a.d(0.0f, g6.w0(null, g6.pg, false), g6.w0(null, g6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        q50[] q50VarArr = tVar.x;
        o0 o0Var = tVar.D.j0;
        int i10 = (o0Var.k || !((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : o0Var.e ? 1 : 0;
        if (i10 == tVar.B) {
            return;
        }
        tVar.B = i10;
        if (q50VarArr[i10] == null) {
            q50VarArr[i10] = new q50(i10);
            int i11 = tVar.B;
            if (i11 == 2) {
                q50VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{g6.w0(null, g6.ih, false), g6.w0(null, g6.kh, false), g6.w0(null, g6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                q50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Fg, false), g6.w0(null, g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                q50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Jg, false), g6.w0(null, g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        q50 q50Var = q50VarArr[tVar.B];
        q50 q50Var2 = tVar.y;
        if (q50Var != q50Var2) {
            tVar.A = q50Var2;
            tVar.y = q50Var;
            if (q50Var2 == null || !z10) {
                tVar.C = 1.0f;
                tVar.A = null;
            } else {
                tVar.C = 0.0f;
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
        q50 q50Var;
        float f9;
        q50 q50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.D.a;
        rectF.set(pVar.getX() + pVar.K, pVar.getY() + pVar.J, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.K, pVar.getY() + pVar.getMeasuredHeight() + pVar.J);
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
        float f17 = this.C;
        if (f17 != 1.0f) {
            if (this.A != null) {
                this.C = f17 + 0.07272727f;
            }
            if (this.C >= 1.0f) {
                this.C = 1.0f;
                this.A = null;
            }
        }
        float f18 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.w);
        q50 q50Var3 = this.y;
        if (q50Var3 != null) {
            q50Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        y9 y9Var = this.e;
        y9Var.e(f19, 1.0f);
        float f20 = this.n;
        y9 y9Var2 = this.d;
        y9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (q50Var2 = this.A) == null) {
                if (i10 == 1 && (q50Var = this.y) != null) {
                    paint.setShader(q50Var.g);
                    f9 = this.C;
                }
            } else {
                paint.setShader(q50Var2.g);
                f9 = 1.0f - this.C;
            }
            paint.setAlpha((int) (f9 * 76.0f));
            y9Var.a(this.v, this.w, canvas, paint);
            y9Var2.a(this.v, this.w, canvas, paint);
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
        this.w = (getMeasuredHeight() >> 1) + (r50.B3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f9 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f9);
        imageReceiver.setImageCoords(this.v - f9, this.w - f9, dp, dp);
    }
}
