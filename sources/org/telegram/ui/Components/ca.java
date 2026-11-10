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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ca {
    public FloatBuffer e;
    public FloatBuffer f;
    public FloatBuffer g;
    public boolean h;
    public int l;
    public int m;
    public ByteBuffer o;
    public Bitmap p;
    public boolean q;
    public x9 t;
    public int a = 1;
    public int b = 1;
    public int c = 0;
    public final y9[] d = new y9[2];
    public final float[] i = new float[9];
    public final float[] j = new float[16];
    public final Object k = new Object();
    public final Object n = new Object();
    public final int[] r = new int[3];
    public final int[] s = new int[3];
    public final wf u = new wf(this, 13);
    public final Matrix v = new Matrix();

    public final void a(int i7, int i10, int i11, float[] fArr) {
        char c10 = fArr != null ? (char) 1 : (char) 0;
        y9 y9Var = this.d[c10];
        if (y9Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.r[0]);
        GLES20.glViewport(0, 0, this.a, this.b);
        GLES20.glClear(TLObject.FLAG_14);
        GLES20.glUseProgram(y9Var.a);
        GLES20.glUniform1i(y9Var.e, 0);
        GLES20.glActiveTexture(33984);
        if (c10 != 0) {
            GLES20.glBindTexture(36197, i7);
        } else {
            GLES20.glBindTexture(3553, i7);
        }
        GLES20.glEnableVertexAttribArray(y9Var.c);
        GLES20.glVertexAttribPointer(y9Var.c, 2, 5126, false, 8, (Buffer) this.g);
        GLES20.glEnableVertexAttribArray(y9Var.b);
        GLES20.glVertexAttribPointer(y9Var.b, 2, 5126, false, 8, (Buffer) this.e);
        GLES20.glUniform2f(y9Var.f, this.a, this.b);
        float f10 = i10;
        float f11 = i11;
        GLES20.glUniform2f(y9Var.g, f10, f11);
        GLES20.glUniform1i(y9Var.j, 0);
        GLES20.glUniform1f(y9Var.k, c10 != 0 ? 1.0f : 0.0f);
        if (c10 != 0) {
            GLES20.glUniformMatrix4fv(y9Var.l, 1, false, fArr, 0);
        }
        GLES20.glUniform1f(y9Var.m, c10 == 0 ? 0.0f : 1.0f);
        sg.w0.a(y9Var.h, this.l);
        sg.w0.a(y9Var.i, this.m);
        synchronized (this.k) {
            GLES20.glUniformMatrix4fv(y9Var.d, 1, false, this.j, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        if (c10 != 0) {
            y9Var = this.d[0];
            if (y9Var == null) {
                return;
            }
            GLES20.glUseProgram(y9Var.a);
            GLES20.glEnableVertexAttribArray(y9Var.c);
            GLES20.glVertexAttribPointer(y9Var.c, 2, 5126, false, 8, (Buffer) this.g);
            GLES20.glEnableVertexAttribArray(y9Var.b);
            GLES20.glVertexAttribPointer(y9Var.b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(y9Var.f, this.a, this.b);
            GLES20.glUniform2f(y9Var.g, f10, f11);
            GLES20.glUniform1i(y9Var.j, 0);
            sg.w0.a(y9Var.h, this.l);
            sg.w0.a(y9Var.i, this.m);
            GLES20.glUniform1f(y9Var.k, 0.0f);
            synchronized (this.k) {
                GLES20.glUniformMatrix4fv(y9Var.d, 1, false, this.j, 0);
            }
        }
        GLES20.glBindFramebuffer(36160, this.r[1]);
        GLES20.glUniform1i(y9Var.j, 1);
        GLES20.glUniform1i(y9Var.e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.s[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, this.r[2]);
        int i12 = this.a;
        int i13 = this.c * 2;
        GLES20.glViewport(0, 0, i12 + i13, i13 + this.b);
        GLES20.glClear(TLObject.FLAG_14);
        GLES20.glEnableVertexAttribArray(y9Var.b);
        GLES20.glVertexAttribPointer(y9Var.b, 2, 5126, false, 8, (Buffer) this.f);
        GLES20.glUniform1i(y9Var.j, 2);
        GLES20.glUniform1i(y9Var.e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.s[1]);
        x9 x9Var = this.t;
        Object obj = x9Var != null ? x9Var.h : null;
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
            int i14 = this.a;
            int i15 = this.c * 2;
            GLES20.glReadPixels(0, 0, i15 + i14, i15 + this.b, 6408, 5121, this.o);
            synchronized (this.n) {
                this.p.copyPixelsFromBuffer(this.o);
                this.q = true;
            }
            GLES20.glBindFramebuffer(36160, 0);
        }
        org.telegram.messenger.g0.r(this.u);
        org.telegram.messenger.g0.h3(this.u);
    }

    public final boolean b(float f10, int i7) {
        this.a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.c = i7;
        if (!this.h) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.v;
            matrix.invert(matrix2);
            float f11 = 1;
            matrix2.preScale(f11, f11);
            float f12 = 1.0f / f11;
            matrix2.postScale(f12, f12);
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
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 2;
            fArr[i11] = ((r13 - i7) / this.a) * fArr[i11];
            int i12 = i11 + 1;
            fArr[i12] = ((r13 - i7) / this.b) * fArr[i12];
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
        String y22 = org.telegram.messenger.g0.y2(null, R.raw.blur_vrt);
        String y23 = org.telegram.messenger.g0.y2(null, R.raw.blur_frg);
        if (y22 != null && y23 != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    int[] iArr = this.r;
                    GLES20.glGenFramebuffers(3, iArr, 0);
                    int[] iArr2 = this.s;
                    GLES20.glGenTextures(3, iArr2, 0);
                    int i14 = 0;
                    while (i14 < 3) {
                        GLES20.glBindTexture(3553, iArr2[i14]);
                        GLES20.glTexImage2D(3553, 0, 6408, this.a + (i14 == 2 ? i7 * 2 : 0), this.b + (i14 == 2 ? i7 * 2 : 0), 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glBindFramebuffer(36160, iArr[i14]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i14], 0);
                        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                            i14++;
                        }
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    int i15 = i7 * 2;
                    this.p = Bitmap.createBitmap(this.a + i15, this.b + i15, Bitmap.Config.ARGB_8888);
                    this.o = ByteBuffer.allocateDirect((i15 + this.b) * (this.a + i15) * 4);
                    return true;
                }
                if (i13 == 1) {
                    y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                }
                int h = vy.h(35633, y22);
                int h7 = vy.h(35632, y23);
                if (h == 0 || h7 == 0) {
                    break;
                }
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, h);
                GLES20.glAttachShader(glCreateProgram, h7);
                GLES20.glBindAttribLocation(glCreateProgram, 0, "p");
                GLES20.glBindAttribLocation(glCreateProgram, 1, "inputuv");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr3 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
                if (iArr3[0] == 0) {
                    GLES20.glDeleteProgram(glCreateProgram);
                    return false;
                }
                y9 y9Var = new y9();
                y9Var.a = glCreateProgram;
                y9Var.b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                y9Var.c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                y9Var.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                y9Var.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                y9Var.f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                y9Var.g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                y9Var.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                y9Var.i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                y9Var.j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                y9Var.l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                y9Var.m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                y9Var.k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                this.d[i13] = y9Var;
                i13++;
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
