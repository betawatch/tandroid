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
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
    private yl0 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<nec> collageParts;
    private int[] collageTextures;
    private final fo6 cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<wl> emojiDrawables;
    private uf4 filterShaders;
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
    private ArrayList<mec> mediaEntities;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextureRenderer(po6 po6Var, String str, String str2, String str3, ArrayList<mec> arrayList, fo6 fo6Var, int i, int i2, int i3, int i4, int i5, float f, boolean z, Integer num, Integer num2, b8b b8bVar, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        int i6;
        char c;
        int i7;
        char c2;
        int i8;
        float f2;
        float f3;
        int i9;
        int i10;
        int i11;
        float[] fArr;
        int i12;
        int i13 = i;
        int i14 = i2;
        float f4 = f;
        this.NUM_FILTER_SHADER = -1;
        this.NUM_EXTERNAL_SHADER = -1;
        this.NUM_GRADIENT_SHADER = -1;
        this.isPhoto = z;
        this.collageParts = convertVideoParams.collageParts;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (f11.a) {
            StringBuilder p = bs2.p("start textureRenderer w = ", i13, " h = ", i14, " r = ");
            p.append(i5);
            p.append(" fps = ");
            p.append(f4);
            cc4.b(p.toString());
            if (fo6Var != null) {
                cc4.b("cropState px = " + fo6Var.a + " py = " + fo6Var.b + " cScale = " + fo6Var.c + " cropRotate = " + fo6Var.d + " pw = " + fo6Var.e + " ph = " + fo6Var.f + " tw = " + fo6Var.i + " th = " + fo6Var.j + " tr = " + fo6Var.k + " mirror = " + fo6Var.l);
            }
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureBuffer = asFloatBuffer;
        asFloatBuffer.put(fArr2).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(this.bitmapData.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.bitmapVerticesBuffer = asFloatBuffer2;
        asFloatBuffer2.put(this.bitmapData).position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        Matrix.setIdentityM(this.mSTMatrixIdentity, 0);
        if (po6Var != null) {
            uf4 uf4Var = new uf4(true, b8bVar);
            this.filterShaders = uf4Var;
            i6 = 32;
            uf4Var.f1 = new ri6(po6Var, (byte) 29);
        } else {
            i6 = 32;
        }
        this.transformedWidth = i13;
        this.transformedHeight = i14;
        this.originalWidth = i3;
        this.originalHeight = i4;
        this.imagePath = str;
        this.paintPath = str2;
        this.messagePath = convertVideoParams.messagePath;
        this.messageVideoMaskPath = convertVideoParams.messageVideoMaskPath;
        this.backgroundPath = convertVideoParams.backgroundPath;
        this.blurPath = str3;
        this.mediaEntities = arrayList;
        this.videoFps = f4 == 0.0f ? 30.0f : f4;
        this.cropState = fo6Var;
        this.NUM_EXTERNAL_SHADER = 0;
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        long j = convertVideoParams.wallpaperPeerId;
        int i15 = 4;
        float f5 = 1.0f;
        if (j != Long.MIN_VALUE) {
            c = 6;
            this.backgroundDrawable = mm8.d(null, convertVideoParams.account, j, convertVideoParams.isDark);
        } else {
            c = 6;
            if (num2 != null && num != null) {
                FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.gradientVerticesBuffer = asFloatBuffer3;
                asFloatBuffer3.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                boolean z2 = this.isPhoto;
                float[] fArr3 = {0.0f, z2 ? 1.0f : 0.0f, 1.0f, z2 ? 1.0f : 0.0f, 0.0f, z2 ? 0.0f : 1.0f, 1.0f, z2 ? 0.0f : 1.0f};
                FloatBuffer asFloatBuffer4 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.gradientTextureBuffer = asFloatBuffer4;
                asFloatBuffer4.put(fArr3).position(0);
                this.gradientTopColor = num.intValue();
                this.gradientBottomColor = num2.intValue();
                this.NUM_GRADIENT_SHADER = 1;
                i7 = 2;
                if (this.filterShaders != null) {
                    this.NUM_FILTER_SHADER = i7;
                    i7++;
                }
                this.mProgram = new int[i7];
                this.muMVPMatrixHandle = new int[i7];
                this.muSTMatrixHandle = new int[i7];
                this.maPositionHandle = new int[i7];
                this.maTextureHandle = new int[i7];
                this.mmTextureHandle = new int[i7];
                this.maskTextureHandle = new int[i7];
                if (fo6Var == null) {
                    android.graphics.Matrix matrix = fo6Var.B;
                    float f6 = 2.0f;
                    if (matrix == null) {
                        c2 = 1;
                        f2 = 1.0f;
                        f3 = 0.5f;
                        i9 = 90;
                        float[] fArr4 = new float[8];
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        float f7 = i13;
                        fArr4[2] = f7;
                        fArr4[3] = 0.0f;
                        fArr4[4] = 0.0f;
                        float f8 = i14;
                        fArr4[5] = f8;
                        fArr4[c] = f7;
                        fArr4[7] = f8;
                        i10 = fo6Var.k;
                        this.transformedWidth = (int) (this.transformedWidth * fo6Var.e);
                        this.transformedHeight = (int) (this.transformedHeight * fo6Var.f);
                        float f9 = (float) ((-fo6Var.d) * 0.017453292519943295d);
                        int i16 = 0;
                        while (i16 < 4) {
                            int i17 = i16 << 1;
                            float f10 = fArr4[i17] - (i13 / 2);
                            int i18 = i17 + 1;
                            float f11 = fArr4[i18] - (i14 / 2);
                            float f12 = f6;
                            double d = f10;
                            double d2 = f9;
                            double cos = Math.cos(d2) * d;
                            double d3 = f11;
                            float sin = ((float) ((cos - (Math.sin(d2) * d3)) + (fo6Var.a * f7))) * fo6Var.c;
                            float d4 = ((float) (ik8.d(d2, d3, Math.sin(d2) * d) - (fo6Var.b * f8))) * fo6Var.c;
                            fArr4[i17] = (sin / this.transformedWidth) * f12;
                            fArr4[i18] = (d4 / this.transformedHeight) * f12;
                            i16++;
                            i13 = i;
                            i14 = i2;
                            f6 = f12;
                        }
                        FloatBuffer asFloatBuffer5 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.verticesBuffer = asFloatBuffer5;
                        i8 = 0;
                        asFloatBuffer5.put(fArr4).position(0);
                        if (this.filterShaders == null) {
                            i11 = 4;
                            if (i10 == i9) {
                                fArr = new float[8];
                                fArr[i8] = f2;
                                fArr[c2] = 0.0f;
                                fArr[2] = f2;
                                fArr[3] = f2;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c] = 0.0f;
                                fArr[7] = f2;
                            } else if (i10 == 180) {
                                fArr = new float[8];
                                fArr[i8] = f2;
                                fArr[c2] = f2;
                                fArr[2] = 0.0f;
                                fArr[3] = f2;
                                fArr[4] = f2;
                                fArr[5] = 0.0f;
                                fArr[c] = 0.0f;
                                fArr[7] = 0.0f;
                            } else if (i10 == 270) {
                                fArr = new float[8];
                                fArr[i8] = 0.0f;
                                fArr[c2] = f2;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f2;
                                fArr[5] = f2;
                                fArr[c] = f2;
                                fArr[7] = 0.0f;
                            } else {
                                fArr = new float[8];
                                fArr[i8] = 0.0f;
                                fArr[c2] = 0.0f;
                                fArr[2] = f2;
                                fArr[3] = 0.0f;
                                fArr[4] = 0.0f;
                                fArr[5] = f2;
                                fArr[c] = f2;
                                fArr[7] = f2;
                            }
                        } else if (i10 == i9) {
                            fArr = new float[8];
                            fArr[i8] = f2;
                            fArr[c2] = f2;
                            fArr[2] = f2;
                            fArr[3] = 0.0f;
                            i11 = 4;
                            fArr[4] = 0.0f;
                            fArr[5] = f2;
                            fArr[c] = 0.0f;
                            fArr[7] = 0.0f;
                        } else {
                            i11 = 4;
                            if (i10 == 180) {
                                fArr = new float[8];
                                fArr[i8] = f2;
                                fArr[c2] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f2;
                                fArr[5] = f2;
                                fArr[c] = 0.0f;
                                fArr[7] = f2;
                            } else if (i10 == 270) {
                                fArr = new float[8];
                                fArr[i8] = 0.0f;
                                fArr[c2] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = f2;
                                fArr[4] = f2;
                                fArr[5] = 0.0f;
                                fArr[c] = f2;
                                fArr[7] = f2;
                            } else {
                                fArr = new float[8];
                                fArr[i8] = 0.0f;
                                fArr[c2] = f2;
                                fArr[2] = f2;
                                fArr[3] = f2;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c] = f2;
                                fArr[7] = 0.0f;
                            }
                        }
                        if (fo6Var != null && fo6Var.l) {
                            for (i12 = 0; i12 < i11; i12++) {
                                int i19 = i12 << 1;
                                if (fArr[i19] > f3) {
                                    fArr[i19] = 0.0f;
                                } else {
                                    fArr[i19] = f2;
                                }
                            }
                        }
                        FloatBuffer asFloatBuffer6 = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.renderTextureBuffer = asFloatBuffer6;
                        asFloatBuffer6.put(fArr).position(0);
                        FloatBuffer asFloatBuffer7 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.maskTextureBuffer = asFloatBuffer7;
                        asFloatBuffer7.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
                    }
                    this.useMatrixForImagePath = true;
                    float f13 = fo6Var.e;
                    f3 = 0.5f;
                    float f14 = fo6Var.f;
                    i9 = 90;
                    if ((fo6Var.z / 90) % 2 == 1) {
                        f13 = f14;
                        f14 = f13;
                    }
                    float f15 = (1.0f - f13) / 2.0f;
                    float f16 = (1.0f - f14) / 2.0f;
                    c2 = 1;
                    float[] fArr5 = new float[8];
                    float f17 = i3;
                    float f18 = f17 * f15;
                    fArr5[0] = f18;
                    float f19 = i4;
                    float f20 = f19 * f16;
                    fArr5[1] = f20;
                    float f21 = (f15 + f13) * f17;
                    fArr5[2] = f21;
                    fArr5[3] = f20;
                    fArr5[4] = f18;
                    float f22 = (f16 + f14) * f19;
                    fArr5[5] = f22;
                    fArr5[c] = f21;
                    fArr5[7] = f22;
                    matrix.mapPoints(fArr5);
                    int i20 = 0;
                    while (i20 < i15) {
                        int i21 = i20 << 1;
                        fArr5[i21] = ((fArr5[i21] / i13) * 2.0f) - 1.0f;
                        int i22 = i21 + 1;
                        fArr5[i22] = uh9.x(fArr5[i22], i14, 2.0f, 1.0f);
                        i20++;
                        i15 = i15;
                    }
                    int i23 = i15;
                    FloatBuffer asFloatBuffer8 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.verticesBuffer = asFloatBuffer8;
                    asFloatBuffer8.put(fArr5).position(0);
                    float[] fArr6 = new float[8];
                    float f23 = f13 * f17;
                    float f24 = f23 * (-0.5f);
                    fArr6[0] = f24;
                    float f25 = f14 * f19;
                    float f26 = (-0.5f) * f25;
                    fArr6[1] = f26;
                    float f27 = f23 * 0.5f;
                    fArr6[2] = f27;
                    fArr6[3] = f26;
                    fArr6[i23] = f24;
                    float f28 = f25 * 0.5f;
                    fArr6[5] = f28;
                    fArr6[c] = f27;
                    fArr6[7] = f28;
                    float f29 = (float) ((-fo6Var.d) * 0.017453292519943295d);
                    int i24 = 0;
                    for (int i25 = i23; i24 < i25; i25 = 4) {
                        int i26 = i24 << 1;
                        float f30 = fArr6[i26];
                        int i27 = i26 + 1;
                        float f31 = fArr6[i27];
                        double d5 = f30 - (fo6Var.a * f17);
                        float f32 = f5;
                        double d6 = f29;
                        double d7 = f31 - (fo6Var.b * f19);
                        float cos2 = ((float) ((Math.cos(d6) * d5) - (Math.sin(d6) * d7))) / f17;
                        float d8 = ((float) ik8.d(d6, d7, Math.sin(d6) * d5)) / f19;
                        float f33 = fo6Var.c;
                        fArr6[i26] = (cos2 / f33) + 0.5f;
                        fArr6[i27] = (d8 / f33) + 0.5f;
                        i24++;
                        f5 = f32;
                    }
                    f2 = f5;
                    if (this.filterShaders == null && !this.isPhoto && this.messageVideoMaskPath == null) {
                        fArr6[1] = f2 - fArr6[1];
                        fArr6[3] = f2 - fArr6[3];
                        fArr6[5] = f2 - fArr6[5];
                        fArr6[7] = f2 - fArr6[7];
                    }
                    FloatBuffer asFloatBuffer9 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.croppedTextureBuffer = asFloatBuffer9;
                    i8 = 0;
                    asFloatBuffer9.put(fArr6).position(0);
                } else {
                    c2 = 1;
                    i8 = 0;
                    f2 = 1.0f;
                    f3 = 0.5f;
                    i9 = 90;
                    FloatBuffer asFloatBuffer10 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.verticesBuffer = asFloatBuffer10;
                    asFloatBuffer10.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                }
                i10 = i8;
                if (this.filterShaders == null) {
                }
                if (fo6Var != null) {
                    while (i12 < i11) {
                    }
                }
                FloatBuffer asFloatBuffer62 = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.renderTextureBuffer = asFloatBuffer62;
                asFloatBuffer62.put(fArr).position(0);
                FloatBuffer asFloatBuffer72 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.maskTextureBuffer = asFloatBuffer72;
                asFloatBuffer72.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            }
        }
        i7 = 1;
        if (this.filterShaders != null) {
        }
        this.mProgram = new int[i7];
        this.muMVPMatrixHandle = new int[i7];
        this.muSTMatrixHandle = new int[i7];
        this.maPositionHandle = new int[i7];
        this.maTextureHandle = new int[i7];
        this.mmTextureHandle = new int[i7];
        this.maskTextureHandle = new int[i7];
        if (fo6Var == null) {
        }
        i10 = i8;
        if (this.filterShaders == null) {
        }
        if (fo6Var != null) {
        }
        FloatBuffer asFloatBuffer622 = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.renderTextureBuffer = asFloatBuffer622;
        asFloatBuffer622.put(fArr).position(0);
        FloatBuffer asFloatBuffer722 = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.maskTextureBuffer = asFloatBuffer722;
        asFloatBuffer722.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
    }

    private void applyRoundRadius(mec mecVar, Bitmap bitmap, int i) {
        if (bitmap == null || mecVar == null) {
            return;
        }
        if (mecVar.s == 0.0f && i == 0) {
            return;
        }
        if (mecVar.M == null) {
            mecVar.M = new Canvas(bitmap);
        }
        if (mecVar.s != 0.0f) {
            if (this.path == null) {
                this.path = new Path();
            }
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mecVar.s;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
            this.path.toggleInverseFillType();
            mecVar.M.drawPath(this.path, this.xRefPaint);
        }
        if (i != 0) {
            if (this.textColorPaint == null) {
                Paint paint2 = new Paint(1);
                this.textColorPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            this.textColorPaint.setColor(i);
            mecVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
        }
    }

    private int createProgram(String str, String str2, boolean z) {
        int h;
        int glCreateProgram;
        int h2;
        int glCreateProgram2;
        if (z) {
            int h3 = uf4.h(35633, str);
            if (h3 == 0 || (h2 = uf4.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h3);
            GLES20.glAttachShader(glCreateProgram2, h2);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram2;
            }
            GLES20.glDeleteProgram(glCreateProgram2);
            return 0;
        }
        int h4 = uf4.h(35633, str);
        if (h4 == 0 || (h = uf4.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, h4);
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

    private void destroyCollagePart(int i, nec necVar) {
        if (necVar != null) {
            lm lmVar = necVar.u;
            if (lmVar != null) {
                lmVar.u();
                necVar.u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = necVar.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                necVar.B = null;
            }
            SurfaceTexture surfaceTexture = necVar.z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                necVar.z = null;
            }
        }
    }

    private void drawBackground() {
        int i = this.NUM_GRADIENT_SHADER;
        if (i < 0) {
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
        GLES20.glUseProgram(this.mProgram[i]);
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

    private void drawCollagePart(int i, nec necVar, long j) {
        if (necVar.B == null || !necVar.b) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) necVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) necVar.s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) necVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) necVar.s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(mec mecVar, int i, long j) {
        mec mecVar2;
        float f;
        Bitmap bitmap;
        long j2;
        long j3;
        if (mecVar.a == 11) {
            long j4 = j / 1000000;
            if (j4 < mecVar.V || j4 >= mecVar.W) {
                Bitmap bitmap2 = mecVar.G;
                if (bitmap2 == null || j4 < mecVar.W) {
                    return;
                }
                bitmap2.recycle();
                mecVar.G = null;
                return;
            }
            if (mecVar.G == null) {
                try {
                    initTextEntity(mecVar);
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            }
            if (mecVar.X != null) {
                View view = mecVar.I;
                if ((view instanceof ju3) && mecVar.J != null && mecVar.G != null) {
                    ju3 ju3Var = (ju3) view;
                    if (ju3Var.A(j4)) {
                        mecVar.G.eraseColor(0);
                        ju3Var.draw(mecVar.J);
                    }
                }
            }
        }
        RLottieNative rLottieNative = mecVar.D;
        if (rLottieNative != null) {
            Bitmap bitmap3 = mecVar.G;
            if (bitmap3 == null || mecVar.Y <= 0 || mecVar.Z <= 0) {
                return;
            }
            rLottieNative.c((int) mecVar.E, bitmap3, true);
            applyRoundRadius(mecVar, mecVar.G, (mecVar.b & 8) != 0 ? i : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mecVar.G, 0);
            float f2 = mecVar.E + mecVar.F;
            mecVar.E = f2;
            if (f2 >= mecVar.D.a[0]) {
                mecVar.E = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], mecVar.c, mecVar.d, mecVar.f, mecVar.g, mecVar.e, (mecVar.b & 2) != 0);
            return;
        }
        if (mecVar.K == null) {
            if (mecVar.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mecVar.G, 0);
                int i2 = this.stickerTexture[0];
                float f3 = mecVar.c;
                float f4 = mecVar.h;
                float f5 = f3 - (f4 / 2.0f);
                float f6 = mecVar.d;
                float f7 = mecVar.i;
                drawTexture(false, i2, f5, f6 - (f7 / 2.0f), mecVar.f + f4, f7 + mecVar.g, mecVar.e, mecVar.a == 2 && (mecVar.b & 2) != 0);
            }
            ArrayList arrayList = mecVar.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i3 = 0; i3 < mecVar.k.size(); i3++) {
                lec lecVar = (lec) mecVar.k.get(i3);
                if (lecVar != null && (mecVar2 = lecVar.b) != null) {
                    drawEntity(mecVar2, mecVar.l, j);
                }
            }
            return;
        }
        float f8 = mecVar.E;
        int i4 = (int) f8;
        float f9 = 1.0f;
        if (mecVar.a == 5) {
            if (this.isPhoto) {
                j3 = mecVar.U;
                j2 = 0;
            } else {
                j2 = mecVar.R;
                j3 = (mecVar.T - mecVar.S) + j2;
            }
            long j5 = j / 1000000;
            if (j5 < j2) {
                f9 = k43.h.getInterpolation(Utilities.i(1.0f - ((j2 - j5) / 400.0f), 1.0f, 0.0f));
            } else if (j5 > j3) {
                f9 = k43.h.getInterpolation(Utilities.i(1.0f - ((j5 - j3) / 400.0f), 1.0f, 0.0f));
            }
            if (f9 > 0.0f) {
                long k = this.isPhoto ? Utilities.k(j5, mecVar.U, 0L) : Utilities.k((j5 - mecVar.R) + mecVar.S, mecVar.U, 0L);
                while (!mecVar.L) {
                    int[] iArr = mecVar.K.d;
                    f = 2.0f;
                    if (iArr[3] >= Math.min(k, iArr[4])) {
                        break;
                    }
                    lm lmVar = mecVar.K;
                    int i5 = lmVar.d[3];
                    lmVar.r(false);
                    int i6 = mecVar.K.d[3];
                    if (i6 <= i5 && (i6 != 0 || i5 != 0)) {
                        mecVar.L = true;
                        break;
                    }
                }
            }
            f = 2.0f;
        } else {
            f = 2.0f;
            float f10 = f8 + mecVar.F;
            mecVar.E = f10;
            for (int i7 = (int) f10; i4 != i7; i7--) {
                mecVar.K.r(true);
            }
        }
        im imVar = mecVar.K.w;
        Bitmap bitmap4 = imVar != null ? imVar.b : null;
        if (bitmap4 != null) {
            if (mecVar.a == 5) {
                if (this.roundBitmap == null) {
                    int min = Math.min(bitmap4.getWidth(), bitmap4.getHeight());
                    this.roundBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    this.roundCanvas = new Canvas(this.roundBitmap);
                }
                Bitmap bitmap5 = this.roundBitmap;
                if (bitmap5 != null) {
                    bitmap5.eraseColor(0);
                    this.roundCanvas.save();
                    Path path = this.roundClipPath;
                    if (path == null) {
                        path = new Path();
                        this.roundClipPath = path;
                    }
                    path.rewind();
                    this.roundClipPath.addCircle(this.roundBitmap.getWidth() / f, this.roundBitmap.getHeight() / f, (this.roundBitmap.getWidth() / f) * f9, Path.Direction.CW);
                    this.roundCanvas.clipPath(this.roundClipPath);
                    int width = bitmap4.getWidth();
                    int height = bitmap4.getHeight();
                    Rect rect = this.roundSrc;
                    if (width >= height) {
                        rect.set((bitmap4.getWidth() - bitmap4.getHeight()) / 2, 0, bitmap4.getWidth() - ((bitmap4.getWidth() - bitmap4.getHeight()) / 2), bitmap4.getHeight());
                    } else {
                        rect.set(0, (bitmap4.getHeight() - bitmap4.getWidth()) / 2, bitmap4.getWidth(), bitmap4.getHeight() - ((bitmap4.getHeight() - bitmap4.getWidth()) / 2));
                    }
                    this.roundDst.set(0.0f, 0.0f, this.roundBitmap.getWidth(), this.roundBitmap.getHeight());
                    this.roundCanvas.drawBitmap(bitmap4, this.roundSrc, this.roundDst, (Paint) null);
                    this.roundCanvas.restore();
                }
                bitmap = this.roundBitmap;
            } else {
                if (this.stickerCanvas == null && this.stickerBitmap != null) {
                    this.stickerCanvas = new Canvas(this.stickerBitmap);
                    if (this.stickerBitmap.getHeight() != bitmap4.getHeight() || this.stickerBitmap.getWidth() != bitmap4.getWidth()) {
                        this.stickerCanvas.scale(this.stickerBitmap.getWidth() / bitmap4.getWidth(), this.stickerBitmap.getHeight() / bitmap4.getHeight());
                    }
                }
                Bitmap bitmap6 = this.stickerBitmap;
                if (bitmap6 != null) {
                    bitmap6.eraseColor(0);
                    this.stickerCanvas.drawBitmap(bitmap4, 0.0f, 0.0f, (Paint) null);
                    applyRoundRadius(mecVar, this.stickerBitmap, (mecVar.b & 8) != 0 ? i : 0);
                }
                bitmap = this.stickerBitmap;
            }
            if (bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                drawTexture(false, this.stickerTexture[0], mecVar.c, mecVar.d, mecVar.f, mecVar.g, mecVar.e, (mecVar.b & 2) != 0);
            }
        }
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2, boolean z3, int i2) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        float[] fArr = this.bitmapData;
        if (f <= -10000.0f) {
            fArr[0] = -1.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = -1.0f;
            fArr[5] = -1.0f;
            fArr[6] = 1.0f;
            fArr[7] = -1.0f;
        } else {
            float f6 = (f * 2.0f) - 1.0f;
            float f7 = ((1.0f - f2) * 2.0f) - 1.0f;
            fArr[0] = f6;
            fArr[1] = f7;
            float f8 = (f3 * 2.0f) + f6;
            fArr[2] = f8;
            fArr[3] = f7;
            fArr[4] = f6;
            float f9 = f7 - (f4 * 2.0f);
            fArr[5] = f9;
            fArr[6] = f8;
            fArr[7] = f9;
        }
        float f10 = fArr[0];
        float f11 = fArr[2];
        float f12 = (f10 + f11) / 2.0f;
        if (z2) {
            fArr[2] = f10;
            fArr[0] = f11;
            float f13 = fArr[6];
            fArr[6] = fArr[4];
            fArr[4] = f13;
        }
        if (f5 != 0.0f) {
            float f14 = this.transformedWidth / this.transformedHeight;
            float f15 = (fArr[5] + fArr[1]) / 2.0f;
            int i3 = 0;
            for (int i4 = 4; i3 < i4; i4 = 4) {
                float[] fArr2 = this.bitmapData;
                int i5 = i3 << 1;
                int i6 = i5 + 1;
                double d = fArr2[i5] - f12;
                double d2 = f5;
                double d3 = (fArr2[i6] - f15) / f14;
                fArr2[i5] = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d3))) + f12;
                this.bitmapData[i6] = (((float) ik8.d(d2, d3, d * Math.sin(d2))) * f14) + f15;
                i3++;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z) {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        return asFloatBuffer;
    }

    private void initCollagePart(int i, nec necVar) {
        MediaCodecPlayer mediaCodecPlayer;
        AtomicInteger atomicInteger = new AtomicInteger(necVar.l);
        AtomicInteger atomicInteger2 = new AtomicInteger(necVar.m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        boolean z = necVar.b;
        int[] iArr = this.collageTextures;
        if (z) {
            GLES20.glBindTexture(36197, iArr[i]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i]);
            necVar.z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(necVar.l, necVar.m);
            try {
                mediaCodecPlayer = new MediaCodecPlayer(necVar.d, new Surface(necVar.z));
                necVar.B = mediaCodecPlayer;
            } catch (Exception e) {
                cc4.g(e, true);
                necVar.B = null;
                mediaCodecPlayer = null;
            }
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(necVar.B.getOrientedHeight());
                atomicInteger3.set(necVar.B.getOrientation());
            } else {
                necVar.z.release();
                necVar.z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i);
                GLES20.glGenTextures(1, this.collageTextures, i);
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                lm lmVar = new lm(new File(necVar.d), true, 0L, 0, null, null, null, 0L, yac.t0, true, 512, 512, null, 0, true);
                necVar.u = lmVar;
                if (lmVar.y && lmVar.f0) {
                    xi4.l("Failed to decode with ffmpeg software codecs");
                    return;
                }
                necVar.v = 1000.0f / lmVar.d[5];
                Bitmap r = lmVar.r(false);
                if (r != null) {
                    GLUtils.texImage2D(3553, 0, r, 0);
                }
                atomicInteger.set(necVar.u.getIntrinsicWidth());
                atomicInteger2.set(necVar.u.getIntrinsicHeight());
                atomicInteger3.set(necVar.u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, iArr[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(necVar.d, options);
            Pair N0 = hl.N0(necVar.d);
            if (((Integer) N0.first).intValue() != 0 || ((Integer) N0.second).intValue() != 0) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                if (((Integer) N0.second).intValue() != 0) {
                    matrix.postScale(((Integer) N0.second).intValue() == 1 ? -1.0f : 1.0f, ((Integer) N0.second).intValue() != 2 ? 1.0f : -1.0f);
                }
                if (((Integer) N0.first).intValue() != 0) {
                    matrix.postRotate(((Integer) N0.first).intValue());
                }
                decodeFile = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            Bitmap bitmap = decodeFile;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            atomicInteger.set(bitmap.getWidth());
            atomicInteger2.set(bitmap.getHeight());
        }
        float a = necVar.r.a(2.0f) - 1.0f;
        float f = -(((2.0f / r7.a.c) * r7.c) - 1.0f);
        float b = necVar.r.b(2.0f) - 1.0f;
        float f2 = -(((2.0f / r9.a.c) * r9.c) - 1.0f);
        float a2 = necVar.r.a(2.0f) - 1.0f;
        float f3 = -(((2.0f / r11.a.c) * (r11.c + 1)) - 1.0f);
        float b2 = necVar.r.b(2.0f) - 1.0f;
        zk2 zk2Var = necVar.r;
        int i2 = zk2Var.a.c;
        int i3 = zk2Var.c;
        float[] fArr = {a, f, b, f2, a2, f3, b2, -(((2.0f / i2) * (i3 + 1)) - 1.0f)};
        float f4 = this.transformedWidth / r15.d[i3];
        float f5 = this.transformedHeight / i2;
        int i4 = atomicInteger.get();
        int i5 = atomicInteger2.get();
        int i6 = atomicInteger3.get();
        float f6 = i4;
        float f7 = i5;
        float max = 1.0f / Math.max(f4 / f6, f5 / f7);
        float f8 = ((f4 * max) / f6) / 2.0f;
        float f9 = ((f5 * max) / f7) / 2.0f;
        if ((i6 / 90) % 2 == 1) {
            f9 = f8;
            f8 = f9;
        }
        float f10 = 0.5f - f8;
        float f11 = 0.5f - f9;
        float f12 = f8 + 0.5f;
        float f13 = f9 + 0.5f;
        float[] fArr2 = {f10, f11, f12, f11, f10, f13, f12, f13};
        while (i6 > 0) {
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f14;
            fArr2[3] = f15;
            i6 -= 90;
        }
        while (i6 < 0) {
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f16;
            fArr2[5] = f17;
            i6 += 90;
        }
        necVar.s = floats(fArr);
        necVar.t = floats(fArr2);
    }

    private void initLinkEntity(mec mecVar) {
        h66 h66Var = new h66(org.telegram.messenger.a.b, mecVar.Q);
        h66Var.V = true;
        h66Var.b(yac.t0, mecVar.a0, false);
        boolean e = h66Var.e();
        byte b = mecVar.b;
        if (e) {
            h66Var.setPreviewType(b);
        } else {
            h66Var.c(b, mecVar.l);
        }
        int i = mecVar.q;
        int i2 = h66Var.f;
        h66Var.setMaxWidth(i + i2 + i2);
        h66Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mecVar.r, TLObject.FLAG_30));
        h66Var.layout(0, 0, mecVar.q, mecVar.r);
        float f = mecVar.f * this.transformedWidth;
        int i3 = mecVar.q;
        float f2 = f / i3;
        mecVar.G = Bitmap.createBitmap(((int) (i3 * f2)) + 16, ((int) (mecVar.r * f2)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mecVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f2, f2);
        h66Var.draw(canvas);
        float f3 = 16.0f * f2;
        mecVar.h = f3 / this.transformedWidth;
        mecVar.i = f3 / this.transformedHeight;
    }

    private void initLocationEntity(mec mecVar) {
        float f;
        byte b = mecVar.a;
        ld6 ld6Var = new ld6(org.telegram.messenger.a.b, mecVar.Q);
        ld6Var.setIsVideo(true);
        ld6Var.setText(mecVar.j);
        ld6Var.e(mecVar.b, mecVar.l);
        if (mecVar.P != null && mecVar.k.isEmpty()) {
            ld6Var.d(yac.t0, mecVar.P.c);
        }
        ld6Var.setMaxWidth(mecVar.q);
        if (mecVar.k.size() == 1) {
            ld6Var.y = true;
            ld6Var.c = true;
            ld6Var.requestLayout();
        }
        ld6Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mecVar.r, TLObject.FLAG_30));
        ld6Var.layout(0, 0, mecVar.q, mecVar.r);
        float f2 = mecVar.f * this.transformedWidth;
        float f3 = mecVar.q;
        float f4 = f2 / f3;
        mecVar.G = Bitmap.createBitmap(((int) (f3 * f4)) + 16, ((int) (mecVar.r * f4)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mecVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f4, f4);
        ld6Var.draw(canvas);
        float f5 = 16.0f * f4;
        mecVar.h = f5 / this.transformedWidth;
        mecVar.i = f5 / this.transformedHeight;
        if (mecVar.k.size() == 1) {
            lec lecVar = (lec) mecVar.k.get(0);
            mec mecVar2 = new mec();
            lecVar.b = mecVar2;
            mecVar2.j = lecVar.a;
            mecVar2.b = lecVar.c;
            RectF rectF = new RectF();
            float f6 = ld6Var.J;
            float f7 = ld6Var.d.left + 2.25f;
            float f8 = ld6Var.E;
            float f9 = ld6Var.K;
            float f10 = ld6Var.O;
            float f11 = f8 * 21.33f;
            rectF.set((f7 * f8) + f6, bp1.z(f10, f11, 2.0f, f9), uh9.v(f7, 21.33f, f8, f6), qd4.e(f11, f10, 2.0f, f9));
            float centerX = ((rectF.centerX() / mecVar.q) * mecVar.f) + mecVar.c;
            float f12 = mecVar.d;
            float centerY = rectF.centerY() / mecVar.r;
            float f13 = mecVar.g;
            float f14 = (centerY * f13) + f12;
            if (mecVar.e != 0.0f) {
                float f15 = (mecVar.f / 2.0f) + mecVar.c;
                float f16 = (f13 / 2.0f) + mecVar.d;
                float f17 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f15;
                double d2 = (f14 - f16) / f17;
                f = 2.0f;
                float cos = ((float) ((Math.cos(-r2) * d) - (Math.sin(-mecVar.e) * d2))) + f15;
                f14 = (((float) ik8.d(-mecVar.e, d2, Math.sin(-mecVar.e) * d)) * f17) + f16;
                centerX = cos;
            } else {
                f = 2.0f;
            }
            lecVar.b.f = (rectF.width() / mecVar.q) * mecVar.f;
            lecVar.b.g = (rectF.height() / mecVar.r) * mecVar.g;
            mec mecVar3 = lecVar.b;
            float f18 = mecVar3.f * 1.2f;
            mecVar3.f = f18;
            float f19 = mecVar3.g * 1.2f;
            mecVar3.g = f19;
            mecVar3.c = centerX - (f18 / f);
            mecVar3.d = f14 - (f19 / f);
            mecVar3.e = mecVar.e;
            initStickerEntity(mecVar3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initStickerEntity(mec mecVar) {
        fo6 fo6Var;
        int i = (int) (mecVar.f * this.transformedWidth);
        mecVar.Y = i;
        int i2 = (int) (mecVar.g * this.transformedHeight);
        mecVar.Z = i2;
        int i3 = 512;
        if (i > 512) {
            i2 = (int) ((i2 / i) * 512.0f);
            mecVar.Z = i2;
            mecVar.Y = 512;
            i = 512;
        }
        if (i2 > 512) {
            i = (int) ((i / i2) * 512.0f);
            mecVar.Y = i;
            mecVar.Z = 512;
        } else {
            i3 = i2;
        }
        byte b = mecVar.b;
        if ((b & 1) != 0) {
            if (i <= 0 || i3 <= 0) {
                return;
            }
            mecVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
            RLottieNative a = RLottieNative.a(mecVar.j, null, null, null, 0, null);
            mecVar.D = a;
            mecVar.F = a != null ? a.a[1] / this.videoFps : 0.0f;
            return;
        }
        if ((b & 4) != 0) {
            mecVar.L = false;
            lm lmVar = new lm(new File(mecVar.j), true, 0L, 0, null, null, null, 0L, yac.t0, true, 512, 512, null, 0, true);
            mecVar.K = lmVar;
            mecVar.F = lmVar.d[5] / this.videoFps;
            mecVar.E = 1.0f;
            lmVar.r(true);
            return;
        }
        String str = mecVar.j;
        if (!TextUtils.isEmpty(mecVar.t) && (mecVar.b & 16) != 0) {
            str = mecVar.t;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (mecVar.a == 2) {
            options.inMutable = true;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        mecVar.G = decodeFile;
        if (decodeFile != null && (fo6Var = mecVar.u) != null) {
            decodeFile = Bitmap.createBitmap((int) Math.max(1.0f, fo6Var.e * decodeFile.getWidth()), (int) Math.max(1.0f, mecVar.u.f * mecVar.G.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(decodeFile);
            canvas.translate(decodeFile.getWidth() / 2.0f, decodeFile.getHeight() / 2.0f);
            canvas.rotate(-mecVar.u.z);
            int width = mecVar.G.getWidth();
            int height = mecVar.G.getHeight();
            fo6 fo6Var2 = mecVar.u;
            if (((fo6Var2.z + fo6Var2.k) / 90) % 2 == 1) {
                width = mecVar.G.getHeight();
                height = mecVar.G.getWidth();
            }
            fo6 fo6Var3 = mecVar.u;
            float f = fo6Var3.e;
            float f2 = fo6Var3.f;
            float f3 = width;
            float f4 = height;
            canvas.clipRect(((-width) * f) / 2.0f, ((-height) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
            float f5 = mecVar.u.c;
            canvas.scale(f5, f5);
            fo6 fo6Var4 = mecVar.u;
            canvas.translate(fo6Var4.a * f3, fo6Var4.b * f4);
            canvas.rotate(mecVar.u.d + r10.k);
            if (mecVar.u.l) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.rotate(mecVar.u.z);
            canvas.translate((-mecVar.G.getWidth()) / 2.0f, (-mecVar.G.getHeight()) / 2.0f);
            canvas.drawBitmap(mecVar.G, 0.0f, 0.0f, (Paint) null);
            mecVar.G.recycle();
            mecVar.G = decodeFile;
        }
        if (mecVar.a != 2 || decodeFile == null) {
            if (decodeFile != null) {
                float width2 = decodeFile.getWidth() / mecVar.G.getHeight();
                if (width2 > 1.0f) {
                    float f6 = mecVar.g;
                    float f7 = f6 / width2;
                    mecVar.d = bp1.z(f6, f7, 2.0f, mecVar.d);
                    mecVar.g = f7;
                    return;
                }
                if (width2 < 1.0f) {
                    float f8 = mecVar.f;
                    float f9 = width2 * f8;
                    mecVar.c = bp1.z(f8, f9, 2.0f, mecVar.c);
                    mecVar.f = f9;
                    return;
                }
                return;
            }
            return;
        }
        mecVar.s = hl.L(12.0f) / Math.min(mecVar.q, mecVar.r);
        Pair N0 = hl.N0(mecVar.j);
        mecVar.e = (float) (mecVar.e - Math.toRadians(((Integer) N0.first).intValue()));
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f10 = mecVar.c;
            float f11 = mecVar.f;
            float f12 = (f11 / 2.0f) + f10;
            float f13 = mecVar.d;
            float f14 = mecVar.g;
            float f15 = (f14 / 2.0f) + f13;
            float f16 = this.transformedWidth;
            float f17 = this.transformedHeight;
            float f18 = (f11 * f16) / f17;
            float f19 = (f14 * f17) / f16;
            mecVar.f = f19;
            mecVar.g = f18;
            mecVar.c = f12 - (f19 / 2.0f);
            mecVar.d = f15 - (f18 / 2.0f);
        }
        applyRoundRadius(mecVar, mecVar.G, 0);
    }

    private void initTextEntity(final mec mecVar) {
        int i;
        Typeface b;
        final ju3 ju3Var = new ju3(org.telegram.messenger.a.b);
        ju3Var.getPaint().setAntiAlias(true);
        ju3Var.H = false;
        ju3Var.setBackgroundColor(0);
        ju3Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        xv7 xv7Var = mecVar.n;
        if (xv7Var != null && (b = xv7Var.b()) != null) {
            ju3Var.setTypeface(b);
        }
        ju3Var.setTextSize(0, mecVar.m);
        SpannableString spannableString = new SpannableString(mecVar.j);
        ArrayList arrayList = mecVar.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            final lec lecVar = (lec) arrayList.get(i2);
            if (lecVar.a != null) {
                mec mecVar2 = new mec();
                lecVar.b = mecVar2;
                mecVar2.j = lecVar.a;
                mecVar2.b = lecVar.c;
                hm hmVar = new hm(0L, 1.0f, ju3Var.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.TextureRenderer.1
                    @Override // hm, android.text.style.ReplacementSpan
                    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                        super.draw(canvas, charSequence, i4, i5, f, i6, i7, i8, paint);
                        mec mecVar3 = mecVar;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (ju3Var.getPaddingLeft() + f)) / mecVar3.q) * mecVar3.f) + mecVar.c;
                        float f2 = mecVar3.d;
                        mec mecVar4 = mecVar;
                        float paddingTop = (((i8 - i6) / 2.0f) + (ju3Var.getPaddingTop() + i6)) / mecVar4.r;
                        float f3 = mecVar4.g;
                        float f4 = (paddingTop * f3) + f2;
                        if (mecVar4.e != 0.0f) {
                            float f5 = (mecVar4.f / 2.0f) + mecVar4.c;
                            float f6 = (f3 / 2.0f) + mecVar4.d;
                            float f7 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = paddingLeft - f5;
                            double d2 = (f4 - f6) / f7;
                            paddingLeft = ((float) ((Math.cos(-mecVar.e) * d) - (Math.sin(-mecVar.e) * d2))) + f5;
                            f4 = (((float) ik8.d(-mecVar.e, d2, Math.sin(-mecVar.e) * d)) * f7) + f6;
                        }
                        mec mecVar5 = lecVar.b;
                        float f8 = this.measuredSize;
                        mec mecVar6 = mecVar;
                        float f9 = (f8 / mecVar6.q) * mecVar6.f;
                        mecVar5.f = f9;
                        float f10 = (f8 / mecVar6.r) * mecVar6.g;
                        mecVar5.g = f10;
                        mecVar5.c = paddingLeft - (f9 / 2.0f);
                        mecVar5.d = f4 - (f10 / 2.0f);
                        mecVar5.e = mecVar6.e;
                        if (mecVar5.G == null) {
                            TextureRenderer.this.initStickerEntity(mecVar5);
                        }
                    }
                };
                int i4 = lecVar.offset;
                spannableString.setSpan(hmVar, i4, lecVar.length + i4, 33);
            }
            i2 = i3;
        }
        ju3Var.setText(pv3.m(spannableString, ju3Var.getPaint().getFontMetricsInt(), false, null, 0));
        ju3Var.setTextColor(mecVar.l);
        Editable text = ju3Var.getText();
        if (text != null) {
            for (mv3 mv3Var : (mv3[]) text.getSpans(0, text.length(), mv3.class)) {
                mv3Var.b = 0.85f;
            }
        }
        int i5 = mecVar.p;
        ju3Var.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
        int i6 = mecVar.p;
        if (i6 != 1) {
            boolean z = ob6.a0;
            i = (i6 == 2 ? !z : z) ? 3 : 2;
        } else {
            i = 4;
        }
        ju3Var.setTextAlignment(i);
        ju3Var.setHorizontallyScrolling(false);
        ju3Var.setImeOptions(TLObject.FLAG_28);
        ju3Var.setFocusableInTouchMode(true);
        ju3Var.setInputType(ju3Var.getInputType() | TLObject.FLAG_14);
        setBreakStrategy(ju3Var);
        byte b2 = mecVar.b;
        if (b2 == 0) {
            ju3Var.setFrameColor(mecVar.l);
            ju3Var.setTextColor(hl.B(mecVar.l) >= 0.721f ? -16777216 : -1);
        } else if (b2 == 1) {
            ju3Var.setFrameColor(hl.B(mecVar.l) >= 0.25f ? -1728053248 : -1711276033);
            ju3Var.setTextColor(mecVar.l);
        } else if (b2 == 2) {
            ju3Var.setFrameColor(hl.B(mecVar.l) >= 0.25f ? -16777216 : -1);
            ju3Var.setTextColor(mecVar.l);
        } else if (b2 == 3) {
            ju3Var.setFrameColor(0);
            ju3Var.setTextColor(mecVar.l);
        }
        if (mecVar.a == 11) {
            ju3Var.setMaxLines(3);
            kc1.v(ju3Var, mecVar.b);
        }
        ju3Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mecVar.r, TLObject.FLAG_30));
        ju3Var.layout(0, 0, mecVar.q, mecVar.r);
        mecVar.G = Bitmap.createBitmap(mecVar.q, mecVar.r, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mecVar.G);
        if (mecVar.a == 11 && mecVar.X != null) {
            ju3Var.setTallFrame(true);
            ju3Var.setSpokenWords(mecVar.X);
            ju3Var.A(mecVar.V);
            mecVar.I = ju3Var;
            mecVar.J = canvas;
        }
        ju3Var.draw(canvas);
    }

    private boolean isCollage() {
        return this.collageParts != null;
    }

    private void stepCollagePart(int i, nec necVar, long j) {
        lm lmVar;
        float f;
        Bitmap r;
        long j2;
        long j3 = (j / 1000000) - necVar.f;
        float f2 = necVar.k;
        long j4 = necVar.o;
        long k = Utilities.k(j3, (long) (f2 * j4), (long) (necVar.j * j4));
        MediaCodecPlayer mediaCodecPlayer = necVar.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k);
            necVar.z.updateTexImage();
            return;
        }
        lm lmVar2 = necVar.u;
        if (lmVar2 != null) {
            int i2 = lmVar2.d[3];
            boolean z = i2 <= 0;
            if ((k < i2 || (z && k > 1000)) && lmVar2.e0 != null) {
                lmVar2.e0.g(k, true);
            }
            do {
                lmVar = necVar.u;
                int i3 = lmVar.d[3];
                f = k;
                if ((necVar.v * 2.0f) + i3 >= f) {
                    break;
                }
                j2 = i3;
                if (lmVar.e0 != null) {
                    lmVar.e0.c(null, false, lmVar.h0, lmVar.i0, false);
                }
                lmVar = necVar.u;
            } while (lmVar.d[3] != j2);
            if ((z || f > lmVar.d[3] - (necVar.v / 2.0f)) && (r = lmVar.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLUtils.texImage2D(3553, 0, r, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        int createProgram;
        int createProgram2;
        String str3 = this.messageVideoMaskPath != null ? z ? VERTEX_SHADER_MASK_300 : VERTEX_SHADER_MASK : z ? VERTEX_SHADER_300 : VERTEX_SHADER;
        int i = this.NUM_EXTERNAL_SHADER;
        if (i >= 0 && i < this.mProgram.length && (createProgram2 = createProgram(str3, str, z)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i2 = this.NUM_FILTER_SHADER;
        if (i2 < 0 || i2 >= this.mProgram.length || (createProgram = createProgram(str3, str2, z)) == 0) {
            return;
        }
        GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
        this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i3 = 3042;
            i6 = 0;
            i = 33985;
            i7 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (f11.a && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i = 33985;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i11]);
                    sb.append(", ");
                    i11++;
                }
                cc4.b("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            } else {
                i = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            uf4 uf4Var = this.filterShaders;
            if (uf4Var != null) {
                uf4Var.P0 = this.mSTMatrix;
                uf4Var.W0 = false;
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.f();
                this.filterShaders.d();
                this.filterShaders.e();
                this.filterShaders.c();
                boolean b = this.filterShaders.b();
                GLES20.glBindFramebuffer(36160, 0);
                int i12 = this.transformedWidth;
                if (i12 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i12, this.transformedHeight);
                }
                int g = this.filterShaders.g(!b ? 1 : 0);
                int i13 = this.NUM_FILTER_SHADER;
                i3 = 3042;
                fArr = this.mSTMatrixIdentity;
                i4 = i13;
                i5 = g;
                i6 = b ? 1 : 0;
                i2 = 3553;
            } else {
                int i14 = this.mTextureID;
                int i15 = this.NUM_EXTERNAL_SHADER;
                i2 = 36197;
                i3 = 3042;
                fArr = this.mSTMatrix;
                i4 = i15;
                i5 = i14;
                i6 = 0;
            }
            drawBackground();
            i7 = 33984;
            GLES20.glUseProgram(this.mProgram[i4]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i2, i5);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i4], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i4], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i4]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[i4], 2, 5126, false, 8, (Buffer) (this.useMatrixForImagePath ? this.croppedTextureBuffer : this.renderTextureBuffer));
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i4]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i4], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i4]);
            }
            int i16 = this.texSizeHandle;
            if (i16 != 0) {
                GLES20.glUniform2f(i16, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i4], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i4], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i3);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath == null || (iArr = this.paintTexture) == null) {
                uf4 uf4Var2 = this.filterShaders;
                if (uf4Var2 != null) {
                    i8 = uf4Var2.g(i6 ^ 1);
                    uf4 uf4Var3 = this.filterShaders;
                    int i17 = uf4Var3.X0;
                    i10 = uf4Var3.Y0;
                    i9 = i17;
                } else {
                    i8 = -1;
                    i9 = 1;
                    i10 = 1;
                }
            } else {
                i8 = iArr[0];
                i9 = this.imageWidth;
                i10 = this.imageHeight;
            }
            if (i8 != -1) {
                this.blur.a(i8, i9, i10, null);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i7);
                GLES20.glBindTexture(3553, this.blur.s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i18 = 0; i18 < this.collageParts.size(); i18++) {
                stepCollagePart(i18, this.collageParts.get(i18), j);
                drawCollagePart(i18, this.collageParts.get(i18), j);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i7);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            drawTexture(true, this.paintTexture[this.imagePathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto, -1);
        }
        int i19 = this.paintPathIndex;
        if (i19 >= 0) {
            drawTexture(true, this.paintTexture[i19], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i20 = this.messagePathIndex;
        if (i20 >= 0) {
            drawTexture(true, this.paintTexture[i20], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i21 = 0; i21 < size; i21++) {
                drawEntity(this.mediaEntities.get(i21), this.mediaEntities.get(i21).l, j);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<mec> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mec mecVar = this.mediaEntities.get(i);
                RLottieNative rLottieNative = mecVar.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                lm lmVar = mecVar.K;
                if (lmVar != null) {
                    lmVar.u();
                }
                View view = mecVar.I;
                if (view instanceof cu3) {
                    cu3 cu3Var = (cu3) view;
                    hm.release(cu3Var, cu3Var.F);
                }
                Bitmap bitmap = mecVar.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    mecVar.G = null;
                }
            }
        }
        ArrayList<nec> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                arrayList2.get(i2);
                i2++;
                for (int i3 = 0; i3 < this.collageParts.size(); i3++) {
                    destroyCollagePart(i3, this.collageParts.get(i3));
                }
            }
        }
    }

    public void setBreakStrategy(ju3 ju3Var) {
        ju3Var.setBreakStrategy(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void surfaceCreated() {
        int i;
        String str;
        int i2;
        int i3;
        fo6 fo6Var;
        String str2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.mProgram;
            String str3 = null;
            if (i5 >= iArr.length) {
                break;
            }
            int i6 = this.NUM_EXTERNAL_SHADER;
            String str4 = VERTEX_SHADER_MASK;
            String str5 = VERTEX_SHADER;
            if (i5 == i6) {
                if (this.messageVideoMaskPath != null) {
                    str2 = FRAGMENT_EXTERNAL_MASK_SHADER;
                    str3 = str2;
                    str5 = str4;
                    if (str3 != null) {
                        iArr[i5] = createProgram(str5, str3, false);
                        this.maPositionHandle[i5] = GLES20.glGetAttribLocation(this.mProgram[i5], "aPosition");
                        this.maTextureHandle[i5] = GLES20.glGetAttribLocation(this.mProgram[i5], "aTextureCoord");
                        this.mmTextureHandle[i5] = GLES20.glGetAttribLocation(this.mProgram[i5], "mTextureCoord");
                        this.muMVPMatrixHandle[i5] = GLES20.glGetUniformLocation(this.mProgram[i5], "uMVPMatrix");
                        this.muSTMatrixHandle[i5] = GLES20.glGetUniformLocation(this.mProgram[i5], "uSTMatrix");
                        this.maskTextureHandle[i5] = GLES20.glGetUniformLocation(this.mProgram[i5], "sMask");
                        if (i5 == this.NUM_GRADIENT_SHADER) {
                            this.gradientTopColorHandle = GLES20.glGetUniformLocation(this.mProgram[i5], "gradientTopColor");
                            this.gradientBottomColorHandle = GLES20.glGetUniformLocation(this.mProgram[i5], "gradientBottomColor");
                        }
                    }
                    i5++;
                } else {
                    str2 = FRAGMENT_EXTERNAL_SHADER;
                    str4 = VERTEX_SHADER;
                    str3 = str2;
                    str5 = str4;
                    if (str3 != null) {
                    }
                    i5++;
                }
            } else if (i5 != this.NUM_FILTER_SHADER) {
                if (i5 == this.NUM_GRADIENT_SHADER) {
                    str3 = GRADIENT_FRAGMENT_SHADER;
                }
                if (str3 != null) {
                }
                i5++;
            } else if (this.messageVideoMaskPath != null) {
                str2 = FRAGMENT_MASK_SHADER;
                str3 = str2;
                str5 = str4;
                if (str3 != null) {
                }
                i5++;
            } else {
                str2 = FRAGMENT_SHADER;
                str4 = VERTEX_SHADER;
                str3 = str2;
                str5 = str4;
                if (str3 != null) {
                }
                i5++;
            }
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i7 = iArr2[0];
        this.mTextureID = i7;
        GLES20.glBindTexture(36197, i7);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        if (this.messageVideoMaskPath != null) {
            try {
                GLES20.glGenTextures(1, iArr2, 0);
                int i8 = iArr2[0];
                this.videoMaskTexture = i8;
                GLES20.glBindTexture(3553, i8);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.messageVideoMaskPath);
                GLUtils.texImage2D(3553, 0, decodeFile, 0);
                decodeFile.recycle();
            } catch (Exception e) {
                cc4.g(e, true);
                this.videoMaskTexture = -1;
            }
        }
        if (this.blurPath != null && (fo6Var = this.cropState) != null && fo6Var.B != null) {
            yl0 yl0Var = new yl0();
            this.blur = yl0Var;
            if (yl0Var.b(this.transformedWidth / this.transformedHeight, 0)) {
                yl0 yl0Var2 = this.blur;
                int i9 = this.gradientTopColor;
                int i10 = this.gradientBottomColor;
                yl0Var2.l = i9;
                yl0Var2.m = i10;
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postScale(this.originalWidth, this.originalHeight);
                matrix.postConcat(this.cropState.B);
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
                int h = uf4.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                int h2 = uf4.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D blurImage;uniform sampler2D maskImage;void main() {gl_FragColor = texture2D(blurImage, vTextureCoord) * texture2D(maskImage, vTextureCoord).a;}");
                if (h == 0 || h2 == 0) {
                    this.blur = null;
                } else {
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.blurShaderProgram = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(this.blurShaderProgram, h2);
                    GLES20.glBindAttribLocation(this.blurShaderProgram, 0, "position");
                    GLES20.glBindAttribLocation(this.blurShaderProgram, 1, "inputTexCoord");
                    GLES20.glLinkProgram(this.blurShaderProgram);
                    int[] iArr4 = new int[1];
                    GLES20.glGetProgramiv(this.blurShaderProgram, 35714, iArr4, 0);
                    int i11 = iArr4[0];
                    int i12 = this.blurShaderProgram;
                    if (i11 == 0) {
                        GLES20.glDeleteProgram(i12);
                        this.blurShaderProgram = 0;
                    } else {
                        this.blurPositionHandle = GLES20.glGetAttribLocation(i12, "position");
                        this.blurInputTexCoordHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "inputTexCoord");
                        this.blurBlurImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "blurImage");
                        this.blurMaskImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "maskImage");
                        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.blurVerticesBuffer = asFloatBuffer;
                        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f}).position(0);
                    }
                }
            }
        }
        if (this.filterShaders != null || this.imagePath != null || this.paintPath != null || this.messagePath != null || this.mediaEntities != null || isCollage()) {
            int h3 = uf4.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h4 = uf4.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
            if (h3 != 0 && h4 != 0) {
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.simpleShaderProgram = glCreateProgram2;
                GLES20.glAttachShader(glCreateProgram2, h3);
                GLES20.glAttachShader(this.simpleShaderProgram, h4);
                GLES20.glBindAttribLocation(this.simpleShaderProgram, 0, "position");
                GLES20.glBindAttribLocation(this.simpleShaderProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.simpleShaderProgram);
                int[] iArr5 = new int[1];
                GLES20.glGetProgramiv(this.simpleShaderProgram, 35714, iArr5, 0);
                int i13 = iArr5[0];
                int i14 = this.simpleShaderProgram;
                if (i13 == 0) {
                    GLES20.glDeleteProgram(i14);
                    this.simpleShaderProgram = 0;
                } else {
                    this.simplePositionHandle = GLES20.glGetAttribLocation(i14, "position");
                    this.simpleInputTexCoordHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "inputTexCoord");
                    this.simpleSourceImageHandle = GLES20.glGetUniformLocation(this.simpleShaderProgram, "sTexture");
                }
            }
        }
        if (isCollage()) {
            int h5 = uf4.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h6 = uf4.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replaceAll("sampler2D", "samplerExternalOES"));
            if (h5 != 0 && h6 != 0) {
                int glCreateProgram3 = GLES20.glCreateProgram();
                this.simpleShaderProgramOES = glCreateProgram3;
                GLES20.glAttachShader(glCreateProgram3, h5);
                GLES20.glAttachShader(this.simpleShaderProgramOES, h6);
                GLES20.glBindAttribLocation(this.simpleShaderProgramOES, 0, "position");
                GLES20.glBindAttribLocation(this.simpleShaderProgramOES, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.simpleShaderProgramOES);
                int[] iArr6 = new int[1];
                GLES20.glGetProgramiv(this.simpleShaderProgramOES, 35714, iArr6, 0);
                int i15 = iArr6[0];
                int i16 = this.simpleShaderProgramOES;
                if (i15 == 0) {
                    GLES20.glDeleteProgram(i16);
                    this.simpleShaderProgramOES = 0;
                } else {
                    this.simplePositionHandleOES = GLES20.glGetAttribLocation(i16, "position");
                    this.simpleInputTexCoordHandleOES = GLES20.glGetAttribLocation(this.simpleShaderProgramOES, "inputTexCoord");
                    this.simpleSourceImageHandleOES = GLES20.glGetUniformLocation(this.simpleShaderProgramOES, "sTexture");
                }
            }
        }
        uf4 uf4Var = this.filterShaders;
        if (uf4Var != null) {
            uf4Var.a();
            this.filterShaders.i(null, 0, this.mTextureID, this.originalWidth, this.originalHeight);
        }
        String str6 = this.imagePath;
        if (str6 != null || this.paintPath != null || this.messagePath != null) {
            if (str6 != null) {
                this.imagePathIndex = 0;
                i = 1;
            } else {
                i = 0;
            }
            if (this.paintPath != null) {
                this.paintPathIndex = i;
                i++;
            }
            if (this.messagePath != null) {
                this.messagePathIndex = i;
                i++;
            }
            if (this.backgroundPath != null) {
                this.backgroundPathIndex = i;
                i++;
            }
            int[] iArr7 = new int[i];
            this.paintTexture = iArr7;
            GLES20.glGenTextures(i, iArr7, 0);
            int i17 = 0;
            while (i17 < this.paintTexture.length) {
                try {
                    if (i17 == this.imagePathIndex) {
                        str = this.imagePath;
                        Pair N0 = hl.N0(str);
                        i3 = ((Integer) N0.first).intValue();
                        i2 = ((Integer) N0.second).intValue();
                    } else {
                        str = i17 == this.paintPathIndex ? this.paintPath : i17 == this.backgroundPathIndex ? this.backgroundPath : this.messagePath;
                        i2 = i4;
                        i3 = i2;
                    }
                    Bitmap decodeFile3 = BitmapFactory.decodeFile(str);
                    if (decodeFile3 != null) {
                        if (i17 == this.imagePathIndex && !this.useMatrixForImagePath) {
                            Bitmap createBitmap = Bitmap.createBitmap(this.transformedWidth, this.transformedHeight, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(-16777216);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = (i3 == 90 || i3 == 270) ? Math.max(decodeFile3.getHeight() / this.transformedWidth, decodeFile3.getWidth() / this.transformedHeight) : Math.max(decodeFile3.getWidth() / this.transformedWidth, decodeFile3.getHeight() / this.transformedHeight);
                            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                            matrix3.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                            matrix3.postScale((i2 == 1 ? -1.0f : 1.0f) / max, (i2 != 2 ? 1.0f : -1.0f) / max);
                            matrix3.postRotate(i3);
                            matrix3.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                            canvas.drawBitmap(decodeFile3, matrix3, new Paint(2));
                            decodeFile3 = createBitmap;
                        }
                        if (i17 == this.imagePathIndex) {
                            this.imageWidth = decodeFile3.getWidth();
                            this.imageHeight = decodeFile3.getHeight();
                        }
                        GLES20.glBindTexture(3553, this.paintTexture[i17]);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLUtils.texImage2D(3553, 0, decodeFile3, 0);
                    }
                    i17++;
                    i4 = 0;
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        }
        if (isCollage()) {
            try {
                int size = this.collageParts.size();
                int[] iArr8 = new int[size];
                this.collageTextures = iArr8;
                GLES20.glGenTextures(size, iArr8, 0);
                for (int i18 = 0; i18 < this.collageParts.size(); i18++) {
                    initCollagePart(i18, this.collageParts.get(i18));
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
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
            for (int i19 = 0; i19 < size2; i19++) {
                mec mecVar = this.mediaEntities.get(i19);
                byte b = mecVar.a;
                if (b == 0 || b == 2 || b == 5) {
                    initStickerEntity(mecVar);
                } else if (b == 1) {
                    initTextEntity(mecVar);
                } else if (b == 3) {
                    initLocationEntity(mecVar);
                } else if (b == 7) {
                    initLinkEntity(mecVar);
                }
            }
        } catch (Throwable th2) {
            cc4.g(th2, true);
        }
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2) {
        drawTexture(z, i, f, f2, f3, f4, f5, z2, false, -1);
    }

    private void drawTexture(boolean z, int i) {
        drawTexture(z, i, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }
}
