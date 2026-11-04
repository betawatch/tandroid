package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d91 extends sg.b {
    public final /* synthetic */ m91 d;

    public d91(m91 m91Var) {
        this.d = m91Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 3;
    }

    public final ArrayList F() {
        m91 m91Var = this.d;
        m91Var.getClass();
        return m91Var.b;
    }

    @Override // u4.h0
    public final int b() {
        return F().size() + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == b() - 1) {
            return 2;
        }
        return ((e91) this.d.b.get(i3)).a;
    }

    @Override // u4.h0
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        j91 j91Var;
        int i10;
        boolean z10;
        int i11;
        m91 m91Var = this.d;
        ArrayList arrayList = m91Var.b;
        long j10 = m91Var.a;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            boolean z11 = true;
            if (i12 == 3) {
                j91 j91Var2 = (j91) view;
                j91Var2.setCurrentDialogId(-j10);
                if (i3 == arrayList.size() - 1 && !m91Var.O.R0()) {
                    z11 = false;
                }
                j91Var2.b5 = z11;
                j91Var2.c5 = i3;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((e91) F().get(i3)).c;
        int i13 = i3 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((e91) F().get(i13)).c : null;
        j91 j91Var3 = (j91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = j91Var3.O;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z12 = i14 == i15 && j91Var3.c5 == i3 && m91Var.H;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i11, message, false, false);
            if (!m91Var.getMessagesController().y2(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                j91Var = j91Var3;
                i10 = i15;
                boolean z13 = z12;
                j91Var.f0(tL_forumTopic, -j10, ziVar, m91Var.isInPreviewMode(), z13);
                z10 = z13;
                j91Var.b5 = i3 != arrayList.size() - 1 || m91Var.O.R0();
                boolean z14 = tL_forumTopic.pinned;
                j91Var.u2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                j91Var.setPinForced(z14 && !tL_forumTopic.hidden);
                j91Var.c5 = i3;
                if (!m91Var.getMessagesController().y2(-j10)) {
                    j91Var.setTopicIcon(tL_forumTopic);
                }
                j91Var.c0(m91Var.b0.contains(Integer.valueOf(i10)), z10);
                j91Var.setDialogSelected(m91Var.R0 != ((long) i10));
                j91Var.a0(m91Var.c0, true);
            }
            j91Var3.r0 = true;
            j91Var3.y = true;
            j91Var3.O = tL_forumTopic;
            j91Var3.J = 72;
            j91Var3.V = 42.0f;
            j91Var3.K = 72;
            j91Var3.L = 78;
            long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            j91Var3.d0(o10, ziVar, i16, false, false);
            j91Var3.t0 = true;
            j91Var3.t2 = i13 < b();
            j91Var = j91Var3;
        } else {
            j91Var = j91Var3;
            i10 = i15;
        }
        z10 = z12;
        if (!m91Var.getMessagesController().y2(-j10)) {
        }
        j91Var.c0(m91Var.b0.contains(Integer.valueOf(i10)), z10);
        j91Var.setDialogSelected(m91Var.R0 != ((long) i10));
        j91Var.a0(m91Var.c0, true);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        int i10;
        m91 m91Var = this.d;
        if (i3 != 0 && i3 != 3) {
            if (i3 == 2) {
                c91 c91Var = new c91(this, m91Var.getParentActivity());
                m91Var.F0 = c91Var;
                return new org.telegram.ui.Components.bj0(c91Var);
            }
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(viewGroup.getContext(), null);
            izVar.setViewType(24);
            izVar.setIsSingleCell(true);
            izVar.x = true;
            return new org.telegram.ui.Components.bj0(izVar);
        }
        j91 j91Var = new j91(m91Var, viewGroup.getContext(), false);
        if (i3 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
            boolean v = org.telegram.messenger.l10.v(org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(-m91Var.a)));
            j91Var.setForumIcon(rg.c.d(rg.a.k[0], ""));
            j91Var.setTitleOverride(org.telegram.messenger.bd.M0(!v ? 2131753066 : 2131753068, null));
            j91Var.setCustomMessage(org.telegram.messenger.bd.M0(!v ? 2131753067 : 2131753069, null));
        }
        z10 = ((org.telegram.ui.ActionBar.d2) m91Var).inPreviewMode;
        j91Var.l0 = z10;
        j91Var.setArchivedPullAnimation(m91Var.x);
        return new org.telegram.ui.Components.bj0(j91Var);
    }
}
