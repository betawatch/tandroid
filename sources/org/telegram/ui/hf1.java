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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hf1 extends bg.c {
    public final /* synthetic */ sf1 d;

    public hf1(sf1 sf1Var) {
        this.d = sf1Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        sf1 sf1Var = this.d;
        sf1Var.getClass();
        return sf1Var.b;
    }

    @Override // f2.o0
    public final int h() {
        return F().size() + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((jf1) this.d.b.get(i10)).a;
    }

    @Override // f2.o0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        pf1 pf1Var;
        int i11;
        boolean z4;
        int i12;
        sf1 sf1Var = this.d;
        ArrayList arrayList = sf1Var.b;
        long j10 = sf1Var.a;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 != 0) {
            boolean z10 = true;
            if (i13 == 3) {
                pf1 pf1Var2 = (pf1) view;
                pf1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !sf1Var.K.R0()) {
                    z10 = false;
                }
                pf1Var2.T4 = z10;
                pf1Var2.U4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((jf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((jf1) F().get(i14)).c : null;
        pf1 pf1Var3 = (pf1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = pf1Var3.K;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z11 = i15 == i16 && pf1Var3.U4 == i10 && sf1Var.D;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!sf1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                pf1Var = pf1Var3;
                i11 = i16;
                boolean z12 = z11;
                pf1Var.Y(tL_forumTopic, -j10, messageObject, sf1Var.isInPreviewMode(), z12);
                z4 = z12;
                pf1Var.T4 = i10 != arrayList.size() - 1 || sf1Var.K.R0();
                boolean z13 = tL_forumTopic.pinned;
                pf1Var.q2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                pf1Var.setPinForced(z13 && !tL_forumTopic.hidden);
                pf1Var.U4 = i10;
                if (!sf1Var.getMessagesController().isMonoForum(-j10)) {
                    pf1Var.setTopicIcon(tL_forumTopic);
                }
                pf1Var.V(sf1Var.X.contains(Integer.valueOf(i11)), z4);
                pf1Var.setDialogSelected(sf1Var.N0 != ((long) i11));
                pf1Var.T(sf1Var.Y, true);
            }
            pf1Var3.n0 = true;
            pf1Var3.x = true;
            pf1Var3.K = tL_forumTopic;
            pf1Var3.F = 72;
            pf1Var3.R = 42.0f;
            pf1Var3.G = 72;
            pf1Var3.H = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            pf1Var3.W(peerDialogId, messageObject, i17, false, false);
            pf1Var3.p0 = true;
            pf1Var3.p2 = i14 < h();
            pf1Var = pf1Var3;
        } else {
            pf1Var = pf1Var3;
            i11 = i16;
        }
        z4 = z11;
        if (!sf1Var.getMessagesController().isMonoForum(-j10)) {
        }
        pf1Var.V(sf1Var.X.contains(Integer.valueOf(i11)), z4);
        pf1Var.setDialogSelected(sf1Var.N0 != ((long) i11));
        pf1Var.T(sf1Var.Y, true);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        sf1 sf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                gf1 gf1Var = new gf1(this, sf1Var.getParentActivity());
                sf1Var.B0 = gf1Var;
                return new org.telegram.ui.Components.dl0(gf1Var);
            }
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setViewType(24);
            u00Var.setIsSingleCell(true);
            u00Var.w = true;
            return new org.telegram.ui.Components.dl0(u00Var);
        }
        pf1 pf1Var = new pf1(sf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -sf1Var.a);
            pf1Var.setForumIcon(ag.f.d(ag.b.k[0], ""));
            pf1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            pf1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z4 = ((org.telegram.ui.ActionBar.p2) sf1Var).inPreviewMode;
        pf1Var.h0 = z4;
        pf1Var.setArchivedPullAnimation(sf1Var.w);
        return new org.telegram.ui.Components.dl0(pf1Var);
    }
}
