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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k40 extends p40 implements org.telegram.messenger.cs {
    public static final int[] m1 = {285904780, -1394191079};
    public volatile int A0;
    public volatile boolean B0;
    public volatile String C0;
    public float D0;
    public ch0 E;
    public float E0;
    public ch0 F;
    public final float[] F0;
    public final ImageView G;
    public final float[] G0;
    public float H;
    public final float[] H0;
    public CameraInfo I;
    public FloatBuffer I0;
    public boolean J;
    public FloatBuffer J0;
    public volatile boolean K;
    public FloatBuffer K0;
    public AnimatorSet L;
    public float L0;
    public TLRPC.InputFile M;
    public float M0;
    public TLRPC.InputEncryptedFile N;
    public Size N0;
    public byte[] O;
    public boolean O0;
    public byte[] P;
    public final View P0;
    public long Q;
    public boolean Q0;
    public final boolean R;
    public float R0;
    public org.telegram.messenger.b20 S;
    public float S0;
    public m51 T;
    public boolean T0;
    public Bitmap U;
    public boolean U0;
    public final int V;
    public int V0;
    public volatile boolean W;
    public int W0;
    public int X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.e6 Z0;
    public final int[] a0;
    public boolean a1;
    public final int[] b0;
    public final LinearLayout b1;
    public final int[] c0;
    public final int c1;
    public float d0;
    public Boolean d1;
    public final int e;
    public AnimatorSet e0;
    public boolean e1;
    public final q30 f;
    public org.telegram.messenger.je f0;
    public boolean f1;
    public File g0;
    public boolean g1;
    public final x30 h;
    public long h0;
    public Timer h1;
    public long i0;
    public c40 i1;
    public boolean j0;
    public Bitmap j1;
    public long k0;
    public volatile int k1;
    public boolean l0;
    public ValueAnimator l1;
    public w30 m0;
    public final p30 n;
    public final Size[] n0;
    public Size o0;
    public final Size p0;
    public TextureView q0;
    public final RectF r;
    public final org.telegram.ui.lk r0;
    public final gi.l2 s;
    public final boolean s0;
    public CameraSession t0;
    public boolean u0;
    public final Camera2Session[] v0;
    public final gi.l2 w;
    public Camera2Session w0;
    public final gi.n2 x;
    public boolean x0;
    public ch0 y;
    public volatile long y0;
    public volatile int z0;

    public k40(Context context, x30 x30Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i3 = org.telegram.messenger.h10.t0;
        this.e = i3;
        final int i10 = 1;
        this.J = true;
        this.a0 = new int[2];
        this.b0 = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.c0 = new int[1];
        this.d0 = 1.0f;
        this.n0 = new Size[2];
        int i11 = 4;
        this.p0 = org.telegram.messenger.az.z0 ? new Size(16, 9) : new Size(4, 3);
        this.s0 = org.telegram.messenger.az.s(i3);
        this.v0 = new Camera2Session[2];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.H0 = new float[16];
        this.c1 = org.telegram.messenger.g0.L(z10 ? 24.0f : 28.0f);
        this.Z0 = e6Var;
        this.P0 = x30Var.getFragmentView();
        final int i12 = 0;
        setWillNotDraw(false);
        this.h = x30Var;
        this.V = x30Var.getClassGuid();
        this.R = x30Var.z();
        p30 p30Var = new p30(this, i12);
        this.n = p30Var;
        p30Var.setStyle(Paint.Style.STROKE);
        p30Var.setStrokeCap(Paint.Cap.ROUND);
        p30Var.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        p30Var.setColor(-1);
        this.r = new RectF();
        gi.n2 n2Var = new gi.n2(getContext(), null, this, null);
        this.x = n2Var;
        n2Var.o = 0.5f;
        n2Var.n = gi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.b, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        q30 q30Var = new q30(this, context);
        this.f = q30Var;
        q30Var.setOutlineProvider(new gh.a(this, i11));
        q30Var.setClipToOutline(true);
        q30Var.setWillNotDraw(false);
        int i13 = org.telegram.messenger.g0.v;
        addView(q30Var, new FrameLayout.LayoutParams(i13, i13, 17));
        addView(n2Var.c, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        gi.l2 l2Var = new gi.l2(context);
        this.s = l2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        l2Var.setContentDescription(org.telegram.messenger.bd.M0(2131754752, null));
        linearLayout.addView(l2Var, b8.mf.o(44, 44));
        l2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m30
            public final /* synthetic */ k40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        k40 k40Var = this.b;
                        if (k40Var.K) {
                            if (k40Var.s0) {
                                Camera2Session camera2Session = k40Var.w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = k40Var.t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (k40Var.m0 != null) {
                                if (!k40Var.u0) {
                                    k40Var.u();
                                }
                                ch0 ch0Var = k40Var.F;
                                int i14 = 0;
                                if (ch0Var != null) {
                                    ch0Var.M(0);
                                    k40Var.F.start();
                                }
                                k40Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                n30 n30Var = new n30(k40Var, i14);
                                k40Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                k40Var.r0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r30(k40Var, zArr, n30Var));
                                ofFloat.addListener(new ei.k3(k40Var, zArr, n30Var, 7));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        k40 k40Var2 = this.b;
                        k40Var2.e1 = true ^ k40Var2.e1;
                        k40Var2.v();
                        break;
                }
            }
        });
        gi.l2 l2Var2 = new gi.l2(context);
        this.w = l2Var2;
        l2Var2.setScaleType(scaleType);
        linearLayout.addView(l2Var2, b8.mf.o(44, 44));
        l2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m30
            public final /* synthetic */ k40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k40 k40Var = this.b;
                        if (k40Var.K) {
                            if (k40Var.s0) {
                                Camera2Session camera2Session = k40Var.w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = k40Var.t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (k40Var.m0 != null) {
                                if (!k40Var.u0) {
                                    k40Var.u();
                                }
                                ch0 ch0Var = k40Var.F;
                                int i14 = 0;
                                if (ch0Var != null) {
                                    ch0Var.M(0);
                                    k40Var.F.start();
                                }
                                k40Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                n30 n30Var = new n30(k40Var, i14);
                                k40Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                k40Var.r0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r30(k40Var, zArr, n30Var));
                                ofFloat.addListener(new ei.k3(k40Var, zArr, n30Var, 7));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        k40 k40Var2 = this.b;
                        k40Var2.e1 = true ^ k40Var2.e1;
                        k40Var2.v();
                        break;
                }
            }
        });
        v();
        if (!z10) {
            n2Var.a(l2Var);
            n2Var.a(l2Var2);
        } else if (!e6Var.a()) {
            l2Var.setInvert(0.6f);
            l2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, b8.mf.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, getContext(), paint);
        this.r0 = lkVar;
        int i14 = org.telegram.messenger.g0.v;
        addView(lkVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.g1 = false;
        setVisibility(4);
    }

    public static int k(k40 k40Var, int i3, String str) {
        int glCreateShader = GLES20.glCreateShader(i3);
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

    public static boolean l() {
        if (!org.telegram.messenger.az.Y && org.telegram.messenger.az.o() < 1) {
            int o10 = org.telegram.messenger.az.o();
            if (org.telegram.messenger.az.a == -1) {
                int i3 = Build.VERSION.SDK_INT;
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
                if (i10 <= 2 || memoryClass <= 100 || ((i10 <= 4 && ceil != -1 && ceil <= 1250) || (i10 <= 4 && ceil <= 1300 && memoryClass <= 128 && i3 <= 24))) {
                    org.telegram.messenger.az.a = 0;
                } else if (i10 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2050) || (ceil == -1 && i10 == 8 && i3 <= 23))) {
                    org.telegram.messenger.az.a = 1;
                } else {
                    org.telegram.messenger.az.a = 2;
                }
            }
            if (Math.max(o10, org.telegram.messenger.az.a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i14 = 0;
                while (true) {
                    int[] iArr = m1;
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

    @Override // org.telegram.ui.Components.p40
    public final void a(boolean z10) {
        t();
        m51 m51Var = this.T;
        if (m51Var != null) {
            m51Var.m0();
            this.T = null;
        }
        if (this.q0 == null) {
            return;
        }
        this.l0 = true;
        this.j0 = false;
        this.e1 = false;
        v();
        org.telegram.messenger.hs.f(this.e).k(org.telegram.messenger.hs.n2, Integer.valueOf(this.V), Integer.valueOf(z10 ? 0 : 6));
        if (this.m0 != null) {
            q();
            this.m0.a(0, true, 0, 0, 0L);
            this.m0 = null;
        } else {
            c40 c40Var = this.i1;
            if (c40Var != null) {
                c40Var.i(0, new z30(0, 0, 0L, 0L, true));
            }
        }
        if (this.f0 != null) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.d("delete camera file by cancel");
            }
            this.f0.delete();
            org.telegram.messenger.z0.b(this.f0);
            this.f0 = null;
        }
        MediaController.B().Y(false);
        r(false, false);
        invalidate();
    }

    @Override // org.telegram.ui.Components.p40
    public final void b(float f10, int i3) {
        m51 m51Var = this.T;
        if (m51Var == null) {
            return;
        }
        if (i3 == 0) {
            s();
            this.T.h0();
        } else if (i3 == 1) {
            t();
            this.T.g0();
        } else if (i3 == 2) {
            m51Var.q0((long) (f10 * m51Var.U()), false);
        }
    }

    @Override // org.telegram.ui.Components.p40
    public final void c(boolean z10) {
        ViewGroup viewGroup;
        if (this.s0) {
            int i3 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.v0;
                if (i3 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i3];
                if (camera2Session != null) {
                    camera2Session.destroy(z10);
                    camera2SessionArr[i3] = null;
                }
                i3++;
            }
        } else {
            CameraSession cameraSession = this.t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.t0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        q30 q30Var = this.f;
        q30Var.setTranslationX(0.0f);
        this.r0.setTranslationX(0.0f);
        this.E0 = 0.0f;
        w();
        MediaController.B().c0();
        TextureView textureView = this.q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.q0);
        }
        this.q0 = null;
        q30Var.setImageReceiver(null);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.je jeVar = this.f0;
            if (jeVar == null || !jeVar.getAbsolutePath().equals(str)) {
                return;
            }
            this.M = (TLRPC.InputFile) objArr[1];
            this.N = (TLRPC.InputEncryptedFile) objArr[2];
            this.Q = ((Long) objArr[5]).longValue();
            if (this.N != null) {
                this.O = (byte[]) objArr[3];
                this.P = (byte[]) objArr[4];
            }
        }
    }

    @Override // org.telegram.ui.Components.p40
    public final boolean e() {
        return !this.j0;
    }

    @Override // org.telegram.ui.Components.p40
    public final void f(float f10) {
        this.D0 = f10 / 2.0f;
        w();
    }

    @Override // org.telegram.ui.Components.p40
    public final void g(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        int i12;
        long j12;
        if (this.q0 == null) {
            return;
        }
        t();
        m51 m51Var = this.T;
        if (m51Var != null) {
            m51Var.m0();
            this.T = null;
        }
        int i13 = this.e;
        if (i3 != 4) {
            this.l0 = this.k0 < 800;
            this.j0 = false;
            this.e1 = false;
            v();
            int i14 = this.l0 ? 4 : i3 == 3 ? 2 : 5;
            w30 w30Var = this.m0;
            int i15 = this.V;
            if (w30Var != null) {
                org.telegram.messenger.hs.f(i13).k(org.telegram.messenger.hs.n2, Integer.valueOf(i15), Integer.valueOf(i14));
                int i16 = this.l0 ? 0 : i3 == 3 ? 2 : 1;
                q();
                i12 = i15;
                this.m0.a(i16, z10, i10, i11, j10);
                this.m0 = null;
            } else {
                i12 = i15;
            }
            if (this.l0) {
                org.telegram.messenger.hs.f(i13).k(org.telegram.messenger.hs.t2, Integer.valueOf(i12), Boolean.TRUE, Integer.valueOf((int) this.k0));
                r(false, false);
                MediaController.B().Y(false);
                return;
            }
            return;
        }
        c40 c40Var = this.i1;
        if (c40Var != null && this.k0 > 800) {
            c40Var.i(1, new z30(i10, i11, j10, j11, z10));
            return;
        }
        boolean z11 = org.telegram.messenger.r2.a;
        if (!this.f0.exists()) {
            org.telegram.messenger.a8.g(new RuntimeException("file not found :( round video"), true);
        }
        if (this.S == null) {
            org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
            this.S = b20Var;
            b20Var.a = -1L;
            b20Var.b = -1L;
        }
        if (this.S.c()) {
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            org.telegram.messenger.b20 b20Var2 = this.S;
            long j13 = b20Var2.r;
            double d = j13;
            long j14 = b20Var2.a;
            if (j14 >= 0) {
                j12 = 0;
            } else {
                j14 = 0;
                j12 = 0;
            }
            long j15 = b20Var2.b;
            if (j15 >= j12) {
                j13 = j15;
            }
            long j16 = j13 - j14;
            b20Var2.r = j16;
            b20Var2.q = Math.max(1L, (long) ((j16 / d) * this.Q));
            org.telegram.messenger.b20 b20Var3 = this.S;
            b20Var3.m = 1000000;
            long j17 = b20Var3.a;
            if (j17 > j12) {
                b20Var3.a = j17 * 1000;
            }
            long j18 = b20Var3.b;
            if (j18 > j12) {
                b20Var3.b = j18 * 1000;
            }
            org.telegram.messenger.w7.G(i13).b(this.f0.getAbsolutePath(), false);
        } else {
            this.S.q = Math.max(1L, this.Q);
        }
        org.telegram.messenger.b20 b20Var4 = this.S;
        b20Var4.w = this.M;
        b20Var4.x = this.N;
        b20Var4.y = this.O;
        b20Var4.z = this.P;
        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, this.f0.getAbsolutePath(), 0, true, 0, 0);
        yeVar.x = i11;
        yeVar.y = j10;
        this.h.u(yeVar, this.S, z10, i10, 0, false, j11);
        if (i10 != 0) {
            r(false, false);
        }
        MediaController.B().Y(false);
    }

    @Override // org.telegram.ui.Components.p40
    public View getButtonsLayout() {
        return this.b1;
    }

    @Override // org.telegram.ui.Components.p40
    public RectF getCameraRect() {
        q30 q30Var = this.f;
        int[] iArr = this.a0;
        q30Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], q30Var.getWidth() + r3, q30Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.p40
    public View getMuteImageView() {
        return this.G;
    }

    @Override // org.telegram.ui.Components.p40
    public Paint getPaint() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.p40
    public TextureView getTextureView() {
        return this.q0;
    }

    @Override // org.telegram.ui.Components.p40
    public final void h(eh.c cVar, org.telegram.ui.ki kiVar) {
        LinearLayout linearLayout = this.b1;
        gh.g c2 = cVar.c(linearLayout, kiVar, false);
        c2.q(org.telegram.messenger.g0.L(6.0f));
        c2.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c2);
    }

    @Override // org.telegram.ui.Components.p40
    public final void i(boolean z10) {
        String absolutePath;
        m51 m51Var;
        if (this.q0 != null) {
            return;
        }
        int i3 = 0;
        if (this.F == null) {
            int i10 = this.c1;
            ch0 ch0Var = new ch0(R.raw.roundcamera_flip, i10, i10);
            this.F = ch0Var;
            ch0Var.M(0);
            this.F.setCallback(this.s);
        }
        this.s.setImageDrawable(this.F);
        this.r0.setAlpha(1.0f);
        this.r0.invalidate();
        if (this.U == null) {
            try {
                this.U = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.U;
        if (bitmap != null) {
            this.r0.setImageBitmap(bitmap);
        } else {
            this.r0.setImageResource(R.drawable.icplaceholder);
        }
        this.K = false;
        this.I = null;
        if (!z10) {
            if (!this.s0) {
                this.J = true;
            }
            v();
            this.k0 = 0L;
            this.H = 0.0f;
        }
        this.l0 = false;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.x0 = true;
        if (o()) {
            if (MediaController.B().v0 != null) {
                if (org.telegram.messenger.zi.M4(MediaController.B().v0.k) || MediaController.B().v0.i4()) {
                    MediaController.B().q(true, true, false, false);
                } else if (org.telegram.messenger.az.F0 && (m51Var = MediaController.B().j0) != null) {
                    m51Var.g0();
                }
            }
            if (!z10) {
                this.f0 = new org.telegram.messenger.je(2, org.telegram.messenger.w7.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.az.p() + ".mp4");
            }
            org.telegram.messenger.az.y();
            org.telegram.messenger.je jeVar = this.f0;
            Set set = org.telegram.messenger.z0.a;
            if (jeVar != null && (absolutePath = jeVar.getAbsolutePath()) != null) {
                org.telegram.messenger.z0.a.add(absolutePath);
            }
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("InstantCamera show round camera " + this.f0.getAbsolutePath());
            }
            if (this.s0) {
                Context context = getContext();
                boolean z11 = org.telegram.messenger.hp.e1().getBoolean("rounddual_available", org.telegram.messenger.az.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.az.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.u0 = z11;
                if (z11) {
                    int i11 = 0;
                    while (i11 < 2) {
                        Camera2Session[] camera2SessionArr = this.v0;
                        if (camera2SessionArr[i11] == null) {
                            camera2SessionArr[i11] = Camera2Session.create(i11 == 0, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).w3, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).w3);
                            Camera2Session camera2Session = this.v0[i11];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.n0[i11] = new Size(this.v0[i11].getPreviewWidth(), this.v0[i11].getPreviewHeight());
                            }
                        }
                        i11++;
                    }
                    v();
                    Camera2Session[] camera2SessionArr2 = this.v0;
                    boolean z12 = this.J;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.w0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.u0 = false;
                    }
                    if (org.telegram.messenger.r2.a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                        sb2.append(this.u0);
                        sb2.append(", initialFacing=");
                        sb2.append(this.J ? "FRONT" : "BACK");
                        sb2.append(", frontSession=");
                        sb2.append(this.v0[0] != null);
                        sb2.append(", backSession=");
                        sb2.append(this.v0[1] != null);
                        org.telegram.messenger.a8.b(sb2.toString());
                    }
                    if (this.w0 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.v0;
                    boolean z13 = this.J;
                    int i12 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).w3, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).w3);
                    camera2SessionArr3[i12] = create;
                    this.w0 = create;
                    if (create == null) {
                        return;
                    }
                    create.setRecordingVideo(true);
                    this.n0[0] = new Size(this.w0.getPreviewWidth(), this.w0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.q0 = textureView;
            textureView.setSurfaceTextureListener(new s30(this, i3));
            this.f.addView(this.q0, b8.mf.c(-1.0f, -1));
            this.Y0 = true;
            this.g1 = z10;
            setVisibility(0);
            r(true, z10);
            MediaController.B().Y(true);
        }
    }

    @Override // org.telegram.ui.Components.p40
    public final void j() {
        if (!this.j0) {
            c40 c40Var = this.i1;
            if (c40Var != null) {
                c40Var.U.sendMessage(c40Var.U.obtainMessage(5));
                c(false);
                m51 m51Var = this.T;
                if (m51Var != null) {
                    m51Var.m0();
                    this.T = null;
                }
                i(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.f2(this.h.getParentActivity());
                invalidate();
                org.telegram.messenger.hs.f(this.e).k(org.telegram.messenger.hs.p2, new Object[0]);
                return;
            }
            return;
        }
        this.l0 = this.k0 < 800;
        this.j0 = false;
        v();
        if (this.m0 != null) {
            org.telegram.messenger.hs.f(this.e).k(org.telegram.messenger.hs.n2, Integer.valueOf(this.V), Integer.valueOf(this.l0 ? 4 : 2));
            q();
            w30 w30Var = this.m0;
            boolean z10 = this.l0;
            w30Var.a(z10 ? 0 : 2, true, 0, z10 ? 0 : -2, 0L);
            this.m0 = null;
        }
        if (!this.l0) {
            c40 c40Var2 = this.i1;
            c40Var2.U.sendMessage(c40Var2.U.obtainMessage(4));
        } else {
            org.telegram.messenger.hs.f(this.e).k(org.telegram.messenger.hs.t2, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.k0));
            r(false, false);
            MediaController.B().Y(false);
        }
    }

    public final Size m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i3 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : l() ? 1440 : 1200;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (Math.max(((Size) arrayList.get(i10)).mHeight, ((Size) arrayList.get(i10)).mWidth) <= i3 && Math.min(((Size) arrayList.get(i10)).mHeight, ((Size) arrayList.get(i10)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i10));
            }
        }
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.messenger.tq(29));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.p0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, org.telegram.messenger.hs.t4, size, false);
    }

    public final void n() {
        float min;
        if (this.l1 != null) {
            return;
        }
        if (this.s0) {
            Camera2Session camera2Session = this.w0;
            if (camera2Session == null) {
                return;
            } else {
                min = Utilities.i(this.S0, camera2Session.getMaxZoom(), this.w0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.S0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.l1 = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 26));
            this.l1.addListener(new o30(this, 1));
            this.l1.setDuration(350L);
            this.l1.setInterpolator(xq.f);
            this.l1.start();
        }
    }

    public final boolean o() {
        int i3;
        int i10;
        if (!this.s0) {
            ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
            if (cameras != null) {
                CameraInfo cameraInfo = null;
                int i11 = 0;
                while (i11 < cameras.size()) {
                    CameraInfo cameraInfo2 = cameras.get(i11);
                    if (!cameraInfo2.isFrontface()) {
                        cameraInfo = cameraInfo2;
                    }
                    if ((this.J && cameraInfo2.isFrontface()) || (!this.J && !cameraInfo2.isFrontface())) {
                        this.I = cameraInfo2;
                        break;
                    }
                    i11++;
                    cameraInfo = cameraInfo2;
                }
                if (this.I == null) {
                    this.I = cameraInfo;
                }
                CameraInfo cameraInfo3 = this.I;
                if (cameraInfo3 != null) {
                    ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
                    ArrayList<Size> pictureSizes = this.I.getPictureSizes();
                    Size m10 = m(previewSizes);
                    Size[] sizeArr = this.n0;
                    sizeArr[0] = m10;
                    Size m11 = m(pictureSizes);
                    this.o0 = m11;
                    if (sizeArr[0].mWidth != m11.mWidth) {
                        boolean z10 = false;
                        for (int size = previewSizes.size() - 1; size >= 0; size--) {
                            Size size2 = previewSizes.get(size);
                            int size3 = pictureSizes.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    break;
                                }
                                Size size4 = pictureSizes.get(size3);
                                int i12 = size2.mWidth;
                                Size size5 = this.o0;
                                if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.o0 = size4;
                                    z10 = true;
                                    break;
                                }
                                size3--;
                            }
                            if (z10) {
                                break;
                            }
                        }
                        if (!z10) {
                            for (int size6 = previewSizes.size() - 1; size6 >= 0; size6--) {
                                Size size7 = previewSizes.get(size6);
                                int size8 = pictureSizes.size() - 1;
                                while (true) {
                                    if (size8 < 0) {
                                        break;
                                    }
                                    Size size9 = pictureSizes.get(size8);
                                    int i13 = size7.mWidth;
                                    if (i13 >= 360 && (i3 = size7.mHeight) >= 360 && i13 == size9.mWidth && i3 == size9.mHeight) {
                                        sizeArr[0] = size7;
                                        this.o0 = size9;
                                        z10 = true;
                                        break;
                                    }
                                    size8--;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                        }
                    }
                    if (org.telegram.messenger.r2.a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        k2.p1.q(sizeArr[0].mHeight, sb2);
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.e).c(this, org.telegram.messenger.hs.U1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.e).n(this, org.telegram.messenger.hs.U1);
        gi.n2 n2Var = this.x;
        if (n2Var != null) {
            n2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        q30 q30Var = this.f;
        float x10 = q30Var.getX();
        float y9 = q30Var.getY();
        RectF rectF = this.r;
        rectF.set(x10 - org.telegram.messenger.g0.L(8.0f), y9 - org.telegram.messenger.g0.L(8.0f), x10 + q30Var.getMeasuredWidth() + org.telegram.messenger.g0.L(8.0f), y9 + q30Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        if (this.j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.h0) + this.i0;
            this.k0 = currentTimeMillis;
            this.H = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.O0) {
                canvas.scale(q30Var.getScaleX(), q30Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.n);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.Y0) {
            int i11 = ((float) (View.MeasureSpec.getSize(i10) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i3)) * 1.3f ? org.telegram.messenger.g0.v : org.telegram.messenger.g0.u;
            if (i11 != this.X0) {
                this.X0 = i11;
                org.telegram.ui.lk lkVar = this.r0;
                ViewGroup.LayoutParams layoutParams = lkVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = lkVar.getLayoutParams();
                int i12 = this.X0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                q30 q30Var = this.f;
                ViewGroup.LayoutParams layoutParams3 = q30Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = q30Var.getLayoutParams();
                int i13 = this.X0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.X0 / 2) - org.telegram.messenger.g0.L(24.0f);
                lkVar.setRoundRadius(this.X0 / 2);
                q30Var.invalidateOutline();
            }
            this.Y0 = false;
        }
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        gi.n2 n2Var = this.x;
        n2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (getVisibility() != 0) {
            this.E0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m51 m51Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (m51Var = this.T) != null) {
            boolean c02 = m51Var.c0();
            this.T.t0(!c02);
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            float[] fArr = {!c02 ? 1.0f : 0.0f};
            ImageView imageView = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !c02 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, c02 ? 0.5f : 1.0f));
            this.L.addListener(new o30(this, 0));
            this.L.setDuration(180L);
            this.L.setInterpolator(new DecelerateInterpolator());
            this.L.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.U0 && !this.T0 && motionEvent.getPointerCount() == 2 && this.l1 == null && this.j0) {
                this.R0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.S0 = 1.0f;
                this.V0 = motionEvent.getPointerId(0);
                this.W0 = motionEvent.getPointerId(1);
                this.T0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                q30 q30Var = this.f;
                rectF.set(q30Var.getX(), q30Var.getY(), q30Var.getX() + q30Var.getMeasuredWidth(), q30Var.getY() + q30Var.getMeasuredHeight());
                this.U0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.T0) {
            int i3 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (this.V0 == motionEvent.getPointerId(i11)) {
                    i3 = i11;
                }
                if (this.W0 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i3 == -1 || i10 == -1) {
                this.T0 = false;
                n();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i3), motionEvent.getY(i10) - motionEvent.getY(i3))) / this.R0;
            this.S0 = hypot;
            if (!this.s0) {
                this.t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.w0;
            if (camera2Session != null) {
                this.w0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.w0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.V0 == motionEvent.getPointerId(0) && this.W0 == motionEvent.getPointerId(1)) || (this.V0 == motionEvent.getPointerId(1) && this.W0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.T0) {
            this.T0 = false;
            n();
            return true;
        }
        return true;
    }

    public final void p(String str) {
        if (org.telegram.messenger.r2.a) {
            long j10 = this.y0;
            org.telegram.messenger.a8.b("InstantCamera legacy switch[" + this.z0 + "] " + str + ", path=" + this.C0 + ", elapsedMs=" + (j10 != 0 ? (SystemClock.elapsedRealtimeNanos() - j10) / 1000000 : 0L) + ", thread=" + Thread.currentThread().getName());
        }
    }

    public final void q() {
        Bitmap bitmap = this.q0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.q0.getBitmap(), 50, 50, true);
        this.U = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                this.U.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        l40 l40Var = this.a;
        if (l40Var != null) {
            ((org.telegram.ui.de) l40Var).b.ad.a(z10, true);
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.lk lkVar = this.r0;
        q30 q30Var = this.f;
        if (z10 && !this.Q0) {
            q30Var.setTranslationX(0.0f);
            lkVar.setTranslationX(0.0f);
            this.E0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            w();
        }
        this.Q0 = z10;
        View view = this.P0;
        if (view != null) {
            view.invalidate();
        }
        this.e0 = new AnimatorSet();
        float L = (z10 || this.k0 <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new dh.u(7, this, z11));
        AnimatorSet animatorSet2 = this.e0;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.b1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.n, k6.b, z10 ? org.telegram.messenger.hs.e4 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) property, z10 ? 1.0f : 0.0f);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) property2, f10);
        float f11 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) property3, f11);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) property4, L), ObjectAnimator.ofFloat(lkVar, (Property<org.telegram.ui.lk, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lkVar, (Property<org.telegram.ui.lk, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(lkVar, (Property<org.telegram.ui.lk, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(lkVar, (Property<org.telegram.ui.lk, Float>) property4, L), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.e0.addListener(new o30(this, 2));
        }
        this.e0.setDuration(180L);
        this.e0.setInterpolator(new DecelerateInterpolator());
        this.e0.start();
    }

    public final void s() {
        Timer timer = this.h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.h1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        Timer timer2 = new Timer();
        this.h1 = timer2;
        timer2.schedule(new g6.q(this, 3), 0L, 17L);
    }

    @Override // org.telegram.ui.Components.p40
    public void setInternalPadding(int i3) {
        setPadding(0, 0, 0, i3);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        this.b1.setAlpha(0.0f);
        q30 q30Var = this.f;
        q30Var.setAlpha(0.0f);
        org.telegram.ui.lk lkVar = this.r0;
        lkVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        q30Var.setScaleX(this.g1 ? 1.0f : 0.1f);
        q30Var.setScaleY(this.g1 ? 1.0f : 0.1f);
        lkVar.setScaleX(this.g1 ? 1.0f : 0.1f);
        lkVar.setScaleY(this.g1 ? 1.0f : 0.1f);
        if (q30Var.getMeasuredWidth() != 0) {
            q30Var.setPivotX(q30Var.getMeasuredWidth() / 2);
            q30Var.setPivotY(q30Var.getMeasuredHeight() / 2);
            lkVar.setPivotX(lkVar.getMeasuredWidth() / 2);
            lkVar.setPivotY(lkVar.getMeasuredHeight() / 2);
        }
        try {
            if (i3 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t() {
        Timer timer = this.h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.h1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void u() {
        this.y0 = SystemClock.elapsedRealtimeNanos();
        this.z0++;
        this.A0 = (this.s0 && this.u0) ? 1 - this.k1 : 0;
        this.B0 = true;
        this.C0 = this.s0 ? this.u0 ? "DUAL_PREOPENED" : "SEQUENTIAL_CAMERA2" : "SEQUENTIAL_CAMERA1";
        StringBuilder sb2 = new StringBuilder("requested: from=");
        sb2.append(this.J ? "FRONT" : "BACK");
        sb2.append(", to=");
        sb2.append(this.J ? "BACK" : "FRONT");
        sb2.append(", currentSurface=");
        sb2.append(this.k1);
        sb2.append(", targetSurface=");
        sb2.append(this.A0);
        p(sb2.toString());
        if (!this.s0 || !this.u0) {
            q();
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.x0 = false;
                this.r0.setImageBitmap(bitmap);
                this.r0.setAlpha(1.0f);
            }
        }
        this.J = !this.J;
        v();
        if (!this.s0) {
            CameraSession cameraSession = this.t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.t0, null, null);
                this.t0 = null;
            }
        } else {
            if (this.u0) {
                this.w0 = this.v0[!this.J ? 1 : 0];
                w30 w30Var = this.m0;
                Handler handler = w30Var.getHandler();
                if (handler != null) {
                    w30Var.sendMessage(handler.obtainMessage(4), 0);
                    w30Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.w0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.w0 = null;
                this.v0[this.J ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.v0;
            boolean z10 = this.J;
            int i3 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).w3, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).w3);
            camera2SessionArr[i3] = create;
            this.w0 = create;
            if (create == null) {
                this.B0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.n0[0] = new Size(this.w0.getPreviewWidth(), this.w0.getPreviewHeight());
            w30 w30Var2 = this.m0;
            Camera2Session camera2Session2 = this.w0;
            Handler handler2 = w30Var2.getHandler();
            if (handler2 != null) {
                w30Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        o();
        this.K = false;
        w30 w30Var3 = this.m0;
        Handler handler3 = w30Var3.getHandler();
        if (handler3 != null) {
            w30Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10 = this.e1 && this.j0 && this.J;
        if (this.f1 != z10) {
            this.f1 = z10;
            gi.n2 n2Var = this.x;
            if (z10) {
                n2Var.c(null);
            } else {
                n2Var.d();
            }
        }
        if (this.s0) {
            Camera2Session camera2Session = this.v0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.e1 && !this.J && this.j0);
            }
        } else {
            CameraSession cameraSession = this.t0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.e1 && !this.J && this.j0);
            }
        }
        gi.l2 l2Var = this.w;
        if (l2Var != null) {
            Boolean bool = this.d1;
            if (bool == null || bool.booleanValue() != this.e1) {
                l2Var.setContentDescription(org.telegram.messenger.bd.M0(this.e1 ? 2131754914 : 2131754913, null));
                boolean z11 = this.e1;
                int i3 = this.c1;
                if (z11) {
                    if (this.E == null) {
                        ch0 ch0Var = new ch0(R.raw.roundcamera_flash_off, i3, i3);
                        this.E = ch0Var;
                        ch0Var.setCallback(l2Var);
                    }
                    l2Var.setImageDrawable(this.E);
                    if (this.d1 == null) {
                        ch0 ch0Var2 = this.E;
                        ch0Var2.M(ch0Var2.e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                } else {
                    if (this.y == null) {
                        ch0 ch0Var3 = new ch0(R.raw.roundcamera_flash_on, i3, i3);
                        this.y = ch0Var3;
                        ch0Var3.setCallback(l2Var);
                    }
                    l2Var.setImageDrawable(this.y);
                    if (this.d1 == null) {
                        ch0 ch0Var4 = this.y;
                        ch0Var4.M(ch0Var4.e[0] - 1);
                    } else {
                        this.y.M(0);
                        this.y.start();
                    }
                }
                this.d1 = Boolean.valueOf(this.e1);
            }
        }
    }

    public final void w() {
        this.r0.setTranslationY(this.E0 + this.D0);
        this.f.setTranslationY(this.E0 + this.D0);
    }

    @Override // org.telegram.ui.Components.p40
    public y30 getCameraContainer() {
        return this.f;
    }

    @Override // org.telegram.ui.Components.p40
    public void setIsMessageTransition(boolean z10) {
    }
}
