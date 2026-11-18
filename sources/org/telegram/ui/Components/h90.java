package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h90 extends gt0 {
    public final /* synthetic */ i90 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(i90 i90Var, Context context, long j3, ys0 ys0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, i90 i90Var2, g90 g90Var, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context, j3, ys0Var, 0, null, chatFull, userFull, i7, 0, i90Var2, g90Var, 0, i6Var, cVar);
        this.x2 = i90Var;
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean A0() {
        return this.x2.a == 2;
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean I() {
        return !this.x2.d0();
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean I0() {
        return this.x2.d0();
    }

    @Override // org.telegram.ui.Components.gt0
    public final void P0(SparseArray sparseArray) {
        int size = sparseArray.size();
        i90 i90Var = this.x2;
        i90Var.w = sparseArray;
        hi.d dVar = i90Var.O;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            i90Var.O.c(size, true);
            if (i90Var.S.getClosestTab() == 8) {
                i90Var.O.i(org.telegram.messenger.gd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gt0
    public final void X0(boolean z10) {
        int i7;
        i90 i90Var = this.x2;
        Activity parentActivity = i90Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.h2) i90Var).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean Y() {
        i90 i90Var = this.x2;
        return i90Var.d0() || i90Var.a == 3;
    }

    @Override // org.telegram.ui.Components.gt0
    public final void Y0() {
        super.Y0();
        this.x2.g0();
    }

    @Override // org.telegram.ui.Components.gt0
    public final void Z0(float f10) {
        i90 i90Var = this.x2;
        if (i90Var.a != 1) {
            return;
        }
        int i7 = Math.round(f10 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.ne0 ne0Var = i90Var.K;
        if (ne0Var != null && i90Var.M != i7) {
            i90Var.M = i7;
            ne0Var.r(i90Var.L[i7], true);
        }
        i90Var.h0(true);
    }

    @Override // org.telegram.ui.Components.gt0
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // org.telegram.ui.Components.gt0
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // org.telegram.ui.Components.gt0
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // org.telegram.ui.Components.gt0
    public final void q1(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        super.q1(z10);
        i90 i90Var = this.x2;
        if (i90Var.d0()) {
            if (z10) {
                v1(null);
            }
            this.P1 = z10;
        }
        te.a aVar = i90Var.P;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean x0() {
        i90 i90Var = this.x2;
        return i90Var.a == 0 && i90Var.e == i90Var.getUserConfig().e() && i90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean y0() {
        return this.x2.d0();
    }
}
