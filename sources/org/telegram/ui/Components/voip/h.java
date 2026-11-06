package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.w8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class h extends View {
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
    public boolean w;
    public long x;

    public h(Context context) {
        super(context);
        this.a = new ImageReceiver(this);
        this.b = new ImageReceiver(this);
        this.c = new w8((f6) null);
        r9 r9Var = new r9(9);
        this.d = r9Var;
        r9 r9Var2 = new r9(12);
        this.e = r9Var2;
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(TLObject.FLAG_31);
        paint.setColor(k6.x0(null, k6.eh, false));
        r9Var.a = 48.0f;
        r9Var.b = 58.999996f;
        r9Var2.a = 51.0f;
        r9Var2.b = 61.0f;
        r9Var.b();
        r9Var2.b();
    }

    public final void a(TLObject tLObject) {
        hc hcVar;
        hc a10;
        w8 w8Var = this.c;
        w8Var.p(tLObject);
        this.a.i0(tLObject, w8Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = hc.l(p10.s0, 1, (TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                hcVar = null;
                this.b.q0(hcVar, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, tLObject, 0);
                invalidate();
            }
            a10 = hc.a(1, (TLRPC.Chat) tLObject);
        }
        hcVar = a10;
        this.b.q0(hcVar, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, tLObject, 0);
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
            r9 r9Var = this.e;
            r9Var.e(f15, 1.0f);
            float f16 = this.n;
            r9 r9Var2 = this.d;
            r9Var2.e(f16, 1.0f);
            float f17 = (((this.n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f14, min3);
            canvas.scale(f17, f17);
            int i7 = (int) (this.s * 76.0f);
            Paint paint = this.f;
            paint.setAlpha(i7);
            r9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.s * 110.0f));
            r9Var2.a(0.0f, 0.0f, canvas, paint);
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
