package oh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import s4.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends sk0 {
    public final /* synthetic */ q c;

    public j(q qVar) {
        this.c = qVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(c1 c1Var) {
        return c1Var.f == 0;
    }

    public final void E(List list) {
        q qVar = this.c;
        ArrayList arrayList = qVar.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            int i11 = i10 + 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j10) {
                    list.remove(i10);
                    i10--;
                    break;
                }
                i11++;
            }
            i10++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            o(!qVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // s4.g0
    public final int b() {
        q qVar = this.c;
        return ((qVar.c.isEmpty() || !qVar.x) ? 0 : 1) + qVar.c.size() + (!qVar.B ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        q qVar = this.c;
        if (i10 != 0 || qVar.B) {
            return (i10 == b() + (-1) && !qVar.c.isEmpty() && qVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // s4.g0
    public final void t(c1 c1Var, int i10) {
        q qVar = this.c;
        ArrayList arrayList = qVar.c;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        i5 i5Var = (i5) view;
        int i12 = i10 - (!qVar.B ? 1 : 0);
        LongSparseArray longSparseArray = qVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || qVar.x;
        u5 u5Var = i5Var.d;
        i5Var.e = tL_chatInviteImporter;
        i5Var.f = z10;
        i5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        r8 r8Var = i5Var.a;
        r8Var.r(user);
        i5Var.b.e(user, r8Var);
        i5Var.c.l(h20.p(user), false);
        String s10 = cd.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            u5Var.l(cd.L0(2131749079, null), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            u5Var.l(cd.a0("RequestedToJoinAt", null, 2131746177, s10), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            u5Var.l(cd.a0("AddedBy", null, 2131754361, h20.j(user2, true), s10), false);
        } else {
            u5Var.l("", false);
        }
    }

    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        View view;
        q qVar = this.c;
        boolean z10 = qVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            bn bnVar = new bn(viewGroup.getContext(), 3);
            bnVar.setTag(-33024);
            view = bnVar;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new i5(viewGroup.getContext(), qVar, z10);
        } else {
            k2 k2Var = qVar.g;
            i iVar = new i(0, k2Var.getParentActivity(), k2Var.getResourceProvider());
            if (qVar.B) {
                a7.i(t6.d6, iVar, k2Var.getResourceProvider());
            }
            iVar.e(t6.d6, t6.a7, -1);
            iVar.setViewType(15);
            iVar.setMemberRequestButton(z10);
            iVar.setIsSingleCell(true);
            iVar.setItemsCount(1);
            iVar.setTag(-33024);
            view = iVar;
        }
        return new ck0(view);
    }
}
