package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.x51 x51Var;
        org.telegram.ui.Components.b11 b11Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        int i11 = -1;
        MessageObject messageObject = null;
        int i12 = 2;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(ha1.d0((TLRPC.Chat) obj, true));
                break;
            case 1:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i14 = zcVar.a;
                kb1 kb1Var = zcVar.d;
                ArrayList arrayList = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.lp((org.telegram.ui.ActionBar.f4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.f4.a(i14)));
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = zcVar.b;
                    int a2 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
                    for (int i15 = 1; i15 < list.size(); i15++) {
                        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i15);
                        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(f4Var);
                        f4Var.n(i14);
                        lpVar.c = a2;
                        arrayList.add(lpVar);
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.lp lpVar2 = (org.telegram.ui.Components.lp) arrayList.get(i16);
                        boolean z4 = TextUtils.equals(zcVar.s, lpVar2.a()) || (TextUtils.isEmpty(zcVar.s) && lpVar2.a.a);
                        lpVar2.d = z4;
                        if (z4) {
                            i11 = i16;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    kb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.u00 u00Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, true);
                    }
                    if (i11 >= 0 && (kb1Var.getLayoutManager() instanceof f2.j0)) {
                        ((f2.j0) kb1Var.getLayoutManager()).h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 2:
                nd ndVar = (nd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ndVar.getClass();
                    if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        r9 = false;
                    }
                }
                ndVar.g0 = r9;
                break;
            case 3:
                nd.W((nd) obj2, (String) obj);
                break;
            case 4:
                nd ndVar2 = (nd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = ndVar2.c0;
                ndVar2.a0 = false;
                if (tLObject != null && ndVar2.getParentActivity() != null) {
                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                        ndVar2.H.removeView((View) arrayList2.get(i17));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    int i18 = 0;
                    while (i18 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar2.getParentActivity(), new fd(ndVar2, i13), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i18), i18 == tL_messages_chats.chats.size() - 1);
                        arrayList2.add(nVar);
                        ndVar2.I.addView(nVar, k7.c6.n(-1, 72));
                        i18++;
                    }
                    ndVar2.h0();
                    break;
                }
                break;
            case 5:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.x0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    keVar.y0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.i61 i61Var = keVar.X0;
                if (i61Var != null && (x51Var = i61Var.V2) != null) {
                    x51Var.N(true);
                    break;
                }
                break;
            case 6:
                ((ke) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 7:
                xn xnVar = (xn) obj2;
                org.telegram.ui.Components.b11[] b11VarArr = (org.telegram.ui.Components.b11[]) obj;
                if (!xnVar.hb && (b11Var = b11VarArr[0]) != null) {
                    b11VarArr[0] = null;
                    if (xnVar.s0 == b11Var) {
                        xnVar.s0 = null;
                    }
                    AndroidUtilities.removeFromParent(b11Var);
                    break;
                }
                break;
            case 8:
                ((mh.f2) obj2).run((TLRPC.User) obj);
                break;
            case 9:
                xn xnVar2 = (xn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                xnVar2.w1.setTranslationY(t1Var.getTimeY() + ((r0[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                xnVar2.w1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + t1Var.ob) + t1Var.mb) - (t1Var.pb / 2.0f));
                xnVar2.w1.v();
                break;
            case 10:
                xn.M0((xn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 11:
                xn xnVar3 = (xn) obj2;
                int[] iArr = (int[]) obj;
                xnVar3.getClass();
                if (iArr[0] != 0) {
                    xnVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 12:
                ((xn) obj2).h8((ah) obj);
                break;
            case 13:
                xn xnVar4 = (xn) obj2;
                af.g.p(xnVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), xnVar4.c8 == 0, false);
                break;
            case 14:
                ((xn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 15:
                xn.d0((xn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 16:
                xn xnVar5 = (xn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.z4.w0(xnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.z4.w0(xnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.z4.w0(xnVar5, tL_error2.text);
                    break;
                }
            case 17:
                a0.h hVar = (a0.h) obj2;
                p6 p6Var = (p6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    while (i13 < messageObject.messageOwner.media.webpage.attributes.size()) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i13);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new fc(18, p6Var, messageObject.messageOwner.media.webpage));
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new tt0(p6Var, 28));
                break;
            case 18:
                ((p6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 19:
                xn xnVar6 = (xn) obj2;
                View view = (View) obj;
                if (xnVar6.getParentActivity() != null) {
                    xnVar6.H0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    xnVar6.H0.r(16.0f);
                    xnVar6.H0.q(true);
                    xnVar6.H0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    xnVar6.H0.m(0.0f, 96.0f);
                    xnVar6.H0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - xnVar6.wa) - xnVar6.U0.getHeight()));
                    xnVar6.U0.addView(xnVar6.H0, k7.c6.e(-1, 100, 87));
                    qh.f3 f3Var = xnVar6.H0;
                    f3Var.i0 = new lf(xnVar6, 7);
                    f3Var.v();
                    org.telegram.ui.Components.n40.v.b();
                    break;
                }
                break;
            case 20:
                ((xn) obj2).U0.removeView((org.telegram.ui.Components.rk0) obj);
                break;
            case 21:
                MessageObject messageObject2 = (MessageObject) obj;
                xn xnVar7 = ((si) obj2).s;
                MessageObject messageObject3 = (MessageObject) xnVar7.l6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) xnVar7.l6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                xnVar7.qc(messageObject2, true);
                ng.m0.f();
                break;
            case 22:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                xn xnVar8 = ((bm) ((cn) obj2).f).a.N;
                int i19 = xn.Ec;
                xnVar8.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                break;
            case 23:
                qh.f3 f3Var2 = (qh.f3) obj;
                xn xnVar9 = ((jn) obj2).a;
                xnVar9.U0.removeView(f3Var2);
                if (f3Var2 == xnVar9.x1) {
                    xnVar9.x1 = null;
                    break;
                }
                break;
            case 24:
                Long l10 = (Long) obj;
                xn xnVar10 = ((dn) obj2).Z0.a;
                String str = (l10.longValue() >= 0 || (chat = xnVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.qc.a0(xnVar10).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 25:
                po poVar = (po) obj2;
                poVar.getClass();
                poVar.presentFragment(ha1.d0((TLRPC.Chat) obj, true));
                break;
            case 26:
                ep epVar = (ep) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = epVar.getMessagesController().getInputChannel(epVar.W);
                epVar.e0 = epVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ba(epVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 27:
                ep epVar2 = (ep) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                epVar2.Z = z10;
                if (!z10 && epVar2.getUserConfig().isPremium() && !epVar2.a0 && epVar2.x != null) {
                    epVar2.a0 = true;
                    epVar2.b0();
                    epVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qo(epVar2, i12));
                    break;
                }
                break;
            case 28:
                rp.U((rp) obj2, (org.telegram.ui.ActionBar.d2[]) obj);
                break;
            default:
                rp rpVar = (rp) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    rpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList3 = messages_chats.chats;
                    rpVar.v = arrayList3;
                    Iterator<TLRPC.Chat> it = arrayList3.iterator();
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
        }
    }
}
