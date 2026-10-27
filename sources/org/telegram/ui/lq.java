package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr b;

    public /* synthetic */ lq(mr mrVar, int i10) {
        this.a = i10;
        this.b = mrVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        mr mrVar = this.b;
        if (mrVar.getParentActivity() != null) {
            s4.h0 adapter = mrVar.c.getAdapter();
            ir irVar = mrVar.a;
            if (adapter == irVar) {
                return mrVar.i0(irVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        mr.W(this.b, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.v0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        mr.V(this.b, j10);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
