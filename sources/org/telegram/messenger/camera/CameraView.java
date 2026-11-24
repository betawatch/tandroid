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
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
    private boolean useMaxPreview;
    private FloatBuffer vertexBuffer;
    private VideoRecorder videoEncoder;
    private int videoHeight;
    private int videoWidth;

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    private static class AudioBufferInfo {
        static final int MAX_SAMPLES = 10;
        boolean last;
        int lastWroteBuffer;
        int results;
        ByteBuffer[] buffer = new ByteBuffer[10];
        long[] offset = new long[10];
        int[] read = new int[10];

        public AudioBufferInfo() {
            for (int i = 0; i < 10; i++) {
                this.buffer[i] = ByteBuffer.allocateDirect(2048);
                this.buffer[i].order(ByteOrder.nativeOrder());
            }
        }
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public class CameraGLThread extends do3 {
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
        private final lm camera1Appear;
        private boolean camera1Appeared;
        private long camera1AppearedUntil;
        private final int[] cameraId;
        private int cameraMatrixHandle;
        private final SurfaceTexture[] cameraSurface;
        private final lm crossfade;
        private int crossfadeHandle;
        private boolean crossfading;
        private final CameraSessionWrapper[] currentSession;
        private int drawBlurProgram;
        private int drawProgram;
        private final lm dualAppear;
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
        private final lm shape;
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
            super("CameraGLThread", true);
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
            ga1 ga1Var = new ga1(this, (byte) 2);
            s33 s33Var = s33.h;
            this.crossfade = new lm(ga1Var, 560L, s33Var);
            this.camera1Appear = new lm(1.0f, new ga1(this, (byte) 3), 0L, 420L, s33Var);
            this.dualAppear = new lm(new ga1(this, (byte) 4), 340L, s33Var);
            this.shape = new lm(new ga1(this, (byte) 5), 340L, s33Var);
            this.shapeTo = na7.c1().getInt("dualshape", 0);
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
            float[] fArr2 = this.m3x3;
            if (fArr2 == null) {
                fArr2 = new float[9];
                this.m3x3 = fArr2;
            }
            matrix.getValues(fArr2);
            float[] fArr3 = this.m3x3;
            fArr[0] = fArr3[0];
            fArr[1] = fArr3[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr3[6];
            fArr[4] = fArr3[1];
            fArr[5] = fArr3[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr3[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr3[2];
            fArr[13] = fArr3[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr3[8];
        }

        private boolean initBlurGL() {
            if (this.initied) {
                EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, this.eglConfig, this.eglContext, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                this.eglBlurContext = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                    SurfaceTexture surfaceTexture = this.blurSurfaceTexture;
                    if (surfaceTexture == null) {
                        finishBlur();
                        return false;
                    }
                    EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                    this.eglBlurSurface = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        if (w01.a) {
                            b00.v(this.egl10, new StringBuilder("createWindowSurface failed "));
                        }
                        finishBlur();
                        return false;
                    }
                    if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglBlurContext)) {
                        if (w01.a) {
                            b00.v(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                        }
                        finishBlur();
                        EGL10 egl10 = this.egl10;
                        EGLDisplay eGLDisplay = this.eglDisplay;
                        EGLSurface eGLSurface = this.eglSurface;
                        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                        return false;
                    }
                    int loadShader = CameraView.this.loadShader(35633, gl.v2(null, R.raw.camera_blur_vert));
                    int loadShader2 = CameraView.this.loadShader(35632, gl.v2(null, R.raw.camera_blur_frag));
                    if (loadShader != 0 && loadShader2 != 0) {
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.drawBlurProgram = glCreateProgram;
                        GLES20.glAttachShader(glCreateProgram, loadShader);
                        GLES20.glAttachShader(this.drawBlurProgram, loadShader2);
                        GLES20.glLinkProgram(this.drawBlurProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(this.drawBlurProgram, 35714, iArr, 0);
                        int i = iArr[0];
                        int i2 = this.drawBlurProgram;
                        if (i == 0) {
                            GLES20.glDeleteProgram(i2);
                            this.drawBlurProgram = 0;
                            return true;
                        }
                        this.blurPositionHandle = GLES20.glGetAttribLocation(i2, "aPosition");
                        this.blurTextureHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aTextureCoord");
                        this.blurVertexMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uMVPMatrix");
                        this.blurTextureMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uSTMatrix");
                        this.blurCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "cameraMatrix");
                        this.blurPixelHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "pixelWH");
                    }
                    return true;
                }
                this.eglBlurContext = null;
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglCreateContext (blur) failed "));
                }
            }
            return false;
        }

        private boolean initGL() {
            if (w01.a) {
                fa4.b("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            byte b = 0;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                this.eglDisplay = null;
                finish();
                return false;
            }
            if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
                return false;
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
                return false;
            }
            if (iArr[0] <= 0) {
                if (w01.a) {
                    fa4.d("eglConfig not initialized");
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
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglCreateContext failed "));
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
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("createWindowSurface failed "));
                }
                finish();
                return false;
            }
            if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                }
                finish();
                return false;
            }
            android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix[0], 0);
            int loadShader = CameraView.this.loadShader(35633, gl.v2(null, R.raw.camera_vert));
            int loadShader2 = CameraView.this.loadShader(35632, gl.v2(null, R.raw.camera_frag));
            if (loadShader == 0 || loadShader2 == 0) {
                if (w01.a) {
                    fa4.d("failed creating shader");
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
                if (w01.a) {
                    fa4.d("failed link shader");
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
            if (w01.a) {
                fa4.d("gl initied");
            }
            updateScale(0);
            float f = (1.0f / CameraView.this.scaleX) / 2.0f;
            float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
            float f3 = 0.5f - f;
            float f4 = 0.5f - f2;
            float f5 = f + 0.5f;
            float f6 = f2 + 0.5f;
            CameraView.this.vertexBuffer = ByteBuffer.allocateDirect(this.verticesData.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            CameraView.this.vertexBuffer.put(this.verticesData).position(0);
            CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            CameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
            this.cameraSurface[0] = new SurfaceTexture(CameraView.this.cameraTexture[0][0]);
            this.cameraSurface[0].setOnFrameAvailableListener(new ha1(this, b));
            if (this.initDual) {
                GLES20.glGenTextures(1, CameraView.this.cameraTexture[1], 0);
                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[1][0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.cameraSurface[1] = new SurfaceTexture(CameraView.this.cameraTexture[1][0]);
                this.cameraSurface[1].setOnFrameAvailableListener(new ha1(this, b));
            }
            if (this.initDual) {
                boolean z = this.initDualReverse;
                CameraView cameraView = CameraView.this;
                SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                if (z) {
                    cameraView.createCamera(surfaceTextureArr[1], 1);
                    CameraView.this.createCamera(this.cameraSurface[0], 0);
                } else {
                    cameraView.createCamera(surfaceTextureArr[0], 0);
                    CameraView.this.createCamera(this.cameraSurface[1], 1);
                }
            } else {
                CameraView.this.createCamera(this.cameraSurface[0], 0);
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            getValues(matrix, CameraView.this.cameraMatrix[0]);
            Matrix matrix2 = this.initDualMatrix;
            CameraView cameraView2 = CameraView.this;
            if (matrix2 != null) {
                getValues(matrix2, cameraView2.cameraMatrix[1]);
            } else {
                getValues(matrix, cameraView2.cameraMatrix[1]);
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

        /* JADX WARN: Removed duplicated region for block: B:107:0x0387  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02a1  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0296  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x028a  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void onDraw(int i, int i2, boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Size size;
            float f;
            CameraSessionWrapper cameraSessionWrapper;
            int width;
            int height;
            int i3 = i;
            if (this.initied) {
                if (!this.eglContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (w01.a) {
                            b00.v(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                }
                synchronized (CameraView.this.layoutLock) {
                    z3 = CameraView.this.dual;
                    z4 = this.camera1Appeared;
                }
                boolean z8 = true;
                if ((z || z2) && z4) {
                    z5 = true;
                    z6 = true;
                } else {
                    z5 = z;
                    z6 = z2;
                }
                boolean z9 = false;
                if (z5) {
                    try {
                        SurfaceTexture surfaceTexture = this.cameraSurface[0];
                        if (surfaceTexture != null && i3 >= 0) {
                            surfaceTexture.updateTexImage();
                        }
                    } catch (Throwable th) {
                        fa4.g(th, true);
                    }
                }
                if (z6) {
                    try {
                        SurfaceTexture surfaceTexture2 = this.cameraSurface[1];
                        if (surfaceTexture2 != null && i2 >= 0) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (Throwable th2) {
                        fa4.g(th2, true);
                    }
                }
                synchronized (CameraView.this.layoutLock) {
                    if (CameraView.this.fpsLimit > 0) {
                        long nanoTime = System.nanoTime();
                        CameraView cameraView = CameraView.this;
                        long j = cameraView.nextFrameTimeNs;
                        if (nanoTime < j) {
                            z8 = false;
                        } else {
                            cameraView.nextFrameTimeNs = j + (1000000000 / cameraView.fpsLimit);
                            CameraView cameraView2 = CameraView.this;
                            cameraView2.nextFrameTimeNs = Math.max(cameraView2.nextFrameTimeNs, nanoTime);
                            z8 = true;
                        }
                    }
                }
                CameraSessionWrapper cameraSessionWrapper2 = this.currentSession[0];
                if (cameraSessionWrapper2 == null || cameraSessionWrapper2.getCameraId() != i3) {
                    return;
                }
                if (this.recording && CameraView.this.videoEncoder != null && (z5 || z6)) {
                    CameraView.this.videoEncoder.frameAvailable(this.cameraSurface[0], Integer.valueOf(i3), System.nanoTime());
                }
                if (z8) {
                    this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, this.array);
                    int[] iArr = this.array;
                    int i4 = iArr[0];
                    this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
                    GLES20.glViewport(0, 0, i4, this.array[0]);
                    if (z3) {
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                        GLES20.glClear(TLObject.FLAG_14);
                    }
                    CameraView.this.shapeValue = this.shape.e(false, this.shapeTo);
                    float f2 = CameraView.this.lastCrossfadeValue = this.crossfade.e(false, 0.0f);
                    float e = this.dualAppear.e(false, this.dualAppeared ? 1.0f : 0.0f);
                    float d = 1.0f - this.camera1Appear.d(this.camera1Appeared);
                    if (f2 <= 0.0f) {
                        this.crossfading = false;
                    }
                    int i5 = -1;
                    int i6 = -1;
                    int i7 = -1;
                    while (i6 < 2) {
                        if (i6 != i5 || this.crossfading) {
                            int i8 = i6 < 0 ? 1 : i6;
                            if (this.cameraSurface[i8] != null) {
                                if (i8 != 0) {
                                    CameraSessionWrapper cameraSessionWrapper3 = this.currentSession[i8];
                                    if (cameraSessionWrapper3 != null) {
                                        if (!cameraSessionWrapper3.isInitiated()) {
                                        }
                                        z7 = z9;
                                        if (i8 == 1 || i2 >= 0) {
                                            if ((i8 == 0 && z5) || (i8 == 1 && z6)) {
                                                this.cameraSurface[i8].getTransformMatrix(CameraView.this.mSTMatrix[i8]);
                                            }
                                            GLES20.glUseProgram(this.drawProgram);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i8][z7 ? 1 : 0]);
                                            if (i7 == i5) {
                                                i7 = CameraView.this.cameraTexture[i8][z7 ? 1 : 0];
                                            }
                                            GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                            GLES20.glEnableVertexAttribArray(this.positionHandle);
                                            GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                            GLES20.glEnableVertexAttribArray(this.textureHandle);
                                            GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, z7, CameraView.this.cameraMatrix[i8], z7 ? 1 : 0);
                                            GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, z7, CameraView.this.cameraMatrix[1 - i8], z7 ? 1 : 0);
                                            GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, z7, CameraView.this.mSTMatrix[i8], z7 ? 1 : 0);
                                            GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, z7, CameraView.this.mMVPMatrix[i8], z7 ? 1 : 0);
                                            size = CameraView.this.previewSize[i8];
                                            if (size != null || (cameraSessionWrapper = this.currentSession[i8]) == null) {
                                                int i9 = this.pixelHandle;
                                                CameraView cameraView3 = CameraView.this;
                                                if (i8 == 0) {
                                                    GLES20.glUniform2f(i9, cameraView3.pixelW, CameraView.this.pixelH);
                                                } else {
                                                    GLES20.glUniform2f(i9, cameraView3.pixelDualW, CameraView.this.pixelDualH);
                                                }
                                            } else {
                                                int worldAngle = cameraSessionWrapper.getWorldAngle();
                                                if (worldAngle == 90 || worldAngle == 270) {
                                                    width = size.getWidth();
                                                    height = size.getHeight();
                                                } else {
                                                    width = size.getHeight();
                                                    height = size.getWidth();
                                                }
                                                GLES20.glUniform2f(this.pixelHandle, width, height);
                                            }
                                            int i10 = this.dualHandle;
                                            if (i8 == 0) {
                                                GLES20.glUniform1f(i10, z3 ? 1.0f : 0.0f);
                                                f = 1.0f;
                                            } else {
                                                f = 1.0f;
                                                GLES20.glUniform1f(i10, 1.0f);
                                            }
                                            GLES20.glUniform1f(this.blurHandle, i8 == 0 ? d : 0.0f);
                                            int i11 = this.alphaHandle;
                                            if (i8 == 1) {
                                                GLES20.glUniform1f(i11, f);
                                                if (i6 < 0) {
                                                    GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                    GLES20.glUniform1f(this.scaleHandle, f);
                                                    GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                    GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                    GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                    GLES20.glUniform1f(this.crossfadeHandle, f);
                                                } else {
                                                    boolean z10 = this.crossfading;
                                                    int i12 = this.roundRadiusHandle;
                                                    if (z10) {
                                                        GLES20.glUniform1f(i12, gl.L(16.0f));
                                                        GLES20.glUniform1f(this.scaleHandle, 1.0f - f2);
                                                        GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                        GLES20.glUniform1f(this.shapeHandle, f2);
                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                    } else {
                                                        GLES20.glUniform1f(i12, gl.L(16.0f));
                                                        GLES20.glUniform1f(this.scaleHandle, e);
                                                        GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                        GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                    }
                                                }
                                            } else {
                                                GLES20.glUniform1f(i11, f);
                                                boolean z11 = this.crossfading;
                                                int i13 = this.roundRadiusHandle;
                                                if (z11) {
                                                    GLES20.glUniform1f(i13, gl.U1(f2, gl.L(12.0f), gl.L(16.0f)));
                                                    GLES20.glUniform1f(this.scaleHandle, f);
                                                    GLES20.glUniform1f(this.shapeFromHandle, this.shapeTo);
                                                    GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                    GLES20.glUniform1f(this.shapeHandle, Utilities.i(f - f2, f, 0.0f));
                                                    GLES20.glUniform1f(this.crossfadeHandle, f2);
                                                } else {
                                                    GLES20.glUniform1f(i13, 0.0f);
                                                    GLES20.glUniform1f(this.scaleHandle, f);
                                                    GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                    GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                    GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                    GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                }
                                            }
                                            GLES20.glDrawArrays(5, 0, 4);
                                            GLES20.glDisableVertexAttribArray(this.positionHandle);
                                            GLES20.glDisableVertexAttribArray(this.textureHandle);
                                            GLES20.glBindTexture(36197, 0);
                                            GLES20.glUseProgram(0);
                                        }
                                    }
                                } else {
                                    if (i3 < 0 && !z3) {
                                    }
                                    z7 = z9;
                                    if (i8 == 1) {
                                    }
                                    if (i8 == 0) {
                                        this.cameraSurface[i8].getTransformMatrix(CameraView.this.mSTMatrix[i8]);
                                        GLES20.glUseProgram(this.drawProgram);
                                        GLES20.glActiveTexture(33984);
                                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i8][z7 ? 1 : 0]);
                                        if (i7 == i5) {
                                        }
                                        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                        GLES20.glEnableVertexAttribArray(this.positionHandle);
                                        GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                        GLES20.glEnableVertexAttribArray(this.textureHandle);
                                        GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, z7, CameraView.this.cameraMatrix[i8], z7 ? 1 : 0);
                                        GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, z7, CameraView.this.cameraMatrix[1 - i8], z7 ? 1 : 0);
                                        GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, z7, CameraView.this.mSTMatrix[i8], z7 ? 1 : 0);
                                        GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, z7, CameraView.this.mMVPMatrix[i8], z7 ? 1 : 0);
                                        size = CameraView.this.previewSize[i8];
                                        if (size != null) {
                                        }
                                        int i92 = this.pixelHandle;
                                        CameraView cameraView32 = CameraView.this;
                                        if (i8 == 0) {
                                        }
                                        int i102 = this.dualHandle;
                                        if (i8 == 0) {
                                        }
                                        GLES20.glUniform1f(this.blurHandle, i8 == 0 ? d : 0.0f);
                                        int i112 = this.alphaHandle;
                                        if (i8 == 1) {
                                        }
                                        GLES20.glDrawArrays(5, 0, 4);
                                        GLES20.glDisableVertexAttribArray(this.positionHandle);
                                        GLES20.glDisableVertexAttribArray(this.textureHandle);
                                        GLES20.glBindTexture(36197, 0);
                                        GLES20.glUseProgram(0);
                                    }
                                    this.cameraSurface[i8].getTransformMatrix(CameraView.this.mSTMatrix[i8]);
                                    GLES20.glUseProgram(this.drawProgram);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i8][z7 ? 1 : 0]);
                                    if (i7 == i5) {
                                    }
                                    GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                    GLES20.glEnableVertexAttribArray(this.positionHandle);
                                    GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                    GLES20.glEnableVertexAttribArray(this.textureHandle);
                                    GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, z7, CameraView.this.cameraMatrix[i8], z7 ? 1 : 0);
                                    GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, z7, CameraView.this.cameraMatrix[1 - i8], z7 ? 1 : 0);
                                    GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, z7, CameraView.this.mSTMatrix[i8], z7 ? 1 : 0);
                                    GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, z7, CameraView.this.mMVPMatrix[i8], z7 ? 1 : 0);
                                    size = CameraView.this.previewSize[i8];
                                    if (size != null) {
                                    }
                                    int i922 = this.pixelHandle;
                                    CameraView cameraView322 = CameraView.this;
                                    if (i8 == 0) {
                                    }
                                    int i1022 = this.dualHandle;
                                    if (i8 == 0) {
                                    }
                                    GLES20.glUniform1f(this.blurHandle, i8 == 0 ? d : 0.0f);
                                    int i1122 = this.alphaHandle;
                                    if (i8 == 1) {
                                    }
                                    GLES20.glDrawArrays(5, 0, 4);
                                    GLES20.glDisableVertexAttribArray(this.positionHandle);
                                    GLES20.glDisableVertexAttribArray(this.textureHandle);
                                    GLES20.glBindTexture(36197, 0);
                                    GLES20.glUseProgram(0);
                                }
                            }
                        }
                        i6++;
                        i3 = i;
                        z9 = false;
                        i5 = -1;
                    }
                    this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                    if (this.blurSurfaceTexture != null && this.blurInited) {
                        if (!this.eglBlurContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglBlurSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                            EGL10 egl102 = this.egl10;
                            EGLDisplay eGLDisplay2 = this.eglDisplay;
                            EGLSurface eGLSurface2 = this.eglBlurSurface;
                            if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglBlurContext)) {
                                if (w01.a) {
                                    b00.v(this.egl10, new StringBuilder("eglMakeCurrent failed "));
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
                        CameraView cameraView4 = CameraView.this;
                        if (!cameraView4.firstFrameRendered && z4) {
                            cameraView4.firstFrameRendered = true;
                            gl.d3(new ga1(this, (byte) 0));
                        }
                        CameraView cameraView5 = CameraView.this;
                        if (!cameraView5.firstFrame2Rendered && this.dualAppeared) {
                            cameraView5.firstFrame2Rendered = true;
                            gl.d3(new ga1(this, (byte) 1));
                        }
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

        private void updateScale(int i) {
            if (CameraView.this.previewSize[i] != null) {
                int width = CameraView.this.previewSize[i].getWidth();
                float min = CameraView.this.surfaceWidth / Math.min(width, r4);
                int i2 = (int) (width * min);
                int height = (int) (CameraView.this.previewSize[i].getHeight() * min);
                CameraView cameraView = CameraView.this;
                if (i2 == height) {
                    cameraView.scaleX = 1.0f;
                    CameraView.this.scaleY = 1.0f;
                } else if (i2 > height) {
                    cameraView.scaleX = height / cameraView.surfaceWidth;
                    CameraView.this.scaleY = 1.0f;
                } else {
                    cameraView.scaleX = 1.0f;
                    CameraView.this.scaleY = i2 / r4.surfaceHeight;
                }
                fa4.b("CameraView camera scaleX = " + CameraView.this.scaleX + " scaleY = " + CameraView.this.scaleY);
            }
        }

        public void finish() {
            if (this.cameraSurface != null) {
                int i = 0;
                while (true) {
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    if (i >= surfaceTextureArr.length) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = surfaceTextureArr[i];
                    if (surfaceTexture != null) {
                        surfaceTexture.setOnFrameAvailableListener(null);
                        this.cameraSurface[i].release();
                        this.cameraSurface[i] = null;
                    }
                    i++;
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

        @Override // do3
        public void handleMessage(Message message) {
            int i = message.what;
            boolean z = true;
            byte b = 0;
            switch (i) {
                case 0:
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    Object obj = message.obj;
                    Object obj2 = this.updateTexBoth;
                    boolean z2 = obj == obj2 || obj == this.updateTex1;
                    if (obj != obj2 && obj != this.updateTex2) {
                        z = false;
                    }
                    onDraw(i2, i3, z2, z);
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
                    int i4 = i == 2 ? 0 : 1;
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (w01.a) {
                            fa4.b("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture = this.cameraSurface[i4];
                    if (surfaceTexture != null) {
                        surfaceTexture.getTransformMatrix(CameraView.this.moldSTMatrix[i4]);
                        this.cameraSurface[i4].setOnFrameAvailableListener(null);
                        this.cameraSurface[i4].release();
                        this.cameraSurface[i4] = null;
                    }
                    if (CameraView.this.cameraTexture[i4][0] == 0) {
                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[i4], 0);
                    }
                    this.cameraId[i4] = message.arg1;
                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i4][0]);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    if (i4 == 1) {
                        applyDualMatrix((Matrix) message.obj);
                    }
                    this.cameraSurface[i4] = new SurfaceTexture(CameraView.this.cameraTexture[i4][0]);
                    this.cameraSurface[i4].setOnFrameAvailableListener(new ha1(this, b));
                    if (this.ignoreCamera1Upd) {
                        this.camera1Appeared = false;
                        this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                        this.ignoreCamera1Upd = false;
                    }
                    CameraView.this.createCamera(this.cameraSurface[i4], i4);
                    updateScale(i4);
                    float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                    float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                    float f3 = 0.5f - f;
                    float f4 = 0.5f - f2;
                    float f5 = f + 0.5f;
                    float f6 = f2 + 0.5f;
                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    CameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                    if (i4 == 1) {
                        this.dualAppeared = false;
                        synchronized (CameraView.this.layoutLock) {
                            CameraView.this.dualCameraAppeared = false;
                            CameraView.this.firstFrame2Rendered = false;
                        }
                        this.dualAppear.e(true, 0.0f);
                        return;
                    }
                    return;
                case 3:
                    int i5 = message.arg1;
                    CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) message.obj;
                    if (cameraSessionWrapper != null) {
                        CameraSessionWrapper[] cameraSessionWrapperArr = this.currentSession;
                        if (cameraSessionWrapperArr[i5] != cameraSessionWrapper) {
                            cameraSessionWrapperArr[i5] = cameraSessionWrapper;
                            this.cameraId[i5] = cameraSessionWrapper.getCameraId();
                        }
                        int worldAngle = this.currentSession[i5].getWorldAngle();
                        if (w01.a) {
                            fa4.b("CameraView set gl renderer session " + i5 + " angle=" + worldAngle);
                        }
                        android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[i5], 0);
                        if (worldAngle != 0) {
                            android.opengl.Matrix.rotateM(CameraView.this.mMVPMatrix[i5], 0, worldAngle, 0.0f, 0.0f, 1.0f);
                            return;
                        }
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
                    int i6 = iArr[0];
                    iArr[0] = iArr[1];
                    iArr[1] = i6;
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
                    this.crossfade.e(true, 1.0f);
                    requestRender(true, true);
                    return;
                case 9:
                    float f7 = this.shapeTo + 1.0f;
                    this.shapeTo = f7;
                    CameraView.this.lastShapeTo = f7;
                    requestRender(false, false);
                    return;
                case 10:
                    EGL10 egl102 = this.egl10;
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglContext)) {
                        if (w01.a) {
                            fa4.b("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
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

        public void pause(long j) {
            this.pausedTime = System.currentTimeMillis() + j;
        }

        public void reinitForNewCamera() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(2, Integer.valueOf(CameraView.this.info[0].cameraId)), 0);
            }
        }

        public void requestRender(boolean z, boolean z2) {
            Handler handler;
            if (this.pausedTime <= 0 || System.currentTimeMillis() >= this.pausedTime) {
                if ((z || z2 || !this.recording) && (handler = getHandler()) != null) {
                    if ((z || z2) && handler.hasMessages(0, this.updateTexBoth)) {
                        return;
                    }
                    if (!z && handler.hasMessages(0, this.updateTex1)) {
                        z = true;
                    }
                    if (!z2 && handler.hasMessages(0, this.updateTex2)) {
                        z2 = true;
                    }
                    handler.removeMessages(0);
                    int[] iArr = this.cameraId;
                    sendMessage(handler.obtainMessage(0, iArr[0], iArr[1], z ? z2 ? this.updateTexBoth : this.updateTex1 : this.updateTex2), 0);
                }
            }
        }

        @Override // do3, java.lang.Thread, java.lang.Runnable
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

        public void setCurrentSession(CameraSessionWrapper cameraSessionWrapper, int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(3, i, 0, cameraSessionWrapper), 0);
            }
        }

        public void shutdown(int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(1, i, 0), 0);
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

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public interface CameraViewDelegate {
        void onCameraInit();
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    private static class EncoderHandler extends Handler {
        private WeakReference<VideoRecorder> mWeakEncoder;

        public EncoderHandler(VideoRecorder videoRecorder) {
            this.mWeakEncoder = new WeakReference<>(videoRecorder);
        }

        public void exit() {
            Looper.myLooper().quit();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            VideoRecorder videoRecorder = this.mWeakEncoder.get();
            if (videoRecorder != null) {
                if (i == 0) {
                    try {
                        if (w01.a) {
                            fa4.d("start encoder");
                        }
                        videoRecorder.prepareEncoder();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        videoRecorder.handleStopRecording(0);
                        Looper.myLooper().quit();
                        return;
                    }
                }
                if (i == 1) {
                    if (w01.a) {
                        fa4.d("stop encoder");
                    }
                    videoRecorder.handleStopRecording(message.arg1);
                } else if (i == 2) {
                    videoRecorder.handleVideoFrameAvailable((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
                } else {
                    if (i != 3) {
                        return;
                    }
                    videoRecorder.handleAudioFrameAvailable((AudioBufferInfo) message.obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    class VideoRecorder implements Runnable {
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
        private ArrayBlockingQueue<AudioBufferInfo> buffers;
        private ArrayList<AudioBufferInfo> buffersToWrite;
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
        do3 fileWriteQueue;
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

        /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
        class 1 implements Runnable {
            public 1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(double d) {
                CameraView.this.receivedAmplitude(d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            
                if (r16.this$1.sendWhenDone != 0) goto L14;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                long j = -1;
                long j2 = -1;
                boolean z = false;
                while (true) {
                    if (!z) {
                        if (!VideoRecorder.this.running && VideoRecorder.this.audioRecorder.getRecordingState() != 1) {
                            try {
                                VideoRecorder.this.audioRecorder.stop();
                            } catch (Exception unused) {
                                z = true;
                            }
                        }
                        AudioBufferInfo audioBufferInfo = VideoRecorder.this.buffers.isEmpty() ? new AudioBufferInfo() : (AudioBufferInfo) VideoRecorder.this.buffers.poll();
                        audioBufferInfo.lastWroteBuffer = 0;
                        audioBufferInfo.results = 10;
                        int i = 0;
                        while (true) {
                            if (i >= 10) {
                                break;
                            }
                            if (j2 == j) {
                                j2 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = audioBufferInfo.buffer[i];
                            byteBuffer.rewind();
                            int read = VideoRecorder.this.audioRecorder.read(byteBuffer, 2048);
                            if (read > 0 && i % 2 == 0) {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                for (int i2 = 0; i2 < read / 2; i2++) {
                                    short s = byteBuffer.getShort();
                                    d += s * s;
                                }
                                final double sqrt = Math.sqrt((d / read) / 2.0d);
                                gl.d3(new Runnable() { // from class: org.telegram.messenger.camera.d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CameraView.VideoRecorder.1.this.lambda$run$0(sqrt);
                                    }
                                });
                                byteBuffer.position(0);
                            }
                            if (read <= 0) {
                                audioBufferInfo.results = i;
                                if (!VideoRecorder.this.running) {
                                    audioBufferInfo.last = true;
                                }
                            } else {
                                audioBufferInfo.offset[i] = j2;
                                audioBufferInfo.read[i] = read;
                                j2 += ((read * 1000000) / CameraView.audioSampleRate) / 2;
                                i++;
                                j = -1;
                            }
                        }
                        if (audioBufferInfo.results >= 0 || audioBufferInfo.last) {
                            r7 = (VideoRecorder.this.running || audioBufferInfo.results >= 10) ? z : true;
                            VideoRecorder.this.handler.sendMessage(VideoRecorder.this.handler.obtainMessage(3, audioBufferInfo));
                        } else if (VideoRecorder.this.running) {
                            try {
                                VideoRecorder.this.buffers.put(audioBufferInfo);
                            } catch (Exception unused2) {
                            }
                            j = -1;
                        }
                        z = r7;
                        j = -1;
                    }
                    try {
                        VideoRecorder.this.audioRecorder.release();
                    } catch (Exception e) {
                        fa4.g(e, true);
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
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0143, code lost:
        
            r2 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleAudioFrameAvailable(AudioBufferInfo audioBufferInfo) {
            long j;
            if (this.audioStopedByTime) {
                return;
            }
            AudioBufferInfo audioBufferInfo2 = audioBufferInfo;
            this.buffersToWrite.add(audioBufferInfo2);
            if (this.audioFirst == -1) {
                if (this.videoFirst == -1) {
                    if (w01.a) {
                        fa4.b("CameraView video record not yet started");
                        return;
                    }
                    return;
                }
                while (true) {
                    for (int i = 0; i < audioBufferInfo2.results; i++) {
                        if (i != 0 || Math.abs(this.videoFirst - audioBufferInfo2.offset[i]) <= 10000000) {
                            long j2 = audioBufferInfo2.offset[i];
                            if (j2 >= this.videoFirst) {
                                audioBufferInfo2.lastWroteBuffer = i;
                                this.audioFirst = j2;
                                if (w01.a) {
                                    ug8.q(audioBufferInfo2.offset[i], de9.m(i, "CameraView found first audio frame at ", " timestamp = "));
                                }
                            } else {
                                if (w01.a) {
                                    ug8.q(audioBufferInfo2.offset[i], de9.m(i, "CameraView ignore first audio frame at ", " timestamp = "));
                                }
                            }
                        } else {
                            long j3 = this.videoFirst;
                            long j4 = audioBufferInfo2.offset[i];
                            this.desyncTime = j3 - j4;
                            this.audioFirst = j4;
                            if (w01.a) {
                                ug8.q(this.desyncTime, new StringBuilder("CameraView detected desync between audio and video "));
                            }
                        }
                    }
                    if (w01.a) {
                        b00.p(audioBufferInfo2.results, new StringBuilder("CameraView first audio frame not found, removing buffers "));
                    }
                    this.buffersToWrite.remove(audioBufferInfo2);
                    if (this.buffersToWrite.isEmpty()) {
                        return;
                    } else {
                        audioBufferInfo2 = this.buffersToWrite.get(0);
                    }
                }
            }
            if (this.audioStartTime == -1) {
                this.audioStartTime = audioBufferInfo2.offset[audioBufferInfo2.lastWroteBuffer];
            }
            if (this.buffersToWrite.size() > 1) {
                audioBufferInfo2 = this.buffersToWrite.get(0);
            }
            try {
                drainEncoder(false);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            boolean z = false;
            while (audioBufferInfo2 != null) {
                try {
                    long j5 = 0;
                    int dequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(0L);
                    if (dequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = this.audioEncoder.getInputBuffer(dequeueInputBuffer);
                        long[] jArr = audioBufferInfo2.offset;
                        int i2 = audioBufferInfo2.lastWroteBuffer;
                        long j6 = jArr[i2];
                        while (true) {
                            int i3 = audioBufferInfo2.results;
                            if (i2 > i3) {
                                j = j5;
                                break;
                            }
                            if (i2 < i3) {
                                if (this.running) {
                                    j = j5;
                                } else {
                                    j = j5;
                                    if (audioBufferInfo2.offset[i2] >= this.videoLast - this.desyncTime) {
                                        if (w01.a) {
                                            fa4.b("CameraView stop audio encoding because of stoped video recording at " + audioBufferInfo2.offset[i2] + " last video " + this.videoLast);
                                        }
                                        this.audioStopedByTime = true;
                                        this.buffersToWrite.clear();
                                        z = true;
                                    }
                                }
                                if (inputBuffer.remaining() < audioBufferInfo2.read[i2]) {
                                    audioBufferInfo2.lastWroteBuffer = i2;
                                    break;
                                }
                                inputBuffer.put(audioBufferInfo2.buffer[i2]);
                            } else {
                                j = j5;
                            }
                            if (i2 >= audioBufferInfo2.results - 1) {
                                this.buffersToWrite.remove(audioBufferInfo2);
                                if (this.running) {
                                    this.buffers.put(audioBufferInfo2);
                                }
                                if (this.buffersToWrite.isEmpty()) {
                                    z = audioBufferInfo2.last;
                                    break;
                                }
                                audioBufferInfo2 = this.buffersToWrite.get(0);
                            }
                            i2++;
                            j5 = j;
                        }
                        this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j6 == j ? j : j6 - this.audioStartTime, z ? 4 : 0);
                    }
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleStopRecording(int i) {
            if (this.running) {
                this.sendWhenDone = i;
                this.running = false;
                return;
            }
            try {
                drainEncoder(true);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.fileWriteQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.camera.b
                @Override // java.lang.Runnable
                public final void run() {
                    CameraView.VideoRecorder.this.lambda$handleStopRecording$0(countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (this.writingToDifferentFile && !this.fileToWrite.renameTo(this.videoFile)) {
                fa4.d("unable to rename file, try move file");
                try {
                    gl.E(this.fileToWrite, this.videoFile);
                    this.fileToWrite.delete();
                } catch (IOException e5) {
                    fa4.g(e5, true);
                    fa4.d("unable to move file");
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
            gl.d3(new Runnable() { // from class: org.telegram.messenger.camera.c
                @Override // java.lang.Runnable
                public final void run() {
                    CameraView.VideoRecorder.this.lambda$handleStopRecording$1();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleVideoFrameAvailable(long j, Integer num) {
            long j2;
            int width;
            int height;
            try {
                drainEncoder(false);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j3 = this.lastTimestamp;
            if (j3 == -1) {
                this.lastTimestamp = j;
                j2 = 0;
                if (this.currentTimestamp != 0) {
                    j2 = 1000000 * (currentTimeMillis - this.lastCommitedFrameTime);
                }
            } else {
                j2 = j - j3;
                this.lastTimestamp = j;
            }
            this.lastCommitedFrameTime = currentTimeMillis;
            if (!this.skippedFirst) {
                long j4 = this.skippedTime + j2;
                this.skippedTime = j4;
                if (j4 < 200000000) {
                    return;
                } else {
                    this.skippedFirst = true;
                }
            }
            this.currentTimestamp += j2;
            if (this.videoFirst == -1) {
                this.videoFirst = j / 1000;
                if (w01.a) {
                    ug8.q(this.videoFirst, new StringBuilder("CameraView first video frame was at "));
                }
            }
            this.videoLast = j;
            if (CameraView.this.cameraTexture[1][0] != 0 && !this.blendEnabled) {
                GLES20.glEnable(3042);
                this.blendEnabled = true;
            }
            boolean z = CameraView.this.dual;
            if (z) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(TLObject.FLAG_14);
            }
            float f = CameraView.this.lastCrossfadeValue;
            boolean z2 = f > 0.0f;
            int i = -1;
            while (i < 2) {
                if (i != -1 || z2) {
                    int i2 = i < 0 ? 1 : i;
                    if (CameraView.this.cameraTexture[i2][0] != 0) {
                        GLES20.glUseProgram(this.drawProgram);
                        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                        GLES20.glEnableVertexAttribArray(this.positionHandle);
                        GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                        GLES20.glEnableVertexAttribArray(this.textureHandle);
                        GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i2], 0);
                        GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i2], 0);
                        GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i2], 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i2], 0);
                        GLES20.glUniform1f(this.blurHandle, 0.0f);
                        Size size = CameraView.this.previewSize[i2];
                        if (size == null || CameraView.this.cameraSession[i2] == null) {
                            int i3 = this.pixelHandle;
                            CameraView cameraView = CameraView.this;
                            if (i2 == 0) {
                                GLES20.glUniform2f(i3, cameraView.pixelW, CameraView.this.pixelH);
                            } else {
                                GLES20.glUniform2f(i3, cameraView.pixelDualW, CameraView.this.pixelDualH);
                            }
                        } else {
                            int worldAngle = CameraView.this.cameraSession[i2].getWorldAngle();
                            if (worldAngle == 90 || worldAngle == 270) {
                                width = size.getWidth();
                                height = size.getHeight();
                            } else {
                                width = size.getHeight();
                                height = size.getWidth();
                            }
                            GLES20.glUniform2f(this.pixelHandle, width, height);
                        }
                        int i4 = this.dualHandle;
                        if (i2 == 0) {
                            GLES20.glUniform1f(i4, z ? 1.0f : 0.0f);
                        } else {
                            GLES20.glUniform1f(i4, 1.0f);
                        }
                        int i5 = this.alphaHandle;
                        if (i2 == 1) {
                            GLES20.glUniform1f(i5, 1.0f);
                            int i6 = this.roundRadiusHandle;
                            if (i < 0) {
                                GLES20.glUniform1f(i6, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 1.0f);
                            } else if (z2) {
                                GLES20.glUniform1f(i6, gl.L(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f - f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.shapeHandle, f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            } else {
                                GLES20.glUniform1f(i6, gl.L(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        } else {
                            GLES20.glUniform1f(i5, 1.0f);
                            int i7 = this.roundRadiusHandle;
                            if (z2) {
                                GLES20.glUniform1f(i7, gl.U1(f, gl.L(12.0f), gl.L(16.0f)));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, CameraView.this.lastShapeTo);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, Utilities.i(1.0f - f, 1.0f, 0.0f));
                                GLES20.glUniform1f(this.crossfadeHandle, f);
                            } else {
                                GLES20.glUniform1f(i7, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        }
                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i2][0]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glDisableVertexAttribArray(this.positionHandle);
                        GLES20.glDisableVertexAttribArray(this.textureHandle);
                        GLES20.glBindTexture(36197, 0);
                        GLES20.glUseProgram(0);
                    }
                }
                i++;
            }
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, this.currentTimestamp);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$drainEncoder$2(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.videoTrackIndex, byteBuffer, bufferInfo, true);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$drainEncoder$3(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, bufferInfo, false);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleStopRecording$0(CountDownLatch countDownLatch) {
            try {
                this.mediaMuxer.finishMovie();
            } catch (Exception e) {
                e.printStackTrace();
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
                int i = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) << 12 : 49152;
                for (int i2 = 0; i2 < 3; i2++) {
                    this.buffers.add(new AudioBufferInfo());
                }
                AudioRecord audioRecord = new AudioRecord(0, CameraView.audioSampleRate, 16, 2, i);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (w01.a) {
                    fa4.b("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i);
                }
                Thread thread = new Thread(this.recorderRunnable);
                thread.setPriority(10);
                thread.start();
                this.audioBufferInfo = new MediaCodec.BufferInfo();
                this.videoBufferInfo = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", AUDIO_MIME_TYPE);
                mediaFormat.setInteger("sample-rate", CameraView.audioSampleRate);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", 32000);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(AUDIO_MIME_TYPE);
                this.audioEncoder = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                boolean z = CameraView.this.recordHevc;
                this.outputMimeType = z ? VIDEO_MIME_TYPE : "video/avc";
                try {
                    if (z) {
                        String l = gba.l();
                        if (l != null) {
                            this.videoEncoder = MediaCodec.createByCodecName(l);
                        }
                    } else {
                        this.outputMimeType = "video/avc";
                        this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                    }
                    if (this.outputMimeType.equals(VIDEO_MIME_TYPE) && (mediaCodec = this.videoEncoder) != null && !mediaCodec.getCodecInfo().isHardwareAccelerated()) {
                        fa4.d("hevc encoder isn't hardware accelerated");
                        this.videoEncoder.release();
                        this.videoEncoder = null;
                    }
                } catch (Throwable th) {
                    fa4.d("can't get hevc encoder");
                    fa4.g(th, true);
                }
                if (this.videoEncoder == null && this.outputMimeType.equals(VIDEO_MIME_TYPE)) {
                    this.outputMimeType = "video/avc";
                    this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
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
                File file = this.videoFile;
                ThreadLocal threadLocal = fl5.I;
                boolean z2 = !TextUtils.isEmpty(gba.e0) && file.getAbsolutePath().startsWith(gba.e0);
                this.fileToWrite = this.videoFile;
                if (z2) {
                    try {
                        File file2 = new File(org.telegram.messenger.a.h(), "camera_tmp.mp4");
                        this.fileToWrite = file2;
                        if (file2.exists()) {
                            this.fileToWrite.delete();
                        }
                        this.writingToDifferentFile = true;
                    } catch (Throwable th2) {
                        fa4.g(th2, true);
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
                    wn4.j("EGL already set up");
                    return;
                }
                android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                this.eglDisplay = eglGetDisplay;
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    wn4.j("unable to get EGL14 display");
                    return;
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    this.eglDisplay = null;
                    wn4.j("unable to initialize EGL14");
                    return;
                }
                android.opengl.EGLContext eGLContext = this.eglContext;
                if (eGLContext == EGL14.EGL_NO_CONTEXT) {
                    android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        wn4.j("Unable to find a suitable EGLConfig");
                        return;
                    } else {
                        eGLContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                        this.eglContext = eGLContext;
                        this.eglConfig = eGLConfigArr[0];
                    }
                }
                EGL14.eglQueryContext(this.eglDisplay, eGLContext, 12440, new int[1], 0);
                if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                    sc8.j("surface already created");
                    return;
                }
                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == null) {
                    wn4.j("surface was null");
                    return;
                }
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                    if (w01.a) {
                        fa4.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                    }
                    wn4.j("eglMakeCurrent failed");
                    return;
                }
                GLES20.glBlendFunc(770, 771);
                float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                float f3 = 0.5f - f;
                float f4 = 0.5f - f2;
                float f5 = f + 0.5f;
                float f6 = f2 + 0.5f;
                float[] fArr = {f3, f4, f5, f4, f3, f6, f5, f6};
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.textureBuffer = asFloatBuffer;
                asFloatBuffer.put(fArr).position(0);
                int loadShader = CameraView.this.loadShader(35633, gl.v2(null, R.raw.camera_vert));
                int loadShader2 = CameraView.this.loadShader(35632, gl.v2(null, R.raw.camera_frag));
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
                int i3 = iArr2[0];
                int i4 = this.drawProgram;
                if (i3 == 0) {
                    GLES20.glDeleteProgram(i4);
                    this.drawProgram = 0;
                    return;
                }
                this.positionHandle = GLES20.glGetAttribLocation(i4, "aPosition");
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
            } catch (Exception e) {
                sdb.b(e);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0187, code lost:
        
            if (r17.audioTrackIndex != (-5)) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
        
            r17.audioTrackIndex = r17.mediaMuxer.addTrack(r1, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0170, code lost:
        
            if (r18 == false) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0174, code lost:
        
            if (r17.running != false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0178, code lost:
        
            if (r17.sendWhenDone != 0) goto L149;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x01de, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
        
            r1 = r17.audioEncoder.dequeueOutputBuffer(r17.audioBufferInfo, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
        
            if (r1 != (-1)) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
        
            if (r1 == (-3)) goto L143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x017d, code lost:
        
            if (r1 != (-2)) goto L137;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
        
            if (r1 < 0) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0195, code lost:
        
            r8 = r17.audioEncoder.getOutputBuffer(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x019b, code lost:
        
            if (r8 == null) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x019d, code lost:
        
            r10 = r17.audioBufferInfo;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
        
            if ((r10.flags & 2) == 0) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01a5, code lost:
        
            r10.size = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01a9, code lost:
        
            if (r10.size == 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
        
            r10 = new android.media.MediaCodec.BufferInfo();
            r11 = r17.audioBufferInfo;
            r10.size = r11.size;
            r10.offset = r11.offset;
            r10.flags = r11.flags;
            r10.presentationTimeUs = r11.presentationTimeUs;
            r8 = gl.z(r8);
            r13 = 1;
            r17.fileWriteQueue.postRunnable(new org.telegram.messenger.camera.a(r17, r8, r10, r13));
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
        
            r17.audioEncoder.releaseOutputBuffer(r1, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
        
            if ((r17.audioBufferInfo.flags & 4) == 0) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x01df, code lost:
        
            wn4.j(tb4.n(r1, "encoderOutputBuffer ", " was null"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01e6, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x017f, code lost:
        
            r1 = r17.audioEncoder.getOutputFormat();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainEncoder(boolean z) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            if (z) {
                this.videoEncoder.signalEndOfInputStream();
            }
            while (true) {
                int dequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(this.videoBufferInfo, 10000L);
                byte b = 1;
                Object[] objArr = 0;
                if (dequeueOutputBuffer == -1) {
                    if (!z) {
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
                        wn4.j(tb4.n(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                        return;
                    }
                    MediaCodec.BufferInfo bufferInfo = this.videoBufferInfo;
                    int i = bufferInfo.size;
                    if (i > 1) {
                        int i2 = bufferInfo.flags;
                        if ((i2 & 2) == 0) {
                            int i3 = this.prependHeaderSize;
                            if (i3 != 0 && (i2 & 1) != 0) {
                                bufferInfo.offset += i3;
                                bufferInfo.size = i - i3;
                            }
                            if (this.firstEncode && (i2 & 1) != 0) {
                                MediaCodecVideoConvertor.cutOfNalData(this.outputMimeType, outputBuffer, bufferInfo);
                                this.firstEncode = false;
                            }
                            final MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            MediaCodec.BufferInfo bufferInfo3 = this.videoBufferInfo;
                            bufferInfo2.size = bufferInfo3.size;
                            bufferInfo2.offset = bufferInfo3.offset;
                            bufferInfo2.flags = bufferInfo3.flags;
                            bufferInfo2.presentationTimeUs = bufferInfo3.presentationTimeUs;
                            final ByteBuffer z2 = gl.z(outputBuffer);
                            do3 do3Var = this.fileWriteQueue;
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            do3Var.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.camera.a
                                public final /* synthetic */ CameraView.VideoRecorder b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b2 = objArr2;
                                    MediaCodec.BufferInfo bufferInfo4 = bufferInfo2;
                                    ByteBuffer byteBuffer5 = z2;
                                    CameraView.VideoRecorder videoRecorder = this.b;
                                    switch (b2) {
                                        case 0:
                                            videoRecorder.lambda$drainEncoder$2(byteBuffer5, bufferInfo4);
                                            break;
                                        default:
                                            videoRecorder.lambda$drainEncoder$3(byteBuffer5, bufferInfo4);
                                            break;
                                    }
                                }
                            });
                        } else if (this.videoTrackIndex == -5) {
                            if (this.outputMimeType.equals(VIDEO_MIME_TYPE)) {
                                wn4.j("need fix parsing csd data");
                                return;
                            }
                            MediaCodec.BufferInfo bufferInfo4 = this.videoBufferInfo;
                            int i4 = bufferInfo4.size;
                            byte[] bArr = new byte[i4];
                            outputBuffer.limit(bufferInfo4.offset + i4);
                            outputBuffer.position(this.videoBufferInfo.offset);
                            outputBuffer.get(bArr);
                            int i5 = this.videoBufferInfo.size - 1;
                            while (i5 >= 0 && i5 > 3) {
                                if (bArr[i5] == b && bArr[i5 - 1] == 0 && bArr[i5 - 2] == 0) {
                                    int i6 = i5 - 3;
                                    if (bArr[i6] == 0) {
                                        byteBuffer = ByteBuffer.allocate(i6);
                                        byteBuffer2 = ByteBuffer.allocate(this.videoBufferInfo.size - i6);
                                        byteBuffer.put(bArr, 0, i6).position(0);
                                        byteBuffer2.put(bArr, i6, this.videoBufferInfo.size - i6).position(0);
                                        break;
                                    }
                                }
                                i5--;
                                b = 1;
                            }
                            byteBuffer = null;
                            byteBuffer2 = null;
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", CameraView.this.videoWidth, CameraView.this.videoHeight);
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
            do3 do3Var = this.fileWriteQueue;
            if (do3Var != null) {
                do3Var.recycle();
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

        public void frameAvailable(SurfaceTexture surfaceTexture, Integer num, long j) {
            synchronized (this.sync) {
                if (this.ready) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i = this.zeroTimeStamps + 1;
                        this.zeroTimeStamps = i;
                        if (i <= 1) {
                            return;
                        }
                        if (w01.a) {
                            fa4.b("CameraView fix timestamp enabled");
                        }
                    } else {
                        this.zeroTimeStamps = 0;
                        j = timestamp;
                    }
                    this.handler.sendMessage(this.handler.obtainMessage(2, (int) (j >> 32), (int) j, num));
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
            int i = Math.min(size.mHeight, size.mWidth) >= 720 ? 3500000 : 1800000;
            this.videoFile = file;
            if (CameraView.this.cameraSession[0].getWorldAngle() == 90 || CameraView.this.cameraSession[0].getWorldAngle() == 270) {
                CameraView.this.videoWidth = size.getWidth();
                CameraView.this.videoHeight = size.getHeight();
            } else {
                CameraView.this.videoWidth = size.getHeight();
                CameraView.this.videoHeight = size.getWidth();
            }
            this.videoBitrate = i;
            this.sharedEglContext = eGLContext;
            synchronized (this.sync) {
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
                do3 do3Var = new do3("VR_FileWriteQueue", true);
                this.fileWriteQueue = do3Var;
                do3Var.setPriority(10);
                this.keyframeThumbs.clear();
                this.handler.sendMessage(this.handler.obtainMessage(0));
            }
        }

        public void stopRecording(int i) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i, 0));
        }
    }

    public CameraView(Context context, boolean z, boolean z2) {
        super(context, null);
        this.WRITE_TO_FILE_IN_BACKGROUND = false;
        this.previewSize = new Size[2];
        this.pictureSize = new Size[2];
        this.info = new CameraInfo[2];
        this.txform = new Matrix();
        this.matrix = new Matrix();
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
        this.updateRotationMatrix = new fa1(this, (byte) 1);
        this.takePictureProgress = 1.0f;
        this.invalidateListeners = new ArrayList<>();
        this.cameraTexture = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 1);
        CameraController.getInstance().addOnErrorListener(this);
        this.isFrontface = z;
        this.initialFrontface = z;
        this.textureView = new TextureView(context);
        this.lazy = z2;
        if (!z2) {
            initTexture();
        }
        setWillNotDraw(!z2);
        ImageView imageView = new ImageView(context);
        this.blurredStubView = imageView;
        addView(imageView, nme.e(-1, -1, 17));
        this.blurredStubView.setVisibility(8);
        this.focusAreaSize = gl.L(96.0f);
        this.outerPaint.setColor(-1);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(gl.L(2.0f));
        this.innerPaint.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToDualWait(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.toggleDualUntil;
        if (j2 < currentTimeMillis) {
            this.toggleDualUntil = currentTimeMillis + j;
        } else {
            this.toggleDualUntil = j2 + j;
        }
    }

    private Rect calculateTapArea(float f, float f2, float f3) {
        int intValue = Float.valueOf(this.focusAreaSize * f3).intValue();
        int i = intValue / 2;
        RectF rectF = new RectF(clamp(((int) f) - i, 0, getWidth() - intValue), clamp(((int) f2) - i, 0, getHeight() - intValue), r4 + intValue, r5 + intValue);
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
        float f = width;
        float f2 = height;
        matrix.postScale(f / 2000.0f, f2 / 2000.0f);
        matrix.postTranslate(f / 2.0f, f2 / 2.0f);
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

    private int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createCamera(SurfaceTexture surfaceTexture, int i) {
        gl.d3(new va7((Object) this, i, (Object) surfaceTexture, (byte) 10));
    }

    private void enableDualInternal() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[1];
        byte b = 6;
        if (cameraSessionWrapper != null) {
            if (this.closingDualCamera) {
                return;
            }
            this.closingDualCamera = true;
            cameraSessionWrapper.destroy(false, null, new fa1(this, b));
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
        this.cameraSession[0].destroy(false, null, new q21(this, handler2, (byte) 13));
        this.cameraSession[0] = null;
    }

    public static boolean isCameraAllowed() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.hasVideoCapturer()) && t76.N == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$10(CameraGLThread cameraGLThread, int i) {
        cameraGLThread.setCurrentSession(this.cameraSession[i], i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$11(int i, SurfaceTexture surfaceTexture) {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            if (w01.a) {
                fa4.b("CameraView create camera session " + i);
            }
            if (this.previewSize[i] == null) {
                updateCameraInfoSize(i);
            }
            Size size = this.previewSize[i];
            if (size == null) {
                return;
            }
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.previewSize[i].getHeight());
            CameraSession cameraSession = new CameraSession(this.info[i], this.previewSize[i], this.pictureSize[i], 256, false);
            cameraSession.setCurrentFlashMode("off");
            this.cameraSession[i] = CameraSessionWrapper.of(cameraSession);
            cameraGLThread.setCurrentSession(this.cameraSession[i], i);
            requestLayout();
            CameraController.getInstance().open(cameraSession, surfaceTexture, new tn6((Object) this, i, (Object) cameraSession, (Object) cameraGLThread, (byte) 10), new va7((Object) this, (Object) cameraGLThread, i, (byte) 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$8(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCamera$9(int i, CameraSession cameraSession, CameraGLThread cameraGLThread) {
        if (this.cameraSession[i] != null) {
            if (w01.a) {
                fa4.b("CameraView camera initied " + i);
            }
            cameraSession.setInitied();
            requestLayout();
        }
        if (this.dual && i == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            gl.d3(new q21(this, cameraGLThread, (byte) 12));
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
            for (int i = 0; i < 2; i++) {
                if (cameraGLThread.currentSession[i] != null) {
                    int worldAngle = cameraGLThread.currentSession[i].getWorldAngle();
                    android.opengl.Matrix.setIdentityM(this.mMVPMatrix[i], 0);
                    if (worldAngle != 0) {
                        android.opengl.Matrix.rotateM(this.mMVPMatrix[i], 0, worldAngle, 0.0f, 0.0f, 1.0f);
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
    public int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        if (w01.a) {
            fa4.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstFrameRendered(int i) {
        if (i != 0) {
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
        if (obj == null || qm0.e(obj).hasDisplayList()) {
            return;
        }
        invalidate();
    }

    private void updateCameraInfoSize(int i) {
        int i2;
        int i3;
        Size size;
        int i4;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= cameras.size()) {
                    break;
                }
                CameraInfo cameraInfo = cameras.get(i5);
                boolean z = cameraInfo.frontCamera != 0;
                boolean z2 = this.isFrontface;
                if (i == 1) {
                    z2 = !z2;
                }
                if (z == z2) {
                    this.info[i] = cameraInfo;
                    break;
                }
                i5++;
            }
            if (this.info[i] == null) {
                return;
            }
            Point point = gl.q;
            float max = Math.max(point.x, point.y) / Math.min(point.x, point.y);
            int i6 = 720;
            if (square()) {
                size = new Size(1, 1);
                i4 = 720;
                i2 = 720;
                i3 = 720;
            } else {
                i2 = 1280;
                if (this.initialFrontface) {
                    size = new Size(16, 9);
                    i4 = 720;
                    i3 = 720;
                } else {
                    float abs = Math.abs(max - 1.3333334f);
                    int i7 = 1920;
                    i3 = 960;
                    if (abs < 0.1f) {
                        size = new Size(4, 3);
                        if (gba.o() == 0) {
                            i6 = 1280;
                            i4 = 960;
                        } else {
                            i4 = 1440;
                        }
                    } else {
                        size = new Size(16, 9);
                        if (gba.o() == 0) {
                            i4 = 960;
                            i3 = 720;
                        } else {
                            if (this.isStory) {
                                i4 = 720;
                                i7 = 1280;
                            } else {
                                i4 = 1080;
                            }
                            i3 = 720;
                        }
                    }
                    i6 = 1280;
                    i2 = i7;
                }
                i6 = 1280;
            }
            this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i6, i3, size, this.isStory);
            this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), i2, i4, size, false);
            if (w01.a) {
                fa4.b("camera preview " + this.previewSize[0]);
            }
            requestLayout();
        }
    }

    public void destroy(boolean z, Runnable runnable) {
        for (int i = 0; i < 2; i++) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.destroy(z, runnable, null);
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
        float f = this.takePictureProgress;
        if (f != 1.0f) {
            float f2 = f + 0.064f;
            this.takePictureProgress = f2;
            if (f2 > 1.0f) {
                this.takePictureProgress = 1.0f;
            } else {
                invalidate();
            }
            canvas.drawColor(bm2.o(-16777216, (int) ((1.0f - this.takePictureProgress) * 150.0f)));
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        Object obj;
        Object obj2;
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj2 = this.renderNode) != null) {
            RenderNode e = qm0.e(obj2);
            e.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = e.beginRecording();
        } else {
            canvas2 = canvas;
        }
        boolean drawChild = super.drawChild(canvas2, view, j);
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj = this.renderNode) != null) {
            RenderNode e2 = qm0.e(obj);
            e2.endRecording();
            canvas.drawRenderNode(e2);
            Object obj3 = this.blurRenderNode;
            if (obj3 != null) {
                RenderNode e3 = qm0.e(obj3);
                e3.setPosition(0, 0, getWidth(), getHeight());
                e3.beginRecording().drawRenderNode(e2);
                e3.endRecording();
            }
        }
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int L = gl.L(30.0f);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.lastDrawTime;
            if (j2 < 0 || j2 > 17) {
                j2 = 17;
            }
            this.lastDrawTime = currentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f = L;
            canvas.drawCircle(this.cx, this.cy, tb4.A(1.0f, interpolation, f, f), this.outerPaint);
            canvas.drawCircle(this.cx, this.cy, f * interpolation, this.innerPaint);
            float f2 = this.focusProgress;
            if (f2 < 1.0f) {
                float f3 = (j2 / 200.0f) + f2;
                this.focusProgress = f3;
                if (f3 > 1.0f) {
                    this.focusProgress = 1.0f;
                }
                invalidate();
                return drawChild;
            }
            float f4 = this.innerAlpha;
            if (f4 != 0.0f) {
                float f5 = f4 - (j2 / 150.0f);
                this.innerAlpha = f5;
                if (f5 < 0.0f) {
                    this.innerAlpha = 0.0f;
                }
                invalidate();
                return drawChild;
            }
            float f6 = this.outerAlpha;
            if (f6 != 0.0f) {
                float f7 = f6 - (j2 / 150.0f);
                this.outerAlpha = f7;
                if (f7 < 0.0f) {
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
        Integer num = this.shape;
        if (num == null) {
            num = Integer.valueOf(na7.c1().getInt("dualshape", 0));
            this.shape = num;
        }
        this.shape = Integer.valueOf(num.intValue() + 1);
        na7.c1().edit().putInt("dualshape", this.shape.intValue()).apply();
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(9));
        }
    }

    public void focusToPoint(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f = i2;
        float f2 = i3;
        Rect calculateTapArea = calculateTapArea(f, f2, 1.0f);
        Rect calculateTapArea2 = calculateTapArea(f, f2, 1.5f);
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.focusToRect(calculateTapArea, calculateTapArea2);
        }
        if (z) {
            this.focusProgress = 0.0f;
            this.innerAlpha = 1.0f;
            this.outerAlpha = 1.0f;
            this.cx = i4;
            this.cy = i5;
            this.lastDrawTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.blurRenderNode = renderNode;
            float L = gl.L(32.0f);
            float L2 = gl.L(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(L, L2, tileMode));
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
        Integer num = this.shape;
        if (num == null) {
            num = Integer.valueOf(na7.c1().getInt("dualshape", 0));
            this.shape = num;
        }
        return num.intValue();
    }

    @Override // android.view.View
    public Matrix getMatrix() {
        return this.txform;
    }

    public Size getPreviewSize() {
        return this.previewSize[0];
    }

    public float getTextureHeight(float f, float f2) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        if (this.previewSize[0] == null || (cameraSessionWrapper = this.cameraSession[0]) == null) {
            return f2;
        }
        if (cameraSessionWrapper.getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
            width = this.previewSize[0].getWidth();
            height = this.previewSize[0].getHeight();
        } else {
            width = this.previewSize[0].getHeight();
            height = this.previewSize[0].getWidth();
        }
        float f3 = height;
        return (int) (Math.max(f / width, f2 / f3) * f3);
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
        for (int i = 0; i < cameras.size(); i++) {
            if (cameras.get(i).frontCamera != 0) {
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
        addView(this.textureView, 0, nme.e(-1, -1, 17));
        this.textureInited = true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
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
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
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
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
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
            float f = (intrinsicWidth * min) / 2.0f;
            float f2 = (intrinsicHeight * min) / 2.0f;
            this.thumbDrawable.setBounds((int) (this.bounds.centerX() - f), (int) (this.bounds.centerY() - f2), (int) (this.bounds.centerX() + f), (int) (this.bounds.centerY() + f2));
            this.thumbDrawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkPreviewMatrix();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
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
            int i3 = (int) (width * min);
            this.textureView.getLayoutParams().width = i3;
            layoutParams.width = i3;
            ViewGroup.LayoutParams layoutParams2 = this.blurredStubView.getLayoutParams();
            int i4 = (int) (min * height);
            this.textureView.getLayoutParams().height = i4;
            layoutParams2.height = i4;
        }
        super.onMeasure(i, i2);
        checkPreviewMatrix();
        this.lastWidth = size;
        this.lastHeight = size2;
        this.pixelW = getMeasuredWidth();
        this.pixelH = getMeasuredHeight();
        this.pixelDualW = getMeasuredWidth();
        this.pixelDualH = getMeasuredHeight();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        updateCameraInfoSize(0);
        if (this.dual) {
            updateCameraInfoSize(1);
        }
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        if (this.cameraThread != null || surfaceTexture == null) {
            return;
        }
        if (w01.a) {
            fa4.b("CameraView start create thread");
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
            this.cameraThread.postRunnable(new fa1(this, (byte) 4));
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        checkPreviewMatrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object obj;
        CameraSessionWrapper cameraSessionWrapper;
        if ((this.inited || (cameraSessionWrapper = this.cameraSession[0]) == null || !cameraSessionWrapper.isInitiated()) && ((obj = this.renderNode) == null || qm0.e(obj).hasDisplayList())) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gl.d3(new fa1(this, (byte) 5));
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
        byte b = 0;
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            if (this.cameraSessionRecording == cameraSessionWrapper) {
                this.cameraSessionRecording = null;
            }
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new fa1(this, b));
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

    public void setClipBottom(int i) {
        this.clipBottom = i;
    }

    public void setClipTop(int i) {
        this.clipTop = i;
    }

    public void setDelegate(CameraViewDelegate cameraViewDelegate) {
        this.delegate = cameraViewDelegate;
    }

    public void setFpsLimit(int i) {
        this.fpsLimit = i;
    }

    public void setMirror(boolean z) {
        this.mirror = z;
    }

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
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

    public void setUseMaxPreview(boolean z) {
        this.useMaxPreview = z;
    }

    public void setZoom(float f) {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setZoom(f);
        }
    }

    public void showTexture(final boolean z, boolean z2) {
        if (this.textureView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.textureViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.textureViewAnimator = null;
        }
        TextureView textureView = this.textureView;
        if (!z2) {
            textureView.setAlpha(z ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(textureView.getAlpha(), z ? 1.0f : 0.0f);
        this.textureViewAnimator = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 23));
        this.textureViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.camera.CameraView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CameraView.this.textureView.setAlpha(z ? 1.0f : 0.0f);
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
                boolean z;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    z = false;
                } else {
                    floatValue -= 1.0f;
                    z = true;
                }
                float f = floatValue * 180.0f;
                CameraView.this.textureView.setRotationY(f);
                CameraView.this.blurredStubView.setRotationY(f);
                if (z) {
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
        this.flipAnimator.setInterpolator(s33.f);
        this.flipAnimator.start();
        invalidate();
    }

    public void startTakePictureAnimation(boolean z) {
        this.takePictureProgress = 0.0f;
        invalidate();
        if (z) {
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
                    cameraSessionWrapper.destroy(false, null, new fa1(this, (byte) 3));
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

    public void toggleDual(boolean z) {
        Handler handler;
        if (!z) {
            if (this.flipping || this.closingDualCamera) {
                return;
            }
            if ((System.currentTimeMillis() < this.toggleDualUntil || this.dual != this.dualCameraAppeared) && !this.dual) {
                return;
            }
        }
        addToDualWait(200L);
        boolean z2 = this.dual;
        this.dual = !z2;
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (z2) {
            CameraSessionWrapper cameraSessionWrapper = cameraSessionWrapperArr[1];
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
                cameraSessionWrapper2.destroy(false, null, new fa1(this, (byte) 2));
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
            CameraSessionWrapper cameraSessionWrapper3 = cameraSessionWrapperArr[0];
            if (cameraSessionWrapper3 != null) {
                cameraSessionWrapper3.setCurrentFlashMode("off");
            }
            enableDualInternal();
        }
        this.toggledDualAsSave = false;
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

    public CameraSessionWrapper getCameraSession(int i) {
        return this.cameraSession[i];
    }

    public void onDualCameraSuccess() {
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
            runnable.run();
        }
    }

    public void receivedAmplitude(double d) {
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Runnable runnable = arrayList.get(i5);
            i5++;
            runnable.run();
        }
    }

    public void focusToPoint(int i, int i2, boolean z) {
        focusToPoint(0, i, i2, i, i2, z);
    }

    public void focusToPoint(int i, int i2) {
        focusToPoint(i, i2, true);
    }

    public void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
    }

    public void toggleDual() {
        toggleDual(false);
    }

    public CameraView(Context context, boolean z) {
        this(context, z, false);
    }
}
