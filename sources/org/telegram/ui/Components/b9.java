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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b9 {
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
    public ih.w6 y;
    public final Random z;
    public final a9[] b = new a9[3];
    public final a9[] c = new a9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = AndroidUtilities.dp(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public long v = 220;

    public b9(View view, boolean z10) {
        gr grVar = gr.f;
        this.z = new Random();
        this.r = view;
        for (int i9 = 0; i9 < 3; i9++) {
            a9[] a9VarArr = this.b;
            a9 a9Var = new a9();
            a9VarArr[i9] = a9Var;
            a9Var.e = new ImageReceiver(view);
            this.b[i9].e.setInvalidateAll(true);
            this.b[i9].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.b[i9].a = new z8((org.telegram.ui.ActionBar.b6) null);
            this.b[i9].a.u(AndroidUtilities.dp(12.0f));
            a9[] a9VarArr2 = this.c;
            a9 a9Var2 = new a9();
            a9VarArr2[i9] = a9Var2;
            a9Var2.e = new ImageReceiver(view);
            this.c[i9].e.setInvalidateAll(true);
            this.c[i9].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.c[i9].a = new z8((org.telegram.ui.ActionBar.b6) null);
            this.c[i9].a.u(AndroidUtilities.dp(12.0f));
        }
        this.m = z10;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        a9[] a9VarArr;
        a9[] a9VarArr2;
        if (!this.d || !z10) {
            this.e = 1.0f;
            n();
            return;
        }
        a9[] a9VarArr3 = new a9[3];
        int i9 = 0;
        boolean z12 = false;
        while (true) {
            a9VarArr = this.b;
            a9VarArr2 = this.c;
            if (i9 >= 3) {
                break;
            }
            a9VarArr3[i9] = a9VarArr[i9];
            a9 a9Var = a9VarArr[i9];
            long j10 = a9Var.g;
            a9 a9Var2 = a9VarArr2[i9];
            if (j10 != a9Var2.g) {
                z12 = true;
            } else {
                a9Var.d = a9Var2.d;
            }
            i9++;
        }
        if (!z12) {
            this.e = 1.0f;
            return;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 3) {
                    a9VarArr2[i10].i = 0;
                    break;
                }
                if (a9VarArr[i11].g == a9VarArr2[i10].g) {
                    a9VarArr3[i11] = null;
                    if (i10 == i11) {
                        a9 a9Var3 = a9VarArr2[i10];
                        a9Var3.i = -1;
                        org.telegram.ui.Cells.c4 c4Var = a9Var3.b;
                        a9 a9Var4 = a9VarArr[i10];
                        a9Var3.b = a9Var4.b;
                        a9Var4.b = c4Var;
                    } else {
                        a9 a9Var5 = a9VarArr2[i10];
                        a9Var5.i = 2;
                        a9Var5.j = i11;
                    }
                } else {
                    i11++;
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            a9 a9Var6 = a9VarArr3[i12];
            if (a9Var6 != null) {
                a9Var6.i = 1;
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
            this.f.addListener(new org.telegram.ui.xp(this, 7));
            this.f.setDuration(this.v);
            this.f.setInterpolator(gr.f);
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
        int i9 = this.s;
        if (i9 != 0) {
            return i9;
        }
        int i10 = this.k;
        return AndroidUtilities.dp((i10 == 4 || i10 == 10) ? 32.0f : 24.0f);
    }

    public final float e() {
        int dp;
        int i9 = this.k;
        boolean z10 = i9 == 4 || i9 == 10;
        if (i9 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i10 = this.s;
            dp = i10 != 0 ? (int) (i10 * this.t) : AndroidUtilities.dp(z10 ? 24.0f : 20.0f);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (this.b[i12].g != 0) {
                i11++;
            }
        }
        return (Math.max(0, i11 - 1) * dp) + (i11 > 0 ? d() : 0);
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
        for (int i9 = 0; i9 < 3; i9++) {
            this.b[i9].e.onAttachedToWindow();
            this.c[i9].e.onAttachedToWindow();
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i9 = 0; i9 < 3; i9++) {
                this.b[i9].e.onDetachedFromWindow();
                this.c[i9].e.onDetachedFromWindow();
            }
            if (this.k == 3) {
                org.telegram.ui.ActionBar.f6.D0().a(0.0f);
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
        a9[] a9VarArr;
        a9[] a9VarArr2;
        Canvas canvas2;
        a9[] a9VarArr3;
        int i9;
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        int i10;
        Paint paint;
        int i11;
        boolean z11;
        float f14;
        a9 a9Var;
        a9 a9Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float b10;
        int i12;
        float f15;
        int i13;
        float f16;
        boolean z12;
        float f17;
        int i14;
        boolean z13;
        int i15;
        float f18;
        int i16;
        boolean z14 = true;
        this.d = true;
        int i17 = this.k;
        int i18 = 10;
        boolean z15 = i17 == 4 || i17 == 10;
        int d = d();
        if (this.k == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i19 = this.s;
            dp = i19 != 0 ? (int) (i19 * this.t) : AndroidUtilities.dp(z15 ? 24.0f : 20.0f);
        }
        int i20 = dp;
        int i21 = 0;
        while (true) {
            a9VarArr = this.b;
            if (i21 >= 3) {
                break;
            }
            long j10 = a9VarArr[i21].g;
            i21++;
        }
        int i22 = this.k;
        int dp2 = (i22 == 0 || i22 == 10 || i22 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int e10 = this.l ? (this.p - ((int) e())) / 2 : dp2;
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i23 = this.k;
        Paint paint2 = this.h;
        if (i23 == 4) {
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.v7, false));
        } else if (i23 != 3) {
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, z16 ? org.telegram.ui.ActionBar.f6.z7 : org.telegram.ui.ActionBar.f6.y7, false));
        }
        int i24 = 0;
        int i25 = 0;
        while (true) {
            a9VarArr2 = this.c;
            if (i24 >= 3) {
                break;
            }
            a9[] a9VarArr4 = a9VarArr;
            if (a9VarArr2[i24].g != 0) {
                i25++;
            }
            i24++;
            a9VarArr = a9VarArr4;
        }
        a9[] a9VarArr5 = a9VarArr;
        int i26 = this.k;
        boolean z17 = i26 == 0 || i26 == 1 || i26 == 3 || i26 == 4 || i26 == 5 || i26 == 10 || i26 == 11;
        if (z17) {
            float dp3 = i26 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.x) {
                dp3 += AndroidUtilities.dp(20.0f);
            }
            float f19 = -dp3;
            float f20 = this.p + dp3;
            float f21 = this.o + dp3;
            a9VarArr3 = a9VarArr2;
            i9 = 2;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f19, f19, f20, f21, 255, 31);
        } else {
            canvas2 = canvas;
            a9VarArr3 = a9VarArr2;
            i9 = 2;
            f10 = 0.0f;
        }
        this.A = f10;
        boolean z18 = this.x;
        View view = this.r;
        float f22 = 1.0f;
        if (z18) {
            int i27 = 2;
            while (i27 >= 0) {
                int i28 = 0;
                while (i28 < i9) {
                    if (i28 != 0 || this.e != f22) {
                        a9[] a9VarArr6 = i28 == 0 ? a9VarArr3 : a9VarArr5;
                        if (i28 != z14 || this.e == f22 || a9VarArr6[i27].i == z14) {
                            ImageReceiver imageReceiver = a9VarArr6[i27].e;
                            if (imageReceiver.hasImageSet()) {
                                if (i28 == 0) {
                                    if (this.l) {
                                        f16 = 1.0f;
                                        i16 = org.telegram.messenger.ll.y(z15 ? 8.0f : 4.0f, this.p - (i25 * i20), i9);
                                    } else {
                                        f16 = 1.0f;
                                        i16 = dp2;
                                    }
                                    imageReceiver.setImageX((i20 * i27) + i16);
                                } else {
                                    f16 = 1.0f;
                                    imageReceiver.setImageX((i20 * i27) + e10);
                                }
                                int i29 = this.k;
                                if (i29 == 0 || i29 == i18 || i29 == 11) {
                                    imageReceiver.setImageY((this.o - d) / 2.0f);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i29 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.e != f16) {
                                    int i30 = a9VarArr6[i27].i;
                                    if (i30 == z14) {
                                        canvas2.save();
                                        float f23 = f16 - this.e;
                                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f18 = f16 - this.e;
                                    } else if (i30 == 0) {
                                        canvas2.save();
                                        float f24 = this.e;
                                        canvas2.scale(f24, f24, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f18 = this.e;
                                    } else if (i30 == i9) {
                                        if (this.l) {
                                            i15 = org.telegram.messenger.ll.y(z15 ? 8.0f : 4.0f, this.p - (i25 * i20), i9);
                                        } else {
                                            i15 = dp2;
                                        }
                                        int i31 = (i20 * i27) + i15;
                                        int i32 = (a9VarArr6[i27].j * i20) + e10;
                                        float f25 = this.e;
                                        imageReceiver.setImageX((int) e2.c.z(1.0f, f25, i32, i31 * f25));
                                    } else if (i30 == -1 && this.l) {
                                        int y10 = org.telegram.messenger.ll.y(z15 ? 8.0f : 4.0f, this.p - (i25 * i20), i9) + (i20 * i27);
                                        float f26 = this.e;
                                        imageReceiver.setImageX((int) e2.c.z(1.0f, f26, e10 + r5, y10 * f26));
                                    }
                                    f17 = f18;
                                    z12 = true;
                                    float f27 = f17 * this.u;
                                    float d9 = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                    if (this.y != null) {
                                        ih.w6 w6Var = new ih.w6();
                                        int i33 = org.telegram.ui.ActionBar.f6.Tg;
                                        w6Var.n = i33;
                                        i14 = i27;
                                        int i34 = org.telegram.ui.ActionBar.f6.Vg;
                                        w6Var.o = i34;
                                        w6Var.a = z14;
                                        z13 = z12;
                                        w6Var.d(org.telegram.ui.ActionBar.f6.w0(null, i33, false), org.telegram.ui.ActionBar.f6.w0(null, i34, false), 0, 0);
                                        this.y = w6Var;
                                    } else {
                                        i14 = i27;
                                        z13 = z12;
                                    }
                                    this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                    this.y.c.setAlpha((int) (f27 * 255.0f));
                                    canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), d9, this.y.c);
                                    if (!z13) {
                                        canvas2.restore();
                                    }
                                    i28++;
                                    i27 = i14;
                                    f22 = 1.0f;
                                    z14 = true;
                                    i18 = 10;
                                    i9 = 2;
                                }
                                z12 = false;
                                f17 = 1.0f;
                                float f272 = f17 * this.u;
                                float d92 = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                if (this.y != null) {
                                }
                                this.y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                this.y.c.setAlpha((int) (f272 * 255.0f));
                                canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), d92, this.y.c);
                                if (!z13) {
                                }
                                i28++;
                                i27 = i14;
                                f22 = 1.0f;
                                z14 = true;
                                i18 = 10;
                                i9 = 2;
                            }
                        }
                    }
                    i14 = i27;
                    i28++;
                    i27 = i14;
                    f22 = 1.0f;
                    z14 = true;
                    i18 = 10;
                    i9 = 2;
                }
                i27--;
                f22 = 1.0f;
                z14 = true;
                i18 = 10;
                i9 = 2;
            }
        }
        for (int i35 = 2; i35 >= 0; i35--) {
            int i36 = 0;
            while (i36 < 2) {
                if (i36 == 0) {
                    f11 = 1.0f;
                    if (this.e == 1.0f) {
                        i11 = i36;
                        i36 = i11 + 1;
                    }
                } else {
                    f11 = 1.0f;
                }
                a9[] a9VarArr7 = i36 == 0 ? a9VarArr3 : a9VarArr5;
                if (i36 != 1 || this.e == f11 || a9VarArr7[i35].i == 1) {
                    ImageReceiver imageReceiver2 = a9VarArr7[i35].e;
                    if (imageReceiver2.hasImageSet()) {
                        if (i36 == 0) {
                            if (this.l) {
                                i13 = org.telegram.messenger.ll.y(z15 ? 8.0f : 4.0f, this.p - (i25 * i20), 2);
                            } else {
                                i13 = dp2;
                            }
                            imageReceiver2.setImageX((i20 * i35) + i13);
                        } else {
                            imageReceiver2.setImageX((i20 * i35) + e10);
                        }
                        int i37 = this.k;
                        if (i37 != 0 && i37 != 10) {
                            if (i37 != 11) {
                                imageReceiver2.setImageY(AndroidUtilities.dp(i37 == 4 ? 8.0f : 6.0f));
                                if (this.e != 1.0f) {
                                    int i38 = a9VarArr7[i35].i;
                                    if (i38 == 1) {
                                        canvas2.save();
                                        float f28 = 1.0f - this.e;
                                        canvas2.scale(f28, f28, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f15 = 1.0f - this.e;
                                    } else if (i38 == 0) {
                                        canvas2.save();
                                        float f29 = this.e;
                                        canvas2.scale(f29, f29, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                        f15 = this.e;
                                    } else if (i38 == 2) {
                                        if (this.l) {
                                            i12 = org.telegram.messenger.ll.y(z15 ? 8.0f : 4.0f, this.p - (i25 * i20), 2);
                                        } else {
                                            i12 = dp2;
                                        }
                                        int i39 = (i20 * i35) + i12;
                                        int i40 = (a9VarArr7[i35].j * i20) + e10;
                                        float f30 = this.e;
                                        imageReceiver2.setImageX((int) e2.c.z(1.0f, f30, i40, i39 * f30));
                                    } else if (i38 == -1 && this.l) {
                                        int y11 = org.telegram.messenger.ll.y(z15 ? 8.0f : 4.0f, this.p - (i25 * i20), 2) + (i20 * i35);
                                        float f31 = this.e;
                                        imageReceiver2.setImageX((int) e2.c.z(1.0f, f31, e10 + r10, y11 * f31));
                                    }
                                    f12 = f15;
                                    z10 = true;
                                    f13 = f12 * this.u;
                                    if (i35 == a9VarArr7.length - 1 || this.x) {
                                        i10 = this.k;
                                        paint = this.i;
                                        if (i10 != 1 || i10 == 3 || i10 == 5) {
                                            i11 = i36;
                                            z11 = z10;
                                            f14 = f13;
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                            a9Var = a9VarArr7[i35];
                                            if (a9Var.b == null) {
                                                if (this.k == 5) {
                                                    a9Var.b = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                                } else {
                                                    a9Var.b = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                }
                                            }
                                            if (this.k == 5) {
                                                a9VarArr7[i35].b.d(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false), (int) (f14 * 76.5f)));
                                            }
                                            a9Var2 = a9VarArr7[i35];
                                            groupCallParticipant = a9Var2.f;
                                            if (groupCallParticipant == null && groupCallParticipant.amplitude > 0.0f) {
                                                a9Var2.b.e(view, true);
                                                a9VarArr7[i35].b.c(r4.f.amplitude * 15.0f);
                                                if (this.k == 5 && SystemClock.uptimeMillis() - a9VarArr7[i35].f.lastSpeakTime > 500) {
                                                    this.j.run();
                                                }
                                                a9VarArr7[i35].b.f();
                                                if (this.k == 5) {
                                                    a9VarArr7[i35].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                                    f();
                                                }
                                                b10 = a9VarArr7[i35].b.b();
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
                                                i36 = i11 + 1;
                                            }
                                            a9Var2.b.e(view, false);
                                            if (this.k == 5) {
                                                this.j.run();
                                            }
                                            a9VarArr7[i35].b.f();
                                            if (this.k == 5) {
                                            }
                                            b10 = a9VarArr7[i35].b.b();
                                            imageReceiver2.setAlpha(f14);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                            if (z11) {
                                            }
                                            i36 = i11 + 1;
                                        } else if (i10 == 4 || i10 == 10) {
                                            i11 = i36;
                                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), paint);
                                            a9 a9Var3 = a9VarArr7[i35];
                                            if (a9Var3.b == null) {
                                                a9Var3.b = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                            }
                                            if (this.k == 10) {
                                                a9VarArr7[i35].b.d(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false), (int) (f13 * 76.5f)));
                                            } else {
                                                a9VarArr7[i35].b.d(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false), (int) (f13 * 76.5f)));
                                            }
                                            long currentTimeMillis = System.currentTimeMillis();
                                            a9 a9Var4 = a9VarArr7[i35];
                                            z11 = z10;
                                            if (currentTimeMillis - a9Var4.c > 100) {
                                                a9Var4.c = currentTimeMillis;
                                                if (this.k == 10) {
                                                    TLRPC.GroupCallParticipant groupCallParticipant2 = a9Var4.f;
                                                    if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                        a9Var4.b.e(view, false);
                                                    } else {
                                                        a9Var4.b.e(view, true);
                                                        a9VarArr7[i35].b.c(r4.f.amplitude * 15.0f);
                                                    }
                                                } else {
                                                    long currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                                                    a9 a9Var5 = a9VarArr7[i35];
                                                    f14 = f13;
                                                    if (currentTime - a9Var5.d <= 5) {
                                                        a9Var5.b.e(view, true);
                                                        a9VarArr7[i35].b.c(this.z.nextInt() % 100);
                                                    } else {
                                                        a9Var5.b.e(view, false);
                                                        a9VarArr7[i35].b.c(0.0d);
                                                    }
                                                    a9VarArr7[i35].b.f();
                                                    a9VarArr7[i35].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                                    b10 = a9VarArr7[i35].b.b();
                                                    imageReceiver2.setAlpha(f14);
                                                    if (b10 != 1.0f) {
                                                    }
                                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                                    if (z11) {
                                                    }
                                                    i36 = i11 + 1;
                                                }
                                            }
                                            f14 = f13;
                                            a9VarArr7[i35].b.f();
                                            a9VarArr7[i35].b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                            b10 = a9VarArr7[i35].b.b();
                                            imageReceiver2.setAlpha(f14);
                                            if (b10 != 1.0f) {
                                            }
                                            this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                            if (z11) {
                                            }
                                            i36 = i11 + 1;
                                        } else {
                                            float d10 = (d() / 2.0f) + this.q;
                                            if (z17) {
                                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), d10, paint);
                                            } else {
                                                int alpha = paint2.getAlpha();
                                                if (f13 != 1.0f) {
                                                    paint2.setAlpha((int) (alpha * f13));
                                                }
                                                i11 = i36;
                                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), d10, paint2);
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
                                                i36 = i11 + 1;
                                            }
                                        }
                                    }
                                    i11 = i36;
                                    z11 = z10;
                                    f14 = f13;
                                    b10 = 1.0f;
                                    imageReceiver2.setAlpha(f14);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                    if (z11) {
                                    }
                                    i36 = i11 + 1;
                                }
                                z10 = false;
                                f12 = 1.0f;
                                f13 = f12 * this.u;
                                if (i35 == a9VarArr7.length - 1) {
                                }
                                i10 = this.k;
                                paint = this.i;
                                if (i10 != 1) {
                                }
                                i11 = i36;
                                z11 = z10;
                                f14 = f13;
                                canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                a9Var = a9VarArr7[i35];
                                if (a9Var.b == null) {
                                }
                                if (this.k == 5) {
                                }
                                a9Var2 = a9VarArr7[i35];
                                groupCallParticipant = a9Var2.f;
                                if (groupCallParticipant == null) {
                                    a9Var2.b.e(view, true);
                                    a9VarArr7[i35].b.c(r4.f.amplitude * 15.0f);
                                    if (this.k == 5) {
                                    }
                                    a9VarArr7[i35].b.f();
                                    if (this.k == 5) {
                                    }
                                    b10 = a9VarArr7[i35].b.b();
                                    imageReceiver2.setAlpha(f14);
                                    if (b10 != 1.0f) {
                                    }
                                    this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                    if (z11) {
                                    }
                                    i36 = i11 + 1;
                                }
                                a9Var2.b.e(view, false);
                                if (this.k == 5) {
                                }
                                a9VarArr7[i35].b.f();
                                if (this.k == 5) {
                                }
                                b10 = a9VarArr7[i35].b.b();
                                imageReceiver2.setAlpha(f14);
                                if (b10 != 1.0f) {
                                }
                                this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                                if (z11) {
                                }
                                i36 = i11 + 1;
                            }
                        }
                        imageReceiver2.setImageY((this.o - d) / 2.0f);
                        if (this.e != 1.0f) {
                        }
                        z10 = false;
                        f12 = 1.0f;
                        f13 = f12 * this.u;
                        if (i35 == a9VarArr7.length - 1) {
                        }
                        i10 = this.k;
                        paint = this.i;
                        if (i10 != 1) {
                        }
                        i11 = i36;
                        z11 = z10;
                        f14 = f13;
                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                        a9Var = a9VarArr7[i35];
                        if (a9Var.b == null) {
                        }
                        if (this.k == 5) {
                        }
                        a9Var2 = a9VarArr7[i35];
                        groupCallParticipant = a9Var2.f;
                        if (groupCallParticipant == null) {
                        }
                        a9Var2.b.e(view, false);
                        if (this.k == 5) {
                        }
                        a9VarArr7[i35].b.f();
                        if (this.k == 5) {
                        }
                        b10 = a9VarArr7[i35].b.b();
                        imageReceiver2.setAlpha(f14);
                        if (b10 != 1.0f) {
                        }
                        this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * b10) + imageReceiver2.getCenterX());
                        if (z11) {
                        }
                        i36 = i11 + 1;
                    }
                }
                i11 = i36;
                i36 = i11 + 1;
            }
        }
        if (z17) {
            canvas2.restore();
        }
    }

    public final void j(int i9) {
        z8 z8Var;
        z8 z8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            a9 a9Var = this.b[i10];
            if (a9Var != null && (z8Var2 = a9Var.a) != null) {
                z8Var2.u(i9);
            }
            a9 a9Var2 = this.c[i10];
            if (a9Var2 != null && (z8Var = a9Var2.a) != null) {
                z8Var.u(i9);
            }
        }
    }

    public final void k(int i9) {
        this.n = i9;
        View view = this.r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i9, TLObject tLObject, int i10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        a9[] a9VarArr = this.c;
        a9 a9Var = a9VarArr[i9];
        a9Var.g = 0L;
        a9Var.f = null;
        if (tLObject == null) {
            a9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        a9Var.d = -1L;
        a9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            a9Var.f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                a9VarArr[i9].a.m(i10, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                a9VarArr[i9].a.k(i10, chat2);
                chat = chat2;
                user = null;
            }
            if (this.k != 4) {
                a9VarArr[i9].d = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i10).getUserConfig().getClientUserId()) {
                a9VarArr[i9].d = 0L;
            } else if (this.m) {
                a9VarArr[i9].d = groupCallParticipant.lastActiveDate;
            } else {
                a9VarArr[i9].d = groupCallParticipant.active_date;
            }
            a9VarArr[i9].g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                a9Var.a.g(1);
                a9VarArr[i9].a.p = 0.6f;
            } else {
                a9Var.a.g(0);
                z8 z8Var = a9VarArr[i9].a;
                z8Var.p = 1.0f;
                z8Var.m(i10, user2);
            }
            a9VarArr[i9].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            a9Var.a.g(0);
            z8 z8Var2 = a9VarArr[i9].a;
            z8Var2.p = 1.0f;
            z8Var2.k(i10, chat);
            a9VarArr[i9].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            a9VarArr[i9].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                a9VarArr[i9].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), e2.c.l(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), e2.c.l(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    a9VarArr[i9].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), e2.c.l(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), e2.c.l(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            a9 a9Var2 = a9VarArr[i9];
            a9Var2.e.setForUserOrChat(chat, a9Var2.a);
        } else if (user.self && this.a) {
            a9 a9Var3 = a9VarArr[i9];
            a9Var3.e.setImageBitmap(a9Var3.a);
        } else {
            a9 a9Var4 = a9VarArr[i9];
            a9Var4.e.setForUserOrChat(user, a9Var4.a);
        }
        a9VarArr[i9].e.setRoundRadius(d / 2);
        float f10 = d;
        a9VarArr[i9].e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i9) {
        this.s = i9;
    }

    public final void n() {
        for (int i9 = 0; i9 < 3; i9++) {
            a9[] a9VarArr = this.b;
            a9 a9Var = a9VarArr[i9];
            a9[] a9VarArr2 = this.c;
            a9VarArr[i9] = a9VarArr2[i9];
            a9VarArr2[i9] = a9Var;
        }
    }
}
