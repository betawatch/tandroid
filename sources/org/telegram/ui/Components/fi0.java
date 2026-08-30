package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fi0 {
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
