package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j50 extends k50 {
    public final int g;
    public final int h;

    public j50() {
        super(R.raw.round_blur_stage_2_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.a, "center");
    }
}
