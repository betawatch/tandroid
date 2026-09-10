package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements ah.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ah.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                vl0 vl0Var = i9Var.d;
                fh.d.a(vl0Var, canvas, rectF, vl0Var, i9Var.getContainerView(), 255);
                break;
            default:
                wh.q2 q2Var = (wh.q2) this.b;
                for (View view : q2Var.h.getViewPages()) {
                    if (view instanceof wh.m2) {
                        wh.m2 m2Var = (wh.m2) view;
                        if (m2Var.h == null) {
                            wh.h2 h2Var = m2Var.f;
                            ViewGroup viewGroup = q2Var.S;
                            Objects.requireNonNull(h2Var);
                            m2Var.h = new zg.k(h2Var, viewGroup, new org.telegram.ui.v8(h2Var, 0));
                        }
                        m2Var.h.e(canvas, rectF);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        switch (this.a) {
        }
        zVar.b = true;
    }
}
