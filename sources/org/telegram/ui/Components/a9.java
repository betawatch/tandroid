package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a9 {
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
    public jh.t6 y;
    public final Random z;
    public final z8[] b = new z8[3];
    public final z8[] c = new z8[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = AndroidUtilities.dp(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public long v = 220;

    public a9(View view, boolean z10) {
        er erVar = er.f;
        this.z = new Random();
        this.r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            z8[] z8VarArr = this.b;
            z8 z8Var = new z8();
            z8VarArr[i10] = z8Var;
            z8Var.e = new ImageReceiver(view);
            this.b[i10].e.setInvalidateAll(true);
            this.b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.b[i10].a = new y8((org.telegram.ui.ActionBar.c6) null);
            this.b[i10].a.u(AndroidUtilities.dp(12.0f));
            z8[] z8VarArr2 = this.c;
            z8 z8Var2 = new z8();
            z8VarArr2[i10] = z8Var2;
            z8Var2.e = new ImageReceiver(view);
            this.c[i10].e.setInvalidateAll(true);
            this.c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.c[i10].a = new y8((org.telegram.ui.ActionBar.c6) null);
            this.c[i10].a.u(AndroidUtilities.dp(12.0f));
        }
        this.m = z10;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        z8[] z8VarArr;
        z8[] z8VarArr2;
        if (!this.d || !z10) {
            this.e = 1.0f;
            n();
            return;
        }
        z8[] z8VarArr3 = new z8[3];
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            z8VarArr = this.b;
            z8VarArr2 = this.c;
            if (i10 >= 3) {
                break;
            }
            z8VarArr3[i10] = z8VarArr[i10];
            z8 z8Var = z8VarArr[i10];
            long j10 = z8Var.g;
            z8 z8Var2 = z8VarArr2[i10];
            if (j10 != z8Var2.g) {
                z12 = true;
            } else {
                z8Var.d = z8Var2.d;
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
                    z8VarArr2[i11].i = 0;
                    break;
                }
                if (z8VarArr[i12].g == z8VarArr2[i11].g) {
                    z8VarArr3[i12] = null;
                    if (i11 == i12) {
                        z8 z8Var3 = z8VarArr2[i11];
                        z8Var3.i = -1;
                        org.telegram.ui.Cells.z3 z3Var = z8Var3.b;
                        z8 z8Var4 = z8VarArr[i11];
                        z8Var3.b = z8Var4.b;
                        z8Var4.b = z3Var;
                    } else {
                        z8 z8Var5 = z8VarArr2[i11];
                        z8Var5.i = 2;
                        z8Var5.j = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            z8 z8Var6 = z8VarArr3[i13];
            if (z8Var6 != null) {
                z8Var6.i = 1;
            }
        }
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f.cancel();
            if (this.w) {
                n();
                this.w = false;
            }
        }
        this.e = 0.0f;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 4));
            this.f.addListener(new org.telegram.ui.am(this, 9));
            this.f.setDuration(this.v);
            this.f.setInterpolator(er.f);
            this.f.start();
        } else {
            this.w = true;
        }
        f();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        int i10 = this.s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.k;
        return AndroidUtilities.dp((i11 == 4 || i11 == 10) ? 32.0f : 24.0f);
    }

    public final float e() {
        int dp;
        int i10 = this.k;
        boolean z10 = i10 == 4 || i10 == 10;
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i11 = this.s;
            dp = i11 != 0 ? (int) (i11 * this.t) : AndroidUtilities.dp(z10 ? 24.0f : 20.0f);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.b[i13].g != 0) {
                i12++;
            }
        }
        return (Math.max(0, i12 - 1) * dp) + (i12 > 0 ? d() : 0);
    }

    public final void f() {
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (this.B) {
            return;
        }
        this.B = true;
        for (int i10 = 0; i10 < 3; i10++) {
            this.b[i10].e.onAttachedToWindow();
            this.c[i10].e.onAttachedToWindow();
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.b[i10].e.onDetachedFromWindow();
                this.c[i10].e.onDetachedFromWindow();
            }
            if (this.k == 3) {
                org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x069a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0616 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas) {
        int dp;
        z8[] z8VarArr;
        z8[] z8VarArr2;
        Canvas canvas2;
        z8[] z8VarArr3;
        int i10;
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        int i11;
        Paint paint;
        int i12;
        boolean z11;
        float f14;
        z8 z8Var;
        z8 z8Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float b10;
        int i13;
        float f15;
        int i14;
        float f16;
        boolean z12;
        float f17;
        int i15;
        boolean z13;
        int i16;
        float f18;
        int i17;
        boolean z14 = true;
        this.d = true;
        int i18 = this.k;
        int i19 = 10;
        boolean z15 = i18 == 4 || i18 == 10;
        int d = d();
        if (this.k == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i20 = this.s;
            dp = i20 != 0 ? (int) (i20 * this.t) : AndroidUtilities.dp(z15 ? 24.0f : 20.0f);
        }
        int i21 = dp;
        int i22 = 0;
        while (true) {
            z8VarArr = this.b;
            if (i22 >= 3) {
                break;
            }
            long j10 = z8VarArr[i22].g;
            i22++;
        }
        int i23 = this.k;
        int dp2 = (i23 == 0 || i23 == 10 || i23 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int e9 = this.l ? (this.p - ((int) e())) / 2 : dp2;
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i24 = this.k;
        Paint paint2 = this.h;
        if (i24 == 4) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.v7, false));
        } else if (i24 != 3) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, z16 ? org.telegram.ui.ActionBar.g6.z7 : org.telegram.ui.ActionBar.g6.y7, false));
        }
        int i25 = 0;
        int i26 = 0;
        while (true) {
            z8VarArr2 = this.c;
            if (i25 >= 3) {
                break;
            }
            z8[] z8VarArr4 = z8VarArr;
            if (z8VarArr2[i25].g != 0) {
                i26++;
            }
            i25++;
            z8VarArr = z8VarArr4;
        }
        z8[] z8VarArr5 = z8VarArr;
        int i27 = this.k;
        boolean z17 = i27 == 0 || i27 == 1 || i27 == 3 || i27 == 4 || i27 == 5 || i27 == 10 || i27 == 11;
        if (z17) {
            float dp3 = i27 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.x) {
                dp3 += AndroidUtilities.dp(20.0f);
            }
            float f19 = -dp3;
            float f20 = this.p + dp3;
            float f21 = this.o + dp3;
            z8VarArr3 = z8VarArr2;
            i10 = 2;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f19, f19, f20, f21, 255, 31);
        } else {
            canvas2 = canvas;
            z8VarArr3 = z8VarArr2;
            i10 = 2;
            f10 = 0.0f;
        }
        this.A = f10;
        boolean z18 = this.x;
        View view = this.r;
        float f22 = 1.0f;
        if (z18) {
            int i28 = 2;
            while (i28 >= 0) {
                int i29 = 0;
                while (i29 < i10) {
                    if (i29 != 0 || this.e != f22) {
                        z8[] z8VarArr6 = i29 == 0 ? z8VarArr3 : z8VarArr5;
                        if (i29 != z14 || this.e == f22 || z8VarArr6[i28].i == z14) {
                            ImageReceiver imageReceiver = z8VarArr6[i28].e;
                            if (imageReceiver.hasImageSet()) {
                                if (i29 == 0) {
                                    if (this.l) {
                                        f16 = 1.0f;
                                        i17 = org.telegram.messenger.rl.x(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), i10);
                                    } else {
                                        f16 = 1.0f;
                                        i17 = dp2;
                                    }
                                    imageReceiver.setImageX((i21 * i28) + i17);
                                } else {
                                    f16 = 1.0f;
                                    imageReceiver.setImageX((i21 * i28) + e9);
                                }
                                int i30 = this.k;
                                if (i30 == 0 || i30 == i19 || i30 == 11) {
                                    imageReceiver.setImageY((this.o - d) / 2.0f);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i30 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.e != f16) {
                                    int i31 = z8VarArr6[i28].i;
                                    if (i31 == z14) {
                                        canvas2.save();
                                        float f23 = f16 - this.e;
                                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f18 = f16 - this.e;
                                    } else if (i31 == 0) {
                                        canvas2.save();
                                        float f24 = this.e;
                                        canvas2.scale(f24, f24, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f18 = this.e;
                                    } else if (i31 == i10) {
                                        if (this.l) {
                                            i16 = org.telegram.messenger.rl.x(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), i10);
                                        } else {
                                            i16 = dp2;
                                        }
                                        int i32 = (i21 * i28) + i16;
                                        int i33 = (z8VarArr6[i28].j * i21) + e9;
                                        float f25 = this.e;
                                        imageReceiver.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f25, i33, i32 * f25));
                                    } else if (i31 == -1 && this.l) {
                                        int x8 = org.telegram.messenger.rl.x(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), i10) + (i21 * i28);
                                        float f26 = this.e;
                                        imageReceiver.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f26, e9 + r5, x8 * f26));
                                    }
                                    f17 = f18;
                                    z12 = true;
                                    float f27 = f17 * this.u;
                                    float d10 = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                    if (this.y != null) {
                                        jh.t6 t6Var = new jh.t6();
                                        int i34 = org.telegram.ui.ActionBar.g6.Tg;
                                        t6Var.n = i34;
                                        i15 = i28;
                                        int i35 = org.telegram.ui.ActionBar.g6.Vg;
                                        t6Var.o = i35;
                                        t6Var.a = z14;
                                        z13 = z12;
                                        t6Var.d(org.telegram.ui.ActionBar.g6.w0(null, i34, false), org.telegram.ui.ActionBar.g6.w0(null, i35, false), 0, 0);
                                        this.y = t6Var;
                                    } else {
                                        i15 = i28;
                                        z13 = z12;
                                    }
                                    this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                    this.y.c.setAlpha((int) (f27 * 255.0f));
                                    canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), d10, this.y.c);
                                    if (!z13) {
                                        canvas2.restore();
                                    }
                                    i29++;
                                    i28 = i15;
                                    f22 = 1.0f;
                                    z14 = true;
                                    i19 = 10;
                                    i10 = 2;
                                }
                                z12 = false;
                                f17 = 1.0f;
                                float f272 = f17 * this.u;
                                float d102 = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                if (this.y != null) {
                                }
                                this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                this.y.c.setAlpha((int) (f272 * 255.0f));
                                canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), d102, this.y.c);
                                if (!z13) {
                                }
                                i29++;
                                i28 = i15;
                                f22 = 1.0f;
                                z14 = true;
                                i19 = 10;
                                i10 = 2;
                            }
                        }
                    }
                    i15 = i28;
                    i29++;
                    i28 = i15;
                    f22 = 1.0f;
                    z14 = true;
                    i19 = 10;
                    i10 = 2;
                }
                i28--;
                f22 = 1.0f;
                z14 = true;
                i19 = 10;
                i10 = 2;
            }
        }
        for (int i36 = 2; i36 >= 0; i36--) {
            int i37 = 0;
            while (i37 < 2) {
                if (i37 == 0) {
                    f11 = 1.0f;
                    if (this.e == 1.0f) {
                        i12 = i37;
                        i37 = i12 + 1;
                    }
                } else {
                    f11 = 1.0f;
                }
                z8[] z8VarArr7 = i37 == 0 ? z8VarArr3 : z8VarArr5;
                if (i37 != 1 || this.e == f11 || z8VarArr7[i36].i == 1) {
                    ImageReceiver imageReceiver2 = z8VarArr7[i36].e;
                    if (imageReceiver2.hasImageSet()) {
                        if (i37 == 0) {
                            if (this.l) {
                                i14 = org.telegram.messenger.rl.x(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), 2);
                            } else {
                                i14 = dp2;
                            }
                            imageReceiver2.setImageX((i21 * i36) + i14);
                        } else {
                            imageReceiver2.setImageX((i21 * i36) + e9);
                        }
                        int i38 = this.k;
                        if (i38 != 0 && i38 != 10) {
                            if (i38 != 11) {
                                imageReceiver2.setImageY(AndroidUtilities.dp(i38 == 4 ? 8.0f : 6.0f));
                                if (this.e != 1.0f) {
                                    int i39 = z8VarArr7[i36].i;
                                    if (i39 == 1) {
                                        canvas2.save();
                                        float f28 = 1.0f - this.e;
                                        canvas2.scale(f28, f28, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f15 = 1.0f - this.e;
                                    } else if (i39 == 0) {
                                        canvas2.save();
                                        float f29 = this.e;
                                        canvas2.scale(f29, f29, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f15 = this.e;
                                    } else if (i39 == 2) {
                                        if (this.l) {
                                            i13 = org.telegram.messenger.rl.x(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), 2);
                                        } else {
                                            i13 = dp2;
                                        }
                                        int i40 = (i21 * i36) + i13;
                                        int i41 = (z8VarArr7[i36].j * i21) + e9;
                                        float f30 = this.e;
                                        imageReceiver2.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f30, i41, i40 * f30));
                                    } else if (i39 == -1 && this.l) {
                                        int x10 = org.telegram.messenger.rl.x(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), 2) + (i21 * i36);
                                        float f31 = this.e;
                                        imageReceiver2.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f31, e9 + r10, x10 * f31));
                                    }
                                    f12 = f15;
                                    z10 = true;
                                    f13 = f12 * this.u;
                                    if (i36 == z8VarArr7.length - 1 || this.x) {
                                        i11 = this.k;
                                        paint = this.i;
                                        if (i11 != 1 || i11 == 3 || i11 == 5) {
                                            i12 = i37;
                                            z11 = z10;
                                            f14 = f13;
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                            z8Var = z8VarArr7[i36];
                                            if (z8Var.b == null) {
                                                if (this.k == 5) {
                                                    z8Var.b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                                } else {
                                                    z8Var.b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                }
                                            }
                                            if (this.k == 5) {
                                                z8VarArr7[i36].b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), (int) (f14 * 76.5f)));
                                            }
                                            z8Var2 = z8VarArr7[i36];
                                            groupCallParticipant = z8Var2.f;
                                            if (groupCallParticipant == null && groupCallParticipant.amplitude > 0.0f) {
                                                z8Var2.b.e(view, true);
                                                z8VarArr7[i36].b.c(r4.f.amplitude * 15.0f);
                                                if (this.k == 5 && SystemClock.uptimeMillis() - z8VarArr7[i36].f.lastSpeakTime > 500) {
                                                    this.j.run();
                                                }
                                                z8VarArr7[i36].b.f();
                                                if (this.k == 5) {
                                                    z8VarArr7[i36].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                                    f();
                                                }
                                                b10 = z8VarArr7[i36].b.b();
                                                imageReceiver2.setAlpha(f14);
                                                if (b10 != 1.0f) {
                                                    canvas2.save();
                                                    canvas2.scale(b10, b10, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                                    imageReceiver2.draw(canvas2);
                                                    canvas2.restore();
                                                } else {
                                                    imageReceiver2.draw(canvas2);
                                                }
                                                this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                                if (z11) {
                                                    canvas2.restore();
                                                }
                                                i37 = i12 + 1;
                                            }
                                            z8Var2.b.e(view, false);
                                            if (this.k == 5) {
                                                this.j.run();
                                            }
                                            z8VarArr7[i36].b.f();
                                            if (this.k == 5) {
                                            }
                                            b10 = z8VarArr7[i36].b.b();
                                            imageReceiver2.setAlpha(f14);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                            if (z11) {
                                            }
                                            i37 = i12 + 1;
                                        } else if (i11 == 4 || i11 == 10) {
                                            i12 = i37;
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), paint);
                                            z8 z8Var3 = z8VarArr7[i36];
                                            if (z8Var3.b == null) {
                                                z8Var3.b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                            }
                                            if (this.k == 10) {
                                                z8VarArr7[i36].b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false), (int) (f13 * 76.5f)));
                                            } else {
                                                z8VarArr7[i36].b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false), (int) (f13 * 76.5f)));
                                            }
                                            long currentTimeMillis = System.currentTimeMillis();
                                            z8 z8Var4 = z8VarArr7[i36];
                                            z11 = z10;
                                            if (currentTimeMillis - z8Var4.c > 100) {
                                                z8Var4.c = currentTimeMillis;
                                                if (this.k == 10) {
                                                    TLRPC.GroupCallParticipant groupCallParticipant2 = z8Var4.f;
                                                    if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                        z8Var4.b.e(view, false);
                                                    } else {
                                                        z8Var4.b.e(view, true);
                                                        z8VarArr7[i36].b.c(r4.f.amplitude * 15.0f);
                                                    }
                                                } else {
                                                    long currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                                                    z8 z8Var5 = z8VarArr7[i36];
                                                    f14 = f13;
                                                    if (currentTime - z8Var5.d <= 5) {
                                                        z8Var5.b.e(view, true);
                                                        z8VarArr7[i36].b.c(this.z.nextInt() % 100);
                                                    } else {
                                                        z8Var5.b.e(view, false);
                                                        z8VarArr7[i36].b.c(0.0d);
                                                    }
                                                    z8VarArr7[i36].b.f();
                                                    z8VarArr7[i36].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                                    b10 = z8VarArr7[i36].b.b();
                                                    imageReceiver2.setAlpha(f14);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                                    if (z11) {
                                                    }
                                                    i37 = i12 + 1;
                                                }
                                            }
                                            f14 = f13;
                                            z8VarArr7[i36].b.f();
                                            z8VarArr7[i36].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                            b10 = z8VarArr7[i36].b.b();
                                            imageReceiver2.setAlpha(f14);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                            if (z11) {
                                            }
                                            i37 = i12 + 1;
                                        } else {
                                            float d11 = (d() / 2.0f) + this.q;
                                            if (z17) {
                                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), d11, paint);
                                            } else {
                                                int alpha = paint2.getAlpha();
                                                if (f13 != 1.0f) {
                                                    paint2.setAlpha((int) (alpha * f13));
                                                }
                                                i12 = i37;
                                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), d11, paint2);
                                                if (f13 != 1.0f) {
                                                    paint2.setAlpha(alpha);
                                                }
                                                z11 = z10;
                                                f14 = f13;
                                                b10 = 1.0f;
                                                imageReceiver2.setAlpha(f14);
                                                if (b10 != 1.0f) {
                                                }
                                                this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                                if (z11) {
                                                }
                                                i37 = i12 + 1;
                                            }
                                        }
                                    }
                                    i12 = i37;
                                    z11 = z10;
                                    f14 = f13;
                                    b10 = 1.0f;
                                    imageReceiver2.setAlpha(f14);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                    if (z11) {
                                    }
                                    i37 = i12 + 1;
                                }
                                z10 = false;
                                f12 = 1.0f;
                                f13 = f12 * this.u;
                                if (i36 == z8VarArr7.length - 1) {
                                }
                                i11 = this.k;
                                paint = this.i;
                                if (i11 != 1) {
                                }
                                i12 = i37;
                                z11 = z10;
                                f14 = f13;
                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                z8Var = z8VarArr7[i36];
                                if (z8Var.b == null) {
                                }
                                if (this.k == 5) {
                                }
                                z8Var2 = z8VarArr7[i36];
                                groupCallParticipant = z8Var2.f;
                                if (groupCallParticipant == null) {
                                    z8Var2.b.e(view, true);
                                    z8VarArr7[i36].b.c(r4.f.amplitude * 15.0f);
                                    if (this.k == 5) {
                                    }
                                    z8VarArr7[i36].b.f();
                                    if (this.k == 5) {
                                    }
                                    b10 = z8VarArr7[i36].b.b();
                                    imageReceiver2.setAlpha(f14);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                    if (z11) {
                                    }
                                    i37 = i12 + 1;
                                }
                                z8Var2.b.e(view, false);
                                if (this.k == 5) {
                                }
                                z8VarArr7[i36].b.f();
                                if (this.k == 5) {
                                }
                                b10 = z8VarArr7[i36].b.b();
                                imageReceiver2.setAlpha(f14);
                                if (b10 != 1.0f) {
                                }
                                this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                if (z11) {
                                }
                                i37 = i12 + 1;
                            }
                        }
                        imageReceiver2.setImageY((this.o - d) / 2.0f);
                        if (this.e != 1.0f) {
                        }
                        z10 = false;
                        f12 = 1.0f;
                        f13 = f12 * this.u;
                        if (i36 == z8VarArr7.length - 1) {
                        }
                        i11 = this.k;
                        paint = this.i;
                        if (i11 != 1) {
                        }
                        i12 = i37;
                        z11 = z10;
                        f14 = f13;
                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                        z8Var = z8VarArr7[i36];
                        if (z8Var.b == null) {
                        }
                        if (this.k == 5) {
                        }
                        z8Var2 = z8VarArr7[i36];
                        groupCallParticipant = z8Var2.f;
                        if (groupCallParticipant == null) {
                        }
                        z8Var2.b.e(view, false);
                        if (this.k == 5) {
                        }
                        z8VarArr7[i36].b.f();
                        if (this.k == 5) {
                        }
                        b10 = z8VarArr7[i36].b.b();
                        imageReceiver2.setAlpha(f14);
                        if (b10 != 1.0f) {
                        }
                        this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                        if (z11) {
                        }
                        i37 = i12 + 1;
                    }
                }
                i12 = i37;
                i37 = i12 + 1;
            }
        }
        if (z17) {
            canvas2.restore();
        }
    }

    public final void j(int i10) {
        y8 y8Var;
        y8 y8Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            z8 z8Var = this.b[i11];
            if (z8Var != null && (y8Var2 = z8Var.a) != null) {
                y8Var2.u(i10);
            }
            z8 z8Var2 = this.c[i11];
            if (z8Var2 != null && (y8Var = z8Var2.a) != null) {
                y8Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.n = i10;
        View view = this.r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        z8[] z8VarArr = this.c;
        z8 z8Var = z8VarArr[i10];
        z8Var.g = 0L;
        z8Var.f = null;
        if (tLObject == null) {
            z8Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        z8Var.d = -1L;
        z8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            z8Var.f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                z8VarArr[i10].a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                z8VarArr[i10].a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.k != 4) {
                z8VarArr[i10].d = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                z8VarArr[i10].d = 0L;
            } else if (this.m) {
                z8VarArr[i10].d = groupCallParticipant.lastActiveDate;
            } else {
                z8VarArr[i10].d = groupCallParticipant.active_date;
            }
            z8VarArr[i10].g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                z8Var.a.g(1);
                z8VarArr[i10].a.p = 0.6f;
            } else {
                z8Var.a.g(0);
                y8 y8Var = z8VarArr[i10].a;
                y8Var.p = 1.0f;
                y8Var.m(i11, user2);
            }
            z8VarArr[i10].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            z8Var.a.g(0);
            y8 y8Var2 = z8VarArr[i10].a;
            y8Var2.p = 1.0f;
            y8Var2.k(i11, chat);
            z8VarArr[i10].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            z8VarArr[i10].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                z8VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), com.google.android.recaptcha.internal.a.l(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), com.google.android.recaptcha.internal.a.l(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    z8VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.l(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), com.google.android.recaptcha.internal.a.l(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            z8 z8Var2 = z8VarArr[i10];
            z8Var2.e.setForUserOrChat(chat, z8Var2.a);
        } else if (user.self && this.a) {
            z8 z8Var3 = z8VarArr[i10];
            z8Var3.e.setImageBitmap(z8Var3.a);
        } else {
            z8 z8Var4 = z8VarArr[i10];
            z8Var4.e.setForUserOrChat(user, z8Var4.a);
        }
        z8VarArr[i10].e.setRoundRadius(d / 2);
        float f10 = d;
        z8VarArr[i10].e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i10) {
        this.s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            z8[] z8VarArr = this.b;
            z8 z8Var = z8VarArr[i10];
            z8[] z8VarArr2 = this.c;
            z8VarArr[i10] = z8VarArr2[i10];
            z8VarArr2[i10] = z8Var;
        }
    }
}
