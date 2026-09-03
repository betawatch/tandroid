package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c50 extends e50 {
    public final int g;

    public c50() {
        super(R.raw.round_blur_stage_1_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
