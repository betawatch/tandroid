package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int a;
    public int b;
    public k c;
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
    public int w = f6.Vj;
    public int x = f6.Wj;
    public final int y = f6.fk;
    public final int z = f6.gk;

    public a(Context context, int i9, int i10) {
        this.i = 0.0f;
        this.n = context;
        this.A = i9;
        this.B = i10;
        if (i10 == 2) {
            this.i = 1.0f;
        }
        b();
    }

    public static int a(int i9, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i9);
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
        int i9 = f6.h5;
        boolean z10 = false;
        this.t = i0.a.f(f6.w0(null, i9, false)) < 0.5d;
        this.u = i0.a.d(this.i, f6.w0(null, this.w, false), f6.w0(null, this.y, false));
        this.v = i0.a.d(this.i, f6.w0(null, this.x, false), f6.w0(null, this.z, false));
        if (this.A == 1 && i0.a.f(f6.w0(null, i9, false)) < 0.5d) {
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
        k kVar = this.c;
        if (kVar != null) {
            kVar.D = this.t;
            kVar.y = this.u;
            kVar.z = this.v;
            int i9 = this.a;
            int i10 = this.b;
            float f10 = this.p;
            float f11 = this.r;
            float f12 = this.q;
            float f13 = this.s;
            float f14 = this.h;
            float f15 = this.i;
            float f16 = this.D;
            if (kVar.V != null) {
                GLES20.glBindTexture(3553, kVar.j);
                GLUtils.texImage2D(3553, 0, kVar.V, 0);
                kVar.V = null;
            }
            GLES20.glUniform1i(kVar.g, 0);
            GLES20.glUniform1f(kVar.n, kVar.s);
            GLES20.glUniform1f(kVar.o, kVar.u);
            GLES20.glUniform1f(kVar.q, f14);
            GLES20.glUniform1f(kVar.r, f15);
            GLES20.glUniformMatrix4fv(kVar.b, 1, false, this.j, 0);
            GLES20.glUniformMatrix4fv(kVar.c, 1, false, fArr, 0);
            GLES20.glUniform1f(kVar.E, kVar.v);
            GLES20.glUniform1f(kVar.F, kVar.w);
            GLES20.glUniform1f(kVar.G, kVar.x);
            GLES20.glUniform1f(kVar.J, kVar.A);
            GLES20.glUniform3f(kVar.H, Color.red(kVar.y) / 255.0f, Color.green(kVar.y) / 255.0f, Color.blue(kVar.y) / 255.0f);
            GLES20.glUniform3f(kVar.I, Color.red(kVar.z) / 255.0f, Color.green(kVar.z) / 255.0f, Color.blue(kVar.z) / 255.0f);
            GLES20.glUniform3f(kVar.K, Color.red(kVar.B) / 255.0f, Color.green(kVar.B) / 255.0f, Color.blue(kVar.B) / 255.0f);
            GLES20.glUniform3f(kVar.L, Color.red(kVar.C) / 255.0f, Color.green(kVar.C) / 255.0f, Color.blue(kVar.C) / 255.0f);
            GLES20.glUniform2f(kVar.M, i9, i10);
            GLES20.glUniform4f(kVar.N, f10, f11, f12, f13);
            GLES20.glUniform1i(kVar.S, kVar.D ? 1 : 0);
            float f17 = kVar.Z + f16;
            kVar.Z = f17;
            GLES20.glUniform1f(kVar.T, f17);
            if (kVar.X == 4) {
                kVar.a(0, true);
                GLES20.glClear(256);
                kVar.a(1, true);
                GLES20.glClear(256);
                kVar.a(2, false);
                kVar.a(1, false);
                kVar.a(0, false);
            } else {
                for (int i11 = 0; i11 < kVar.W; i11++) {
                    kVar.a(i11, false);
                }
            }
            float f18 = kVar.u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                kVar.u = f19;
                if (f19 > 1.0f) {
                    kVar.u = 1.0f;
                }
            }
            float f20 = kVar.s + 5.0E-4f;
            kVar.s = f20;
            if (f20 > 1.0f) {
                kVar.s = f20 - 1.0f;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i9, int i10) {
        this.a = i9;
        this.b = i10;
        GLES20.glViewport(0, 0, i9, i10);
        Matrix.perspectiveM(this.k, 0, this.B == 4 ? 12.0f : 53.13f, i9 / i10, 1.0f, 200.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        k kVar = this.c;
        if (kVar != null) {
            GLES20.glDeleteProgram(kVar.a);
        }
        k kVar2 = new k(this.n, this.B);
        this.c = kVar2;
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            kVar2.V = bitmap;
        }
        if (this.C) {
            kVar2.v = 1.0f;
            kVar2.w = 0.2f;
        }
    }
}
