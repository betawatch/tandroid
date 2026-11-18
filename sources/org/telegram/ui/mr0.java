package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mr0 extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ nr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(nr0 nr0Var, Context context, int i7, j40 j40Var) {
        super(context, i7, j40Var, null);
        this.G = nr0Var;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean f() {
        pr0 pr0Var = this.G.d;
        f61 f61Var = pr0Var.c;
        View F = f61Var.F(this);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = pr0Var.E;
            if (i7 == pr0Var.n && b10 == (pr0Var.o0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean g(org.telegram.ui.Cells.b6 b6Var) {
        int b10;
        pr0 pr0Var = this.G.d;
        f61 f61Var = pr0Var.c;
        View F = f61Var.F(b6Var);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return pr0Var.x[b10 - pr0Var.o0];
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            bn.C8(menu, this.G.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        int b10;
        pr0 pr0Var = this.G.d;
        pr0Var.c.getChildCount();
        if (z10 && pr0Var.M) {
            Arrays.fill(pr0Var.x, false);
            for (int i7 = pr0Var.o0; i7 < pr0Var.o0 + pr0Var.E; i7++) {
                v4.f1 K = pr0Var.c.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(b6Var, z10);
        f61 f61Var = pr0Var.c;
        View F = f61Var.F(b6Var);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            pr0Var.x[b10 - pr0Var.o0] = z10;
        }
        pr0Var.n0();
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        pr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        pr0.j0(this.G.d, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean m(ArrayList arrayList) {
        pr0 pr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            pr0Var.c.getClass();
            int R = RecyclerView.R(this) - pr0Var.o0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < pr0Var.n) {
                    for (int length = pr0Var.w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = pr0Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    pr0Var.w[i7] = (CharSequence) arrayList.remove(0);
                    pr0Var.E++;
                    i7++;
                }
                pr0Var.w0();
                pr0Var.h0 = (pr0Var.o0 + i7) - 1;
                pr0Var.b.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean p() {
        return this.G.d.M;
    }
}
