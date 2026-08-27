package gh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import lh.r7;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.v8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements kg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // kg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                for (View view : d4Var.h.getViewPages()) {
                    if (view instanceof t3) {
                        t3 t3Var = (t3) view;
                        if (t3Var.h == null) {
                            n3 n3Var = t3Var.f;
                            ViewGroup viewGroup = d4Var.O;
                            Objects.requireNonNull(n3Var);
                            t3Var.h = new jg.k(n3Var, viewGroup, new v8(n3Var, 0));
                        }
                        t3Var.h.e(canvas, rectF);
                    }
                }
                break;
            default:
                r7 r7Var = (r7) this.b;
                zk0 zk0Var = r7Var.d;
                pg.c.a(zk0Var, canvas, rectF, zk0Var, r7Var.getContainerView(), 255);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // kg.a
    public final void g(g.y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
