package org.telegram.messenger.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import ih.f1;
import j3.r0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.y5;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class CameraView extends FrameLayout implements TextureView.SurfaceTextureListener, CameraController.ICameraView, CameraController.ErrorCallback {
    private static final int MSG_AUDIOFRAME_AVAILABLE = 3;
    private static final int MSG_START_RECORDING = 0;
    private static final int MSG_STOP_RECORDING = 1;
    private static final int MSG_VIDEOFRAME_AVAILABLE = 2;
    private static final int audioSampleRate = 44100;
    public boolean WRITE_TO_FILE_IN_BACKGROUND;
    private Object blurRenderNode;
    private TextureView blurTextureView;
    public ImageView blurredStubView;
    Rect bounds;
    private File cameraFile;
    private float[][] cameraMatrix;
    private final CameraSessionWrapper[] cameraSession;
    private CameraSessionWrapper cameraSessionRecording;
    private final int[][] cameraTexture;
    protected CameraGLThread cameraThread;
    private int clipBottom;
    private int clipTop;
    private boolean closingDualCamera;
    private int cx;
    private int cy;
    private CameraViewDelegate delegate;
    protected boolean dual;
    private boolean dualCameraAppeared;
    private Matrix dualMatrix;
    boolean firstFrame2Rendered;
    boolean firstFrameRendered;
    public boolean fit;
    ValueAnimator flipAnimator;
    boolean flipHalfReached;
    boolean flipping;
    private int focusAreaSize;
    private float focusProgress;
    private int fpsLimit;
    CameraInfo[] info;
    private boolean initFirstCameraAfterSecond;
    private boolean inited;
    private boolean initialFrontface;
    private float innerAlpha;
    private Paint innerPaint;
    private DecelerateInterpolator interpolator;
    private final ArrayList<Runnable> invalidateListeners;
    private boolean isFrontface;
    public boolean isStory;
    private volatile float lastCrossfadeValue;
    private long lastDrawTime;
    private long lastDualSwitchTime;
    private int lastHeight;
    private volatile float lastShapeTo;
    private int lastWidth;
    private final Object layoutLock;
    private boolean lazy;
    private float[][] mMVPMatrix;
    private float[][] mSTMatrix;
    private Matrix matrix;
    private int measurementsCount;
    private boolean mirror;
    private float[][] moldSTMatrix;
    long nextFrameTimeNs;
    Runnable onRecordingFinishRunnable;
    private boolean optimizeForBarcode;
    private float outerAlpha;
    private Paint outerPaint;
    private Size[] pictureSize;
    private volatile float pixelDualH;
    private volatile float pixelDualW;
    private volatile float pixelH;
    private volatile float pixelW;
    private Size[] previewSize;
    File recordFile;
    public boolean recordHevc;
    private Object renderNode;
    private float scaleX;
    private float scaleY;
    private Integer shape;
    private volatile float shapeValue;
    private volatile int surfaceHeight;
    private volatile int surfaceWidth;
    private float takePictureProgress;
    private FloatBuffer textureBuffer;
    private boolean textureInited;
    private TextureView textureView;
    private ValueAnimator textureViewAnimator;
    private Drawable thumbDrawable;
    private long toggleDualUntil;
    public boolean toggledDualAsSave;
    private Matrix txform;
    private final Runnable updateRotationMatrix;
    private final boolean useCamera2;
    private boolean useMaxPreview;
    private FloatBuffer vertexBuffer;
    private VideoRecorder videoEncoder;
    private int videoHeight;
    private int videoWidth;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class CameraGLThread extends DispatchQueue {
        private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        private static final int EGL_OPENGL_ES2_BIT = 4;
        private final int BLUR_CAMERA1;
        private final int DO_BLUR_TEXTURE;
        private final int DO_DUAL_END;
        private final int DO_DUAL_FLIP;
        private final int DO_DUAL_MOVE;
        private final int DO_DUAL_START;
        private final int DO_DUAL_TOGGLE_SHAPE;
        private final int DO_REINIT_MESSAGE;
        private final int DO_RENDER_MESSAGE;
        private final int DO_SETSESSION_MESSAGE;
        private final int DO_SHUTDOWN_MESSAGE;
        private final int DO_START_RECORDING;
        private final int DO_STOP_RECORDING;
        private int alphaHandle;
        final int[] array;
        private int blurCameraMatrixHandle;
        private int blurHandle;
        private boolean blurInited;
        private int blurPixelHandle;
        private int blurPositionHandle;
        private SurfaceTexture blurSurfaceTexture;
        private int blurTextureHandle;
        private int blurTextureMatrixHandle;
        private int blurVertexMatrixHandle;
        private final y5 camera1Appear;
        private boolean camera1Appeared;
        private long camera1AppearedUntil;
        private final int[] cameraId;
        private int cameraMatrixHandle;
        private final SurfaceTexture[] cameraSurface;
        private final y5 crossfade;
        private int crossfadeHandle;
        private boolean crossfading;
        private final CameraSessionWrapper[] currentSession;
        private int drawBlurProgram;
        private int drawProgram;
        private final y5 dualAppear;
        private boolean dualAppeared;
        private int dualHandle;
        private EGL10 egl10;
        private EGLContext eglBlurContext;
        private EGLSurface eglBlurSurface;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private boolean ignoreCamera1Upd;
        private boolean initDual;
        private Matrix initDualMatrix;
        private boolean initDualReverse;
        private boolean initied;
        private float[] m3x3;
        private boolean needRecord;
        private int oppositeCameraMatrixHandle;
        private long pausedTime;
        private int pixelHandle;
        private int positionHandle;
        private boolean recording;
        private int roundRadiusHandle;
        private int scaleHandle;
        private final y5 shape;
        private int shapeFromHandle;
        private int shapeHandle;
        private float shapeTo;
        private int shapeToHandle;
        private SurfaceTexture surfaceTexture;
        private int textureHandle;
        private int textureMatrixHandle;
        private final Object updateTex1;
        private final Object updateTex2;
        private final Object updateTexBoth;
        private int vertexMatrixHandle;
        private final float[] verticesData;

        public CameraGLThread(SurfaceTexture surfaceTexture) {
            super("CameraGLThread");
            this.currentSession = new CameraSessionWrapper[2];
            this.cameraSurface = new SurfaceTexture[2];
            this.DO_RENDER_MESSAGE = 0;
            this.DO_SHUTDOWN_MESSAGE = 1;
            this.DO_REINIT_MESSAGE = 2;
            this.DO_SETSESSION_MESSAGE = 3;
            this.DO_START_RECORDING = 4;
            this.DO_STOP_RECORDING = 5;
            this.DO_DUAL_START = 6;
            this.DO_DUAL_MOVE = 7;
            this.DO_DUAL_FLIP = 8;
            this.DO_DUAL_TOGGLE_SHAPE = 9;
            this.DO_DUAL_END = 10;
            this.BLUR_CAMERA1 = 11;
            this.DO_BLUR_TEXTURE = 12;
            this.cameraId = new int[]{-1, -1};
            this.verticesData = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
            p pVar = new p(this, 2);
            gr grVar = gr.h;
            this.crossfade = new y5(pVar, 560L, grVar);
            this.camera1Appear = new y5(1.0f, new p(this, 3), 0L, 420L, grVar);
            this.dualAppear = new y5(new p(this, 4), 340L, grVar);
            this.shape = new y5(new p(this, 5), 340L, grVar);
            this.shapeTo = MessagesController.getGlobalMainSettings().getInt("dualshape", 0);
            this.array = new int[1];
            this.updateTex1 = new Object();
            this.updateTex2 = new Object();
            this.updateTexBoth = new Object();
            this.surfaceTexture = surfaceTexture;
            this.initDual = CameraView.this.dual;
            this.initDualReverse = !CameraView.this.isFrontface;
            this.initDualMatrix = CameraView.this.dualMatrix;
        }

        private void applyDualMatrix(Matrix matrix) {
            getValues(matrix, CameraView.this.cameraMatrix[1]);
        }

        private void getValues(Matrix matrix, float[] fArr) {
            if (this.m3x3 == null) {
                this.m3x3 = new float[9];
            }
            matrix.getValues(this.m3x3);
            float[] fArr2 = this.m3x3;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }

        private boolean initBlurGL() {
            if (!this.initied) {
                return false;
            }
            EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, this.eglConfig, this.eglContext, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            this.eglBlurContext = eglCreateContext;
            if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                this.eglBlurContext = null;
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglCreateContext (blur) failed "));
                }
                return false;
            }
            SurfaceTexture surfaceTexture = this.blurSurfaceTexture;
            if (surfaceTexture == null) {
                finishBlur();
                return false;
            }
            EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
            this.eglBlurSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("createWindowSurface failed "));
                }
                finishBlur();
                return false;
            }
            if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglBlurContext)) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                }
                finishBlur();
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                return false;
            }
            int loadShader = CameraView.this.loadShader(35633, AndroidUtilities.readRes(R.raw.camera_blur_vert));
            int loadShader2 = CameraView.this.loadShader(35632, AndroidUtilities.readRes(R.raw.camera_blur_frag));
            if (loadShader != 0 && loadShader2 != 0) {
                int glCreateProgram = GLES20.glCreateProgram();
                this.drawBlurProgram = glCreateProgram;
                GLES20.glAttachShader(glCreateProgram, loadShader);
                GLES20.glAttachShader(this.drawBlurProgram, loadShader2);
                GLES20.glLinkProgram(this.drawBlurProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(this.drawBlurProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.drawBlurProgram);
                    this.drawBlurProgram = 0;
                } else {
                    this.blurPositionHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aPosition");
                    this.blurTextureHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aTextureCoord");
                    this.blurVertexMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uMVPMatrix");
                    this.blurTextureMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uSTMatrix");
                    this.blurCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "cameraMatrix");
                    this.blurPixelHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "pixelWH");
                }
            }
            return true;
        }

        private boolean initGL() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                this.eglDisplay = null;
                finish();
                return false;
            }
            if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
                return false;
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
                return false;
            }
            if (iArr[0] <= 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
                return false;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.eglConfig = eGLConfig;
            int[] iArr2 = {EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
            EGL10 egl102 = this.egl10;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr2);
            this.eglContext = eglCreateContext;
            if (eglCreateContext == null || eglCreateContext == eGLContext) {
                this.eglContext = null;
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglCreateContext failed "));
                }
                finish();
                return false;
            }
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            if (surfaceTexture == null) {
                finish();
                return false;
            }
            EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("createWindowSurface failed "));
                }
                finish();
                return false;
            }
            if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                }
                finish();
                return false;
            }
            android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix[0], 0);
            int loadShader = CameraView.this.loadShader(35633, AndroidUtilities.readRes(R.raw.camera_vert));
            int loadShader2 = CameraView.this.loadShader(35632, AndroidUtilities.readRes(R.raw.camera_frag));
            if (loadShader == 0 || loadShader2 == 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("failed creating shader");
                }
                finish();
                return false;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            this.drawProgram = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, loadShader);
            GLES20.glAttachShader(this.drawProgram, loadShader2);
            GLES20.glLinkProgram(this.drawProgram);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.drawProgram, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("failed link shader");
                }
                GLES20.glDeleteProgram(this.drawProgram);
                this.drawProgram = 0;
            } else {
                this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
                this.cameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "cameraMatrix");
                this.oppositeCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "oppositeCameraMatrix");
                this.roundRadiusHandle = GLES20.glGetUniformLocation(this.drawProgram, "roundRadius");
                this.pixelHandle = GLES20.glGetUniformLocation(this.drawProgram, "pixelWH");
                this.dualHandle = GLES20.glGetUniformLocation(this.drawProgram, "dual");
                this.scaleHandle = GLES20.glGetUniformLocation(this.drawProgram, "scale");
                this.blurHandle = GLES20.glGetUniformLocation(this.drawProgram, "blur");
                this.alphaHandle = GLES20.glGetUniformLocation(this.drawProgram, "alpha");
                this.crossfadeHandle = GLES20.glGetUniformLocation(this.drawProgram, "crossfade");
                this.shapeFromHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeFrom");
                this.shapeToHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeTo");
                this.shapeHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeT");
            }
            GLES20.glGenTextures(1, CameraView.this.cameraTexture[0], 0);
            GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0][0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[0], 0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("gl initied");
            }
            updateScale(0);
            float f10 = (1.0f / CameraView.this.scaleX) / 2.0f;
            float f11 = (1.0f / CameraView.this.scaleY) / 2.0f;
            float f12 = 0.5f - f10;
            float f13 = 0.5f - f11;
            float f14 = f10 + 0.5f;
            float f15 = f11 + 0.5f;
            CameraView.this.vertexBuffer = ByteBuffer.allocateDirect(this.verticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            CameraView.this.vertexBuffer.put(this.verticesData).position(0);
            CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            CameraView.this.textureBuffer.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
            this.cameraSurface[0] = new SurfaceTexture(CameraView.this.cameraTexture[0][0]);
            this.cameraSurface[0].setOnFrameAvailableListener(new q(this));
            if (this.initDual) {
                GLES20.glGenTextures(1, CameraView.this.cameraTexture[1], 0);
                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[1][0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.cameraSurface[1] = new SurfaceTexture(CameraView.this.cameraTexture[1][0]);
                this.cameraSurface[1].setOnFrameAvailableListener(new q(this));
            }
            if (!this.initDual) {
                CameraView.this.createCamera(this.cameraSurface[0], 0);
            } else if (this.initDualReverse) {
                CameraView.this.createCamera(this.cameraSurface[1], 1);
                CameraView.this.createCamera(this.cameraSurface[0], 0);
            } else {
                CameraView.this.createCamera(this.cameraSurface[0], 0);
                CameraView.this.createCamera(this.cameraSurface[1], 1);
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            getValues(matrix, CameraView.this.cameraMatrix[0]);
            Matrix matrix2 = this.initDualMatrix;
            if (matrix2 != null) {
                getValues(matrix2, CameraView.this.cameraMatrix[1]);
            } else {
                getValues(matrix, CameraView.this.cameraMatrix[1]);
            }
            CameraView.this.lastShapeTo = this.shapeTo;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            requestRender(false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1() {
            requestRender(false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2() {
            requestRender(false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3() {
            requestRender(false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDraw$4() {
            CameraView.this.onFirstFrameRendered(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDraw$5() {
            CameraView.this.onFirstFrameRendered(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r29v1 */
        /* JADX WARN: Type inference failed for: r29v2 */
        private void onDraw(int i9, int i10, boolean z10, boolean z11) {
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Object obj;
            char c10;
            float f10;
            int i11;
            int i12;
            int i13;
            CameraSessionWrapper cameraSessionWrapper;
            int width;
            int height;
            CameraSessionWrapper cameraSessionWrapper2;
            if (this.initied) {
                if (!this.eglContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            ll.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                }
                synchronized (CameraView.this.layoutLock) {
                    z12 = CameraView.this.dual;
                    z13 = this.camera1Appeared;
                }
                boolean z16 = true;
                if ((z10 || z11 != 0) && z13) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = z10;
                    z15 = z11;
                }
                if (z14) {
                    try {
                        SurfaceTexture surfaceTexture = this.cameraSurface[0];
                        if (surfaceTexture != null && i9 >= 0) {
                            surfaceTexture.updateTexImage();
                        }
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                if (z15) {
                    try {
                        SurfaceTexture surfaceTexture2 = this.cameraSurface[1];
                        if (surfaceTexture2 != null && i10 >= 0) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
                Object obj2 = CameraView.this.layoutLock;
                synchronized (obj2) {
                    try {
                        try {
                            if (CameraView.this.fpsLimit <= 0) {
                                obj = obj2;
                                c10 = 0;
                            } else {
                                long nanoTime = System.nanoTime();
                                CameraView cameraView = CameraView.this;
                                long j10 = cameraView.nextFrameTimeNs;
                                if (nanoTime < j10) {
                                    obj = obj2;
                                    c10 = 0;
                                    z16 = false;
                                } else {
                                    obj = obj2;
                                    c10 = 0;
                                    cameraView.nextFrameTimeNs = j10 + (TimeUnit.SECONDS.toNanos(1L) / CameraView.this.fpsLimit);
                                    CameraView cameraView2 = CameraView.this;
                                    cameraView2.nextFrameTimeNs = Math.max(cameraView2.nextFrameTimeNs, nanoTime);
                                    z16 = true;
                                }
                            }
                            CameraSessionWrapper cameraSessionWrapper3 = this.currentSession[c10];
                            if (cameraSessionWrapper3 == null || cameraSessionWrapper3.getCameraId() != i9) {
                                return;
                            }
                            if (this.recording && CameraView.this.videoEncoder != null && (z14 || z15)) {
                                CameraView.this.videoEncoder.frameAvailable(this.cameraSurface[c10], Integer.valueOf(i9), System.nanoTime());
                            }
                            if (z16) {
                                this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, this.array);
                                int[] iArr = this.array;
                                int i14 = iArr[c10];
                                this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
                                GLES20.glViewport(0, 0, i14, this.array[c10]);
                                if (z12) {
                                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                    GLES20.glClear(16384);
                                }
                                CameraView.this.shapeValue = this.shape.d(this.shapeTo, false);
                                float f11 = CameraView.this.lastCrossfadeValue = this.crossfade.d(0.0f, false);
                                float d = this.dualAppear.d(this.dualAppeared ? 1.0f : 0.0f, false);
                                float e10 = 1.0f - this.camera1Appear.e(this.camera1Appeared);
                                if (f11 <= 0.0f) {
                                    this.crossfading = false;
                                }
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                while (i16 < 2) {
                                    if (i16 != i15 || this.crossfading) {
                                        int i18 = i16 < 0 ? 1 : i16;
                                        if (this.cameraSurface[i18] != null && ((i18 == 0 || ((cameraSessionWrapper2 = this.currentSession[i18]) != null && cameraSessionWrapper2.isInitiated())) && (i18 != 0 || i9 >= 0 || z12))) {
                                            if (i18 != 1 || i10 >= 0) {
                                                if ((i18 == 0 && z14) || (i18 == 1 && z15)) {
                                                    this.cameraSurface[i18].getTransformMatrix(CameraView.this.mSTMatrix[i18]);
                                                }
                                                GLES20.glUseProgram(this.drawProgram);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i18][0]);
                                                if (i17 == i15) {
                                                    i17 = CameraView.this.cameraTexture[i18][0];
                                                }
                                                GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                                GLES20.glEnableVertexAttribArray(this.positionHandle);
                                                GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                                GLES20.glEnableVertexAttribArray(this.textureHandle);
                                                GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i18], 0);
                                                GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i18], 0);
                                                GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i18], 0);
                                                GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i18], 0);
                                                Size size = CameraView.this.previewSize[i18];
                                                if (size != null && (cameraSessionWrapper = this.currentSession[i18]) != null) {
                                                    int worldAngle = cameraSessionWrapper.getWorldAngle();
                                                    if (worldAngle == 90 || worldAngle == 270) {
                                                        width = size.getWidth();
                                                        height = size.getHeight();
                                                    } else {
                                                        width = size.getHeight();
                                                        height = size.getWidth();
                                                    }
                                                    GLES20.glUniform2f(this.pixelHandle, width, height);
                                                } else if (i18 == 0) {
                                                    GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                                                } else {
                                                    GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
                                                }
                                                if (i18 == 0) {
                                                    GLES20.glUniform1f(this.dualHandle, z12 ? 1.0f : 0.0f);
                                                    f10 = 1.0f;
                                                } else {
                                                    f10 = 1.0f;
                                                    GLES20.glUniform1f(this.dualHandle, 1.0f);
                                                }
                                                GLES20.glUniform1f(this.blurHandle, i18 == 0 ? e10 : 0.0f);
                                                if (i18 == 1) {
                                                    GLES20.glUniform1f(this.alphaHandle, f10);
                                                    if (i16 < 0) {
                                                        GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                        GLES20.glUniform1f(this.scaleHandle, f10);
                                                        GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                        GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                        GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                        GLES20.glUniform1f(this.crossfadeHandle, f10);
                                                    } else if (this.crossfading) {
                                                        GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                                        GLES20.glUniform1f(this.scaleHandle, 1.0f - f11);
                                                        GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                        GLES20.glUniform1f(this.shapeHandle, f11);
                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                    } else {
                                                        GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                                        GLES20.glUniform1f(this.scaleHandle, d);
                                                        GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                    }
                                                    i11 = 4;
                                                    i12 = 5;
                                                    i13 = 0;
                                                } else {
                                                    GLES20.glUniform1f(this.alphaHandle, 1.0f);
                                                    if (this.crossfading) {
                                                        GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), f11));
                                                        GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                                        GLES20.glUniform1f(this.shapeFromHandle, this.shapeTo);
                                                        GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                        GLES20.glUniform1f(this.shapeHandle, Utilities.clamp(1.0f - f11, 1.0f, 0.0f));
                                                        GLES20.glUniform1f(this.crossfadeHandle, f11);
                                                    } else {
                                                        GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                        GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                                        GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                        GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                        GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                    }
                                                    i11 = 4;
                                                    i12 = 5;
                                                    i13 = 0;
                                                }
                                                GLES20.glDrawArrays(i12, i13, i11);
                                                GLES20.glDisableVertexAttribArray(this.positionHandle);
                                                GLES20.glDisableVertexAttribArray(this.textureHandle);
                                                GLES20.glBindTexture(36197, i13);
                                                GLES20.glUseProgram(i13);
                                                i16++;
                                                i15 = -1;
                                            }
                                            i16++;
                                            i15 = -1;
                                        }
                                    }
                                    i16++;
                                    i15 = -1;
                                }
                                this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                                if (this.blurSurfaceTexture != null && this.blurInited) {
                                    if (!this.eglBlurContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglBlurSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                                        EGL10 egl102 = this.egl10;
                                        EGLDisplay eGLDisplay2 = this.eglDisplay;
                                        EGLSurface eGLSurface2 = this.eglBlurSurface;
                                        if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglBlurContext)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                ll.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                        }
                                    }
                                    if (this.cameraSurface[0] != null) {
                                        GLES20.glUseProgram(this.drawBlurProgram);
                                        GLES20.glActiveTexture(33984);
                                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0][0]);
                                        GLES20.glVertexAttribPointer(this.blurPositionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                        GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                                        GLES20.glVertexAttribPointer(this.blurTextureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                        GLES20.glEnableVertexAttribArray(this.blurTextureHandle);
                                        GLES20.glUniformMatrix4fv(this.blurCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[0], 0);
                                        GLES20.glUniformMatrix4fv(this.blurTextureMatrixHandle, 1, false, CameraView.this.mSTMatrix[0], 0);
                                        GLES20.glUniformMatrix4fv(this.blurVertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[0], 0);
                                        GLES20.glUniform2f(this.blurPixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                                        GLES20.glDrawArrays(5, 0, 4);
                                        GLES20.glDisableVertexAttribArray(this.blurPositionHandle);
                                        GLES20.glDisableVertexAttribArray(this.blurTextureHandle);
                                        this.egl10.eglSwapBuffers(this.eglDisplay, this.eglBlurSurface);
                                    }
                                }
                                synchronized (CameraView.this.layoutLock) {
                                    try {
                                        CameraView cameraView3 = CameraView.this;
                                        if (!cameraView3.firstFrameRendered && z13) {
                                            cameraView3.firstFrameRendered = true;
                                            AndroidUtilities.runOnUIThread(new p(this, 0));
                                        }
                                        CameraView cameraView4 = CameraView.this;
                                        if (!cameraView4.firstFrame2Rendered && this.dualAppeared) {
                                            cameraView4.firstFrame2Rendered = true;
                                            AndroidUtilities.runOnUIThread(new p(this, 1));
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z11 = obj2;
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updTex(SurfaceTexture surfaceTexture) {
            SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
            if (surfaceTexture == surfaceTextureArr[0]) {
                if (!this.ignoreCamera1Upd && System.currentTimeMillis() > this.camera1AppearedUntil) {
                    this.camera1Appeared = true;
                }
                requestRender(true, false);
                return;
            }
            if (surfaceTexture == surfaceTextureArr[1]) {
                if (!this.dualAppeared) {
                    synchronized (CameraView.this.layoutLock) {
                        CameraView.this.dualCameraAppeared = true;
                        CameraView.this.addToDualWait(1200L);
                    }
                }
                this.dualAppeared = true;
                requestRender(false, true);
            }
        }

        private void updateScale(int i9) {
            if (CameraView.this.previewSize[i9] != null) {
                int width = CameraView.this.previewSize[i9].getWidth();
                float min = CameraView.this.surfaceWidth / Math.min(width, r4);
                int i10 = (int) (width * min);
                int height = (int) (CameraView.this.previewSize[i9].getHeight() * min);
                if (i10 == height) {
                    CameraView.this.scaleX = 1.0f;
                    CameraView.this.scaleY = 1.0f;
                } else if (i10 > height) {
                    CameraView.this.scaleX = height / r0.surfaceWidth;
                    CameraView.this.scaleY = 1.0f;
                } else {
                    CameraView.this.scaleX = 1.0f;
                    CameraView.this.scaleY = i10 / r4.surfaceHeight;
                }
                FileLog.d("CameraView camera scaleX = " + CameraView.this.scaleX + " scaleY = " + CameraView.this.scaleY);
            }
        }

        public void finish() {
            if (this.cameraSurface != null) {
                int i9 = 0;
                while (true) {
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    if (i9 >= surfaceTextureArr.length) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = surfaceTextureArr[i9];
                    if (surfaceTexture != null) {
                        surfaceTexture.setOnFrameAvailableListener(null);
                        this.cameraSurface[i9].release();
                        this.cameraSurface[i9] = null;
                    }
                    i9++;
                }
            }
            finishBlur();
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != null) {
                this.egl10.eglTerminate(eGLDisplay2);
                this.eglDisplay = null;
            }
        }

        public void finishBlur() {
            if (this.eglBlurSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglBlurSurface);
                this.eglBlurSurface = null;
            }
            EGLContext eGLContext = this.eglBlurContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglBlurContext = null;
            }
            this.blurInited = false;
        }

        @Override // org.telegram.messenger.DispatchQueue
        public void handleMessage(Message message) {
            int i9 = message.what;
            boolean z10 = true;
            switch (i9) {
                case 0:
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    Object obj = message.obj;
                    Object obj2 = this.updateTexBoth;
                    boolean z11 = obj == obj2 || obj == this.updateTex1;
                    if (obj != obj2 && obj != this.updateTex2) {
                        z10 = false;
                    }
                    onDraw(i10, i11, z11, z10);
                    return;
                case 1:
                    finishBlur();
                    finish();
                    if (this.recording) {
                        CameraView.this.videoEncoder.stopRecording(message.arg1);
                    }
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        myLooper.quit();
                        return;
                    }
                    return;
                case 2:
                case 6:
                    int i12 = i9 == 2 ? 0 : 1;
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture = this.cameraSurface[i12];
                    if (surfaceTexture != null) {
                        surfaceTexture.getTransformMatrix(CameraView.this.moldSTMatrix[i12]);
                        this.cameraSurface[i12].setOnFrameAvailableListener(null);
                        this.cameraSurface[i12].release();
                        this.cameraSurface[i12] = null;
                    }
                    if (CameraView.this.cameraTexture[i12][0] == 0) {
                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[i12], 0);
                    }
                    this.cameraId[i12] = message.arg1;
                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i12][0]);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    if (i12 == 1) {
                        applyDualMatrix((Matrix) message.obj);
                    }
                    this.cameraSurface[i12] = new SurfaceTexture(CameraView.this.cameraTexture[i12][0]);
                    this.cameraSurface[i12].setOnFrameAvailableListener(new q(this));
                    if (this.ignoreCamera1Upd) {
                        this.camera1Appeared = false;
                        this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                        this.ignoreCamera1Upd = false;
                    }
                    CameraView.this.createCamera(this.cameraSurface[i12], i12);
                    updateScale(i12);
                    float f10 = (1.0f / CameraView.this.scaleX) / 2.0f;
                    float f11 = (1.0f / CameraView.this.scaleY) / 2.0f;
                    float f12 = 0.5f - f10;
                    float f13 = 0.5f - f11;
                    float f14 = f10 + 0.5f;
                    float f15 = f11 + 0.5f;
                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    CameraView.this.textureBuffer.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                    if (i12 == 1) {
                        this.dualAppeared = false;
                        synchronized (CameraView.this.layoutLock) {
                            CameraView.this.dualCameraAppeared = false;
                            CameraView.this.firstFrame2Rendered = false;
                        }
                        this.dualAppear.d(0.0f, true);
                        return;
                    }
                    return;
                case 3:
                    int i13 = message.arg1;
                    CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) message.obj;
                    if (cameraSessionWrapper == null) {
                        return;
                    }
                    CameraSessionWrapper[] cameraSessionWrapperArr = this.currentSession;
                    if (cameraSessionWrapperArr[i13] != cameraSessionWrapper) {
                        cameraSessionWrapperArr[i13] = cameraSessionWrapper;
                        this.cameraId[i13] = cameraSessionWrapper.getCameraId();
                    }
                    int worldAngle = this.currentSession[i13].getWorldAngle();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("CameraView set gl renderer session " + i13 + " angle=" + worldAngle);
                    }
                    android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[i13], 0);
                    if (worldAngle != 0) {
                        android.opengl.Matrix.rotateM(CameraView.this.mMVPMatrix[i13], 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                case 4:
                    if (this.initied) {
                        CameraView cameraView = CameraView.this;
                        cameraView.recordFile = (File) message.obj;
                        cameraView.videoEncoder = new VideoRecorder();
                        this.recording = true;
                        CameraView.this.videoEncoder.startRecording(CameraView.this.recordFile, EGL14.eglGetCurrentContext());
                        return;
                    }
                    return;
                case 5:
                    if (CameraView.this.videoEncoder != null) {
                        CameraView.this.videoEncoder.stopRecording(0);
                        CameraView.this.videoEncoder = null;
                    }
                    this.recording = false;
                    return;
                case 7:
                    applyDualMatrix((Matrix) message.obj);
                    requestRender(false, false);
                    return;
                case 8:
                    int[] iArr = this.cameraId;
                    int i14 = iArr[0];
                    iArr[0] = iArr[1];
                    iArr[1] = i14;
                    CameraSessionWrapper[] cameraSessionWrapperArr2 = this.currentSession;
                    CameraSessionWrapper cameraSessionWrapper2 = cameraSessionWrapperArr2[0];
                    cameraSessionWrapperArr2[0] = cameraSessionWrapperArr2[1];
                    cameraSessionWrapperArr2[1] = cameraSessionWrapper2;
                    int[] iArr2 = CameraView.this.cameraTexture[0];
                    CameraView.this.cameraTexture[0] = CameraView.this.cameraTexture[1];
                    CameraView.this.cameraTexture[1] = iArr2;
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    SurfaceTexture surfaceTexture2 = surfaceTextureArr[0];
                    surfaceTextureArr[0] = surfaceTextureArr[1];
                    surfaceTextureArr[1] = surfaceTexture2;
                    float[] fArr = CameraView.this.mMVPMatrix[0];
                    CameraView.this.mMVPMatrix[0] = CameraView.this.mMVPMatrix[1];
                    CameraView.this.mMVPMatrix[1] = fArr;
                    float[] fArr2 = CameraView.this.mSTMatrix[0];
                    CameraView.this.mSTMatrix[0] = CameraView.this.mSTMatrix[1];
                    CameraView.this.mSTMatrix[1] = fArr2;
                    float[] fArr3 = CameraView.this.moldSTMatrix[0];
                    CameraView.this.moldSTMatrix[0] = CameraView.this.moldSTMatrix[1];
                    CameraView.this.moldSTMatrix[1] = fArr3;
                    this.crossfading = true;
                    CameraView.this.lastCrossfadeValue = 1.0f;
                    this.crossfade.d(1.0f, true);
                    requestRender(true, true);
                    return;
                case 9:
                    float f16 = this.shapeTo + 1.0f;
                    this.shapeTo = f16;
                    CameraView.this.lastShapeTo = f16;
                    requestRender(false, false);
                    return;
                case 10:
                    EGL10 egl102 = this.egl10;
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture3 = this.cameraSurface[1];
                    if (surfaceTexture3 != null) {
                        surfaceTexture3.getTransformMatrix(CameraView.this.moldSTMatrix[1]);
                        this.cameraSurface[1].setOnFrameAvailableListener(null);
                        this.cameraSurface[1].release();
                        this.cameraSurface[1] = null;
                    }
                    if (CameraView.this.cameraTexture[1][0] != 0) {
                        GLES20.glDeleteTextures(1, CameraView.this.cameraTexture[1], 0);
                        CameraView.this.cameraTexture[1][0] = 0;
                    }
                    this.currentSession[1] = null;
                    this.cameraId[1] = -1;
                    requestRender(false, false);
                    return;
                case 11:
                    this.camera1Appeared = false;
                    this.ignoreCamera1Upd = true;
                    this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                    requestRender(false, false);
                    return;
                case 12:
                    if (this.blurSurfaceTexture != message.obj) {
                        finishBlur();
                        this.blurSurfaceTexture = null;
                    }
                    Object obj3 = message.obj;
                    if (obj3 != null && this.blurSurfaceTexture != obj3) {
                        this.blurSurfaceTexture = (SurfaceTexture) obj3;
                        this.blurInited = initBlurGL();
                    }
                    requestRender(false, false);
                    return;
                default:
                    return;
            }
        }

        public void pause(long j10) {
            this.pausedTime = System.currentTimeMillis() + j10;
        }

        public void reinitForNewCamera() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(2, Integer.valueOf(CameraView.this.info[0].cameraId)), 0);
            }
        }

        public void requestRender(boolean z10, boolean z11) {
            Handler handler;
            if (this.pausedTime <= 0 || System.currentTimeMillis() >= this.pausedTime) {
                if ((z10 || z11 || !this.recording) && (handler = getHandler()) != null) {
                    if ((z10 || z11) && handler.hasMessages(0, this.updateTexBoth)) {
                        return;
                    }
                    if (!z10 && handler.hasMessages(0, this.updateTex1)) {
                        z10 = true;
                    }
                    if (!z11 && handler.hasMessages(0, this.updateTex2)) {
                        z11 = true;
                    }
                    handler.removeMessages(0);
                    int[] iArr = this.cameraId;
                    sendMessage(handler.obtainMessage(0, iArr[0], iArr[1], (z10 && z11) ? this.updateTexBoth : z10 ? this.updateTex1 : this.updateTex2), 0);
                }
            }
        }

        @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
        public void run() {
            this.initied = initGL();
            if (this.blurSurfaceTexture != null) {
                this.blurInited = initBlurGL();
            }
            super.run();
        }

        public void setBlurSurfaceTexture(SurfaceTexture surfaceTexture) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(12, surfaceTexture), 0);
            } else {
                this.blurSurfaceTexture = surfaceTexture;
            }
        }

        public void setCurrentSession(CameraSessionWrapper cameraSessionWrapper, int i9) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(3, i9, 0, cameraSessionWrapper), 0);
            }
        }

        public void shutdown(int i9) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(1, i9, 0), 0);
            }
        }

        public boolean startRecording(File file) {
            Handler handler = getHandler();
            if (handler == null) {
                return true;
            }
            sendMessage(handler.obtainMessage(4, file), 0);
            return false;
        }

        public void stopRecording() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(5), 0);
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface CameraViewDelegate {
        void onCameraInit();
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class EncoderHandler extends Handler {
        private WeakReference<VideoRecorder> mWeakEncoder;

        public EncoderHandler(VideoRecorder videoRecorder) {
            this.mWeakEncoder = new WeakReference<>(videoRecorder);
        }

        public void exit() {
            Looper.myLooper().quit();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            VideoRecorder videoRecorder = this.mWeakEncoder.get();
            if (videoRecorder == null) {
                return;
            }
            if (i9 == 0) {
                try {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("start encoder");
                    }
                    videoRecorder.prepareEncoder();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    videoRecorder.handleStopRecording(0);
                    Looper.myLooper().quit();
                    return;
                }
            }
            if (i9 == 1) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("stop encoder");
                }
                videoRecorder.handleStopRecording(message.arg1);
            } else if (i9 == 2) {
                videoRecorder.handleVideoFrameAvailable((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
            } else {
                if (i9 != 3) {
                    return;
                }
                videoRecorder.handleAudioFrameAvailable((t40) message.obj);
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class VideoRecorder implements Runnable {
        private static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
        private static final int FRAME_RATE = 30;
        private static final int IFRAME_INTERVAL = 1;
        private static final String VIDEO_MIME_TYPE = "video/hevc";
        private int alphaHandle;
        private MediaCodec.BufferInfo audioBufferInfo;
        private MediaCodec audioEncoder;
        private long audioFirst;
        private AudioRecord audioRecorder;
        private long audioStartTime;
        private boolean audioStopedByTime;
        private int audioTrackIndex;
        private boolean blendEnabled;
        private int blurHandle;
        private ArrayBlockingQueue<t40> buffers;
        private ArrayList<t40> buffersToWrite;
        private int cameraMatrixHandle;
        private int crossfadeHandle;
        private long currentTimestamp;
        private long desyncTime;
        private int drawProgram;
        private int dualHandle;
        private android.opengl.EGLConfig eglConfig;
        private android.opengl.EGLContext eglContext;
        private android.opengl.EGLDisplay eglDisplay;
        private android.opengl.EGLSurface eglSurface;
        private File fileToWrite;
        DispatchQueue fileWriteQueue;
        private boolean firstEncode;
        private volatile EncoderHandler handler;
        private ArrayList<Bitmap> keyframeThumbs;
        private Integer lastCameraId;
        private long lastCommitedFrameTime;
        private long lastTimestamp;
        private MP4Builder mediaMuxer;
        private int oppositeCameraMatrixHandle;
        private String outputMimeType;
        private int pixelHandle;
        private int positionHandle;
        private int prependHeaderSize;
        private boolean ready;
        private Runnable recorderRunnable;
        private int roundRadiusHandle;
        private volatile boolean running;
        private int scaleHandle;
        private volatile int sendWhenDone;
        private int shapeFromHandle;
        private int shapeHandle;
        private int shapeToHandle;
        private android.opengl.EGLContext sharedEglContext;
        private boolean skippedFirst;
        private long skippedTime;
        private Surface surface;
        private final Object sync;
        private FloatBuffer textureBuffer;
        private int textureHandle;
        private int textureMatrixHandle;
        private int vertexMatrixHandle;
        private int videoBitrate;
        private MediaCodec.BufferInfo videoBufferInfo;
        private boolean videoConvertFirstWrite;
        private MediaCodec videoEncoder;
        private File videoFile;
        private long videoFirst;
        private long videoLast;
        private int videoTrackIndex;
        private boolean writingToDifferentFile;
        private int zeroTimeStamps;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public class 1 implements Runnable {
            public 1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(double d) {
                CameraView.this.receivedAmplitude(d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
            
                if (r16.this$1.sendWhenDone == 0) goto L67;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                long j10 = -1;
                long j11 = -1;
                boolean z10 = false;
                while (true) {
                    if (!z10) {
                        if (!VideoRecorder.this.running && VideoRecorder.this.audioRecorder.getRecordingState() != 1) {
                            try {
                                VideoRecorder.this.audioRecorder.stop();
                            } catch (Exception unused) {
                                z10 = true;
                            }
                        }
                        t40 t40Var = VideoRecorder.this.buffers.isEmpty() ? new t40() : (t40) VideoRecorder.this.buffers.poll();
                        t40Var.e = 0;
                        t40Var.d = 10;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= 10) {
                                break;
                            }
                            if (j11 == j10) {
                                j11 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = t40Var.a[i9];
                            byteBuffer.rewind();
                            int read = VideoRecorder.this.audioRecorder.read(byteBuffer, 2048);
                            if (read > 0 && i9 % 2 == 0) {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                for (int i10 = 0; i10 < read / 2; i10++) {
                                    short s10 = byteBuffer.getShort();
                                    d += s10 * s10;
                                }
                                final double sqrt = Math.sqrt((d / read) / 2.0d);
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.camera.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CameraView.VideoRecorder.1.this.lambda$run$0(sqrt);
                                    }
                                });
                                byteBuffer.position(0);
                            }
                            if (read <= 0) {
                                t40Var.d = i9;
                                if (!VideoRecorder.this.running) {
                                    t40Var.f = true;
                                }
                            } else {
                                t40Var.b[i9] = j11;
                                t40Var.c[i9] = read;
                                j11 += ((read * MediaController.VIDEO_BITRATE_480) / CameraView.audioSampleRate) / 2;
                                i9++;
                                j10 = -1;
                            }
                        }
                        if (t40Var.d >= 0 || t40Var.f) {
                            boolean z11 = (VideoRecorder.this.running || t40Var.d >= 10) ? z10 : true;
                            VideoRecorder.this.handler.sendMessage(VideoRecorder.this.handler.obtainMessage(3, t40Var));
                            z10 = z11;
                        } else if (VideoRecorder.this.running) {
                            try {
                                VideoRecorder.this.buffers.put(t40Var);
                            } catch (Exception unused2) {
                            }
                        } else {
                            z10 = true;
                        }
                        j10 = -1;
                    }
                    try {
                        VideoRecorder.this.audioRecorder.release();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    VideoRecorder.this.handler.sendMessage(VideoRecorder.this.handler.obtainMessage(1, VideoRecorder.this.sendWhenDone, 0));
                    return;
                }
            }
        }

        private VideoRecorder() {
            this.videoConvertFirstWrite = true;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            this.buffersToWrite = new ArrayList<>();
            this.videoTrackIndex = -5;
            this.audioTrackIndex = -5;
            this.audioStartTime = -1L;
            this.currentTimestamp = 0L;
            this.lastTimestamp = -1L;
            this.sync = new Object();
            this.videoFirst = -1L;
            this.audioFirst = -1L;
            this.lastCameraId = 0;
            this.buffers = new ArrayBlockingQueue<>(10);
            this.keyframeThumbs = new ArrayList<>();
            this.recorderRunnable = new 1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0149, code lost:
        
            r2 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleAudioFrameAvailable(t40 t40Var) {
            long j10;
            if (this.audioStopedByTime) {
                return;
            }
            t40 t40Var2 = t40Var;
            this.buffersToWrite.add(t40Var2);
            if (this.audioFirst == -1) {
                if (this.videoFirst == -1) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("CameraView video record not yet started");
                        return;
                    }
                    return;
                }
                while (true) {
                    for (int i9 = 0; i9 < t40Var2.d; i9++) {
                        if (i9 != 0 || Math.abs(this.videoFirst - t40Var2.b[i9]) <= 10000000) {
                            long j11 = t40Var2.b[i9];
                            if (j11 >= this.videoFirst) {
                                t40Var2.e = i9;
                                this.audioFirst = j11;
                                if (BuildVars.LOGS_ENABLED) {
                                    r0.z(r0.p(i9, "CameraView found first audio frame at ", " timestamp = "), t40Var2.b[i9]);
                                }
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    r0.z(r0.p(i9, "CameraView ignore first audio frame at ", " timestamp = "), t40Var2.b[i9]);
                                }
                            }
                        } else {
                            long j12 = this.videoFirst;
                            long j13 = t40Var2.b[i9];
                            this.desyncTime = j12 - j13;
                            this.audioFirst = j13;
                            if (BuildVars.LOGS_ENABLED) {
                                r0.z(new StringBuilder("CameraView detected desync between audio and video "), this.desyncTime);
                            }
                        }
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        l0.n(t40Var2.d, new StringBuilder("CameraView first audio frame not found, removing buffers "));
                    }
                    this.buffersToWrite.remove(t40Var2);
                    if (this.buffersToWrite.isEmpty()) {
                        return;
                    } else {
                        t40Var2 = this.buffersToWrite.get(0);
                    }
                }
            }
            if (this.audioStartTime == -1) {
                this.audioStartTime = t40Var2.b[t40Var2.e];
            }
            if (this.buffersToWrite.size() > 1) {
                t40Var2 = this.buffersToWrite.get(0);
            }
            try {
                drainEncoder(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            boolean z10 = false;
            while (t40Var2 != null) {
                try {
                    long j14 = 0;
                    int dequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(0L);
                    if (dequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = this.audioEncoder.getInputBuffer(dequeueInputBuffer);
                        long[] jArr = t40Var2.b;
                        int i10 = t40Var2.e;
                        long j15 = jArr[i10];
                        while (true) {
                            int i11 = t40Var2.d;
                            if (i10 > i11) {
                                j10 = j14;
                                break;
                            }
                            if (i10 < i11) {
                                if (this.running) {
                                    j10 = j14;
                                } else {
                                    j10 = j14;
                                    if (t40Var2.b[i10] >= this.videoLast - this.desyncTime) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("CameraView stop audio encoding because of stoped video recording at " + t40Var2.b[i10] + " last video " + this.videoLast);
                                        }
                                        this.audioStopedByTime = true;
                                        this.buffersToWrite.clear();
                                        z10 = true;
                                    }
                                }
                                if (inputBuffer.remaining() < t40Var2.c[i10]) {
                                    t40Var2.e = i10;
                                    break;
                                }
                                inputBuffer.put(t40Var2.a[i10]);
                            } else {
                                j10 = j14;
                            }
                            if (i10 >= t40Var2.d - 1) {
                                this.buffersToWrite.remove(t40Var2);
                                if (this.running) {
                                    this.buffers.put(t40Var2);
                                }
                                if (this.buffersToWrite.isEmpty()) {
                                    z10 = t40Var2.f;
                                    break;
                                }
                                t40Var2 = this.buffersToWrite.get(0);
                            }
                            i10++;
                            j14 = j10;
                        }
                        this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j15 == j10 ? j10 : j15 - this.audioStartTime, z10 ? 4 : 0);
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleStopRecording(int i9) {
            if (this.running) {
                this.sendWhenDone = i9;
                this.running = false;
                return;
            }
            try {
                drainEncoder(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.fileWriteQueue.postRunnable(new s(0, this, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e13) {
                e13.printStackTrace();
            }
            if (this.writingToDifferentFile && !this.fileToWrite.renameTo(this.videoFile)) {
                FileLog.e("unable to rename file, try move file");
                try {
                    AndroidUtilities.copyFile(this.fileToWrite, this.videoFile);
                    this.fileToWrite.delete();
                } catch (IOException e14) {
                    FileLog.e(e14);
                    FileLog.e("unable to move file");
                }
            }
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.eglDisplay);
            }
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglConfig = null;
            this.handler.exit();
            AndroidUtilities.runOnUIThread(new c(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleVideoFrameAvailable(long j10, Integer num) {
            long j11;
            int width;
            int height;
            try {
                drainEncoder(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j12 = this.lastTimestamp;
            if (j12 == -1) {
                this.lastTimestamp = j10;
                j11 = 0;
                if (this.currentTimestamp != 0) {
                    j11 = 1000000 * (currentTimeMillis - this.lastCommitedFrameTime);
                }
            } else {
                j11 = j10 - j12;
                this.lastTimestamp = j10;
            }
            this.lastCommitedFrameTime = currentTimeMillis;
            if (!this.skippedFirst) {
                long j13 = this.skippedTime + j11;
                this.skippedTime = j13;
                if (j13 < 200000000) {
                    return;
                } else {
                    this.skippedFirst = true;
                }
            }
            this.currentTimestamp += j11;
            if (this.videoFirst == -1) {
                this.videoFirst = j10 / 1000;
                if (BuildVars.LOGS_ENABLED) {
                    r0.z(new StringBuilder("CameraView first video frame was at "), this.videoFirst);
                }
            }
            this.videoLast = j10;
            if (CameraView.this.cameraTexture[1][0] != 0 && !this.blendEnabled) {
                GLES20.glEnable(3042);
                this.blendEnabled = true;
            }
            boolean z10 = CameraView.this.dual;
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
            }
            float f10 = CameraView.this.lastCrossfadeValue;
            boolean z11 = f10 > 0.0f;
            int i9 = -1;
            while (i9 < 2) {
                if (i9 != -1 || z11) {
                    int i10 = i9 < 0 ? 1 : i9;
                    if (CameraView.this.cameraTexture[i10][0] != 0) {
                        GLES20.glUseProgram(this.drawProgram);
                        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                        GLES20.glEnableVertexAttribArray(this.positionHandle);
                        GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                        GLES20.glEnableVertexAttribArray(this.textureHandle);
                        GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i10], 0);
                        GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i10], 0);
                        GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i10], 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i10], 0);
                        GLES20.glUniform1f(this.blurHandle, 0.0f);
                        Size size = CameraView.this.previewSize[i10];
                        if (size != null && CameraView.this.cameraSession[i10] != null) {
                            int worldAngle = CameraView.this.cameraSession[i10].getWorldAngle();
                            if (worldAngle == 90 || worldAngle == 270) {
                                width = size.getWidth();
                                height = size.getHeight();
                            } else {
                                width = size.getHeight();
                                height = size.getWidth();
                            }
                            GLES20.glUniform2f(this.pixelHandle, width, height);
                        } else if (i10 == 0) {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                        } else {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
                        }
                        if (i10 == 0) {
                            GLES20.glUniform1f(this.dualHandle, z10 ? 1.0f : 0.0f);
                        } else {
                            GLES20.glUniform1f(this.dualHandle, 1.0f);
                        }
                        if (i10 == 1) {
                            GLES20.glUniform1f(this.alphaHandle, 1.0f);
                            if (i9 < 0) {
                                GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 1.0f);
                            } else if (z11) {
                                GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f - f10);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.shapeHandle, f10);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            } else {
                                GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        } else {
                            GLES20.glUniform1f(this.alphaHandle, 1.0f);
                            if (z11) {
                                GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), f10));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, CameraView.this.lastShapeTo);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, Utilities.clamp(1.0f - f10, 1.0f, 0.0f));
                                GLES20.glUniform1f(this.crossfadeHandle, f10);
                            } else {
                                GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        }
                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i10][0]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glDisableVertexAttribArray(this.positionHandle);
                        GLES20.glDisableVertexAttribArray(this.textureHandle);
                        GLES20.glBindTexture(36197, 0);
                        GLES20.glUseProgram(0);
                    }
                }
                i9++;
            }
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, this.currentTimestamp);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drainEncoder$2(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.videoTrackIndex, byteBuffer, bufferInfo, true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drainEncoder$3(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, bufferInfo, false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleStopRecording$0(CountDownLatch countDownLatch) {
            try {
                this.mediaMuxer.finishMovie();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            countDownLatch.countDown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleStopRecording$1() {
            if (CameraView.this.cameraSession[0] != null) {
                CameraView.this.cameraSession[0].stopVideoRecording();
            }
            if (CameraView.this.cameraSession[1] != null) {
                CameraView.this.cameraSession[1].stopVideoRecording();
            }
            CameraView.this.onRecordingFinishRunnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void prepareEncoder() {
            MediaCodec mediaCodec;
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(CameraView.audioSampleRate, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                int i9 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
                for (int i10 = 0; i10 < 3; i10++) {
                    this.buffers.add(new t40());
                }
                AudioRecord audioRecord = new AudioRecord(0, CameraView.audioSampleRate, 16, 2, i9);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i9);
                }
                Thread thread = new Thread(this.recorderRunnable);
                thread.setPriority(10);
                thread.start();
                this.audioBufferInfo = new MediaCodec.BufferInfo();
                this.videoBufferInfo = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("sample-rate", CameraView.audioSampleRate);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", 32000);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.audioEncoder = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                boolean z10 = CameraView.this.recordHevc;
                this.outputMimeType = z10 ? VIDEO_MIME_TYPE : MediaController.VIDEO_MIME_TYPE;
                try {
                    if (z10) {
                        String findGoodHevcEncoder = SharedConfig.findGoodHevcEncoder();
                        if (findGoodHevcEncoder != null) {
                            this.videoEncoder = MediaCodec.createByCodecName(findGoodHevcEncoder);
                        }
                    } else {
                        this.outputMimeType = MediaController.VIDEO_MIME_TYPE;
                        this.videoEncoder = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
                    }
                    if (this.outputMimeType.equals(VIDEO_MIME_TYPE) && (mediaCodec = this.videoEncoder) != null && !mediaCodec.getCodecInfo().isHardwareAccelerated()) {
                        FileLog.e("hevc encoder isn't hardware accelerated");
                        this.videoEncoder.release();
                        this.videoEncoder = null;
                    }
                } catch (Throwable th) {
                    FileLog.e("can't get hevc encoder");
                    FileLog.e(th);
                }
                if (this.videoEncoder == null && this.outputMimeType.equals(VIDEO_MIME_TYPE)) {
                    this.outputMimeType = MediaController.VIDEO_MIME_TYPE;
                    this.videoEncoder = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
                }
                this.firstEncode = true;
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.outputMimeType, CameraView.this.videoWidth, CameraView.this.videoHeight);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", this.videoBitrate);
                createVideoFormat.setInteger("frame-rate", 30);
                createVideoFormat.setInteger("i-frame-interval", 1);
                this.videoEncoder.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.surface = this.videoEncoder.createInputSurface();
                this.videoEncoder.start();
                boolean isSdCardPath = ImageLoader.isSdCardPath(this.videoFile);
                this.fileToWrite = this.videoFile;
                if (isSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        this.fileToWrite = file;
                        if (file.exists()) {
                            this.fileToWrite.delete();
                        }
                        this.writingToDifferentFile = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        this.fileToWrite = this.videoFile;
                        this.writingToDifferentFile = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(this.fileToWrite);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(CameraView.this.videoWidth, CameraView.this.videoHeight);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, false, false);
                this.mediaMuxer = createMovie;
                createMovie.setAllowSyncFiles(false);
                if (this.eglDisplay != EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("EGL already set up");
                }
                android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                this.eglDisplay = eglGetDisplay;
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    this.eglDisplay = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                if (this.eglContext == EGL14.EGL_NO_CONTEXT) {
                    android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        throw new RuntimeException("Unable to find a suitable EGLConfig");
                    }
                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                    this.eglConfig = eGLConfigArr[0];
                }
                EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, new int[1], 0);
                if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                    throw new IllegalStateException("surface already created");
                }
                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                    }
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                GLES20.glBlendFunc(770, 771);
                float f10 = (1.0f / CameraView.this.scaleX) / 2.0f;
                float f11 = (1.0f / CameraView.this.scaleY) / 2.0f;
                float f12 = 0.5f - f10;
                float f13 = 0.5f - f11;
                float f14 = f10 + 0.5f;
                float f15 = f11 + 0.5f;
                float[] fArr = {f12, f13, f14, f13, f12, f15, f14, f15};
                FloatBuffer h = ll.h(ByteBuffer.allocateDirect(32));
                this.textureBuffer = h;
                h.put(fArr).position(0);
                int loadShader = CameraView.this.loadShader(35633, AndroidUtilities.readRes(R.raw.camera_vert));
                int loadShader2 = CameraView.this.loadShader(35632, AndroidUtilities.readRes(R.raw.camera_frag));
                if (loadShader == 0 || loadShader2 == 0) {
                    return;
                }
                int glCreateProgram = GLES20.glCreateProgram();
                this.drawProgram = glCreateProgram;
                GLES20.glAttachShader(glCreateProgram, loadShader);
                GLES20.glAttachShader(this.drawProgram, loadShader2);
                GLES20.glLinkProgram(this.drawProgram);
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                if (iArr2[0] == 0) {
                    GLES20.glDeleteProgram(this.drawProgram);
                    this.drawProgram = 0;
                    return;
                }
                this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
                this.cameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "cameraMatrix");
                this.oppositeCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "oppositeCameraMatrix");
                this.roundRadiusHandle = GLES20.glGetUniformLocation(this.drawProgram, "roundRadius");
                this.pixelHandle = GLES20.glGetUniformLocation(this.drawProgram, "pixelWH");
                this.dualHandle = GLES20.glGetUniformLocation(this.drawProgram, "dual");
                this.scaleHandle = GLES20.glGetUniformLocation(this.drawProgram, "scale");
                this.blurHandle = GLES20.glGetUniformLocation(this.drawProgram, "blur");
                this.alphaHandle = GLES20.glGetUniformLocation(this.drawProgram, "alpha");
                this.crossfadeHandle = GLES20.glGetUniformLocation(this.drawProgram, "crossfade");
                this.shapeFromHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeFrom");
                this.shapeToHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeTo");
                this.shapeHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeT");
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x0192, code lost:
        
            r17.audioTrackIndex = r17.mediaMuxer.addTrack(r1, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0178, code lost:
        
            if (r18 == false) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x017c, code lost:
        
            if (r17.running != false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0180, code lost:
        
            if (r17.sendWhenDone != 0) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x01ea, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
        
            r1 = r17.audioEncoder.dequeueOutputBuffer(r17.audioBufferInfo, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
        
            if (r1 != (-1)) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0183, code lost:
        
            if (r1 != (-3)) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
        
            if (r1 != (-2)) goto L137;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x019f, code lost:
        
            if (r1 < 0) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01a1, code lost:
        
            r8 = r17.audioEncoder.getOutputBuffer(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01a7, code lost:
        
            if (r8 == null) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
        
            r11 = r17.audioBufferInfo;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01af, code lost:
        
            if ((r11.flags & 2) == 0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
        
            r11.size = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01b5, code lost:
        
            if (r11.size == 0) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01b7, code lost:
        
            r11 = new android.media.MediaCodec.BufferInfo();
            r12 = r17.audioBufferInfo;
            r11.size = r12.size;
            r11.offset = r12.offset;
            r11.flags = r12.flags;
            r11.presentationTimeUs = r12.presentationTimeUs;
            r8 = org.telegram.messenger.AndroidUtilities.cloneByteBuffer(r8);
            r14 = 1;
            r17.fileWriteQueue.postRunnable(new org.telegram.messenger.camera.r(r17, r8, r11, r14));
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01dd, code lost:
        
            r17.audioEncoder.releaseOutputBuffer(r1, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01e8, code lost:
        
            if ((r17.audioBufferInfo.flags & 4) == 0) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x01f4, code lost:
        
            throw new java.lang.RuntimeException(j3.r0.m(r1, "encoderOutputBuffer ", " was null"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
        
            r1 = r17.audioEncoder.getOutputFormat();
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
        
            if (r17.audioTrackIndex != (-5)) goto L139;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainEncoder(boolean z10) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            if (z10) {
                this.videoEncoder.signalEndOfInputStream();
            }
            while (true) {
                int dequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(this.videoBufferInfo, 10000L);
                byte b10 = 1;
                if (dequeueOutputBuffer == -1) {
                    if (!z10) {
                        break;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    continue;
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.videoEncoder.getOutputFormat();
                    if (this.videoTrackIndex == -5) {
                        this.videoTrackIndex = this.mediaMuxer.addTrack(outputFormat, false);
                        if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                            ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-0");
                            ByteBuffer byteBuffer4 = outputFormat.getByteBuffer("csd-1");
                            this.prependHeaderSize = (byteBuffer3 == null ? 0 : byteBuffer3.limit()) + (byteBuffer4 != null ? byteBuffer4.limit() : 0);
                        }
                    }
                } else if (dequeueOutputBuffer < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer = this.videoEncoder.getOutputBuffer(dequeueOutputBuffer);
                    if (outputBuffer == null) {
                        throw new RuntimeException(r0.m(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo = this.videoBufferInfo;
                    int i9 = bufferInfo.size;
                    if (i9 > 1) {
                        int i10 = bufferInfo.flags;
                        if ((i10 & 2) == 0) {
                            int i11 = this.prependHeaderSize;
                            if (i11 != 0 && (i10 & 1) != 0) {
                                bufferInfo.offset += i11;
                                bufferInfo.size = i9 - i11;
                            }
                            if (this.firstEncode && (i10 & 1) != 0) {
                                MediaCodecVideoConvertor.cutOfNalData(this.outputMimeType, outputBuffer, bufferInfo);
                                this.firstEncode = false;
                            }
                            final MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            MediaCodec.BufferInfo bufferInfo3 = this.videoBufferInfo;
                            bufferInfo2.size = bufferInfo3.size;
                            bufferInfo2.offset = bufferInfo3.offset;
                            bufferInfo2.flags = bufferInfo3.flags;
                            bufferInfo2.presentationTimeUs = bufferInfo3.presentationTimeUs;
                            final ByteBuffer cloneByteBuffer = AndroidUtilities.cloneByteBuffer(outputBuffer);
                            final int i12 = 0;
                            this.fileWriteQueue.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.camera.r
                                public final /* synthetic */ CameraView.VideoRecorder b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            this.b.lambda$drainEncoder$2(cloneByteBuffer, bufferInfo2);
                                            break;
                                        default:
                                            this.b.lambda$drainEncoder$3(cloneByteBuffer, bufferInfo2);
                                            break;
                                    }
                                }
                            });
                        } else if (this.videoTrackIndex == -5) {
                            if (this.outputMimeType.equals(VIDEO_MIME_TYPE)) {
                                throw new RuntimeException("need fix parsing csd data");
                            }
                            MediaCodec.BufferInfo bufferInfo4 = this.videoBufferInfo;
                            int i13 = bufferInfo4.size;
                            byte[] bArr = new byte[i13];
                            outputBuffer.limit(bufferInfo4.offset + i13);
                            outputBuffer.position(this.videoBufferInfo.offset);
                            outputBuffer.get(bArr);
                            int i14 = this.videoBufferInfo.size - 1;
                            while (i14 >= 0 && i14 > 3) {
                                if (bArr[i14] == b10 && bArr[i14 - 1] == 0 && bArr[i14 - 2] == 0) {
                                    int i15 = i14 - 3;
                                    if (bArr[i15] == 0) {
                                        byteBuffer = ByteBuffer.allocate(i15);
                                        byteBuffer2 = ByteBuffer.allocate(this.videoBufferInfo.size - i15);
                                        byteBuffer.put(bArr, 0, i15).position(0);
                                        byteBuffer2.put(bArr, i15, this.videoBufferInfo.size - i15).position(0);
                                        break;
                                    }
                                }
                                i14--;
                                b10 = 1;
                            }
                            byteBuffer = null;
                            byteBuffer2 = null;
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, CameraView.this.videoWidth, CameraView.this.videoHeight);
                            if (byteBuffer != null && byteBuffer2 != null) {
                                createVideoFormat.setByteBuffer("csd-0", byteBuffer);
                                createVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                            }
                            this.videoTrackIndex = this.mediaMuxer.addTrack(createVideoFormat, false);
                        }
                    }
                    this.videoEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.videoBufferInfo.flags & 4) != 0) {
                        break;
                    }
                }
            }
        }

        public void finalize() {
            DispatchQueue dispatchQueue = this.fileWriteQueue;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.fileWriteQueue = null;
            }
            try {
                android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.eglDisplay);
                    this.eglDisplay = EGL14.EGL_NO_DISPLAY;
                    this.eglContext = EGL14.EGL_NO_CONTEXT;
                    this.eglConfig = null;
                }
            } finally {
                super.finalize();
            }
        }

        public void frameAvailable(SurfaceTexture surfaceTexture, Integer num, long j10) {
            synchronized (this.sync) {
                try {
                    if (this.ready) {
                        long timestamp = surfaceTexture.getTimestamp();
                        if (timestamp == 0) {
                            int i9 = this.zeroTimeStamps + 1;
                            this.zeroTimeStamps = i9;
                            if (i9 <= 1) {
                                return;
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("CameraView fix timestamp enabled");
                            }
                        } else {
                            this.zeroTimeStamps = 0;
                            j10 = timestamp;
                        }
                        this.handler.sendMessage(this.handler.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Surface getInputSurface() {
            return this.surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            synchronized (this.sync) {
                this.handler = new EncoderHandler(this);
                this.ready = true;
                this.sync.notify();
            }
            Looper.loop();
            synchronized (this.sync) {
                this.ready = false;
            }
        }

        public void startRecording(File file, android.opengl.EGLContext eGLContext) {
            String str = Build.DEVICE;
            Size size = CameraView.this.previewSize[0];
            int i9 = Math.min(size.mHeight, size.mWidth) >= 720 ? 3500000 : 1800000;
            this.videoFile = file;
            if (CameraView.this.cameraSession[0].getWorldAngle() == 90 || CameraView.this.cameraSession[0].getWorldAngle() == 270) {
                CameraView.this.videoWidth = size.getWidth();
                CameraView.this.videoHeight = size.getHeight();
            } else {
                CameraView.this.videoWidth = size.getHeight();
                CameraView.this.videoHeight = size.getWidth();
            }
            this.videoBitrate = i9;
            this.sharedEglContext = eGLContext;
            synchronized (this.sync) {
                try {
                    if (this.running) {
                        return;
                    }
                    this.running = true;
                    Thread thread = new Thread(this, "TextureMovieEncoder");
                    thread.setPriority(10);
                    thread.start();
                    while (!this.ready) {
                        try {
                            this.sync.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    DispatchQueue dispatchQueue = new DispatchQueue("VR_FileWriteQueue");
                    this.fileWriteQueue = dispatchQueue;
                    dispatchQueue.setPriority(10);
                    this.keyframeThumbs.clear();
                    this.handler.sendMessage(this.handler.obtainMessage(0));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void stopRecording(int i9) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i9, 0));
        }
    }

    public CameraView(Context context, boolean z10) {
        this(context, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToDualWait(long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.toggleDualUntil;
        if (j11 < currentTimeMillis) {
            this.toggleDualUntil = currentTimeMillis + j10;
        } else {
            this.toggleDualUntil = j11 + j10;
        }
    }

    private Rect calculateTapArea(float f10, float f11, float f12) {
        int intValue = Float.valueOf(this.focusAreaSize * f12).intValue();
        int i9 = intValue / 2;
        RectF rectF = new RectF(clamp(((int) f10) - i9, 0, getWidth() - intValue), clamp(((int) f11) - i9, 0, getHeight() - intValue), r4 + intValue, r5 + intValue);
        this.matrix.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    private void checkPreviewMatrix() {
        TextureView textureView;
        if (this.previewSize[0] == null || (textureView = this.textureView) == null) {
            return;
        }
        int width = textureView.getWidth();
        int height = this.textureView.getHeight();
        Matrix matrix = new Matrix();
        if (this.cameraSession[0] != null) {
            matrix.postRotate(r1.getDisplayOrientation());
        }
        float f10 = width;
        float f11 = height;
        matrix.postScale(f10 / 2000.0f, f11 / 2000.0f);
        matrix.postTranslate(f10 / 2.0f, f11 / 2.0f);
        matrix.invert(this.matrix);
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            if (cameraGLThread.isReady()) {
                this.cameraThread.postRunnable(this.updateRotationMatrix);
            } else {
                this.updateRotationMatrix.run();
            }
        }
    }

    private int clamp(int i9, int i10, int i11) {
        return i9 > i11 ? i11 : i9 < i10 ? i10 : i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createCamera(SurfaceTexture surfaceTexture, int i9) {
        AndroidUtilities.runOnUIThread(new d5.i(this, i9, surfaceTexture, 19));
    }

    private void enableDualInternal() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[1];
        if (cameraSessionWrapper != null) {
            if (this.closingDualCamera) {
                return;
            }
            this.closingDualCamera = true;
            cameraSessionWrapper.destroy(false, null, new m(this, 6));
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSessionRecording;
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapper2 == cameraSessionWrapperArr[1]) {
                this.cameraSessionRecording = null;
            }
            cameraSessionWrapperArr[1] = null;
            addToDualWait(400L);
            return;
        }
        if (this.isFrontface || !"samsung".equalsIgnoreCase(Build.MANUFACTURER) || this.toggledDualAsSave || this.cameraSession[0] == null) {
            updateCameraInfoSize(1);
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(6, this.info[1].cameraId, 0, this.dualMatrix), 0);
            }
            addToDualWait(800L);
            return;
        }
        Handler handler2 = this.cameraThread.getHandler();
        if (handler2 != null) {
            this.cameraThread.sendMessage(handler2.obtainMessage(11), 0);
        }
        this.cameraSession[0].destroy(false, null, new s(4, this, handler2));
        this.cameraSession[0] = null;
    }

    public static boolean isCameraAllowed() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.hasVideoCapturer()) && f1.S == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$10(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$11(int i9, CameraSession cameraSession, CameraGLThread cameraGLThread) {
        if (this.cameraSession[i9] != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("CameraView camera initied " + i9);
            }
            cameraSession.setInitied();
            requestLayout();
        }
        if (this.dual && i9 == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            AndroidUtilities.runOnUIThread(new n(this, cameraGLThread, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$12(CameraGLThread cameraGLThread, int i9) {
        cameraGLThread.setCurrentSession(this.cameraSession[i9], i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$13(int i9, SurfaceTexture surfaceTexture) {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("CameraView create camera");
            sb2.append(this.useCamera2 ? "2" : "");
            sb2.append(" session ");
            sb2.append(i9);
            FileLog.d(sb2.toString());
        }
        if (this.useCamera2) {
            boolean z10 = this.isFrontface;
            if (i9 != 0) {
                z10 = !z10;
            }
            Camera2Session create = Camera2Session.create(z10, this.surfaceWidth, this.surfaceHeight);
            if (create == null) {
                return;
            }
            this.cameraSession[i9] = CameraSessionWrapper.of(create);
            this.previewSize[i9] = new Size(create.getPreviewWidth(), create.getPreviewHeight());
            cameraGLThread.setCurrentSession(this.cameraSession[i9], i9);
            create.whenDone(new l(this, i9, cameraGLThread));
            create.open(surfaceTexture);
            return;
        }
        if (this.previewSize[i9] == null) {
            updateCameraInfoSize(i9);
        }
        Size size = this.previewSize[i9];
        if (size == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.previewSize[i9].getHeight());
        CameraSession cameraSession = new CameraSession(this.info[i9], this.previewSize[i9], this.pictureSize[i9], 256, false);
        cameraSession.setCurrentFlashMode("off");
        this.cameraSession[i9] = CameraSessionWrapper.of(cameraSession);
        cameraGLThread.setCurrentSession(this.cameraSession[i9], i9);
        requestLayout();
        CameraController.getInstance().open(cameraSession, surfaceTexture, new c3.d(this, i9, cameraSession, cameraGLThread, 7), new l(this, cameraGLThread, i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$8(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$9(int i9, CameraGLThread cameraGLThread) {
        requestLayout();
        if (this.dual && i9 == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            AndroidUtilities.runOnUIThread(new n(this, cameraGLThread, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableDualInternal$0() {
        this.closingDualCamera = false;
        enableDualInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableDualInternal$1(Handler handler) {
        this.initFirstCameraAfterSecond = true;
        updateCameraInfoSize(1);
        if (handler != null) {
            this.cameraThread.sendMessage(handler.obtainMessage(6, this.info[1].cameraId, 0, this.dualMatrix), 0);
        }
        addToDualWait(1200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                if (cameraGLThread.currentSession[i9] != null) {
                    int worldAngle = cameraGLThread.currentSession[i9].getWorldAngle();
                    android.opengl.Matrix.setIdentityM(this.mMVPMatrix[i9], 0);
                    if (worldAngle != 0) {
                        android.opengl.Matrix.rotateM(this.mMVPMatrix[i9], 0, worldAngle, 0.0f, 0.0f, 1.0f);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceTextureDestroyed$5() {
        this.cameraThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetCamera$4() {
        this.inited = false;
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        updateCameraInfoSize(0);
        this.cameraThread.reinitForNewCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTexture$6(ValueAnimator valueAnimator) {
        this.textureView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchCamera$3() {
        this.inited = false;
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        updateCameraInfoSize(0);
        this.cameraThread.reinitForNewCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleDual$2() {
        this.closingDualCamera = false;
        this.dualCameraAppeared = false;
        addToDualWait(400L);
        Handler handler = this.cameraThread.getHandler();
        if (handler != null) {
            this.cameraThread.sendMessage(handler.obtainMessage(10), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int loadShader(int i9, String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstFrameRendered(int i9) {
        if (i9 != 0) {
            onDualCameraSuccess();
            return;
        }
        this.flipping = false;
        if (this.blurredStubView.getVisibility() == 0) {
            this.blurredStubView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.camera.CameraView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CameraView.this.blurredStubView.setVisibility(8);
                }
            }).setDuration(120L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceTextureUpdatedInternal() {
        CameraSessionWrapper cameraSessionWrapper;
        if (!this.inited && (cameraSessionWrapper = this.cameraSession[0]) != null && cameraSessionWrapper.isInitiated()) {
            CameraViewDelegate cameraViewDelegate = this.delegate;
            if (cameraViewDelegate != null) {
                cameraViewDelegate.onCameraInit();
            }
            this.inited = true;
            if (this.lazy) {
                this.textureView.setAlpha(0.0f);
                showTexture(true, true);
            }
        }
        Object obj = this.renderNode;
        if (obj == null || org.telegram.messenger.b.c(obj).hasDisplayList()) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateCameraInfoSize(int i9) {
        int i10;
        int i11;
        Size size;
        int i12;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= cameras.size()) {
                break;
            }
            CameraInfo cameraInfo = cameras.get(i13);
            boolean z10 = cameraInfo.frontCamera != 0;
            boolean z11 = this.isFrontface;
            if (i9 == 1) {
                z11 = !z11;
            }
            if (z10 == z11) {
                this.info[i9] = cameraInfo;
                break;
            }
            i13++;
        }
        if (this.info[i9] == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        float min = max / Math.min(point2.x, point2.y);
        int i14 = 720;
        if (square()) {
            size = new Size(1, 1);
            i12 = 720;
            i10 = 720;
        } else {
            i10 = 1280;
            if (this.initialFrontface) {
                size = new Size(16, 9);
                i12 = 720;
            } else {
                i11 = 960;
                if (Math.abs(min - 1.3333334f) < 0.1f) {
                    size = new Size(4, 3);
                    if (SharedConfig.getDevicePerformanceClass() == 0) {
                        i12 = 960;
                        i14 = 1280;
                    } else {
                        i12 = 1440;
                        i14 = 1280;
                        i10 = 1920;
                    }
                    this.previewSize[i9] = CameraController.chooseOptimalSize(this.info[i9].getPreviewSizes(), i14, i11, size, this.isStory);
                    this.pictureSize[i9] = CameraController.chooseOptimalSize(this.info[i9].getPictureSizes(), i10, i12, size, false);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("camera preview " + this.previewSize[0]);
                    }
                    requestLayout();
                }
                size = new Size(16, 9);
                if (SharedConfig.getDevicePerformanceClass() == 0) {
                    i12 = 960;
                } else {
                    boolean z12 = this.isStory;
                    int i15 = z12 ? 1280 : 1920;
                    i12 = z12 ? 720 : 1080;
                    i10 = i15;
                }
            }
            i14 = 1280;
        }
        i11 = 720;
        this.previewSize[i9] = CameraController.chooseOptimalSize(this.info[i9].getPreviewSizes(), i14, i11, size, this.isStory);
        this.pictureSize[i9] = CameraController.chooseOptimalSize(this.info[i9].getPictureSizes(), i10, i12, size, false);
        if (BuildVars.LOGS_ENABLED) {
        }
        requestLayout();
    }

    public void destroy(boolean z10, Runnable runnable) {
        for (int i9 = 0; i9 < 2; i9++) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i9];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.destroy(z10, runnable, null);
            }
        }
        CameraController.getInstance().removeOnErrorListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.flipAnimator != null) {
            canvas.drawColor(-16777216);
        }
        super.dispatchDraw(canvas);
        float f10 = this.takePictureProgress;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.takePictureProgress = f11;
            if (f11 > 1.0f) {
                this.takePictureProgress = 1.0f;
            } else {
                invalidate();
            }
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - this.takePictureProgress) * 150.0f)));
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        Object obj;
        Object obj2;
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj2 = this.renderNode) != null) {
            RenderNode c10 = org.telegram.messenger.b.c(obj2);
            c10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c10.beginRecording();
        } else {
            canvas2 = canvas;
        }
        boolean drawChild = super.drawChild(canvas2, view, j10);
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj = this.renderNode) != null) {
            RenderNode c11 = org.telegram.messenger.b.c(obj);
            c11.endRecording();
            canvas.drawRenderNode(c11);
            Object obj3 = this.blurRenderNode;
            if (obj3 != null) {
                RenderNode c12 = org.telegram.messenger.b.c(obj3);
                c12.setPosition(0, 0, getWidth(), getHeight());
                c12.beginRecording().drawRenderNode(c11);
                c12.endRecording();
            }
        }
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int dp = AndroidUtilities.dp(30.0f);
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.lastDrawTime;
            if (j11 < 0 || j11 > 17) {
                j11 = 17;
            }
            this.lastDrawTime = currentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f10 = dp;
            canvas.drawCircle(this.cx, this.cy, e2.c.z(1.0f, interpolation, f10, f10), this.outerPaint);
            canvas.drawCircle(this.cx, this.cy, f10 * interpolation, this.innerPaint);
            float f11 = this.focusProgress;
            if (f11 < 1.0f) {
                float f12 = (j11 / 200.0f) + f11;
                this.focusProgress = f12;
                if (f12 > 1.0f) {
                    this.focusProgress = 1.0f;
                }
                invalidate();
                return drawChild;
            }
            float f13 = this.innerAlpha;
            if (f13 != 0.0f) {
                float f14 = f13 - (j11 / 150.0f);
                this.innerAlpha = f14;
                if (f14 < 0.0f) {
                    this.innerAlpha = 0.0f;
                }
                invalidate();
                return drawChild;
            }
            float f15 = this.outerAlpha;
            if (f15 != 0.0f) {
                float f16 = f15 - (j11 / 150.0f);
                this.outerAlpha = f16;
                if (f16 < 0.0f) {
                    this.outerAlpha = 0.0f;
                }
                invalidate();
            }
        }
        return drawChild;
    }

    public void dualToggleShape() {
        if (this.flipping || !this.dual) {
            return;
        }
        Handler handler = this.cameraThread.getHandler();
        if (this.shape == null) {
            this.shape = Integer.valueOf(MessagesController.getGlobalMainSettings().getInt("dualshape", 0));
        }
        this.shape = Integer.valueOf(this.shape.intValue() + 1);
        MessagesController.getGlobalMainSettings().edit().putInt("dualshape", this.shape.intValue()).apply();
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(9));
        }
    }

    public void focusToPoint(int i9, int i10, boolean z10) {
        focusToPoint(0, i9, i10, i9, i10, z10);
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.blurRenderNode = renderNode;
            float dp = AndroidUtilities.dp(32.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(dp, dp2, tileMode));
        }
        return this.blurRenderNode;
    }

    public CameraSessionWrapper getCameraSession() {
        return getCameraSession(0);
    }

    public Object getCameraSessionObject() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper == null) {
            return null;
        }
        return cameraSessionWrapper.getObject();
    }

    public CameraSessionWrapper getCameraSessionRecording() {
        return this.cameraSessionRecording;
    }

    public Matrix getDualPosition() {
        return this.dualMatrix;
    }

    public int getDualShape() {
        if (this.shape == null) {
            this.shape = Integer.valueOf(MessagesController.getGlobalMainSettings().getInt("dualshape", 0));
        }
        return this.shape.intValue();
    }

    @Override // android.view.View
    public Matrix getMatrix() {
        return this.txform;
    }

    public Size getPreviewSize() {
        return this.previewSize[0];
    }

    public float getTextureHeight(float f10, float f11) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        if (this.previewSize[0] == null || (cameraSessionWrapper = this.cameraSession[0]) == null) {
            return f11;
        }
        if (cameraSessionWrapper.getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
            width = this.previewSize[0].getWidth();
            height = this.previewSize[0].getHeight();
        } else {
            width = this.previewSize[0].getHeight();
            height = this.previewSize[0].getWidth();
        }
        float f12 = f10 / width;
        float f13 = height;
        return (int) (Math.max(f12, f11 / f13) * f13);
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public boolean hasFrontFaceCamera() {
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        for (int i9 = 0; i9 < cameras.size(); i9++) {
            if (cameras.get(i9).frontCamera != 0) {
                return true;
            }
        }
        return false;
    }

    public void initTexture() {
        if (this.textureInited) {
            return;
        }
        this.textureView.setSurfaceTextureListener(this);
        addView(this.textureView, 0, e6.e(-1, -1, 17));
        this.textureInited = true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Runnable runnable = arrayList.get(i9);
            i9++;
            runnable.run();
        }
    }

    public boolean isDual() {
        return this.dual;
    }

    public boolean isFrontface() {
        return this.isFrontface;
    }

    public boolean isInited() {
        return this.inited;
    }

    public void listenDraw(Runnable runnable) {
        this.invalidateListeners.add(runnable);
    }

    public TextureView makeBlurTextureView() {
        if (this.blurTextureView == null) {
            TextureView textureView = new TextureView(getContext());
            this.blurTextureView = textureView;
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: org.telegram.messenger.camera.CameraView.4
                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
                    CameraGLThread cameraGLThread = CameraView.this.cameraThread;
                    if (cameraGLThread != null) {
                        cameraGLThread.setBlurSurfaceTexture(surfaceTexture);
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    CameraGLThread cameraGLThread = CameraView.this.cameraThread;
                    if (cameraGLThread == null) {
                        return false;
                    }
                    cameraGLThread.setBlurSurfaceTexture(null);
                    return false;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
                }
            });
        }
        return this.blurTextureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.measurementsCount = 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.thumbDrawable != null) {
            this.bounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float intrinsicWidth = this.thumbDrawable.getIntrinsicWidth();
            float intrinsicHeight = this.thumbDrawable.getIntrinsicHeight();
            float min = 1.0f / Math.min(intrinsicWidth / Math.max(1, this.bounds.width()), intrinsicHeight / Math.max(1, this.bounds.height()));
            float f10 = (intrinsicWidth * min) / 2.0f;
            float f11 = (intrinsicHeight * min) / 2.0f;
            this.thumbDrawable.setBounds((int) (this.bounds.centerX() - f10), (int) (this.bounds.centerY() - f11), (int) (this.bounds.centerX() + f10), (int) (this.bounds.centerY() + f11));
            this.thumbDrawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        checkPreviewMatrix();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.previewSize[0] != null && (cameraSessionWrapper = this.cameraSession[0]) != null) {
            if ((this.lastWidth != size || this.lastHeight != size2) && this.measurementsCount > 1) {
                cameraSessionWrapper.updateRotation();
            }
            this.measurementsCount++;
            if (this.cameraSession[0].getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
                width = this.previewSize[0].getWidth();
                height = this.previewSize[0].getHeight();
            } else {
                width = this.previewSize[0].getHeight();
                height = this.previewSize[0].getWidth();
            }
            float min = this.fit ? Math.min(size / width, size2 / height) : Math.max(size / width, size2 / height);
            ViewGroup.LayoutParams layoutParams = this.blurredStubView.getLayoutParams();
            int i11 = (int) (width * min);
            this.textureView.getLayoutParams().width = i11;
            layoutParams.width = i11;
            ViewGroup.LayoutParams layoutParams2 = this.blurredStubView.getLayoutParams();
            int i12 = (int) (min * height);
            this.textureView.getLayoutParams().height = i12;
            layoutParams2.height = i12;
        }
        super.onMeasure(i9, i10);
        checkPreviewMatrix();
        this.lastWidth = size;
        this.lastHeight = size2;
        this.pixelW = getMeasuredWidth();
        this.pixelH = getMeasuredHeight();
        this.pixelDualW = getMeasuredWidth();
        this.pixelDualH = getMeasuredHeight();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        updateCameraInfoSize(0);
        if (this.dual) {
            updateCameraInfoSize(1);
        }
        this.surfaceHeight = i10;
        this.surfaceWidth = i9;
        if (this.cameraThread != null || surfaceTexture == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("CameraView start create thread");
        }
        CameraGLThread cameraGLThread = new CameraGLThread(surfaceTexture);
        this.cameraThread = cameraGLThread;
        TextureView textureView = this.blurTextureView;
        if (textureView != null) {
            cameraGLThread.setBlurSurfaceTexture(textureView.getSurfaceTexture());
        }
        checkPreviewMatrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.shutdown(0);
            this.cameraThread.postRunnable(new m(this, 4));
        }
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.destroy(true, null, null);
        }
        CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[1];
        if (cameraSessionWrapper2 != null) {
            cameraSessionWrapper2.destroy(true, null, null);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.surfaceHeight = i10;
        this.surfaceWidth = i9;
        checkPreviewMatrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object obj;
        CameraSessionWrapper cameraSessionWrapper;
        if ((this.inited || (cameraSessionWrapper = this.cameraSession[0]) == null || !cameraSessionWrapper.isInitiated()) && ((obj = this.renderNode) == null || org.telegram.messenger.b.c(obj).hasDisplayList())) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new m(this, 5));
        } else {
            onSurfaceTextureUpdatedInternal();
        }
    }

    public void pauseAsTakingPicture() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.pause(600L);
        }
    }

    public void resetCamera() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            if (this.cameraSessionRecording == cameraSessionWrapper) {
                this.cameraSessionRecording = null;
            }
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new m(this, 0));
            this.cameraSession[0] = null;
        }
    }

    public void runHaptic() {
        long[] jArr = {0, 1};
        if (Build.VERSION.SDK_INT < 26) {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        } else {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            VibrationEffect createWaveform = VibrationEffect.createWaveform(jArr, -1);
            vibrator.cancel();
            vibrator.vibrate(createWaveform);
        }
    }

    public void setClipBottom(int i9) {
        this.clipBottom = i9;
    }

    public void setClipTop(int i9) {
        this.clipTop = i9;
    }

    public void setDelegate(CameraViewDelegate cameraViewDelegate) {
        this.delegate = cameraViewDelegate;
    }

    public void setFpsLimit(int i9) {
        this.fpsLimit = i9;
    }

    public void setMirror(boolean z10) {
        this.mirror = z10;
    }

    public void setOptimizeForBarcode(boolean z10) {
        this.optimizeForBarcode = z10;
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setOptimizeForBarcode(true);
        }
    }

    public void setRecordFile(File file) {
        this.recordFile = file;
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.thumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.thumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (this.firstFrameRendered) {
            return;
        }
        this.blurredStubView.animate().setListener(null).cancel();
        this.blurredStubView.setBackground(this.thumbDrawable);
        this.blurredStubView.setAlpha(1.0f);
        this.blurredStubView.setVisibility(0);
    }

    public void setUseMaxPreview(boolean z10) {
        this.useMaxPreview = z10;
    }

    public void setZoom(float f10) {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setZoom(f10);
        }
    }

    public void showTexture(final boolean z10, boolean z11) {
        if (this.textureView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.textureViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.textureViewAnimator = null;
        }
        if (!z11) {
            this.textureView.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.textureView.getAlpha(), z10 ? 1.0f : 0.0f);
        this.textureViewAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.camera.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CameraView.this.lambda$showTexture$6(valueAnimator2);
            }
        });
        this.textureViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.camera.CameraView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CameraView.this.textureView.setAlpha(z10 ? 1.0f : 0.0f);
                CameraView.this.textureViewAnimator = null;
            }
        });
        this.textureViewAnimator.start();
    }

    public boolean square() {
        return false;
    }

    @Override // org.telegram.messenger.camera.CameraController.ICameraView
    public boolean startRecording(File file, Runnable runnable) {
        this.cameraSessionRecording = this.cameraSession[0];
        this.cameraThread.startRecording(file);
        this.onRecordingFinishRunnable = runnable;
        return true;
    }

    public void startSwitchingAnimation() {
        Bitmap bitmap;
        ValueAnimator valueAnimator = this.flipAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.blurredStubView.animate().setListener(null).cancel();
        if (this.firstFrameRendered && (bitmap = this.textureView.getBitmap(100, 100)) != null) {
            Utilities.blurBitmap(bitmap, 3);
            this.blurredStubView.setBackground(new BitmapDrawable(bitmap));
        }
        this.blurredStubView.setAlpha(1.0f);
        this.blurredStubView.setVisibility(0);
        this.flipHalfReached = false;
        this.flipping = true;
        this.flipAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.textureView.setCameraDistance(r0.getMeasuredHeight() * 4.0f);
        this.blurredStubView.setCameraDistance(r0.getMeasuredHeight() * 4.0f);
        this.flipAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.camera.CameraView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    z10 = false;
                } else {
                    floatValue -= 1.0f;
                    z10 = true;
                }
                float f10 = floatValue * 180.0f;
                CameraView.this.textureView.setRotationY(f10);
                CameraView.this.blurredStubView.setRotationY(f10);
                if (z10) {
                    CameraView cameraView = CameraView.this;
                    if (cameraView.flipHalfReached) {
                        return;
                    }
                    cameraView.flipHalfReached = true;
                }
            }
        });
        this.flipAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.camera.CameraView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CameraView cameraView = CameraView.this;
                cameraView.flipAnimator = null;
                cameraView.textureView.setTranslationY(0.0f);
                CameraView.this.textureView.setRotationX(0.0f);
                CameraView.this.textureView.setRotationY(0.0f);
                CameraView.this.textureView.setScaleX(1.0f);
                CameraView.this.textureView.setScaleY(1.0f);
                CameraView.this.blurredStubView.setRotationY(0.0f);
                CameraView cameraView2 = CameraView.this;
                if (!cameraView2.flipHalfReached) {
                    cameraView2.flipHalfReached = true;
                }
                cameraView2.invalidate();
            }
        });
        this.flipAnimator.setDuration(500L);
        this.flipAnimator.setInterpolator(gr.f);
        this.flipAnimator.start();
        invalidate();
    }

    public void startTakePictureAnimation(boolean z10) {
        this.takePictureProgress = 0.0f;
        invalidate();
        if (z10) {
            runHaptic();
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.ICameraView
    public void stopRecording() {
        this.cameraThread.stopRecording();
    }

    public void switchCamera() {
        if (this.flipping) {
            return;
        }
        if (System.currentTimeMillis() >= this.toggleDualUntil || this.dualCameraAppeared) {
            if (!this.dual) {
                startSwitchingAnimation();
                CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
                if (cameraSessionWrapper != null) {
                    if (this.cameraSessionRecording == cameraSessionWrapper) {
                        this.cameraSessionRecording = null;
                    }
                    cameraSessionWrapper.destroy(false, null, new m(this, 3));
                    this.cameraSession[0] = null;
                }
                this.isFrontface = !this.isFrontface;
                return;
            }
            if (!this.dualCameraAppeared || System.currentTimeMillis() - this.lastDualSwitchTime < 420) {
                return;
            }
            this.lastDualSwitchTime = System.currentTimeMillis();
            CameraInfo[] cameraInfoArr = this.info;
            CameraInfo cameraInfo = cameraInfoArr[0];
            cameraInfoArr[0] = cameraInfoArr[1];
            cameraInfoArr[1] = cameraInfo;
            Size[] sizeArr = this.previewSize;
            Size size = sizeArr[0];
            sizeArr[0] = sizeArr[1];
            sizeArr[1] = size;
            Size[] sizeArr2 = this.pictureSize;
            Size size2 = sizeArr2[0];
            sizeArr2[0] = sizeArr2[1];
            sizeArr2[1] = size2;
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            CameraSessionWrapper cameraSessionWrapper2 = cameraSessionWrapperArr[0];
            cameraSessionWrapperArr[0] = cameraSessionWrapperArr[1];
            cameraSessionWrapperArr[1] = cameraSessionWrapper2;
            this.isFrontface = !this.isFrontface;
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(8));
            }
        }
    }

    public void toggleDual() {
        toggleDual(false);
    }

    public void unlistenDraw(Runnable runnable) {
        this.invalidateListeners.remove(runnable);
    }

    public void updateDualPosition() {
        Handler handler;
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread == null || (handler = cameraGLThread.getHandler()) == null) {
            return;
        }
        this.cameraThread.sendMessage(handler.obtainMessage(7, this.dualMatrix), 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.thumbDrawable || super.verifyDrawable(drawable);
    }

    public CameraView(Context context, boolean z10, boolean z11) {
        super(context, null);
        this.WRITE_TO_FILE_IN_BACKGROUND = false;
        this.previewSize = new Size[2];
        this.pictureSize = new Size[2];
        this.info = new CameraInfo[2];
        this.txform = new Matrix();
        this.matrix = new Matrix();
        this.useCamera2 = false;
        this.cameraSession = new CameraSessionWrapper[2];
        this.focusProgress = 1.0f;
        this.outerPaint = new Paint(1);
        this.innerPaint = new Paint(1);
        this.interpolator = new DecelerateInterpolator();
        this.layoutLock = new Object();
        Class cls = Float.TYPE;
        this.mMVPMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.mSTMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.moldSTMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.cameraMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.lastCrossfadeValue = 0.0f;
        this.flipping = false;
        this.fpsLimit = -1;
        this.dualMatrix = new Matrix();
        this.textureInited = false;
        this.bounds = new Rect();
        this.measurementsCount = 0;
        this.lastWidth = -1;
        this.lastHeight = -1;
        this.updateRotationMatrix = new m(this, 1);
        this.takePictureProgress = 1.0f;
        this.invalidateListeners = new ArrayList<>();
        this.cameraTexture = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 1);
        CameraController.getInstance().addOnErrorListener(this);
        this.isFrontface = z10;
        this.initialFrontface = z10;
        this.textureView = new TextureView(context);
        this.lazy = z11;
        if (!z11) {
            initTexture();
        }
        setWillNotDraw(!z11);
        ImageView imageView = new ImageView(context);
        this.blurredStubView = imageView;
        addView(imageView, e6.e(-1, -1, 17));
        this.blurredStubView.setVisibility(8);
        this.focusAreaSize = AndroidUtilities.dp(96.0f);
        this.outerPaint.setColor(-1);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.innerPaint.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public void focusToPoint(int i9, int i10, int i11, int i12, int i13, boolean z10) {
        float f10 = i10;
        float f11 = i11;
        Rect calculateTapArea = calculateTapArea(f10, f11, 1.0f);
        Rect calculateTapArea2 = calculateTapArea(f10, f11, 1.5f);
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i9];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.focusToRect(calculateTapArea, calculateTapArea2);
        }
        if (z10) {
            this.focusProgress = 0.0f;
            this.innerAlpha = 1.0f;
            this.outerAlpha = 1.0f;
            this.cx = i12;
            this.cy = i13;
            this.lastDrawTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public CameraSessionWrapper getCameraSession(int i9) {
        return this.cameraSession[i9];
    }

    public void toggleDual(boolean z10) {
        Handler handler;
        if (!z10) {
            if (this.flipping || this.closingDualCamera) {
                return;
            }
            if ((System.currentTimeMillis() < this.toggleDualUntil || this.dual != this.dualCameraAppeared) && !this.dual) {
                return;
            }
        }
        addToDualWait(200L);
        boolean z11 = this.dual;
        this.dual = !z11;
        if (z11) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[1];
            if (cameraSessionWrapper == null || !cameraSessionWrapper.isInitiated()) {
                this.dual = !this.dual;
                return;
            }
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[1];
            if (cameraSessionWrapper2 != null) {
                this.closingDualCamera = true;
                if (this.cameraSessionRecording == cameraSessionWrapper2) {
                    this.cameraSessionRecording = null;
                }
                cameraSessionWrapper2.destroy(false, null, new m(this, 2));
                this.cameraSession[1] = null;
                this.previewSize[1] = null;
                this.pictureSize[1] = null;
                this.info[1] = null;
            } else {
                this.dualCameraAppeared = false;
            }
            if (!this.closingDualCamera && (handler = this.cameraThread.getHandler()) != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(10), 0);
            }
        } else {
            CameraSessionWrapper cameraSessionWrapper3 = this.cameraSession[0];
            if (cameraSessionWrapper3 != null) {
                cameraSessionWrapper3.setCurrentFlashMode("off");
            }
            enableDualInternal();
        }
        this.toggledDualAsSave = false;
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Runnable runnable = arrayList.get(i9);
            i9++;
            runnable.run();
        }
    }

    @Override // android.view.View
    public void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Runnable runnable = arrayList.get(i13);
            i13++;
            runnable.run();
        }
    }

    public void focusToPoint(int i9, int i10) {
        focusToPoint(i9, i10, true);
    }

    public void onDualCameraSuccess() {
    }

    public void receivedAmplitude(double d) {
    }

    public void onError(int i9, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
    }
}
