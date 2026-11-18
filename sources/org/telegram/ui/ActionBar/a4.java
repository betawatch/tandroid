package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ym0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public a4(ym0 ym0Var, ym0 ym0Var2, ym0 ym0Var3) {
        this.a = 1;
        this.b = ym0Var;
        this.c = ym0Var2;
        this.d = ym0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.c;
                rect2.set(i13, i14, i15, i16);
                m4 m4Var = (m4) this.d;
                k4 k4Var = m4Var.b;
                if (k4Var.f() && !rect.equals(rect2)) {
                    m4Var.h = true;
                    if (k4Var.f()) {
                        m4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((ym0) this.b).setProgress(org.telegram.ui.h5.n1);
                ((ym0) this.c).setProgress(org.telegram.ui.h5.o1);
                ((ym0) this.d).setProgress(org.telegram.ui.h5.p1);
                break;
        }
    }

    public a4(m4 m4Var) {
        this.a = 0;
        this.d = m4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
