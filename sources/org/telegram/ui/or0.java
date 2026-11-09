package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class or0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ pr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(pr0 pr0Var, Context context, int i7, i40 i40Var) {
        super(context, i7, i40Var, null);
        this.F = pr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean e() {
        rr0 rr0Var = this.F.d;
        f61 f61Var = rr0Var.c;
        View F = f61Var.F(this);
        v4.d1 T = F == null ? null : f61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = rr0Var.D;
            if (i7 == rr0Var.n && b10 == (rr0Var.n0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        int b10;
        rr0 rr0Var = this.F.d;
        f61 f61Var = rr0Var.c;
        View F = f61Var.F(a6Var);
        v4.d1 T = F == null ? null : f61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return rr0Var.x[b10 - rr0Var.n0];
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            cn.B8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        int b10;
        rr0 rr0Var = this.F.d;
        rr0Var.c.getChildCount();
        if (z9 && rr0Var.L) {
            Arrays.fill(rr0Var.x, false);
            for (int i7 = rr0Var.n0; i7 < rr0Var.n0 + rr0Var.D; i7++) {
                v4.d1 K = rr0Var.c.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        f61 f61Var = rr0Var.c;
        View F = f61Var.F(a6Var);
        v4.d1 T = F == null ? null : f61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            rr0Var.x[b10 - rr0Var.n0] = z9;
        }
        rr0Var.n0();
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        rr0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        rr0.j0(this.F.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        rr0 rr0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            rr0Var.c.getClass();
            int R = RecyclerView.R(this) - rr0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < rr0Var.n) {
                    for (int length = rr0Var.w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = rr0Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rr0Var.w[i7] = (CharSequence) arrayList.remove(0);
                    rr0Var.D++;
                    i7++;
                }
                rr0Var.w0();
                rr0Var.g0 = (rr0Var.n0 + i7) - 1;
                rr0Var.b.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean o() {
        return this.F.d.L;
    }
}
