package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uz extends f2.d0 {
    public final np d = new np(this, 17);
    public final /* synthetic */ vz e;

    public uz(vz vzVar) {
        this.e = vzVar;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            vz vzVar = this.e;
            if (!vzVar.n || (q1Var.b() == 0 && ((sz) vzVar.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.d0.l(0, 0);
            }
        }
        return f2.d0.l(12, 0);
    }

    @Override // f2.d0
    public final boolean k() {
        return this.e.n;
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int i9 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((q1Var.b() == 0 || q1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        rz rzVar = this.e.E;
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        vz vzVar = rzVar.d;
        ArrayList arrayList = vzVar.h;
        SparseIntArray sparseIntArray = vzVar.g0;
        int size = arrayList.size();
        if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(b10);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(b11);
            int i10 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i10;
            dialogFilters.set(b10, dialogFilter2);
            dialogFilters.set(b11, dialogFilter);
            sz szVar = (sz) arrayList.get(b10);
            sz szVar2 = (sz) arrayList.get(b11);
            int i11 = szVar.a;
            szVar.a = szVar2.a;
            szVar2.a = i11;
            int i12 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i12);
            qz qzVar = vzVar.F;
            int i13 = szVar2.a;
            int i14 = szVar.a;
            org.telegram.ui.dw dwVar = (org.telegram.ui.dw) qzVar;
            while (true) {
                org.telegram.ui.cy[] cyVarArr = dwVar.b.a0;
                if (i9 >= cyVarArr.length) {
                    break;
                }
                org.telegram.ui.cy cyVar = cyVarArr[i9];
                int i15 = cyVar.h;
                if (i15 == i13) {
                    cyVar.h = i14;
                } else if (i15 == i14) {
                    cyVar.h = i13;
                }
                i9++;
            }
            int i16 = vzVar.G;
            if (i16 == b10) {
                vzVar.G = b11;
                vzVar.H = szVar.a;
            } else if (i16 == b11) {
                vzVar.G = b10;
                vzVar.H = szVar2.a;
            }
            int i17 = vzVar.m0;
            if (i17 == b10) {
                vzVar.m0 = b11;
                vzVar.n0 = szVar.a;
            } else if (i17 == b11) {
                vzVar.m0 = b10;
                vzVar.n0 = szVar2.a;
            }
            arrayList.set(b10, szVar2);
            arrayList.set(b11, szVar);
            vzVar.j();
            vzVar.y = true;
            vzVar.B.setItemAnimator(vzVar.o0);
            rzVar.p(b10, b11);
        }
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        if (i9 != 0) {
            vz vzVar = this.e;
            vzVar.B.I0(false);
            q1Var.a.setPressed(true);
            q1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(vzVar.U, vzVar.a));
        } else {
            np npVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(npVar);
            AndroidUtilities.runOnUIThread(npVar, 320L);
        }
        if (q1Var != null) {
            q1Var.a.setTag(R.id.dragging, i9 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}
