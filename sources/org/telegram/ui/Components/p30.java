package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p30 {
    public final int a;
    public final int b;
    public final FloatBuffer g;
    public final FloatBuffer h;
    public final int[] k;
    public final e4.b c = new e4.b(R.raw.round_blur_stage_0_frag);
    public final e4.b d = new e4.b(R.raw.round_blur_stage_3_frag);
    public final n30 e = new n30();
    public final o30 f = new o30();
    public int i = 0;
    public final int[] j = new int[1];

    public p30(int i7, int i10) {
        float f10;
        char c10;
        int i11;
        RLottieNative rLottieNative;
        int i12;
        Bitmap bitmap;
        int i13;
        int i14;
        Object obj;
        int i15 = 0;
        int[] iArr = new int[5];
        this.k = iArr;
        this.a = i7;
        this.b = i10;
        float[] fArr = new float[org.telegram.messenger.qs.I3];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        float f11 = 1.0f;
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i16 = 0;
        for (int i17 = 5; i16 < i17; i17 = 5) {
            GLES20.glBindTexture(3553, this.k[i16]);
            GLES20.glTexParameteri(3553, 10241, i16 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i16 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i18 = 4;
            if (i16 == 4) {
                int round = Math.round(i7 * 0.2f);
                int round2 = Math.round((i7 * 28) / 1536.0f);
                int i19 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(org.telegram.messenger.g0.y2(null, R.raw.plane_logo_plain), null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                float f12 = f11;
                Bitmap createBitmap2 = Bitmap.createBitmap(i19 * 8, i19 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(createBitmap2);
                int i20 = 0;
                while (i20 < 8) {
                    int i21 = 0;
                    while (i21 < i18) {
                        int i22 = (i21 * 8) + i20;
                        if (i22 >= 27) {
                            obj = obj2;
                            bitmap = createBitmap;
                            i11 = i19;
                            i12 = i20;
                            rLottieNative = b10;
                            i13 = i21;
                            i14 = 4;
                        } else {
                            int i23 = (i22 * 8) + 16;
                            i11 = i19;
                            rLottieNative = b10;
                            i12 = i20;
                            bitmap = createBitmap;
                            i13 = i21;
                            i14 = 4;
                            c(fArr, i23, i20 / 8.0f, i21 / 4.0f, (i20 + 1) / 8.0f, (i21 + 1) / 4.0f);
                            rLottieNative.c(i22 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i11 * i12) - round2, (i11 * i13) - round2, (Paint) null);
                        }
                        i19 = i11;
                        b10 = rLottieNative;
                        i21 = i13 + 1;
                        obj2 = obj;
                        createBitmap = bitmap;
                        i20 = i12;
                        i18 = i14;
                    }
                    i20++;
                    obj2 = obj2;
                    i18 = i18;
                }
                float c11 = com.google.android.recaptcha.internal.a.c(i19, this.a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, c11, c11);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
                f10 = f12;
                c10 = 0;
            } else {
                float f13 = f11;
                if (i16 == 3) {
                    int round3 = Math.round((i7 * 372.0f) / 1536.0f);
                    float f14 = (round3 / this.a) * 2.0f;
                    c10 = 0;
                    f10 = f13;
                    d(fArr2, 12, f13 - f14, f14 - 1.0f, f10);
                    Bitmap x02 = org.telegram.messenger.g0.x0();
                    if (x02 != null) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(x02, round3, round3, true);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        GLUtils.texImage2D(3553, 0, extractAlpha, 0);
                        extractAlpha.recycle();
                        createScaledBitmap.recycle();
                        x02.recycle();
                    }
                } else {
                    f10 = f13;
                    c10 = 0;
                    GLES20.glTexImage2D(3553, 0, 6408, i16 == 0 ? this.a : 48, i16 == 0 ? this.b : 48, 0, 6408, 5121, null);
                }
            }
            i16++;
            f11 = f10;
            i15 = 0;
        }
        int i24 = i15;
        GLES20.glBindTexture(3553, i24);
        GLES20.glGenFramebuffers(1, this.j, i24);
        FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(org.telegram.messenger.qs.a2));
        this.g = g10;
        g10.put(fArr2).position(i24);
        FloatBuffer g11 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(928));
        this.h = g11;
        g11.put(fArr).position(i24);
    }

    public static int a(int i7, int i10) {
        int glCreateShader = GLES20.glCreateShader(i7);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, org.telegram.messenger.g0.y2(null, i10));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        org.telegram.messenger.a8.d("GlUtils: compile shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void c(float[] fArr, int i7, float f10, float f11, float f12, float f13) {
        fArr[i7] = f10;
        fArr[i7 + 1] = f13;
        fArr[i7 + 2] = f12;
        fArr[i7 + 3] = f13;
        fArr[i7 + 4] = f10;
        fArr[i7 + 5] = f11;
        fArr[i7 + 6] = f12;
        fArr[i7 + 7] = f11;
    }

    public static void d(float[] fArr, int i7, float f10, float f11, float f12) {
        fArr[i7] = f10;
        fArr[i7 + 1] = -1.0f;
        fArr[i7 + 2] = 0.0f;
        fArr[i7 + 3] = f12;
        fArr[i7 + 4] = -1.0f;
        fArr[i7 + 5] = 0.0f;
        fArr[i7 + 6] = f10;
        fArr[i7 + 7] = f11;
        fArr[i7 + 8] = 0.0f;
        fArr[i7 + 9] = f12;
        fArr[i7 + 10] = f11;
        fArr[i7 + 11] = 0.0f;
    }

    public final void b() {
        this.c.a();
        this.e.a();
        this.f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.k, 0);
        GLES20.glDeleteFramebuffers(1, this.j, 0);
    }
}
