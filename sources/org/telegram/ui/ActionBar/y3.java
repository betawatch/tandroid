package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class y3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public y3(mm0 mm0Var, mm0 mm0Var2, mm0 mm0Var3) {
        this.a = 1;
        this.b = mm0Var;
        this.c = mm0Var2;
        this.d = mm0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.c;
                rect2.set(i13, i14, i15, i16);
                k4 k4Var = (k4) this.d;
                i4 i4Var = k4Var.b;
                if (i4Var.f() && !rect.equals(rect2)) {
                    k4Var.h = true;
                    if (i4Var.f()) {
                        k4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((mm0) this.b).setProgress(org.telegram.ui.h5.j1);
                ((mm0) this.c).setProgress(org.telegram.ui.h5.k1);
                ((mm0) this.d).setProgress(org.telegram.ui.h5.l1);
                break;
        }
    }

    public y3(k4 k4Var) {
        this.a = 0;
        this.d = k4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
