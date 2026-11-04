package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cr0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ dr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(dr0 dr0Var, Context context, int i3, b40 b40Var) {
        super(context, i3, b40Var, null);
        this.G = dr0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean e() {
        fr0 fr0Var = this.G.d;
        u51 u51Var = fr0Var.c;
        View F = u51Var.F(this);
        u4.d1 T = F == null ? null : u51Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i3 = fr0Var.E;
            if (i3 == fr0Var.n && b10 == (fr0Var.o0 + i3) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        int b10;
        fr0 fr0Var = this.G.d;
        u51 u51Var = fr0Var.c;
        View F = u51Var.F(z5Var);
        u4.d1 T = F == null ? null : u51Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return fr0Var.x[b10 - fr0Var.o0];
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(ai.z zVar, ActionMode actionMode) {
        if (zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            wm.A8(menu, this.G.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        fr0 fr0Var = this.G.d;
        fr0Var.c.getChildCount();
        if (z10 && fr0Var.M) {
            Arrays.fill(fr0Var.x, false);
            for (int i3 = fr0Var.o0; i3 < fr0Var.o0 + fr0Var.E; i3++) {
                u4.d1 K = fr0Var.c.K(i3);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        u51 u51Var = fr0Var.c;
        View F = u51Var.F(z5Var);
        u4.d1 T = F == null ? null : u51Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            fr0Var.x[b10 - fr0Var.o0] = z10;
        }
        fr0Var.n0();
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        fr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        fr0.j0(this.G.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        fr0 fr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            fr0Var.c.getClass();
            int R = RecyclerView.R(this) - fr0Var.o0;
            if (R >= 0) {
                ai.z zVar = this.d;
                zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i3 = R + 1;
                while (!arrayList.isEmpty() && i3 < fr0Var.n) {
                    for (int length = fr0Var.w.length - 1; length > i3; length--) {
                        CharSequence[] charSequenceArr = fr0Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fr0Var.w[i3] = (CharSequence) arrayList.remove(0);
                    fr0Var.E++;
                    i3++;
                }
                fr0Var.w0();
                fr0Var.h0 = (fr0Var.o0 + i3) - 1;
                fr0Var.b.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean o() {
        return this.G.d.M;
    }
}
