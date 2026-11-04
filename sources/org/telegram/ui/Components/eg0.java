package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class eg0 {
    public Paint a;
    public Paint b;
    public float c;
    public int d;
    public int e;
    public float f;

    public final void a(float f10) {
        this.c = f10;
        if (f10 < 0.0f) {
            this.c = 0.0f;
        } else if (f10 > 1.0f) {
            this.c = 1.0f;
        }
    }
}
