package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mc0 {
    public final RuntimeShader a;
    public final float[] b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] c = {1.0f, 1.0f, 0.0f, 0.0f};

    public mc0(int i10) {
        lc0.b();
        this.a = lc0.a(AndroidUtilities.readRes(i10));
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
