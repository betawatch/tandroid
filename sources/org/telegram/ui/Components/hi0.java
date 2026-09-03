package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
