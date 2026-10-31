package li;

import android.opengl.GLES20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class c0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c0(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public c0(String str, String str2) {
        int a2 = g0.a(35633, str);
        this.b = a2;
        int a10 = g0.a(35632, str2);
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
        throw new IllegalStateException(sc.e.h("Unable to link program: ", glGetProgramInfoLog));
    }
}
