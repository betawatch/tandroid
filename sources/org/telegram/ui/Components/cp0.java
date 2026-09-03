package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cp0 {
    public final ju a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;

    public cp0(View view) {
        ju juVar = new ju(1, view);
        this.b = System.currentTimeMillis();
        this.a = juVar;
        this.c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        ju juVar;
        float currentTimeMillis = (System.currentTimeMillis() - this.b) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 <= 0.0f || (juVar = this.a) == null) {
            return;
        }
        juVar.run();
    }
}
