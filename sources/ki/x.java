package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Size;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class x {
    public static final String A;
    public final int a;
    public Size b;
    public int c;
    public final boolean d;
    public final t g;
    public final w h;
    public final s i;
    public final u j;
    public final FloatBuffer k;
    public final FloatBuffer l;
    public FloatBuffer m;
    public FloatBuffer n;
    public final int[] p;
    public int q;
    public long v;
    public boolean w;
    public boolean x;
    public final int[] o = new int[8];
    public int r = 0;
    public int s = 1;
    public int t = 0;
    public int u = 1;
    public float y = -1.0f;
    public float z = -1.0f;
    public final r e = new r("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    public final v f = new v();

    static {
        double d = 0.0d;
        for (int i10 = -16; i10 <= 16; i10++) {
            double d10 = 7.0f;
            d += Math.exp((-(i10 * i10)) / ((2.0d * d10) * d10));
        }
        StringBuilder sb2 = new StringBuilder(4096);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = vec3(0.0);\n");
        for (int i11 = -16; i11 <= 16; i11++) {
            double d11 = 7.0f;
            float exp = (float) (Math.exp((-(i11 * i11)) / ((d11 * 2.0d) * d11)) / d);
            sb2.append("    color += texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(i11));
            sb2.append(").rgb * ");
            sb2.append(Float.toString(exp));
            sb2.append(";\n");
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        A = sb2.toString();
    }

    public x(int i10, Size size, int i11, boolean z10) {
        Bitmap bitmap;
        int[] iArr = new int[10];
        this.p = iArr;
        this.a = i10;
        this.b = size;
        this.c = i11;
        this.d = z10;
        t tVar = new t("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n");
        int glGetUniformLocation = GLES20.glGetUniformLocation(tVar.a, "bTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(tVar.a, "mTexture");
        GLES20.glUseProgram(tVar.a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
        GLES20.glUniform1i(glGetUniformLocation2, 2);
        this.g = tVar;
        this.h = new w();
        this.i = new s();
        this.j = z10 ? new u(AndroidUtilities.readRes(R.raw.round_blur_vert), AndroidUtilities.readRes(R.raw.round_blur_stage_3_frag)) : null;
        float[] fArr = new float[656];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 1.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 1.0f;
        fArr[7] = 1.0f;
        float[] fArr2 = new float[48];
        fArr2[0] = -1.0f;
        fArr2[1] = -1.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 1.0f;
        fArr2[4] = -1.0f;
        fArr2[5] = 0.0f;
        fArr2[6] = -1.0f;
        fArr2[7] = 1.0f;
        fArr2[8] = 0.0f;
        fArr2[9] = 1.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        this.m = j(size, i11, false);
        this.n = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        k(0, 48, 48);
        k(1, 48, 48);
        h(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
        float f7 = i10 * 0.5f;
        float f10 = f7 + 2.0f;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = (i12 + 0.5f) - f7;
            int i13 = 0;
            while (i13 < i10) {
                float f12 = (i13 + 0.5f) - f7;
                allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f10 + 0.5f) - ((float) Math.sqrt((f11 * f11) + (f12 * f12))))) * 255.0f));
                i13++;
                f10 = f10;
            }
        }
        allocateDirect.position(0);
        GLES20.glPixelStorei(3317, 1);
        int i14 = this.a;
        GLES20.glTexImage2D(3553, 0, 6406, i14, i14, 0, 6406, 5121, allocateDirect);
        GLES20.glPixelStorei(3317, 4);
        if (z10) {
            h(3);
            float f13 = this.a;
            int round = Math.round((372.0f * f13) / 1536.0f);
            int round2 = Math.round(0.2f * f13);
            int round3 = round2 - (Math.round((28.0f * f13) / 1536.0f) * 2);
            int i15 = round3 * 4;
            int max = Math.max(round3 * 8, round);
            int i16 = i15 + round;
            RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
            if (b10 == null) {
                throw new IllegalStateException("Unable to load watermark animation");
            }
            Bitmap createBitmap = Bitmap.createBitmap(round2, round2, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap2 = Bitmap.createBitmap(max, i16, Bitmap.Config.ALPHA_8);
            Canvas canvas = new Canvas(createBitmap2);
            int i17 = 0;
            while (i17 < 27) {
                int i18 = i17 * 24;
                RLottieNative rLottieNative = b10;
                float f14 = i16;
                float f15 = i15 / f14;
                float f16 = max;
                r(fArr, i18 + 8, 0.0f, f15, round / f16, 1.0f);
                int i19 = i17;
                r(fArr, i18 + 20, (round3 * (i17 % 8)) / f16, (round3 * (i17 / 8)) / f14, ((r6 + 1) * round3) / f16, ((r27 + 1) * round3) / f14);
                rLottieNative.c(i19 * 2, createBitmap, true);
                canvas.drawBitmap(createBitmap, r15 - r6, r10 - r6, (Paint) null);
                i17 = i19 + 1;
                b10 = rLottieNative;
                i16 = i16;
                max = max;
            }
            RLottieNative rLottieNative2 = b10;
            Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
            if (bitmapFromRaw != null) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round, round, true);
                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                bitmap = createBitmap;
                canvas.drawBitmap(extractAlpha, 0.0f, i15, (Paint) null);
                extractAlpha.recycle();
                createScaledBitmap.recycle();
                bitmapFromRaw.recycle();
            } else {
                bitmap = createBitmap;
            }
            float f17 = (round / f13) * 2.0f;
            s(fArr2, 12, 1.0f - f17, 1.0f, f17 - 1.0f);
            float e = a4.a.e(round3, f13, 2.0f, -1.0f);
            s(fArr2, 30, -1.0f, e, e);
            GLUtils.texImage2D(3553, 0, createBitmap2, 0);
            createBitmap2.recycle();
            bitmap.recycle();
            rLottieNative2.d();
        }
        k(4, i10, i10);
        k(5, i10, i10);
        k(6, i10, i10);
        k(7, i10, i10);
        k(8, i10, i10);
        k(9, 48, 48);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.o;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        b(0, 0);
        b(1, 1);
        b(2, 4);
        b(3, 5);
        b(4, 6);
        b(5, 7);
        b(6, 8);
        b(7, 9);
        for (int i20 : this.o) {
            GLES20.glBindFramebuffer(36160, i20);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.k = i(fArr2);
        this.l = i(fArr);
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
        throw new IllegalStateException(v7.j0.g("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer i10 = rk.i(ByteBuffer.allocateDirect(fArr.length * 4));
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

    public static void r(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
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

    public static void s(float[] fArr, int i10, float f7, float f10, float f11) {
        t(fArr, i10, f7, -1.0f);
        t(fArr, i10 + 3, f10, -1.0f);
        t(fArr, i10 + 6, f7, f11);
        t(fArr, i10 + 9, f7, f11);
        t(fArr, i10 + 12, f10, -1.0f);
        t(fArr, i10 + 15, f10, f11);
    }

    public static void t(float[] fArr, int i10, float f7, float f10) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f10;
        fArr[i10 + 2] = 0.0f;
    }

    public final void b(int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.o[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.p[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(r rVar, float[] fArr) {
        GLES20.glUseProgram(rVar.a);
        this.k.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.k);
        FloatBuffer floatBuffer = Math.abs(fArr[1]) > Math.abs(fArr[0]) ? this.n : this.m;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(rVar.d, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glUniformMatrix4fv(rVar.e, 1, false, fArr, 0);
    }

    public final void e(u uVar, int i10, int i11) {
        GLES20.glUseProgram(uVar.a);
        this.k.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.k);
        this.l.position(i10);
        GLES20.glVertexAttribPointer(uVar.d, 2, 5126, false, 8, (Buffer) this.l);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.p[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        x xVar;
        GLES20.glDisable(3042);
        if (z10 && this.x) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.o[z10 ? (char) 3 : (char) 2]);
        int i11 = this.a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.e, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (!z10) {
            this.t = this.r;
            this.u = this.s;
            this.x = false;
            this.y = -1.0f;
            this.z = -1.0f;
            return;
        }
        int i12 = this.s;
        this.u = i12;
        if (this.d) {
            p(i10, fArr, i12, 0.0f);
            int i13 = this.u;
            xVar = this;
            xVar.m(i13, 0.0052083335f, 7, 48, 0.0f, 48);
            xVar.m(9, 0.0f, i13, 48, 0.0052083335f, 48);
        } else {
            xVar = this;
        }
        o(1.0f, true);
        xVar.x = true;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.p[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i10, int i11, int i12) {
        h(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void l(int i10, float[] fArr, long j3, int i11, int i12) {
        x xVar = this;
        GLES20.glDisable(3042);
        if (xVar.d) {
            int i13 = xVar.s;
            float f7 = 0.0f;
            if (xVar.w) {
                long j10 = xVar.v;
                if (j10 != 0) {
                    long j11 = j3 - j10;
                    if (j11 > 0 && j11 <= 100000000) {
                        f7 = (float) Math.exp((-j11) / 2.8E8d);
                    }
                }
            }
            xVar.p(i10, fArr, i13, f7);
            int i14 = xVar.s;
            xVar.m(i14, 0.0052083335f, 7, 48, 0.0f, 48);
            xVar = this;
            xVar.m(9, 0.0f, i14, 48, 0.0052083335f, 48);
            int i15 = xVar.r;
            int i16 = xVar.s;
            xVar.r = i16;
            xVar.s = i15;
            xVar.w = true;
            xVar.v = j3;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            xVar.c(xVar.g, fArr);
            d(i10);
            xVar.f(1, i16);
            xVar.f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            xVar.c(xVar.e, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        xVar.q();
    }

    public final void m(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.o[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        s sVar = this.i;
        e(sVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(sVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void n(float f7, float f10, float f11, int i10, int i11) {
        if (f7 > 0.0f) {
            o(f7, false);
        }
        if (f10 > 0.0f && this.x) {
            o(f10, true);
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        w wVar = this.h;
        e(wVar, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        f(4, this.t);
        f(5, this.u);
        f(6, 2);
        GLES20.glUniform1f(wVar.e, f7);
        GLES20.glUniform1f(wVar.f, f10);
        GLES20.glUniform1f(wVar.g, f11);
        GLES20.glUniform1f(wVar.h, this.d ? 1.0f : 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        q();
    }

    public final void o(float f7, boolean z10) {
        if (Math.abs((z10 ? this.z : this.y) - f7) < 0.01f) {
            return;
        }
        int i10 = z10 ? 5 : 4;
        int i11 = z10 ? 5 : 4;
        int i12 = this.a;
        float f10 = (28.0f * f7) / (i12 * 16);
        m(i11, f10, 6, i12, 0.0f, i12);
        int i13 = this.a;
        m(8, 0.0f, i10, i13, f10, i13);
        if (z10) {
            this.z = f7;
        } else {
            this.y = f7;
        }
    }

    public final void p(int i10, float[] fArr, int i11, float f7) {
        GLES20.glBindFramebuffer(36160, this.o[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        v vVar = this.f;
        c(vVar, fArr);
        d(i10);
        f(1, this.r);
        boolean z10 = Math.abs(fArr[1]) > Math.abs(fArr[0]);
        int min = Math.min(this.c, Math.min(this.b.getWidth(), this.b.getHeight()));
        Size size = this.b;
        float f10 = min;
        float height = ((f10 / (z10 ? size.getHeight() : size.getWidth())) / 48.0f) * 0.45f;
        float width = ((f10 / (z10 ? this.b.getWidth() : this.b.getHeight())) / 48.0f) * 0.45f;
        GLES20.glUniform2f(vVar.f, fArr[0] * height, fArr[1] * height);
        GLES20.glUniform2f(vVar.g, fArr[4] * width, fArr[5] * width);
        GLES20.glUniform1f(vVar.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q() {
        u uVar;
        if (!this.d || (uVar = this.j) == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int i10 = this.q;
        this.q = i10 + 1;
        e(uVar, ((i10 % 27) * 24) + 8, 12);
        f(0, 3);
        GLES20.glDrawArrays(4, 0, 12);
        GLES20.glDisable(3042);
    }

    public final void u(Size size, int i10) {
        this.b = size;
        this.c = i10;
        this.m = j(size, i10, false);
        this.n = j(size, i10, true);
        this.w = false;
        this.v = 0L;
    }
}
