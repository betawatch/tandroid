package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xz extends f2.c0 {
    public final lp d = new lp(this, 17);
    public final /* synthetic */ yz e;

    public xz(yz yzVar) {
        this.e = yzVar;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            yz yzVar = this.e;
            if (!yzVar.n || (o1Var.b() == 0 && ((vz) yzVar.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.c0.l(0, 0);
            }
        }
        return f2.c0.l(12, 0);
    }

    @Override // f2.c0
    public final boolean k() {
        return this.e.n;
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((o1Var.b() == 0 || o1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        uz uzVar = this.e.E;
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        yz yzVar = uzVar.d;
        ArrayList arrayList = yzVar.h;
        SparseIntArray sparseIntArray = yzVar.g0;
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
            vz vzVar = (vz) arrayList.get(b10);
            vz vzVar2 = (vz) arrayList.get(b11);
            int i12 = vzVar.a;
            vzVar.a = vzVar2.a;
            vzVar2.a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            tz tzVar = yzVar.F;
            int i14 = vzVar2.a;
            int i15 = vzVar.a;
            org.telegram.ui.gw gwVar = (org.telegram.ui.gw) tzVar;
            while (true) {
                org.telegram.ui.fy[] fyVarArr = gwVar.b.a0;
                if (i10 >= fyVarArr.length) {
                    break;
                }
                org.telegram.ui.fy fyVar = fyVarArr[i10];
                int i16 = fyVar.h;
                if (i16 == i14) {
                    fyVar.h = i15;
                } else if (i16 == i15) {
                    fyVar.h = i14;
                }
                i10++;
            }
            int i17 = yzVar.G;
            if (i17 == b10) {
                yzVar.G = b11;
                yzVar.H = vzVar.a;
            } else if (i17 == b11) {
                yzVar.G = b10;
                yzVar.H = vzVar2.a;
            }
            int i18 = yzVar.m0;
            if (i18 == b10) {
                yzVar.m0 = b11;
                yzVar.n0 = vzVar.a;
            } else if (i18 == b11) {
                yzVar.m0 = b10;
                yzVar.n0 = vzVar2.a;
            }
            arrayList.set(b10, vzVar2);
            arrayList.set(b11, vzVar);
            yzVar.j();
            yzVar.y = true;
            yzVar.B.setItemAnimator(yzVar.o0);
            uzVar.p(b10, b11);
        }
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        if (i10 != 0) {
            yz yzVar = this.e;
            yzVar.B.I0(false);
            o1Var.a.setPressed(true);
            o1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(yzVar.U, yzVar.a));
        } else {
            lp lpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(lpVar);
            AndroidUtilities.runOnUIThread(lpVar, 320L);
        }
        if (o1Var != null) {
            o1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
