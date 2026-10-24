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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.h9;
import org.telegram.ui.t50;
import org.telegram.ui.u50;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class s extends View implements b6 {
    public t50 E;
    public int F;
    public float G;
    public final /* synthetic */ t H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final h9 c;
    public final ba d;
    public final ba e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public final t50[] x;
    public t50 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.a = new ImageReceiver();
        this.b = new ImageReceiver();
        this.c = new h9((g6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.x = new t50[3];
        this.F = -1;
        this.G = 1.0f;
        ba baVar = new ba(9);
        this.d = baVar;
        ba baVar2 = new ba(12);
        this.e = baVar2;
        baVar.a = AndroidUtilities.dp(76.0f);
        baVar.b = AndroidUtilities.dp(92.0f);
        baVar.b();
        baVar2.a = AndroidUtilities.dp(80.0f);
        baVar2.b = AndroidUtilities.dp(95.0f);
        baVar2.b();
        paint.setColor(i0.a.f(0.0f, k6.x0(null, k6.pg, false), k6.x0(null, k6.qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        t50[] t50VarArr = sVar.x;
        o0 o0Var = sVar.H.n0;
        int i10 = (o0Var.k || !((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : o0Var.e ? 1 : 0;
        if (i10 == sVar.F) {
            return;
        }
        sVar.F = i10;
        if (t50VarArr[i10] == null) {
            t50VarArr[i10] = new t50(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                t50VarArr[i11].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.x0(null, k6.ih, false), k6.x0(null, k6.kh, false), k6.x0(null, k6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                t50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.Fg, false), k6.x0(null, k6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                t50VarArr[i11].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.Jg, false), k6.x0(null, k6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        t50 t50Var = t50VarArr[sVar.F];
        t50 t50Var2 = sVar.y;
        if (t50Var != t50Var2) {
            sVar.E = t50Var2;
            sVar.y = t50Var;
            if (t50Var2 == null || !z10) {
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
        t50 t50Var;
        float f7;
        t50 t50Var2;
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
        t50 t50Var3 = this.y;
        if (t50Var3 != null) {
            t50Var3.b((int) (this.w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.n);
        }
        float f19 = this.n;
        ba baVar = this.e;
        baVar.e(f19, 1.0f);
        float f20 = this.n;
        ba baVar2 = this.d;
        baVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f;
            if (i10 != 0 || (t50Var2 = this.E) == null) {
                if (i10 == 1 && (t50Var = this.y) != null) {
                    paint.setShader(t50Var.g);
                    f7 = this.G;
                }
            } else {
                paint.setShader(t50Var2.g);
                f7 = 1.0f - this.G;
            }
            paint.setAlpha((int) (f7 * 76.0f));
            baVar.a(this.v, this.w, canvas, paint);
            baVar2.a(this.v, this.w, canvas, paint);
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
        this.w = (getMeasuredHeight() >> 1) + (u50.F3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f7 = dp / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setRoundRadius((int) f7);
        imageReceiver.setImageCoords(this.v - f7, this.w - f7, dp, dp);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.f.setColor(i0.a.f(0.0f, k6.x0(null, k6.pg, false), k6.x0(null, k6.qg, false)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
