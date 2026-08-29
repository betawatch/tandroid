package hh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends il0 {
    public final /* synthetic */ v c;

    public n(v vVar) {
        this.c = vVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        return n1Var.f == 0;
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

    @Override // f2.p0
    public final int h() {
        v vVar = this.c;
        return ((vVar.c.isEmpty() || !vVar.x) ? 0 : 1) + vVar.c.size() + (!vVar.B ? 1 : 0);
    }

    @Override // f2.p0
    public final int j(int i10) {
        v vVar = this.c;
        if (i10 != 0 || vVar.B) {
            return (i10 == h() + (-1) && !vVar.c.isEmpty() && vVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // f2.p0
    public final void v(n1 n1Var, int i10) {
        v vVar = this.c;
        ArrayList arrayList = vVar.c;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        e5 e5Var = (e5) view;
        int i12 = i10 - (!vVar.B ? 1 : 0);
        LongSparseArray longSparseArray = vVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || vVar.x;
        h5 h5Var = e5Var.d;
        e5Var.e = tL_chatInviteImporter;
        e5Var.f = z10;
        e5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        e9 e9Var = e5Var.a;
        e9Var.r(user);
        e5Var.b.e(user, e9Var);
        e5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            h5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            h5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            h5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            h5Var.l("", false);
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        v vVar = this.c;
        boolean z10 = vVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            fn fnVar = new fn(viewGroup.getContext(), 3);
            fnVar.setTag(-33024);
            view = fnVar;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new e5(viewGroup.getContext(), vVar, z10);
        } else {
            o2 o2Var = vVar.g;
            m mVar = new m(o2Var.getParentActivity(), 0, o2Var.getResourceProvider());
            if (vVar.B) {
                mVar.setBackgroundColor(g6.v0(g6.d6, o2Var.getResourceProvider()));
            }
            mVar.f(g6.d6, g6.a7, -1);
            mVar.setViewType(15);
            mVar.setMemberRequestButton(z10);
            mVar.setIsSingleCell(true);
            mVar.setItemsCount(1);
            mVar.setTag(-33024);
            view = mVar;
        }
        return new vk0(view);
    }
}
