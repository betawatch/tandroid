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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t60 extends y60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] m1 = {285904780, -1394191079};
    public volatile int A0;
    public volatile boolean B0;
    public volatile String C0;
    public float D0;
    public ck0 E;
    public float E0;
    public ck0 F;
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
    public VideoEditedInfo S;
    public float S0;
    public k81 T;
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
    public AnimatorSet e0;
    public boolean e1;
    public final int f;
    public a60 f0;
    public boolean f1;
    public File g0;
    public boolean g1;
    public final y50 h;
    public long h0;
    public Timer h1;
    public long i0;
    public l60 i1;
    public boolean j0;
    public Bitmap j1;
    public long k0;
    public volatile int k1;
    public boolean l0;
    public ValueAnimator l1;
    public e60 m0;
    public final f60 n;
    public final Size[] n0;
    public Size o0;
    public final Size p0;
    public TextureView q0;
    public final x50 r;
    public final org.telegram.ui.nl r0;
    public final RectF s;
    public final boolean s0;
    public CameraSession t0;
    public boolean u0;
    public final ci.u2 v;
    public final Camera2Session[] v0;
    public final ci.u2 w;
    public Camera2Session w0;
    public final ci.w2 x;
    public boolean x0;
    public ck0 y;
    public volatile long y0;
    public volatile int z0;

    public t60(Context context, f60 f60Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f = i10;
        this.J = true;
        this.a0 = new int[2];
        this.b0 = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.c0 = new int[1];
        this.d0 = 1.0f;
        this.n0 = new Size[2];
        this.p0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.s0 = SharedConfig.isUsingCamera2(i10);
        this.v0 = new Camera2Session[2];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.H0 = new float[16];
        this.c1 = AndroidUtilities.dp(z10 ? 24.0f : 28.0f);
        this.Z0 = e6Var;
        this.P0 = f60Var.getFragmentView();
        setWillNotDraw(false);
        this.n = f60Var;
        this.V = f60Var.getClassGuid();
        this.R = f60Var.v();
        x50 x50Var = new x50(this, 0);
        this.r = x50Var;
        x50Var.setStyle(Paint.Style.STROKE);
        x50Var.setStrokeCap(Paint.Cap.ROUND);
        x50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        x50Var.setColor(-1);
        this.s = new RectF();
        ci.w2 w2Var = new ci.w2(getContext(), null, this, null);
        this.x = w2Var;
        w2Var.o = 0.5f;
        w2Var.n = ci.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.b, w7.x5.e(-1, -1, 119));
        y50 y50Var = new y50(this, context);
        this.h = y50Var;
        y50Var.setOutlineProvider(new ch.b(this, 2));
        y50Var.setClipToOutline(true);
        y50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(y50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(w2Var.c, w7.x5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b1 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ci.u2 u2Var = new ci.u2(context);
        this.v = u2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u2Var.setScaleType(scaleType);
        u2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(u2Var, w7.x5.n(44, 44));
        final int i12 = 0;
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u50
            public final /* synthetic */ t60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        t60 t60Var = this.b;
                        if (t60Var.K) {
                            if (t60Var.s0) {
                                Camera2Session camera2Session = t60Var.w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = t60Var.t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (t60Var.m0 != null) {
                                if (!t60Var.u0) {
                                    t60Var.u();
                                }
                                ck0 ck0Var = t60Var.F;
                                int i13 = 0;
                                if (ck0Var != null) {
                                    ck0Var.M(0);
                                    t60Var.F.start();
                                }
                                t60Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(hs.h);
                                boolean[] zArr = new boolean[1];
                                v50 v50Var = new v50(t60Var, i13);
                                t60Var.h.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                t60Var.r0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new z50(t60Var, zArr, v50Var));
                                ofFloat.addListener(new ai.z4(t60Var, zArr, v50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        t60 t60Var2 = this.b;
                        t60Var2.e1 = true ^ t60Var2.e1;
                        t60Var2.v();
                        break;
                }
            }
        });
        ci.u2 u2Var2 = new ci.u2(context);
        this.w = u2Var2;
        u2Var2.setScaleType(scaleType);
        linearLayout.addView(u2Var2, w7.x5.n(44, 44));
        final int i13 = 1;
        u2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u50
            public final /* synthetic */ t60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        t60 t60Var = this.b;
                        if (t60Var.K) {
                            if (t60Var.s0) {
                                Camera2Session camera2Session = t60Var.w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = t60Var.t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (t60Var.m0 != null) {
                                if (!t60Var.u0) {
                                    t60Var.u();
                                }
                                ck0 ck0Var = t60Var.F;
                                int i132 = 0;
                                if (ck0Var != null) {
                                    ck0Var.M(0);
                                    t60Var.F.start();
                                }
                                t60Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(hs.h);
                                boolean[] zArr = new boolean[1];
                                v50 v50Var = new v50(t60Var, i132);
                                t60Var.h.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                t60Var.r0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new z50(t60Var, zArr, v50Var));
                                ofFloat.addListener(new ai.z4(t60Var, zArr, v50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        t60 t60Var2 = this.b;
                        t60Var2.e1 = true ^ t60Var2.e1;
                        t60Var2.v();
                        break;
                }
            }
        });
        v();
        if (!z10) {
            w2Var.a(u2Var);
            w2Var.a(u2Var2);
        } else if (!e6Var.a()) {
            u2Var.setInvert(0.6f);
            u2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.x5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, getContext(), paint);
        this.r0 = nlVar;
        int i14 = AndroidUtilities.roundPlayingMessageSize;
        addView(nlVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.g1 = false;
        setVisibility(4);
    }

    public static int j(t60 t60Var, int i10, String str) {
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

    public static boolean k() {
        if (SharedConfig.bigCameraForRound || SharedConfig.deviceIsAboveAverage() || Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (m1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public static boolean l() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (m1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y60
    public final void a(boolean z10) {
        t();
        k81 k81Var = this.T;
        if (k81Var != null) {
            k81Var.H();
            this.T = null;
        }
        if (this.q0 == null) {
            return;
        }
        this.l0 = true;
        this.j0 = false;
        this.e1 = false;
        v();
        NotificationCenter.getInstance(this.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.V), Integer.valueOf(z10 ? 0 : 6));
        if (this.m0 != null) {
            q();
            this.m0.b(0L, 0, true, 0, 0);
            this.m0 = null;
        } else {
            l60 l60Var = this.i1;
            if (l60Var != null) {
                l60Var.i(0, new h60(0L, 0, 0, true, 0L));
            }
        }
        if (this.f0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f0.delete();
            AutoDeleteMediaTask.unlockFile(this.f0);
            this.f0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
        invalidate();
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(float f7, int i10) {
        k81 k81Var = this.T;
        if (k81Var == null) {
            return;
        }
        if (i10 == 0) {
            s();
            this.T.C();
        } else if (i10 == 1) {
            t();
            this.T.B();
        } else if (i10 == 2) {
            k81Var.L((long) (f7 * k81Var.p()), false);
        }
    }

    @Override // org.telegram.ui.Components.y60
    public final void c(boolean z10) {
        ViewGroup viewGroup;
        if (this.s0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.v0;
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
            CameraSession cameraSession = this.t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.t0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        y50 y50Var = this.h;
        y50Var.setTranslationX(0.0f);
        this.r0.setTranslationX(0.0f);
        this.E0 = 0.0f;
        w();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.q0);
        }
        this.q0 = null;
        y50Var.setImageReceiver(null);
    }

    @Override // org.telegram.ui.Components.y60
    public final boolean d() {
        return !this.j0;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            a60 a60Var = this.f0;
            if (a60Var == null || !a60Var.getAbsolutePath().equals(str)) {
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

    @Override // org.telegram.ui.Components.y60
    public final void e(float f7) {
        this.D0 = f7 / 2.0f;
        w();
    }

    @Override // org.telegram.ui.Components.y60
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        char c10;
        int i13;
        long j11;
        if (this.q0 == null) {
            return;
        }
        t();
        k81 k81Var = this.T;
        if (k81Var != null) {
            k81Var.H();
            this.T = null;
        }
        int i14 = this.f;
        if (i10 != 4) {
            this.l0 = this.k0 < 800;
            this.j0 = false;
            this.e1 = false;
            v();
            int i15 = this.l0 ? 4 : i10 == 3 ? 2 : 5;
            e60 e60Var = this.m0;
            int i16 = this.V;
            if (e60Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i16), Integer.valueOf(i15));
                int i17 = this.l0 ? 0 : i10 == 3 ? 2 : 1;
                q();
                i13 = i16;
                this.m0.b(j3, i17, z10, i11, i12);
                this.m0 = null;
            } else {
                c10 = 1;
                i13 = i16;
            }
            if (this.l0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.k0);
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
        l60 l60Var = this.i1;
        if (l60Var != null && this.k0 > 800) {
            l60Var.i(1, new h60(j3, i11, i12, z10, j10));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.f0.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.S == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.S = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.S.needConvert()) {
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            VideoEditedInfo videoEditedInfo2 = this.S;
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
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j15 / d) * this.Q));
            VideoEditedInfo videoEditedInfo3 = this.S;
            videoEditedInfo3.bitrate = MediaController.VIDEO_BITRATE_480;
            long j16 = videoEditedInfo3.startTime;
            if (j16 > j11) {
                videoEditedInfo3.startTime = j16 * 1000;
            }
            long j17 = videoEditedInfo3.endTime;
            if (j17 > j11) {
                videoEditedInfo3.endTime = j17 * 1000;
            }
            FileLoader.getInstance(i14).cancelFileUpload(this.f0.getAbsolutePath(), false);
        } else {
            this.S.estimatedSize = Math.max(1L, this.Q);
        }
        VideoEditedInfo videoEditedInfo4 = this.S;
        videoEditedInfo4.file = this.M;
        videoEditedInfo4.encryptedFile = this.N;
        videoEditedInfo4.key = this.O;
        videoEditedInfo4.iv = this.P;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f0.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i12;
        photoEntry.effectId = j3;
        this.n.r(photoEntry, this.S, z10, i11, 0, false, j10);
        if (i11 != 0) {
            r(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    @Override // org.telegram.ui.Components.y60
    public final void g(ah.c cVar, org.telegram.ui.kj kjVar) {
        LinearLayout linearLayout = this.b1;
        ch.d c10 = cVar.c(linearLayout, kjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.y60
    public View getButtonsLayout() {
        return this.b1;
    }

    @Override // org.telegram.ui.Components.y60
    public RectF getCameraRect() {
        y50 y50Var = this.h;
        int[] iArr = this.a0;
        y50Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], y50Var.getWidth() + r3, y50Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.y60
    public View getMuteImageView() {
        return this.G;
    }

    @Override // org.telegram.ui.Components.y60
    public Paint getPaint() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.y60
    public TextureView getTextureView() {
        return this.q0;
    }

    @Override // org.telegram.ui.Components.y60
    public final void h(boolean z10) {
        if (this.q0 != null) {
            return;
        }
        if (this.F == null) {
            int i10 = R.raw.roundcamera_flip;
            int i11 = this.c1;
            ck0 ck0Var = new ck0(i10, i11, i11);
            this.F = ck0Var;
            ck0Var.M(0);
            this.F.setCallback(this.v);
        }
        this.v.setImageDrawable(this.F);
        this.r0.setAlpha(1.0f);
        this.r0.invalidate();
        if (this.U == null) {
            try {
                this.U = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
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
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z10) {
                this.f0 = new a60(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.f0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.f0.getAbsolutePath());
            }
            if (this.s0) {
                Context context = getContext();
                boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.u0 = z11;
                if (z11) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.v0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.v0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.n0[i12] = new Size(this.v0[i12].getPreviewWidth(), this.v0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    v();
                    Camera2Session[] camera2SessionArr2 = this.v0;
                    boolean z12 = this.J;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.w0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.u0 = false;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                        sb2.append(this.u0);
                        sb2.append(", initialFacing=");
                        sb2.append(this.J ? "FRONT" : "BACK");
                        sb2.append(", frontSession=");
                        sb2.append(this.v0[0] != null);
                        sb2.append(", backSession=");
                        sb2.append(this.v0[1] != null);
                        FileLog.d(sb2.toString());
                    }
                    if (this.w0 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.v0;
                    boolean z13 = this.J;
                    int i13 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i13] = create;
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
            textureView.setSurfaceTextureListener(new ki.d(this, 1));
            this.h.addView(this.q0, w7.x5.d(-1.0f, -1));
            this.Y0 = true;
            this.g1 = z10;
            setVisibility(0);
            r(true, z10);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    @Override // org.telegram.ui.Components.y60
    public final void i() {
        if (!this.j0) {
            l60 l60Var = this.i1;
            if (l60Var != null) {
                l60Var.T.sendMessage(l60Var.T.obtainMessage(5));
                c(false);
                k81 k81Var = this.T;
                if (k81Var != null) {
                    k81Var.H();
                    this.T = null;
                }
                h(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.lockOrientation(this.n.getParentActivity());
                invalidate();
                NotificationCenter.getInstance(this.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
                return;
            }
            return;
        }
        this.l0 = this.k0 < 800;
        this.j0 = false;
        v();
        if (this.m0 != null) {
            NotificationCenter.getInstance(this.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.V), Integer.valueOf(this.l0 ? 4 : 2));
            q();
            e60 e60Var = this.m0;
            boolean z10 = this.l0;
            e60Var.b(0L, z10 ? 0 : 2, true, 0, z10 ? 0 : -2);
            this.m0 = null;
        }
        if (!this.l0) {
            l60 l60Var2 = this.i1;
            l60Var2.T.sendMessage(l60Var2.T.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.k0));
            r(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final Size m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : k() ? 1440 : 1200;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && k()) {
            Collections.sort(arrayList2, new org.telegram.ui.gf(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.p0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
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
                min = Utilities.clamp(this.S0, camera2Session.getMaxZoom(), this.w0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.S0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.l1 = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 27));
            this.l1.addListener(new w50(this, 1));
            this.l1.setDuration(350L);
            this.l1.setInterpolator(hs.f);
            this.l1.start();
        }
    }

    public final boolean o() {
        int i10;
        int i11;
        if (this.s0) {
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
            if ((this.J && cameraInfo2.isFrontface()) || (!this.J && !cameraInfo2.isFrontface())) {
                this.I = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.I == null) {
            this.I = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.I;
        if (cameraInfo3 == null) {
            return false;
        }
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
                    int i13 = size2.mWidth;
                    Size size5 = this.o0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
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
                        int i14 = size7.mWidth;
                        if (i14 >= 360 && (i10 = size7.mHeight) >= 360 && i14 == size9.mWidth && i10 == size9.mHeight) {
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
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
            sb2.append(sizeArr[0].mWidth);
            sb2.append(" h = ");
            org.telegram.messenger.q.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileUploaded);
        ci.w2 w2Var = this.x;
        if (w2Var != null) {
            w2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        y50 y50Var = this.h;
        float x10 = y50Var.getX();
        float y3 = y50Var.getY();
        RectF rectF = this.s;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + y50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + y50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.h0) + this.i0;
            this.k0 = currentTimeMillis;
            this.H = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.O0) {
                canvas.scale(y50Var.getScaleX(), y50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.r);
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
        if (this.Y0) {
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i12 != this.X0) {
                this.X0 = i12;
                org.telegram.ui.nl nlVar = this.r0;
                ViewGroup.LayoutParams layoutParams = nlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = nlVar.getLayoutParams();
                int i13 = this.X0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                y50 y50Var = this.h;
                ViewGroup.LayoutParams layoutParams3 = y50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = y50Var.getLayoutParams();
                int i14 = this.X0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.X0 / 2) - AndroidUtilities.dp(24.0f);
                nlVar.setRoundRadius(this.X0 / 2);
                y50Var.invalidateOutline();
            }
            this.Y0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ci.w2 w2Var = this.x;
        w2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.E0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k81 k81Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.n != null && (k81Var = this.T) != null) {
            boolean x10 = k81Var.x();
            this.T.O(!x10);
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            float[] fArr = {!x10 ? 1.0f : 0.0f};
            ImageView imageView = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !x10 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, x10 ? 0.5f : 1.0f));
            this.L.addListener(new w50(this, 0));
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
                RectF rectF = AndroidUtilities.rectTmp;
                y50 y50Var = this.h;
                rectF.set(y50Var.getX(), y50Var.getY(), y50Var.getX() + y50Var.getMeasuredWidth(), y50Var.getY() + y50Var.getMeasuredHeight());
                this.U0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.T0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (this.V0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (this.W0 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                this.T0 = false;
                n();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.R0;
            this.S0 = hypot;
            if (!this.s0) {
                this.t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.w0;
            if (camera2Session != null) {
                this.w0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.w0.getMinZoom()));
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
        if (BuildVars.LOGS_ENABLED) {
            long j3 = this.y0;
            FileLog.d("InstantCamera legacy switch[" + this.z0 + "] " + str + ", path=" + this.C0 + ", elapsedMs=" + (j3 != 0 ? (SystemClock.elapsedRealtimeNanos() - j3) / 1000000 : 0L) + ", thread=" + Thread.currentThread().getName());
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
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.U.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        u60 u60Var = this.a;
        if (u60Var != null) {
            ((org.telegram.ui.re) u60Var).b.vc.a(z10, true);
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.nl nlVar = this.r0;
        y50 y50Var = this.h;
        if (z10 && !this.Q0) {
            y50Var.setTranslationX(0.0f);
            nlVar.setTranslationX(0.0f);
            this.E0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            w();
        }
        this.Q0 = z10;
        View view = this.P0;
        if (view != null) {
            view.invalidate();
        }
        this.e0 = new AnimatorSet();
        float dp = (z10 || this.k0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new ai.cb(6, this, z11));
        AnimatorSet animatorSet2 = this.e0;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.b1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.r, u6.b, z10 ? 255 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) property, z10 ? 1.0f : 0.0f);
        float f7 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) property2, f7);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) property3, f10);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) property4, dp), ObjectAnimator.ofFloat(nlVar, (Property<org.telegram.ui.nl, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(nlVar, (Property<org.telegram.ui.nl, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(nlVar, (Property<org.telegram.ui.nl, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(nlVar, (Property<org.telegram.ui.nl, Float>) property4, dp), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.e0.addListener(new w50(this, 2));
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Timer timer2 = new Timer();
        this.h1 = timer2;
        timer2.schedule(new ci.n2(this, 2), 0L, 17L);
    }

    @Override // org.telegram.ui.Components.y60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.b1.setAlpha(0.0f);
        y50 y50Var = this.h;
        y50Var.setAlpha(0.0f);
        org.telegram.ui.nl nlVar = this.r0;
        nlVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        y50Var.setScaleX(this.g1 ? 1.0f : 0.1f);
        y50Var.setScaleY(this.g1 ? 1.0f : 0.1f);
        nlVar.setScaleX(this.g1 ? 1.0f : 0.1f);
        nlVar.setScaleY(this.g1 ? 1.0f : 0.1f);
        if (y50Var.getMeasuredWidth() != 0) {
            y50Var.setPivotX(y50Var.getMeasuredWidth() / 2);
            y50Var.setPivotY(y50Var.getMeasuredHeight() / 2);
            nlVar.setPivotX(nlVar.getMeasuredWidth() / 2);
            nlVar.setPivotY(nlVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void t() {
        Timer timer = this.h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.h1 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
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
                e60 e60Var = this.m0;
                Handler handler = e60Var.getHandler();
                if (handler != null) {
                    e60Var.sendMessage(handler.obtainMessage(4), 0);
                    e60Var.requestRender(true, true);
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
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.w0 = create;
            if (create == null) {
                this.B0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.n0[0] = new Size(this.w0.getPreviewWidth(), this.w0.getPreviewHeight());
            e60 e60Var2 = this.m0;
            Camera2Session camera2Session2 = this.w0;
            Handler handler2 = e60Var2.getHandler();
            if (handler2 != null) {
                e60Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        o();
        this.K = false;
        e60 e60Var3 = this.m0;
        Handler handler3 = e60Var3.getHandler();
        if (handler3 != null) {
            e60Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10 = this.e1 && this.j0 && this.J;
        if (this.f1 != z10) {
            this.f1 = z10;
            ci.w2 w2Var = this.x;
            if (z10) {
                w2Var.c(null);
            } else {
                w2Var.d();
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
        ci.u2 u2Var = this.w;
        if (u2Var != null) {
            Boolean bool = this.d1;
            if (bool == null || bool.booleanValue() != this.e1) {
                u2Var.setContentDescription(LocaleController.getString(this.e1 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z11 = this.e1;
                int i10 = this.c1;
                if (z11) {
                    if (this.E == null) {
                        ck0 ck0Var = new ck0(R.raw.roundcamera_flash_off, i10, i10);
                        this.E = ck0Var;
                        ck0Var.setCallback(u2Var);
                    }
                    u2Var.setImageDrawable(this.E);
                    if (this.d1 == null) {
                        ck0 ck0Var2 = this.E;
                        ck0Var2.M(ck0Var2.e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                } else {
                    if (this.y == null) {
                        ck0 ck0Var3 = new ck0(R.raw.roundcamera_flash_on, i10, i10);
                        this.y = ck0Var3;
                        ck0Var3.setCallback(u2Var);
                    }
                    u2Var.setImageDrawable(this.y);
                    if (this.d1 == null) {
                        ck0 ck0Var4 = this.y;
                        ck0Var4.M(ck0Var4.e[0] - 1);
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
        this.h.setTranslationY(this.E0 + this.D0);
    }

    @Override // org.telegram.ui.Components.y60
    public g60 getCameraContainer() {
        return this.h;
    }

    @Override // org.telegram.ui.Components.y60
    public void setIsMessageTransition(boolean z10) {
    }
}
