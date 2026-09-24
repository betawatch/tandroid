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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dh(int i10, Object obj, Object obj2) {
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
        int i11 = 2;
        MessageObject messageObject = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                wn wnVar = (wn) obj2;
                int[] iArr = (int[]) obj;
                wnVar.getClass();
                if (iArr[0] != 0) {
                    wnVar.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 1:
                wn wnVar2 = (wn) obj2;
                nf.f.p(wnVar2.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), wnVar2.f8 == 0, false);
                break;
            case 2:
                ((wn) obj2).h8((nh) obj);
                break;
            case 3:
                ((wn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 4:
                wn.v0((wn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 5:
                wn wnVar3 = (wn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(wnVar3, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(wnVar3, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.e5.w0(wnVar3, tL_error.text);
                    break;
                }
            case 6:
                a0.i iVar = (a0.i) obj2;
                l6 l6Var = (l6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new dh(7, l6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new eu0(l6Var, 28));
                break;
            case 7:
                ((l6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 8:
                wn wnVar4 = (wn) obj2;
                View view = (View) obj;
                if (wnVar4.getParentActivity() != null) {
                    wnVar4.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    wnVar4.K0.q(16.0f);
                    wnVar4.K0.p(true);
                    wnVar4.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    wnVar4.K0.l(0.0f, 96.0f);
                    wnVar4.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - wnVar4.za) - wnVar4.X0.getHeight()));
                    wnVar4.X0.addView(wnVar4.K0, w7.y5.e(-1, 100, 87));
                    ci.e4 e4Var = wnVar4.K0;
                    e4Var.l0 = new le(wnVar4, 9);
                    e4Var.u();
                    org.telegram.ui.Components.k40.v.b();
                    break;
                }
                break;
            case 9:
                ((wn) obj2).X0.removeView((org.telegram.ui.Components.qk0) obj);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj;
                wn wnVar5 = ((ti) obj2).s;
                MessageObject messageObject3 = (MessageObject) wnVar5.o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) wnVar5.o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                wnVar5.qc(messageObject2, true);
                zg.k0.f();
                break;
            case 11:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                wn wnVar6 = ((am) ((bn) obj2).f).a.Q;
                int i13 = wn.Gc;
                wnVar6.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 12:
                ci.e4 e4Var2 = (ci.e4) obj;
                wn wnVar7 = ((in) obj2).a;
                wnVar7.X0.removeView(e4Var2);
                if (e4Var2 == wnVar7.A1) {
                    wnVar7.A1 = null;
                    break;
                }
                break;
            case 13:
                Long l4 = (Long) obj;
                wn wnVar8 = ((cn) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = wnVar8.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.yc.a0(wnVar8).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 14:
                ro roVar = (ro) obj2;
                roVar.getClass();
                roVar.presentFragment(sa1.d0((TLRPC.Chat) obj, true));
                break;
            case 15:
                fp fpVar = (fp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = fpVar.getMessagesController().getInputChannel(fpVar.Z);
                fpVar.h0 = fpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(fpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 16:
                fp fpVar2 = (fp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                fpVar2.c0 = z10;
                if (!z10 && fpVar2.getUserConfig().isPremium() && !fpVar2.d0 && fpVar2.x != null) {
                    fpVar2.d0 = true;
                    fpVar2.b0();
                    fpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new so(fpVar2, i11));
                    break;
                }
                break;
            case 17:
                rp.U((rp) obj2, (org.telegram.ui.ActionBar.a2[]) obj);
                break;
            case 18:
                rp rpVar = (rp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    rpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    rpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                rpVar.w = false;
                rpVar.x = true;
                rpVar.b0();
                break;
            case 19:
                ((np) obj2).x.d.P = false;
                ((org.telegram.ui.Components.t80) obj).run();
                break;
            case 20:
                ((np) obj2).x.d.O = false;
                ((org.telegram.ui.Components.u80) obj).run();
                break;
            case 21:
                rp rpVar2 = ((np) obj2).x.d;
                rpVar2.O = false;
                rpVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 22:
                np npVar = (np) obj2;
                npVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                npVar.h = true;
                npVar.c.setChecked(true);
                break;
            case 23:
                pr prVar = (pr) obj2;
                prVar.getClass();
                prVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 24:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar2 = ((er) obj2).a;
                if (org.telegram.ui.Components.yc.a(prVar2)) {
                    org.telegram.ui.Components.yc.C(prVar2, user.first_name).j();
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.Components.e0) obj2).u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                break;
            case 26:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 27:
                vz0 vz0Var = (vz0) obj;
                if (((boolean[]) obj2)[0]) {
                    vz0Var.run();
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
