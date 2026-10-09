package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.bi;
import org.telegram.ui.Wallet.j5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class x {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x() {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Random random = new Random(24560118926758988L);
        int i12 = 16;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        int i13 = 0;
        while (true) {
            float f7 = 312.5f;
            float f10 = 512.0f;
            if (i13 >= i12) {
                break;
            }
            if (i13 == 0) {
                i10 = i12;
                i11 = 1;
            } else {
                i10 = i12;
                i11 = 32;
            }
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = -1.0f;
            int i14 = 0;
            while (i14 < i11) {
                float nextFloat = random.nextFloat() * f10;
                float nextFloat2 = random.nextFloat() * f7;
                float f14 = f7;
                float f15 = Float.MAX_VALUE;
                float f16 = f10;
                for (int i15 = 0; i15 < i13; i15++) {
                    float abs = Math.abs(nextFloat - fArr[i15]);
                    float abs2 = Math.abs(nextFloat2 - fArr2[i15]);
                    float min = Math.min(abs, f16 - abs);
                    float min2 = Math.min(abs2, f14 - abs2);
                    f15 = Math.min(f15, (min2 * min2) + (min * min));
                }
                if (f15 > f13) {
                    f13 = f15;
                    f11 = nextFloat;
                    f12 = nextFloat2;
                }
                i14++;
                f10 = f16;
                f7 = f14;
            }
            float f17 = f7;
            float f18 = f10;
            fArr[i13] = f11;
            fArr2[i13] = f12;
            float nextFloat3 = (random.nextFloat() * 6.0f) + 1.0f;
            float nextFloat4 = random.nextFloat() * 6.2831855f;
            float nextFloat5 = (random.nextFloat() * 0.45f) + 0.05f;
            double d = nextFloat4;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f19 = -sin;
            float f20 = cos * nextFloat5;
            float f21 = sin * nextFloat5;
            float f22 = f19 * 0.6f;
            float f23 = 0.6f * cos;
            float f24 = f20 + f22;
            float f25 = f21 + f23;
            Random random2 = random;
            float sqrt = (float) Math.sqrt(Math.max(0.0f, (1.0f - (f24 * f24)) - (f25 * f25)));
            float sqrt2 = (float) Math.sqrt(Math.max(0.0f, (1.0f - (r11 * r11)) - (r9 * r9)));
            int a2 = (a(f24) << 16) | (-16777216) | (a(f25) << 8) | a(sqrt);
            int a10 = (a(f20 - f22) << 16) | (-16777216) | (a(f21 - f23) << 8) | a(sqrt2);
            float f26 = f19 * nextFloat3;
            float f27 = cos * nextFloat3;
            int i16 = -1;
            while (true) {
                if (i16 <= 1) {
                    int i17 = -1;
                    for (int i18 = 1; i17 <= i18; i18 = 1) {
                        float f28 = f11 + (i17 * 512);
                        float f29 = (i16 * f17) + f12;
                        if (f28 + nextFloat3 > 0.0f && f28 - nextFloat3 < f18 && f29 + nextFloat3 > 0.0f && f29 - nextFloat3 < f18) {
                            int max = Math.max(0, Math.min(464, Math.round((f28 - 24.0f) / 8.0f) * 8));
                            int max2 = Math.max(0, Math.min(464, Math.round((f29 - 24.0f) / 8.0f) * 8));
                            Rect rect = new Rect(max, max2, max + 48, max2 + 48);
                            if (!arrayList.contains(rect)) {
                                arrayList.add(rect);
                            }
                        }
                        arrayList2.add(new j5(f28, f29, nextFloat3, f26, f27, a2, a10));
                        i17++;
                    }
                    i16++;
                }
            }
            i13++;
            random = random2;
            i12 = i10;
        }
        int[] iArr = new int[3];
        GLES20.glGenTextures(3, iArr, 0);
        int i19 = iArr[0];
        int i20 = iArr[1];
        this.a = i20;
        this.b = iArr[2];
        GLES20.glBindTexture(35866, i20);
        e(35866);
        GLES20.glTexParameteri(35866, 33085, 3);
        GLES30.glTexStorage3D(35866, 4, 32856, 48, 48, arrayList.size());
        Bitmap createBitmap = Bitmap.createBitmap(48, 48, Bitmap.Config.ARGB_8888);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(9216);
        int i21 = 0;
        while (i21 < arrayList.size()) {
            Rect rect2 = (Rect) arrayList.get(i21);
            c(createBitmap, rect2.left, rect2.top, arrayList2);
            allocateDirect.clear();
            createBitmap.copyPixelsToBuffer(allocateDirect);
            allocateDirect.position(0);
            int i22 = i21;
            GLES30.glTexSubImage3D(35866, 0, 0, 0, i22, 48, 48, 1, 6408, 5121, allocateDirect);
            i21 = i22 + 1;
        }
        createBitmap.recycle();
        GLES20.glGenerateMipmap(35866);
        GLES20.glBindTexture(3553, this.b);
        e(3553);
        GLES30.glTexStorage2D(3553, 8, 32856, 128, 128);
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        Bitmap createBitmap2 = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        GLES20.glBindTexture(3553, i19);
        e(3553);
        GLES20.glTexParameteri(3553, 33085, 2);
        GLES30.glTexStorage2D(3553, 3, 32856, 64, 64);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i19, 2);
        for (int i23 = 0; i23 < 512; i23 += 64) {
            for (int i24 = 0; i24 < 512; i24 += 64) {
                c(createBitmap2, i24, i23, arrayList2);
                GLES20.glBindTexture(3553, i19);
                GLUtils.texSubImage2D(3553, 0, 0, 0, createBitmap2);
                GLES20.glGenerateMipmap(3553);
                GLES20.glBindTexture(3553, this.b);
                GLES20.glCopyTexSubImage2D(3553, 0, i24 / 4, i23 / 4, 0, 0, 16, 16);
            }
        }
        createBitmap2.recycle();
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        GLES20.glDeleteTextures(1, new int[]{i19}, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindTexture(35866, 0);
        int size = arrayList.size();
        this.d = size * 6;
        FloatBuffer h = bi.h(ByteBuffer.allocateDirect(size * 192));
        int[] iArr4 = {0, 1, 2, 2, 1, 3};
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            Rect rect3 = (Rect) arrayList.get(i25);
            for (int i26 = 0; i26 < 6; i26++) {
                int i27 = iArr4[i26];
                float f30 = (i27 & 1) == 0 ? -1.0f : 1.0f;
                float f31 = (i27 & 2) == 0 ? -1.0f : 1.0f;
                float f32 = f30 < 0.0f ? rect3.left : rect3.right;
                float f33 = f31 < 0.0f ? rect3.top : rect3.bottom;
                h.put(-0.0125f);
                h.put((0.5f - (f33 / 312.5f)) * 1.219512f);
                h.put(((f32 / 512.0f) * 2.0f) - 1.0f);
                h.put(rect3.left).put(rect3.top).put(i25);
                h.put(f30).put(f31);
            }
        }
        h.position(0);
        int[] iArr5 = new int[1];
        GLES20.glGenBuffers(1, iArr5, 0);
        int i28 = iArr5[0];
        this.c = i28;
        GLES20.glBindBuffer(34962, i28);
        GLES20.glBufferData(34962, this.d * 32, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static int a(float f7) {
        return Math.max(0, Math.min(255, Math.round(((f7 * 0.5f) + 0.5f) * 255.0f)));
    }

    public static void c(Bitmap bitmap, int i10, int i11, ArrayList arrayList) {
        int i12 = 0;
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        canvas.translate(-i10, -i11);
        Paint paint = new Paint(1);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            j5 j5Var = (j5) obj;
            paint.setShader(j5Var.b);
            canvas.drawPath(j5Var.a, paint);
        }
    }

    public static void e(int i10) {
        GLES20.glTexParameteri(i10, 10241, 9987);
        GLES20.glTexParameteri(i10, 10240, 9729);
        GLES20.glTexParameteri(i10, 10242, 33071);
        GLES20.glTexParameteri(i10, 10243, 33071);
    }

    public boolean b(int i10) {
        if (i10 == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void d() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public x(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public x(String str, String str2) {
        int a2 = b0.a(35633, str);
        this.b = a2;
        int a10 = b0.a(35632, str2);
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
        throw new IllegalStateException(sc.v.i("Unable to link program: ", glGetProgramInfoLog));
    }
}
