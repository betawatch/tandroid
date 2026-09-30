package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.uo0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class i4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public i4(uo0 uo0Var, uo0 uo0Var2, uo0 uo0Var3) {
        this.a = 1;
        this.b = uo0Var;
        this.c = uo0Var2;
        this.d = uo0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.b;
                if (t4Var.f() && !rect.equals(rect2)) {
                    v4Var.h = true;
                    if (t4Var.f()) {
                        v4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((uo0) this.b).setProgress(org.telegram.ui.i5.c);
                ((uo0) this.c).setProgress(org.telegram.ui.i5.d);
                ((uo0) this.d).setProgress(org.telegram.ui.i5.e);
                break;
        }
    }

    public i4(v4 v4Var) {
        this.a = 0;
        this.d = v4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
