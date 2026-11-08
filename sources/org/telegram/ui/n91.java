package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n91 extends rg.b {
    public final /* synthetic */ w91 d;

    public n91(w91 w91Var) {
        this.d = w91Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        w91 w91Var = this.d;
        w91Var.getClass();
        return w91Var.b;
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
        return ((o91) this.d.b.get(i7)).a;
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
        t91 t91Var;
        int i10;
        boolean z9;
        int i11;
        w91 w91Var = this.d;
        ArrayList arrayList = w91Var.b;
        long j3 = w91Var.a;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            boolean z10 = true;
            if (i12 == 3) {
                t91 t91Var2 = (t91) view;
                t91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !w91Var.N.R0()) {
                    z10 = false;
                }
                t91Var2.a5 = z10;
                t91Var2.b5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((o91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((o91) F().get(i13)).c : null;
        t91 t91Var3 = (t91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = t91Var3.N;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z11 = i14 == i15 && t91Var3.b5 == i7 && w91Var.G;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, message, false, false);
            if (!w91Var.getMessagesController().y2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                t91Var = t91Var3;
                i10 = i15;
                boolean z12 = z11;
                t91Var.g0(tL_forumTopic, -j3, ijVar, w91Var.isInPreviewMode(), z12);
                z9 = z12;
                t91Var.a5 = i7 != arrayList.size() - 1 || w91Var.N.R0();
                boolean z13 = tL_forumTopic.pinned;
                t91Var.t2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                t91Var.setPinForced(z13 && !tL_forumTopic.hidden);
                t91Var.b5 = i7;
                if (!w91Var.getMessagesController().y2(-j3)) {
                    t91Var.setTopicIcon(tL_forumTopic);
                }
                t91Var.c0(w91Var.a0.contains(Integer.valueOf(i10)), z9);
                t91Var.setDialogSelected(w91Var.Q0 != ((long) i10));
                t91Var.a0(w91Var.b0, true);
            }
            t91Var3.q0 = true;
            t91Var3.y = true;
            t91Var3.N = tL_forumTopic;
            t91Var3.I = 72;
            t91Var3.U = 42.0f;
            t91Var3.J = 72;
            t91Var3.K = 78;
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            t91Var3.d0(o4, ijVar, i16, false, false);
            t91Var3.s0 = true;
            t91Var3.s2 = i13 < b();
            t91Var = t91Var3;
        } else {
            t91Var = t91Var3;
            i10 = i15;
        }
        z9 = z11;
        if (!w91Var.getMessagesController().y2(-j3)) {
        }
        t91Var.c0(w91Var.a0.contains(Integer.valueOf(i10)), z9);
        t91Var.setDialogSelected(w91Var.Q0 != ((long) i10));
        t91Var.a0(w91Var.b0, true);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        w91 w91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                m91 m91Var = new m91(this, w91Var.getParentActivity());
                w91Var.E0 = m91Var;
                return new org.telegram.ui.Components.xi0(m91Var);
            }
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(viewGroup.getContext(), null);
            mzVar.setViewType(24);
            mzVar.setIsSingleCell(true);
            mzVar.x = true;
            return new org.telegram.ui.Components.xi0(mzVar);
        }
        t91 t91Var = new t91(w91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-w91Var.a)));
            t91Var.setForumIcon(qg.d.d(qg.a.k[0], ""));
            t91Var.setTitleOverride(org.telegram.messenger.id.M0(!v ? 2131753066 : 2131753068, null));
            t91Var.setCustomMessage(org.telegram.messenger.id.M0(!v ? 2131753067 : 2131753069, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) w91Var).inPreviewMode;
        t91Var.k0 = z9;
        t91Var.setArchivedPullAnimation(w91Var.x);
        return new org.telegram.ui.Components.xi0(t91Var);
    }
}
