package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u80 extends ys0 {
    public final /* synthetic */ v80 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(v80 v80Var, Context context, long j3, qs0 qs0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, v80 v80Var2, t80 t80Var, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(context, j3, qs0Var, 0, null, chatFull, userFull, i7, 0, v80Var2, t80Var, 0, h6Var, cVar);
        this.w2 = v80Var;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean A0() {
        return this.w2.a == 2;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean I() {
        return !this.w2.d0();
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean I0() {
        return this.w2.d0();
    }

    @Override // org.telegram.ui.Components.ys0
    public final void P0(SparseArray sparseArray) {
        int size = sparseArray.size();
        v80 v80Var = this.w2;
        v80Var.w = sparseArray;
        fi.d dVar = v80Var.N;
        if (dVar != null) {
            dVar.setEnabled(size > 0);
            v80Var.N.c(size, true);
            if (v80Var.R.getClosestTab() == 8) {
                v80Var.N.i(org.telegram.messenger.id.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final void X0(boolean z9) {
        int i7;
        v80 v80Var = this.w2;
        Activity parentActivity = v80Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) v80Var).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean Y() {
        v80 v80Var = this.w2;
        return v80Var.d0() || v80Var.a == 3;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Y0() {
        super.Y0();
        this.w2.g0();
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Z0(float f10) {
        v80 v80Var = this.w2;
        if (v80Var.a != 1) {
            return;
        }
        int i7 = Math.round(f10 - 8.0f) > 0 ? 1 : 0;
        org.telegram.ui.oe0 oe0Var = v80Var.J;
        if (oe0Var != null && v80Var.L != i7) {
            v80Var.L = i7;
            oe0Var.q(v80Var.K[i7], true);
        }
        v80Var.h0(true);
    }

    @Override // org.telegram.ui.Components.ys0
    public final int getInitialTab() {
        return this.w2.S;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtag() {
        return this.w2.h;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtagUsername() {
        return this.w2.n;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void q1(boolean z9) {
        if (this.E1 == z9) {
            return;
        }
        super.q1(z9);
        v80 v80Var = this.w2;
        if (v80Var.d0()) {
            if (z9) {
                v1(null);
            }
            this.O1 = z9;
        }
        te.a aVar = v80Var.O;
        if (aVar != null) {
            aVar.a(z9, true);
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean x0() {
        v80 v80Var = this.w2;
        return v80Var.a == 0 && v80Var.e == v80Var.getUserConfig().e() && v80Var.f == 0;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean y0() {
        return this.w2.d0();
    }
}
