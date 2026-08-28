package fh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import kh.s7;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.u8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements jg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                for (View view : j4Var.h.getViewPages()) {
                    if (view instanceof y3) {
                        y3 y3Var = (y3) view;
                        if (y3Var.h == null) {
                            s3 s3Var = y3Var.f;
                            ViewGroup viewGroup = j4Var.O;
                            Objects.requireNonNull(s3Var);
                            y3Var.h = new ig.k(s3Var, viewGroup, new u8(s3Var, 0));
                        }
                        y3Var.h.e(canvas, rectF);
                    }
                }
                break;
            default:
                s7 s7Var = (s7) this.b;
                wk0 wk0Var = s7Var.d;
                og.d.a(wk0Var, canvas, rectF, wk0Var, s7Var.getContainerView(), 255);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
