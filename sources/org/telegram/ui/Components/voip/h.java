package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h extends View {
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
    public boolean w;
    public long x;

    public h(Context context) {
        super(context);
        this.a = new ImageReceiver(this);
        this.b = new ImageReceiver(this);
        this.c = new b9((h6) null);
        w9 w9Var = new w9(9);
        this.d = w9Var;
        w9 w9Var2 = new w9(12);
        this.e = w9Var2;
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(TLObject.FLAG_31);
        paint.setColor(m6.x0(null, m6.hh, false));
        w9Var.a = 48.0f;
        w9Var.b = 58.999996f;
        w9Var2.a = 51.0f;
        w9Var2.b = 61.0f;
        w9Var.b();
        w9Var2.b();
    }

    public final void a(TLObject tLObject) {
        gc gcVar;
        gc a10;
        b9 b9Var = this.c;
        b9Var.p(tLObject);
        this.a.i0(tLObject, b9Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = gc.l(k10.t0, 1, (TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                gcVar = null;
                this.b.q0(gcVar, "50_50_b", new ColorDrawable(m6.x0(null, m6.kh, false)), null, tLObject, 0);
                invalidate();
            }
            a10 = gc.a(1, (TLRPC.Chat) tLObject);
        }
        gcVar = a10;
        this.b.q0(gcVar, "50_50_b", new ColorDrawable(m6.x0(null, m6.kh, false)), null, tLObject, 0);
        invalidate();
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
        int width = getWidth();
        float f10 = width;
        float height = getHeight();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(0.0f, 0.0f, f10, height);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f10, height, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.x;
        long min = j3 == 0 ? 16L : Math.min(48L, uptimeMillis - j3);
        this.x = uptimeMillis;
        float f11 = this.n;
        float f12 = min;
        this.n = (Math.min(1.0f, f12 / 120.0f) * (this.r - f11)) + f11;
        float f13 = this.s;
        this.s = (Math.min(1.0f, f12 / 200.0f) * ((this.w ? 1.0f : 0.0f) - f13)) + f13;
        float min2 = Math.min(width, r7) * 0.42f;
        float f14 = f10 / 2.0f;
        float min3 = (height / 2.0f) - (Math.min(width, r7) * 0.04f);
        if (this.s > 0.01f) {
            float f15 = this.n;
            w9 w9Var = this.e;
            w9Var.e(f15, 1.0f);
            float f16 = this.n;
            w9 w9Var2 = this.d;
            w9Var2.e(f16, 1.0f);
            float f17 = (((this.n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f14, min3);
            canvas.scale(f17, f17);
            int i7 = (int) (this.s * 76.0f);
            Paint paint = this.f;
            paint.setAlpha(i7);
            w9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.s * 110.0f));
            w9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f18 = (this.n * 0.2f * this.s) + 1.0f;
        float f19 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.a;
        imageReceiver2.J0((int) f19);
        imageReceiver2.y0(f14 - f19, min3 - f19, min2, min2);
        canvas.save();
        canvas.scale(f18, f18, f14, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.s > 0.01f || Math.abs(this.r - this.n) > 0.005f) {
            invalidate();
        } else {
            this.x = 0L;
        }
    }
}
