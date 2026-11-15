package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kr0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ lr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(lr0 lr0Var, Context context, int i7, g40 g40Var) {
        super(context, i7, g40Var, null);
        this.G = lr0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean f() {
        nr0 nr0Var = this.G.d;
        b61 b61Var = nr0Var.c;
        View F = b61Var.F(this);
        v4.e1 T = F == null ? null : b61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = nr0Var.E;
            if (i7 == nr0Var.n && b10 == (nr0Var.o0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean g(org.telegram.ui.Cells.z5 z5Var) {
        int b10;
        nr0 nr0Var = this.G.d;
        b61 b61Var = nr0Var.c;
        View F = b61Var.F(z5Var);
        v4.e1 T = F == null ? null : b61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return nr0Var.x[b10 - nr0Var.o0];
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            an.C8(menu, this.G.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        nr0 nr0Var = this.G.d;
        nr0Var.c.getChildCount();
        if (z10 && nr0Var.M) {
            Arrays.fill(nr0Var.x, false);
            for (int i7 = nr0Var.o0; i7 < nr0Var.o0 + nr0Var.E; i7++) {
                v4.e1 K = nr0Var.c.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(z5Var, z10);
        b61 b61Var = nr0Var.c;
        View F = b61Var.F(z5Var);
        v4.e1 T = F == null ? null : b61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            nr0Var.x[b10 - nr0Var.o0] = z10;
        }
        nr0Var.n0();
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(boolean z10) {
        nr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        nr0.j0(this.G.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean m(ArrayList arrayList) {
        nr0 nr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            nr0Var.c.getClass();
            int R = RecyclerView.R(this) - nr0Var.o0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < nr0Var.n) {
                    for (int length = nr0Var.w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = nr0Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    nr0Var.w[i7] = (CharSequence) arrayList.remove(0);
                    nr0Var.E++;
                    i7++;
                }
                nr0Var.w0();
                nr0Var.h0 = (nr0Var.o0 + i7) - 1;
                nr0Var.b.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean p() {
        return this.G.d.M;
    }
}
