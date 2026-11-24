// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gd0 {
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
    public i4b y;
    public final Random z;
    public final fd0[] b = new fd0[3];
    public final fd0[] c = new fd0[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = gm.L(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public short v = 220;

    public gd0(View view, boolean z) {
        d53 d53Var = d53.f;
        this.z = new Random();
        this.r = view;
        for (int i = 0; i < 3; i++) {
            fd0[] fd0VarArr = this.b;
            fd0 fd0Var = new fd0();
            fd0VarArr[i] = fd0Var;
            fd0Var.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.b[i].e;
            imageReceiver.K0 = true;
            imageReceiver.q0(gm.L(12.0f));
            this.b[i].a = new pc0((ylb) null);
            this.b[i].a.s(gm.L(12.0f));
            fd0[] fd0VarArr2 = this.c;
            fd0 fd0Var2 = new fd0();
            fd0VarArr2[i] = fd0Var2;
            fd0Var2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.c[i].e;
            imageReceiver2.K0 = true;
            imageReceiver2.q0(gm.L(12.0f));
            this.c[i].a = new pc0((ylb) null);
            this.c[i].a.s(gm.L(12.0f));
        }
        this.m = z;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z, boolean z2) {
        fd0[] fd0VarArr;
        fd0[] fd0VarArr2;
        if (!this.d || !z) {
            this.e = 1.0f;
            k();
            return;
        }
        fd0[] fd0VarArr3 = new fd0[3];
        int i = 0;
        boolean z3 = false;
        while (true) {
            fd0VarArr = this.b;
            fd0VarArr2 = this.c;
            if (i >= 3) {
                break;
            }
            fd0VarArr3[i] = fd0VarArr[i];
            fd0 fd0Var = fd0VarArr[i];
            long j = fd0Var.g;
            fd0 fd0Var2 = fd0VarArr2[i];
            if (j != fd0Var2.g) {
                z3 = true;
            } else {
                fd0Var.d = fd0Var2.d;
            }
            i++;
        }
        if (!z3) {
            this.e = 1.0f;
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    fd0VarArr2[i2].i = 0;
                    break;
                }
                if (fd0VarArr[i3].g == fd0VarArr2[i2].g) {
                    fd0VarArr3[i3] = null;
                    if (i2 == i3) {
                        fd0 fd0Var3 = fd0VarArr2[i2];
                        fd0Var3.i = -1;
                        vb5 vb5Var = fd0Var3.b;
                        fd0 fd0Var4 = fd0VarArr[i2];
                        fd0Var3.b = fd0Var4.b;
                        fd0Var4.b = vb5Var;
                    } else {
                        fd0 fd0Var5 = fd0VarArr2[i2];
                        fd0Var5.i = 2;
                        fd0Var5.j = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            fd0 fd0Var6 = fd0VarArr3[i4];
            if (fd0Var6 != null) {
                fd0Var6.i = 1;
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
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new f0(this, (byte) 13));
            this.f.addListener(new g0(this, (byte) 20));
            this.f.setDuration(this.v);
            this.f.setInterpolator(d53.f);
            this.f.start();
        } else {
            this.w = true;
        }
        d();
    }

    public final int b() {
        int i = this.s;
        if (i != 0) {
            return i;
        }
        int i2 = this.k;
        return gm.L((i2 == 4 || i2 == 10) ? 32.0f : 24.0f);
    }

    public final float c() {
        int L;
        int i = this.k;
        boolean z = i == 4 || i == 10;
        if (i == 11) {
            L = gm.L(12.0f);
        } else {
            int i2 = this.s;
            L = i2 != 0 ? (int) (i2 * this.t) : gm.L(z ? 24.0f : 20.0f);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (this.b[i4].g != 0) {
                i3++;
            }
        }
        return (Math.max(0, i3 - 1) * L) + (i3 > 0 ? b() : 0);
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
        for (int i = 0; i < 3; i++) {
            this.b[i].e.I();
            this.c[i].e.I();
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i = 0; i < 3; i++) {
                this.b[i].e.K();
                this.c[i].e.K();
            }
            if (this.k == 3) {
                cmb.E0().a(0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0660 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas) {
        int L;
        fd0[] fd0VarArr;
        fd0[] fd0VarArr2;
        Canvas canvas2;
        int i;
        fd0[] fd0VarArr3;
        Paint paint;
        float f;
        float f2;
        fd0[] fd0VarArr4;
        int i2;
        Paint paint2;
        int i3;
        boolean z;
        float f3;
        int i4;
        Paint paint3;
        ImageReceiver imageReceiver;
        fd0 fd0Var;
        fd0 fd0Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float b;
        int i5;
        float f4;
        int i6;
        fd0[] fd0VarArr5;
        int i7;
        float f5;
        boolean z2;
        float f6;
        i4b i4bVar;
        int i8;
        float f7;
        int i9;
        boolean z3 = true;
        this.d = true;
        int i10 = this.k;
        int i11 = 10;
        int i12 = 4;
        boolean z4 = i10 == 4 || i10 == 10;
        int b2 = b();
        if (this.k == 11) {
            L = gm.L(12.0f);
        } else {
            int i13 = this.s;
            if (i13 != 0) {
                L = (int) (i13 * this.t);
            } else {
                L = gm.L(z4 ? 24.0f : 20.0f);
            }
        }
        int i14 = L;
        int i15 = 0;
        while (true) {
            fd0VarArr = this.b;
            if (i15 >= 3) {
                break;
            }
            long j = fd0VarArr[i15].g;
            i15++;
        }
        int i16 = this.k;
        int L2 = (i16 == 0 || i16 == 10 || i16 == 11) ? 0 : gm.L(10.0f);
        int c = this.l ? (this.p - ((int) c())) / 2 : L2;
        boolean z5 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i17 = this.k;
        Paint paint4 = this.h;
        if (i17 == 4) {
            paint4.setColor(cmb.w0(null, cmb.u7, false));
        } else if (i17 != 3) {
            paint4.setColor(cmb.w0(null, z5 ? cmb.y7 : cmb.x7, false));
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            fd0VarArr2 = this.c;
            if (i18 >= 3) {
                break;
            }
            fd0[] fd0VarArr6 = fd0VarArr;
            if (fd0VarArr2[i18].g != 0) {
                i19++;
            }
            i18++;
            fd0VarArr = fd0VarArr6;
        }
        fd0[] fd0VarArr7 = fd0VarArr;
        int i20 = this.k;
        boolean z6 = i20 == 0 || i20 == 1 || i20 == 3 || i20 == 4 || i20 == 5 || i20 == 10 || i20 == 11;
        if (z6) {
            float L3 = i20 == 10 ? gm.L(16.0f) : 0.0f;
            if (this.x) {
                L3 += gm.L(20.0f);
            }
            float f8 = -L3;
            float f9 = this.p + L3;
            float f10 = this.o + L3;
            paint = paint4;
            fd0VarArr3 = fd0VarArr2;
            i = 2;
            f = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f8, f8, f9, f10, nm7.d4, 31);
        } else {
            canvas2 = canvas;
            i = 2;
            fd0VarArr3 = fd0VarArr2;
            paint = paint4;
            f = 0.0f;
        }
        this.A = f;
        boolean z7 = this.x;
        View view = this.r;
        float f11 = 1.0f;
        if (z7) {
            int i21 = i;
            while (i21 >= 0) {
                int i22 = 0;
                while (i22 < i) {
                    if (i22 == 0) {
                        if (this.e != f11) {
                            fd0VarArr5 = fd0VarArr3;
                        }
                        i7 = i21;
                        i22++;
                        i21 = i7;
                        f11 = 1.0f;
                        z3 = true;
                        i11 = 10;
                        i = 2;
                        i12 = 4;
                    } else {
                        fd0VarArr5 = fd0VarArr7;
                    }
                    if (i22 != z3 || this.e == f11 || fd0VarArr5[i21].i == z3) {
                        ImageReceiver imageReceiver2 = fd0VarArr5[i21].e;
                        if (imageReceiver2.D()) {
                            if (i22 == 0) {
                                if (this.l) {
                                    f5 = f11;
                                    i9 = wi8.D(z4 ? 8.0f : 4.0f, this.p - (i19 * i14), i);
                                } else {
                                    f5 = f11;
                                    i9 = L2;
                                }
                                imageReceiver2.L0 = (i14 * i21) + i9;
                            } else {
                                f5 = f11;
                                imageReceiver2.L0 = (i14 * i21) + c;
                            }
                            int i23 = this.k;
                            if (i23 == 0 || i23 == i11 || i23 == 11) {
                                imageReceiver2.M0 = (this.o - b2) / 2.0f;
                            } else {
                                imageReceiver2.M0 = gm.L(i23 == i12 ? 8.0f : 6.0f);
                            }
                            if (this.e != f5) {
                                int i24 = fd0VarArr5[i21].i;
                                if (i24 == z3) {
                                    canvas2.save();
                                    float f12 = f5 - this.e;
                                    canvas2.scale(f12, f12, imageReceiver2.r(), imageReceiver2.s());
                                    f7 = f5 - this.e;
                                } else if (i24 == 0) {
                                    canvas2.save();
                                    float f13 = this.e;
                                    canvas2.scale(f13, f13, imageReceiver2.r(), imageReceiver2.s());
                                    f7 = this.e;
                                } else if (i24 == i) {
                                    if (this.l) {
                                        i8 = wi8.D(z4 ? 8.0f : 4.0f, this.p - (i19 * i14), i);
                                    } else {
                                        i8 = L2;
                                    }
                                    int i25 = (i14 * i21) + i8;
                                    int i26 = (fd0VarArr5[i21].j * i14) + c;
                                    float f14 = this.e;
                                    imageReceiver2.L0 = (int) td4.A(f5, f14, i26, i25 * f14);
                                } else if (i24 == -1 && this.l) {
                                    int D = wi8.D(z4 ? 8.0f : 4.0f, this.p - (i19 * i14), i) + (i14 * i21);
                                    float f15 = this.e;
                                    imageReceiver2.L0 = (int) td4.A(1.0f, f15, c + r5, D * f15);
                                }
                                f6 = f7;
                                z2 = z3;
                                float f16 = f6 * this.u;
                                float b3 = (b() / 2.0f) + gm.L(4.0f);
                                i4bVar = this.y;
                                if (i4bVar != null) {
                                    i4bVar = new i4b();
                                    int i27 = cmb.Jh;
                                    i4bVar.n = i27;
                                    int i28 = cmb.Lh;
                                    i4bVar.o = i28;
                                    i4bVar.a = z3;
                                    i7 = i21;
                                    i4bVar.d(cmb.w0(null, i27, false), cmb.w0(null, i28, false), 0, 0);
                                    this.y = i4bVar;
                                } else {
                                    i7 = i21;
                                }
                                i4bVar.b(0.0f, 0.0f, view.getMeasuredHeight(), gm.L(40.0f));
                                this.y.c.setAlpha((int) (f16 * 255.0f));
                                canvas2.drawCircle(imageReceiver2.r(), imageReceiver2.s(), b3, this.y.c);
                                if (!z2) {
                                    canvas2.restore();
                                }
                                i22++;
                                i21 = i7;
                                f11 = 1.0f;
                                z3 = true;
                                i11 = 10;
                                i = 2;
                                i12 = 4;
                            }
                            z2 = false;
                            f6 = 1.0f;
                            float f162 = f6 * this.u;
                            float b32 = (b() / 2.0f) + gm.L(4.0f);
                            i4bVar = this.y;
                            if (i4bVar != null) {
                            }
                            i4bVar.b(0.0f, 0.0f, view.getMeasuredHeight(), gm.L(40.0f));
                            this.y.c.setAlpha((int) (f162 * 255.0f));
                            canvas2.drawCircle(imageReceiver2.r(), imageReceiver2.s(), b32, this.y.c);
                            if (!z2) {
                            }
                            i22++;
                            i21 = i7;
                            f11 = 1.0f;
                            z3 = true;
                            i11 = 10;
                            i = 2;
                            i12 = 4;
                        }
                    }
                    i7 = i21;
                    i22++;
                    i21 = i7;
                    f11 = 1.0f;
                    z3 = true;
                    i11 = 10;
                    i = 2;
                    i12 = 4;
                }
                i21--;
                f11 = 1.0f;
                z3 = true;
                i11 = 10;
                i = 2;
                i12 = 4;
            }
        }
        int i29 = 2;
        while (i29 >= 0) {
            int i30 = 0;
            while (i30 < 2) {
                if (i30 == 0) {
                    f2 = 1.0f;
                    if (this.e != 1.0f) {
                        fd0VarArr4 = fd0VarArr3;
                    }
                    i2 = i29;
                    paint2 = paint;
                    i3 = i30;
                    i30 = i3 + 1;
                    paint = paint2;
                    i29 = i2;
                } else {
                    f2 = 1.0f;
                    fd0VarArr4 = fd0VarArr7;
                }
                if (i30 != 1 || this.e == f2 || fd0VarArr4[i29].i == 1) {
                    ImageReceiver imageReceiver3 = fd0VarArr4[i29].e;
                    if (imageReceiver3.D()) {
                        if (i30 == 0) {
                            if (this.l) {
                                i6 = wi8.D(z4 ? 8.0f : 4.0f, this.p - (i19 * i14), 2);
                            } else {
                                i6 = L2;
                            }
                            imageReceiver3.L0 = (i14 * i29) + i6;
                        } else {
                            imageReceiver3.L0 = (i14 * i29) + c;
                        }
                        int i31 = this.k;
                        if (i31 == 0 || i31 == 10 || i31 == 11) {
                            imageReceiver3.M0 = (this.o - b2) / 2.0f;
                        } else {
                            imageReceiver3.M0 = gm.L(i31 == 4 ? 8.0f : 6.0f);
                        }
                        if (this.e != 1.0f) {
                            int i32 = fd0VarArr4[i29].i;
                            if (i32 == 1) {
                                canvas2.save();
                                float f17 = 1.0f - this.e;
                                canvas2.scale(f17, f17, imageReceiver3.r(), imageReceiver3.s());
                                f4 = 1.0f - this.e;
                            } else if (i32 == 0) {
                                canvas2.save();
                                float f18 = this.e;
                                canvas2.scale(f18, f18, imageReceiver3.r(), imageReceiver3.s());
                                f4 = this.e;
                            } else if (i32 == 2) {
                                if (this.l) {
                                    i5 = wi8.D(z4 ? 8.0f : 4.0f, this.p - (i19 * i14), 2);
                                } else {
                                    i5 = L2;
                                }
                                int i33 = (i14 * i29) + i5;
                                int i34 = (fd0VarArr4[i29].j * i14) + c;
                                float f19 = this.e;
                                imageReceiver3.L0 = (int) td4.A(1.0f, f19, i34, i33 * f19);
                            } else if (i32 == -1 && this.l) {
                                int D2 = wi8.D(z4 ? 8.0f : 4.0f, this.p - (i19 * i14), 2) + (i14 * i29);
                                float f20 = this.e;
                                imageReceiver3.L0 = (int) td4.A(1.0f, f20, c + r10, D2 * f20);
                            }
                            f3 = f4;
                            z = true;
                            float f21 = f3 * this.u;
                            if (i29 == fd0VarArr4.length - 1 || this.x) {
                                i4 = this.k;
                                paint3 = this.i;
                                if (i4 != 1 || i4 == 3 || i4 == 5) {
                                    fd0[] fd0VarArr8 = fd0VarArr4;
                                    i2 = i29;
                                    imageReceiver = imageReceiver3;
                                    paint2 = paint;
                                    i3 = i30;
                                    canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), gm.L(13.0f), paint3);
                                    fd0Var = fd0VarArr8[i2];
                                    if (fd0Var.b == null) {
                                        if (this.k == 5) {
                                            fd0Var.b = new vb5(gm.L(14.0f), gm.L(16.0f));
                                        } else {
                                            fd0Var.b = new vb5(gm.L(17.0f), gm.L(21.0f));
                                        }
                                    }
                                    if (this.k == 5) {
                                        fd0VarArr8[i2].b.d(on2.p(cmb.w0(null, cmb.gh, false), (int) (f21 * 76.5f)));
                                    }
                                    fd0Var2 = fd0VarArr8[i2];
                                    groupCallParticipant = fd0Var2.f;
                                    if (groupCallParticipant != null || groupCallParticipant.amplitude <= 0.0f) {
                                        fd0Var2.b.e(view, false);
                                    } else {
                                        fd0Var2.b.e(view, true);
                                        fd0VarArr8[i2].b.c(r2.f.amplitude * 15.0f);
                                    }
                                    if (this.k == 5 && SystemClock.uptimeMillis() - fd0VarArr8[i2].f.lastSpeakTime > 500) {
                                        this.j.run();
                                    }
                                    fd0VarArr8[i2].b.f();
                                    if (this.k == 5) {
                                        fd0VarArr8[i2].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                        d();
                                    }
                                    b = fd0VarArr8[i2].b.b();
                                } else if (i4 == 4 || i4 == 10) {
                                    paint2 = paint;
                                    i3 = i30;
                                    canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), gm.L(17.0f), paint3);
                                    fd0 fd0Var3 = fd0VarArr4[i29];
                                    if (fd0Var3.b == null) {
                                        fd0Var3.b = new vb5(gm.L(17.0f), gm.L(21.0f));
                                    }
                                    if (this.k == 10) {
                                        fd0VarArr4[i29].b.d(on2.p(cmb.w0(null, cmb.gh, false), (int) (f21 * 76.5f)));
                                    } else {
                                        fd0VarArr4[i29].b.d(on2.p(cmb.w0(null, cmb.fh, false), (int) (f21 * 76.5f)));
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    fd0 fd0Var4 = fd0VarArr4[i29];
                                    fd0[] fd0VarArr9 = fd0VarArr4;
                                    i2 = i29;
                                    if (currentTimeMillis - fd0Var4.c > 100) {
                                        fd0Var4.c = currentTimeMillis;
                                        if (this.k == 10) {
                                            TLRPC.GroupCallParticipant groupCallParticipant2 = fd0Var4.f;
                                            if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                fd0Var4.b.e(view, false);
                                            } else {
                                                fd0Var4.b.e(view, true);
                                                fd0VarArr9[i2].b.c(r2.f.amplitude * 15.0f);
                                            }
                                        } else {
                                            long currentTime = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
                                            fd0 fd0Var5 = fd0VarArr9[i2];
                                            imageReceiver = imageReceiver3;
                                            long j2 = currentTime - fd0Var5.d;
                                            vb5 vb5Var = fd0Var5.b;
                                            if (j2 <= 5) {
                                                vb5Var.e(view, true);
                                                fd0VarArr9[i2].b.c(this.z.nextInt() % 100);
                                            } else {
                                                vb5Var.e(view, false);
                                                fd0VarArr9[i2].b.c(0.0d);
                                            }
                                            fd0VarArr9[i2].b.f();
                                            fd0VarArr9[i2].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                            b = fd0VarArr9[i2].b.b();
                                        }
                                    }
                                    imageReceiver = imageReceiver3;
                                    fd0VarArr9[i2].b.f();
                                    fd0VarArr9[i2].b.a(canvas2, imageReceiver.r(), imageReceiver.s(), view);
                                    b = fd0VarArr9[i2].b.b();
                                } else {
                                    float b4 = (b() / 2.0f) + this.q;
                                    if (z6) {
                                        canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), b4, paint3);
                                    } else {
                                        int alpha = paint.getAlpha();
                                        if (f21 != 1.0f) {
                                            paint2 = paint;
                                            paint2.setAlpha((int) (alpha * f21));
                                        } else {
                                            paint2 = paint;
                                        }
                                        i3 = i30;
                                        canvas2.drawCircle(imageReceiver3.r(), imageReceiver3.s(), b4, paint2);
                                        if (f21 != 1.0f) {
                                            paint2.setAlpha(alpha);
                                        }
                                        i2 = i29;
                                        imageReceiver = imageReceiver3;
                                        b = 1.0f;
                                    }
                                }
                                imageReceiver.setAlpha(f21);
                                if (b != 1.0f) {
                                    canvas2.save();
                                    canvas2.scale(b, b, imageReceiver.r(), imageReceiver.s());
                                    imageReceiver.h(canvas2, null);
                                    canvas2.restore();
                                } else {
                                    imageReceiver.h(canvas2, null);
                                }
                                this.A = Math.max(this.A, ((imageReceiver.N0 / 2.0f) * b) + imageReceiver.r());
                                if (z) {
                                    canvas2.restore();
                                }
                                i30 = i3 + 1;
                                paint = paint2;
                                i29 = i2;
                            }
                            paint2 = paint;
                            i3 = i30;
                            i2 = i29;
                            imageReceiver = imageReceiver3;
                            b = 1.0f;
                            imageReceiver.setAlpha(f21);
                            if (b != 1.0f) {
                            }
                            this.A = Math.max(this.A, ((imageReceiver.N0 / 2.0f) * b) + imageReceiver.r());
                            if (z) {
                            }
                            i30 = i3 + 1;
                            paint = paint2;
                            i29 = i2;
                        }
                        z = false;
                        f3 = 1.0f;
                        float f212 = f3 * this.u;
                        if (i29 == fd0VarArr4.length - 1) {
                        }
                        i4 = this.k;
                        paint3 = this.i;
                        if (i4 != 1) {
                        }
                        fd0[] fd0VarArr82 = fd0VarArr4;
                        i2 = i29;
                        imageReceiver = imageReceiver3;
                        paint2 = paint;
                        i3 = i30;
                        canvas2.drawCircle(imageReceiver.r(), imageReceiver.s(), gm.L(13.0f), paint3);
                        fd0Var = fd0VarArr82[i2];
                        if (fd0Var.b == null) {
                        }
                        if (this.k == 5) {
                        }
                        fd0Var2 = fd0VarArr82[i2];
                        groupCallParticipant = fd0Var2.f;
                        if (groupCallParticipant != null) {
                        }
                        fd0Var2.b.e(view, false);
                        if (this.k == 5) {
                            this.j.run();
                        }
                        fd0VarArr82[i2].b.f();
                        if (this.k == 5) {
                        }
                        b = fd0VarArr82[i2].b.b();
                        imageReceiver.setAlpha(f212);
                        if (b != 1.0f) {
                        }
                        this.A = Math.max(this.A, ((imageReceiver.N0 / 2.0f) * b) + imageReceiver.r());
                        if (z) {
                        }
                        i30 = i3 + 1;
                        paint = paint2;
                        i29 = i2;
                    }
                }
                i2 = i29;
                paint2 = paint;
                i3 = i30;
                i30 = i3 + 1;
                paint = paint2;
                i29 = i2;
            }
            i29--;
        }
        if (z6) {
            canvas2.restore();
        }
    }

    public final void h(int i) {
        pc0 pc0Var;
        pc0 pc0Var2;
        for (int i2 = 0; i2 < 3; i2++) {
            fd0 fd0Var = this.b[i2];
            if (fd0Var != null && (pc0Var2 = fd0Var.a) != null) {
                pc0Var2.s(i);
            }
            fd0 fd0Var2 = this.c[i2];
            if (fd0Var2 != null && (pc0Var = fd0Var2.a) != null) {
                pc0Var.s(i);
            }
        }
    }

    public final void i(int i) {
        this.n = i;
        View view = this.r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i, int i2, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        fd0[] fd0VarArr = this.c;
        fd0 fd0Var = fd0VarArr[i];
        fd0Var.g = 0L;
        fd0Var.f = null;
        if (tLObject == null) {
            fd0Var.e.g0(null);
            d();
            return;
        }
        fd0Var.d = -1L;
        fd0Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            fd0Var.f = groupCallParticipant;
            long B1 = k47.B1(groupCallParticipant.peer);
            if (pg3.D(B1)) {
                user = oc7.r1(i2).W1(Long.valueOf(B1));
                fd0VarArr[i].a.q(user);
                chat = null;
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-B1));
                fd0VarArr[i].a.p(L0);
                chat = L0;
                user = null;
            }
            if (this.k != 4) {
                fd0VarArr[i].d = groupCallParticipant.active_date;
            } else if (B1 == z8c.h(j5.a(i2).a).e()) {
                fd0VarArr[i].d = 0L;
            } else if (this.m) {
                fd0VarArr[i].d = groupCallParticipant.lastActiveDate;
            } else {
                fd0VarArr[i].d = groupCallParticipant.active_date;
            }
            fd0VarArr[i].g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                fd0Var.a.f(1);
                fd0VarArr[i].a.p = 0.6f;
            } else {
                fd0Var.a.f(0);
                pc0 pc0Var = fd0VarArr[i].a;
                pc0Var.p = 1.0f;
                pc0Var.q(user2);
            }
            fd0VarArr[i].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            fd0Var.a.f(0);
            pc0 pc0Var2 = fd0VarArr[i].a;
            pc0Var2.p = 1.0f;
            pc0Var2.p(chat);
            fd0VarArr[i].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            fd0VarArr[i].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 50, true, null, false);
                fd0VarArr[i].e.Z(gn5.c(bc4.w(storyItem.media.document.thumbs, 50, true, w, true), storyItem.media.document), td4.n(b, b, "_"), gn5.c(w, storyItem.media.document), td4.n(b, b, "_"), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = bc4.w(photo.sizes, 50, true, null, false);
                    fd0VarArr[i].e.Z(gn5.i(bc4.w(storyItem.media.photo.sizes, 50, true, w2, true), storyItem.media.photo), td4.n(b, b, "_"), gn5.i(w2, storyItem.media.photo), td4.n(b, b, "_"), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            fd0 fd0Var2 = fd0VarArr[i];
            fd0Var2.e.U(chat, fd0Var2.a, null);
        } else if (user.self && this.a) {
            fd0 fd0Var3 = fd0VarArr[i];
            fd0Var3.e.g0(fd0Var3.a);
        } else {
            fd0 fd0Var4 = fd0VarArr[i];
            fd0Var4.e.U(user, fd0Var4.a, null);
        }
        fd0VarArr[i].e.q0(b / 2);
        ImageReceiver imageReceiver = fd0VarArr[i].e;
        float f = b;
        imageReceiver.i0(0.0f, 0.0f, f, f);
        d();
    }

    public final void k() {
        for (int i = 0; i < 3; i++) {
            fd0[] fd0VarArr = this.b;
            fd0 fd0Var = fd0VarArr[i];
            fd0[] fd0VarArr2 = this.c;
            fd0VarArr[i] = fd0VarArr2[i];
            fd0VarArr2[i] = fd0Var;
        }
    }
}
