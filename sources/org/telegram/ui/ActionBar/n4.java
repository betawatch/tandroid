package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.hp0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class n4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public n4(hp0 hp0Var, hp0 hp0Var2, hp0 hp0Var3) {
        this.a = 1;
        this.b = hp0Var;
        this.c = hp0Var2;
        this.d = hp0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                a5 a5Var = (a5) this.d;
                y4 y4Var = a5Var.b;
                if (y4Var.f() && !rect.equals(rect2)) {
                    a5Var.h = true;
                    if (y4Var.f()) {
                        a5Var.c();
                        break;
                    }
                }
                break;
            default:
                ((hp0) this.b).setProgress(org.telegram.ui.m5.c);
                ((hp0) this.c).setProgress(org.telegram.ui.m5.d);
                ((hp0) this.d).setProgress(org.telegram.ui.m5.e);
                break;
        }
    }

    public n4(a5 a5Var) {
        this.a = 0;
        this.d = a5Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
