package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class g2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final xc g;
    public final org.telegram.ui.Components.h6 h;

    public g2(j2 j2Var) {
        this.g = new xc(j2Var);
        this.h = new org.telegram.ui.Components.h6(j2Var, 350L, ds.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
