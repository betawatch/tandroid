package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class li0 {
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
