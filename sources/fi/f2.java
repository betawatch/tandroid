package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import bi.nd;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class f2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final hc g;
    public final org.telegram.ui.Components.v5 h;

    public f2(nd ndVar) {
        this.g = new hc(ndVar);
        this.h = new org.telegram.ui.Components.v5(ndVar, 350L, wq.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z9) {
    }
}
