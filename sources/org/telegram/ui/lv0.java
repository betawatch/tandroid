package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lv0 extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ mv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(mv0 mv0Var, Context context, int i10, z50 z50Var) {
        super(context, i10, z50Var, null);
        this.F = mv0Var;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean e() {
        ov0 ov0Var = this.F.d;
        bb1 bb1Var = ov0Var.c;
        View F = bb1Var.F(this);
        s4.e1 T = F == null ? null : bb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = ov0Var.y;
            if (i10 == ov0Var.n && b10 == (ov0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean f(org.telegram.ui.Cells.h6 h6Var) {
        int b10;
        ov0 ov0Var = this.F.d;
        bb1 bb1Var = ov0Var.c;
        View F = bb1Var.F(h6Var);
        s4.e1 T = F == null ? null : bb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return ov0Var.w[b10 - ov0Var.n0];
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            wn.t8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.h6
    public final void h(org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        int b10;
        ov0 ov0Var = this.F.d;
        ov0Var.c.getChildCount();
        if (z10 && ov0Var.L) {
            Arrays.fill(ov0Var.w, false);
            for (int i10 = ov0Var.n0; i10 < ov0Var.n0 + ov0Var.y; i10++) {
                s4.e1 K = ov0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(h6Var, z10);
        bb1 bb1Var = ov0Var.c;
        View F = bb1Var.F(h6Var);
        s4.e1 T = F == null ? null : bb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            ov0Var.w[b10 - ov0Var.n0] = z10;
        }
        ov0Var.j0();
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        ov0.e0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        ov0.f0(this.F.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean l(ArrayList arrayList) {
        ov0 ov0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            ov0Var.c.getClass();
            int R = RecyclerView.R(this) - ov0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.g6 g6Var = this.d;
                g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < ov0Var.n) {
                    for (int length = ov0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = ov0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    ov0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    ov0Var.y++;
                    i10++;
                }
                ov0Var.s0();
                ov0Var.g0 = (ov0Var.n0 + i10) - 1;
                ov0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean o() {
        return this.F.d.L;
    }
}
