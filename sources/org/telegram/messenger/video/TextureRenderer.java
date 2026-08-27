package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import lh.q6;
import lh.t;
import lh.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.rl;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x5;
import yf.i0;
import zf.n0;
import zf.r0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class TextureRenderer {
    private static final String FRAGMENT_EXTERNAL_MASK_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_EXTERNAL_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);}\n";
    private static final String FRAGMENT_MASK_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String GRADIENT_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform vec4 gradientTopColor;\nuniform vec4 gradientBottomColor;\nfloat interleavedGradientNoise(vec2 n) {\n    return fract(52.9829189 * fract(.06711056 * n.x + .00583715 * n.y));\n}\nvoid main() {\n  gl_FragColor = mix(gradientTopColor, gradientBottomColor, vTextureCoord.y + (.2 * interleavedGradientNoise(gl_FragCoord.xy) - .1));\n}\n";
    public static final boolean USE_MEDIACODEC = true;
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_MASK = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_MASK_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
    private int NUM_EXTERNAL_SHADER;
    private int NUM_FILTER_SHADER;
    private int NUM_GRADIENT_SHADER;
    private Drawable backgroundDrawable;
    private String backgroundPath;
    private FloatBuffer bitmapVerticesBuffer;
    private boolean blendEnabled;
    private fa blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<VideoEditedInfo.Part> collageParts;
    private int[] collageTextures;
    private final MediaController.CropState cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<k5> emojiDrawables;
    private nz filterShaders;
    private int gradientBottomColor;
    private int gradientBottomColorHandle;
    private FloatBuffer gradientTextureBuffer;
    private int gradientTopColor;
    private int gradientTopColorHandle;
    private FloatBuffer gradientVerticesBuffer;
    private int imageHeight;
    private String imagePath;
    private int imageWidth;
    private boolean isPhoto;
    private int[] mProgram;
    private int mTextureID;
    private int[] maPositionHandle;
    private int[] maTextureHandle;
    private FloatBuffer maskTextureBuffer;
    private int[] maskTextureHandle;
    private ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    private String messagePath;
    private String messageVideoMaskPath;
    private int[] mmTextureHandle;
    private int[] muMVPMatrixHandle;
    private int[] muSTMatrixHandle;
    private int originalHeight;
    private int originalWidth;
    private String paintPath;
    private int[] paintTexture;
    Path path;
    private FloatBuffer renderTextureBuffer;
    private Bitmap roundBitmap;
    private Canvas roundCanvas;
    private Path roundClipPath;
    private int simpleInputTexCoordHandle;
    private int simpleInputTexCoordHandleOES;
    private int simplePositionHandle;
    private int simplePositionHandleOES;
    private int simpleShaderProgram;
    private int simpleShaderProgramOES;
    private int simpleSourceImageHandle;
    private int simpleSourceImageHandleOES;
    private Bitmap stickerBitmap;
    private Canvas stickerCanvas;
    private int[] stickerTexture;
    private int texSizeHandle;
    Paint textColorPaint;
    private FloatBuffer textureBuffer;
    private int transformedHeight;
    private int transformedWidth;
    private boolean useMatrixForImagePath;
    private FloatBuffer verticesBuffer;
    private float videoFps;
    private int videoMaskTexture;
    Paint xRefPaint;
    float[] bitmapData = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    private float[] mMVPMatrix = new float[16];
    private float[] mSTMatrix = new float[16];
    private float[] mSTMatrixIdentity = new float[16];
    private int imagePathIndex = -1;
    private int paintPathIndex = -1;
    private int messagePathIndex = -1;
    private int backgroundPathIndex = -1;
    private final Rect roundSrc = new Rect();
    private final RectF roundDst = new RectF();
    private boolean firstFrame = true;

    /* JADX WARN: Removed duplicated region for block: B:18:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextureRenderer(MediaController.SavedFilterState savedFilterState, String str, String str2, String str3, ArrayList<VideoEditedInfo.MediaEntity> arrayList, MediaController.CropState cropState, int i10, int i11, int i12, int i13, int i14, float f10, boolean z10, Integer num, Integer num2, y7 y7Var, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        char c10;
        char c11;
        int i15;
        float f11;
        float f12;
        int i16;
        char c12;
        char c13;
        int i17;
        int i18;
        float[] fArr;
        int i19;
        int i20 = i10;
        int i21 = i11;
        float f13 = f10;
        this.NUM_FILTER_SHADER = -1;
        this.NUM_EXTERNAL_SHADER = -1;
        this.NUM_GRADIENT_SHADER = -1;
        this.isPhoto = z10;
        this.collageParts = convertVideoParams.collageParts;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder p6 = com.google.android.recaptcha.internal.a.p("start textureRenderer w = ", i20, " h = ", i21, " r = ");
            p6.append(i14);
            p6.append(" fps = ");
            p6.append(f13);
            FileLog.d(p6.toString());
            if (cropState != null) {
                FileLog.d("cropState px = " + cropState.cropPx + " py = " + cropState.cropPy + " cScale = " + cropState.cropScale + " cropRotate = " + cropState.cropRotate + " pw = " + cropState.cropPw + " ph = " + cropState.cropPh + " tw = " + cropState.transformWidth + " th = " + cropState.transformHeight + " tr = " + cropState.transformRotation + " mirror = " + cropState.mirrored);
            }
        }
        FloatBuffer f14 = rl.f(ByteBuffer.allocateDirect(32));
        this.textureBuffer = f14;
        f14.put(fArr2).position(0);
        FloatBuffer f15 = rl.f(ByteBuffer.allocateDirect(this.bitmapData.length * 4));
        this.bitmapVerticesBuffer = f15;
        f15.put(this.bitmapData).position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        Matrix.setIdentityM(this.mSTMatrixIdentity, 0);
        if (savedFilterState != null) {
            nz nzVar = new nz(true, y7Var);
            this.filterShaders = nzVar;
            nzVar.f1 = new kz(savedFilterState);
        }
        this.transformedWidth = i20;
        this.transformedHeight = i21;
        this.originalWidth = i12;
        this.originalHeight = i13;
        this.imagePath = str;
        this.paintPath = str2;
        this.messagePath = convertVideoParams.messagePath;
        this.messageVideoMaskPath = convertVideoParams.messageVideoMaskPath;
        this.backgroundPath = convertVideoParams.backgroundPath;
        this.blurPath = str3;
        this.mediaEntities = arrayList;
        this.videoFps = f13 == 0.0f ? 30.0f : f13;
        this.cropState = cropState;
        this.NUM_EXTERNAL_SHADER = 0;
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        long j10 = convertVideoParams.wallpaperPeerId;
        if (j10 != Long.MIN_VALUE) {
            c10 = 6;
            c11 = 7;
            this.backgroundDrawable = q6.e(null, convertVideoParams.account, j10, convertVideoParams.isDark);
        } else {
            c10 = 6;
            c11 = 7;
            if (num2 != null && num != null) {
                FloatBuffer f16 = rl.f(ByteBuffer.allocateDirect(32));
                this.gradientVerticesBuffer = f16;
                f16.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                boolean z11 = this.isPhoto;
                float[] fArr3 = {0.0f, z11 ? 1.0f : 0.0f, 1.0f, z11 ? 1.0f : 0.0f, 0.0f, z11 ? 0.0f : 1.0f, 1.0f, z11 ? 0.0f : 1.0f};
                FloatBuffer f17 = rl.f(ByteBuffer.allocateDirect(32));
                this.gradientTextureBuffer = f17;
                f17.put(fArr3).position(0);
                this.gradientTopColor = num.intValue();
                this.gradientBottomColor = num2.intValue();
                this.NUM_GRADIENT_SHADER = 1;
                i15 = 2;
                if (this.filterShaders != null) {
                    this.NUM_FILTER_SHADER = i15;
                    i15++;
                }
                this.mProgram = new int[i15];
                this.muMVPMatrixHandle = new int[i15];
                this.muSTMatrixHandle = new int[i15];
                this.maPositionHandle = new int[i15];
                this.maTextureHandle = new int[i15];
                this.mmTextureHandle = new int[i15];
                this.maskTextureHandle = new int[i15];
                if (cropState == null) {
                    android.graphics.Matrix matrix = cropState.useMatrix;
                    f11 = 0.5f;
                    if (matrix == null) {
                        i16 = 32;
                        c13 = 1;
                        float[] fArr4 = new float[8];
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        float f18 = i20;
                        fArr4[2] = f18;
                        fArr4[3] = 0.0f;
                        fArr4[4] = 0.0f;
                        float f19 = i21;
                        fArr4[5] = f19;
                        fArr4[c10] = f18;
                        fArr4[c11] = f19;
                        i17 = cropState.transformRotation;
                        this.transformedWidth = (int) (this.transformedWidth * cropState.cropPw);
                        this.transformedHeight = (int) (this.transformedHeight * cropState.cropPh);
                        float f20 = (float) ((-cropState.cropRotate) * 0.017453292519943295d);
                        int i22 = 0;
                        while (i22 < 4) {
                            int i23 = i22 * 2;
                            float f21 = fArr4[i23] - (i20 / 2);
                            int i24 = i23 + 1;
                            float f22 = fArr4[i24] - (i21 / 2);
                            double d = f21;
                            double d10 = f20;
                            double cos = Math.cos(d10) * d;
                            double d11 = f22;
                            float sin = ((float) ((cos - (Math.sin(d10) * d11)) + (cropState.cropPx * f18))) * cropState.cropScale;
                            float b10 = ((float) (i0.a.b(d10, d11, Math.sin(d10) * d) - (cropState.cropPy * f19))) * cropState.cropScale;
                            fArr4[i23] = (sin / this.transformedWidth) * 2.0f;
                            fArr4[i24] = (b10 / this.transformedHeight) * 2.0f;
                            i22++;
                            i20 = i10;
                            i21 = i11;
                        }
                        f12 = 1.0f;
                        FloatBuffer f23 = rl.f(ByteBuffer.allocateDirect(32));
                        this.verticesBuffer = f23;
                        c12 = 0;
                        f23.put(fArr4).position(0);
                        if (this.filterShaders == null) {
                            i18 = 4;
                            if (i17 == 90) {
                                fArr = new float[8];
                                fArr[c12] = f12;
                                fArr[c13] = 0.0f;
                                fArr[2] = f12;
                                fArr[3] = f12;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c10] = 0.0f;
                                fArr[c11] = f12;
                            } else if (i17 == 180) {
                                fArr = new float[8];
                                fArr[c12] = f12;
                                fArr[c13] = f12;
                                fArr[2] = 0.0f;
                                fArr[3] = f12;
                                fArr[4] = f12;
                                fArr[5] = 0.0f;
                                fArr[c10] = 0.0f;
                                fArr[c11] = 0.0f;
                            } else if (i17 == 270) {
                                fArr = new float[8];
                                fArr[c12] = 0.0f;
                                fArr[c13] = f12;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f12;
                                fArr[5] = f12;
                                fArr[c10] = f12;
                                fArr[c11] = 0.0f;
                            } else {
                                fArr = new float[8];
                                fArr[c12] = 0.0f;
                                fArr[c13] = 0.0f;
                                fArr[2] = f12;
                                fArr[3] = 0.0f;
                                fArr[4] = 0.0f;
                                fArr[5] = f12;
                                fArr[c10] = f12;
                                fArr[c11] = f12;
                            }
                        } else if (i17 == 90) {
                            fArr = new float[8];
                            fArr[c12] = f12;
                            fArr[c13] = f12;
                            fArr[2] = f12;
                            fArr[3] = 0.0f;
                            i18 = 4;
                            fArr[4] = 0.0f;
                            fArr[5] = f12;
                            fArr[c10] = 0.0f;
                            fArr[c11] = 0.0f;
                        } else {
                            i18 = 4;
                            if (i17 == 180) {
                                fArr = new float[8];
                                fArr[c12] = f12;
                                fArr[c13] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f12;
                                fArr[5] = f12;
                                fArr[c10] = 0.0f;
                                fArr[c11] = f12;
                            } else if (i17 == 270) {
                                fArr = new float[8];
                                fArr[c12] = 0.0f;
                                fArr[c13] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = f12;
                                fArr[4] = f12;
                                fArr[5] = 0.0f;
                                fArr[c10] = f12;
                                fArr[c11] = f12;
                            } else {
                                fArr = new float[8];
                                fArr[c12] = 0.0f;
                                fArr[c13] = f12;
                                fArr[2] = f12;
                                fArr[3] = f12;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c10] = f12;
                                fArr[c11] = 0.0f;
                            }
                        }
                        if (cropState != null && cropState.mirrored) {
                            i19 = 0;
                            while (i19 < i18) {
                                int i25 = i19 * 2;
                                if (fArr[i25] > f11) {
                                    fArr[i25] = 0.0f;
                                } else {
                                    fArr[i25] = f12;
                                }
                                i19++;
                                i18 = 4;
                            }
                        }
                        FloatBuffer f24 = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
                        this.renderTextureBuffer = f24;
                        f24.put(fArr).position(0);
                        FloatBuffer f25 = rl.f(ByteBuffer.allocateDirect(i16));
                        this.maskTextureBuffer = f25;
                        f25.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
                    }
                    this.useMatrixForImagePath = true;
                    i16 = 32;
                    float f26 = cropState.cropPw;
                    float f27 = cropState.cropPh;
                    if ((cropState.orientation / 90) % 2 == 1) {
                        f27 = f26;
                        f26 = f27;
                    }
                    float f28 = (1.0f - f26) / 2.0f;
                    float f29 = (1.0f - f27) / 2.0f;
                    c13 = 1;
                    float[] fArr5 = new float[8];
                    float f30 = i12;
                    float f31 = f30 * f28;
                    fArr5[0] = f31;
                    float f32 = i13;
                    float f33 = f32 * f29;
                    fArr5[1] = f33;
                    float f34 = (f28 + f26) * f30;
                    fArr5[2] = f34;
                    fArr5[3] = f33;
                    fArr5[4] = f31;
                    float f35 = (f29 + f27) * f32;
                    fArr5[5] = f35;
                    fArr5[c10] = f34;
                    fArr5[c11] = f35;
                    matrix.mapPoints(fArr5);
                    for (int i26 = 0; i26 < 4; i26++) {
                        int i27 = i26 * 2;
                        fArr5[i27] = ((fArr5[i27] / i20) * 2.0f) - 1.0f;
                        int i28 = i27 + 1;
                        fArr5[i28] = rl.c(fArr5[i28], i21, 2.0f, 1.0f);
                    }
                    FloatBuffer f36 = rl.f(ByteBuffer.allocateDirect(32));
                    this.verticesBuffer = f36;
                    f36.put(fArr5).position(0);
                    float[] fArr6 = new float[8];
                    float f37 = f26 * f30;
                    float f38 = f37 * (-0.5f);
                    fArr6[0] = f38;
                    float f39 = f27 * f32;
                    float f40 = (-0.5f) * f39;
                    fArr6[1] = f40;
                    float f41 = f37 * 0.5f;
                    fArr6[2] = f41;
                    fArr6[3] = f40;
                    fArr6[4] = f38;
                    float f42 = f39 * 0.5f;
                    fArr6[5] = f42;
                    fArr6[c10] = f41;
                    fArr6[c11] = f42;
                    float f43 = (float) ((-cropState.cropRotate) * 0.017453292519943295d);
                    int i29 = 0;
                    for (int i30 = 4; i29 < i30; i30 = 4) {
                        int i31 = i29 * 2;
                        float f44 = fArr6[i31];
                        int i32 = i31 + 1;
                        float f45 = fArr6[i32];
                        double d12 = f44 - (cropState.cropPx * f30);
                        double d13 = f43;
                        double d14 = f45 - (cropState.cropPy * f32);
                        float cos2 = ((float) ((Math.cos(d13) * d12) - (Math.sin(d13) * d14))) / f30;
                        float b11 = ((float) i0.a.b(d13, d14, Math.sin(d13) * d12)) / f32;
                        float f46 = cropState.cropScale;
                        fArr6[i31] = (cos2 / f46) + 0.5f;
                        fArr6[i32] = (b11 / f46) + 0.5f;
                        i29++;
                    }
                    if (this.filterShaders == null && !this.isPhoto && this.messageVideoMaskPath == null) {
                        fArr6[1] = 1.0f - fArr6[1];
                        fArr6[3] = 1.0f - fArr6[3];
                        fArr6[5] = 1.0f - fArr6[5];
                        fArr6[c11] = 1.0f - fArr6[c11];
                    }
                    FloatBuffer f47 = rl.f(ByteBuffer.allocateDirect(32));
                    this.croppedTextureBuffer = f47;
                    c12 = 0;
                    f47.put(fArr6).position(0);
                    f12 = 1.0f;
                } else {
                    f11 = 0.5f;
                    f12 = 1.0f;
                    i16 = 32;
                    c12 = 0;
                    c13 = 1;
                    FloatBuffer f48 = rl.f(ByteBuffer.allocateDirect(32));
                    this.verticesBuffer = f48;
                    f48.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                }
                i17 = 0;
                if (this.filterShaders == null) {
                }
                if (cropState != null) {
                    i19 = 0;
                    while (i19 < i18) {
                    }
                }
                FloatBuffer f242 = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
                this.renderTextureBuffer = f242;
                f242.put(fArr).position(0);
                FloatBuffer f252 = rl.f(ByteBuffer.allocateDirect(i16));
                this.maskTextureBuffer = f252;
                f252.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            }
        }
        i15 = 1;
        if (this.filterShaders != null) {
        }
        this.mProgram = new int[i15];
        this.muMVPMatrixHandle = new int[i15];
        this.muSTMatrixHandle = new int[i15];
        this.maPositionHandle = new int[i15];
        this.maTextureHandle = new int[i15];
        this.mmTextureHandle = new int[i15];
        this.maskTextureHandle = new int[i15];
        if (cropState == null) {
        }
        i17 = 0;
        if (this.filterShaders == null) {
        }
        if (cropState != null) {
        }
        FloatBuffer f2422 = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
        this.renderTextureBuffer = f2422;
        f2422.put(fArr).position(0);
        FloatBuffer f2522 = rl.f(ByteBuffer.allocateDirect(i16));
        this.maskTextureBuffer = f2522;
        f2522.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
    }

    private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i10) {
        if (bitmap == null || mediaEntity == null) {
            return;
        }
        if (mediaEntity.roundRadius == 0.0f && i10 == 0) {
            return;
        }
        if (mediaEntity.roundRadiusCanvas == null) {
            mediaEntity.roundRadiusCanvas = new Canvas(bitmap);
        }
        if (mediaEntity.roundRadius != 0.0f) {
            if (this.path == null) {
                this.path = new Path();
            }
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
            this.path.toggleInverseFillType();
            mediaEntity.roundRadiusCanvas.drawPath(this.path, this.xRefPaint);
        }
        if (i10 != 0) {
            if (this.textColorPaint == null) {
                Paint paint2 = new Paint(1);
                this.textColorPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            this.textColorPaint.setColor(i10);
            mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
        }
    }

    private int createProgram(String str, String str2, boolean z10) {
        int h;
        int glCreateProgram;
        int h10;
        int glCreateProgram2;
        if (z10) {
            int h11 = nz.h(35633, str);
            if (h11 == 0 || (h10 = nz.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h11);
            GLES20.glAttachShader(glCreateProgram2, h10);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram2;
            }
            GLES20.glDeleteProgram(glCreateProgram2);
            return 0;
        }
        int h12 = nz.h(35633, str);
        if (h12 == 0 || (h = nz.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, h12);
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] == 1) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    private void destroyCollagePart(int i10, VideoEditedInfo.Part part) {
        if (part == null) {
            return;
        }
        x5 x5Var = part.animatedFileDrawable;
        if (x5Var != null) {
            x5Var.u();
            part.animatedFileDrawable = null;
        }
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.release();
            part.player = null;
        }
        SurfaceTexture surfaceTexture = part.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            part.surfaceTexture = null;
        }
    }

    private void drawBackground() {
        int i10 = this.NUM_GRADIENT_SHADER;
        if (i10 < 0) {
            if (this.backgroundPathIndex >= 0) {
                GLES20.glUseProgram(this.simpleShaderProgram);
                GLES20.glActiveTexture(33984);
                GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
                GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
                drawTexture(true, this.paintTexture[this.backgroundPathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
                return;
            }
            return;
        }
        GLES20.glUseProgram(this.mProgram[i10]);
        GLES20.glVertexAttribPointer(this.maPositionHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientVerticesBuffer);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle[this.NUM_GRADIENT_SHADER]);
        GLES20.glVertexAttribPointer(this.maTextureHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle[this.NUM_GRADIENT_SHADER]);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mSTMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mMVPMatrix, 0);
        GLES20.glUniform4f(this.gradientTopColorHandle, Color.red(this.gradientTopColor) / 255.0f, Color.green(this.gradientTopColor) / 255.0f, Color.blue(this.gradientTopColor) / 255.0f, Color.alpha(this.gradientTopColor) / 255.0f);
        GLES20.glUniform4f(this.gradientBottomColorHandle, Color.red(this.gradientBottomColor) / 255.0f, Color.green(this.gradientBottomColor) / 255.0f, Color.blue(this.gradientBottomColor) / 255.0f, Color.alpha(this.gradientBottomColor) / 255.0f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawCollagePart(int i10, VideoEditedInfo.Part part, long j10) {
        if (part.player == null || !part.isVideo) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) part.posBuffer);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) part.posBuffer);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(VideoEditedInfo.MediaEntity mediaEntity, int i10, long j10) {
        VideoEditedInfo.MediaEntity mediaEntity2;
        Bitmap bitmap;
        long j11;
        long j12;
        RLottieNative rLottieNative = mediaEntity.lottieNative;
        if (rLottieNative != null) {
            Bitmap bitmap2 = mediaEntity.bitmap;
            if (bitmap2 == null || mediaEntity.W <= 0 || mediaEntity.H <= 0) {
                return;
            }
            rLottieNative.c((int) mediaEntity.currentFrame, bitmap2, true);
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, (mediaEntity.subType & 8) != 0 ? i10 : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            float f10 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f10;
            if (f10 >= mediaEntity.lottieNative.a[0]) {
                mediaEntity.currentFrame = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (2 & mediaEntity.subType) != 0);
            return;
        }
        if (mediaEntity.animatedFileDrawable == null) {
            if (mediaEntity.bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
                int i11 = this.stickerTexture[0];
                float f11 = mediaEntity.x;
                float f12 = mediaEntity.additionalWidth;
                float f13 = f11 - (f12 / 2.0f);
                float f14 = mediaEntity.y;
                float f15 = mediaEntity.additionalHeight;
                drawTexture(false, i11, f13, f14 - (f15 / 2.0f), mediaEntity.width + f12, f15 + mediaEntity.height, mediaEntity.rotation, mediaEntity.type == 2 && (mediaEntity.subType & 2) != 0);
            }
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i12 = 0; i12 < mediaEntity.entities.size(); i12++) {
                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i12);
                if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                    drawEntity(mediaEntity2, mediaEntity.color, j10);
                }
            }
            return;
        }
        float f16 = mediaEntity.currentFrame;
        int i13 = (int) f16;
        float f17 = 1.0f;
        if (mediaEntity.type == 5) {
            if (this.isPhoto) {
                j11 = mediaEntity.roundDuration;
                j12 = 0;
            } else {
                long j13 = mediaEntity.roundOffset;
                j11 = (mediaEntity.roundRight - mediaEntity.roundLeft) + j13;
                j12 = j13;
            }
            long j14 = j10 / 1000000;
            if (j14 < j12) {
                f17 = er.h.getInterpolation(Utilities.clamp(1.0f - ((j12 - j14) / 400.0f), 1.0f, 0.0f));
            } else if (j14 > j11) {
                f17 = er.h.getInterpolation(Utilities.clamp(1.0f - ((j14 - j11) / 400.0f), 1.0f, 0.0f));
            }
            if (f17 > 0.0f) {
                long clamp = this.isPhoto ? Utilities.clamp(j14, mediaEntity.roundDuration, 0L) : Utilities.clamp((j14 - mediaEntity.roundOffset) + mediaEntity.roundLeft, mediaEntity.roundDuration, 0L);
                while (!mediaEntity.looped) {
                    int[] iArr = mediaEntity.animatedFileDrawable.d;
                    if (iArr[3] >= Math.min(clamp, iArr[4])) {
                        break;
                    }
                    x5 x5Var = mediaEntity.animatedFileDrawable;
                    int i14 = x5Var.d[3];
                    x5Var.r(false);
                    int i15 = mediaEntity.animatedFileDrawable.d[3];
                    if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                        mediaEntity.looped = true;
                        break;
                    }
                }
            }
        } else {
            float f18 = f16 + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f18;
            for (int i16 = (int) f18; i13 != i16; i16--) {
                mediaEntity.animatedFileDrawable.r(true);
            }
        }
        u5 u5Var = mediaEntity.animatedFileDrawable.v;
        Bitmap bitmap3 = u5Var != null ? u5Var.b : null;
        if (bitmap3 != null) {
            if (mediaEntity.type == 5) {
                if (this.roundBitmap == null) {
                    int min = Math.min(bitmap3.getWidth(), bitmap3.getHeight());
                    this.roundBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    this.roundCanvas = new Canvas(this.roundBitmap);
                }
                Bitmap bitmap4 = this.roundBitmap;
                if (bitmap4 != null) {
                    bitmap4.eraseColor(0);
                    this.roundCanvas.save();
                    if (this.roundClipPath == null) {
                        this.roundClipPath = new Path();
                    }
                    this.roundClipPath.rewind();
                    this.roundClipPath.addCircle(this.roundBitmap.getWidth() / 2.0f, this.roundBitmap.getHeight() / 2.0f, (this.roundBitmap.getWidth() / 2.0f) * f17, Path.Direction.CW);
                    this.roundCanvas.clipPath(this.roundClipPath);
                    if (bitmap3.getWidth() >= bitmap3.getHeight()) {
                        this.roundSrc.set((bitmap3.getWidth() - bitmap3.getHeight()) / 2, 0, bitmap3.getWidth() - ((bitmap3.getWidth() - bitmap3.getHeight()) / 2), bitmap3.getHeight());
                    } else {
                        this.roundSrc.set(0, (bitmap3.getHeight() - bitmap3.getWidth()) / 2, bitmap3.getWidth(), bitmap3.getHeight() - ((bitmap3.getHeight() - bitmap3.getWidth()) / 2));
                    }
                    this.roundDst.set(0.0f, 0.0f, this.roundBitmap.getWidth(), this.roundBitmap.getHeight());
                    this.roundCanvas.drawBitmap(bitmap3, this.roundSrc, this.roundDst, (Paint) null);
                    this.roundCanvas.restore();
                }
                bitmap = this.roundBitmap;
            } else {
                if (this.stickerCanvas == null && this.stickerBitmap != null) {
                    this.stickerCanvas = new Canvas(this.stickerBitmap);
                    if (this.stickerBitmap.getHeight() != bitmap3.getHeight() || this.stickerBitmap.getWidth() != bitmap3.getWidth()) {
                        this.stickerCanvas.scale(this.stickerBitmap.getWidth() / bitmap3.getWidth(), this.stickerBitmap.getHeight() / bitmap3.getHeight());
                    }
                }
                Bitmap bitmap5 = this.stickerBitmap;
                if (bitmap5 != null) {
                    bitmap5.eraseColor(0);
                    this.stickerCanvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                    applyRoundRadius(mediaEntity, this.stickerBitmap, (mediaEntity.subType & 8) != 0 ? i10 : 0);
                }
                bitmap = this.stickerBitmap;
            }
            if (bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
            }
        }
    }

    private void drawTexture(boolean z10, int i10) {
        drawTexture(z10, i10, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer f10 = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
        f10.put(fArr).position(0);
        return f10;
    }

    private void initCollagePart(int i10, VideoEditedInfo.Part part) {
        AtomicInteger atomicInteger = new AtomicInteger(part.width);
        AtomicInteger atomicInteger2 = new AtomicInteger(part.height);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (part.isVideo) {
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i10]);
            part.surfaceTexture = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(part.width, part.height);
            try {
                part.player = new MediaCodecPlayer(part.path, new Surface(part.surfaceTexture));
            } catch (Exception e9) {
                FileLog.e(e9);
                part.player = null;
            }
            MediaCodecPlayer mediaCodecPlayer = part.player;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(part.player.getOrientedHeight());
                atomicInteger3.set(part.player.getOrientation());
            } else {
                part.surfaceTexture.release();
                part.surfaceTexture = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i10);
                GLES20.glGenTextures(1, this.collageTextures, i10);
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                x5 x5Var = new x5(new File(part.path), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                part.animatedFileDrawable = x5Var;
                if (x5Var.x && x5Var.a0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                float f10 = x5Var.d[5];
                part.framesPerDraw = f10 / this.videoFps;
                part.msPerFrame = 1000.0f / f10;
                part.currentFrame = 1.0f;
                Bitmap r10 = x5Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(part.animatedFileDrawable.getIntrinsicWidth());
                atomicInteger2.set(part.animatedFileDrawable.getIntrinsicHeight());
                atomicInteger3.set(part.animatedFileDrawable.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(part.path, options);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(part.path);
            if (((Integer) imageOrientation.first).intValue() != 0 || ((Integer) imageOrientation.second).intValue() != 0) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                if (((Integer) imageOrientation.second).intValue() != 0) {
                    matrix.postScale(((Integer) imageOrientation.second).intValue() == 1 ? -1.0f : 1.0f, ((Integer) imageOrientation.second).intValue() != 2 ? 1.0f : -1.0f);
                }
                if (((Integer) imageOrientation.first).intValue() != 0) {
                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                }
                decodeFile = Bitmaps.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            Bitmap bitmap = decodeFile;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            atomicInteger.set(bitmap.getWidth());
            atomicInteger2.set(bitmap.getHeight());
        }
        float a2 = part.part.a(2.0f) - 1.0f;
        float f11 = -(((2.0f / r7.a.c) * r7.c) - 1.0f);
        float b10 = part.part.b(2.0f) - 1.0f;
        float f12 = -(((2.0f / r9.a.c) * r9.c) - 1.0f);
        float a3 = part.part.a(2.0f) - 1.0f;
        float f13 = -(((2.0f / r11.a.c) * (r11.c + 1)) - 1.0f);
        float b11 = part.part.b(2.0f) - 1.0f;
        t tVar = part.part;
        int i11 = tVar.a.c;
        int i12 = tVar.c;
        float[] fArr = {a2, f11, b10, f12, a3, f13, b11, -(((2.0f / i11) * (i12 + 1)) - 1.0f)};
        float f14 = this.transformedWidth / r15.d[i12];
        float f15 = this.transformedHeight / i11;
        int i13 = atomicInteger.get();
        int i14 = atomicInteger2.get();
        int i15 = atomicInteger3.get();
        float f16 = i13;
        float f17 = i14;
        float max = 1.0f / Math.max(f14 / f16, f15 / f17);
        float f18 = ((f14 * max) / f16) / 2.0f;
        float f19 = ((f15 * max) / f17) / 2.0f;
        if ((i15 / 90) % 2 == 1) {
            f19 = f18;
            f18 = f19;
        }
        float f20 = 0.5f - f18;
        float f21 = 0.5f - f19;
        float f22 = f18 + 0.5f;
        float f23 = f19 + 0.5f;
        float[] fArr2 = {f20, f21, f22, f21, f20, f23, f22, f23};
        while (i15 > 0) {
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f24;
            fArr2[3] = f25;
            i15 -= 90;
        }
        while (i15 < 0) {
            float f26 = fArr2[0];
            float f27 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f26;
            fArr2[5] = f27;
            i15 += 90;
        }
        part.posBuffer = floats(fArr);
        part.uvBuffer = floats(fArr2);
    }

    private void initLinkEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        n0 n0Var = new n0(ApplicationLoader.applicationContext, mediaEntity.density);
        n0Var.Q = true;
        n0Var.b(UserConfig.selectedAccount, mediaEntity.linkSettings, false);
        if (n0Var.e()) {
            n0Var.setPreviewType(mediaEntity.subType);
        } else {
            n0Var.c(mediaEntity.subType, mediaEntity.color);
        }
        int i10 = mediaEntity.viewWidth;
        int i11 = n0Var.f;
        n0Var.setMaxWidth(i10 + i11 + i11);
        n0Var.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, TLObject.FLAG_30));
        n0Var.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f10 = mediaEntity.width * this.transformedWidth;
        int i12 = mediaEntity.viewWidth;
        float f11 = f10 / i12;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (i12 * f11)) + 16, ((int) (mediaEntity.viewHeight * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        n0Var.draw(canvas);
        float f13 = 16 * f11;
        mediaEntity.additionalWidth = f13 / this.transformedWidth;
        mediaEntity.additionalHeight = f13 / this.transformedHeight;
    }

    private void initLocationEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        float f10;
        byte b10 = mediaEntity.type;
        r0 r0Var = new r0(ApplicationLoader.applicationContext, mediaEntity.density);
        r0Var.setIsVideo(true);
        r0Var.setText(mediaEntity.text);
        r0Var.e(mediaEntity.subType, mediaEntity.color);
        if (mediaEntity.weather != null && mediaEntity.entities.isEmpty()) {
            r0Var.d(UserConfig.selectedAccount, mediaEntity.weather.c);
        }
        r0Var.setMaxWidth(mediaEntity.viewWidth);
        if (mediaEntity.entities.size() == 1) {
            r0Var.x = true;
            r0Var.c = true;
            r0Var.requestLayout();
        }
        r0Var.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, TLObject.FLAG_30));
        r0Var.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f11 = mediaEntity.width * this.transformedWidth;
        float f12 = mediaEntity.viewWidth;
        float f13 = f11 / f12;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (f12 * f13)) + 16, ((int) (mediaEntity.viewHeight * f13)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f14 = 8;
        canvas.translate(f14, f14);
        canvas.scale(f13, f13);
        r0Var.draw(canvas);
        float f15 = 16 * f13;
        mediaEntity.additionalWidth = f15 / this.transformedWidth;
        mediaEntity.additionalHeight = f15 / this.transformedHeight;
        if (mediaEntity.entities.size() == 1) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(0);
            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
            emojiEntity.entity = mediaEntity2;
            mediaEntity2.text = emojiEntity.documentAbsolutePath;
            mediaEntity2.subType = emojiEntity.subType;
            RectF rectF = new RectF();
            float f16 = r0Var.E;
            float f17 = r0Var.d.left + 2.25f;
            float f18 = r0Var.y;
            float f19 = r0Var.F;
            float f20 = r0Var.J;
            float f21 = f18 * 21.33f;
            rectF.set((f17 * f18) + f16, com.google.android.recaptcha.internal.a.A(f20, f21, 2.0f, f19), ((f17 + 21.33f) * f18) + f16, i0.a.c(f21, f20, 2.0f, f19));
            float centerX = ((rectF.centerX() / mediaEntity.viewWidth) * mediaEntity.width) + mediaEntity.x;
            float f22 = mediaEntity.y;
            float centerY = rectF.centerY() / mediaEntity.viewHeight;
            float f23 = mediaEntity.height;
            float f24 = (centerY * f23) + f22;
            if (mediaEntity.rotation != 0.0f) {
                float f25 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                float f26 = (f23 / 2.0f) + mediaEntity.y;
                float f27 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f25;
                double d10 = (f24 - f26) / f27;
                f10 = 2.0f;
                float cos = ((float) ((Math.cos(-r2) * d) - (Math.sin(-mediaEntity.rotation) * d10))) + f25;
                f24 = (((float) i0.a.b(-mediaEntity.rotation, d10, Math.sin(-mediaEntity.rotation) * d)) * f27) + f26;
                centerX = cos;
            } else {
                f10 = 2.0f;
            }
            emojiEntity.entity.width = (rectF.width() / mediaEntity.viewWidth) * mediaEntity.width;
            emojiEntity.entity.height = (rectF.height() / mediaEntity.viewHeight) * mediaEntity.height;
            VideoEditedInfo.MediaEntity mediaEntity3 = emojiEntity.entity;
            float f28 = mediaEntity3.width * 1.2f;
            mediaEntity3.width = f28;
            float f29 = mediaEntity3.height * 1.2f;
            mediaEntity3.height = f29;
            mediaEntity3.x = centerX - (f28 / f10);
            mediaEntity3.y = f24 - (f29 / f10);
            mediaEntity3.rotation = mediaEntity.rotation;
            initStickerEntity(mediaEntity3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        MediaController.CropState cropState;
        int i10;
        int i11 = (int) (mediaEntity.width * this.transformedWidth);
        mediaEntity.W = i11;
        int i12 = (int) (mediaEntity.height * this.transformedHeight);
        mediaEntity.H = i12;
        if (i11 > 512) {
            mediaEntity.H = (int) ((i12 / i11) * 512.0f);
            mediaEntity.W = 512;
        }
        int i13 = mediaEntity.H;
        if (i13 > 512) {
            mediaEntity.W = (int) ((mediaEntity.W / i13) * 512.0f);
            mediaEntity.H = 512;
        }
        byte b10 = mediaEntity.subType;
        if ((b10 & 1) != 0) {
            int i14 = mediaEntity.W;
            if (i14 <= 0 || (i10 = mediaEntity.H) <= 0) {
                return;
            }
            mediaEntity.bitmap = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
            RLottieNative a2 = RLottieNative.a(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
            mediaEntity.lottieNative = a2;
            mediaEntity.framesPerDraw = a2 != null ? a2.a[1] / this.videoFps : 0.0f;
            return;
        }
        if ((b10 & 4) != 0) {
            mediaEntity.looped = false;
            x5 x5Var = new x5(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
            mediaEntity.animatedFileDrawable = x5Var;
            mediaEntity.framesPerDraw = x5Var.d[5] / this.videoFps;
            mediaEntity.currentFrame = 1.0f;
            x5Var.r(true);
            if (mediaEntity.type == 5) {
                mediaEntity.firstSeek = true;
                return;
            }
            return;
        }
        String str = mediaEntity.text;
        if (!TextUtils.isEmpty(mediaEntity.segmentedPath) && (mediaEntity.subType & 16) != 0) {
            str = mediaEntity.segmentedPath;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (mediaEntity.type == 2) {
            options.inMutable = true;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        mediaEntity.bitmap = decodeFile;
        if (decodeFile != null && (cropState = mediaEntity.crop) != null) {
            Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, cropState.cropPw * decodeFile.getWidth()), (int) Math.max(1.0f, mediaEntity.crop.cropPh * mediaEntity.bitmap.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(-mediaEntity.crop.orientation);
            int width = mediaEntity.bitmap.getWidth();
            int height = mediaEntity.bitmap.getHeight();
            MediaController.CropState cropState2 = mediaEntity.crop;
            if (((cropState2.orientation + cropState2.transformRotation) / 90) % 2 == 1) {
                width = mediaEntity.bitmap.getHeight();
                height = mediaEntity.bitmap.getWidth();
            }
            MediaController.CropState cropState3 = mediaEntity.crop;
            float f10 = cropState3.cropPw;
            float f11 = cropState3.cropPh;
            float f12 = width;
            float f13 = height;
            canvas.clipRect(((-width) * f10) / 2.0f, ((-height) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
            float f14 = mediaEntity.crop.cropScale;
            canvas.scale(f14, f14);
            MediaController.CropState cropState4 = mediaEntity.crop;
            canvas.translate(cropState4.cropPx * f12, cropState4.cropPy * f13);
            canvas.rotate(mediaEntity.crop.cropRotate + r10.transformRotation);
            if (mediaEntity.crop.mirrored) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.rotate(mediaEntity.crop.orientation);
            canvas.translate((-mediaEntity.bitmap.getWidth()) / 2.0f, (-mediaEntity.bitmap.getHeight()) / 2.0f);
            canvas.drawBitmap(mediaEntity.bitmap, 0.0f, 0.0f, (Paint) null);
            mediaEntity.bitmap.recycle();
            mediaEntity.bitmap = createBitmap;
        }
        if (mediaEntity.type != 2 || mediaEntity.bitmap == null) {
            if (mediaEntity.bitmap != null) {
                float width2 = r2.getWidth() / mediaEntity.bitmap.getHeight();
                if (width2 > 1.0f) {
                    float f15 = mediaEntity.height;
                    float f16 = f15 / width2;
                    mediaEntity.y = com.google.android.recaptcha.internal.a.A(f15, f16, 2.0f, mediaEntity.y);
                    mediaEntity.height = f16;
                    return;
                }
                if (width2 < 1.0f) {
                    float f17 = mediaEntity.width;
                    float f18 = width2 * f17;
                    mediaEntity.x = com.google.android.recaptcha.internal.a.A(f17, f18, 2.0f, mediaEntity.x);
                    mediaEntity.width = f18;
                    return;
                }
                return;
            }
            return;
        }
        mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
        mediaEntity.rotation = (float) (mediaEntity.rotation - Math.toRadians(((Integer) imageOrientation.first).intValue()));
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f19 = mediaEntity.x;
            float f20 = mediaEntity.width;
            float f21 = (f20 / 2.0f) + f19;
            float f22 = mediaEntity.y;
            float f23 = mediaEntity.height;
            float f24 = (f23 / 2.0f) + f22;
            float f25 = this.transformedWidth;
            float f26 = this.transformedHeight;
            float f27 = (f20 * f25) / f26;
            float f28 = (f23 * f26) / f25;
            mediaEntity.width = f28;
            mediaEntity.height = f27;
            mediaEntity.x = f21 - (f28 / 2.0f);
            mediaEntity.y = f24 - (f27 / 2.0f);
        }
        applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
    }

    private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
        Typeface d;
        final zf.b bVar = new zf.b(ApplicationLoader.applicationContext);
        bVar.getPaint().setAntiAlias(true);
        bVar.drawAnimatedEmojiDrawables = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        i0 i0Var = mediaEntity.textTypeface;
        if (i0Var != null && (d = i0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, mediaEntity.fontSize);
        SpannableString spannableString = new SpannableString(mediaEntity.text);
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i10);
            if (emojiEntity.documentAbsolutePath != null) {
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                emojiEntity.entity = mediaEntity2;
                mediaEntity2.text = emojiEntity.documentAbsolutePath;
                mediaEntity2.subType = emojiEntity.subType;
                t5 t5Var = new t5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.TextureRenderer.1
                    @Override // org.telegram.ui.Components.t5, android.text.style.ReplacementSpan
                    public void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f10, int i14, int i15, int i16, Paint paint) {
                        super.draw(canvas, charSequence, i12, i13, f10, i14, i15, i16, paint);
                        VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / mediaEntity3.viewWidth) * mediaEntity3.width) + mediaEntity.x;
                        float f11 = mediaEntity3.y;
                        VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                        float f12 = mediaEntity4.height;
                        float paddingTop = (((((i16 - i14) / 2.0f) + (bVar.getPaddingTop() + i14)) / mediaEntity4.viewHeight) * f12) + f11;
                        if (mediaEntity4.rotation != 0.0f) {
                            float f13 = (mediaEntity4.width / 2.0f) + mediaEntity4.x;
                            float f14 = (f12 / 2.0f) + mediaEntity4.y;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d10 = paddingLeft - f13;
                            double d11 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-mediaEntity.rotation) * d10) - (Math.sin(-mediaEntity.rotation) * d11))) + f13;
                            paddingTop = (((float) i0.a.b(-mediaEntity.rotation, d11, Math.sin(-mediaEntity.rotation) * d10)) * f15) + f14;
                        }
                        VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                        int i17 = this.measuredSize;
                        VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                        float f16 = (i17 / mediaEntity6.viewWidth) * mediaEntity6.width;
                        mediaEntity5.width = f16;
                        float f17 = (i17 / mediaEntity6.viewHeight) * mediaEntity6.height;
                        mediaEntity5.height = f17;
                        mediaEntity5.x = paddingLeft - (f16 / 2.0f);
                        mediaEntity5.y = paddingTop - (f17 / 2.0f);
                        mediaEntity5.rotation = mediaEntity6.rotation;
                        if (mediaEntity5.bitmap == null) {
                            TextureRenderer.this.initStickerEntity(mediaEntity5);
                        }
                    }
                };
                int i12 = emojiEntity.offset;
                spannableString.setSpan(t5Var, i12, emojiEntity.length + i12, 33);
            }
            i10 = i11;
        }
        bVar.setText(Emoji.replaceEmoji(spannableString, bVar.getPaint().getFontMetricsInt(), false));
        bVar.setTextColor(mediaEntity.color);
        Editable text = bVar.getText();
        if (text != null) {
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
        }
        int i13 = mediaEntity.textAlign;
        bVar.setGravity(i13 != 1 ? i13 != 2 ? 19 : 21 : 17);
        int i14 = Build.VERSION.SDK_INT;
        int i15 = mediaEntity.textAlign;
        bVar.setTextAlignment(i15 != 1 ? (i15 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2 : 4);
        bVar.setHorizontallyScrolling(false);
        bVar.setImeOptions(TLObject.FLAG_28);
        bVar.setFocusableInTouchMode(true);
        bVar.setInputType(bVar.getInputType() | 16384);
        if (i14 >= 23) {
            setBreakStrategy(bVar);
        }
        byte b10 = mediaEntity.subType;
        if (b10 == 0) {
            bVar.setFrameColor(mediaEntity.color);
            bVar.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1);
        } else if (b10 == 1) {
            bVar.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
            bVar.setTextColor(mediaEntity.color);
        } else if (b10 == 2) {
            bVar.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -16777216 : -1);
            bVar.setTextColor(mediaEntity.color);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(mediaEntity.color);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, TLObject.FLAG_30));
        bVar.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(mediaEntity.bitmap));
    }

    private boolean isCollage() {
        return this.collageParts != null;
    }

    private void stepCollagePart(int i10, VideoEditedInfo.Part part, long j10) {
        float f10;
        Bitmap r10;
        long j11;
        long j12 = (j10 / 1000000) - part.offset;
        float f11 = part.right;
        long j13 = part.duration;
        long clamp = Utilities.clamp(j12, (long) (f11 * j13), (long) (part.left * j13));
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(clamp);
            part.surfaceTexture.updateTexImage();
            return;
        }
        x5 x5Var = part.animatedFileDrawable;
        if (x5Var != null) {
            int i11 = x5Var.d[3];
            boolean z10 = i11 <= 0;
            if ((clamp < i11 || (z10 && clamp > 1000)) && x5Var.Z != null) {
                x5Var.Z.g(clamp, true);
            }
            do {
                x5 x5Var2 = part.animatedFileDrawable;
                int i12 = x5Var2.d[3];
                f10 = clamp;
                if ((part.msPerFrame * 2.0f) + i12 >= f10) {
                    break;
                }
                j11 = i12;
                if (x5Var2.Z != null) {
                    x5Var2.Z.c(null, false, x5Var2.c0, x5Var2.d0, false);
                }
            } while (part.animatedFileDrawable.d[3] != j11);
            if ((z10 || f10 > part.animatedFileDrawable.d[3] - (part.msPerFrame / 2.0f)) && (r10 = part.animatedFileDrawable.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
                GLUtils.texImage2D(3553, 0, r10, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z10) {
        int createProgram;
        int createProgram2;
        String str3 = this.messageVideoMaskPath != null ? z10 ? VERTEX_SHADER_MASK_300 : VERTEX_SHADER_MASK : z10 ? VERTEX_SHADER_300 : VERTEX_SHADER;
        int i10 = this.NUM_EXTERNAL_SHADER;
        if (i10 >= 0 && i10 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z10)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i11 = this.NUM_FILTER_SHADER;
        if (i11 < 0 || i11 >= this.mProgram.length || (createProgram = createProgram(str3, str2, z10)) == 0) {
            return;
        }
        GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
        this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j10) {
        int i10;
        int i11;
        float[] fArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i14 = 0;
            i10 = 33985;
            i15 = 3042;
            i16 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (BuildVars.LOGS_ENABLED && this.firstFrame) {
                StringBuilder sb2 = new StringBuilder();
                int i20 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i10 = 33985;
                    if (i20 >= fArr2.length) {
                        break;
                    }
                    sb2.append(fArr2[i20]);
                    sb2.append(", ");
                    i20++;
                }
                FileLog.d("stMatrix = " + ((Object) sb2));
                this.firstFrame = false;
            } else {
                i10 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            nz nzVar = this.filterShaders;
            if (nzVar != null) {
                nzVar.P0 = this.mSTMatrix;
                nzVar.W0 = false;
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.f();
                this.filterShaders.d();
                this.filterShaders.e();
                this.filterShaders.c();
                boolean b10 = this.filterShaders.b();
                GLES20.glBindFramebuffer(36160, 0);
                int i21 = this.transformedWidth;
                if (i21 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i21, this.transformedHeight);
                }
                int g10 = this.filterShaders.g(!b10 ? 1 : 0);
                int i22 = this.NUM_FILTER_SHADER;
                fArr = this.mSTMatrixIdentity;
                i12 = i22;
                i13 = g10;
                i14 = b10 ? 1 : 0;
                i11 = 3553;
            } else {
                int i23 = this.mTextureID;
                int i24 = this.NUM_EXTERNAL_SHADER;
                i11 = 36197;
                fArr = this.mSTMatrix;
                i12 = i24;
                i13 = i23;
                i14 = 0;
            }
            i15 = 3042;
            drawBackground();
            i16 = 33984;
            GLES20.glUseProgram(this.mProgram[i12]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i11, i13);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i12], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i12], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i12]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[i12], 2, 5126, false, 8, (Buffer) (this.useMatrixForImagePath ? this.croppedTextureBuffer : this.renderTextureBuffer));
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i12]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i12], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i12]);
            }
            int i25 = this.texSizeHandle;
            if (i25 != 0) {
                GLES20.glUniform2f(i25, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i12], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i12], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i15);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath == null || (iArr = this.paintTexture) == null) {
                nz nzVar2 = this.filterShaders;
                if (nzVar2 != null) {
                    i17 = nzVar2.g(i14 ^ 1);
                    nz nzVar3 = this.filterShaders;
                    int i26 = nzVar3.X0;
                    i19 = nzVar3.Y0;
                    i18 = i26;
                } else {
                    i17 = -1;
                    i18 = 1;
                    i19 = 1;
                }
            } else {
                i17 = iArr[0];
                i18 = this.imageWidth;
                i19 = this.imageHeight;
            }
            if (i17 != -1) {
                this.blur.a(null, i17, i18, i19);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i16);
                GLES20.glBindTexture(3553, this.blur.s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i27 = 0; i27 < this.collageParts.size(); i27++) {
                stepCollagePart(i27, this.collageParts.get(i27), j10);
                drawCollagePart(i27, this.collageParts.get(i27), j10);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i16);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            drawTexture(true, this.paintTexture[this.imagePathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto, -1);
        }
        int i28 = this.paintPathIndex;
        if (i28 >= 0) {
            drawTexture(true, this.paintTexture[i28], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i29 = this.messagePathIndex;
        if (i29 >= 0) {
            drawTexture(true, this.paintTexture[i29], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i30 = 0; i30 < size; i30++) {
                drawEntity(this.mediaEntities.get(i30), this.mediaEntities.get(i30).color, j10);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i10);
                RLottieNative rLottieNative = mediaEntity.lottieNative;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                x5 x5Var = mediaEntity.animatedFileDrawable;
                if (x5Var != null) {
                    x5Var.u();
                }
                View view = mediaEntity.view;
                if (view instanceof nt) {
                    ((nt) view).recycleEmojis();
                }
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    mediaEntity.bitmap = null;
                }
            }
        }
        ArrayList<VideoEditedInfo.Part> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                arrayList2.get(i11);
                i11++;
                for (int i12 = 0; i12 < this.collageParts.size(); i12++) {
                    destroyCollagePart(i12, this.collageParts.get(i12));
                }
            }
        }
    }

    public void setBreakStrategy(zf.b bVar) {
        bVar.setBreakStrategy(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r6 = org.telegram.messenger.video.TextureRenderer.VERTEX_SHADER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x042c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void surfaceCreated() {
        int i10;
        String str;
        int i11;
        int i12;
        float max;
        MediaController.CropState cropState;
        int i13 = 0;
        while (true) {
            int[] iArr = this.mProgram;
            String str2 = null;
            if (i13 >= iArr.length) {
                break;
            }
            int i14 = this.NUM_EXTERNAL_SHADER;
            String str3 = VERTEX_SHADER_MASK;
            String str4 = VERTEX_SHADER;
            if (i13 == i14) {
                String str5 = this.messageVideoMaskPath;
                str2 = str5 != null ? FRAGMENT_EXTERNAL_MASK_SHADER : FRAGMENT_EXTERNAL_SHADER;
            } else if (i13 == this.NUM_FILTER_SHADER) {
                String str6 = this.messageVideoMaskPath;
                str2 = str6 != null ? FRAGMENT_MASK_SHADER : FRAGMENT_SHADER;
            } else if (i13 == this.NUM_GRADIENT_SHADER) {
                str2 = GRADIENT_FRAGMENT_SHADER;
            }
            if (str2 != null) {
                iArr[i13] = createProgram(str4, str2, false);
                this.maPositionHandle[i13] = GLES20.glGetAttribLocation(this.mProgram[i13], "aPosition");
                this.maTextureHandle[i13] = GLES20.glGetAttribLocation(this.mProgram[i13], "aTextureCoord");
                this.mmTextureHandle[i13] = GLES20.glGetAttribLocation(this.mProgram[i13], "mTextureCoord");
                this.muMVPMatrixHandle[i13] = GLES20.glGetUniformLocation(this.mProgram[i13], "uMVPMatrix");
                this.muSTMatrixHandle[i13] = GLES20.glGetUniformLocation(this.mProgram[i13], "uSTMatrix");
                this.maskTextureHandle[i13] = GLES20.glGetUniformLocation(this.mProgram[i13], "sMask");
                if (i13 == this.NUM_GRADIENT_SHADER) {
                    this.gradientTopColorHandle = GLES20.glGetUniformLocation(this.mProgram[i13], "gradientTopColor");
                    this.gradientBottomColorHandle = GLES20.glGetUniformLocation(this.mProgram[i13], "gradientBottomColor");
                }
            }
            i13++;
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i15 = iArr2[0];
        this.mTextureID = i15;
        GLES20.glBindTexture(36197, i15);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        if (this.messageVideoMaskPath != null) {
            try {
                GLES20.glGenTextures(1, iArr2, 0);
                int i16 = iArr2[0];
                this.videoMaskTexture = i16;
                GLES20.glBindTexture(3553, i16);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.messageVideoMaskPath);
                GLUtils.texImage2D(3553, 0, decodeFile, 0);
                decodeFile.recycle();
            } catch (Exception e9) {
                FileLog.e(e9);
                this.videoMaskTexture = -1;
            }
        }
        if (this.blurPath != null && (cropState = this.cropState) != null && cropState.useMatrix != null) {
            fa faVar = new fa();
            this.blur = faVar;
            if (faVar.b(this.transformedWidth / this.transformedHeight, 0)) {
                fa faVar2 = this.blur;
                int i17 = this.gradientTopColor;
                int i18 = this.gradientBottomColor;
                faVar2.l = i17;
                faVar2.m = i18;
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postScale(this.originalWidth, this.originalHeight);
                matrix.postConcat(this.cropState.useMatrix);
                matrix.postScale(1.0f / this.transformedWidth, 1.0f / this.transformedHeight);
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                matrix.invert(matrix2);
                this.blur.c(matrix2);
            } else {
                this.blur = null;
            }
            Bitmap decodeFile2 = BitmapFactory.decodeFile(this.blurPath);
            if (decodeFile2 != null) {
                int[] iArr3 = new int[1];
                this.blurTexture = iArr3;
                GLES20.glGenTextures(1, iArr3, 0);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLUtils.texImage2D(3553, 0, decodeFile2, 0);
                decodeFile2.recycle();
            } else {
                this.blur = null;
            }
            if (this.blur != null) {
                int h = nz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                int h10 = nz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D blurImage;uniform sampler2D maskImage;void main() {gl_FragColor = texture2D(blurImage, vTextureCoord) * texture2D(maskImage, vTextureCoord).a;}");
                if (h == 0 || h10 == 0) {
                    this.blur = null;
                } else {
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.blurShaderProgram = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(this.blurShaderProgram, h10);
                    GLES20.glBindAttribLocation(this.blurShaderProgram, 0, "position");
                    GLES20.glBindAttribLocation(this.blurShaderProgram, 1, "inputTexCoord");
                    GLES20.glLinkProgram(this.blurShaderProgram);
                    int[] iArr4 = new int[1];
                    GLES20.glGetProgramiv(this.blurShaderProgram, 35714, iArr4, 0);
                    if (iArr4[0] == 0) {
                        GLES20.glDeleteProgram(this.blurShaderProgram);
                        this.blurShaderProgram = 0;
                    } else {
                        this.blurPositionHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "position");
                        this.blurInputTexCoordHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "inputTexCoord");
                        this.blurBlurImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "blurImage");
                        this.blurMaskImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "maskImage");
                        FloatBuffer f10 = rl.f(ByteBuffer.allocateDirect(32));
                        this.blurVerticesBuffer = f10;
                        f10.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f}).position(0);
                    }
                }
            }
        }
        if (this.filterShaders != null || this.imagePath != null || this.paintPath != null || this.messagePath != null || this.mediaEntities != null || isCollage()) {
            int h11 = nz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h12 = nz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
            if (h11 != 0 && h12 != 0) {
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.simpleShaderProgram = glCreateProgram2;
                GLES20.glAttachShader(glCreateProgram2, h11);
                GLES20.glAttachShader(this.simpleShaderProgram, h12);
                GLES20.glBindAttribLocation(this.simpleShaderProgram, 0, "position");
                GLES20.glBindAttribLocation(this.simpleShaderProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.simpleShaderProgram);
                int[] iArr5 = new int[1];
                GLES20.glGetProgramiv(this.simpleShaderProgram, 35714, iArr5, 0);
                if (iArr5[0] == 0) {
                    GLES20.glDeleteProgram(this.simpleShaderProgram);
                    this.simpleShaderProgram = 0;
                } else {
                    this.simplePositionHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "position");
                    this.simpleInputTexCoordHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "inputTexCoord");
                    this.simpleSourceImageHandle = GLES20.glGetUniformLocation(this.simpleShaderProgram, "sTexture");
                }
            }
        }
        if (isCollage()) {
            int h13 = nz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h14 = nz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replaceAll("sampler2D", "samplerExternalOES"));
            if (h13 != 0 && h14 != 0) {
                int glCreateProgram3 = GLES20.glCreateProgram();
                this.simpleShaderProgramOES = glCreateProgram3;
                GLES20.glAttachShader(glCreateProgram3, h13);
                GLES20.glAttachShader(this.simpleShaderProgramOES, h14);
                GLES20.glBindAttribLocation(this.simpleShaderProgramOES, 0, "position");
                GLES20.glBindAttribLocation(this.simpleShaderProgramOES, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.simpleShaderProgramOES);
                int[] iArr6 = new int[1];
                GLES20.glGetProgramiv(this.simpleShaderProgramOES, 35714, iArr6, 0);
                if (iArr6[0] == 0) {
                    GLES20.glDeleteProgram(this.simpleShaderProgramOES);
                    this.simpleShaderProgramOES = 0;
                } else {
                    this.simplePositionHandleOES = GLES20.glGetAttribLocation(this.simpleShaderProgramOES, "position");
                    this.simpleInputTexCoordHandleOES = GLES20.glGetAttribLocation(this.simpleShaderProgramOES, "inputTexCoord");
                    this.simpleSourceImageHandleOES = GLES20.glGetUniformLocation(this.simpleShaderProgramOES, "sTexture");
                }
            }
        }
        nz nzVar = this.filterShaders;
        if (nzVar != null) {
            nzVar.a();
            this.filterShaders.i(null, 0, this.mTextureID, this.originalWidth, this.originalHeight);
        }
        String str7 = this.imagePath;
        if (str7 != null || this.paintPath != null || this.messagePath != null) {
            if (str7 != null) {
                this.imagePathIndex = 0;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.paintPath != null) {
                this.paintPathIndex = i10;
                i10++;
            }
            if (this.messagePath != null) {
                this.messagePathIndex = i10;
                i10++;
            }
            if (this.backgroundPath != null) {
                this.backgroundPathIndex = i10;
                i10++;
            }
            int[] iArr7 = new int[i10];
            this.paintTexture = iArr7;
            GLES20.glGenTextures(i10, iArr7, 0);
            int i19 = 0;
            while (i19 < this.paintTexture.length) {
                try {
                    if (i19 == this.imagePathIndex) {
                        str = this.imagePath;
                        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
                        i12 = ((Integer) imageOrientation.first).intValue();
                        i11 = ((Integer) imageOrientation.second).intValue();
                    } else {
                        str = i19 == this.paintPathIndex ? this.paintPath : i19 == this.backgroundPathIndex ? this.backgroundPath : this.messagePath;
                        i11 = 0;
                        i12 = 0;
                    }
                    Bitmap decodeFile3 = BitmapFactory.decodeFile(str);
                    if (decodeFile3 != null) {
                        if (i19 == this.imagePathIndex && !this.useMatrixForImagePath) {
                            Bitmap createBitmap = Bitmap.createBitmap(this.transformedWidth, this.transformedHeight, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(-16777216);
                            Canvas canvas = new Canvas(createBitmap);
                            if (i12 != 90 && i12 != 270) {
                                max = Math.max(decodeFile3.getWidth() / this.transformedWidth, decodeFile3.getHeight() / this.transformedHeight);
                                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                                matrix3.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                                float f11 = -1.0f;
                                float f12 = (i11 != 1 ? -1.0f : 1.0f) / max;
                                if (i11 == 2) {
                                    f11 = 1.0f;
                                }
                                matrix3.postScale(f12, f11 / max);
                                matrix3.postRotate(i12);
                                matrix3.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                                canvas.drawBitmap(decodeFile3, matrix3, new Paint(2));
                                decodeFile3 = createBitmap;
                            }
                            max = Math.max(decodeFile3.getHeight() / this.transformedWidth, decodeFile3.getWidth() / this.transformedHeight);
                            android.graphics.Matrix matrix32 = new android.graphics.Matrix();
                            matrix32.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                            float f112 = -1.0f;
                            float f122 = (i11 != 1 ? -1.0f : 1.0f) / max;
                            if (i11 == 2) {
                            }
                            matrix32.postScale(f122, f112 / max);
                            matrix32.postRotate(i12);
                            matrix32.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                            canvas.drawBitmap(decodeFile3, matrix32, new Paint(2));
                            decodeFile3 = createBitmap;
                        }
                        if (i19 == this.imagePathIndex) {
                            this.imageWidth = decodeFile3.getWidth();
                            this.imageHeight = decodeFile3.getHeight();
                        }
                        GLES20.glBindTexture(3553, this.paintTexture[i19]);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLUtils.texImage2D(3553, 0, decodeFile3, 0);
                    }
                    i19++;
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
        if (isCollage()) {
            try {
                int size = this.collageParts.size();
                int[] iArr8 = new int[size];
                this.collageTextures = iArr8;
                GLES20.glGenTextures(size, iArr8, 0);
                for (int i20 = 0; i20 < this.collageParts.size(); i20++) {
                    initCollagePart(i20, this.collageParts.get(i20));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (this.mediaEntities == null && this.backgroundDrawable == null) {
            return;
        }
        try {
            this.stickerBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
            int[] iArr9 = new int[1];
            this.stickerTexture = iArr9;
            GLES20.glGenTextures(1, iArr9, 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int size2 = this.mediaEntities.size();
            for (int i21 = 0; i21 < size2; i21++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i21);
                byte b10 = mediaEntity.type;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(mediaEntity);
                    } else if (b10 == 3) {
                        initLocationEntity(mediaEntity);
                    } else if (b10 == 7) {
                        initLinkEntity(mediaEntity);
                    }
                }
                initStickerEntity(mediaEntity);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    private void drawTexture(boolean z10, int i10, float f10, float f11, float f12, float f13, float f14, boolean z11) {
        drawTexture(z10, i10, f10, f11, f12, f13, f14, z11, false, -1);
    }

    private void drawTexture(boolean z10, int i10, float f10, float f11, float f12, float f13, float f14, boolean z11, boolean z12, int i11) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        if (f10 <= -10000.0f) {
            float[] fArr = this.bitmapData;
            fArr[0] = -1.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = -1.0f;
            fArr[5] = -1.0f;
            fArr[6] = 1.0f;
            fArr[7] = -1.0f;
        } else {
            float f15 = (f10 * 2.0f) - 1.0f;
            float f16 = ((1.0f - f11) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f15;
            fArr2[1] = f16;
            float f17 = (f12 * 2.0f) + f15;
            fArr2[2] = f17;
            fArr2[3] = f16;
            fArr2[4] = f15;
            float f18 = f16 - (f13 * 2.0f);
            fArr2[5] = f18;
            fArr2[6] = f17;
            fArr2[7] = f18;
        }
        float[] fArr3 = this.bitmapData;
        float f19 = fArr3[0];
        float f20 = fArr3[2];
        float f21 = (f19 + f20) / 2.0f;
        if (z11) {
            fArr3[2] = f19;
            fArr3[0] = f20;
            float f22 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f22;
        }
        if (f14 != 0.0f) {
            float f23 = this.transformedWidth / this.transformedHeight;
            float f24 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i12 = 0;
            for (int i13 = 4; i12 < i13; i13 = 4) {
                float[] fArr4 = this.bitmapData;
                int i14 = i12 * 2;
                int i15 = i14 + 1;
                double d = fArr4[i14] - f21;
                double d10 = f14;
                float f25 = f21;
                double d11 = (fArr4[i15] - f24) / f23;
                fArr4[i14] = ((float) ((Math.cos(d10) * d) - (Math.sin(d10) * d11))) + f25;
                this.bitmapData[i15] = (((float) i0.a.b(d10, d11, Math.sin(d10) * d)) * f23) + f24;
                i12++;
                f21 = f25;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z10) {
            GLES20.glBindTexture(3553, i10);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}
