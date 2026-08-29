package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e00 extends f2.b0 {
    public final rp d = new rp(this, 17);
    public final /* synthetic */ f00 e;

    public e00(f00 f00Var) {
        this.e = f00Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            f00 f00Var = this.e;
            if (!f00Var.n || (n1Var.b() == 0 && ((c00) f00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.b0.l(0, 0);
            }
        }
        return f2.b0.l(12, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        return this.e.n;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((n1Var.b() == 0 || n1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        b00 b00Var = this.e.E;
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        f00 f00Var = b00Var.d;
        ArrayList arrayList = f00Var.h;
        SparseIntArray sparseIntArray = f00Var.g0;
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
            c00 c00Var = (c00) arrayList.get(b10);
            c00 c00Var2 = (c00) arrayList.get(b11);
            int i12 = c00Var.a;
            c00Var.a = c00Var2.a;
            c00Var2.a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            a00 a00Var = f00Var.F;
            int i14 = c00Var2.a;
            int i15 = c00Var.a;
            org.telegram.ui.fw fwVar = (org.telegram.ui.fw) a00Var;
            while (true) {
                org.telegram.ui.ey[] eyVarArr = fwVar.b.a0;
                if (i10 >= eyVarArr.length) {
                    break;
                }
                org.telegram.ui.ey eyVar = eyVarArr[i10];
                int i16 = eyVar.h;
                if (i16 == i14) {
                    eyVar.h = i15;
                } else if (i16 == i15) {
                    eyVar.h = i14;
                }
                i10++;
            }
            int i17 = f00Var.G;
            if (i17 == b10) {
                f00Var.G = b11;
                f00Var.H = c00Var.a;
            } else if (i17 == b11) {
                f00Var.G = b10;
                f00Var.H = c00Var2.a;
            }
            int i18 = f00Var.m0;
            if (i18 == b10) {
                f00Var.m0 = b11;
                f00Var.n0 = c00Var.a;
            } else if (i18 == b11) {
                f00Var.m0 = b10;
                f00Var.n0 = c00Var2.a;
            }
            arrayList.set(b10, c00Var2);
            arrayList.set(b11, c00Var);
            f00Var.j();
            f00Var.y = true;
            f00Var.B.setItemAnimator(f00Var.o0);
            b00Var.p(b10, b11);
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        if (i10 != 0) {
            f00 f00Var = this.e;
            f00Var.B.I0(false);
            n1Var.a.setPressed(true);
            n1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(f00Var.U, f00Var.a));
        } else {
            rp rpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(rpVar);
            AndroidUtilities.runOnUIThread(rpVar, 320L);
        }
        if (n1Var != null) {
            n1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }
}
