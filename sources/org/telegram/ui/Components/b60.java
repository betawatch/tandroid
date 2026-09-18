package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class b60 extends f60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f1 = {285904780, -1394191079};
    public final float[] A0;
    public FloatBuffer B0;
    public FloatBuffer C0;
    public FloatBuffer D0;
    public final ImageView E;
    public float E0;
    public float F;
    public float F0;
    public CameraInfo G;
    public Size G0;
    public boolean H;
    public boolean H0;
    public volatile boolean I;
    public final View I0;
    public AnimatorSet J;
    public boolean J0;
    public TLRPC.InputFile K;
    public float K0;
    public TLRPC.InputEncryptedFile L;
    public float L0;
    public byte[] M;
    public boolean M0;
    public byte[] N;
    public boolean N0;
    public long O;
    public int O0;
    public final boolean P;
    public int P0;
    public VideoEditedInfo Q;
    public int Q0;
    public u71 R;
    public boolean R0;
    public Bitmap S;
    public final org.telegram.ui.ActionBar.e6 S0;
    public final int T;
    public boolean T0;
    public volatile boolean U;
    public final LinearLayout U0;
    public final int[] V;
    public final int V0;
    public final int[] W;
    public Boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public final int[] a0;
    public Timer a1;
    public float b0;
    public u50 b1;
    public AnimatorSet c0;
    public Bitmap c1;
    public final int d;
    public i50 d0;
    public volatile int d1;
    public final g50 e;
    public File e0;
    public ValueAnimator e1;
    public final n50 f;
    public long f0;
    public long g0;
    public final f50 h;
    public boolean h0;
    public long i0;
    public boolean j0;
    public m50 k0;
    public final Size[] l0;
    public Size m0;
    public final RectF n;
    public final Size n0;
    public TextureView o0;
    public final org.telegram.ui.jl p0;
    public final boolean q0;
    public final ci.w2 r;
    public CameraSession r0;
    public final ci.w2 s;
    public boolean s0;
    public final Camera2Session[] t0;
    public Camera2Session u0;
    public final ci.y2 v;
    public boolean v0;
    public ij0 w;
    public float w0;
    public ij0 x;
    public float x0;
    public ij0 y;
    public final float[] y0;
    public final float[] z0;

    public b60(Context context, n50 n50Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.H = true;
        this.V = new int[2];
        this.W = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.a0 = new int[1];
        this.b0 = 1.0f;
        this.l0 = new Size[2];
        this.n0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.q0 = SharedConfig.isUsingCamera2(i10);
        this.t0 = new Camera2Session[2];
        this.y0 = new float[16];
        this.z0 = new float[16];
        this.A0 = new float[16];
        this.V0 = AndroidUtilities.dp(z10 ? 24.0f : 28.0f);
        this.S0 = e6Var;
        this.I0 = n50Var.getFragmentView();
        setWillNotDraw(false);
        this.f = n50Var;
        this.T = n50Var.getClassGuid();
        this.P = n50Var.v();
        f50 f50Var = new f50(this, 0);
        this.h = f50Var;
        f50Var.setStyle(Paint.Style.STROKE);
        f50Var.setStrokeCap(Paint.Cap.ROUND);
        f50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        f50Var.setColor(-1);
        this.n = new RectF();
        ci.y2 y2Var = new ci.y2(getContext(), null, this, null);
        this.v = y2Var;
        y2Var.o = 0.5f;
        y2Var.n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.b, w7.y5.e(-1, -1, 119));
        g50 g50Var = new g50(this, context);
        this.e = g50Var;
        g50Var.setOutlineProvider(new ch.b(this, 2));
        g50Var.setClipToOutline(true);
        g50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(g50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(y2Var.c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ci.w2 w2Var = new ci.w2(context);
        this.r = w2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        w2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(w2Var, w7.y5.n(44, 44));
        final int i12 = 0;
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c50
            public final /* synthetic */ b60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        b60 b60Var = this.b;
                        if (b60Var.I) {
                            if (b60Var.q0) {
                                Camera2Session camera2Session = b60Var.u0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = b60Var.r0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (b60Var.k0 != null) {
                                if (!b60Var.s0) {
                                    b60Var.u();
                                }
                                ij0 ij0Var = b60Var.y;
                                int i13 = 0;
                                if (ij0Var != null) {
                                    ij0Var.M(0);
                                    b60Var.y.start();
                                }
                                b60Var.H0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(qr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(b60Var, i13);
                                b60Var.e.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                b60Var.p0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(b60Var, zArr, d50Var));
                                ofFloat.addListener(new ai.y4(b60Var, zArr, d50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        b60Var2.X0 = true ^ b60Var2.X0;
                        b60Var2.v();
                        break;
                }
            }
        });
        ci.w2 w2Var2 = new ci.w2(context);
        this.s = w2Var2;
        w2Var2.setScaleType(scaleType);
        linearLayout.addView(w2Var2, w7.y5.n(44, 44));
        final int i13 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c50
            public final /* synthetic */ b60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        b60 b60Var = this.b;
                        if (b60Var.I) {
                            if (b60Var.q0) {
                                Camera2Session camera2Session = b60Var.u0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = b60Var.r0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (b60Var.k0 != null) {
                                if (!b60Var.s0) {
                                    b60Var.u();
                                }
                                ij0 ij0Var = b60Var.y;
                                int i132 = 0;
                                if (ij0Var != null) {
                                    ij0Var.M(0);
                                    b60Var.y.start();
                                }
                                b60Var.H0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(qr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(b60Var, i132);
                                b60Var.e.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                b60Var.p0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(b60Var, zArr, d50Var));
                                ofFloat.addListener(new ai.y4(b60Var, zArr, d50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        b60Var2.X0 = true ^ b60Var2.X0;
                        b60Var2.v();
                        break;
                }
            }
        });
        v();
        if (!z10) {
            y2Var.a(w2Var);
            y2Var.a(w2Var2);
        } else if (!e6Var.a()) {
            w2Var.setInvert(0.6f);
            w2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.y5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, getContext(), paint);
        this.p0 = jlVar;
        int i14 = AndroidUtilities.roundPlayingMessageSize;
        addView(jlVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.Z0 = false;
        setVisibility(4);
    }

    public static int k(b60 b60Var, int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static boolean l() {
        if (SharedConfig.bigCameraForRound || SharedConfig.deviceIsAboveAverage() || Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (f1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public static boolean m() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (f1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f60
    public final void a(boolean z10) {
        t();
        u71 u71Var = this.R;
        if (u71Var != null) {
            u71Var.H();
            this.R = null;
        }
        if (this.o0 == null) {
            return;
        }
        this.j0 = true;
        this.h0 = false;
        this.X0 = false;
        v();
        NotificationCenter.getInstance(this.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.T), Integer.valueOf(z10 ? 0 : 6));
        if (this.k0 != null) {
            q();
            this.k0.b(0L, 0, true, 0, 0);
            this.k0 = null;
        } else {
            u50 u50Var = this.b1;
            if (u50Var != null) {
                u50Var.i(0, new p50(0L, 0, 0, true, 0L));
            }
        }
        if (this.d0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.d0.delete();
            AutoDeleteMediaTask.unlockFile(this.d0);
            this.d0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
        invalidate();
    }

    @Override // org.telegram.ui.Components.f60
    public final void b(float f7, int i10) {
        u71 u71Var = this.R;
        if (u71Var == null) {
            return;
        }
        if (i10 == 0) {
            s();
            this.R.C();
        } else if (i10 == 1) {
            t();
            this.R.B();
        } else if (i10 == 2) {
            u71Var.L((long) (f7 * u71Var.p()), false);
        }
    }

    @Override // org.telegram.ui.Components.f60
    public final void d(boolean z10) {
        ViewGroup viewGroup;
        if (this.q0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.t0;
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
            CameraSession cameraSession = this.r0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.r0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        g50 g50Var = this.e;
        g50Var.setTranslationX(0.0f);
        this.p0.setTranslationX(0.0f);
        this.x0 = 0.0f;
        w();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.o0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.o0);
        }
        this.o0 = null;
        g50Var.setImageReceiver(null);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            i50 i50Var = this.d0;
            if (i50Var == null || !i50Var.getAbsolutePath().equals(str)) {
                return;
            }
            this.K = (TLRPC.InputFile) objArr[1];
            this.L = (TLRPC.InputEncryptedFile) objArr[2];
            this.O = ((Long) objArr[5]).longValue();
            if (this.L != null) {
                this.M = (byte[]) objArr[3];
                this.N = (byte[]) objArr[4];
            }
        }
    }

    @Override // org.telegram.ui.Components.f60
    public final boolean e() {
        return !this.h0;
    }

    @Override // org.telegram.ui.Components.f60
    public final void f(float f7) {
        this.w0 = f7 / 2.0f;
        w();
    }

    @Override // org.telegram.ui.Components.f60
    public final void g(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        int i13;
        char c10;
        long j11;
        if (this.o0 == null) {
            return;
        }
        t();
        u71 u71Var = this.R;
        if (u71Var != null) {
            u71Var.H();
            this.R = null;
        }
        int i14 = this.d;
        if (i10 != 4) {
            this.j0 = this.i0 < 800;
            this.h0 = false;
            this.X0 = false;
            v();
            int i15 = this.j0 ? 4 : i10 == 3 ? 2 : 5;
            m50 m50Var = this.k0;
            int i16 = this.T;
            if (m50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i16), Integer.valueOf(i15));
                int i17 = this.j0 ? 0 : i10 == 3 ? 2 : 1;
                q();
                i13 = i16;
                this.k0.b(j3, i17, z10, i11, i12);
                this.k0 = null;
            } else {
                i13 = i16;
                c10 = 1;
            }
            if (this.j0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.i0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                r(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        u50 u50Var = this.b1;
        if (u50Var != null && this.i0 > 800) {
            u50Var.i(1, new p50(j3, i11, i12, z10, j10));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.d0.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.Q == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.Q = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.Q.needConvert()) {
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            VideoEditedInfo videoEditedInfo2 = this.Q;
            long j12 = videoEditedInfo2.estimatedDuration;
            double d = j12;
            long j13 = videoEditedInfo2.startTime;
            if (j13 >= 0) {
                j11 = 0;
            } else {
                j13 = 0;
                j11 = 0;
            }
            long j14 = videoEditedInfo2.endTime;
            if (j14 >= j11) {
                j12 = j14;
            }
            long j15 = j12 - j13;
            videoEditedInfo2.estimatedDuration = j15;
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j15 / d) * this.O));
            VideoEditedInfo videoEditedInfo3 = this.Q;
            videoEditedInfo3.bitrate = MediaController.VIDEO_BITRATE_480;
            long j16 = videoEditedInfo3.startTime;
            if (j16 > j11) {
                videoEditedInfo3.startTime = j16 * 1000;
            }
            long j17 = videoEditedInfo3.endTime;
            if (j17 > j11) {
                videoEditedInfo3.endTime = j17 * 1000;
            }
            FileLoader.getInstance(i14).cancelFileUpload(this.d0.getAbsolutePath(), false);
        } else {
            this.Q.estimatedSize = Math.max(1L, this.O);
        }
        VideoEditedInfo videoEditedInfo4 = this.Q;
        videoEditedInfo4.file = this.K;
        videoEditedInfo4.encryptedFile = this.L;
        videoEditedInfo4.key = this.M;
        videoEditedInfo4.iv = this.N;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.d0.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i12;
        photoEntry.effectId = j3;
        this.f.q(photoEntry, this.Q, z10, i11, 0, false, j10);
        if (i11 != 0) {
            r(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    @Override // org.telegram.ui.Components.f60
    public View getButtonsLayout() {
        return this.U0;
    }

    @Override // org.telegram.ui.Components.f60
    public RectF getCameraRect() {
        g50 g50Var = this.e;
        int[] iArr = this.V;
        g50Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], g50Var.getWidth() + r3, g50Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.f60
    public View getMuteImageView() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.f60
    public Paint getPaint() {
        return this.h;
    }

    @Override // org.telegram.ui.Components.f60
    public TextureView getTextureView() {
        return this.o0;
    }

    @Override // org.telegram.ui.Components.f60
    public final void h(ah.c cVar, org.telegram.ui.ij ijVar) {
        LinearLayout linearLayout = this.U0;
        ch.d c10 = cVar.c(linearLayout, ijVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.f60
    public final void i(boolean z10) {
        if (this.o0 != null) {
            return;
        }
        if (this.y == null) {
            int i10 = R.raw.roundcamera_flip;
            int i11 = this.V0;
            ij0 ij0Var = new ij0(i10, i11, i11);
            this.y = ij0Var;
            ij0Var.M(0);
            this.y.setCallback(this.r);
        }
        this.r.setImageDrawable(this.y);
        this.p0.setAlpha(1.0f);
        this.p0.invalidate();
        if (this.S == null) {
            try {
                this.S = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.S;
        if (bitmap != null) {
            this.p0.setImageBitmap(bitmap);
        } else {
            this.p0.setImageResource(R.drawable.icplaceholder);
        }
        this.I = false;
        this.G = null;
        if (!z10) {
            if (!this.q0) {
                this.H = true;
            }
            v();
            this.i0 = 0L;
            this.F = 0.0f;
        }
        this.j0 = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.v0 = true;
        if (p()) {
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z10) {
                this.d0 = new i50(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.d0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.d0.getAbsolutePath());
            }
            if (this.q0) {
                Context context = getContext();
                boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.s0 = z11;
                if (z11) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.t0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.t0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.l0[i12] = new Size(this.t0[i12].getPreviewWidth(), this.t0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    v();
                    Camera2Session[] camera2SessionArr2 = this.t0;
                    boolean z12 = this.H;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.u0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.s0 = false;
                    }
                    if (camera2Session2 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.t0;
                    boolean z13 = this.H;
                    int i13 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i13] = create;
                    this.u0 = create;
                    if (create == null) {
                        return;
                    }
                    create.setRecordingVideo(true);
                    this.l0[0] = new Size(this.u0.getPreviewWidth(), this.u0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.o0 = textureView;
            textureView.setSurfaceTextureListener(new ki.c(this, 1));
            this.e.addView(this.o0, w7.y5.c(-1.0f, -1));
            this.R0 = true;
            this.Z0 = z10;
            setVisibility(0);
            r(true, z10);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    @Override // org.telegram.ui.Components.f60
    public final void j() {
        if (!this.h0) {
            u50 u50Var = this.b1;
            if (u50Var != null) {
                u50Var.T.sendMessage(u50Var.T.obtainMessage(5));
                d(false);
                u71 u71Var = this.R;
                if (u71Var != null) {
                    u71Var.H();
                    this.R = null;
                }
                i(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.lockOrientation(this.f.getParentActivity());
                invalidate();
                NotificationCenter.getInstance(this.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
                return;
            }
            return;
        }
        this.j0 = this.i0 < 800;
        this.h0 = false;
        v();
        if (this.k0 != null) {
            NotificationCenter.getInstance(this.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.T), Integer.valueOf(this.j0 ? 4 : 2));
            q();
            m50 m50Var = this.k0;
            boolean z10 = this.j0;
            m50Var.b(0L, z10 ? 0 : 2, true, 0, z10 ? 0 : -2);
            this.k0 = null;
        }
        if (!this.j0) {
            u50 u50Var2 = this.b1;
            u50Var2.T.sendMessage(u50Var2.T.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.T), Boolean.TRUE, Integer.valueOf((int) this.i0));
            r(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final Size n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : l() ? 1440 : 1200;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.ui.df(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.n0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void o() {
        float min;
        if (this.e1 != null) {
            return;
        }
        if (this.q0) {
            Camera2Session camera2Session = this.u0;
            if (camera2Session == null) {
                return;
            } else {
                min = Utilities.clamp(this.L0, camera2Session.getMaxZoom(), this.u0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.L0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.e1 = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 26));
            this.e1.addListener(new e50(this, 1));
            this.e1.setDuration(350L);
            this.e1.setInterpolator(qr.f);
            this.e1.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.fileUploaded);
        ci.y2 y2Var = this.v;
        if (y2Var != null) {
            y2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g50 g50Var = this.e;
        float x10 = g50Var.getX();
        float y3 = g50Var.getY();
        RectF rectF = this.n;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + g50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + g50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.h0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f0) + this.g0;
            this.i0 = currentTimeMillis;
            this.F = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.F != 0.0f) {
            canvas.save();
            if (!this.H0) {
                canvas.scale(g50Var.getScaleX(), g50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.F * 360.0f, false, this.h);
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
        if (this.R0) {
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i12 != this.Q0) {
                this.Q0 = i12;
                org.telegram.ui.jl jlVar = this.p0;
                ViewGroup.LayoutParams layoutParams = jlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = jlVar.getLayoutParams();
                int i13 = this.Q0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                g50 g50Var = this.e;
                ViewGroup.LayoutParams layoutParams3 = g50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = g50Var.getLayoutParams();
                int i14 = this.Q0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.E.getLayoutParams()).topMargin = (this.Q0 / 2) - AndroidUtilities.dp(24.0f);
                jlVar.setRoundRadius(this.Q0 / 2);
                g50Var.invalidateOutline();
            }
            this.R0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ci.y2 y2Var = this.v;
        y2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.x0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u71 u71Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f != null && (u71Var = this.R) != null) {
            boolean x10 = u71Var.x();
            this.R.O(!x10);
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            float[] fArr = {!x10 ? 1.0f : 0.0f};
            ImageView imageView = this.E;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !x10 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, x10 ? 0.5f : 1.0f));
            this.J.addListener(new e50(this, 0));
            this.J.setDuration(180L);
            this.J.setInterpolator(new DecelerateInterpolator());
            this.J.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.N0 && !this.M0 && motionEvent.getPointerCount() == 2 && this.e1 == null && this.h0) {
                this.K0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.L0 = 1.0f;
                this.O0 = motionEvent.getPointerId(0);
                this.P0 = motionEvent.getPointerId(1);
                this.M0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                g50 g50Var = this.e;
                rectF.set(g50Var.getX(), g50Var.getY(), g50Var.getX() + g50Var.getMeasuredWidth(), g50Var.getY() + g50Var.getMeasuredHeight());
                this.N0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.M0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (this.O0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (this.P0 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                this.M0 = false;
                o();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.K0;
            this.L0 = hypot;
            if (!this.q0) {
                this.r0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.u0;
            if (camera2Session != null) {
                this.u0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.u0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.O0 == motionEvent.getPointerId(0) && this.P0 == motionEvent.getPointerId(1)) || (this.O0 == motionEvent.getPointerId(1) && this.P0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.M0) {
            this.M0 = false;
            o();
            return true;
        }
        return true;
    }

    public final boolean p() {
        int i10;
        int i11;
        if (this.q0) {
            return true;
        }
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return false;
        }
        CameraInfo cameraInfo = null;
        int i12 = 0;
        while (i12 < cameras.size()) {
            CameraInfo cameraInfo2 = cameras.get(i12);
            if (!cameraInfo2.isFrontface()) {
                cameraInfo = cameraInfo2;
            }
            if ((this.H && cameraInfo2.isFrontface()) || (!this.H && !cameraInfo2.isFrontface())) {
                this.G = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.G == null) {
            this.G = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.G;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.G.getPictureSizes();
        Size n10 = n(previewSizes);
        Size[] sizeArr = this.l0;
        sizeArr[0] = n10;
        Size n11 = n(pictureSizes);
        this.m0 = n11;
        if (sizeArr[0].mWidth != n11.mWidth) {
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
                    Size size5 = this.m0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.m0 = size4;
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
                            this.m0 = size9;
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
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
            sb2.append(sizeArr[0].mWidth);
            sb2.append(" h = ");
            org.telegram.messenger.q.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void q() {
        Bitmap bitmap = this.o0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.o0.getBitmap(), 50, 50, true);
        this.S = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.S.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        c60 c60Var = this.a;
        if (c60Var != null) {
            ((org.telegram.ui.qe) c60Var).b.uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.c0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.c0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.jl jlVar = this.p0;
        g50 g50Var = this.e;
        if (z10 && !this.J0) {
            g50Var.setTranslationX(0.0f);
            jlVar.setTranslationX(0.0f);
            this.x0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            w();
        }
        this.J0 = z10;
        View view = this.I0;
        if (view != null) {
            view.invalidate();
        }
        this.c0 = new AnimatorSet();
        float dp = (z10 || this.i0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new ai.bb(6, this, z11));
        AnimatorSet animatorSet2 = this.c0;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.U0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.E, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.h, s6.b, z10 ? 255 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property, z10 ? 1.0f : 0.0f);
        float f7 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property2, f7);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property3, f10);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property4, dp), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property4, dp), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.c0.addListener(new e50(this, 2));
        }
        this.c0.setDuration(180L);
        this.c0.setInterpolator(new DecelerateInterpolator());
        this.c0.start();
    }

    public final void s() {
        Timer timer = this.a1;
        if (timer != null) {
            try {
                timer.cancel();
                this.a1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.a1 = timer2;
        timer2.schedule(new ci.p2(this, 2), 0L, 17L);
    }

    @Override // org.telegram.ui.Components.f60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.U0.setAlpha(0.0f);
        g50 g50Var = this.e;
        g50Var.setAlpha(0.0f);
        org.telegram.ui.jl jlVar = this.p0;
        jlVar.setAlpha(0.0f);
        ImageView imageView = this.E;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        g50Var.setScaleX(this.Z0 ? 1.0f : 0.1f);
        g50Var.setScaleY(this.Z0 ? 1.0f : 0.1f);
        jlVar.setScaleX(this.Z0 ? 1.0f : 0.1f);
        jlVar.setScaleY(this.Z0 ? 1.0f : 0.1f);
        if (g50Var.getMeasuredWidth() != 0) {
            g50Var.setPivotX(g50Var.getMeasuredWidth() / 2);
            g50Var.setPivotY(g50Var.getMeasuredHeight() / 2);
            jlVar.setPivotX(jlVar.getMeasuredWidth() / 2);
            jlVar.setPivotY(jlVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t() {
        Timer timer = this.a1;
        if (timer != null) {
            try {
                timer.cancel();
                this.a1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void u() {
        if (!this.q0 || !this.s0) {
            q();
            Bitmap bitmap = this.S;
            if (bitmap != null) {
                this.v0 = false;
                this.p0.setImageBitmap(bitmap);
                this.p0.setAlpha(1.0f);
            }
        }
        this.H = !this.H;
        v();
        if (!this.q0) {
            CameraSession cameraSession = this.r0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.r0, null, null);
                this.r0 = null;
            }
        } else {
            if (this.s0) {
                this.u0 = this.t0[!this.H ? 1 : 0];
                m50 m50Var = this.k0;
                Handler handler = m50Var.getHandler();
                if (handler != null) {
                    m50Var.sendMessage(handler.obtainMessage(4), 0);
                    m50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.u0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.u0 = null;
                this.t0[this.H ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.t0;
            boolean z10 = this.H;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.u0 = create;
            if (create == null) {
                return;
            }
            create.setRecordingVideo(true);
            this.l0[0] = new Size(this.u0.getPreviewWidth(), this.u0.getPreviewHeight());
            m50 m50Var2 = this.k0;
            Camera2Session camera2Session2 = this.u0;
            Handler handler2 = m50Var2.getHandler();
            if (handler2 != null) {
                m50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        p();
        this.I = false;
        m50 m50Var3 = this.k0;
        Handler handler3 = m50Var3.getHandler();
        if (handler3 != null) {
            m50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10 = this.X0 && this.h0 && this.H;
        if (this.Y0 != z10) {
            this.Y0 = z10;
            ci.y2 y2Var = this.v;
            if (z10) {
                y2Var.c(null);
            } else {
                y2Var.d();
            }
        }
        if (this.q0) {
            Camera2Session camera2Session = this.t0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.X0 && !this.H && this.h0);
            }
        } else {
            CameraSession cameraSession = this.r0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.X0 && !this.H && this.h0);
            }
        }
        ci.w2 w2Var = this.s;
        if (w2Var != null) {
            Boolean bool = this.W0;
            if (bool == null || bool.booleanValue() != this.X0) {
                w2Var.setContentDescription(LocaleController.getString(this.X0 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z11 = this.X0;
                int i10 = this.V0;
                if (z11) {
                    if (this.x == null) {
                        ij0 ij0Var = new ij0(R.raw.roundcamera_flash_off, i10, i10);
                        this.x = ij0Var;
                        ij0Var.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.x);
                    if (this.W0 == null) {
                        ij0 ij0Var2 = this.x;
                        ij0Var2.M(ij0Var2.e[0] - 1);
                    } else {
                        this.x.M(0);
                        this.x.start();
                    }
                } else {
                    if (this.w == null) {
                        ij0 ij0Var3 = new ij0(R.raw.roundcamera_flash_on, i10, i10);
                        this.w = ij0Var3;
                        ij0Var3.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.w);
                    if (this.W0 == null) {
                        ij0 ij0Var4 = this.w;
                        ij0Var4.M(ij0Var4.e[0] - 1);
                    } else {
                        this.w.M(0);
                        this.w.start();
                    }
                }
                this.W0 = Boolean.valueOf(this.X0);
            }
        }
    }

    public final void w() {
        this.p0.setTranslationY(this.x0 + this.w0);
        this.e.setTranslationY(this.x0 + this.w0);
    }

    @Override // org.telegram.ui.Components.f60
    public o50 getCameraContainer() {
        return this.e;
    }

    @Override // org.telegram.ui.Components.f60
    public void setIsMessageTransition(boolean z10) {
    }
}
