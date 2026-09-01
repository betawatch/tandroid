package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hi0 {
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
