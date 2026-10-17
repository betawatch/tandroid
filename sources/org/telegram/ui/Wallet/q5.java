package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.util.LruCache;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.wh;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class q5 {
    public static final LruCache B = new LruCache(2);
    public p5 a;
    public int b;
    public float[] c;
    public final Context f;
    public final int h;
    public final p5 i;
    public final p5 j;
    public boolean m;
    public final p5 n;
    public final p5 o;
    public final p5 p;
    public final mi.s q;
    public final int r;
    public final mi.s s;
    public final mi.s t;
    public int u;
    public final int v;
    public final x5 w;
    public final p5 x;
    public final float z;
    public float d = 1.0f;
    public final int[] e = new int[4];
    public float[] g = k7.f(new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f});
    public final int[] k = new int[4];
    public final float[] l = new float[4];
    public final float[] y = new float[2];
    public final int[] A = new int[4];

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0293  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q5(Context context, int i10, int i11) {
        int[] iArr;
        int i12;
        int i13;
        char c10;
        int i14;
        this.f = context.getApplicationContext();
        this.z = i11;
        String i15 = i(context, "shaders/wallet_card_vertex.glsl");
        String i16 = i(context, "shaders/wallet_card_fragment.glsl");
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[4];
        int i17 = 0;
        GLES20.glGetIntegerv(36006, iArr4, 0);
        GLES20.glGetIntegerv(2978, iArr5, 0);
        boolean glIsEnabled = GLES20.glIsEnabled(2929);
        GLES20.glGenTextures(1, iArr2, 0);
        int i18 = 3553;
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES30.glTexStorage2D(3553, 1, 34842, 1024, 2);
        GLES20.glGenFramebuffers(1, iArr3, 0);
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        try {
            try {
                if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                    try {
                        GLES20.glDeleteTextures(1, iArr2, 0);
                        GLES20.glBindFramebuffer(36160, iArr4[0]);
                        int i19 = iArr5[0];
                        int i20 = iArr5[1];
                        int i21 = iArr5[2];
                        int i22 = iArr5[3];
                        GLES20.glViewport(i19, i20, i21, i22);
                        if (glIsEnabled) {
                            GLES20.glEnable(2929);
                        }
                        GLES20.glBindTexture(3553, 0);
                        GLES20.glDeleteFramebuffers(1, iArr3, 0);
                        iArr5 = i22;
                    } catch (RuntimeException e) {
                        e = e;
                        iArr = iArr5;
                        i13 = 3553;
                        i14 = 1;
                        c10 = 3;
                        i12 = 0;
                        try {
                            GLES20.glDeleteTextures(i14, iArr2, i12);
                            FileLog.e(e);
                            GLES20.glBindFramebuffer(36160, iArr4[i12]);
                            GLES20.glViewport(iArr[i12], iArr[i14], iArr[2], iArr[c10]);
                            if (glIsEnabled) {
                                GLES20.glEnable(2929);
                            }
                            GLES20.glBindTexture(i13, i12);
                            GLES20.glDeleteFramebuffers(i14, iArr3, i12);
                            if (i17 != 0) {
                                GLES20.glDeleteProgram(i17);
                            }
                            i17 = i12;
                            this.h = i17;
                            if (i17 != 0) {
                            }
                            this.i = new p5(context, i15, i16, "body", r0.concat("#define WALLET_BODY_PASS\n"));
                            this.j = new p5(context, i15, i16, "engraving", r0.concat("#define WALLET_ENGRAVING_PASS\n"));
                            this.n = new p5(context, i15, i16, "qr", r0.concat("#define WALLET_QR_PASS\n"));
                            this.o = new p5(context, i15, i16, "edge", r0.concat("#define WALLET_EDGE_PASS\n"));
                            this.x = new p5(context, i15, i16, "flecks", r0.concat("#define WALLET_FLECKS_PASS\n"));
                            this.u = d(context, i10, i11);
                            this.v = e();
                            this.r = e();
                            p5 p5Var = new p5(context, i(context, "shaders/wallet_card_rim_vertex.glsl"), i(context, "shaders/wallet_card_rim_fragment.glsl"), "rim", "");
                            this.p = p5Var;
                            int i23 = p5Var.c;
                            GLES20.glUseProgram(i23);
                            GLES20.glUniform2f(GLES20.glGetUniformLocation(i23, "uRimStyle"), 1.3f, 1.7f);
                            this.q = new mi.s(context, "models/card_rim.binobj");
                            this.w = new x5();
                            this.s = new mi.s(context, "models/card_back.binobj");
                            this.t = new mi.s(context, "models/card_edge.binobj");
                        } catch (Throwable th2) {
                            th = th2;
                            GLES20.glBindFramebuffer(36160, iArr4[i12]);
                            GLES20.glViewport(iArr[i12], iArr[1], iArr[2], iArr[c10]);
                            if (glIsEnabled) {
                                GLES20.glEnable(2929);
                            }
                            GLES20.glBindTexture(i13, i12);
                            GLES20.glDeleteFramebuffers(1, iArr3, i12);
                            if (i17 != 0) {
                                GLES20.glDeleteProgram(i17);
                            }
                            throw th;
                        }
                    }
                } else {
                    try {
                        iArr = iArr5;
                        c10 = 3;
                        i12 = 0;
                        try {
                            i17 = w7.v7.b(context, "wallet-finish-lut", "#version 300 es\nvoid main(){vec2 p=vec2((gl_VertexID<<1)&2,gl_VertexID&2);gl_Position=vec4(p*2.0-1.0,0.0,1.0);}", p5.b(i16, "#define WALLET_FINISH_BAKE_PASS\n"), "aPosition", "aNormal");
                            try {
                                GLES20.glUseProgram(i17);
                                GLES20.glDisable(2929);
                                GLES20.glViewport(0, 0, 1024, 2);
                                GLES20.glDrawArrays(4, 0, 3);
                                int i24 = iArr2[0];
                                GLES20.glBindFramebuffer(36160, iArr4[0]);
                                int i25 = iArr[0];
                                int i26 = iArr[1];
                                int i27 = iArr[2];
                                i18 = iArr[3];
                                GLES20.glViewport(i25, i26, i27, i18);
                                if (glIsEnabled) {
                                    GLES20.glEnable(2929);
                                }
                                GLES20.glBindTexture(3553, 0);
                                iArr5 = 1;
                                GLES20.glDeleteFramebuffers(1, iArr3, 0);
                                if (i17 != 0) {
                                    GLES20.glDeleteProgram(i17);
                                }
                                i17 = i24;
                            } catch (RuntimeException e7) {
                                e = e7;
                                i13 = 3553;
                                i14 = 1;
                                GLES20.glDeleteTextures(i14, iArr2, i12);
                                FileLog.e(e);
                                GLES20.glBindFramebuffer(36160, iArr4[i12]);
                                GLES20.glViewport(iArr[i12], iArr[i14], iArr[2], iArr[c10]);
                                if (glIsEnabled) {
                                }
                                GLES20.glBindTexture(i13, i12);
                                GLES20.glDeleteFramebuffers(i14, iArr3, i12);
                                if (i17 != 0) {
                                }
                                i17 = i12;
                                this.h = i17;
                                if (i17 != 0) {
                                }
                                this.i = new p5(context, i15, i16, "body", r0.concat("#define WALLET_BODY_PASS\n"));
                                this.j = new p5(context, i15, i16, "engraving", r0.concat("#define WALLET_ENGRAVING_PASS\n"));
                                this.n = new p5(context, i15, i16, "qr", r0.concat("#define WALLET_QR_PASS\n"));
                                this.o = new p5(context, i15, i16, "edge", r0.concat("#define WALLET_EDGE_PASS\n"));
                                this.x = new p5(context, i15, i16, "flecks", r0.concat("#define WALLET_FLECKS_PASS\n"));
                                this.u = d(context, i10, i11);
                                this.v = e();
                                this.r = e();
                                p5 p5Var2 = new p5(context, i(context, "shaders/wallet_card_rim_vertex.glsl"), i(context, "shaders/wallet_card_rim_fragment.glsl"), "rim", "");
                                this.p = p5Var2;
                                int i232 = p5Var2.c;
                                GLES20.glUseProgram(i232);
                                GLES20.glUniform2f(GLES20.glGetUniformLocation(i232, "uRimStyle"), 1.3f, 1.7f);
                                this.q = new mi.s(context, "models/card_rim.binobj");
                                this.w = new x5();
                                this.s = new mi.s(context, "models/card_back.binobj");
                                this.t = new mi.s(context, "models/card_edge.binobj");
                            } catch (Throwable th3) {
                                th = th3;
                                i13 = 3553;
                                GLES20.glBindFramebuffer(36160, iArr4[i12]);
                                GLES20.glViewport(iArr[i12], iArr[1], iArr[2], iArr[c10]);
                                if (glIsEnabled) {
                                }
                                GLES20.glBindTexture(i13, i12);
                                GLES20.glDeleteFramebuffers(1, iArr3, i12);
                                if (i17 != 0) {
                                }
                                throw th;
                            }
                        } catch (RuntimeException e10) {
                            e = e10;
                            i13 = 3553;
                            i17 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            i13 = 3553;
                            i17 = 0;
                        }
                    } catch (RuntimeException e11) {
                        e = e11;
                        iArr = iArr5;
                        i12 = 0;
                        i13 = 3553;
                        c10 = 3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                iArr = iArr5;
                i12 = i17;
                i13 = i18;
                c10 = 3;
            }
        } catch (RuntimeException e12) {
            e = e12;
            iArr = iArr5;
            i12 = 0;
            i13 = 3553;
            c10 = 3;
        } catch (Throwable th6) {
            th = th6;
            iArr = iArr5;
            i12 = 0;
            i13 = 3553;
            c10 = 3;
        }
        this.h = i17;
        String str = i17 != 0 ? "#define WALLET_FINISH_LUT\n" : "";
        this.i = new p5(context, i15, i16, "body", str.concat("#define WALLET_BODY_PASS\n"));
        this.j = new p5(context, i15, i16, "engraving", str.concat("#define WALLET_ENGRAVING_PASS\n"));
        this.n = new p5(context, i15, i16, "qr", str.concat("#define WALLET_QR_PASS\n"));
        this.o = new p5(context, i15, i16, "edge", str.concat("#define WALLET_EDGE_PASS\n"));
        this.x = new p5(context, i15, i16, "flecks", str.concat("#define WALLET_FLECKS_PASS\n"));
        this.u = d(context, i10, i11);
        this.v = e();
        this.r = e();
        p5 p5Var22 = new p5(context, i(context, "shaders/wallet_card_rim_vertex.glsl"), i(context, "shaders/wallet_card_rim_fragment.glsl"), "rim", "");
        this.p = p5Var22;
        int i2322 = p5Var22.c;
        GLES20.glUseProgram(i2322);
        GLES20.glUniform2f(GLES20.glGetUniformLocation(i2322, "uRimStyle"), 1.3f, 1.7f);
        this.q = new mi.s(context, "models/card_rim.binobj");
        this.w = new x5();
        this.s = new mi.s(context, "models/card_back.binobj");
        this.t = new mi.s(context, "models/card_edge.binobj");
    }

    public static void a(float[] fArr, int i10) {
        FloatBuffer h = wh.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        GLES20.glBindBuffer(34962, i10);
        GLES20.glBufferData(34962, fArr.length * 4, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static Bitmap c(Context context, int i10, int i11) {
        int i12;
        int i13;
        Bitmap createBitmap = Bitmap.createBitmap(1024, 625, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 3.047619f;
        float f10 = 3.0487804f;
        canvas.scale(3.047619f, 3.0487804f);
        float f11 = 336.0f - i11;
        float f12 = f11 - 48.0f;
        Paint paint = new Paint(1);
        paint.setColor(-65536);
        float f13 = 74.0f;
        canvas.drawRoundRect(new RectF(f12, 74.0f, f11, 110.0f), 8.0f, 8.0f, paint);
        Drawable drawable = context.getDrawable(i10);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTint(-16711936);
            mutate.setBounds((int) (f12 + 12.0f), 80, (int) (f11 - 12.0f), 104);
            mutate.draw(canvas);
        }
        int i14 = 0;
        int max = Math.max(0, ((int) Math.floor(f12 * 3.047619f)) - 2);
        int max2 = Math.max(0, ((int) Math.floor(225.60976f)) - 2);
        int min = Math.min(1024, ((int) Math.ceil(f11 * 3.047619f)) + 2);
        int min2 = Math.min(625, ((int) Math.ceil(335.36584f)) + 2);
        if (min > max && min2 > max2) {
            int i15 = min - max;
            int i16 = min2 - max2;
            int[] iArr = new int[i15 * i16];
            createBitmap.getPixels(iArr, 0, i15, max, max2, i15, i16);
            int i17 = max2;
            while (i17 < min2) {
                int i18 = max;
                while (i18 < min) {
                    int i19 = (((i17 - max2) * i15) + i18) - max;
                    int i20 = iArr[i19];
                    float f14 = f7;
                    float f15 = f10;
                    int i21 = (i20 >>> 24) & 255;
                    float f16 = f13;
                    int i22 = (i20 >>> 8) & 255;
                    if (i21 == 0) {
                        iArr[i19] = i14;
                        i12 = min;
                        i13 = i14;
                    } else {
                        i12 = min;
                        i13 = 0;
                        iArr[i19] = Math.max(0, Math.min(255, Math.round((1.0f - ((i22 * 0.5f) / 255.0f)) * ((Math.max(0.0f, Math.min(1.0f, (((((i17 / f15) - f16) - 3.4f) * 28.6f) + ((((i18 / f14) - f12) - 5.2f) * 38.2f)) / 2277.2002f)) * (-0.255f)) + 0.995f) * 255.0f))) | (i21 << 16) | (i21 << 24) | (i22 << 8);
                    }
                    i18++;
                    f13 = f16;
                    i14 = i13;
                    min = i12;
                    f7 = f14;
                    f10 = f15;
                }
                i17++;
                f10 = f10;
            }
            createBitmap.setPixels(iArr, 0, i15, max, max2, i15, i16);
        }
        return createBitmap;
    }

    public static int d(Context context, int i10, int i11) {
        Bitmap g10 = g(context, i10, i11);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, g10, 0);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static int e() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, ByteBuffer.allocateDirect(4));
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static synchronized Bitmap g(Context context, int i10, int i11) {
        Bitmap bitmap;
        synchronized (q5.class) {
            String str = i10 + ":" + i11 + ":" + context.getResources().getConfiguration().hashCode();
            LruCache lruCache = B;
            bitmap = (Bitmap) lruCache.get(str);
            if (bitmap == null) {
                bitmap = c(context, i10, i11);
                lruCache.put(str, bitmap);
            }
        }
        return bitmap;
    }

    public static float h(float[] fArr, int i10, int i11, int i12, int i13) {
        return fArr[Math.max(0, Math.min(i10 - 1, i12)) + (Math.max(0, Math.min(i11 - 1, i13)) * i10)];
    }

    public static String i(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            byteArrayOutputStream.close();
                            open.close();
                            return byteArrayOutputStream2;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException("Could not read ".concat(str), e);
        }
    }

    public static void j() {
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void b(p5 p5Var) {
        GLES20.glUniform3fv(p5Var.d, 4, this.g, 0);
        GLES20.glUniform3fv(p5Var.e, 4, this.g, 12);
        GLES20.glUniform4fv(p5Var.f, 1, this.g, 24);
        GLES20.glUniform2fv(p5Var.g, 1, this.g, 28);
        GLES20.glUniform3fv(p5Var.h, 2, this.g, 30);
        int i10 = p5Var.i;
        if (i10 >= 0) {
            GLES20.glUniform3fv(i10, 2, this.g, 36);
        }
    }

    public final void f(mi.s sVar, p5 p5Var) {
        b(p5Var);
        int i10 = p5Var.j;
        int i11 = sVar.b[0];
        if (i10 >= 0) {
            GLES20.glBindBuffer(34962, i11);
            GLES20.glEnableVertexAttribArray(i10);
            GLES20.glVertexAttribPointer(i10, 3, 5126, false, 0, 0);
        }
        int i12 = p5Var.k;
        int i13 = sVar.b[1];
        if (i12 >= 0) {
            GLES20.glBindBuffer(34962, i13);
            GLES20.glEnableVertexAttribArray(i12);
            GLES20.glVertexAttribPointer(i12, 3, 5126, false, 0, 0);
        }
        GLES20.glDrawArrays(4, 0, sVar.a);
    }
}
