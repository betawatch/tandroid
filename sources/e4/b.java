package e4;

import a8.ga;
import a8.ia;
import android.opengl.GLES20;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.p30;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ b(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b b(String str) {
        char c10;
        ia.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String c11 = ga.c(split[i14].trim());
            c11.getClass();
            switch (c11.hashCode()) {
                case 100571:
                    if (c11.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (c11.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102749521:
                    if (c11.equals("layer")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (c11.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (c11.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i7 = i14;
                    break;
                case 3:
                    i10 = i14;
                    break;
                case 4:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i7, i10, i11, i12, i13, split.length);
    }

    public void a() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public b(int i7) {
        int a10 = p30.a(35633, R.raw.round_blur_vert);
        this.b = a10;
        int a11 = p30.a(35632, i7);
        this.c = a11;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glAttachShader(glCreateProgram, a11);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            glCreateProgram = 0;
        }
        this.a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }
}
