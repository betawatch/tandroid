// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hvb extends ka {
    public final /* synthetic */ qvb d;

    public hvb(qvb qvbVar) {
        this.d = qvbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 3;
    }

    @Override // w39
    public final int b() {
        return this.d.b.size() + 1;
    }

    @Override // w39
    public final int d(int i) {
        if (i == b() - 1) {
            return 2;
        }
        return ((ivb) this.d.b.get(i)).a;
    }

    @Override // w39
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        nvb nvbVar;
        int i2;
        boolean z;
        int i3;
        qvb qvbVar = this.d;
        ArrayList arrayList = qvbVar.b;
        long j = qvbVar.a;
        int i4 = s49Var.f;
        View view = s49Var.a;
        if (i4 != 0) {
            boolean z2 = true;
            if (i4 == 3) {
                nvb nvbVar2 = (nvb) view;
                nvbVar2.setCurrentDialogId(-j);
                if (i == arrayList.size() - 1 && !qvbVar.O.S0()) {
                    z2 = false;
                }
                nvbVar2.b5 = z2;
                nvbVar2.c5 = i;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ivb) qvbVar.b.get(i)).c;
        int i5 = i + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i5 < qvbVar.b.size() ? ((ivb) qvbVar.b.get(i5)).c : null;
        nvb nvbVar3 = (nvb) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = nvbVar3.O;
        int i6 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i7 = tL_forumTopic.id;
        boolean z3 = i6 == i7 && nvbVar3.c5 == i && qvbVar.H;
        if (message != null) {
            i3 = ((d) qvbVar).currentAccount;
            k27 k27Var = new k27(i3, message, false, false);
            if (!qvbVar.getMessagesController().x2(-j)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                nvbVar = nvbVar3;
                i2 = i7;
                boolean z4 = z3;
                nvbVar.h0(tL_forumTopic, -j, k27Var, qvbVar.isInPreviewMode(), z4);
                z = z4;
                nvbVar.b5 = i != arrayList.size() - 1 || qvbVar.O.S0();
                boolean z5 = tL_forumTopic.pinned;
                nvbVar.u2 = z5 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                nvbVar.setPinForced(z5 && !tL_forumTopic.hidden);
                nvbVar.c5 = i;
                if (!qvbVar.getMessagesController().x2(-j)) {
                    nvbVar.setTopicIcon(tL_forumTopic);
                }
                nvbVar.e0(qvbVar.b0.contains(Integer.valueOf(i2)), z);
                nvbVar.setDialogSelected(qvbVar.R0 != ((long) i2));
                nvbVar.c0(qvbVar.c0, true);
            }
            nvbVar3.r0 = true;
            nvbVar3.y = true;
            nvbVar3.O = tL_forumTopic;
            nvbVar3.J = (byte) 72;
            nvbVar3.V = 42.0f;
            nvbVar3.K = (byte) 72;
            nvbVar3.L = (byte) 78;
            long n = cf3.n(tL_forumTopic.from_id);
            int i8 = message.date;
            i2 = i7;
            nvbVar3.f0(n, k27Var, i8, false, false);
            nvbVar3.t0 = true;
            nvbVar3.t2 = i5 < b();
            nvbVar = nvbVar3;
        } else {
            nvbVar = nvbVar3;
            i2 = i7;
        }
        z = z3;
        if (!qvbVar.getMessagesController().x2(-j)) {
        }
        nvbVar.e0(qvbVar.b0.contains(Integer.valueOf(i2)), z);
        nvbVar.setDialogSelected(qvbVar.R0 != ((long) i2));
        nvbVar.c0(qvbVar.c0, true);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        qvb qvbVar = this.d;
        if (i != 0 && i != 3) {
            if (i == 2) {
                gvb gvbVar = new gvb(this, qvbVar.getParentActivity());
                qvbVar.F0 = gvbVar;
                return new y29(gvbVar);
            }
            pi4 pi4Var = new pi4(viewGroup.getContext(), null);
            pi4Var.setViewType(24);
            pi4Var.setIsSingleCell(true);
            pi4Var.x = true;
            return new y29(pi4Var);
        }
        nvb nvbVar = new nvb(qvbVar, viewGroup.getContext(), false);
        if (i == 3) {
            i2 = ((d) qvbVar).currentAccount;
            boolean x = l7c.x(na7.q1(i2).V1(Long.valueOf(-qvbVar.a)));
            nvbVar.setForumIcon(mm4.e(jm4.k[0], ""));
            nvbVar.setTitleOverride(k96.M0(!x ? 2131753063 : 2131753065, null));
            nvbVar.setCustomMessage(k96.M0(!x ? 2131753064 : 2131753066, null));
        }
        z = ((d) qvbVar).inPreviewMode;
        nvbVar.l0 = z;
        nvbVar.setArchivedPullAnimation(qvbVar.x);
        return new y29(nvbVar);
    }
}
