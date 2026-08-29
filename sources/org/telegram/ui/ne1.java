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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ne1 extends zf.b {
    public final /* synthetic */ ze1 d;

    public ne1(ze1 ze1Var) {
        this.d = ze1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        ze1 ze1Var = this.d;
        ze1Var.getClass();
        return ze1Var.b;
    }

    @Override // f2.p0
    public final int h() {
        return F().size() + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((pe1) this.d.b.get(i10)).a;
    }

    @Override // f2.p0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        we1 we1Var;
        int i11;
        boolean z10;
        int i12;
        ze1 ze1Var = this.d;
        ArrayList arrayList = ze1Var.b;
        long j10 = ze1Var.a;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                we1 we1Var2 = (we1) view;
                we1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !ze1Var.J.S0()) {
                    z11 = false;
                }
                we1Var2.S4 = z11;
                we1Var2.T4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((pe1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((pe1) F().get(i14)).c : null;
        we1 we1Var3 = (we1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = we1Var3.J;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && we1Var3.T4 == i10 && ze1Var.C;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!ze1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                we1Var = we1Var3;
                i11 = i16;
                boolean z13 = z12;
                we1Var.Y(tL_forumTopic, -j10, messageObject, ze1Var.isInPreviewMode(), z13);
                z10 = z13;
                we1Var.S4 = i10 != arrayList.size() - 1 || ze1Var.J.S0();
                boolean z14 = tL_forumTopic.pinned;
                we1Var.p2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                we1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                we1Var.T4 = i10;
                if (!ze1Var.getMessagesController().isMonoForum(-j10)) {
                    we1Var.setTopicIcon(tL_forumTopic);
                }
                we1Var.V(ze1Var.W.contains(Integer.valueOf(i11)), z10);
                we1Var.setDialogSelected(ze1Var.M0 != ((long) i11));
                we1Var.T(ze1Var.X, true);
            }
            we1Var3.m0 = true;
            we1Var3.x = true;
            we1Var3.J = tL_forumTopic;
            we1Var3.E = 72;
            we1Var3.Q = 42.0f;
            we1Var3.F = 72;
            we1Var3.G = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            we1Var3.W(peerDialogId, messageObject, i17, false, false);
            we1Var3.o0 = true;
            we1Var3.o2 = i14 < h();
            we1Var = we1Var3;
        } else {
            we1Var = we1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!ze1Var.getMessagesController().isMonoForum(-j10)) {
        }
        we1Var.V(ze1Var.W.contains(Integer.valueOf(i11)), z10);
        we1Var.setDialogSelected(ze1Var.M0 != ((long) i11));
        we1Var.T(ze1Var.X, true);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        ze1 ze1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                me1 me1Var = new me1(this, ze1Var.getParentActivity());
                ze1Var.A0 = me1Var;
                return new org.telegram.ui.Components.vk0(me1Var);
            }
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(viewGroup.getContext(), null);
            p00Var.setViewType(24);
            p00Var.setIsSingleCell(true);
            p00Var.w = true;
            return new org.telegram.ui.Components.vk0(p00Var);
        }
        we1 we1Var = new we1(ze1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -ze1Var.a);
            we1Var.setForumIcon(yf.d.d(yf.b.k[0], ""));
            we1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            we1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) ze1Var).inPreviewMode;
        we1Var.g0 = z10;
        we1Var.setArchivedPullAnimation(ze1Var.w);
        return new org.telegram.ui.Components.vk0(we1Var);
    }
}
