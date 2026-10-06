package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public abstract class m2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.zc g;
    public final org.telegram.ui.Components.e6 h;

    public m2(q2 q2Var) {
        this.g = new org.telegram.ui.Components.zc(q2Var);
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, tr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
