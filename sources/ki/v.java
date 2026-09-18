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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class v {
    public final int a;
    public Size b;
    public int c;
    public final q f;
    public final u g;
    public final s h;
    public final r i;
    public final FloatBuffer j;
    public final FloatBuffer k;
    public FloatBuffer l;
    public FloatBuffer m;
    public final int[] o;
    public int p;
    public long u;
    public boolean v;
    public boolean w;
    public final int[] n = new int[7];
    public int q = 0;
    public int r = 1;
    public int s = 0;
    public int t = 1;
    public float x = -1.0f;
    public float y = -1.0f;
    public final p d = new p("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    public final t e = new t();

    public v(int i10, Size size, int i11) {
        int[] iArr = new int[9];
        this.o = iArr;
        this.a = i10;
        this.b = size;
        this.c = i11;
        q qVar = new q("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n");
        int glGetUniformLocation = GLES20.glGetUniformLocation(qVar.a, "bTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(qVar.a, "mTexture");
        GLES20.glUseProgram(qVar.a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
        GLES20.glUniform1i(glGetUniformLocation2, 2);
        this.f = qVar;
        this.g = new u();
        this.h = new s();
        this.i = new r(AndroidUtilities.readRes(R.raw.round_blur_vert), AndroidUtilities.readRes(R.raw.round_blur_stage_3_frag));
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
        this.l = i(size, i11, false);
        this.m = i(size, i11, true);
        GLES20.glGenTextures(9, iArr, 0);
        j(0, 48, 48);
        j(1, 48, 48);
        g(2);
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
                fArr2 = fArr2;
            }
        }
        float[] fArr3 = fArr2;
        allocateDirect.position(0);
        GLES20.glPixelStorei(3317, 1);
        int i14 = this.a;
        GLES20.glTexImage2D(3553, 0, 6406, i14, i14, 0, 6406, 5121, allocateDirect);
        GLES20.glPixelStorei(3317, 4);
        g(3);
        float f13 = this.a;
        int round = Math.round((372.0f * f13) / 1536.0f);
        int round2 = Math.round(0.2f * f13);
        int round3 = Math.round((28.0f * f13) / 1536.0f);
        int i15 = round2 - (round3 * 2);
        int i16 = i15 * 4;
        int max = Math.max(i15 * 8, round);
        int i17 = i16 + round;
        RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
        if (b10 == null) {
            throw new IllegalStateException("Unable to load watermark animation");
        }
        Bitmap createBitmap = Bitmap.createBitmap(round2, round2, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap2 = Bitmap.createBitmap(max, i17, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap2);
        int i18 = 0;
        while (i18 < 27) {
            int i19 = i18 * 24;
            int i20 = round3;
            Bitmap bitmap = createBitmap2;
            float f14 = i17;
            float f15 = i16 / f14;
            float f16 = max;
            int i21 = i18;
            q(fArr, i19 + 8, 0.0f, f15, round / f16, 1.0f);
            q(fArr, i19 + 20, (i15 * (i18 % 8)) / f16, (i15 * (i18 / 8)) / f14, ((r26 + 1) * i15) / f16, ((r27 + 1) * i15) / f14);
            b10.c(i21 * 2, createBitmap, true);
            canvas.drawBitmap(createBitmap, r13 - i20, r15 - i20, (Paint) null);
            i16 = i16;
            createBitmap2 = bitmap;
            i18 = i21 + 1;
            i17 = i17;
            max = max;
            round3 = i20;
        }
        int i22 = i16;
        Bitmap bitmap2 = createBitmap2;
        Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
        if (bitmapFromRaw != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round, round, true);
            Bitmap extractAlpha = createScaledBitmap.extractAlpha();
            canvas.drawBitmap(extractAlpha, 0.0f, i22, (Paint) null);
            extractAlpha.recycle();
            createScaledBitmap.recycle();
            bitmapFromRaw.recycle();
        }
        float f17 = (round / f13) * 2.0f;
        r(fArr3, 12, 1.0f - f17, 1.0f, f17 - 1.0f);
        float e = a4.a.e(i15, f13, 2.0f, -1.0f);
        r(fArr3, 30, -1.0f, e, e);
        GLUtils.texImage2D(3553, 0, bitmap2, 0);
        bitmap2.recycle();
        createBitmap.recycle();
        b10.d();
        j(4, i10, i10);
        j(5, i10, i10);
        j(6, i10, i10);
        j(7, i10, i10);
        j(8, i10, i10);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.n;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        b(0, 0);
        b(1, 1);
        b(2, 4);
        b(3, 5);
        b(4, 6);
        b(5, 7);
        b(6, 8);
        for (int i23 : this.n) {
            GLES20.glBindFramebuffer(36160, i23);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.j = h(fArr3);
        this.k = h(fArr);
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
        throw new IllegalStateException(t8.b.i("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static FloatBuffer h(float[] fArr) {
        FloatBuffer h = wh.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        return h;
    }

    public static FloatBuffer i(Size size, int i10, boolean z10) {
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
        return h(new float[]{f12, f13, f14, f13, f12, f15, f14, f15});
    }

    public static void q(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
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

    public static void r(float[] fArr, int i10, float f7, float f10, float f11) {
        s(fArr, i10, f7, -1.0f);
        s(fArr, i10 + 3, f10, -1.0f);
        s(fArr, i10 + 6, f7, f11);
        s(fArr, i10 + 9, f7, f11);
        s(fArr, i10 + 12, f10, -1.0f);
        s(fArr, i10 + 15, f10, f11);
    }

    public static void s(float[] fArr, int i10, float f7, float f10) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f10;
        fArr[i10 + 2] = 0.0f;
    }

    public final void b(int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.n[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.o[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(p pVar, float[] fArr) {
        GLES20.glUseProgram(pVar.a);
        this.j.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.j);
        FloatBuffer floatBuffer = Math.abs(fArr[1]) > Math.abs(fArr[0]) ? this.m : this.l;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(pVar.d, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glUniformMatrix4fv(pVar.e, 1, false, fArr, 0);
    }

    public final void d(r rVar, int i10, int i11) {
        GLES20.glUseProgram(rVar.a);
        this.j.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.j);
        this.k.position(i10);
        GLES20.glVertexAttribPointer(rVar.d, 2, 5126, false, 8, (Buffer) this.k);
    }

    public final void e(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.o[i11]);
    }

    public final void f(float[] fArr, int i10, boolean z10) {
        GLES20.glDisable(3042);
        if (z10 && this.w) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.n[z10 ? (char) 3 : (char) 2]);
        int i11 = this.a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.d, fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.r;
            this.t = i12;
            o(i10, fArr, i12, 0.0f);
            m(1.0f, true);
            this.w = true;
            return;
        }
        this.s = this.q;
        this.t = this.r;
        this.w = false;
        this.x = -1.0f;
        this.y = -1.0f;
    }

    public final void g(int i10) {
        GLES20.glBindTexture(3553, this.o[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void j(int i10, int i11, int i12) {
        g(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void k(int i10, float[] fArr, long j3, int i11, int i12) {
        GLES20.glDisable(3042);
        int i13 = this.r;
        float f7 = 0.0f;
        if (this.v) {
            long j10 = this.u;
            if (j10 != 0) {
                long j11 = j3 - j10;
                if (j11 > 0 && j11 <= 100000000) {
                    f7 = (float) Math.exp((-j11) / 1.6E8d);
                }
            }
        }
        o(i10, fArr, i13, f7);
        int i14 = this.q;
        int i15 = this.r;
        this.q = i15;
        this.r = i14;
        this.v = true;
        this.u = j3;
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i11, i12);
        c(this.f, fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        e(1, i15);
        e(2, 2);
        GLES20.glDrawArrays(5, 0, 4);
        p();
    }

    public final void l(float f7, float f10, float f11, int i10, int i11) {
        if (f7 > 0.0f) {
            m(f7, false);
        }
        if (f10 > 0.0f && this.w) {
            m(f10, true);
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        u uVar = this.g;
        d(uVar, 0, 0);
        e(0, 4);
        e(1, 5);
        e(2, 6);
        e(3, 7);
        e(4, this.s);
        e(5, this.t);
        e(6, 2);
        GLES20.glUniform1f(uVar.e, f7);
        GLES20.glUniform1f(uVar.f, f10);
        GLES20.glUniform1f(uVar.g, f11);
        GLES20.glDrawArrays(5, 0, 4);
        p();
    }

    public final void m(float f7, boolean z10) {
        if (Math.abs((z10 ? this.y : this.x) - f7) < 0.01f) {
            return;
        }
        int i10 = z10 ? 5 : 4;
        float f10 = (28.0f * f7) / this.a;
        n(f10, 0.0f, z10 ? 5 : 4, 6);
        n(0.0f, f10, 8, i10);
        if (z10) {
            this.y = f7;
        } else {
            this.x = f7;
        }
    }

    public final void n(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.n[i11]);
        int i12 = this.a;
        GLES20.glViewport(0, 0, i12, i12);
        s sVar = this.h;
        d(sVar, 0, 0);
        e(0, i10);
        GLES20.glUniform2f(sVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(int i10, float[] fArr, int i11, float f7) {
        GLES20.glBindFramebuffer(36160, this.n[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        t tVar = this.e;
        c(tVar, fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        e(1, this.q);
        boolean z10 = Math.abs(fArr[1]) > Math.abs(fArr[0]);
        int min = Math.min(this.c, Math.min(this.b.getWidth(), this.b.getHeight()));
        Size size = this.b;
        float f10 = min;
        float height = ((f10 / (z10 ? size.getHeight() : size.getWidth())) / 48.0f) * 0.45f;
        float width = ((f10 / (z10 ? this.b.getWidth() : this.b.getHeight())) / 48.0f) * 0.45f;
        GLES20.glUniform2f(tVar.f, fArr[0] * height, fArr[1] * height);
        GLES20.glUniform2f(tVar.g, fArr[4] * width, fArr[5] * width);
        GLES20.glUniform1f(tVar.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void p() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int i10 = this.p;
        this.p = i10 + 1;
        d(this.i, ((i10 % 27) * 24) + 8, 12);
        e(0, 3);
        GLES20.glDrawArrays(4, 0, 12);
        GLES20.glDisable(3042);
    }

    public final void t(Size size, int i10) {
        this.b = size;
        this.c = i10;
        this.l = i(size, i10, false);
        this.m = i(size, i10, true);
        this.v = false;
        this.u = 0L;
    }
}
