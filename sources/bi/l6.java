package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l6 extends v4.w {
    public final /* synthetic */ fq0 d;
    public final /* synthetic */ p6 e;

    public l6(p6 p6Var, fq0 fq0Var) {
        this.e = p6Var;
        this.d = fq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof i3) {
            return ((i3) view).getSavedGift();
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
        p6 p6Var = this.e;
        i6 i6Var = p6Var.f;
        if (p6Var.e == null || !p6Var.h || !r(s(f1Var)) || !r(s(f1Var2))) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        int indexOf = p6Var.e.l.indexOf(s(f1Var));
        int indexOf2 = p6Var.e.l.indexOf(s(f1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = p6Var.d;
        fq0 fq0Var = this.d;
        if (z10) {
            p6Var.e.n(indexOf, indexOf2);
            fq0Var.e.n(p6Var.e.d);
        } else {
            di.p8 p8Var = p6Var.e;
            if (p8Var.q == null) {
                p8Var.q = p8Var.i();
            }
            p8Var.n(indexOf, indexOf2);
        }
        i6Var.g3.j(b10, b11);
        i6Var.g3.T();
        if (p6Var.d) {
            HashMap hashMap = v6.V;
            fq0Var.f(true);
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).w0) != null) {
            t0Var.a();
        }
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        p6 p6Var = this.e;
        if (i7 != 0) {
            i6 i6Var = p6Var.f;
            if (i6Var != null) {
                i6Var.I0(false);
            }
            if (f1Var != null) {
                f1Var.a.setPressed(true);
                return;
            }
            return;
        }
        di.p8 p8Var = p6Var.e;
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
        p6 p6Var = this.e;
        if (!p6Var.h) {
            return false;
        }
        if (p6Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }
}
