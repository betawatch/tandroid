package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.lp0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public p4(lp0 lp0Var, lp0 lp0Var2, lp0 lp0Var3) {
        this.a = 1;
        this.b = lp0Var;
        this.c = lp0Var2;
        this.d = lp0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                c5 c5Var = (c5) this.d;
                a5 a5Var = c5Var.b;
                if (a5Var.f() && !rect.equals(rect2)) {
                    c5Var.h = true;
                    if (a5Var.f()) {
                        c5Var.c();
                        break;
                    }
                }
                break;
            default:
                ((lp0) this.b).setProgress(org.telegram.ui.l5.c);
                ((lp0) this.c).setProgress(org.telegram.ui.l5.d);
                ((lp0) this.d).setProgress(org.telegram.ui.l5.e);
                break;
        }
    }

    public p4(c5 c5Var) {
        this.a = 0;
        this.d = c5Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
