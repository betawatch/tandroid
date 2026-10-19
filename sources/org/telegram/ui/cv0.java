package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ dv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(dv0 dv0Var, Context context, int i10, s50 s50Var) {
        super(context, i10, s50Var, null);
        this.F = dv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        fv0 fv0Var = this.F.d;
        sa1 sa1Var = fv0Var.c;
        View F = sa1Var.F(this);
        s4.b1 T = F == null ? null : sa1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = fv0Var.y;
            if (i10 == fv0Var.n && b10 == (fv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        fv0 fv0Var = this.F.d;
        sa1 sa1Var = fv0Var.c;
        View F = sa1Var.F(c6Var);
        s4.b1 T = F == null ? null : sa1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return fv0Var.w[b10 - fv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            qn.n8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        fv0 fv0Var = this.F.d;
        if (z10 && fv0Var.L) {
            Arrays.fill(fv0Var.w, false);
            fv0Var.c.getChildCount();
            for (int i10 = fv0Var.n0; i10 < fv0Var.n0 + fv0Var.y; i10++) {
                s4.b1 K = fv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        sa1 sa1Var = fv0Var.c;
        View F = sa1Var.F(c6Var);
        s4.b1 T = F == null ? null : sa1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            fv0Var.w[b10 - fv0Var.n0] = z10;
        }
        fv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        fv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            fv0Var.c.getClass();
            int R = RecyclerView.R(this) - fv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
                fv0Var.g0 = (fv0Var.n0 + i10) - 1;
                fv0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.F.d.L;
    }
}
