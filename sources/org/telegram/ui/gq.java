package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;

    public /* synthetic */ gq(jr jrVar, int i10) {
        this.a = i10;
        this.b = jrVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        jr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        jr jrVar = this.b;
        if (jrVar.getParentActivity() != null) {
            s4.g0 adapter = jrVar.c.getAdapter();
            fr frVar = jrVar.a;
            if (adapter == frVar) {
                return jrVar.h0(frVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
        jr.U(this.b, j10);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
