package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dw0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ ew0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(ew0 ew0Var, Context context, int i10, t60 t60Var) {
        super(context, i10, t60Var, null);
        this.F = ew0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean d() {
        gw0 gw0Var = this.F.d;
        kc1 kc1Var = gw0Var.c;
        View F = kc1Var.F(this);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = gw0Var.y;
            if (i10 == gw0Var.n && b10 == (gw0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        gw0 gw0Var = this.F.d;
        kc1 kc1Var = gw0Var.c;
        View F = kc1Var.F(d6Var);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return gw0Var.w[b10 - gw0Var.n0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            fo.n8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        gw0 gw0Var = this.F.d;
        if (z10 && gw0Var.L) {
            Arrays.fill(gw0Var.w, false);
            gw0Var.c.getChildCount();
            for (int i10 = gw0Var.n0; i10 < gw0Var.n0 + gw0Var.y; i10++) {
                s4.b1 K = gw0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        kc1 kc1Var = gw0Var.c;
        View F = kc1Var.F(d6Var);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            gw0Var.w[b10 - gw0Var.n0] = z10;
        }
        gw0Var.i0();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        gw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        gw0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        gw0 gw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            gw0Var.c.getClass();
            int R = RecyclerView.R(this) - gw0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < gw0Var.n) {
                    for (int length = gw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = gw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    gw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    gw0Var.y++;
                    i10++;
                }
                gw0Var.r0();
                gw0Var.g0 = (gw0Var.n0 + i10) - 1;
                gw0Var.b.l();
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
