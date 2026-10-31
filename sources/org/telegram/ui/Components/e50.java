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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e50 extends j50 implements org.telegram.messenger.us {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public bi0 D;
    public float D0;
    public bi0 E;
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
    public org.telegram.messenger.x20 R;
    public float R0;
    public u61 S;
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
    public final org.telegram.ui.ActionBar.p6 Y0;
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
    public final m40 f;
    public File f0;
    public boolean f1;
    public long g0;
    public Timer g1;
    public final s40 h;
    public long h0;
    public x40 h1;
    public boolean i0;
    public Bitmap i1;
    public long j0;
    public volatile int j1;
    public boolean k0;
    public ValueAnimator k1;
    public r40 l0;
    public final Size[] m0;
    public final l40 n;
    public Size n0;
    public final Size o0;
    public TextureView p0;
    public final org.telegram.ui.ll q0;
    public final RectF r;
    public final boolean r0;
    public final vh.x1 s;
    public CameraSession s0;
    public boolean t0;
    public final Camera2Session[] u0;
    public Camera2Session v0;
    public final vh.x1 w;
    public boolean w0;
    public final vh.z1 x;
    public volatile long x0;
    public bi0 y;
    public volatile int y0;
    public volatile int z0;

    public e50(Context context, s40 s40Var, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i10 = org.telegram.messenger.d20.s0;
        this.e = i10;
        final int i11 = 1;
        this.I = true;
        this.W = new int[2];
        this.a0 = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.b0 = new int[1];
        this.c0 = 1.0f;
        this.m0 = new Size[2];
        int i12 = 3;
        this.o0 = org.telegram.messenger.tz.z0 ? new Size(16, 9) : new Size(4, 3);
        this.r0 = org.telegram.messenger.tz.s(i10);
        this.u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.b1 = org.telegram.messenger.i0.L(z10 ? 24.0f : 28.0f);
        this.Y0 = p6Var;
        this.O0 = s40Var.getFragmentView();
        final int i13 = 0;
        setWillNotDraw(false);
        this.h = s40Var;
        this.U = s40Var.getClassGuid();
        this.Q = s40Var.z();
        l40 l40Var = new l40(this, i13);
        this.n = l40Var;
        l40Var.setStyle(Paint.Style.STROKE);
        l40Var.setStrokeCap(Paint.Cap.ROUND);
        l40Var.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        l40Var.setColor(-1);
        this.r = new RectF();
        vh.z1 z1Var = new vh.z1(getContext(), null, this, null);
        this.x = z1Var;
        z1Var.o = 0.5f;
        z1Var.n = vh.z1.f(0.5f);
        z1Var.g();
        addView(z1Var.b, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        m40 m40Var = new m40(this, context);
        this.f = m40Var;
        m40Var.setOutlineProvider(new org.telegram.ui.ol(this, i12));
        m40Var.setClipToOutline(true);
        m40Var.setWillNotDraw(false);
        int i14 = org.telegram.messenger.i0.v;
        addView(m40Var, new FrameLayout.LayoutParams(i14, i14, 17));
        addView(z1Var.c, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        vh.x1 x1Var = new vh.x1(context);
        this.s = x1Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        x1Var.setScaleType(scaleType);
        x1Var.setContentDescription(org.telegram.messenger.cd.L0(2131754752, null));
        linearLayout.addView(x1Var, w7.b6.o(44, 44));
        x1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i40
            public final /* synthetic */ e50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        e50 e50Var = this.b;
                        if (e50Var.J) {
                            if (e50Var.r0) {
                                Camera2Session camera2Session = e50Var.v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = e50Var.s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (e50Var.l0 != null) {
                                if (!e50Var.t0) {
                                    e50Var.u();
                                }
                                bi0 bi0Var = e50Var.E;
                                int i15 = 0;
                                if (bi0Var != null) {
                                    bi0Var.M(0);
                                    e50Var.E.start();
                                }
                                e50Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(gr.h);
                                boolean[] zArr = new boolean[1];
                                j40 j40Var = new j40(e50Var, i15);
                                e50Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                e50Var.q0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new n40(e50Var, zArr, j40Var));
                                ofFloat.addListener(new org.telegram.ui.ActionBar.g1(e50Var, zArr, j40Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        e50 e50Var2 = this.b;
                        e50Var2.d1 = true ^ e50Var2.d1;
                        e50Var2.v();
                        break;
                }
            }
        });
        vh.x1 x1Var2 = new vh.x1(context);
        this.w = x1Var2;
        x1Var2.setScaleType(scaleType);
        linearLayout.addView(x1Var2, w7.b6.o(44, 44));
        x1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i40
            public final /* synthetic */ e50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e50 e50Var = this.b;
                        if (e50Var.J) {
                            if (e50Var.r0) {
                                Camera2Session camera2Session = e50Var.v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = e50Var.s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (e50Var.l0 != null) {
                                if (!e50Var.t0) {
                                    e50Var.u();
                                }
                                bi0 bi0Var = e50Var.E;
                                int i15 = 0;
                                if (bi0Var != null) {
                                    bi0Var.M(0);
                                    e50Var.E.start();
                                }
                                e50Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(gr.h);
                                boolean[] zArr = new boolean[1];
                                j40 j40Var = new j40(e50Var, i15);
                                e50Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                e50Var.q0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new n40(e50Var, zArr, j40Var));
                                ofFloat.addListener(new org.telegram.ui.ActionBar.g1(e50Var, zArr, j40Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        e50 e50Var2 = this.b;
                        e50Var2.d1 = true ^ e50Var2.d1;
                        e50Var2.v();
                        break;
                }
            }
        });
        v();
        if (!z10) {
            z1Var.a(x1Var);
            z1Var.a(x1Var2);
        } else if (!p6Var.a()) {
            x1Var.setInvert(0.6f);
            x1Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.b6.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.b.o(-16777216, 40));
        org.telegram.ui.ll llVar = new org.telegram.ui.ll(this, getContext(), paint);
        this.q0 = llVar;
        int i15 = org.telegram.messenger.i0.v;
        addView(llVar, new FrameLayout.LayoutParams(i15, i15, 17));
        this.f1 = false;
        setVisibility(4);
    }

    public static int k(e50 e50Var, int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static boolean l() {
        if (!org.telegram.messenger.tz.Y && org.telegram.messenger.tz.o() < 1) {
            int o10 = org.telegram.messenger.tz.o();
            if (org.telegram.messenger.tz.a == -1) {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.w0.b.getSystemService("activity")).getMemoryClass();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    try {
                        Locale locale = Locale.ENGLISH;
                        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i14 + "/cpufreq/cpuinfo_max_freq", "r");
                        String readLine = randomAccessFile.readLine();
                        if (readLine != null) {
                            i13 += Utilities.z(readLine).intValue() / 1000;
                            i12++;
                        }
                        randomAccessFile.close();
                    } catch (Throwable unused) {
                    }
                }
                int ceil = i12 == 0 ? -1 : (int) Math.ceil(i13 / i12);
                if (i11 <= 2 || memoryClass <= 100 || ((i11 <= 4 && ceil != -1 && ceil <= 1250) || (i11 <= 4 && ceil <= 1300 && memoryClass <= 128 && i10 <= 24))) {
                    org.telegram.messenger.tz.a = 0;
                } else if (i11 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2050) || (ceil == -1 && i11 == 8 && i10 <= 23))) {
                    org.telegram.messenger.tz.a = 1;
                } else {
                    org.telegram.messenger.tz.a = 2;
                }
            }
            if (Math.max(o10, org.telegram.messenger.tz.a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i15 = 0;
                while (true) {
                    int[] iArr = l1;
                    if (i15 >= 2) {
                        return false;
                    }
                    if (iArr[i15] == hashCode) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.j50
    public final void a(boolean z10) {
        t();
        u61 u61Var = this.S;
        if (u61Var != null) {
            u61Var.m0();
            this.S = null;
        }
        if (this.p0 == null) {
            return;
        }
        this.k0 = true;
        this.i0 = false;
        this.d1 = false;
        v();
        org.telegram.messenger.zs.f(this.e).k(org.telegram.messenger.zs.n2, Integer.valueOf(this.U), Integer.valueOf(z10 ? 0 : 6));
        if (this.l0 != null) {
            q();
            this.l0.a(0, true, 0, 0, 0L);
            this.l0 = null;
        } else {
            x40 x40Var = this.h1;
            if (x40Var != null) {
                x40Var.i(0, new u40(0, 0, 0L, 0L, true));
            }
        }
        if (this.e0 != null) {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.d("delete camera file by cancel");
            }
            this.e0.delete();
            org.telegram.messenger.c1.b(this.e0);
            this.e0 = null;
        }
        MediaController.B().Y(false);
        r(false, false);
        invalidate();
    }

    @Override // org.telegram.ui.Components.j50
    public final void b(float f7, int i10) {
        u61 u61Var = this.S;
        if (u61Var == null) {
            return;
        }
        if (i10 == 0) {
            s();
            this.S.h0();
        } else if (i10 == 1) {
            t();
            this.S.g0();
        } else if (i10 == 2) {
            u61Var.q0((long) (f7 * u61Var.U()), false);
        }
    }

    @Override // org.telegram.ui.Components.j50
    public final void c(boolean z10) {
        ViewGroup viewGroup;
        if (this.r0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.u0;
                if (i10 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i10];
                if (camera2Session != null) {
                    camera2Session.destroy(z10);
                    camera2SessionArr[i10] = null;
                }
                i10++;
            }
        } else {
            CameraSession cameraSession = this.s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.s0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        m40 m40Var = this.f;
        m40Var.setTranslationX(0.0f);
        this.q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        w();
        MediaController.B().c0();
        TextureView textureView = this.p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.p0);
        }
        this.p0 = null;
        m40Var.setImageReceiver(null);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.U1) {
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

    @Override // org.telegram.ui.Components.j50
    public final boolean e() {
        return !this.i0;
    }

    @Override // org.telegram.ui.Components.j50
    public final void f(float f7) {
        this.C0 = f7 / 2.0f;
        w();
    }

    @Override // org.telegram.ui.Components.j50
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        int i13;
        long j12;
        if (this.p0 == null) {
            return;
        }
        t();
        u61 u61Var = this.S;
        if (u61Var != null) {
            u61Var.m0();
            this.S = null;
        }
        int i14 = this.e;
        if (i10 != 4) {
            this.k0 = this.j0 < 800;
            this.i0 = false;
            this.d1 = false;
            v();
            int i15 = this.k0 ? 4 : i10 == 3 ? 2 : 5;
            r40 r40Var = this.l0;
            int i16 = this.U;
            if (r40Var != null) {
                org.telegram.messenger.zs.f(i14).k(org.telegram.messenger.zs.n2, Integer.valueOf(i16), Integer.valueOf(i15));
                int i17 = this.k0 ? 0 : i10 == 3 ? 2 : 1;
                q();
                i13 = i16;
                this.l0.a(i17, z10, i11, i12, j10);
                this.l0 = null;
            } else {
                i13 = i16;
            }
            if (this.k0) {
                org.telegram.messenger.zs.f(i14).k(org.telegram.messenger.zs.t2, Integer.valueOf(i13), Boolean.TRUE, Integer.valueOf((int) this.j0));
                r(false, false);
                MediaController.B().Y(false);
                return;
            }
            return;
        }
        x40 x40Var = this.h1;
        if (x40Var != null && this.j0 > 800) {
            x40Var.i(1, new u40(i11, i12, j10, j11, z10));
            return;
        }
        boolean z11 = org.telegram.messenger.v2.a;
        if (!this.e0.exists()) {
            org.telegram.messenger.f8.g(new RuntimeException("file not found :( round video"), true);
        }
        if (this.R == null) {
            org.telegram.messenger.x20 x20Var = new org.telegram.messenger.x20();
            this.R = x20Var;
            x20Var.a = -1L;
            x20Var.b = -1L;
        }
        if (this.R.c()) {
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            org.telegram.messenger.x20 x20Var2 = this.R;
            long j13 = x20Var2.r;
            double d = j13;
            long j14 = x20Var2.a;
            if (j14 >= 0) {
                j12 = 0;
            } else {
                j14 = 0;
                j12 = 0;
            }
            long j15 = x20Var2.b;
            if (j15 >= j12) {
                j13 = j15;
            }
            long j16 = j13 - j14;
            x20Var2.r = j16;
            x20Var2.q = Math.max(1L, (long) ((j16 / d) * this.P));
            org.telegram.messenger.x20 x20Var3 = this.R;
            x20Var3.m = 1000000;
            long j17 = x20Var3.a;
            if (j17 > j12) {
                x20Var3.a = j17 * 1000;
            }
            long j18 = x20Var3.b;
            if (j18 > j12) {
                x20Var3.b = j18 * 1000;
            }
            org.telegram.messenger.b8.G(i14).b(this.e0.getAbsolutePath(), false);
        } else {
            this.R.q = Math.max(1L, this.P);
        }
        org.telegram.messenger.x20 x20Var4 = this.R;
        x20Var4.w = this.L;
        x20Var4.x = this.M;
        x20Var4.y = this.N;
        x20Var4.z = this.O;
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, this.e0.getAbsolutePath(), 0, true, 0, 0);
        efVar.x = i12;
        efVar.y = j10;
        this.h.t(efVar, this.R, z10, i11, 0, false, j11);
        if (i11 != 0) {
            r(false, false);
        }
        MediaController.B().Y(false);
    }

    @Override // org.telegram.ui.Components.j50
    public View getButtonsLayout() {
        return this.a1;
    }

    @Override // org.telegram.ui.Components.j50
    public RectF getCameraRect() {
        m40 m40Var = this.f;
        int[] iArr = this.W;
        m40Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], m40Var.getWidth() + r3, m40Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.j50
    public View getMuteImageView() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.j50
    public Paint getPaint() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.j50
    public TextureView getTextureView() {
        return this.p0;
    }

    @Override // org.telegram.ui.Components.j50
    public final void h(tg.b bVar, org.telegram.ui.jj jjVar) {
        LinearLayout linearLayout = this.a1;
        vg.f c10 = bVar.c(linearLayout, jjVar, false);
        c10.p(org.telegram.messenger.i0.L(6.0f));
        c10.q(org.telegram.messenger.i0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.j50
    public final void i(boolean z10) {
        String absolutePath;
        u61 u61Var;
        if (this.p0 != null) {
            return;
        }
        if (this.E == null) {
            int i10 = this.b1;
            bi0 bi0Var = new bi0(R.raw.roundcamera_flip, i10, i10);
            this.E = bi0Var;
            bi0Var.M(0);
            this.E.setCallback(this.s);
        }
        this.s.setImageDrawable(this.E);
        this.q0.setAlpha(1.0f);
        this.q0.invalidate();
        if (this.T == null) {
            try {
                this.T = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "icthumb.jpg").getAbsolutePath());
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
        if (!z10) {
            if (!this.r0) {
                this.I = true;
            }
            v();
            this.j0 = 0L;
            this.G = 0.0f;
        }
        this.k0 = false;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.w0 = true;
        if (o()) {
            if (MediaController.B().u0 != null) {
                if (org.telegram.messenger.jj.L4(MediaController.B().u0.k) || MediaController.B().u0.h4()) {
                    MediaController.B().q(true, true, false, false);
                } else if (org.telegram.messenger.tz.F0 && (u61Var = MediaController.B().i0) != null) {
                    u61Var.g0();
                }
            }
            int i11 = 2;
            if (!z10) {
                this.e0 = new org.telegram.messenger.pe(2, org.telegram.messenger.b8.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.tz.p() + ".mp4");
            }
            org.telegram.messenger.tz.y();
            org.telegram.messenger.pe peVar = this.e0;
            Set set = org.telegram.messenger.c1.a;
            if (peVar != null && (absolutePath = peVar.getAbsolutePath()) != null) {
                org.telegram.messenger.c1.a.add(absolutePath);
            }
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("InstantCamera show round camera " + this.e0.getAbsolutePath());
            }
            if (this.r0) {
                Context context = getContext();
                boolean z11 = org.telegram.messenger.vp.d1().getBoolean("rounddual_available", org.telegram.messenger.tz.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.tz.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.t0 = z11;
                if (z11) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.u0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).v3, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).v3);
                            Camera2Session camera2Session = this.u0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.m0[i12] = new Size(this.u0[i12].getPreviewWidth(), this.u0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    v();
                    Camera2Session[] camera2SessionArr2 = this.u0;
                    boolean z12 = this.I;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.v0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.t0 = false;
                    }
                    if (org.telegram.messenger.v2.a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                        sb2.append(this.t0);
                        sb2.append(", initialFacing=");
                        sb2.append(this.I ? "FRONT" : "BACK");
                        sb2.append(", frontSession=");
                        sb2.append(this.u0[0] != null);
                        sb2.append(", backSession=");
                        sb2.append(this.u0[1] != null);
                        org.telegram.messenger.f8.b(sb2.toString());
                    }
                    if (this.v0 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.u0;
                    boolean z13 = this.I;
                    int i13 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).v3, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).v3);
                    camera2SessionArr3[i13] = create;
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
            textureView.setSurfaceTextureListener(new li.e(this, i11));
            this.f.addView(this.p0, w7.b6.c(-1.0f, -1));
            this.X0 = true;
            this.f1 = z10;
            setVisibility(0);
            r(true, z10);
            MediaController.B().Y(true);
        }
    }

    @Override // org.telegram.ui.Components.j50
    public final void j() {
        if (!this.i0) {
            x40 x40Var = this.h1;
            if (x40Var != null) {
                x40Var.T.sendMessage(x40Var.T.obtainMessage(5));
                c(false);
                u61 u61Var = this.S;
                if (u61Var != null) {
                    u61Var.m0();
                    this.S = null;
                }
                i(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.f2(this.h.getParentActivity());
                invalidate();
                org.telegram.messenger.zs.f(this.e).k(org.telegram.messenger.zs.p2, new Object[0]);
                return;
            }
            return;
        }
        this.k0 = this.j0 < 800;
        this.i0 = false;
        v();
        if (this.l0 != null) {
            org.telegram.messenger.zs.f(this.e).k(org.telegram.messenger.zs.n2, Integer.valueOf(this.U), Integer.valueOf(this.k0 ? 4 : 2));
            q();
            r40 r40Var = this.l0;
            boolean z10 = this.k0;
            r40Var.a(z10 ? 0 : 2, true, 0, z10 ? 0 : -2, 0L);
            this.l0 = null;
        }
        if (!this.k0) {
            x40 x40Var2 = this.h1;
            x40Var2.T.sendMessage(x40Var2.T.obtainMessage(4));
        } else {
            org.telegram.messenger.zs.f(this.e).k(org.telegram.messenger.zs.t2, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.j0));
            r(false, false);
            MediaController.B().Y(false);
        }
    }

    public final Size m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : l() ? 1440 : 1200;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.ui.f6(11));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.o0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, org.telegram.messenger.zs.t4, size, false);
    }

    public final void n() {
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
            ofFloat.addUpdateListener(new a6(this, 26));
            this.k1.addListener(new k40(this, 1));
            this.k1.setDuration(350L);
            this.k1.setInterpolator(gr.f);
            this.k1.start();
        }
    }

    public final boolean o() {
        int i10;
        int i11;
        if (!this.r0) {
            ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
            if (cameras != null) {
                CameraInfo cameraInfo = null;
                int i12 = 0;
                while (i12 < cameras.size()) {
                    CameraInfo cameraInfo2 = cameras.get(i12);
                    if (!cameraInfo2.isFrontface()) {
                        cameraInfo = cameraInfo2;
                    }
                    if ((this.I && cameraInfo2.isFrontface()) || (!this.I && !cameraInfo2.isFrontface())) {
                        this.H = cameraInfo2;
                        break;
                    }
                    i12++;
                    cameraInfo = cameraInfo2;
                }
                if (this.H == null) {
                    this.H = cameraInfo;
                }
                CameraInfo cameraInfo3 = this.H;
                if (cameraInfo3 != null) {
                    ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
                    ArrayList<Size> pictureSizes = this.H.getPictureSizes();
                    Size m10 = m(previewSizes);
                    Size[] sizeArr = this.m0;
                    sizeArr[0] = m10;
                    Size m11 = m(pictureSizes);
                    this.n0 = m11;
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
                                int i13 = size2.mWidth;
                                Size size5 = this.n0;
                                if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.n0 = size4;
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
                                    int i14 = size7.mWidth;
                                    if (i14 >= 360 && (i10 = size7.mHeight) >= 360 && i14 == size9.mWidth && i10 == size9.mHeight) {
                                        sizeArr[0] = size7;
                                        this.n0 = size9;
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
                    if (org.telegram.messenger.v2.a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        i0.a.p(sizeArr[0].mHeight, sb2);
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
        org.telegram.messenger.zs.f(this.e).c(this, org.telegram.messenger.zs.U1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.e).n(this, org.telegram.messenger.zs.U1);
        vh.z1 z1Var = this.x;
        if (z1Var != null) {
            z1Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m40 m40Var = this.f;
        float x10 = m40Var.getX();
        float y3 = m40Var.getY();
        RectF rectF = this.r;
        rectF.set(x10 - org.telegram.messenger.i0.L(8.0f), y3 - org.telegram.messenger.i0.L(8.0f), x10 + m40Var.getMeasuredWidth() + org.telegram.messenger.i0.L(8.0f), y3 + m40Var.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f));
        if (this.i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.g0) + this.h0;
            this.j0 = currentTimeMillis;
            this.G = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(m40Var.getScaleX(), m40Var.getScaleY(), rectF.centerX(), rectF.centerY());
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
    public final void onMeasure(int i10, int i11) {
        if (this.X0) {
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? org.telegram.messenger.i0.v : org.telegram.messenger.i0.u;
            if (i12 != this.W0) {
                this.W0 = i12;
                org.telegram.ui.ll llVar = this.q0;
                ViewGroup.LayoutParams layoutParams = llVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = llVar.getLayoutParams();
                int i13 = this.W0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                m40 m40Var = this.f;
                ViewGroup.LayoutParams layoutParams3 = m40Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = m40Var.getLayoutParams();
                int i14 = this.W0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - org.telegram.messenger.i0.L(24.0f);
                llVar.setRoundRadius(this.W0 / 2);
                m40Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        vh.z1 z1Var = this.x;
        z1Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        z1Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u61 u61Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (u61Var = this.S) != null) {
            boolean c02 = u61Var.c0();
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
            this.K.addListener(new k40(this, 0));
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
                RectF rectF = org.telegram.messenger.i0.P;
                m40 m40Var = this.f;
                rectF.set(m40Var.getX(), m40Var.getY(), m40Var.getX() + m40Var.getMeasuredWidth(), m40Var.getY() + m40Var.getMeasuredHeight());
                this.T0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.S0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (this.U0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (this.V0 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                this.S0 = false;
                n();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.Q0;
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
            n();
            return true;
        }
        return true;
    }

    public final void p(String str) {
        if (org.telegram.messenger.v2.a) {
            long j10 = this.x0;
            org.telegram.messenger.f8.b("InstantCamera legacy switch[" + this.y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + (j10 != 0 ? (SystemClock.elapsedRealtimeNanos() - j10) / 1000000 : 0L) + ", thread=" + Thread.currentThread().getName());
        }
    }

    public final void q() {
        Bitmap bitmap = this.p0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.p0.getBitmap(), 50, 50, true);
        this.T = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "icthumb.jpg"));
                this.T.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        f50 f50Var = this.a;
        if (f50Var != null) {
            ((org.telegram.ui.re) f50Var).b.Rc.a(z10, true);
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.d0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.ll llVar = this.q0;
        m40 m40Var = this.f;
        if (z10 && !this.P0) {
            m40Var.setTranslationX(0.0f);
            llVar.setTranslationX(0.0f);
            this.D0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            w();
        }
        this.P0 = z10;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.d0 = new AnimatorSet();
        float L = (z10 || this.j0 <= 300) ? 0.0f : org.telegram.messenger.i0.L(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new jg.o0(5, this, z11));
        AnimatorSet animatorSet2 = this.d0;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.n, i6.b, z10 ? org.telegram.messenger.zs.e4 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m40Var, (Property<m40, Float>) property, z10 ? 1.0f : 0.0f);
        float f7 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m40Var, (Property<m40, Float>) property2, f7);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m40Var, (Property<m40, Float>) property3, f10);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(m40Var, (Property<m40, Float>) property4, L), ObjectAnimator.ofFloat(llVar, (Property<org.telegram.ui.ll, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(llVar, (Property<org.telegram.ui.ll, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(llVar, (Property<org.telegram.ui.ll, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(llVar, (Property<org.telegram.ui.ll, Float>) property4, L), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.d0.addListener(new k40(this, 2));
        }
        this.d0.setDuration(180L);
        this.d0.setInterpolator(new DecelerateInterpolator());
        this.d0.start();
    }

    public final void s() {
        Timer timer = this.g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.g1 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        Timer timer2 = new Timer();
        this.g1 = timer2;
        timer2.schedule(new e6.r(this, 2), 0L, 17L);
    }

    @Override // org.telegram.ui.Components.j50
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.a1.setAlpha(0.0f);
        m40 m40Var = this.f;
        m40Var.setAlpha(0.0f);
        org.telegram.ui.ll llVar = this.q0;
        llVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        m40Var.setScaleX(this.f1 ? 1.0f : 0.1f);
        m40Var.setScaleY(this.f1 ? 1.0f : 0.1f);
        llVar.setScaleX(this.f1 ? 1.0f : 0.1f);
        llVar.setScaleY(this.f1 ? 1.0f : 0.1f);
        if (m40Var.getMeasuredWidth() != 0) {
            m40Var.setPivotX(m40Var.getMeasuredWidth() / 2);
            m40Var.setPivotY(m40Var.getMeasuredHeight() / 2);
            llVar.setPivotX(llVar.getMeasuredWidth() / 2);
            llVar.setPivotY(llVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void t() {
        Timer timer = this.g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.g1 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void u() {
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
        p(sb2.toString());
        if (!this.r0 || !this.t0) {
            q();
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.w0 = false;
                this.q0.setImageBitmap(bitmap);
                this.q0.setAlpha(1.0f);
            }
        }
        this.I = !this.I;
        v();
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
                r40 r40Var = this.l0;
                Handler handler = r40Var.getHandler();
                if (handler != null) {
                    r40Var.sendMessage(handler.obtainMessage(4), 0);
                    r40Var.requestRender(true, true);
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
            boolean z10 = this.I;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).v3, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).v3);
            camera2SessionArr[i10] = create;
            this.v0 = create;
            if (create == null) {
                this.A0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.v0.getPreviewWidth(), this.v0.getPreviewHeight());
            r40 r40Var2 = this.l0;
            Camera2Session camera2Session2 = this.v0;
            Handler handler2 = r40Var2.getHandler();
            if (handler2 != null) {
                r40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        o();
        this.J = false;
        r40 r40Var3 = this.l0;
        Handler handler3 = r40Var3.getHandler();
        if (handler3 != null) {
            r40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10 = this.d1 && this.i0 && this.I;
        if (this.e1 != z10) {
            this.e1 = z10;
            vh.z1 z1Var = this.x;
            if (z10) {
                z1Var.c(null);
            } else {
                z1Var.d();
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
        vh.x1 x1Var = this.w;
        if (x1Var != null) {
            Boolean bool = this.c1;
            if (bool == null || bool.booleanValue() != this.d1) {
                x1Var.setContentDescription(org.telegram.messenger.cd.L0(this.d1 ? 2131754914 : 2131754913, null));
                boolean z11 = this.d1;
                int i10 = this.b1;
                if (z11) {
                    if (this.D == null) {
                        bi0 bi0Var = new bi0(R.raw.roundcamera_flash_off, i10, i10);
                        this.D = bi0Var;
                        bi0Var.setCallback(x1Var);
                    }
                    x1Var.setImageDrawable(this.D);
                    if (this.c1 == null) {
                        bi0 bi0Var2 = this.D;
                        bi0Var2.M(bi0Var2.e[0] - 1);
                    } else {
                        this.D.M(0);
                        this.D.start();
                    }
                } else {
                    if (this.y == null) {
                        bi0 bi0Var3 = new bi0(R.raw.roundcamera_flash_on, i10, i10);
                        this.y = bi0Var3;
                        bi0Var3.setCallback(x1Var);
                    }
                    x1Var.setImageDrawable(this.y);
                    if (this.c1 == null) {
                        bi0 bi0Var4 = this.y;
                        bi0Var4.M(bi0Var4.e[0] - 1);
                    } else {
                        this.y.M(0);
                        this.y.start();
                    }
                }
                this.c1 = Boolean.valueOf(this.d1);
            }
        }
    }

    public final void w() {
        this.q0.setTranslationY(this.D0 + this.C0);
        this.f.setTranslationY(this.D0 + this.C0);
    }

    @Override // org.telegram.ui.Components.j50
    public t40 getCameraContainer() {
        return this.f;
    }

    @Override // org.telegram.ui.Components.j50
    public void setIsMessageTransition(boolean z10) {
    }
}
