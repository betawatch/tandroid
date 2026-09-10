package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.oo0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public m4(oo0 oo0Var, oo0 oo0Var2, oo0 oo0Var3) {
        this.a = 1;
        this.b = oo0Var;
        this.c = oo0Var2;
        this.d = oo0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                z4 z4Var = (z4) this.d;
                x4 x4Var = z4Var.b;
                if (x4Var.f() && !rect.equals(rect2)) {
                    z4Var.h = true;
                    if (x4Var.f()) {
                        z4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((oo0) this.b).setProgress(org.telegram.ui.i5.c);
                ((oo0) this.c).setProgress(org.telegram.ui.i5.d);
                ((oo0) this.d).setProgress(org.telegram.ui.i5.e);
                break;
        }
    }

    public m4(z4 z4Var) {
        this.a = 0;
        this.d = z4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
