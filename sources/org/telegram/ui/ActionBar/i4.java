package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.pn0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public i4(pn0 pn0Var, pn0 pn0Var2, pn0 pn0Var3) {
        this.a = 1;
        this.b = pn0Var;
        this.c = pn0Var2;
        this.d = pn0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i9, i10, i11, i12);
                Rect rect2 = (Rect) this.c;
                rect2.set(i13, i14, i15, i16);
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
                ((pn0) this.b).setProgress(org.telegram.ui.i5.c);
                ((pn0) this.c).setProgress(org.telegram.ui.i5.d);
                ((pn0) this.d).setProgress(org.telegram.ui.i5.e);
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
