package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p91 extends rg.b {
    public final /* synthetic */ y91 d;

    public p91(y91 y91Var) {
        this.d = y91Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        y91 y91Var = this.d;
        y91Var.getClass();
        return y91Var.b;
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
        return ((q91) this.d.b.get(i7)).a;
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
        v91 v91Var;
        int i10;
        boolean z10;
        int i11;
        y91 y91Var = this.d;
        ArrayList arrayList = y91Var.b;
        long j3 = y91Var.a;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 != 0) {
            boolean z11 = true;
            if (i12 == 3) {
                v91 v91Var2 = (v91) view;
                v91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !y91Var.O.R0()) {
                    z11 = false;
                }
                v91Var2.b5 = z11;
                v91Var2.c5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((q91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((q91) F().get(i13)).c : null;
        v91 v91Var3 = (v91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = v91Var3.O;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z12 = i14 == i15 && v91Var3.c5 == i7 && y91Var.H;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i11, message, false, false);
            if (!y91Var.getMessagesController().E2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                v91Var = v91Var3;
                i10 = i15;
                boolean z13 = z12;
                v91Var.f0(tL_forumTopic, -j3, gjVar, y91Var.isInPreviewMode(), z13);
                z10 = z13;
                v91Var.b5 = i7 != arrayList.size() - 1 || y91Var.O.R0();
                boolean z14 = tL_forumTopic.pinned;
                v91Var.u2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                v91Var.setPinForced(z14 && !tL_forumTopic.hidden);
                v91Var.c5 = i7;
                if (!y91Var.getMessagesController().E2(-j3)) {
                    v91Var.setTopicIcon(tL_forumTopic);
                }
                v91Var.c0(y91Var.b0.contains(Integer.valueOf(i10)), z10);
                v91Var.setDialogSelected(y91Var.R0 != ((long) i10));
                v91Var.a0(y91Var.c0, true);
            }
            v91Var3.r0 = true;
            v91Var3.y = true;
            v91Var3.O = tL_forumTopic;
            v91Var3.J = 72;
            v91Var3.V = 42.0f;
            v91Var3.K = 72;
            v91Var3.L = 78;
            long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            v91Var3.d0(o4, gjVar, i16, false, false);
            v91Var3.t0 = true;
            v91Var3.t2 = i13 < b();
            v91Var = v91Var3;
        } else {
            v91Var = v91Var3;
            i10 = i15;
        }
        z10 = z12;
        if (!y91Var.getMessagesController().E2(-j3)) {
        }
        v91Var.c0(y91Var.b0.contains(Integer.valueOf(i10)), z10);
        v91Var.setDialogSelected(y91Var.R0 != ((long) i10));
        v91Var.a0(y91Var.c0, true);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        y91 y91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                o91 o91Var = new o91(this, y91Var.getParentActivity());
                y91Var.F0 = o91Var;
                return new org.telegram.ui.Components.mj0(o91Var);
            }
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(viewGroup.getContext(), null);
            yzVar.setViewType(24);
            yzVar.setIsSingleCell(true);
            yzVar.x = true;
            return new org.telegram.ui.Components.mj0(yzVar);
        }
        v91 v91Var = new v91(y91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            boolean w10 = org.telegram.messenger.p10.w(org.telegram.messenger.np.u1(i10).c2(Long.valueOf(-y91Var.a)));
            v91Var.setForumIcon(qg.c.e(qg.a.k[0], ""));
            v91Var.setTitleOverride(org.telegram.messenger.hd.N0(!w10 ? 2131753063 : 2131753065, null));
            v91Var.setCustomMessage(org.telegram.messenger.hd.N0(!w10 ? 2131753064 : 2131753066, null));
        }
        z10 = ((org.telegram.ui.ActionBar.g2) y91Var).inPreviewMode;
        v91Var.l0 = z10;
        v91Var.setArchivedPullAnimation(y91Var.x);
        return new org.telegram.ui.Components.mj0(v91Var);
    }
}
