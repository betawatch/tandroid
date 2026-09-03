package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g30 {
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

    public g30(int i10) {
        this.i = i10;
    }

    public final void a(float f10) {
        int i10 = this.i;
        if (i10 == 0) {
            int i11 = this.j;
            int i12 = org.telegram.ui.ActionBar.j6.Tg;
            if (i11 != org.telegram.ui.ActionBar.j6.w0(null, i12, false) || this.k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false)) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
                this.j = w02;
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ug, false);
                this.k = w03;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i10 == 1) {
            int i13 = this.j;
            int i14 = org.telegram.ui.ActionBar.j6.Vg;
            if (i13 != org.telegram.ui.ActionBar.j6.w0(null, i14, false) || this.k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false)) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                this.j = w04;
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wg, false);
                this.k = w05;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            if (i10 != 3) {
                return;
            }
            int i15 = this.j;
            int i16 = org.telegram.ui.ActionBar.j6.ih;
            if (i15 != org.telegram.ui.ActionBar.j6.w0(null, i16, false) || this.k != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false) || this.l != org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false)) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jh, false);
                this.k = w06;
                int w07 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false);
                this.l = w07;
                int w08 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                this.j = w08;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        int dp = AndroidUtilities.dp(130.0f);
        float f11 = this.e;
        if (f11 == 0.0f || this.f >= f11) {
            this.e = Utilities.random.nextInt(700) + 500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                b();
            }
            this.c = this.a;
            this.d = this.b;
            b();
        }
        float f12 = 16L;
        float f13 = (f12 * 0.02f * f10) + (1.0f * f12) + this.f;
        this.f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f = f14;
        }
        float interpolation = mr.g.getInterpolation(this.f / f14);
        float f15 = dp;
        float f16 = this.c;
        float f17 = ((((this.a - f16) * interpolation) + f16) * f15) - 200.0f;
        float f18 = this.d;
        float f19 = ((((this.b - f18) * interpolation) + f18) * f15) - 200.0f;
        float f20 = (f15 / 400.0f) * (i10 == 3 ? 2.0f : 1.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f17, f19);
        matrix.postScale(f20, f20, f17 + 200.0f, f19 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i10 = this.i;
        if (i10 == 0) {
            this.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i10 == 3) {
            this.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.b = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
        } else {
            this.a = vh.w2.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = Utilities.random.nextInt(100) / 100.0f;
        }
    }
}
