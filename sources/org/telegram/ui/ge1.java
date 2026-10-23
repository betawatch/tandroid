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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ge1 extends pg.b {
    public final /* synthetic */ re1 d;

    public ge1(re1 re1Var) {
        this.d = re1Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        re1 re1Var = this.d;
        re1Var.getClass();
        return re1Var.b;
    }

    @Override // s4.g0
    public final int h() {
        return F().size() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((ie1) this.d.b.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        oe1 oe1Var;
        int i11;
        boolean z10;
        int i12;
        re1 re1Var = this.d;
        ArrayList arrayList = re1Var.b;
        long j10 = re1Var.a;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                oe1 oe1Var2 = (oe1) view;
                oe1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !re1Var.N.S0()) {
                    z11 = false;
                }
                oe1Var2.a5 = z11;
                oe1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ie1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((ie1) F().get(i14)).c : null;
        oe1 oe1Var3 = (oe1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = oe1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && oe1Var3.b5 == i10 && re1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!re1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                oe1Var = oe1Var3;
                i11 = i16;
                boolean z13 = z12;
                oe1Var.Y(tL_forumTopic, -j10, messageObject, re1Var.isInPreviewMode(), z13);
                z10 = z13;
                oe1Var.a5 = i10 != arrayList.size() - 1 || re1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                oe1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                oe1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                oe1Var.b5 = i10;
                if (!re1Var.getMessagesController().isMonoForum(-j10)) {
                    oe1Var.setTopicIcon(tL_forumTopic);
                }
                oe1Var.V(re1Var.a0.contains(Integer.valueOf(i11)), z10);
                oe1Var.setDialogSelected(re1Var.Q0 != ((long) i11));
                oe1Var.T(re1Var.b0, true);
            }
            oe1Var3.q0 = true;
            oe1Var3.x = true;
            oe1Var3.N = tL_forumTopic;
            oe1Var3.I = 72;
            oe1Var3.U = 42.0f;
            oe1Var3.J = 72;
            oe1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            oe1Var3.W(peerDialogId, messageObject, i17, false, false);
            oe1Var3.s0 = true;
            oe1Var3.s2 = i14 < h();
            oe1Var = oe1Var3;
        } else {
            oe1Var = oe1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!re1Var.getMessagesController().isMonoForum(-j10)) {
        }
        oe1Var.V(re1Var.a0.contains(Integer.valueOf(i11)), z10);
        oe1Var.setDialogSelected(re1Var.Q0 != ((long) i11));
        oe1Var.T(re1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        re1 re1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                fe1 fe1Var = new fe1(this, re1Var.getParentActivity());
                re1Var.E0 = fe1Var;
                return new org.telegram.ui.Components.tl0(fe1Var);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setViewType(24);
            b10Var.setIsSingleCell(true);
            b10Var.w = true;
            return new org.telegram.ui.Components.tl0(b10Var);
        }
        oe1 oe1Var = new oe1(re1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -re1Var.a);
            oe1Var.setForumIcon(og.d.d(og.a.k[0], ""));
            oe1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            oe1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) re1Var).inPreviewMode;
        oe1Var.k0 = z10;
        oe1Var.setArchivedPullAnimation(re1Var.w);
        return new org.telegram.ui.Components.tl0(oe1Var);
    }
}
