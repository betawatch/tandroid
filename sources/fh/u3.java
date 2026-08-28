package fh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gh.n7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u3 extends f2.d0 {
    public final /* synthetic */ vq0 d;
    public final /* synthetic */ y3 e;

    public u3(y3 y3Var, vq0 vq0Var) {
        this.e = y3Var;
        this.d = vq0Var;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.a.setPressed(false);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        View view = q1Var.a;
        return r(view instanceof f2 ? ((f2) view).getSavedGift() : null) ? f2.d0.l(15, 0) : f2.d0.l(0, 0);
    }

    @Override // f2.d0
    public final boolean j() {
        return this.e.n;
    }

    @Override // f2.d0
    public final boolean k() {
        return this.e.n;
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        gh.v0 v0Var;
        y3 y3Var = this.e;
        s3 s3Var = y3Var.f;
        if (y3Var.e == null || !y3Var.n) {
            return false;
        }
        View view = q1Var.a;
        if (!r(view instanceof f2 ? ((f2) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = q1Var2.a;
        if (!r(view2 instanceof f2 ? ((f2) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        boolean z10 = y3Var.d;
        vq0 vq0Var = this.d;
        if (z10) {
            y3Var.e.k(b10, b11);
            vq0Var.e.n(y3Var.e.d);
        } else {
            n7 n7Var = y3Var.e;
            if (n7Var.q == null) {
                n7Var.q = n7Var.h();
            }
            n7Var.k(b10, b11);
        }
        s3Var.U2.p(b10, b11);
        s3Var.U2.S();
        if (y3Var.d) {
            HashMap hashMap = j4.P;
            vq0Var.f(true);
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (v0Var = ((ProfileActivity) U).r0) != null) {
            v0Var.a();
        }
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        y3 y3Var = this.e;
        if (i9 != 0) {
            s3 s3Var = y3Var.f;
            if (s3Var != null) {
                s3Var.I0(false);
            }
            if (q1Var != null) {
                q1Var.a.setPressed(true);
                return;
            }
            return;
        }
        n7 n7Var = y3Var.e;
        if (n7Var != null) {
            ArrayList arrayList = n7Var.q;
            if (arrayList != null) {
                ArrayList h = n7Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) == h.get(i10)) {
                        }
                    }
                }
                n7Var.l();
                n7Var.q = null;
                return;
            }
            n7Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        y3 y3Var = this.e;
        if (!y3Var.n) {
            return false;
        }
        if (y3Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}
