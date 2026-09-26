package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ nq(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        pr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        pr prVar = this.b;
        if (prVar.getParentActivity() != null) {
            s4.h0 adapter = prVar.c.getAdapter();
            lr lrVar = prVar.a;
            if (adapter == lrVar) {
                return prVar.h0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
    public void run(long j3) {
        pr.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
