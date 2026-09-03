package fg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j {
    public static final String[] a0 = {"models/star.binobj"};
    public static final String[] b0 = {"models/diamond_outer_2.binobj", "models/diamond_outer.binobj", "models/diamond.binobj"};
    public static final String[] c0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] d0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
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
    public final Bitmap U;
    public Bitmap V;
    public final int W;
    public final int X;
    public final int[] Y;
    public final int a;
    public final int b;
    public final int c;
    public final FloatBuffer[] d;
    public final FloatBuffer[] e;
    public final FloatBuffer[] f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public float s;
    public final int[] t;
    public int y;
    public int z;
    public float u = 0.0f;
    public float v = 2.0f;
    public float w = 0.13f;
    public float x = 1.0f;
    public float A = 0.2f;
    public int B = -1;
    public int C = -1;
    public float Z = 0.0f;

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(1:3)(1:(1:123)(1:(1:129)(1:(17:127|5|(2:6|(26:8|9|10|11|12|13|14|(3:16|17|18)|25|26|27|(2:29|30)|31|32|33|(2:35|36)|37|38|39|40|41|43|44|(8:46|(2:48|(1:50)(6:61|52|(3:57|58|59)|60|58|59))(1:62)|51|52|(4:54|57|58|59)|60|58|59)|63|24)(1:75))|76|(1:121)(2:80|(1:82)(1:120))|83|(2:86|84)|87|88|89|90|91|92|(1:117)(3:96|(2:98|99)(3:111|(2:113|114)|115)|100)|(1:102)(1:109)|103|(2:105|106)(1:108))(1:128))))|4|5|(3:6|(0)(0)|24)|76|(1:78)|121|83|(1:84)|87|88|89|90|91|92|(1:94)|117|(0)(0)|103|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0490, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218 A[EDGE_INSN: B:75:0x0218->B:76:0x0218 BREAK  A[LOOP:0: B:6:0x0062->B:24:0x01b7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e0 A[LOOP:5: B:84:0x03db->B:86:0x03e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(Context context, int i10) {
        String[] strArr;
        String[] strArr2;
        float f10;
        int i11;
        float[] fArr;
        int i12;
        int i13;
        int i14;
        Bitmap bitmap;
        char c3;
        float[] fArr2;
        float[] fArr3;
        DataInputStream dataInputStream;
        int readInt;
        int i15;
        ArrayList arrayList;
        float f11;
        int i16;
        float f12;
        this.X = i10;
        if (i10 == 1) {
            strArr = c0;
        } else if (i10 == 3) {
            strArr = d0;
        } else if (i10 == 0 || i10 == 2) {
            strArr = a0;
        } else {
            if (i10 == 4) {
                strArr2 = b0;
                f10 = 8.0f;
                int length = strArr2.length;
                this.W = length;
                this.d = new FloatBuffer[length];
                this.e = new FloatBuffer[length];
                this.f = new FloatBuffer[length];
                this.t = new int[length];
                i11 = 0;
                while (true) {
                    fArr = null;
                    if (i11 < this.W) {
                        break;
                    }
                    String str = strArr2[i11];
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        try {
                            dataInputStream = new DataInputStream(context.getAssets().open(str));
                            int readInt2 = dataInputStream.readInt();
                            for (int i17 = 0; i17 < readInt2; i17++) {
                                try {
                                    arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
                                } catch (IOException e) {
                                    e = e;
                                    fArr2 = null;
                                    fArr3 = null;
                                    e.printStackTrace();
                                    this.d[i11] = y3.k(ByteBuffer.allocateDirect(fArr.length * 4));
                                    this.d[i11].put(fArr).position(0);
                                    this.e[i11] = y3.k(ByteBuffer.allocateDirect(fArr2.length * 4));
                                    this.e[i11].put(fArr2).position(0);
                                    this.f[i11] = y3.k(ByteBuffer.allocateDirect(fArr3.length * 4));
                                    this.f[i11].put(fArr3).position(0);
                                    this.t[i11] = fArr.length;
                                    i11++;
                                }
                            }
                            int readInt3 = dataInputStream.readInt();
                            for (int i18 = 0; i18 < readInt3; i18++) {
                                arrayList4.add(Float.valueOf(dataInputStream.readFloat()));
                            }
                            int readInt4 = dataInputStream.readInt();
                            for (int i19 = 0; i19 < readInt4; i19++) {
                                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
                            }
                            readInt = dataInputStream.readInt();
                            i15 = readInt * 3;
                            fArr3 = new float[i15];
                            try {
                                fArr2 = new float[readInt * 2];
                            } catch (IOException e6) {
                                e = e6;
                                fArr2 = null;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            fArr2 = null;
                            fArr3 = null;
                            e.printStackTrace();
                            this.d[i11] = y3.k(ByteBuffer.allocateDirect(fArr.length * 4));
                            this.d[i11].put(fArr).position(0);
                            this.e[i11] = y3.k(ByteBuffer.allocateDirect(fArr2.length * 4));
                            this.e[i11].put(fArr2).position(0);
                            this.f[i11] = y3.k(ByteBuffer.allocateDirect(fArr3.length * 4));
                            this.f[i11].put(fArr3).position(0);
                            this.t[i11] = fArr.length;
                            i11++;
                        }
                        try {
                            fArr = new float[i15];
                            int i20 = 0;
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            while (i20 < readInt) {
                                int readInt5 = dataInputStream.readInt() * 3;
                                int i24 = readInt;
                                fArr[i21] = ((Float) arrayList2.get(readInt5)).floatValue() * f10;
                                int i25 = i21 + 2;
                                fArr[i21 + 1] = ((Float) arrayList2.get(readInt5 + 1)).floatValue() * f10;
                                i21 += 3;
                                fArr[i25] = ((Float) arrayList2.get(readInt5 + 2)).floatValue() * f10;
                                int readInt6 = dataInputStream.readInt() * 2;
                                int i26 = i22 + 1;
                                if (readInt6 >= 0) {
                                    arrayList = arrayList2;
                                    if (readInt6 < arrayList4.size()) {
                                        f11 = ((Float) arrayList4.get(readInt6)).floatValue();
                                        fArr2[i22] = f11;
                                        i16 = readInt6 + 1;
                                        i22 += 2;
                                        if (i16 >= 0 && i16 < arrayList4.size()) {
                                            f12 = 1.0f - ((Float) arrayList4.get(i16)).floatValue();
                                            fArr2[i26] = f12;
                                            int readInt7 = dataInputStream.readInt() * 3;
                                            fArr3[i23] = ((Float) arrayList3.get(readInt7)).floatValue();
                                            int i27 = i23 + 2;
                                            fArr3[i23 + 1] = ((Float) arrayList3.get(readInt7 + 1)).floatValue();
                                            i23 += 3;
                                            fArr3[i27] = ((Float) arrayList3.get(readInt7 + 2)).floatValue();
                                            i20++;
                                            arrayList2 = arrayList;
                                            readInt = i24;
                                        }
                                        f12 = 0.0f;
                                        fArr2[i26] = f12;
                                        int readInt72 = dataInputStream.readInt() * 3;
                                        fArr3[i23] = ((Float) arrayList3.get(readInt72)).floatValue();
                                        int i272 = i23 + 2;
                                        fArr3[i23 + 1] = ((Float) arrayList3.get(readInt72 + 1)).floatValue();
                                        i23 += 3;
                                        fArr3[i272] = ((Float) arrayList3.get(readInt72 + 2)).floatValue();
                                        i20++;
                                        arrayList2 = arrayList;
                                        readInt = i24;
                                    }
                                } else {
                                    arrayList = arrayList2;
                                }
                                f11 = 0.0f;
                                fArr2[i22] = f11;
                                i16 = readInt6 + 1;
                                i22 += 2;
                                if (i16 >= 0) {
                                    f12 = 1.0f - ((Float) arrayList4.get(i16)).floatValue();
                                    fArr2[i26] = f12;
                                    int readInt722 = dataInputStream.readInt() * 3;
                                    fArr3[i23] = ((Float) arrayList3.get(readInt722)).floatValue();
                                    int i2722 = i23 + 2;
                                    fArr3[i23 + 1] = ((Float) arrayList3.get(readInt722 + 1)).floatValue();
                                    i23 += 3;
                                    fArr3[i2722] = ((Float) arrayList3.get(readInt722 + 2)).floatValue();
                                    i20++;
                                    arrayList2 = arrayList;
                                    readInt = i24;
                                }
                                f12 = 0.0f;
                                fArr2[i26] = f12;
                                int readInt7222 = dataInputStream.readInt() * 3;
                                fArr3[i23] = ((Float) arrayList3.get(readInt7222)).floatValue();
                                int i27222 = i23 + 2;
                                fArr3[i23 + 1] = ((Float) arrayList3.get(readInt7222 + 1)).floatValue();
                                i23 += 3;
                                fArr3[i27222] = ((Float) arrayList3.get(readInt7222 + 2)).floatValue();
                                i20++;
                                arrayList2 = arrayList;
                                readInt = i24;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            e.printStackTrace();
                            this.d[i11] = y3.k(ByteBuffer.allocateDirect(fArr.length * 4));
                            this.d[i11].put(fArr).position(0);
                            this.e[i11] = y3.k(ByteBuffer.allocateDirect(fArr2.length * 4));
                            this.e[i11].put(fArr2).position(0);
                            this.f[i11] = y3.k(ByteBuffer.allocateDirect(fArr3.length * 4));
                            this.f[i11].put(fArr3).position(0);
                            this.t[i11] = fArr.length;
                            i11++;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                    this.d[i11] = y3.k(ByteBuffer.allocateDirect(fArr.length * 4));
                    this.d[i11].put(fArr).position(0);
                    this.e[i11] = y3.k(ByteBuffer.allocateDirect(fArr2.length * 4));
                    this.e[i11].put(fArr2).position(0);
                    this.f[i11] = y3.k(ByteBuffer.allocateDirect(fArr3.length * 4));
                    this.f[i11].put(fArr3).position(0);
                    this.t[i11] = fArr.length;
                    i11++;
                }
                this.U = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.U);
                Paint paint = new Paint();
                paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{j6.w0(null, j6.Lj, false), j6.w0(null, j6.Mj, false), j6.w0(null, j6.Nj, false), j6.w0(null, j6.Oj, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameteri(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10240, 9728);
                GLUtils.texImage2D(3553, 0, this.U, 0);
                this.p = iArr[0];
                int[] iArr2 = new int[1];
                String str2 = (i10 != 0 || i10 == 2) ? "shaders/fragment4.glsl" : i10 == 4 ? "shaders/fragment5.glsl" : "shaders/fragment3.glsl";
                int a2 = a.a(35633, c(b(context, "shaders/vertex2.glsl")));
                int a10 = a.a(35632, c(b(context, str2)));
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, a2);
                GLES20.glAttachShader(glCreateProgram, a10);
                GLES20.glLinkProgram(glCreateProgram);
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                this.a = glCreateProgram;
                i12 = this.X;
                FloatBuffer[] floatBufferArr = this.d;
                FloatBuffer[] floatBufferArr2 = this.f;
                FloatBuffer[] floatBufferArr3 = this.e;
                GLES20.glUseProgram(glCreateProgram);
                this.k = GLES20.glGetAttribLocation(glCreateProgram, "vPosition");
                this.l = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoordinate");
                this.m = GLES20.glGetAttribLocation(glCreateProgram, "a_Normal");
                this.g = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
                this.h = GLES20.glGetUniformLocation(glCreateProgram, "u_NormalMap");
                this.i = GLES20.glGetUniformLocation(glCreateProgram, "u_BackgroundTexture");
                this.n = GLES20.glGetUniformLocation(glCreateProgram, "f_xOffset");
                this.o = GLES20.glGetUniformLocation(glCreateProgram, "f_alpha");
                this.b = GLES20.glGetUniformLocation(glCreateProgram, "uMVPMatrix");
                this.c = GLES20.glGetUniformLocation(glCreateProgram, "world");
                this.q = GLES20.glGetUniformLocation(glCreateProgram, "white");
                this.r = GLES20.glGetUniformLocation(glCreateProgram, "golden");
                this.E = GLES20.glGetUniformLocation(glCreateProgram, "spec1");
                this.F = GLES20.glGetUniformLocation(glCreateProgram, "spec2");
                this.G = GLES20.glGetUniformLocation(glCreateProgram, "u_diffuse");
                this.H = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor1");
                this.I = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor2");
                this.K = GLES20.glGetUniformLocation(glCreateProgram, "normalSpecColor");
                this.J = GLES20.glGetUniformLocation(glCreateProgram, "normalSpec");
                this.L = GLES20.glGetUniformLocation(glCreateProgram, "specColor");
                this.M = GLES20.glGetUniformLocation(glCreateProgram, "resolution");
                this.N = GLES20.glGetUniformLocation(glCreateProgram, "gradientPosition");
                this.O = GLES20.glGetUniformLocation(glCreateProgram, "modelIndex");
                this.P = GLES20.glGetUniformLocation(glCreateProgram, "modelIndex2");
                this.Q = GLES20.glGetUniformLocation(glCreateProgram, "behind");
                this.R = GLES20.glGetUniformLocation(glCreateProgram, TeXSymbolParser.TYPE_ATTR);
                this.S = GLES20.glGetUniformLocation(glCreateProgram, "night");
                this.T = GLES20.glGetUniformLocation(glCreateProgram, "time");
                i13 = this.W;
                int i28 = i13 * 3;
                int[] iArr3 = new int[i28];
                this.Y = iArr3;
                int i29 = 0;
                GLES20.glGenBuffers(i28, iArr3, 0);
                i14 = 0;
                while (i14 < i13) {
                    int i30 = i14 * 3;
                    GLES20.glBindBuffer(34962, this.Y[i30]);
                    floatBufferArr3[i14].position(i29);
                    GLES20.glBufferData(34962, floatBufferArr3[i14].capacity() * 4, floatBufferArr3[i14], 35044);
                    GLES20.glEnableVertexAttribArray(this.l);
                    floatBufferArr3[i14].clear();
                    GLES20.glBindBuffer(34962, this.Y[i30 + 1]);
                    floatBufferArr2[i14].position(0);
                    GLES20.glBufferData(34962, floatBufferArr2[i14].capacity() * 4, floatBufferArr2[i14], 35044);
                    GLES20.glEnableVertexAttribArray(this.m);
                    floatBufferArr2[i14].clear();
                    GLES20.glBindBuffer(34962, this.Y[i30 + 2]);
                    floatBufferArr[i14].position(0);
                    GLES20.glBufferData(34962, floatBufferArr[i14].capacity() * 4, floatBufferArr[i14], 35044);
                    GLES20.glEnableVertexAttribArray(this.k);
                    floatBufferArr[i14].clear();
                    i14++;
                    i29 = 0;
                }
                GLES20.glBindBuffer(34962, 0);
                int[] iArr4 = new int[1];
                GLES20.glGenTextures(1, iArr4, 0);
                int i31 = iArr4[0];
                this.p = i31;
                GLES20.glBindTexture(3553, i31);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glBindTexture(3553, this.p);
                Bitmap bitmap2 = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
                int[] iArr5 = new int[1];
                GLES20.glGenTextures(1, iArr5, 0);
                GLES20.glBindTexture(3553, iArr5[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLUtils.texImage2D(3553, 0, bitmap2, 0);
                bitmap2.recycle();
                int[] iArr6 = new int[1];
                GLES20.glGenTextures(1, iArr6, 0);
                int i32 = iArr6[0];
                this.j = i32;
                GLES20.glBindTexture(3553, i32);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glBindTexture(3553, this.j);
                if (i12 != 0 || i12 == 2) {
                    bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
                } else if (i12 == 1) {
                    bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
                } else {
                    bitmap = i12 == 3 ? BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png")) : bitmap;
                    bitmap = null;
                }
                if (bitmap == null) {
                    int[] iArr7 = new int[1];
                    c3 = 0;
                    GLES20.glGenTextures(1, iArr7, 0);
                    GLES20.glBindTexture(3553, iArr7[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    bitmap.recycle();
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, iArr7[0]);
                    GLES20.glUniform1i(this.g, 0);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, iArr5[0]);
                    GLES20.glUniform1i(this.h, 1);
                } else {
                    c3 = 0;
                }
                GLES20.glActiveTexture(33986);
                GLES20.glBindTexture(3553, iArr6[c3]);
                GLES20.glUniform1i(this.i, 2);
                if (i12 != 4) {
                    GLES20.glEnable(2884);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                    return;
                }
                return;
            }
            strArr = new String[0];
        }
        strArr2 = strArr;
        f10 = 1.0f;
        int length2 = strArr2.length;
        this.W = length2;
        this.d = new FloatBuffer[length2];
        this.e = new FloatBuffer[length2];
        this.f = new FloatBuffer[length2];
        this.t = new int[length2];
        i11 = 0;
        while (true) {
            fArr = null;
            if (i11 < this.W) {
            }
            this.d[i11] = y3.k(ByteBuffer.allocateDirect(fArr.length * 4));
            this.d[i11].put(fArr).position(0);
            this.e[i11] = y3.k(ByteBuffer.allocateDirect(fArr2.length * 4));
            this.e[i11].put(fArr2).position(0);
            this.f[i11] = y3.k(ByteBuffer.allocateDirect(fArr3.length * 4));
            this.f[i11].put(fArr3).position(0);
            this.t[i11] = fArr.length;
            i11++;
        }
        this.U = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.U);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{j6.w0(null, j6.Lj, false), j6.w0(null, j6.Mj, false), j6.w0(null, j6.Nj, false), j6.w0(null, j6.Oj, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint2);
        int[] iArr8 = new int[1];
        GLES20.glGenTextures(1, iArr8, 0);
        GLES20.glBindTexture(3553, iArr8[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, this.U, 0);
        this.p = iArr8[0];
        int[] iArr22 = new int[1];
        if (i10 != 0) {
        }
        int a22 = a.a(35633, c(b(context, "shaders/vertex2.glsl")));
        int a102 = a.a(35632, c(b(context, str2)));
        int glCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram2, a22);
        GLES20.glAttachShader(glCreateProgram2, a102);
        GLES20.glLinkProgram(glCreateProgram2);
        GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr22, 0);
        this.a = glCreateProgram2;
        i12 = this.X;
        FloatBuffer[] floatBufferArr4 = this.d;
        FloatBuffer[] floatBufferArr22 = this.f;
        FloatBuffer[] floatBufferArr32 = this.e;
        GLES20.glUseProgram(glCreateProgram2);
        this.k = GLES20.glGetAttribLocation(glCreateProgram2, "vPosition");
        this.l = GLES20.glGetAttribLocation(glCreateProgram2, "a_TexCoordinate");
        this.m = GLES20.glGetAttribLocation(glCreateProgram2, "a_Normal");
        this.g = GLES20.glGetUniformLocation(glCreateProgram2, "u_Texture");
        this.h = GLES20.glGetUniformLocation(glCreateProgram2, "u_NormalMap");
        this.i = GLES20.glGetUniformLocation(glCreateProgram2, "u_BackgroundTexture");
        this.n = GLES20.glGetUniformLocation(glCreateProgram2, "f_xOffset");
        this.o = GLES20.glGetUniformLocation(glCreateProgram2, "f_alpha");
        this.b = GLES20.glGetUniformLocation(glCreateProgram2, "uMVPMatrix");
        this.c = GLES20.glGetUniformLocation(glCreateProgram2, "world");
        this.q = GLES20.glGetUniformLocation(glCreateProgram2, "white");
        this.r = GLES20.glGetUniformLocation(glCreateProgram2, "golden");
        this.E = GLES20.glGetUniformLocation(glCreateProgram2, "spec1");
        this.F = GLES20.glGetUniformLocation(glCreateProgram2, "spec2");
        this.G = GLES20.glGetUniformLocation(glCreateProgram2, "u_diffuse");
        this.H = GLES20.glGetUniformLocation(glCreateProgram2, "gradientColor1");
        this.I = GLES20.glGetUniformLocation(glCreateProgram2, "gradientColor2");
        this.K = GLES20.glGetUniformLocation(glCreateProgram2, "normalSpecColor");
        this.J = GLES20.glGetUniformLocation(glCreateProgram2, "normalSpec");
        this.L = GLES20.glGetUniformLocation(glCreateProgram2, "specColor");
        this.M = GLES20.glGetUniformLocation(glCreateProgram2, "resolution");
        this.N = GLES20.glGetUniformLocation(glCreateProgram2, "gradientPosition");
        this.O = GLES20.glGetUniformLocation(glCreateProgram2, "modelIndex");
        this.P = GLES20.glGetUniformLocation(glCreateProgram2, "modelIndex2");
        this.Q = GLES20.glGetUniformLocation(glCreateProgram2, "behind");
        this.R = GLES20.glGetUniformLocation(glCreateProgram2, TeXSymbolParser.TYPE_ATTR);
        this.S = GLES20.glGetUniformLocation(glCreateProgram2, "night");
        this.T = GLES20.glGetUniformLocation(glCreateProgram2, "time");
        i13 = this.W;
        int i282 = i13 * 3;
        int[] iArr32 = new int[i282];
        this.Y = iArr32;
        int i292 = 0;
        GLES20.glGenBuffers(i282, iArr32, 0);
        i14 = 0;
        while (i14 < i13) {
        }
        GLES20.glBindBuffer(34962, 0);
        int[] iArr42 = new int[1];
        GLES20.glGenTextures(1, iArr42, 0);
        int i312 = iArr42[0];
        this.p = i312;
        GLES20.glBindTexture(3553, i312);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.p);
        Bitmap bitmap22 = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
        int[] iArr52 = new int[1];
        GLES20.glGenTextures(1, iArr52, 0);
        GLES20.glBindTexture(3553, iArr52[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap22, 0);
        bitmap22.recycle();
        int[] iArr62 = new int[1];
        GLES20.glGenTextures(1, iArr62, 0);
        int i322 = iArr62[0];
        this.j = i322;
        GLES20.glBindTexture(3553, i322);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.j);
        if (i12 != 0) {
        }
        bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        if (bitmap == null) {
        }
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, iArr62[c3]);
        GLES20.glUniform1i(this.i, 2);
        if (i12 != 4) {
        }
    }

    public static String b(Context context, String str) {
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

    public static String c(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(Integer.parseInt(group.substring(0, 2), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(2, 4), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(4, 6), 16) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void a(int i10, boolean z4) {
        int i11 = i10 * 3;
        GLES20.glBindBuffer(34962, this.Y[i11]);
        GLES20.glVertexAttribPointer(this.l, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 1]);
        GLES20.glVertexAttribPointer(this.m, 3, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 2]);
        GLES20.glVertexAttribPointer(this.k, 3, 5126, false, 0, 0);
        GLES20.glUniform1i(this.O, i10);
        GLES20.glUniform1i(this.P, i10);
        GLES20.glUniform1i(this.Q, z4 ? 1 : 0);
        GLES20.glUniform1i(this.R, this.X);
        GLES20.glDrawArrays(4, 0, this.t[i10] / 3);
    }
}
