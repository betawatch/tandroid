package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import com.google.android.gms.internal.vision.e2;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class a0 {
    public static z D;
    public static z E;
    public static final String F = l(1.75f, 4);
    public static final String G = l(4.0f, 9);
    public boolean A;
    public boolean B;
    public final int a;
    public final int b;
    public Size c;
    public int d;
    public final boolean e;
    public final boolean f;
    public final u g;
    public final w h;
    public final x i;
    public final v j;
    public final y k;
    public final u l;
    public final u m;
    public final w n;
    public final FloatBuffer o;
    public final FloatBuffer p;
    public FloatBuffer q;
    public FloatBuffer r;
    public final int[] t;
    public int u;
    public long z;
    public final int[] s = new int[8];
    public int v = 0;
    public int w = 1;
    public int x = 0;
    public int y = 1;
    public float C = -1.0f;

    public a0(int i10, Size size, int i11, boolean z10) {
        char c10;
        v vVar;
        float[] fArr;
        int i12;
        z zVar;
        float f7;
        float[] fArr2;
        Bitmap bitmap;
        int[] iArr = new int[10];
        this.t = iArr;
        this.a = i10;
        this.b = Math.max(1, i10 / 2);
        this.c = size;
        this.d = i11;
        this.e = z10;
        String glGetString = GLES20.glGetString(7939);
        boolean z11 = glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod");
        this.f = z11;
        this.g = new u("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new w("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.i = z10 ? new x() : null;
        if (z10) {
            vVar = new v("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            int glGetUniformLocation = GLES20.glGetUniformLocation(vVar.a, "bTexture");
            c10 = '\b';
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(vVar.a, "mTexture");
            GLES20.glUseProgram(vVar.a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
        } else {
            c10 = '\b';
            vVar = null;
        }
        this.j = vVar;
        this.k = new y(z10, z11);
        this.l = new u();
        this.m = new u(G, 1);
        this.n = z10 ? new w("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n") : null;
        float[] fArr3 = new float[656];
        fArr3[0] = 0.0f;
        fArr3[1] = 0.0f;
        fArr3[2] = 1.0f;
        fArr3[3] = 0.0f;
        fArr3[4] = 0.0f;
        fArr3[5] = 1.0f;
        fArr3[6] = 1.0f;
        fArr3[7] = 1.0f;
        float[] fArr4 = new float[48];
        fArr4[0] = -1.0f;
        fArr4[1] = -1.0f;
        fArr4[2] = 0.0f;
        fArr4[3] = 1.0f;
        fArr4[4] = -1.0f;
        fArr4[5] = 0.0f;
        fArr4[6] = -1.0f;
        fArr4[7] = 1.0f;
        fArr4[c10] = 0.0f;
        fArr4[9] = 1.0f;
        fArr4[10] = 1.0f;
        fArr4[11] = 0.0f;
        this.q = j(size, i11, false);
        this.r = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
            float f10 = i10 * 0.5f;
            float f11 = f10 + 2.0f;
            for (int i13 = 0; i13 < i10; i13++) {
                float f12 = (i13 + 0.5f) - f10;
                int i14 = 0;
                while (i14 < i10) {
                    float f13 = (i14 + 0.5f) - f10;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f11 + 0.5f) - ((float) Math.sqrt((f12 * f12) + (f13 * f13))))) * 255.0f));
                    i14++;
                    f11 = f11;
                }
            }
            allocateDirect.position(0);
            GLES20.glPixelStorei(3317, 1);
            int i15 = this.a;
            GLES20.glTexImage2D(3553, 0, 6406, i15, i15, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i16 = this.a;
            synchronized (a0.class) {
                try {
                    zVar = i16 == 360 ? D : i16 == 480 ? E : null;
                    if (zVar != null) {
                        fArr2 = fArr3;
                        f7 = 1.0f;
                    } else {
                        float f14 = i16;
                        int round = Math.round((372.0f * f14) / 1536.0f);
                        int round2 = Math.round(0.2f * f14);
                        int round3 = round2 - (Math.round((f14 * 28.0f) / 1536.0f) * 2);
                        f7 = 1.0f;
                        int i17 = round3 * 4;
                        int max = Math.max(round3 * 8, round);
                        int i18 = i17 + round;
                        RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                        if (b10 == null) {
                            throw new IllegalStateException("Unable to load watermark animation");
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(round2, round2, Bitmap.Config.ARGB_8888);
                        Bitmap createBitmap2 = Bitmap.createBitmap(max, i18, Bitmap.Config.ALPHA_8);
                        Canvas canvas = new Canvas(createBitmap2);
                        fArr2 = fArr3;
                        int i19 = 0;
                        while (i19 < 27) {
                            int i20 = i19;
                            b10.c(i20 * 2, createBitmap, true);
                            canvas.drawBitmap(createBitmap, (round3 * (i19 % 8)) - r10, ((i19 / 8) * round3) - r10, (Paint) null);
                            i19 = i20 + 1;
                            b10 = b10;
                        }
                        RLottieNative rLottieNative = b10;
                        Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                        if (bitmapFromRaw != null) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round, round, true);
                            Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                            bitmap = createBitmap;
                            canvas.drawBitmap(extractAlpha, 0.0f, i17, (Paint) null);
                            extractAlpha.recycle();
                            createScaledBitmap.recycle();
                            bitmapFromRaw.recycle();
                        } else {
                            bitmap = createBitmap;
                        }
                        if (createBitmap2.getRowBytes() != max) {
                            createBitmap2.recycle();
                            bitmap.recycle();
                            rLottieNative.d();
                            throw new IllegalStateException("Unexpected watermark atlas stride");
                        }
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i18);
                        createBitmap2.copyPixelsToBuffer(allocateDirect2);
                        allocateDirect2.position(0);
                        z zVar2 = new z(max, i18, round, round3, i17, allocateDirect2);
                        createBitmap2.recycle();
                        bitmap.recycle();
                        rLottieNative.d();
                        if (i16 == 360) {
                            D = zVar2;
                        } else if (i16 == 480) {
                            E = zVar2;
                        }
                        zVar = zVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i21 = 0;
            while (i21 < 27) {
                int i22 = i21 % 8;
                int i23 = i21 / 8;
                int i24 = i21 * 24;
                float[] fArr5 = fArr2;
                s(fArr5, i24 + 8, 0.0f, zVar.e / zVar.b, zVar.c / zVar.a, 1.0f);
                int i25 = i24 + 20;
                int i26 = zVar.d;
                float f15 = zVar.a;
                float f16 = zVar.b;
                s(fArr5, i25, (i26 * i22) / f15, (i26 * i23) / f16, ((i22 + 1) * i26) / f15, ((i23 + 1) * i26) / f16);
                i21++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f17 = (zVar.c / this.a) * 2.0f;
            t(fArr4, 12, f7 - f17, 1.0f, f17 - 1.0f);
            float e = a4.a.e(zVar.d, this.a, 2.0f, -1.0f);
            t(fArr4, 30, -1.0f, e, e);
            ByteBuffer duplicate = zVar.f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, zVar.a, zVar.b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(8, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i10, i10);
        k(5, 512, 512);
        k(6, i10, i10);
        int i27 = this.b;
        k(7, i27, i27);
        int i28 = this.b;
        k(9, i28, i28);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.s;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z10) {
            b(0, 0);
            b(1, 1);
            i12 = 6;
            b(6, 8);
        } else {
            i12 = 6;
        }
        b(2, 4);
        b(3, 5);
        b(4, i12);
        b(5, 7);
        b(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.o = i(fArr4);
        this.p = i(fArr);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(v7.j.g("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer i10 = ok.i(ByteBuffer.allocateDirect(fArr.length * 4));
        i10.put(fArr).position(0);
        return i10;
    }

    public static FloatBuffer j(Size size, int i10, boolean z10) {
        int min = Math.min(i10, Math.min(size.getWidth(), size.getHeight()));
        int height = z10 ? size.getHeight() : size.getWidth();
        int width = z10 ? size.getWidth() : size.getHeight();
        float f7 = min;
        float f10 = f7 / (height * 2.0f);
        float f11 = f7 / (width * 2.0f);
        float f12 = 0.5f - f10;
        float f13 = 0.5f - f11;
        float f14 = f10 + 0.5f;
        float f15 = f11 + 0.5f;
        return i(new float[]{f12, f13, f14, f13, f12, f15, f14, f15});
    }

    public static String l(float f7, int i10) {
        double d;
        int i11 = -i10;
        double d10 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i11 > i10) {
                break;
            }
            double d11 = f7;
            d10 += Math.exp((-(i11 * i11)) / ((2.0d * d11) * d11));
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(4096);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb2.append(Float.toString((float) (1.0d / d10)));
        sb2.append(";\n");
        int i12 = 1;
        while (i12 <= i10) {
            double d12 = f7;
            double d13 = d12 * d * d12;
            float exp = (float) (Math.exp((-(i12 * i12)) / d13) / d10);
            int i13 = i12 + 1;
            float exp2 = i13 <= i10 ? (float) (Math.exp((-(i13 * i13)) / d13) / d10) : 0.0f;
            float f10 = exp + exp2;
            float y3 = exp2 == 0.0f ? i12 : e2.y(i13, exp2, i12 * exp, f10);
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(y3));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(y3));
            sb2.append(").rgb) * ");
            sb2.append(Float.toString(f10));
            sb2.append(";\n");
            i12 += 2;
            d = 2.0d;
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void s(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f7;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f7;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = f11;
        fArr[i10 + 9] = f12;
        fArr[i10 + 10] = f11;
        fArr[i10 + 11] = f10;
    }

    public static void t(float[] fArr, int i10, float f7, float f10, float f11) {
        u(fArr, i10, f7, -1.0f);
        u(fArr, i10 + 3, f10, -1.0f);
        u(fArr, i10 + 6, f7, f11);
        u(fArr, i10 + 9, f7, f11);
        u(fArr, i10 + 12, f10, -1.0f);
        u(fArr, i10 + 15, f10, f11);
    }

    public static void u(float[] fArr, int i10, float f7, float f10) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f10;
        fArr[i10 + 2] = 0.0f;
    }

    public final void b(int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        } else {
            throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
        }
    }

    public final void c(u uVar, float[] fArr) {
        GLES20.glUseProgram(uVar.a);
        this.o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        FloatBuffer floatBuffer = Math.abs(fArr[1]) > Math.abs(fArr[0]) ? this.r : this.q;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(uVar.d, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glUniformMatrix4fv(uVar.e, 1, false, fArr, 0);
    }

    public final void e(w wVar, int i10, int i11) {
        GLES20.glUseProgram(wVar.a);
        this.o.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        this.p.position(i10);
        GLES20.glVertexAttribPointer(wVar.d, 2, 5126, false, 8, (Buffer) this.p);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.t[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        GLES20.glDisable(3042);
        int[] iArr = this.t;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        char c10 = z10 ? (char) 4 : (char) 2;
        int[] iArr2 = this.s;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i11 = this.a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.g, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.w;
            this.y = i12;
            if (this.e) {
                q(i10, fArr, i12, 0.0f);
                int i13 = this.y;
                n(0.020833334f, 0.0f, i13, 6);
                n(0.0f, 0.020833334f, 8, i13);
            }
            this.C = -1.0f;
            this.B = true;
            return;
        }
        GLES20.glBindFramebuffer(36160, iArr2[3]);
        GLES20.glViewport(0, 0, 512, 512);
        e(this.h, 0, 0);
        f(0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, iArr[5]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glTexParameteri(3553, 10241, 9987);
        this.x = this.v;
        this.y = this.w;
        this.B = false;
        this.C = -1.0f;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.t[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i10, int i11, int i12) {
        h(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void m(int i10, float[] fArr, long j3, int i11, int i12) {
        int i13;
        float f7;
        GLES20.glDisable(3042);
        if (this.e) {
            int i14 = this.w;
            if (this.A) {
                long j10 = this.z;
                if (j10 != 0) {
                    long j11 = j3 - j10;
                    if (j11 > 0 && j11 <= 100000000) {
                        f7 = (float) Math.exp((-j11) / 2.8E8d);
                        i13 = i10;
                        q(i13, fArr, i14, f7);
                        int i15 = this.w;
                        n(0.020833334f, 0.0f, i15, 6);
                        n(0.0f, 0.020833334f, 8, i15);
                        int i16 = this.v;
                        int i17 = this.w;
                        this.v = i17;
                        this.w = i16;
                        this.A = true;
                        this.z = j3;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i11, i12);
                        c(this.j, fArr);
                        d(i13);
                        f(1, i17);
                        f(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i13 = i10;
            f7 = 0.0f;
            q(i13, fArr, i14, f7);
            int i152 = this.w;
            n(0.020833334f, 0.0f, i152, 6);
            n(0.0f, 0.020833334f, 8, i152);
            int i162 = this.v;
            int i172 = this.w;
            this.v = i172;
            this.w = i162;
            this.A = true;
            this.z = j3;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.j, fArr);
            d(i13);
            f(1, i172);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.g, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        u uVar = this.l;
        e(uVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(uVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f7, float f10, float f11, int i10, int i11) {
        boolean z10 = this.B;
        int i12 = this.a;
        if (z10) {
            float min = Math.min(f7, 9.0f);
            if (Math.abs(this.C - min) >= 0.2f) {
                float f12 = min / (i12 * 9);
                int i13 = this.b;
                p(6, f12, 7, i13, 0.0f, i13);
                int i14 = this.b;
                p(9, 0.0f, 5, i14, f12, i14);
                this.C = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        y yVar = this.k;
        e(yVar, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.e) {
            f(4, this.x);
            f(5, this.y);
            f(6, 2);
        }
        float max = (Math.max(0.0f, f7) * 0.625f) / i12;
        GLES20.glUniform2f(yVar.e, max, max);
        int i15 = yVar.f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f7) * 0.625f) * 512.0f) / r10) / Math.log(2.0d))) + 1.25f;
        GLES20.glUniform1f(i15, this.f ? Math.max(0.0f, min2) : Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i12) / Math.log(2.0d)))));
        GLES20.glUniform1f(yVar.g, Math.max(0.0f, Math.min(1.0f, f7 / 2.0f)));
        GLES20.glUniform1f(yVar.h, f10);
        GLES20.glUniform1f(yVar.i, f11);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.s[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        u uVar = this.m;
        e(uVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(uVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i10, float[] fArr, int i11, float f7) {
        GLES20.glBindFramebuffer(36160, this.s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        x xVar = this.i;
        c(xVar, fArr);
        d(i10);
        f(1, this.v);
        boolean z10 = Math.abs(fArr[1]) > Math.abs(fArr[0]);
        int min = Math.min(this.d, Math.min(this.c.getWidth(), this.c.getHeight()));
        Size size = this.c;
        float f10 = min;
        float height = ((f10 / (z10 ? size.getHeight() : size.getWidth())) / 48.0f) * 0.45f;
        float width = ((f10 / (z10 ? this.c.getWidth() : this.c.getHeight())) / 48.0f) * 0.45f;
        GLES20.glUniform2f(xVar.f, fArr[0] * height, fArr[1] * height);
        GLES20.glUniform2f(xVar.g, fArr[4] * width, fArr[5] * width);
        GLES20.glUniform1f(xVar.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        w wVar;
        if (!this.e || (wVar = this.n) == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int i10 = this.u;
        this.u = i10 + 1;
        e(wVar, ((i10 % 27) * 24) + 8, 12);
        f(0, 3);
        GLES20.glDrawArrays(4, 0, 12);
        GLES20.glDisable(3042);
    }

    public final void v(Size size, int i10) {
        this.c = size;
        this.d = i10;
        this.q = j(size, i10, false);
        this.r = j(size, i10, true);
        this.A = false;
        this.z = 0L;
    }
}
