package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lb0 {
    public final RuntimeShader a;
    public final float[] b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] c = {1.0f, 1.0f, 0.0f, 0.0f};

    public lb0(int i9) {
        kb0.b();
        this.a = kb0.a(AndroidUtilities.readRes(i9));
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
