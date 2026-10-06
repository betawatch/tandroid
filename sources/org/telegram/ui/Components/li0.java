package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
