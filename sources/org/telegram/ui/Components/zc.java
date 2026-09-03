package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zc extends Drawable {
    public static final jh.a H = new jh.a(1);
    public int B;
    public int C;
    public int D;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final yc q;
    public final yc r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public final float a = AndroidUtilities.dp(18.0f);
    public final float b = AndroidUtilities.dp(22.0f);
    public final float c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float e = AndroidUtilities.dp(1.5f);
    public final float f = 3600.0f;
    public final float g = 0.25f;
    public final Path y = new Path();
    public final float[] z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final fg F = new fg(this, 16);
    public int G = 255;

    public zc() {
        yc ycVar = new yc();
        this.q = ycVar;
        ycVar.a = 1.0f;
        ycVar.b = 0.0f;
        ycVar.c = AndroidUtilities.dp(0.5f);
        ycVar.d = AndroidUtilities.dp(8.5f);
        ycVar.e = 1.0f;
        ycVar.f = 1.0f;
        ycVar.g = 61;
        yc ycVar2 = new yc();
        this.r = ycVar2;
        ycVar2.a = 0.82f;
        ycVar2.b = 0.6f;
        ycVar2.c = AndroidUtilities.dp(0.0f);
        ycVar2.d = AndroidUtilities.dp(4.25f);
        ycVar2.e = 0.55f;
        ycVar2.f = 0.55f;
        ycVar2.g = 128;
        e(0, false);
    }

    public final void a(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, yc ycVar, float f10, float f11, float f12) {
        char c3;
        char c10;
        int i10 = ycVar.x;
        if (i10 == 0) {
            return;
        }
        float f13 = ycVar.c;
        float f14 = ycVar.d - f13;
        float f15 = this.v;
        float f16 = (f14 * f15) + f13;
        float y10 = e2.c.y(f15, 1.0f, 0.0f, this.d * ycVar.e);
        float[] fArr = ycVar.u;
        float[] fArr2 = ycVar.v;
        float[] fArr3 = ycVar.w;
        char c11 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            float interpolation = H.getInterpolation(ycVar.o[i11]);
            float f17 = 1.0f - interpolation;
            fArr[i11] = (ycVar.l[i11] * interpolation) + (ycVar.k[i11] * f17);
            fArr3[i11] = (ycVar.n[i11] * interpolation) + (ycVar.m[i11] * f17);
        }
        float f18 = this.g;
        char c12 = 2;
        if (f18 > 0.0f) {
            int i12 = 0;
            while (i12 < 2) {
                int i13 = 0;
                while (i13 < i10) {
                    int i14 = i13 + 1;
                    float f19 = (fArr[i13 == 0 ? i10 - 1 : i13 - 1] + fArr[i14 == i10 ? 0 : i14]) * 0.5f;
                    float f20 = fArr[i13];
                    fArr2[i13] = e2.c.w(f19, f20, f18, f20);
                    i13 = i14;
                }
                i12++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
            }
        }
        int i15 = 0;
        while (i15 < i10) {
            float f21 = (i15 / i10) + fArr3[i15];
            float floor = (f21 - ((float) Math.floor(f21))) * this.p;
            float f22 = this.m;
            float[] fArr5 = this.z;
            if (floor < f22) {
                fArr5[c11] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c12] = 1.0f;
                fArr5[3] = 0.0f;
                c3 = 0;
                c10 = 2;
            } else {
                float f23 = floor - f22;
                float f24 = this.o;
                c3 = 0;
                float f25 = this.c;
                if (f23 < f24) {
                    c10 = 2;
                    a(this.k, -this.l, (f23 / (f25 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c10 = 2;
                    float f26 = f23 - f24;
                    float f27 = this.n;
                    if (f26 < f27) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.l) + f26;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f28 = f26 - f27;
                        if (f28 < f24) {
                            a(this.k, this.l, f28 / (f25 * this.j), fArr5);
                        } else {
                            float f29 = f28 - f24;
                            if (f29 < f22) {
                                fArr5[0] = this.k - f29;
                                fArr5[1] = this.i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f30 = f29 - f22;
                                if (f30 < f24) {
                                    a(-this.k, this.l, (f30 / (f25 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f31 = f30 - f24;
                                    if (f31 < f27) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.l - f31;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.k, -this.l, ((f31 - f27) / (f25 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f32 = fArr5[3];
            float f33 = -fArr5[c10];
            float f34 = (fArr[i15] * y10) + f16 + f12;
            ycVar.q[i15] = (f32 * f34) + f10 + fArr5[c3];
            ycVar.r[i15] = (f33 * f34) + f11 + fArr5[1];
            ycVar.s[i15] = fArr5[c10];
            ycVar.t[i15] = fArr5[3];
            i15++;
            c11 = 0;
            c12 = 2;
        }
        Path path = this.y;
        path.rewind();
        path.moveTo(ycVar.q[0], ycVar.r[0]);
        int i16 = 0;
        while (i16 < i10) {
            int i17 = i16 + 1;
            int i18 = i17 < i10 ? i17 : 0;
            float[] fArr6 = ycVar.q;
            float f35 = fArr6[i18] - fArr6[i16];
            float[] fArr7 = ycVar.r;
            float f36 = fArr7[i18] - fArr7[i16];
            float sqrt = ((float) Math.sqrt((f36 * f36) + (f35 * f35))) / 3.0f;
            float[] fArr8 = ycVar.q;
            float f37 = fArr8[i16];
            float[] fArr9 = ycVar.s;
            float f38 = (fArr9[i16] * sqrt) + f37;
            float[] fArr10 = ycVar.r;
            float f39 = fArr10[i16];
            float[] fArr11 = ycVar.t;
            float f40 = (fArr11[i16] * sqrt) + f39;
            float f41 = fArr8[i18];
            float f42 = f41 - (fArr9[i18] * sqrt);
            float f43 = fArr10[i18];
            path.cubicTo(f38, f40, f42, f43 - (fArr11[i18] * sqrt), f41, f43);
            i16 = i17;
        }
        path.close();
        canvas.drawPath(path, ycVar.i);
    }

    public final float c() {
        yc ycVar = this.q;
        float f10 = ycVar.d;
        float f11 = ycVar.f;
        float f12 = this.e;
        float f13 = (f11 * f12) + f10;
        float f14 = ycVar.e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        yc ycVar2 = this.r;
        return Math.max(f16, (f15 * ycVar2.e) + (f12 * ycVar2.f) + ycVar2.d);
    }

    public final void d(float f10) {
        this.w = f10;
        if (LiteMode.isEnabled(512)) {
            float f11 = this.w - this.v;
            this.x = f11 / (((f11 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.h < 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = (this.u || this.E < 1.0f) ? Math.min(40L, Math.max(0L, elapsedRealtime - this.t)) : 0L;
        this.t = elapsedRealtime;
        boolean isEnabled = LiteMode.isEnabled(512);
        yc ycVar = this.r;
        yc ycVar2 = this.q;
        if (isEnabled && min > 0) {
            float f10 = this.w;
            float f11 = this.v;
            if (f10 != f11) {
                float f12 = this.x;
                float f13 = (min * f12) + f11;
                this.v = f13;
                if (f12 > 0.0f) {
                    if (f13 > f10) {
                        this.v = f10;
                    }
                } else if (f13 < f10) {
                    this.v = f10;
                }
            }
            this.s = w.c.c(min, this.f, 6.2831855f, this.s);
            ycVar2.d(this.v);
            ycVar.d(this.v);
        }
        float f14 = this.E;
        if (f14 < 1.0f && min > 0) {
            float f15 = (min / 250.0f) + f14;
            this.E = f15;
            if (f15 > 1.0f) {
                this.E = 1.0f;
            }
            int d = i0.a.d(this.E, this.C, this.D);
            this.B = d;
            ycVar2.h = d;
            ycVar.h = d;
            ycVar2.a();
            ycVar.a();
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f16 = 1.0f - (this.v * 0.7f);
        float f17 = ycVar2.f;
        float f18 = this.e;
        float y10 = e2.c.y((float) Math.sin(this.s), 0.5f, 0.5f, f17 * f18 * f16);
        float y11 = e2.c.y((float) Math.sin(this.s + ycVar.b), 0.5f, 0.5f, f18 * ycVar.f * f16);
        b(canvas, this.q, exactCenterX, exactCenterY, y10);
        b(canvas, this.r, exactCenterX, exactCenterY, y11);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void e(int i10, boolean z4) {
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            int w02 = i10 != 0 ? i10 != 1 ? i10 != 3 ? org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.bh, false) : i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ih, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.jh, false)), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.kh, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Zg, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ah, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Xg, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Yg, false));
            if (z4 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = w02;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                this.B = w02;
                yc ycVar = this.q;
                ycVar.h = w02;
                yc ycVar2 = this.r;
                ycVar2.h = w02;
                ycVar.a();
                ycVar2.a();
            }
            invalidateSelf();
        }
    }

    public final void f(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            e(2, z4);
            return;
        }
        ChatObject.Call call = sharedInstance.groupCall;
        if (call == null) {
            e(sharedInstance.isMicMute() ? 1 : 0, z4);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
            e(sharedInstance.isMicMute() ? 1 : 0, z4);
        } else {
            sharedInstance.setMicMute(true, false, false);
            e(3, z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (getBounds().isEmpty()) {
            return;
        }
        float c3 = c() + AndroidUtilities.dp(1.0f);
        float min = (Math.min(r6.width(), r6.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (c3 > min) {
            c3 = Math.max(0.0f, min);
        }
        this.h = (r6.width() / 2.0f) - c3;
        float height = (r6.height() / 2.0f) - c3;
        this.i = height;
        float f10 = this.h;
        if (f10 < 1.0f || height < 1.0f) {
            return;
        }
        float min2 = Math.min(this.a, Math.min(f10, height));
        this.j = min2;
        float f11 = this.h - min2;
        this.k = f11;
        float f12 = this.i - min2;
        this.l = f12;
        float f13 = f11 * 2.0f;
        this.m = f13;
        float f14 = f12 * 2.0f;
        this.n = f14;
        float f15 = this.c * 1.5707964f * min2;
        this.o = f15;
        float f16 = (f14 * 2.0f) + (f13 * 2.0f);
        this.p = (f15 * 4.0f) + f16;
        int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f16) / this.b)));
        yc ycVar = this.q;
        if (max != ycVar.x) {
            ycVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            yc ycVar = this.q;
            ycVar.y = i10;
            ycVar.a();
            yc ycVar2 = this.r;
            ycVar2.y = i10;
            ycVar2.a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q.i.setColorFilter(colorFilter);
        this.r.i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
