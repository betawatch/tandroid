package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ao0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public i4(ao0 ao0Var, ao0 ao0Var2, ao0 ao0Var3) {
        this.a = 1;
        this.b = ao0Var;
        this.c = ao0Var2;
        this.d = ao0Var3;
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
                ((ao0) this.b).setProgress(org.telegram.ui.j5.c);
                ((ao0) this.c).setProgress(org.telegram.ui.j5.d);
                ((ao0) this.d).setProgress(org.telegram.ui.j5.e);
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
