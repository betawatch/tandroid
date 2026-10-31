package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.nn0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public f4(nn0 nn0Var, nn0 nn0Var2, nn0 nn0Var3) {
        this.a = 1;
        this.b = nn0Var;
        this.c = nn0Var2;
        this.d = nn0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                s4 s4Var = (s4) this.d;
                q4 q4Var = s4Var.b;
                if (q4Var.f() && !rect.equals(rect2)) {
                    s4Var.h = true;
                    if (q4Var.f()) {
                        s4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((nn0) this.b).setProgress(org.telegram.ui.g5.j1);
                ((nn0) this.c).setProgress(org.telegram.ui.g5.k1);
                ((nn0) this.d).setProgress(org.telegram.ui.g5.l1);
                break;
        }
    }

    public f4(s4 s4Var) {
        this.a = 0;
        this.d = s4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
