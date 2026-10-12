package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n50 extends o50 {
    public final int g;
    public final int h;

    public n50() {
        super(R.raw.round_blur_stage_2_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.a, "center");
    }
}
