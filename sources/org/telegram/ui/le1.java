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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class le1 extends xf.b {
    public final /* synthetic */ we1 d;

    public le1(we1 we1Var) {
        this.d = we1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        we1 we1Var = this.d;
        we1Var.getClass();
        return we1Var.b;
    }

    @Override // f2.q0
    public final int h() {
        return F().size() + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((ne1) this.d.b.get(i10)).a;
    }

    @Override // f2.q0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        te1 te1Var;
        int i11;
        boolean z10;
        int i12;
        we1 we1Var = this.d;
        ArrayList arrayList = we1Var.b;
        long j10 = we1Var.a;
        int i13 = o1Var.f;
        View view = o1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                te1 te1Var2 = (te1) view;
                te1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !we1Var.J.S0()) {
                    z11 = false;
                }
                te1Var2.S4 = z11;
                te1Var2.T4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ne1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((ne1) F().get(i14)).c : null;
        te1 te1Var3 = (te1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = te1Var3.J;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && te1Var3.T4 == i10 && we1Var.C;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!we1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                te1Var = te1Var3;
                i11 = i16;
                boolean z13 = z12;
                te1Var.Y(tL_forumTopic, -j10, messageObject, we1Var.isInPreviewMode(), z13);
                z10 = z13;
                te1Var.S4 = i10 != arrayList.size() - 1 || we1Var.J.S0();
                boolean z14 = tL_forumTopic.pinned;
                te1Var.p2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                te1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                te1Var.T4 = i10;
                if (!we1Var.getMessagesController().isMonoForum(-j10)) {
                    te1Var.setTopicIcon(tL_forumTopic);
                }
                te1Var.V(we1Var.W.contains(Integer.valueOf(i11)), z10);
                te1Var.setDialogSelected(we1Var.M0 != ((long) i11));
                te1Var.T(we1Var.X, true);
            }
            te1Var3.m0 = true;
            te1Var3.x = true;
            te1Var3.J = tL_forumTopic;
            te1Var3.E = 72;
            te1Var3.Q = 42.0f;
            te1Var3.F = 72;
            te1Var3.G = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            te1Var3.W(peerDialogId, messageObject, i17, false, false);
            te1Var3.o0 = true;
            te1Var3.o2 = i14 < h();
            te1Var = te1Var3;
        } else {
            te1Var = te1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!we1Var.getMessagesController().isMonoForum(-j10)) {
        }
        te1Var.V(we1Var.W.contains(Integer.valueOf(i11)), z10);
        te1Var.setDialogSelected(we1Var.M0 != ((long) i11));
        te1Var.T(we1Var.X, true);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        we1 we1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                ke1 ke1Var = new ke1(this, we1Var.getParentActivity());
                we1Var.A0 = ke1Var;
                return new org.telegram.ui.Components.lk0(ke1Var);
            }
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(viewGroup.getContext(), null);
            h00Var.setViewType(24);
            h00Var.setIsSingleCell(true);
            h00Var.w = true;
            return new org.telegram.ui.Components.lk0(h00Var);
        }
        te1 te1Var = new te1(we1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -we1Var.a);
            te1Var.setForumIcon(wf.c.d(wf.a.k[0], ""));
            te1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            te1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) we1Var).inPreviewMode;
        te1Var.g0 = z10;
        te1Var.setArchivedPullAnimation(we1Var.w);
        return new org.telegram.ui.Components.lk0(te1Var);
    }
}
