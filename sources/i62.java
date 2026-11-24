// default package

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i62 extends le8 {
    public final /* synthetic */ s20 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(s20 s20Var, Context context, int i, e62 e62Var, wjb wjbVar) {
        super(context, i, e62Var, wjbVar);
        this.G = s20Var;
        ((k62) s20Var.e).s.getChildCount();
    }

    @Override // le8
    public final boolean f() {
        k62 k62Var = (k62) this.G.e;
        rkb rkbVar = k62Var.s;
        View F = rkbVar.F(this);
        s49 T = F == null ? null : rkbVar.T(F);
        if (T != null) {
            int b = T.b();
            int i = k62Var.N;
            if (i == k62Var.K && b == (k62Var.u0 + i) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // le8
    public final boolean g(le8 le8Var) {
        int b;
        k62 k62Var = (k62) this.G.e;
        rkb rkbVar = k62Var.s;
        View F = rkbVar.F(le8Var);
        s49 T = F == null ? null : rkbVar.T(F);
        if (T == null || (b = T.b()) == -1) {
            return false;
        }
        return k62Var.M[b - k62Var.u0];
    }

    @Override // le8
    public final void h(py pyVar, ActionMode actionMode) {
        k62 k62Var = (k62) this.G.e;
        if (k62Var.n && pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) != null) {
                mu1.v6(menu, ((mu1) k62Var.b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override // le8
    public final void i(le8 le8Var, boolean z) {
        int b;
        k62 k62Var = (k62) this.G.e;
        if (z && k62Var.d0 && !k62Var.c0) {
            Arrays.fill(k62Var.M, false);
            for (int i = k62Var.u0; i < k62Var.u0 + k62Var.N; i++) {
                s49 K = k62Var.s.K(i);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof le8) {
                        ((le8) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(le8Var, z);
        rkb rkbVar = k62Var.s;
        View F = rkbVar.F(le8Var);
        s49 T = F == null ? null : rkbVar.T(F);
        if (T != null && (b = T.b()) != -1) {
            k62Var.M[b - k62Var.u0] = z;
        }
        k62Var.T();
    }

    @Override // le8
    public final void j(boolean z) {
        ((k62) this.G.e).b0(this, z);
    }

    @Override // le8
    public final void k(le8 le8Var) {
        ((k62) this.G.e).c0(le8Var);
    }

    @Override // le8
    public final void l(py pyVar) {
        ((k62) this.G.e).b.c1(pyVar, true);
    }

    @Override // le8
    public final boolean m(ArrayList arrayList) {
        k62 k62Var = (k62) this.G.e;
        if (!arrayList.isEmpty()) {
            k62Var.s.getClass();
            int R = RecyclerView.R(this) - k62Var.u0;
            if (R >= 0) {
                py pyVar = this.d;
                pyVar.getText().replace(pyVar.getSelectionStart(), pyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i = R + 1;
                while (!arrayList.isEmpty() && i < k62Var.K) {
                    for (int length = k62Var.L.length - 1; length > i; length--) {
                        CharSequence[] charSequenceArr = k62Var.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    k62Var.L[i] = (CharSequence) arrayList.remove(0);
                    k62Var.N++;
                    i++;
                }
                k62Var.n0();
                k62Var.l0 = (k62Var.u0 + i) - 1;
                k62Var.s.setItemAnimator(k62Var.w);
                k62Var.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // le8
    public final boolean q() {
        return ((k62) this.G.e).d0;
    }
}
