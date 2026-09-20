package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z40 extends a50 {
    public final int g;
    public final int h;

    public z40() {
        super(R.raw.round_blur_stage_2_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.a, "center");
    }
}
