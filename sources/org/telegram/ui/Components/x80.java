package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x80 extends ys0 {
    public final /* synthetic */ y80 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(y80 y80Var, Context context, long j3, qs0 qs0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, y80 y80Var2, w80 w80Var, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(context, j3, qs0Var, 0, null, chatFull, userFull, i7, 0, y80Var2, w80Var, 0, e6Var, cVar);
        this.x2 = y80Var;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean A0() {
        return this.x2.a == 2;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean I() {
        return !this.x2.d0();
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean I0() {
        return this.x2.d0();
    }

    @Override // org.telegram.ui.Components.ys0
    public final void P0(SparseArray sparseArray) {
        int size = sparseArray.size();
        y80 y80Var = this.x2;
        y80Var.w = sparseArray;
        hi.d dVar = y80Var.O;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            y80Var.O.c(size, true);
            if (y80Var.S.getClosestTab() == 8) {
                y80Var.O.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final void X0(boolean z10) {
        int i7;
        y80 y80Var = this.x2;
        Activity parentActivity = y80Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) y80Var).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean Y() {
        y80 y80Var = this.x2;
        return y80Var.d0() || y80Var.a == 3;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Y0() {
        super.Y0();
        this.x2.g0();
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Z0(float f10) {
        y80 y80Var = this.x2;
        if (y80Var.a != 1) {
            return;
        }
        int i7 = Math.round(f10 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.le0 le0Var = y80Var.K;
        if (le0Var != null && y80Var.M != i7) {
            y80Var.M = i7;
            le0Var.q(y80Var.L[i7], true);
        }
        y80Var.h0(true);
    }

    @Override // org.telegram.ui.Components.ys0
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void q1(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        super.q1(z10);
        y80 y80Var = this.x2;
        if (y80Var.d0()) {
            if (z10) {
                v1(null);
            }
            this.P1 = z10;
        }
        te.a aVar = y80Var.P;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean x0() {
        y80 y80Var = this.x2;
        return y80Var.a == 0 && y80Var.e == y80Var.getUserConfig().e() && y80Var.f == 0;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean y0() {
        return this.x2.d0();
    }
}
