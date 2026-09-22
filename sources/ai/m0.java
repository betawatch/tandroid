package ai;

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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fm0;
import org.telegram.ui.hc0;
import org.telegram.ui.i60;
import org.telegram.ui.ib0;
import org.telegram.ui.jp0;
import org.telegram.ui.ll0;
import org.telegram.ui.ln;
import org.telegram.ui.uo;
import org.telegram.ui.uw0;
import org.telegram.ui.zn;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

    /* JADX WARN: Removed duplicated region for block: B:132:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
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
        TLRPC.Chat chat2;
        TLRPC.EmojiStatus emojiStatus;
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        int i10;
        yh.w2 w2Var;
        yh.w2 w2Var2;
        yh.w2 w2Var3;
        int i11;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                r3 r3Var = (r3) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                o0 o0Var = r3Var.V;
                int i12 = r3Var.N;
                r3Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = r3Var.O;
                if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
                    if (groupcallstars != null) {
                        MessagesController.getInstance(i12).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i12).putChats(groupcallstars.chats, false);
                        int i13 = 0;
                        while (true) {
                            if (i13 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i13).my) {
                                    z10 = groupcallstars.top_donors.get(i13).stars > 0;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        long j3 = groupcallstars.total_stars;
                        if (j3 == r3Var.Q && r3Var.S == z10) {
                            z11 = false;
                        }
                        r3Var.Q = j3;
                        r3Var.T = groupcallstars.top_donors;
                        r3Var.S = z10;
                        if (z11) {
                            r3Var.j();
                        }
                        r3Var.t();
                    }
                    if (r3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(o0Var);
                        AndroidUtilities.runOnUIThread(o0Var, 5000L);
                        break;
                    }
                }
                break;
            case 1:
                qc qcVar = (qc) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                rc rcVar = qcVar.a;
                if (vector != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i14 = 0; i14 < vector.objects.size(); i14++) {
                        if (((Long) arrayList2.get(i14)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(rcVar.a).getUser((Long) arrayList2.get(i14));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i14);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList3.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(rcVar.a).getChat((Long) arrayList2.get(i14));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i14);
                                chat3.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat3.flags2 |= 16;
                                } else {
                                    chat3.flags2 &= -17;
                                }
                                arrayList4.add(chat3);
                            }
                        }
                    }
                    MessagesStorage.getInstance(rcVar.a).putUsersAndChats(arrayList3, arrayList4, true, true);
                    NotificationCenter.getInstance(rcVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    break;
                }
                break;
            case 2:
                ci.r6 r6Var = (ci.r6) this.b;
                qg.j jVar = (qg.j) this.c;
                r6Var.getClass();
                ((qg.u0) jVar).r(r6Var.F1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                r6Var.d0(jVar);
                break;
            case 3:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.s) obj2, (androidx.biometric.t) this.c);
                break;
            case 4:
                org.telegram.ui.y yVar = (org.telegram.ui.y) this.b;
                org.telegram.ui.x xVar = (org.telegram.ui.x) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        yVar.run(Boolean.TRUE);
                    }
                    xVar.run();
                    break;
                }
                break;
            case 5:
                zn.v1((zn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                break;
            case 6:
                zn znVar = (zn) this.b;
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                znVar.F5 = 0;
                if (webpagepreview != null) {
                    znVar.getMessagesController().putUsers(webpagepreview.users, false);
                    znVar.getMessagesController().putChats(webpagepreview.chats, false);
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
                                    for (int i15 = 0; i15 < tL_messageMediaWebPage.webpage.attributes.size(); i15++) {
                                        if (tL_messageMediaWebPage.webpage.attributes.get(i15) instanceof TLRPC.TL_webPageAttributeStory) {
                                            tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i15);
                                            if (tL_webPageAttributeStory != null) {
                                                m6Var.run(Boolean.FALSE, null);
                                                break;
                                            } else if (tL_webPageAttributeStory.storyItem != null) {
                                                m6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                                break;
                                            } else {
                                                znVar.getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.n5((Object) znVar, (Object) tL_messageMediaWebPage, (Object) tL_webPageAttributeStory, (Object) m6Var, 10));
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
                        lnVar.d(u1Var, channelParticipant);
                        break;
                    }
                }
                break;
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
                ((org.telegram.ui.Cells.s8) view).setChecked(uoVar.F0);
                uoVar.p0(false, true);
                if (!uoVar.N0) {
                    TLRPC.Chat chat4 = uoVar.x0;
                    if (chat4.forum != uoVar.F0 || chat4.forum_tabs != uoVar.H0) {
                        if (ChatObject.isChannel(chat4) || !uoVar.F0) {
                            boolean z12 = uoVar.x0.forum_tabs != uoVar.H0;
                            uoVar.getMessagesController().toggleChannelForum(uoVar.w0, uoVar.F0, uoVar.H0);
                            TLRPC.Chat chat5 = uoVar.x0;
                            chat5.forum = uoVar.F0;
                            chat5.forum_tabs = uoVar.H0;
                            if (z12) {
                                uoVar.q0();
                                break;
                            }
                        } else {
                            Context parentActivity = uoVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.G1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
                                uoVar.N0 = true;
                                b2Var.q(250L);
                                uoVar.getMessagesController().convertToMegaGroup(uoVar.getParentActivity(), uoVar.w0, uoVar, new org.telegram.ui.l4(13, uoVar, b2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                viVar.j0.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    f1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l4.longValue(), new Object[0]));
                    viVar.h0.s(l4.longValue());
                    break;
                } else {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    f1Var.setSubtext(null);
                    viVar.h0.s(0L);
                    break;
                }
            case 10:
                un unVar = (un) this.b;
                qh.e eVar = (qh.e) this.c;
                unVar.getClass();
                unVar.V((rh.e) eVar, true);
                break;
            case 11:
                rs rsVar = (rs) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList5 = rsVar.S;
                ArrayList arrayList6 = rsVar.R;
                int i16 = rsVar.N;
                if (TextUtils.equals(tL_contacts_search.q, rsVar.e0) && !TextUtils.isEmpty(rsVar.e0)) {
                    rsVar.a0 = false;
                    if (tL_contacts_found != null) {
                        MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(tL_contacts_found.users, false);
                        MessagesController.getInstance(i16).putChats(tL_contacts_found.chats, false);
                    } else {
                        tL_contacts_found = null;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList6.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList7 = tL_contacts_found.my_results;
                        int size = arrayList7.size();
                        int i17 = 0;
                        while (i17 < size) {
                            TLRPC.Peer peer = arrayList7.get(i17);
                            i17++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                                hashSet.add(Long.valueOf(user2.id));
                                arrayList6.add(user2);
                            }
                        }
                    }
                    arrayList5.clear();
                    if (tL_contacts_found != null) {
                        ArrayList<TLRPC.Peer> arrayList8 = tL_contacts_found.results;
                        int size2 = arrayList8.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TLRPC.Peer peer3 = arrayList8.get(i18);
                            i18++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i16).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                                hashSet.add(Long.valueOf(user.id));
                                arrayList5.add(user);
                            }
                        }
                    }
                    yl0 yl0Var = rsVar.d;
                    if (yl0Var != null) {
                        yl0Var.v0(0);
                    }
                    rsVar.N(true);
                    break;
                }
                break;
            case 12:
                ts tsVar = (ts) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = tsVar.S;
                ArrayList arrayList10 = tsVar.R;
                ArrayList arrayList11 = tsVar.Q;
                int i19 = tsVar.N;
                if (TextUtils.equals(tL_contacts_search2.q, tsVar.b0) && !TextUtils.isEmpty(tsVar.b0)) {
                    tsVar.X = false;
                    if (tL_contacts_found2 != null) {
                        MessagesStorage.getInstance(i19).putUsersAndChats(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        MessagesController.getInstance(i19).putUsers(tL_contacts_found2.users, false);
                        MessagesController.getInstance(i19).putChats(tL_contacts_found2.chats, false);
                    } else {
                        tL_contacts_found2 = null;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList11.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found2.my_results;
                        int size3 = arrayList12.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            TLRPC.Peer peer5 = arrayList12.get(i20);
                            i20++;
                            TLRPC.Peer peer6 = peer5;
                            if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i19).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2) && !hashSet2.contains(Long.valueOf(chat2.id))) {
                                hashSet2.add(Long.valueOf(chat2.id));
                                arrayList11.add(chat2);
                            }
                        }
                    }
                    arrayList10.clear();
                    String lowerCase = tsVar.b0.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i19).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList13 = cachedChannelRecommendations.chats;
                        int size4 = arrayList13.size();
                        int i21 = 0;
                        while (i21 < size4) {
                            TLObject tLObject = arrayList13.get(i21);
                            i21++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                    TLRPC.Chat chat7 = MessagesController.getInstance(i19).getChat(Long.valueOf(chat6.id));
                                    if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                        String lowerCase2 = chat6.title.toLowerCase();
                                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.l0.v(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                            if (!hashSet2.contains(Long.valueOf(chat6.id))) {
                                                hashSet2.add(Long.valueOf(chat6.id));
                                                arrayList10.add(chat6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList9.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList14 = tL_contacts_found2.results;
                        int size5 = arrayList14.size();
                        int i22 = 0;
                        while (i22 < size5) {
                            TLRPC.Peer peer7 = arrayList14.get(i22);
                            i22++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i19).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                hashSet2.add(Long.valueOf(chat.id));
                                arrayList9.add(chat);
                            }
                        }
                    }
                    tsVar.N(true);
                    break;
                }
                break;
            case 13:
                l41.m((l41) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 14:
                i60.q((i60) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                break;
            case 15:
                hc0 hc0Var = (hc0) this.b;
                String str = (String) this.c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                hc0Var.a();
                if (passkeys != null) {
                    hc0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        hc0Var.o("addPasskeyRow");
                        break;
                    }
                }
                break;
            case 16:
                hc0 hc0Var2 = (hc0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hc0Var2.a();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        hc0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        hc0.b().d0(tL_error, false);
                        break;
                    }
                } else {
                    ll0.b(hc0Var2.d, hc0Var2.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    break;
                }
            case 17:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                zArr[0] = true;
                f3Var.dismiss();
                break;
            case 18:
                ((nf.e) this.b).b();
                ((zo0) this.c).run((Boolean) obj);
                break;
            case 19:
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
                break;
            case 20:
                qh.r rVar = (qh.r) this.b;
                String str2 = (String) this.c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i23 = rVar.a;
                if (webpagepreview2 != null) {
                    MessagesController.getInstance(i23).putUsers(webpagepreview2.users, false);
                    MessagesController.getInstance(i23).putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 != null) {
                        webPage = messageMedia2.webpage;
                        rVar.b.put(str2, webPage);
                        arrayList = (ArrayList) rVar.c.remove(str2);
                        if (arrayList == null) {
                            int size6 = arrayList.size();
                            int i24 = 0;
                            while (i24 < size6) {
                                Object obj3 = arrayList.get(i24);
                                i24++;
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
            case 21:
                tg.a0 a0Var = (tg.a0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool2 = (Boolean) obj;
                String str3 = (String) obj2;
                a0Var.q0.a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    ib0 ib0Var = LaunchActivity.G1.x0;
                    if (U != null) {
                        if (bool2.booleanValue()) {
                            a0Var.dismiss();
                            zn R9 = zn.R9(-a0Var.b0.id);
                            U.presentFragment(R9);
                            U.whenFullyVisible(new org.telegram.ui.web.g1(27, R9, tL_starsGiveawayOption));
                            if (ib0Var != null) {
                                ib0Var.c(true);
                                break;
                            }
                        } else if (str3 != null) {
                            a0Var.dismiss();
                            hg.k0.q(R.string.UnknownErrorCode, new Object[]{str3}, xc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 22:
                xh.r2 r2Var = (xh.r2) this.b;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = ((yh.l5) this.c).l;
                int size7 = arrayList16.size();
                int i25 = 0;
                while (i25 < size7) {
                    Object obj4 = arrayList16.get(i25);
                    i25++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                    if (savedStarGift.pinned_to_top) {
                        int i26 = jp0.a;
                        y51 J = y51.J(jp0.class);
                        J.G = savedStarGift;
                        J.K(r2Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList15.add(J);
                    }
                }
                break;
            case 23:
                yh.y2 y2Var = (yh.y2) this.b;
                ArrayList arrayList17 = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                yh.w2[] w2VarArr = y2Var.n;
                ci.f4 f4Var = y2Var.T;
                if (f4Var != null) {
                    f4Var.e(true);
                    y2Var.T = null;
                }
                y2Var.i0 = true;
                y2Var.j0 = starGift == null;
                y2Var.k0 = runnable;
                yh.p2 p2Var = new yh.p2(y2Var.h);
                ArrayList arrayList18 = p2Var.b;
                ArrayList arrayList19 = new ArrayList();
                for (int i27 = 0; i27 < w2VarArr.length; i27++) {
                    yh.w2 w2Var4 = w2VarArr[i27];
                    if (w2Var4 != null) {
                        TL_stars.StarGift starGift2 = w2Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList19.add(Integer.valueOf(i27));
                        }
                    }
                }
                int i28 = 4;
                if (arrayList19.size() == 1) {
                    p2Var.e(w2VarArr[((Integer) arrayList19.get(0)).intValue()], 5, 0.0f);
                    p2Var.d(false);
                    p2Var.c(26.0f, -26.0f);
                    p2Var.a(90);
                    p2Var.d(true);
                    p2Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    yh.w2 w2Var5 = w2VarArr[0];
                    if (w2Var5 != null) {
                        TL_stars.StarGift starGift3 = w2Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            p2Var.e(w2Var5, iArr[0], 0.0f);
                            p2Var.c(25.0f, -22.0f);
                            i10 = 1;
                            w2Var = w2VarArr[1];
                            if (w2Var != null) {
                                TL_stars.StarGift starGift4 = w2Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        p2Var.a(42);
                                    }
                                    p2Var.e(w2VarArr[1], iArr[i10], 0.0f);
                                    p2Var.c(25.0f, 31.0f);
                                    i10++;
                                }
                            }
                            w2Var2 = w2VarArr[2];
                            if (w2Var2 != null) {
                                TL_stars.StarGift starGift5 = w2Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i10 > 0) {
                                        p2Var.a(42);
                                    }
                                    p2Var.e(w2VarArr[2], iArr[i10], 180.0f);
                                    p2Var.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            w2Var3 = w2VarArr[3];
                            if (w2Var3 != null) {
                                TL_stars.StarGift starGift6 = w2Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i10 > 0) {
                                        p2Var.a(42);
                                    }
                                    p2Var.e(w2VarArr[3], iArr[i10], 0.0f);
                                    p2Var.c(-31.0f, 31.0f);
                                    i10++;
                                }
                            }
                            p2Var.d(false);
                            p2Var.a(40);
                            p2Var.d(true);
                            p2Var.a(40);
                            i28 = iArr[i10];
                            i11 = 80;
                        }
                    }
                    i10 = 0;
                    w2Var = w2VarArr[1];
                    if (w2Var != null) {
                    }
                    w2Var2 = w2VarArr[2];
                    if (w2Var2 != null) {
                    }
                    w2Var3 = w2VarArr[3];
                    if (w2Var3 != null) {
                    }
                    p2Var.d(false);
                    p2Var.a(40);
                    p2Var.d(true);
                    p2Var.a(40);
                    i28 = iArr[i10];
                    i11 = 80;
                }
                arrayList18.add(new yh.o2(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new fm0(y2Var, i28, starGift, 15)));
                arrayList18.add(new yh.o2(4, 0.0f, 0.0f, i11, i28, -90, null, null));
                yh.k1 k1Var = new yh.k1(y2Var, starGift, arrayList17, runnable);
                yh.q2 q2Var = p2Var.a;
                p2Var.d = k1Var;
                p2Var.e = false;
                p2Var.c = 0;
                p2Var.l = false;
                int size8 = arrayList18.size();
                int i29 = 0;
                while (i29 < size8) {
                    Object obj5 = arrayList18.get(i29);
                    i29++;
                    yh.o2 o2Var = (yh.o2) obj5;
                    int i30 = o2Var.e;
                    if (i30 >= 0 && i30 < 6) {
                        float f7 = o2Var.f;
                        if (f7 != 0.0f) {
                            q2Var.y[i30] = f7;
                        }
                    }
                }
                q2Var.H = p2Var;
                p2Var.b();
                break;
            case 24:
                yh.w7.z0((yh.w7) this.b, (y51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 25:
                yh.l7.Q((yh.l7) this.b, (y51) this.c, (Boolean) obj, (String) obj2);
                break;
            default:
                yh.m7.Q((yh.m7) this.b, (y51) this.c, (Boolean) obj, (String) obj2);
                break;
        }
    }
}
