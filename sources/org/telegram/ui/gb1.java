package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gb1 extends hg.c {
    public final /* synthetic */ pb1 d;

    public gb1(pb1 pb1Var) {
        this.d = pb1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        pb1 pb1Var = this.d;
        pb1Var.getClass();
        return pb1Var.b;
    }

    @Override // s4.g0
    public final int b() {
        return F().size() + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == b() - 1) {
            return 2;
        }
        return ((hb1) this.d.b.get(i10)).a;
    }

    @Override // s4.g0
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        mb1 mb1Var;
        int i11;
        boolean z10;
        int i12;
        pb1 pb1Var = this.d;
        ArrayList arrayList = pb1Var.b;
        long j10 = pb1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                mb1 mb1Var2 = (mb1) view;
                mb1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !pb1Var.N.R0()) {
                    z11 = false;
                }
                mb1Var2.a5 = z11;
                mb1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((hb1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((hb1) F().get(i14)).c : null;
        mb1 mb1Var3 = (mb1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = mb1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && mb1Var3.b5 == i10 && pb1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i12, message, false, false);
            if (!pb1Var.getMessagesController().x2(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                mb1Var = mb1Var3;
                i11 = i16;
                boolean z13 = z12;
                mb1Var.f0(tL_forumTopic, -j10, jjVar, pb1Var.isInPreviewMode(), z13);
                z10 = z13;
                mb1Var.a5 = i10 != arrayList.size() - 1 || pb1Var.N.R0();
                boolean z14 = tL_forumTopic.pinned;
                mb1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                mb1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                mb1Var.b5 = i10;
                if (!pb1Var.getMessagesController().x2(-j10)) {
                    mb1Var.setTopicIcon(tL_forumTopic);
                }
                mb1Var.c0(pb1Var.a0.contains(Integer.valueOf(i11)), z10);
                mb1Var.setDialogSelected(pb1Var.Q0 != ((long) i11));
                mb1Var.a0(pb1Var.b0, true);
            }
            mb1Var3.q0 = true;
            mb1Var3.y = true;
            mb1Var3.N = tL_forumTopic;
            mb1Var3.I = 72;
            mb1Var3.U = 42.0f;
            mb1Var3.J = 72;
            mb1Var3.K = 78;
            long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            mb1Var3.d0(o10, jjVar, i17, false, false);
            mb1Var3.s0 = true;
            mb1Var3.s2 = i14 < b();
            mb1Var = mb1Var3;
        } else {
            mb1Var = mb1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!pb1Var.getMessagesController().x2(-j10)) {
        }
        mb1Var.c0(pb1Var.a0.contains(Integer.valueOf(i11)), z10);
        mb1Var.setDialogSelected(pb1Var.Q0 != ((long) i11));
        mb1Var.a0(pb1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        pb1 pb1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                fb1 fb1Var = new fb1(this, pb1Var.getParentActivity());
                pb1Var.E0 = fb1Var;
                return new org.telegram.ui.Components.ck0(fb1Var);
            }
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
            zzVar.setViewType(24);
            zzVar.setIsSingleCell(true);
            zzVar.x = true;
            return new org.telegram.ui.Components.ck0(zzVar);
        }
        mb1 mb1Var = new mb1(pb1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
            boolean v = org.telegram.messenger.h20.v(org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(-pb1Var.a)));
            mb1Var.setForumIcon(gg.e.d(gg.a.k[0], ""));
            mb1Var.setTitleOverride(org.telegram.messenger.cd.L0(!v ? 2131753066 : 2131753068, null));
            mb1Var.setCustomMessage(org.telegram.messenger.cd.L0(!v ? 2131753067 : 2131753069, null));
        }
        z10 = ((org.telegram.ui.ActionBar.k2) pb1Var).inPreviewMode;
        mb1Var.k0 = z10;
        mb1Var.setArchivedPullAnimation(pb1Var.x);
        return new org.telegram.ui.Components.ck0(mb1Var);
    }
}
