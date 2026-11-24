// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ixb extends ka {
    public final /* synthetic */ sxb d;

    public ixb(sxb sxbVar) {
        this.d = sxbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 0 || i == 3;
    }

    @Override // y59
    public final int b() {
        return this.d.b.size() + 1;
    }

    @Override // y59
    public final int d(int i) {
        if (i == b() - 1) {
            return 2;
        }
        return ((jxb) this.d.b.get(i)).a;
    }

    @Override // y59
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        pxb pxbVar;
        int i2;
        boolean z;
        int i3;
        sxb sxbVar = this.d;
        ArrayList arrayList = sxbVar.b;
        long j = sxbVar.a;
        int i4 = u69Var.f;
        View view = u69Var.a;
        if (i4 != 0) {
            boolean z2 = true;
            if (i4 == 3) {
                pxb pxbVar2 = (pxb) view;
                pxbVar2.setCurrentDialogId(-j);
                if (i == arrayList.size() - 1 && !sxbVar.O.S0()) {
                    z2 = false;
                }
                pxbVar2.b5 = z2;
                pxbVar2.c5 = i;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((jxb) sxbVar.b.get(i)).c;
        int i5 = i + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i5 < sxbVar.b.size() ? ((jxb) sxbVar.b.get(i5)).c : null;
        pxb pxbVar3 = (pxb) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = pxbVar3.O;
        int i6 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i7 = tL_forumTopic.id;
        boolean z3 = i6 == i7 && pxbVar3.c5 == i && sxbVar.H;
        if (message != null) {
            i3 = ((d) sxbVar).currentAccount;
            k47 k47Var = new k47(i3, message, false, false);
            if (!sxbVar.getMessagesController().y2(-j)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                pxbVar = pxbVar3;
                i2 = i7;
                boolean z4 = z3;
                pxbVar.g0(tL_forumTopic, -j, k47Var, sxbVar.isInPreviewMode(), z4);
                z = z4;
                pxbVar.b5 = i != arrayList.size() - 1 || sxbVar.O.S0();
                boolean z5 = tL_forumTopic.pinned;
                pxbVar.u2 = z5 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                pxbVar.setPinForced(z5 && !tL_forumTopic.hidden);
                pxbVar.c5 = i;
                if (!sxbVar.getMessagesController().y2(-j)) {
                    pxbVar.setTopicIcon(tL_forumTopic);
                }
                pxbVar.d0(sxbVar.b0.contains(Integer.valueOf(i2)), z);
                pxbVar.setDialogSelected(sxbVar.R0 != ((long) i2));
                pxbVar.a0(sxbVar.c0, true);
            }
            pxbVar3.r0 = true;
            pxbVar3.y = true;
            pxbVar3.O = tL_forumTopic;
            pxbVar3.J = (byte) 72;
            pxbVar3.V = 42.0f;
            pxbVar3.K = (byte) 72;
            pxbVar3.L = (byte) 78;
            long n = pg3.n(tL_forumTopic.from_id);
            int i8 = message.date;
            i2 = i7;
            pxbVar3.e0(n, k47Var, i8, false, false);
            pxbVar3.t0 = true;
            pxbVar3.t2 = i5 < b();
            pxbVar = pxbVar3;
        } else {
            pxbVar = pxbVar3;
            i2 = i7;
        }
        z = z3;
        if (!sxbVar.getMessagesController().y2(-j)) {
        }
        pxbVar.d0(sxbVar.b0.contains(Integer.valueOf(i2)), z);
        pxbVar.setDialogSelected(sxbVar.R0 != ((long) i2));
        pxbVar.a0(sxbVar.c0, true);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        sxb sxbVar = this.d;
        if (i != 0 && i != 3) {
            if (i == 2) {
                hxb hxbVar = new hxb(this, sxbVar.getParentActivity());
                sxbVar.F0 = hxbVar;
                return new b59(hxbVar);
            }
            tk4 tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setViewType(24);
            tk4Var.setIsSingleCell(true);
            tk4Var.x = true;
            return new b59(tk4Var);
        }
        pxb pxbVar = new pxb(sxbVar, viewGroup.getContext(), false);
        if (i == 3) {
            i2 = ((d) sxbVar).currentAccount;
            boolean x = m9c.x(oc7.r1(i2).W1(Long.valueOf(-sxbVar.a)));
            pxbVar.setForumIcon(no4.e(ko4.k[0], ""));
            pxbVar.setTitleOverride(jb6.M0(!x ? 2131753031 : 2131753033, null));
            pxbVar.setCustomMessage(jb6.M0(!x ? 2131753032 : 2131753034, null));
        }
        z = ((d) sxbVar).inPreviewMode;
        pxbVar.l0 = z;
        pxbVar.setArchivedPullAnimation(sxbVar.x);
        return new b59(pxbVar);
    }
}
