package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ dv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(dv0 dv0Var, Context context, int i10, e60 e60Var) {
        super(context, i10, e60Var, null);
        this.C = dv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        fv0 fv0Var = this.C.d;
        jb1 jb1Var = fv0Var.c;
        View F = jb1Var.F(this);
        f2.l1 T = F == null ? null : jb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = fv0Var.y;
            if (i10 == fv0Var.n && b10 == (fv0Var.k0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        fv0 fv0Var = this.C.d;
        jb1 jb1Var = fv0Var.c;
        View F = jb1Var.F(c6Var);
        f2.l1 T = F == null ? null : jb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return fv0Var.w[b10 - fv0Var.k0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(dh.b bVar, ActionMode actionMode) {
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
        fv0 fv0Var = this.C.d;
        if (z4 && fv0Var.I) {
            Arrays.fill(fv0Var.w, false);
            fv0Var.c.getChildCount();
            for (int i10 = fv0Var.k0; i10 < fv0Var.k0 + fv0Var.y; i10++) {
                f2.l1 K = fv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        jb1 jb1Var = fv0Var.c;
        View F = jb1Var.F(c6Var);
        f2.l1 T = F == null ? null : jb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            fv0Var.w[b10 - fv0Var.k0] = z4;
        }
        fv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        fv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.C.d;
        if (!arrayList.isEmpty()) {
            fv0Var.c.getClass();
            int R = RecyclerView.R(this) - fv0Var.k0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < fv0Var.n) {
                    for (int length = fv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = fv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    fv0Var.y++;
                    i10++;
                }
                fv0Var.r0();
                fv0Var.d0 = (fv0Var.k0 + i10) - 1;
                fv0Var.b.l();
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
