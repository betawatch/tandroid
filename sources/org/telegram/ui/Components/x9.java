package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x9 {
    public FloatBuffer e;
    public FloatBuffer f;
    public FloatBuffer g;
    public boolean h;
    public int l;
    public int m;
    public ByteBuffer o;
    public Bitmap p;
    public boolean q;
    public s9 t;
    public int a = 1;
    public int b = 1;
    public int c = 0;
    public final t9[] d = new t9[2];
    public final float[] i = new float[9];
    public final float[] j = new float[16];
    public final Object k = new Object();
    public final Object n = new Object();
    public final int[] r = new int[3];
    public final int[] s = new int[3];
    public final tf u = new tf(this, 14);
    public final Matrix v = new Matrix();

    public final void a(int i10, int i11, int i12, float[] fArr) {
        char c10 = fArr != null ? (char) 1 : (char) 0;
        t9 t9Var = this.d[c10];
        if (t9Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.r[0]);
        GLES20.glViewport(0, 0, this.a, this.b);
        GLES20.glClear(TLObject.FLAG_14);
        GLES20.glUseProgram(t9Var.a);
        GLES20.glUniform1i(t9Var.e, 0);
        GLES20.glActiveTexture(33984);
        if (c10 != 0) {
            GLES20.glBindTexture(36197, i10);
        } else {
            GLES20.glBindTexture(3553, i10);
        }
        GLES20.glEnableVertexAttribArray(t9Var.c);
        GLES20.glVertexAttribPointer(t9Var.c, 2, 5126, false, 8, (Buffer) this.g);
        GLES20.glEnableVertexAttribArray(t9Var.b);
        GLES20.glVertexAttribPointer(t9Var.b, 2, 5126, false, 8, (Buffer) this.e);
        GLES20.glUniform2f(t9Var.f, this.a, this.b);
        float f7 = i11;
        float f10 = i12;
        GLES20.glUniform2f(t9Var.g, f7, f10);
        GLES20.glUniform1i(t9Var.j, 0);
        GLES20.glUniform1f(t9Var.k, c10 != 0 ? 1.0f : 0.0f);
        if (c10 != 0) {
            GLES20.glUniformMatrix4fv(t9Var.l, 1, false, fArr, 0);
        }
        GLES20.glUniform1f(t9Var.m, c10 == 0 ? 0.0f : 1.0f);
        ig.d1.a(t9Var.h, this.l);
        ig.d1.a(t9Var.i, this.m);
        synchronized (this.k) {
            GLES20.glUniformMatrix4fv(t9Var.d, 1, false, this.j, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        if (c10 != 0) {
            t9Var = this.d[0];
            if (t9Var == null) {
                return;
            }
            GLES20.glUseProgram(t9Var.a);
            GLES20.glEnableVertexAttribArray(t9Var.c);
            GLES20.glVertexAttribPointer(t9Var.c, 2, 5126, false, 8, (Buffer) this.g);
            GLES20.glEnableVertexAttribArray(t9Var.b);
            GLES20.glVertexAttribPointer(t9Var.b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(t9Var.f, this.a, this.b);
            GLES20.glUniform2f(t9Var.g, f7, f10);
            GLES20.glUniform1i(t9Var.j, 0);
            ig.d1.a(t9Var.h, this.l);
            ig.d1.a(t9Var.i, this.m);
            GLES20.glUniform1f(t9Var.k, 0.0f);
            synchronized (this.k) {
                GLES20.glUniformMatrix4fv(t9Var.d, 1, false, this.j, 0);
            }
        }
        GLES20.glBindFramebuffer(36160, this.r[1]);
        GLES20.glUniform1i(t9Var.j, 1);
        GLES20.glUniform1i(t9Var.e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.s[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, this.r[2]);
        int i13 = this.a;
        int i14 = this.c * 2;
        GLES20.glViewport(0, 0, i13 + i14, i14 + this.b);
        GLES20.glClear(TLObject.FLAG_14);
        GLES20.glEnableVertexAttribArray(t9Var.b);
        GLES20.glVertexAttribPointer(t9Var.b, 2, 5126, false, 8, (Buffer) this.f);
        GLES20.glUniform1i(t9Var.j, 2);
        GLES20.glUniform1i(t9Var.e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.s[1]);
        s9 s9Var = this.t;
        Object obj = s9Var != null ? s9Var.h : null;
        if (obj != null) {
            synchronized (obj) {
                GLES20.glDrawArrays(5, 0, 4);
            }
        } else {
            GLES20.glDrawArrays(5, 0, 4);
        }
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            int i15 = this.a;
            int i16 = this.c * 2;
            GLES20.glReadPixels(0, 0, i16 + i15, i16 + this.b, 6408, 5121, this.o);
            synchronized (this.n) {
                this.p.copyPixelsFromBuffer(this.o);
                this.q = true;
            }
            GLES20.glBindFramebuffer(36160, 0);
        }
        org.telegram.messenger.i0.r(this.u);
        org.telegram.messenger.i0.g3(this.u);
    }

    public final boolean b(float f7, int i10) {
        this.a = (int) Math.round(Math.sqrt(f7 * 324.0f));
        this.b = (int) Math.round(Math.sqrt(324.0f / f7));
        this.c = i10;
        if (!this.h) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.v;
            matrix.invert(matrix2);
            float f10 = 1;
            matrix2.preScale(f10, f10);
            float f11 = 1.0f / f10;
            matrix2.postScale(f11, f11);
            c(matrix2);
        }
        float[] fArr = new float[8];
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        fArr[4] = -1.0f;
        fArr[5] = -1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.e.position(0);
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 2;
            fArr[i12] = ((r13 - i10) / this.a) * fArr[i12];
            int i13 = i12 + 1;
            fArr[i13] = ((r13 - i10) / this.b) * fArr[i13];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.g.position(0);
        String y22 = org.telegram.messenger.i0.y2(null, R.raw.blur_vrt);
        String y23 = org.telegram.messenger.i0.y2(null, R.raw.blur_frg);
        if (y22 != null && y23 != null) {
            int i14 = 0;
            while (true) {
                if (i14 >= 2) {
                    int[] iArr = this.r;
                    GLES20.glGenFramebuffers(3, iArr, 0);
                    int[] iArr2 = this.s;
                    GLES20.glGenTextures(3, iArr2, 0);
                    int i15 = 0;
                    while (i15 < 3) {
                        GLES20.glBindTexture(3553, iArr2[i15]);
                        GLES20.glTexImage2D(3553, 0, 6408, this.a + (i15 == 2 ? i10 * 2 : 0), this.b + (i15 == 2 ? i10 * 2 : 0), 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glBindFramebuffer(36160, iArr[i15]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i15], 0);
                        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                            i15++;
                        }
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    int i16 = i10 * 2;
                    this.p = Bitmap.createBitmap(this.a + i16, this.b + i16, Bitmap.Config.ARGB_8888);
                    this.o = ByteBuffer.allocateDirect((i16 + this.b) * (this.a + i16) * 4);
                    return true;
                }
                if (i14 == 1) {
                    y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                }
                int h = jz.h(35633, y22);
                int h10 = jz.h(35632, y23);
                if (h == 0 || h10 == 0) {
                    break;
                }
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, h);
                GLES20.glAttachShader(glCreateProgram, h10);
                GLES20.glBindAttribLocation(glCreateProgram, 0, "p");
                GLES20.glBindAttribLocation(glCreateProgram, 1, "inputuv");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr3 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
                if (iArr3[0] == 0) {
                    GLES20.glDeleteProgram(glCreateProgram);
                    return false;
                }
                t9 t9Var = new t9();
                t9Var.a = glCreateProgram;
                t9Var.b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                t9Var.c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                t9Var.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                t9Var.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                t9Var.f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                t9Var.g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                t9Var.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                t9Var.i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                t9Var.j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                t9Var.l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                t9Var.m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                t9Var.k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                this.d[i14] = t9Var;
                i14++;
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.i);
        synchronized (this.k) {
            float[] fArr = this.j;
            float[] fArr2 = this.i;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
    }
}
