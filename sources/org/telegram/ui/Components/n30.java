package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n30 extends e4.b {
    public final int g;

    public n30() {
        super(R.raw.round_blur_stage_1_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
