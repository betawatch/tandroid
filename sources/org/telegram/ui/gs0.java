package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ is0 b;

    public /* synthetic */ gs0(is0 is0Var, int i7) {
        this.a = i7;
        this.b = is0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.o41) obj).d == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z10 = !s8Var.e.h;
            is0 is0Var = this.b;
            is0Var.n = z10;
            s8Var.setChecked(z10);
            is0Var.d.g3.O(true);
            is0Var.a0(true);
        }
    }
}
