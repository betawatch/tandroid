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
import ig.h0;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.t0;
import jg.y0;
import n2.u;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.ff;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.u20;
import org.telegram.messenger.v2;
import org.telegram.messenger.v20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w0;
import org.telegram.messenger.w20;
import org.telegram.messenger.ye;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.x9;
import vh.k4;
import vh.m5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    private x9 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<w20> collageParts;
    private int[] collageTextures;
    private final ye cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<f5> emojiDrawables;
    private jz filterShaders;
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
    private ArrayList<v20> mediaEntities;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x040b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextureRenderer(ff ffVar, String str, String str2, String str3, ArrayList<v20> arrayList, ye yeVar, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, Integer num, Integer num2, m5 m5Var, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        int i15;
        char c10;
        int i16;
        float f10;
        char c11;
        int i17;
        float f11;
        int i18;
        int i19;
        int i20;
        float[] fArr;
        int i21;
        int i22 = i10;
        int i23 = i11;
        float f12 = f7;
        this.NUM_FILTER_SHADER = -1;
        this.NUM_EXTERNAL_SHADER = -1;
        this.NUM_GRADIENT_SHADER = -1;
        this.isPhoto = z10;
        this.collageParts = convertVideoParams.collageParts;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (v2.a) {
            StringBuilder m10 = i0.a.m("start textureRenderer w = ", i22, " h = ", i23, " r = ");
            m10.append(i14);
            m10.append(" fps = ");
            m10.append(f12);
            f8.b(m10.toString());
            if (yeVar != null) {
                f8.b("cropState px = " + yeVar.a + " py = " + yeVar.b + " cScale = " + yeVar.c + " cropRotate = " + yeVar.d + " pw = " + yeVar.e + " ph = " + yeVar.f + " tw = " + yeVar.i + " th = " + yeVar.j + " tr = " + yeVar.k + " mirror = " + yeVar.l);
            }
        }
        FloatBuffer g10 = z20.g(ByteBuffer.allocateDirect(32));
        this.textureBuffer = g10;
        g10.put(fArr2).position(0);
        int i24 = 4;
        FloatBuffer g11 = z20.g(ByteBuffer.allocateDirect(this.bitmapData.length * 4));
        this.bitmapVerticesBuffer = g11;
        g11.put(this.bitmapData).position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        Matrix.setIdentityM(this.mSTMatrixIdentity, 0);
        if (ffVar != null) {
            jz jzVar = new jz(true, m5Var);
            this.filterShaders = jzVar;
            i15 = 32;
            jzVar.f1 = new u(ffVar, 10);
        } else {
            i15 = 32;
        }
        this.transformedWidth = i22;
        this.transformedHeight = i23;
        this.originalWidth = i12;
        this.originalHeight = i13;
        this.imagePath = str;
        this.paintPath = str2;
        this.messagePath = convertVideoParams.messagePath;
        this.messageVideoMaskPath = convertVideoParams.messageVideoMaskPath;
        this.backgroundPath = convertVideoParams.backgroundPath;
        this.blurPath = str3;
        this.mediaEntities = arrayList;
        this.videoFps = f12 == 0.0f ? 30.0f : f12;
        this.cropState = yeVar;
        this.NUM_EXTERNAL_SHADER = 0;
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        long j10 = convertVideoParams.wallpaperPeerId;
        float f13 = 1.0f;
        if (j10 != Long.MIN_VALUE) {
            c10 = 6;
            this.backgroundDrawable = k4.e(null, convertVideoParams.account, j10, convertVideoParams.isDark);
        } else {
            c10 = 6;
            if (num2 != null && num != null) {
                FloatBuffer g12 = z20.g(ByteBuffer.allocateDirect(i15));
                this.gradientVerticesBuffer = g12;
                g12.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                boolean z11 = this.isPhoto;
                float[] fArr3 = {0.0f, z11 ? 1.0f : 0.0f, 1.0f, z11 ? 1.0f : 0.0f, 0.0f, z11 ? 0.0f : 1.0f, 1.0f, z11 ? 0.0f : 1.0f};
                FloatBuffer g13 = z20.g(ByteBuffer.allocateDirect(i15));
                this.gradientTextureBuffer = g13;
                g13.put(fArr3).position(0);
                this.gradientTopColor = num.intValue();
                this.gradientBottomColor = num2.intValue();
                this.NUM_GRADIENT_SHADER = 1;
                i16 = 2;
                if (this.filterShaders != null) {
                    this.NUM_FILTER_SHADER = i16;
                    i16++;
                }
                this.mProgram = new int[i16];
                this.muMVPMatrixHandle = new int[i16];
                this.muSTMatrixHandle = new int[i16];
                this.maPositionHandle = new int[i16];
                this.maTextureHandle = new int[i16];
                this.mmTextureHandle = new int[i16];
                this.maskTextureHandle = new int[i16];
                if (yeVar == null) {
                    android.graphics.Matrix matrix = yeVar.B;
                    float f14 = 2.0f;
                    if (matrix == null) {
                        c11 = 1;
                        f11 = 0.5f;
                        i18 = 90;
                        float[] fArr4 = new float[8];
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        float f15 = i22;
                        fArr4[2] = f15;
                        fArr4[3] = 0.0f;
                        fArr4[4] = 0.0f;
                        float f16 = i23;
                        fArr4[5] = f16;
                        fArr4[c10] = f15;
                        fArr4[7] = f16;
                        i19 = yeVar.k;
                        this.transformedWidth = (int) (this.transformedWidth * yeVar.e);
                        this.transformedHeight = (int) (this.transformedHeight * yeVar.f);
                        float f17 = (float) ((-yeVar.d) * 0.017453292519943295d);
                        int i25 = 0;
                        while (i25 < 4) {
                            int i26 = i25 * 2;
                            int i27 = i26 + 1;
                            float f18 = f13;
                            float f19 = f14;
                            double d = fArr4[i26] - (i22 / 2);
                            double d10 = f17;
                            double d11 = fArr4[i27] - (i23 / 2);
                            float cos = ((float) (((Math.cos(d10) * d) - (Math.sin(d10) * d11)) + (yeVar.a * f15))) * yeVar.c;
                            float c12 = ((float) (i0.a.c(d10, d11, Math.sin(d10) * d) - (yeVar.b * f16))) * yeVar.c;
                            fArr4[i26] = (cos / this.transformedWidth) * f19;
                            fArr4[i27] = (c12 / this.transformedHeight) * f19;
                            i25++;
                            f13 = f18;
                            i22 = i10;
                            i23 = i11;
                            f14 = f19;
                            f17 = f17;
                        }
                        f10 = f13;
                        FloatBuffer g14 = z20.g(ByteBuffer.allocateDirect(i15));
                        this.verticesBuffer = g14;
                        i17 = 0;
                        g14.put(fArr4).position(0);
                        if (this.filterShaders == null) {
                            i20 = 4;
                            if (i19 == i18) {
                                fArr = new float[8];
                                fArr[i17] = f10;
                                fArr[c11] = 0.0f;
                                fArr[2] = f10;
                                fArr[3] = f10;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c10] = 0.0f;
                                fArr[7] = f10;
                            } else if (i19 == 180) {
                                fArr = new float[8];
                                fArr[i17] = f10;
                                fArr[c11] = f10;
                                fArr[2] = 0.0f;
                                fArr[3] = f10;
                                fArr[4] = f10;
                                fArr[5] = 0.0f;
                                fArr[c10] = 0.0f;
                                fArr[7] = 0.0f;
                            } else if (i19 == 270) {
                                fArr = new float[8];
                                fArr[i17] = 0.0f;
                                fArr[c11] = f10;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f10;
                                fArr[5] = f10;
                                fArr[c10] = f10;
                                fArr[7] = 0.0f;
                            } else {
                                fArr = new float[8];
                                fArr[i17] = 0.0f;
                                fArr[c11] = 0.0f;
                                fArr[2] = f10;
                                fArr[3] = 0.0f;
                                fArr[4] = 0.0f;
                                fArr[5] = f10;
                                fArr[c10] = f10;
                                fArr[7] = f10;
                            }
                        } else if (i19 == i18) {
                            fArr = new float[8];
                            fArr[i17] = f10;
                            fArr[c11] = f10;
                            fArr[2] = f10;
                            fArr[3] = 0.0f;
                            i20 = 4;
                            fArr[4] = 0.0f;
                            fArr[5] = f10;
                            fArr[c10] = 0.0f;
                            fArr[7] = 0.0f;
                        } else {
                            i20 = 4;
                            if (i19 == 180) {
                                fArr = new float[8];
                                fArr[i17] = f10;
                                fArr[c11] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f10;
                                fArr[5] = f10;
                                fArr[c10] = 0.0f;
                                fArr[7] = f10;
                            } else if (i19 == 270) {
                                fArr = new float[8];
                                fArr[i17] = 0.0f;
                                fArr[c11] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = f10;
                                fArr[4] = f10;
                                fArr[5] = 0.0f;
                                fArr[c10] = f10;
                                fArr[7] = f10;
                            } else {
                                fArr = new float[8];
                                fArr[i17] = 0.0f;
                                fArr[c11] = f10;
                                fArr[2] = f10;
                                fArr[3] = f10;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c10] = f10;
                                fArr[7] = 0.0f;
                            }
                        }
                        if (yeVar != null && yeVar.l) {
                            i21 = 0;
                            while (i21 < i20) {
                                int i28 = i21 * 2;
                                if (fArr[i28] > f11) {
                                    fArr[i28] = 0.0f;
                                } else {
                                    fArr[i28] = f10;
                                }
                                i21++;
                                i20 = 4;
                            }
                        }
                        FloatBuffer g15 = z20.g(ByteBuffer.allocateDirect(fArr.length * 4));
                        this.renderTextureBuffer = g15;
                        g15.put(fArr).position(0);
                        FloatBuffer g16 = z20.g(ByteBuffer.allocateDirect(i15));
                        this.maskTextureBuffer = g16;
                        g16.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
                    }
                    this.useMatrixForImagePath = true;
                    float f20 = yeVar.e;
                    f11 = 0.5f;
                    float f21 = yeVar.f;
                    i18 = 90;
                    if ((yeVar.z / 90) % 2 == 1) {
                        f20 = f21;
                        f21 = f20;
                    }
                    float f22 = (1.0f - f20) / 2.0f;
                    float f23 = (1.0f - f21) / 2.0f;
                    c11 = 1;
                    float[] fArr5 = new float[8];
                    float f24 = i12;
                    float f25 = f24 * f22;
                    fArr5[0] = f25;
                    float f26 = i13;
                    float f27 = f26 * f23;
                    fArr5[1] = f27;
                    float f28 = (f22 + f20) * f24;
                    fArr5[2] = f28;
                    fArr5[3] = f27;
                    fArr5[4] = f25;
                    float f29 = (f23 + f21) * f26;
                    fArr5[5] = f29;
                    fArr5[c10] = f28;
                    fArr5[7] = f29;
                    matrix.mapPoints(fArr5);
                    int i29 = 0;
                    while (i29 < i24) {
                        int i30 = i29 * 2;
                        fArr5[i30] = ((fArr5[i30] / i22) * 2.0f) - 1.0f;
                        int i31 = i30 + 1;
                        fArr5[i31] = z20.v(fArr5[i31], i23, 2.0f, 1.0f);
                        i29++;
                        i24 = i24;
                    }
                    int i32 = i24;
                    FloatBuffer g17 = z20.g(ByteBuffer.allocateDirect(i15));
                    this.verticesBuffer = g17;
                    g17.put(fArr5).position(0);
                    float[] fArr6 = new float[8];
                    float f30 = f20 * f24;
                    float f31 = f30 * (-0.5f);
                    fArr6[0] = f31;
                    float f32 = f21 * f26;
                    float f33 = (-0.5f) * f32;
                    fArr6[1] = f33;
                    float f34 = f30 * 0.5f;
                    fArr6[2] = f34;
                    fArr6[3] = f33;
                    fArr6[i32] = f31;
                    float f35 = f32 * 0.5f;
                    fArr6[5] = f35;
                    fArr6[c10] = f34;
                    fArr6[7] = f35;
                    float f36 = (float) ((-yeVar.d) * 0.017453292519943295d);
                    int i33 = 0;
                    for (int i34 = i32; i33 < i34; i34 = 4) {
                        int i35 = i33 * 2;
                        float f37 = fArr6[i35];
                        int i36 = i35 + 1;
                        float f38 = fArr6[i36];
                        double d12 = f37 - (yeVar.a * f24);
                        double d13 = f36;
                        double d14 = f38 - (yeVar.b * f26);
                        float cos2 = ((float) ((Math.cos(d13) * d12) - (Math.sin(d13) * d14))) / f24;
                        float c13 = ((float) i0.a.c(d13, d14, Math.sin(d13) * d12)) / f26;
                        float f39 = yeVar.c;
                        fArr6[i35] = (cos2 / f39) + 0.5f;
                        fArr6[i36] = (c13 / f39) + 0.5f;
                        i33++;
                    }
                    if (this.filterShaders == null && !this.isPhoto && this.messageVideoMaskPath == null) {
                        fArr6[1] = 1.0f - fArr6[1];
                        fArr6[3] = 1.0f - fArr6[3];
                        fArr6[5] = 1.0f - fArr6[5];
                        fArr6[7] = 1.0f - fArr6[7];
                    }
                    FloatBuffer g18 = z20.g(ByteBuffer.allocateDirect(i15));
                    this.croppedTextureBuffer = g18;
                    i17 = 0;
                    g18.put(fArr6).position(0);
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    c11 = 1;
                    i17 = 0;
                    f11 = 0.5f;
                    i18 = 90;
                    FloatBuffer g19 = z20.g(ByteBuffer.allocateDirect(i15));
                    this.verticesBuffer = g19;
                    g19.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                }
                i19 = i17;
                if (this.filterShaders == null) {
                }
                if (yeVar != null) {
                    i21 = 0;
                    while (i21 < i20) {
                    }
                }
                FloatBuffer g152 = z20.g(ByteBuffer.allocateDirect(fArr.length * 4));
                this.renderTextureBuffer = g152;
                g152.put(fArr).position(0);
                FloatBuffer g162 = z20.g(ByteBuffer.allocateDirect(i15));
                this.maskTextureBuffer = g162;
                g162.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            }
        }
        i16 = 1;
        if (this.filterShaders != null) {
        }
        this.mProgram = new int[i16];
        this.muMVPMatrixHandle = new int[i16];
        this.muSTMatrixHandle = new int[i16];
        this.maPositionHandle = new int[i16];
        this.maTextureHandle = new int[i16];
        this.mmTextureHandle = new int[i16];
        this.maskTextureHandle = new int[i16];
        if (yeVar == null) {
        }
        i19 = i17;
        if (this.filterShaders == null) {
        }
        if (yeVar != null) {
        }
        FloatBuffer g1522 = z20.g(ByteBuffer.allocateDirect(fArr.length * 4));
        this.renderTextureBuffer = g1522;
        g1522.put(fArr).position(0);
        FloatBuffer g1622 = z20.g(ByteBuffer.allocateDirect(i15));
        this.maskTextureBuffer = g1622;
        g1622.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
    }

    private void applyRoundRadius(v20 v20Var, Bitmap bitmap, int i10) {
        if (bitmap == null || v20Var == null) {
            return;
        }
        if (v20Var.s == 0.0f && i10 == 0) {
            return;
        }
        if (v20Var.L == null) {
            v20Var.L = new Canvas(bitmap);
        }
        if (v20Var.s != 0.0f) {
            if (this.path == null) {
                this.path = new Path();
            }
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * v20Var.s;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
            this.path.toggleInverseFillType();
            v20Var.L.drawPath(this.path, this.xRefPaint);
        }
        if (i10 != 0) {
            if (this.textColorPaint == null) {
                Paint paint2 = new Paint(1);
                this.textColorPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            this.textColorPaint.setColor(i10);
            v20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
        }
    }

    private int createProgram(String str, String str2, boolean z10) {
        int h;
        int glCreateProgram;
        int h10;
        int glCreateProgram2;
        if (z10) {
            int h11 = jz.h(35633, str);
            if (h11 == 0 || (h10 = jz.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h12 = jz.h(35633, str);
        if (h12 == 0 || (h = jz.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i10, w20 w20Var) {
        if (w20Var == null) {
            return;
        }
        s5 s5Var = w20Var.u;
        if (s5Var != null) {
            s5Var.u();
            w20Var.u = null;
        }
        MediaCodecPlayer mediaCodecPlayer = w20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.release();
            w20Var.B = null;
        }
        SurfaceTexture surfaceTexture = w20Var.z;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            w20Var.z = null;
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

    private void drawCollagePart(int i10, w20 w20Var, long j10) {
        if (w20Var.B == null || !w20Var.b) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) w20Var.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) w20Var.s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) w20Var.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) w20Var.s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(v20 v20Var, int i10, long j10) {
        v20 v20Var2;
        Bitmap bitmap;
        long j11;
        long j12;
        RLottieNative rLottieNative = v20Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap2 = v20Var.G;
            if (bitmap2 == null || v20Var.U <= 0 || v20Var.V <= 0) {
                return;
            }
            rLottieNative.c((int) v20Var.E, bitmap2, true);
            applyRoundRadius(v20Var, v20Var.G, (v20Var.b & 8) != 0 ? i10 : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, v20Var.G, 0);
            float f7 = v20Var.E + v20Var.F;
            v20Var.E = f7;
            if (f7 >= v20Var.D.a[0]) {
                v20Var.E = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], v20Var.c, v20Var.d, v20Var.f, v20Var.g, v20Var.e, (2 & v20Var.b) != 0);
            return;
        }
        if (v20Var.J == null) {
            if (v20Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, v20Var.G, 0);
                int i11 = this.stickerTexture[0];
                float f10 = v20Var.c;
                float f11 = v20Var.h;
                float f12 = f10 - (f11 / 2.0f);
                float f13 = v20Var.d;
                float f14 = v20Var.i;
                drawTexture(false, i11, f12, f13 - (f14 / 2.0f), v20Var.f + f11, f14 + v20Var.g, v20Var.e, v20Var.a == 2 && (v20Var.b & 2) != 0);
            }
            ArrayList arrayList = v20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i12 = 0; i12 < v20Var.k.size(); i12++) {
                u20 u20Var = (u20) v20Var.k.get(i12);
                if (u20Var != null && (v20Var2 = u20Var.b) != null) {
                    drawEntity(v20Var2, v20Var.l, j10);
                }
            }
            return;
        }
        float f15 = v20Var.E;
        int i13 = (int) f15;
        float f16 = 1.0f;
        if (v20Var.a == 5) {
            if (this.isPhoto) {
                j11 = v20Var.T;
                j12 = 0;
            } else {
                long j13 = v20Var.Q;
                j11 = (v20Var.S - v20Var.R) + j13;
                j12 = j13;
            }
            long j14 = j10 / 1000000;
            if (j14 < j12) {
                f16 = gr.h.getInterpolation(Utilities.i(1.0f - ((j12 - j14) / 400.0f), 1.0f, 0.0f));
            } else if (j14 > j11) {
                f16 = gr.h.getInterpolation(Utilities.i(1.0f - ((j14 - j11) / 400.0f), 1.0f, 0.0f));
            }
            if (f16 > 0.0f) {
                long k10 = this.isPhoto ? Utilities.k(j14, v20Var.T, 0L) : Utilities.k((j14 - v20Var.Q) + v20Var.R, v20Var.T, 0L);
                while (!v20Var.K) {
                    int[] iArr = v20Var.J.d;
                    if (iArr[3] >= Math.min(k10, iArr[4])) {
                        break;
                    }
                    s5 s5Var = v20Var.J;
                    int i14 = s5Var.d[3];
                    s5Var.r(false);
                    int i15 = v20Var.J.d[3];
                    if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                        v20Var.K = true;
                        break;
                    }
                }
            }
        } else {
            float f17 = f15 + v20Var.F;
            v20Var.E = f17;
            for (int i16 = (int) f17; i13 != i16; i16--) {
                v20Var.J.r(true);
            }
        }
        p5 p5Var = v20Var.J.w;
        Bitmap bitmap3 = p5Var != null ? p5Var.b : null;
        if (bitmap3 != null) {
            if (v20Var.a == 5) {
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
                    this.roundClipPath.addCircle(this.roundBitmap.getWidth() / 2.0f, this.roundBitmap.getHeight() / 2.0f, (this.roundBitmap.getWidth() / 2.0f) * f16, Path.Direction.CW);
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
                    applyRoundRadius(v20Var, this.stickerBitmap, (v20Var.b & 8) != 0 ? i10 : 0);
                }
                bitmap = this.stickerBitmap;
            }
            if (bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                drawTexture(false, this.stickerTexture[0], v20Var.c, v20Var.d, v20Var.f, v20Var.g, v20Var.e, (v20Var.b & 2) != 0);
            }
        }
    }

    private void drawTexture(boolean z10, int i10) {
        drawTexture(z10, i10, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer g10 = z20.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g10.put(fArr).position(0);
        return g10;
    }

    private void initCollagePart(int i10, w20 w20Var) {
        AtomicInteger atomicInteger = new AtomicInteger(w20Var.l);
        AtomicInteger atomicInteger2 = new AtomicInteger(w20Var.m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (w20Var.b) {
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i10]);
            w20Var.z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(w20Var.l, w20Var.m);
            try {
                w20Var.B = new MediaCodecPlayer(w20Var.d, new Surface(w20Var.z));
            } catch (Exception e) {
                f8.g(e, true);
                w20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = w20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(w20Var.B.getOrientedHeight());
                atomicInteger3.set(w20Var.B.getOrientation());
            } else {
                w20Var.z.release();
                w20Var.z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i10);
                GLES20.glGenTextures(1, this.collageTextures, i10);
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                s5 s5Var = new s5(new File(w20Var.d), true, 0L, 0, null, null, null, 0L, d20.s0, true, 512, 512, null, 0, true);
                w20Var.u = s5Var;
                if (s5Var.y && s5Var.e0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                w20Var.v = 1000.0f / s5Var.d[5];
                Bitmap r10 = s5Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(w20Var.u.getIntrinsicWidth());
                atomicInteger2.set(w20Var.u.getIntrinsicHeight());
                atomicInteger3.set(w20Var.u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(w20Var.d, options);
            Pair N0 = i0.N0(w20Var.d);
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
        float a2 = w20Var.r.a(2.0f) - 1.0f;
        float f7 = -(((2.0f / r7.a.c) * r7.c) - 1.0f);
        float b10 = w20Var.r.b(2.0f) - 1.0f;
        float f10 = -(((2.0f / r9.a.c) * r9.c) - 1.0f);
        float a10 = w20Var.r.a(2.0f) - 1.0f;
        float f11 = -(((2.0f / r11.a.c) * (r11.c + 1)) - 1.0f);
        float b11 = w20Var.r.b(2.0f) - 1.0f;
        vh.q qVar = w20Var.r;
        int i11 = qVar.a.c;
        int i12 = qVar.c;
        float[] fArr = {a2, f7, b10, f10, a10, f11, b11, -(((2.0f / i11) * (i12 + 1)) - 1.0f)};
        float f12 = this.transformedWidth / r15.d[i12];
        float f13 = this.transformedHeight / i11;
        int i13 = atomicInteger.get();
        int i14 = atomicInteger2.get();
        int i15 = atomicInteger3.get();
        float f14 = i13;
        float f15 = i14;
        float max = 1.0f / Math.max(f12 / f14, f13 / f15);
        float f16 = ((f12 * max) / f14) / 2.0f;
        float f17 = ((f13 * max) / f15) / 2.0f;
        if ((i15 / 90) % 2 != 1) {
            f17 = f16;
            f16 = f17;
        }
        float f18 = 0.5f - f17;
        float f19 = 0.5f - f16;
        float f20 = f17 + 0.5f;
        float f21 = f16 + 0.5f;
        float[] fArr2 = {f18, f19, f20, f19, f18, f21, f20, f21};
        while (i15 > 0) {
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f22;
            fArr2[3] = f23;
            i15 -= 90;
        }
        while (i15 < 0) {
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f24;
            fArr2[5] = f25;
            i15 += 90;
        }
        w20Var.s = floats(fArr);
        w20Var.t = floats(fArr2);
    }

    private void initLinkEntity(v20 v20Var) {
        t0 t0Var = new t0(w0.b, v20Var.P);
        t0Var.U = true;
        t0Var.b(d20.s0, v20Var.W, false);
        if (t0Var.e()) {
            t0Var.setPreviewType(v20Var.b);
        } else {
            t0Var.c(v20Var.b, v20Var.l);
        }
        int i10 = v20Var.q;
        int i11 = t0Var.f;
        t0Var.setMaxWidth(i10 + i11 + i11);
        t0Var.measure(View.MeasureSpec.makeMeasureSpec(v20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v20Var.r, TLObject.FLAG_30));
        t0Var.layout(0, 0, v20Var.q, v20Var.r);
        float f7 = v20Var.f * this.transformedWidth;
        int i12 = v20Var.q;
        float f10 = f7 / i12;
        v20Var.G = Bitmap.createBitmap(((int) (i12 * f10)) + 16, ((int) (v20Var.r * f10)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(v20Var.G);
        float f11 = 8;
        canvas.translate(f11, f11);
        canvas.scale(f10, f10);
        t0Var.draw(canvas);
        float f12 = 16 * f10;
        v20Var.h = f12 / this.transformedWidth;
        v20Var.i = f12 / this.transformedHeight;
    }

    private void initLocationEntity(v20 v20Var) {
        float f7;
        byte b10 = v20Var.a;
        y0 y0Var = new y0(w0.b, v20Var.P);
        y0Var.setIsVideo(true);
        y0Var.setText(v20Var.j);
        y0Var.e(v20Var.b, v20Var.l);
        if (v20Var.O != null && v20Var.k.isEmpty()) {
            y0Var.d(d20.s0, v20Var.O.c);
        }
        y0Var.setMaxWidth(v20Var.q);
        if (v20Var.k.size() == 1) {
            y0Var.y = true;
            y0Var.c = true;
            y0Var.requestLayout();
        }
        y0Var.measure(View.MeasureSpec.makeMeasureSpec(v20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v20Var.r, TLObject.FLAG_30));
        y0Var.layout(0, 0, v20Var.q, v20Var.r);
        float f10 = v20Var.f * this.transformedWidth;
        float f11 = v20Var.q;
        float f12 = f10 / f11;
        v20Var.G = Bitmap.createBitmap(((int) (f11 * f12)) + 16, ((int) (v20Var.r * f12)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(v20Var.G);
        float f13 = 8;
        canvas.translate(f13, f13);
        canvas.scale(f12, f12);
        y0Var.draw(canvas);
        float f14 = 16 * f12;
        v20Var.h = f14 / this.transformedWidth;
        v20Var.i = f14 / this.transformedHeight;
        if (v20Var.k.size() == 1) {
            u20 u20Var = (u20) v20Var.k.get(0);
            v20 v20Var2 = new v20();
            u20Var.b = v20Var2;
            v20Var2.j = u20Var.a;
            v20Var2.b = u20Var.c;
            RectF rectF = new RectF();
            float f15 = y0Var.I;
            float f16 = y0Var.d.left + 2.25f;
            float f17 = y0Var.D;
            float f18 = y0Var.J;
            float f19 = y0Var.N;
            float f20 = f17 * 21.33f;
            rectF.set((f16 * f17) + f15, c3.i0.B(f19, f20, 2.0f, f18), z20.b(f16, 21.33f, f17, f15), org.telegram.messenger.m5.a(f20, f19, 2.0f, f18));
            float centerX = ((rectF.centerX() / v20Var.q) * v20Var.f) + v20Var.c;
            float f21 = v20Var.d;
            float centerY = rectF.centerY() / v20Var.r;
            float f22 = v20Var.g;
            float f23 = (centerY * f22) + f21;
            if (v20Var.e != 0.0f) {
                float f24 = (v20Var.f / 2.0f) + v20Var.c;
                float f25 = (f22 / 2.0f) + v20Var.d;
                float f26 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f24;
                double d10 = (f23 - f25) / f26;
                f7 = 2.0f;
                float cos = ((float) ((Math.cos(-r2) * d) - (Math.sin(-v20Var.e) * d10))) + f24;
                f23 = (((float) i0.a.c(-v20Var.e, d10, Math.sin(-v20Var.e) * d)) * f26) + f25;
                centerX = cos;
            } else {
                f7 = 2.0f;
            }
            u20Var.b.f = (rectF.width() / v20Var.q) * v20Var.f;
            u20Var.b.g = (rectF.height() / v20Var.r) * v20Var.g;
            v20 v20Var3 = u20Var.b;
            float f27 = v20Var3.f * 1.2f;
            v20Var3.f = f27;
            float f28 = v20Var3.g * 1.2f;
            v20Var3.g = f28;
            v20Var3.c = centerX - (f27 / f7);
            v20Var3.d = f23 - (f28 / f7);
            v20Var3.e = v20Var.e;
            initStickerEntity(v20Var3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initStickerEntity(v20 v20Var) {
        ye yeVar;
        int i10;
        int i11 = (int) (v20Var.f * this.transformedWidth);
        v20Var.U = i11;
        int i12 = (int) (v20Var.g * this.transformedHeight);
        v20Var.V = i12;
        if (i11 > 512) {
            v20Var.V = (int) ((i12 / i11) * 512.0f);
            v20Var.U = 512;
        }
        int i13 = v20Var.V;
        if (i13 > 512) {
            v20Var.U = (int) ((v20Var.U / i13) * 512.0f);
            v20Var.V = 512;
        }
        byte b10 = v20Var.b;
        if ((b10 & 1) != 0) {
            int i14 = v20Var.U;
            if (i14 <= 0 || (i10 = v20Var.V) <= 0) {
                return;
            }
            v20Var.G = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
            RLottieNative a2 = RLottieNative.a(v20Var.j, null, null, null, 0, null);
            v20Var.D = a2;
            v20Var.F = a2 != null ? a2.a[1] / this.videoFps : 0.0f;
            return;
        }
        if ((b10 & 4) != 0) {
            v20Var.K = false;
            s5 s5Var = new s5(new File(v20Var.j), true, 0L, 0, null, null, null, 0L, d20.s0, true, 512, 512, null, 0, true);
            v20Var.J = s5Var;
            v20Var.F = s5Var.d[5] / this.videoFps;
            v20Var.E = 1.0f;
            s5Var.r(true);
            return;
        }
        String str = v20Var.j;
        if (!TextUtils.isEmpty(v20Var.t) && (v20Var.b & 16) != 0) {
            str = v20Var.t;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (v20Var.a == 2) {
            options.inMutable = true;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        v20Var.G = decodeFile;
        if (decodeFile != null && (yeVar = v20Var.u) != null) {
            Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, yeVar.e * decodeFile.getWidth()), (int) Math.max(1.0f, v20Var.u.f * v20Var.G.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(-v20Var.u.z);
            int width = v20Var.G.getWidth();
            int height = v20Var.G.getHeight();
            ye yeVar2 = v20Var.u;
            if (((yeVar2.z + yeVar2.k) / 90) % 2 == 1) {
                width = v20Var.G.getHeight();
                height = v20Var.G.getWidth();
            }
            ye yeVar3 = v20Var.u;
            float f7 = yeVar3.e;
            float f10 = yeVar3.f;
            float f11 = width;
            float f12 = height;
            canvas.clipRect(((-width) * f7) / 2.0f, ((-height) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
            float f13 = v20Var.u.c;
            canvas.scale(f13, f13);
            ye yeVar4 = v20Var.u;
            canvas.translate(yeVar4.a * f11, yeVar4.b * f12);
            canvas.rotate(v20Var.u.d + r10.k);
            if (v20Var.u.l) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.rotate(v20Var.u.z);
            canvas.translate((-v20Var.G.getWidth()) / 2.0f, (-v20Var.G.getHeight()) / 2.0f);
            canvas.drawBitmap(v20Var.G, 0.0f, 0.0f, (Paint) null);
            v20Var.G.recycle();
            v20Var.G = createBitmap;
        }
        if (v20Var.a != 2 || v20Var.G == null) {
            if (v20Var.G != null) {
                float width2 = r2.getWidth() / v20Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f14 = v20Var.g;
                    float f15 = f14 / width2;
                    v20Var.d = c3.i0.B(f14, f15, 2.0f, v20Var.d);
                    v20Var.g = f15;
                    return;
                }
                if (width2 < 1.0f) {
                    float f16 = v20Var.f;
                    float f17 = width2 * f16;
                    v20Var.c = c3.i0.B(f16, f17, 2.0f, v20Var.c);
                    v20Var.f = f17;
                    return;
                }
                return;
            }
            return;
        }
        v20Var.s = i0.L(12.0f) / Math.min(v20Var.q, v20Var.r);
        Pair N0 = i0.N0(v20Var.j);
        v20Var.e = (float) (v20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f18 = v20Var.c;
            float f19 = v20Var.f;
            float f20 = (f19 / 2.0f) + f18;
            float f21 = v20Var.d;
            float f22 = v20Var.g;
            float f23 = (f22 / 2.0f) + f21;
            float f24 = this.transformedWidth;
            float f25 = this.transformedHeight;
            float f26 = (f19 * f24) / f25;
            float f27 = (f22 * f25) / f24;
            v20Var.f = f27;
            v20Var.g = f26;
            v20Var.c = f20 - (f27 / 2.0f);
            v20Var.d = f23 - (f26 / 2.0f);
        }
        applyRoundRadius(v20Var, v20Var.G, 0);
    }

    private void initTextEntity(final v20 v20Var) {
        Typeface d;
        final jg.b bVar = new jg.b(w0.b);
        bVar.getPaint().setAntiAlias(true);
        bVar.G = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(i0.L(7.0f), i0.L(7.0f), i0.L(7.0f), i0.L(7.0f));
        h0 h0Var = v20Var.n;
        if (h0Var != null && (d = h0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, v20Var.m);
        SpannableString spannableString = new SpannableString(v20Var.j);
        ArrayList arrayList = v20Var.k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            final u20 u20Var = (u20) arrayList.get(i10);
            if (u20Var.a != null) {
                v20 v20Var2 = new v20();
                u20Var.b = v20Var2;
                v20Var2.j = u20Var.a;
                v20Var2.b = u20Var.c;
                o5 o5Var = new o5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.TextureRenderer.1
                    @Override // org.telegram.ui.Components.o5, android.text.style.ReplacementSpan
                    public void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f7, int i14, int i15, int i16, Paint paint) {
                        super.draw(canvas, charSequence, i12, i13, f7, i14, i15, i16, paint);
                        v20 v20Var3 = v20Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / v20Var3.q) * v20Var3.f) + v20Var.c;
                        float f10 = v20Var3.d;
                        v20 v20Var4 = v20Var;
                        float f11 = v20Var4.g;
                        float paddingTop = (((((i16 - i14) / 2.0f) + (bVar.getPaddingTop() + i14)) / v20Var4.r) * f11) + f10;
                        if (v20Var4.e != 0.0f) {
                            float f12 = (v20Var4.f / 2.0f) + v20Var4.c;
                            float f13 = (f11 / 2.0f) + v20Var4.d;
                            float f14 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d10 = paddingLeft - f12;
                            double d11 = (paddingTop - f13) / f14;
                            paddingLeft = ((float) ((Math.cos(-v20Var.e) * d10) - (Math.sin(-v20Var.e) * d11))) + f12;
                            paddingTop = (((float) i0.a.c(-v20Var.e, d11, Math.sin(-v20Var.e) * d10)) * f14) + f13;
                        }
                        v20 v20Var5 = u20Var.b;
                        int i17 = this.measuredSize;
                        v20 v20Var6 = v20Var;
                        float f15 = (i17 / v20Var6.q) * v20Var6.f;
                        v20Var5.f = f15;
                        float f16 = (i17 / v20Var6.r) * v20Var6.g;
                        v20Var5.g = f16;
                        v20Var5.c = paddingLeft - (f15 / 2.0f);
                        v20Var5.d = paddingTop - (f16 / 2.0f);
                        v20Var5.e = v20Var6.e;
                        if (v20Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(v20Var5);
                        }
                    }
                };
                int i12 = u20Var.offset;
                spannableString.setSpan(o5Var, i12, u20Var.length + i12, 33);
            }
            i10 = i11;
        }
        bVar.setText(k6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(v20Var.l);
        Editable text = bVar.getText();
        if (text != null) {
            for (h6 h6Var : (h6[]) text.getSpans(0, text.length(), h6.class)) {
                h6Var.b = 0.85f;
            }
        }
        int i13 = v20Var.p;
        bVar.setGravity(i13 != 1 ? i13 != 2 ? 19 : 21 : 17);
        int i14 = v20Var.p;
        bVar.setTextAlignment(i14 != 1 ? (i14 == 2 ? !cd.X : cd.X) ? 3 : 2 : 4);
        bVar.setHorizontallyScrolling(false);
        bVar.setImeOptions(TLObject.FLAG_28);
        bVar.setFocusableInTouchMode(true);
        bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
        setBreakStrategy(bVar);
        byte b10 = v20Var.b;
        if (b10 == 0) {
            bVar.setFrameColor(v20Var.l);
            bVar.setTextColor(i0.B(v20Var.l) >= 0.721f ? -16777216 : -1);
        } else if (b10 == 1) {
            bVar.setFrameColor(i0.B(v20Var.l) >= 0.25f ? -1728053248 : -1711276033);
            bVar.setTextColor(v20Var.l);
        } else if (b10 == 2) {
            bVar.setFrameColor(i0.B(v20Var.l) >= 0.25f ? -16777216 : -1);
            bVar.setTextColor(v20Var.l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(v20Var.l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(v20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v20Var.r, TLObject.FLAG_30));
        bVar.layout(0, 0, v20Var.q, v20Var.r);
        v20Var.G = Bitmap.createBitmap(v20Var.q, v20Var.r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(v20Var.G));
    }

    private boolean isCollage() {
        return this.collageParts != null;
    }

    private void stepCollagePart(int i10, w20 w20Var, long j10) {
        float f7;
        Bitmap r10;
        long j11;
        long j12 = (j10 / 1000000) - w20Var.f;
        float f10 = w20Var.k;
        long j13 = w20Var.o;
        long k10 = Utilities.k(j12, (long) (f10 * j13), (long) (w20Var.j * j13));
        MediaCodecPlayer mediaCodecPlayer = w20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            w20Var.z.updateTexImage();
            return;
        }
        s5 s5Var = w20Var.u;
        if (s5Var != null) {
            int i11 = s5Var.d[3];
            boolean z10 = i11 <= 0;
            if ((k10 < i11 || (z10 && k10 > 1000)) && s5Var.d0 != null) {
                s5Var.d0.g(k10, true);
            }
            do {
                s5 s5Var2 = w20Var.u;
                int i12 = s5Var2.d[3];
                f7 = k10;
                if ((w20Var.v * 2.0f) + i12 >= f7) {
                    break;
                }
                j11 = i12;
                if (s5Var2.d0 != null) {
                    s5Var2.d0.c(null, false, s5Var2.g0, s5Var2.h0, false);
                }
            } while (w20Var.u.d[3] != j11);
            if ((z10 || f7 > w20Var.u.d[3] - (w20Var.v / 2.0f)) && (r10 = w20Var.u.r(false)) != null) {
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
        int i12;
        float[] fArr;
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
            i12 = 3042;
            i15 = 0;
            i10 = 33985;
            i16 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (v2.a && this.firstFrame) {
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
                f8.b("stMatrix = " + ((Object) sb2));
                this.firstFrame = false;
            } else {
                i10 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            jz jzVar = this.filterShaders;
            if (jzVar != null) {
                jzVar.P0 = this.mSTMatrix;
                jzVar.W0 = false;
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
                i12 = 3042;
                fArr = this.mSTMatrixIdentity;
                i13 = i22;
                i14 = g10;
                i15 = b10 ? 1 : 0;
                i11 = 3553;
            } else {
                int i23 = this.mTextureID;
                int i24 = this.NUM_EXTERNAL_SHADER;
                i11 = 36197;
                i12 = 3042;
                fArr = this.mSTMatrix;
                i13 = i24;
                i14 = i23;
                i15 = 0;
            }
            drawBackground();
            i16 = 33984;
            GLES20.glUseProgram(this.mProgram[i13]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i11, i14);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i13], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i13], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i13]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[i13], 2, 5126, false, 8, (Buffer) (this.useMatrixForImagePath ? this.croppedTextureBuffer : this.renderTextureBuffer));
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i13]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i13], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i13]);
            }
            int i25 = this.texSizeHandle;
            if (i25 != 0) {
                GLES20.glUniform2f(i25, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i13], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i13], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i12);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath == null || (iArr = this.paintTexture) == null) {
                jz jzVar2 = this.filterShaders;
                if (jzVar2 != null) {
                    i17 = jzVar2.g(i15 ^ 1);
                    jz jzVar3 = this.filterShaders;
                    int i26 = jzVar3.X0;
                    i19 = jzVar3.Y0;
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
                this.blur.a(i17, i18, i19, null);
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
                drawEntity(this.mediaEntities.get(i30), this.mediaEntities.get(i30).l, j10);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<v20> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                v20 v20Var = this.mediaEntities.get(i10);
                RLottieNative rLottieNative = v20Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                s5 s5Var = v20Var.J;
                if (s5Var != null) {
                    s5Var.u();
                }
                View view = v20Var.I;
                if (view instanceof qt) {
                    qt qtVar = (qt) view;
                    o5.release(qtVar, qtVar.E);
                }
                Bitmap bitmap = v20Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    v20Var.G = null;
                }
            }
        }
        ArrayList<w20> arrayList2 = this.collageParts;
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

    public void setBreakStrategy(jg.b bVar) {
        bVar.setBreakStrategy(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r6 = org.telegram.messenger.video.TextureRenderer.VERTEX_SHADER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void surfaceCreated() {
        int i10;
        String str;
        int i11;
        int i12;
        float max;
        ye yeVar;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.mProgram;
            String str2 = null;
            if (i14 >= iArr.length) {
                break;
            }
            int i15 = this.NUM_EXTERNAL_SHADER;
            String str3 = VERTEX_SHADER_MASK;
            String str4 = VERTEX_SHADER;
            if (i14 == i15) {
                String str5 = this.messageVideoMaskPath;
                str2 = str5 != null ? FRAGMENT_EXTERNAL_MASK_SHADER : FRAGMENT_EXTERNAL_SHADER;
            } else if (i14 == this.NUM_FILTER_SHADER) {
                String str6 = this.messageVideoMaskPath;
                str2 = str6 != null ? FRAGMENT_MASK_SHADER : FRAGMENT_SHADER;
            } else if (i14 == this.NUM_GRADIENT_SHADER) {
                str2 = GRADIENT_FRAGMENT_SHADER;
            }
            if (str2 != null) {
                iArr[i14] = createProgram(str4, str2, false);
                this.maPositionHandle[i14] = GLES20.glGetAttribLocation(this.mProgram[i14], "aPosition");
                this.maTextureHandle[i14] = GLES20.glGetAttribLocation(this.mProgram[i14], "aTextureCoord");
                this.mmTextureHandle[i14] = GLES20.glGetAttribLocation(this.mProgram[i14], "mTextureCoord");
                this.muMVPMatrixHandle[i14] = GLES20.glGetUniformLocation(this.mProgram[i14], "uMVPMatrix");
                this.muSTMatrixHandle[i14] = GLES20.glGetUniformLocation(this.mProgram[i14], "uSTMatrix");
                this.maskTextureHandle[i14] = GLES20.glGetUniformLocation(this.mProgram[i14], "sMask");
                if (i14 == this.NUM_GRADIENT_SHADER) {
                    this.gradientTopColorHandle = GLES20.glGetUniformLocation(this.mProgram[i14], "gradientTopColor");
                    this.gradientBottomColorHandle = GLES20.glGetUniformLocation(this.mProgram[i14], "gradientBottomColor");
                }
            }
            i14++;
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i16 = iArr2[0];
        this.mTextureID = i16;
        GLES20.glBindTexture(36197, i16);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        if (this.messageVideoMaskPath != null) {
            try {
                GLES20.glGenTextures(1, iArr2, 0);
                int i17 = iArr2[0];
                this.videoMaskTexture = i17;
                GLES20.glBindTexture(3553, i17);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.messageVideoMaskPath);
                GLUtils.texImage2D(3553, 0, decodeFile, 0);
                decodeFile.recycle();
            } catch (Exception e) {
                f8.g(e, true);
                this.videoMaskTexture = -1;
            }
        }
        if (this.blurPath != null && (yeVar = this.cropState) != null && yeVar.B != null) {
            x9 x9Var = new x9();
            this.blur = x9Var;
            if (x9Var.b(this.transformedWidth / this.transformedHeight, 0)) {
                x9 x9Var2 = this.blur;
                int i18 = this.gradientTopColor;
                int i19 = this.gradientBottomColor;
                x9Var2.l = i18;
                x9Var2.m = i19;
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
                int h = jz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                int h10 = jz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D blurImage;uniform sampler2D maskImage;void main() {gl_FragColor = texture2D(blurImage, vTextureCoord) * texture2D(maskImage, vTextureCoord).a;}");
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
                        FloatBuffer g10 = z20.g(ByteBuffer.allocateDirect(32));
                        this.blurVerticesBuffer = g10;
                        g10.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f}).position(0);
                    }
                }
            }
        }
        if (this.filterShaders != null || this.imagePath != null || this.paintPath != null || this.messagePath != null || this.mediaEntities != null || isCollage()) {
            int h11 = jz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h12 = jz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
            int h13 = jz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h14 = jz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replaceAll("sampler2D", "samplerExternalOES"));
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
        jz jzVar = this.filterShaders;
        if (jzVar != null) {
            jzVar.a();
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
            int i20 = 0;
            while (i20 < this.paintTexture.length) {
                try {
                    if (i20 == this.imagePathIndex) {
                        str = this.imagePath;
                        Pair N0 = i0.N0(str);
                        i12 = ((Integer) N0.first).intValue();
                        i11 = ((Integer) N0.second).intValue();
                    } else {
                        str = i20 == this.paintPathIndex ? this.paintPath : i20 == this.backgroundPathIndex ? this.backgroundPath : this.messagePath;
                        i11 = i13;
                        i12 = i11;
                    }
                    Bitmap decodeFile3 = BitmapFactory.decodeFile(str);
                    if (decodeFile3 != null) {
                        if (i20 == this.imagePathIndex && !this.useMatrixForImagePath) {
                            Bitmap createBitmap = Bitmap.createBitmap(this.transformedWidth, this.transformedHeight, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(-16777216);
                            Canvas canvas = new Canvas(createBitmap);
                            if (i12 != 90 && i12 != 270) {
                                max = Math.max(decodeFile3.getWidth() / this.transformedWidth, decodeFile3.getHeight() / this.transformedHeight);
                                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                                matrix3.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                                float f7 = -1.0f;
                                float f10 = (i11 != 1 ? -1.0f : 1.0f) / max;
                                if (i11 == 2) {
                                    f7 = 1.0f;
                                }
                                matrix3.postScale(f10, f7 / max);
                                matrix3.postRotate(i12);
                                matrix3.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                                canvas.drawBitmap(decodeFile3, matrix3, new Paint(2));
                                decodeFile3 = createBitmap;
                            }
                            max = Math.max(decodeFile3.getHeight() / this.transformedWidth, decodeFile3.getWidth() / this.transformedHeight);
                            android.graphics.Matrix matrix32 = new android.graphics.Matrix();
                            matrix32.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                            float f72 = -1.0f;
                            float f102 = (i11 != 1 ? -1.0f : 1.0f) / max;
                            if (i11 == 2) {
                            }
                            matrix32.postScale(f102, f72 / max);
                            matrix32.postRotate(i12);
                            matrix32.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                            canvas.drawBitmap(decodeFile3, matrix32, new Paint(2));
                            decodeFile3 = createBitmap;
                        }
                        if (i20 == this.imagePathIndex) {
                            this.imageWidth = decodeFile3.getWidth();
                            this.imageHeight = decodeFile3.getHeight();
                        }
                        GLES20.glBindTexture(3553, this.paintTexture[i20]);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLUtils.texImage2D(3553, 0, decodeFile3, 0);
                    }
                    i20++;
                    i13 = 0;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
        if (isCollage()) {
            try {
                int size = this.collageParts.size();
                int[] iArr8 = new int[size];
                this.collageTextures = iArr8;
                GLES20.glGenTextures(size, iArr8, 0);
                for (int i21 = 0; i21 < this.collageParts.size(); i21++) {
                    initCollagePart(i21, this.collageParts.get(i21));
                }
            } catch (Exception e7) {
                f8.g(e7, true);
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
            for (int i22 = 0; i22 < size2; i22++) {
                v20 v20Var = this.mediaEntities.get(i22);
                byte b10 = v20Var.a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(v20Var);
                    } else if (b10 == 3) {
                        initLocationEntity(v20Var);
                    } else if (b10 == 7) {
                        initLinkEntity(v20Var);
                    }
                }
                initStickerEntity(v20Var);
            }
        } catch (Throwable th3) {
            f8.g(th3, true);
        }
    }

    private void drawTexture(boolean z10, int i10, float f7, float f10, float f11, float f12, float f13, boolean z11) {
        drawTexture(z10, i10, f7, f10, f11, f12, f13, z11, false, -1);
    }

    private void drawTexture(boolean z10, int i10, float f7, float f10, float f11, float f12, float f13, boolean z11, boolean z12, int i11) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        if (f7 <= -10000.0f) {
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
            float f14 = (f7 * 2.0f) - 1.0f;
            float f15 = ((1.0f - f10) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f14;
            fArr2[1] = f15;
            float f16 = (f11 * 2.0f) + f14;
            fArr2[2] = f16;
            fArr2[3] = f15;
            fArr2[4] = f14;
            float f17 = f15 - (f12 * 2.0f);
            fArr2[5] = f17;
            fArr2[6] = f16;
            fArr2[7] = f17;
        }
        float[] fArr3 = this.bitmapData;
        float f18 = fArr3[0];
        float f19 = fArr3[2];
        float f20 = (f18 + f19) / 2.0f;
        if (z11) {
            fArr3[2] = f18;
            fArr3[0] = f19;
            float f21 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f21;
        }
        if (f13 != 0.0f) {
            float f22 = this.transformedWidth / this.transformedHeight;
            float f23 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i12 = 0;
            for (int i13 = 4; i12 < i13; i13 = 4) {
                float[] fArr4 = this.bitmapData;
                int i14 = i12 * 2;
                int i15 = i14 + 1;
                double d = fArr4[i14] - f20;
                double d10 = f13;
                float f24 = f20;
                double d11 = (fArr4[i15] - f23) / f22;
                fArr4[i14] = ((float) ((Math.cos(d10) * d) - (Math.sin(d10) * d11))) + f24;
                this.bitmapData[i15] = (((float) i0.a.c(d10, d11, Math.sin(d10) * d)) * f22) + f23;
                i12++;
                f20 = f24;
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
