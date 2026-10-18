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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ie1 extends pg.b {
    public final /* synthetic */ te1 d;

    public ie1(te1 te1Var) {
        this.d = te1Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        te1 te1Var = this.d;
        te1Var.getClass();
        return te1Var.b;
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
        return ((ke1) this.d.b.get(i10)).a;
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
        qe1 qe1Var;
        int i11;
        boolean z10;
        int i12;
        te1 te1Var = this.d;
        ArrayList arrayList = te1Var.b;
        long j10 = te1Var.a;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                qe1 qe1Var2 = (qe1) view;
                qe1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !te1Var.N.S0()) {
                    z11 = false;
                }
                qe1Var2.a5 = z11;
                qe1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ke1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((ke1) F().get(i14)).c : null;
        qe1 qe1Var3 = (qe1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = qe1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && qe1Var3.b5 == i10 && te1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!te1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                qe1Var = qe1Var3;
                i11 = i16;
                boolean z13 = z12;
                qe1Var.Y(tL_forumTopic, -j10, messageObject, te1Var.isInPreviewMode(), z13);
                z10 = z13;
                qe1Var.a5 = i10 != arrayList.size() - 1 || te1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                qe1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                qe1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                qe1Var.b5 = i10;
                if (!te1Var.getMessagesController().isMonoForum(-j10)) {
                    qe1Var.setTopicIcon(tL_forumTopic);
                }
                qe1Var.V(te1Var.a0.contains(Integer.valueOf(i11)), z10);
                qe1Var.setDialogSelected(te1Var.Q0 != ((long) i11));
                qe1Var.T(te1Var.b0, true);
            }
            qe1Var3.q0 = true;
            qe1Var3.x = true;
            qe1Var3.N = tL_forumTopic;
            qe1Var3.I = 72;
            qe1Var3.U = 42.0f;
            qe1Var3.J = 72;
            qe1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            qe1Var3.W(peerDialogId, messageObject, i17, false, false);
            qe1Var3.s0 = true;
            qe1Var3.s2 = i14 < h();
            qe1Var = qe1Var3;
        } else {
            qe1Var = qe1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!te1Var.getMessagesController().isMonoForum(-j10)) {
        }
        qe1Var.V(te1Var.a0.contains(Integer.valueOf(i11)), z10);
        qe1Var.setDialogSelected(te1Var.Q0 != ((long) i11));
        qe1Var.T(te1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        te1 te1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                he1 he1Var = new he1(this, te1Var.getParentActivity());
                te1Var.E0 = he1Var;
                return new org.telegram.ui.Components.sl0(he1Var);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setViewType(24);
            b10Var.setIsSingleCell(true);
            b10Var.w = true;
            return new org.telegram.ui.Components.sl0(b10Var);
        }
        qe1 qe1Var = new qe1(te1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -te1Var.a);
            qe1Var.setForumIcon(og.d.d(og.a.k[0], ""));
            qe1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            qe1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) te1Var).inPreviewMode;
        qe1Var.k0 = z10;
        qe1Var.setArchivedPullAnimation(te1Var.w);
        return new org.telegram.ui.Components.sl0(qe1Var);
    }
}
