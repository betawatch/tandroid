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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bf1 extends cg.c {
    public final /* synthetic */ mf1 d;

    public bf1(mf1 mf1Var) {
        this.d = mf1Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        mf1 mf1Var = this.d;
        mf1Var.getClass();
        return mf1Var.b;
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
        return ((df1) this.d.b.get(i10)).a;
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
    public final void v(f2.m1 m1Var, int i10) {
        jf1 jf1Var;
        int i11;
        boolean z4;
        int i12;
        mf1 mf1Var = this.d;
        ArrayList arrayList = mf1Var.b;
        long j10 = mf1Var.a;
        int i13 = m1Var.f;
        View view = m1Var.a;
        if (i13 != 0) {
            boolean z10 = true;
            if (i13 == 3) {
                jf1 jf1Var2 = (jf1) view;
                jf1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !mf1Var.K.S0()) {
                    z10 = false;
                }
                jf1Var2.T4 = z10;
                jf1Var2.U4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((df1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((df1) F().get(i14)).c : null;
        jf1 jf1Var3 = (jf1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = jf1Var3.K;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z11 = i15 == i16 && jf1Var3.U4 == i10 && mf1Var.D;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!mf1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                jf1Var = jf1Var3;
                i11 = i16;
                boolean z12 = z11;
                jf1Var.Y(tL_forumTopic, -j10, messageObject, mf1Var.isInPreviewMode(), z12);
                z4 = z12;
                jf1Var.T4 = i10 != arrayList.size() - 1 || mf1Var.K.S0();
                boolean z13 = tL_forumTopic.pinned;
                jf1Var.q2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                jf1Var.setPinForced(z13 && !tL_forumTopic.hidden);
                jf1Var.U4 = i10;
                if (!mf1Var.getMessagesController().isMonoForum(-j10)) {
                    jf1Var.setTopicIcon(tL_forumTopic);
                }
                jf1Var.V(mf1Var.X.contains(Integer.valueOf(i11)), z4);
                jf1Var.setDialogSelected(mf1Var.N0 != ((long) i11));
                jf1Var.T(mf1Var.Y, true);
            }
            jf1Var3.n0 = true;
            jf1Var3.x = true;
            jf1Var3.K = tL_forumTopic;
            jf1Var3.F = 72;
            jf1Var3.R = 42.0f;
            jf1Var3.G = 72;
            jf1Var3.H = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            jf1Var3.W(peerDialogId, messageObject, i17, false, false);
            jf1Var3.p0 = true;
            jf1Var3.p2 = i14 < h();
            jf1Var = jf1Var3;
        } else {
            jf1Var = jf1Var3;
            i11 = i16;
        }
        z4 = z11;
        if (!mf1Var.getMessagesController().isMonoForum(-j10)) {
        }
        jf1Var.V(mf1Var.X.contains(Integer.valueOf(i11)), z4);
        jf1Var.setDialogSelected(mf1Var.N0 != ((long) i11));
        jf1Var.T(mf1Var.Y, true);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        mf1 mf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                af1 af1Var = new af1(this, mf1Var.getParentActivity());
                mf1Var.B0 = af1Var;
                return new org.telegram.ui.Components.fl0(af1Var);
            }
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setViewType(24);
            u00Var.setIsSingleCell(true);
            u00Var.w = true;
            return new org.telegram.ui.Components.fl0(u00Var);
        }
        jf1 jf1Var = new jf1(mf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -mf1Var.a);
            jf1Var.setForumIcon(bg.e.d(bg.b.k[0], ""));
            jf1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            jf1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z4 = ((org.telegram.ui.ActionBar.p2) mf1Var).inPreviewMode;
        jf1Var.h0 = z4;
        jf1Var.setArchivedPullAnimation(mf1Var.w);
        return new org.telegram.ui.Components.fl0(jf1Var);
    }
}
