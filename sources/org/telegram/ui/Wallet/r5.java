package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class r5 {
    public float a = 1.0f;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
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
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;

    public r5(Context context, String str, String str2, String str3, String str4) {
        this.b = -1;
        int b10 = w7.v7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.c = b10;
        this.d = GLES20.glGetUniformLocation(b10, "uStickerPaletteFrom[0]");
        this.e = GLES20.glGetUniformLocation(b10, "uStickerPaletteTo[0]");
        this.f = GLES20.glGetUniformLocation(b10, "uStickerReveal");
        this.g = GLES20.glGetUniformLocation(b10, "uStickerToneScale");
        this.h = GLES20.glGetUniformLocation(b10, "uDiamondTint[0]");
        this.i = GLES20.glGetUniformLocation(b10, "uEngravingInk[0]");
        this.j = GLES20.glGetAttribLocation(b10, "aPosition");
        this.k = GLES20.glGetAttribLocation(b10, "aNormal");
        this.l = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.m = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.o = GLES20.glGetUniformLocation(b10, "uFinishPixelScale");
        this.b = GLES20.glGetUniformLocation(b10, "uEngravingAlpha");
        this.n = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.p = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.q = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.r = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.s = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.t = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.u = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.v = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.w = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
        GLES20.glUseProgram(b10);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFinishLut"), 4);
        GLES20.glUniform1i(glGetUniformLocation, 0);
        GLES20.glUniform1i(glGetUniformLocation2, 1);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uEngravingNormalTexture"), 5);
        GLES20.glUniform4f(GLES20.glGetUniformLocation(b10, "uEngravingFieldBounds"), 0.875f, 0.0f, 0.125f, 1.0f);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTiles"), 2);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTail"), 3);
    }

    public static String b(String str, String str2) {
        int indexOf = str.indexOf(10) + 1;
        return str.substring(0, indexOf) + str2 + str.substring(indexOf);
    }

    public final void a(float[] fArr, float[] fArr2, float f7, float f10, float f11, float f12, float f13) {
        GLES20.glUseProgram(this.c);
        GLES20.glUniform1f(this.n, f11);
        GLES20.glUniform1f(this.o, f13);
        int i10 = this.b;
        if (i10 >= 0) {
            GLES20.glUniform1f(i10, this.a);
        }
        GLES20.glUniformMatrix4fv(this.l, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.m, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.t, f7, f10, 0.83f);
        GLES20.glUniform2f(this.u, ((336.0f - f12) - 24.0f) / 336.0f, 0.44878048f);
    }
}
