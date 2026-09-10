package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zn;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.eo;
import org.telegram.ui.fc0;
import org.telegram.ui.fy0;
import org.telegram.ui.gb0;
import org.telegram.ui.hp0;
import org.telegram.ui.j60;
import org.telegram.ui.kl0;
import org.telegram.ui.pn;
import org.telegram.ui.uu0;
import org.telegram.ui.ww0;
import org.telegram.ui.yo;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a0f  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.EmojiStatus emojiStatus;
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        int i10;
        xh.v2 v2Var;
        xh.v2 v2Var2;
        xh.v2 v2Var3;
        int i11;
        boolean z10;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                pg.j jVar = (pg.j) this.c;
                r7Var.getClass();
                ((pg.t0) jVar).r(r7Var.F1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                r7Var.d0(jVar);
                break;
            case 1:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.t) obj2, (androidx.biometric.u) this.c);
                break;
            case 2:
                org.telegram.ui.z zVar = (org.telegram.ui.z) this.b;
                org.telegram.ui.y yVar = (org.telegram.ui.y) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        zVar.run(Boolean.TRUE);
                    }
                    yVar.run();
                    break;
                }
                break;
            case 3:
                eo.h0((eo) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                break;
            case 4:
                eo eoVar = (eo) this.b;
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                eoVar.F5 = 0;
                if (webpagepreview != null) {
                    eoVar.getMessagesController().putUsers(webpagepreview.users, false);
                    eoVar.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            m6Var.run(Boolean.FALSE, null);
                            break;
                        } else {
                            TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                            if (webPage2 == null || !"telegram_story".equals(webPage2.type)) {
                                m6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                                break;
                            } else {
                                if (tL_messageMediaWebPage.webpage.attributes != null) {
                                    for (int i12 = 0; i12 < tL_messageMediaWebPage.webpage.attributes.size(); i12++) {
                                        if (tL_messageMediaWebPage.webpage.attributes.get(i12) instanceof TLRPC.TL_webPageAttributeStory) {
                                            tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i12);
                                            if (tL_webPageAttributeStory != null) {
                                                m6Var.run(Boolean.FALSE, null);
                                                break;
                                            } else if (tL_webPageAttributeStory.storyItem != null) {
                                                m6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                                break;
                                            } else {
                                                eoVar.getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.ui.da(eoVar, tL_messageMediaWebPage, tL_webPageAttributeStory, m6Var, 6));
                                                break;
                                            }
                                        }
                                    }
                                }
                                tL_webPageAttributeStory = null;
                                if (tL_webPageAttributeStory != null) {
                                }
                            }
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage != null) {
                }
                break;
            case 5:
                pn pnVar = (pn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                eo eoVar2 = pnVar.a;
                if (tL_channels_channelParticipant != null) {
                    eoVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    eoVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        pnVar.d(t1Var, channelParticipant);
                        break;
                    }
                }
                break;
            case 6:
                yo yoVar = (yo) this.b;
                View view = (View) this.c;
                yoVar.F0 = ((Boolean) obj).booleanValue();
                yoVar.H0 = ((Boolean) obj2).booleanValue();
                gg.i1 i1Var = yoVar.e;
                int dp = AndroidUtilities.dp(yoVar.F0 ? 16.0f : 32.0f);
                if (i1Var.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = i1Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(i1Var.getRoundRadius()[0], dp);
                    i1Var.x = ofInt;
                    ofInt.addUpdateListener(new ai.m(i1Var, 6));
                    i1Var.x.setDuration(200L);
                    i1Var.x.start();
                }
                ((org.telegram.ui.Cells.s8) view).setChecked(yoVar.F0);
                yoVar.p0(false, true);
                if (!yoVar.N0) {
                    TLRPC.Chat chat2 = yoVar.x0;
                    if (chat2.forum != yoVar.F0 || chat2.forum_tabs != yoVar.H0) {
                        if (ChatObject.isChannel(chat2) || !yoVar.F0) {
                            boolean z12 = yoVar.x0.forum_tabs != yoVar.H0;
                            yoVar.getMessagesController().toggleChannelForum(yoVar.w0, yoVar.F0, yoVar.H0);
                            TLRPC.Chat chat3 = yoVar.x0;
                            chat3.forum = yoVar.F0;
                            chat3.forum_tabs = yoVar.H0;
                            if (z12) {
                                yoVar.q0();
                                break;
                            }
                        } else {
                            Context parentActivity = yoVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.G1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(parentActivity, 3, null);
                                yoVar.N0 = true;
                                d2Var.q(250L);
                                yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.w0, yoVar, new org.telegram.ui.oe(8, yoVar, d2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                yi yiVar = (yi) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                yiVar.j0.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    g1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l4.longValue(), new Object[0]));
                    yiVar.h0.s(l4.longValue());
                    break;
                } else {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    g1Var.setSubtext(null);
                    yiVar.h0.s(0L);
                    break;
                }
            case 8:
                zn znVar = (zn) this.b;
                ph.e eVar = (ph.e) this.c;
                znVar.getClass();
                znVar.V((qh.e) eVar, true);
                break;
            case 9:
                xs xsVar = (xs) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList2 = xsVar.S;
                ArrayList arrayList3 = xsVar.R;
                int i13 = xsVar.N;
                if (TextUtils.equals(tL_contacts_search.q, xsVar.e0) && !TextUtils.isEmpty(xsVar.e0)) {
                    xsVar.a0 = false;
                    if (tL_contacts_found != null) {
                        MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
                        MessagesController.getInstance(i13).putUsers(tL_contacts_found.users, false);
                        MessagesController.getInstance(i13).putChats(tL_contacts_found.chats, false);
                    } else {
                        tL_contacts_found = null;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList3.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.my_results;
                        int size = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Peer peer = arrayList4.get(i14);
                            i14++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                                hashSet.add(Long.valueOf(user2.id));
                                arrayList3.add(user2);
                            }
                        }
                    }
                    arrayList2.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.results;
                        int size2 = arrayList5.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TLRPC.Peer peer3 = arrayList5.get(i15);
                            i15++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i13).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                                hashSet.add(Long.valueOf(user.id));
                                arrayList2.add(user);
                            }
                        }
                    }
                    vl0 vl0Var = xsVar.d;
                    if (vl0Var != null) {
                        vl0Var.u0(0);
                    }
                    xsVar.N(true);
                    break;
                }
                break;
            case 10:
                zs zsVar = (zs) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList6 = zsVar.S;
                ArrayList arrayList7 = zsVar.R;
                ArrayList arrayList8 = zsVar.Q;
                int i16 = zsVar.N;
                if (TextUtils.equals(tL_contacts_search2.q, zsVar.b0) && !TextUtils.isEmpty(zsVar.b0)) {
                    zsVar.X = false;
                    if (tL_contacts_found2 != null) {
                        MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(tL_contacts_found2.users, false);
                        MessagesController.getInstance(i16).putChats(tL_contacts_found2.chats, false);
                    } else {
                        tL_contacts_found2 = null;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList8.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList9 = tL_contacts_found2.my_results;
                        int size3 = arrayList9.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TLRPC.Peer peer5 = arrayList9.get(i17);
                            i17++;
                            TLRPC.Peer peer6 = peer5;
                            if (peer6 instanceof TLRPC.TL_peerChannel) {
                                TLRPC.Chat chat4 = MessagesController.getInstance(i16).getChat(Long.valueOf(peer6.channel_id));
                                if (chat4 != null && ChatObject.isChannelAndNotMegaGroup(chat4) && !hashSet2.contains(Long.valueOf(chat4.id))) {
                                    hashSet2.add(Long.valueOf(chat4.id));
                                    arrayList8.add(chat4);
                                }
                            }
                        }
                    }
                    arrayList7.clear();
                    String lowerCase = zsVar.b0.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i16).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList10 = cachedChannelRecommendations.chats;
                        int size4 = arrayList10.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            TLObject tLObject = arrayList10.get(i18);
                            i18++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat5)) {
                                    TLRPC.Chat chat6 = MessagesController.getInstance(i16).getChat(Long.valueOf(chat5.id));
                                    if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                                        String lowerCase2 = chat5.title.toLowerCase();
                                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.a2.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe2)) {
                                            if (!hashSet2.contains(Long.valueOf(chat5.id))) {
                                                hashSet2.add(Long.valueOf(chat5.id));
                                                arrayList7.add(chat5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList6.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found2.results;
                        int size5 = arrayList11.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            TLRPC.Peer peer7 = arrayList11.get(i19);
                            i19++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i16).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                hashSet2.add(Long.valueOf(chat.id));
                                arrayList6.add(chat);
                            }
                        }
                    }
                    zsVar.N(true);
                    break;
                }
                break;
            case 11:
                i41.m((i41) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 12:
                j60.q((j60) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                break;
            case 13:
                fc0 fc0Var = (fc0) this.b;
                String str = (String) this.c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                fc0Var.a();
                if (passkeys != null) {
                    fc0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        fc0Var.o("addPasskeyRow");
                        break;
                    }
                }
                break;
            case 14:
                fc0 fc0Var2 = (fc0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                fc0Var2.a();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        fc0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        fc0.b().d0(tL_error, false);
                        break;
                    }
                } else {
                    kl0.b(fc0Var2.d, fc0Var2.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    break;
                }
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                zArr[0] = true;
                h3Var.dismiss();
                break;
            case 16:
                ((nf.e) this.b).b();
                ((yo0) this.c).run((Boolean) obj);
                break;
            case 17:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                ww0 ww0Var = (ww0) this.c;
                Long l10 = (Long) obj;
                Integer num = (Integer) obj2;
                premiumPreviewFragment.getClass();
                if (l10 == null) {
                    emojiStatus = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l10.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    emojiStatus = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().updateEmojiStatus(emojiStatus);
                ww0Var.b(l10 != null ? l10.longValue() : 0L, true);
                break;
            case 18:
                ph.r rVar = (ph.r) this.b;
                String str2 = (String) this.c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i20 = rVar.a;
                if (webpagepreview2 != null) {
                    MessagesController.getInstance(i20).putUsers(webpagepreview2.users, false);
                    MessagesController.getInstance(i20).putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 != null) {
                        webPage = messageMedia2.webpage;
                        rVar.b.put(str2, webPage);
                        arrayList = (ArrayList) rVar.c.remove(str2);
                        if (arrayList == null) {
                            int size6 = arrayList.size();
                            int i21 = 0;
                            while (i21 < size6) {
                                Object obj3 = arrayList.get(i21);
                                i21++;
                                ((Utilities.Callback2) obj3).run(webPage, tL_error2);
                            }
                            break;
                        }
                    }
                }
                webPage = null;
                rVar.b.put(str2, webPage);
                arrayList = (ArrayList) rVar.c.remove(str2);
                if (arrayList == null) {
                }
                break;
            case 19:
                sg.a0 a0Var = (sg.a0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool2 = (Boolean) obj;
                String str3 = (String) obj2;
                a0Var.q0.a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    gb0 gb0Var = LaunchActivity.G1.x0;
                    if (U != null) {
                        if (bool2.booleanValue()) {
                            a0Var.dismiss();
                            eo R9 = eo.R9(-a0Var.b0.id);
                            U.presentFragment(R9);
                            U.whenFullyVisible(new org.telegram.ui.web.x1(22, R9, tL_starsGiveawayOption));
                            if (gb0Var != null) {
                                gb0Var.c(true);
                                break;
                            }
                        } else if (str3 != null) {
                            a0Var.dismiss();
                            com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str3}, org.telegram.ui.Components.wc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 20:
                wh.p2 p2Var = (wh.p2) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                ArrayList arrayList13 = ((xh.n5) this.c).l;
                int size7 = arrayList13.size();
                int i22 = 0;
                while (i22 < size7) {
                    Object obj4 = arrayList13.get(i22);
                    i22++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                    if (savedStarGift.pinned_to_top) {
                        int i23 = hp0.a;
                        v51 J = v51.J(hp0.class);
                        J.G = savedStarGift;
                        J.K(p2Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList12.add(J);
                    }
                }
                break;
            case 21:
                xh.x2 x2Var = (xh.x2) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                xh.v2[] v2VarArr = x2Var.n;
                x4 x4Var = x2Var.T;
                if (x4Var != null) {
                    x4Var.e(true);
                    x2Var.T = null;
                }
                x2Var.i0 = true;
                x2Var.j0 = starGift == null;
                x2Var.k0 = runnable;
                xh.p2 p2Var2 = new xh.p2(x2Var.h);
                ArrayList arrayList15 = p2Var2.b;
                ArrayList arrayList16 = new ArrayList();
                for (int i24 = 0; i24 < v2VarArr.length; i24++) {
                    xh.v2 v2Var4 = v2VarArr[i24];
                    if (v2Var4 != null) {
                        TL_stars.StarGift starGift2 = v2Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList16.add(Integer.valueOf(i24));
                        }
                    }
                }
                int i25 = 4;
                if (arrayList16.size() == 1) {
                    p2Var2.e(v2VarArr[((Integer) arrayList16.get(0)).intValue()], 5, 0.0f);
                    p2Var2.d(false);
                    p2Var2.c(26.0f, -26.0f);
                    p2Var2.a(90);
                    p2Var2.d(true);
                    p2Var2.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    xh.v2 v2Var5 = v2VarArr[0];
                    if (v2Var5 != null) {
                        TL_stars.StarGift starGift3 = v2Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            p2Var2.e(v2Var5, iArr[0], 0.0f);
                            p2Var2.c(25.0f, -22.0f);
                            i10 = 1;
                            v2Var = v2VarArr[1];
                            if (v2Var != null) {
                                TL_stars.StarGift starGift4 = v2Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        p2Var2.a(42);
                                    }
                                    p2Var2.e(v2VarArr[1], iArr[i10], 0.0f);
                                    p2Var2.c(25.0f, 31.0f);
                                    i10++;
                                }
                            }
                            v2Var2 = v2VarArr[2];
                            if (v2Var2 != null) {
                                TL_stars.StarGift starGift5 = v2Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i10 > 0) {
                                        p2Var2.a(42);
                                    }
                                    p2Var2.e(v2VarArr[2], iArr[i10], 180.0f);
                                    p2Var2.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            v2Var3 = v2VarArr[3];
                            if (v2Var3 != null) {
                                TL_stars.StarGift starGift6 = v2Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i10 > 0) {
                                        p2Var2.a(42);
                                    }
                                    p2Var2.e(v2VarArr[3], iArr[i10], 0.0f);
                                    p2Var2.c(-31.0f, 31.0f);
                                    i10++;
                                }
                            }
                            p2Var2.d(false);
                            p2Var2.a(40);
                            p2Var2.d(true);
                            p2Var2.a(40);
                            i25 = iArr[i10];
                            i11 = 80;
                        }
                    }
                    i10 = 0;
                    v2Var = v2VarArr[1];
                    if (v2Var != null) {
                    }
                    v2Var2 = v2VarArr[2];
                    if (v2Var2 != null) {
                    }
                    v2Var3 = v2VarArr[3];
                    if (v2Var3 != null) {
                    }
                    p2Var2.d(false);
                    p2Var2.a(40);
                    p2Var2.d(true);
                    p2Var2.a(40);
                    i25 = iArr[i10];
                    i11 = 80;
                }
                arrayList15.add(new xh.o2(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new uu0(x2Var, i25, starGift, 12)));
                arrayList15.add(new xh.o2(4, 0.0f, 0.0f, i11, i25, -90, null, null));
                fy0 fy0Var = new fy0((Object) x2Var, (Object) starGift, (Object) arrayList14, (Object) runnable, 28);
                xh.q2 q2Var = p2Var2.a;
                p2Var2.d = fy0Var;
                p2Var2.e = false;
                p2Var2.c = 0;
                p2Var2.l = false;
                int size8 = arrayList15.size();
                int i26 = 0;
                while (i26 < size8) {
                    Object obj5 = arrayList15.get(i26);
                    i26++;
                    xh.o2 o2Var = (xh.o2) obj5;
                    int i27 = o2Var.e;
                    if (i27 >= 0 && i27 < 6) {
                        float f7 = o2Var.f;
                        if (f7 != 0.0f) {
                            q2Var.y[i27] = f7;
                        }
                    }
                }
                q2Var.H = p2Var2;
                p2Var2.b();
                break;
            case 22:
                xh.z7.z0((xh.z7) this.b, (v51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 23:
                xh.o7.Q((xh.o7) this.b, (v51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 24:
                xh.p7.Q((xh.p7) this.b, (v51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 25:
                zh.o1 o1Var = (zh.o1) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                zh.u uVar = o1Var.V;
                int i28 = o1Var.N;
                o1Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = o1Var.O;
                if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
                    if (groupcallstars != null) {
                        MessagesController.getInstance(i28).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i28).putChats(groupcallstars.chats, false);
                        int i29 = 0;
                        while (true) {
                            if (i29 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i29).my) {
                                    z10 = groupcallstars.top_donors.get(i29).stars > 0;
                                } else {
                                    i29++;
                                }
                            }
                        }
                        long j3 = groupcallstars.total_stars;
                        if (j3 == o1Var.Q && o1Var.S == z10) {
                            z11 = false;
                        }
                        o1Var.Q = j3;
                        o1Var.T = groupcallstars.top_donors;
                        o1Var.S = z10;
                        if (z11) {
                            o1Var.j();
                        }
                        o1Var.t();
                    }
                    if (o1Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(uVar);
                        AndroidUtilities.runOnUIThread(uVar, 5000L);
                        break;
                    }
                }
                break;
            default:
                zh.b8 b8Var = (zh.b8) this.b;
                ArrayList arrayList17 = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                zh.c8 c8Var = b8Var.a;
                if (vector != null) {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    for (int i30 = 0; i30 < vector.objects.size(); i30++) {
                        if (((Long) arrayList17.get(i30)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(c8Var.a).getUser((Long) arrayList17.get(i30));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i30);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList18.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat7 = MessagesController.getInstance(c8Var.a).getChat((Long) arrayList17.get(i30));
                            if (chat7 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i30);
                                chat7.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat7.flags2 |= 16;
                                } else {
                                    chat7.flags2 &= -17;
                                }
                                arrayList19.add(chat7);
                            }
                        }
                    }
                    MessagesStorage.getInstance(c8Var.a).putUsersAndChats(arrayList18, arrayList19, true, true);
                    NotificationCenter.getInstance(c8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    break;
                }
                break;
        }
    }
}
