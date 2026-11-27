// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jzb extends la {
    public final /* synthetic */ tzb d;

    public jzb(tzb tzbVar) {
        this.d = tzbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 0 || i == 3;
    }

    @Override // j79
    public final int b() {
        return this.d.b.size() + 1;
    }

    @Override // j79
    public final int d(int i) {
        if (i == b() - 1) {
            return 2;
        }
        return ((kzb) this.d.b.get(i)).a;
    }

    @Override // j79
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        qzb qzbVar;
        int i2;
        boolean z;
        int i3;
        tzb tzbVar = this.d;
        ArrayList arrayList = tzbVar.b;
        long j = tzbVar.a;
        int i4 = f89Var.f;
        View view = f89Var.a;
        if (i4 != 0) {
            boolean z2 = true;
            if (i4 == 3) {
                qzb qzbVar2 = (qzb) view;
                qzbVar2.setCurrentDialogId(-j);
                if (i == arrayList.size() - 1 && !tzbVar.O.T0()) {
                    z2 = false;
                }
                qzbVar2.b5 = z2;
                qzbVar2.c5 = i;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((kzb) tzbVar.b.get(i)).c;
        int i5 = i + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i5 < tzbVar.b.size() ? ((kzb) tzbVar.b.get(i5)).c : null;
        qzb qzbVar3 = (qzb) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = qzbVar3.O;
        int i6 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i7 = tL_forumTopic.id;
        boolean z3 = i6 == i7 && qzbVar3.c5 == i && tzbVar.H;
        if (message != null) {
            i3 = ((e) tzbVar).currentAccount;
            r47 r47Var = new r47(i3, message, false, false);
            if (!tzbVar.getMessagesController().B2(-j)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                qzbVar = qzbVar3;
                i2 = i7;
                boolean z4 = z3;
                qzbVar.g0(tL_forumTopic, -j, r47Var, tzbVar.isInPreviewMode(), z4);
                z = z4;
                qzbVar.b5 = i != arrayList.size() - 1 || tzbVar.O.T0();
                boolean z5 = tL_forumTopic.pinned;
                qzbVar.u2 = z5 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                qzbVar.setPinForced(z5 && !tL_forumTopic.hidden);
                qzbVar.c5 = i;
                if (!tzbVar.getMessagesController().B2(-j)) {
                    qzbVar.setTopicIcon(tL_forumTopic);
                }
                qzbVar.d0(tzbVar.b0.contains(Integer.valueOf(i2)), z);
                qzbVar.setDialogSelected(tzbVar.R0 != ((long) i2));
                qzbVar.b0(tzbVar.c0, true);
            }
            qzbVar3.r0 = true;
            qzbVar3.y = true;
            qzbVar3.O = tL_forumTopic;
            qzbVar3.J = (byte) 72;
            qzbVar3.V = 42.0f;
            qzbVar3.K = (byte) 72;
            qzbVar3.L = (byte) 78;
            long n = wf3.n(tL_forumTopic.from_id);
            int i8 = message.date;
            i2 = i7;
            qzbVar3.e0(n, r47Var, i8, false, false);
            qzbVar3.t0 = true;
            qzbVar3.t2 = i5 < b();
            qzbVar = qzbVar3;
        } else {
            qzbVar = qzbVar3;
            i2 = i7;
        }
        z = z3;
        if (!tzbVar.getMessagesController().B2(-j)) {
        }
        qzbVar.d0(tzbVar.b0.contains(Integer.valueOf(i2)), z);
        qzbVar.setDialogSelected(tzbVar.R0 != ((long) i2));
        qzbVar.b0(tzbVar.c0, true);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        tzb tzbVar = this.d;
        if (i != 0 && i != 3) {
            if (i == 2) {
                izb izbVar = new izb(this, tzbVar.getParentActivity());
                tzbVar.F0 = izbVar;
                return new n69(izbVar);
            }
            tk4 tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setViewType(24);
            tk4Var.setIsSingleCell(true);
            tk4Var.x = true;
            return new n69(tk4Var);
        }
        qzb qzbVar = new qzb(tzbVar, viewGroup.getContext(), false);
        if (i == 3) {
            i2 = ((e) tzbVar).currentAccount;
            boolean x = lbc.x(uc7.s1(i2).X1(Long.valueOf(-tzbVar.a)));
            qzbVar.setForumIcon(ro4.e(oo4.k[0], ""));
            qzbVar.setTitleOverride(ob6.M0(!x ? 2131753059 : 2131753061, null));
            qzbVar.setCustomMessage(ob6.M0(!x ? 2131753060 : 2131753062, null));
        }
        z = ((e) tzbVar).inPreviewMode;
        qzbVar.l0 = z;
        qzbVar.setArchivedPullAnimation(tzbVar.x);
        return new n69(qzbVar);
    }
}
