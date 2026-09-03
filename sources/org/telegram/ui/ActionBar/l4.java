package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.jo0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public l4(jo0 jo0Var, jo0 jo0Var2, jo0 jo0Var3) {
        this.a = 1;
        this.b = jo0Var;
        this.c = jo0Var2;
        this.d = jo0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                y4 y4Var = (y4) this.d;
                w4 w4Var = y4Var.b;
                if (w4Var.f() && !rect.equals(rect2)) {
                    y4Var.h = true;
                    if (w4Var.f()) {
                        y4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((jo0) this.b).setProgress(org.telegram.ui.n5.c);
                ((jo0) this.c).setProgress(org.telegram.ui.n5.d);
                ((jo0) this.d).setProgress(org.telegram.ui.n5.e);
                break;
        }
    }

    public l4(y4 y4Var) {
        this.a = 0;
        this.d = y4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
