package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.mp0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public p4(mp0 mp0Var, mp0 mp0Var2, mp0 mp0Var3) {
        this.a = 1;
        this.b = mp0Var;
        this.c = mp0Var2;
        this.d = mp0Var3;
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
                ((mp0) this.b).setProgress(org.telegram.ui.l5.c);
                ((mp0) this.c).setProgress(org.telegram.ui.l5.d);
                ((mp0) this.d).setProgress(org.telegram.ui.l5.e);
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
