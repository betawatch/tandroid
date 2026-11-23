package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n91 extends rg.b {
    public final /* synthetic */ w91 d;

    public n91(w91 w91Var) {
        this.d = w91Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        w91 w91Var = this.d;
        w91Var.getClass();
        return w91Var.b;
    }

    @Override // v4.i0
    public final int b() {
        return F().size() + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == b() - 1) {
            return 2;
        }
        return ((o91) this.d.b.get(i7)).a;
    }

    @Override // v4.i0
    public final void f() {
        this.d.c = b();
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        t91 t91Var;
        int i10;
        boolean z10;
        int i11;
        w91 w91Var = this.d;
        ArrayList arrayList = w91Var.b;
        long j3 = w91Var.a;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 != 0) {
            boolean z11 = true;
            if (i12 == 3) {
                t91 t91Var2 = (t91) view;
                t91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !w91Var.O.R0()) {
                    z11 = false;
                }
                t91Var2.b5 = z11;
                t91Var2.c5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((o91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((o91) F().get(i13)).c : null;
        t91 t91Var3 = (t91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = t91Var3.O;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z12 = i14 == i15 && t91Var3.c5 == i7 && w91Var.H;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i11, message, false, false);
            if (!w91Var.getMessagesController().E2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                t91Var = t91Var3;
                i10 = i15;
                boolean z13 = z12;
                t91Var.h0(tL_forumTopic, -j3, fjVar, w91Var.isInPreviewMode(), z13);
                z10 = z13;
                t91Var.b5 = i7 != arrayList.size() - 1 || w91Var.O.R0();
                boolean z14 = tL_forumTopic.pinned;
                t91Var.u2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                t91Var.setPinForced(z14 && !tL_forumTopic.hidden);
                t91Var.c5 = i7;
                if (!w91Var.getMessagesController().E2(-j3)) {
                    t91Var.setTopicIcon(tL_forumTopic);
                }
                t91Var.e0(w91Var.b0.contains(Integer.valueOf(i10)), z10);
                t91Var.setDialogSelected(w91Var.R0 != ((long) i10));
                t91Var.c0(w91Var.c0, true);
            }
            t91Var3.r0 = true;
            t91Var3.y = true;
            t91Var3.O = tL_forumTopic;
            t91Var3.J = 72;
            t91Var3.V = 42.0f;
            t91Var3.K = 72;
            t91Var3.L = 78;
            long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            t91Var3.f0(o4, fjVar, i16, false, false);
            t91Var3.t0 = true;
            t91Var3.t2 = i13 < b();
            t91Var = t91Var3;
        } else {
            t91Var = t91Var3;
            i10 = i15;
        }
        z10 = z12;
        if (!w91Var.getMessagesController().E2(-j3)) {
        }
        t91Var.e0(w91Var.b0.contains(Integer.valueOf(i10)), z10);
        t91Var.setDialogSelected(w91Var.R0 != ((long) i10));
        t91Var.c0(w91Var.c0, true);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        w91 w91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                m91 m91Var = new m91(this, w91Var.getParentActivity());
                w91Var.F0 = m91Var;
                return new org.telegram.ui.Components.mj0(m91Var);
            }
            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(viewGroup.getContext(), null);
            vzVar.setViewType(24);
            vzVar.setIsSingleCell(true);
            vzVar.x = true;
            return new org.telegram.ui.Components.mj0(vzVar);
        }
        t91 t91Var = new t91(w91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
            boolean w10 = org.telegram.messenger.n10.w(org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(-w91Var.a)));
            t91Var.setForumIcon(qg.c.e(qg.a.k[0], ""));
            t91Var.setTitleOverride(org.telegram.messenger.gd.N0(!w10 ? 2131753063 : 2131753065, null));
            t91Var.setCustomMessage(org.telegram.messenger.gd.N0(!w10 ? 2131753064 : 2131753066, null));
        }
        z10 = ((org.telegram.ui.ActionBar.g2) w91Var).inPreviewMode;
        t91Var.l0 = z10;
        t91Var.setArchivedPullAnimation(w91Var.x);
        return new org.telegram.ui.Components.mj0(t91Var);
    }
}
