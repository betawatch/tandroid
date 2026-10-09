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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t50 {
    public final int a;
    public final int b;
    public final FloatBuffer g;
    public final FloatBuffer h;
    public final int[] k;
    public final s50 c = new s50(R.raw.round_blur_stage_0_frag);
    public final s50 d = new s50(R.raw.round_blur_stage_3_frag);
    public final q50 e = new q50();
    public final r50 f = new r50();
    public int i = 0;
    public final int[] j = new int[1];

    public t50(int i10, int i11) {
        float f7;
        char c10;
        int i12;
        RLottieNative rLottieNative;
        int i13;
        Bitmap bitmap;
        int i14;
        int i15;
        Object obj;
        int i16 = 0;
        int[] iArr = new int[5];
        this.k = iArr;
        this.a = i10;
        this.b = i11;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        float f10 = 1.0f;
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i17 = 0;
        for (int i18 = 5; i17 < i18; i18 = 5) {
            GLES20.glBindTexture(3553, this.k[i17]);
            GLES20.glTexParameteri(3553, 10241, i17 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i17 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i19 = 4;
            if (i17 == 4) {
                int round = Math.round(i10 * 0.2f);
                int round2 = Math.round((i10 * 28) / 1536.0f);
                int i20 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                float f11 = f10;
                Bitmap createBitmap2 = Bitmap.createBitmap(i20 * 8, i20 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(createBitmap2);
                int i21 = 0;
                while (i21 < 8) {
                    int i22 = 0;
                    while (i22 < i19) {
                        int i23 = (i22 * 8) + i21;
                        if (i23 >= 27) {
                            obj = obj2;
                            bitmap = createBitmap;
                            i12 = i20;
                            i13 = i21;
                            rLottieNative = b10;
                            i14 = i22;
                            i15 = 4;
                        } else {
                            int i24 = (i23 * 8) + 16;
                            i12 = i20;
                            rLottieNative = b10;
                            i13 = i21;
                            bitmap = createBitmap;
                            i14 = i22;
                            i15 = 4;
                            c(fArr, i24, i21 / 8.0f, i22 / 4.0f, (i21 + 1) / 8.0f, (i22 + 1) / 4.0f);
                            rLottieNative.c(i23 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i12 * i13) - round2, (i12 * i14) - round2, (Paint) null);
                        }
                        i20 = i12;
                        b10 = rLottieNative;
                        i22 = i14 + 1;
                        obj2 = obj;
                        createBitmap = bitmap;
                        i21 = i13;
                        i19 = i15;
                    }
                    i21++;
                    obj2 = obj2;
                    i19 = i19;
                }
                float e7 = a1.g.e(i20, this.a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, e7, e7);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
                f7 = f11;
                c10 = 0;
            } else {
                float f12 = f10;
                if (i17 == 3) {
                    int round3 = Math.round((i10 * 372.0f) / 1536.0f);
                    float f13 = (round3 / this.a) * 2.0f;
                    c10 = 0;
                    f7 = f12;
                    d(fArr2, 12, f12 - f13, f13 - 1.0f, f7);
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
                    f7 = f12;
                    c10 = 0;
                    GLES20.glTexImage2D(3553, 0, 6408, i17 == 0 ? this.a : 48, i17 == 0 ? this.b : 48, 0, 6408, 5121, null);
                }
            }
            i17++;
            f10 = f7;
            i16 = 0;
        }
        int i25 = i16;
        GLES20.glBindTexture(3553, i25);
        GLES20.glGenFramebuffers(1, this.j, i25);
        FloatBuffer h = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(144));
        this.g = h;
        h.put(fArr2).position(i25);
        FloatBuffer h10 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(928));
        this.h = h10;
        h10.put(fArr).position(i25);
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

    public static void c(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f7;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f11;
        fArr[i10 + 7] = f10;
    }

    public static void d(float[] fArr, int i10, float f7, float f10, float f11) {
        fArr[i10] = f7;
        fArr[i10 + 1] = -1.0f;
        fArr[i10 + 2] = 0.0f;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = -1.0f;
        fArr[i10 + 5] = 0.0f;
        fArr[i10 + 6] = f7;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = 0.0f;
        fArr[i10 + 9] = f11;
        fArr[i10 + 10] = f10;
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
