package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e5 {
    public final int a;
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

    public e5(Context context, String str, String str2, String str3, String str4) {
        int b10 = w7.m7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.a = b10;
        this.b = GLES20.glGetAttribLocation(b10, "aPosition");
        this.c = GLES20.glGetAttribLocation(b10, "aNormal");
        this.d = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.e = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.f = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.g = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.h = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.i = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.j = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.k = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.l = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.m = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.n = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
        GLES20.glUseProgram(b10);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFinishLut"), 4);
        GLES20.glUniform1i(glGetUniformLocation, 0);
        GLES20.glUniform1i(glGetUniformLocation2, 1);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTiles"), 2);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTail"), 3);
    }

    public static String b(String str, String str2) {
        int indexOf = str.indexOf(10) + 1;
        return str.substring(0, indexOf) + str2 + str.substring(indexOf);
    }

    public final void a(float[] fArr, float[] fArr2, float f7, float f10, float f11, float f12) {
        GLES20.glUseProgram(this.a);
        GLES20.glUniform1f(this.f, f11);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.k, f7, f10, 0.83f);
        GLES20.glUniform2f(this.l, ((336.0f - f12) - 25.0f) / 336.0f, 0.44878048f);
    }
}
