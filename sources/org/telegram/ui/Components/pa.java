package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pa {
    public FloatBuffer e;
    public FloatBuffer f;
    public FloatBuffer g;
    public boolean h;
    public int l;
    public int m;
    public ByteBuffer o;
    public Bitmap p;
    public boolean q;
    public ja t;
    public int a = 1;
    public int b = 1;
    public int c = 0;
    public final ka[] d = new ka[2];
    public final float[] i = new float[9];
    public final float[] j = new float[16];
    public final Object k = new Object();
    public final Object n = new Object();
    public final int[] r = new int[3];
    public final int[] s = new int[3];
    public final pg u = new pg(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i10, int i11, int i12) {
        char c10 = fArr != null ? (char) 1 : (char) 0;
        ka kaVar = this.d[c10];
        if (kaVar == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.r[0]);
        GLES20.glViewport(0, 0, this.a, this.b);
        GLES20.glClear(16384);
        GLES20.glUseProgram(kaVar.a);
        GLES20.glUniform1i(kaVar.e, 0);
        GLES20.glActiveTexture(33984);
        if (c10 != 0) {
            GLES20.glBindTexture(36197, i10);
        } else {
            GLES20.glBindTexture(3553, i10);
        }
        GLES20.glEnableVertexAttribArray(kaVar.c);
        GLES20.glVertexAttribPointer(kaVar.c, 2, 5126, false, 8, (Buffer) this.g);
        GLES20.glEnableVertexAttribArray(kaVar.b);
        GLES20.glVertexAttribPointer(kaVar.b, 2, 5126, false, 8, (Buffer) this.e);
        GLES20.glUniform2f(kaVar.f, this.a, this.b);
        float f7 = i11;
        float f10 = i12;
        GLES20.glUniform2f(kaVar.g, f7, f10);
        GLES20.glUniform1i(kaVar.j, 0);
        GLES20.glUniform1f(kaVar.k, c10 != 0 ? 1.0f : 0.0f);
        if (c10 != 0) {
            GLES20.glUniformMatrix4fv(kaVar.l, 1, false, fArr, 0);
        }
        GLES20.glUniform1f(kaVar.m, c10 == 0 ? 0.0f : 1.0f);
        qg.d1.a(kaVar.h, this.l);
        qg.d1.a(kaVar.i, this.m);
        synchronized (this.k) {
            GLES20.glUniformMatrix4fv(kaVar.d, 1, false, this.j, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        if (c10 != 0) {
            kaVar = this.d[0];
            if (kaVar == null) {
                return;
            }
            GLES20.glUseProgram(kaVar.a);
            GLES20.glEnableVertexAttribArray(kaVar.c);
            GLES20.glVertexAttribPointer(kaVar.c, 2, 5126, false, 8, (Buffer) this.g);
            GLES20.glEnableVertexAttribArray(kaVar.b);
            GLES20.glVertexAttribPointer(kaVar.b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(kaVar.f, this.a, this.b);
            GLES20.glUniform2f(kaVar.g, f7, f10);
            GLES20.glUniform1i(kaVar.j, 0);
            qg.d1.a(kaVar.h, this.l);
            qg.d1.a(kaVar.i, this.m);
            GLES20.glUniform1f(kaVar.k, 0.0f);
            synchronized (this.k) {
                GLES20.glUniformMatrix4fv(kaVar.d, 1, false, this.j, 0);
            }
        }
        GLES20.glBindFramebuffer(36160, this.r[1]);
        GLES20.glUniform1i(kaVar.j, 1);
        GLES20.glUniform1i(kaVar.e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.s[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, this.r[2]);
        int i13 = this.a;
        int i14 = this.c * 2;
        GLES20.glViewport(0, 0, i13 + i14, i14 + this.b);
        GLES20.glClear(16384);
        GLES20.glEnableVertexAttribArray(kaVar.b);
        GLES20.glVertexAttribPointer(kaVar.b, 2, 5126, false, 8, (Buffer) this.f);
        GLES20.glUniform1i(kaVar.j, 2);
        GLES20.glUniform1i(kaVar.e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.s[1]);
        ja jaVar = this.t;
        Object obj = jaVar != null ? jaVar.h : null;
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
        AndroidUtilities.cancelRunOnUIThread(this.u);
        AndroidUtilities.runOnUIThread(this.u);
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
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
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
                    readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                }
                int h = zz.h(35633, readRes);
                int h10 = zz.h(35632, readRes2);
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
                ka kaVar = new ka();
                kaVar.a = glCreateProgram;
                kaVar.b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                kaVar.c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                kaVar.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                kaVar.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                kaVar.f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                kaVar.g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                kaVar.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                kaVar.i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                kaVar.j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                kaVar.l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                kaVar.m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                kaVar.k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                this.d[i14] = kaVar;
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
