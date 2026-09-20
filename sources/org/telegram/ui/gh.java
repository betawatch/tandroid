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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gh(int i10, Object obj, Object obj2) {
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
                zn znVar = (zn) obj2;
                int[] iArr = (int[]) obj;
                znVar.getClass();
                if (iArr[0] != 0) {
                    znVar.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 1:
                zn znVar2 = (zn) obj2;
                nf.f.p(znVar2.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), znVar2.f8 == 0, false);
                break;
            case 2:
                ((zn) obj2).h8((qh) obj);
                break;
            case 3:
                ((zn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 4:
                zn.w0((zn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 5:
                zn znVar3 = (zn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.d5.w0(znVar3, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.d5.w0(znVar3, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.d5.w0(znVar3, tL_error.text);
                    break;
                }
            case 6:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new gh(7, m6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new mu0(m6Var, 28));
                break;
            case 7:
                ((m6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 8:
                zn znVar4 = (zn) obj2;
                View view = (View) obj;
                if (znVar4.getParentActivity() != null) {
                    znVar4.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    znVar4.K0.q(16.0f);
                    znVar4.K0.p(true);
                    znVar4.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    znVar4.K0.l(0.0f, 96.0f);
                    znVar4.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - znVar4.za) - znVar4.X0.getHeight()));
                    znVar4.X0.addView(znVar4.K0, w7.y5.e(-1, 100, 87));
                    ci.f4 f4Var = znVar4.K0;
                    f4Var.l0 = new me(znVar4, 9);
                    f4Var.u();
                    org.telegram.ui.Components.j40.v.b();
                    break;
                }
                break;
            case 9:
                ((zn) obj2).X0.removeView((org.telegram.ui.Components.pk0) obj);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj;
                zn znVar5 = ((vi) obj2).s;
                MessageObject messageObject3 = (MessageObject) znVar5.o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) znVar5.o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                znVar5.qc(messageObject2, true);
                zg.k0.f();
                break;
            case 11:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                zn znVar6 = ((cm) ((en) obj2).f).a.Q;
                int i13 = zn.Gc;
                znVar6.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 12:
                ci.f4 f4Var2 = (ci.f4) obj;
                zn znVar7 = ((ln) obj2).a;
                znVar7.X0.removeView(f4Var2);
                if (f4Var2 == znVar7.A1) {
                    znVar7.A1 = null;
                    break;
                }
                break;
            case 13:
                Long l4 = (Long) obj;
                zn znVar8 = ((fn) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = znVar8.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.xc.a0(znVar8).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 14:
                uo uoVar = (uo) obj2;
                uoVar.getClass();
                uoVar.presentFragment(bb1.d0((TLRPC.Chat) obj, true));
                break;
            case 15:
                ip ipVar = (ip) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = ipVar.getMessagesController().getInputChannel(ipVar.Z);
                ipVar.h0 = ipVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ba(ipVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 16:
                ip ipVar2 = (ip) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                ipVar2.c0 = z10;
                if (!z10 && ipVar2.getUserConfig().isPremium() && !ipVar2.d0 && ipVar2.x != null) {
                    ipVar2.d0 = true;
                    ipVar2.b0();
                    ipVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new vo(ipVar2, i11));
                    break;
                }
                break;
            case 17:
                up.U((up) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                break;
            case 18:
                up upVar = (up) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    upVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    upVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                upVar.w = false;
                upVar.x = true;
                upVar.b0();
                break;
            case 19:
                ((qp) obj2).x.d.P = false;
                ((org.telegram.ui.Components.q80) obj).run();
                break;
            case 20:
                ((qp) obj2).x.d.O = false;
                ((org.telegram.ui.Components.r80) obj).run();
                break;
            case 21:
                up upVar2 = ((qp) obj2).x.d;
                upVar2.O = false;
                upVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 22:
                qp qpVar = (qp) obj2;
                qpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qpVar.h = true;
                qpVar.c.setChecked(true);
                break;
            case 23:
                sr srVar = (sr) obj2;
                srVar.getClass();
                srVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 24:
                TLRPC.User user = (TLRPC.User) obj;
                sr srVar2 = ((hr) obj2).a;
                if (org.telegram.ui.Components.xc.a(srVar2)) {
                    org.telegram.ui.Components.xc.C(srVar2, user.first_name).j();
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
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 27:
                e01 e01Var = (e01) obj;
                if (((boolean[]) obj2)[0]) {
                    e01Var.run();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) obj2;
                TLObject tLObject2 = (TLObject) obj;
                caVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    caVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                pcVar.n = true;
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                if (tbVar instanceof org.telegram.ui.Components.ub) {
                    org.telegram.ui.Components.vb vbVar = (org.telegram.ui.Components.vb) ((org.telegram.ui.Components.ub) tbVar);
                    vbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(vbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(vbVar.b, true, false, true);
                }
                pcVar.i(true);
                break;
        }
    }
}
