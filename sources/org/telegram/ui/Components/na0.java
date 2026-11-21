package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class na0 implements qj0 {
    public final /* synthetic */ qa0 a;

    public na0(qa0 qa0Var) {
        this.a = qa0Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        qa0 qa0Var = this.a;
        if (qa0Var.a != 1 || qa0Var.r.f.size() <= 1) {
            return;
        }
        int e12 = ((org.telegram.messenger.fj) qa0Var.r.f.get(i7)).e1();
        boolean z10 = qa0Var.r.g.get(e12, false);
        boolean z11 = !z10;
        if (qa0Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            qa0Var.r.g.delete(e12);
        } else {
            qa0Var.r.g.put(e12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
        }
        qa0Var.l(true);
    }
}
