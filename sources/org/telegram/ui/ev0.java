package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ev0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ fv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(fv0 fv0Var, Context context, int i10, f60 f60Var) {
        super(context, i10, f60Var, null);
        this.C = fv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        hv0 hv0Var = this.C.d;
        kb1 kb1Var = hv0Var.c;
        View F = kb1Var.F(this);
        f2.m1 T = F == null ? null : kb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = hv0Var.y;
            if (i10 == hv0Var.n && b10 == (hv0Var.k0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        hv0 hv0Var = this.C.d;
        kb1 kb1Var = hv0Var.c;
        View F = kb1Var.F(c6Var);
        f2.m1 T = F == null ? null : kb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return hv0Var.w[b10 - hv0Var.k0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            xn.k8(menu, this.C.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        int b10;
        hv0 hv0Var = this.C.d;
        if (z4 && hv0Var.I) {
            Arrays.fill(hv0Var.w, false);
            hv0Var.c.getChildCount();
            for (int i10 = hv0Var.k0; i10 < hv0Var.k0 + hv0Var.y; i10++) {
                f2.m1 K = hv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        kb1 kb1Var = hv0Var.c;
        View F = kb1Var.F(c6Var);
        f2.m1 T = F == null ? null : kb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            hv0Var.w[b10 - hv0Var.k0] = z4;
        }
        hv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        hv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.C.d;
        if (!arrayList.isEmpty()) {
            hv0Var.c.getClass();
            int R = RecyclerView.R(this) - hv0Var.k0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < hv0Var.n) {
                    for (int length = hv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = hv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    hv0Var.y++;
                    i10++;
                }
                hv0Var.r0();
                hv0Var.d0 = (hv0Var.k0 + i10) - 1;
                hv0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.C.d.I;
    }
}
