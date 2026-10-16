package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cw0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ dw0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw0(dw0 dw0Var, Context context, int i10, t60 t60Var) {
        super(context, i10, t60Var, null);
        this.F = dw0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean d() {
        fw0 fw0Var = this.F.d;
        kc1 kc1Var = fw0Var.c;
        View F = kc1Var.F(this);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = fw0Var.y;
            if (i10 == fw0Var.n && b10 == (fw0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        fw0 fw0Var = this.F.d;
        kc1 kc1Var = fw0Var.c;
        View F = kc1Var.F(d6Var);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return fw0Var.w[b10 - fw0Var.n0];
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
        fw0 fw0Var = this.F.d;
        if (z10 && fw0Var.L) {
            Arrays.fill(fw0Var.w, false);
            fw0Var.c.getChildCount();
            for (int i10 = fw0Var.n0; i10 < fw0Var.n0 + fw0Var.y; i10++) {
                s4.b1 K = fw0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        kc1 kc1Var = fw0Var.c;
        View F = kc1Var.F(d6Var);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            fw0Var.w[b10 - fw0Var.n0] = z10;
        }
        fw0Var.i0();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        fw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fw0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        fw0 fw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            fw0Var.c.getClass();
            int R = RecyclerView.R(this) - fw0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < fw0Var.n) {
                    for (int length = fw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = fw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    fw0Var.y++;
                    i10++;
                }
                fw0Var.r0();
                fw0Var.g0 = (fw0Var.n0 + i10) - 1;
                fw0Var.b.l();
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
