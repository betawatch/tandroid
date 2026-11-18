package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y30 extends e4.b {
    public final int g;

    public y30() {
        super(R.raw.round_blur_stage_1_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
