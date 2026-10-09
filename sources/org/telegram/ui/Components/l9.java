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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l9 {
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
    public ai.n9 y;
    public final Random z;
    public final k9[] b = new k9[3];
    public final k9[] c = new k9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = AndroidUtilities.dp(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public long v = 220;

    public l9(View view, boolean z10) {
        hs hsVar = hs.f;
        this.z = new Random();
        this.r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            k9[] k9VarArr = this.b;
            k9 k9Var = new k9();
            k9VarArr[i10] = k9Var;
            k9Var.e = new ImageReceiver(view);
            this.b[i10].e.setInvalidateAll(true);
            this.b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.b[i10].a = new j9((org.telegram.ui.ActionBar.e6) null);
            this.b[i10].a.u(AndroidUtilities.dp(12.0f));
            k9[] k9VarArr2 = this.c;
            k9 k9Var2 = new k9();
            k9VarArr2[i10] = k9Var2;
            k9Var2.e = new ImageReceiver(view);
            this.c[i10].e.setInvalidateAll(true);
            this.c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.c[i10].a = new j9((org.telegram.ui.ActionBar.e6) null);
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
        k9[] k9VarArr;
        k9[] k9VarArr2;
        int i10;
        if (!this.d || !z10) {
            this.e = 1.0f;
            n();
            return;
        }
        k9[] k9VarArr3 = new k9[3];
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            k9VarArr = this.b;
            k9VarArr2 = this.c;
            i10 = 1;
            if (i11 >= 3) {
                break;
            }
            k9VarArr3[i11] = k9VarArr[i11];
            k9 k9Var = k9VarArr[i11];
            long j3 = k9Var.g;
            k9 k9Var2 = k9VarArr2[i11];
            if (j3 != k9Var2.g) {
                z12 = true;
            } else {
                k9Var.d = k9Var2.d;
            }
            i11++;
        }
        if (!z12) {
            this.e = 1.0f;
            return;
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= 3) {
                    k9VarArr2[i12].i = 0;
                    break;
                }
                if (k9VarArr[i13].g == k9VarArr2[i12].g) {
                    k9VarArr3[i13] = null;
                    if (i12 == i13) {
                        k9 k9Var3 = k9VarArr2[i12];
                        k9Var3.i = -1;
                        org.telegram.ui.Cells.c4 c4Var = k9Var3.b;
                        k9 k9Var4 = k9VarArr[i12];
                        k9Var3.b = k9Var4.b;
                        k9Var4.b = c4Var;
                    } else {
                        k9 k9Var5 = k9VarArr2[i12];
                        k9Var5.i = 2;
                        k9Var5.j = i13;
                    }
                } else {
                    i13++;
                }
            }
        }
        for (int i14 = 0; i14 < 3; i14++) {
            k9 k9Var6 = k9VarArr3[i14];
            if (k9Var6 != null) {
                k9Var6.i = 1;
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
            ofFloat.addUpdateListener(new m6(this, 4));
            this.f.addListener(new t8(this, i10));
            this.f.setDuration(this.v);
            this.f.setInterpolator(hs.f);
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
                org.telegram.ui.ActionBar.i6.E0().a(0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x068e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas) {
        int dp;
        k9[] k9VarArr;
        k9[] k9VarArr2;
        Canvas canvas2;
        int i10;
        k9[] k9VarArr3;
        float f7;
        float f10;
        boolean z10;
        float f11;
        float f12;
        int i11;
        Paint paint;
        int i12;
        boolean z11;
        float f13;
        k9 k9Var;
        k9 k9Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float b10;
        int i13;
        float f14;
        int i14;
        float f15;
        boolean z12;
        float f16;
        int i15;
        boolean z13;
        int i16;
        float f17;
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
            k9VarArr = this.b;
            if (i22 >= 3) {
                break;
            }
            long j3 = k9VarArr[i22].g;
            i22++;
        }
        int i23 = this.k;
        int dp2 = (i23 == 0 || i23 == 10 || i23 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int e7 = this.l ? (this.p - ((int) e())) / 2 : dp2;
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i24 = this.k;
        Paint paint2 = this.h;
        if (i24 == 4) {
            paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.v7, false));
        } else if (i24 != 3) {
            paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, z16 ? org.telegram.ui.ActionBar.i6.z7 : org.telegram.ui.ActionBar.i6.y7, false));
        }
        int i25 = 0;
        int i26 = 0;
        while (true) {
            k9VarArr2 = this.c;
            if (i25 >= 3) {
                break;
            }
            k9[] k9VarArr4 = k9VarArr;
            if (k9VarArr2[i25].g != 0) {
                i26++;
            }
            i25++;
            k9VarArr = k9VarArr4;
        }
        k9[] k9VarArr5 = k9VarArr;
        int i27 = this.k;
        boolean z17 = i27 == 0 || i27 == 1 || i27 == 3 || i27 == 4 || i27 == 5 || i27 == 10 || i27 == 11;
        if (z17) {
            float dp3 = i27 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.x) {
                dp3 += AndroidUtilities.dp(20.0f);
            }
            float f18 = -dp3;
            float f19 = this.p + dp3;
            float f20 = this.o + dp3;
            k9VarArr3 = k9VarArr2;
            i10 = 2;
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f18, f18, f19, f20, 255, 31);
        } else {
            canvas2 = canvas;
            i10 = 2;
            k9VarArr3 = k9VarArr2;
            f7 = 0.0f;
        }
        this.A = f7;
        boolean z18 = this.x;
        View view = this.r;
        float f21 = 1.0f;
        if (z18) {
            int i28 = i10;
            while (i28 >= 0) {
                int i29 = 0;
                while (i29 < i10) {
                    if (i29 != 0 || this.e != f21) {
                        k9[] k9VarArr6 = i29 == 0 ? k9VarArr3 : k9VarArr5;
                        if (i29 != z14 || this.e == f21 || k9VarArr6[i28].i == z14) {
                            ImageReceiver imageReceiver = k9VarArr6[i28].e;
                            if (imageReceiver.hasImageSet()) {
                                if (i29 == 0) {
                                    if (this.l) {
                                        f15 = f21;
                                        i17 = org.telegram.messenger.bi.A(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), i10);
                                    } else {
                                        f15 = f21;
                                        i17 = dp2;
                                    }
                                    imageReceiver.setImageX((i21 * i28) + i17);
                                } else {
                                    f15 = f21;
                                    imageReceiver.setImageX((i21 * i28) + e7);
                                }
                                int i30 = this.k;
                                if (i30 == 0 || i30 == i19 || i30 == 11) {
                                    imageReceiver.setImageY((this.o - d) / 2.0f);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i30 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.e != f15) {
                                    int i31 = k9VarArr6[i28].i;
                                    if (i31 == z14) {
                                        canvas2.save();
                                        float f22 = f15 - this.e;
                                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f17 = f15 - this.e;
                                    } else if (i31 == 0) {
                                        canvas2.save();
                                        float f23 = this.e;
                                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f17 = this.e;
                                    } else if (i31 == i10) {
                                        if (this.l) {
                                            i16 = org.telegram.messenger.bi.A(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), i10);
                                        } else {
                                            i16 = dp2;
                                        }
                                        int i32 = (i21 * i28) + i16;
                                        int i33 = (k9VarArr6[i28].j * i21) + e7;
                                        float f24 = this.e;
                                        imageReceiver.setImageX((int) com.google.android.gms.internal.vision.e2.y(f15, f24, i33, i32 * f24));
                                    } else if (i31 == -1 && this.l) {
                                        int A = org.telegram.messenger.bi.A(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), i10) + (i21 * i28);
                                        float f25 = this.e;
                                        imageReceiver.setImageX((int) com.google.android.gms.internal.vision.e2.y(1.0f, f25, e7 + r5, A * f25));
                                    }
                                    f16 = f17;
                                    z12 = z14;
                                    float f26 = f16 * this.u;
                                    float d10 = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                    if (this.y != null) {
                                        ai.n9 n9Var = new ai.n9();
                                        int i34 = org.telegram.ui.ActionBar.i6.Tg;
                                        n9Var.n = i34;
                                        i15 = i28;
                                        int i35 = org.telegram.ui.ActionBar.i6.Vg;
                                        n9Var.o = i35;
                                        n9Var.a = z14;
                                        z13 = z12;
                                        n9Var.d(org.telegram.ui.ActionBar.i6.x0(null, i34, false), org.telegram.ui.ActionBar.i6.x0(null, i35, false), 0, 0);
                                        this.y = n9Var;
                                    } else {
                                        i15 = i28;
                                        z13 = z12;
                                    }
                                    this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                    this.y.c.setAlpha((int) (f26 * 255.0f));
                                    canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), d10, this.y.c);
                                    if (!z13) {
                                        canvas2.restore();
                                    }
                                    i29++;
                                    i28 = i15;
                                    f21 = 1.0f;
                                    z14 = true;
                                    i19 = 10;
                                    i10 = 2;
                                }
                                z12 = false;
                                f16 = 1.0f;
                                float f262 = f16 * this.u;
                                float d102 = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                if (this.y != null) {
                                }
                                this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                this.y.c.setAlpha((int) (f262 * 255.0f));
                                canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), d102, this.y.c);
                                if (!z13) {
                                }
                                i29++;
                                i28 = i15;
                                f21 = 1.0f;
                                z14 = true;
                                i19 = 10;
                                i10 = 2;
                            }
                        }
                    }
                    i15 = i28;
                    i29++;
                    i28 = i15;
                    f21 = 1.0f;
                    z14 = true;
                    i19 = 10;
                    i10 = 2;
                }
                i28--;
                f21 = 1.0f;
                z14 = true;
                i19 = 10;
                i10 = 2;
            }
        }
        for (int i36 = 2; i36 >= 0; i36--) {
            int i37 = 0;
            while (i37 < 2) {
                if (i37 == 0) {
                    f10 = 1.0f;
                    if (this.e == 1.0f) {
                        i12 = i37;
                        i37 = i12 + 1;
                    }
                } else {
                    f10 = 1.0f;
                }
                k9[] k9VarArr7 = i37 == 0 ? k9VarArr3 : k9VarArr5;
                if (i37 != 1 || this.e == f10 || k9VarArr7[i36].i == 1) {
                    ImageReceiver imageReceiver2 = k9VarArr7[i36].e;
                    if (imageReceiver2.hasImageSet()) {
                        if (i37 == 0) {
                            if (this.l) {
                                i14 = org.telegram.messenger.bi.A(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), 2);
                            } else {
                                i14 = dp2;
                            }
                            imageReceiver2.setImageX((i21 * i36) + i14);
                        } else {
                            imageReceiver2.setImageX((i21 * i36) + e7);
                        }
                        int i38 = this.k;
                        if (i38 != 0 && i38 != 10) {
                            if (i38 != 11) {
                                imageReceiver2.setImageY(AndroidUtilities.dp(i38 == 4 ? 8.0f : 6.0f));
                                if (this.e != 1.0f) {
                                    int i39 = k9VarArr7[i36].i;
                                    if (i39 == 1) {
                                        canvas2.save();
                                        float f27 = 1.0f - this.e;
                                        canvas2.scale(f27, f27, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f14 = 1.0f - this.e;
                                    } else if (i39 == 0) {
                                        canvas2.save();
                                        float f28 = this.e;
                                        canvas2.scale(f28, f28, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f14 = this.e;
                                    } else if (i39 == 2) {
                                        if (this.l) {
                                            i13 = org.telegram.messenger.bi.A(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), 2);
                                        } else {
                                            i13 = dp2;
                                        }
                                        int i40 = (i21 * i36) + i13;
                                        int i41 = (k9VarArr7[i36].j * i21) + e7;
                                        float f29 = this.e;
                                        imageReceiver2.setImageX((int) com.google.android.gms.internal.vision.e2.y(1.0f, f29, i41, i40 * f29));
                                    } else if (i39 == -1 && this.l) {
                                        int A2 = org.telegram.messenger.bi.A(z15 ? 8.0f : 4.0f, this.p - (i26 * i21), 2) + (i21 * i36);
                                        float f30 = this.e;
                                        imageReceiver2.setImageX((int) com.google.android.gms.internal.vision.e2.y(1.0f, f30, e7 + r10, A2 * f30));
                                    }
                                    f11 = f14;
                                    z10 = true;
                                    f12 = f11 * this.u;
                                    if (i36 == k9VarArr7.length - 1 || this.x) {
                                        i11 = this.k;
                                        paint = this.i;
                                        if (i11 != 1 || i11 == 3 || i11 == 5) {
                                            i12 = i37;
                                            z11 = z10;
                                            f13 = f12;
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                            k9Var = k9VarArr7[i36];
                                            if (k9Var.b == null) {
                                                if (this.k == 5) {
                                                    k9Var.b = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                                } else {
                                                    k9Var.b = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                }
                                            }
                                            if (this.k == 5) {
                                                k9VarArr7[i36].b.d(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.qg, false), (int) (f13 * 76.5f)));
                                            }
                                            k9Var2 = k9VarArr7[i36];
                                            groupCallParticipant = k9Var2.f;
                                            if (groupCallParticipant == null && groupCallParticipant.amplitude > 0.0f) {
                                                k9Var2.b.e(view, true);
                                                k9VarArr7[i36].b.c(r4.f.amplitude * 15.0f);
                                                if (this.k == 5 && SystemClock.uptimeMillis() - k9VarArr7[i36].f.lastSpeakTime > 500) {
                                                    this.j.run();
                                                }
                                                k9VarArr7[i36].b.f();
                                                if (this.k == 5) {
                                                    k9VarArr7[i36].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                                    f();
                                                }
                                                b10 = k9VarArr7[i36].b.b();
                                                imageReceiver2.setAlpha(f13);
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
                                            k9Var2.b.e(view, false);
                                            if (this.k == 5) {
                                                this.j.run();
                                            }
                                            k9VarArr7[i36].b.f();
                                            if (this.k == 5) {
                                            }
                                            b10 = k9VarArr7[i36].b.b();
                                            imageReceiver2.setAlpha(f13);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                            if (z11) {
                                            }
                                            i37 = i12 + 1;
                                        } else if (i11 == 4 || i11 == 10) {
                                            i12 = i37;
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), paint);
                                            k9 k9Var3 = k9VarArr7[i36];
                                            if (k9Var3.b == null) {
                                                k9Var3.b = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                            }
                                            if (this.k == 10) {
                                                k9VarArr7[i36].b.d(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.qg, false), (int) (f12 * 76.5f)));
                                            } else {
                                                k9VarArr7[i36].b.d(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.pg, false), (int) (f12 * 76.5f)));
                                            }
                                            long currentTimeMillis = System.currentTimeMillis();
                                            k9 k9Var4 = k9VarArr7[i36];
                                            z11 = z10;
                                            if (currentTimeMillis - k9Var4.c > 100) {
                                                k9Var4.c = currentTimeMillis;
                                                if (this.k == 10) {
                                                    TLRPC.GroupCallParticipant groupCallParticipant2 = k9Var4.f;
                                                    if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                        k9Var4.b.e(view, false);
                                                    } else {
                                                        k9Var4.b.e(view, true);
                                                        k9VarArr7[i36].b.c(r4.f.amplitude * 15.0f);
                                                    }
                                                } else {
                                                    long currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                                                    k9 k9Var5 = k9VarArr7[i36];
                                                    f13 = f12;
                                                    if (currentTime - k9Var5.d <= 5) {
                                                        k9Var5.b.e(view, true);
                                                        k9VarArr7[i36].b.c(this.z.nextInt() % 100);
                                                    } else {
                                                        k9Var5.b.e(view, false);
                                                        k9VarArr7[i36].b.c(0.0d);
                                                    }
                                                    k9VarArr7[i36].b.f();
                                                    k9VarArr7[i36].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                                    b10 = k9VarArr7[i36].b.b();
                                                    imageReceiver2.setAlpha(f13);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                                    if (z11) {
                                                    }
                                                    i37 = i12 + 1;
                                                }
                                            }
                                            f13 = f12;
                                            k9VarArr7[i36].b.f();
                                            k9VarArr7[i36].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                            b10 = k9VarArr7[i36].b.b();
                                            imageReceiver2.setAlpha(f13);
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
                                                if (f12 != 1.0f) {
                                                    paint2.setAlpha((int) (alpha * f12));
                                                }
                                                i12 = i37;
                                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), d11, paint2);
                                                if (f12 != 1.0f) {
                                                    paint2.setAlpha(alpha);
                                                }
                                                z11 = z10;
                                                f13 = f12;
                                                b10 = 1.0f;
                                                imageReceiver2.setAlpha(f13);
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
                                    f13 = f12;
                                    b10 = 1.0f;
                                    imageReceiver2.setAlpha(f13);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                    if (z11) {
                                    }
                                    i37 = i12 + 1;
                                }
                                z10 = false;
                                f11 = 1.0f;
                                f12 = f11 * this.u;
                                if (i36 == k9VarArr7.length - 1) {
                                }
                                i11 = this.k;
                                paint = this.i;
                                if (i11 != 1) {
                                }
                                i12 = i37;
                                z11 = z10;
                                f13 = f12;
                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                k9Var = k9VarArr7[i36];
                                if (k9Var.b == null) {
                                }
                                if (this.k == 5) {
                                }
                                k9Var2 = k9VarArr7[i36];
                                groupCallParticipant = k9Var2.f;
                                if (groupCallParticipant == null) {
                                    k9Var2.b.e(view, true);
                                    k9VarArr7[i36].b.c(r4.f.amplitude * 15.0f);
                                    if (this.k == 5) {
                                    }
                                    k9VarArr7[i36].b.f();
                                    if (this.k == 5) {
                                    }
                                    b10 = k9VarArr7[i36].b.b();
                                    imageReceiver2.setAlpha(f13);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                    if (z11) {
                                    }
                                    i37 = i12 + 1;
                                }
                                k9Var2.b.e(view, false);
                                if (this.k == 5) {
                                }
                                k9VarArr7[i36].b.f();
                                if (this.k == 5) {
                                }
                                b10 = k9VarArr7[i36].b.b();
                                imageReceiver2.setAlpha(f13);
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
                        f11 = 1.0f;
                        f12 = f11 * this.u;
                        if (i36 == k9VarArr7.length - 1) {
                        }
                        i11 = this.k;
                        paint = this.i;
                        if (i11 != 1) {
                        }
                        i12 = i37;
                        z11 = z10;
                        f13 = f12;
                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                        k9Var = k9VarArr7[i36];
                        if (k9Var.b == null) {
                        }
                        if (this.k == 5) {
                        }
                        k9Var2 = k9VarArr7[i36];
                        groupCallParticipant = k9Var2.f;
                        if (groupCallParticipant == null) {
                        }
                        k9Var2.b.e(view, false);
                        if (this.k == 5) {
                        }
                        k9VarArr7[i36].b.f();
                        if (this.k == 5) {
                        }
                        b10 = k9VarArr7[i36].b.b();
                        imageReceiver2.setAlpha(f13);
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
        j9 j9Var;
        j9 j9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            k9 k9Var = this.b[i11];
            if (k9Var != null && (j9Var2 = k9Var.a) != null) {
                j9Var2.u(i10);
            }
            k9 k9Var2 = this.c[i11];
            if (k9Var2 != null && (j9Var = k9Var2.a) != null) {
                j9Var.u(i10);
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
        k9[] k9VarArr = this.c;
        k9 k9Var = k9VarArr[i10];
        k9Var.g = 0L;
        k9Var.f = null;
        if (tLObject == null) {
            k9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        k9Var.d = -1L;
        k9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            k9Var.f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                k9VarArr[i10].a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                k9VarArr[i10].a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.k != 4) {
                k9VarArr[i10].d = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                k9VarArr[i10].d = 0L;
            } else if (this.m) {
                k9VarArr[i10].d = groupCallParticipant.lastActiveDate;
            } else {
                k9VarArr[i10].d = groupCallParticipant.active_date;
            }
            k9VarArr[i10].g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                k9Var.a.g(1);
                k9VarArr[i10].a.p = 0.6f;
            } else {
                k9Var.a.g(0);
                j9 j9Var = k9VarArr[i10].a;
                j9Var.p = 1.0f;
                j9Var.m(i11, user2);
            }
            k9VarArr[i10].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            k9Var.a.g(0);
            j9 j9Var2 = k9VarArr[i10].a;
            j9Var2.p = 1.0f;
            j9Var2.k(i11, chat);
            k9VarArr[i10].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            k9VarArr[i10].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                k9VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a1.g.l(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a1.g.l(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    k9VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a1.g.l(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a1.g.l(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            k9 k9Var2 = k9VarArr[i10];
            k9Var2.e.setForUserOrChat(chat, k9Var2.a);
        } else if (user.self && this.a) {
            k9 k9Var3 = k9VarArr[i10];
            k9Var3.e.setImageBitmap(k9Var3.a);
        } else {
            k9 k9Var4 = k9VarArr[i10];
            k9Var4.e.setForUserOrChat(user, k9Var4.a);
        }
        k9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        k9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            k9[] k9VarArr = this.b;
            k9 k9Var = k9VarArr[i10];
            k9[] k9VarArr2 = this.c;
            k9VarArr[i10] = k9VarArr2[i10];
            k9VarArr2[i10] = k9Var;
        }
    }
}
