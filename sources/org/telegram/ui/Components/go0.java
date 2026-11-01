package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class go0 {
    public final zt a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;

    public go0(View view) {
        zt ztVar = new zt(1, view);
        this.b = System.currentTimeMillis();
        this.a = ztVar;
        d5.a aVar = Utilities.c;
        this.c = org.telegram.messenger.i0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.i0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.e = org.telegram.messenger.i0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        zt ztVar;
        float currentTimeMillis = (System.currentTimeMillis() - this.b) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.i0.L(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * org.telegram.messenger.i0.L(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 <= 0.0f || (ztVar = this.a) == null) {
            return;
        }
        ztVar.run();
    }
}
