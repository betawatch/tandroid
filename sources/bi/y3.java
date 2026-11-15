package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.m8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y3 extends v4.v {
    public final /* synthetic */ wp0 d;
    public final /* synthetic */ c4 e;

    public y3(c4 c4Var, wp0 wp0Var) {
        this.e = c4Var;
        this.d = wp0Var;
    }

    public static TL_stars.SavedStarGift s(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof i2) {
            return ((i2) view).getSavedGift();
        }
        return null;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        return r(s(e1Var)) ? v4.v.l(15, 0) : v4.v.l(0, 0);
    }

    @Override // v4.v
    public final boolean j() {
        return this.e.h;
    }

    @Override // v4.v
    public final boolean k() {
        return this.e.h;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        di.u0 u0Var;
        c4 c4Var = this.e;
        v3 v3Var = c4Var.f;
        if (c4Var.e == null || !c4Var.h || !r(s(e1Var)) || !r(s(e1Var2))) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        int indexOf = c4Var.e.l.indexOf(s(e1Var));
        int indexOf2 = c4Var.e.l.indexOf(s(e1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = c4Var.d;
        wp0 wp0Var = this.d;
        if (z10) {
            c4Var.e.m(indexOf, indexOf2);
            wp0Var.e.n(c4Var.e.d);
        } else {
            m8 m8Var = c4Var.e;
            if (m8Var.q == null) {
                m8Var.q = m8Var.i();
            }
            m8Var.m(indexOf, indexOf2);
        }
        v3Var.g3.j(b10, b11);
        v3Var.g3.T();
        if (c4Var.d) {
            HashMap hashMap = i4.V;
            wp0Var.f(true);
        }
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (u0Var = ((ProfileActivity) T).w0) != null) {
            u0Var.a();
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.e1 e1Var, int i7) {
        c4 c4Var = this.e;
        if (i7 != 0) {
            v3 v3Var = c4Var.f;
            if (v3Var != null) {
                v3Var.I0(false);
            }
            if (e1Var != null) {
                e1Var.a.setPressed(true);
                return;
            }
            return;
        }
        m8 m8Var = c4Var.e;
        if (m8Var != null) {
            ArrayList arrayList = m8Var.q;
            if (arrayList != null) {
                ArrayList i10 = m8Var.i();
                if (arrayList.size() == i10.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == i10.get(i11)) {
                        }
                    }
                }
                m8Var.n();
                m8Var.q = null;
                return;
            }
            m8Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        c4 c4Var = this.e;
        if (!c4Var.h) {
            return false;
        }
        if (c4Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // v4.v
    public final void q(v4.e1 e1Var) {
    }
}
