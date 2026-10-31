package lg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int a;
    public int b;
    public r c;
    public float l;
    public final Context q;
    public Bitmap r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f = 0.0f;
    public volatile float g = 0.0f;
    public volatile float h = 1.0f;
    public float i = 0.0f;
    public volatile float j = 0.0f;
    public float k = 0.0f;
    public final float[] m = new float[16];
    public final float[] n = new float[16];
    public final float[] o = new float[16];
    public final float[] p = new float[16];
    public int z = t6.Jk;
    public int A = t6.Kk;
    public final int B = t6.Tk;
    public final int C = t6.Uk;

    public h(Context context, int i10, int i11) {
        this.l = 0.0f;
        this.q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.l = 1.0f;
        }
        b();
    }

    public static int a(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(glCreateShader) + " " + str);
    }

    public final void b() {
        int i10 = t6.h5;
        boolean z10 = false;
        this.w = i0.b.h(t6.x0(null, i10, false)) < 0.5d;
        this.x = i0.b.f(this.l, t6.x0(null, this.z, false), t6.x0(null, this.B, false));
        this.y = i0.b.f(this.l, t6.x0(null, this.A, false), t6.x0(null, this.C, false));
        if (this.D == 1 && i0.b.h(t6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        }
        this.F = z10;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int i10;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.o, 0, 0.0f, this.E == 4 ? 40.0f : 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.p, 0);
        Matrix.translateM(this.p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.p, 0, (-this.i) - this.j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.p, 0, (-this.d) - this.f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.m, 0, this.o, 0, this.p, 0);
        float[] fArr = this.m;
        Matrix.multiplyMM(fArr, 0, this.n, 0, fArr, 0);
        r rVar = this.c;
        if (rVar != null) {
            rVar.b = (float) Math.toRadians(this.d + this.f);
            this.c.c = (float) Math.toRadians(this.i + this.j);
            this.c.d = (float) Math.toRadians(this.g);
            this.c.e = this.h;
            r rVar2 = this.c;
            rVar2.getClass();
            rVar2.J = this.w;
            rVar2.E = this.x;
            rVar2.F = this.y;
            float[] fArr2 = this.m;
            float[] fArr3 = this.p;
            int i11 = this.a;
            int i12 = this.b;
            float f7 = this.s;
            float f10 = this.u;
            float f11 = this.t;
            float f12 = this.v;
            float f13 = this.k;
            float f14 = this.l;
            float f15 = this.G;
            if (rVar2.a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f15, 0.1f)) / 0.22f) + rVar2.z);
                rVar2.z = min;
                a aVar = rVar2.a;
                aVar.B = rVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, rVar2.b, rVar2.c, rVar2.d, f15, min * rVar2.A, f13, false);
                return;
            }
            if (rVar2.Z != null) {
                GLES20.glBindTexture(3553, rVar2.o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, rVar2.Z, 0);
                rVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(rVar2.l, i10);
            GLES20.glUniform1f(rVar2.s, rVar2.x);
            GLES20.glUniform1f(rVar2.t, rVar2.z);
            GLES20.glUniform1f(rVar2.v, f13);
            GLES20.glUniform1f(rVar2.w, f14);
            GLES20.glUniformMatrix4fv(rVar2.g, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(rVar2.h, 1, false, fArr3, 0);
            GLES20.glUniform1f(rVar2.K, rVar2.B);
            GLES20.glUniform1f(rVar2.L, rVar2.C);
            GLES20.glUniform1f(rVar2.M, rVar2.D);
            GLES20.glUniform1f(rVar2.P, rVar2.G);
            GLES20.glUniform3f(rVar2.N, Color.red(rVar2.E) / 255.0f, Color.green(rVar2.E) / 255.0f, Color.blue(rVar2.E) / 255.0f);
            GLES20.glUniform3f(rVar2.O, Color.red(rVar2.F) / 255.0f, Color.green(rVar2.F) / 255.0f, Color.blue(rVar2.F) / 255.0f);
            GLES20.glUniform3f(rVar2.Q, Color.red(rVar2.H) / 255.0f, Color.green(rVar2.H) / 255.0f, Color.blue(rVar2.H) / 255.0f);
            GLES20.glUniform3f(rVar2.R, Color.red(rVar2.I) / 255.0f, Color.green(rVar2.I) / 255.0f, Color.blue(rVar2.I) / 255.0f);
            GLES20.glUniform2f(rVar2.S, i11, i12);
            GLES20.glUniform4f(rVar2.T, f7, f10, f11, f12);
            GLES20.glUniform1i(rVar2.W, rVar2.J ? 1 : 0);
            float f16 = rVar2.d0 + f15;
            rVar2.d0 = f16;
            GLES20.glUniform1f(rVar2.X, f16);
            for (int i13 = 0; i13 < rVar2.a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, rVar2.c0[i14]);
                GLES20.glVertexAttribPointer(rVar2.q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, rVar2.c0[i14 + 1]);
                GLES20.glVertexAttribPointer(rVar2.r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, rVar2.c0[i14 + 2]);
                GLES20.glVertexAttribPointer(rVar2.p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(rVar2.U, i13);
                GLES20.glUniform1i(rVar2.V, rVar2.b0);
                GLES20.glDrawArrays(4, 0, rVar2.y[i13] / 3);
            }
            float f17 = rVar2.z;
            if (f17 < 1.0f) {
                float f18 = f17 + 0.07272727f;
                rVar2.z = f18;
                if (f18 > 1.0f) {
                    rVar2.z = 1.0f;
                }
            }
            float f19 = rVar2.x + 5.0E-4f;
            rVar2.x = f19;
            if (f19 > 1.0f) {
                rVar2.x = f19 - 1.0f;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        Matrix.perspectiveM(this.n, 0, this.E == 4 ? 12.0f : 53.13f, i10 / i11, 1.0f, 200.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        r rVar = this.c;
        if (rVar != null) {
            a aVar = rVar.a;
            if (aVar != null) {
                aVar.b();
                rVar.a = null;
            } else {
                GLES20.glDeleteProgram(rVar.f);
            }
        }
        r rVar2 = new r(this.q, this.E);
        this.c = rVar2;
        Bitmap bitmap = this.r;
        if (bitmap != null && rVar2.a == null) {
            rVar2.Z = bitmap;
        }
        if (this.F) {
            rVar2.B = 1.0f;
            rVar2.C = 0.2f;
        }
    }
}
