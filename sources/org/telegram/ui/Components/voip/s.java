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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.n50;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s extends View {
    public n50 A;
    public int B;
    public float C;
    public final /* synthetic */ t D;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final z8 c;
    public final t9 d;
    public final t9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final n50[] x;
    public n50 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context) {
        super(context);
        this.D = tVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new z8((b6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new n50[3];
        this.B = -1;
        this.C = 1.0f;
        t9 t9Var = new t9(9);
        this.d = t9Var;
        t9 t9Var2 = new t9(12);
        this.e = t9Var2;
        t9Var.a = AndroidUtilities.dp(76.0f);
        t9Var.b = AndroidUtilities.dp(92.0f);
        t9Var.b();
        t9Var2.a = AndroidUtilities.dp(80.0f);
        t9Var2.b = AndroidUtilities.dp(95.0f);
        t9Var2.b();
        paint.setColor(i0.a.d(0.0f, f6.w0(null, f6.pg, false), f6.w0(null, f6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        n50[] n50VarArr = sVar.x;
        n0 n0Var = sVar.D.j0;
        int i9 = (n0Var.k || !((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : n0Var.e ? 1 : 0;
        if (i9 == sVar.B) {
            return;
        }
        sVar.B = i9;
        if (n50VarArr[i9] == null) {
            n50VarArr[i9] = new n50(i9);
            int i10 = sVar.B;
            if (i10 == 2) {
                n50VarArr[i10].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{f6.w0(null, f6.ih, false), f6.w0(null, f6.kh, false), f6.w0(null, f6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                n50VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{f6.w0(null, f6.Fg, false), f6.w0(null, f6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                n50VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{f6.w0(null, f6.Jg, false), f6.w0(null, f6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        n50 n50Var = n50VarArr[sVar.B];
        n50 n50Var2 = sVar.y;
        if (n50Var != n50Var2) {
            sVar.A = n50Var2;
            sVar.y = n50Var;
            if (n50Var2 == null || !z10) {
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
        n50 n50Var;
        float f10;
        n50 n50Var2;
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
        n50 n50Var3 = this.y;
        if (n50Var3 != null) {
            n50Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        t9 t9Var = this.e;
        t9Var.e(f20, 1.0f);
        float f21 = this.n;
        t9 t9Var2 = this.d;
        t9Var2.e(f21, 1.0f);
        for (int i9 = 0; i9 < 2; i9++) {
            Paint paint = this.f;
            if (i9 != 0 || (n50Var2 = this.A) == null) {
                if (i9 == 1 && (n50Var = this.y) != null) {
                    paint.setShader(n50Var.g);
                    f10 = this.C;
                }
            } else {
                paint.setShader(n50Var2.g);
                f10 = 1.0f - this.C;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            t9Var.a(this.v, this.w, canvas, paint);
            t9Var2.a(this.v, this.w, canvas, paint);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        this.w = (getMeasuredHeight() >> 1) + (o50.B3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.w - f10, dp, dp);
    }
}
