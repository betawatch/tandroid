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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l40 {
    public final int a;
    public final int b;
    public final FloatBuffer g;
    public final FloatBuffer h;
    public final int[] k;
    public final k40 c = new k40(R.raw.round_blur_stage_0_frag);
    public final k40 d = new k40(R.raw.round_blur_stage_3_frag);
    public final i40 e = new i40();
    public final j40 f = new j40();
    public int i = 0;
    public final int[] j = new int[1];

    public l40(int i9, int i10) {
        int i11;
        Canvas canvas;
        int i12;
        Bitmap bitmap;
        int i13;
        Object obj;
        int[] iArr = new int[5];
        this.k = iArr;
        this.a = i9;
        this.b = i10;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i14 = 0;
        for (int i15 = 5; i14 < i15; i15 = 5) {
            GLES20.glBindTexture(3553, this.k[i14]);
            GLES20.glTexParameteri(3553, 10241, i14 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i14 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i16 = 4;
            if (i14 == 4) {
                int round = Math.round(i9 * 0.2f);
                int round2 = Math.round((i9 * 28) / 1536.0f);
                int i17 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                Bitmap createBitmap2 = Bitmap.createBitmap(i17 * 8, i17 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap2);
                int i18 = 0;
                while (i18 < 8) {
                    int i19 = 0;
                    while (i19 < i16) {
                        int i20 = (i19 * 8) + i18;
                        if (i20 >= 27) {
                            canvas = canvas2;
                            i12 = i17;
                            i11 = i18;
                            obj = obj2;
                            i13 = i19;
                            bitmap = createBitmap;
                        } else {
                            int i21 = (i20 * 8) + 16;
                            i11 = i18;
                            canvas = canvas2;
                            i12 = i17;
                            bitmap = createBitmap;
                            i13 = i19;
                            c(fArr, i21, i18 / 8.0f, i19 / 4.0f, (i18 + 1) / 8.0f, (i19 + 1) / 4.0f);
                            b10.c(i20 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i12 * i11) - round2, (i12 * i13) - round2, (Paint) null);
                        }
                        i17 = i12;
                        i19 = i13 + 1;
                        canvas2 = canvas;
                        createBitmap = bitmap;
                        i18 = i11;
                        obj2 = obj;
                        i16 = 4;
                    }
                    i18++;
                    obj2 = obj2;
                    i16 = 4;
                }
                float b11 = org.telegram.ui.Cells.j2.b(i17, this.a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, b11, b11);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
            } else if (i14 == 3) {
                int round3 = Math.round((i9 * 372.0f) / 1536.0f);
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
                GLES20.glTexImage2D(3553, 0, 6408, i14 == 0 ? this.a : 48, i14 == 0 ? this.b : 48, 0, 6408, 5121, null);
            }
            i14++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.j, 0);
        FloatBuffer h = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(144));
        this.g = h;
        h.put(fArr2).position(0);
        FloatBuffer h10 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(928));
        this.h = h10;
        h10.put(fArr).position(0);
    }

    public static int a(int i9, int i10) {
        int glCreateShader = GLES20.glCreateShader(i9);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(i10));
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

    public static void c(float[] fArr, int i9, float f10, float f11, float f12, float f13) {
        fArr[i9] = f10;
        fArr[i9 + 1] = f13;
        fArr[i9 + 2] = f12;
        fArr[i9 + 3] = f13;
        fArr[i9 + 4] = f10;
        fArr[i9 + 5] = f11;
        fArr[i9 + 6] = f12;
        fArr[i9 + 7] = f11;
    }

    public static void d(float[] fArr, int i9, float f10, float f11, float f12) {
        fArr[i9] = f10;
        fArr[i9 + 1] = -1.0f;
        fArr[i9 + 2] = 0.0f;
        fArr[i9 + 3] = f12;
        fArr[i9 + 4] = -1.0f;
        fArr[i9 + 5] = 0.0f;
        fArr[i9 + 6] = f10;
        fArr[i9 + 7] = f11;
        fArr[i9 + 8] = 0.0f;
        fArr[i9 + 9] = f12;
        fArr[i9 + 10] = f11;
        fArr[i9 + 11] = 0.0f;
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
