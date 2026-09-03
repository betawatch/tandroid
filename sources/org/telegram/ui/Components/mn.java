package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.rb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ nn C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(nn nnVar, Context context, int i10, hn hnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, hnVar, f6Var);
        this.C = nnVar;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean e() {
        pn pnVar = this.C.d;
        rb1 rb1Var = pnVar.s;
        View F = rb1Var.F(this);
        f2.l1 T = F == null ? null : rb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = pnVar.J;
            if (i10 == pnVar.G && b10 == (pnVar.q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean f(org.telegram.ui.Cells.b6 b6Var) {
        int b10;
        pn pnVar = this.C.d;
        rb1 rb1Var = pnVar.s;
        View F = rb1Var.F(b6Var);
        f2.l1 T = F == null ? null : rb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return pnVar.I[b10 - pnVar.q0];
    }

    @Override // org.telegram.ui.Cells.b6
    public final void g(dh.b bVar, ActionMode actionMode) {
        pn pnVar = this.C.d;
        if (pnVar.n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) pnVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(org.telegram.ui.Cells.b6 b6Var, boolean z4) {
        int b10;
        pn pnVar = this.C.d;
        if (z4 && pnVar.W && !pnVar.V) {
            Arrays.fill(pnVar.I, false);
            pnVar.s.getChildCount();
            for (int i10 = pnVar.q0; i10 < pnVar.q0 + pnVar.J; i10++) {
                f2.l1 K = pnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(b6Var, z4);
        rb1 rb1Var = pnVar.s;
        View F = rb1Var.F(b6Var);
        f2.l1 T = F == null ? null : rb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            pnVar.I[b10 - pnVar.q0] = z4;
        }
        pnVar.T();
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(boolean z4) {
        pn.M(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        pn.N(this.C.d, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(dh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean l(ArrayList arrayList) {
        pn pnVar = this.C.d;
        if (!arrayList.isEmpty()) {
            pnVar.s.getClass();
            int R = RecyclerView.R(this) - pnVar.q0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < pnVar.G) {
                    for (int length = pnVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = pnVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    pnVar.H[i10] = (CharSequence) arrayList.remove(0);
                    pnVar.J++;
                    i10++;
                }
                pnVar.h0();
                pnVar.h0 = (pnVar.q0 + i10) - 1;
                pnVar.s.setItemAnimator(pnVar.v);
                pnVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean o() {
        return this.C.d.W;
    }
}
