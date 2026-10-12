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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ag1 extends pg.b {
    public final /* synthetic */ lg1 d;

    public ag1(lg1 lg1Var) {
        this.d = lg1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        lg1 lg1Var = this.d;
        lg1Var.getClass();
        return lg1Var.b;
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
        return ((cg1) this.d.b.get(i10)).a;
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
        ig1 ig1Var;
        int i11;
        boolean z10;
        int i12;
        lg1 lg1Var = this.d;
        ArrayList arrayList = lg1Var.b;
        long j10 = lg1Var.a;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                ig1 ig1Var2 = (ig1) view;
                ig1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !lg1Var.N.S0()) {
                    z11 = false;
                }
                ig1Var2.a5 = z11;
                ig1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((cg1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((cg1) F().get(i14)).c : null;
        ig1 ig1Var3 = (ig1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = ig1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && ig1Var3.b5 == i10 && lg1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!lg1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                ig1Var = ig1Var3;
                i11 = i16;
                boolean z13 = z12;
                ig1Var.Y(tL_forumTopic, -j10, messageObject, lg1Var.isInPreviewMode(), z13);
                z10 = z13;
                ig1Var.a5 = i10 != arrayList.size() - 1 || lg1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                ig1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                ig1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                ig1Var.b5 = i10;
                if (!lg1Var.getMessagesController().isMonoForum(-j10)) {
                    ig1Var.setTopicIcon(tL_forumTopic);
                }
                ig1Var.V(lg1Var.a0.contains(Integer.valueOf(i11)), z10);
                ig1Var.setDialogSelected(lg1Var.Q0 != ((long) i11));
                ig1Var.T(lg1Var.b0, true);
            }
            ig1Var3.q0 = true;
            ig1Var3.x = true;
            ig1Var3.N = tL_forumTopic;
            ig1Var3.I = 72;
            ig1Var3.U = 42.0f;
            ig1Var3.J = 72;
            ig1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            ig1Var3.W(peerDialogId, messageObject, i17, false, false);
            ig1Var3.s0 = true;
            ig1Var3.s2 = i14 < h();
            ig1Var = ig1Var3;
        } else {
            ig1Var = ig1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!lg1Var.getMessagesController().isMonoForum(-j10)) {
        }
        ig1Var.V(lg1Var.a0.contains(Integer.valueOf(i11)), z10);
        ig1Var.setDialogSelected(lg1Var.Q0 != ((long) i11));
        ig1Var.T(lg1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        lg1 lg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                zf1 zf1Var = new zf1(this, lg1Var.getParentActivity());
                lg1Var.E0 = zf1Var;
                return new org.telegram.ui.Components.wl0(zf1Var);
            }
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(viewGroup.getContext(), null);
            f10Var.setViewType(24);
            f10Var.setIsSingleCell(true);
            f10Var.w = true;
            return new org.telegram.ui.Components.wl0(f10Var);
        }
        ig1 ig1Var = new ig1(lg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -lg1Var.a);
            ig1Var.setForumIcon(og.d.d(og.a.k[0], ""));
            ig1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            ig1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) lg1Var).inPreviewMode;
        ig1Var.k0 = z10;
        ig1Var.setArchivedPullAnimation(lg1Var.w);
        return new org.telegram.ui.Components.wl0(ig1Var);
    }
}
