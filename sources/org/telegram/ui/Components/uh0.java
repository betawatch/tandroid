package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class uh0 {
    public Canvas a;
    public Bitmap b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public final void a() {
        this.c = true;
        if (this.e) {
            return;
        }
        this.d = true;
        this.b.recycle();
    }
}
