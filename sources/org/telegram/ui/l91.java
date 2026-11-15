package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l91 extends rg.b {
    public final /* synthetic */ u91 d;

    public l91(u91 u91Var) {
        this.d = u91Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        u91 u91Var = this.d;
        u91Var.getClass();
        return u91Var.b;
    }

    @Override // v4.h0
    public final int b() {
        return F().size() + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == b() - 1) {
            return 2;
        }
        return ((m91) this.d.b.get(i7)).a;
    }

    @Override // v4.h0
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        r91 r91Var;
        int i10;
        boolean z10;
        int i11;
        u91 u91Var = this.d;
        ArrayList arrayList = u91Var.b;
        long j3 = u91Var.a;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 != 0) {
            boolean z11 = true;
            if (i12 == 3) {
                r91 r91Var2 = (r91) view;
                r91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !u91Var.O.R0()) {
                    z11 = false;
                }
                r91Var2.b5 = z11;
                r91Var2.c5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((m91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((m91) F().get(i13)).c : null;
        r91 r91Var3 = (r91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = r91Var3.O;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z12 = i14 == i15 && r91Var3.c5 == i7 && u91Var.H;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i11, message, false, false);
            if (!u91Var.getMessagesController().y2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                r91Var = r91Var3;
                i10 = i15;
                boolean z13 = z12;
                r91Var.h0(tL_forumTopic, -j3, gjVar, u91Var.isInPreviewMode(), z13);
                z10 = z13;
                r91Var.b5 = i7 != arrayList.size() - 1 || u91Var.O.R0();
                boolean z14 = tL_forumTopic.pinned;
                r91Var.u2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                r91Var.setPinForced(z14 && !tL_forumTopic.hidden);
                r91Var.c5 = i7;
                if (!u91Var.getMessagesController().y2(-j3)) {
                    r91Var.setTopicIcon(tL_forumTopic);
                }
                r91Var.e0(u91Var.b0.contains(Integer.valueOf(i10)), z10);
                r91Var.setDialogSelected(u91Var.R0 != ((long) i10));
                r91Var.c0(u91Var.c0, true);
            }
            r91Var3.r0 = true;
            r91Var3.y = true;
            r91Var3.O = tL_forumTopic;
            r91Var3.J = 72;
            r91Var3.V = 42.0f;
            r91Var3.K = 72;
            r91Var3.L = 78;
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            r91Var3.f0(o4, gjVar, i16, false, false);
            r91Var3.t0 = true;
            r91Var3.t2 = i13 < b();
            r91Var = r91Var3;
        } else {
            r91Var = r91Var3;
            i10 = i15;
        }
        z10 = z12;
        if (!u91Var.getMessagesController().y2(-j3)) {
        }
        r91Var.e0(u91Var.b0.contains(Integer.valueOf(i10)), z10);
        r91Var.setDialogSelected(u91Var.R0 != ((long) i10));
        r91Var.c0(u91Var.c0, true);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        u91 u91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                k91 k91Var = new k91(this, u91Var.getParentActivity());
                u91Var.F0 = k91Var;
                return new org.telegram.ui.Components.cj0(k91Var);
            }
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(viewGroup.getContext(), null);
            pzVar.setViewType(24);
            pzVar.setIsSingleCell(true);
            pzVar.x = true;
            return new org.telegram.ui.Components.cj0(pzVar);
        }
        r91 r91Var = new r91(u91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
            boolean v = org.telegram.messenger.q10.v(org.telegram.messenger.np.s1(i10).a2(Long.valueOf(-u91Var.a)));
            r91Var.setForumIcon(qg.c.d(qg.a.k[0], ""));
            r91Var.setTitleOverride(org.telegram.messenger.hd.M0(!v ? 2131753066 : 2131753068, null));
            r91Var.setCustomMessage(org.telegram.messenger.hd.M0(!v ? 2131753067 : 2131753069, null));
        }
        z10 = ((org.telegram.ui.ActionBar.e2) u91Var).inPreviewMode;
        r91Var.l0 = z10;
        r91Var.setArchivedPullAnimation(u91Var.x);
        return new org.telegram.ui.Components.cj0(r91Var);
    }
}
