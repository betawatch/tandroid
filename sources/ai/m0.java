package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.messenger.jh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e90;
import org.telegram.ui.ec0;
import org.telegram.ui.ft;
import org.telegram.ui.g60;
import org.telegram.ui.ln;
import org.telegram.ui.ml0;
import org.telegram.ui.uo;
import org.telegram.ui.uw0;
import org.telegram.ui.xo0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:378:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x086e  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.Chat chat2;
        TLRPC.EmojiStatus emojiStatus;
        JSONArray jSONArray;
        int i10 = 2;
        String str = "";
        TLRPC.TL_contacts_found tL_contacts_found2 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        String str2 = null;
        r7 = null;
        r7 = null;
        byte[] hexToBytes = null;
        TLRPC.TL_contacts_found tL_contacts_found3 = null;
        switch (this.a) {
            case 0:
                s3 s3Var = (s3) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                o0 o0Var = s3Var.V;
                int i11 = s3Var.N;
                s3Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = s3Var.O;
                if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
                    return;
                }
                if (groupcallstars != null) {
                    MessagesController.getInstance(i11).putUsers(groupcallstars.users, false);
                    MessagesController.getInstance(i11).putChats(groupcallstars.chats, false);
                    int i12 = 0;
                    while (true) {
                        if (i12 < groupcallstars.top_donors.size()) {
                            if (!groupcallstars.top_donors.get(i12).my) {
                                i12++;
                            } else if (groupcallstars.top_donors.get(i12).stars > 0) {
                                z10 = true;
                            }
                        }
                    }
                    z10 = false;
                    long j3 = groupcallstars.total_stars;
                    boolean z11 = (j3 == s3Var.Q && s3Var.S == z10) ? false : true;
                    s3Var.Q = j3;
                    s3Var.T = groupcallstars.top_donors;
                    s3Var.S = z10;
                    if (z11) {
                        s3Var.j();
                    }
                    s3Var.t();
                }
                if (s3Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    AndroidUtilities.runOnUIThread(o0Var, 5000L);
                    return;
                }
                return;
            case 1:
                rc rcVar = (rc) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                sc scVar = rcVar.a;
                if (vector != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        if (((Long) arrayList.get(i13)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(scVar.a).getUser((Long) arrayList.get(i13));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i13);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList2.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(scVar.a).getChat((Long) arrayList.get(i13));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i13);
                                chat3.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat3.flags2 |= 16;
                                } else {
                                    chat3.flags2 &= -17;
                                }
                                arrayList3.add(chat3);
                            }
                        }
                    }
                    MessagesStorage.getInstance(scVar.a).putUsersAndChats(arrayList2, arrayList3, true, true);
                    NotificationCenter.getInstance(scVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    return;
                }
                return;
            case 2:
                ci.q6 q6Var = (ci.q6) this.b;
                qg.j jVar = (qg.j) this.c;
                q6Var.getClass();
                ((qg.t0) jVar).r(q6Var.F1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                q6Var.d0(jVar);
                return;
            case 3:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.s) obj2, (androidx.biometric.t) this.c);
                return;
            case 4:
                org.telegram.ui.z zVar = (org.telegram.ui.z) this.b;
                org.telegram.ui.y yVar = (org.telegram.ui.y) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        zVar.run(Boolean.TRUE);
                    }
                    yVar.run();
                    return;
                }
                return;
            case 5:
                zn.A0((zn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 6:
                zn znVar = (zn) this.b;
                org.telegram.ui.l6 l6Var = (org.telegram.ui.l6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                znVar.F5 = 0;
                if (webpagepreview != null) {
                    znVar.getMessagesController().putUsers(webpagepreview.users, false);
                    znVar.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            l6Var.run(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            l6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i14 = 0; i14 < tL_messageMediaWebPage.webpage.attributes.size(); i14++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i14);
                                    if (tL_webPageAttributeStory != null) {
                                        l6Var.run(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        l6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        znVar.getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.n5(znVar, tL_messageMediaWebPage, tL_webPageAttributeStory, l6Var, 11));
                                        return;
                                    }
                                }
                            }
                        }
                        tL_webPageAttributeStory = null;
                        if (tL_webPageAttributeStory != null) {
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage != null) {
                }
                break;
            case 7:
                ln lnVar = (ln) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                zn znVar2 = lnVar.a;
                if (tL_channels_channelParticipant != null) {
                    znVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    znVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        lnVar.c(u1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                uo uoVar = (uo) this.b;
                View view = (View) this.c;
                uoVar.F0 = ((Boolean) obj).booleanValue();
                uoVar.H0 = ((Boolean) obj2).booleanValue();
                z5 z5Var = uoVar.e;
                int dp = AndroidUtilities.dp(uoVar.F0 ? 16.0f : 32.0f);
                if (z5Var.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = z5Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(z5Var.getRoundRadius()[0], dp);
                    z5Var.x = ofInt;
                    ofInt.addUpdateListener(new l6(z5Var, 7));
                    z5Var.x.setDuration(200L);
                    z5Var.x.start();
                }
                ((org.telegram.ui.Cells.r8) view).setChecked(uoVar.F0);
                uoVar.p0(false, true);
                if (uoVar.N0) {
                    return;
                }
                TLRPC.Chat chat4 = uoVar.x0;
                if (chat4.forum == uoVar.F0 && chat4.forum_tabs == uoVar.H0) {
                    return;
                }
                if (ChatObject.isChannel(chat4) || !uoVar.F0) {
                    boolean z12 = uoVar.x0.forum_tabs != uoVar.H0;
                    uoVar.getMessagesController().toggleChannelForum(uoVar.w0, uoVar.F0, uoVar.H0);
                    TLRPC.Chat chat5 = uoVar.x0;
                    chat5.forum = uoVar.F0;
                    chat5.forum_tabs = uoVar.H0;
                    if (z12) {
                        uoVar.q0();
                        return;
                    }
                    return;
                }
                Context parentActivity = uoVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
                uoVar.N0 = true;
                b2Var.q(250L);
                uoVar.getMessagesController().convertToMegaGroup(uoVar.getParentActivity(), uoVar.w0, uoVar, new org.telegram.ui.o(15, uoVar, b2Var));
                return;
            case 9:
                yi yiVar = (yi) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                yiVar.j0.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    f1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l4.longValue(), new Object[0]));
                    yiVar.h0.s(l4.longValue());
                    return;
                } else {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    f1Var.setSubtext(null);
                    yiVar.h0.s(0L);
                    return;
                }
            case 10:
                lo loVar = (lo) this.b;
                qh.e eVar = (qh.e) this.c;
                loVar.getClass();
                loVar.Y((rh.e) eVar, true);
                return;
            case 11:
                ht htVar = (ht) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList4 = htVar.S;
                ArrayList arrayList5 = htVar.R;
                int i15 = htVar.N;
                if (!TextUtils.equals(tL_contacts_search.q, htVar.e0) || TextUtils.isEmpty(htVar.e0)) {
                    return;
                }
                htVar.a0 = false;
                if (tL_contacts_found4 != null) {
                    MessagesStorage.getInstance(i15).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                    MessagesController.getInstance(i15).putUsers(tL_contacts_found4.users, false);
                    MessagesController.getInstance(i15).putChats(tL_contacts_found4.chats, false);
                    tL_contacts_found2 = tL_contacts_found4;
                }
                HashSet hashSet = new HashSet();
                arrayList5.clear();
                if (tL_contacts_found2 != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found2.my_results;
                    int size = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.Peer peer = arrayList6.get(i16);
                        i16++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                            hashSet.add(Long.valueOf(user2.id));
                            arrayList5.add(user2);
                        }
                    }
                }
                arrayList4.clear();
                if (tL_contacts_found2 != null) {
                    ArrayList<TLRPC.Peer> arrayList7 = tL_contacts_found2.results;
                    int size2 = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        TLRPC.Peer peer3 = arrayList7.get(i17);
                        i17++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i15).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                            hashSet.add(Long.valueOf(user.id));
                            arrayList4.add(user);
                        }
                    }
                }
                qm0 qm0Var = htVar.d;
                if (qm0Var != null) {
                    qm0Var.u0(0);
                }
                htVar.N(true);
                return;
            case 12:
                kt ktVar = (kt) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found5 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList8 = ktVar.S;
                ArrayList arrayList9 = ktVar.R;
                ArrayList arrayList10 = ktVar.Q;
                int i18 = ktVar.N;
                if (!TextUtils.equals(tL_contacts_search2.q, ktVar.b0) || TextUtils.isEmpty(ktVar.b0)) {
                    return;
                }
                ktVar.X = false;
                if (tL_contacts_found5 != null) {
                    MessagesStorage.getInstance(i18).putUsersAndChats(tL_contacts_found5.users, tL_contacts_found5.chats, true, true);
                    MessagesController.getInstance(i18).putUsers(tL_contacts_found5.users, false);
                    MessagesController.getInstance(i18).putChats(tL_contacts_found5.chats, false);
                    tL_contacts_found3 = tL_contacts_found5;
                }
                HashSet hashSet2 = new HashSet();
                arrayList10.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found3.my_results;
                    int size3 = arrayList11.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        TLRPC.Peer peer5 = arrayList11.get(i19);
                        i19++;
                        TLRPC.Peer peer6 = peer5;
                        if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            if (!hashSet2.contains(Long.valueOf(chat2.id))) {
                                hashSet2.add(Long.valueOf(chat2.id));
                                arrayList10.add(chat2);
                            }
                        }
                    }
                }
                arrayList9.clear();
                String lowerCase = ktVar.b0.toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i18).getCachedChannelRecommendations(0L);
                if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                    ArrayList<TLObject> arrayList12 = cachedChannelRecommendations.chats;
                    int size4 = arrayList12.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        TLObject tLObject = arrayList12.get(i20);
                        i20++;
                        TLObject tLObject2 = tLObject;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                            if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                tL_contacts_found = tL_contacts_found3;
                                TLRPC.Chat chat7 = MessagesController.getInstance(i18).getChat(Long.valueOf(chat6.id));
                                if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                    String lowerCase2 = chat6.title.toLowerCase();
                                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                    if ((lowerCase2.startsWith(lowerCase) || bi.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || bi.w(" ", translitSafe, translitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.id))) {
                                        hashSet2.add(Long.valueOf(chat6.id));
                                        arrayList9.add(chat6);
                                    }
                                }
                            }
                        } else {
                            tL_contacts_found = tL_contacts_found3;
                        }
                        tL_contacts_found3 = tL_contacts_found;
                    }
                }
                TLRPC.TL_contacts_found tL_contacts_found6 = tL_contacts_found3;
                arrayList8.clear();
                if (tL_contacts_found6 != null) {
                    ArrayList<TLRPC.Peer> arrayList13 = tL_contacts_found6.results;
                    int size5 = arrayList13.size();
                    int i21 = 0;
                    while (i21 < size5) {
                        TLRPC.Peer peer7 = arrayList13.get(i21);
                        i21++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i18).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                            hashSet2.add(Long.valueOf(chat.id));
                            arrayList8.add(chat);
                        }
                    }
                }
                ktVar.N(true);
                return;
            case 13:
                b51.o((b51) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
            case 14:
                g60.s((g60) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                return;
            case 15:
                ec0 ec0Var = (ec0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ec0Var.c();
                if (tL_error == null) {
                    ml0.b(ec0Var.d, ec0Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    ec0.d().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                    return;
                } else {
                    ec0.d().f0(tL_error, false);
                    return;
                }
            case 16:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                zArr[0] = true;
                f3Var.dismiss();
                return;
            case 17:
                ((of.e) this.b).b();
                ((xo0) this.c).run((Boolean) obj);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                uw0 uw0Var = (uw0) this.c;
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
                uw0Var.b(l10 == null ? 0L : l10.longValue(), true);
                return;
            case 19:
                String str3 = (String) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(apiresponse.response.data);
                        if (jSONObject.has("stack")) {
                            jSONArray = jSONObject.getJSONArray("stack");
                            if (jSONObject.has("exit_code") && jSONObject.getInt("exit_code") != 0) {
                                throw new Exception("received exit code: " + jSONObject.getInt("exit_code"));
                            }
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                            if (jSONObject2.has("exit_code") && jSONObject2.getInt("exit_code") != 0) {
                                throw new Exception("received exit code: " + jSONObject2.getInt("exit_code"));
                            }
                            jSONArray = jSONObject2.getJSONArray("stack");
                        }
                        if (jSONArray.get(0) instanceof JSONArray) {
                            str = jSONArray.getJSONArray(0).getString(1);
                        } else if (jSONArray.get(0) instanceof JSONObject) {
                            str = jSONArray.getJSONObject(0).getString("value");
                        }
                        if (str.startsWith("0x")) {
                            hexToBytes = Utilities.hexToBytes(str.substring(2));
                        }
                    } catch (Exception e7) {
                        org.telegram.ui.Wallet.k0.j("failed to get public key of " + str3, e7);
                    }
                }
                callback.run(hexToBytes);
                return;
            case 20:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.b7 b7Var = (org.telegram.ui.Wallet.b7) this.c;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
                String str4 = (String) obj2;
                if (h0Var == null) {
                    org.telegram.ui.Wallet.k0.i("enable backup: didnt get secret phrase: ".concat(str4 == null ? "NULL_ERROR" : str4));
                    b7Var.run(str4 != null ? str4 : "NULL_ERROR");
                    return;
                }
                org.telegram.ui.Wallet.h0 b10 = h0Var.b();
                ft ftVar = new ft(22, b10, b7Var);
                org.telegram.ui.Wallet.k0.E("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(k0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.n(k0Var, ftVar, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
                    return;
                } catch (Exception e10) {
                    org.telegram.ui.Wallet.k0.j("failed to get public key from secret phrase", e10);
                    ftVar.run(e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
                    return;
                }
            case 21:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.d7 d7Var = (org.telegram.ui.Wallet.d7) this.c;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj;
                String str5 = (String) obj2;
                if (h0Var2 == null) {
                    org.telegram.ui.Wallet.k0.i("prepare disable backup, cant get secret phrase: ".concat(str5 == null ? "NULL_ERROR" : str5));
                    d7Var.run(null, str5 != null ? str5 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = k0Var2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                org.telegram.ui.Wallet.k0.E("prepare disable backup: preparing transfer");
                k0Var2.b.prepareRotateKey(h0Var2, null, new l3(i10, k0Var2, d7Var));
                return;
            case 22:
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.b;
                ft ftVar2 = (ft) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null) {
                    org.telegram.ui.Wallet.k0.E("enable backup: server accepted request");
                    k0Var3.g0(walletState);
                    ftVar2.run(null);
                    return;
                }
                org.telegram.ui.Wallet.k0.i("enable backup: server rejected request code=" + tL_error2.code + " error=" + tL_error2.text);
                String str6 = tL_error2.text;
                ftVar2.run(str6 != null ? str6 : "NULL_ERROR");
                return;
            case 23:
                org.telegram.ui.Wallet.y yVar2 = (org.telegram.ui.Wallet.y) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str7 = (String) obj2;
                if (yVar2.a) {
                    return;
                }
                callback2.run(wallettransaction, str7);
                return;
            case 24:
                String str8 = (String) this.b;
                ci.k4 k4Var = (ci.k4) this.c;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                            if (str8.equals(jSONObject3.optString("domain"))) {
                                String optString = jSONObject3.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    str2 = optString;
                                }
                            }
                        }
                    } catch (JSONException e11) {
                        FileLog.e(e11);
                    }
                }
                k4Var.run(str2);
                return;
            case 25:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                e90 e90Var = (e90) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str9 = (String) obj2;
                if (str9 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                e90Var.run(str9);
                return;
            case 26:
                ((org.telegram.ui.Wallet.h0) this.b).close();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.k(5, (m0) this.c, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2));
                return;
            case 27:
                ((org.telegram.ui.Wallet.h0) this.b).close();
                ((jh) this.c).run((org.telegram.ui.Wallet.z1) obj, (String) obj2);
                return;
            case 28:
                org.telegram.ui.Wallet.l7.b0((org.telegram.ui.Wallet.l7) this.b, (Utilities.Callback) this.c, (org.telegram.ui.Wallet.h0) obj, (String) obj2);
                return;
            default:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) this.b;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) this.c;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    s8Var.V.setLoading(false);
                    return;
                } else {
                    oVar.run(walletuseraddress != null ? walletuseraddress.address : null);
                    return;
                }
        }
    }

    public /* synthetic */ m0(org.telegram.ui.Wallet.k0 k0Var, String str, Utilities.Callback callback) {
        this.a = 19;
        this.b = str;
        this.c = callback;
    }
}
