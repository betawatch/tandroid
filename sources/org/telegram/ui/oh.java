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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh(int i10, Object obj, Object obj2) {
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
        int i11 = 5;
        int i12 = 2;
        MessageObject messageObject = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                yn ynVar = (yn) obj2;
                nf.f.r(ynVar.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), ynVar.d8 == 0, false, false, null, null, false, true, false);
                break;
            case 1:
                ((yn) obj2).ja((TLRPC.Chat) obj);
                break;
            case 2:
                yn.g0((yn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 3:
                yn ynVar2 = (yn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(ynVar2, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(ynVar2, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.e5.w0(ynVar2, tL_error.text);
                    break;
                }
            case 4:
                a0.i iVar = (a0.i) obj2;
                o6 o6Var = (o6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i13 = 0; i13 < messageObject.messageOwner.media.webpage.attributes.size(); i13++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i13);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new oh(i11, o6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new hu0(o6Var, 28));
                break;
            case 5:
                ((o6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 6:
                yn ynVar3 = (yn) obj2;
                View view = (View) obj;
                if (ynVar3.getParentActivity() != null) {
                    ynVar3.I0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ynVar3.I0.q(16.0f);
                    ynVar3.I0.p(true);
                    ynVar3.I0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    ynVar3.I0.l(0.0f, 96.0f);
                    ynVar3.I0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - ynVar3.xa) - ynVar3.V0.getHeight()));
                    ynVar3.V0.addView(ynVar3.I0, w7.z5.e(-1, 100, 87));
                    ci.e4 e4Var = ynVar3.I0;
                    e4Var.l0 = new yf(ynVar3, i11);
                    e4Var.u();
                    org.telegram.ui.Components.n40.w.b();
                    break;
                }
                break;
            case 7:
                ((yn) obj2).V0.removeView((org.telegram.ui.Components.sk0) obj);
                break;
            case 8:
                MessageObject messageObject2 = (MessageObject) obj;
                yn ynVar4 = ((ui) obj2).s;
                MessageObject messageObject3 = (MessageObject) ynVar4.m6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) ynVar4.m6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                ynVar4.pc(messageObject2, true);
                zg.i0.f();
                break;
            case 9:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                yn ynVar5 = ((am) ((cn) obj2).f).a.Q;
                int i14 = yn.Bc;
                ynVar5.La();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 10:
                ci.e4 e4Var2 = (ci.e4) obj;
                yn ynVar6 = ((kn) obj2).a;
                ynVar6.V0.removeView(e4Var2);
                if (e4Var2 == ynVar6.y1) {
                    ynVar6.y1 = null;
                    break;
                }
                break;
            case 11:
                Long l4 = (Long) obj;
                yn ynVar7 = ((en) obj2).Y0.a;
                String str = (l4.longValue() >= 0 || (chat = ynVar7.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.yc.a0(ynVar7).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 12:
                to toVar = (to) obj2;
                toVar.getClass();
                toVar.presentFragment(ta1.b0((TLRPC.Chat) obj, true));
                break;
            case 13:
                hp hpVar = (hp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = hpVar.getMessagesController().getInputChannel(hpVar.a0);
                hpVar.i0 = hpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ca(hpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 14:
                hp hpVar2 = (hp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                hpVar2.d0 = z10;
                if (!z10 && hpVar2.getUserConfig().isPremium() && !hpVar2.e0 && hpVar2.y != null) {
                    hpVar2.e0 = true;
                    hpVar2.b0();
                    hpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new uo(hpVar2, i12));
                    break;
                }
                break;
            case 15:
                tp.S((tp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                break;
            case 16:
                tp tpVar = (tp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    tpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    tpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                tpVar.w = false;
                tpVar.x = true;
                tpVar.b0();
                break;
            case 17:
                ((pp) obj2).x.d.P = false;
                ((org.telegram.ui.Components.w80) obj).run();
                break;
            case 18:
                ((pp) obj2).x.d.O = false;
                ((org.telegram.ui.Components.x80) obj).run();
                break;
            case 19:
                tp tpVar2 = ((pp) obj2).x.d;
                tpVar2.O = false;
                tpVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 20:
                pp ppVar = (pp) obj2;
                ppVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                ppVar.h = true;
                ppVar.c.setChecked(true);
                break;
            case 21:
                rr rrVar = (rr) obj2;
                rrVar.getClass();
                rrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 22:
                TLRPC.User user = (TLRPC.User) obj;
                rr rrVar2 = ((gr) obj2).a;
                if (org.telegram.ui.Components.yc.a(rrVar2)) {
                    org.telegram.ui.Components.yc.C(rrVar2, user.first_name).j();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.e0) obj2).u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                break;
            case 24:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 25:
                hz0 hz0Var = (hz0) obj;
                if (((boolean[]) obj2)[0]) {
                    hz0Var.run();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) obj2;
                TLObject tLObject2 = (TLObject) obj;
                eaVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    eaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                rcVar.n = true;
                org.telegram.ui.Components.vb vbVar = rcVar.e;
                if (vbVar instanceof org.telegram.ui.Components.wb) {
                    org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) ((org.telegram.ui.Components.wb) vbVar);
                    xbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(xbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(xbVar.b, true, false, true);
                }
                rcVar.i(true);
                break;
            case 28:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.md) obj2).removeView((ci.e4) obj);
                break;
        }
    }
}
