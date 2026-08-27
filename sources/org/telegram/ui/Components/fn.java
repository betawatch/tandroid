package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fn extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ gn B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(gn gnVar, Context context, int i10, an anVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, anVar, c6Var);
        this.B = gnVar;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean e() {
        in inVar = this.B.d;
        ta1 ta1Var = inVar.s;
        View F = ta1Var.F(this);
        f2.o1 T = F == null ? null : ta1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = inVar.I;
            if (i10 == inVar.F && b10 == (inVar.p0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        int b10;
        in inVar = this.B.d;
        ta1 ta1Var = inVar.s;
        View F = ta1Var.F(z5Var);
        f2.o1 T = F == null ? null : ta1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return inVar.H[b10 - inVar.p0];
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(gh.r rVar, ActionMode actionMode) {
        in inVar = this.B.d;
        if (inVar.n && rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) inVar.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        in inVar = this.B.d;
        if (z10 && inVar.V && !inVar.U) {
            Arrays.fill(inVar.H, false);
            inVar.s.getChildCount();
            for (int i10 = inVar.p0; i10 < inVar.p0 + inVar.I; i10++) {
                f2.o1 K = inVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        ta1 ta1Var = inVar.s;
        View F = ta1Var.F(z5Var);
        f2.o1 T = F == null ? null : ta1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            inVar.H[b10 - inVar.p0] = z10;
        }
        inVar.T();
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        in.M(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        in.N(this.B.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(gh.r rVar) {
        this.B.d.b.t1(rVar, true);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        in inVar = this.B.d;
        if (!arrayList.isEmpty()) {
            inVar.s.getClass();
            int R = RecyclerView.R(this) - inVar.p0;
            if (R >= 0) {
                gh.r rVar = this.d;
                rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < inVar.F) {
                    for (int length = inVar.G.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = inVar.G;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    inVar.G[i10] = (CharSequence) arrayList.remove(0);
                    inVar.I++;
                    i10++;
                }
                inVar.h0();
                inVar.g0 = (inVar.p0 + i10) - 1;
                inVar.s.setItemAnimator(inVar.v);
                inVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean p() {
        return this.B.d.V;
    }
}
