package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m90 extends au0 {
    public final /* synthetic */ n90 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(n90 n90Var, Context context, long j10, st0 st0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, n90 n90Var2, l90 l90Var, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context, j10, st0Var, 0, null, chatFull, userFull, i10, 0, n90Var2, l90Var, 0, p6Var, bVar);
        this.w2 = n90Var;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean F0() {
        return this.w2.d0();
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean H() {
        return !this.w2.d0();
    }

    @Override // org.telegram.ui.Components.au0
    public final void M0(SparseArray sparseArray) {
        int size = sparseArray.size();
        n90 n90Var = this.w2;
        n90Var.w = sparseArray;
        vh.d dVar = n90Var.N;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            n90Var.N.c(size, true);
            if (n90Var.R.getClosestTab() == 8) {
                n90Var.N.i(org.telegram.messenger.dd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.au0
    public final void T0(boolean z10) {
        int i10;
        n90 n90Var = this.w2;
        Activity parentActivity = n90Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) n90Var).classGuid;
        org.telegram.messenger.i0.B2(parentActivity, i10);
    }

    @Override // org.telegram.ui.Components.au0
    public final void U0() {
        super.U0();
        this.w2.g0();
    }

    @Override // org.telegram.ui.Components.au0
    public final void V0(float f7) {
        n90 n90Var = this.w2;
        if (n90Var.a != 1) {
            return;
        }
        int i10 = Math.round(f7 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.qf0 qf0Var = n90Var.J;
        if (qf0Var != null && n90Var.L != i10) {
            n90Var.L = i10;
            qf0Var.q(n90Var.K[i10], true);
        }
        n90Var.h0(true);
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean X() {
        n90 n90Var = this.w2;
        return n90Var.d0() || n90Var.a == 3;
    }

    @Override // org.telegram.ui.Components.au0
    public final int getInitialTab() {
        return this.w2.S;
    }

    @Override // org.telegram.ui.Components.au0
    public final String getStoriesHashtag() {
        return this.w2.h;
    }

    @Override // org.telegram.ui.Components.au0
    public final String getStoriesHashtagUsername() {
        return this.w2.n;
    }

    @Override // org.telegram.ui.Components.au0
    public final void m1(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        super.m1(z10);
        n90 n90Var = this.w2;
        if (n90Var.d0()) {
            if (z10) {
                r1(null);
            }
            this.O1 = z10;
        }
        fe.b bVar = n90Var.O;
        if (bVar != null) {
            bVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean w0() {
        n90 n90Var = this.w2;
        return n90Var.a == 0 && n90Var.e == n90Var.getUserConfig().e() && n90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean x0() {
        return this.w2.d0();
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean z0() {
        return this.w2.a == 2;
    }
}
