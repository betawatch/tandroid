package gh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hh.m7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p3 extends f2.c0 {
    public final /* synthetic */ wq0 d;
    public final /* synthetic */ t3 e;

    public p3(t3 t3Var, wq0 wq0Var) {
        this.e = t3Var;
        this.d = wq0Var;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.a.setPressed(false);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        View view = o1Var.a;
        return r(view instanceof b2 ? ((b2) view).getSavedGift() : null) ? f2.c0.l(15, 0) : f2.c0.l(0, 0);
    }

    @Override // f2.c0
    public final boolean j() {
        return this.e.n;
    }

    @Override // f2.c0
    public final boolean k() {
        return this.e.n;
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        hh.v0 v0Var;
        t3 t3Var = this.e;
        n3 n3Var = t3Var.f;
        if (t3Var.e == null || !t3Var.n) {
            return false;
        }
        View view = o1Var.a;
        if (!r(view instanceof b2 ? ((b2) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = o1Var2.a;
        if (!r(view2 instanceof b2 ? ((b2) view2).getSavedGift() : null)) {
            return false;
        }
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        boolean z10 = t3Var.d;
        wq0 wq0Var = this.d;
        if (z10) {
            t3Var.e.k(b10, b11);
            wq0Var.e.n(t3Var.e.d);
        } else {
            m7 m7Var = t3Var.e;
            if (m7Var.q == null) {
                m7Var.q = m7Var.h();
            }
            m7Var.k(b10, b11);
        }
        n3Var.U2.p(b10, b11);
        n3Var.U2.S();
        if (t3Var.d) {
            HashMap hashMap = d4.P;
            wq0Var.f(true);
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if ((U instanceof ProfileActivity) && (v0Var = ((ProfileActivity) U).r0) != null) {
            v0Var.a();
        }
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        t3 t3Var = this.e;
        if (i10 != 0) {
            n3 n3Var = t3Var.f;
            if (n3Var != null) {
                n3Var.I0(false);
            }
            if (o1Var != null) {
                o1Var.a.setPressed(true);
                return;
            }
            return;
        }
        m7 m7Var = t3Var.e;
        if (m7Var != null) {
            ArrayList arrayList = m7Var.q;
            if (arrayList != null) {
                ArrayList h = m7Var.h();
                if (arrayList.size() == h.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == h.get(i11)) {
                        }
                    }
                }
                m7Var.l();
                m7Var.q = null;
                return;
            }
            m7Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        t3 t3Var = this.e;
        if (!t3Var.n) {
            return false;
        }
        if (t3Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
