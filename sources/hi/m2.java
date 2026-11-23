package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class m2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.lc g;
    public final org.telegram.ui.Components.c6 h;

    public m2(p2 p2Var) {
        this.g = new org.telegram.ui.Components.lc(p2Var);
        this.h = new org.telegram.ui.Components.c6(p2Var, 350L, kr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
