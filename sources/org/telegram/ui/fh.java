package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fh(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        int i11 = 7;
        int i12 = 2;
        MessageObject messageObject = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                co coVar = (co) obj2;
                int[] iArr = (int[]) obj;
                coVar.getClass();
                if (iArr[0] != 0) {
                    coVar.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 1:
                ((co) obj2).h8((ih) obj);
                break;
            case 2:
                co coVar2 = (co) obj2;
                of.f.p(coVar2.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), coVar2.f8 == 0, false);
                break;
            case 3:
                ((co) obj2).ka((TLRPC.Chat) obj);
                break;
            case 4:
                co.d0((co) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 5:
                co coVar3 = (co) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(coVar3, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(coVar3, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.e5.w0(coVar3, tL_error.text);
                    break;
                }
            case 6:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i13 = 0; i13 < messageObject.messageOwner.media.webpage.attributes.size(); i13++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i13);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new fh(i11, m6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new lu0(m6Var, 28));
                break;
            case 7:
                ((m6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 8:
                co coVar4 = (co) obj2;
                View view = (View) obj;
                if (coVar4.getParentActivity() != null) {
                    coVar4.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    coVar4.K0.q(16.0f);
                    coVar4.K0.p(true);
                    coVar4.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    coVar4.K0.l(0.0f, 96.0f);
                    coVar4.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - coVar4.za) - coVar4.X0.getHeight()));
                    coVar4.X0.addView(coVar4.K0, w7.x5.e(-1, 100, 87));
                    di.f4 f4Var = coVar4.K0;
                    f4Var.l0 = new qf(coVar4, i11);
                    f4Var.u();
                    org.telegram.ui.Components.j40.v.b();
                    break;
                }
                break;
            case 9:
                ((co) obj2).X0.removeView((org.telegram.ui.Components.fk0) obj);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj;
                co coVar5 = ((wi) obj2).s;
                MessageObject messageObject3 = (MessageObject) coVar5.o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) coVar5.o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                coVar5.qc(messageObject2, true);
                ah.e1.f();
                break;
            case 11:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                co coVar6 = ((fm) ((hn) obj2).f).a.Q;
                int i14 = co.Hc;
                coVar6.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 12:
                di.f4 f4Var2 = (di.f4) obj;
                co coVar7 = ((on) obj2).a;
                coVar7.X0.removeView(f4Var2);
                if (f4Var2 == coVar7.A1) {
                    coVar7.A1 = null;
                    break;
                }
                break;
            case 13:
                Long l4 = (Long) obj;
                co coVar8 = ((in) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = coVar8.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.yc.a0(coVar8).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 14:
                xo xoVar = (xo) obj2;
                xoVar.getClass();
                xoVar.presentFragment(bb1.d0((TLRPC.Chat) obj, true));
                break;
            case 15:
                lp lpVar = (lp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = lpVar.getMessagesController().getInputChannel(lpVar.Z);
                lpVar.h0 = lpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(lpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 16:
                lp lpVar2 = (lp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                lpVar2.c0 = z10;
                if (!z10 && lpVar2.getUserConfig().isPremium() && !lpVar2.d0 && lpVar2.x != null) {
                    lpVar2.d0 = true;
                    lpVar2.b0();
                    lpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yo(lpVar2, i12));
                    break;
                }
                break;
            case 17:
                xp.U((xp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                break;
            case 18:
                xp xpVar = (xp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    xpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    xpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                xpVar.w = false;
                xpVar.x = true;
                xpVar.b0();
                break;
            case 19:
                ((tp) obj2).x.d.P = false;
                ((org.telegram.ui.Components.i80) obj).run();
                break;
            case 20:
                ((tp) obj2).x.d.O = false;
                ((org.telegram.ui.Components.j80) obj).run();
                break;
            case 21:
                xp xpVar2 = ((tp) obj2).x.d;
                xpVar2.O = false;
                xpVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 22:
                tp tpVar = (tp) obj2;
                tpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                tpVar.h = true;
                tpVar.c.setChecked(true);
                break;
            case 23:
                vr vrVar = (vr) obj2;
                vrVar.getClass();
                vrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 24:
                TLRPC.User user = (TLRPC.User) obj;
                vr vrVar2 = ((kr) obj2).a;
                if (org.telegram.ui.Components.yc.a(vrVar2)) {
                    org.telegram.ui.Components.yc.C(vrVar2, user.first_name).j();
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.Components.f0) obj2).u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                break;
            case 26:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                rVar.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    break;
                }
                break;
            case 27:
                f01 f01Var = (f01) obj;
                if (((boolean[]) obj2)[0]) {
                    f01Var.run();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                TLObject tLObject2 = (TLObject) obj;
                daVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    daVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                qcVar.n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.b, true, false, true);
                }
                qcVar.i(true);
                break;
        }
    }
}
