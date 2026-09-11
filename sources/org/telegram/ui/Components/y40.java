package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class y40 extends a50 {
    public final int g;

    public y40() {
        super(R.raw.round_blur_stage_1_frag);
        this.g = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
