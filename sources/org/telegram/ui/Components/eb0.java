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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class eb0 extends oi0 implements org.telegram.messenger.x5 {
    public static final Paint I;
    public static final Paint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final TextPaint P;
    public static final DecelerateInterpolator Q;
    public String E;
    public String F;
    public String G;
    public String H;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public boolean h;
    public View n;
    public org.telegram.messenger.zi r;
    public int s;
    public boolean w;
    public boolean x;
    public Drawable y;

    static {
        Paint paint = new Paint();
        I = paint;
        Paint paint2 = new Paint(1);
        J = paint2;
        TextPaint textPaint = new TextPaint(1);
        K = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        L = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        M = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        N = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        O = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        P = textPaint6;
        Q = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint4.setTypeface(org.telegram.messenger.g0.o());
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        textPaint6.setTypeface(org.telegram.messenger.g0.o());
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        a();
    }

    @Override // org.telegram.messenger.x5
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
        String r5;
        org.telegram.messenger.zi ziVar = this.r;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.k;
            if (message.media != null) {
                if (TextUtils.isEmpty(message.attachPath) || !new File(this.r.k.attachPath).exists()) {
                    org.telegram.messenger.w7.G(org.telegram.messenger.h10.t0);
                    if (!org.telegram.messenger.w7.N(this.r.k, false, true).exists()) {
                        r5 = org.telegram.messenger.w7.r(null, this.r.F0());
                        this.x = false;
                        if (r5 != null) {
                            this.h = false;
                            this.w = false;
                            this.x = true;
                            org.telegram.messenger.z5.q(this.r.I1).v(this);
                        } else {
                            org.telegram.messenger.z5.q(this.r.I1).a(r5, null, this);
                            boolean T = org.telegram.messenger.w7.G(this.r.I1).T(r5);
                            this.w = T;
                            if (T) {
                                this.h = true;
                                Float w10 = org.telegram.messenger.zb.D().w(r5);
                                if (w10 == null) {
                                    w10 = Float.valueOf(0.0f);
                                }
                                b(false, w10.floatValue());
                            } else {
                                this.h = false;
                            }
                        }
                        this.n.invalidate();
                    }
                }
                r5 = null;
                this.x = false;
                if (r5 != null) {
                }
                this.n.invalidate();
            }
        }
        this.w = false;
        this.x = true;
        this.h = false;
        b(false, 0.0f);
        org.telegram.messenger.z5.q(this.r.I1).v(this);
        this.n.invalidate();
    }

    public final void b(boolean z10, float f10) {
        if (z10) {
            this.c = this.e;
        } else {
            this.e = f10;
            this.c = f10;
        }
        this.H = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f10;
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
        canvas.drawRect(0.0f, 0.0f, width, height, I);
        int y9 = org.telegram.messenger.camera.q.y(240.0f, height, 2);
        int y10 = org.telegram.messenger.camera.q.y(48.0f, width, 2);
        Drawable drawable = this.y;
        drawable.setBounds(y10, y9, org.telegram.messenger.g0.L(48.0f) + y10, org.telegram.messenger.g0.L(48.0f) + y9);
        drawable.draw(canvas);
        canvas.drawText(this.E, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.g0.L(31.0f) + y9, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.g0.L(96.0f) + y9, L);
        canvas.drawText(this.G, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.g0.L(125.0f) + y9, M);
        if (this.x) {
            upperCase = org.telegram.messenger.bd.M0(2131747814, null);
            textPaint = P;
            L2 = 0;
        } else {
            upperCase = this.w ? org.telegram.messenger.bd.M0(2131752589, null).toUpperCase() : org.telegram.messenger.bd.M0(2131744268, null);
            L2 = org.telegram.messenger.g0.L(28.0f);
            textPaint = N;
        }
        canvas.drawText(upperCase, (width - ((int) Math.ceil(textPaint.measureText(upperCase)))) / 2, org.telegram.messenger.k5.C(235.0f, y9, L2), textPaint);
        if (this.h) {
            if (this.H != null) {
                canvas.drawText(this.H, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, org.telegram.messenger.g0.L(210.0f) + y9, O);
            }
            int y11 = org.telegram.messenger.camera.q.y(240.0f, width, 2);
            int L3 = org.telegram.messenger.g0.L(232.0f) + y9;
            Paint paint = J;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f * 255.0f));
            float f10 = L3;
            canvas.drawRect(((int) (org.telegram.messenger.g0.L(240.0f) * this.e)) + y11, f10, org.telegram.messenger.g0.L(240.0f) + y11, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f * 255.0f));
            float f11 = y11;
            canvas.drawRect(f11, f10, (org.telegram.messenger.g0.L(240.0f) * this.e) + f11, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            float f12 = this.e;
            if (f12 != 1.0f) {
                float f13 = this.b;
                if (f12 != f13) {
                    float f14 = this.c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.e = f13;
                            this.c = f13;
                            this.d = 0L;
                        } else {
                            this.e = (Q.getInterpolation(j11 / 300.0f) * f15) + f14;
                        }
                    }
                    this.n.invalidate();
                }
            }
            float f16 = this.e;
            if (f16 >= 1.0f && f16 == 1.0f) {
                float f17 = this.f;
                if (f17 != 0.0f) {
                    float f18 = f17 - (j10 / 200.0f);
                    this.f = f18;
                    if (f18 <= 0.0f) {
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

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        if (!this.h) {
            a();
        }
        b(true, Math.min(1.0f, j10 / j11));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setAlpha(i3);
        }
        I.setAlpha(i3);
        K.setAlpha(i3);
        L.setAlpha(i3);
        M.setAlpha(i3);
        N.setAlpha(i3);
        O.setAlpha(i3);
        P.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
