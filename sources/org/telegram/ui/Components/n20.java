package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n20 {
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
    public final int m = org.telegram.ui.ActionBar.i6.Xg;
    public final int n = org.telegram.ui.ActionBar.i6.Yg;
    public final int o = org.telegram.ui.ActionBar.i6.Zg;
    public final int p = org.telegram.ui.ActionBar.i6.ah;
    public final int q = org.telegram.ui.ActionBar.i6.ih;
    public final int r = org.telegram.ui.ActionBar.i6.jh;
    public final int s = org.telegram.ui.ActionBar.i6.kh;

    public n20(int i10) {
        this.i = i10;
        a();
    }

    public final void a() {
        int i10 = this.i;
        if (i10 == 0) {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, this.m, false);
            this.j = x02;
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, this.n, false);
            this.k = x03;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i10 == 1) {
            int x04 = org.telegram.ui.ActionBar.i6.x0(null, this.o, false);
            this.j = x04;
            int x05 = org.telegram.ui.ActionBar.i6.x0(null, this.p, false);
            this.k = x05;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i10 == 3) {
            int x06 = org.telegram.ui.ActionBar.i6.x0(null, this.q, false);
            this.j = x06;
            int x07 = org.telegram.ui.ActionBar.i6.x0(null, this.s, false);
            this.l = x07;
            int x08 = org.telegram.ui.ActionBar.i6.x0(null, this.r, false);
            this.k = x08;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.bh, false));
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
