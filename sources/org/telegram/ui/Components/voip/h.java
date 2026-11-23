package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.v9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h extends View {
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
    public boolean w;
    public long x;

    public h(Context context) {
        super(context);
        this.a = new ImageReceiver(this);
        this.b = new ImageReceiver(this);
        this.c = new a9((i6) null);
        v9 v9Var = new v9(9);
        this.d = v9Var;
        v9 v9Var2 = new v9(12);
        this.e = v9Var2;
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(TLObject.FLAG_31);
        paint.setColor(n6.x0(null, n6.hh, false));
        v9Var.a = 48.0f;
        v9Var.b = 58.999996f;
        v9Var2.a = 51.0f;
        v9Var2.b = 61.0f;
        v9Var.b();
        v9Var2.b();
    }

    public final void a(TLObject tLObject) {
        fc fcVar;
        fc a10;
        a9 a9Var = this.c;
        a9Var.p(tLObject);
        this.a.j0(tLObject, a9Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = fc.l(i10.t0, 1, (TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                fcVar = null;
                this.b.r0(fcVar, "50_50_b", new ColorDrawable(n6.x0(null, n6.kh, false)), null, tLObject, 0);
                invalidate();
            }
            a10 = fc.a(1, (TLRPC.Chat) tLObject);
        }
        fcVar = a10;
        this.b.r0(fcVar, "50_50_b", new ColorDrawable(n6.x0(null, n6.kh, false)), null, tLObject, 0);
        invalidate();
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
        int width = getWidth();
        float f10 = width;
        float height = getHeight();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.z0(0.0f, 0.0f, f10, height);
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
            v9 v9Var = this.e;
            v9Var.e(f15, 1.0f);
            float f16 = this.n;
            v9 v9Var2 = this.d;
            v9Var2.e(f16, 1.0f);
            float f17 = (((this.n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f14, min3);
            canvas.scale(f17, f17);
            int i7 = (int) (this.s * 76.0f);
            Paint paint = this.f;
            paint.setAlpha(i7);
            v9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.s * 110.0f));
            v9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f18 = (this.n * 0.2f * this.s) + 1.0f;
        float f19 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.a;
        imageReceiver2.K0((int) f19);
        imageReceiver2.z0(f14 - f19, min3 - f19, min2, min2);
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
