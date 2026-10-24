package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fv0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ gv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(gv0 gv0Var, Context context, int i10, w50 w50Var) {
        super(context, i10, w50Var, null);
        this.F = gv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        iv0 iv0Var = this.F.d;
        xa1 xa1Var = iv0Var.c;
        View F = xa1Var.F(this);
        s4.b1 T = F == null ? null : xa1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = iv0Var.y;
            if (i10 == iv0Var.n && b10 == (iv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        iv0 iv0Var = this.F.d;
        xa1 xa1Var = iv0Var.c;
        View F = xa1Var.F(d6Var);
        s4.b1 T = F == null ? null : xa1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return iv0Var.w[b10 - iv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            sn.n8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        iv0 iv0Var = this.F.d;
        iv0Var.c.getChildCount();
        if (z10 && iv0Var.L) {
            Arrays.fill(iv0Var.w, false);
            for (int i10 = iv0Var.n0; i10 < iv0Var.n0 + iv0Var.y; i10++) {
                s4.b1 K = iv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        xa1 xa1Var = iv0Var.c;
        View F = xa1Var.F(d6Var);
        s4.b1 T = F == null ? null : xa1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            iv0Var.w[b10 - iv0Var.n0] = z10;
        }
        iv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        iv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        iv0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        iv0 iv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            iv0Var.c.getClass();
            int R = RecyclerView.R(this) - iv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < iv0Var.n) {
                    for (int length = iv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = iv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    iv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    iv0Var.y++;
                    i10++;
                }
                iv0Var.r0();
                iv0Var.g0 = (iv0Var.n0 + i10) - 1;
                iv0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean p() {
        return this.F.d.L;
    }
}
