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
import gi.e7;
import gi.s;
import gi.y5;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.r2;
import org.telegram.messenger.re;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.xq;
import tg.b0;
import ug.h0;
import ug.l0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    private ca blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<a20> collageParts;
    private int[] collageTextures;
    private final re cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<g5> emojiDrawables;
    private sy filterShaders;
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
    private ArrayList<z10> mediaEntities;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextureRenderer(ze zeVar, String str, String str2, String str3, ArrayList<z10> arrayList, re reVar, int i3, int i10, int i11, int i12, int i13, float f10, boolean z10, Integer num, Integer num2, e7 e7Var, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        char c2;
        int i14;
        float f11;
        char c10;
        int i15;
        int i16;
        float f12;
        int i17;
        int i18;
        float[] fArr;
        int i19;
        int i20 = i3;
        int i21 = i10;
        float f13 = f10;
        this.NUM_FILTER_SHADER = -1;
        this.NUM_EXTERNAL_SHADER = -1;
        this.NUM_GRADIENT_SHADER = -1;
        int i22 = 1;
        this.isPhoto = z10;
        this.collageParts = convertVideoParams.collageParts;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (r2.a) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m("start textureRenderer w = ", i20, " h = ", i21, " r = ");
            m10.append(i13);
            m10.append(" fps = ");
            m10.append(f13);
            a8.b(m10.toString());
            if (reVar != null) {
                a8.b("cropState px = " + reVar.a + " py = " + reVar.b + " cScale = " + reVar.c + " cropRotate = " + reVar.d + " pw = " + reVar.e + " ph = " + reVar.f + " tw = " + reVar.i + " th = " + reVar.j + " tr = " + reVar.k + " mirror = " + reVar.l);
            }
        }
        FloatBuffer g7 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
        this.textureBuffer = g7;
        g7.put(fArr2).position(0);
        FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(this.bitmapData.length * 4));
        this.bitmapVerticesBuffer = g10;
        g10.put(this.bitmapData).position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        Matrix.setIdentityM(this.mSTMatrixIdentity, 0);
        if (zeVar != null) {
            sy syVar = new sy(true, e7Var);
            this.filterShaders = syVar;
            syVar.f1 = new nh(zeVar, i22);
        }
        this.transformedWidth = i20;
        this.transformedHeight = i21;
        this.originalWidth = i11;
        this.originalHeight = i12;
        this.imagePath = str;
        this.paintPath = str2;
        this.messagePath = convertVideoParams.messagePath;
        this.messageVideoMaskPath = convertVideoParams.messageVideoMaskPath;
        this.backgroundPath = convertVideoParams.backgroundPath;
        this.blurPath = str3;
        this.mediaEntities = arrayList;
        this.videoFps = f13 == 0.0f ? 30.0f : f13;
        this.cropState = reVar;
        this.NUM_EXTERNAL_SHADER = 0;
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        long j10 = convertVideoParams.wallpaperPeerId;
        float f14 = 1.0f;
        if (j10 != Long.MIN_VALUE) {
            c2 = 6;
            this.backgroundDrawable = y5.e(null, convertVideoParams.account, j10, convertVideoParams.isDark);
        } else {
            c2 = 6;
            if (num2 != null && num != null) {
                FloatBuffer g11 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                this.gradientVerticesBuffer = g11;
                g11.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                boolean z11 = this.isPhoto;
                float[] fArr3 = {0.0f, z11 ? 1.0f : 0.0f, 1.0f, z11 ? 1.0f : 0.0f, 0.0f, z11 ? 0.0f : 1.0f, 1.0f, z11 ? 0.0f : 1.0f};
                FloatBuffer g12 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                this.gradientTextureBuffer = g12;
                g12.put(fArr3).position(0);
                this.gradientTopColor = num.intValue();
                this.gradientBottomColor = num2.intValue();
                this.NUM_GRADIENT_SHADER = 1;
                i14 = 2;
                if (this.filterShaders != null) {
                    this.NUM_FILTER_SHADER = i14;
                    i14++;
                }
                this.mProgram = new int[i14];
                this.muMVPMatrixHandle = new int[i14];
                this.muSTMatrixHandle = new int[i14];
                this.maPositionHandle = new int[i14];
                this.maTextureHandle = new int[i14];
                this.mmTextureHandle = new int[i14];
                this.maskTextureHandle = new int[i14];
                if (reVar == null) {
                    android.graphics.Matrix matrix = reVar.B;
                    f12 = 0.5f;
                    float f15 = 2.0f;
                    if (matrix == null) {
                        c10 = 1;
                        i15 = 32;
                        float[] fArr4 = new float[8];
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        float f16 = i20;
                        fArr4[2] = f16;
                        fArr4[3] = 0.0f;
                        fArr4[4] = 0.0f;
                        float f17 = i21;
                        fArr4[5] = f17;
                        fArr4[c2] = f16;
                        fArr4[7] = f17;
                        i17 = reVar.k;
                        this.transformedWidth = (int) (this.transformedWidth * reVar.e);
                        this.transformedHeight = (int) (this.transformedHeight * reVar.f);
                        float f18 = (float) ((-reVar.d) * 0.017453292519943295d);
                        int i23 = 0;
                        while (i23 < 4) {
                            int i24 = i23 * 2;
                            float f19 = fArr4[i24] - (i20 / 2);
                            int i25 = i24 + 1;
                            float f20 = f14;
                            float f21 = fArr4[i25] - (i21 / 2);
                            float f22 = f15;
                            double d = f19;
                            double d10 = f18;
                            double cos = Math.cos(d10) * d;
                            double d11 = f21;
                            float sin = ((float) ((cos - (Math.sin(d10) * d11)) + (reVar.a * f16))) * reVar.c;
                            float c11 = ((float) (p1.c(d10, d11, Math.sin(d10) * d) - (reVar.b * f17))) * reVar.c;
                            fArr4[i24] = (sin / this.transformedWidth) * f22;
                            fArr4[i25] = (c11 / this.transformedHeight) * f22;
                            i23++;
                            f14 = f20;
                            f15 = f22;
                            i20 = i3;
                            i21 = i10;
                        }
                        f11 = f14;
                        FloatBuffer g13 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                        this.verticesBuffer = g13;
                        i16 = 0;
                        g13.put(fArr4).position(0);
                        if (this.filterShaders == null) {
                            i18 = 4;
                            if (i17 == 90) {
                                fArr = new float[8];
                                fArr[i16] = f11;
                                fArr[c10] = 0.0f;
                                fArr[2] = f11;
                                fArr[3] = f11;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c2] = 0.0f;
                                fArr[7] = f11;
                            } else if (i17 == 180) {
                                fArr = new float[8];
                                fArr[i16] = f11;
                                fArr[c10] = f11;
                                fArr[2] = 0.0f;
                                fArr[3] = f11;
                                fArr[4] = f11;
                                fArr[5] = 0.0f;
                                fArr[c2] = 0.0f;
                                fArr[7] = 0.0f;
                            } else if (i17 == 270) {
                                fArr = new float[8];
                                fArr[i16] = 0.0f;
                                fArr[c10] = f11;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f11;
                                fArr[5] = f11;
                                fArr[c2] = f11;
                                fArr[7] = 0.0f;
                            } else {
                                fArr = new float[8];
                                fArr[i16] = 0.0f;
                                fArr[c10] = 0.0f;
                                fArr[2] = f11;
                                fArr[3] = 0.0f;
                                fArr[4] = 0.0f;
                                fArr[5] = f11;
                                fArr[c2] = f11;
                                fArr[7] = f11;
                            }
                        } else if (i17 == 90) {
                            fArr = new float[8];
                            fArr[i16] = f11;
                            fArr[c10] = f11;
                            fArr[2] = f11;
                            fArr[3] = 0.0f;
                            i18 = 4;
                            fArr[4] = 0.0f;
                            fArr[5] = f11;
                            fArr[c2] = 0.0f;
                            fArr[7] = 0.0f;
                        } else {
                            i18 = 4;
                            if (i17 == 180) {
                                fArr = new float[8];
                                fArr[i16] = f11;
                                fArr[c10] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = f11;
                                fArr[5] = f11;
                                fArr[c2] = 0.0f;
                                fArr[7] = f11;
                            } else if (i17 == 270) {
                                fArr = new float[8];
                                fArr[i16] = 0.0f;
                                fArr[c10] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = f11;
                                fArr[4] = f11;
                                fArr[5] = 0.0f;
                                fArr[c2] = f11;
                                fArr[7] = f11;
                            } else {
                                fArr = new float[8];
                                fArr[i16] = 0.0f;
                                fArr[c10] = f11;
                                fArr[2] = f11;
                                fArr[3] = f11;
                                fArr[4] = 0.0f;
                                fArr[5] = 0.0f;
                                fArr[c2] = f11;
                                fArr[7] = 0.0f;
                            }
                        }
                        if (reVar != null && reVar.l) {
                            i19 = 0;
                            while (i19 < i18) {
                                int i26 = i19 * 2;
                                if (fArr[i26] > f12) {
                                    fArr[i26] = 0.0f;
                                } else {
                                    fArr[i26] = f11;
                                }
                                i19++;
                                i18 = 4;
                            }
                        }
                        FloatBuffer g14 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
                        this.renderTextureBuffer = g14;
                        g14.put(fArr).position(0);
                        FloatBuffer g15 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(i15));
                        this.maskTextureBuffer = g15;
                        g15.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
                    }
                    this.useMatrixForImagePath = true;
                    i15 = 32;
                    float f23 = reVar.e;
                    float f24 = reVar.f;
                    if ((reVar.z / 90) % 2 == 1) {
                        f24 = f23;
                        f23 = f24;
                    }
                    float f25 = (1.0f - f23) / 2.0f;
                    float f26 = (1.0f - f24) / 2.0f;
                    c10 = 1;
                    float[] fArr5 = new float[8];
                    float f27 = i11;
                    float f28 = f27 * f25;
                    fArr5[0] = f28;
                    float f29 = i12;
                    float f30 = f29 * f26;
                    fArr5[1] = f30;
                    float f31 = (f25 + f23) * f27;
                    fArr5[2] = f31;
                    fArr5[3] = f30;
                    fArr5[4] = f28;
                    float f32 = (f26 + f24) * f29;
                    fArr5[5] = f32;
                    fArr5[c2] = f31;
                    fArr5[7] = f32;
                    matrix.mapPoints(fArr5);
                    int i27 = 0;
                    for (int i28 = 4; i27 < i28; i28 = 4) {
                        int i29 = i27 * 2;
                        fArr5[i29] = ((fArr5[i29] / i20) * 2.0f) - 1.0f;
                        int i30 = i29 + 1;
                        fArr5[i30] = org.telegram.messenger.camera.q.v(fArr5[i30], i21, 2.0f, 1.0f);
                        i27++;
                    }
                    FloatBuffer g16 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                    this.verticesBuffer = g16;
                    g16.put(fArr5).position(0);
                    float[] fArr6 = new float[8];
                    float f33 = f23 * f27;
                    float f34 = f33 * (-0.5f);
                    fArr6[0] = f34;
                    float f35 = f24 * f29;
                    float f36 = (-0.5f) * f35;
                    fArr6[1] = f36;
                    float f37 = f33 * 0.5f;
                    fArr6[2] = f37;
                    fArr6[3] = f36;
                    fArr6[4] = f34;
                    float f38 = f35 * 0.5f;
                    fArr6[5] = f38;
                    fArr6[c2] = f37;
                    fArr6[7] = f38;
                    float f39 = (float) ((-reVar.d) * 0.017453292519943295d);
                    int i31 = 0;
                    for (int i32 = 4; i31 < i32; i32 = 4) {
                        int i33 = i31 * 2;
                        float f40 = fArr6[i33];
                        int i34 = i33 + 1;
                        float f41 = fArr6[i34];
                        double d12 = f40 - (reVar.a * f27);
                        double d13 = f39;
                        double d14 = f41 - (reVar.b * f29);
                        float cos2 = ((float) ((Math.cos(d13) * d12) - (Math.sin(d13) * d14))) / f27;
                        float c12 = ((float) p1.c(d13, d14, Math.sin(d13) * d12)) / f29;
                        float f42 = reVar.c;
                        fArr6[i33] = (cos2 / f42) + 0.5f;
                        fArr6[i34] = (c12 / f42) + 0.5f;
                        i31++;
                    }
                    if (this.filterShaders == null && !this.isPhoto && this.messageVideoMaskPath == null) {
                        fArr6[1] = 1.0f - fArr6[1];
                        fArr6[3] = 1.0f - fArr6[3];
                        fArr6[5] = 1.0f - fArr6[5];
                        fArr6[7] = 1.0f - fArr6[7];
                    }
                    FloatBuffer g17 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                    this.croppedTextureBuffer = g17;
                    i16 = 0;
                    g17.put(fArr6).position(0);
                    f11 = 1.0f;
                } else {
                    f11 = 1.0f;
                    c10 = 1;
                    i15 = 32;
                    i16 = 0;
                    f12 = 0.5f;
                    FloatBuffer g18 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                    this.verticesBuffer = g18;
                    g18.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                }
                i17 = i16;
                if (this.filterShaders == null) {
                }
                if (reVar != null) {
                    i19 = 0;
                    while (i19 < i18) {
                    }
                }
                FloatBuffer g142 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
                this.renderTextureBuffer = g142;
                g142.put(fArr).position(0);
                FloatBuffer g152 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(i15));
                this.maskTextureBuffer = g152;
                g152.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            }
        }
        i14 = 1;
        if (this.filterShaders != null) {
        }
        this.mProgram = new int[i14];
        this.muMVPMatrixHandle = new int[i14];
        this.muSTMatrixHandle = new int[i14];
        this.maPositionHandle = new int[i14];
        this.maTextureHandle = new int[i14];
        this.mmTextureHandle = new int[i14];
        this.maskTextureHandle = new int[i14];
        if (reVar == null) {
        }
        i17 = i16;
        if (this.filterShaders == null) {
        }
        if (reVar != null) {
        }
        FloatBuffer g1422 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
        this.renderTextureBuffer = g1422;
        g1422.put(fArr).position(0);
        FloatBuffer g1522 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(i15));
        this.maskTextureBuffer = g1522;
        g1522.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
    }

    private void applyRoundRadius(z10 z10Var, Bitmap bitmap, int i3) {
        if (bitmap == null || z10Var == null) {
            return;
        }
        if (z10Var.s == 0.0f && i3 == 0) {
            return;
        }
        if (z10Var.L == null) {
            z10Var.L = new Canvas(bitmap);
        }
        if (z10Var.s != 0.0f) {
            if (this.path == null) {
                this.path = new Path();
            }
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * z10Var.s;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
            this.path.toggleInverseFillType();
            z10Var.L.drawPath(this.path, this.xRefPaint);
        }
        if (i3 != 0) {
            if (this.textColorPaint == null) {
                Paint paint2 = new Paint(1);
                this.textColorPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            this.textColorPaint.setColor(i3);
            z10Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
        }
    }

    private int createProgram(String str, String str2, boolean z10) {
        int h;
        int glCreateProgram;
        int h7;
        int glCreateProgram2;
        if (z10) {
            int h10 = sy.h(35633, str);
            if (h10 == 0 || (h7 = sy.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h10);
            GLES20.glAttachShader(glCreateProgram2, h7);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram2;
            }
            GLES20.glDeleteProgram(glCreateProgram2);
            return 0;
        }
        int h11 = sy.h(35633, str);
        if (h11 == 0 || (h = sy.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, h11);
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

    private void destroyCollagePart(int i3, a20 a20Var) {
        if (a20Var == null) {
            return;
        }
        t5 t5Var = a20Var.u;
        if (t5Var != null) {
            t5Var.u();
            a20Var.u = null;
        }
        MediaCodecPlayer mediaCodecPlayer = a20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.release();
            a20Var.B = null;
        }
        SurfaceTexture surfaceTexture = a20Var.z;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            a20Var.z = null;
        }
    }

    private void drawBackground() {
        int i3 = this.NUM_GRADIENT_SHADER;
        if (i3 < 0) {
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
        GLES20.glUseProgram(this.mProgram[i3]);
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

    private void drawCollagePart(int i3, a20 a20Var, long j10) {
        if (a20Var.B == null || !a20Var.b) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i3]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) a20Var.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) a20Var.s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i3]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) a20Var.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) a20Var.s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(z10 z10Var, int i3, long j10) {
        z10 z10Var2;
        Bitmap bitmap;
        long j11;
        long j12;
        RLottieNative rLottieNative = z10Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap2 = z10Var.G;
            if (bitmap2 == null || z10Var.U <= 0 || z10Var.V <= 0) {
                return;
            }
            rLottieNative.c((int) z10Var.E, bitmap2, true);
            applyRoundRadius(z10Var, z10Var.G, (z10Var.b & 8) != 0 ? i3 : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, z10Var.G, 0);
            float f10 = z10Var.E + z10Var.F;
            z10Var.E = f10;
            if (f10 >= z10Var.D.a[0]) {
                z10Var.E = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], z10Var.c, z10Var.d, z10Var.f, z10Var.g, z10Var.e, (2 & z10Var.b) != 0);
            return;
        }
        if (z10Var.J == null) {
            if (z10Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, z10Var.G, 0);
                int i10 = this.stickerTexture[0];
                float f11 = z10Var.c;
                float f12 = z10Var.h;
                float f13 = f11 - (f12 / 2.0f);
                float f14 = z10Var.d;
                float f15 = z10Var.i;
                drawTexture(false, i10, f13, f14 - (f15 / 2.0f), z10Var.f + f12, f15 + z10Var.g, z10Var.e, z10Var.a == 2 && (z10Var.b & 2) != 0);
            }
            ArrayList arrayList = z10Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < z10Var.k.size(); i11++) {
                y10 y10Var = (y10) z10Var.k.get(i11);
                if (y10Var != null && (z10Var2 = y10Var.b) != null) {
                    drawEntity(z10Var2, z10Var.l, j10);
                }
            }
            return;
        }
        float f16 = z10Var.E;
        int i12 = (int) f16;
        float f17 = 1.0f;
        if (z10Var.a == 5) {
            if (this.isPhoto) {
                j11 = z10Var.T;
                j12 = 0;
            } else {
                long j13 = z10Var.Q;
                j11 = (z10Var.S - z10Var.R) + j13;
                j12 = j13;
            }
            long j14 = j10 / 1000000;
            if (j14 < j12) {
                f17 = xq.h.getInterpolation(Utilities.i(1.0f - ((j12 - j14) / 400.0f), 1.0f, 0.0f));
            } else if (j14 > j11) {
                f17 = xq.h.getInterpolation(Utilities.i(1.0f - ((j14 - j11) / 400.0f), 1.0f, 0.0f));
            }
            if (f17 > 0.0f) {
                long k10 = this.isPhoto ? Utilities.k(j14, z10Var.T, 0L) : Utilities.k((j14 - z10Var.Q) + z10Var.R, z10Var.T, 0L);
                while (!z10Var.K) {
                    int[] iArr = z10Var.J.d;
                    if (iArr[3] >= Math.min(k10, iArr[4])) {
                        break;
                    }
                    t5 t5Var = z10Var.J;
                    int i13 = t5Var.d[3];
                    t5Var.r(false);
                    int i14 = z10Var.J.d[3];
                    if (i14 <= i13 && (i14 != 0 || i13 != 0)) {
                        z10Var.K = true;
                        break;
                    }
                }
            }
        } else {
            float f18 = f16 + z10Var.F;
            z10Var.E = f18;
            for (int i15 = (int) f18; i12 != i15; i15--) {
                z10Var.J.r(true);
            }
        }
        q5 q5Var = z10Var.J.w;
        Bitmap bitmap3 = q5Var != null ? q5Var.b : null;
        if (bitmap3 != null) {
            if (z10Var.a == 5) {
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
                    applyRoundRadius(z10Var, this.stickerBitmap, (z10Var.b & 8) != 0 ? i3 : 0);
                }
                bitmap = this.stickerBitmap;
            }
            if (bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                drawTexture(false, this.stickerTexture[0], z10Var.c, z10Var.d, z10Var.f, z10Var.g, z10Var.e, (z10Var.b & 2) != 0);
            }
        }
    }

    private void drawTexture(boolean z10, int i3) {
        drawTexture(z10, i3, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer g7 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g7.put(fArr).position(0);
        return g7;
    }

    private void initCollagePart(int i3, a20 a20Var) {
        AtomicInteger atomicInteger = new AtomicInteger(a20Var.l);
        AtomicInteger atomicInteger2 = new AtomicInteger(a20Var.m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (a20Var.b) {
            GLES20.glBindTexture(36197, this.collageTextures[i3]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i3]);
            a20Var.z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(a20Var.l, a20Var.m);
            try {
                a20Var.B = new MediaCodecPlayer(a20Var.d, new Surface(a20Var.z));
            } catch (Exception e10) {
                a8.g(e10, true);
                a20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = a20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(a20Var.B.getOrientedHeight());
                atomicInteger3.set(a20Var.B.getOrientation());
            } else {
                a20Var.z.release();
                a20Var.z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i3);
                GLES20.glGenTextures(1, this.collageTextures, i3);
                GLES20.glBindTexture(3553, this.collageTextures[i3]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                t5 t5Var = new t5(new File(a20Var.d), true, 0L, 0, null, null, null, 0L, h10.t0, true, 512, 512, null, 0, true);
                a20Var.u = t5Var;
                if (t5Var.y && t5Var.f0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                a20Var.v = 1000.0f / t5Var.d[5];
                Bitmap r5 = t5Var.r(false);
                if (r5 != null) {
                    GLUtils.texImage2D(3553, 0, r5, 0);
                }
                atomicInteger.set(a20Var.u.getIntrinsicWidth());
                atomicInteger2.set(a20Var.u.getIntrinsicHeight());
                atomicInteger3.set(a20Var.u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i3]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(a20Var.d, options);
            Pair N0 = g0.N0(a20Var.d);
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
        float a10 = a20Var.r.a(2.0f) - 1.0f;
        float f10 = -(((2.0f / r7.a.c) * r7.c) - 1.0f);
        float b10 = a20Var.r.b(2.0f) - 1.0f;
        float f11 = -(((2.0f / r9.a.c) * r9.c) - 1.0f);
        float a11 = a20Var.r.a(2.0f) - 1.0f;
        float f12 = -(((2.0f / r11.a.c) * (r11.c + 1)) - 1.0f);
        float b11 = a20Var.r.b(2.0f) - 1.0f;
        s sVar = a20Var.r;
        int i10 = sVar.a.c;
        int i11 = sVar.c;
        float[] fArr = {a10, f10, b10, f11, a11, f12, b11, -(((2.0f / i10) * (i11 + 1)) - 1.0f)};
        float f13 = this.transformedWidth / r15.d[i11];
        float f14 = this.transformedHeight / i10;
        int i12 = atomicInteger.get();
        int i13 = atomicInteger2.get();
        int i14 = atomicInteger3.get();
        float f15 = i12;
        float f16 = i13;
        float max = 1.0f / Math.max(f13 / f15, f14 / f16);
        float f17 = ((f13 * max) / f15) / 2.0f;
        float f18 = ((f14 * max) / f16) / 2.0f;
        if ((i14 / 90) % 2 != 1) {
            f18 = f17;
            f17 = f18;
        }
        float f19 = 0.5f - f18;
        float f20 = 0.5f - f17;
        float f21 = f18 + 0.5f;
        float f22 = f17 + 0.5f;
        float[] fArr2 = {f19, f20, f21, f20, f19, f22, f21, f22};
        while (i14 > 0) {
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f23;
            fArr2[3] = f24;
            i14 -= 90;
        }
        while (i14 < 0) {
            float f25 = fArr2[0];
            float f26 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f25;
            fArr2[5] = f26;
            i14 += 90;
        }
        a20Var.s = floats(fArr);
        a20Var.t = floats(fArr2);
    }

    private void initLinkEntity(z10 z10Var) {
        h0 h0Var = new h0(t0.b, z10Var.P);
        h0Var.V = true;
        h0Var.b(h10.t0, z10Var.W, false);
        if (h0Var.e()) {
            h0Var.setPreviewType(z10Var.b);
        } else {
            h0Var.c(z10Var.b, z10Var.l);
        }
        int i3 = z10Var.q;
        int i10 = h0Var.f;
        h0Var.setMaxWidth(i3 + i10 + i10);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec(z10Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(z10Var.r, TLObject.FLAG_30));
        h0Var.layout(0, 0, z10Var.q, z10Var.r);
        float f10 = z10Var.f * this.transformedWidth;
        int i11 = z10Var.q;
        float f11 = f10 / i11;
        z10Var.G = Bitmap.createBitmap(((int) (i11 * f11)) + 16, ((int) (z10Var.r * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(z10Var.G);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        h0Var.draw(canvas);
        float f13 = 16 * f11;
        z10Var.h = f13 / this.transformedWidth;
        z10Var.i = f13 / this.transformedHeight;
    }

    private void initLocationEntity(z10 z10Var) {
        float f10;
        byte b10 = z10Var.a;
        l0 l0Var = new l0(t0.b, z10Var.P);
        l0Var.setIsVideo(true);
        l0Var.setText(z10Var.j);
        l0Var.e(z10Var.b, z10Var.l);
        if (z10Var.O != null && z10Var.k.isEmpty()) {
            l0Var.d(h10.t0, z10Var.O.c);
        }
        l0Var.setMaxWidth(z10Var.q);
        if (z10Var.k.size() == 1) {
            l0Var.y = true;
            l0Var.c = true;
            l0Var.requestLayout();
        }
        l0Var.measure(View.MeasureSpec.makeMeasureSpec(z10Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(z10Var.r, TLObject.FLAG_30));
        l0Var.layout(0, 0, z10Var.q, z10Var.r);
        float f11 = z10Var.f * this.transformedWidth;
        float f12 = z10Var.q;
        float f13 = f11 / f12;
        z10Var.G = Bitmap.createBitmap(((int) (f12 * f13)) + 16, ((int) (z10Var.r * f13)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(z10Var.G);
        float f14 = 8;
        canvas.translate(f14, f14);
        canvas.scale(f13, f13);
        l0Var.draw(canvas);
        float f15 = 16 * f13;
        z10Var.h = f15 / this.transformedWidth;
        z10Var.i = f15 / this.transformedHeight;
        if (z10Var.k.size() == 1) {
            y10 y10Var = (y10) z10Var.k.get(0);
            z10 z10Var2 = new z10();
            y10Var.b = z10Var2;
            z10Var2.j = y10Var.a;
            z10Var2.b = y10Var.c;
            RectF rectF = new RectF();
            float f16 = l0Var.J;
            float f17 = l0Var.d.left + 2.25f;
            float f18 = l0Var.E;
            float f19 = l0Var.K;
            float f20 = l0Var.O;
            float f21 = f18 * 21.33f;
            rectF.set((f17 * f18) + f16, com.google.android.recaptcha.internal.a.z(f20, f21, 2.0f, f19), org.telegram.messenger.camera.q.b(f17, 21.33f, f18, f16), k5.a(f21, f20, 2.0f, f19));
            float centerX = ((rectF.centerX() / z10Var.q) * z10Var.f) + z10Var.c;
            float f22 = z10Var.d;
            float centerY = rectF.centerY() / z10Var.r;
            float f23 = z10Var.g;
            float f24 = (centerY * f23) + f22;
            if (z10Var.e != 0.0f) {
                float f25 = (z10Var.f / 2.0f) + z10Var.c;
                float f26 = (f23 / 2.0f) + z10Var.d;
                float f27 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f25;
                double d10 = (f24 - f26) / f27;
                f10 = 2.0f;
                float cos = ((float) ((Math.cos(-r2) * d) - (Math.sin(-z10Var.e) * d10))) + f25;
                f24 = (((float) p1.c(-z10Var.e, d10, Math.sin(-z10Var.e) * d)) * f27) + f26;
                centerX = cos;
            } else {
                f10 = 2.0f;
            }
            y10Var.b.f = (rectF.width() / z10Var.q) * z10Var.f;
            y10Var.b.g = (rectF.height() / z10Var.r) * z10Var.g;
            z10 z10Var3 = y10Var.b;
            float f28 = z10Var3.f * 1.2f;
            z10Var3.f = f28;
            float f29 = z10Var3.g * 1.2f;
            z10Var3.g = f29;
            z10Var3.c = centerX - (f28 / f10);
            z10Var3.d = f24 - (f29 / f10);
            z10Var3.e = z10Var.e;
            initStickerEntity(z10Var3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initStickerEntity(z10 z10Var) {
        re reVar;
        int i3;
        int i10 = (int) (z10Var.f * this.transformedWidth);
        z10Var.U = i10;
        int i11 = (int) (z10Var.g * this.transformedHeight);
        z10Var.V = i11;
        if (i10 > 512) {
            z10Var.V = (int) ((i11 / i10) * 512.0f);
            z10Var.U = 512;
        }
        int i12 = z10Var.V;
        if (i12 > 512) {
            z10Var.U = (int) ((z10Var.U / i12) * 512.0f);
            z10Var.V = 512;
        }
        byte b10 = z10Var.b;
        if ((b10 & 1) != 0) {
            int i13 = z10Var.U;
            if (i13 <= 0 || (i3 = z10Var.V) <= 0) {
                return;
            }
            z10Var.G = Bitmap.createBitmap(i13, i3, Bitmap.Config.ARGB_8888);
            RLottieNative a10 = RLottieNative.a(z10Var.j, null, null, null, 0, null);
            z10Var.D = a10;
            z10Var.F = a10 != null ? a10.a[1] / this.videoFps : 0.0f;
            return;
        }
        if ((b10 & 4) != 0) {
            z10Var.K = false;
            t5 t5Var = new t5(new File(z10Var.j), true, 0L, 0, null, null, null, 0L, h10.t0, true, 512, 512, null, 0, true);
            z10Var.J = t5Var;
            z10Var.F = t5Var.d[5] / this.videoFps;
            z10Var.E = 1.0f;
            t5Var.r(true);
            return;
        }
        String str = z10Var.j;
        if (!TextUtils.isEmpty(z10Var.t) && (z10Var.b & 16) != 0) {
            str = z10Var.t;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z10Var.a == 2) {
            options.inMutable = true;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        z10Var.G = decodeFile;
        if (decodeFile != null && (reVar = z10Var.u) != null) {
            Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, reVar.e * decodeFile.getWidth()), (int) Math.max(1.0f, z10Var.u.f * z10Var.G.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(-z10Var.u.z);
            int width = z10Var.G.getWidth();
            int height = z10Var.G.getHeight();
            re reVar2 = z10Var.u;
            if (((reVar2.z + reVar2.k) / 90) % 2 == 1) {
                width = z10Var.G.getHeight();
                height = z10Var.G.getWidth();
            }
            re reVar3 = z10Var.u;
            float f10 = reVar3.e;
            float f11 = reVar3.f;
            float f12 = width;
            float f13 = height;
            canvas.clipRect(((-width) * f10) / 2.0f, ((-height) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
            float f14 = z10Var.u.c;
            canvas.scale(f14, f14);
            re reVar4 = z10Var.u;
            canvas.translate(reVar4.a * f12, reVar4.b * f13);
            canvas.rotate(z10Var.u.d + r10.k);
            if (z10Var.u.l) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.rotate(z10Var.u.z);
            canvas.translate((-z10Var.G.getWidth()) / 2.0f, (-z10Var.G.getHeight()) / 2.0f);
            canvas.drawBitmap(z10Var.G, 0.0f, 0.0f, (Paint) null);
            z10Var.G.recycle();
            z10Var.G = createBitmap;
        }
        if (z10Var.a != 2 || z10Var.G == null) {
            if (z10Var.G != null) {
                float width2 = r2.getWidth() / z10Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f15 = z10Var.g;
                    float f16 = f15 / width2;
                    z10Var.d = com.google.android.recaptcha.internal.a.z(f15, f16, 2.0f, z10Var.d);
                    z10Var.g = f16;
                    return;
                }
                if (width2 < 1.0f) {
                    float f17 = z10Var.f;
                    float f18 = width2 * f17;
                    z10Var.c = com.google.android.recaptcha.internal.a.z(f17, f18, 2.0f, z10Var.c);
                    z10Var.f = f18;
                    return;
                }
                return;
            }
            return;
        }
        z10Var.s = g0.L(12.0f) / Math.min(z10Var.q, z10Var.r);
        Pair N0 = g0.N0(z10Var.j);
        z10Var.e = (float) (z10Var.e - Math.toRadians(((Integer) N0.first).intValue()));
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f19 = z10Var.c;
            float f20 = z10Var.f;
            float f21 = (f20 / 2.0f) + f19;
            float f22 = z10Var.d;
            float f23 = z10Var.g;
            float f24 = (f23 / 2.0f) + f22;
            float f25 = this.transformedWidth;
            float f26 = this.transformedHeight;
            float f27 = (f20 * f25) / f26;
            float f28 = (f23 * f26) / f25;
            z10Var.f = f28;
            z10Var.g = f27;
            z10Var.c = f21 - (f28 / 2.0f);
            z10Var.d = f24 - (f27 / 2.0f);
        }
        applyRoundRadius(z10Var, z10Var.G, 0);
    }

    private void initTextEntity(final z10 z10Var) {
        Typeface d;
        final ug.b bVar = new ug.b(t0.b);
        bVar.getPaint().setAntiAlias(true);
        bVar.H = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
        b0 b0Var = z10Var.n;
        if (b0Var != null && (d = b0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, z10Var.m);
        SpannableString spannableString = new SpannableString(z10Var.j);
        ArrayList arrayList = z10Var.k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            final y10 y10Var = (y10) arrayList.get(i3);
            if (y10Var.a != null) {
                z10 z10Var2 = new z10();
                y10Var.b = z10Var2;
                z10Var2.j = y10Var.a;
                z10Var2.b = y10Var.c;
                p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.TextureRenderer.1
                    @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
                    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f10, int i13, int i14, int i15, Paint paint) {
                        super.draw(canvas, charSequence, i11, i12, f10, i13, i14, i15, paint);
                        z10 z10Var3 = z10Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / z10Var3.q) * z10Var3.f) + z10Var.c;
                        float f11 = z10Var3.d;
                        z10 z10Var4 = z10Var;
                        float f12 = z10Var4.g;
                        float paddingTop = (((((i15 - i13) / 2.0f) + (bVar.getPaddingTop() + i13)) / z10Var4.r) * f12) + f11;
                        if (z10Var4.e != 0.0f) {
                            float f13 = (z10Var4.f / 2.0f) + z10Var4.c;
                            float f14 = (f12 / 2.0f) + z10Var4.d;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d10 = paddingLeft - f13;
                            double d11 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-z10Var.e) * d10) - (Math.sin(-z10Var.e) * d11))) + f13;
                            paddingTop = (((float) p1.c(-z10Var.e, d11, Math.sin(-z10Var.e) * d10)) * f15) + f14;
                        }
                        z10 z10Var5 = y10Var.b;
                        int i16 = this.measuredSize;
                        z10 z10Var6 = z10Var;
                        float f16 = (i16 / z10Var6.q) * z10Var6.f;
                        z10Var5.f = f16;
                        float f17 = (i16 / z10Var6.r) * z10Var6.g;
                        z10Var5.g = f17;
                        z10Var5.c = paddingLeft - (f16 / 2.0f);
                        z10Var5.d = paddingTop - (f17 / 2.0f);
                        z10Var5.e = z10Var6.e;
                        if (z10Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(z10Var5);
                        }
                    }
                };
                int i11 = y10Var.offset;
                spannableString.setSpan(p5Var, i11, y10Var.length + i11, 33);
            }
            i3 = i10;
        }
        bVar.setText(i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(z10Var.l);
        Editable text = bVar.getText();
        if (text != null) {
            for (f6 f6Var : (f6[]) text.getSpans(0, text.length(), f6.class)) {
                f6Var.b = 0.85f;
            }
        }
        int i12 = z10Var.p;
        bVar.setGravity(i12 != 1 ? i12 != 2 ? 19 : 21 : 17);
        int i13 = z10Var.p;
        bVar.setTextAlignment(i13 != 1 ? (i13 == 2 ? !bd.a0 : bd.a0) ? 3 : 2 : 4);
        bVar.setHorizontallyScrolling(false);
        bVar.setImeOptions(TLObject.FLAG_28);
        bVar.setFocusableInTouchMode(true);
        bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
        setBreakStrategy(bVar);
        byte b10 = z10Var.b;
        if (b10 == 0) {
            bVar.setFrameColor(z10Var.l);
            bVar.setTextColor(g0.B(z10Var.l) >= 0.721f ? -16777216 : -1);
        } else if (b10 == 1) {
            bVar.setFrameColor(g0.B(z10Var.l) >= 0.25f ? -1728053248 : -1711276033);
            bVar.setTextColor(z10Var.l);
        } else if (b10 == 2) {
            bVar.setFrameColor(g0.B(z10Var.l) >= 0.25f ? -16777216 : -1);
            bVar.setTextColor(z10Var.l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(z10Var.l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(z10Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(z10Var.r, TLObject.FLAG_30));
        bVar.layout(0, 0, z10Var.q, z10Var.r);
        z10Var.G = Bitmap.createBitmap(z10Var.q, z10Var.r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(z10Var.G));
    }

    private boolean isCollage() {
        return this.collageParts != null;
    }

    private void stepCollagePart(int i3, a20 a20Var, long j10) {
        float f10;
        Bitmap r5;
        long j11;
        long j12 = (j10 / 1000000) - a20Var.f;
        float f11 = a20Var.k;
        long j13 = a20Var.o;
        long k10 = Utilities.k(j12, (long) (f11 * j13), (long) (a20Var.j * j13));
        MediaCodecPlayer mediaCodecPlayer = a20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            a20Var.z.updateTexImage();
            return;
        }
        t5 t5Var = a20Var.u;
        if (t5Var != null) {
            int i10 = t5Var.d[3];
            boolean z10 = i10 <= 0;
            if ((k10 < i10 || (z10 && k10 > 1000)) && t5Var.e0 != null) {
                t5Var.e0.g(k10, true);
            }
            do {
                t5 t5Var2 = a20Var.u;
                int i11 = t5Var2.d[3];
                f10 = k10;
                if ((a20Var.v * 2.0f) + i11 >= f10) {
                    break;
                }
                j11 = i11;
                if (t5Var2.e0 != null) {
                    t5Var2.e0.c(null, false, t5Var2.h0, t5Var2.i0, false);
                }
            } while (a20Var.u.d[3] != j11);
            if ((z10 || f10 > a20Var.u.d[3] - (a20Var.v / 2.0f)) && (r5 = a20Var.u.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i3]);
                GLUtils.texImage2D(3553, 0, r5, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z10) {
        int createProgram;
        int createProgram2;
        String str3 = this.messageVideoMaskPath != null ? z10 ? VERTEX_SHADER_MASK_300 : VERTEX_SHADER_MASK : z10 ? VERTEX_SHADER_300 : VERTEX_SHADER;
        int i3 = this.NUM_EXTERNAL_SHADER;
        if (i3 >= 0 && i3 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z10)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i10 = this.NUM_FILTER_SHADER;
        if (i10 < 0 || i10 >= this.mProgram.length || (createProgram = createProgram(str3, str2, z10)) == 0) {
            return;
        }
        GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
        this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j10) {
        int i3;
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
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i11 = 3042;
            i14 = 0;
            i3 = 33985;
            i15 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (r2.a && this.firstFrame) {
                StringBuilder sb2 = new StringBuilder();
                int i19 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i3 = 33985;
                    if (i19 >= fArr2.length) {
                        break;
                    }
                    sb2.append(fArr2[i19]);
                    sb2.append(", ");
                    i19++;
                }
                a8.b("stMatrix = " + ((Object) sb2));
                this.firstFrame = false;
            } else {
                i3 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            sy syVar = this.filterShaders;
            if (syVar != null) {
                syVar.P0 = this.mSTMatrix;
                syVar.W0 = false;
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.f();
                this.filterShaders.d();
                this.filterShaders.e();
                this.filterShaders.c();
                boolean b10 = this.filterShaders.b();
                GLES20.glBindFramebuffer(36160, 0);
                int i20 = this.transformedWidth;
                if (i20 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i20, this.transformedHeight);
                }
                int g7 = this.filterShaders.g(!b10 ? 1 : 0);
                int i21 = this.NUM_FILTER_SHADER;
                i11 = 3042;
                fArr = this.mSTMatrixIdentity;
                i12 = i21;
                i13 = g7;
                i14 = b10 ? 1 : 0;
                i10 = 3553;
            } else {
                int i22 = this.mTextureID;
                int i23 = this.NUM_EXTERNAL_SHADER;
                i10 = 36197;
                i11 = 3042;
                fArr = this.mSTMatrix;
                i12 = i23;
                i13 = i22;
                i14 = 0;
            }
            drawBackground();
            i15 = 33984;
            GLES20.glUseProgram(this.mProgram[i12]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i10, i13);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i3);
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
            int i24 = this.texSizeHandle;
            if (i24 != 0) {
                GLES20.glUniform2f(i24, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i12], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i12], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i11);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath == null || (iArr = this.paintTexture) == null) {
                sy syVar2 = this.filterShaders;
                if (syVar2 != null) {
                    i16 = syVar2.g(i14 ^ 1);
                    sy syVar3 = this.filterShaders;
                    int i25 = syVar3.X0;
                    i18 = syVar3.Y0;
                    i17 = i25;
                } else {
                    i16 = -1;
                    i17 = 1;
                    i18 = 1;
                }
            } else {
                i16 = iArr[0];
                i17 = this.imageWidth;
                i18 = this.imageHeight;
            }
            if (i16 != -1) {
                this.blur.a(i16, i17, i18, null);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i15);
                GLES20.glBindTexture(3553, this.blur.s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i3);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i26 = 0; i26 < this.collageParts.size(); i26++) {
                stepCollagePart(i26, this.collageParts.get(i26), j10);
                drawCollagePart(i26, this.collageParts.get(i26), j10);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i15);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            drawTexture(true, this.paintTexture[this.imagePathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto, -1);
        }
        int i27 = this.paintPathIndex;
        if (i27 >= 0) {
            drawTexture(true, this.paintTexture[i27], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i28 = this.messagePathIndex;
        if (i28 >= 0) {
            drawTexture(true, this.paintTexture[i28], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i29 = 0; i29 < size; i29++) {
                drawEntity(this.mediaEntities.get(i29), this.mediaEntities.get(i29).l, j10);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<z10> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                z10 z10Var = this.mediaEntities.get(i3);
                RLottieNative rLottieNative = z10Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                t5 t5Var = z10Var.J;
                if (t5Var != null) {
                    t5Var.u();
                }
                View view = z10Var.I;
                if (view instanceof bt) {
                    bt btVar = (bt) view;
                    p5.release(btVar, btVar.F);
                }
                Bitmap bitmap = z10Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    z10Var.G = null;
                }
            }
        }
        ArrayList<a20> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                arrayList2.get(i10);
                i10++;
                for (int i11 = 0; i11 < this.collageParts.size(); i11++) {
                    destroyCollagePart(i11, this.collageParts.get(i11));
                }
            }
        }
    }

    public void setBreakStrategy(ug.b bVar) {
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
        int i3;
        String str;
        int i10;
        int i11;
        float max;
        re reVar;
        int i12 = 0;
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
            } catch (Exception e10) {
                a8.g(e10, true);
                this.videoMaskTexture = -1;
            }
        }
        if (this.blurPath != null && (reVar = this.cropState) != null && reVar.B != null) {
            ca caVar = new ca();
            this.blur = caVar;
            if (caVar.b(this.transformedWidth / this.transformedHeight, 0)) {
                ca caVar2 = this.blur;
                int i17 = this.gradientTopColor;
                int i18 = this.gradientBottomColor;
                caVar2.l = i17;
                caVar2.m = i18;
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
                int h = sy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                int h7 = sy.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D blurImage;uniform sampler2D maskImage;void main() {gl_FragColor = texture2D(blurImage, vTextureCoord) * texture2D(maskImage, vTextureCoord).a;}");
                if (h == 0 || h7 == 0) {
                    this.blur = null;
                } else {
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.blurShaderProgram = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(this.blurShaderProgram, h7);
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
                        FloatBuffer g7 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                        this.blurVerticesBuffer = g7;
                        g7.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f}).position(0);
                    }
                }
            }
        }
        if (this.filterShaders != null || this.imagePath != null || this.paintPath != null || this.messagePath != null || this.mediaEntities != null || isCollage()) {
            int h10 = sy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h11 = sy.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
            if (h10 != 0 && h11 != 0) {
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.simpleShaderProgram = glCreateProgram2;
                GLES20.glAttachShader(glCreateProgram2, h10);
                GLES20.glAttachShader(this.simpleShaderProgram, h11);
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
            int h12 = sy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int h13 = sy.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replaceAll("sampler2D", "samplerExternalOES"));
            if (h12 != 0 && h13 != 0) {
                int glCreateProgram3 = GLES20.glCreateProgram();
                this.simpleShaderProgramOES = glCreateProgram3;
                GLES20.glAttachShader(glCreateProgram3, h12);
                GLES20.glAttachShader(this.simpleShaderProgramOES, h13);
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
        sy syVar = this.filterShaders;
        if (syVar != null) {
            syVar.a();
            this.filterShaders.i(null, 0, this.mTextureID, this.originalWidth, this.originalHeight);
        }
        String str7 = this.imagePath;
        if (str7 != null || this.paintPath != null || this.messagePath != null) {
            if (str7 != null) {
                this.imagePathIndex = 0;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (this.paintPath != null) {
                this.paintPathIndex = i3;
                i3++;
            }
            if (this.messagePath != null) {
                this.messagePathIndex = i3;
                i3++;
            }
            if (this.backgroundPath != null) {
                this.backgroundPathIndex = i3;
                i3++;
            }
            int[] iArr7 = new int[i3];
            this.paintTexture = iArr7;
            GLES20.glGenTextures(i3, iArr7, 0);
            int i19 = 0;
            while (i19 < this.paintTexture.length) {
                try {
                    if (i19 == this.imagePathIndex) {
                        str = this.imagePath;
                        Pair N0 = g0.N0(str);
                        i11 = ((Integer) N0.first).intValue();
                        i10 = ((Integer) N0.second).intValue();
                    } else {
                        str = i19 == this.paintPathIndex ? this.paintPath : i19 == this.backgroundPathIndex ? this.backgroundPath : this.messagePath;
                        i10 = i12;
                        i11 = i10;
                    }
                    Bitmap decodeFile3 = BitmapFactory.decodeFile(str);
                    if (decodeFile3 != null) {
                        if (i19 == this.imagePathIndex && !this.useMatrixForImagePath) {
                            Bitmap createBitmap = Bitmap.createBitmap(this.transformedWidth, this.transformedHeight, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(-16777216);
                            Canvas canvas = new Canvas(createBitmap);
                            if (i11 != 90 && i11 != 270) {
                                max = Math.max(decodeFile3.getWidth() / this.transformedWidth, decodeFile3.getHeight() / this.transformedHeight);
                                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                                matrix3.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                                float f10 = -1.0f;
                                float f11 = (i10 != 1 ? -1.0f : 1.0f) / max;
                                if (i10 == 2) {
                                    f10 = 1.0f;
                                }
                                matrix3.postScale(f11, f10 / max);
                                matrix3.postRotate(i11);
                                matrix3.postTranslate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                                canvas.drawBitmap(decodeFile3, matrix3, new Paint(2));
                                decodeFile3 = createBitmap;
                            }
                            max = Math.max(decodeFile3.getHeight() / this.transformedWidth, decodeFile3.getWidth() / this.transformedHeight);
                            android.graphics.Matrix matrix32 = new android.graphics.Matrix();
                            matrix32.postTranslate((-decodeFile3.getWidth()) / 2, (-decodeFile3.getHeight()) / 2);
                            float f102 = -1.0f;
                            float f112 = (i10 != 1 ? -1.0f : 1.0f) / max;
                            if (i10 == 2) {
                            }
                            matrix32.postScale(f112, f102 / max);
                            matrix32.postRotate(i11);
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
                    i12 = 0;
                } catch (Throwable th2) {
                    a8.g(th2, true);
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
            } catch (Exception e11) {
                a8.g(e11, true);
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
                z10 z10Var = this.mediaEntities.get(i21);
                byte b10 = z10Var.a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(z10Var);
                    } else if (b10 == 3) {
                        initLocationEntity(z10Var);
                    } else if (b10 == 7) {
                        initLinkEntity(z10Var);
                    }
                }
                initStickerEntity(z10Var);
            }
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
    }

    private void drawTexture(boolean z10, int i3, float f10, float f11, float f12, float f13, float f14, boolean z11) {
        drawTexture(z10, i3, f10, f11, f12, f13, f14, z11, false, -1);
    }

    private void drawTexture(boolean z10, int i3, float f10, float f11, float f12, float f13, float f14, boolean z11, boolean z12, int i10) {
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
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                float[] fArr4 = this.bitmapData;
                int i13 = i11 * 2;
                int i14 = i13 + 1;
                double d = fArr4[i13] - f21;
                double d10 = f14;
                float f25 = f21;
                double d11 = (fArr4[i14] - f24) / f23;
                fArr4[i13] = ((float) ((Math.cos(d10) * d) - (Math.sin(d10) * d11))) + f25;
                this.bitmapData[i14] = (((float) p1.c(d10, d11, Math.sin(d10) * d)) * f23) + f24;
                i11++;
                f21 = f25;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z10) {
            GLES20.glBindTexture(3553, i3);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}
