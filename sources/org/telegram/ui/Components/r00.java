package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class r00 extends s4.v {
    public final hq d = new hq(this, 17);
    public final /* synthetic */ s00 e;

    public r00(s00 s00Var) {
        this.e = s00Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            s00 s00Var = this.e;
            if (!s00Var.n || (b1Var.b() == 0 && ((p00) s00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override // s4.v
    public final boolean k() {
        return this.e.n;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((b1Var.b() == 0 || b1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        o00 o00Var = this.e.I;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        s00 s00Var = o00Var.d;
        ArrayList arrayList = s00Var.h;
        SparseIntArray sparseIntArray = s00Var.k0;
        int size = arrayList.size();
        if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(b10);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(b11);
            int i11 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i11;
            dialogFilters.set(b10, dialogFilter2);
            dialogFilters.set(b11, dialogFilter);
            p00 p00Var = (p00) arrayList.get(b10);
            p00 p00Var2 = (p00) arrayList.get(b11);
            int i12 = p00Var.a;
            p00Var.a = p00Var2.a;
            p00Var2.a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            n00 n00Var = s00Var.J;
            int i14 = p00Var2.a;
            int i15 = p00Var.a;
            org.telegram.ui.dw dwVar = (org.telegram.ui.dw) n00Var;
            while (true) {
                org.telegram.ui.dy[] dyVarArr = dwVar.b.e0;
                if (i10 >= dyVarArr.length) {
                    break;
                }
                org.telegram.ui.dy dyVar = dyVarArr[i10];
                int i16 = dyVar.h;
                if (i16 == i14) {
                    dyVar.h = i15;
                } else if (i16 == i15) {
                    dyVar.h = i14;
                }
                i10++;
            }
            int i17 = s00Var.K;
            if (i17 == b10) {
                s00Var.K = b11;
                s00Var.L = p00Var.a;
            } else if (i17 == b11) {
                s00Var.K = b10;
                s00Var.L = p00Var2.a;
            }
            int i18 = s00Var.q0;
            if (i18 == b10) {
                s00Var.q0 = b11;
                s00Var.r0 = p00Var.a;
            } else if (i18 == b11) {
                s00Var.q0 = b10;
                s00Var.r0 = p00Var2.a;
            }
            arrayList.set(b10, p00Var2);
            arrayList.set(b11, p00Var);
            s00Var.j();
            s00Var.y = true;
            s00Var.F.setItemAnimator(s00Var.s0);
            o00Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        if (i10 != 0) {
            s00 s00Var = this.e;
            s00Var.F.I0(false);
            b1Var.a.setPressed(true);
            b1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(s00Var.b0, s00Var.a));
        } else {
            hq hqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hqVar);
            AndroidUtilities.runOnUIThread(hqVar, 320L);
        }
        if (b1Var != null) {
            b1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
