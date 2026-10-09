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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ld extends Drawable {
    public static final jd H = new jd(0);
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
    public final kd q;
    public final kd r;
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
    public final rg F = new rg(this, 16);
    public int G = 255;

    public ld() {
        kd kdVar = new kd();
        this.q = kdVar;
        kdVar.a = 1.0f;
        kdVar.b = 0.0f;
        kdVar.c = AndroidUtilities.dp(0.5f);
        kdVar.d = AndroidUtilities.dp(8.5f);
        kdVar.e = 1.0f;
        kdVar.f = 1.0f;
        kdVar.g = 61;
        kd kdVar2 = new kd();
        this.r = kdVar2;
        kdVar2.a = 0.82f;
        kdVar2.b = 0.6f;
        kdVar2.c = AndroidUtilities.dp(0.0f);
        kdVar2.d = AndroidUtilities.dp(4.25f);
        kdVar2.e = 0.55f;
        kdVar2.f = 0.55f;
        kdVar2.g = 128;
        e(0, false);
    }

    public final void a(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, kd kdVar, float f7, float f10, float f11) {
        int i10;
        char c10;
        int i11 = kdVar.x;
        if (i11 == 0) {
            return;
        }
        float f12 = kdVar.c;
        float f13 = kdVar.d - f12;
        float f14 = this.v;
        float f15 = (f13 * f14) + f12;
        float f16 = 1.0f;
        float f17 = 0.0f;
        float A = com.google.android.gms.internal.vision.e2.A(f14, 1.0f, 0.0f, this.d * kdVar.e);
        float[] fArr = kdVar.u;
        float[] fArr2 = kdVar.v;
        float[] fArr3 = kdVar.w;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float interpolation = H.getInterpolation(kdVar.o[i13]);
            float f18 = 1.0f - interpolation;
            fArr[i13] = (kdVar.l[i13] * interpolation) + (kdVar.k[i13] * f18);
            fArr3[i13] = (kdVar.n[i13] * interpolation) + (kdVar.m[i13] * f18);
        }
        float f19 = this.g;
        char c11 = 2;
        if (f19 > 0.0f) {
            int i14 = 0;
            while (i14 < 2) {
                int i15 = 0;
                while (i15 < i11) {
                    float f20 = f16;
                    int i16 = i15 + 1;
                    float f21 = (fArr[i15 == 0 ? i11 - 1 : i15 - 1] + fArr[i16 == i11 ? 0 : i16]) * 0.5f;
                    float f22 = f17;
                    float f23 = fArr[i15];
                    fArr2[i15] = com.google.android.gms.internal.vision.e2.y(f21, f23, f19, f23);
                    i15 = i16;
                    f16 = f20;
                    f17 = f22;
                }
                float f24 = f16;
                i14++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
                f16 = f24;
            }
        }
        float f25 = f16;
        float f26 = f17;
        int i17 = 0;
        while (i17 < i11) {
            float f27 = (i17 / i11) + fArr3[i17];
            float floor = (f27 - ((float) Math.floor(f27))) * this.p;
            float f28 = this.m;
            float[] fArr5 = this.z;
            if (floor < f28) {
                fArr5[i12] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c11] = f25;
                fArr5[3] = f26;
                i10 = i12;
                c10 = c11;
            } else {
                float f29 = floor - f28;
                float f30 = this.o;
                i10 = i12;
                float f31 = this.c;
                if (f29 < f30) {
                    c10 = c11;
                    a(this.k, -this.l, (f29 / (f31 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f32 = f29 - f30;
                    float f33 = this.n;
                    if (f32 < f33) {
                        fArr5[i10] = this.h;
                        fArr5[1] = (-this.l) + f32;
                        fArr5[c10] = f26;
                        fArr5[3] = f25;
                    } else {
                        float f34 = f32 - f33;
                        if (f34 < f30) {
                            a(this.k, this.l, f34 / (f31 * this.j), fArr5);
                        } else {
                            float f35 = f34 - f30;
                            if (f35 < f28) {
                                fArr5[i10] = this.k - f35;
                                fArr5[1] = this.i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f26;
                            } else {
                                float f36 = f35 - f28;
                                if (f36 < f30) {
                                    a(-this.k, this.l, (f36 / (f31 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f37 = f36 - f30;
                                    if (f37 < f33) {
                                        fArr5[i10] = -this.h;
                                        fArr5[1] = this.l - f37;
                                        fArr5[c10] = f26;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.k, -this.l, ((f37 - f33) / (f31 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f38 = fArr5[3];
            float f39 = -fArr5[c10];
            float f40 = (fArr[i17] * A) + f15 + f11;
            kdVar.q[i17] = (f38 * f40) + f7 + fArr5[i10];
            kdVar.r[i17] = (f39 * f40) + f10 + fArr5[1];
            kdVar.s[i17] = fArr5[c10];
            kdVar.t[i17] = fArr5[3];
            i17++;
            c11 = c10;
            i12 = i10;
        }
        int i18 = i12;
        Path path = this.y;
        path.rewind();
        path.moveTo(kdVar.q[i18], kdVar.r[i18]);
        int i19 = i18;
        while (i19 < i11) {
            int i20 = i19 + 1;
            int i21 = i20 < i11 ? i20 : i18;
            float[] fArr6 = kdVar.q;
            float f41 = fArr6[i21] - fArr6[i19];
            float[] fArr7 = kdVar.r;
            float f42 = fArr7[i21] - fArr7[i19];
            float sqrt = ((float) Math.sqrt((f42 * f42) + (f41 * f41))) / 3.0f;
            float[] fArr8 = kdVar.q;
            float f43 = fArr8[i19];
            float[] fArr9 = kdVar.s;
            float f44 = (fArr9[i19] * sqrt) + f43;
            float[] fArr10 = kdVar.r;
            float f45 = fArr10[i19];
            float[] fArr11 = kdVar.t;
            float f46 = (fArr11[i19] * sqrt) + f45;
            float f47 = fArr8[i21];
            float f48 = f47 - (fArr9[i21] * sqrt);
            float f49 = fArr10[i21];
            path.cubicTo(f44, f46, f48, f49 - (fArr11[i21] * sqrt), f47, f49);
            i19 = i20;
        }
        path.close();
        canvas.drawPath(path, kdVar.i);
    }

    public final float c() {
        kd kdVar = this.q;
        float f7 = kdVar.d;
        float f10 = kdVar.f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = kdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        kd kdVar2 = this.r;
        return Math.max(f15, (f14 * kdVar2.e) + (f11 * kdVar2.f) + kdVar2.d);
    }

    public final void d(float f7) {
        this.w = f7;
        if (LiteMode.isEnabled(512)) {
            float f10 = this.w - this.v;
            this.x = f10 / (((f10 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
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
        kd kdVar = this.r;
        kd kdVar2 = this.q;
        if (isEnabled && min > 0) {
            float f7 = this.w;
            float f10 = this.v;
            if (f7 != f10) {
                float f11 = this.x;
                float f12 = (min * f11) + f10;
                this.v = f12;
                if (f11 > 0.0f) {
                    if (f12 > f7) {
                        this.v = f7;
                    }
                } else if (f12 < f7) {
                    this.v = f7;
                }
            }
            this.s = a1.g.e(min, this.f, 6.2831855f, this.s);
            kdVar2.d(this.v);
            kdVar.d(this.v);
        }
        float f13 = this.E;
        if (f13 < 1.0f && min > 0) {
            float f14 = (min / 250.0f) + f13;
            this.E = f14;
            if (f14 > 1.0f) {
                this.E = 1.0f;
            }
            int d = i0.a.d(this.E, this.C, this.D);
            this.B = d;
            kdVar2.h = d;
            kdVar.h = d;
            kdVar2.a();
            kdVar.a();
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f15 = 1.0f - (this.v * 0.7f);
        float f16 = kdVar2.f;
        float f17 = this.e;
        float A = com.google.android.gms.internal.vision.e2.A((float) Math.sin(this.s), 0.5f, 0.5f, f16 * f17 * f15);
        float A2 = com.google.android.gms.internal.vision.e2.A((float) Math.sin(this.s + kdVar.b), 0.5f, 0.5f, f17 * kdVar.f * f15);
        b(canvas, this.q, exactCenterX, exactCenterY, A);
        b(canvas, this.r, exactCenterX, exactCenterY, A2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void e(int i10, boolean z10) {
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            int x02 = i10 != 0 ? i10 != 1 ? i10 != 3 ? org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.bh, false) : i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ih, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.jh, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kh, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Zg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ah, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Xg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Yg, false));
            if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = x02;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                this.B = x02;
                kd kdVar = this.q;
                kdVar.h = x02;
                kd kdVar2 = this.r;
                kdVar2.h = x02;
                kdVar.a();
                kdVar2.a();
            }
            invalidateSelf();
        }
    }

    public final void f(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            e(2, z10);
            return;
        }
        ChatObject.Call call = sharedInstance.groupCall;
        if (call == null) {
            e(sharedInstance.isMicMute() ? 1 : 0, z10);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
            e(sharedInstance.isMicMute() ? 1 : 0, z10);
        } else {
            sharedInstance.setMicMute(true, false, false);
            e(3, z10);
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
        float c10 = c() + AndroidUtilities.dp(1.0f);
        float min = (Math.min(r6.width(), r6.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (c10 > min) {
            c10 = Math.max(0.0f, min);
        }
        this.h = (r6.width() / 2.0f) - c10;
        float height = (r6.height() / 2.0f) - c10;
        this.i = height;
        float f7 = this.h;
        if (f7 < 1.0f || height < 1.0f) {
            return;
        }
        float min2 = Math.min(this.a, Math.min(f7, height));
        this.j = min2;
        float f10 = this.h - min2;
        this.k = f10;
        float f11 = this.i - min2;
        this.l = f11;
        float f12 = f10 * 2.0f;
        this.m = f12;
        float f13 = f11 * 2.0f;
        this.n = f13;
        float f14 = this.c * 1.5707964f * min2;
        this.o = f14;
        float f15 = (f13 * 2.0f) + (f12 * 2.0f);
        this.p = (f14 * 4.0f) + f15;
        int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.b)));
        kd kdVar = this.q;
        if (max != kdVar.x) {
            kdVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            kd kdVar = this.q;
            kdVar.y = i10;
            kdVar.a();
            kd kdVar2 = this.r;
            kdVar2.y = i10;
            kdVar2.a();
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
