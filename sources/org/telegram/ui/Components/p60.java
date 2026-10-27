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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p60 extends u60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public float D0;
    public yj0 E;
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
    public VideoEditedInfo R;
    public float R0;
    public t81 S;
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
    public final org.telegram.ui.ActionBar.u6 Y0;
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
    public u50 e0;
    public boolean e1;
    public final s50 f;
    public File f0;
    public boolean f1;
    public long g0;
    public Timer g1;
    public final a60 h;
    public long h0;
    public h60 h1;
    public boolean i0;
    public Bitmap i1;
    public long j0;
    public volatile int j1;
    public boolean k0;
    public ValueAnimator k1;
    public z50 l0;
    public final Size[] m0;
    public final r50 n;
    public Size n0;
    public final Size o0;
    public TextureView p0;
    public final org.telegram.ui.il q0;
    public final RectF r;
    public final boolean r0;
    public final fi.o2 s;
    public CameraSession s0;
    public boolean t0;
    public final Camera2Session[] u0;
    public final fi.o2 v;
    public Camera2Session v0;
    public final fi.q2 w;
    public boolean w0;
    public yj0 x;
    public volatile long x0;
    public yj0 y;
    public volatile int y0;
    public volatile int z0;

    public p60(Context context, a60 a60Var, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.e = i10;
        this.I = true;
        this.W = new int[2];
        this.a0 = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.b0 = new int[1];
        this.c0 = 1.0f;
        this.m0 = new Size[2];
        this.o0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.r0 = SharedConfig.isUsingCamera2(i10);
        this.u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.b1 = AndroidUtilities.dp(z10 ? 24.0f : 28.0f);
        this.Y0 = u6Var;
        this.O0 = a60Var.getFragmentView();
        setWillNotDraw(false);
        this.h = a60Var;
        this.U = a60Var.getClassGuid();
        this.Q = a60Var.w();
        r50 r50Var = new r50(this, 0);
        this.n = r50Var;
        r50Var.setStyle(Paint.Style.STROKE);
        r50Var.setStrokeCap(Paint.Cap.ROUND);
        r50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        r50Var.setColor(-1);
        this.r = new RectF();
        fi.q2 q2Var = new fi.q2(getContext(), null, this, null);
        this.w = q2Var;
        q2Var.o = 0.5f;
        q2Var.n = fi.q2.f(0.5f);
        q2Var.g();
        addView(q2Var.b, kb1.i(-1, -1, 119));
        s50 s50Var = new s50(this, context);
        this.f = s50Var;
        s50Var.setOutlineProvider(new eh.b(this, 2));
        s50Var.setClipToOutline(true);
        s50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(s50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(q2Var.c, kb1.i(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a1 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, kb1.h(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        fi.o2 o2Var = new fi.o2(context);
        this.s = o2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        o2Var.setScaleType(scaleType);
        o2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(o2Var, kb1.r(44, 44));
        final int i12 = 0;
        o2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o50
            public final /* synthetic */ p60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        p60 p60Var = this.b;
                        if (p60Var.J) {
                            if (p60Var.r0) {
                                Camera2Session camera2Session = p60Var.v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = p60Var.s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (p60Var.l0 != null) {
                                if (!p60Var.t0) {
                                    p60Var.v();
                                }
                                yj0 yj0Var = p60Var.E;
                                int i13 = 0;
                                if (yj0Var != null) {
                                    yj0Var.M(0);
                                    p60Var.E.start();
                                }
                                p60Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(ds.h);
                                boolean[] zArr = new boolean[1];
                                p50 p50Var = new p50(p60Var, i13);
                                p60Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                p60Var.q0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new t50(p60Var, zArr, p50Var));
                                ofFloat.addListener(new di.o3(p60Var, zArr, p50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        p60 p60Var2 = this.b;
                        p60Var2.d1 = true ^ p60Var2.d1;
                        p60Var2.w();
                        break;
                }
            }
        });
        fi.o2 o2Var2 = new fi.o2(context);
        this.v = o2Var2;
        o2Var2.setScaleType(scaleType);
        linearLayout.addView(o2Var2, kb1.r(44, 44));
        final int i13 = 1;
        o2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o50
            public final /* synthetic */ p60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        p60 p60Var = this.b;
                        if (p60Var.J) {
                            if (p60Var.r0) {
                                Camera2Session camera2Session = p60Var.v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = p60Var.s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (p60Var.l0 != null) {
                                if (!p60Var.t0) {
                                    p60Var.v();
                                }
                                yj0 yj0Var = p60Var.E;
                                int i132 = 0;
                                if (yj0Var != null) {
                                    yj0Var.M(0);
                                    p60Var.E.start();
                                }
                                p60Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(ds.h);
                                boolean[] zArr = new boolean[1];
                                p50 p50Var = new p50(p60Var, i132);
                                p60Var.f.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                p60Var.q0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new t50(p60Var, zArr, p50Var));
                                ofFloat.addListener(new di.o3(p60Var, zArr, p50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        p60 p60Var2 = this.b;
                        p60Var2.d1 = true ^ p60Var2.d1;
                        p60Var2.w();
                        break;
                }
            }
        });
        w();
        if (!z10) {
            q2Var.a(o2Var);
            q2Var.a(o2Var2);
        } else if (!u6Var.a()) {
            o2Var.setInvert(0.6f);
            o2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, kb1.i(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, getContext(), paint);
        this.q0 = ilVar;
        int i14 = AndroidUtilities.roundPlayingMessageSize;
        addView(ilVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.f1 = false;
        setVisibility(4);
    }

    public static int k(p60 p60Var, int i10, String str) {
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
            if (l1[i10] == hashCode) {
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
            if (l1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.u60
    public final void a(boolean z10) {
        u();
        t81 t81Var = this.S;
        if (t81Var != null) {
            t81Var.H();
            this.S = null;
        }
        if (this.p0 == null) {
            return;
        }
        this.k0 = true;
        this.i0 = false;
        this.d1 = false;
        w();
        NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.U), Integer.valueOf(z10 ? 0 : 6));
        if (this.l0 != null) {
            r();
            this.l0.b(0L, 0, true, 0, 0);
            this.l0 = null;
        } else {
            h60 h60Var = this.h1;
            if (h60Var != null) {
                h60Var.i(0, new c60(0L, 0, 0, true, 0L));
            }
        }
        if (this.e0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.e0.delete();
            AutoDeleteMediaTask.unlockFile(this.e0);
            this.e0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
        invalidate();
    }

    @Override // org.telegram.ui.Components.u60
    public final void b(float f7, int i10) {
        t81 t81Var = this.S;
        if (t81Var == null) {
            return;
        }
        if (i10 == 0) {
            t();
            this.S.C();
        } else if (i10 == 1) {
            u();
            this.S.B();
        } else if (i10 == 2) {
            t81Var.L((long) (f7 * t81Var.p()), false);
        }
    }

    @Override // org.telegram.ui.Components.u60
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
        s50 s50Var = this.f;
        s50Var.setTranslationX(0.0f);
        this.q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        x();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.p0);
        }
        this.p0 = null;
        s50Var.setImageReceiver(null);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            u50 u50Var = this.e0;
            if (u50Var == null || !u50Var.getAbsolutePath().equals(str)) {
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

    @Override // org.telegram.ui.Components.u60
    public final boolean e() {
        return !this.i0;
    }

    @Override // org.telegram.ui.Components.u60
    public final void f(float f7) {
        this.C0 = f7 / 2.0f;
        x();
    }

    @Override // org.telegram.ui.Components.u60
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        char c10;
        int i13;
        long j12;
        if (this.p0 == null) {
            return;
        }
        u();
        t81 t81Var = this.S;
        if (t81Var != null) {
            t81Var.H();
            this.S = null;
        }
        int i14 = this.e;
        if (i10 != 4) {
            this.k0 = this.j0 < 800;
            this.i0 = false;
            this.d1 = false;
            w();
            int i15 = this.k0 ? 4 : i10 == 3 ? 2 : 5;
            z50 z50Var = this.l0;
            int i16 = this.U;
            if (z50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i16), Integer.valueOf(i15));
                int i17 = this.k0 ? 0 : i10 == 3 ? 2 : 1;
                r();
                i13 = i16;
                this.l0.b(j10, i17, z10, i11, i12);
                this.l0 = null;
            } else {
                c10 = 1;
                i13 = i16;
            }
            if (this.k0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.j0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                s(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        h60 h60Var = this.h1;
        if (h60Var != null && this.j0 > 800) {
            h60Var.i(1, new c60(j10, i11, i12, z10, j11));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.e0.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.R == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.R = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.R.needConvert()) {
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            VideoEditedInfo videoEditedInfo2 = this.R;
            long j13 = videoEditedInfo2.estimatedDuration;
            double d = j13;
            long j14 = videoEditedInfo2.startTime;
            if (j14 >= 0) {
                j12 = 0;
            } else {
                j14 = 0;
                j12 = 0;
            }
            long j15 = videoEditedInfo2.endTime;
            if (j15 >= j12) {
                j13 = j15;
            }
            long j16 = j13 - j14;
            videoEditedInfo2.estimatedDuration = j16;
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.P));
            VideoEditedInfo videoEditedInfo3 = this.R;
            videoEditedInfo3.bitrate = MediaController.VIDEO_BITRATE_480;
            long j17 = videoEditedInfo3.startTime;
            if (j17 > j12) {
                videoEditedInfo3.startTime = j17 * 1000;
            }
            long j18 = videoEditedInfo3.endTime;
            if (j18 > j12) {
                videoEditedInfo3.endTime = j18 * 1000;
            }
            FileLoader.getInstance(i14).cancelFileUpload(this.e0.getAbsolutePath(), false);
        } else {
            this.R.estimatedSize = Math.max(1L, this.P);
        }
        VideoEditedInfo videoEditedInfo4 = this.R;
        videoEditedInfo4.file = this.L;
        videoEditedInfo4.encryptedFile = this.M;
        videoEditedInfo4.key = this.N;
        videoEditedInfo4.iv = this.O;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.e0.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i12;
        photoEntry.effectId = j10;
        this.h.r(photoEntry, this.R, z10, i11, 0, false, j11);
        if (i11 != 0) {
            s(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    @Override // org.telegram.ui.Components.u60
    public View getButtonsLayout() {
        return this.a1;
    }

    @Override // org.telegram.ui.Components.u60
    public RectF getCameraRect() {
        s50 s50Var = this.f;
        int[] iArr = this.W;
        s50Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], s50Var.getWidth() + r3, s50Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.u60
    public View getMuteImageView() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.u60
    public Paint getPaint() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.u60
    public TextureView getTextureView() {
        return this.p0;
    }

    @Override // org.telegram.ui.Components.u60
    public final void h(ch.b bVar, org.telegram.ui.fj fjVar) {
        LinearLayout linearLayout = this.a1;
        eh.d c10 = bVar.c(linearLayout, fjVar, false);
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.u60
    public final void i(boolean z10) {
        if (this.p0 != null) {
            return;
        }
        if (this.E == null) {
            int i10 = R.raw.roundcamera_flip;
            int i11 = this.b1;
            yj0 yj0Var = new yj0(i10, i11, i11);
            this.E = yj0Var;
            yj0Var.M(0);
            this.E.setCallback(this.s);
        }
        this.s.setImageDrawable(this.E);
        this.q0.setAlpha(1.0f);
        this.q0.invalidate();
        if (this.T == null) {
            try {
                this.T = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
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
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z10) {
                this.e0 = new u50(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.e0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.e0.getAbsolutePath());
            }
            if (this.r0) {
                Context context = getContext();
                boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.t0 = z11;
                if (z11) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.u0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.u0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.m0[i12] = new Size(this.u0[i12].getPreviewWidth(), this.u0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    w();
                    Camera2Session[] camera2SessionArr2 = this.u0;
                    boolean z12 = this.I;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.v0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.t0 = false;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                        sb2.append(this.t0);
                        sb2.append(", initialFacing=");
                        sb2.append(this.I ? "FRONT" : "BACK");
                        sb2.append(", frontSession=");
                        sb2.append(this.u0[0] != null);
                        sb2.append(", backSession=");
                        sb2.append(this.u0[1] != null);
                        FileLog.d(sb2.toString());
                    }
                    if (this.v0 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.u0;
                    boolean z13 = this.I;
                    int i13 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
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
            textureView.setSurfaceTextureListener(new v50(this, 0));
            this.f.addView(this.p0, kb1.g(-1.0f, -1));
            this.X0 = true;
            this.f1 = z10;
            setVisibility(0);
            s(true, z10);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    @Override // org.telegram.ui.Components.u60
    public final void j() {
        if (!this.i0) {
            h60 h60Var = this.h1;
            if (h60Var != null) {
                h60Var.T.sendMessage(h60Var.T.obtainMessage(5));
                c(false);
                t81 t81Var = this.S;
                if (t81Var != null) {
                    t81Var.H();
                    this.S = null;
                }
                i(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.lockOrientation(this.h.getParentActivity());
                invalidate();
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
                return;
            }
            return;
        }
        this.k0 = this.j0 < 800;
        this.i0 = false;
        w();
        if (this.l0 != null) {
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.U), Integer.valueOf(this.k0 ? 4 : 2));
            r();
            z50 z50Var = this.l0;
            boolean z10 = this.k0;
            z50Var.b(0L, z10 ? 0 : 2, true, 0, z10 ? 0 : -2);
            this.l0 = null;
        }
        if (!this.k0) {
            h60 h60Var2 = this.h1;
            h60Var2.T.sendMessage(h60Var2.T.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.j0));
            s(false, false);
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
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(16));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.o0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
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
                min = Utilities.clamp(this.R0, camera2Session.getMaxZoom(), this.v0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.R0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.k1 = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 27));
            this.k1.addListener(new q50(this, 1));
            this.k1.setDuration(350L);
            this.k1.setInterpolator(ds.f);
            this.k1.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.e).addWeakObserver(this, NotificationCenter.fileUploaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.e).removeObserver(this, NotificationCenter.fileUploaded);
        fi.q2 q2Var = this.w;
        if (q2Var != null) {
            q2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        s50 s50Var = this.f;
        float x9 = s50Var.getX();
        float y3 = s50Var.getY();
        RectF rectF = this.r;
        rectF.set(x9 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x9 + s50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + s50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.g0) + this.h0;
            this.j0 = currentTimeMillis;
            this.G = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(s50Var.getScaleX(), s50Var.getScaleY(), rectF.centerX(), rectF.centerY());
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
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i12 != this.W0) {
                this.W0 = i12;
                org.telegram.ui.il ilVar = this.q0;
                ViewGroup.LayoutParams layoutParams = ilVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = ilVar.getLayoutParams();
                int i13 = this.W0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                s50 s50Var = this.f;
                ViewGroup.LayoutParams layoutParams3 = s50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = s50Var.getLayoutParams();
                int i14 = this.W0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - AndroidUtilities.dp(24.0f);
                ilVar.setRoundRadius(this.W0 / 2);
                s50Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        fi.q2 q2Var = this.w;
        q2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        q2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
            x();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t81 t81Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (t81Var = this.S) != null) {
            boolean x9 = t81Var.x();
            this.S.O(!x9);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            float[] fArr = {!x9 ? 1.0f : 0.0f};
            ImageView imageView = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !x9 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, x9 ? 0.5f : 1.0f));
            this.K.addListener(new q50(this, 0));
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
                RectF rectF = AndroidUtilities.rectTmp;
                s50 s50Var = this.f;
                rectF.set(s50Var.getX(), s50Var.getY(), s50Var.getX() + s50Var.getMeasuredWidth(), s50Var.getY() + s50Var.getMeasuredHeight());
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
                o();
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
                this.v0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.v0.getMinZoom()));
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
        int i10;
        int i11;
        if (this.r0) {
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
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.H.getPictureSizes();
        Size n10 = n(previewSizes);
        Size[] sizeArr = this.m0;
        sizeArr[0] = n10;
        Size n11 = n(pictureSizes);
        this.n0 = n11;
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
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
            sb2.append(sizeArr[0].mWidth);
            sb2.append(" h = ");
            org.telegram.messenger.t.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void q(String str) {
        if (BuildVars.LOGS_ENABLED) {
            long j10 = this.x0;
            FileLog.d("InstantCamera legacy switch[" + this.y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + (j10 != 0 ? (SystemClock.elapsedRealtimeNanos() - j10) / 1000000 : 0L) + ", thread=" + Thread.currentThread().getName());
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
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.T.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        q60 q60Var = this.a;
        if (q60Var != null) {
            ((org.telegram.ui.qe) q60Var).b.Wc.a(z10, true);
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
        org.telegram.ui.il ilVar = this.q0;
        s50 s50Var = this.f;
        if (z10 && !this.P0) {
            s50Var.setTranslationX(0.0f);
            ilVar.setTranslationX(0.0f);
            this.D0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            x();
        }
        this.P0 = z10;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.d0 = new AnimatorSet();
        float dp = (z10 || this.j0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new bh.a0(7, this, z11));
        AnimatorSet animatorSet2 = this.d0;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.n, v6.b, z10 ? 255 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property, z10 ? 1.0f : 0.0f);
        float f7 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property2, f7);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property3, f10);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(s50Var, (Property<s50, Float>) property4, dp), ObjectAnimator.ofFloat(ilVar, (Property<org.telegram.ui.il, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ilVar, (Property<org.telegram.ui.il, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(ilVar, (Property<org.telegram.ui.il, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(ilVar, (Property<org.telegram.ui.il, Float>) property4, dp), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.d0.addListener(new q50(this, 2));
        }
        this.d0.setDuration(180L);
        this.d0.setInterpolator(new DecelerateInterpolator());
        this.d0.start();
    }

    @Override // org.telegram.ui.Components.u60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.a1.setAlpha(0.0f);
        s50 s50Var = this.f;
        s50Var.setAlpha(0.0f);
        org.telegram.ui.il ilVar = this.q0;
        ilVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        s50Var.setScaleX(this.f1 ? 1.0f : 0.1f);
        s50Var.setScaleY(this.f1 ? 1.0f : 0.1f);
        ilVar.setScaleX(this.f1 ? 1.0f : 0.1f);
        ilVar.setScaleY(this.f1 ? 1.0f : 0.1f);
        if (s50Var.getMeasuredWidth() != 0) {
            s50Var.setPivotX(s50Var.getMeasuredWidth() / 2);
            s50Var.setPivotY(s50Var.getMeasuredHeight() / 2);
            ilVar.setPivotX(ilVar.getMeasuredWidth() / 2);
            ilVar.setPivotY(ilVar.getMeasuredHeight() / 2);
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
        Timer timer = this.g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.g1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.g1 = timer2;
        timer2.schedule(new f6.r(this, 2), 0L, 17L);
    }

    public final void u() {
        Timer timer = this.g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.g1 = null;
            } catch (Exception e) {
                FileLog.e(e);
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
                z50 z50Var = this.l0;
                Handler handler = z50Var.getHandler();
                if (handler != null) {
                    z50Var.sendMessage(handler.obtainMessage(4), 0);
                    z50Var.requestRender(true, true);
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
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.v0 = create;
            if (create == null) {
                this.A0 = false;
                q("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.v0.getPreviewWidth(), this.v0.getPreviewHeight());
            z50 z50Var2 = this.l0;
            Camera2Session camera2Session2 = this.v0;
            Handler handler2 = z50Var2.getHandler();
            if (handler2 != null) {
                z50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        p();
        this.J = false;
        z50 z50Var3 = this.l0;
        Handler handler3 = z50Var3.getHandler();
        if (handler3 != null) {
            z50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void w() {
        boolean z10 = this.d1 && this.i0 && this.I;
        if (this.e1 != z10) {
            this.e1 = z10;
            fi.q2 q2Var = this.w;
            if (z10) {
                q2Var.c(null);
            } else {
                q2Var.d();
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
        fi.o2 o2Var = this.v;
        if (o2Var != null) {
            Boolean bool = this.c1;
            if (bool == null || bool.booleanValue() != this.d1) {
                o2Var.setContentDescription(LocaleController.getString(this.d1 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z11 = this.d1;
                int i10 = this.b1;
                if (z11) {
                    if (this.y == null) {
                        yj0 yj0Var = new yj0(R.raw.roundcamera_flash_off, i10, i10);
                        this.y = yj0Var;
                        yj0Var.setCallback(o2Var);
                    }
                    o2Var.setImageDrawable(this.y);
                    if (this.c1 == null) {
                        yj0 yj0Var2 = this.y;
                        yj0Var2.M(yj0Var2.e[0] - 1);
                    } else {
                        this.y.M(0);
                        this.y.start();
                    }
                } else {
                    if (this.x == null) {
                        yj0 yj0Var3 = new yj0(R.raw.roundcamera_flash_on, i10, i10);
                        this.x = yj0Var3;
                        yj0Var3.setCallback(o2Var);
                    }
                    o2Var.setImageDrawable(this.x);
                    if (this.c1 == null) {
                        yj0 yj0Var4 = this.x;
                        yj0Var4.M(yj0Var4.e[0] - 1);
                    } else {
                        this.x.M(0);
                        this.x.start();
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

    @Override // org.telegram.ui.Components.u60
    public b60 getCameraContainer() {
        return this.f;
    }

    @Override // org.telegram.ui.Components.u60
    public void setIsMessageTransition(boolean z10) {
    }
}
