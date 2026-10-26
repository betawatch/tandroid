package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sa0 extends aw0 {
    public final /* synthetic */ ta0 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(ta0 ta0Var, Context context, long j10, sv0 sv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ta0 ta0Var2, ra0 ra0Var, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context, j10, sv0Var, 0, null, chatFull, userFull, i10, 0, ta0Var2, ra0Var, 0, u6Var, bVar);
        this.r2 = ta0Var;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean D0() {
        return this.r2.Z();
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean G() {
        return !this.r2.Z();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void K0(SparseArray sparseArray) {
        int size = sparseArray.size();
        ta0 ta0Var = this.r2;
        ta0Var.v = sparseArray;
        fi.d dVar = ta0Var.N;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            ta0Var.N.b(size, true);
            if (ta0Var.R.getClosestTab() == 8) {
                ta0Var.N.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final void R0(boolean z10) {
        int i10;
        ta0 ta0Var = this.r2;
        Activity parentActivity = ta0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) ta0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
    }

    @Override // org.telegram.ui.Components.aw0
    public final void S0() {
        super.S0();
        this.r2.c0();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void T0(float f7) {
        ta0 ta0Var = this.r2;
        if (ta0Var.a != 1) {
            return;
        }
        int i10 = Math.round(f7 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.rg0 rg0Var = ta0Var.J;
        if (rg0Var != null && ta0Var.L != i10) {
            ta0Var.L = i10;
            rg0Var.q(ta0Var.K[i10], true);
        }
        ta0Var.d0(true);
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean V() {
        ta0 ta0Var = this.r2;
        return ta0Var.Z() || ta0Var.a == 3;
    }

    @Override // org.telegram.ui.Components.aw0
    public final int getInitialTab() {
        return this.r2.S;
    }

    @Override // org.telegram.ui.Components.aw0
    public final String getStoriesHashtag() {
        return this.r2.h;
    }

    @Override // org.telegram.ui.Components.aw0
    public final String getStoriesHashtagUsername() {
        return this.r2.n;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void k1(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        super.k1(z10);
        ta0 ta0Var = this.r2;
        if (ta0Var.Z()) {
            if (z10) {
                p1(null);
            }
            this.O1 = z10;
        }
        oe.b bVar = ta0Var.O;
        if (bVar != null) {
            bVar.a(z10, true);
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean u0() {
        ta0 ta0Var = this.r2;
        return ta0Var.a == 0 && ta0Var.e == ta0Var.getUserConfig().getClientUserId() && ta0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean v0() {
        return this.r2.Z();
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean x0() {
        return this.r2.a == 2;
    }
}
