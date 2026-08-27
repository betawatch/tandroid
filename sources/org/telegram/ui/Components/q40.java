package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q40 {
    public final int a;
    public final int b;
    public final FloatBuffer g;
    public final FloatBuffer h;
    public final int[] k;
    public final p40 c = new p40(R.raw.round_blur_stage_0_frag);
    public final p40 d = new p40(R.raw.round_blur_stage_3_frag);
    public final n40 e = new n40();
    public final o40 f = new o40();
    public int i = 0;
    public final int[] j = new int[1];

    public q40(int i10, int i11) {
        int i12;
        Canvas canvas;
        int i13;
        Bitmap bitmap;
        int i14;
        Object obj;
        int[] iArr = new int[5];
        this.k = iArr;
        this.a = i10;
        this.b = i11;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i15 = 0;
        for (int i16 = 5; i15 < i16; i16 = 5) {
            GLES20.glBindTexture(3553, this.k[i15]);
            GLES20.glTexParameteri(3553, 10241, i15 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i15 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i17 = 4;
            if (i15 == 4) {
                int round = Math.round(i10 * 0.2f);
                int round2 = Math.round((i10 * 28) / 1536.0f);
                int i18 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                Bitmap createBitmap2 = Bitmap.createBitmap(i18 * 8, i18 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap2);
                int i19 = 0;
                while (i19 < 8) {
                    int i20 = 0;
                    while (i20 < i17) {
                        int i21 = (i20 * 8) + i19;
                        if (i21 >= 27) {
                            canvas = canvas2;
                            i13 = i18;
                            i12 = i19;
                            obj = obj2;
                            i14 = i20;
                            bitmap = createBitmap;
                        } else {
                            int i22 = (i21 * 8) + 16;
                            i12 = i19;
                            canvas = canvas2;
                            i13 = i18;
                            bitmap = createBitmap;
                            i14 = i20;
                            c(fArr, i22, i19 / 8.0f, i20 / 4.0f, (i19 + 1) / 8.0f, (i20 + 1) / 4.0f);
                            b10.c(i21 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i13 * i12) - round2, (i13 * i14) - round2, (Paint) null);
                        }
                        i18 = i13;
                        i20 = i14 + 1;
                        canvas2 = canvas;
                        createBitmap = bitmap;
                        i19 = i12;
                        obj2 = obj;
                        i17 = 4;
                    }
                    i19++;
                    obj2 = obj2;
                    i17 = 4;
                }
                float c10 = s3.c.c(i18, this.a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, c10, c10);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
            } else if (i15 == 3) {
                int round3 = Math.round((i10 * 372.0f) / 1536.0f);
                float f10 = (round3 / this.a) * 2.0f;
                d(fArr2, 12, 1.0f - f10, f10 - 1.0f, 1.0f);
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
                GLES20.glTexImage2D(3553, 0, 6408, i15 == 0 ? this.a : 48, i15 == 0 ? this.b : 48, 0, 6408, 5121, null);
            }
            i15++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.j, 0);
        FloatBuffer f11 = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(144));
        this.g = f11;
        f11.put(fArr2).position(0);
        FloatBuffer f12 = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(928));
        this.h = f12;
        f12.put(fArr).position(0);
    }

    public static int a(int i10, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(i11));
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

    public static void c(float[] fArr, int i10, float f10, float f11, float f12, float f13) {
        fArr[i10] = f10;
        fArr[i10 + 1] = f13;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f13;
        fArr[i10 + 4] = f10;
        fArr[i10 + 5] = f11;
        fArr[i10 + 6] = f12;
        fArr[i10 + 7] = f11;
    }

    public static void d(float[] fArr, int i10, float f10, float f11, float f12) {
        fArr[i10] = f10;
        fArr[i10 + 1] = -1.0f;
        fArr[i10 + 2] = 0.0f;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = -1.0f;
        fArr[i10 + 5] = 0.0f;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f11;
        fArr[i10 + 8] = 0.0f;
        fArr[i10 + 9] = f12;
        fArr[i10 + 10] = f11;
        fArr[i10 + 11] = 0.0f;
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
