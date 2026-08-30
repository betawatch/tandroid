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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class x50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Z0 = {285904780, -1394191079};
    public Size A0;
    public boolean B;
    public boolean B0;
    public volatile boolean C;
    public final View C0;
    public AnimatorSet D;
    public boolean D0;
    public TLRPC.InputFile E;
    public float E0;
    public TLRPC.InputEncryptedFile F;
    public float F0;
    public byte[] G;
    public boolean G0;
    public byte[] H;
    public boolean H0;
    public long I;
    public int I0;
    public final boolean J;
    public int J0;
    public VideoEditedInfo K;
    public int K0;
    public i71 L;
    public boolean L0;
    public Bitmap M;
    public final org.telegram.ui.ActionBar.f6 M0;
    public final int N;
    public boolean N0;
    public volatile boolean O;
    public final LinearLayout O0;
    public final int[] P;
    public final int P0;
    public final int[] Q;
    public Boolean Q0;
    public final int[] R;
    public boolean R0;
    public float S;
    public boolean S0;
    public AnimatorSet T;
    public boolean T0;
    public l50 U;
    public Timer U0;
    public File V;
    public w50 V0;
    public long W;
    public Bitmap W0;
    public volatile int X0;
    public ValueAnimator Y0;
    public final int a;
    public long a0;
    public final j50 b;
    public boolean b0;
    public final q50 c;
    public long c0;
    public final i50 d;
    public boolean d0;
    public final RectF e;
    public p50 e0;
    public final ph.b2 f;
    public final Size[] f0;
    public Size g0;
    public final ph.b2 h;
    public final Size h0;
    public TextureView i0;
    public final org.telegram.ui.jl j0;
    public final boolean k0;
    public CameraSession l0;
    public boolean m0;
    public final ph.d2 n;
    public final Camera2Session[] n0;
    public Camera2Session o0;
    public boolean p0;
    public float q0;
    public gj0 r;
    public float r0;
    public gj0 s;
    public final float[] s0;
    public final float[] t0;
    public final float[] u0;
    public gj0 v;
    public FloatBuffer v0;
    public final ImageView w;
    public FloatBuffer w0;
    public float x;
    public FloatBuffer x0;
    public CameraInfo y;
    public float y0;
    public float z0;

    public x50(Context context, q50 q50Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.B = true;
        this.P = new int[2];
        this.Q = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.R = new int[1];
        this.S = 1.0f;
        this.f0 = new Size[2];
        this.h0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.k0 = SharedConfig.isUsingCamera2(i10);
        this.n0 = new Camera2Session[2];
        this.s0 = new float[16];
        this.t0 = new float[16];
        this.u0 = new float[16];
        this.P0 = AndroidUtilities.dp(z4 ? 24.0f : 28.0f);
        this.M0 = f6Var;
        this.C0 = q50Var.getFragmentView();
        setWillNotDraw(false);
        this.c = q50Var;
        this.N = q50Var.getClassGuid();
        this.J = q50Var.v();
        i50 i50Var = new i50(this, 0);
        this.d = i50Var;
        i50Var.setStyle(Paint.Style.STROKE);
        i50Var.setStrokeCap(Paint.Cap.ROUND);
        i50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        i50Var.setColor(-1);
        this.e = new RectF();
        ph.d2 d2Var = new ph.d2(getContext(), null, this, null);
        this.n = d2Var;
        d2Var.o = 0.5f;
        d2Var.n = ph.d2.f(0.5f);
        d2Var.g();
        addView(d2Var.b, k7.b6.e(-1, -1, 119));
        j50 j50Var = new j50(this, context);
        this.b = j50Var;
        j50Var.setOutlineProvider(new sl(this, 1));
        j50Var.setClipToOutline(true);
        j50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(j50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(d2Var.c, k7.b6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.b6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ph.b2 b2Var = new ph.b2(context);
        this.f = b2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        b2Var.setScaleType(scaleType);
        b2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(b2Var, k7.b6.n(44, 44));
        final int i12 = 0;
        b2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e50
            public final /* synthetic */ x50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        x50 x50Var = this.b;
                        if (x50Var.C) {
                            if (x50Var.k0) {
                                Camera2Session camera2Session = x50Var.o0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = x50Var.l0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (x50Var.e0 != null) {
                                if (!x50Var.m0) {
                                    x50Var.p();
                                }
                                gj0 gj0Var = x50Var.v;
                                int i13 = 0;
                                if (gj0Var != null) {
                                    gj0Var.K(0);
                                    x50Var.v.start();
                                }
                                x50Var.B0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(nr.h);
                                boolean[] zArr = new boolean[1];
                                f50 f50Var = new f50(x50Var, i13);
                                x50Var.b.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                x50Var.j0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new k50(x50Var, zArr, f50Var));
                                ofFloat.addListener(new nh.g3(x50Var, zArr, f50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        x50 x50Var2 = this.b;
                        x50Var2.R0 = true ^ x50Var2.R0;
                        x50Var2.r();
                        break;
                }
            }
        });
        ph.b2 b2Var2 = new ph.b2(context);
        this.h = b2Var2;
        b2Var2.setScaleType(scaleType);
        linearLayout.addView(b2Var2, k7.b6.n(44, 44));
        final int i13 = 1;
        b2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e50
            public final /* synthetic */ x50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        x50 x50Var = this.b;
                        if (x50Var.C) {
                            if (x50Var.k0) {
                                Camera2Session camera2Session = x50Var.o0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = x50Var.l0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (x50Var.e0 != null) {
                                if (!x50Var.m0) {
                                    x50Var.p();
                                }
                                gj0 gj0Var = x50Var.v;
                                int i132 = 0;
                                if (gj0Var != null) {
                                    gj0Var.K(0);
                                    x50Var.v.start();
                                }
                                x50Var.B0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(nr.h);
                                boolean[] zArr = new boolean[1];
                                f50 f50Var = new f50(x50Var, i132);
                                x50Var.b.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                x50Var.j0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new k50(x50Var, zArr, f50Var));
                                ofFloat.addListener(new nh.g3(x50Var, zArr, f50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        x50 x50Var2 = this.b;
                        x50Var2.R0 = true ^ x50Var2.R0;
                        x50Var2.r();
                        break;
                }
            }
        });
        r();
        if (!z4) {
            d2Var.a(b2Var);
            d2Var.a(b2Var2);
        } else if (!f6Var.a()) {
            b2Var.setInvert(0.6f);
            b2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, k7.b6.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, getContext(), paint);
        this.j0 = jlVar;
        int i14 = AndroidUtilities.roundPlayingMessageSize;
        addView(jlVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.T0 = false;
        setVisibility(4);
    }

    public static int a(x50 x50Var, int i10, String str) {
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

    public static boolean b() {
        if (SharedConfig.bigCameraForRound || SharedConfig.deviceIsAboveAverage() || Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (Z0[i10] == hashCode) {
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
        for (int i10 = 0; i10 < 2; i10++) {
            if (Z0[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z4) {
        o();
        i71 i71Var = this.L;
        if (i71Var != null) {
            i71Var.H();
            this.L = null;
        }
        if (this.i0 == null) {
            return;
        }
        this.d0 = true;
        this.b0 = false;
        this.R0 = false;
        r();
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.N), Integer.valueOf(z4 ? 0 : 6));
        if (this.e0 != null) {
            j();
            this.e0.b(0L, 0, true, 0, 0);
            this.e0 = null;
        } else {
            w50 w50Var = this.V0;
            if (w50Var != null) {
                w50Var.i(0, new s50(0L, 0, 0, true, 0L));
            }
        }
        if (this.U != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.U.delete();
            AutoDeleteMediaTask.unlockFile(this.U);
            this.U = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        m(false, false);
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            l50 l50Var = this.U;
            if (l50Var == null || !l50Var.getAbsolutePath().equals(str)) {
                return;
            }
            this.E = (TLRPC.InputFile) objArr[1];
            this.F = (TLRPC.InputEncryptedFile) objArr[2];
            this.I = ((Long) objArr[5]).longValue();
            if (this.F != null) {
                this.G = (byte[]) objArr[3];
                this.H = (byte[]) objArr[4];
            }
        }
    }

    public final void e(float f10, int i10) {
        i71 i71Var = this.L;
        if (i71Var == null) {
            return;
        }
        if (i10 == 0) {
            n();
            this.L.C();
        } else if (i10 == 1) {
            o();
            this.L.B();
        } else if (i10 == 2) {
            i71Var.L((long) (f10 * i71Var.p()), false);
        }
    }

    public final Size f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : b() ? 1440 : 1200;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && b()) {
            Collections.sort(arrayList2, new nh.e4(20));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.h0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float min;
        if (this.Y0 != null) {
            return;
        }
        if (this.k0) {
            Camera2Session camera2Session = this.o0;
            if (camera2Session == null) {
                return;
            } else {
                min = Utilities.clamp(this.F0, camera2Session.getMaxZoom(), this.o0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.F0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.Y0 = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 26));
            this.Y0.addListener(new h50(this, 1));
            this.Y0.setDuration(350L);
            this.Y0.setInterpolator(nr.f);
            this.Y0.start();
        }
    }

    public View getButtonsLayout() {
        return this.O0;
    }

    public r50 getCameraContainer() {
        return this.b;
    }

    public sk0 getCameraRect() {
        this.b.getLocationOnScreen(this.P);
        return new sk0(r1[0], r1[1], r0.getWidth(), r0.getHeight());
    }

    public View getMuteImageView() {
        return this.w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.i0;
    }

    public final void h(boolean z4) {
        ViewGroup viewGroup;
        if (this.k0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.n0;
                if (i10 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i10];
                if (camera2Session != null) {
                    camera2Session.destroy(z4);
                    camera2SessionArr[i10] = null;
                }
                i10++;
            }
        } else {
            CameraSession cameraSession = this.l0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.l0, !z4 ? new CountDownLatch(1) : null, null);
            }
        }
        j50 j50Var = this.b;
        j50Var.setTranslationX(0.0f);
        this.j0.setTranslationX(0.0f);
        this.r0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.i0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.i0);
        }
        this.i0 = null;
        j50Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i10;
        int i11;
        if (this.k0) {
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
            if ((this.B && cameraInfo2.isFrontface()) || (!this.B && !cameraInfo2.isFrontface())) {
                this.y = cameraInfo2;
                break;
            }
            i12++;
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
        Size[] sizeArr = this.f0;
        sizeArr[0] = f10;
        Size f11 = f(pictureSizes);
        this.g0 = f11;
        if (sizeArr[0].mWidth != f11.mWidth) {
            boolean z4 = false;
            for (int size = previewSizes.size() - 1; size >= 0; size--) {
                Size size2 = previewSizes.get(size);
                int size3 = pictureSizes.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        break;
                    }
                    Size size4 = pictureSizes.get(size3);
                    int i13 = size2.mWidth;
                    Size size5 = this.g0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.g0 = size4;
                        z4 = true;
                        break;
                    }
                    size3--;
                }
                if (z4) {
                    break;
                }
            }
            if (!z4) {
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
                            this.g0 = size9;
                            z4 = true;
                            break;
                        }
                        size8--;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("InstantCamera preview w = ");
            sb.append(sizeArr[0].mWidth);
            sb.append(" h = ");
            kh.a2.t(sizeArr[0].mHeight, sb);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.i0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.i0.getBitmap(), 50, 50, true);
        this.M = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.M.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void k(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        int i13;
        char c3;
        long j12;
        if (this.i0 == null) {
            return;
        }
        o();
        i71 i71Var = this.L;
        if (i71Var != null) {
            i71Var.H();
            this.L = null;
        }
        int i14 = this.a;
        if (i10 != 4) {
            this.d0 = this.c0 < 800;
            this.b0 = false;
            this.R0 = false;
            r();
            int i15 = this.d0 ? 4 : i10 == 3 ? 2 : 5;
            p50 p50Var = this.e0;
            int i16 = this.N;
            if (p50Var != null) {
                c3 = 1;
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i16), Integer.valueOf(i15));
                int i17 = this.d0 ? 0 : i10 == 3 ? 2 : 1;
                j();
                i13 = i16;
                this.e0.b(j10, i17, z4, i11, i12);
                this.e0 = null;
            } else {
                i13 = i16;
                c3 = 1;
            }
            if (this.d0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.c0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c3] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        w50 w50Var = this.V0;
        if (w50Var != null && this.c0 > 800) {
            w50Var.i(1, new s50(j10, i11, i12, z4, j11));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.U.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.K == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.K = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.K.needConvert()) {
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            VideoEditedInfo videoEditedInfo2 = this.K;
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
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.I));
            VideoEditedInfo videoEditedInfo3 = this.K;
            videoEditedInfo3.bitrate = MediaController.VIDEO_BITRATE_480;
            long j17 = videoEditedInfo3.startTime;
            if (j17 > j12) {
                videoEditedInfo3.startTime = j17 * 1000;
            }
            long j18 = videoEditedInfo3.endTime;
            if (j18 > j12) {
                videoEditedInfo3.endTime = j18 * 1000;
            }
            FileLoader.getInstance(i14).cancelFileUpload(this.U.getAbsolutePath(), false);
        } else {
            this.K.estimatedSize = Math.max(1L, this.I);
        }
        VideoEditedInfo videoEditedInfo4 = this.K;
        videoEditedInfo4.file = this.E;
        videoEditedInfo4.encryptedFile = this.F;
        videoEditedInfo4.key = this.G;
        videoEditedInfo4.iv = this.H;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.U.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i12;
        photoEntry.effectId = j10;
        this.c.r(photoEntry, this.K, z4, i11, 0, false, j11);
        if (i11 != 0) {
            m(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    public final void l(boolean z4) {
        if (this.i0 != null) {
            return;
        }
        if (this.v == null) {
            int i10 = R.raw.roundcamera_flip;
            int i11 = this.P0;
            gj0 gj0Var = new gj0(i10, i11, "roundcamera_flip", i11);
            this.v = gj0Var;
            gj0Var.K(0);
            this.v.setCallback(this.f);
        }
        this.f.setImageDrawable(this.v);
        this.j0.setAlpha(1.0f);
        this.j0.invalidate();
        if (this.M == null) {
            try {
                this.M = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.M;
        if (bitmap != null) {
            this.j0.setImageBitmap(bitmap);
        } else {
            this.j0.setImageResource(R.drawable.icplaceholder);
        }
        this.C = false;
        this.y = null;
        if (!z4) {
            if (!this.k0) {
                this.B = true;
            }
            r();
            this.c0 = 0L;
            this.x = 0.0f;
        }
        this.d0 = false;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.p0 = true;
        if (i()) {
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z4) {
                this.U = new l50(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.U);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.U.getAbsolutePath());
            }
            if (this.k0) {
                Context context = getContext();
                boolean z10 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.m0 = z10;
                if (z10) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.n0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.n0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.f0[i12] = new Size(this.n0[i12].getPreviewWidth(), this.n0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    r();
                    Camera2Session[] camera2SessionArr2 = this.n0;
                    boolean z11 = this.B;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z11 ? 1 : 0];
                    this.o0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z11 ? 1 : 0] == null) {
                        this.m0 = false;
                    }
                    if (camera2Session2 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.n0;
                    boolean z12 = this.B;
                    int i13 = !z12 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z12, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i13] = create;
                    this.o0 = create;
                    if (create == null) {
                        return;
                    }
                    create.setRecordingVideo(true);
                    this.f0[0] = new Size(this.o0.getPreviewWidth(), this.o0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.i0 = textureView;
            textureView.setSurfaceTextureListener(new ih.h(this, 1));
            this.b.addView(this.i0, k7.b6.c(-1.0f, -1));
            this.L0 = true;
            this.T0 = z4;
            setVisibility(0);
            m(true, z4);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    public void m(boolean z4, boolean z10) {
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.T.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z4);
        }
        org.telegram.ui.jl jlVar = this.j0;
        j50 j50Var = this.b;
        if (z4 && !this.D0) {
            j50Var.setTranslationX(0.0f);
            jlVar.setTranslationX(0.0f);
            this.r0 = z10 ? 0.0f : getMeasuredHeight() / 2.0f;
            s();
        }
        this.D0 = z4;
        View view = this.C0;
        if (view != null) {
            view.invalidate();
        }
        this.T = new AnimatorSet();
        float dp = (z4 || this.c0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z4 ? 1.0f : 0.0f, z4 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new dg.b1(7, this, z10));
        AnimatorSet animatorSet2 = this.T;
        float[] fArr = {z4 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.O0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.w, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, n6.b, z4 ? 255 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) property, z4 ? 1.0f : 0.0f);
        float f10 = z4 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) property2, f10);
        float f11 = z4 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) property3, f11);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(j50Var, (Property<j50, Float>) property4, dp), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property2, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property3, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(jlVar, (Property<org.telegram.ui.jl, Float>) property4, dp), ofFloat);
        if (z4) {
            setTranslationX(0.0f);
        } else {
            this.T.addListener(new h50(this, 2));
        }
        this.T.setDuration(180L);
        this.T.setInterpolator(new DecelerateInterpolator());
        this.T.start();
    }

    public final void n() {
        Timer timer = this.U0;
        if (timer != null) {
            try {
                timer.cancel();
                this.U0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.U0 = timer2;
        timer2.schedule(new g50(this, 0), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.U0;
        if (timer != null) {
            try {
                timer.cancel();
                this.U0 = null;
            } catch (Exception e) {
                FileLog.e(e);
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
        ph.d2 d2Var = this.n;
        if (d2Var != null) {
            d2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j50 j50Var = this.b;
        float x10 = j50Var.getX();
        float y10 = j50Var.getY();
        RectF rectF = this.e;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y10 - AndroidUtilities.dp(8.0f), x10 + j50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y10 + j50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.b0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.W) + this.a0;
            this.c0 = currentTimeMillis;
            this.x = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.x != 0.0f) {
            canvas.save();
            if (!this.B0) {
                canvas.scale(j50Var.getScaleX(), j50Var.getScaleY(), rectF.centerX(), rectF.centerY());
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
    public final void onMeasure(int i10, int i11) {
        if (this.L0) {
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i12 != this.K0) {
                this.K0 = i12;
                org.telegram.ui.jl jlVar = this.j0;
                ViewGroup.LayoutParams layoutParams = jlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = jlVar.getLayoutParams();
                int i13 = this.K0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                j50 j50Var = this.b;
                ViewGroup.LayoutParams layoutParams3 = j50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = j50Var.getLayoutParams();
                int i14 = this.K0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = (this.K0 / 2) - AndroidUtilities.dp(24.0f);
                jlVar.setRoundRadius(this.K0 / 2);
                j50Var.invalidateOutline();
            }
            this.L0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ph.d2 d2Var = this.n;
        d2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        d2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.r0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i71 i71Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.c != null && (i71Var = this.L) != null) {
            boolean x10 = i71Var.x();
            this.L.O(!x10);
            AnimatorSet animatorSet = this.D;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            float[] fArr = {!x10 ? 1.0f : 0.0f};
            ImageView imageView = this.w;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !x10 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, x10 ? 0.5f : 1.0f));
            this.D.addListener(new h50(this, 0));
            this.D.setDuration(180L);
            this.D.setInterpolator(new DecelerateInterpolator());
            this.D.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.H0 && !this.G0 && motionEvent.getPointerCount() == 2 && this.Y0 == null && this.b0) {
                this.E0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.F0 = 1.0f;
                this.I0 = motionEvent.getPointerId(0);
                this.J0 = motionEvent.getPointerId(1);
                this.G0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                j50 j50Var = this.b;
                rectF.set(j50Var.getX(), j50Var.getY(), j50Var.getX() + j50Var.getMeasuredWidth(), j50Var.getY() + j50Var.getMeasuredHeight());
                this.H0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.G0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (this.I0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (this.J0 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                this.G0 = false;
                g();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.E0;
            this.F0 = hypot;
            if (!this.k0) {
                this.l0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.o0;
            if (camera2Session != null) {
                this.o0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.o0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.I0 == motionEvent.getPointerId(0) && this.J0 == motionEvent.getPointerId(1)) || (this.I0 == motionEvent.getPointerId(1) && this.J0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.G0) {
            this.G0 = false;
            g();
            return true;
        }
        return true;
    }

    public final void p() {
        if (!this.k0 || !this.m0) {
            j();
            Bitmap bitmap = this.M;
            if (bitmap != null) {
                this.p0 = false;
                this.j0.setImageBitmap(bitmap);
                this.j0.setAlpha(1.0f);
            }
        }
        this.B = !this.B;
        r();
        if (!this.k0) {
            CameraSession cameraSession = this.l0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.l0, null, null);
                this.l0 = null;
            }
        } else {
            if (this.m0) {
                this.o0 = this.n0[!this.B ? 1 : 0];
                p50 p50Var = this.e0;
                Handler handler = p50Var.getHandler();
                if (handler != null) {
                    p50Var.sendMessage(handler.obtainMessage(4), 0);
                    p50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.o0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.o0 = null;
                this.n0[this.B ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.n0;
            boolean z4 = this.B;
            int i10 = !z4 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z4, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.o0 = create;
            if (create == null) {
                return;
            }
            create.setRecordingVideo(true);
            this.f0[0] = new Size(this.o0.getPreviewWidth(), this.o0.getPreviewHeight());
            p50 p50Var2 = this.e0;
            Camera2Session camera2Session2 = this.o0;
            Handler handler2 = p50Var2.getHandler();
            if (handler2 != null) {
                p50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        i();
        this.C = false;
        p50 p50Var3 = this.e0;
        Handler handler3 = p50Var3.getHandler();
        if (handler3 != null) {
            p50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        if (!this.b0) {
            w50 w50Var = this.V0;
            if (w50Var != null) {
                w50Var.Q.sendMessage(w50Var.Q.obtainMessage(5));
                h(false);
                i71 i71Var = this.L;
                if (i71Var != null) {
                    i71Var.H();
                    this.L = null;
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
        this.d0 = this.c0 < 800;
        this.b0 = false;
        r();
        if (this.e0 != null) {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.N), Integer.valueOf(this.d0 ? 4 : 2));
            j();
            p50 p50Var = this.e0;
            boolean z4 = this.d0;
            p50Var.b(0L, z4 ? 0 : 2, true, 0, z4 ? 0 : -2);
            this.e0 = null;
        }
        if (!this.d0) {
            w50 w50Var2 = this.V0;
            w50Var2.Q.sendMessage(w50Var2.Q.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.N), Boolean.TRUE, Integer.valueOf((int) this.c0));
            m(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final void r() {
        boolean z4 = this.R0 && this.b0 && this.B;
        if (this.S0 != z4) {
            this.S0 = z4;
            ph.d2 d2Var = this.n;
            if (z4) {
                d2Var.c(null);
            } else {
                d2Var.d();
            }
        }
        if (this.k0) {
            Camera2Session camera2Session = this.n0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.R0 && !this.B && this.b0);
            }
        } else {
            CameraSession cameraSession = this.l0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.R0 && !this.B && this.b0);
            }
        }
        ph.b2 b2Var = this.h;
        if (b2Var != null) {
            Boolean bool = this.Q0;
            if (bool == null || bool.booleanValue() != this.R0) {
                b2Var.setContentDescription(LocaleController.getString(this.R0 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z10 = this.R0;
                int i10 = this.P0;
                if (z10) {
                    if (this.s == null) {
                        gj0 gj0Var = new gj0(R.raw.roundcamera_flash_off, i10, "roundcamera_flash_off", i10);
                        this.s = gj0Var;
                        gj0Var.setCallback(b2Var);
                    }
                    b2Var.setImageDrawable(this.s);
                    if (this.Q0 == null) {
                        gj0 gj0Var2 = this.s;
                        gj0Var2.K(gj0Var2.e[0] - 1);
                    } else {
                        this.s.K(0);
                        this.s.start();
                    }
                } else {
                    if (this.r == null) {
                        gj0 gj0Var3 = new gj0(R.raw.roundcamera_flash_on, i10, "roundcamera_flash_on", i10);
                        this.r = gj0Var3;
                        gj0Var3.setCallback(b2Var);
                    }
                    b2Var.setImageDrawable(this.r);
                    if (this.Q0 == null) {
                        gj0 gj0Var4 = this.r;
                        gj0Var4.K(gj0Var4.e[0] - 1);
                    } else {
                        this.r.K(0);
                        this.r.start();
                    }
                }
                this.Q0 = Boolean.valueOf(this.R0);
            }
        }
    }

    public final void s() {
        this.j0.setTranslationY(this.r0 + this.q0);
        this.b.setTranslationY(this.r0 + this.q0);
    }

    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.O0.setAlpha(0.0f);
        j50 j50Var = this.b;
        j50Var.setAlpha(0.0f);
        org.telegram.ui.jl jlVar = this.j0;
        jlVar.setAlpha(0.0f);
        ImageView imageView = this.w;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        j50Var.setScaleX(this.T0 ? 1.0f : 0.1f);
        j50Var.setScaleY(this.T0 ? 1.0f : 0.1f);
        jlVar.setScaleX(this.T0 ? 1.0f : 0.1f);
        jlVar.setScaleY(this.T0 ? 1.0f : 0.1f);
        if (j50Var.getMeasuredWidth() != 0) {
            j50Var.setPivotX(j50Var.getMeasuredWidth() / 2);
            j50Var.setPivotY(j50Var.getMeasuredHeight() / 2);
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

    public void setIsMessageTransition(boolean z4) {
    }
}
