package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public y3(nm0 nm0Var, nm0 nm0Var2, nm0 nm0Var3) {
        this.a = 1;
        this.b = nm0Var;
        this.c = nm0Var2;
        this.d = nm0Var3;
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
                ((nm0) this.b).setProgress(org.telegram.ui.h5.j1);
                ((nm0) this.c).setProgress(org.telegram.ui.h5.k1);
                ((nm0) this.d).setProgress(org.telegram.ui.h5.l1);
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
