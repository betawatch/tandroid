package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o40 extends t40 implements org.telegram.messenger.ls {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public zg0 D;
    public float D0;
    public zg0 E;
    public final float[] E0;
    public final ImageView F;
    public final float[] F0;
    public float G;
    public final float[] G0;
    public CameraInfo H;
    public FloatBuffer H0;
    public boolean I;
    public FloatBuffer I0;
    public volatile boolean J;
    public FloatBuffer J0;
    public AnimatorSet K;
    public float K0;
    public TLRPC.InputFile L;
    public float L0;
    public TLRPC.InputEncryptedFile M;
    public Size M0;
    public byte[] N;
    public boolean N0;
    public byte[] O;
    public final View O0;
    public long P;
    public boolean P0;
    public final boolean Q;
    public float Q0;
    public org.telegram.messenger.j20 R;
    public float R0;
    public t51 S;
    public boolean S0;
    public Bitmap T;
    public boolean T0;
    public final int U;
    public int U0;
    public volatile boolean V;
    public int V0;
    public final int[] W;
    public int W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.f6 Y0;
    public boolean Z0;
    public final int[] a0;
    public final LinearLayout a1;
    public final int[] b0;
    public final int b1;
    public float c0;
    public Boolean c1;
    public AnimatorSet d0;
    public boolean d1;
    public final int e;
    public org.telegram.messenger.pe e0;
    public boolean e1;
    public final u30 f;
    public File f0;
    public boolean f1;
    public long g0;
    public Timer g1;
    public final b40 h;
    public long h0;
    public g40 h1;
    public boolean i0;
    public Bitmap i1;
    public long j0;
    public volatile int j1;
    public boolean k0;
    public ValueAnimator k1;
    public a40 l0;
    public final Size[] m0;
    public final t30 n;
    public Size n0;
    public final Size o0;
    public TextureView p0;
    public final org.telegram.ui.pk q0;
    public final RectF r;
    public final boolean r0;
    public final fi.n2 s;
    public CameraSession s0;
    public boolean t0;
    public final Camera2Session[] u0;
    public Camera2Session v0;
    public final fi.n2 w;
    public boolean w0;
    public final fi.p2 x;
    public volatile long x0;
    public zg0 y;
    public volatile int y0;
    public volatile int z0;

    public o40(Context context, b40 b40Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        int i7 = org.telegram.messenger.p10.s0;
        this.e = i7;
        final int i10 = 1;
        this.I = true;
        this.W = new int[2];
        this.a0 = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.b0 = new int[1];
        this.c0 = 1.0f;
        this.m0 = new Size[2];
        int i11 = 4;
        this.o0 = org.telegram.messenger.iz.z0 ? new Size(16, 9) : new Size(4, 3);
        this.r0 = org.telegram.messenger.iz.s(i7);
        this.u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.b1 = org.telegram.messenger.g0.L(z9 ? 24.0f : 28.0f);
        this.Y0 = f6Var;
        this.O0 = b40Var.getFragmentView();
        final int i12 = 0;
        setWillNotDraw(false);
        this.h = b40Var;
        this.U = b40Var.getClassGuid();
        this.Q = b40Var.z();
        t30 t30Var = new t30(this, i12);
        this.n = t30Var;
        t30Var.setStyle(Paint.Style.STROKE);
        t30Var.setStrokeCap(Paint.Cap.ROUND);
        t30Var.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        t30Var.setColor(-1);
        this.r = new RectF();
        fi.p2 p2Var = new fi.p2(getContext(), null, this, null);
        this.x = p2Var;
        p2Var.o = 0.5f;
        p2Var.n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.b, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        u30 u30Var = new u30(this, context);
        this.f = u30Var;
        u30Var.setOutlineProvider(new fh.a(this, i11));
        u30Var.setClipToOutline(true);
        u30Var.setWillNotDraw(false);
        int i13 = org.telegram.messenger.g0.v;
        addView(u30Var, new FrameLayout.LayoutParams(i13, i13, 17));
        addView(p2Var.c, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        fi.n2 n2Var = new fi.n2(context);
        this.s = n2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var.setScaleType(scaleType);
        n2Var.setContentDescription(org.telegram.messenger.id.M0(2131754752, null));
        linearLayout.addView(n2Var, c8.ha.o(44, 44));
        n2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q30
            public final /* synthetic */ o40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        o40 o40Var = this.b;
                        if (o40Var.J) {
                            if (o40Var.r0) {
                                Camera2Session camera2Session = o40Var.v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = o40Var.s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (o40Var.l0 != null) {
                                if (!o40Var.t0) {
                                    o40Var.v();
                                }
                                zg0 zg0Var = o40Var.E;
                                int i14 = 0;
                                if (zg0Var != null) {
                                    zg0Var.M(0);
                                    o40Var.E.start();
                                }
                                o40Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                r30 r30Var = new r30(o40Var, i14);
                                o40Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                o40Var.q0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new v30(o40Var, zArr, r30Var));
                                ofFloat.addListener(new di.h3(o40Var, zArr, r30Var, 7));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        o40 o40Var2 = this.b;
                        o40Var2.d1 = true ^ o40Var2.d1;
                        o40Var2.w();
                        break;
                }
            }
        });
        fi.n2 n2Var2 = new fi.n2(context);
        this.w = n2Var2;
        n2Var2.setScaleType(scaleType);
        linearLayout.addView(n2Var2, c8.ha.o(44, 44));
        n2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q30
            public final /* synthetic */ o40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o40 o40Var = this.b;
                        if (o40Var.J) {
                            if (o40Var.r0) {
                                Camera2Session camera2Session = o40Var.v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = o40Var.s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (o40Var.l0 != null) {
                                if (!o40Var.t0) {
                                    o40Var.v();
                                }
                                zg0 zg0Var = o40Var.E;
                                int i14 = 0;
                                if (zg0Var != null) {
                                    zg0Var.M(0);
                                    o40Var.E.start();
                                }
                                o40Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                r30 r30Var = new r30(o40Var, i14);
                                o40Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                o40Var.q0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new v30(o40Var, zArr, r30Var));
                                ofFloat.addListener(new di.h3(o40Var, zArr, r30Var, 7));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        o40 o40Var2 = this.b;
                        o40Var2.d1 = true ^ o40Var2.d1;
                        o40Var2.w();
                        break;
                }
            }
        });
        w();
        if (!z9) {
            p2Var.a(n2Var);
            p2Var.a(n2Var2);
        } else if (!f6Var.a()) {
            n2Var.setInvert(0.6f);
            n2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ha.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, getContext(), paint);
        this.q0 = pkVar;
        int i14 = org.telegram.messenger.g0.v;
        addView(pkVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.f1 = false;
        setVisibility(4);
    }

    public static int l(o40 o40Var, int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static boolean m() {
        if (!org.telegram.messenger.iz.Y && org.telegram.messenger.iz.o() < 1) {
            int o4 = org.telegram.messenger.iz.o();
            if (org.telegram.messenger.iz.a == -1) {
                int i7 = Build.VERSION.SDK_INT;
                int i10 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getMemoryClass();
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    try {
                        Locale locale = Locale.ENGLISH;
                        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq", "r");
                        String readLine = randomAccessFile.readLine();
                        if (readLine != null) {
                            i12 += Utilities.z(readLine).intValue() / 1000;
                            i11++;
                        }
                        randomAccessFile.close();
                    } catch (Throwable unused) {
                    }
                }
                int ceil = i11 == 0 ? -1 : (int) Math.ceil(i12 / i11);
                if (i10 <= 2 || memoryClass <= 100 || ((i10 <= 4 && ceil != -1 && ceil <= 1250) || (i10 <= 4 && ceil <= 1300 && memoryClass <= 128 && i7 <= 24))) {
                    org.telegram.messenger.iz.a = 0;
                } else if (i10 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2050) || (ceil == -1 && i10 == 8 && i7 <= 23))) {
                    org.telegram.messenger.iz.a = 1;
                } else {
                    org.telegram.messenger.iz.a = 2;
                }
            }
            if (Math.max(o4, org.telegram.messenger.iz.a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i14 = 0;
                while (true) {
                    int[] iArr = l1;
                    if (i14 >= 2) {
                        return false;
                    }
                    if (iArr[i14] == hashCode) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final void a(boolean z9) {
        u();
        t51 t51Var = this.S;
        if (t51Var != null) {
            t51Var.m0();
            this.S = null;
        }
        if (this.p0 == null) {
            return;
        }
        this.k0 = true;
        this.i0 = false;
        this.d1 = false;
        w();
        org.telegram.messenger.qs.f(this.e).k(org.telegram.messenger.qs.n2, Integer.valueOf(this.U), Integer.valueOf(z9 ? 0 : 6));
        if (this.l0 != null) {
            r();
            this.l0.a(0, true, 0, 0, 0L);
            this.l0 = null;
        } else {
            g40 g40Var = this.h1;
            if (g40Var != null) {
                g40Var.i(0, new d40(0, 0, 0L, 0L, true));
            }
        }
        if (this.e0 != null) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.d("delete camera file by cancel");
            }
            this.e0.delete();
            org.telegram.messenger.z0.b(this.e0);
            this.e0 = null;
        }
        MediaController.B().Y(false);
        s(false, false);
        invalidate();
    }

    @Override // org.telegram.ui.Components.t40
    public final void b(float f10, int i7) {
        t51 t51Var = this.S;
        if (t51Var == null) {
            return;
        }
        if (i7 == 0) {
            t();
            this.S.h0();
        } else if (i7 == 1) {
            u();
            this.S.g0();
        } else if (i7 == 2) {
            t51Var.q0((long) (f10 * t51Var.U()), false);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void c(boolean z9) {
        if (!this.r0) {
            CameraSession cameraSession = this.s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.s0, !z9 ? new CountDownLatch(1) : null, null);
                return;
            }
            return;
        }
        int i7 = 0;
        while (true) {
            Camera2Session[] camera2SessionArr = this.u0;
            if (i7 >= camera2SessionArr.length) {
                return;
            }
            Camera2Session camera2Session = camera2SessionArr[i7];
            if (camera2Session != null) {
                camera2Session.destroy(z9);
                camera2SessionArr[i7] = null;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void d(boolean z9) {
        ViewGroup viewGroup;
        c(z9);
        u30 u30Var = this.f;
        u30Var.setTranslationX(0.0f);
        this.q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        x();
        MediaController.B().c0();
        TextureView textureView = this.p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.p0);
        }
        this.p0 = null;
        u30Var.setImageReceiver(null);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.pe peVar = this.e0;
            if (peVar == null || !peVar.getAbsolutePath().equals(str)) {
                return;
            }
            this.L = (TLRPC.InputFile) objArr[1];
            this.M = (TLRPC.InputEncryptedFile) objArr[2];
            this.P = ((Long) objArr[5]).longValue();
            if (this.M != null) {
                this.N = (byte[]) objArr[3];
                this.O = (byte[]) objArr[4];
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final boolean f() {
        return !this.i0;
    }

    @Override // org.telegram.ui.Components.t40
    public final void g(float f10) {
        this.C0 = f10 / 2.0f;
        x();
    }

    @Override // org.telegram.ui.Components.t40
    public View getButtonsLayout() {
        return this.a1;
    }

    @Override // org.telegram.ui.Components.t40
    public RectF getCameraRect() {
        u30 u30Var = this.f;
        int[] iArr = this.W;
        u30Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], u30Var.getWidth() + r3, u30Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.t40
    public View getMuteImageView() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.t40
    public Paint getPaint() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.t40
    public TextureView getTextureView() {
        return this.p0;
    }

    @Override // org.telegram.ui.Components.t40
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        int i12;
        long j11;
        if (this.p0 == null) {
            return;
        }
        u();
        t51 t51Var = this.S;
        if (t51Var != null) {
            t51Var.m0();
            this.S = null;
        }
        int i13 = this.e;
        if (i7 != 4) {
            this.k0 = this.j0 < 800;
            this.i0 = false;
            this.d1 = false;
            w();
            int i14 = this.k0 ? 4 : i7 == 3 ? 2 : 5;
            a40 a40Var = this.l0;
            int i15 = this.U;
            if (a40Var != null) {
                org.telegram.messenger.qs.f(i13).k(org.telegram.messenger.qs.n2, Integer.valueOf(i15), Integer.valueOf(i14));
                int i16 = this.k0 ? 0 : i7 == 3 ? 2 : 1;
                r();
                i12 = i15;
                this.l0.a(i16, z9, i10, i11, j3);
                this.l0 = null;
            } else {
                i12 = i15;
            }
            if (this.k0) {
                org.telegram.messenger.qs.f(i13).k(org.telegram.messenger.qs.t2, Integer.valueOf(i12), Boolean.TRUE, Integer.valueOf((int) this.j0));
                s(false, false);
                MediaController.B().Y(false);
                return;
            }
            return;
        }
        g40 g40Var = this.h1;
        if (g40Var != null && this.j0 > 800) {
            g40Var.i(1, new d40(i10, i11, j3, j10, z9));
            return;
        }
        boolean z10 = org.telegram.messenger.r2.a;
        if (!this.e0.exists()) {
            org.telegram.messenger.a8.g(new RuntimeException("file not found :( round video"), true);
        }
        if (this.R == null) {
            org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
            this.R = j20Var;
            j20Var.a = -1L;
            j20Var.b = -1L;
        }
        if (this.R.c()) {
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            org.telegram.messenger.j20 j20Var2 = this.R;
            long j12 = j20Var2.r;
            double d = j12;
            long j13 = j20Var2.a;
            if (j13 >= 0) {
                j11 = 0;
            } else {
                j13 = 0;
                j11 = 0;
            }
            long j14 = j20Var2.b;
            if (j14 >= j11) {
                j12 = j14;
            }
            long j15 = j12 - j13;
            j20Var2.r = j15;
            j20Var2.q = Math.max(1L, (long) ((j15 / d) * this.P));
            org.telegram.messenger.j20 j20Var3 = this.R;
            j20Var3.m = 1000000;
            long j16 = j20Var3.a;
            if (j16 > j11) {
                j20Var3.a = j16 * 1000;
            }
            long j17 = j20Var3.b;
            if (j17 > j11) {
                j20Var3.b = j17 * 1000;
            }
            org.telegram.messenger.w7.G(i13).b(this.e0.getAbsolutePath(), false);
        } else {
            this.R.q = Math.max(1L, this.P);
        }
        org.telegram.messenger.j20 j20Var4 = this.R;
        j20Var4.w = this.L;
        j20Var4.x = this.M;
        j20Var4.y = this.N;
        j20Var4.z = this.O;
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, this.e0.getAbsolutePath(), 0, true, 0, 0);
        gfVar.x = i11;
        gfVar.y = j3;
        this.h.u(gfVar, this.R, z9, i10, 0, false, j10);
        if (i10 != 0) {
            s(false, false);
        }
        MediaController.B().Y(false);
    }

    @Override // org.telegram.ui.Components.t40
    public final void i(dh.c cVar, org.telegram.ui.oi oiVar) {
        LinearLayout linearLayout = this.a1;
        fh.g c10 = cVar.c(linearLayout, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.t40
    public final void j(boolean z9) {
        String absolutePath;
        t51 t51Var;
        if (this.p0 != null) {
            return;
        }
        int i7 = 0;
        if (this.E == null) {
            int i10 = this.b1;
            zg0 zg0Var = new zg0(R.raw.roundcamera_flip, i10, i10);
            this.E = zg0Var;
            zg0Var.M(0);
            this.E.setCallback(this.s);
        }
        this.s.setImageDrawable(this.E);
        this.q0.setAlpha(1.0f);
        this.q0.invalidate();
        if (this.T == null) {
            try {
                this.T = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.T;
        if (bitmap != null) {
            this.q0.setImageBitmap(bitmap);
        } else {
            this.q0.setImageResource(R.drawable.icplaceholder);
        }
        this.J = false;
        this.H = null;
        if (!z9) {
            if (!this.r0) {
                this.I = true;
            }
            w();
            this.j0 = 0L;
            this.G = 0.0f;
        }
        this.k0 = false;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.w0 = true;
        if (p()) {
            if (MediaController.B().u0 != null) {
                if (org.telegram.messenger.ij.M4(MediaController.B().u0.k) || MediaController.B().u0.i4()) {
                    MediaController.B().q(true, true, false, false);
                } else if (org.telegram.messenger.iz.F0 && (t51Var = MediaController.B().i0) != null) {
                    t51Var.g0();
                }
            }
            if (!z9) {
                this.e0 = new org.telegram.messenger.pe(2, org.telegram.messenger.w7.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.iz.p() + ".mp4");
            }
            org.telegram.messenger.iz.y();
            org.telegram.messenger.pe peVar = this.e0;
            Set set = org.telegram.messenger.z0.a;
            if (peVar != null && (absolutePath = peVar.getAbsolutePath()) != null) {
                org.telegram.messenger.z0.a.add(absolutePath);
            }
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("InstantCamera show round camera " + this.e0.getAbsolutePath());
            }
            if (this.r0) {
                Context context = getContext();
                boolean z10 = org.telegram.messenger.qp.e1().getBoolean("rounddual_available", org.telegram.messenger.iz.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.iz.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.t0 = z10;
                if (z10) {
                    int i11 = 0;
                    while (i11 < 2) {
                        Camera2Session[] camera2SessionArr = this.u0;
                        if (camera2SessionArr[i11] == null) {
                            camera2SessionArr[i11] = Camera2Session.create(i11 == 0, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).v3);
                            Camera2Session camera2Session = this.u0[i11];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.m0[i11] = new Size(this.u0[i11].getPreviewWidth(), this.u0[i11].getPreviewHeight());
                            }
                        }
                        i11++;
                    }
                    w();
                    Camera2Session[] camera2SessionArr2 = this.u0;
                    boolean z11 = this.I;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z11 ? 1 : 0];
                    this.v0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z11 ? 1 : 0] == null) {
                        this.t0 = false;
                    }
                    if (org.telegram.messenger.r2.a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                        sb2.append(this.t0);
                        sb2.append(", initialFacing=");
                        sb2.append(this.I ? "FRONT" : "BACK");
                        sb2.append(", frontSession=");
                        sb2.append(this.u0[0] != null);
                        sb2.append(", backSession=");
                        sb2.append(this.u0[1] != null);
                        org.telegram.messenger.a8.b(sb2.toString());
                    }
                    if (this.v0 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.u0;
                    boolean z12 = this.I;
                    int i12 = !z12 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z12, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).v3);
                    camera2SessionArr3[i12] = create;
                    this.v0 = create;
                    if (create == null) {
                        return;
                    }
                    create.setRecordingVideo(true);
                    this.m0[0] = new Size(this.v0.getPreviewWidth(), this.v0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.p0 = textureView;
            textureView.setSurfaceTextureListener(new w30(this, i7));
            this.f.addView(this.p0, c8.ha.c(-1.0f, -1));
            this.X0 = true;
            this.f1 = z9;
            setVisibility(0);
            s(true, z9);
            MediaController.B().Y(true);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void k() {
        if (!this.i0) {
            g40 g40Var = this.h1;
            if (g40Var != null) {
                g40Var.T.sendMessage(g40Var.T.obtainMessage(5));
                d(false);
                t51 t51Var = this.S;
                if (t51Var != null) {
                    t51Var.m0();
                    this.S = null;
                }
                j(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.f2(this.h.getParentActivity());
                invalidate();
                org.telegram.messenger.qs.f(this.e).k(org.telegram.messenger.qs.p2, new Object[0]);
                return;
            }
            return;
        }
        this.k0 = this.j0 < 800;
        this.i0 = false;
        w();
        if (this.l0 != null) {
            org.telegram.messenger.qs.f(this.e).k(org.telegram.messenger.qs.n2, Integer.valueOf(this.U), Integer.valueOf(this.k0 ? 4 : 2));
            r();
            a40 a40Var = this.l0;
            boolean z9 = this.k0;
            a40Var.a(z9 ? 0 : 2, true, 0, z9 ? 0 : -2, 0L);
            this.l0 = null;
        }
        if (!this.k0) {
            g40 g40Var2 = this.h1;
            g40Var2.T.sendMessage(g40Var2.T.obtainMessage(4));
        } else {
            org.telegram.messenger.qs.f(this.e).k(org.telegram.messenger.qs.t2, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.j0));
            s(false, false);
            MediaController.B().Y(false);
        }
    }

    public final Size n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i7 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : m() ? 1440 : 1200;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (Math.max(((Size) arrayList.get(i10)).mHeight, ((Size) arrayList.get(i10)).mWidth) <= i7 && Math.min(((Size) arrayList.get(i10)).mHeight, ((Size) arrayList.get(i10)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i10));
            }
        }
        if (!arrayList2.isEmpty() && m()) {
            Collections.sort(arrayList2, new org.telegram.ui.oe(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.o0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, org.telegram.messenger.qs.t4, size, false);
    }

    public final void o() {
        float min;
        if (this.k1 != null) {
            return;
        }
        if (this.r0) {
            Camera2Session camera2Session = this.v0;
            if (camera2Session == null) {
                return;
            } else {
                min = Utilities.i(this.R0, camera2Session.getMaxZoom(), this.v0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.R0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.k1 = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 26));
            this.k1.addListener(new s30(this, 1));
            this.k1.setDuration(350L);
            this.k1.setInterpolator(xq.f);
            this.k1.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.e).c(this, org.telegram.messenger.qs.U1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.e).n(this, org.telegram.messenger.qs.U1);
        fi.p2 p2Var = this.x;
        if (p2Var != null) {
            p2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u30 u30Var = this.f;
        float x10 = u30Var.getX();
        float y10 = u30Var.getY();
        RectF rectF = this.r;
        rectF.set(x10 - org.telegram.messenger.g0.L(8.0f), y10 - org.telegram.messenger.g0.L(8.0f), x10 + u30Var.getMeasuredWidth() + org.telegram.messenger.g0.L(8.0f), y10 + u30Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        if (this.i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.g0) + this.h0;
            this.j0 = currentTimeMillis;
            this.G = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(u30Var.getScaleX(), u30Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.G * 360.0f, false, this.n);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.X0) {
            int i11 = ((float) (View.MeasureSpec.getSize(i10) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i7)) * 1.3f ? org.telegram.messenger.g0.v : org.telegram.messenger.g0.u;
            if (i11 != this.W0) {
                this.W0 = i11;
                org.telegram.ui.pk pkVar = this.q0;
                ViewGroup.LayoutParams layoutParams = pkVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = pkVar.getLayoutParams();
                int i12 = this.W0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                u30 u30Var = this.f;
                ViewGroup.LayoutParams layoutParams3 = u30Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = u30Var.getLayoutParams();
                int i13 = this.W0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - org.telegram.messenger.g0.L(24.0f);
                pkVar.setRoundRadius(this.W0 / 2);
                u30Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        fi.p2 p2Var = this.x;
        p2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
            x();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t51 t51Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (t51Var = this.S) != null) {
            boolean c02 = t51Var.c0();
            this.S.t0(!c02);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            float[] fArr = {!c02 ? 1.0f : 0.0f};
            ImageView imageView = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !c02 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, c02 ? 0.5f : 1.0f));
            this.K.addListener(new s30(this, 0));
            this.K.setDuration(180L);
            this.K.setInterpolator(new DecelerateInterpolator());
            this.K.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.T0 && !this.S0 && motionEvent.getPointerCount() == 2 && this.k1 == null && this.i0) {
                this.Q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.R0 = 1.0f;
                this.U0 = motionEvent.getPointerId(0);
                this.V0 = motionEvent.getPointerId(1);
                this.S0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                u30 u30Var = this.f;
                rectF.set(u30Var.getX(), u30Var.getY(), u30Var.getX() + u30Var.getMeasuredWidth(), u30Var.getY() + u30Var.getMeasuredHeight());
                this.T0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.S0) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (this.U0 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (this.V0 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                this.S0 = false;
                o();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / this.Q0;
            this.R0 = hypot;
            if (!this.r0) {
                this.s0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.v0;
            if (camera2Session != null) {
                this.v0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.v0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.U0 == motionEvent.getPointerId(0) && this.V0 == motionEvent.getPointerId(1)) || (this.U0 == motionEvent.getPointerId(1) && this.V0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.S0) {
            this.S0 = false;
            o();
            return true;
        }
        return true;
    }

    public final boolean p() {
        int i7;
        int i10;
        if (!this.r0) {
            ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
            if (cameras != null) {
                CameraInfo cameraInfo = null;
                int i11 = 0;
                while (i11 < cameras.size()) {
                    CameraInfo cameraInfo2 = cameras.get(i11);
                    if (!cameraInfo2.isFrontface()) {
                        cameraInfo = cameraInfo2;
                    }
                    if ((this.I && cameraInfo2.isFrontface()) || (!this.I && !cameraInfo2.isFrontface())) {
                        this.H = cameraInfo2;
                        break;
                    }
                    i11++;
                    cameraInfo = cameraInfo2;
                }
                if (this.H == null) {
                    this.H = cameraInfo;
                }
                CameraInfo cameraInfo3 = this.H;
                if (cameraInfo3 != null) {
                    ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
                    ArrayList<Size> pictureSizes = this.H.getPictureSizes();
                    Size n10 = n(previewSizes);
                    Size[] sizeArr = this.m0;
                    sizeArr[0] = n10;
                    Size n11 = n(pictureSizes);
                    this.n0 = n11;
                    if (sizeArr[0].mWidth != n11.mWidth) {
                        boolean z9 = false;
                        for (int size = previewSizes.size() - 1; size >= 0; size--) {
                            Size size2 = previewSizes.get(size);
                            int size3 = pictureSizes.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    break;
                                }
                                Size size4 = pictureSizes.get(size3);
                                int i12 = size2.mWidth;
                                Size size5 = this.n0;
                                if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.n0 = size4;
                                    z9 = true;
                                    break;
                                }
                                size3--;
                            }
                            if (z9) {
                                break;
                            }
                        }
                        if (!z9) {
                            for (int size6 = previewSizes.size() - 1; size6 >= 0; size6--) {
                                Size size7 = previewSizes.get(size6);
                                int size8 = pictureSizes.size() - 1;
                                while (true) {
                                    if (size8 < 0) {
                                        break;
                                    }
                                    Size size9 = pictureSizes.get(size8);
                                    int i13 = size7.mWidth;
                                    if (i13 >= 360 && (i7 = size7.mHeight) >= 360 && i13 == size9.mWidth && i7 == size9.mHeight) {
                                        sizeArr[0] = size7;
                                        this.n0 = size9;
                                        z9 = true;
                                        break;
                                    }
                                    size8--;
                                }
                                if (z9) {
                                    break;
                                }
                            }
                        }
                    }
                    if (org.telegram.messenger.r2.a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        jg.g.s(sizeArr[0].mHeight, sb2);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void q(String str) {
        if (org.telegram.messenger.r2.a) {
            long j3 = this.x0;
            org.telegram.messenger.a8.b("InstantCamera legacy switch[" + this.y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + (j3 != 0 ? (SystemClock.elapsedRealtimeNanos() - j3) / 1000000 : 0L) + ", thread=" + Thread.currentThread().getName());
        }
    }

    public final void r() {
        Bitmap bitmap = this.p0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.p0.getBitmap(), 50, 50, true);
        this.T = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                this.T.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void s(boolean z9, boolean z10) {
        p40 p40Var = this.a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).b.Zc.a(z9, true);
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.d0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        org.telegram.ui.pk pkVar = this.q0;
        u30 u30Var = this.f;
        if (z9 && !this.P0) {
            u30Var.setTranslationX(0.0f);
            pkVar.setTranslationX(0.0f);
            this.D0 = z10 ? 0.0f : getMeasuredHeight() / 2.0f;
            x();
        }
        this.P0 = z9;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.d0 = new AnimatorSet();
        float L = (z9 || this.j0 <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 1.0f : 0.0f, z9 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new ch.u(7, this, z10));
        AnimatorSet animatorSet2 = this.d0;
        float[] fArr = {z9 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.n, m6.b, z9 ? org.telegram.messenger.qs.e4 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u30Var, (Property<u30, Float>) property, z9 ? 1.0f : 0.0f);
        float f10 = z9 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(u30Var, (Property<u30, Float>) property2, f10);
        float f11 = z9 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u30Var, (Property<u30, Float>) property3, f11);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(u30Var, (Property<u30, Float>) property4, L), ObjectAnimator.ofFloat(pkVar, (Property<org.telegram.ui.pk, Float>) property, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(pkVar, (Property<org.telegram.ui.pk, Float>) property2, z9 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(pkVar, (Property<org.telegram.ui.pk, Float>) property3, z9 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(pkVar, (Property<org.telegram.ui.pk, Float>) property4, L), ofFloat);
        if (z9) {
            setTranslationX(0.0f);
        } else {
            this.d0.addListener(new s30(this, 2));
        }
        this.d0.setDuration(180L);
        this.d0.setInterpolator(new DecelerateInterpolator());
        this.d0.start();
    }

    @Override // org.telegram.ui.Components.t40
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.a1.setAlpha(0.0f);
        u30 u30Var = this.f;
        u30Var.setAlpha(0.0f);
        org.telegram.ui.pk pkVar = this.q0;
        pkVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        u30Var.setScaleX(this.f1 ? 1.0f : 0.1f);
        u30Var.setScaleY(this.f1 ? 1.0f : 0.1f);
        pkVar.setScaleX(this.f1 ? 1.0f : 0.1f);
        pkVar.setScaleY(this.f1 ? 1.0f : 0.1f);
        if (u30Var.getMeasuredWidth() != 0) {
            u30Var.setPivotX(u30Var.getMeasuredWidth() / 2);
            u30Var.setPivotY(u30Var.getMeasuredHeight() / 2);
            pkVar.setPivotX(pkVar.getMeasuredWidth() / 2);
            pkVar.setPivotY(pkVar.getMeasuredHeight() / 2);
        }
        try {
            if (i7 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t() {
        Timer timer = this.g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.g1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        Timer timer2 = new Timer();
        this.g1 = timer2;
        timer2.schedule(new fi.h2(this, 2), 0L, 17L);
    }

    public final void u() {
        Timer timer = this.g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.g1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void v() {
        this.x0 = SystemClock.elapsedRealtimeNanos();
        this.y0++;
        this.z0 = (this.r0 && this.t0) ? 1 - this.j1 : 0;
        this.A0 = true;
        this.B0 = this.r0 ? this.t0 ? "DUAL_PREOPENED" : "SEQUENTIAL_CAMERA2" : "SEQUENTIAL_CAMERA1";
        StringBuilder sb2 = new StringBuilder("requested: from=");
        sb2.append(this.I ? "FRONT" : "BACK");
        sb2.append(", to=");
        sb2.append(this.I ? "BACK" : "FRONT");
        sb2.append(", currentSurface=");
        sb2.append(this.j1);
        sb2.append(", targetSurface=");
        sb2.append(this.z0);
        q(sb2.toString());
        if (!this.r0 || !this.t0) {
            r();
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.w0 = false;
                this.q0.setImageBitmap(bitmap);
                this.q0.setAlpha(1.0f);
            }
        }
        this.I = !this.I;
        w();
        if (!this.r0) {
            CameraSession cameraSession = this.s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.s0, null, null);
                this.s0 = null;
            }
        } else {
            if (this.t0) {
                this.v0 = this.u0[!this.I ? 1 : 0];
                a40 a40Var = this.l0;
                Handler handler = a40Var.getHandler();
                if (handler != null) {
                    a40Var.sendMessage(handler.obtainMessage(4), 0);
                    a40Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.v0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.v0 = null;
                this.u0[this.I ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.u0;
            boolean z9 = this.I;
            int i7 = !z9 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z9, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).v3);
            camera2SessionArr[i7] = create;
            this.v0 = create;
            if (create == null) {
                this.A0 = false;
                q("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.v0.getPreviewWidth(), this.v0.getPreviewHeight());
            a40 a40Var2 = this.l0;
            Camera2Session camera2Session2 = this.v0;
            Handler handler2 = a40Var2.getHandler();
            if (handler2 != null) {
                a40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        p();
        this.J = false;
        a40 a40Var3 = this.l0;
        Handler handler3 = a40Var3.getHandler();
        if (handler3 != null) {
            a40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void w() {
        boolean z9 = this.d1 && this.i0 && this.I;
        if (this.e1 != z9) {
            this.e1 = z9;
            fi.p2 p2Var = this.x;
            if (z9) {
                p2Var.c(null);
            } else {
                p2Var.d();
            }
        }
        if (this.r0) {
            Camera2Session camera2Session = this.u0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.d1 && !this.I && this.i0);
            }
        } else {
            CameraSession cameraSession = this.s0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.d1 && !this.I && this.i0);
            }
        }
        fi.n2 n2Var = this.w;
        if (n2Var != null) {
            Boolean bool = this.c1;
            if (bool == null || bool.booleanValue() != this.d1) {
                n2Var.setContentDescription(org.telegram.messenger.id.M0(this.d1 ? 2131754914 : 2131754913, null));
                boolean z10 = this.d1;
                int i7 = this.b1;
                if (z10) {
                    if (this.D == null) {
                        zg0 zg0Var = new zg0(R.raw.roundcamera_flash_off, i7, i7);
                        this.D = zg0Var;
                        zg0Var.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.D);
                    if (this.c1 == null) {
                        zg0 zg0Var2 = this.D;
                        zg0Var2.M(zg0Var2.e[0] - 1);
                    } else {
                        this.D.M(0);
                        this.D.start();
                    }
                } else {
                    if (this.y == null) {
                        zg0 zg0Var3 = new zg0(R.raw.roundcamera_flash_on, i7, i7);
                        this.y = zg0Var3;
                        zg0Var3.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.y);
                    if (this.c1 == null) {
                        zg0 zg0Var4 = this.y;
                        zg0Var4.M(zg0Var4.e[0] - 1);
                    } else {
                        this.y.M(0);
                        this.y.start();
                    }
                }
                this.c1 = Boolean.valueOf(this.d1);
            }
        }
    }

    public final void x() {
        this.q0.setTranslationY(this.D0 + this.C0);
        this.f.setTranslationY(this.D0 + this.C0);
    }

    @Override // org.telegram.ui.Components.t40
    public c40 getCameraContainer() {
        return this.f;
    }

    @Override // org.telegram.ui.Components.t40
    public void setIsMessageTransition(boolean z9) {
    }
}
