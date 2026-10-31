package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m90 extends zt0 {
    public final /* synthetic */ n90 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(n90 n90Var, Context context, long j10, rt0 rt0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, n90 n90Var2, l90 l90Var, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context, j10, rt0Var, 0, null, chatFull, userFull, i10, 0, n90Var2, l90Var, 0, p6Var, bVar);
        this.w2 = n90Var;
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean E0() {
        return this.w2.c0();
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean H() {
        return !this.w2.c0();
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L0(SparseArray sparseArray) {
        int size = sparseArray.size();
        n90 n90Var = this.w2;
        n90Var.w = sparseArray;
        vh.d dVar = n90Var.N;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            n90Var.N.c(size, true);
            if (n90Var.R.getClosestTab() == 8) {
                n90Var.N.i(org.telegram.messenger.cd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.zt0
    public final void S0(boolean z10) {
        int i10;
        n90 n90Var = this.w2;
        Activity parentActivity = n90Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) n90Var).classGuid;
        org.telegram.messenger.i0.B2(parentActivity, i10);
    }

    @Override // org.telegram.ui.Components.zt0
    public final void T0() {
        super.T0();
        this.w2.f0();
    }

    @Override // org.telegram.ui.Components.zt0
    public final void U0(float f7) {
        n90 n90Var = this.w2;
        if (n90Var.a != 1) {
            return;
        }
        int i10 = Math.round(f7 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.rf0 rf0Var = n90Var.J;
        if (rf0Var != null && n90Var.L != i10) {
            n90Var.L = i10;
            rf0Var.q(n90Var.K[i10], true);
        }
        n90Var.g0(true);
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean W() {
        n90 n90Var = this.w2;
        return n90Var.c0() || n90Var.a == 3;
    }

    @Override // org.telegram.ui.Components.zt0
    public final int getInitialTab() {
        return this.w2.S;
    }

    @Override // org.telegram.ui.Components.zt0
    public final String getStoriesHashtag() {
        return this.w2.h;
    }

    @Override // org.telegram.ui.Components.zt0
    public final String getStoriesHashtagUsername() {
        return this.w2.n;
    }

    @Override // org.telegram.ui.Components.zt0
    public final void l1(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        super.l1(z10);
        n90 n90Var = this.w2;
        if (n90Var.c0()) {
            if (z10) {
                q1(null);
            }
            this.O1 = z10;
        }
        fe.b bVar = n90Var.O;
        if (bVar != null) {
            bVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean v0() {
        n90 n90Var = this.w2;
        return n90Var.a == 0 && n90Var.e == n90Var.getUserConfig().e() && n90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean w0() {
        return this.w2.c0();
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean y0() {
        return this.w2.a == 2;
    }
}
