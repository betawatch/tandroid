package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m91 extends rg.b {
    public final /* synthetic */ v91 d;

    public m91(v91 v91Var) {
        this.d = v91Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 3;
    }

    public final ArrayList F() {
        v91 v91Var = this.d;
        v91Var.getClass();
        return v91Var.b;
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
        return ((n91) this.d.b.get(i7)).a;
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
        s91 s91Var;
        int i10;
        boolean z9;
        int i11;
        v91 v91Var = this.d;
        ArrayList arrayList = v91Var.b;
        long j3 = v91Var.a;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            boolean z10 = true;
            if (i12 == 3) {
                s91 s91Var2 = (s91) view;
                s91Var2.setCurrentDialogId(-j3);
                if (i7 == arrayList.size() - 1 && !v91Var.N.R0()) {
                    z10 = false;
                }
                s91Var2.a5 = z10;
                s91Var2.b5 = i7;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((n91) F().get(i7)).c;
        int i13 = i7 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((n91) F().get(i13)).c : null;
        s91 s91Var3 = (s91) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = s91Var3.N;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z11 = i14 == i15 && s91Var3.b5 == i7 && v91Var.G;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, message, false, false);
            if (!v91Var.getMessagesController().y2(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                s91Var = s91Var3;
                i10 = i15;
                boolean z12 = z11;
                s91Var.g0(tL_forumTopic, -j3, ijVar, v91Var.isInPreviewMode(), z12);
                z9 = z12;
                s91Var.a5 = i7 != arrayList.size() - 1 || v91Var.N.R0();
                boolean z13 = tL_forumTopic.pinned;
                s91Var.t2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                s91Var.setPinForced(z13 && !tL_forumTopic.hidden);
                s91Var.b5 = i7;
                if (!v91Var.getMessagesController().y2(-j3)) {
                    s91Var.setTopicIcon(tL_forumTopic);
                }
                s91Var.c0(v91Var.a0.contains(Integer.valueOf(i10)), z9);
                s91Var.setDialogSelected(v91Var.Q0 != ((long) i10));
                s91Var.a0(v91Var.b0, true);
            }
            s91Var3.q0 = true;
            s91Var3.y = true;
            s91Var3.N = tL_forumTopic;
            s91Var3.I = 72;
            s91Var3.U = 42.0f;
            s91Var3.J = 72;
            s91Var3.K = 78;
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            s91Var3.d0(o4, ijVar, i16, false, false);
            s91Var3.s0 = true;
            s91Var3.s2 = i13 < b();
            s91Var = s91Var3;
        } else {
            s91Var = s91Var3;
            i10 = i15;
        }
        z9 = z11;
        if (!v91Var.getMessagesController().y2(-j3)) {
        }
        s91Var.c0(v91Var.a0.contains(Integer.valueOf(i10)), z9);
        s91Var.setDialogSelected(v91Var.Q0 != ((long) i10));
        s91Var.a0(v91Var.b0, true);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        v91 v91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                l91 l91Var = new l91(this, v91Var.getParentActivity());
                v91Var.E0 = l91Var;
                return new org.telegram.ui.Components.xi0(l91Var);
            }
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(viewGroup.getContext(), null);
            lzVar.setViewType(24);
            lzVar.setIsSingleCell(true);
            lzVar.x = true;
            return new org.telegram.ui.Components.xi0(lzVar);
        }
        s91 s91Var = new s91(v91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-v91Var.a)));
            s91Var.setForumIcon(qg.d.d(qg.a.k[0], ""));
            s91Var.setTitleOverride(org.telegram.messenger.hd.M0(!v ? 2131753066 : 2131753068, null));
            s91Var.setCustomMessage(org.telegram.messenger.hd.M0(!v ? 2131753067 : 2131753069, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) v91Var).inPreviewMode;
        s91Var.k0 = z9;
        s91Var.setArchivedPullAnimation(v91Var.x);
        return new org.telegram.ui.Components.xi0(s91Var);
    }
}
