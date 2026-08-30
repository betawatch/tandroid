package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b60 {
    public float c;
    public float d;
    public float e;
    public float f;
    public Shader g;
    public final int i;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public b60(int i10) {
        this.i = i10;
    }

    public final void a() {
        int i10 = this.i;
        if (c60.p1(i10)) {
            this.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.b = 1.0f;
        } else if (i10 == 1) {
            this.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.a = vh.v2.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f10) {
        if (this.g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f >= f11) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                a();
            }
            this.c = this.a;
            this.d = this.b;
            a();
        }
        float f12 = j10;
        float f13 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f;
        this.f = f13;
        float f14 = this.e;
        if (f13 > f14) {
            this.f = f14;
        }
        float interpolation = org.telegram.ui.Components.nr.g.getInterpolation(this.f / f14);
        float f15 = i12;
        float f16 = this.c;
        float f17 = (((((this.a - f16) * interpolation) + f16) * f15) + i11) - 200.0f;
        float f18 = this.d;
        float f19 = (((((this.b - f18) * interpolation) + f18) * f15) + i10) - 200.0f;
        int i13 = this.i;
        float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * (c60.p1(i13) ? 1.0f : i13 == 1 ? 4.0f : 2.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f17, f19);
        matrix.postScale(dp, dp, f17 + 200.0f, f19 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }
}
