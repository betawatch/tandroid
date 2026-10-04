package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class nf1 extends og.b {
    public final /* synthetic */ yf1 d;

    public nf1(yf1 yf1Var) {
        this.d = yf1Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        yf1 yf1Var = this.d;
        yf1Var.getClass();
        return yf1Var.b;
    }

    @Override // s4.h0
    public final int h() {
        return F().size() + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((pf1) this.d.b.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        vf1 vf1Var;
        int i11;
        boolean z10;
        int i12;
        yf1 yf1Var = this.d;
        ArrayList arrayList = yf1Var.b;
        long j3 = yf1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                vf1 vf1Var2 = (vf1) view;
                vf1Var2.setCurrentDialogId(-j3);
                if (i10 == arrayList.size() - 1 && !yf1Var.N.T0()) {
                    z11 = false;
                }
                vf1Var2.W4 = z11;
                vf1Var2.X4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((pf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((pf1) F().get(i14)).c : null;
        vf1 vf1Var3 = (vf1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = vf1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && vf1Var3.X4 == i10 && yf1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!yf1Var.getMessagesController().isMonoForum(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                vf1Var = vf1Var3;
                i11 = i16;
                boolean z13 = z12;
                vf1Var.X(tL_forumTopic, -j3, messageObject, yf1Var.isInPreviewMode(), z13);
                z10 = z13;
                vf1Var.W4 = i10 != arrayList.size() - 1 || yf1Var.N.T0();
                boolean z14 = tL_forumTopic.pinned;
                vf1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                vf1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                vf1Var.X4 = i10;
                if (!yf1Var.getMessagesController().isMonoForum(-j3)) {
                    vf1Var.setTopicIcon(tL_forumTopic);
                }
                vf1Var.T(yf1Var.a0.contains(Integer.valueOf(i11)), z10);
                vf1Var.setDialogSelected(yf1Var.Q0 != ((long) i11));
                vf1Var.R(yf1Var.b0, true);
            }
            vf1Var3.q0 = true;
            vf1Var3.x = true;
            vf1Var3.N = tL_forumTopic;
            vf1Var3.I = 72;
            vf1Var3.U = 42.0f;
            vf1Var3.J = 72;
            vf1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            vf1Var3.U(peerDialogId, messageObject, i17, false, false);
            vf1Var3.s0 = true;
            vf1Var3.s2 = i14 < h();
            vf1Var = vf1Var3;
        } else {
            vf1Var = vf1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!yf1Var.getMessagesController().isMonoForum(-j3)) {
        }
        vf1Var.T(yf1Var.a0.contains(Integer.valueOf(i11)), z10);
        vf1Var.setDialogSelected(yf1Var.Q0 != ((long) i11));
        vf1Var.R(yf1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        yf1 yf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                mf1 mf1Var = new mf1(this, yf1Var.getParentActivity());
                yf1Var.E0 = mf1Var;
                return new org.telegram.ui.Components.il0(mf1Var);
            }
            org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(viewGroup.getContext(), null);
            w00Var.setViewType(24);
            w00Var.setIsSingleCell(true);
            w00Var.w = true;
            return new org.telegram.ui.Components.il0(w00Var);
        }
        vf1 vf1Var = new vf1(yf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -yf1Var.a);
            vf1Var.setForumIcon(ng.d.d(ng.a.k[0], ""));
            vf1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            vf1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) yf1Var).inPreviewMode;
        vf1Var.k0 = z10;
        vf1Var.setArchivedPullAnimation(yf1Var.w);
        return new org.telegram.ui.Components.il0(vf1Var);
    }
}
