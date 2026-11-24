// default package

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bm6 extends nha {
    public final /* synthetic */ cm6 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm6(cm6 cm6Var, Context context, long j, fha fhaVar, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i, cm6 cm6Var2, am6 am6Var, ylb ylbVar, km0 km0Var) {
        super(context, j, fhaVar, 0, null, chatFull, userFull, i, 0, cm6Var2, am6Var, 0, ylbVar, km0Var);
        this.x2 = cm6Var;
    }

    @Override // nha
    public final boolean H() {
        cm6 cm6Var = this.x2;
        return cm6Var.d0() || cm6Var.a == 3;
    }

    @Override // nha
    public final void J0(SparseArray sparseArray) {
        int size = sparseArray.size();
        cm6 cm6Var = this.x2;
        cm6Var.w = sparseArray;
        b61 b61Var = cm6Var.O;
        if (b61Var != null) {
            b61Var.setEnabled(size > 0);
            cm6Var.O.c(size, true);
            if (cm6Var.S.getClosestTab() == 8) {
                cm6Var.O.i(jb6.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // nha
    public final void R0(boolean z) {
        int i;
        cm6 cm6Var = this.x2;
        Activity parentActivity = cm6Var.getParentActivity();
        i = ((d) cm6Var).classGuid;
        gm.y2(parentActivity, i);
    }

    @Override // nha
    public final void S0() {
        super.S0();
        this.x2.f0();
    }

    @Override // nha
    public final void T0(float f) {
        cm6 cm6Var = this.x2;
        if (cm6Var.a != 1) {
            return;
        }
        int i = Math.round(f - 8.0f) > 0 ? 1 : 0;
        ej6 ej6Var = cm6Var.K;
        if (ej6Var != null && cm6Var.M != i) {
            cm6Var.M = i;
            ej6Var.r(cm6Var.L[i], true);
        }
        cm6Var.g0(true);
    }

    @Override // nha
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // nha
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // nha
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // nha
    public final boolean h0() {
        cm6 cm6Var = this.x2;
        return cm6Var.a == 0 && cm6Var.e == cm6Var.getUserConfig().e() && cm6Var.f == 0;
    }

    @Override // nha
    public final boolean i0() {
        return this.x2.d0();
    }

    @Override // nha
    public final boolean k0() {
        return this.x2.a == 2;
    }

    @Override // nha
    public final void l1(boolean z) {
        if (this.F1 != z) {
            super.l1(z);
            cm6 cm6Var = this.x2;
            if (cm6Var.d0()) {
                if (z) {
                    r1(null);
                }
                this.P1 = z;
            }
            fn0 fn0Var = cm6Var.P;
            if (fn0Var != null) {
                fn0Var.a(z, true);
            }
        }
    }

    @Override // nha
    public final boolean q() {
        return !this.x2.d0();
    }

    @Override // nha
    public final boolean s0() {
        return this.x2.d0();
    }
}
