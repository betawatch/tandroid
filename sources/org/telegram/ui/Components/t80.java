package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t80 extends xs0 {
    public final /* synthetic */ u80 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(u80 u80Var, Context context, long j3, ps0 ps0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, u80 u80Var2, s80 s80Var, org.telegram.ui.ActionBar.f6 f6Var, dh.c cVar) {
        super(context, j3, ps0Var, 0, null, chatFull, userFull, i7, 0, u80Var2, s80Var, 0, f6Var, cVar);
        this.w2 = u80Var;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean A0() {
        return this.w2.a == 2;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean H0() {
        return this.w2.d0();
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean I() {
        return !this.w2.d0();
    }

    @Override // org.telegram.ui.Components.xs0
    public final void O0(SparseArray sparseArray) {
        int size = sparseArray.size();
        u80 u80Var = this.w2;
        u80Var.w = sparseArray;
        fi.d dVar = u80Var.N;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            u80Var.N.c(size, true);
            if (u80Var.R.getClosestTab() == 8) {
                u80Var.N.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.xs0
    public final void V0(boolean z9) {
        int i7;
        u80 u80Var = this.w2;
        Activity parentActivity = u80Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) u80Var).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
    }

    @Override // org.telegram.ui.Components.xs0
    public final void W0() {
        super.W0();
        this.w2.g0();
    }

    @Override // org.telegram.ui.Components.xs0
    public final void X0(float f10) {
        u80 u80Var = this.w2;
        if (u80Var.a != 1) {
            return;
        }
        int i7 = Math.round(f10 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.le0 le0Var = u80Var.J;
        if (le0Var != null && u80Var.L != i7) {
            u80Var.L = i7;
            le0Var.q(u80Var.K[i7], true);
        }
        u80Var.h0(true);
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean Y() {
        u80 u80Var = this.w2;
        return u80Var.d0() || u80Var.a == 3;
    }

    @Override // org.telegram.ui.Components.xs0
    public final int getInitialTab() {
        return this.w2.S;
    }

    @Override // org.telegram.ui.Components.xs0
    public final String getStoriesHashtag() {
        return this.w2.h;
    }

    @Override // org.telegram.ui.Components.xs0
    public final String getStoriesHashtagUsername() {
        return this.w2.n;
    }

    @Override // org.telegram.ui.Components.xs0
    public final void o1(boolean z9) {
        if (this.E1 == z9) {
            return;
        }
        super.o1(z9);
        u80 u80Var = this.w2;
        if (u80Var.d0()) {
            if (z9) {
                t1(null);
            }
            this.O1 = z9;
        }
        te.a aVar = u80Var.O;
        if (aVar != null) {
            aVar.a(z9, true);
        }
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean x0() {
        u80 u80Var = this.w2;
        return u80Var.a == 0 && u80Var.e == u80Var.getUserConfig().e() && u80Var.f == 0;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean y0() {
        return this.w2.d0();
    }
}
