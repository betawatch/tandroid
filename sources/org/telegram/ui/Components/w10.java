package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class w10 {
    public float c;
    public float d;
    public float e;
    public float f;
    public RadialGradient g;
    public final int i;
    public int j;
    public int k;
    public int l;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();
    public final int m = org.telegram.ui.ActionBar.j6.Xg;
    public final int n = org.telegram.ui.ActionBar.j6.Yg;
    public final int o = org.telegram.ui.ActionBar.j6.Zg;
    public final int p = org.telegram.ui.ActionBar.j6.ah;
    public final int q = org.telegram.ui.ActionBar.j6.ih;
    public final int r = org.telegram.ui.ActionBar.j6.jh;
    public final int s = org.telegram.ui.ActionBar.j6.kh;

    public w10(int i10) {
        this.i = i10;
        a();
    }

    public final void a() {
        int i10 = this.i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.m, false);
            this.j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.n, false);
            this.k = w03;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.o, false);
            this.j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.p, false);
            this.k = w05;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.q, false);
            this.j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.s, false);
            this.l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.r, false);
            this.k = w08;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.bh, false));
        } else {
            if (LiteMode.isEnabled(512)) {
                paint.setShader(this.g);
                return;
            }
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.j, this.k), this.l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.j, this.k));
            }
        }
    }
}
