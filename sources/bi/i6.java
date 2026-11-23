package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i6 extends v4.w {
    public final /* synthetic */ gq0 d;
    public final /* synthetic */ m6 e;

    public i6(m6 m6Var, gq0 gq0Var) {
        this.e = m6Var;
        this.d = gq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof g3) {
            return ((g3) view).getSavedGift();
        }
        return null;
    }

    @Override // v4.w
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.a.setPressed(false);
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        return r(s(f1Var)) ? v4.w.l(15, 0) : v4.w.l(0, 0);
    }

    @Override // v4.w
    public final boolean j() {
        return this.e.h;
    }

    @Override // v4.w
    public final boolean k() {
        return this.e.h;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        di.t0 t0Var;
        m6 m6Var = this.e;
        f6 f6Var = m6Var.f;
        if (m6Var.e == null || !m6Var.h || !r(s(f1Var)) || !r(s(f1Var2))) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        int indexOf = m6Var.e.l.indexOf(s(f1Var));
        int indexOf2 = m6Var.e.l.indexOf(s(f1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = m6Var.d;
        gq0 gq0Var = this.d;
        if (z10) {
            m6Var.e.n(indexOf, indexOf2);
            gq0Var.e.n(m6Var.e.d);
        } else {
            di.p8 p8Var = m6Var.e;
            if (p8Var.q == null) {
                p8Var.q = p8Var.i();
            }
            p8Var.n(indexOf, indexOf2);
        }
        f6Var.g3.j(b10, b11);
        f6Var.g3.T();
        if (m6Var.d) {
            HashMap hashMap = s6.V;
            gq0Var.f(true);
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).w0) != null) {
            t0Var.a();
        }
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        m6 m6Var = this.e;
        if (i7 != 0) {
            f6 f6Var = m6Var.f;
            if (f6Var != null) {
                f6Var.I0(false);
            }
            if (f1Var != null) {
                f1Var.a.setPressed(true);
                return;
            }
            return;
        }
        di.p8 p8Var = m6Var.e;
        if (p8Var != null) {
            ArrayList arrayList = p8Var.q;
            if (arrayList != null) {
                ArrayList i10 = p8Var.i();
                if (arrayList.size() == i10.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == i10.get(i11)) {
                        }
                    }
                }
                p8Var.p();
                p8Var.q = null;
                return;
            }
            p8Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m6 m6Var = this.e;
        if (!m6Var.h) {
            return false;
        }
        if (m6Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }
}
