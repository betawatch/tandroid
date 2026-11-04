package ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.v8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k4 extends u4.v {
    public final /* synthetic */ vp0 d;
    public final /* synthetic */ o4 e;

    public k4(o4 o4Var, vp0 vp0Var) {
        this.e = o4Var;
        this.d = vp0Var;
    }

    public static TL_stars.SavedStarGift s(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof q2) {
            return ((q2) view).getSavedGift();
        }
        return null;
    }

    @Override // u4.v
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // u4.v
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        return r(s(d1Var)) ? u4.v.l(15, 0) : u4.v.l(0, 0);
    }

    @Override // u4.v
    public final boolean j() {
        return this.e.h;
    }

    @Override // u4.v
    public final boolean k() {
        return this.e.h;
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        ci.z0 z0Var;
        o4 o4Var = this.e;
        h4 h4Var = o4Var.f;
        if (o4Var.e == null || !o4Var.h || !r(s(d1Var)) || !r(s(d1Var2))) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        int indexOf = o4Var.e.l.indexOf(s(d1Var));
        int indexOf2 = o4Var.e.l.indexOf(s(d1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = o4Var.d;
        vp0 vp0Var = this.d;
        if (z10) {
            o4Var.e.m(indexOf, indexOf2);
            vp0Var.e.n(o4Var.e.d);
        } else {
            v8 v8Var = o4Var.e;
            if (v8Var.q == null) {
                v8Var.q = v8Var.i();
            }
            v8Var.m(indexOf, indexOf2);
        }
        h4Var.g3.j(b10, b11);
        h4Var.g3.T();
        if (o4Var.d) {
            HashMap hashMap = u4.V;
            vp0Var.f(true);
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (z0Var = ((ProfileActivity) T).w0) != null) {
            z0Var.a();
        }
        return true;
    }

    @Override // u4.v
    public final void p(u4.d1 d1Var, int i3) {
        o4 o4Var = this.e;
        if (i3 != 0) {
            h4 h4Var = o4Var.f;
            if (h4Var != null) {
                h4Var.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        v8 v8Var = o4Var.e;
        if (v8Var != null) {
            ArrayList arrayList = v8Var.q;
            if (arrayList != null) {
                ArrayList i10 = v8Var.i();
                if (arrayList.size() == i10.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == i10.get(i11)) {
                        }
                    }
                }
                v8Var.n();
                v8Var.q = null;
                return;
            }
            v8Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        o4 o4Var = this.e;
        if (!o4Var.h) {
            return false;
        }
        if (o4Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // u4.v
    public final void q(u4.d1 d1Var) {
    }
}
