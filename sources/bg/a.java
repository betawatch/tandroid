package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int a;
    public int b;
    public j c;
    public float i;
    public final Context n;
    public Bitmap o;
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public int u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public final float[] l = new float[16];
    public final float[] m = new float[16];
    public int w = g6.Vj;
    public int x = g6.Wj;
    public final int y = g6.fk;
    public final int z = g6.gk;

    public a(Context context, int i10, int i11) {
        this.i = 0.0f;
        this.n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.i = 1.0f;
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
        int i10 = g6.h5;
        boolean z10 = false;
        this.t = i0.b.f(g6.w0(null, i10, false)) < 0.5d;
        this.u = i0.b.d(this.i, g6.w0(null, this.w, false), g6.w0(null, this.y, false));
        this.v = i0.b.d(this.i, g6.w0(null, this.x, false), g6.w0(null, this.z, false));
        if (this.A == 1 && i0.b.f(g6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        }
        this.C = z10;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.l, 0, 0.0f, this.B == 4 ? 40.0f : 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.m, 0, -this.g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.m, 0, (-this.d) - this.f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.j, 0, this.l, 0, this.m, 0);
        float[] fArr2 = this.j;
        Matrix.multiplyMM(fArr2, 0, this.k, 0, fArr2, 0);
        j jVar = this.c;
        if (jVar != null) {
            jVar.D = this.t;
            jVar.y = this.u;
            jVar.z = this.v;
            int i10 = this.a;
            int i11 = this.b;
            float f10 = this.p;
            float f11 = this.r;
            float f12 = this.q;
            float f13 = this.s;
            float f14 = this.h;
            float f15 = this.i;
            float f16 = this.D;
            if (jVar.V != null) {
                GLES20.glBindTexture(3553, jVar.j);
                GLUtils.texImage2D(3553, 0, jVar.V, 0);
                jVar.V = null;
            }
            GLES20.glUniform1i(jVar.g, 0);
            GLES20.glUniform1f(jVar.n, jVar.s);
            GLES20.glUniform1f(jVar.o, jVar.u);
            GLES20.glUniform1f(jVar.q, f14);
            GLES20.glUniform1f(jVar.r, f15);
            GLES20.glUniformMatrix4fv(jVar.b, 1, false, this.j, 0);
            GLES20.glUniformMatrix4fv(jVar.c, 1, false, fArr, 0);
            GLES20.glUniform1f(jVar.E, jVar.v);
            GLES20.glUniform1f(jVar.F, jVar.w);
            GLES20.glUniform1f(jVar.G, jVar.x);
            GLES20.glUniform1f(jVar.J, jVar.A);
            GLES20.glUniform3f(jVar.H, Color.red(jVar.y) / 255.0f, Color.green(jVar.y) / 255.0f, Color.blue(jVar.y) / 255.0f);
            GLES20.glUniform3f(jVar.I, Color.red(jVar.z) / 255.0f, Color.green(jVar.z) / 255.0f, Color.blue(jVar.z) / 255.0f);
            GLES20.glUniform3f(jVar.K, Color.red(jVar.B) / 255.0f, Color.green(jVar.B) / 255.0f, Color.blue(jVar.B) / 255.0f);
            GLES20.glUniform3f(jVar.L, Color.red(jVar.C) / 255.0f, Color.green(jVar.C) / 255.0f, Color.blue(jVar.C) / 255.0f);
            GLES20.glUniform2f(jVar.M, i10, i11);
            GLES20.glUniform4f(jVar.N, f10, f11, f12, f13);
            GLES20.glUniform1i(jVar.S, jVar.D ? 1 : 0);
            float f17 = jVar.Z + f16;
            jVar.Z = f17;
            GLES20.glUniform1f(jVar.T, f17);
            if (jVar.X == 4) {
                jVar.a(0, true);
                GLES20.glClear(256);
                jVar.a(1, true);
                GLES20.glClear(256);
                jVar.a(2, false);
                jVar.a(1, false);
                jVar.a(0, false);
            } else {
                for (int i12 = 0; i12 < jVar.W; i12++) {
                    jVar.a(i12, false);
                }
            }
            float f18 = jVar.u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                jVar.u = f19;
                if (f19 > 1.0f) {
                    jVar.u = 1.0f;
                }
            }
            float f20 = jVar.s + 5.0E-4f;
            jVar.s = f20;
            if (f20 > 1.0f) {
                jVar.s = f20 - 1.0f;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        Matrix.perspectiveM(this.k, 0, this.B == 4 ? 12.0f : 53.13f, i10 / i11, 1.0f, 200.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        j jVar = this.c;
        if (jVar != null) {
            GLES20.glDeleteProgram(jVar.a);
        }
        j jVar2 = new j(this.n, this.B);
        this.c = jVar2;
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            jVar2.V = bitmap;
        }
        if (this.C) {
            jVar2.v = 1.0f;
            jVar2.w = 0.2f;
        }
    }
}
