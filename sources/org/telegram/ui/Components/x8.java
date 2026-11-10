package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.SystemClock;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x8 {
    public float A;
    public boolean B;
    public boolean a;
    public boolean d;
    public ValueAnimator f;
    public boolean g;
    public Runnable j;
    public int k;
    public boolean l;
    public final boolean m;
    public int n;
    public int o;
    public int p;
    public final View r;
    public int s;
    public boolean w;
    public boolean x;
    public di.a7 y;
    public final Random z;
    public final w8[] b = new w8[3];
    public final w8[] c = new w8[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = org.telegram.messenger.g0.L(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public long v = 220;

    public x8(View view, boolean z9) {
        wq wqVar = wq.f;
        this.z = new Random();
        this.r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            w8[] w8VarArr = this.b;
            w8 w8Var = new w8();
            w8VarArr[i7] = w8Var;
            w8Var.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.b[i7].e;
            imageReceiver.J0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.b[i7].a = new v8((org.telegram.ui.ActionBar.h6) null);
            this.b[i7].a.u(org.telegram.messenger.g0.L(12.0f));
            w8[] w8VarArr2 = this.c;
            w8 w8Var2 = new w8();
            w8VarArr2[i7] = w8Var2;
            w8Var2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.c[i7].e;
            imageReceiver2.J0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.c[i7].a = new v8((org.telegram.ui.ActionBar.h6) null);
            this.c[i7].a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.m = z9;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z9, boolean z10) {
        w8[] w8VarArr;
        w8[] w8VarArr2;
        if (!this.d || !z9) {
            this.e = 1.0f;
            k();
            return;
        }
        w8[] w8VarArr3 = new w8[3];
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            w8VarArr = this.b;
            w8VarArr2 = this.c;
            if (i7 >= 3) {
                break;
            }
            w8VarArr3[i7] = w8VarArr[i7];
            w8 w8Var = w8VarArr[i7];
            long j3 = w8Var.g;
            w8 w8Var2 = w8VarArr2[i7];
            if (j3 != w8Var2.g) {
                z11 = true;
            } else {
                w8Var.d = w8Var2.d;
            }
            i7++;
        }
        if (!z11) {
            this.e = 1.0f;
            return;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 3) {
                    w8VarArr2[i10].i = 0;
                    break;
                }
                if (w8VarArr[i11].g == w8VarArr2[i10].g) {
                    w8VarArr3[i11] = null;
                    if (i10 == i11) {
                        w8 w8Var3 = w8VarArr2[i10];
                        w8Var3.i = -1;
                        org.telegram.ui.Cells.e4 e4Var = w8Var3.b;
                        w8 w8Var4 = w8VarArr[i10];
                        w8Var3.b = w8Var4.b;
                        w8Var4.b = e4Var;
                    } else {
                        w8 w8Var5 = w8VarArr2[i10];
                        w8Var5.i = 2;
                        w8Var5.j = i11;
                    }
                } else {
                    i11++;
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            w8 w8Var6 = w8VarArr3[i12];
            if (w8Var6 != null) {
                w8Var6.i = 1;
            }
        }
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f.cancel();
            if (this.w) {
                k();
                this.w = false;
            }
        }
        this.e = 0.0f;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new d6(this, 4));
            this.f.addListener(new y5(this, 5));
            this.f.setDuration(this.v);
            this.f.setInterpolator(wq.f);
            this.f.start();
        } else {
            this.w = true;
        }
        d();
    }

    public final int b() {
        int i7 = this.s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.k;
        return org.telegram.messenger.g0.L((i10 == 4 || i10 == 10) ? 32.0f : 24.0f);
    }

    public final float c() {
        int L;
        int i7 = this.k;
        boolean z9 = i7 == 4 || i7 == 10;
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i10 = this.s;
            L = i10 != 0 ? (int) (i10 * this.t) : org.telegram.messenger.g0.L(z9 ? 24.0f : 20.0f);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (this.b[i12].g != 0) {
                i11++;
            }
        }
        return (Math.max(0, i11 - 1) * L) + (i11 > 0 ? b() : 0);
    }

    public final void d() {
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (this.B) {
            return;
        }
        this.B = true;
        for (int i7 = 0; i7 < 3; i7++) {
            this.b[i7].e.P();
            this.c[i7].e.P();
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.b[i7].e.R();
                this.c[i7].e.R();
            }
            if (this.k == 3) {
                org.telegram.ui.ActionBar.m6.G0().a(0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x069e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0619 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas) {
        int L;
        w8[] w8VarArr;
        w8[] w8VarArr2;
        Canvas canvas2;
        int i7;
        w8[] w8VarArr3;
        Paint paint;
        float f10;
        float f11;
        boolean z9;
        float f12;
        int i10;
        Paint paint2;
        w8[] w8VarArr4;
        int i11;
        ImageReceiver imageReceiver;
        Paint paint3;
        int i12;
        w8 w8Var;
        w8 w8Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float b10;
        int i13;
        float f13;
        int i14;
        float f14;
        boolean z10;
        float f15;
        int i15;
        int i16;
        float f16;
        int i17;
        boolean z11 = true;
        this.d = true;
        int i18 = this.k;
        int i19 = 10;
        int i20 = 4;
        boolean z12 = i18 == 4 || i18 == 10;
        int b11 = b();
        if (this.k == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i21 = this.s;
            if (i21 != 0) {
                L = (int) (i21 * this.t);
            } else {
                L = org.telegram.messenger.g0.L(z12 ? 24.0f : 20.0f);
            }
        }
        int i22 = L;
        int i23 = 0;
        while (true) {
            w8VarArr = this.b;
            if (i23 >= 3) {
                break;
            }
            long j3 = w8VarArr[i23].g;
            i23++;
        }
        int i24 = this.k;
        int L2 = (i24 == 0 || i24 == 10 || i24 == 11) ? 0 : org.telegram.messenger.g0.L(10.0f);
        int c10 = this.l ? (this.p - ((int) c())) / 2 : L2;
        boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i25 = this.k;
        Paint paint4 = this.h;
        if (i25 == 4) {
            paint4.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.v7, false));
        } else if (i25 != 3) {
            paint4.setColor(org.telegram.ui.ActionBar.m6.x0(null, z13 ? org.telegram.ui.ActionBar.m6.z7 : org.telegram.ui.ActionBar.m6.y7, false));
        }
        int i26 = 0;
        int i27 = 0;
        while (true) {
            w8VarArr2 = this.c;
            if (i26 >= 3) {
                break;
            }
            w8[] w8VarArr5 = w8VarArr;
            if (w8VarArr2[i26].g != 0) {
                i27++;
            }
            i26++;
            w8VarArr = w8VarArr5;
        }
        w8[] w8VarArr6 = w8VarArr;
        int i28 = this.k;
        boolean z14 = i28 == 0 || i28 == 1 || i28 == 3 || i28 == 4 || i28 == 5 || i28 == 10 || i28 == 11;
        if (z14) {
            float L3 = i28 == 10 ? org.telegram.messenger.g0.L(16.0f) : 0.0f;
            if (this.x) {
                L3 += org.telegram.messenger.g0.L(20.0f);
            }
            float f17 = -L3;
            float f18 = this.p + L3;
            float f19 = this.o + L3;
            paint = paint4;
            w8VarArr3 = w8VarArr2;
            i7 = 2;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f17, f17, f18, f19, org.telegram.messenger.qs.e4, 31);
        } else {
            canvas2 = canvas;
            i7 = 2;
            w8VarArr3 = w8VarArr2;
            paint = paint4;
            f10 = 0.0f;
        }
        this.A = f10;
        boolean z15 = this.x;
        View view = this.r;
        float f20 = 1.0f;
        if (z15) {
            int i29 = i7;
            while (i29 >= 0) {
                int i30 = 0;
                while (i30 < i7) {
                    if (i30 != 0 || this.e != f20) {
                        w8[] w8VarArr7 = i30 == 0 ? w8VarArr3 : w8VarArr6;
                        if (i30 != z11 || this.e == f20 || w8VarArr7[i29].i == z11) {
                            ImageReceiver imageReceiver2 = w8VarArr7[i29].e;
                            if (imageReceiver2.K()) {
                                if (i30 == 0) {
                                    if (this.l) {
                                        f14 = f20;
                                        i17 = org.telegram.messenger.camera.q.y(z12 ? 8.0f : 4.0f, this.p - (i27 * i22), i7);
                                    } else {
                                        f14 = f20;
                                        i17 = L2;
                                    }
                                    imageReceiver2.K0 = (i22 * i29) + i17;
                                } else {
                                    f14 = f20;
                                    imageReceiver2.K0 = (i22 * i29) + c10;
                                }
                                int i31 = this.k;
                                if (i31 == 0 || i31 == i19 || i31 == 11) {
                                    imageReceiver2.L0 = (this.o - b11) / 2.0f;
                                } else {
                                    imageReceiver2.L0 = org.telegram.messenger.g0.L(i31 == i20 ? 8.0f : 6.0f);
                                }
                                if (this.e != f14) {
                                    int i32 = w8VarArr7[i29].i;
                                    if (i32 == z11) {
                                        canvas2.save();
                                        float f21 = f14 - this.e;
                                        canvas2.scale(f21, f21, imageReceiver2.r(), imageReceiver2.s());
                                        f16 = f14 - this.e;
                                    } else if (i32 == 0) {
                                        canvas2.save();
                                        float f22 = this.e;
                                        canvas2.scale(f22, f22, imageReceiver2.r(), imageReceiver2.s());
                                        f16 = this.e;
                                    } else if (i32 == i7) {
                                        if (this.l) {
                                            i16 = org.telegram.messenger.camera.q.y(z12 ? 8.0f : 4.0f, this.p - (i27 * i22), i7);
                                        } else {
                                            i16 = L2;
                                        }
                                        int i33 = (i22 * i29) + i16;
                                        int i34 = (w8VarArr7[i29].j * i22) + c10;
                                        float f23 = this.e;
                                        imageReceiver2.K0 = (int) com.google.android.recaptcha.internal.a.z(f14, f23, i34, i33 * f23);
                                    } else if (i32 == -1 && this.l) {
                                        int y10 = org.telegram.messenger.camera.q.y(z12 ? 8.0f : 4.0f, this.p - (i27 * i22), i7) + (i22 * i29);
                                        float f24 = this.e;
                                        imageReceiver2.K0 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f24, c10 + r5, y10 * f24);
                                    }
                                    f15 = f16;
                                    z10 = z11;
                                    float f25 = f15 * this.u;
                                    float b12 = (b() / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                                    if (this.y != null) {
                                        di.a7 a7Var = new di.a7();
                                        int i35 = org.telegram.ui.ActionBar.m6.Hh;
                                        a7Var.n = i35;
                                        int i36 = org.telegram.ui.ActionBar.m6.Jh;
                                        a7Var.o = i36;
                                        a7Var.a = z11;
                                        i15 = i29;
                                        a7Var.d(org.telegram.ui.ActionBar.m6.x0(null, i35, false), org.telegram.ui.ActionBar.m6.x0(null, i36, false), 0, 0);
                                        this.y = a7Var;
                                    } else {
                                        i15 = i29;
                                    }
                                    this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), org.telegram.messenger.g0.L(40.0f));
                                    this.y.c.setAlpha((int) (f25 * 255.0f));
                                    canvas2.drawCircle(imageReceiver2.r(), imageReceiver2.s(), b12, this.y.c);
                                    if (!z10) {
                                        canvas2.restore();
                                    }
                                    i30++;
                                    i29 = i15;
                                    f20 = 1.0f;
                                    z11 = true;
                                    i19 = 10;
                                    i7 = 2;
                                    i20 = 4;
                                }
                                z10 = false;
                                f15 = 1.0f;
                                float f252 = f15 * this.u;
                                float b122 = (b() / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                                if (this.y != null) {
                                }
                                this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), org.telegram.messenger.g0.L(40.0f));
                                this.y.c.setAlpha((int) (f252 * 255.0f));
                                canvas2.drawCircle(imageReceiver2.r(), imageReceiver2.s(), b122, this.y.c);
                                if (!z10) {
                                }
                                i30++;
                                i29 = i15;
                                f20 = 1.0f;
                                z11 = true;
                                i19 = 10;
                                i7 = 2;
                                i20 = 4;
                            }
                        }
                    }
                    i15 = i29;
                    i30++;
                    i29 = i15;
                    f20 = 1.0f;
                    z11 = true;
                    i19 = 10;
                    i7 = 2;
                    i20 = 4;
                }
                i29--;
                f20 = 1.0f;
                z11 = true;
                i19 = 10;
                i7 = 2;
                i20 = 4;
            }
        }
        int i37 = 2;
        while (i37 >= 0) {
            int i38 = 0;
            while (i38 < 2) {
                if (i38 == 0) {
                    f11 = 1.0f;
                    if (this.e == 1.0f) {
                        i11 = i37;
                        paint3 = paint;
                        i12 = i38;
                        i38 = i12 + 1;
                        paint = paint3;
                        i37 = i11;
                    }
                } else {
                    f11 = 1.0f;
                }
                w8[] w8VarArr8 = i38 == 0 ? w8VarArr3 : w8VarArr6;
                if (i38 != 1 || this.e == f11 || w8VarArr8[i37].i == 1) {
                    ImageReceiver imageReceiver3 = w8VarArr8[i37].e;
                    if (imageReceiver3.K()) {
                        if (i38 == 0) {
                            if (this.l) {
                                i14 = org.telegram.messenger.camera.q.y(z12 ? 8.0f : 4.0f, this.p - (i27 * i22), 2);
                            } else {
                                i14 = L2;
                            }
                            imageReceiver3.K0 = (i22 * i37) + i14;
                        } else {
                            imageReceiver3.K0 = (i22 * i37) + c10;
                        }
                        int i39 = this.k;
                        if (i39 != 0 && i39 != 10) {
                            if (i39 != 11) {
                                imageReceiver3.L0 = org.telegram.messenger.g0.L(i39 == 4 ? 8.0f : 6.0f);
                                if (this.e != 1.0f) {
                                    int i40 = w8VarArr8[i37].i;
                                    if (i40 == 1) {
                                        canvas2.save();
                                        float f26 = 1.0f - this.e;
                                        canvas2.scale(f26, f26, imageReceiver3.r(), imageReceiver3.s());
                                        f13 = 1.0f - this.e;
                                    } else if (i40 == 0) {
                                        canvas2.save();
                                        float f27 = this.e;
                                        canvas2.scale(f27, f27, imageReceiver3.r(), imageReceiver3.s());
                                        f13 = this.e;
                                    } else if (i40 == 2) {
                                        if (this.l) {
                                            i13 = org.telegram.messenger.camera.q.y(z12 ? 8.0f : 4.0f, this.p - (i27 * i22), 2);
                                        } else {
                                            i13 = L2;
                                        }
                                        int i41 = (i22 * i37) + i13;
                                        int i42 = (w8VarArr8[i37].j * i22) + c10;
                                        float f28 = this.e;
                                        imageReceiver3.K0 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f28, i42, i41 * f28);
                                    } else {
                                        if (i40 == -1 && this.l) {
                                            int y11 = org.telegram.messenger.camera.q.y(z12 ? 8.0f : 4.0f, this.p - (i27 * i22), 2) + (i22 * i37);
                                            float f29 = this.e;
                                            imageReceiver3.K0 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f29, c10 + r10, y11 * f29);
                                            z9 = false;
                                            f12 = 1.0f;
                                            float f30 = f12 * this.u;
                                            if (i37 == w8VarArr8.length - 1 || this.x) {
                                                i10 = this.k;
                                                paint2 = this.i;
                                                if (i10 != 1 || i10 == 3 || i10 == 5) {
                                                    w8VarArr4 = w8VarArr8;
                                                    i11 = i37;
                                                    imageReceiver = imageReceiver3;
                                                    paint3 = paint;
                                                    i12 = i38;
                                                    canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(13.0f), paint2);
                                                    w8Var = w8VarArr4[i11];
                                                    if (w8Var.b == null) {
                                                        if (this.k == 5) {
                                                            w8Var.b = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                                                        } else {
                                                            w8Var.b = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(21.0f));
                                                        }
                                                    }
                                                    if (this.k == 5) {
                                                        w8VarArr4[i11].b.d(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false), (int) (f30 * 76.5f)));
                                                    }
                                                    w8Var2 = w8VarArr4[i11];
                                                    groupCallParticipant = w8Var2.f;
                                                    if (groupCallParticipant == null && groupCallParticipant.amplitude > 0.0f) {
                                                        w8Var2.b.e(view, true);
                                                        w8VarArr4[i11].b.c(r2.f.amplitude * 15.0f);
                                                        if (this.k == 5 && SystemClock.uptimeMillis() - w8VarArr4[i11].f.lastSpeakTime > 500) {
                                                            this.j.run();
                                                        }
                                                        w8VarArr4[i11].b.f();
                                                        if (this.k == 5) {
                                                            w8VarArr4[i11].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                                            d();
                                                        }
                                                        b10 = w8VarArr4[i11].b.b();
                                                        imageReceiver.setAlpha(f30);
                                                        if (b10 != 1.0f) {
                                                            canvas2.save();
                                                            canvas2.scale(b10, b10, imageReceiver.r(), imageReceiver.s());
                                                            imageReceiver.h(canvas2, null);
                                                            canvas2.restore();
                                                        } else {
                                                            imageReceiver.h(canvas2, null);
                                                        }
                                                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                        if (z9) {
                                                            canvas2.restore();
                                                        }
                                                        i38 = i12 + 1;
                                                        paint = paint3;
                                                        i37 = i11;
                                                    }
                                                    w8Var2.b.e(view, false);
                                                    if (this.k == 5) {
                                                        this.j.run();
                                                    }
                                                    w8VarArr4[i11].b.f();
                                                    if (this.k == 5) {
                                                    }
                                                    b10 = w8VarArr4[i11].b.b();
                                                    imageReceiver.setAlpha(f30);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                    if (z9) {
                                                    }
                                                    i38 = i12 + 1;
                                                    paint = paint3;
                                                    i37 = i11;
                                                } else if (i10 == 4 || i10 == 10) {
                                                    paint3 = paint;
                                                    i12 = i38;
                                                    canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), org.telegram.messenger.g0.L(17.0f), paint2);
                                                    w8 w8Var3 = w8VarArr8[i37];
                                                    if (w8Var3.b == null) {
                                                        w8Var3.b = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(21.0f));
                                                    }
                                                    if (this.k == 10) {
                                                        w8VarArr8[i37].b.d(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false), (int) (f30 * 76.5f)));
                                                    } else {
                                                        w8VarArr8[i37].b.d(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dh, false), (int) (f30 * 76.5f)));
                                                    }
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    w8 w8Var4 = w8VarArr8[i37];
                                                    w8[] w8VarArr9 = w8VarArr8;
                                                    i11 = i37;
                                                    if (currentTimeMillis - w8Var4.c > 100) {
                                                        w8Var4.c = currentTimeMillis;
                                                        if (this.k == 10) {
                                                            TLRPC.GroupCallParticipant groupCallParticipant2 = w8Var4.f;
                                                            if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                                w8Var4.b.e(view, false);
                                                            } else {
                                                                w8Var4.b.e(view, true);
                                                                w8VarArr9[i11].b.c(r2.f.amplitude * 15.0f);
                                                            }
                                                        } else {
                                                            long currentTime = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).getCurrentTime();
                                                            w8 w8Var5 = w8VarArr9[i11];
                                                            imageReceiver = imageReceiver3;
                                                            if (currentTime - w8Var5.d <= 5) {
                                                                w8Var5.b.e(view, true);
                                                                w8VarArr9[i11].b.c(this.z.nextInt() % 100);
                                                            } else {
                                                                w8Var5.b.e(view, false);
                                                                w8VarArr9[i11].b.c(0.0d);
                                                            }
                                                            w8VarArr9[i11].b.f();
                                                            w8VarArr9[i11].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                                            b10 = w8VarArr9[i11].b.b();
                                                            imageReceiver.setAlpha(f30);
                                                            if (b10 != 1.0f) {
                                                            }
                                                            this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                            if (z9) {
                                                            }
                                                            i38 = i12 + 1;
                                                            paint = paint3;
                                                            i37 = i11;
                                                        }
                                                    }
                                                    imageReceiver = imageReceiver3;
                                                    w8VarArr9[i11].b.f();
                                                    w8VarArr9[i11].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                                    b10 = w8VarArr9[i11].b.b();
                                                    imageReceiver.setAlpha(f30);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                    if (z9) {
                                                    }
                                                    i38 = i12 + 1;
                                                    paint = paint3;
                                                    i37 = i11;
                                                } else {
                                                    float b13 = (b() / 2.0f) + this.q;
                                                    if (z14) {
                                                        canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), b13, paint2);
                                                    } else {
                                                        int alpha = paint.getAlpha();
                                                        if (f30 != 1.0f) {
                                                            paint3 = paint;
                                                            paint3.setAlpha((int) (alpha * f30));
                                                        } else {
                                                            paint3 = paint;
                                                        }
                                                        i12 = i38;
                                                        canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), b13, paint3);
                                                        if (f30 != 1.0f) {
                                                            paint3.setAlpha(alpha);
                                                        }
                                                        i11 = i37;
                                                        imageReceiver = imageReceiver3;
                                                        b10 = 1.0f;
                                                        imageReceiver.setAlpha(f30);
                                                        if (b10 != 1.0f) {
                                                        }
                                                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                        if (z9) {
                                                        }
                                                        i38 = i12 + 1;
                                                        paint = paint3;
                                                        i37 = i11;
                                                    }
                                                }
                                            }
                                            paint3 = paint;
                                            i12 = i38;
                                            i11 = i37;
                                            imageReceiver = imageReceiver3;
                                            b10 = 1.0f;
                                            imageReceiver.setAlpha(f30);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                            if (z9) {
                                            }
                                            i38 = i12 + 1;
                                            paint = paint3;
                                            i37 = i11;
                                        }
                                        z9 = false;
                                        f12 = 1.0f;
                                        float f302 = f12 * this.u;
                                        if (i37 == w8VarArr8.length - 1) {
                                        }
                                        i10 = this.k;
                                        paint2 = this.i;
                                        if (i10 != 1) {
                                        }
                                        w8VarArr4 = w8VarArr8;
                                        i11 = i37;
                                        imageReceiver = imageReceiver3;
                                        paint3 = paint;
                                        i12 = i38;
                                        canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(13.0f), paint2);
                                        w8Var = w8VarArr4[i11];
                                        if (w8Var.b == null) {
                                        }
                                        if (this.k == 5) {
                                        }
                                        w8Var2 = w8VarArr4[i11];
                                        groupCallParticipant = w8Var2.f;
                                        if (groupCallParticipant == null) {
                                            w8Var2.b.e(view, true);
                                            w8VarArr4[i11].b.c(r2.f.amplitude * 15.0f);
                                            if (this.k == 5) {
                                            }
                                            w8VarArr4[i11].b.f();
                                            if (this.k == 5) {
                                            }
                                            b10 = w8VarArr4[i11].b.b();
                                            imageReceiver.setAlpha(f302);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                            if (z9) {
                                            }
                                            i38 = i12 + 1;
                                            paint = paint3;
                                            i37 = i11;
                                        }
                                        w8Var2.b.e(view, false);
                                        if (this.k == 5) {
                                        }
                                        w8VarArr4[i11].b.f();
                                        if (this.k == 5) {
                                        }
                                        b10 = w8VarArr4[i11].b.b();
                                        imageReceiver.setAlpha(f302);
                                        if (b10 != 1.0f) {
                                        }
                                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                        if (z9) {
                                        }
                                        i38 = i12 + 1;
                                        paint = paint3;
                                        i37 = i11;
                                    }
                                    f12 = f13;
                                    z9 = true;
                                    float f3022 = f12 * this.u;
                                    if (i37 == w8VarArr8.length - 1) {
                                    }
                                    i10 = this.k;
                                    paint2 = this.i;
                                    if (i10 != 1) {
                                    }
                                    w8VarArr4 = w8VarArr8;
                                    i11 = i37;
                                    imageReceiver = imageReceiver3;
                                    paint3 = paint;
                                    i12 = i38;
                                    canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(13.0f), paint2);
                                    w8Var = w8VarArr4[i11];
                                    if (w8Var.b == null) {
                                    }
                                    if (this.k == 5) {
                                    }
                                    w8Var2 = w8VarArr4[i11];
                                    groupCallParticipant = w8Var2.f;
                                    if (groupCallParticipant == null) {
                                    }
                                    w8Var2.b.e(view, false);
                                    if (this.k == 5) {
                                    }
                                    w8VarArr4[i11].b.f();
                                    if (this.k == 5) {
                                    }
                                    b10 = w8VarArr4[i11].b.b();
                                    imageReceiver.setAlpha(f3022);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                    if (z9) {
                                    }
                                    i38 = i12 + 1;
                                    paint = paint3;
                                    i37 = i11;
                                }
                                z9 = false;
                                f12 = 1.0f;
                                float f30222 = f12 * this.u;
                                if (i37 == w8VarArr8.length - 1) {
                                }
                                i10 = this.k;
                                paint2 = this.i;
                                if (i10 != 1) {
                                }
                                w8VarArr4 = w8VarArr8;
                                i11 = i37;
                                imageReceiver = imageReceiver3;
                                paint3 = paint;
                                i12 = i38;
                                canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(13.0f), paint2);
                                w8Var = w8VarArr4[i11];
                                if (w8Var.b == null) {
                                }
                                if (this.k == 5) {
                                }
                                w8Var2 = w8VarArr4[i11];
                                groupCallParticipant = w8Var2.f;
                                if (groupCallParticipant == null) {
                                }
                                w8Var2.b.e(view, false);
                                if (this.k == 5) {
                                }
                                w8VarArr4[i11].b.f();
                                if (this.k == 5) {
                                }
                                b10 = w8VarArr4[i11].b.b();
                                imageReceiver.setAlpha(f30222);
                                if (b10 != 1.0f) {
                                }
                                this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                if (z9) {
                                }
                                i38 = i12 + 1;
                                paint = paint3;
                                i37 = i11;
                            }
                        }
                        imageReceiver3.L0 = (this.o - b11) / 2.0f;
                        if (this.e != 1.0f) {
                        }
                        z9 = false;
                        f12 = 1.0f;
                        float f302222 = f12 * this.u;
                        if (i37 == w8VarArr8.length - 1) {
                        }
                        i10 = this.k;
                        paint2 = this.i;
                        if (i10 != 1) {
                        }
                        w8VarArr4 = w8VarArr8;
                        i11 = i37;
                        imageReceiver = imageReceiver3;
                        paint3 = paint;
                        i12 = i38;
                        canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(13.0f), paint2);
                        w8Var = w8VarArr4[i11];
                        if (w8Var.b == null) {
                        }
                        if (this.k == 5) {
                        }
                        w8Var2 = w8VarArr4[i11];
                        groupCallParticipant = w8Var2.f;
                        if (groupCallParticipant == null) {
                        }
                        w8Var2.b.e(view, false);
                        if (this.k == 5) {
                        }
                        w8VarArr4[i11].b.f();
                        if (this.k == 5) {
                        }
                        b10 = w8VarArr4[i11].b.b();
                        imageReceiver.setAlpha(f302222);
                        if (b10 != 1.0f) {
                        }
                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                        if (z9) {
                        }
                        i38 = i12 + 1;
                        paint = paint3;
                        i37 = i11;
                    } else {
                        i11 = i37;
                        paint3 = paint;
                    }
                } else {
                    i11 = i37;
                    paint3 = paint;
                }
                i12 = i38;
                i38 = i12 + 1;
                paint = paint3;
                i37 = i11;
            }
            i37--;
        }
        if (z14) {
            canvas2.restore();
        }
    }

    public final void h(int i7) {
        v8 v8Var;
        v8 v8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            w8 w8Var = this.b[i10];
            if (w8Var != null && (v8Var2 = w8Var.a) != null) {
                v8Var2.u(i7);
            }
            w8 w8Var2 = this.c[i10];
            if (w8Var2 != null && (v8Var = w8Var2.a) != null) {
                v8Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.n = i7;
        View view = this.r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        w8[] w8VarArr = this.c;
        w8 w8Var = w8VarArr[i7];
        w8Var.g = 0L;
        w8Var.f = null;
        if (tLObject == null) {
            w8Var.e.w0(null);
            d();
            return;
        }
        w8Var.d = -1L;
        w8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            w8Var.f = groupCallParticipant;
            long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
            if (org.telegram.messenger.m5.E(B1)) {
                user = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(B1));
                w8VarArr[i7].a.r(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-B1));
                w8VarArr[i7].a.q(M0);
                chat = M0;
                user = null;
            }
            if (this.k != 4) {
                w8VarArr[i7].d = groupCallParticipant.active_date;
            } else if (B1 == org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i10).a).e()) {
                w8VarArr[i7].d = 0L;
            } else if (this.m) {
                w8VarArr[i7].d = groupCallParticipant.lastActiveDate;
            } else {
                w8VarArr[i7].d = groupCallParticipant.active_date;
            }
            w8VarArr[i7].g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                w8Var.a.g(1);
                w8VarArr[i7].a.p = 0.6f;
            } else {
                w8Var.a.g(0);
                v8 v8Var = w8VarArr[i7].a;
                v8Var.p = 1.0f;
                v8Var.r(user2);
            }
            w8VarArr[i7].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            w8Var.a.g(0);
            v8 v8Var2 = w8VarArr[i7].a;
            v8Var2.p = 1.0f;
            v8Var2.q(chat);
            w8VarArr[i7].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            w8VarArr[i7].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                w8VarArr[i7].e.r0(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.c(w10, storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    w8VarArr[i7].e.r0(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.i(w11, storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            w8 w8Var2 = w8VarArr[i7];
            w8Var2.e.i0(chat, w8Var2.a, null);
        } else if (user.self && this.a) {
            w8 w8Var3 = w8VarArr[i7];
            w8Var3.e.w0(w8Var3.a);
        } else {
            w8 w8Var4 = w8VarArr[i7];
            w8Var4.e.i0(user, w8Var4.a, null);
        }
        w8VarArr[i7].e.J0(b10 / 2);
        ImageReceiver imageReceiver = w8VarArr[i7].e;
        float f10 = b10;
        imageReceiver.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            w8[] w8VarArr = this.b;
            w8 w8Var = w8VarArr[i7];
            w8[] w8VarArr2 = this.c;
            w8VarArr[i7] = w8VarArr2[i7];
            w8VarArr2[i7] = w8Var;
        }
    }
}
