package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ta0 extends bw0 {
    public final /* synthetic */ ua0 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(ua0 ua0Var, Context context, long j10, tv0 tv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ua0 ua0Var2, sa0 sa0Var, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context, j10, tv0Var, 0, null, chatFull, userFull, i10, 0, ua0Var2, sa0Var, 0, u6Var, bVar);
        this.r2 = ua0Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean D0() {
        return this.r2.Z();
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean G() {
        return !this.r2.Z();
    }

    @Override // org.telegram.ui.Components.bw0
    public final void K0(SparseArray sparseArray) {
        int size = sparseArray.size();
        ua0 ua0Var = this.r2;
        ua0Var.v = sparseArray;
        fi.d dVar = ua0Var.N;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            ua0Var.N.b(size, true);
            if (ua0Var.R.getClosestTab() == 8) {
                ua0Var.N.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.bw0
    public final void R0(boolean z10) {
        int i10;
        ua0 ua0Var = this.r2;
        Activity parentActivity = ua0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) ua0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
    }

    @Override // org.telegram.ui.Components.bw0
    public final void S0() {
        super.S0();
        this.r2.c0();
    }

    @Override // org.telegram.ui.Components.bw0
    public final void T0(float f7) {
        ua0 ua0Var = this.r2;
        if (ua0Var.a != 1) {
            return;
        }
        int i10 = Math.round(f7 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.tg0 tg0Var = ua0Var.J;
        if (tg0Var != null && ua0Var.L != i10) {
            ua0Var.L = i10;
            tg0Var.q(ua0Var.K[i10], true);
        }
        ua0Var.d0(true);
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean V() {
        ua0 ua0Var = this.r2;
        return ua0Var.Z() || ua0Var.a == 3;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int getInitialTab() {
        return this.r2.S;
    }

    @Override // org.telegram.ui.Components.bw0
    public final String getStoriesHashtag() {
        return this.r2.h;
    }

    @Override // org.telegram.ui.Components.bw0
    public final String getStoriesHashtagUsername() {
        return this.r2.n;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void k1(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        super.k1(z10);
        ua0 ua0Var = this.r2;
        if (ua0Var.Z()) {
            if (z10) {
                p1(null);
            }
            this.O1 = z10;
        }
        oe.b bVar = ua0Var.O;
        if (bVar != null) {
            bVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean u0() {
        ua0 ua0Var = this.r2;
        return ua0Var.a == 0 && ua0Var.e == ua0Var.getUserConfig().getClientUserId() && ua0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean v0() {
        return this.r2.Z();
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean x0() {
        return this.r2.a == 2;
    }
}
