package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jv0 extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ kv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(kv0 kv0Var, Context context, int i10, x50 x50Var) {
        super(context, i10, x50Var, null);
        this.F = kv0Var;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean e() {
        mv0 mv0Var = this.F.d;
        za1 za1Var = mv0Var.c;
        View F = za1Var.F(this);
        s4.e1 T = F == null ? null : za1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = mv0Var.y;
            if (i10 == mv0Var.n && b10 == (mv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean f(org.telegram.ui.Cells.h6 h6Var) {
        int b10;
        mv0 mv0Var = this.F.d;
        za1 za1Var = mv0Var.c;
        View F = za1Var.F(h6Var);
        s4.e1 T = F == null ? null : za1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return mv0Var.w[b10 - mv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            un.r8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.h6
    public final void h(org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        int b10;
        mv0 mv0Var = this.F.d;
        mv0Var.c.getChildCount();
        if (z10 && mv0Var.L) {
            Arrays.fill(mv0Var.w, false);
            for (int i10 = mv0Var.n0; i10 < mv0Var.n0 + mv0Var.y; i10++) {
                s4.e1 K = mv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(h6Var, z10);
        za1 za1Var = mv0Var.c;
        View F = za1Var.F(h6Var);
        s4.e1 T = F == null ? null : za1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            mv0Var.w[b10 - mv0Var.n0] = z10;
        }
        mv0Var.j0();
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        mv0.e0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        mv0.f0(this.F.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            mv0Var.c.getClass();
            int R = RecyclerView.R(this) - mv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.g6 g6Var = this.d;
                g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < mv0Var.n) {
                    for (int length = mv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = mv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    mv0Var.y++;
                    i10++;
                }
                mv0Var.s0();
                mv0Var.g0 = (mv0Var.n0 + i10) - 1;
                mv0Var.b.l();
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
