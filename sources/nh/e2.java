package nh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class e2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final uc g;
    public final org.telegram.ui.Components.d6 h;

    public e2(i2 i2Var) {
        this.g = new uc(i2Var);
        this.h = new org.telegram.ui.Components.d6(i2Var, 350L, jr.h);
    }

    public abstract void a(Canvas canvas, float f9, float f10);

    public void b(boolean z10) {
    }
}
