package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.kk;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public class z5 {
    public static m.g3 e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public z5() {
        m.g3 e7 = e();
        ArrayList arrayList = (ArrayList) e7.b;
        int[] iArr = new int[2];
        GLES20.glGenTextures(2, iArr, 0);
        int i10 = iArr[0];
        this.a = i10;
        int i11 = iArr[1];
        this.b = i11;
        GLES20.glBindTexture(35866, i10);
        GLES20.glTexParameteri(35866, 10241, 9987);
        GLES20.glTexParameteri(35866, 10240, 9729);
        GLES20.glTexParameteri(35866, 10242, 33071);
        GLES20.glTexParameteri(35866, 10243, 33071);
        GLES20.glTexParameteri(35866, 33085, 3);
        GLES30.glTexStorage3D(35866, 4, 32856, 48, 48, arrayList.size());
        GLES30.glTexSubImage3D(35866, 0, 0, 0, 0, 48, 48, arrayList.size(), 6408, 5121, ((ByteBuffer) e7.c).duplicate());
        GLES20.glGenerateMipmap(35866);
        GLES20.glBindTexture(3553, i11);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES30.glTexStorage2D(3553, 8, 32856, 128, 128);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, 128, 128, 6408, 5121, ((ByteBuffer) e7.d).duplicate());
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindTexture(35866, 0);
        int size = arrayList.size();
        this.d = size * 6;
        FloatBuffer h = kk.h(ByteBuffer.allocateDirect(size * 192));
        int[] iArr2 = {0, 1, 2, 2, 1, 3};
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            Rect rect = (Rect) arrayList.get(i12);
            for (int i13 = 0; i13 < 6; i13++) {
                int i14 = iArr2[i13];
                float f7 = (i14 & 1) == 0 ? -1.0f : 1.0f;
                float f10 = (i14 & 2) != 0 ? 1.0f : -1.0f;
                float f11 = f7 < 0.0f ? rect.left : rect.right;
                float f12 = f10 < 0.0f ? rect.top : rect.bottom;
                h.put(-0.0125f);
                h.put((0.5f - (f12 / 312.5f)) * 1.219512f);
                h.put(((f11 / 512.0f) * 2.0f) - 1.0f);
                h.put(rect.left).put(rect.top).put(i12);
                h.put(f7).put(f10);
            }
        }
        h.position(0);
        int[] iArr3 = new int[1];
        GLES20.glGenBuffers(1, iArr3, 0);
        int i15 = iArr3[0];
        this.c = i15;
        GLES20.glBindBuffer(34962, i15);
        GLES20.glBufferData(34962, this.d * 32, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Random random = new Random(24560118926758988L);
        int i10 = 16;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 == 0 ? 1 : 32;
            float f7 = -1.0f;
            int i13 = 0;
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (i13 < i12) {
                float nextFloat = random.nextFloat() * 512.0f;
                float nextFloat2 = random.nextFloat() * 312.5f;
                int i14 = i10;
                float f12 = Float.MAX_VALUE;
                for (int i15 = 0; i15 < i11; i15++) {
                    float abs = Math.abs(nextFloat - fArr[i15]);
                    float abs2 = Math.abs(nextFloat2 - fArr2[i15]);
                    float min = Math.min(abs, 512.0f - abs);
                    float min2 = Math.min(abs2, 312.5f - abs2);
                    f12 = Math.min(f12, (min2 * min2) + (min * min));
                }
                if (f12 > f7) {
                    f7 = f12;
                    f10 = nextFloat;
                    f11 = nextFloat2;
                }
                i13++;
                i10 = i14;
            }
            int i16 = i10;
            fArr[i11] = f10;
            fArr2[i11] = f11;
            float d = org.telegram.ui.Cells.c1.d(random, 6.0f, 1.0f);
            float nextFloat3 = random.nextFloat() * 6.2831855f;
            float d10 = org.telegram.ui.Cells.c1.d(random, 0.45f, 0.05f);
            double d11 = nextFloat3;
            float cos = (float) Math.cos(d11);
            float sin = (float) Math.sin(d11);
            float f13 = -sin;
            float f14 = cos * d10;
            float f15 = sin * d10;
            float f16 = f13 * 0.6f;
            float f17 = 0.6f * cos;
            float f18 = f14 + f16;
            float f19 = f15 + f17;
            int i17 = i11;
            float sqrt = (float) Math.sqrt(Math.max(0.0f, (1.0f - (f18 * f18)) - (f19 * f19)));
            float sqrt2 = (float) Math.sqrt(Math.max(0.0f, (1.0f - (r11 * r11)) - (r9 * r9)));
            int b10 = (b(f18) << 16) | (-16777216) | (b(f19) << 8) | b(sqrt);
            int b11 = (b(f14 - f16) << 16) | (-16777216) | (b(f15 - f17) << 8) | b(sqrt2);
            float f20 = f13 * d;
            float f21 = cos * d;
            for (int i18 = -1; i18 <= 1; i18++) {
                for (int i19 = -1; i19 <= 1; i19++) {
                    float f22 = f10 + (i19 * 512);
                    float f23 = (i18 * 312.5f) + f11;
                    if (f22 + d > 0.0f && f22 - d < 512.0f && f23 + d > 0.0f && f23 - d < 512.0f) {
                        int max = Math.max(0, Math.min(464, Math.round((f22 - 24.0f) / 8.0f) * 8));
                        int max2 = Math.max(0, Math.min(464, Math.round((f23 - 24.0f) / 8.0f) * 8));
                        Rect rect = new Rect(max, max2, max + 48, max2 + 48);
                        if (!arrayList.contains(rect)) {
                            arrayList.add(rect);
                        }
                    }
                    arrayList2.add(new y5(f22, f23, d, f20, f21, b10, b11));
                }
            }
            i11 = i17 + 1;
            i10 = i16;
        }
        return arrayList2;
    }

    public static int b(float f7) {
        return Math.max(0, Math.min(255, Math.round(((f7 * 0.5f) + 0.5f) * 255.0f)));
    }

    public static void d(Bitmap bitmap, int i10, int i11, ArrayList arrayList) {
        int i12 = 0;
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        canvas.translate(-i10, -i11);
        Paint paint = new Paint(1);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            y5 y5Var = (y5) obj;
            if (y5Var.e > i10 && y5Var.c < i10 + width && y5Var.f > i11 && y5Var.d < i11 + height) {
                paint.setShader(y5Var.b);
                canvas.drawPath(y5Var.a, paint);
            }
        }
    }

    public static synchronized m.g3 e() {
        synchronized (z5.class) {
            try {
                m.g3 g3Var = e;
                if (g3Var != null) {
                    return g3Var;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList a2 = a(arrayList);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(arrayList.size() * 9216);
                Bitmap createBitmap = Bitmap.createBitmap(48, 48, Bitmap.Config.ARGB_8888);
                int i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Rect rect = (Rect) arrayList.get(i11);
                    d(createBitmap, rect.left, rect.top, a2);
                    allocateDirect.position(i11 * 9216);
                    createBitmap.copyPixelsToBuffer(allocateDirect);
                }
                createBitmap.recycle();
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(65536);
                char c10 = '@';
                Bitmap createBitmap2 = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
                ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(16384);
                byte[] bArr = new byte[16384];
                int i12 = 0;
                while (true) {
                    if (i12 >= 512) {
                        createBitmap2.recycle();
                        allocateDirect.position(0);
                        m.g3 g3Var2 = new m.g3(arrayList, allocateDirect, allocateDirect2, 18);
                        e = g3Var2;
                        return g3Var2;
                    }
                    int i13 = i10;
                    for (int i14 = 512; i13 < i14; i14 = 512) {
                        d(createBitmap2, i13, i12, a2);
                        allocateDirect3.clear();
                        createBitmap2.copyPixelsToBuffer(allocateDirect3);
                        allocateDirect3.position(i10);
                        allocateDirect3.get(bArr);
                        int i15 = i10;
                        while (true) {
                            if (i15 < 16) {
                                int i16 = i10;
                                for (int i17 = 16; i16 < i17; i17 = 16) {
                                    char c11 = c10;
                                    int i18 = 4;
                                    int i19 = ((((i12 / 4) + i15) * 128) + (i13 / 4) + i16) * 4;
                                    int i20 = i10;
                                    while (i20 < i18) {
                                        int i21 = i10;
                                        while (i10 < i18) {
                                            int i22 = (((i16 * 4) + (((i15 * 4) + i10) * 64)) * 4) + i20;
                                            i21 = (bArr[i22] & 255) + (bArr[i22 + 4] & 255) + (bArr[i22 + 8] & 255) + (bArr[i22 + 12] & 255) + i21;
                                            i10++;
                                            i18 = i18;
                                            a2 = a2;
                                        }
                                        allocateDirect2.put(i19 + i20, (byte) ((i21 + 8) >> 4));
                                        i20++;
                                        i18 = i18;
                                        a2 = a2;
                                        i10 = 0;
                                    }
                                    i16++;
                                    c10 = c11;
                                    i10 = 0;
                                }
                                i15++;
                                i10 = 0;
                            }
                        }
                        i13 += 64;
                        i10 = 0;
                    }
                    i12 += 64;
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c(int i10) {
        if (i10 == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void f() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public z5(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public z5(String str, String str2) {
        int a2 = si.d0.a(35633, str);
        this.b = a2;
        int a10 = si.d0.a(35632, str2);
        this.c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(r4.c.h("Unable to link program: ", glGetProgramInfoLog));
    }
}
