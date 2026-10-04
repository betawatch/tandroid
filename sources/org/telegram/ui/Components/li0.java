package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
