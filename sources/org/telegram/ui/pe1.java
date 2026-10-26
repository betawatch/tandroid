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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pe1 extends qg.b {
    public final /* synthetic */ af1 d;

    public pe1(af1 af1Var) {
        this.d = af1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        af1 af1Var = this.d;
        af1Var.getClass();
        return af1Var.b;
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
        return ((re1) this.d.b.get(i10)).a;
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
    public final void v(s4.e1 e1Var, int i10) {
        xe1 xe1Var;
        int i11;
        boolean z10;
        int i12;
        af1 af1Var = this.d;
        ArrayList arrayList = af1Var.b;
        long j10 = af1Var.a;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                xe1 xe1Var2 = (xe1) view;
                xe1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !af1Var.N.S0()) {
                    z11 = false;
                }
                xe1Var2.a5 = z11;
                xe1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((re1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((re1) F().get(i14)).c : null;
        xe1 xe1Var3 = (xe1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = xe1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && xe1Var3.b5 == i10 && af1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!af1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                xe1Var = xe1Var3;
                i11 = i16;
                boolean z13 = z12;
                xe1Var.X(tL_forumTopic, -j10, messageObject, af1Var.isInPreviewMode(), z13);
                z10 = z13;
                xe1Var.a5 = i10 != arrayList.size() - 1 || af1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                xe1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                xe1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                xe1Var.b5 = i10;
                if (!af1Var.getMessagesController().isMonoForum(-j10)) {
                    xe1Var.setTopicIcon(tL_forumTopic);
                }
                xe1Var.U(af1Var.a0.contains(Integer.valueOf(i11)), z10);
                xe1Var.setDialogSelected(af1Var.Q0 != ((long) i11));
                xe1Var.S(af1Var.b0, true);
            }
            xe1Var3.q0 = true;
            xe1Var3.x = true;
            xe1Var3.N = tL_forumTopic;
            xe1Var3.I = 72;
            xe1Var3.U = 42.0f;
            xe1Var3.J = 72;
            xe1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            xe1Var3.V(peerDialogId, messageObject, i17, false, false);
            xe1Var3.s0 = true;
            xe1Var3.s2 = i14 < h();
            xe1Var = xe1Var3;
        } else {
            xe1Var = xe1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!af1Var.getMessagesController().isMonoForum(-j10)) {
        }
        xe1Var.U(af1Var.a0.contains(Integer.valueOf(i11)), z10);
        xe1Var.setDialogSelected(af1Var.Q0 != ((long) i11));
        xe1Var.S(af1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        af1 af1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                oe1 oe1Var = new oe1(this, af1Var.getParentActivity());
                af1Var.E0 = oe1Var;
                return new org.telegram.ui.Components.vl0(oe1Var);
            }
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(viewGroup.getContext(), null);
            c10Var.setViewType(24);
            c10Var.setIsSingleCell(true);
            c10Var.w = true;
            return new org.telegram.ui.Components.vl0(c10Var);
        }
        xe1 xe1Var = new xe1(af1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -af1Var.a);
            xe1Var.setForumIcon(pg.d.d(pg.a.k[0], ""));
            xe1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            xe1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.r2) af1Var).inPreviewMode;
        xe1Var.k0 = z10;
        xe1Var.setArchivedPullAnimation(af1Var.w);
        return new org.telegram.ui.Components.vl0(xe1Var);
    }
}
