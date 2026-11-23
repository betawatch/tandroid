package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g90 extends it0 {
    public final /* synthetic */ h90 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(h90 h90Var, Context context, long j3, at0 at0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, h90 h90Var2, f90 f90Var, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context, j3, at0Var, 0, null, chatFull, userFull, i7, 0, h90Var2, f90Var, 0, i6Var, cVar);
        this.x2 = h90Var;
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean A0() {
        return this.x2.a == 2;
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean I() {
        return !this.x2.d0();
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean I0() {
        return this.x2.d0();
    }

    @Override // org.telegram.ui.Components.it0
    public final void P0(SparseArray sparseArray) {
        int size = sparseArray.size();
        h90 h90Var = this.x2;
        h90Var.w = sparseArray;
        hi.e eVar = h90Var.O;
        if (eVar != null) {
            eVar.setEnabled(size > 0);
            h90Var.O.c(size, true);
            if (h90Var.S.getClosestTab() == 8) {
                h90Var.O.i(org.telegram.messenger.gd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.it0
    public final void X0(boolean z10) {
        int i7;
        h90 h90Var = this.x2;
        Activity parentActivity = h90Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) h90Var).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean Y() {
        h90 h90Var = this.x2;
        return h90Var.d0() || h90Var.a == 3;
    }

    @Override // org.telegram.ui.Components.it0
    public final void Y0() {
        super.Y0();
        this.x2.g0();
    }

    @Override // org.telegram.ui.Components.it0
    public final void Z0(float f10) {
        h90 h90Var = this.x2;
        if (h90Var.a != 1) {
            return;
        }
        int i7 = Math.round(f10 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.ne0 ne0Var = h90Var.K;
        if (ne0Var != null && h90Var.M != i7) {
            h90Var.M = i7;
            ne0Var.r(h90Var.L[i7], true);
        }
        h90Var.h0(true);
    }

    @Override // org.telegram.ui.Components.it0
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // org.telegram.ui.Components.it0
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // org.telegram.ui.Components.it0
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // org.telegram.ui.Components.it0
    public final void q1(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        super.q1(z10);
        h90 h90Var = this.x2;
        if (h90Var.d0()) {
            if (z10) {
                v1(null);
            }
            this.P1 = z10;
        }
        te.a aVar = h90Var.P;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean x0() {
        h90 h90Var = this.x2;
        return h90Var.a == 0 && h90Var.e == h90Var.getUserConfig().e() && h90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean y0() {
        return this.x2.d0();
    }
}
