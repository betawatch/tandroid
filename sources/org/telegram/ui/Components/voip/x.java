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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.b40;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x extends View implements a6 {
    public b40 D;
    public b40 E;
    public int F;
    public float G;
    public final /* synthetic */ y H;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final w8 c;
    public final r9 d;
    public final r9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final b40[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context) {
        super(context);
        this.H = yVar;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new w8((f6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new b40[3];
        this.F = -1;
        this.G = 1.0f;
        r9 r9Var = new r9(9);
        this.d = r9Var;
        r9 r9Var2 = new r9(12);
        this.e = r9Var2;
        r9Var.a = org.telegram.messenger.g0.L(76.0f);
        r9Var.b = org.telegram.messenger.g0.L(92.0f);
        r9Var.b();
        r9Var2.a = org.telegram.messenger.g0.L(80.0f);
        r9Var2.b = org.telegram.messenger.g0.L(95.0f);
        r9Var2.b();
        paint.setColor(i0.a.f(0.0f, k6.x0(null, k6.dh, false), k6.x0(null, k6.eh, false)));
        paint.setAlpha(qs.n1);
        paint2.setColor(i0.a.o(-16777216, qs.L1));
    }

    public static void a(x xVar, boolean z9) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        b40[] b40VarArr = xVar.y;
        n0 n0Var = xVar.H.n0;
        int i7 = (n0Var.k || !((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : n0Var.e ? 1 : 0;
        if (i7 == xVar.F) {
            return;
        }
        xVar.F = i7;
        if (b40VarArr[i7] == null) {
            b40VarArr[i7] = new b40(i7);
            int i10 = xVar.F;
            if (i10 == 2) {
                b40VarArr[i10].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.x0(null, k6.Wh, false), k6.x0(null, k6.Yh, false), k6.x0(null, k6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                b40VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.th, false), k6.x0(null, k6.vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                b40VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.xh, false), k6.x0(null, k6.wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        b40 b40Var = b40VarArr[xVar.F];
        b40 b40Var2 = xVar.D;
        if (b40Var != b40Var2) {
            xVar.E = b40Var2;
            xVar.D = b40Var;
            if (b40Var2 == null || !z9) {
                xVar.G = 1.0f;
                xVar.E = null;
            } else {
                xVar.G = 0.0f;
            }
        }
        xVar.invalidate();
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
        b40 b40Var;
        float f10;
        b40 b40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.H.a;
        rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, uVar.getY() + uVar.getMeasuredHeight() + uVar.N);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) uVar.b);
        imageReceiver.h(canvas, null);
        float f13 = uVar.b;
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
        float f18 = this.G;
        if (f18 != 1.0f) {
            if (this.E != null) {
                this.G = f18 + 0.07272727f;
            }
            if (this.G >= 1.0f) {
                this.G = 1.0f;
                this.E = null;
            }
        }
        float f19 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.w, this.x);
        b40 b40Var3 = this.D;
        if (b40Var3 != null) {
            b40Var3.b((int) (this.x - org.telegram.messenger.g0.L(100.0f)), (int) (this.w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        r9 r9Var = this.e;
        r9Var.e(f20, 1.0f);
        float f21 = this.n;
        r9 r9Var2 = this.d;
        r9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f;
            if (i7 != 0 || (b40Var2 = this.E) == null) {
                if (i7 == 1 && (b40Var = this.D) != null) {
                    paint.setShader(b40Var.g);
                    f10 = this.G;
                }
            } else {
                paint.setShader(b40Var2.g);
                f10 = 1.0f - this.G;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            r9Var.a(this.w, this.x, canvas, paint);
            r9Var2.a(this.w, this.x, canvas, paint);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.w = getMeasuredWidth() >> 1;
        this.x = (getMeasuredHeight() >> 1) + (c40.w5 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = L / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.J0((int) f10);
        imageReceiver.y0(this.w - f10, this.x - f10, L, L);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.f.setColor(i0.a.f(0.0f, k6.x0(null, k6.dh, false), k6.x0(null, k6.eh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
