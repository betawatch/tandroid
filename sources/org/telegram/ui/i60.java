package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class i60 {
    public float c;
    public float d;
    public float e;
    public float f;
    public Shader g;
    public final int i;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public i60(int i10) {
        this.i = i10;
    }

    public final void a() {
        int i10 = this.i;
        if (j60.p1(i10)) {
            this.a = a4.a.A(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.b = 1.0f;
        } else if (i10 == 1) {
            this.a = a4.a.A(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.b = a4.a.A(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.a = a4.a.e(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j3, float f7) {
        if (this.g == null) {
            return;
        }
        float f10 = this.e;
        if (f10 == 0.0f || this.f >= f10) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                a();
            }
            this.c = this.a;
            this.d = this.b;
            a();
        }
        float f11 = j3;
        float f12 = (f11 * 0.02f * f7) + (f11 * 1.0f) + this.f;
        this.f = f12;
        float f13 = this.e;
        if (f12 > f13) {
            this.f = f13;
        }
        float interpolation = org.telegram.ui.Components.pr.g.getInterpolation(this.f / f13);
        float f14 = i12;
        float f15 = this.c;
        float f16 = (((((this.a - f15) * interpolation) + f15) * f14) + i11) - 200.0f;
        float f17 = this.d;
        float f18 = (((((this.b - f17) * interpolation) + f17) * f14) + i10) - 200.0f;
        int i13 = this.i;
        float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * (j60.p1(i13) ? 1.0f : i13 == 1 ? 4.0f : 2.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f16, f18);
        matrix.postScale(dp, dp, f16 + 200.0f, f18 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }
}
