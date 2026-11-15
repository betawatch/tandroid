package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.vb;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class e2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final dc g;
    public final org.telegram.ui.Components.u5 h;

    public e2(vb vbVar) {
        this.g = new dc(vbVar);
        this.h = new org.telegram.ui.Components.u5(vbVar, 350L, er.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
