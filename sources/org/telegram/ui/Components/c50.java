package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class c50 extends d50 {
    public final int g;
    public final int h;

    public c50() {
        super(R.raw.round_blur_stage_2_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.a, "center");
    }
}
