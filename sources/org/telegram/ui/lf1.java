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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class lf1 extends og.b {
    public final /* synthetic */ wf1 d;

    public lf1(wf1 wf1Var) {
        this.d = wf1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        wf1 wf1Var = this.d;
        wf1Var.getClass();
        return wf1Var.b;
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
        return ((nf1) this.d.b.get(i10)).a;
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
        tf1 tf1Var;
        int i11;
        boolean z10;
        int i12;
        wf1 wf1Var = this.d;
        ArrayList arrayList = wf1Var.b;
        long j3 = wf1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                tf1 tf1Var2 = (tf1) view;
                tf1Var2.setCurrentDialogId(-j3);
                if (i10 == arrayList.size() - 1 && !wf1Var.N.S0()) {
                    z11 = false;
                }
                tf1Var2.W4 = z11;
                tf1Var2.X4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((nf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((nf1) F().get(i14)).c : null;
        tf1 tf1Var3 = (tf1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = tf1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && tf1Var3.X4 == i10 && wf1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!wf1Var.getMessagesController().isMonoForum(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                tf1Var = tf1Var3;
                i11 = i16;
                boolean z13 = z12;
                tf1Var.Y(tL_forumTopic, -j3, messageObject, wf1Var.isInPreviewMode(), z13);
                z10 = z13;
                tf1Var.W4 = i10 != arrayList.size() - 1 || wf1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                tf1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                tf1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                tf1Var.X4 = i10;
                if (!wf1Var.getMessagesController().isMonoForum(-j3)) {
                    tf1Var.setTopicIcon(tL_forumTopic);
                }
                tf1Var.V(wf1Var.a0.contains(Integer.valueOf(i11)), z10);
                tf1Var.setDialogSelected(wf1Var.Q0 != ((long) i11));
                tf1Var.T(wf1Var.b0, true);
            }
            tf1Var3.q0 = true;
            tf1Var3.x = true;
            tf1Var3.N = tL_forumTopic;
            tf1Var3.I = 72;
            tf1Var3.U = 42.0f;
            tf1Var3.J = 72;
            tf1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            tf1Var3.W(peerDialogId, messageObject, i17, false, false);
            tf1Var3.s0 = true;
            tf1Var3.s2 = i14 < h();
            tf1Var = tf1Var3;
        } else {
            tf1Var = tf1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!wf1Var.getMessagesController().isMonoForum(-j3)) {
        }
        tf1Var.V(wf1Var.a0.contains(Integer.valueOf(i11)), z10);
        tf1Var.setDialogSelected(wf1Var.Q0 != ((long) i11));
        tf1Var.T(wf1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        wf1 wf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                kf1 kf1Var = new kf1(this, wf1Var.getParentActivity());
                wf1Var.E0 = kf1Var;
                return new org.telegram.ui.Components.gl0(kf1Var);
            }
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setViewType(24);
            u00Var.setIsSingleCell(true);
            u00Var.w = true;
            return new org.telegram.ui.Components.gl0(u00Var);
        }
        tf1 tf1Var = new tf1(wf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -wf1Var.a);
            tf1Var.setForumIcon(ng.d.d(ng.a.k[0], ""));
            tf1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            tf1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wf1Var).inPreviewMode;
        tf1Var.k0 = z10;
        tf1Var.setArchivedPullAnimation(wf1Var.w);
        return new org.telegram.ui.Components.gl0(tf1Var);
    }
}
