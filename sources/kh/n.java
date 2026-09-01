package kh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.m1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class n extends sl0 {
    public final /* synthetic */ v c;

    public n(v vVar) {
        this.c = vVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(m1 m1Var) {
        return m1Var.f == 0;
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
    public final void v(m1 m1Var, int i10) {
        v vVar = this.c;
        ArrayList arrayList = vVar.c;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        g5 g5Var = (g5) view;
        int i12 = i10 - (!vVar.B ? 1 : 0);
        LongSparseArray longSparseArray = vVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z4 = i12 != arrayList.size() - 1 || vVar.x;
        l5 l5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z4;
        g5Var.setWillNotDraw(!z4);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        z8 z8Var = g5Var.a;
        z8Var.r(user);
        g5Var.b.e(user, z8Var);
        g5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            l5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            l5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            l5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            l5Var.l("", false);
        }
    }

    @Override // f2.p0
    public final m1 x(ViewGroup viewGroup, int i10) {
        View view;
        v vVar = this.c;
        boolean z4 = vVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            jn jnVar = new jn(viewGroup.getContext(), 3);
            jnVar.setTag(-33024);
            view = jnVar;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new g5(viewGroup.getContext(), vVar, z4);
        } else {
            p2 p2Var = vVar.g;
            m mVar = new m(p2Var.getParentActivity(), 0, p2Var.getResourceProvider());
            if (vVar.B) {
                mVar.setBackgroundColor(k6.v0(k6.d6, p2Var.getResourceProvider()));
            }
            mVar.f(k6.d6, k6.a7, -1);
            mVar.setViewType(15);
            mVar.setMemberRequestButton(z4);
            mVar.setIsSingleCell(true);
            mVar.setItemsCount(1);
            mVar.setTag(-33024);
            view = mVar;
        }
        return new fl0(view);
    }
}
