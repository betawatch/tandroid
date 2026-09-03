package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import mh.l7;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j3 extends f2.b0 {
    public final /* synthetic */ or0 d;
    public final /* synthetic */ n3 e;

    public j3(n3 n3Var, or0 or0Var) {
        this.e = n3Var;
        this.d = or0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        View view = m1Var.a;
        return r(view instanceof x1 ? ((x1) view).getSavedGift() : null) ? f2.b0.l(15, 0) : f2.b0.l(0, 0);
    }

    @Override // f2.b0
    public final boolean j() {
        return this.e.n;
    }

    @Override // f2.b0
    public final boolean k() {
        return this.e.n;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        mh.t0 t0Var;
        n3 n3Var = this.e;
        h3 h3Var = n3Var.f;
        if (n3Var.e == null || !n3Var.n) {
            return false;
        }
        View view = m1Var.a;
        if (!r(view instanceof x1 ? ((x1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = m1Var2.a;
        if (!r(view2 instanceof x1 ? ((x1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        boolean z4 = n3Var.d;
        or0 or0Var = this.d;
        if (z4) {
            n3Var.e.k(b10, b11);
            or0Var.e.n(n3Var.e.d);
        } else {
            l7 l7Var = n3Var.e;
            if (l7Var.q == null) {
                l7Var.q = l7Var.h();
            }
            l7Var.k(b10, b11);
        }
        h3Var.V2.p(b10, b11);
        h3Var.V2.S();
        if (n3Var.d) {
            HashMap hashMap = x3.Q;
            or0Var.f(true);
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (t0Var = ((ProfileActivity) U).s0) != null) {
            t0Var.a();
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        n3 n3Var = this.e;
        if (i10 != 0) {
            h3 h3Var = n3Var.f;
            if (h3Var != null) {
                h3Var.I0(false);
            }
            if (m1Var != null) {
                m1Var.a.setPressed(true);
                return;
            }
            return;
        }
        l7 l7Var = n3Var.e;
        if (l7Var != null) {
            ArrayList arrayList = l7Var.q;
            if (arrayList != null) {
                ArrayList h = l7Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                l7Var.l();
                l7Var.q = null;
                return;
            }
            l7Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n3 n3Var = this.e;
        if (!n3Var.n) {
            return false;
        }
        if (n3Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }
}
