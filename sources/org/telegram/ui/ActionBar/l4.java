package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ko0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public l4(ko0 ko0Var, ko0 ko0Var2, ko0 ko0Var3) {
        this.a = 1;
        this.b = ko0Var;
        this.c = ko0Var2;
        this.d = ko0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                y4 y4Var = (y4) this.d;
                w4 w4Var = y4Var.b;
                if (w4Var.f() && !rect.equals(rect2)) {
                    y4Var.h = true;
                    if (w4Var.f()) {
                        y4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((ko0) this.b).setProgress(org.telegram.ui.l5.c);
                ((ko0) this.c).setProgress(org.telegram.ui.l5.d);
                ((ko0) this.d).setProgress(org.telegram.ui.l5.e);
                break;
        }
    }

    public l4(y4 y4Var) {
        this.a = 0;
        this.d = y4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
