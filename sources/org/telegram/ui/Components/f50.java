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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class f50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Y0 = {285904780, -1394191079};
    public boolean A;
    public boolean A0;
    public volatile boolean B;
    public final View B0;
    public AnimatorSet C;
    public boolean C0;
    public TLRPC.InputFile D;
    public float D0;
    public TLRPC.InputEncryptedFile E;
    public float E0;
    public byte[] F;
    public boolean F0;
    public byte[] G;
    public boolean G0;
    public long H;
    public int H0;
    public final boolean I;
    public int I0;
    public VideoEditedInfo J;
    public int J0;
    public k61 K;
    public boolean K0;
    public Bitmap L;
    public final org.telegram.ui.ActionBar.b6 L0;
    public final int M;
    public boolean M0;
    public volatile boolean N;
    public final LinearLayout N0;
    public final int[] O;
    public final int O0;
    public final int[] P;
    public Boolean P0;
    public final int[] Q;
    public boolean Q0;
    public float R;
    public boolean R0;
    public AnimatorSet S;
    public boolean S0;
    public s40 T;
    public Timer T0;
    public File U;
    public e50 U0;
    public long V;
    public Bitmap V0;
    public long W;
    public volatile int W0;
    public ValueAnimator X0;
    public final int a;
    public boolean a0;
    public final q40 b;
    public long b0;
    public final x40 c;
    public boolean c0;
    public final p40 d;
    public w40 d0;
    public final RectF e;
    public final Size[] e0;
    public final kh.q2 f;
    public Size f0;
    public final Size g0;
    public final kh.q2 h;
    public TextureView h0;
    public final org.telegram.ui.al i0;
    public final boolean j0;
    public CameraSession k0;
    public boolean l0;
    public final Camera2Session[] m0;
    public final kh.s2 n;
    public Camera2Session n0;
    public boolean o0;
    public float p0;
    public float q0;
    public mi0 r;
    public final float[] r0;
    public mi0 s;
    public final float[] s0;
    public final float[] t0;
    public FloatBuffer u0;
    public mi0 v;
    public FloatBuffer v0;
    public final ImageView w;
    public FloatBuffer w0;
    public float x;
    public float x0;
    public CameraInfo y;
    public float y0;
    public Size z0;

    public f50(Context context, x40 x40Var, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i9 = UserConfig.selectedAccount;
        this.a = i9;
        this.A = true;
        this.O = new int[2];
        this.P = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.Q = new int[1];
        this.R = 1.0f;
        this.e0 = new Size[2];
        this.g0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.j0 = SharedConfig.isUsingCamera2(i9);
        this.m0 = new Camera2Session[2];
        this.r0 = new float[16];
        this.s0 = new float[16];
        this.t0 = new float[16];
        this.O0 = AndroidUtilities.dp(z10 ? 24.0f : 28.0f);
        this.L0 = b6Var;
        this.B0 = x40Var.getFragmentView();
        setWillNotDraw(false);
        this.c = x40Var;
        this.M = x40Var.getClassGuid();
        this.I = x40Var.w();
        p40 p40Var = new p40(this, 0);
        this.d = p40Var;
        p40Var.setStyle(Paint.Style.STROKE);
        p40Var.setStrokeCap(Paint.Cap.ROUND);
        p40Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        p40Var.setColor(-1);
        this.e = new RectF();
        kh.s2 s2Var = new kh.s2(getContext(), null, this, null);
        this.n = s2Var;
        s2Var.o = 0.5f;
        s2Var.n = kh.s2.f(0.5f);
        s2Var.g();
        addView(s2Var.b, g7.e6.e(-1, -1, 119));
        q40 q40Var = new q40(this, context);
        this.b = q40Var;
        q40Var.setOutlineProvider(new kg.b(this, 2));
        q40Var.setClipToOutline(true);
        q40Var.setWillNotDraw(false);
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(q40Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(s2Var.c, g7.e6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        kh.q2 q2Var = new kh.q2(context);
        this.f = q2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q2Var.setScaleType(scaleType);
        q2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(q2Var, g7.e6.n(44, 44));
        final int i11 = 0;
        q2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m40
            public final /* synthetic */ f50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        f50 f50Var = this.b;
                        if (f50Var.B) {
                            if (f50Var.j0) {
                                Camera2Session camera2Session = f50Var.n0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = f50Var.k0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (f50Var.d0 != null) {
                                if (!f50Var.l0) {
                                    f50Var.p();
                                }
                                mi0 mi0Var = f50Var.v;
                                int i12 = 0;
                                if (mi0Var != null) {
                                    mi0Var.K(0);
                                    f50Var.v.start();
                                }
                                f50Var.A0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(gr.h);
                                boolean[] zArr = new boolean[1];
                                n40 n40Var = new n40(f50Var, i12);
                                f50Var.b.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                f50Var.i0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r40(f50Var, zArr, n40Var));
                                ofFloat.addListener(new ih.j3(f50Var, zArr, n40Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        f50 f50Var2 = this.b;
                        f50Var2.Q0 = true ^ f50Var2.Q0;
                        f50Var2.r();
                        break;
                }
            }
        });
        kh.q2 q2Var2 = new kh.q2(context);
        this.h = q2Var2;
        q2Var2.setScaleType(scaleType);
        linearLayout.addView(q2Var2, g7.e6.n(44, 44));
        final int i12 = 1;
        q2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m40
            public final /* synthetic */ f50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f50 f50Var = this.b;
                        if (f50Var.B) {
                            if (f50Var.j0) {
                                Camera2Session camera2Session = f50Var.n0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = f50Var.k0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (f50Var.d0 != null) {
                                if (!f50Var.l0) {
                                    f50Var.p();
                                }
                                mi0 mi0Var = f50Var.v;
                                int i122 = 0;
                                if (mi0Var != null) {
                                    mi0Var.K(0);
                                    f50Var.v.start();
                                }
                                f50Var.A0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(gr.h);
                                boolean[] zArr = new boolean[1];
                                n40 n40Var = new n40(f50Var, i122);
                                f50Var.b.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                f50Var.i0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r40(f50Var, zArr, n40Var));
                                ofFloat.addListener(new ih.j3(f50Var, zArr, n40Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        f50 f50Var2 = this.b;
                        f50Var2.Q0 = true ^ f50Var2.Q0;
                        f50Var2.r();
                        break;
                }
            }
        });
        r();
        if (!z10) {
            s2Var.a(q2Var);
            s2Var.a(q2Var2);
        } else if (!b6Var.a()) {
            q2Var.setInvert(0.6f);
            q2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, g7.e6.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.al alVar = new org.telegram.ui.al(this, getContext(), paint);
        this.i0 = alVar;
        int i13 = AndroidUtilities.roundPlayingMessageSize;
        addView(alVar, new FrameLayout.LayoutParams(i13, i13, 17));
        this.S0 = false;
        setVisibility(4);
    }

    public static int a(f50 f50Var, int i9, String str) {
        int glCreateShader = GLES20.glCreateShader(i9);
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

    public static boolean b() {
        if (SharedConfig.bigCameraForRound || SharedConfig.deviceIsAboveAverage() || Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i9 = 0; i9 < 2; i9++) {
            if (Y0[i9] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i9 = 0; i9 < 2; i9++) {
            if (Y0[i9] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        o();
        k61 k61Var = this.K;
        if (k61Var != null) {
            k61Var.I();
            this.K = null;
        }
        if (this.h0 == null) {
            return;
        }
        this.c0 = true;
        this.a0 = false;
        this.Q0 = false;
        r();
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.M), Integer.valueOf(z10 ? 0 : 6));
        if (this.d0 != null) {
            j();
            this.d0.b(0L, 0, true, 0, 0);
            this.d0 = null;
        } else {
            e50 e50Var = this.U0;
            if (e50Var != null) {
                e50Var.i(0, new z40(0L, 0, 0, true, 0L));
            }
        }
        if (this.T != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.T.delete();
            AutoDeleteMediaTask.unlockFile(this.T);
            this.T = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        m(false, false);
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            s40 s40Var = this.T;
            if (s40Var == null || !s40Var.getAbsolutePath().equals(str)) {
                return;
            }
            this.D = (TLRPC.InputFile) objArr[1];
            this.E = (TLRPC.InputEncryptedFile) objArr[2];
            this.H = ((Long) objArr[5]).longValue();
            if (this.E != null) {
                this.F = (byte[]) objArr[3];
                this.G = (byte[]) objArr[4];
            }
        }
    }

    public final void e(float f10, int i9) {
        k61 k61Var = this.K;
        if (k61Var == null) {
            return;
        }
        if (i9 == 0) {
            n();
            this.K.D();
        } else if (i9 == 1) {
            o();
            this.K.C();
        } else if (i9 == 2) {
            k61Var.M((long) (f10 * k61Var.q()), false);
        }
    }

    public final Size f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i9 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : b() ? 1440 : 1200;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (Math.max(((Size) arrayList.get(i10)).mHeight, ((Size) arrayList.get(i10)).mWidth) <= i9 && Math.min(((Size) arrayList.get(i10)).mHeight, ((Size) arrayList.get(i10)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i10));
            }
        }
        if (!arrayList2.isEmpty() && b()) {
            Collections.sort(arrayList2, new j9.a(25));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.g0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float min;
        if (this.X0 != null) {
            return;
        }
        if (this.j0) {
            Camera2Session camera2Session = this.n0;
            if (camera2Session == null) {
                return;
            } else {
                min = Utilities.clamp(this.E0, camera2Session.getMaxZoom(), this.n0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.E0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.X0 = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 26));
            this.X0.addListener(new o40(this, 1));
            this.X0.setDuration(350L);
            this.X0.setInterpolator(gr.f);
            this.X0.start();
        }
    }

    public View getButtonsLayout() {
        return this.N0;
    }

    public y40 getCameraContainer() {
        return this.b;
    }

    public wj0 getCameraRect() {
        this.b.getLocationOnScreen(this.O);
        return new wj0(r1[0], r1[1], r0.getWidth(), r0.getHeight());
    }

    public View getMuteImageView() {
        return this.w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.h0;
    }

    public final void h(boolean z10) {
        ViewGroup viewGroup;
        if (this.j0) {
            int i9 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.m0;
                if (i9 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i9];
                if (camera2Session != null) {
                    camera2Session.destroy(z10);
                    camera2SessionArr[i9] = null;
                }
                i9++;
            }
        } else {
            CameraSession cameraSession = this.k0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.k0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        q40 q40Var = this.b;
        q40Var.setTranslationX(0.0f);
        this.i0.setTranslationX(0.0f);
        this.q0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.h0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.h0);
        }
        this.h0 = null;
        q40Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i9;
        int i10;
        if (this.j0) {
            return true;
        }
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return false;
        }
        CameraInfo cameraInfo = null;
        int i11 = 0;
        while (i11 < cameras.size()) {
            CameraInfo cameraInfo2 = cameras.get(i11);
            if (!cameraInfo2.isFrontface()) {
                cameraInfo = cameraInfo2;
            }
            if ((this.A && cameraInfo2.isFrontface()) || (!this.A && !cameraInfo2.isFrontface())) {
                this.y = cameraInfo2;
                break;
            }
            i11++;
            cameraInfo = cameraInfo2;
        }
        if (this.y == null) {
            this.y = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.y;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.y.getPictureSizes();
        Size f10 = f(previewSizes);
        Size[] sizeArr = this.e0;
        sizeArr[0] = f10;
        Size f11 = f(pictureSizes);
        this.f0 = f11;
        if (sizeArr[0].mWidth != f11.mWidth) {
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
                    Size size5 = this.f0;
                    if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f0 = size4;
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
                        if (i13 >= 360 && (i9 = size7.mHeight) >= 360 && i13 == size9.mWidth && i9 == size9.mHeight) {
                            sizeArr[0] = size7;
                            this.f0 = size9;
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
            org.telegram.messenger.l0.n(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.h0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.h0.getBitmap(), 50, 50, true);
        this.L = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.L.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void k(int i9, int i10, int i11, long j10, long j11, boolean z10) {
        int i12;
        char c10;
        long j12;
        if (this.h0 == null) {
            return;
        }
        o();
        k61 k61Var = this.K;
        if (k61Var != null) {
            k61Var.I();
            this.K = null;
        }
        int i13 = this.a;
        if (i9 != 4) {
            this.c0 = this.b0 < 800;
            this.a0 = false;
            this.Q0 = false;
            r();
            int i14 = this.c0 ? 4 : i9 == 3 ? 2 : 5;
            w40 w40Var = this.d0;
            int i15 = this.M;
            if (w40Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i15), Integer.valueOf(i14));
                int i16 = this.c0 ? 0 : i9 == 3 ? 2 : 1;
                j();
                i12 = i15;
                this.d0.b(j10, i16, z10, i10, i11);
                this.d0 = null;
            } else {
                i12 = i15;
                c10 = 1;
            }
            if (this.c0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i17 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i12);
                Integer valueOf2 = Integer.valueOf((int) this.b0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, objArr);
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        e50 e50Var = this.U0;
        if (e50Var != null && this.b0 > 800) {
            e50Var.i(1, new z40(j10, i10, i11, z10, j11));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.T.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.J == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.J = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.J.needConvert()) {
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            VideoEditedInfo videoEditedInfo2 = this.J;
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
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.H));
            VideoEditedInfo videoEditedInfo3 = this.J;
            videoEditedInfo3.bitrate = MediaController.VIDEO_BITRATE_480;
            long j17 = videoEditedInfo3.startTime;
            if (j17 > j12) {
                videoEditedInfo3.startTime = j17 * 1000;
            }
            long j18 = videoEditedInfo3.endTime;
            if (j18 > j12) {
                videoEditedInfo3.endTime = j18 * 1000;
            }
            FileLoader.getInstance(i13).cancelFileUpload(this.T.getAbsolutePath(), false);
        } else {
            this.J.estimatedSize = Math.max(1L, this.H);
        }
        VideoEditedInfo videoEditedInfo4 = this.J;
        videoEditedInfo4.file = this.D;
        videoEditedInfo4.encryptedFile = this.E;
        videoEditedInfo4.key = this.F;
        videoEditedInfo4.iv = this.G;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.T.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i11;
        photoEntry.effectId = j10;
        this.c.r(photoEntry, this.J, z10, i10, 0, false, j11);
        if (i10 != 0) {
            m(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    public final void l(boolean z10) {
        if (this.h0 != null) {
            return;
        }
        if (this.v == null) {
            int i9 = R.raw.roundcamera_flip;
            int i10 = this.O0;
            mi0 mi0Var = new mi0(i9, i10, "roundcamera_flip", i10);
            this.v = mi0Var;
            mi0Var.K(0);
            this.v.setCallback(this.f);
        }
        this.f.setImageDrawable(this.v);
        this.i0.setAlpha(1.0f);
        this.i0.invalidate();
        if (this.L == null) {
            try {
                this.L = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            this.i0.setImageBitmap(bitmap);
        } else {
            this.i0.setImageResource(R.drawable.icplaceholder);
        }
        this.B = false;
        this.y = null;
        if (!z10) {
            if (!this.j0) {
                this.A = true;
            }
            r();
            this.b0 = 0L;
            this.x = 0.0f;
        }
        this.c0 = false;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.o0 = true;
        if (i()) {
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z10) {
                this.T = new s40(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.T);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.T.getAbsolutePath());
            }
            if (this.j0) {
                Context context = getContext();
                boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.l0 = z11;
                if (z11) {
                    int i11 = 0;
                    while (i11 < 2) {
                        Camera2Session[] camera2SessionArr = this.m0;
                        if (camera2SessionArr[i11] == null) {
                            camera2SessionArr[i11] = Camera2Session.create(i11 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.m0[i11];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.e0[i11] = new Size(this.m0[i11].getPreviewWidth(), this.m0[i11].getPreviewHeight());
                            }
                        }
                        i11++;
                    }
                    r();
                    Camera2Session[] camera2SessionArr2 = this.m0;
                    boolean z12 = this.A;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.n0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.l0 = false;
                    }
                    if (camera2Session2 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.m0;
                    boolean z13 = this.A;
                    int i12 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i12] = create;
                    this.n0 = create;
                    if (create == null) {
                        return;
                    }
                    create.setRecordingVideo(true);
                    this.e0[0] = new Size(this.n0.getPreviewWidth(), this.n0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.h0 = textureView;
            textureView.setSurfaceTextureListener(new dh.i(this, 1));
            this.b.addView(this.h0, g7.e6.c(-1.0f, -1));
            this.K0 = true;
            this.S0 = z10;
            setVisibility(0);
            m(true, z10);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    public void m(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.S.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.al alVar = this.i0;
        q40 q40Var = this.b;
        if (z10 && !this.C0) {
            q40Var.setTranslationX(0.0f);
            alVar.setTranslationX(0.0f);
            this.q0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            s();
        }
        this.C0 = z10;
        View view = this.B0;
        if (view != null) {
            view.invalidate();
        }
        this.S = new AnimatorSet();
        float dp = (z10 || this.b0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new hg.y(7, this, z11));
        AnimatorSet animatorSet2 = this.S;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.N0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.w, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, m6.b, z10 ? 255 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q40Var, (Property<q40, Float>) property, z10 ? 1.0f : 0.0f);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q40Var, (Property<q40, Float>) property2, f10);
        float f11 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q40Var, (Property<q40, Float>) property3, f11);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(q40Var, (Property<q40, Float>) property4, dp), ObjectAnimator.ofFloat(alVar, (Property<org.telegram.ui.al, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(alVar, (Property<org.telegram.ui.al, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(alVar, (Property<org.telegram.ui.al, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(alVar, (Property<org.telegram.ui.al, Float>) property4, dp), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.S.addListener(new o40(this, 2));
        }
        this.S.setDuration(180L);
        this.S.setInterpolator(new DecelerateInterpolator());
        this.S.start();
    }

    public final void n() {
        Timer timer = this.T0;
        if (timer != null) {
            try {
                timer.cancel();
                this.T0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        Timer timer2 = new Timer();
        this.T0 = timer2;
        timer2.schedule(new kh.j2(this, 2), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.T0;
        if (timer != null) {
            try {
                timer.cancel();
                this.T0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploaded);
        kh.s2 s2Var = this.n;
        if (s2Var != null) {
            s2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        q40 q40Var = this.b;
        float x10 = q40Var.getX();
        float y10 = q40Var.getY();
        RectF rectF = this.e;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y10 - AndroidUtilities.dp(8.0f), x10 + q40Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y10 + q40Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.a0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.V) + this.W;
            this.b0 = currentTimeMillis;
            this.x = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.x != 0.0f) {
            canvas.save();
            if (!this.A0) {
                canvas.scale(q40Var.getScaleX(), q40Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.x * 360.0f, false, this.d);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.K0) {
            int i11 = ((float) (View.MeasureSpec.getSize(i10) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i9)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i11 != this.J0) {
                this.J0 = i11;
                org.telegram.ui.al alVar = this.i0;
                ViewGroup.LayoutParams layoutParams = alVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = alVar.getLayoutParams();
                int i12 = this.J0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                q40 q40Var = this.b;
                ViewGroup.LayoutParams layoutParams3 = q40Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = q40Var.getLayoutParams();
                int i13 = this.J0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = (this.J0 / 2) - AndroidUtilities.dp(24.0f);
                alVar.setRoundRadius(this.J0 / 2);
                q40Var.invalidateOutline();
            }
            this.K0 = false;
        }
        super.onMeasure(i9, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        kh.s2 s2Var = this.n;
        s2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        s2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (getVisibility() != 0) {
            this.q0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k61 k61Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.c != null && (k61Var = this.K) != null) {
            boolean y10 = k61Var.y();
            this.K.P(!y10);
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.C = animatorSet2;
            float[] fArr = {!y10 ? 1.0f : 0.0f};
            ImageView imageView = this.w;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !y10 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, y10 ? 0.5f : 1.0f));
            this.C.addListener(new o40(this, 0));
            this.C.setDuration(180L);
            this.C.setInterpolator(new DecelerateInterpolator());
            this.C.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.G0 && !this.F0 && motionEvent.getPointerCount() == 2 && this.X0 == null && this.a0) {
                this.D0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.E0 = 1.0f;
                this.H0 = motionEvent.getPointerId(0);
                this.I0 = motionEvent.getPointerId(1);
                this.F0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                q40 q40Var = this.b;
                rectF.set(q40Var.getX(), q40Var.getY(), q40Var.getX() + q40Var.getMeasuredWidth(), q40Var.getY() + q40Var.getMeasuredHeight());
                this.G0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.F0) {
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (this.H0 == motionEvent.getPointerId(i11)) {
                    i9 = i11;
                }
                if (this.I0 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i9 == -1 || i10 == -1) {
                this.F0 = false;
                g();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i9), motionEvent.getY(i10) - motionEvent.getY(i9))) / this.D0;
            this.E0 = hypot;
            if (!this.j0) {
                this.k0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.n0;
            if (camera2Session != null) {
                this.n0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.n0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.H0 == motionEvent.getPointerId(0) && this.I0 == motionEvent.getPointerId(1)) || (this.H0 == motionEvent.getPointerId(1) && this.I0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.F0) {
            this.F0 = false;
            g();
            return true;
        }
        return true;
    }

    public final void p() {
        if (!this.j0 || !this.l0) {
            j();
            Bitmap bitmap = this.L;
            if (bitmap != null) {
                this.o0 = false;
                this.i0.setImageBitmap(bitmap);
                this.i0.setAlpha(1.0f);
            }
        }
        this.A = !this.A;
        r();
        if (!this.j0) {
            CameraSession cameraSession = this.k0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.k0, null, null);
                this.k0 = null;
            }
        } else {
            if (this.l0) {
                this.n0 = this.m0[!this.A ? 1 : 0];
                w40 w40Var = this.d0;
                Handler handler = w40Var.getHandler();
                if (handler != null) {
                    w40Var.sendMessage(handler.obtainMessage(4), 0);
                    w40Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.n0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.n0 = null;
                this.m0[this.A ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.m0;
            boolean z10 = this.A;
            int i9 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i9] = create;
            this.n0 = create;
            if (create == null) {
                return;
            }
            create.setRecordingVideo(true);
            this.e0[0] = new Size(this.n0.getPreviewWidth(), this.n0.getPreviewHeight());
            w40 w40Var2 = this.d0;
            Camera2Session camera2Session2 = this.n0;
            Handler handler2 = w40Var2.getHandler();
            if (handler2 != null) {
                w40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        i();
        this.B = false;
        w40 w40Var3 = this.d0;
        Handler handler3 = w40Var3.getHandler();
        if (handler3 != null) {
            w40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        if (!this.a0) {
            e50 e50Var = this.U0;
            if (e50Var != null) {
                e50Var.P.sendMessage(e50Var.P.obtainMessage(5));
                h(false);
                k61 k61Var = this.K;
                if (k61Var != null) {
                    k61Var.I();
                    this.K = null;
                }
                l(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.lockOrientation(this.c.getParentActivity());
                invalidate();
                NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
                return;
            }
            return;
        }
        this.c0 = this.b0 < 800;
        this.a0 = false;
        r();
        if (this.d0 != null) {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.M), Integer.valueOf(this.c0 ? 4 : 2));
            j();
            w40 w40Var = this.d0;
            boolean z10 = this.c0;
            w40Var.b(0L, z10 ? 0 : 2, true, 0, z10 ? 0 : -2);
            this.d0 = null;
        }
        if (!this.c0) {
            e50 e50Var2 = this.U0;
            e50Var2.P.sendMessage(e50Var2.P.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.M), Boolean.TRUE, Integer.valueOf((int) this.b0));
            m(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final void r() {
        boolean z10 = this.Q0 && this.a0 && this.A;
        if (this.R0 != z10) {
            this.R0 = z10;
            kh.s2 s2Var = this.n;
            if (z10) {
                s2Var.c(null);
            } else {
                s2Var.d();
            }
        }
        if (this.j0) {
            Camera2Session camera2Session = this.m0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.Q0 && !this.A && this.a0);
            }
        } else {
            CameraSession cameraSession = this.k0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.Q0 && !this.A && this.a0);
            }
        }
        kh.q2 q2Var = this.h;
        if (q2Var != null) {
            Boolean bool = this.P0;
            if (bool == null || bool.booleanValue() != this.Q0) {
                q2Var.setContentDescription(LocaleController.getString(this.Q0 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z11 = this.Q0;
                int i9 = this.O0;
                if (z11) {
                    if (this.s == null) {
                        mi0 mi0Var = new mi0(R.raw.roundcamera_flash_off, i9, "roundcamera_flash_off", i9);
                        this.s = mi0Var;
                        mi0Var.setCallback(q2Var);
                    }
                    q2Var.setImageDrawable(this.s);
                    if (this.P0 == null) {
                        mi0 mi0Var2 = this.s;
                        mi0Var2.K(mi0Var2.e[0] - 1);
                    } else {
                        this.s.K(0);
                        this.s.start();
                    }
                } else {
                    if (this.r == null) {
                        mi0 mi0Var3 = new mi0(R.raw.roundcamera_flash_on, i9, "roundcamera_flash_on", i9);
                        this.r = mi0Var3;
                        mi0Var3.setCallback(q2Var);
                    }
                    q2Var.setImageDrawable(this.r);
                    if (this.P0 == null) {
                        mi0 mi0Var4 = this.r;
                        mi0Var4.K(mi0Var4.e[0] - 1);
                    } else {
                        this.r.K(0);
                        this.r.start();
                    }
                }
                this.P0 = Boolean.valueOf(this.Q0);
            }
        }
    }

    public final void s() {
        this.i0.setTranslationY(this.q0 + this.p0);
        this.b.setTranslationY(this.q0 + this.p0);
    }

    public void setInternalPadding(int i9) {
        setPadding(0, 0, 0, i9);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        this.N0.setAlpha(0.0f);
        q40 q40Var = this.b;
        q40Var.setAlpha(0.0f);
        org.telegram.ui.al alVar = this.i0;
        alVar.setAlpha(0.0f);
        ImageView imageView = this.w;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        q40Var.setScaleX(this.S0 ? 1.0f : 0.1f);
        q40Var.setScaleY(this.S0 ? 1.0f : 0.1f);
        alVar.setScaleX(this.S0 ? 1.0f : 0.1f);
        alVar.setScaleY(this.S0 ? 1.0f : 0.1f);
        if (q40Var.getMeasuredWidth() != 0) {
            q40Var.setPivotX(q40Var.getMeasuredWidth() / 2);
            q40Var.setPivotY(q40Var.getMeasuredHeight() / 2);
            alVar.setPivotX(alVar.getMeasuredWidth() / 2);
            alVar.setPivotY(alVar.getMeasuredHeight() / 2);
        }
        try {
            if (i9 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void setIsMessageTransition(boolean z10) {
    }
}
