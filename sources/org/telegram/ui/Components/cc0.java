package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cc0 extends pj0 implements org.telegram.messenger.z5 {
    public static final Paint H;
    public static final Paint I;
    public static final TextPaint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final DecelerateInterpolator P;
    public String D;
    public String E;
    public String F;
    public String G;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public boolean h;
    public View n;
    public org.telegram.messenger.jj r;
    public int s;
    public boolean w;
    public boolean x;
    public Drawable y;

    static {
        Paint paint = new Paint();
        H = paint;
        Paint paint2 = new Paint(1);
        I = paint2;
        TextPaint textPaint = new TextPaint(1);
        J = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        K = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        L = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        M = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        N = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        O = textPaint6;
        P = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint4.setTypeface(org.telegram.messenger.i0.o());
        textPaint5.setTypeface(org.telegram.messenger.i0.o());
        textPaint6.setTypeface(org.telegram.messenger.i0.o());
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        a();
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        b(true, 1.0f);
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        String r10;
        org.telegram.messenger.jj jjVar = this.r;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.k;
            if (message.media != null) {
                if (TextUtils.isEmpty(message.attachPath) || !new File(this.r.k.attachPath).exists()) {
                    org.telegram.messenger.b8.G(org.telegram.messenger.d20.s0);
                    if (!org.telegram.messenger.b8.N(this.r.k, false, true).exists()) {
                        r10 = org.telegram.messenger.b8.r(null, this.r.F0());
                        this.x = false;
                        if (r10 != null) {
                            this.h = false;
                            this.w = false;
                            this.x = true;
                            org.telegram.messenger.b6.q(this.r.I1).v(this);
                        } else {
                            org.telegram.messenger.b6.q(this.r.I1).a(r10, null, this);
                            boolean T = org.telegram.messenger.b8.G(this.r.I1).T(r10);
                            this.w = T;
                            if (T) {
                                this.h = true;
                                Float w9 = org.telegram.messenger.hc.D().w(r10);
                                if (w9 == null) {
                                    w9 = Float.valueOf(0.0f);
                                }
                                b(false, w9.floatValue());
                            } else {
                                this.h = false;
                            }
                        }
                        this.n.invalidate();
                    }
                }
                r10 = null;
                this.x = false;
                if (r10 != null) {
                }
                this.n.invalidate();
            }
        }
        this.w = false;
        this.x = true;
        this.h = false;
        b(false, 0.0f);
        org.telegram.messenger.b6.q(this.r.I1).v(this);
        this.n.invalidate();
    }

    public final void b(boolean z10, float f7) {
        if (z10) {
            this.c = this.e;
        } else {
            this.e = f7;
            this.c = f7;
        }
        this.G = String.format("%d%%", Integer.valueOf((int) (100.0f * f7)));
        if (f7 != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f7;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        this.n.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String upperCase;
        int L2;
        TextPaint textPaint;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, H);
        int y3 = org.telegram.messenger.z20.y(240.0f, height, 2);
        int y10 = org.telegram.messenger.z20.y(48.0f, width, 2);
        Drawable drawable = this.y;
        drawable.setBounds(y10, y3, org.telegram.messenger.i0.L(48.0f) + y10, org.telegram.messenger.i0.L(48.0f) + y3);
        drawable.draw(canvas);
        canvas.drawText(this.D, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.i0.L(31.0f) + y3, J);
        canvas.drawText(this.E, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.i0.L(96.0f) + y3, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.i0.L(125.0f) + y3, L);
        if (this.x) {
            upperCase = org.telegram.messenger.cd.L0(2131747822, null);
            textPaint = O;
            L2 = 0;
        } else {
            upperCase = this.w ? org.telegram.messenger.cd.L0(2131752589, null).toUpperCase() : org.telegram.messenger.cd.L0(2131744284, null);
            L2 = org.telegram.messenger.i0.L(28.0f);
            textPaint = M;
        }
        canvas.drawText(upperCase, (width - ((int) Math.ceil(textPaint.measureText(upperCase)))) / 2, org.telegram.messenger.m5.C(235.0f, y3, L2), textPaint);
        if (this.h) {
            if (this.G != null) {
                canvas.drawText(this.G, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.i0.L(210.0f) + y3, N);
            }
            int y11 = org.telegram.messenger.z20.y(240.0f, width, 2);
            int L3 = org.telegram.messenger.i0.L(232.0f) + y3;
            Paint paint = I;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f * 255.0f));
            float f7 = L3;
            canvas.drawRect(((int) (org.telegram.messenger.i0.L(240.0f) * this.e)) + y11, f7, org.telegram.messenger.i0.L(240.0f) + y11, org.telegram.messenger.i0.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f * 255.0f));
            float f10 = y11;
            canvas.drawRect(f10, f7, (org.telegram.messenger.i0.L(240.0f) * this.e) + f10, org.telegram.messenger.i0.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            float f11 = this.e;
            if (f11 != 1.0f) {
                float f12 = this.b;
                if (f11 != f12) {
                    float f13 = this.c;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.e = f12;
                            this.c = f12;
                            this.d = 0L;
                        } else {
                            this.e = (P.getInterpolation(j11 / 300.0f) * f14) + f13;
                        }
                    }
                    this.n.invalidate();
                }
            }
            float f15 = this.e;
            if (f15 >= 1.0f && f15 == 1.0f) {
                float f16 = this.f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (j10 / 200.0f);
                    this.f = f17;
                    if (f17 <= 0.0f) {
                        this.f = 0.0f;
                    }
                    this.n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        if (!this.h) {
            a();
        }
        b(true, Math.min(1.0f, j10 / j11));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        H.setAlpha(i10);
        J.setAlpha(i10);
        K.setAlpha(i10);
        L.setAlpha(i10);
        M.setAlpha(i10);
        N.setAlpha(i10);
        O.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
