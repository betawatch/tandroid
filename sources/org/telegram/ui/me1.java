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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class me1 extends pg.b {
    public final /* synthetic */ ye1 d;

    public me1(ye1 ye1Var) {
        this.d = ye1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        ye1 ye1Var = this.d;
        ye1Var.getClass();
        return ye1Var.b;
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
        return ((oe1) this.d.b.get(i10)).a;
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
        ue1 ue1Var;
        int i11;
        boolean z10;
        int i12;
        ye1 ye1Var = this.d;
        ArrayList arrayList = ye1Var.b;
        long j10 = ye1Var.a;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                ue1 ue1Var2 = (ue1) view;
                ue1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !ye1Var.N.T0()) {
                    z11 = false;
                }
                ue1Var2.a5 = z11;
                ue1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((oe1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((oe1) F().get(i14)).c : null;
        ue1 ue1Var3 = (ue1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = ue1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && ue1Var3.b5 == i10 && ye1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!ye1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                ue1Var = ue1Var3;
                i11 = i16;
                boolean z13 = z12;
                ue1Var.X(tL_forumTopic, -j10, messageObject, ye1Var.isInPreviewMode(), z13);
                z10 = z13;
                ue1Var.a5 = i10 != arrayList.size() - 1 || ye1Var.N.T0();
                boolean z14 = tL_forumTopic.pinned;
                ue1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                ue1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                ue1Var.b5 = i10;
                if (!ye1Var.getMessagesController().isMonoForum(-j10)) {
                    ue1Var.setTopicIcon(tL_forumTopic);
                }
                ue1Var.U(ye1Var.a0.contains(Integer.valueOf(i11)), z10);
                ue1Var.setDialogSelected(ye1Var.Q0 != ((long) i11));
                ue1Var.S(ye1Var.b0, true);
            }
            ue1Var3.q0 = true;
            ue1Var3.x = true;
            ue1Var3.N = tL_forumTopic;
            ue1Var3.I = 72;
            ue1Var3.U = 42.0f;
            ue1Var3.J = 72;
            ue1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            ue1Var3.V(peerDialogId, messageObject, i17, false, false);
            ue1Var3.s0 = true;
            ue1Var3.s2 = i14 < h();
            ue1Var = ue1Var3;
        } else {
            ue1Var = ue1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!ye1Var.getMessagesController().isMonoForum(-j10)) {
        }
        ue1Var.U(ye1Var.a0.contains(Integer.valueOf(i11)), z10);
        ue1Var.setDialogSelected(ye1Var.Q0 != ((long) i11));
        ue1Var.S(ye1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        ye1 ye1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                le1 le1Var = new le1(this, ye1Var.getParentActivity());
                ye1Var.E0 = le1Var;
                return new org.telegram.ui.Components.wl0(le1Var);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setViewType(24);
            b10Var.setIsSingleCell(true);
            b10Var.w = true;
            return new org.telegram.ui.Components.wl0(b10Var);
        }
        ue1 ue1Var = new ue1(ye1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -ye1Var.a);
            ue1Var.setForumIcon(og.d.d(og.a.k[0], ""));
            ue1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            ue1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) ye1Var).inPreviewMode;
        ue1Var.k0 = z10;
        ue1Var.setArchivedPullAnimation(ye1Var.w);
        return new org.telegram.ui.Components.wl0(ue1Var);
    }
}
