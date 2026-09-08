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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class w50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] c1 = {285904780, -1394191079};
    public FloatBuffer A0;
    public float B0;
    public float C0;
    public Size D0;
    public boolean E;
    public boolean E0;
    public volatile boolean F;
    public final View F0;
    public AnimatorSet G;
    public boolean G0;
    public TLRPC.InputFile H;
    public float H0;
    public TLRPC.InputEncryptedFile I;
    public float I0;
    public byte[] J;
    public boolean J0;
    public byte[] K;
    public boolean K0;
    public long L;
    public int L0;
    public final boolean M;
    public int M0;
    public VideoEditedInfo N;
    public int N0;
    public g71 O;
    public boolean O0;
    public Bitmap P;
    public final org.telegram.ui.ActionBar.f6 P0;
    public final int Q;
    public boolean Q0;
    public volatile boolean R;
    public final LinearLayout R0;
    public final int[] S;
    public final int S0;
    public final int[] T;
    public Boolean T0;
    public final int[] U;
    public boolean U0;
    public float V;
    public boolean V0;
    public AnimatorSet W;
    public boolean W0;
    public Timer X0;
    public v50 Y0;
    public Bitmap Z0;
    public final int a;
    public i50 a0;
    public volatile int a1;
    public final g50 b;
    public File b0;
    public ValueAnimator b1;
    public final o50 c;
    public long c0;
    public final f50 d;
    public long d0;
    public final RectF e;
    public boolean e0;
    public final di.w2 f;
    public long f0;
    public boolean g0;
    public final di.w2 h;
    public n50 h0;
    public final Size[] i0;
    public Size j0;
    public final Size k0;
    public TextureView l0;
    public final org.telegram.ui.ml m0;
    public final di.y2 n;
    public final boolean n0;
    public CameraSession o0;
    public boolean p0;
    public final Camera2Session[] q0;
    public xi0 r;
    public Camera2Session r0;
    public xi0 s;
    public boolean s0;
    public float t0;
    public float u0;
    public xi0 v;
    public final float[] v0;
    public final ImageView w;
    public final float[] w0;
    public float x;
    public final float[] x0;
    public CameraInfo y;
    public FloatBuffer y0;
    public FloatBuffer z0;

    public w50(Context context, o50 o50Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.E = true;
        this.S = new int[2];
        this.T = new int[]{TLObject.FLAG_31, TLObject.FLAG_31};
        this.U = new int[1];
        this.V = 1.0f;
        this.i0 = new Size[2];
        this.k0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.n0 = SharedConfig.isUsingCamera2(i10);
        this.q0 = new Camera2Session[2];
        this.v0 = new float[16];
        this.w0 = new float[16];
        this.x0 = new float[16];
        this.S0 = AndroidUtilities.dp(z10 ? 24.0f : 28.0f);
        this.P0 = f6Var;
        this.F0 = o50Var.getFragmentView();
        setWillNotDraw(false);
        this.c = o50Var;
        this.Q = o50Var.getClassGuid();
        this.M = o50Var.v();
        f50 f50Var = new f50(this, 0);
        this.d = f50Var;
        f50Var.setStyle(Paint.Style.STROKE);
        f50Var.setStrokeCap(Paint.Cap.ROUND);
        f50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        f50Var.setColor(-1);
        this.e = new RectF();
        di.y2 y2Var = new di.y2(getContext(), null, this, null);
        this.n = y2Var;
        y2Var.o = 0.5f;
        y2Var.n = di.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.b, w7.x5.e(-1, -1, 119));
        g50 g50Var = new g50(this, context);
        this.b = g50Var;
        g50Var.setOutlineProvider(new dh.b(this, 2));
        g50Var.setClipToOutline(true);
        g50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(g50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(y2Var.c, w7.x5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        di.w2 w2Var = new di.w2(context);
        this.f = w2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        w2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(w2Var, w7.x5.n(44, 44));
        final int i12 = 0;
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c50
            public final /* synthetic */ w50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        w50 w50Var = this.b;
                        if (w50Var.F) {
                            if (w50Var.n0) {
                                Camera2Session camera2Session = w50Var.r0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = w50Var.o0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (w50Var.h0 != null) {
                                if (!w50Var.p0) {
                                    w50Var.p();
                                }
                                xi0 xi0Var = w50Var.v;
                                int i13 = 0;
                                if (xi0Var != null) {
                                    xi0Var.K(0);
                                    w50Var.v.start();
                                }
                                w50Var.E0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(pr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(w50Var, i13);
                                w50Var.b.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                w50Var.m0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(w50Var, zArr, d50Var));
                                ofFloat.addListener(new bi.j4(w50Var, zArr, d50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        w50 w50Var2 = this.b;
                        w50Var2.U0 = true ^ w50Var2.U0;
                        w50Var2.r();
                        break;
                }
            }
        });
        di.w2 w2Var2 = new di.w2(context);
        this.h = w2Var2;
        w2Var2.setScaleType(scaleType);
        linearLayout.addView(w2Var2, w7.x5.n(44, 44));
        final int i13 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c50
            public final /* synthetic */ w50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        w50 w50Var = this.b;
                        if (w50Var.F) {
                            if (w50Var.n0) {
                                Camera2Session camera2Session = w50Var.r0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = w50Var.o0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (w50Var.h0 != null) {
                                if (!w50Var.p0) {
                                    w50Var.p();
                                }
                                xi0 xi0Var = w50Var.v;
                                int i132 = 0;
                                if (xi0Var != null) {
                                    xi0Var.K(0);
                                    w50Var.v.start();
                                }
                                w50Var.E0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(pr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(w50Var, i132);
                                w50Var.b.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                w50Var.m0.setCameraDistance(r2.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(w50Var, zArr, d50Var));
                                ofFloat.addListener(new bi.j4(w50Var, zArr, d50Var, 6));
                                ofFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        w50 w50Var2 = this.b;
                        w50Var2.U0 = true ^ w50Var2.U0;
                        w50Var2.r();
                        break;
                }
            }
        });
        r();
        if (!z10) {
            y2Var.a(w2Var);
            y2Var.a(w2Var2);
        } else if (!f6Var.a()) {
            w2Var.setInvert(0.6f);
            w2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.x5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.ml mlVar = new org.telegram.ui.ml(this, getContext(), paint);
        this.m0 = mlVar;
        int i14 = AndroidUtilities.roundPlayingMessageSize;
        addView(mlVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.W0 = false;
        setVisibility(4);
    }

    public static int a(w50 w50Var, int i10, String str) {
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
            if (c1[i10] == hashCode) {
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
            if (c1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        o();
        g71 g71Var = this.O;
        if (g71Var != null) {
            g71Var.H();
            this.O = null;
        }
        if (this.l0 == null) {
            return;
        }
        this.g0 = true;
        this.e0 = false;
        this.U0 = false;
        r();
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.Q), Integer.valueOf(z10 ? 0 : 6));
        if (this.h0 != null) {
            j();
            this.h0.b(0L, 0, true, 0, 0);
            this.h0 = null;
        } else {
            v50 v50Var = this.Y0;
            if (v50Var != null) {
                v50Var.i(0, new q50(0L, 0, 0, true, 0L));
            }
        }
        if (this.a0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.a0.delete();
            AutoDeleteMediaTask.unlockFile(this.a0);
            this.a0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        m(false, false);
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            i50 i50Var = this.a0;
            if (i50Var == null || !i50Var.getAbsolutePath().equals(str)) {
                return;
            }
            this.H = (TLRPC.InputFile) objArr[1];
            this.I = (TLRPC.InputEncryptedFile) objArr[2];
            this.L = ((Long) objArr[5]).longValue();
            if (this.I != null) {
                this.J = (byte[]) objArr[3];
                this.K = (byte[]) objArr[4];
            }
        }
    }

    public final void e(float f7, int i10) {
        g71 g71Var = this.O;
        if (g71Var == null) {
            return;
        }
        if (i10 == 0) {
            n();
            this.O.C();
        } else if (i10 == 1) {
            o();
            this.O.B();
        } else if (i10 == 2) {
            g71Var.L((long) (f7 * g71Var.p()), false);
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
            Collections.sort(arrayList2, new org.telegram.ui.f6(11));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.k0;
        return equalsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float min;
        if (this.b1 != null) {
            return;
        }
        if (this.n0) {
            Camera2Session camera2Session = this.r0;
            if (camera2Session == null) {
                return;
            } else {
                min = Utilities.clamp(this.I0, camera2Session.getMaxZoom(), this.r0.getMinZoom());
            }
        } else {
            min = Math.min(1.0f, Math.max(0.0f, this.I0 - 1.0f));
        }
        if (min > 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
            this.b1 = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 26));
            this.b1.addListener(new e50(this, 1));
            this.b1.setDuration(350L);
            this.b1.setInterpolator(pr.f);
            this.b1.start();
        }
    }

    public View getButtonsLayout() {
        return this.R0;
    }

    public p50 getCameraContainer() {
        return this.b;
    }

    public hk0 getCameraRect() {
        this.b.getLocationOnScreen(this.S);
        return new hk0(r1[0], r1[1], r0.getWidth(), r0.getHeight());
    }

    public View getMuteImageView() {
        return this.w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.l0;
    }

    public final void h(boolean z10) {
        ViewGroup viewGroup;
        if (this.n0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.q0;
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
            CameraSession cameraSession = this.o0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.o0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        g50 g50Var = this.b;
        g50Var.setTranslationX(0.0f);
        this.m0.setTranslationX(0.0f);
        this.u0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.l0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.l0);
        }
        this.l0 = null;
        g50Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i10;
        int i11;
        if (this.n0) {
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
            if ((this.E && cameraInfo2.isFrontface()) || (!this.E && !cameraInfo2.isFrontface())) {
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
        Size f7 = f(previewSizes);
        Size[] sizeArr = this.i0;
        sizeArr[0] = f7;
        Size f10 = f(pictureSizes);
        this.j0 = f10;
        if (sizeArr[0].mWidth != f10.mWidth) {
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
                    Size size5 = this.j0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.j0 = size4;
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
                            this.j0 = size9;
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
            i2.g.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.l0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.l0.getBitmap(), 50, 50, true);
        this.P = createScaledBitmap;
        if (createScaledBitmap != null) {
            Utilities.blurBitmap(createScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.P.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void k(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        int i13;
        char c10;
        long j11;
        if (this.l0 == null) {
            return;
        }
        o();
        g71 g71Var = this.O;
        if (g71Var != null) {
            g71Var.H();
            this.O = null;
        }
        int i14 = this.a;
        if (i10 != 4) {
            this.g0 = this.f0 < 800;
            this.e0 = false;
            this.U0 = false;
            r();
            int i15 = this.g0 ? 4 : i10 == 3 ? 2 : 5;
            n50 n50Var = this.h0;
            int i16 = this.Q;
            if (n50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i16), Integer.valueOf(i15));
                int i17 = this.g0 ? 0 : i10 == 3 ? 2 : 1;
                j();
                i13 = i16;
                this.h0.b(j3, i17, z10, i11, i12);
                this.h0 = null;
            } else {
                i13 = i16;
                c10 = 1;
            }
            if (this.g0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        v50 v50Var = this.Y0;
        if (v50Var != null && this.f0 > 800) {
            v50Var.i(1, new q50(j3, i11, i12, z10, j10));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.a0.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.N == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.N = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.N.needConvert()) {
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            VideoEditedInfo videoEditedInfo2 = this.N;
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
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j15 / d) * this.L));
            VideoEditedInfo videoEditedInfo3 = this.N;
            videoEditedInfo3.bitrate = MediaController.VIDEO_BITRATE_480;
            long j16 = videoEditedInfo3.startTime;
            if (j16 > j11) {
                videoEditedInfo3.startTime = j16 * 1000;
            }
            long j17 = videoEditedInfo3.endTime;
            if (j17 > j11) {
                videoEditedInfo3.endTime = j17 * 1000;
            }
            FileLoader.getInstance(i14).cancelFileUpload(this.a0.getAbsolutePath(), false);
        } else {
            this.N.estimatedSize = Math.max(1L, this.L);
        }
        VideoEditedInfo videoEditedInfo4 = this.N;
        videoEditedInfo4.file = this.H;
        videoEditedInfo4.encryptedFile = this.I;
        videoEditedInfo4.key = this.J;
        videoEditedInfo4.iv = this.K;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.a0.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i12;
        photoEntry.effectId = j3;
        this.c.q(photoEntry, this.N, z10, i11, 0, false, j10);
        if (i11 != 0) {
            m(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    public final void l(boolean z10) {
        if (this.l0 != null) {
            return;
        }
        if (this.v == null) {
            int i10 = R.raw.roundcamera_flip;
            int i11 = this.S0;
            xi0 xi0Var = new xi0(i10, i11, i11);
            this.v = xi0Var;
            xi0Var.K(0);
            this.v.setCallback(this.f);
        }
        this.f.setImageDrawable(this.v);
        this.m0.setAlpha(1.0f);
        this.m0.invalidate();
        if (this.P == null) {
            try {
                this.P = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.P;
        if (bitmap != null) {
            this.m0.setImageBitmap(bitmap);
        } else {
            this.m0.setImageResource(R.drawable.icplaceholder);
        }
        this.F = false;
        this.y = null;
        if (!z10) {
            if (!this.n0) {
                this.E = true;
            }
            r();
            this.f0 = 0L;
            this.x = 0.0f;
        }
        this.g0 = false;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.s0 = true;
        if (i()) {
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z10) {
                this.a0 = new i50(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.a0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.a0.getAbsolutePath());
            }
            if (this.n0) {
                Context context = getContext();
                boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.p0 = z11;
                if (z11) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.q0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.q0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.i0[i12] = new Size(this.q0[i12].getPreviewWidth(), this.q0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    r();
                    Camera2Session[] camera2SessionArr2 = this.q0;
                    boolean z12 = this.E;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.r0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.p0 = false;
                    }
                    if (camera2Session2 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.q0;
                    boolean z13 = this.E;
                    int i13 = !z13 ? 1 : 0;
                    Camera2Session create = Camera2Session.create(z13, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i13] = create;
                    this.r0 = create;
                    if (create == null) {
                        return;
                    }
                    create.setRecordingVideo(true);
                    this.i0[0] = new Size(this.r0.getPreviewWidth(), this.r0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.l0 = textureView;
            textureView.setSurfaceTextureListener(new j50(this, 0));
            this.b.addView(this.l0, w7.x5.c(-1.0f, -1));
            this.O0 = true;
            this.W0 = z10;
            setVisibility(0);
            m(true, z10);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    public void m(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.ml mlVar = this.m0;
        g50 g50Var = this.b;
        if (z10 && !this.G0) {
            g50Var.setTranslationX(0.0f);
            mlVar.setTranslationX(0.0f);
            this.u0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            s();
        }
        this.G0 = z10;
        View view = this.F0;
        if (view != null) {
            view.invalidate();
        }
        this.W = new AnimatorSet();
        float dp = (z10 || this.f0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new ah.l0(7, this, z11));
        AnimatorSet animatorSet2 = this.W;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.R0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.w, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, t6.b, z10 ? 255 : 0);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property, z10 ? 1.0f : 0.0f);
        float f7 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property2, f7);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property3, f10);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(g50Var, (Property<g50, Float>) property4, dp), ObjectAnimator.ofFloat(mlVar, (Property<org.telegram.ui.ml, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(mlVar, (Property<org.telegram.ui.ml, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(mlVar, (Property<org.telegram.ui.ml, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(mlVar, (Property<org.telegram.ui.ml, Float>) property4, dp), ofFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new e50(this, 2));
        }
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        this.W.start();
    }

    public final void n() {
        Timer timer = this.X0;
        if (timer != null) {
            try {
                timer.cancel();
                this.X0 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Timer timer2 = new Timer();
        this.X0 = timer2;
        timer2.schedule(new di.p2(this, 2), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.X0;
        if (timer != null) {
            try {
                timer.cancel();
                this.X0 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
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
        di.y2 y2Var = this.n;
        if (y2Var != null) {
            y2Var.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g50 g50Var = this.b;
        float x10 = g50Var.getX();
        float y3 = g50Var.getY();
        RectF rectF = this.e;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + g50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + g50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.e0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.c0) + this.d0;
            this.f0 = currentTimeMillis;
            this.x = Math.min(1.0f, currentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.x != 0.0f) {
            canvas.save();
            if (!this.E0) {
                canvas.scale(g50Var.getScaleX(), g50Var.getScaleY(), rectF.centerX(), rectF.centerY());
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
        if (this.O0) {
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i12 != this.N0) {
                this.N0 = i12;
                org.telegram.ui.ml mlVar = this.m0;
                ViewGroup.LayoutParams layoutParams = mlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = mlVar.getLayoutParams();
                int i13 = this.N0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                g50 g50Var = this.b;
                ViewGroup.LayoutParams layoutParams3 = g50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = g50Var.getLayoutParams();
                int i14 = this.N0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = (this.N0 / 2) - AndroidUtilities.dp(24.0f);
                mlVar.setRoundRadius(this.N0 / 2);
                g50Var.invalidateOutline();
            }
            this.O0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        di.y2 y2Var = this.n;
        y2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.u0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g71 g71Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.c != null && (g71Var = this.O) != null) {
            boolean x10 = g71Var.x();
            this.O.O(!x10);
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            float[] fArr = {!x10 ? 1.0f : 0.0f};
            ImageView imageView = this.w;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !x10 ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, x10 ? 0.5f : 1.0f));
            this.G.addListener(new e50(this, 0));
            this.G.setDuration(180L);
            this.G.setInterpolator(new DecelerateInterpolator());
            this.G.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.K0 && !this.J0 && motionEvent.getPointerCount() == 2 && this.b1 == null && this.e0) {
                this.H0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.I0 = 1.0f;
                this.L0 = motionEvent.getPointerId(0);
                this.M0 = motionEvent.getPointerId(1);
                this.J0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                g50 g50Var = this.b;
                rectF.set(g50Var.getX(), g50Var.getY(), g50Var.getX() + g50Var.getMeasuredWidth(), g50Var.getY() + g50Var.getMeasuredHeight());
                this.K0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.J0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (this.L0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (this.M0 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                this.J0 = false;
                g();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.H0;
            this.I0 = hypot;
            if (!this.n0) {
                this.o0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.r0;
            if (camera2Session != null) {
                this.r0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.r0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.L0 == motionEvent.getPointerId(0) && this.M0 == motionEvent.getPointerId(1)) || (this.L0 == motionEvent.getPointerId(1) && this.M0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.J0) {
            this.J0 = false;
            g();
            return true;
        }
        return true;
    }

    public final void p() {
        if (!this.n0 || !this.p0) {
            j();
            Bitmap bitmap = this.P;
            if (bitmap != null) {
                this.s0 = false;
                this.m0.setImageBitmap(bitmap);
                this.m0.setAlpha(1.0f);
            }
        }
        this.E = !this.E;
        r();
        if (!this.n0) {
            CameraSession cameraSession = this.o0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.o0, null, null);
                this.o0 = null;
            }
        } else {
            if (this.p0) {
                this.r0 = this.q0[!this.E ? 1 : 0];
                n50 n50Var = this.h0;
                Handler handler = n50Var.getHandler();
                if (handler != null) {
                    n50Var.sendMessage(handler.obtainMessage(4), 0);
                    n50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.r0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.r0 = null;
                this.q0[this.E ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.q0;
            boolean z10 = this.E;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.r0 = create;
            if (create == null) {
                return;
            }
            create.setRecordingVideo(true);
            this.i0[0] = new Size(this.r0.getPreviewWidth(), this.r0.getPreviewHeight());
            n50 n50Var2 = this.h0;
            Camera2Session camera2Session2 = this.r0;
            Handler handler2 = n50Var2.getHandler();
            if (handler2 != null) {
                n50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        i();
        this.F = false;
        n50 n50Var3 = this.h0;
        Handler handler3 = n50Var3.getHandler();
        if (handler3 != null) {
            n50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        if (!this.e0) {
            v50 v50Var = this.Y0;
            if (v50Var != null) {
                v50Var.T.sendMessage(v50Var.T.obtainMessage(5));
                h(false);
                g71 g71Var = this.O;
                if (g71Var != null) {
                    g71Var.H();
                    this.O = null;
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
        this.g0 = this.f0 < 800;
        this.e0 = false;
        r();
        if (this.h0 != null) {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.Q), Integer.valueOf(this.g0 ? 4 : 2));
            j();
            n50 n50Var = this.h0;
            boolean z10 = this.g0;
            n50Var.b(0L, z10 ? 0 : 2, true, 0, z10 ? 0 : -2);
            this.h0 = null;
        }
        if (!this.g0) {
            v50 v50Var2 = this.Y0;
            v50Var2.T.sendMessage(v50Var2.T.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.Q), Boolean.TRUE, Integer.valueOf((int) this.f0));
            m(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final void r() {
        boolean z10 = this.U0 && this.e0 && this.E;
        if (this.V0 != z10) {
            this.V0 = z10;
            di.y2 y2Var = this.n;
            if (z10) {
                y2Var.c(null);
            } else {
                y2Var.d();
            }
        }
        if (this.n0) {
            Camera2Session camera2Session = this.q0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.U0 && !this.E && this.e0);
            }
        } else {
            CameraSession cameraSession = this.o0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.U0 && !this.E && this.e0);
            }
        }
        di.w2 w2Var = this.h;
        if (w2Var != null) {
            Boolean bool = this.T0;
            if (bool == null || bool.booleanValue() != this.U0) {
                w2Var.setContentDescription(LocaleController.getString(this.U0 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z11 = this.U0;
                int i10 = this.S0;
                if (z11) {
                    if (this.s == null) {
                        xi0 xi0Var = new xi0(R.raw.roundcamera_flash_off, i10, i10);
                        this.s = xi0Var;
                        xi0Var.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.s);
                    if (this.T0 == null) {
                        xi0 xi0Var2 = this.s;
                        xi0Var2.K(xi0Var2.e[0] - 1);
                    } else {
                        this.s.K(0);
                        this.s.start();
                    }
                } else {
                    if (this.r == null) {
                        xi0 xi0Var3 = new xi0(R.raw.roundcamera_flash_on, i10, i10);
                        this.r = xi0Var3;
                        xi0Var3.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.r);
                    if (this.T0 == null) {
                        xi0 xi0Var4 = this.r;
                        xi0Var4.K(xi0Var4.e[0] - 1);
                    } else {
                        this.r.K(0);
                        this.r.start();
                    }
                }
                this.T0 = Boolean.valueOf(this.U0);
            }
        }
    }

    public final void s() {
        this.m0.setTranslationY(this.u0 + this.t0);
        this.b.setTranslationY(this.u0 + this.t0);
    }

    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.R0.setAlpha(0.0f);
        g50 g50Var = this.b;
        g50Var.setAlpha(0.0f);
        org.telegram.ui.ml mlVar = this.m0;
        mlVar.setAlpha(0.0f);
        ImageView imageView = this.w;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        g50Var.setScaleX(this.W0 ? 1.0f : 0.1f);
        g50Var.setScaleY(this.W0 ? 1.0f : 0.1f);
        mlVar.setScaleX(this.W0 ? 1.0f : 0.1f);
        mlVar.setScaleY(this.W0 ? 1.0f : 0.1f);
        if (g50Var.getMeasuredWidth() != 0) {
            g50Var.setPivotX(g50Var.getMeasuredWidth() / 2);
            g50Var.setPivotY(g50Var.getMeasuredHeight() / 2);
            mlVar.setPivotX(mlVar.getMeasuredWidth() / 2);
            mlVar.setPivotY(mlVar.getMeasuredHeight() / 2);
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

    public void setIsMessageTransition(boolean z10) {
    }
}
