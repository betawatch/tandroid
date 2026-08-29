package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uh0 {
    public Paint a;
    public Paint b;
    public float c;
    public int d;
    public int e;
    public float f;

    public final void a(float f9) {
        this.c = f9;
        if (f9 < 0.0f) {
            this.c = 0.0f;
        } else if (f9 > 1.0f) {
            this.c = 1.0f;
        }
    }
}
