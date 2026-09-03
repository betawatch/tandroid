package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.il0, org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ oq(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        rr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        rr rrVar = this.b;
        if (rrVar.getParentActivity() != null) {
            f2.o0 adapter = rrVar.c.getAdapter();
            nr nrVar = rrVar.a;
            if (adapter == nrVar) {
                return rrVar.h0(nrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.u0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        rr.U(this.b, j10);
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
