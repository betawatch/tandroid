package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* loaded from: classes5.dex */
public class InstantCameraVideoEncoderOverlayHelper {
    private final FloatBuffer attributeTextureBuffer;
    private final FloatBuffer attributeVertexBuffer;
    private final int[] glTextures;
    private final int videoHeight;
    private final int videoWidth;
    private final Program programRenderTexture = new Program(R.raw.round_blur_stage_0_frag);
    private final Program programRenderWatermark = new Program(R.raw.round_blur_stage_3_frag);
    private final BlurProgram programRenderBlur = new BlurProgram();
    private final MixProgram programRenderMixed = new MixProgram();
    private int logoFrame = 0;
    private final int[] glFrameBuffers = new int[1];

    public InstantCameraVideoEncoderOverlayHelper(int i, int i2) {
        float[] fArr;
        int i3;
        int i4;
        float[] fArr2;
        Bitmap bitmap;
        RLottieNative rLottieNative;
        int i5;
        Canvas canvas;
        int i6;
        int i7 = i;
        int i8 = 0;
        int[] iArr = new int[5];
        this.glTextures = iArr;
        this.videoWidth = i7;
        this.videoHeight = i2;
        float[] fArr3 = new float[NotificationCenter.starGiftSoldOut];
        setTextureCords(fArr3, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        setTextureCords(fArr3, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr4 = new float[36];
        setVertexCords(fArr4, 0, -1.0f, 1.0f, 1.0f, -1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i9 = 0;
        for (int i10 = 5; i9 < i10; i10 = 5) {
            GLES20.glBindTexture(3553, this.glTextures[i9]);
            GLES20.glTexParameteri(3553, 10241, i9 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i9 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i11 = 4;
            if (i9 == 4) {
                int round = Math.round(i7 * 0.2f);
                int round2 = Math.round((i7 * 28) / 1536.0f);
                int i12 = (round - round2) - round2;
                RLottieNative createFromRawJson = RLottieNative.createFromRawJson(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                Bitmap createBitmap2 = Bitmap.createBitmap(i12 * 8, i12 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap2);
                int i13 = 0;
                while (i13 < 8) {
                    int i14 = 0;
                    while (i14 < i11) {
                        int i15 = (i14 * 8) + i13;
                        if (i15 >= 27) {
                            i5 = i9;
                            fArr2 = fArr3;
                            i4 = i13;
                            bitmap = createBitmap;
                            rLottieNative = createFromRawJson;
                            canvas = canvas2;
                            i6 = i12;
                        } else {
                            i4 = i13;
                            float[] fArr5 = fArr3;
                            fArr2 = fArr3;
                            bitmap = createBitmap;
                            rLottieNative = createFromRawJson;
                            i5 = i9;
                            canvas = canvas2;
                            i6 = i12;
                            setTextureCords(fArr5, (i15 * 8) + 16, i13 / 8.0f, i14 / 4.0f, (i13 + 1) / 8.0f, (i14 + 1) / 4.0f);
                            rLottieNative.getFrame(i15 * 2, bitmap, true);
                            canvas.drawBitmap(bitmap, (i6 * i4) - round2, (i6 * i14) - round2, (Paint) null);
                        }
                        i14++;
                        createFromRawJson = rLottieNative;
                        canvas2 = canvas;
                        createBitmap = bitmap;
                        i12 = i6;
                        i13 = i4;
                        i9 = i5;
                        fArr3 = fArr2;
                        i11 = 4;
                    }
                    i13++;
                    i9 = i9;
                    fArr3 = fArr3;
                    i11 = 4;
                }
                fArr = fArr3;
                float f = ((i12 / this.videoWidth) * 2.0f) - 1.0f;
                setVertexCords(fArr4, 24, -1.0f, f, f, -1.0f);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                createFromRawJson.recycle();
                i7 = i;
                i3 = i9;
            } else {
                fArr = fArr3;
                i3 = i9;
                if (i3 == 3) {
                    i7 = i;
                    int round3 = Math.round((i7 * 372.0f) / 1536.0f);
                    float f2 = (round3 / this.videoWidth) * 2.0f;
                    setVertexCords(fArr4, 12, 1.0f - f2, f2 - 1.0f, 1.0f, -1.0f);
                    Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                    if (bitmapFromRaw != null) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round3, round3, true);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        GLUtils.texImage2D(3553, 0, extractAlpha, 0);
                        extractAlpha.recycle();
                        createScaledBitmap.recycle();
                        bitmapFromRaw.recycle();
                    }
                } else {
                    i7 = i;
                    GLES20.glTexImage2D(3553, 0, 6408, i3 == 0 ? this.videoWidth : 48, i3 == 0 ? this.videoHeight : 48, 0, 6408, 5121, null);
                }
            }
            i9 = i3 + 1;
            fArr3 = fArr;
            i8 = 0;
        }
        GLES20.glBindTexture(3553, i8);
        GLES20.glGenFramebuffers(1, this.glFrameBuffers, i8);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(NotificationCenter.filePreparingStarted).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.attributeVertexBuffer = asFloatBuffer;
        asFloatBuffer.put(fArr4).position(i8);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(928).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.attributeTextureBuffer = asFloatBuffer2;
        asFloatBuffer2.put(fArr3).position(i8);
    }

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.glFrameBuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[0], 0);
        GLES20.glViewport(0, 0, this.videoWidth, this.videoHeight);
    }

    public void render() {
        GLES20.glDisable(3042);
        Program program = this.programRenderTexture;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[1], 0);
        int i = 48;
        GLES20.glViewport(0, 0, 48, 48);
        GLES20.glUseProgram(program.program);
        GLES20.glVertexAttribPointer(program.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
        GLES20.glEnableVertexAttribArray(program.attributePositionHandle);
        GLES20.glVertexAttribPointer(program.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
        GLES20.glEnableVertexAttribArray(program.attributeTextureHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.glTextures[0]);
        GLES20.glUniform1i(program.uniformTextureHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(program.attributeTextureHandle);
        GLES20.glDisableVertexAttribArray(program.attributePositionHandle);
        GLES20.glUseProgram(0);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            BlurProgram blurProgram = this.programRenderBlur;
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[i2 == 0 ? (char) 2 : (char) 1], 0);
            GLES20.glViewport(0, 0, i, i);
            GLES20.glUseProgram(blurProgram.program);
            GLES20.glVertexAttribPointer(blurProgram.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
            GLES20.glEnableVertexAttribArray(blurProgram.attributePositionHandle);
            GLES20.glVertexAttribPointer(blurProgram.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
            GLES20.glEnableVertexAttribArray(blurProgram.attributeTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.glTextures[i2 == 0 ? (char) 1 : (char) 2]);
            GLES20.glUniform1i(blurProgram.uniformTextureHandle, 0);
            int i3 = blurProgram.uniformOffsetHandle;
            float f = 0.0f;
            float f2 = i2 == 0 ? 0.020833334f : 0.0f;
            if (i2 == 1) {
                f = 0.020833334f;
            }
            GLES20.glUniform2f(i3, f2, f);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
            GLES20.glDisableVertexAttribArray(blurProgram.attributeTextureHandle);
            GLES20.glDisableVertexAttribArray(blurProgram.attributePositionHandle);
            GLES20.glUseProgram(0);
            i2++;
            i = 48;
        }
        MixProgram mixProgram = this.programRenderMixed;
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[1], 0);
        GLES20.glViewport(0, 0, this.videoWidth, this.videoHeight);
        GLES20.glUseProgram(mixProgram.program);
        GLES20.glVertexAttribPointer(mixProgram.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
        GLES20.glEnableVertexAttribArray(mixProgram.attributePositionHandle);
        GLES20.glVertexAttribPointer(mixProgram.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
        GLES20.glEnableVertexAttribArray(mixProgram.attributeTextureHandle);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.glTextures[1]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.glTextures[0]);
        GLES20.glUniform1i(mixProgram.uniformTextureHandle, 0);
        GLES20.glUniform1i(mixProgram.uniformBlurredTextureHandle, 1);
        GLES20.glUniform2f(mixProgram.uniformHalfResolutionHandle, this.videoWidth / 2.0f, this.videoHeight / 2.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(mixProgram.attributeTextureHandle);
        GLES20.glDisableVertexAttribArray(mixProgram.attributePositionHandle);
        GLES20.glUseProgram(0);
        Program program2 = this.programRenderWatermark;
        GLES20.glEnable(3042);
        GLES20.glUseProgram(program2.program);
        GLES20.glActiveTexture(33984);
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                GLES20.glVertexAttribPointer(program2.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(12));
                GLES20.glEnableVertexAttribArray(program2.attributePositionHandle);
                GLES20.glVertexAttribPointer(program2.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(8));
                GLES20.glEnableVertexAttribArray(program2.attributeTextureHandle);
                GLES20.glBindTexture(3553, this.glTextures[3]);
            } else {
                int i5 = this.logoFrame;
                this.logoFrame = i5 + 1;
                GLES20.glVertexAttribPointer(program2.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(24));
                GLES20.glEnableVertexAttribArray(program2.attributePositionHandle);
                GLES20.glVertexAttribPointer(program2.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(((i5 % 27) * 8) + 16));
                GLES20.glEnableVertexAttribArray(program2.attributeTextureHandle);
                GLES20.glBindTexture(3553, this.glTextures[4]);
            }
            GLES20.glUniform1i(program2.uniformTextureHandle, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
            GLES20.glDisableVertexAttribArray(program2.attributeTextureHandle);
            GLES20.glDisableVertexAttribArray(program2.attributePositionHandle);
        }
        GLES20.glUseProgram(0);
        GLES20.glDisable(3042);
    }

    public void destroy() {
        this.programRenderTexture.destroy();
        this.programRenderBlur.destroy();
        this.programRenderMixed.destroy();
        this.programRenderWatermark.destroy();
        GLES20.glDeleteTextures(5, this.glTextures, 0);
        GLES20.glDeleteFramebuffers(1, this.glFrameBuffers, 0);
    }

    private static class MixProgram extends Program {
        final int uniformBlurredTextureHandle;
        final int uniformHalfResolutionHandle;

        public MixProgram() {
            super(R.raw.round_blur_stage_2_frag);
            this.uniformBlurredTextureHandle = GLES20.glGetUniformLocation(this.program, "bTexture");
            this.uniformHalfResolutionHandle = GLES20.glGetUniformLocation(this.program, "center");
        }
    }

    private static class BlurProgram extends Program {
        final int uniformOffsetHandle;

        public BlurProgram() {
            super(R.raw.round_blur_stage_1_frag);
            this.uniformOffsetHandle = GLES20.glGetUniformLocation(this.program, "texOffset");
        }
    }

    private static class Program {
        final int attributePositionHandle;
        final int attributeTextureHandle;
        final int fragmentShader;
        final int program;
        final int uniformTextureHandle;
        final int vertexShader;

        public Program(int i) {
            int createShader = InstantCameraVideoEncoderOverlayHelper.createShader(35633, R.raw.round_blur_vert);
            this.vertexShader = createShader;
            int createShader2 = InstantCameraVideoEncoderOverlayHelper.createShader(35632, i);
            this.fragmentShader = createShader2;
            int createProgram = InstantCameraVideoEncoderOverlayHelper.createProgram(createShader, createShader2);
            this.program = createProgram;
            this.attributePositionHandle = GLES20.glGetAttribLocation(createProgram, "aPosition");
            this.attributeTextureHandle = GLES20.glGetAttribLocation(createProgram, "aTextureCoord");
            this.uniformTextureHandle = GLES20.glGetUniformLocation(createProgram, "sTexture");
        }

        public void destroy() {
            GLES20.glDeleteProgram(this.program);
            GLES20.glDeleteShader(this.vertexShader);
            GLES20.glDeleteShader(this.fragmentShader);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int createShader(int i, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(i2));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        FileLog.e("GlUtils: compile shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int createProgram(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, i);
        GLES20.glAttachShader(glCreateProgram, i2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    private static void setVertexCords(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = f3;
        fArr[i + 4] = f4;
        fArr[i + 5] = 0.0f;
        fArr[i + 6] = f;
        fArr[i + 7] = f2;
        fArr[i + 8] = 0.0f;
        fArr[i + 9] = f3;
        fArr[i + 10] = f2;
        fArr[i + 11] = 0.0f;
    }

    private static void setTextureCords(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = f3;
        fArr[i + 3] = f4;
        fArr[i + 4] = f;
        fArr[i + 5] = f2;
        fArr[i + 6] = f3;
        fArr[i + 7] = f2;
    }
}
