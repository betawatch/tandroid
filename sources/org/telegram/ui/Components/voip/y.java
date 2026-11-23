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
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.v9;
import org.telegram.ui.d40;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y extends View implements c6 {
    public d40 E;
    public d40 F;
    public int G;
    public float H;
    public final /* synthetic */ z I;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final a9 c;
    public final v9 d;
    public final v9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final d40[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Context context) {
        super(context);
        this.I = zVar;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new a9((i6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new d40[3];
        this.G = -1;
        this.H = 1.0f;
        v9 v9Var = new v9(9);
        this.d = v9Var;
        v9 v9Var2 = new v9(12);
        this.e = v9Var2;
        v9Var.a = org.telegram.messenger.g0.L(76.0f);
        v9Var.b = org.telegram.messenger.g0.L(92.0f);
        v9Var.b();
        v9Var2.a = org.telegram.messenger.g0.L(80.0f);
        v9Var2.b = org.telegram.messenger.g0.L(95.0f);
        v9Var2.b();
        paint.setColor(i0.a.f(0.0f, n6.x0(null, n6.gh, false), n6.x0(null, n6.hh, false)));
        paint.setAlpha(ks.n1);
        paint2.setColor(i0.a.o(-16777216, ks.L1));
    }

    public static void a(y yVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        d40[] d40VarArr = yVar.y;
        o0 o0Var = yVar.I.o0;
        int i7 = (o0Var.k || !((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : o0Var.e ? 1 : 0;
        if (i7 == yVar.G) {
            return;
        }
        yVar.G = i7;
        if (d40VarArr[i7] == null) {
            d40VarArr[i7] = new d40(i7);
            int i10 = yVar.G;
            if (i10 == 2) {
                d40VarArr[i10].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{n6.x0(null, n6.Zh, false), n6.x0(null, n6.bi, false), n6.x0(null, n6.ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                d40VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{n6.x0(null, n6.wh, false), n6.x0(null, n6.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                d40VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{n6.x0(null, n6.Ah, false), n6.x0(null, n6.zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        d40 d40Var = d40VarArr[yVar.G];
        d40 d40Var2 = yVar.E;
        if (d40Var != d40Var2) {
            yVar.F = d40Var2;
            yVar.E = d40Var;
            if (d40Var2 == null || !z10) {
                yVar.H = 1.0f;
                yVar.F = null;
            } else {
                yVar.H = 0.0f;
            }
        }
        yVar.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Q();
        this.b.Q();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.S();
        this.b.S();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d40 d40Var;
        float f10;
        d40 d40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        v vVar = this.I.a;
        rectF.set(vVar.getX() + vVar.P, vVar.getY() + vVar.O, (vVar.getX() + vVar.getMeasuredWidth()) - vVar.P, vVar.getY() + vVar.getMeasuredHeight() + vVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.z0(f11, f12, width, height);
        imageReceiver.K0((int) vVar.b);
        imageReceiver.h(canvas, null);
        float f13 = vVar.b;
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
        float f18 = this.H;
        if (f18 != 1.0f) {
            if (this.F != null) {
                this.H = f18 + 0.07272727f;
            }
            if (this.H >= 1.0f) {
                this.H = 1.0f;
                this.F = null;
            }
        }
        float f19 = (this.n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.w, this.x);
        d40 d40Var3 = this.E;
        if (d40Var3 != null) {
            d40Var3.b((int) (this.x - org.telegram.messenger.g0.L(100.0f)), (int) (this.w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        v9 v9Var = this.e;
        v9Var.e(f20, 1.0f);
        float f21 = this.n;
        v9 v9Var2 = this.d;
        v9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f;
            if (i7 != 0 || (d40Var2 = this.F) == null) {
                if (i7 == 1 && (d40Var = this.E) != null) {
                    paint.setShader(d40Var.g);
                    f10 = this.H;
                }
            } else {
                paint.setShader(d40Var2.g);
                f10 = 1.0f - this.H;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            v9Var.a(this.w, this.x, canvas, paint);
            v9Var2.a(this.w, this.x, canvas, paint);
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
        this.x = (getMeasuredHeight() >> 1) + (e40.E5 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = L / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.K0((int) f10);
        imageReceiver.z0(this.w - f10, this.x - f10, L, L);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.f.setColor(i0.a.f(0.0f, n6.x0(null, n6.gh, false), n6.x0(null, n6.hh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
