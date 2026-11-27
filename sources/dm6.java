// default package

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dm6 extends eja {
    public final /* synthetic */ em6 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm6(em6 em6Var, Context context, long j, wia wiaVar, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i, em6 em6Var2, cm6 cm6Var, vnb vnbVar, ll0 ll0Var) {
        super(context, j, wiaVar, 0, null, chatFull, userFull, i, 0, em6Var2, cm6Var, 0, vnbVar, ll0Var);
        this.x2 = em6Var;
    }

    @Override // eja
    public final boolean H() {
        em6 em6Var = this.x2;
        return em6Var.c0() || em6Var.a == 3;
    }

    @Override // eja
    public final void J0(SparseArray sparseArray) {
        int size = sparseArray.size();
        em6 em6Var = this.x2;
        em6Var.w = sparseArray;
        c51 c51Var = em6Var.O;
        if (c51Var != null) {
            c51Var.setEnabled(size > 0);
            em6Var.O.c(size, true);
            if (em6Var.S.getClosestTab() == 8) {
                em6Var.O.i(ob6.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // eja
    public final void R0(boolean z) {
        int i;
        em6 em6Var = this.x2;
        Activity parentActivity = em6Var.getParentActivity();
        i = ((e) em6Var).classGuid;
        hl.y2(parentActivity, i);
    }

    @Override // eja
    public final void S0() {
        super.S0();
        this.x2.e0();
    }

    @Override // eja
    public final void T0(float f) {
        em6 em6Var = this.x2;
        if (em6Var.a != 1) {
            return;
        }
        int i = Math.round(f - 8.0f) > 0 ? 1 : 0;
        hj6 hj6Var = em6Var.K;
        if (hj6Var != null && em6Var.M != i) {
            em6Var.M = i;
            hj6Var.r(em6Var.L[i], true);
        }
        em6Var.f0(true);
    }

    @Override // eja
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // eja
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // eja
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // eja
    public final boolean h0() {
        em6 em6Var = this.x2;
        return em6Var.a == 0 && em6Var.e == em6Var.getUserConfig().e() && em6Var.f == 0;
    }

    @Override // eja
    public final boolean i0() {
        return this.x2.c0();
    }

    @Override // eja
    public final boolean k0() {
        return this.x2.a == 2;
    }

    @Override // eja
    public final void l1(boolean z) {
        if (this.F1 != z) {
            super.l1(z);
            em6 em6Var = this.x2;
            if (em6Var.c0()) {
                if (z) {
                    r1(null);
                }
                this.P1 = z;
            }
            fm0 fm0Var = em6Var.P;
            if (fm0Var != null) {
                fm0Var.a(z, true);
            }
        }
    }

    @Override // eja
    public final boolean q() {
        return !this.x2.c0();
    }

    @Override // eja
    public final boolean s0() {
        return this.x2.c0();
    }
}
