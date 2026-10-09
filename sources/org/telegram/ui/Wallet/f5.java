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
import org.telegram.messenger.bi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f5 {
    public static final LruCache B = new LruCache(2);
    public e5 a;
    public int b;
    public int c;
    public int d;
    public e5 e;
    public int f;
    public float[] g;
    public final Context j;
    public final int k;
    public final e5 l;
    public final e5 m;
    public boolean p;
    public final e5 q;
    public final e5 r;
    public final c5.b0 s;
    public final c5.b0 t;
    public int u;
    public final int v;
    public final ki.x w;
    public final e5 x;
    public final float z;
    public float h = 1.0f;
    public final int[] i = new int[4];
    public final int[] n = new int[4];
    public final float[] o = new float[4];
    public final float[] y = new float[2];
    public final int[] A = new int[4];

    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024c  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f5(Context context, int i10, int i11) {
        int[] iArr;
        int i12;
        int i13;
        char c10;
        int i14;
        this.j = context.getApplicationContext();
        this.z = i11;
        String g10 = g(context, "shaders/wallet_card_vertex.glsl");
        String g11 = g(context, "shaders/wallet_card_fragment.glsl");
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[4];
        int i15 = 0;
        GLES20.glGetIntegerv(36006, iArr4, 0);
        GLES20.glGetIntegerv(2978, iArr5, 0);
        boolean glIsEnabled = GLES20.glIsEnabled(2929);
        GLES20.glGenTextures(1, iArr2, 0);
        int i16 = 3553;
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
                        int i17 = iArr5[0];
                        int i18 = iArr5[1];
                        int i19 = iArr5[2];
                        int i20 = iArr5[3];
                        GLES20.glViewport(i17, i18, i19, i20);
                        if (glIsEnabled) {
                            GLES20.glEnable(2929);
                        }
                        GLES20.glBindTexture(3553, 0);
                        GLES20.glDeleteFramebuffers(1, iArr3, 0);
                        iArr5 = i20;
                    } catch (RuntimeException e7) {
                        e = e7;
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
                            if (i15 != 0) {
                                GLES20.glDeleteProgram(i15);
                            }
                            i15 = i12;
                            this.k = i15;
                            if (i15 != 0) {
                            }
                            this.l = new e5(context, g10, g11, "body", r0.concat("#define WALLET_BODY_PASS\n"));
                            this.m = new e5(context, g10, g11, "engraving", r0.concat("#define WALLET_ENGRAVING_PASS\n"));
                            this.q = new e5(context, g10, g11, "qr", r0.concat("#define WALLET_QR_PASS\n"));
                            this.r = new e5(context, g10, g11, "edge", r0.concat("#define WALLET_EDGE_PASS\n"));
                            this.x = new e5(context, g10, g11, "flecks", r0.concat("#define WALLET_FLECKS_PASS\n"));
                            this.u = c(context, i10, i11);
                            this.v = d();
                            this.w = new ki.x();
                            this.s = new c5.b0(context, "models/card_back.binobj");
                            this.t = new c5.b0(context, "models/card_edge.binobj");
                        } catch (Throwable th2) {
                            th = th2;
                            GLES20.glBindFramebuffer(36160, iArr4[i12]);
                            GLES20.glViewport(iArr[i12], iArr[1], iArr[2], iArr[c10]);
                            if (glIsEnabled) {
                                GLES20.glEnable(2929);
                            }
                            GLES20.glBindTexture(i13, i12);
                            GLES20.glDeleteFramebuffers(1, iArr3, i12);
                            if (i15 != 0) {
                                GLES20.glDeleteProgram(i15);
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
                            i15 = w7.m7.b(context, "wallet-finish-lut", "#version 300 es\nvoid main(){vec2 p=vec2((gl_VertexID<<1)&2,gl_VertexID&2);gl_Position=vec4(p*2.0-1.0,0.0,1.0);}", e5.b(g11, "#define WALLET_FINISH_BAKE_PASS\n"), "aPosition", "aNormal");
                            try {
                                GLES20.glUseProgram(i15);
                                GLES20.glDisable(2929);
                                GLES20.glViewport(0, 0, 1024, 2);
                                GLES20.glDrawArrays(4, 0, 3);
                                int i21 = iArr2[0];
                                GLES20.glBindFramebuffer(36160, iArr4[0]);
                                int i22 = iArr[0];
                                int i23 = iArr[1];
                                int i24 = iArr[2];
                                i16 = iArr[3];
                                GLES20.glViewport(i22, i23, i24, i16);
                                if (glIsEnabled) {
                                    GLES20.glEnable(2929);
                                }
                                GLES20.glBindTexture(3553, 0);
                                iArr5 = 1;
                                GLES20.glDeleteFramebuffers(1, iArr3, 0);
                                if (i15 != 0) {
                                    GLES20.glDeleteProgram(i15);
                                }
                                i15 = i21;
                            } catch (RuntimeException e10) {
                                e = e10;
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
                                if (i15 != 0) {
                                }
                                i15 = i12;
                                this.k = i15;
                                if (i15 != 0) {
                                }
                                this.l = new e5(context, g10, g11, "body", r0.concat("#define WALLET_BODY_PASS\n"));
                                this.m = new e5(context, g10, g11, "engraving", r0.concat("#define WALLET_ENGRAVING_PASS\n"));
                                this.q = new e5(context, g10, g11, "qr", r0.concat("#define WALLET_QR_PASS\n"));
                                this.r = new e5(context, g10, g11, "edge", r0.concat("#define WALLET_EDGE_PASS\n"));
                                this.x = new e5(context, g10, g11, "flecks", r0.concat("#define WALLET_FLECKS_PASS\n"));
                                this.u = c(context, i10, i11);
                                this.v = d();
                                this.w = new ki.x();
                                this.s = new c5.b0(context, "models/card_back.binobj");
                                this.t = new c5.b0(context, "models/card_edge.binobj");
                            } catch (Throwable th3) {
                                th = th3;
                                i13 = 3553;
                                GLES20.glBindFramebuffer(36160, iArr4[i12]);
                                GLES20.glViewport(iArr[i12], iArr[1], iArr[2], iArr[c10]);
                                if (glIsEnabled) {
                                }
                                GLES20.glBindTexture(i13, i12);
                                GLES20.glDeleteFramebuffers(1, iArr3, i12);
                                if (i15 != 0) {
                                }
                                throw th;
                            }
                        } catch (RuntimeException e11) {
                            e = e11;
                            i13 = 3553;
                            i15 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            i13 = 3553;
                            i15 = 0;
                        }
                    } catch (RuntimeException e12) {
                        e = e12;
                        iArr = iArr5;
                        i12 = 0;
                        i13 = 3553;
                        c10 = 3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                iArr = iArr5;
                i12 = i15;
                i13 = i16;
                c10 = 3;
            }
        } catch (RuntimeException e13) {
            e = e13;
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
        this.k = i15;
        String str = i15 != 0 ? "#define WALLET_FINISH_LUT\n" : "";
        this.l = new e5(context, g10, g11, "body", str.concat("#define WALLET_BODY_PASS\n"));
        this.m = new e5(context, g10, g11, "engraving", str.concat("#define WALLET_ENGRAVING_PASS\n"));
        this.q = new e5(context, g10, g11, "qr", str.concat("#define WALLET_QR_PASS\n"));
        this.r = new e5(context, g10, g11, "edge", str.concat("#define WALLET_EDGE_PASS\n"));
        this.x = new e5(context, g10, g11, "flecks", str.concat("#define WALLET_FLECKS_PASS\n"));
        this.u = c(context, i10, i11);
        this.v = d();
        this.w = new ki.x();
        this.s = new c5.b0(context, "models/card_back.binobj");
        this.t = new c5.b0(context, "models/card_edge.binobj");
    }

    public static void a(float[] fArr, int i10) {
        FloatBuffer h = bi.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        GLES20.glBindBuffer(34962, i10);
        GLES20.glBufferData(34962, fArr.length * 4, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static Bitmap b(Context context, int i10, int i11) {
        int i12;
        int i13;
        Bitmap createBitmap = Bitmap.createBitmap(1024, 625, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 3.047619f;
        float f10 = 3.0487804f;
        canvas.scale(3.047619f, 3.0487804f);
        float f11 = 336.0f - i11;
        float f12 = f11 - 50.0f;
        Paint paint = new Paint(1);
        paint.setColor(-65536);
        float f13 = 73.0f;
        canvas.drawRoundRect(new RectF(f12, 73.0f, f11, 111.0f), 9.0f, 9.0f, paint);
        Drawable drawable = context.getDrawable(i10);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTint(-16711936);
            mutate.setBounds((int) (f12 + 13.0f), 80, (int) (f11 - 13.0f), 104);
            mutate.draw(canvas);
        }
        int i14 = 0;
        int max = Math.max(0, ((int) Math.floor(f12 * 3.047619f)) - 2);
        int max2 = Math.max(0, ((int) Math.floor(222.56097f)) - 2);
        int min = Math.min(1024, ((int) Math.ceil(f11 * 3.047619f)) + 2);
        int min2 = Math.min(625, ((int) Math.ceil(338.41464f)) + 2);
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
                        iArr[i19] = Math.max(0, Math.min(255, Math.round((1.0f - ((i22 * 0.5f) / 255.0f)) * ((Math.max(0.0f, Math.min(1.0f, (((((i17 / f15) - f16) - 3.4f) * 30.6f) + ((((i18 / f14) - f12) - 5.2f) * 40.2f)) / 2552.4001f)) * (-0.255f)) + 0.995f) * 255.0f))) | (i21 << 16) | (i21 << 24) | (i22 << 8);
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

    public static int c(Context context, int i10, int i11) {
        Bitmap f7 = f(context, i10, i11);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, f7, 0);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static int d() {
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

    public static void e(c5.b0 b0Var, e5 e5Var) {
        int i10 = e5Var.b;
        int i11 = ((int[]) b0Var.c)[0];
        if (i10 >= 0) {
            GLES20.glBindBuffer(34962, i11);
            GLES20.glEnableVertexAttribArray(i10);
            GLES20.glVertexAttribPointer(i10, 3, 5126, false, 0, 0);
        }
        int i12 = e5Var.c;
        int i13 = ((int[]) b0Var.c)[1];
        if (i12 >= 0) {
            GLES20.glBindBuffer(34962, i13);
            GLES20.glEnableVertexAttribArray(i12);
            GLES20.glVertexAttribPointer(i12, 3, 5126, false, 0, 0);
        }
        GLES20.glDrawArrays(4, 0, b0Var.b);
    }

    public static synchronized Bitmap f(Context context, int i10, int i11) {
        Bitmap bitmap;
        synchronized (f5.class) {
            String str = i10 + ":" + i11 + ":" + context.getResources().getConfiguration().hashCode();
            LruCache lruCache = B;
            bitmap = (Bitmap) lruCache.get(str);
            if (bitmap == null) {
                bitmap = b(context, i10, i11);
                lruCache.put(str, bitmap);
            }
        }
        return bitmap;
    }

    public static String g(Context context, String str) {
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
        } catch (IOException e7) {
            throw new IllegalStateException("Could not read ".concat(str), e7);
        }
    }

    public static void i() {
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void h(Bitmap bitmap) {
        if (this.a == null) {
            Context context = this.j;
            this.a = new e5(context, g(context, "shaders/wallet_card_vertex.glsl"), g(this.j, "shaders/wallet_card_content_fragment.glsl"), "content", "");
            this.b = d();
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.b);
        if (this.c == bitmap.getWidth() && this.d == bitmap.getHeight()) {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            return;
        }
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
    }
}
