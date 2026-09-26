package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ji0 {
    public Paint a;
    public Paint b;
    public float c;
    public int d;
    public int e;
    public float f;

    public final void a(float f7) {
        this.c = f7;
        if (f7 < 0.0f) {
            this.c = 0.0f;
        } else if (f7 > 1.0f) {
            this.c = 1.0f;
        }
    }
}
