package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import jh.k7;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j3 extends f2.b0 {
    public final /* synthetic */ gr0 d;
    public final /* synthetic */ n3 e;

    public j3(n3 n3Var, gr0 gr0Var) {
        this.e = n3Var;
        this.d = gr0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        View view = n1Var.a;
        return r(view instanceof y1 ? ((y1) view).getSavedGift() : null) ? f2.b0.l(15, 0) : f2.b0.l(0, 0);
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
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        jh.u0 u0Var;
        n3 n3Var = this.e;
        h3 h3Var = n3Var.f;
        if (n3Var.e == null || !n3Var.n) {
            return false;
        }
        View view = n1Var.a;
        if (!r(view instanceof y1 ? ((y1) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = n1Var2.a;
        if (!r(view2 instanceof y1 ? ((y1) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        boolean z10 = n3Var.d;
        gr0 gr0Var = this.d;
        if (z10) {
            n3Var.e.k(b10, b11);
            gr0Var.e.n(n3Var.e.d);
        } else {
            k7 k7Var = n3Var.e;
            if (k7Var.q == null) {
                k7Var.q = k7Var.h();
            }
            k7Var.k(b10, b11);
        }
        h3Var.U2.p(b10, b11);
        h3Var.U2.S();
        if (n3Var.d) {
            HashMap hashMap = x3.P;
            gr0Var.f(true);
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (u0Var = ((ProfileActivity) U).r0) != null) {
            u0Var.a();
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        n3 n3Var = this.e;
        if (i10 != 0) {
            h3 h3Var = n3Var.f;
            if (h3Var != null) {
                h3Var.I0(false);
            }
            if (n1Var != null) {
                n1Var.a.setPressed(true);
                return;
            }
            return;
        }
        k7 k7Var = n3Var.e;
        if (k7Var != null) {
            ArrayList arrayList = k7Var.q;
            if (arrayList != null) {
                ArrayList h = k7Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                k7Var.l();
                k7Var.q = null;
                return;
            }
            k7Var.q = null;
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
    public final void q(f2.n1 n1Var) {
    }
}
