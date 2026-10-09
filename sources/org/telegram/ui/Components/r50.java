package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r50 extends s50 {
    public final int g;
    public final int h;

    public r50() {
        super(R.raw.round_blur_stage_2_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.a, "center");
    }
}
