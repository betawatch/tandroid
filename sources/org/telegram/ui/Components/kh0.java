package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kh0 {
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
