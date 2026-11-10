package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q91 extends rg.b {
    public final /* synthetic */ z91 d;

    public q91(z91 z91Var) {
        this.d = z91Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        z91 z91Var = this.d;
        z91Var.getClass();
        return z91Var.b;
    }

    @Override // v4.g0
    public final int b() {
        return F().size() + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == b() - 1) {
            return 2;
        }
        return ((r91) this.d.b.get(i7)).a;
    }

    @Override // v4.g0
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        w91 w91Var;
        int i10;
        boolean z9;
        int i11;
        z91 z91Var = this.d;
        ArrayList arrayList = z91Var.b;
        long j3 = z91Var.a;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            boolean z10 = true;
            if (i12 == 3) {
                w91 w91Var2 = (w91) view;
                w91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !z91Var.N.R0()) {
                    z10 = false;
                }
                w91Var2.a5 = z10;
                w91Var2.b5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((r91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((r91) F().get(i13)).c : null;
        w91 w91Var3 = (w91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = w91Var3.N;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z11 = i14 == i15 && w91Var3.b5 == i7 && z91Var.G;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, message, false, false);
            if (!z91Var.getMessagesController().y2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                w91Var = w91Var3;
                i10 = i15;
                boolean z12 = z11;
                w91Var.g0(tL_forumTopic, -j3, ijVar, z91Var.isInPreviewMode(), z12);
                z9 = z12;
                w91Var.a5 = i7 != arrayList.size() - 1 || z91Var.N.R0();
                boolean z13 = tL_forumTopic.pinned;
                w91Var.t2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                w91Var.setPinForced(z13 && !tL_forumTopic.hidden);
                w91Var.b5 = i7;
                if (!z91Var.getMessagesController().y2(-j3)) {
                    w91Var.setTopicIcon(tL_forumTopic);
                }
                w91Var.c0(z91Var.a0.contains(Integer.valueOf(i10)), z9);
                w91Var.setDialogSelected(z91Var.Q0 != ((long) i10));
                w91Var.a0(z91Var.b0, true);
            }
            w91Var3.q0 = true;
            w91Var3.y = true;
            w91Var3.N = tL_forumTopic;
            w91Var3.I = 72;
            w91Var3.U = 42.0f;
            w91Var3.J = 72;
            w91Var3.K = 78;
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            w91Var3.d0(o4, ijVar, i16, false, false);
            w91Var3.s0 = true;
            w91Var3.s2 = i13 < b();
            w91Var = w91Var3;
        } else {
            w91Var = w91Var3;
            i10 = i15;
        }
        z9 = z11;
        if (!z91Var.getMessagesController().y2(-j3)) {
        }
        w91Var.c0(z91Var.a0.contains(Integer.valueOf(i10)), z9);
        w91Var.setDialogSelected(z91Var.Q0 != ((long) i10));
        w91Var.a0(z91Var.b0, true);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        z91 z91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                p91 p91Var = new p91(this, z91Var.getParentActivity());
                z91Var.E0 = p91Var;
                return new org.telegram.ui.Components.xi0(p91Var);
            }
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(viewGroup.getContext(), null);
            lzVar.setViewType(24);
            lzVar.setIsSingleCell(true);
            lzVar.x = true;
            return new org.telegram.ui.Components.xi0(lzVar);
        }
        w91 w91Var = new w91(z91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-z91Var.a)));
            w91Var.setForumIcon(qg.d.d(qg.a.k[0], ""));
            w91Var.setTitleOverride(org.telegram.messenger.id.M0(!v ? 2131753066 : 2131753068, null));
            w91Var.setCustomMessage(org.telegram.messenger.id.M0(!v ? 2131753067 : 2131753069, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) z91Var).inPreviewMode;
        w91Var.k0 = z9;
        w91Var.setArchivedPullAnimation(z91Var.x);
        return new org.telegram.ui.Components.xi0(w91Var);
    }
}
