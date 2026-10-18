package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ev0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ fv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(fv0 fv0Var, Context context, int i10, y50 y50Var) {
        super(context, i10, y50Var, null);
        this.F = fv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        hv0 hv0Var = this.F.d;
        ua1 ua1Var = hv0Var.c;
        View F = ua1Var.F(this);
        s4.b1 T = F == null ? null : ua1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = hv0Var.y;
            if (i10 == hv0Var.n && b10 == (hv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        hv0 hv0Var = this.F.d;
        ua1 ua1Var = hv0Var.c;
        View F = ua1Var.F(c6Var);
        s4.b1 T = F == null ? null : ua1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return hv0Var.w[b10 - hv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            sn.n8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        hv0 hv0Var = this.F.d;
        if (z10 && hv0Var.L) {
            Arrays.fill(hv0Var.w, false);
            hv0Var.c.getChildCount();
            for (int i10 = hv0Var.n0; i10 < hv0Var.n0 + hv0Var.y; i10++) {
                s4.b1 K = hv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        ua1 ua1Var = hv0Var.c;
        View F = ua1Var.F(c6Var);
        s4.b1 T = F == null ? null : ua1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            hv0Var.w[b10 - hv0Var.n0] = z10;
        }
        hv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        hv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            hv0Var.c.getClass();
            int R = RecyclerView.R(this) - hv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
                hv0Var.g0 = (hv0Var.n0 + i10) - 1;
                hv0Var.b.l();
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
