package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q80 extends ws0 {
    public final /* synthetic */ r80 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(r80 r80Var, Context context, long j10, os0 os0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i3, r80 r80Var2, p80 p80Var, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(context, j10, os0Var, 0, null, chatFull, userFull, i3, 0, r80Var2, p80Var, 0, e6Var, cVar);
        this.x2 = r80Var;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean A0() {
        return this.x2.a == 2;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean H0() {
        return this.x2.d0();
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean I() {
        return !this.x2.d0();
    }

    @Override // org.telegram.ui.Components.ws0
    public final void O0(SparseArray sparseArray) {
        int size = sparseArray.size();
        r80 r80Var = this.x2;
        r80Var.w = sparseArray;
        gi.d dVar = r80Var.O;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            r80Var.O.c(size, true);
            if (r80Var.S.getClosestTab() == 8) {
                r80Var.O.i(org.telegram.messenger.bd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ws0
    public final void V0(boolean z10) {
        int i3;
        r80 r80Var = this.x2;
        Activity parentActivity = r80Var.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) r80Var).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i3);
    }

    @Override // org.telegram.ui.Components.ws0
    public final void W0() {
        super.W0();
        this.x2.g0();
    }

    @Override // org.telegram.ui.Components.ws0
    public final void X0(float f10) {
        r80 r80Var = this.x2;
        if (r80Var.a != 1) {
            return;
        }
        int i3 = Math.round(f10 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.ge0 ge0Var = r80Var.K;
        if (ge0Var != null && r80Var.M != i3) {
            r80Var.M = i3;
            ge0Var.q(r80Var.L[i3], true);
        }
        r80Var.h0(true);
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean Y() {
        r80 r80Var = this.x2;
        return r80Var.d0() || r80Var.a == 3;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // org.telegram.ui.Components.ws0
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // org.telegram.ui.Components.ws0
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // org.telegram.ui.Components.ws0
    public final void o1(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        super.o1(z10);
        r80 r80Var = this.x2;
        if (r80Var.d0()) {
            if (z10) {
                t1(null);
            }
            this.P1 = z10;
        }
        qe.a aVar = r80Var.P;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean x0() {
        r80 r80Var = this.x2;
        return r80Var.a == 0 && r80Var.e == r80Var.getUserConfig().e() && r80Var.f == 0;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean y0() {
        return this.x2.d0();
    }
}
