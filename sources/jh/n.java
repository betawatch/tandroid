package jh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.l1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends ql0 {
    public final /* synthetic */ v c;

    public n(v vVar) {
        this.c = vVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(l1 l1Var) {
        return l1Var.f == 0;
    }

    public final void E(List list) {
        v vVar = this.c;
        ArrayList arrayList = vVar.c;
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
            s(!vVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override // f2.o0
    public final int h() {
        v vVar = this.c;
        return ((vVar.c.isEmpty() || !vVar.x) ? 0 : 1) + vVar.c.size() + (!vVar.B ? 1 : 0);
    }

    @Override // f2.o0
    public final int j(int i10) {
        v vVar = this.c;
        if (i10 != 0 || vVar.B) {
            return (i10 == h() + (-1) && !vVar.c.isEmpty() && vVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // f2.o0
    public final void v(l1 l1Var, int i10) {
        v vVar = this.c;
        ArrayList arrayList = vVar.c;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        f5 f5Var = (f5) view;
        int i12 = i10 - (!vVar.B ? 1 : 0);
        LongSparseArray longSparseArray = vVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z4 = i12 != arrayList.size() - 1 || vVar.x;
        k5 k5Var = f5Var.d;
        f5Var.e = tL_chatInviteImporter;
        f5Var.f = z4;
        f5Var.setWillNotDraw(!z4);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        z8 z8Var = f5Var.a;
        z8Var.r(user);
        f5Var.b.e(user, z8Var);
        f5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            k5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            k5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            k5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            k5Var.l("", false);
        }
    }

    @Override // f2.o0
    public final l1 x(ViewGroup viewGroup, int i10) {
        View view;
        v vVar = this.c;
        boolean z4 = vVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            gn gnVar = new gn(viewGroup.getContext(), 3);
            gnVar.setTag(-33024);
            view = gnVar;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new f5(viewGroup.getContext(), vVar, z4);
        } else {
            p2 p2Var = vVar.g;
            m mVar = new m(p2Var.getParentActivity(), 0, p2Var.getResourceProvider());
            if (vVar.B) {
                mVar.setBackgroundColor(j6.v0(j6.d6, p2Var.getResourceProvider()));
            }
            mVar.f(j6.d6, j6.a7, -1);
            mVar.setViewType(15);
            mVar.setMemberRequestButton(z4);
            mVar.setIsSingleCell(true);
            mVar.setItemsCount(1);
            mVar.setTag(-33024);
            view = mVar;
        }
        return new dl0(view);
    }
}
