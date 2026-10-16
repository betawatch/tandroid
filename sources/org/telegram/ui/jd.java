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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jd(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.a71 a71Var;
        org.telegram.ui.Components.z11 z11Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        MessageObject messageObject = null;
        int i11 = 2;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                sd sdVar = (sd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = sdVar.f0;
                sdVar.d0 = false;
                if (tLObject != null && sdVar.getParentActivity() != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        sdVar.K.removeView((View) arrayList.get(i13));
                    }
                    arrayList.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    int i14 = 0;
                    while (i14 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(sdVar.getParentActivity(), new kd(sdVar, i12), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i14), i14 == tL_messages_chats.chats.size() - 1);
                        arrayList.add(nVar);
                        sdVar.L.addView(nVar, w7.z5.n(-1, 72));
                        i14++;
                    }
                    sdVar.h0();
                    break;
                }
                break;
            case 1:
                qe qeVar = (qe) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qeVar.A0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    qeVar.B0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.i71 i71Var = qeVar.a1;
                if (i71Var != null && (a71Var = i71Var.W2) != null) {
                    a71Var.N(true);
                    break;
                }
                break;
            case 2:
                ((qe) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 3:
                fo foVar = (fo) obj2;
                org.telegram.ui.Components.z11[] z11VarArr = (org.telegram.ui.Components.z11[]) obj;
                if (!foVar.kb && (z11Var = z11VarArr[0]) != null) {
                    z11VarArr[0] = null;
                    if (foVar.v0 == z11Var) {
                        foVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(z11Var);
                    break;
                }
                break;
            case 4:
                fo foVar2 = (fo) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                foVar2.z1.setTranslationY(u1Var.getTimeY() + ((r0[1] - r1.getTop()) - AndroidUtilities.dp(120.0f)));
                foVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                foVar2.z1.u();
                break;
            case 5:
                fo.L0((fo) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 6:
                fo foVar3 = (fo) obj2;
                foVar3.getClass();
                foVar3.presentFragment(ProfileActivity.m4(((TLRPC.User[]) obj)[0].id));
                break;
            case 7:
                ((xa) obj2).run((TLRPC.User) obj);
                break;
            case 8:
                fo foVar4 = (fo) obj2;
                int[] iArr = (int[]) obj;
                foVar4.getClass();
                if (iArr[0] != 0) {
                    foVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 9:
                fo foVar5 = (fo) obj2;
                pf.d.o(foVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), foVar5.f8 == 0, false);
                break;
            case 10:
                ((fo) obj2).k8((qh) obj);
                break;
            case 11:
                ((fo) obj2).pa((TLRPC.Chat) obj);
                break;
            case 12:
                fo.r0((fo) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 13:
                fo foVar6 = (fo) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(foVar6, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(foVar6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.g5.v0(foVar6, tL_error.text);
                    break;
                }
            case 14:
                a0.h hVar = (a0.h) obj2;
                q6 q6Var = (q6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    while (i12 < messageObject.messageOwner.media.webpage.attributes.size()) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new jd(15, q6Var, messageObject.messageOwner.media.webpage));
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new su0(q6Var, 29));
                break;
            case 15:
                ((q6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 16:
                fo foVar7 = (fo) obj2;
                View view = (View) obj;
                if (foVar7.getParentActivity() != null) {
                    foVar7.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    foVar7.K0.q(16.0f);
                    foVar7.K0.p(true);
                    foVar7.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    foVar7.K0.l(0.0f, 96.0f);
                    foVar7.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - foVar7.Aa) - foVar7.X0.getHeight()));
                    foVar7.X0.addView(foVar7.K0, w7.z5.e(-1, 100, 87));
                    di.d4 d4Var = foVar7.K0;
                    d4Var.l0 = new se(foVar7, 26);
                    d4Var.u();
                    org.telegram.ui.Components.w40.w.b();
                    break;
                }
                break;
            case 17:
                ((fo) obj2).X0.removeView((org.telegram.ui.Components.gl0) obj);
                break;
            case 18:
                MessageObject messageObject2 = (MessageObject) obj;
                fo foVar8 = ((aj) obj2).s;
                MessageObject messageObject3 = (MessageObject) foVar8.o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) foVar8.o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                foVar8.uc(messageObject2, true);
                ah.d1.f();
                break;
            case 19:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                fo foVar9 = ((im) ((jn) obj2).f).a.Q;
                int i15 = fo.Hc;
                foVar9.Qa();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 20:
                di.d4 d4Var2 = (di.d4) obj;
                fo foVar10 = ((qn) obj2).a;
                foVar10.X0.removeView(d4Var2);
                if (d4Var2 == foVar10.A1) {
                    foVar10.A1 = null;
                    break;
                }
                break;
            case 21:
                Long l4 = (Long) obj;
                fo foVar11 = ((kn) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = foVar11.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.zc.a0(foVar11).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 22:
                zo zoVar = (zo) obj2;
                zoVar.getClass();
                zoVar.presentFragment(hb1.d0((TLRPC.Chat) obj, true));
                break;
            case 23:
                np npVar = (np) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = npVar.getMessagesController().getInputChannel(npVar.Z);
                npVar.h0 = npVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new fa(npVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 24:
                np npVar2 = (np) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                npVar2.c0 = z10;
                if (!z10 && npVar2.getUserConfig().isPremium() && !npVar2.d0 && npVar2.x != null) {
                    npVar2.d0 = true;
                    npVar2.b0();
                    npVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ap(npVar2, i11));
                    break;
                }
                break;
            case 25:
                aq.U((aq) obj2, (org.telegram.ui.ActionBar.a2[]) obj);
                break;
            case 26:
                aq aqVar = (aq) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    aqVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    aqVar.v = arrayList2;
                    Iterator<TLRPC.Chat> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                aqVar.w = false;
                aqVar.x = true;
                aqVar.b0();
                break;
            case 27:
                ((wp) obj2).x.d.P = false;
                ((org.telegram.ui.Components.i90) obj).run();
                break;
            case 28:
                ((wp) obj2).x.d.O = false;
                ((org.telegram.ui.Components.j90) obj).run();
                break;
            default:
                aq aqVar2 = ((wp) obj2).x.d;
                aqVar2.O = false;
                aqVar2.P = false;
                ((Runnable) obj).run();
                break;
        }
    }
}
