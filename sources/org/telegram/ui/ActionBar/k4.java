package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.fo0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class k4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public k4(fo0 fo0Var, fo0 fo0Var2, fo0 fo0Var3) {
        this.a = 1;
        this.b = fo0Var;
        this.c = fo0Var2;
        this.d = fo0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.b;
                if (v4Var.f() && !rect.equals(rect2)) {
                    x4Var.h = true;
                    if (v4Var.f()) {
                        x4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((fo0) this.b).setProgress(org.telegram.ui.i5.c);
                ((fo0) this.c).setProgress(org.telegram.ui.i5.d);
                ((fo0) this.d).setProgress(org.telegram.ui.i5.e);
                break;
        }
    }

    public k4(x4 x4Var) {
        this.a = 0;
        this.d = x4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
