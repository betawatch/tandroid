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
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.e40;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x extends View implements b6 {
    public e40 E;
    public e40 F;
    public int G;
    public float H;
    public final /* synthetic */ y I;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final b9 c;
    public final w9 d;
    public final w9 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final e40[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context) {
        super(context);
        this.I = yVar;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new b9((h6) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new e40[3];
        this.G = -1;
        this.H = 1.0f;
        w9 w9Var = new w9(9);
        this.d = w9Var;
        w9 w9Var2 = new w9(12);
        this.e = w9Var2;
        w9Var.a = org.telegram.messenger.g0.L(76.0f);
        w9Var.b = org.telegram.messenger.g0.L(92.0f);
        w9Var.b();
        w9Var2.a = org.telegram.messenger.g0.L(80.0f);
        w9Var2.b = org.telegram.messenger.g0.L(95.0f);
        w9Var2.b();
        paint.setColor(i0.a.f(0.0f, m6.x0(null, m6.gh, false), m6.x0(null, m6.hh, false)));
        paint.setAlpha(ls.n1);
        paint2.setColor(i0.a.o(-16777216, ls.L1));
    }

    public static void a(x xVar, boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        e40[] e40VarArr = xVar.y;
        n0 n0Var = xVar.I.o0;
        int i7 = (n0Var.k || !((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) ? 2 : n0Var.e ? 1 : 0;
        if (i7 == xVar.G) {
            return;
        }
        xVar.G = i7;
        if (e40VarArr[i7] == null) {
            e40VarArr[i7] = new e40(i7);
            int i10 = xVar.G;
            if (i10 == 2) {
                e40VarArr[i10].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{m6.x0(null, m6.Zh, false), m6.x0(null, m6.bi, false), m6.x0(null, m6.ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                e40VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.wh, false), m6.x0(null, m6.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                e40VarArr[i10].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.Ah, false), m6.x0(null, m6.zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        e40 e40Var = e40VarArr[xVar.G];
        e40 e40Var2 = xVar.E;
        if (e40Var != e40Var2) {
            xVar.F = e40Var2;
            xVar.E = e40Var;
            if (e40Var2 == null || !z10) {
                xVar.H = 1.0f;
                xVar.F = null;
            } else {
                xVar.H = 0.0f;
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
        e40 e40Var;
        float f10;
        e40 e40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.I.a;
        rectF.set(uVar.getX() + uVar.P, uVar.getY() + uVar.O, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.P, uVar.getY() + uVar.getMeasuredHeight() + uVar.O);
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
        e40 e40Var3 = this.E;
        if (e40Var3 != null) {
            e40Var3.b((int) (this.x - org.telegram.messenger.g0.L(100.0f)), (int) (this.w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.n);
        }
        float f20 = this.n;
        w9 w9Var = this.e;
        w9Var.e(f20, 1.0f);
        float f21 = this.n;
        w9 w9Var2 = this.d;
        w9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f;
            if (i7 != 0 || (e40Var2 = this.F) == null) {
                if (i7 == 1 && (e40Var = this.E) != null) {
                    paint.setShader(e40Var.g);
                    f10 = this.H;
                }
            } else {
                paint.setShader(e40Var2.g);
                f10 = 1.0f - this.H;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            w9Var.a(this.w, this.x, canvas, paint);
            w9Var2.a(this.w, this.x, canvas, paint);
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
        this.x = (getMeasuredHeight() >> 1) + (f40.E5 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = L / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.J0((int) f10);
        imageReceiver.y0(this.w - f10, this.x - f10, L, L);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.f.setColor(i0.a.f(0.0f, m6.x0(null, m6.gh, false), m6.x0(null, m6.hh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
