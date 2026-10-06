package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.zo0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class j4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public j4(zo0 zo0Var, zo0 zo0Var2, zo0 zo0Var3) {
        this.a = 1;
        this.b = zo0Var;
        this.c = zo0Var2;
        this.d = zo0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.b;
                if (u4Var.f() && !rect.equals(rect2)) {
                    w4Var.h = true;
                    if (u4Var.f()) {
                        w4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((zo0) this.b).setProgress(org.telegram.ui.j5.c);
                ((zo0) this.c).setProgress(org.telegram.ui.j5.d);
                ((zo0) this.d).setProgress(org.telegram.ui.j5.e);
                break;
        }
    }

    public j4(w4 w4Var) {
        this.a = 0;
        this.d = w4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
