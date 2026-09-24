package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ov0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ pv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(pv0 pv0Var, Context context, int i10, f60 f60Var) {
        super(context, i10, f60Var, null);
        this.F = pv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        rv0 rv0Var = this.F.d;
        wb1 wb1Var = rv0Var.c;
        View F = wb1Var.F(this);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = rv0Var.y;
            if (i10 == rv0Var.n && b10 == (rv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        rv0 rv0Var = this.F.d;
        wb1 wb1Var = rv0Var.c;
        View F = wb1Var.F(d6Var);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return rv0Var.w[b10 - rv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            wn.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        rv0 rv0Var = this.F.d;
        if (z10 && rv0Var.L) {
            Arrays.fill(rv0Var.w, false);
            rv0Var.c.getChildCount();
            for (int i10 = rv0Var.n0; i10 < rv0Var.n0 + rv0Var.y; i10++) {
                s4.c1 K = rv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = rv0Var.c;
        View F = wb1Var.F(d6Var);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            rv0Var.w[b10 - rv0Var.n0] = z10;
        }
        rv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        rv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        rv0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        rv0 rv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            rv0Var.c.getClass();
            int R = RecyclerView.R(this) - rv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < rv0Var.n) {
                    for (int length = rv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = rv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    rv0Var.y++;
                    i10++;
                }
                rv0Var.r0();
                rv0Var.g0 = (rv0Var.n0 + i10) - 1;
                rv0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean o() {
        return this.F.d.L;
    }
}
