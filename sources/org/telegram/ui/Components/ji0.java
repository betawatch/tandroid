package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
