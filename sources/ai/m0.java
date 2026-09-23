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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ac0;
import org.telegram.ui.bb0;
import org.telegram.ui.bp0;
import org.telegram.ui.cl0;
import org.telegram.ui.f60;
import org.telegram.ui.jn;
import org.telegram.ui.nw0;
import org.telegram.ui.so;
import org.telegram.ui.so0;
import org.telegram.ui.xn;
import org.telegram.ui.yl0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        yh.v2 v2Var;
        yh.v2 v2Var2;
        yh.v2 v2Var3;
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
                ci.q6 q6Var = (ci.q6) this.b;
                qg.j jVar = (qg.j) this.c;
                q6Var.getClass();
                ((qg.w0) jVar).r(q6Var.F1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                q6Var.d0(jVar);
                break;
            case 3:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.s) obj2, (androidx.biometric.t) this.c);
                break;
            case 4:
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
            case 5:
                xn.i0((xn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                break;
            case 6:
                xn xnVar = (xn) this.b;
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                xnVar.F5 = 0;
                if (webpagepreview != null) {
                    xnVar.getMessagesController().putUsers(webpagepreview.users, false);
                    xnVar.getMessagesController().putChats(webpagepreview.chats, false);
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
                                                xnVar.getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.m5((Object) xnVar, (Object) tL_messageMediaWebPage, (Object) tL_webPageAttributeStory, (Object) m6Var, 10));
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
                jn jnVar = (jn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                xn xnVar2 = jnVar.a;
                if (tL_channels_channelParticipant != null) {
                    xnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    xnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        jnVar.d(t1Var, channelParticipant);
                        break;
                    }
                }
                break;
            case 8:
                so soVar = (so) this.b;
                View view = (View) this.c;
                soVar.F0 = ((Boolean) obj).booleanValue();
                soVar.H0 = ((Boolean) obj2).booleanValue();
                y5 y5Var = soVar.e;
                int dp = AndroidUtilities.dp(soVar.F0 ? 16.0f : 32.0f);
                if (y5Var.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = y5Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(y5Var.getRoundRadius()[0], dp);
                    y5Var.x = ofInt;
                    ofInt.addUpdateListener(new k6(y5Var, 7));
                    y5Var.x.setDuration(200L);
                    y5Var.x.start();
                }
                ((org.telegram.ui.Cells.s8) view).setChecked(soVar.F0);
                soVar.p0(false, true);
                if (!soVar.N0) {
                    TLRPC.Chat chat4 = soVar.x0;
                    if (chat4.forum != soVar.F0 || chat4.forum_tabs != soVar.H0) {
                        if (ChatObject.isChannel(chat4) || !soVar.F0) {
                            boolean z12 = soVar.x0.forum_tabs != soVar.H0;
                            soVar.getMessagesController().toggleChannelForum(soVar.w0, soVar.F0, soVar.H0);
                            TLRPC.Chat chat5 = soVar.x0;
                            chat5.forum = soVar.F0;
                            chat5.forum_tabs = soVar.H0;
                            if (z12) {
                                soVar.q0();
                                break;
                            }
                        } else {
                            Context parentActivity = soVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.G1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
                                soVar.N0 = true;
                                b2Var.q(250L);
                                soVar.getMessagesController().convertToMegaGroup(soVar.getParentActivity(), soVar.w0, soVar, new org.telegram.ui.u(14, soVar, b2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                wi wiVar = (wi) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                wiVar.j0.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    f1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l4.longValue(), new Object[0]));
                    wiVar.h0.s(l4.longValue());
                    break;
                } else {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    f1Var.setSubtext(null);
                    wiVar.h0.s(0L);
                    break;
                }
            case 10:
                vn vnVar = (vn) this.b;
                qh.e eVar = (qh.e) this.c;
                vnVar.getClass();
                vnVar.V((rh.e) eVar, true);
                break;
            case 11:
                ss ssVar = (ss) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList5 = ssVar.S;
                ArrayList arrayList6 = ssVar.R;
                int i16 = ssVar.N;
                if (TextUtils.equals(tL_contacts_search.q, ssVar.e0) && !TextUtils.isEmpty(ssVar.e0)) {
                    ssVar.a0 = false;
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
                    ml0 ml0Var = ssVar.d;
                    if (ml0Var != null) {
                        ml0Var.u0(0);
                    }
                    ssVar.N(true);
                    break;
                }
                break;
            case 12:
                us usVar = (us) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = usVar.S;
                ArrayList arrayList10 = usVar.R;
                ArrayList arrayList11 = usVar.Q;
                int i19 = usVar.N;
                if (TextUtils.equals(tL_contacts_search2.q, usVar.b0) && !TextUtils.isEmpty(usVar.b0)) {
                    usVar.X = false;
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
                    String lowerCase = usVar.b0.toLowerCase();
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
                                        if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.z0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe2)) {
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
                    usVar.N(true);
                    break;
                }
                break;
            case 13:
                u31.m((u31) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 14:
                f60.q((f60) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                break;
            case 15:
                ac0 ac0Var = (ac0) this.b;
                String str = (String) this.c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ac0Var.a();
                if (passkeys != null) {
                    ac0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        ac0Var.o("addPasskeyRow");
                        break;
                    }
                }
                break;
            case 16:
                ac0 ac0Var2 = (ac0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ac0Var2.a();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        ac0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        ac0.b().d0(tL_error, false);
                        break;
                    }
                } else {
                    cl0.b(ac0Var2.d, ac0Var2.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
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
                ((so0) this.c).run((Boolean) obj);
                break;
            case 19:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                nw0 nw0Var = (nw0) this.c;
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
                nw0Var.b(l10 == null ? 0L : l10.longValue(), true);
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
                tg.b0 b0Var = (tg.b0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool2 = (Boolean) obj;
                String str3 = (String) obj2;
                b0Var.q0.a.setLoading(false);
                if (b0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    bb0 bb0Var = LaunchActivity.G1.x0;
                    if (U != null) {
                        if (bool2.booleanValue()) {
                            b0Var.dismiss();
                            xn R9 = xn.R9(-b0Var.b0.id);
                            U.presentFragment(R9);
                            U.whenFullyVisible(new p2.b(21, R9, tL_starsGiveawayOption));
                            if (bb0Var != null) {
                                bb0Var.c(true);
                                break;
                            }
                        } else if (str3 != null) {
                            b0Var.dismiss();
                            hg.c.s(R.string.UnknownErrorCode, new Object[]{str3}, xc.a0(U), R.raw.error, 36);
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
                        int i26 = bp0.a;
                        h51 J = h51.J(bp0.class);
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
                yh.v2[] v2VarArr = y2Var.n;
                ci.e4 e4Var = y2Var.T;
                if (e4Var != null) {
                    e4Var.e(true);
                    y2Var.T = null;
                }
                y2Var.i0 = true;
                y2Var.j0 = starGift == null;
                y2Var.k0 = runnable;
                yh.p2 p2Var = new yh.p2(y2Var.h);
                ArrayList arrayList18 = p2Var.b;
                ArrayList arrayList19 = new ArrayList();
                for (int i27 = 0; i27 < v2VarArr.length; i27++) {
                    yh.v2 v2Var4 = v2VarArr[i27];
                    if (v2Var4 != null) {
                        TL_stars.StarGift starGift2 = v2Var4.h;
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
                    p2Var.e(v2VarArr[((Integer) arrayList19.get(0)).intValue()], 5, 0.0f);
                    p2Var.d(false);
                    p2Var.c(26.0f, -26.0f);
                    p2Var.a(90);
                    p2Var.d(true);
                    p2Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    yh.v2 v2Var5 = v2VarArr[0];
                    if (v2Var5 != null) {
                        TL_stars.StarGift starGift3 = v2Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            p2Var.e(v2Var5, iArr[0], 0.0f);
                            p2Var.c(25.0f, -22.0f);
                            i10 = 1;
                            v2Var = v2VarArr[1];
                            if (v2Var != null) {
                                TL_stars.StarGift starGift4 = v2Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        p2Var.a(42);
                                    }
                                    p2Var.e(v2VarArr[1], iArr[i10], 0.0f);
                                    p2Var.c(25.0f, 31.0f);
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
                                        p2Var.a(42);
                                    }
                                    p2Var.e(v2VarArr[2], iArr[i10], 180.0f);
                                    p2Var.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            v2Var3 = v2VarArr[3];
                            if (v2Var3 != null) {
                                TL_stars.StarGift starGift6 = v2Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i10 > 0) {
                                        p2Var.a(42);
                                    }
                                    p2Var.e(v2VarArr[3], iArr[i10], 0.0f);
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
                    v2Var = v2VarArr[1];
                    if (v2Var != null) {
                    }
                    v2Var2 = v2VarArr[2];
                    if (v2Var2 != null) {
                    }
                    v2Var3 = v2VarArr[3];
                    if (v2Var3 != null) {
                    }
                    p2Var.d(false);
                    p2Var.a(40);
                    p2Var.d(true);
                    p2Var.a(40);
                    i28 = iArr[i10];
                    i11 = 80;
                }
                arrayList18.add(new yh.o2(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new yl0(y2Var, i28, starGift, 15)));
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
                yh.w7.z0((yh.w7) this.b, (h51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 25:
                yh.l7.Q((yh.l7) this.b, (h51) this.c, (Boolean) obj, (String) obj2);
                break;
            default:
                yh.m7.Q((yh.m7) this.b, (h51) this.c, (Boolean) obj, (String) obj2);
                break;
        }
    }
}
