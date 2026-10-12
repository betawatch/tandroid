package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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

    /* JADX WARN: Code restructure failed: missing block: B:179:0x03e7, code lost:
    
        if (r11.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.z61 z61Var;
        org.telegram.ui.Components.y11 y11Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        int i11 = -1;
        MessageObject messageObject = null;
        int i12 = 2;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ic icVar = (ic) obj2;
                icVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                icVar.I.animate().cancel();
                icVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new u0(icVar, 19));
                icVar.d(true);
                icVar.c(null);
                break;
            case 1:
                hd hdVar = (hd) obj2;
                hdVar.getClass();
                hdVar.presentFragment(hb1.d0((TLRPC.Chat) obj, true));
                break;
            case 2:
                List list = (List) obj;
                fd fdVar = ((ed) obj2).b;
                int i13 = fdVar.a;
                kc1 kc1Var = fdVar.d;
                ArrayList arrayList = fdVar.c;
                if (list != null && !list.isEmpty()) {
                    fdVar.n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.yp((org.telegram.ui.ActionBar.b4) list.get(0)));
                    if (fdVar.v != null && fdVar.f) {
                        arrayList.add(0, new org.telegram.ui.Components.yp(org.telegram.ui.ActionBar.b4.a(i13)));
                    }
                    org.telegram.ui.ActionBar.c6 c6Var = fdVar.b;
                    int a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
                    for (int i14 = 1; i14 < list.size(); i14++) {
                        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i14);
                        org.telegram.ui.Components.yp ypVar = new org.telegram.ui.Components.yp(b4Var);
                        b4Var.n(i13);
                        ypVar.c = a2;
                        arrayList.add(ypVar);
                    }
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.yp ypVar2 = (org.telegram.ui.Components.yp) arrayList.get(i15);
                        boolean z11 = TextUtils.equals(fdVar.s, ypVar2.a()) || (TextUtils.isEmpty(fdVar.s) && ypVar2.a.a);
                        ypVar2.d = z11;
                        if (z11) {
                            i11 = i15;
                        }
                    }
                    dd ddVar = fdVar.h;
                    if (ddVar != null) {
                        ddVar.l();
                    }
                    kc1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.f10 f10Var = fdVar.e;
                    if (fdVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(f10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(f10Var, true, 1.0f, true, true);
                    }
                    if (i11 >= 0 && (kc1Var.getLayoutManager() instanceof s4.b0)) {
                        ((s4.b0) kc1Var.getLayoutManager()).h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 3:
                sd sdVar = (sd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    sdVar.getClass();
                    break;
                }
                z10 = true;
                sdVar.j0 = z10;
                break;
            case 4:
                sd.W((sd) obj2, (String) obj);
                break;
            case 5:
                sd sdVar2 = (sd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = sdVar2.f0;
                sdVar2.d0 = false;
                if (tLObject != null && sdVar2.getParentActivity() != null) {
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        sdVar2.K.removeView((View) arrayList2.get(i16));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    int i17 = 0;
                    while (i17 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(sdVar2.getParentActivity(), new kd(sdVar2, z10 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i17), i17 == tL_messages_chats.chats.size() - 1);
                        arrayList2.add(nVar);
                        sdVar2.L.addView(nVar, w7.a6.n(-1, 72));
                        i17++;
                    }
                    sdVar2.h0();
                    break;
                }
                break;
            case 6:
                qe qeVar = (qe) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qeVar.A0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    qeVar.B0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.h71 h71Var = qeVar.a1;
                if (h71Var != null && (z61Var = h71Var.W2) != null) {
                    z61Var.N(true);
                    break;
                }
                break;
            case 7:
                ((qe) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 8:
                fo foVar = (fo) obj2;
                org.telegram.ui.Components.y11[] y11VarArr = (org.telegram.ui.Components.y11[]) obj;
                if (!foVar.kb && (y11Var = y11VarArr[0]) != null) {
                    y11VarArr[0] = null;
                    if (foVar.v0 == y11Var) {
                        foVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(y11Var);
                    break;
                }
                break;
            case 9:
                fo foVar2 = (fo) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                foVar2.z1.setTranslationY(u1Var.getTimeY() + ((r0[1] - r2.getTop()) - AndroidUtilities.dp(120.0f)));
                foVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                foVar2.z1.u();
                break;
            case 10:
                fo.L0((fo) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 11:
                fo foVar3 = (fo) obj2;
                foVar3.getClass();
                foVar3.presentFragment(ProfileActivity.m4(((TLRPC.User[]) obj)[0].id));
                break;
            case 12:
                ((xa) obj2).run((TLRPC.User) obj);
                break;
            case 13:
                fo foVar4 = (fo) obj2;
                int[] iArr = (int[]) obj;
                foVar4.getClass();
                if (iArr[0] != 0) {
                    foVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 14:
                fo foVar5 = (fo) obj2;
                pf.d.p(foVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), foVar5.f8 == 0, false);
                break;
            case 15:
                ((fo) obj2).k8((qh) obj);
                break;
            case 16:
                ((fo) obj2).pa((TLRPC.Chat) obj);
                break;
            case 17:
                fo.r0((fo) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 18:
                fo foVar6 = (fo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(foVar6, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(foVar6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.g5.v0(foVar6, tL_error2.text);
                    break;
                }
            case 19:
                a0.h hVar = (a0.h) obj2;
                q6 q6Var = (q6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i18 = 0; i18 < messageObject.messageOwner.media.webpage.attributes.size(); i18++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i18);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new fc(20, q6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new tu0(q6Var, 29));
                break;
            case 20:
                ((q6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 21:
                fo foVar7 = (fo) obj2;
                View view = (View) obj;
                if (foVar7.getParentActivity() != null) {
                    foVar7.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    foVar7.K0.q(16.0f);
                    foVar7.K0.p(true);
                    foVar7.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    foVar7.K0.l(0.0f, 96.0f);
                    foVar7.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - foVar7.Aa) - foVar7.X0.getHeight()));
                    foVar7.X0.addView(foVar7.K0, w7.a6.e(-1, 100, 87));
                    di.d4 d4Var = foVar7.K0;
                    d4Var.l0 = new se(foVar7, 26);
                    d4Var.u();
                    org.telegram.ui.Components.w40.w.b();
                    break;
                }
                break;
            case 22:
                ((fo) obj2).X0.removeView((org.telegram.ui.Components.gl0) obj);
                break;
            case 23:
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
            case 24:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) obj;
                fo foVar9 = ((im) ((jn) obj2).f).a.Q;
                int i19 = fo.Hc;
                foVar9.Qa();
                x0Var.getMessageObject().flickerLoading = false;
                x0Var.invalidate();
                break;
            case 25:
                di.d4 d4Var2 = (di.d4) obj;
                fo foVar10 = ((qn) obj2).a;
                foVar10.X0.removeView(d4Var2);
                if (d4Var2 == foVar10.A1) {
                    foVar10.A1 = null;
                    break;
                }
                break;
            case 26:
                Long l4 = (Long) obj;
                fo foVar11 = ((kn) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = foVar11.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.zc.a0(foVar11).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 27:
                zo zoVar = (zo) obj2;
                zoVar.getClass();
                zoVar.presentFragment(hb1.d0((TLRPC.Chat) obj, true));
                break;
            case 28:
                np npVar = (np) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = npVar.getMessagesController().getInputChannel(npVar.Z);
                npVar.h0 = npVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new fa(npVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            default:
                np npVar2 = (np) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                boolean z12 = tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                npVar2.c0 = z12;
                if (!z12 && npVar2.getUserConfig().isPremium() && !npVar2.d0 && npVar2.x != null) {
                    npVar2.d0 = true;
                    npVar2.b0();
                    npVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ap(npVar2, i12));
                    break;
                }
                break;
        }
    }
}
