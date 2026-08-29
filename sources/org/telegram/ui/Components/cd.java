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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cd extends Drawable {
    public static final gh.a H = new gh.a(1);
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
    public final bd q;
    public final bd r;
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
    public final ig F = new ig(this, 16);
    public int G = 255;

    public cd() {
        bd bdVar = new bd();
        this.q = bdVar;
        bdVar.a = 1.0f;
        bdVar.b = 0.0f;
        bdVar.c = AndroidUtilities.dp(0.5f);
        bdVar.d = AndroidUtilities.dp(8.5f);
        bdVar.e = 1.0f;
        bdVar.f = 1.0f;
        bdVar.g = 61;
        bd bdVar2 = new bd();
        this.r = bdVar2;
        bdVar2.a = 0.82f;
        bdVar2.b = 0.6f;
        bdVar2.c = AndroidUtilities.dp(0.0f);
        bdVar2.d = AndroidUtilities.dp(4.25f);
        bdVar2.e = 0.55f;
        bdVar2.f = 0.55f;
        bdVar2.g = 128;
        e(0, false);
    }

    public final void a(float f9, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.j;
        fArr[0] = (f12 * cos) + f9;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, bd bdVar, float f9, float f10, float f11) {
        char c3;
        char c6;
        int i10 = bdVar.x;
        if (i10 == 0) {
            return;
        }
        float f12 = bdVar.c;
        float f13 = bdVar.d - f12;
        float f14 = this.v;
        float f15 = (f13 * f14) + f12;
        float B = com.google.android.recaptcha.internal.a.B(f14, 1.0f, 0.0f, this.d * bdVar.e);
        float[] fArr = bdVar.u;
        float[] fArr2 = bdVar.v;
        float[] fArr3 = bdVar.w;
        char c10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            float interpolation = H.getInterpolation(bdVar.o[i11]);
            float f16 = 1.0f - interpolation;
            fArr[i11] = (bdVar.l[i11] * interpolation) + (bdVar.k[i11] * f16);
            fArr3[i11] = (bdVar.n[i11] * interpolation) + (bdVar.m[i11] * f16);
        }
        float f17 = this.g;
        char c11 = 2;
        if (f17 > 0.0f) {
            int i12 = 0;
            while (i12 < 2) {
                int i13 = 0;
                while (i13 < i10) {
                    int i14 = i13 + 1;
                    float f18 = (fArr[i13 == 0 ? i10 - 1 : i13 - 1] + fArr[i14 == i10 ? 0 : i14]) * 0.5f;
                    float f19 = fArr[i13];
                    fArr2[i13] = com.google.android.recaptcha.internal.a.z(f18, f19, f17, f19);
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
            float f20 = (i15 / i10) + fArr3[i15];
            float floor = (f20 - ((float) Math.floor(f20))) * this.p;
            float f21 = this.m;
            float[] fArr5 = this.z;
            if (floor < f21) {
                fArr5[c10] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c11] = 1.0f;
                fArr5[3] = 0.0f;
                c3 = 0;
                c6 = 2;
            } else {
                float f22 = floor - f21;
                float f23 = this.o;
                c3 = 0;
                float f24 = this.c;
                if (f22 < f23) {
                    c6 = 2;
                    a(this.k, -this.l, (f22 / (f24 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c6 = 2;
                    float f25 = f22 - f23;
                    float f26 = this.n;
                    if (f25 < f26) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.l) + f25;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f27 = f25 - f26;
                        if (f27 < f23) {
                            a(this.k, this.l, f27 / (f24 * this.j), fArr5);
                        } else {
                            float f28 = f27 - f23;
                            if (f28 < f21) {
                                fArr5[0] = this.k - f28;
                                fArr5[1] = this.i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f29 = f28 - f21;
                                if (f29 < f23) {
                                    a(-this.k, this.l, (f29 / (f24 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f30 = f29 - f23;
                                    if (f30 < f26) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.l - f30;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.k, -this.l, ((f30 - f26) / (f24 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f31 = fArr5[3];
            float f32 = -fArr5[c6];
            float f33 = (fArr[i15] * B) + f15 + f11;
            bdVar.q[i15] = (f31 * f33) + f9 + fArr5[c3];
            bdVar.r[i15] = (f32 * f33) + f10 + fArr5[1];
            bdVar.s[i15] = fArr5[c6];
            bdVar.t[i15] = fArr5[3];
            i15++;
            c10 = 0;
            c11 = 2;
        }
        Path path = this.y;
        path.rewind();
        path.moveTo(bdVar.q[0], bdVar.r[0]);
        int i16 = 0;
        while (i16 < i10) {
            int i17 = i16 + 1;
            int i18 = i17 < i10 ? i17 : 0;
            float[] fArr6 = bdVar.q;
            float f34 = fArr6[i18] - fArr6[i16];
            float[] fArr7 = bdVar.r;
            float f35 = fArr7[i18] - fArr7[i16];
            float sqrt = ((float) Math.sqrt((f35 * f35) + (f34 * f34))) / 3.0f;
            float[] fArr8 = bdVar.q;
            float f36 = fArr8[i16];
            float[] fArr9 = bdVar.s;
            float f37 = (fArr9[i16] * sqrt) + f36;
            float[] fArr10 = bdVar.r;
            float f38 = fArr10[i16];
            float[] fArr11 = bdVar.t;
            float f39 = (fArr11[i16] * sqrt) + f38;
            float f40 = fArr8[i18];
            float f41 = f40 - (fArr9[i18] * sqrt);
            float f42 = fArr10[i18];
            path.cubicTo(f37, f39, f41, f42 - (fArr11[i18] * sqrt), f40, f42);
            i16 = i17;
        }
        path.close();
        canvas.drawPath(path, bdVar.i);
    }

    public final float c() {
        bd bdVar = this.q;
        float f9 = bdVar.d;
        float f10 = bdVar.f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f9;
        float f13 = bdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        bd bdVar2 = this.r;
        return Math.max(f15, (f14 * bdVar2.e) + (f11 * bdVar2.f) + bdVar2.d);
    }

    public final void d(float f9) {
        this.w = f9;
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
        bd bdVar = this.r;
        bd bdVar2 = this.q;
        if (isEnabled && min > 0) {
            float f9 = this.w;
            float f10 = this.v;
            if (f9 != f10) {
                float f11 = this.x;
                float f12 = (min * f11) + f10;
                this.v = f12;
                if (f11 > 0.0f) {
                    if (f12 > f9) {
                        this.v = f9;
                    }
                } else if (f12 < f9) {
                    this.v = f9;
                }
            }
            this.s = u3.c.c(min, this.f, 6.2831855f, this.s);
            bdVar2.d(this.v);
            bdVar.d(this.v);
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
            bdVar2.h = d;
            bdVar.h = d;
            bdVar2.a();
            bdVar.a();
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f15 = 1.0f - (this.v * 0.7f);
        float f16 = bdVar2.f;
        float f17 = this.e;
        float B = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.s), 0.5f, 0.5f, f16 * f17 * f15);
        float B2 = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.s + bdVar.b), 0.5f, 0.5f, f17 * bdVar.f * f15);
        b(canvas, this.q, exactCenterX, exactCenterY, B);
        b(canvas, this.r, exactCenterX, exactCenterY, B2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void e(int i10, boolean z10) {
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            int w02 = i10 != 0 ? i10 != 1 ? i10 != 3 ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.bh, false) : i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jh, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Zg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ah, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yg, false));
            if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = w02;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                this.B = w02;
                bd bdVar = this.q;
                bdVar.h = w02;
                bd bdVar2 = this.r;
                bdVar2.h = w02;
                bdVar.a();
                bdVar2.a();
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
        float c3 = c() + AndroidUtilities.dp(1.0f);
        float min = (Math.min(r6.width(), r6.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (c3 > min) {
            c3 = Math.max(0.0f, min);
        }
        this.h = (r6.width() / 2.0f) - c3;
        float height = (r6.height() / 2.0f) - c3;
        this.i = height;
        float f9 = this.h;
        if (f9 < 1.0f || height < 1.0f) {
            return;
        }
        float min2 = Math.min(this.a, Math.min(f9, height));
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
        bd bdVar = this.q;
        if (max != bdVar.x) {
            bdVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            bd bdVar = this.q;
            bdVar.y = i10;
            bdVar.a();
            bd bdVar2 = this.r;
            bdVar2.y = i10;
            bdVar2.a();
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
