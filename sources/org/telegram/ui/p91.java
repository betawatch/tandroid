package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p91 extends rg.b {
    public final /* synthetic */ y91 d;

    public p91(y91 y91Var) {
        this.d = y91Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        y91 y91Var = this.d;
        y91Var.getClass();
        return y91Var.b;
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
        return ((q91) this.d.b.get(i7)).a;
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
        v91 v91Var;
        int i10;
        boolean z9;
        int i11;
        y91 y91Var = this.d;
        ArrayList arrayList = y91Var.b;
        long j3 = y91Var.a;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            boolean z10 = true;
            if (i12 == 3) {
                v91 v91Var2 = (v91) view;
                v91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !y91Var.N.R0()) {
                    z10 = false;
                }
                v91Var2.a5 = z10;
                v91Var2.b5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((q91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((q91) F().get(i13)).c : null;
        v91 v91Var3 = (v91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = v91Var3.N;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z11 = i14 == i15 && v91Var3.b5 == i7 && y91Var.G;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, message, false, false);
            if (!y91Var.getMessagesController().y2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                v91Var = v91Var3;
                i10 = i15;
                boolean z12 = z11;
                v91Var.g0(tL_forumTopic, -j3, ijVar, y91Var.isInPreviewMode(), z12);
                z9 = z12;
                v91Var.a5 = i7 != arrayList.size() - 1 || y91Var.N.R0();
                boolean z13 = tL_forumTopic.pinned;
                v91Var.t2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                v91Var.setPinForced(z13 && !tL_forumTopic.hidden);
                v91Var.b5 = i7;
                if (!y91Var.getMessagesController().y2(-j3)) {
                    v91Var.setTopicIcon(tL_forumTopic);
                }
                v91Var.c0(y91Var.a0.contains(Integer.valueOf(i10)), z9);
                v91Var.setDialogSelected(y91Var.Q0 != ((long) i10));
                v91Var.a0(y91Var.b0, true);
            }
            v91Var3.q0 = true;
            v91Var3.y = true;
            v91Var3.N = tL_forumTopic;
            v91Var3.I = 72;
            v91Var3.U = 42.0f;
            v91Var3.J = 72;
            v91Var3.K = 78;
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            v91Var3.d0(o4, ijVar, i16, false, false);
            v91Var3.s0 = true;
            v91Var3.s2 = i13 < b();
            v91Var = v91Var3;
        } else {
            v91Var = v91Var3;
            i10 = i15;
        }
        z9 = z11;
        if (!y91Var.getMessagesController().y2(-j3)) {
        }
        v91Var.c0(y91Var.a0.contains(Integer.valueOf(i10)), z9);
        v91Var.setDialogSelected(y91Var.Q0 != ((long) i10));
        v91Var.a0(y91Var.b0, true);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        y91 y91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                o91 o91Var = new o91(this, y91Var.getParentActivity());
                y91Var.E0 = o91Var;
                return new org.telegram.ui.Components.yi0(o91Var);
            }
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(viewGroup.getContext(), null);
            mzVar.setViewType(24);
            mzVar.setIsSingleCell(true);
            mzVar.x = true;
            return new org.telegram.ui.Components.yi0(mzVar);
        }
        v91 v91Var = new v91(y91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-y91Var.a)));
            v91Var.setForumIcon(qg.d.d(qg.a.k[0], ""));
            v91Var.setTitleOverride(org.telegram.messenger.id.M0(!v ? 2131753066 : 2131753068, null));
            v91Var.setCustomMessage(org.telegram.messenger.id.M0(!v ? 2131753067 : 2131753069, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) y91Var).inPreviewMode;
        v91Var.k0 = z9;
        v91Var.setArchivedPullAnimation(y91Var.x);
        return new org.telegram.ui.Components.yi0(v91Var);
    }
}
