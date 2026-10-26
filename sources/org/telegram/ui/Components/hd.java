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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hd extends Drawable {
    public static final fd H = new fd(0);
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
    public final gd q;
    public final gd r;
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
    public final pg F = new pg(this, 17);
    public int G = 255;

    public hd() {
        gd gdVar = new gd();
        this.q = gdVar;
        gdVar.a = 1.0f;
        gdVar.b = 0.0f;
        gdVar.c = AndroidUtilities.dp(0.5f);
        gdVar.d = AndroidUtilities.dp(8.5f);
        gdVar.e = 1.0f;
        gdVar.f = 1.0f;
        gdVar.g = 61;
        gd gdVar2 = new gd();
        this.r = gdVar2;
        gdVar2.a = 0.82f;
        gdVar2.b = 0.6f;
        gdVar2.c = AndroidUtilities.dp(0.0f);
        gdVar2.d = AndroidUtilities.dp(4.25f);
        gdVar2.e = 0.55f;
        gdVar2.f = 0.55f;
        gdVar2.g = 128;
        g(0, false);
    }

    public static int e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.bh, false) : i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ih, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jh, false)), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kh, false)) : i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Zg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ah, false)) : i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Xg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Yg, false));
    }

    public final void a(int i10) {
        this.B = i10;
        gd gdVar = this.q;
        gdVar.h = i10;
        gd gdVar2 = this.r;
        gdVar2.h = i10;
        gdVar.a();
        gdVar2.a();
    }

    public final void b(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, gd gdVar, float f7, float f10, float f11) {
        int i10;
        char c10;
        int i11 = gdVar.x;
        if (i11 == 0) {
            return;
        }
        float f12 = gdVar.c;
        float f13 = gdVar.d - f12;
        float f14 = this.v;
        float f15 = (f13 * f14) + f12;
        float f16 = 1.0f;
        float f17 = 0.0f;
        float C = c3.h0.C(f14, 1.0f, 0.0f, this.d * gdVar.e);
        float[] fArr = gdVar.u;
        float[] fArr2 = gdVar.v;
        float[] fArr3 = gdVar.w;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float interpolation = H.getInterpolation(gdVar.o[i13]);
            float f18 = 1.0f - interpolation;
            fArr[i13] = (gdVar.l[i13] * interpolation) + (gdVar.k[i13] * f18);
            fArr3[i13] = (gdVar.n[i13] * interpolation) + (gdVar.m[i13] * f18);
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
                    fArr2[i15] = c3.h0.z(f21, f23, f19, f23);
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
                    b(this.k, -this.l, (f29 / (f31 * this.j)) - 1.5707964f, fArr5);
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
                            b(this.k, this.l, f34 / (f31 * this.j), fArr5);
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
                                    b(-this.k, this.l, (f36 / (f31 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f37 = f36 - f30;
                                    if (f37 < f33) {
                                        fArr5[i10] = -this.h;
                                        fArr5[1] = this.l - f37;
                                        fArr5[c10] = f26;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.k, -this.l, ((f37 - f33) / (f31 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f38 = fArr5[3];
            float f39 = -fArr5[c10];
            float f40 = (fArr[i17] * C) + f15 + f11;
            gdVar.q[i17] = (f38 * f40) + f7 + fArr5[i10];
            gdVar.r[i17] = (f39 * f40) + f10 + fArr5[1];
            gdVar.s[i17] = fArr5[c10];
            gdVar.t[i17] = fArr5[3];
            i17++;
            c11 = c10;
            i12 = i10;
        }
        int i18 = i12;
        Path path = this.y;
        path.rewind();
        path.moveTo(gdVar.q[i18], gdVar.r[i18]);
        int i19 = i18;
        while (i19 < i11) {
            int i20 = i19 + 1;
            int i21 = i20 < i11 ? i20 : i18;
            float[] fArr6 = gdVar.q;
            float f41 = fArr6[i21] - fArr6[i19];
            float[] fArr7 = gdVar.r;
            float f42 = fArr7[i21] - fArr7[i19];
            float sqrt = ((float) Math.sqrt((f42 * f42) + (f41 * f41))) / 3.0f;
            float[] fArr8 = gdVar.q;
            float f43 = fArr8[i19];
            float[] fArr9 = gdVar.s;
            float f44 = (fArr9[i19] * sqrt) + f43;
            float[] fArr10 = gdVar.r;
            float f45 = fArr10[i19];
            float[] fArr11 = gdVar.t;
            float f46 = (fArr11[i19] * sqrt) + f45;
            float f47 = fArr8[i21];
            float f48 = f47 - (fArr9[i21] * sqrt);
            float f49 = fArr10[i21];
            path.cubicTo(f44, f46, f48, f49 - (fArr11[i21] * sqrt), f47, f49);
            i19 = i20;
        }
        path.close();
        canvas.drawPath(path, gdVar.i);
    }

    public final float d() {
        gd gdVar = this.q;
        float f7 = gdVar.d;
        float f10 = gdVar.f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = gdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        gd gdVar2 = this.r;
        return Math.max(f15, (f14 * gdVar2.e) + (f11 * gdVar2.f) + gdVar2.d);
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
        gd gdVar = this.r;
        gd gdVar2 = this.q;
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
            this.s = a1.g.c(min, this.f, 6.2831855f, this.s);
            gdVar2.d(this.v);
            gdVar.d(this.v);
        }
        float f13 = this.E;
        if (f13 < 1.0f && min > 0) {
            float f14 = (min / 250.0f) + f13;
            this.E = f14;
            if (f14 > 1.0f) {
                this.E = 1.0f;
            }
            a(i0.a.f(this.E, this.C, this.D));
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f15 = 1.0f - (this.v * 0.7f);
        float f16 = gdVar2.f;
        float f17 = this.e;
        float C = c3.h0.C((float) Math.sin(this.s), 0.5f, 0.5f, f16 * f17 * f15);
        float C2 = c3.h0.C((float) Math.sin(this.s + gdVar.b), 0.5f, 0.5f, f17 * gdVar.f * f15);
        c(canvas, this.q, exactCenterX, exactCenterY, C);
        c(canvas, this.r, exactCenterX, exactCenterY, C2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void f(float f7) {
        this.w = f7;
        if (LiteMode.isEnabled(512)) {
            float f10 = this.w - this.v;
            this.x = f10 / (((f10 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
        }
    }

    public final void g(int i10, boolean z10) {
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            int e = e(i10);
            if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = e;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                a(e);
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
        ChatObject.Call call = sharedInstance.groupCall;
        if (call == null) {
            g(sharedInstance.isMicMute() ? 1 : 0, z10);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
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
        float d = d() + AndroidUtilities.dp(1.0f);
        float min = (Math.min(r6.width(), r6.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (d > min) {
            d = Math.max(0.0f, min);
        }
        this.h = (r6.width() / 2.0f) - d;
        float height = (r6.height() / 2.0f) - d;
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
        gd gdVar = this.q;
        if (max != gdVar.x) {
            gdVar.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            gd gdVar = this.q;
            gdVar.y = i10;
            gdVar.a();
            gd gdVar2 = this.r;
            gdVar2.y = i10;
            gdVar2.a();
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
