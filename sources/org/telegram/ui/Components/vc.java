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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vc extends Drawable {
    public static final eh.a H = new eh.a(1);
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
    public final uc q;
    public final uc r;
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
    public final bg F = new bg(this, 16);
    public int G = 255;

    public vc() {
        uc ucVar = new uc();
        this.q = ucVar;
        ucVar.a = 1.0f;
        ucVar.b = 0.0f;
        ucVar.c = AndroidUtilities.dp(0.5f);
        ucVar.d = AndroidUtilities.dp(8.5f);
        ucVar.e = 1.0f;
        ucVar.f = 1.0f;
        ucVar.g = 61;
        uc ucVar2 = new uc();
        this.r = ucVar2;
        ucVar2.a = 0.82f;
        ucVar2.b = 0.6f;
        ucVar2.c = AndroidUtilities.dp(0.0f);
        ucVar2.d = AndroidUtilities.dp(4.25f);
        ucVar2.e = 0.55f;
        ucVar2.f = 0.55f;
        ucVar2.g = 128;
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

    public final void b(Canvas canvas, uc ucVar, float f10, float f11, float f12) {
        char c10;
        char c11;
        int i10 = ucVar.x;
        if (i10 == 0) {
            return;
        }
        float f13 = ucVar.c;
        float f14 = ucVar.d - f13;
        float f15 = this.v;
        float f16 = (f14 * f15) + f13;
        float B = com.google.android.recaptcha.internal.a.B(f15, 1.0f, 0.0f, this.d * ucVar.e);
        float[] fArr = ucVar.u;
        float[] fArr2 = ucVar.v;
        float[] fArr3 = ucVar.w;
        char c12 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            float interpolation = H.getInterpolation(ucVar.o[i11]);
            float f17 = 1.0f - interpolation;
            fArr[i11] = (ucVar.l[i11] * interpolation) + (ucVar.k[i11] * f17);
            fArr3[i11] = (ucVar.n[i11] * interpolation) + (ucVar.m[i11] * f17);
        }
        float f18 = this.g;
        char c13 = 2;
        if (f18 > 0.0f) {
            int i12 = 0;
            while (i12 < 2) {
                int i13 = 0;
                while (i13 < i10) {
                    int i14 = i13 + 1;
                    float f19 = (fArr[i13 == 0 ? i10 - 1 : i13 - 1] + fArr[i14 == i10 ? 0 : i14]) * 0.5f;
                    float f20 = fArr[i13];
                    fArr2[i13] = com.google.android.recaptcha.internal.a.z(f19, f20, f18, f20);
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
                fArr5[c12] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c13] = 1.0f;
                fArr5[3] = 0.0f;
                c10 = 0;
                c11 = 2;
            } else {
                float f23 = floor - f22;
                float f24 = this.o;
                c10 = 0;
                float f25 = this.c;
                if (f23 < f24) {
                    c11 = 2;
                    a(this.k, -this.l, (f23 / (f25 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c11 = 2;
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
            float f33 = -fArr5[c11];
            float f34 = (fArr[i15] * B) + f16 + f12;
            ucVar.q[i15] = (f32 * f34) + f10 + fArr5[c10];
            ucVar.r[i15] = (f33 * f34) + f11 + fArr5[1];
            ucVar.s[i15] = fArr5[c11];
            ucVar.t[i15] = fArr5[3];
            i15++;
            c12 = 0;
            c13 = 2;
        }
        Path path = this.y;
        path.rewind();
        path.moveTo(ucVar.q[0], ucVar.r[0]);
        int i16 = 0;
        while (i16 < i10) {
            int i17 = i16 + 1;
            int i18 = i17 < i10 ? i17 : 0;
            float[] fArr6 = ucVar.q;
            float f35 = fArr6[i18] - fArr6[i16];
            float[] fArr7 = ucVar.r;
            float f36 = fArr7[i18] - fArr7[i16];
            float sqrt = ((float) Math.sqrt((f36 * f36) + (f35 * f35))) / 3.0f;
            float[] fArr8 = ucVar.q;
            float f37 = fArr8[i16];
            float[] fArr9 = ucVar.s;
            float f38 = (fArr9[i16] * sqrt) + f37;
            float[] fArr10 = ucVar.r;
            float f39 = fArr10[i16];
            float[] fArr11 = ucVar.t;
            float f40 = (fArr11[i16] * sqrt) + f39;
            float f41 = fArr8[i18];
            float f42 = f41 - (fArr9[i18] * sqrt);
            float f43 = fArr10[i18];
            path.cubicTo(f38, f40, f42, f43 - (fArr11[i18] * sqrt), f41, f43);
            i16 = i17;
        }
        path.close();
        canvas.drawPath(path, ucVar.i);
    }

    public final float c() {
        uc ucVar = this.q;
        float f10 = ucVar.d;
        float f11 = ucVar.f;
        float f12 = this.e;
        float f13 = (f11 * f12) + f10;
        float f14 = ucVar.e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        uc ucVar2 = this.r;
        return Math.max(f16, (f15 * ucVar2.e) + (f12 * ucVar2.f) + ucVar2.d);
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
        uc ucVar = this.r;
        uc ucVar2 = this.q;
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
            this.s = s3.c.c(min, this.f, 6.2831855f, this.s);
            ucVar2.d(this.v);
            ucVar.d(this.v);
        }
        float f14 = this.E;
        if (f14 < 1.0f && min > 0) {
            float f15 = (min / 250.0f) + f14;
            this.E = f15;
            if (f15 > 1.0f) {
                this.E = 1.0f;
            }
            int d = i0.b.d(this.E, this.C, this.D);
            this.B = d;
            ucVar2.h = d;
            ucVar.h = d;
            ucVar2.a();
            ucVar.a();
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f16 = 1.0f - (this.v * 0.7f);
        float f17 = ucVar2.f;
        float f18 = this.e;
        float B = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.s), 0.5f, 0.5f, f17 * f18 * f16);
        float B2 = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.s + ucVar.b), 0.5f, 0.5f, f18 * ucVar.f * f16);
        b(canvas, this.q, exactCenterX, exactCenterY, B);
        b(canvas, this.r, exactCenterX, exactCenterY, B2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void e(int i10, boolean z10) {
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            int w02 = i10 != 0 ? i10 != 1 ? i10 != 3 ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.bh, false) : i0.b.d(0.5f, i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jh, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false)) : i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Zg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ah, false)) : i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yg, false));
            if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = w02;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                this.B = w02;
                uc ucVar = this.q;
                ucVar.h = w02;
                uc ucVar2 = this.r;
                ucVar2.h = w02;
                ucVar.a();
                ucVar2.a();
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
        uc ucVar = this.q;
        if (max != ucVar.x) {
            ucVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            uc ucVar = this.q;
            ucVar.y = i10;
            ucVar.a();
            uc ucVar2 = this.r;
            ucVar2.y = i10;
            ucVar2.a();
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
