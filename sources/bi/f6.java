package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f6 extends v4.w {
    public final /* synthetic */ eq0 d;
    public final /* synthetic */ j6 e;

    public f6(j6 j6Var, eq0 eq0Var) {
        this.e = j6Var;
        this.d = eq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof c3) {
            return ((c3) view).getSavedGift();
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
        j6 j6Var = this.e;
        c6 c6Var = j6Var.f;
        if (j6Var.e == null || !j6Var.h || !r(s(f1Var)) || !r(s(f1Var2))) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        int indexOf = j6Var.e.l.indexOf(s(f1Var));
        int indexOf2 = j6Var.e.l.indexOf(s(f1Var2));
        if (indexOf < 0 || indexOf2 < 0) {
            return false;
        }
        boolean z10 = j6Var.d;
        eq0 eq0Var = this.d;
        if (z10) {
            j6Var.e.n(indexOf, indexOf2);
            eq0Var.e.n(j6Var.e.d);
        } else {
            di.o8 o8Var = j6Var.e;
            if (o8Var.q == null) {
                o8Var.q = o8Var.i();
            }
            o8Var.n(indexOf, indexOf2);
        }
        c6Var.g3.j(b10, b11);
        c6Var.g3.T();
        if (j6Var.d) {
            HashMap hashMap = p6.V;
            eq0Var.f(true);
        }
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).w0) != null) {
            t0Var.a();
        }
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        j6 j6Var = this.e;
        if (i7 != 0) {
            c6 c6Var = j6Var.f;
            if (c6Var != null) {
                c6Var.I0(false);
            }
            if (f1Var != null) {
                f1Var.a.setPressed(true);
                return;
            }
            return;
        }
        di.o8 o8Var = j6Var.e;
        if (o8Var != null) {
            ArrayList arrayList = o8Var.q;
            if (arrayList != null) {
                ArrayList i10 = o8Var.i();
                if (arrayList.size() == i10.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == i10.get(i11)) {
                        }
                    }
                }
                o8Var.p();
                o8Var.q = null;
                return;
            }
            o8Var.q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        j6 j6Var = this.e;
        if (!j6Var.h) {
            return false;
        }
        if (j6Var.e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }
}
