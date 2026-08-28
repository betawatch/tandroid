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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ke1 extends wf.b {
    public final /* synthetic */ we1 d;

    public ke1(we1 we1Var) {
        this.d = we1Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 3;
    }

    public final ArrayList F() {
        we1 we1Var = this.d;
        we1Var.getClass();
        return we1Var.b;
    }

    @Override // f2.r0
    public final int h() {
        return F().size() + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == h() - 1) {
            return 2;
        }
        return ((me1) this.d.b.get(i9)).a;
    }

    @Override // f2.r0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        se1 se1Var;
        int i10;
        boolean z10;
        int i11;
        we1 we1Var = this.d;
        ArrayList arrayList = we1Var.b;
        long j10 = we1Var.a;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 != 0) {
            boolean z11 = true;
            if (i12 == 3) {
                se1 se1Var2 = (se1) view;
                se1Var2.setCurrentDialogId(-j10);
                if (i9 == arrayList.size() - 1 && !we1Var.J.S0()) {
                    z11 = false;
                }
                se1Var2.S4 = z11;
                se1Var2.T4 = i9;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((me1) F().get(i9)).c;
        int i13 = i9 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i13 < F().size() ? ((me1) F().get(i13)).c : null;
        se1 se1Var3 = (se1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = se1Var3.J;
        int i14 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i15 = tL_forumTopic.id;
        boolean z12 = i14 == i15 && se1Var3.T4 == i9 && we1Var.C;
        if (message != null) {
            i11 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i11, message, false, false);
            if (!we1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                se1Var = se1Var3;
                i10 = i15;
                boolean z13 = z12;
                se1Var.X(tL_forumTopic, -j10, messageObject, we1Var.isInPreviewMode(), z13);
                z10 = z13;
                se1Var.S4 = i9 != arrayList.size() - 1 || we1Var.J.S0();
                boolean z14 = tL_forumTopic.pinned;
                se1Var.p2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                se1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                se1Var.T4 = i9;
                if (!we1Var.getMessagesController().isMonoForum(-j10)) {
                    se1Var.setTopicIcon(tL_forumTopic);
                }
                se1Var.U(we1Var.W.contains(Integer.valueOf(i10)), z10);
                se1Var.setDialogSelected(we1Var.M0 != ((long) i10));
                se1Var.S(we1Var.X, true);
            }
            se1Var3.m0 = true;
            se1Var3.x = true;
            se1Var3.J = tL_forumTopic;
            se1Var3.E = 72;
            se1Var3.Q = 42.0f;
            se1Var3.F = 72;
            se1Var3.G = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i16 = message.date;
            i10 = i15;
            se1Var3.V(peerDialogId, messageObject, i16, false, false);
            se1Var3.o0 = true;
            se1Var3.o2 = i13 < h();
            se1Var = se1Var3;
        } else {
            se1Var = se1Var3;
            i10 = i15;
        }
        z10 = z12;
        if (!we1Var.getMessagesController().isMonoForum(-j10)) {
        }
        se1Var.U(we1Var.W.contains(Integer.valueOf(i10)), z10);
        se1Var.setDialogSelected(we1Var.M0 != ((long) i10));
        se1Var.S(we1Var.X, true);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        int i10;
        we1 we1Var = this.d;
        if (i9 != 0 && i9 != 3) {
            if (i9 == 2) {
                je1 je1Var = new je1(this, we1Var.getParentActivity());
                we1Var.A0 = je1Var;
                return new org.telegram.ui.Components.ik0(je1Var);
            }
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(viewGroup.getContext(), null);
            e00Var.setViewType(24);
            e00Var.setIsSingleCell(true);
            e00Var.w = true;
            return new org.telegram.ui.Components.ik0(e00Var);
        }
        se1 se1Var = new se1(we1Var, viewGroup.getContext(), false);
        if (i9 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i10, -we1Var.a);
            se1Var.setForumIcon(vf.c.d(vf.a.k[0], ""));
            se1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            se1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) we1Var).inPreviewMode;
        se1Var.g0 = z10;
        se1Var.setArchivedPullAnimation(we1Var.w);
        return new org.telegram.ui.Components.ik0(se1Var);
    }
}
