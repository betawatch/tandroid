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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class jd extends Drawable {
    public static final hd H = new hd(0);
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
    public final id q;
    public final id r;
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
    public final pg F = new pg(this, 16);
    public int G = 255;

    public jd() {
        id idVar = new id();
        this.q = idVar;
        idVar.a = 1.0f;
        idVar.b = 0.0f;
        idVar.c = AndroidUtilities.dp(0.5f);
        idVar.d = AndroidUtilities.dp(8.5f);
        idVar.e = 1.0f;
        idVar.f = 1.0f;
        idVar.g = 61;
        id idVar2 = new id();
        this.r = idVar2;
        idVar2.a = 0.82f;
        idVar2.b = 0.6f;
        idVar2.c = AndroidUtilities.dp(0.0f);
        idVar2.d = AndroidUtilities.dp(4.25f);
        idVar2.e = 0.55f;
        idVar2.f = 0.55f;
        idVar2.g = 128;
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

    public final void b(Canvas canvas, id idVar, float f7, float f10, float f11) {
        char c10;
        char c11;
        int i10 = idVar.x;
        if (i10 == 0) {
            return;
        }
        float f12 = idVar.c;
        float f13 = idVar.d - f12;
        float f14 = this.v;
        float f15 = (f13 * f14) + f12;
        float B = com.google.android.gms.internal.vision.e2.B(f14, 1.0f, 0.0f, this.d * idVar.e);
        float[] fArr = idVar.u;
        float[] fArr2 = idVar.v;
        float[] fArr3 = idVar.w;
        char c12 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            float interpolation = H.getInterpolation(idVar.o[i11]);
            float f16 = 1.0f - interpolation;
            fArr[i11] = (idVar.l[i11] * interpolation) + (idVar.k[i11] * f16);
            fArr3[i11] = (idVar.n[i11] * interpolation) + (idVar.m[i11] * f16);
        }
        float f17 = this.g;
        char c13 = 2;
        if (f17 > 0.0f) {
            int i12 = 0;
            while (i12 < 2) {
                int i13 = 0;
                while (i13 < i10) {
                    int i14 = i13 + 1;
                    float f18 = (fArr[i13 == 0 ? i10 - 1 : i13 - 1] + fArr[i14 == i10 ? 0 : i14]) * 0.5f;
                    float f19 = fArr[i13];
                    fArr2[i13] = com.google.android.gms.internal.vision.e2.z(f18, f19, f17, f19);
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
                fArr5[c12] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c13] = 1.0f;
                fArr5[3] = 0.0f;
                c10 = 0;
                c11 = 2;
            } else {
                float f22 = floor - f21;
                float f23 = this.o;
                c10 = 0;
                float f24 = this.c;
                if (f22 < f23) {
                    c11 = 2;
                    a(this.k, -this.l, (f22 / (f24 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c11 = 2;
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
            float f32 = -fArr5[c11];
            float f33 = (fArr[i15] * B) + f15 + f11;
            idVar.q[i15] = (f31 * f33) + f7 + fArr5[c10];
            idVar.r[i15] = (f32 * f33) + f10 + fArr5[1];
            idVar.s[i15] = fArr5[c11];
            idVar.t[i15] = fArr5[3];
            i15++;
            c12 = 0;
            c13 = 2;
        }
        Path path = this.y;
        path.rewind();
        path.moveTo(idVar.q[0], idVar.r[0]);
        int i16 = 0;
        while (i16 < i10) {
            int i17 = i16 + 1;
            int i18 = i17 < i10 ? i17 : 0;
            float[] fArr6 = idVar.q;
            float f34 = fArr6[i18] - fArr6[i16];
            float[] fArr7 = idVar.r;
            float f35 = fArr7[i18] - fArr7[i16];
            float sqrt = ((float) Math.sqrt((f35 * f35) + (f34 * f34))) / 3.0f;
            float[] fArr8 = idVar.q;
            float f36 = fArr8[i16];
            float[] fArr9 = idVar.s;
            float f37 = (fArr9[i16] * sqrt) + f36;
            float[] fArr10 = idVar.r;
            float f38 = fArr10[i16];
            float[] fArr11 = idVar.t;
            float f39 = (fArr11[i16] * sqrt) + f38;
            float f40 = fArr8[i18];
            float f41 = f40 - (fArr9[i18] * sqrt);
            float f42 = fArr10[i18];
            path.cubicTo(f37, f39, f41, f42 - (fArr11[i18] * sqrt), f40, f42);
            i16 = i17;
        }
        path.close();
        canvas.drawPath(path, idVar.i);
    }

    public final float c() {
        id idVar = this.q;
        float f7 = idVar.d;
        float f10 = idVar.f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = idVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        id idVar2 = this.r;
        return Math.max(f15, (f14 * idVar2.e) + (f11 * idVar2.f) + idVar2.d);
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
        id idVar = this.r;
        id idVar2 = this.q;
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
            this.s = a4.a.e(min, this.f, 6.2831855f, this.s);
            idVar2.d(this.v);
            idVar.d(this.v);
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
            idVar2.h = d;
            idVar.h = d;
            idVar2.a();
            idVar.a();
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f15 = 1.0f - (this.v * 0.7f);
        float f16 = idVar2.f;
        float f17 = this.e;
        float B = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.s), 0.5f, 0.5f, f16 * f17 * f15);
        float B2 = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.s + idVar.b), 0.5f, 0.5f, f17 * idVar.f * f15);
        b(canvas, this.q, exactCenterX, exactCenterY, B);
        b(canvas, this.r, exactCenterX, exactCenterY, B2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void e(int i10, boolean z10) {
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            int w02 = i10 != 0 ? i10 != 1 ? i10 != 3 ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.bh, false) : i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ah, false)) : i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yg, false));
            if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = w02;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                this.B = w02;
                id idVar = this.q;
                idVar.h = w02;
                id idVar2 = this.r;
                idVar2.h = w02;
                idVar.a();
                idVar2.a();
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
        id idVar = this.q;
        if (max != idVar.x) {
            idVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            id idVar = this.q;
            idVar.y = i10;
            idVar.a();
            id idVar2 = this.r;
            idVar2.y = i10;
            idVar2.a();
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
