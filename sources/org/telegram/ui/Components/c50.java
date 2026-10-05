package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c50 extends e50 {
    public final int g;

    public c50() {
        super(R.raw.round_blur_stage_1_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
