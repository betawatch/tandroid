package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wc extends Drawable {
    public static final uc H = new uc(0);
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
    public final vc q;
    public final vc r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public final float a = org.telegram.messenger.g0.L(18.0f);
    public final float b = org.telegram.messenger.g0.L(22.0f);
    public final float c = 2.4f;
    public final float d = org.telegram.messenger.g0.L(12.0f);
    public final float e = org.telegram.messenger.g0.L(1.5f);
    public final float f = 3600.0f;
    public final float g = 0.25f;
    public final Path y = new Path();
    public final float[] z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final og F = new og(this, 16);
    public int G = org.telegram.messenger.ls.e4;

    public wc() {
        vc vcVar = new vc();
        this.q = vcVar;
        vcVar.a = 1.0f;
        vcVar.b = 0.0f;
        vcVar.c = org.telegram.messenger.g0.L(0.5f);
        vcVar.d = org.telegram.messenger.g0.L(8.5f);
        vcVar.e = 1.0f;
        vcVar.f = 1.0f;
        vcVar.g = 61;
        vc vcVar2 = new vc();
        this.r = vcVar2;
        vcVar2.a = 0.82f;
        vcVar2.b = 0.6f;
        vcVar2.c = org.telegram.messenger.g0.L(0.0f);
        vcVar2.d = org.telegram.messenger.g0.L(4.25f);
        vcVar2.e = 0.55f;
        vcVar2.f = 0.55f;
        vcVar2.g = 128;
        g(0, false);
    }

    public static int e(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 3 ? org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Sh, false) : i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ai, false)), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bi, false)) : i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Qh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Rh, false)) : i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Oh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ph, false));
    }

    public final void a(int i7) {
        this.B = i7;
        vc vcVar = this.q;
        vcVar.h = i7;
        vc vcVar2 = this.r;
        vcVar2.h = i7;
        vcVar.a();
        vcVar2.a();
    }

    public final void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, vc vcVar, float f10, float f11, float f12) {
        int i7;
        char c10;
        int i10 = vcVar.x;
        if (i10 == 0) {
            return;
        }
        float f13 = vcVar.c;
        float f14 = vcVar.d - f13;
        float f15 = this.v;
        float f16 = (f14 * f15) + f13;
        float f17 = 1.0f;
        float f18 = 0.0f;
        float B = com.google.android.gms.internal.vision.e2.B(f15, 1.0f, 0.0f, this.d * vcVar.e);
        float[] fArr = vcVar.u;
        float[] fArr2 = vcVar.v;
        float[] fArr3 = vcVar.w;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float interpolation = H.getInterpolation(vcVar.o[i12]);
            float f19 = 1.0f - interpolation;
            fArr[i12] = (vcVar.l[i12] * interpolation) + (vcVar.k[i12] * f19);
            fArr3[i12] = (vcVar.n[i12] * interpolation) + (vcVar.m[i12] * f19);
        }
        float f20 = this.g;
        char c11 = 2;
        if (f20 > 0.0f) {
            int i13 = 0;
            while (i13 < 2) {
                int i14 = 0;
                while (i14 < i10) {
                    float f21 = f17;
                    int i15 = i14 + 1;
                    float f22 = (fArr[i14 == 0 ? i10 - 1 : i14 - 1] + fArr[i15 == i10 ? 0 : i15]) * 0.5f;
                    float f23 = f18;
                    float f24 = fArr[i14];
                    fArr2[i14] = com.google.android.gms.internal.vision.e2.z(f22, f24, f20, f24);
                    i14 = i15;
                    f17 = f21;
                    f18 = f23;
                }
                float f25 = f17;
                i13++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
                f17 = f25;
            }
        }
        float f26 = f17;
        float f27 = f18;
        int i16 = 0;
        while (i16 < i10) {
            float f28 = (i16 / i10) + fArr3[i16];
            float floor = (f28 - ((float) Math.floor(f28))) * this.p;
            float f29 = this.m;
            float[] fArr5 = this.z;
            if (floor < f29) {
                fArr5[i11] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c11] = f26;
                fArr5[3] = f27;
                i7 = i11;
                c10 = c11;
            } else {
                float f30 = floor - f29;
                float f31 = this.o;
                i7 = i11;
                float f32 = this.c;
                if (f30 < f31) {
                    c10 = c11;
                    b(this.k, -this.l, (f30 / (f32 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f33 = f30 - f31;
                    float f34 = this.n;
                    if (f33 < f34) {
                        fArr5[i7] = this.h;
                        fArr5[1] = (-this.l) + f33;
                        fArr5[c10] = f27;
                        fArr5[3] = f26;
                    } else {
                        float f35 = f33 - f34;
                        if (f35 < f31) {
                            b(this.k, this.l, f35 / (f32 * this.j), fArr5);
                        } else {
                            float f36 = f35 - f31;
                            if (f36 < f29) {
                                fArr5[i7] = this.k - f36;
                                fArr5[1] = this.i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f27;
                            } else {
                                float f37 = f36 - f29;
                                if (f37 < f31) {
                                    b(-this.k, this.l, (f37 / (f32 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f38 = f37 - f31;
                                    if (f38 < f34) {
                                        fArr5[i7] = -this.h;
                                        fArr5[1] = this.l - f38;
                                        fArr5[c10] = f27;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.k, -this.l, ((f38 - f34) / (f32 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f39 = fArr5[3];
            float f40 = -fArr5[c10];
            float f41 = (fArr[i16] * B) + f16 + f12;
            vcVar.q[i16] = (f39 * f41) + f10 + fArr5[i7];
            vcVar.r[i16] = (f40 * f41) + f11 + fArr5[1];
            vcVar.s[i16] = fArr5[c10];
            vcVar.t[i16] = fArr5[3];
            i16++;
            c11 = c10;
            i11 = i7;
        }
        int i17 = i11;
        Path path = this.y;
        path.rewind();
        path.moveTo(vcVar.q[i17], vcVar.r[i17]);
        int i18 = i17;
        while (i18 < i10) {
            int i19 = i18 + 1;
            int i20 = i19 < i10 ? i19 : i17;
            float[] fArr6 = vcVar.q;
            float f42 = fArr6[i20] - fArr6[i18];
            float[] fArr7 = vcVar.r;
            float f43 = fArr7[i20] - fArr7[i18];
            float sqrt = ((float) Math.sqrt((f43 * f43) + (f42 * f42))) / 3.0f;
            float[] fArr8 = vcVar.q;
            float f44 = fArr8[i18];
            float[] fArr9 = vcVar.s;
            float f45 = (fArr9[i18] * sqrt) + f44;
            float[] fArr10 = vcVar.r;
            float f46 = fArr10[i18];
            float[] fArr11 = vcVar.t;
            float f47 = (fArr11[i18] * sqrt) + f46;
            float f48 = fArr8[i20];
            float f49 = f48 - (fArr9[i20] * sqrt);
            float f50 = fArr10[i20];
            path.cubicTo(f45, f47, f49, f50 - (fArr11[i20] * sqrt), f48, f50);
            i18 = i19;
        }
        path.close();
        canvas.drawPath(path, vcVar.i);
    }

    public final float d() {
        vc vcVar = this.q;
        float f10 = vcVar.d;
        float f11 = vcVar.f;
        float f12 = this.e;
        float f13 = (f11 * f12) + f10;
        float f14 = vcVar.e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        vc vcVar2 = this.r;
        return Math.max(f16, (f15 * vcVar2.e) + (f12 * vcVar2.f) + vcVar2.d);
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
        boolean e10 = org.telegram.messenger.qc.e(512);
        vc vcVar = this.r;
        vc vcVar2 = this.q;
        if (e10 && min > 0) {
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
            this.s = com.google.android.gms.internal.vision.e2.c(min, this.f, 6.2831855f, this.s);
            vcVar2.d(this.v);
            vcVar.d(this.v);
        }
        float f14 = this.E;
        if (f14 < 1.0f && min > 0) {
            float f15 = (min / 250.0f) + f14;
            this.E = f15;
            if (f15 > 1.0f) {
                this.E = 1.0f;
            }
            a(i0.a.f(this.E, this.C, this.D));
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f16 = 1.0f - (this.v * 0.7f);
        float f17 = vcVar2.f;
        float f18 = this.e;
        float B = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.s), 0.5f, 0.5f, f17 * f18 * f16);
        float B2 = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.s + vcVar.b), 0.5f, 0.5f, f18 * vcVar.f * f16);
        c(canvas, this.q, exactCenterX, exactCenterY, B);
        c(canvas, this.r, exactCenterX, exactCenterY, B2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void f(float f10) {
        this.w = f10;
        if (org.telegram.messenger.qc.e(512)) {
            float f11 = this.w - this.v;
            this.x = f11 / (((f11 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
        }
    }

    public final void g(int i7, boolean z10) {
        if (i7 != this.A || this.E < 1.0f) {
            this.A = i7;
            int e10 = e(i7);
            if (z10 && this.B != 0 && org.telegram.messenger.qc.e(512)) {
                this.C = this.B;
                this.D = e10;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                a(e10);
            }
            invalidateSelf();
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

    public final void h(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            g(2, z10);
            return;
        }
        org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
        if (t3Var == null) {
            g(sharedInstance.isMicMute() ? 1 : 0, z10);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) && !sharedInstance.groupCall.b.rtmp_stream) {
            g(sharedInstance.isMicMute() ? 1 : 0, z10);
        } else {
            sharedInstance.setMicMute(true, false, false);
            g(3, z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (getBounds().isEmpty()) {
            return;
        }
        float d = d() + org.telegram.messenger.g0.L(1.0f);
        float min = (Math.min(r6.width(), r6.height()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
        if (d > min) {
            d = Math.max(0.0f, min);
        }
        this.h = (r6.width() / 2.0f) - d;
        float height = (r6.height() / 2.0f) - d;
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
        vc vcVar = this.q;
        if (max != vcVar.x) {
            vcVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.G != i7) {
            this.G = i7;
            vc vcVar = this.q;
            vcVar.y = i7;
            vcVar.a();
            vc vcVar2 = this.r;
            vcVar2.y = i7;
            vcVar2.a();
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
