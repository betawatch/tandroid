// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nl5 {
    public static final String[] e0 = {"models/star.binobj"};
    public static final String[] f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public int E;
    public int F;
    public boolean J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final Bitmap Y;
    public Bitmap Z;
    public ul3 a;
    public final int a0;
    public float b;
    public final byte b0;
    public float c;
    public final int[] c0;
    public float d;
    public final int f;
    public final int g;
    public final int h;
    public final FloatBuffer[] i;
    public final FloatBuffer[] j;
    public final FloatBuffer[] k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public float x;
    public final int[] y;
    public float e = 1.0f;
    public float z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public final float D = 1.0f;
    public final float G = 0.2f;
    public final int H = -1;
    public final int I = -1;
    public float d0 = 0.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105 A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #5 {all -> 0x0119, blocks: (B:38:0x00b9, B:40:0x00c1, B:42:0x00d0, B:44:0x00da, B:46:0x00df, B:47:0x00e5, B:49:0x00ed, B:51:0x00f0, B:52:0x00f6, B:54:0x0105), top: B:37:0x00b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nl5(Context context, int i) {
        Bitmap bitmap;
        Bitmap d;
        char c;
        float f;
        int i2;
        char c2;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        DataInputStream dataInputStream;
        Throwable th;
        int i3;
        float f2;
        int i4;
        int i5;
        float f3 = 1.0f;
        this.b0 = i;
        int i6 = 1;
        if (i == 4) {
            String glGetString = GLES20.glGetString(7938);
            if (glGetString == null || !glGetString.startsWith("OpenGL ES 3")) {
                grb.i("Diamond requires OpenGL ES 3");
                throw null;
            }
            this.a = new ul3(context, 4);
            this.a0 = 1;
            return;
        }
        int i7 = 3;
        char c3 = 2;
        int i8 = 0;
        String[] strArr = i == 1 ? f0 : i == 3 ? g0 : (i == 0 || i == 2) ? e0 : new String[0];
        int length = strArr.length;
        this.a0 = length;
        this.i = new FloatBuffer[length];
        this.j = new FloatBuffer[length];
        this.k = new FloatBuffer[length];
        this.y = new int[length];
        int i9 = 0;
        while (i9 < this.a0) {
            try {
                f = f3;
            } catch (IOException e) {
                e = e;
                f = f3;
            }
            try {
                dataInputStream = new DataInputStream(new BufferedInputStream(context.getAssets().open(strArr[i9]), TLObject.FLAG_14));
                try {
                    float[] a = oue.a(dataInputStream);
                    float[] a2 = oue.a(dataInputStream);
                    float[] a3 = oue.a(dataInputStream);
                    int readInt = dataInputStream.readInt();
                    c2 = c3;
                    int i10 = readInt * 3;
                    i2 = i6;
                    try {
                        fArr = new float[i10];
                        try {
                            fArr2 = new float[readInt << 1];
                            try {
                                fArr3 = new float[i10];
                                int i11 = i8;
                                while (i11 < readInt) {
                                    try {
                                        int readInt2 = dataInputStream.readInt() * 3;
                                        while (i8 < i7) {
                                            fArr3[(i11 * 3) + i8] = a[readInt2 + i8] * f;
                                            i8++;
                                        }
                                        int readInt3 = dataInputStream.readInt() << 1;
                                        int i12 = i11 << 1;
                                        if (readInt3 >= 0) {
                                            i3 = i7;
                                            if (readInt3 < a2.length) {
                                                f2 = a2[readInt3];
                                                fArr2[i12] = f2;
                                                int i13 = readInt3 + 1;
                                                fArr2[i12 + 1] = (i13 >= 0 || i13 >= a2.length) ? 0.0f : f - a2[i13];
                                                int readInt4 = dataInputStream.readInt() * 3;
                                                float[] fArr4 = a2;
                                                i5 = 0;
                                                for (i4 = i3; i5 < i4; i4 = 3) {
                                                    fArr[(i11 * 3) + i5] = a3[readInt4 + i5];
                                                    i5++;
                                                }
                                                i11++;
                                                a2 = fArr4;
                                                i7 = 3;
                                                i8 = 0;
                                            }
                                        } else {
                                            i3 = i7;
                                        }
                                        f2 = 0.0f;
                                        fArr2[i12] = f2;
                                        int i132 = readInt3 + 1;
                                        fArr2[i12 + 1] = (i132 >= 0 || i132 >= a2.length) ? 0.0f : f - a2[i132];
                                        int readInt42 = dataInputStream.readInt() * 3;
                                        float[] fArr42 = a2;
                                        i5 = 0;
                                        while (i5 < i4) {
                                        }
                                        i11++;
                                        a2 = fArr42;
                                        i7 = 3;
                                        i8 = 0;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            dataInputStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fArr3 = null;
                                dataInputStream.close();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fArr2 = null;
                            fArr3 = null;
                            dataInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        fArr = null;
                        fArr2 = null;
                        fArr3 = null;
                        dataInputStream.close();
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    i2 = i6;
                    c2 = c3;
                }
            } catch (IOException e2) {
                e = e2;
                i2 = i6;
                c2 = c3;
                fArr = null;
                fArr2 = null;
                fArr3 = null;
                e.printStackTrace();
                this.i[i9] = ByteBuffer.allocateDirect(fArr3.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.i[i9].put(fArr3).position(0);
                this.j[i9] = ByteBuffer.allocateDirect(fArr2.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.j[i9].put(fArr2).position(0);
                this.k[i9] = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.k[i9].put(fArr).position(0);
                this.y[i9] = fArr3.length;
                i9++;
                f3 = f;
                c3 = c2;
                i6 = i2;
                i7 = 3;
                i8 = 0;
            }
            try {
                dataInputStream.close();
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                this.i[i9] = ByteBuffer.allocateDirect(fArr3.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.i[i9].put(fArr3).position(0);
                this.j[i9] = ByteBuffer.allocateDirect(fArr2.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.j[i9].put(fArr2).position(0);
                this.k[i9] = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.k[i9].put(fArr).position(0);
                this.y[i9] = fArr3.length;
                i9++;
                f3 = f;
                c3 = c2;
                i6 = i2;
                i7 = 3;
                i8 = 0;
            }
            this.i[i9] = ByteBuffer.allocateDirect(fArr3.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.i[i9].put(fArr3).position(0);
            this.j[i9] = ByteBuffer.allocateDirect(fArr2.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.j[i9].put(fArr2).position(0);
            this.k[i9] = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.k[i9].put(fArr).position(0);
            this.y[i9] = fArr3.length;
            i9++;
            f3 = f;
            c3 = c2;
            i6 = i2;
            i7 = 3;
            i8 = 0;
        }
        int i14 = i6;
        char c4 = c3;
        this.Y = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.Y);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{aob.w0(null, aob.Ck, false), aob.w0(null, aob.Dk, false), aob.w0(null, aob.Ek, false), aob.w0(null, aob.Fk, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
        int[] iArr = new int[i14];
        GLES20.glGenTextures(i14, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, this.Y, 0);
        this.u = iArr[0];
        int[] iArr2 = new int[1];
        String str = (i == 0 || i == c4) ? "shaders/fragment4.glsl" : "shaders/fragment3.glsl";
        int a4 = ys4.a(35633, b(a(context, "shaders/vertex2.glsl")));
        int a5 = ys4.a(35632, b(a(context, str)));
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a4);
        GLES20.glAttachShader(glCreateProgram, a5);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        this.f = glCreateProgram;
        FloatBuffer[] floatBufferArr = this.i;
        FloatBuffer[] floatBufferArr2 = this.k;
        FloatBuffer[] floatBufferArr3 = this.j;
        GLES20.glUseProgram(glCreateProgram);
        this.p = GLES20.glGetAttribLocation(glCreateProgram, "vPosition");
        this.q = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoordinate");
        this.r = GLES20.glGetAttribLocation(glCreateProgram, "a_Normal");
        this.l = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
        this.m = GLES20.glGetUniformLocation(glCreateProgram, "u_NormalMap");
        this.n = GLES20.glGetUniformLocation(glCreateProgram, "u_BackgroundTexture");
        this.s = GLES20.glGetUniformLocation(glCreateProgram, "f_xOffset");
        this.t = GLES20.glGetUniformLocation(glCreateProgram, "f_alpha");
        this.g = GLES20.glGetUniformLocation(glCreateProgram, "uMVPMatrix");
        this.h = GLES20.glGetUniformLocation(glCreateProgram, "world");
        this.v = GLES20.glGetUniformLocation(glCreateProgram, "white");
        this.w = GLES20.glGetUniformLocation(glCreateProgram, "golden");
        this.K = GLES20.glGetUniformLocation(glCreateProgram, "spec1");
        this.L = GLES20.glGetUniformLocation(glCreateProgram, "spec2");
        this.M = GLES20.glGetUniformLocation(glCreateProgram, "u_diffuse");
        this.N = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor1");
        this.O = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor2");
        this.Q = GLES20.glGetUniformLocation(glCreateProgram, "normalSpecColor");
        this.P = GLES20.glGetUniformLocation(glCreateProgram, "normalSpec");
        this.R = GLES20.glGetUniformLocation(glCreateProgram, "specColor");
        this.S = GLES20.glGetUniformLocation(glCreateProgram, "resolution");
        this.T = GLES20.glGetUniformLocation(glCreateProgram, "gradientPosition");
        this.U = GLES20.glGetUniformLocation(glCreateProgram, "modelIndex");
        this.V = GLES20.glGetUniformLocation(glCreateProgram, TeXSymbolParser.TYPE_ATTR);
        this.W = GLES20.glGetUniformLocation(glCreateProgram, "night");
        this.X = GLES20.glGetUniformLocation(glCreateProgram, "time");
        int i15 = this.a0;
        int i16 = i15 * 3;
        int[] iArr3 = new int[i16];
        this.c0 = iArr3;
        int i17 = 0;
        GLES20.glGenBuffers(i16, iArr3, 0);
        int i18 = 0;
        while (i18 < i15) {
            int i19 = i18 * 3;
            GLES20.glBindBuffer(34962, this.c0[i19]);
            floatBufferArr3[i18].position(i17);
            GLES20.glBufferData(34962, floatBufferArr3[i18].capacity() << 2, floatBufferArr3[i18], 35044);
            GLES20.glEnableVertexAttribArray(this.q);
            floatBufferArr3[i18].clear();
            GLES20.glBindBuffer(34962, this.c0[i19 + 1]);
            floatBufferArr2[i18].position(0);
            GLES20.glBufferData(34962, floatBufferArr2[i18].capacity() << 2, floatBufferArr2[i18], 35044);
            GLES20.glEnableVertexAttribArray(this.r);
            floatBufferArr2[i18].clear();
            GLES20.glBindBuffer(34962, this.c0[i19 + 2]);
            floatBufferArr[i18].position(0);
            GLES20.glBufferData(34962, floatBufferArr[i18].capacity() << 2, floatBufferArr[i18], 35044);
            GLES20.glEnableVertexAttribArray(this.p);
            floatBufferArr[i18].clear();
            i18++;
            i17 = 0;
        }
        int i20 = i17;
        GLES20.glBindBuffer(34962, i20);
        int[] iArr4 = new int[1];
        GLES20.glGenTextures(1, iArr4, i20);
        int i21 = iArr4[i20];
        this.u = i21;
        GLES20.glBindTexture(3553, i21);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.u);
        try {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
        } catch (IOException unused) {
            bitmap = null;
        }
        int[] iArr5 = new int[1];
        GLES20.glGenTextures(1, iArr5, 0);
        GLES20.glBindTexture(3553, iArr5[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
        int[] iArr6 = new int[1];
        GLES20.glGenTextures(1, iArr6, 0);
        int i22 = iArr6[0];
        this.o = i22;
        GLES20.glBindTexture(3553, i22);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.o);
        byte b = this.b0;
        if (b == 0 || b == 2) {
            d = hgb.d(R.raw.start_texture, jn7.O3, jn7.O3, -1);
        } else if (b == 1) {
            d = BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
        } else {
            d = b == 3 ? BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png")) : d;
            d = null;
        }
        if (d != null) {
            int[] iArr7 = new int[1];
            c = 0;
            GLES20.glGenTextures(1, iArr7, 0);
            GLES20.glBindTexture(3553, iArr7[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, d, 0);
            d.recycle();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr7[0]);
            GLES20.glUniform1i(this.l, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr5[0]);
            GLES20.glUniform1i(this.m, 1);
        } else {
            c = 0;
        }
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, iArr6[c]);
        GLES20.glUniform1i(this.n, 2);
    }

    public static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
            open.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String b(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(Integer.parseInt(group.substring(0, 2), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(2, 4), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(4, 6), 16) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
