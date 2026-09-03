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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        org.telegram.ui.Components.a11 a11Var;
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
                dd ddVar = (dd) obj2;
                ddVar.getClass();
                ddVar.presentFragment(oa1.d0((TLRPC.Chat) obj, true));
                break;
            case 1:
                List list = (List) obj;
                bd bdVar = ((ad) obj2).b;
                int i14 = bdVar.a;
                rb1 rb1Var = bdVar.d;
                ArrayList arrayList = bdVar.c;
                if (list != null && !list.isEmpty()) {
                    bdVar.n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.ip((org.telegram.ui.ActionBar.e4) list.get(0)));
                    if (bdVar.v != null && bdVar.f) {
                        arrayList.add(0, new org.telegram.ui.Components.ip(org.telegram.ui.ActionBar.e4.a(i14)));
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = bdVar.b;
                    int a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
                    for (int i15 = 1; i15 < list.size(); i15++) {
                        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) list.get(i15);
                        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(e4Var);
                        e4Var.n(i14);
                        ipVar.c = a2;
                        arrayList.add(ipVar);
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.ip ipVar2 = (org.telegram.ui.Components.ip) arrayList.get(i16);
                        boolean z4 = TextUtils.equals(bdVar.s, ipVar2.a()) || (TextUtils.isEmpty(bdVar.s) && ipVar2.a.a);
                        ipVar2.d = z4;
                        if (z4) {
                            i11 = i16;
                        }
                    }
                    zc zcVar = bdVar.h;
                    if (zcVar != null) {
                        zcVar.l();
                    }
                    rb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.u00 u00Var = bdVar.e;
                    if (bdVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, true);
                    }
                    if (i11 >= 0 && (rb1Var.getLayoutManager() instanceof f2.i0)) {
                        ((f2.i0) rb1Var.getLayoutManager()).h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 2:
                pd pdVar = (pd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    pdVar.getClass();
                    if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        r9 = false;
                    }
                }
                pdVar.g0 = r9;
                break;
            case 3:
                pd.W((pd) obj2, (String) obj);
                break;
            case 4:
                pd pdVar2 = (pd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = pdVar2.c0;
                pdVar2.a0 = false;
                if (tLObject != null && pdVar2.getParentActivity() != null) {
                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                        pdVar2.H.removeView((View) arrayList2.get(i17));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    int i18 = 0;
                    while (i18 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(pdVar2.getParentActivity(), new hd(pdVar2, i13), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i18), i18 == tL_messages_chats.chats.size() - 1);
                        arrayList2.add(nVar);
                        pdVar2.I.addView(nVar, k7.b6.n(-1, 72));
                        i18++;
                    }
                    pdVar2.h0();
                    break;
                }
                break;
            case 5:
                me meVar = (me) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                meVar.x0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    meVar.y0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.g61 g61Var = meVar.X0;
                if (g61Var != null && (w51Var = g61Var.V2) != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 6:
                ((me) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 7:
                zn znVar = (zn) obj2;
                org.telegram.ui.Components.a11[] a11VarArr = (org.telegram.ui.Components.a11[]) obj;
                if (!znVar.hb && (a11Var = a11VarArr[0]) != null) {
                    a11VarArr[0] = null;
                    if (znVar.s0 == a11Var) {
                        znVar.s0 = null;
                    }
                    AndroidUtilities.removeFromParent(a11Var);
                    break;
                }
                break;
            case 8:
                ((lh.g2) obj2).run((TLRPC.User) obj);
                break;
            case 9:
                zn znVar2 = (zn) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                s1Var.getLocationInWindow(new int[2]);
                znVar2.w1.setTranslationY(s1Var.getTimeY() + ((r0[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                znVar2.w1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + s1Var.ob) + s1Var.mb) - (s1Var.pb / 2.0f));
                znVar2.w1.u();
                break;
            case 10:
                zn.M0((zn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 11:
                zn znVar3 = (zn) obj2;
                int[] iArr = (int[]) obj;
                znVar3.getClass();
                if (iArr[0] != 0) {
                    znVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 12:
                ((zn) obj2).h8((ch) obj);
                break;
            case 13:
                zn znVar4 = (zn) obj2;
                ze.d.p(znVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), znVar4.c8 == 0, false);
                break;
            case 14:
                ((zn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 15:
                zn.d0((zn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 16:
                zn znVar5 = (zn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.z4.w0(znVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.z4.w0(znVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.z4.w0(znVar5, tL_error2.text);
                    break;
                }
            case 17:
                a0.h hVar = (a0.h) obj2;
                r6 r6Var = (r6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    while (i13 < messageObject.messageOwner.media.webpage.attributes.size()) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i13);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new hc(18, r6Var, messageObject.messageOwner.media.webpage));
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new yt0(r6Var, 28));
                break;
            case 18:
                ((r6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 19:
                zn znVar6 = (zn) obj2;
                View view = (View) obj;
                if (znVar6.getParentActivity() != null) {
                    znVar6.H0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    znVar6.H0.q(16.0f);
                    znVar6.H0.p(true);
                    znVar6.H0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    znVar6.H0.l(0.0f, 96.0f);
                    znVar6.H0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - znVar6.wa) - znVar6.U0.getHeight()));
                    znVar6.U0.addView(znVar6.H0, k7.b6.e(-1, 100, 87));
                    ph.f3 f3Var = znVar6.H0;
                    f3Var.i0 = new nf(znVar6, 7);
                    f3Var.u();
                    org.telegram.ui.Components.m40.v.b();
                    break;
                }
                break;
            case 20:
                ((zn) obj2).U0.removeView((org.telegram.ui.Components.pk0) obj);
                break;
            case 21:
                MessageObject messageObject2 = (MessageObject) obj;
                zn znVar7 = ((ui) obj2).s;
                MessageObject messageObject3 = (MessageObject) znVar7.l6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) znVar7.l6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                znVar7.qc(messageObject2, true);
                mg.m0.f();
                break;
            case 22:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                zn znVar8 = ((dm) ((en) obj2).f).a.N;
                int i19 = zn.Ec;
                znVar8.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                break;
            case 23:
                ph.f3 f3Var2 = (ph.f3) obj;
                zn znVar9 = ((ln) obj2).a;
                znVar9.U0.removeView(f3Var2);
                if (f3Var2 == znVar9.x1) {
                    znVar9.x1 = null;
                    break;
                }
                break;
            case 24:
                Long l10 = (Long) obj;
                zn znVar10 = ((fn) obj2).Z0.a;
                String str = (l10.longValue() >= 0 || (chat = znVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.qc.a0(znVar10).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 25:
                ro roVar = (ro) obj2;
                roVar.getClass();
                roVar.presentFragment(oa1.d0((TLRPC.Chat) obj, true));
                break;
            case 26:
                fp fpVar = (fp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = fpVar.getMessagesController().getInputChannel(fpVar.W);
                fpVar.e0 = fpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new da(fpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 27:
                fp fpVar2 = (fp) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                fpVar2.Z = z10;
                if (!z10 && fpVar2.getUserConfig().isPremium() && !fpVar2.a0 && fpVar2.x != null) {
                    fpVar2.a0 = true;
                    fpVar2.b0();
                    fpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new so(fpVar2, i12));
                    break;
                }
                break;
            case 28:
                sp.U((sp) obj2, (org.telegram.ui.ActionBar.d2[]) obj);
                break;
            default:
                sp spVar = (sp) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    spVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList3 = messages_chats.chats;
                    spVar.v = arrayList3;
                    Iterator<TLRPC.Chat> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                spVar.w = false;
                spVar.x = true;
                spVar.b0();
                break;
        }
    }
}
