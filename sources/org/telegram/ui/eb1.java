package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class eb1 extends hg.c {
    public final /* synthetic */ nb1 d;

    public eb1(nb1 nb1Var) {
        this.d = nb1Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        nb1 nb1Var = this.d;
        nb1Var.getClass();
        return nb1Var.b;
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
        return ((fb1) this.d.b.get(i10)).a;
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
        kb1 kb1Var;
        int i11;
        boolean z10;
        int i12;
        nb1 nb1Var = this.d;
        ArrayList arrayList = nb1Var.b;
        long j10 = nb1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                kb1 kb1Var2 = (kb1) view;
                kb1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !nb1Var.N.R0()) {
                    z11 = false;
                }
                kb1Var2.a5 = z11;
                kb1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((fb1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((fb1) F().get(i14)).c : null;
        kb1 kb1Var3 = (kb1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = kb1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && kb1Var3.b5 == i10 && nb1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
            org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(i12, message, false, false);
            if (!nb1Var.getMessagesController().x2(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                kb1Var = kb1Var3;
                i11 = i16;
                boolean z13 = z12;
                kb1Var.f0(tL_forumTopic, -j10, kjVar, nb1Var.isInPreviewMode(), z13);
                z10 = z13;
                kb1Var.a5 = i10 != arrayList.size() - 1 || nb1Var.N.R0();
                boolean z14 = tL_forumTopic.pinned;
                kb1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                kb1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                kb1Var.b5 = i10;
                if (!nb1Var.getMessagesController().x2(-j10)) {
                    kb1Var.setTopicIcon(tL_forumTopic);
                }
                kb1Var.c0(nb1Var.a0.contains(Integer.valueOf(i11)), z10);
                kb1Var.setDialogSelected(nb1Var.Q0 != ((long) i11));
                kb1Var.a0(nb1Var.b0, true);
            }
            kb1Var3.q0 = true;
            kb1Var3.y = true;
            kb1Var3.N = tL_forumTopic;
            kb1Var3.I = 72;
            kb1Var3.U = 42.0f;
            kb1Var3.J = 72;
            kb1Var3.K = 78;
            long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            kb1Var3.d0(o10, kjVar, i17, false, false);
            kb1Var3.s0 = true;
            kb1Var3.s2 = i14 < b();
            kb1Var = kb1Var3;
        } else {
            kb1Var = kb1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!nb1Var.getMessagesController().x2(-j10)) {
        }
        kb1Var.c0(nb1Var.a0.contains(Integer.valueOf(i11)), z10);
        kb1Var.setDialogSelected(nb1Var.Q0 != ((long) i11));
        kb1Var.a0(nb1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        nb1 nb1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                db1 db1Var = new db1(this, nb1Var.getParentActivity());
                nb1Var.E0 = db1Var;
                return new org.telegram.ui.Components.dk0(db1Var);
            }
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
            zzVar.setViewType(24);
            zzVar.setIsSingleCell(true);
            zzVar.x = true;
            return new org.telegram.ui.Components.dk0(zzVar);
        }
        kb1 kb1Var = new kb1(nb1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
            boolean v = org.telegram.messenger.i20.v(org.telegram.messenger.wp.r1(i11).Z1(Long.valueOf(-nb1Var.a)));
            kb1Var.setForumIcon(gg.e.d(gg.a.k[0], ""));
            kb1Var.setTitleOverride(org.telegram.messenger.dd.L0(!v ? 2131753066 : 2131753068, null));
            kb1Var.setCustomMessage(org.telegram.messenger.dd.L0(!v ? 2131753067 : 2131753069, null));
        }
        z10 = ((org.telegram.ui.ActionBar.k2) nb1Var).inPreviewMode;
        kb1Var.k0 = z10;
        kb1Var.setArchivedPullAnimation(nb1Var.x);
        return new org.telegram.ui.Components.dk0(kb1Var);
    }
}
