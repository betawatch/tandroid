package eh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.q1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends vk0 {
    public final /* synthetic */ x c;

    public p(x xVar) {
        this.c = xVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(q1 q1Var) {
        return q1Var.f == 0;
    }

    public final void E(List list) {
        x xVar = this.c;
        ArrayList arrayList = xVar.c;
        boolean isEmpty = arrayList.isEmpty();
        int i9 = 0;
        while (i9 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i9)).user_id;
            int i10 = i9 + 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id == j10) {
                    list.remove(i9);
                    i9--;
                    break;
                }
                i10++;
            }
            i9++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            s(!xVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override // f2.r0
    public final int h() {
        x xVar = this.c;
        return ((xVar.c.isEmpty() || !xVar.x) ? 0 : 1) + xVar.c.size() + (!xVar.B ? 1 : 0);
    }

    @Override // f2.r0
    public final int j(int i9) {
        x xVar = this.c;
        if (i9 != 0 || xVar.B) {
            return (i9 == h() + (-1) && !xVar.c.isEmpty() && xVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        x xVar = this.c;
        ArrayList arrayList = xVar.c;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        g5 g5Var = (g5) view;
        int i11 = i9 - (!xVar.B ? 1 : 0);
        LongSparseArray longSparseArray = xVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
        boolean z10 = i11 != arrayList.size() - 1 || xVar.x;
        h5 h5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        z8 z8Var = g5Var.a;
        z8Var.r(user);
        g5Var.b.e(user, z8Var);
        g5Var.c.l(UserObject.getUserName(user), false);
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

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        View view;
        x xVar = this.c;
        boolean z10 = xVar.a;
        if (i9 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i9 == 2) {
            an anVar = new an(viewGroup.getContext(), 1);
            anVar.setTag(-33024);
            view = anVar;
        } else if (i9 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i9 != 4) {
            view = new g5(viewGroup.getContext(), xVar, z10);
        } else {
            o2 o2Var = xVar.g;
            o oVar = new o(o2Var.getParentActivity(), 0, o2Var.getResourceProvider());
            if (xVar.B) {
                oVar.setBackgroundColor(f6.v0(f6.d6, o2Var.getResourceProvider()));
            }
            oVar.f(f6.d6, f6.a7, -1);
            oVar.setViewType(15);
            oVar.setMemberRequestButton(z10);
            oVar.setIsSingleCell(true);
            oVar.setItemsCount(1);
            oVar.setTag(-33024);
            view = oVar;
        }
        return new ik0(view);
    }
}
