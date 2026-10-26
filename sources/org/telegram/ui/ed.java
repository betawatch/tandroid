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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ed(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.j71 j71Var;
        org.telegram.ui.Components.g21 g21Var;
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
                nd ndVar = (nd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ndVar.g0;
                ndVar.e0 = false;
                if (tLObject != null && ndVar.getParentActivity() != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        ndVar.L.removeView((View) arrayList.get(i13));
                    }
                    arrayList.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    int i14 = 0;
                    while (i14 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar.getParentActivity(), new fd(ndVar, i12), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i14), i14 == tL_messages_chats.chats.size() - 1);
                        arrayList.add(nVar);
                        ndVar.M.addView(nVar, org.telegram.ui.Components.gb1.r(-1, 72));
                        i14++;
                    }
                    ndVar.j0();
                    break;
                }
                break;
            case 1:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.q0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    keVar.r0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.r71 r71Var = keVar.X0;
                if (r71Var != null && (j71Var = r71Var.g3) != null) {
                    j71Var.O(true);
                    break;
                }
                break;
            case 2:
                ((ke) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 3:
                un unVar = (un) obj2;
                org.telegram.ui.Components.g21[] g21VarArr = (org.telegram.ui.Components.g21[]) obj;
                if (!unVar.Gb && (g21Var = g21VarArr[0]) != null) {
                    g21VarArr[0] = null;
                    if (unVar.v0 == g21Var) {
                        unVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(g21Var);
                    break;
                }
                break;
            case 4:
                ((bi.b3) obj2).run((TLRPC.User) obj);
                break;
            case 5:
                un unVar2 = (un) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                s1Var.getLocationInWindow(new int[2]);
                unVar2.L1.setTranslationY(s1Var.getTimeY() + ((r0[1] - r1.getTop()) - AndroidUtilities.dp(120.0f)));
                unVar2.L1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + s1Var.rb) + s1Var.pb) - (s1Var.sb / 2.0f));
                unVar2.L1.u();
                break;
            case 6:
                un unVar3 = (un) obj2;
                unVar3.getClass();
                unVar3.presentFragment(ProfileActivity.t4(((TLRPC.User[]) obj)[0].id));
                break;
            case 7:
                un.K0((un) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 8:
                un unVar4 = (un) obj2;
                int[] iArr = (int[]) obj;
                unVar4.getClass();
                if (iArr[0] != 0) {
                    unVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 9:
                un unVar5 = (un) obj2;
                qf.d.o(unVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), unVar5.r8 == 0, false);
                break;
            case 10:
                ((un) obj2).o8((bh) obj);
                break;
            case 11:
                ((un) obj2).ua((TLRPC.Chat) obj);
                break;
            case 12:
                un.w0((un) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 13:
                un unVar6 = (un) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(unVar6, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(unVar6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.g5.v0(unVar6, tL_error.text);
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
                            AndroidUtilities.runOnUIThread(new ed(15, q6Var, messageObject.messageOwner.media.webpage));
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new zt0(q6Var, 29));
                break;
            case 15:
                ((q6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 16:
                un unVar7 = (un) obj2;
                View view = (View) obj;
                if (unVar7.getParentActivity() != null) {
                    unVar7.W0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    unVar7.W0.q(16.0f);
                    unVar7.W0.p(true);
                    unVar7.W0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    unVar7.W0.l(0.0f, 96.0f);
                    unVar7.W0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - unVar7.Ma) - unVar7.j1.getHeight()));
                    unVar7.j1.addView(unVar7.W0, org.telegram.ui.Components.gb1.i(-1, 100, 87));
                    fi.v3 v3Var = unVar7.W0;
                    v3Var.l0 = new le(unVar7, 19);
                    v3Var.u();
                    org.telegram.ui.Components.u40.w.b();
                    break;
                }
                break;
            case 17:
                ((un) obj2).j1.removeView((org.telegram.ui.Components.fl0) obj);
                break;
            case 18:
                MessageObject messageObject2 = (MessageObject) obj;
                un unVar8 = ((oi) obj2).s;
                MessageObject messageObject3 = (MessageObject) unVar8.A6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) unVar8.A6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                unVar8.Dc(messageObject2, true);
                bh.s0.f();
                break;
            case 19:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                un unVar9 = ((wl) ((ym) obj2).f).a.Q;
                int i15 = un.bd;
                unVar9.Va();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                break;
            case 20:
                fi.v3 v3Var2 = (fi.v3) obj;
                un unVar10 = ((fn) obj2).a;
                unVar10.j1.removeView(v3Var2);
                if (v3Var2 == unVar10.M1) {
                    unVar10.M1 = null;
                    break;
                }
                break;
            case 21:
                Long l4 = (Long) obj;
                un unVar11 = ((zm) obj2).b1.a;
                String str = (l4.longValue() >= 0 || (chat = unVar11.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.wc.b0(unVar11).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 22:
                mo moVar = (mo) obj2;
                moVar.getClass();
                moVar.presentFragment(w91.c0((TLRPC.Chat) obj, true));
                break;
            case 23:
                ap apVar = (ap) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = apVar.getMessagesController().getInputChannel(apVar.Z);
                apVar.h0 = apVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ea(apVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 24:
                ap apVar2 = (ap) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                apVar2.c0 = z10;
                if (!z10 && apVar2.getUserConfig().isPremium() && !apVar2.d0 && apVar2.x != null) {
                    apVar2.d0 = true;
                    apVar2.d0();
                    apVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new no(apVar2, i11));
                    break;
                }
                break;
            case 25:
                np.V((np) obj2, (org.telegram.ui.ActionBar.e2[]) obj);
                break;
            case 26:
                np npVar = (np) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    npVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    npVar.v = arrayList2;
                    Iterator<TLRPC.Chat> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                npVar.w = false;
                npVar.x = true;
                npVar.c0();
                break;
            case 27:
                ((jp) obj2).x.d.P = false;
                ((org.telegram.ui.Components.e90) obj).run();
                break;
            case 28:
                ((jp) obj2).x.d.O = false;
                ((org.telegram.ui.Components.f90) obj).run();
                break;
            default:
                np npVar2 = ((jp) obj2).x.d;
                npVar2.O = false;
                npVar2.P = false;
                ((Runnable) obj).run();
                break;
        }
    }
}
