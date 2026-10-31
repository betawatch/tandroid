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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t8 {
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
    public th.f5 y;
    public final Random z;
    public final s8[] b = new s8[3];
    public final s8[] c = new s8[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = org.telegram.messenger.i0.L(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public long v = 220;

    public t8(View view, boolean z10) {
        gr grVar = gr.f;
        this.z = new Random();
        this.r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            s8[] s8VarArr = this.b;
            s8 s8Var = new s8();
            s8VarArr[i10] = s8Var;
            s8Var.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.b[i10].e;
            imageReceiver.J0 = true;
            imageReceiver.J0(org.telegram.messenger.i0.L(12.0f));
            this.b[i10].a = new r8((org.telegram.ui.ActionBar.p6) null);
            this.b[i10].a.u(org.telegram.messenger.i0.L(12.0f));
            s8[] s8VarArr2 = this.c;
            s8 s8Var2 = new s8();
            s8VarArr2[i10] = s8Var2;
            s8Var2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.c[i10].e;
            imageReceiver2.J0 = true;
            imageReceiver2.J0(org.telegram.messenger.i0.L(12.0f));
            this.c[i10].a = new r8((org.telegram.ui.ActionBar.p6) null);
            this.c[i10].a.u(org.telegram.messenger.i0.L(12.0f));
        }
        this.m = z10;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        s8[] s8VarArr;
        s8[] s8VarArr2;
        if (!this.d || !z10) {
            this.e = 1.0f;
            k();
            return;
        }
        s8[] s8VarArr3 = new s8[3];
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            s8VarArr = this.b;
            s8VarArr2 = this.c;
            if (i10 >= 3) {
                break;
            }
            s8VarArr3[i10] = s8VarArr[i10];
            s8 s8Var = s8VarArr[i10];
            long j10 = s8Var.g;
            s8 s8Var2 = s8VarArr2[i10];
            if (j10 != s8Var2.g) {
                z12 = true;
            } else {
                s8Var.d = s8Var2.d;
            }
            i10++;
        }
        if (!z12) {
            this.e = 1.0f;
            return;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 3) {
                    s8VarArr2[i11].i = 0;
                    break;
                }
                if (s8VarArr[i12].g == s8VarArr2[i11].g) {
                    s8VarArr3[i12] = null;
                    if (i11 == i12) {
                        s8 s8Var3 = s8VarArr2[i11];
                        s8Var3.i = -1;
                        org.telegram.ui.Cells.g4 g4Var = s8Var3.b;
                        s8 s8Var4 = s8VarArr[i11];
                        s8Var3.b = s8Var4.b;
                        s8Var4.b = g4Var;
                    } else {
                        s8 s8Var5 = s8VarArr2[i11];
                        s8Var5.i = 2;
                        s8Var5.j = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            s8 s8Var6 = s8VarArr3[i13];
            if (s8Var6 != null) {
                s8Var6.i = 1;
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
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 4));
            this.f.addListener(new w5(this, 5));
            this.f.setDuration(this.v);
            this.f.setInterpolator(gr.f);
            this.f.start();
        } else {
            this.w = true;
        }
        d();
    }

    public final int b() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.k;
        return org.telegram.messenger.i0.L((i11 == 4 || i11 == 10) ? 32.0f : 24.0f);
    }

    public final float c() {
        int L;
        int i10 = this.k;
        boolean z10 = i10 == 4 || i10 == 10;
        if (i10 == 11) {
            L = org.telegram.messenger.i0.L(12.0f);
        } else {
            int i11 = this.s;
            L = i11 != 0 ? (int) (i11 * this.t) : org.telegram.messenger.i0.L(z10 ? 24.0f : 20.0f);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.b[i13].g != 0) {
                i12++;
            }
        }
        return (Math.max(0, i12 - 1) * L) + (i12 > 0 ? b() : 0);
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
        for (int i10 = 0; i10 < 3; i10++) {
            this.b[i10].e.P();
            this.c[i10].e.P();
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.b[i10].e.R();
                this.c[i10].e.R();
            }
            if (this.k == 3) {
                org.telegram.ui.ActionBar.t6.G0().a(0.0f);
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
        s8[] s8VarArr;
        s8[] s8VarArr2;
        Canvas canvas2;
        int i10;
        s8[] s8VarArr3;
        Paint paint;
        float f7;
        float f10;
        boolean z10;
        float f11;
        int i11;
        Paint paint2;
        s8[] s8VarArr4;
        int i12;
        ImageReceiver imageReceiver;
        Paint paint3;
        int i13;
        s8 s8Var;
        s8 s8Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float b10;
        int i14;
        float f12;
        int i15;
        float f13;
        boolean z11;
        float f14;
        int i16;
        int i17;
        float f15;
        int i18;
        boolean z12 = true;
        this.d = true;
        int i19 = this.k;
        int i20 = 10;
        int i21 = 4;
        boolean z13 = i19 == 4 || i19 == 10;
        int b11 = b();
        if (this.k == 11) {
            L = org.telegram.messenger.i0.L(12.0f);
        } else {
            int i22 = this.s;
            if (i22 != 0) {
                L = (int) (i22 * this.t);
            } else {
                L = org.telegram.messenger.i0.L(z13 ? 24.0f : 20.0f);
            }
        }
        int i23 = L;
        int i24 = 0;
        while (true) {
            s8VarArr = this.b;
            if (i24 >= 3) {
                break;
            }
            long j10 = s8VarArr[i24].g;
            i24++;
        }
        int i25 = this.k;
        int L2 = (i25 == 0 || i25 == 10 || i25 == 11) ? 0 : org.telegram.messenger.i0.L(10.0f);
        int c10 = this.l ? (this.p - ((int) c())) / 2 : L2;
        boolean z14 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i26 = this.k;
        Paint paint4 = this.h;
        if (i26 == 4) {
            paint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.v7, false));
        } else if (i26 != 3) {
            paint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, z14 ? org.telegram.ui.ActionBar.t6.z7 : org.telegram.ui.ActionBar.t6.y7, false));
        }
        int i27 = 0;
        int i28 = 0;
        while (true) {
            s8VarArr2 = this.c;
            if (i27 >= 3) {
                break;
            }
            s8[] s8VarArr5 = s8VarArr;
            if (s8VarArr2[i27].g != 0) {
                i28++;
            }
            i27++;
            s8VarArr = s8VarArr5;
        }
        s8[] s8VarArr6 = s8VarArr;
        int i29 = this.k;
        boolean z15 = i29 == 0 || i29 == 1 || i29 == 3 || i29 == 4 || i29 == 5 || i29 == 10 || i29 == 11;
        if (z15) {
            float L3 = i29 == 10 ? org.telegram.messenger.i0.L(16.0f) : 0.0f;
            if (this.x) {
                L3 += org.telegram.messenger.i0.L(20.0f);
            }
            float f16 = -L3;
            float f17 = this.p + L3;
            float f18 = this.o + L3;
            paint = paint4;
            s8VarArr3 = s8VarArr2;
            i10 = 2;
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f16, f16, f17, f18, org.telegram.messenger.zs.e4, 31);
        } else {
            canvas2 = canvas;
            i10 = 2;
            s8VarArr3 = s8VarArr2;
            paint = paint4;
            f7 = 0.0f;
        }
        this.A = f7;
        boolean z16 = this.x;
        View view = this.r;
        float f19 = 1.0f;
        if (z16) {
            int i30 = i10;
            while (i30 >= 0) {
                int i31 = 0;
                while (i31 < i10) {
                    if (i31 != 0 || this.e != f19) {
                        s8[] s8VarArr7 = i31 == 0 ? s8VarArr3 : s8VarArr6;
                        if (i31 != z12 || this.e == f19 || s8VarArr7[i30].i == z12) {
                            ImageReceiver imageReceiver2 = s8VarArr7[i30].e;
                            if (imageReceiver2.K()) {
                                if (i31 == 0) {
                                    if (this.l) {
                                        f13 = f19;
                                        i18 = org.telegram.messenger.z20.y(z13 ? 8.0f : 4.0f, this.p - (i28 * i23), i10);
                                    } else {
                                        f13 = f19;
                                        i18 = L2;
                                    }
                                    imageReceiver2.K0 = (i23 * i30) + i18;
                                } else {
                                    f13 = f19;
                                    imageReceiver2.K0 = (i23 * i30) + c10;
                                }
                                int i32 = this.k;
                                if (i32 == 0 || i32 == i20 || i32 == 11) {
                                    imageReceiver2.L0 = (this.o - b11) / 2.0f;
                                } else {
                                    imageReceiver2.L0 = org.telegram.messenger.i0.L(i32 == i21 ? 8.0f : 6.0f);
                                }
                                if (this.e != f13) {
                                    int i33 = s8VarArr7[i30].i;
                                    if (i33 == z12) {
                                        canvas2.save();
                                        float f20 = f13 - this.e;
                                        canvas2.scale(f20, f20, imageReceiver2.r(), imageReceiver2.s());
                                        f15 = f13 - this.e;
                                    } else if (i33 == 0) {
                                        canvas2.save();
                                        float f21 = this.e;
                                        canvas2.scale(f21, f21, imageReceiver2.r(), imageReceiver2.s());
                                        f15 = this.e;
                                    } else if (i33 == i10) {
                                        if (this.l) {
                                            i17 = org.telegram.messenger.z20.y(z13 ? 8.0f : 4.0f, this.p - (i28 * i23), i10);
                                        } else {
                                            i17 = L2;
                                        }
                                        int i34 = (i23 * i30) + i17;
                                        int i35 = (s8VarArr7[i30].j * i23) + c10;
                                        float f22 = this.e;
                                        imageReceiver2.K0 = (int) c3.i0.z(f13, f22, i35, i34 * f22);
                                    } else if (i33 == -1 && this.l) {
                                        int y3 = org.telegram.messenger.z20.y(z13 ? 8.0f : 4.0f, this.p - (i28 * i23), i10) + (i23 * i30);
                                        float f23 = this.e;
                                        imageReceiver2.K0 = (int) c3.i0.z(1.0f, f23, c10 + r5, y3 * f23);
                                    }
                                    f14 = f15;
                                    z11 = z12;
                                    float f24 = f14 * this.u;
                                    float b12 = (b() / 2.0f) + org.telegram.messenger.i0.L(4.0f);
                                    if (this.y != null) {
                                        th.f5 f5Var = new th.f5();
                                        int i36 = org.telegram.ui.ActionBar.t6.Hh;
                                        f5Var.n = i36;
                                        int i37 = org.telegram.ui.ActionBar.t6.Jh;
                                        f5Var.o = i37;
                                        f5Var.a = z12;
                                        i16 = i30;
                                        f5Var.d(org.telegram.ui.ActionBar.t6.x0(null, i36, false), org.telegram.ui.ActionBar.t6.x0(null, i37, false), 0, 0);
                                        this.y = f5Var;
                                    } else {
                                        i16 = i30;
                                    }
                                    this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), org.telegram.messenger.i0.L(40.0f));
                                    this.y.c.setAlpha((int) (f24 * 255.0f));
                                    canvas2.drawCircle(imageReceiver2.r(), imageReceiver2.s(), b12, this.y.c);
                                    if (!z11) {
                                        canvas2.restore();
                                    }
                                    i31++;
                                    i30 = i16;
                                    f19 = 1.0f;
                                    z12 = true;
                                    i20 = 10;
                                    i10 = 2;
                                    i21 = 4;
                                }
                                z11 = false;
                                f14 = 1.0f;
                                float f242 = f14 * this.u;
                                float b122 = (b() / 2.0f) + org.telegram.messenger.i0.L(4.0f);
                                if (this.y != null) {
                                }
                                this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), org.telegram.messenger.i0.L(40.0f));
                                this.y.c.setAlpha((int) (f242 * 255.0f));
                                canvas2.drawCircle(imageReceiver2.r(), imageReceiver2.s(), b122, this.y.c);
                                if (!z11) {
                                }
                                i31++;
                                i30 = i16;
                                f19 = 1.0f;
                                z12 = true;
                                i20 = 10;
                                i10 = 2;
                                i21 = 4;
                            }
                        }
                    }
                    i16 = i30;
                    i31++;
                    i30 = i16;
                    f19 = 1.0f;
                    z12 = true;
                    i20 = 10;
                    i10 = 2;
                    i21 = 4;
                }
                i30--;
                f19 = 1.0f;
                z12 = true;
                i20 = 10;
                i10 = 2;
                i21 = 4;
            }
        }
        int i38 = 2;
        while (i38 >= 0) {
            int i39 = 0;
            while (i39 < 2) {
                if (i39 == 0) {
                    f10 = 1.0f;
                    if (this.e == 1.0f) {
                        i12 = i38;
                        paint3 = paint;
                        i13 = i39;
                        i39 = i13 + 1;
                        paint = paint3;
                        i38 = i12;
                    }
                } else {
                    f10 = 1.0f;
                }
                s8[] s8VarArr8 = i39 == 0 ? s8VarArr3 : s8VarArr6;
                if (i39 != 1 || this.e == f10 || s8VarArr8[i38].i == 1) {
                    ImageReceiver imageReceiver3 = s8VarArr8[i38].e;
                    if (imageReceiver3.K()) {
                        if (i39 == 0) {
                            if (this.l) {
                                i15 = org.telegram.messenger.z20.y(z13 ? 8.0f : 4.0f, this.p - (i28 * i23), 2);
                            } else {
                                i15 = L2;
                            }
                            imageReceiver3.K0 = (i23 * i38) + i15;
                        } else {
                            imageReceiver3.K0 = (i23 * i38) + c10;
                        }
                        int i40 = this.k;
                        if (i40 != 0 && i40 != 10) {
                            if (i40 != 11) {
                                imageReceiver3.L0 = org.telegram.messenger.i0.L(i40 == 4 ? 8.0f : 6.0f);
                                if (this.e != 1.0f) {
                                    int i41 = s8VarArr8[i38].i;
                                    if (i41 == 1) {
                                        canvas2.save();
                                        float f25 = 1.0f - this.e;
                                        canvas2.scale(f25, f25, imageReceiver3.r(), imageReceiver3.s());
                                        f12 = 1.0f - this.e;
                                    } else if (i41 == 0) {
                                        canvas2.save();
                                        float f26 = this.e;
                                        canvas2.scale(f26, f26, imageReceiver3.r(), imageReceiver3.s());
                                        f12 = this.e;
                                    } else if (i41 == 2) {
                                        if (this.l) {
                                            i14 = org.telegram.messenger.z20.y(z13 ? 8.0f : 4.0f, this.p - (i28 * i23), 2);
                                        } else {
                                            i14 = L2;
                                        }
                                        int i42 = (i23 * i38) + i14;
                                        int i43 = (s8VarArr8[i38].j * i23) + c10;
                                        float f27 = this.e;
                                        imageReceiver3.K0 = (int) c3.i0.z(1.0f, f27, i43, i42 * f27);
                                    } else {
                                        if (i41 == -1 && this.l) {
                                            int y10 = org.telegram.messenger.z20.y(z13 ? 8.0f : 4.0f, this.p - (i28 * i23), 2) + (i23 * i38);
                                            float f28 = this.e;
                                            imageReceiver3.K0 = (int) c3.i0.z(1.0f, f28, c10 + r10, y10 * f28);
                                            z10 = false;
                                            f11 = 1.0f;
                                            float f29 = f11 * this.u;
                                            if (i38 == s8VarArr8.length - 1 || this.x) {
                                                i11 = this.k;
                                                paint2 = this.i;
                                                if (i11 != 1 || i11 == 3 || i11 == 5) {
                                                    s8VarArr4 = s8VarArr8;
                                                    i12 = i38;
                                                    imageReceiver = imageReceiver3;
                                                    paint3 = paint;
                                                    i13 = i39;
                                                    canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.i0.L(13.0f), paint2);
                                                    s8Var = s8VarArr4[i12];
                                                    if (s8Var.b == null) {
                                                        if (this.k == 5) {
                                                            s8Var.b = new org.telegram.ui.Cells.g4(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
                                                        } else {
                                                            s8Var.b = new org.telegram.ui.Cells.g4(org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(21.0f));
                                                        }
                                                    }
                                                    if (this.k == 5) {
                                                        s8VarArr4[i12].b.d(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.eh, false), (int) (f29 * 76.5f)));
                                                    }
                                                    s8Var2 = s8VarArr4[i12];
                                                    groupCallParticipant = s8Var2.f;
                                                    if (groupCallParticipant == null && groupCallParticipant.amplitude > 0.0f) {
                                                        s8Var2.b.e(view, true);
                                                        s8VarArr4[i12].b.c(r2.f.amplitude * 15.0f);
                                                        if (this.k == 5 && SystemClock.uptimeMillis() - s8VarArr4[i12].f.lastSpeakTime > 500) {
                                                            this.j.run();
                                                        }
                                                        s8VarArr4[i12].b.f();
                                                        if (this.k == 5) {
                                                            s8VarArr4[i12].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                                            d();
                                                        }
                                                        b10 = s8VarArr4[i12].b.b();
                                                        imageReceiver.setAlpha(f29);
                                                        if (b10 != 1.0f) {
                                                            canvas2.save();
                                                            canvas2.scale(b10, b10, imageReceiver.r(), imageReceiver.s());
                                                            imageReceiver.h(canvas2, null);
                                                            canvas2.restore();
                                                        } else {
                                                            imageReceiver.h(canvas2, null);
                                                        }
                                                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                        if (z10) {
                                                            canvas2.restore();
                                                        }
                                                        i39 = i13 + 1;
                                                        paint = paint3;
                                                        i38 = i12;
                                                    }
                                                    s8Var2.b.e(view, false);
                                                    if (this.k == 5) {
                                                        this.j.run();
                                                    }
                                                    s8VarArr4[i12].b.f();
                                                    if (this.k == 5) {
                                                    }
                                                    b10 = s8VarArr4[i12].b.b();
                                                    imageReceiver.setAlpha(f29);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                    if (z10) {
                                                    }
                                                    i39 = i13 + 1;
                                                    paint = paint3;
                                                    i38 = i12;
                                                } else if (i11 == 4 || i11 == 10) {
                                                    paint3 = paint;
                                                    i13 = i39;
                                                    canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), org.telegram.messenger.i0.L(17.0f), paint2);
                                                    s8 s8Var3 = s8VarArr8[i38];
                                                    if (s8Var3.b == null) {
                                                        s8Var3.b = new org.telegram.ui.Cells.g4(org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(21.0f));
                                                    }
                                                    if (this.k == 10) {
                                                        s8VarArr8[i38].b.d(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.eh, false), (int) (f29 * 76.5f)));
                                                    } else {
                                                        s8VarArr8[i38].b.d(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false), (int) (f29 * 76.5f)));
                                                    }
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    s8 s8Var4 = s8VarArr8[i38];
                                                    s8[] s8VarArr9 = s8VarArr8;
                                                    i12 = i38;
                                                    if (currentTimeMillis - s8Var4.c > 100) {
                                                        s8Var4.c = currentTimeMillis;
                                                        if (this.k == 10) {
                                                            TLRPC.GroupCallParticipant groupCallParticipant2 = s8Var4.f;
                                                            if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                                s8Var4.b.e(view, false);
                                                            } else {
                                                                s8Var4.b.e(view, true);
                                                                s8VarArr9[i12].b.c(r2.f.amplitude * 15.0f);
                                                            }
                                                        } else {
                                                            long currentTime = ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).getCurrentTime();
                                                            s8 s8Var5 = s8VarArr9[i12];
                                                            imageReceiver = imageReceiver3;
                                                            if (currentTime - s8Var5.d <= 5) {
                                                                s8Var5.b.e(view, true);
                                                                s8VarArr9[i12].b.c(this.z.nextInt() % 100);
                                                            } else {
                                                                s8Var5.b.e(view, false);
                                                                s8VarArr9[i12].b.c(0.0d);
                                                            }
                                                            s8VarArr9[i12].b.f();
                                                            s8VarArr9[i12].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                                            b10 = s8VarArr9[i12].b.b();
                                                            imageReceiver.setAlpha(f29);
                                                            if (b10 != 1.0f) {
                                                            }
                                                            this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                            if (z10) {
                                                            }
                                                            i39 = i13 + 1;
                                                            paint = paint3;
                                                            i38 = i12;
                                                        }
                                                    }
                                                    imageReceiver = imageReceiver3;
                                                    s8VarArr9[i12].b.f();
                                                    s8VarArr9[i12].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                                    b10 = s8VarArr9[i12].b.b();
                                                    imageReceiver.setAlpha(f29);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                    if (z10) {
                                                    }
                                                    i39 = i13 + 1;
                                                    paint = paint3;
                                                    i38 = i12;
                                                } else {
                                                    float b13 = (b() / 2.0f) + this.q;
                                                    if (z15) {
                                                        canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), b13, paint2);
                                                    } else {
                                                        int alpha = paint.getAlpha();
                                                        if (f29 != 1.0f) {
                                                            paint3 = paint;
                                                            paint3.setAlpha((int) (alpha * f29));
                                                        } else {
                                                            paint3 = paint;
                                                        }
                                                        i13 = i39;
                                                        canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), b13, paint3);
                                                        if (f29 != 1.0f) {
                                                            paint3.setAlpha(alpha);
                                                        }
                                                        i12 = i38;
                                                        imageReceiver = imageReceiver3;
                                                        b10 = 1.0f;
                                                        imageReceiver.setAlpha(f29);
                                                        if (b10 != 1.0f) {
                                                        }
                                                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                                        if (z10) {
                                                        }
                                                        i39 = i13 + 1;
                                                        paint = paint3;
                                                        i38 = i12;
                                                    }
                                                }
                                            }
                                            paint3 = paint;
                                            i13 = i39;
                                            i12 = i38;
                                            imageReceiver = imageReceiver3;
                                            b10 = 1.0f;
                                            imageReceiver.setAlpha(f29);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                            if (z10) {
                                            }
                                            i39 = i13 + 1;
                                            paint = paint3;
                                            i38 = i12;
                                        }
                                        z10 = false;
                                        f11 = 1.0f;
                                        float f292 = f11 * this.u;
                                        if (i38 == s8VarArr8.length - 1) {
                                        }
                                        i11 = this.k;
                                        paint2 = this.i;
                                        if (i11 != 1) {
                                        }
                                        s8VarArr4 = s8VarArr8;
                                        i12 = i38;
                                        imageReceiver = imageReceiver3;
                                        paint3 = paint;
                                        i13 = i39;
                                        canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.i0.L(13.0f), paint2);
                                        s8Var = s8VarArr4[i12];
                                        if (s8Var.b == null) {
                                        }
                                        if (this.k == 5) {
                                        }
                                        s8Var2 = s8VarArr4[i12];
                                        groupCallParticipant = s8Var2.f;
                                        if (groupCallParticipant == null) {
                                            s8Var2.b.e(view, true);
                                            s8VarArr4[i12].b.c(r2.f.amplitude * 15.0f);
                                            if (this.k == 5) {
                                            }
                                            s8VarArr4[i12].b.f();
                                            if (this.k == 5) {
                                            }
                                            b10 = s8VarArr4[i12].b.b();
                                            imageReceiver.setAlpha(f292);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                            if (z10) {
                                            }
                                            i39 = i13 + 1;
                                            paint = paint3;
                                            i38 = i12;
                                        }
                                        s8Var2.b.e(view, false);
                                        if (this.k == 5) {
                                        }
                                        s8VarArr4[i12].b.f();
                                        if (this.k == 5) {
                                        }
                                        b10 = s8VarArr4[i12].b.b();
                                        imageReceiver.setAlpha(f292);
                                        if (b10 != 1.0f) {
                                        }
                                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                        if (z10) {
                                        }
                                        i39 = i13 + 1;
                                        paint = paint3;
                                        i38 = i12;
                                    }
                                    f11 = f12;
                                    z10 = true;
                                    float f2922 = f11 * this.u;
                                    if (i38 == s8VarArr8.length - 1) {
                                    }
                                    i11 = this.k;
                                    paint2 = this.i;
                                    if (i11 != 1) {
                                    }
                                    s8VarArr4 = s8VarArr8;
                                    i12 = i38;
                                    imageReceiver = imageReceiver3;
                                    paint3 = paint;
                                    i13 = i39;
                                    canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.i0.L(13.0f), paint2);
                                    s8Var = s8VarArr4[i12];
                                    if (s8Var.b == null) {
                                    }
                                    if (this.k == 5) {
                                    }
                                    s8Var2 = s8VarArr4[i12];
                                    groupCallParticipant = s8Var2.f;
                                    if (groupCallParticipant == null) {
                                    }
                                    s8Var2.b.e(view, false);
                                    if (this.k == 5) {
                                    }
                                    s8VarArr4[i12].b.f();
                                    if (this.k == 5) {
                                    }
                                    b10 = s8VarArr4[i12].b.b();
                                    imageReceiver.setAlpha(f2922);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                    if (z10) {
                                    }
                                    i39 = i13 + 1;
                                    paint = paint3;
                                    i38 = i12;
                                }
                                z10 = false;
                                f11 = 1.0f;
                                float f29222 = f11 * this.u;
                                if (i38 == s8VarArr8.length - 1) {
                                }
                                i11 = this.k;
                                paint2 = this.i;
                                if (i11 != 1) {
                                }
                                s8VarArr4 = s8VarArr8;
                                i12 = i38;
                                imageReceiver = imageReceiver3;
                                paint3 = paint;
                                i13 = i39;
                                canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.i0.L(13.0f), paint2);
                                s8Var = s8VarArr4[i12];
                                if (s8Var.b == null) {
                                }
                                if (this.k == 5) {
                                }
                                s8Var2 = s8VarArr4[i12];
                                groupCallParticipant = s8Var2.f;
                                if (groupCallParticipant == null) {
                                }
                                s8Var2.b.e(view, false);
                                if (this.k == 5) {
                                }
                                s8VarArr4[i12].b.f();
                                if (this.k == 5) {
                                }
                                b10 = s8VarArr4[i12].b.b();
                                imageReceiver.setAlpha(f29222);
                                if (b10 != 1.0f) {
                                }
                                this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                                if (z10) {
                                }
                                i39 = i13 + 1;
                                paint = paint3;
                                i38 = i12;
                            }
                        }
                        imageReceiver3.L0 = (this.o - b11) / 2.0f;
                        if (this.e != 1.0f) {
                        }
                        z10 = false;
                        f11 = 1.0f;
                        float f292222 = f11 * this.u;
                        if (i38 == s8VarArr8.length - 1) {
                        }
                        i11 = this.k;
                        paint2 = this.i;
                        if (i11 != 1) {
                        }
                        s8VarArr4 = s8VarArr8;
                        i12 = i38;
                        imageReceiver = imageReceiver3;
                        paint3 = paint;
                        i13 = i39;
                        canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.i0.L(13.0f), paint2);
                        s8Var = s8VarArr4[i12];
                        if (s8Var.b == null) {
                        }
                        if (this.k == 5) {
                        }
                        s8Var2 = s8VarArr4[i12];
                        groupCallParticipant = s8Var2.f;
                        if (groupCallParticipant == null) {
                        }
                        s8Var2.b.e(view, false);
                        if (this.k == 5) {
                        }
                        s8VarArr4[i12].b.f();
                        if (this.k == 5) {
                        }
                        b10 = s8VarArr4[i12].b.b();
                        imageReceiver.setAlpha(f292222);
                        if (b10 != 1.0f) {
                        }
                        this.A = Math.max(this.A, ((imageReceiver.M0 / 2.0f) * b10) + imageReceiver.r());
                        if (z10) {
                        }
                        i39 = i13 + 1;
                        paint = paint3;
                        i38 = i12;
                    } else {
                        i12 = i38;
                        paint3 = paint;
                    }
                } else {
                    i12 = i38;
                    paint3 = paint;
                }
                i13 = i39;
                i39 = i13 + 1;
                paint = paint3;
                i38 = i12;
            }
            i38--;
        }
        if (z15) {
            canvas2.restore();
        }
    }

    public final void h(int i10) {
        r8 r8Var;
        r8 r8Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            s8 s8Var = this.b[i11];
            if (s8Var != null && (r8Var2 = s8Var.a) != null) {
                r8Var2.u(i10);
            }
            s8 s8Var2 = this.c[i11];
            if (s8Var2 != null && (r8Var = s8Var2.a) != null) {
                r8Var.u(i10);
            }
        }
    }

    public final void i(int i10) {
        this.n = i10;
        View view = this.r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i10, int i11, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        s8[] s8VarArr = this.c;
        s8 s8Var = s8VarArr[i10];
        s8Var.g = 0L;
        s8Var.f = null;
        if (tLObject == null) {
            s8Var.e.w0(null);
            d();
            return;
        }
        s8Var.d = -1L;
        s8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            s8Var.f = groupCallParticipant;
            long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
            if (org.telegram.messenger.o5.E(C1)) {
                user = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(C1));
                s8VarArr[i10].a.r(user);
                chat = null;
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-C1));
                s8VarArr[i10].a.q(L0);
                chat = L0;
                user = null;
            }
            if (this.k != 4) {
                s8VarArr[i10].d = groupCallParticipant.active_date;
            } else if (C1 == org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i11).a).e()) {
                s8VarArr[i10].d = 0L;
            } else if (this.m) {
                s8VarArr[i10].d = groupCallParticipant.lastActiveDate;
            } else {
                s8VarArr[i10].d = groupCallParticipant.active_date;
            }
            s8VarArr[i10].g = C1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                s8Var.a.g(1);
                s8VarArr[i10].a.p = 0.6f;
            } else {
                s8Var.a.g(0);
                r8 r8Var = s8VarArr[i10].a;
                r8Var.p = 1.0f;
                r8Var.r(user2);
            }
            s8VarArr[i10].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            s8Var.a.g(0);
            r8 r8Var2 = s8VarArr[i10].a;
            r8Var2.p = 1.0f;
            r8Var2.q(chat);
            s8VarArr[i10].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            s8VarArr[i10].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 50, true, null, false);
                s8VarArr[i10].e.r0(org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(storyItem.media.document.thumbs, 50, true, w9, true), storyItem.media.document), a1.g.i(b10, b10, "_"), org.telegram.messenger.ic.c(w9, storyItem.media.document), a1.g.i(b10, b10, "_"), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, 50, true, null, false);
                    s8VarArr[i10].e.r0(org.telegram.messenger.ic.i(org.telegram.messenger.b8.w(storyItem.media.photo.sizes, 50, true, w10, true), storyItem.media.photo), a1.g.i(b10, b10, "_"), org.telegram.messenger.ic.i(w10, storyItem.media.photo), a1.g.i(b10, b10, "_"), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            s8 s8Var2 = s8VarArr[i10];
            s8Var2.e.i0(chat, s8Var2.a, null);
        } else if (user.self && this.a) {
            s8 s8Var3 = s8VarArr[i10];
            s8Var3.e.w0(s8Var3.a);
        } else {
            s8 s8Var4 = s8VarArr[i10];
            s8Var4.e.i0(user, s8Var4.a, null);
        }
        s8VarArr[i10].e.J0(b10 / 2);
        ImageReceiver imageReceiver = s8VarArr[i10].e;
        float f7 = b10;
        imageReceiver.y0(0.0f, 0.0f, f7, f7);
        d();
    }

    public final void k() {
        for (int i10 = 0; i10 < 3; i10++) {
            s8[] s8VarArr = this.b;
            s8 s8Var = s8VarArr[i10];
            s8[] s8VarArr2 = this.c;
            s8VarArr[i10] = s8VarArr2[i10];
            s8VarArr2[i10] = s8Var;
        }
    }
}
