package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n00 {
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
    public final int m = org.telegram.ui.ActionBar.k6.Lh;
    public final int n = org.telegram.ui.ActionBar.k6.Mh;
    public final int o = org.telegram.ui.ActionBar.k6.Nh;
    public final int p = org.telegram.ui.ActionBar.k6.Oh;
    public final int q = org.telegram.ui.ActionBar.k6.Wh;
    public final int r = org.telegram.ui.ActionBar.k6.Xh;
    public final int s = org.telegram.ui.ActionBar.k6.Yh;

    public n00(int i7) {
        this.i = i7;
        a();
    }

    public final void a() {
        int i7 = this.i;
        if (i7 == 0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.m, false);
            this.j = x02;
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, this.n, false);
            this.k = x03;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x02, x03}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i7 == 1) {
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, this.o, false);
            this.j = x04;
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, this.p, false);
            this.k = x05;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x04, x05}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i7 == 3) {
            int x06 = org.telegram.ui.ActionBar.k6.x0(null, this.q, false);
            this.j = x06;
            int x07 = org.telegram.ui.ActionBar.k6.x0(null, this.s, false);
            this.l = x07;
            int x08 = org.telegram.ui.ActionBar.k6.x0(null, this.r, false);
            this.k = x08;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{x06, x07, x08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i7 = this.i;
        if (i7 != 0 && i7 != 1 && i7 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ph, false));
        } else {
            if (org.telegram.messenger.rc.e(512)) {
                paint.setShader(this.g);
                return;
            }
            paint.setShader(null);
            if (i7 == 3) {
                paint.setColor(i0.a.f(0.5f, i0.a.f(0.5f, this.j, this.k), this.l));
            } else {
                paint.setColor(i0.a.f(0.5f, this.j, this.k));
            }
        }
    }
}
