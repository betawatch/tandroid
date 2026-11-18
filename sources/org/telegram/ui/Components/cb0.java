package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cb0 {
    public final RuntimeShader a;
    public final float[] b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] c = {1.0f, 1.0f, 0.0f, 0.0f};

    public cb0(int i7) {
        ai.r0.c();
        this.a = ai.r0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.b;
        if (Arrays.equals(fArr, fArr2)) {
            return;
        }
        System.arraycopy(fArr, 0, fArr2, 0, 4);
        this.a.setFloatUniform("transformGradient", fArr2);
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.c;
        if (Arrays.equals(fArr, fArr2)) {
            return;
        }
        System.arraycopy(fArr, 0, fArr2, 0, 4);
        this.a.setFloatUniform("transformPattern", fArr2);
    }
}
