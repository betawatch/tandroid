// default package

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cl3 {
    public static final String[] D = {"crownGradient", "pavilionGradient", "lightSweep", "crownSweep", "rightCrownSweep", "leftCrownSweep", "pavilionSweep", "rightPavilionSweep", "leftPavilionSweep"};
    public boolean A;
    public byte C;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public int t;
    public int u;
    public int v;
    public final int w;
    public double x;
    public float y;
    public float z;
    public final int[] a = new int[3];
    public final int[] b = new int[4];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[2];
    public final int[] f = new int[2];
    public final int[] g = new int[1];
    public final HashMap h = new HashMap();
    public final float[] i = new float[16];
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public final float[] l = new float[42];
    public float s = 1.0f;
    public float B = 1.0f;

    public cl3(Context context, int i) {
        try {
            String[] strArr = {"diamond", "sparkle", "copy"};
            for (int i2 = 0; i2 < 3; i2++) {
                this.a[i2] = sde.a(context, j(context, i2 == 2 ? "fullscreenVertex" : strArr[i2] + "Vertex"), j(context, strArr[i2] + "Fragment"));
            }
            float[] a = a(context, "frames");
            this.m = a;
            float[] a2 = a(context, "planes");
            this.n = a2;
            float[] a3 = a(context, "anchors");
            this.o = a3;
            float[] a4 = a(context, "widths");
            this.p = a4;
            float[] a5 = a(context, "facetProjection");
            this.q = a5;
            float[] a6 = a(context, "camera");
            this.r = a6;
            if (a3.length != 64 || a4.length != 91 || a5.length != 4 || a6.length != 3) {
                throw new IllegalStateException("Invalid Swift diamond camera data");
            }
            if (a.length != 60522 || a2.length != 68) {
                throw new IllegalStateException("Invalid Swift diamond animation data");
            }
            int[] iArr = this.b;
            GLES30.glGenVertexArrays(iArr.length, iArr, 0);
            int[] iArr2 = this.c;
            GLES20.glGenBuffers(iArr2.length, iArr2, 0);
            String[] strArr2 = {"vertices", "main", "small"};
            int i3 = 0;
            while (i3 < 3) {
                float[] a7 = a(context, strArr2[i3]);
                int i4 = i3 == 0 ? 3 : 2;
                this.d[i3] = a7.length / (i4 << 2);
                GLES30.glBindVertexArray(this.b[i3]);
                GLES20.glBindBuffer(34962, this.c[i3]);
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(a7.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(a7).position(0);
                GLES20.glBufferData(34962, a7.length << 2, asFloatBuffer, 35044);
                for (int i5 = 0; i5 < i4; i5++) {
                    GLES20.glEnableVertexAttribArray(i5);
                    GLES20.glVertexAttribPointer(i5, 4, 5126, false, i4 << 4, i5 << 4);
                }
                i3++;
            }
            GLES20.glGenFramebuffers(2, this.e, 0);
            GLES20.glGenRenderbuffers(2, this.f, 0);
            GLES20.glGenTextures(1, this.g, 0);
            GLES20.glBindTexture(3553, this.g[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int[] iArr3 = new int[1];
            GLES20.glGetIntegerv(36183, iArr3, 0);
            this.w = Math.min(i, iArr3[0]);
        } catch (Exception e) {
            b();
            k93.h("Cannot load Swift diamond", e);
            throw null;
        }
    }

    public static float[] a(Context context, String str) {
        byte[] g = g(context, "models/diamond_ios/" + str + ".bin");
        float[] fArr = new float[g.length / 4];
        ByteBuffer.wrap(g).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(fArr);
        return fArr;
    }

    public static byte[] g(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_14];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static float i(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        return yjb.B(max, 2.0f, 3.0f, max * max);
    }

    public static String j(Context context, String str) {
        return new String(g(context, "shaders/diamond/" + str + ".glsl"), StandardCharsets.UTF_8);
    }

    public final void b() {
        for (int i : this.a) {
            if (i != 0) {
                GLES20.glDeleteProgram(i);
            }
        }
        int[] iArr = this.c;
        GLES20.glDeleteBuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.b;
        GLES30.glDeleteVertexArrays(iArr2.length, iArr2, 0);
        int[] iArr3 = this.g;
        GLES20.glDeleteTextures(iArr3.length, iArr3, 0);
        int[] iArr4 = this.e;
        GLES20.glDeleteFramebuffers(iArr4.length, iArr4, 0);
        int[] iArr5 = this.f;
        GLES20.glDeleteRenderbuffers(iArr5.length, iArr5, 0);
    }

    public final void c(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        boolean z2;
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float max = Math.max(0.0f, Math.min(f4, 0.1f));
        double d = this.x + max;
        this.x = d;
        float f7 = (float) d;
        double d2 = (d * 240.0d) % 1440.0d;
        int i5 = (int) d2;
        float f8 = (float) (d2 - i5);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            float[] fArr = this.l;
            if (i7 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.m;
            float f9 = fArr2[(i5 * 42) + i7];
            fArr[i7] = tb4.A(fArr2[((1 + i5) * 42) + i7], f9, f8, f9);
            i7++;
        }
        float f10 = i;
        int max2 = Math.max(1, Math.round(this.B * f10));
        float f11 = i2;
        int max3 = Math.max(1, Math.round(this.B * f11));
        int i8 = this.u;
        int i9 = 36160;
        int[] iArr = this.e;
        if (max2 == i8 && max3 == this.v) {
            z2 = true;
            i3 = 2;
            i4 = 0;
        } else {
            this.u = max2;
            this.v = max3;
            GLES20.glBindFramebuffer(36160, iArr[0]);
            int i10 = 0;
            z2 = true;
            for (int i11 = 2; i10 < i11; i11 = 2) {
                int[] iArr2 = this.f;
                int i12 = i6;
                GLES20.glBindRenderbuffer(36161, iArr2[i10]);
                GLES30.glRenderbufferStorageMultisample(36161, this.w, i10 == 0 ? 32856 : 33189, max2, max3);
                GLES20.glFramebufferRenderbuffer(36160, i10 == 0 ? 36064 : 36096, 36161, iArr2[i10]);
                i10++;
                i9 = 36160;
                i6 = i12;
            }
            int i13 = i6;
            int i14 = i9;
            if (GLES20.glCheckFramebufferStatus(i14) != 36053) {
                sc8.j("Incomplete diamond framebuffer");
                return;
            }
            GLES20.glBindFramebuffer(i14, iArr[1]);
            int[] iArr3 = this.g;
            GLES20.glBindTexture(3553, iArr3[i13]);
            i3 = 2;
            GLES20.glTexImage2D(3553, 0, 32856, max2, max3, 0, 6408, 5121, null);
            i4 = i13;
            GLES20.glFramebufferTexture2D(i14, 36064, 3553, iArr3[i13], i4);
            if (GLES20.glCheckFramebufferStatus(i14) != 36053) {
                sc8.j("Incomplete diamond framebuffer");
                return;
            }
        }
        float[] fArr3 = this.r;
        float f12 = f2 + fArr3[i4];
        double d3 = f;
        int i15 = i3;
        float min = Math.min(90.0f, (360.0f * Math.abs((float) Math.IEEEremainder(d3, 1.5707963267948966d))) / 3.1415927f);
        int min2 = Math.min(89, (int) min);
        float f13 = min - min2;
        float[] fArr4 = this.p;
        float f14 = fArr4[min2];
        float f15 = fArr4[min2 + 1];
        float f16 = min2 == 0 ? 0.0f : (f15 - fArr4[min2 - 1]) / 2.0f;
        float f17 = min2 == 89 ? 0.0f : (fArr4[min2 + 2] - f14) / 2.0f;
        float f18 = ((((((((f14 - f15) * 2.0f) + f16 + f17) * f13) + ((((f15 - f14) * 3.0f) - (f16 * 2.0f)) - f17)) * f13) + f16) * f13) + f14;
        float sin = (float) Math.sin(r9 * 2.0f);
        float f19 = (1.0f - ((0.035f * sin) * sin)) * fArr4[0];
        double d4 = f12;
        this.s = ((1.0f - i((float) ((Math.abs(Math.sin(d4)) - 0.24740395925452294d) / 0.5717876090464753d))) * ((f19 / f18) - 1.0f)) + 1.0f;
        float[] fArr5 = this.i;
        Matrix.setIdentityM(fArr5, 0);
        Matrix.rotateM(this.i, 0, -((float) Math.toDegrees(f3)), 0.0f, 0.0f, 1.0f);
        Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d4), 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d3), 0.0f, 1.0f, 0.0f);
        boolean z3 = false;
        Matrix.transposeM(this.j, 0, fArr5, 0);
        float f20 = 0.0f;
        int i16 = 0;
        float f21 = -1.0f;
        while (i16 < 4) {
            float f22 = (i16 * 3.1415927f) / 2.0f;
            int i17 = i16;
            float cos = (float) (Math.cos(f12 - fArr3[z3 ? 1 : 0]) * Math.cos(f + f22));
            if (cos > f21) {
                f21 = cos;
                f20 = f22;
            }
            i16 = i17 + 1;
            z3 = false;
        }
        float hypot = (!this.A || max <= 0.0f) ? 0.596f : ((float) Math.hypot((float) Math.atan2(Math.sin(f - this.y), Math.cos(f - this.y)), f12 - this.z)) / max;
        this.y = f;
        this.z = f12;
        this.A = z2;
        float i18 = i(((0.41887903f / Math.max(hypot, 0.001f)) - 0.06f) / 0.34f) * i(1.0f - (((float) Math.acos(Math.max(-1.0f, Math.min(1.0f, f21)))) / 0.20943952f));
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glViewport(0, 0, this.u, this.v);
        GLES20.glDepthMask(true);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        float f23 = f10 / f11;
        float max4 = Math.max(1.0f, 1.0f / f23) * (1.52f / (0.9975f / fArr4[0]));
        float[] fArr6 = this.k;
        Matrix.setIdentityM(fArr6, 0);
        float f24 = 1.0f / (f23 * max4);
        fArr6[0] = f24;
        fArr6[5] = 1.0f / max4;
        float f25 = 1.0f / fArr3[i15];
        float f26 = -f25;
        float f27 = f26 / fArr3[1];
        fArr6[0] = f24 * this.s;
        float f28 = 0.12f / max4;
        fArr6[9] = f28 * f27;
        fArr6[10] = f26 / 6.0f;
        fArr6[11] = f27;
        fArr6[13] = f28 * f25;
        fArr6[14] = 0.5f * f25;
        fArr6[15] = f25;
        int[] iArr4 = this.a;
        h(f7, f20, i18, iArr4[0]);
        GLES20.glDisable(3042);
        GLES20.glEnable(2929);
        GLES20.glEnable(2884);
        GLES20.glDepthFunc(515);
        int[] iArr5 = this.b;
        GLES30.glBindVertexArray(iArr5[0]);
        int[] iArr6 = this.d;
        GLES20.glDrawArrays(4, 0, iArr6[0]);
        h(f7, f20, i18, iArr4[1]);
        GLES20.glEnable(3042);
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        int i19 = 1;
        while (i19 <= i15) {
            GLES30.glBindVertexArray(iArr5[i19]);
            GLES30.glUniform1ui(e("baseInstance"), i19 - 1);
            GLES30.glDrawArraysInstanced(4, 0, iArr6[i19], i19 == 1 ? 1 : 7);
            i19++;
        }
        GLES20.glBindFramebuffer(36008, iArr[0]);
        GLES20.glBindFramebuffer(36009, iArr[1]);
        int i20 = this.u;
        int i21 = this.v;
        GLES30.glBlitFramebuffer(0, 0, i20, i21, 0, 0, i20, i21, TLObject.FLAG_14, 9728);
        if (!z) {
            d(f5, f6, i, i2);
        } else {
            GLES20.glBindFramebuffer(36160, iArr[1]);
            GLES30.glBindVertexArray(0);
        }
    }

    public final void d(float f, float f2, int i, int i2) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        int i3 = this.a[2];
        this.t = i3;
        GLES20.glUseProgram(i3);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.g[0]);
        GLES20.glUniform1i(e("image"), 0);
        GLES20.glUniform1f(e("opacity"), f);
        GLES20.glUniform1f(e("white"), f2);
        GLES30.glBindVertexArray(this.b[3]);
        GLES20.glDrawArrays(4, 0, 3);
        GLES30.glBindVertexArray(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glEnable(2929);
    }

    public final int e(String str) {
        String str2 = this.t + ":" + str;
        HashMap hashMap = this.h;
        Integer num = (Integer) hashMap.get(str2);
        if (num == null) {
            num = Integer.valueOf(GLES20.glGetUniformLocation(this.t, str));
            hashMap.put(str2, num);
        }
        return num.intValue();
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(e("u.".concat(str)), 1, false, fArr, 0);
    }

    public final void h(float f, float f2, float f3, int i) {
        this.t = i;
        GLES20.glUseProgram(i);
        f("model", this.i);
        f("inverseModel", this.j);
        f("projection", this.k);
        k("parameters", f, 0.72f, 1.0f, 1.0f);
        GLES20.glUniform4fv(e("u.facetProjection"), 1, this.q, 0);
        k("appearance", this.C, 0.0f, 0.0f, 0.0f);
        k("referenceCrownFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        k("referencePavilionFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        for (int i2 = 0; i2 < 8; i2++) {
            int e = e("anchors[" + i2 + "].position");
            int i3 = i2 << 3;
            float[] fArr = this.o;
            GLES20.glUniform4fv(e, 1, fArr, i3);
            GLES20.glUniform4fv(e("anchors[" + i2 + "].normal"), 1, fArr, i3 + 4);
        }
        k("viewport", this.u, this.v, 17.0f, 0.0f);
        int e2 = e("u.sparkleShape");
        float[] fArr2 = this.l;
        GLES20.glUniform4fv(e2, 1, fArr2, 36);
        k("sparkleHalo", fArr2[40], f2, this.s, f3);
        for (int i4 = 0; i4 < 9; i4++) {
            GLES20.glUniform4fv(e("u." + D[i4]), 1, fArr2, i4 << 2);
        }
        GLES20.glUniform4fv(e("planes[0]"), 17, this.n, 0);
    }

    public final void k(String str, float f, float f2, float f3, float f4) {
        GLES20.glUniform4f(e("u.".concat(str)), f, f2, f3, f4);
    }
}
