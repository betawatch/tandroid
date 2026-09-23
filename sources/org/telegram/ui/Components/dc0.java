package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dc0 {
    public final RuntimeShader a;
    public final float[] b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] c = {1.0f, 1.0f, 0.0f, 0.0f};

    public dc0(int i10) {
        cc0.b();
        this.a = cc0.a(AndroidUtilities.readRes(i10));
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
