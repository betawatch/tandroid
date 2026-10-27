package bi;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.fl0;
import org.telegram.ui.hn;
import org.telegram.ui.iw0;
import org.telegram.ui.ob0;
import org.telegram.ui.oo;
import org.telegram.ui.so0;
import org.telegram.ui.wn;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:364:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0afa  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i10;
        x5 x5Var;
        x5 x5Var2;
        x5 x5Var3;
        int i11;
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
        String str = "";
        int i12 = 2;
        TLRPC.TL_contacts_found tL_contacts_found2 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        String str2 = null;
        r8 = null;
        r8 = null;
        byte[] hexToBytes = null;
        TLRPC.TL_contacts_found tL_contacts_found3 = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                x5[] x5VarArr = z5Var.n;
                fi.v3 v3Var = z5Var.T;
                if (v3Var != null) {
                    v3Var.e(true);
                    z5Var.T = null;
                }
                z5Var.i0 = true;
                z5Var.j0 = starGift == null;
                z5Var.k0 = runnable;
                r5 r5Var = new r5(z5Var.h);
                ArrayList arrayList2 = r5Var.b;
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < x5VarArr.length; i14++) {
                    x5 x5Var4 = x5VarArr[i14];
                    if (x5Var4 != null) {
                        TL_stars.StarGift starGift2 = x5Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList3.add(Integer.valueOf(i14));
                        }
                    }
                }
                int i15 = 4;
                if (arrayList3.size() == 1) {
                    r5Var.e(x5VarArr[((Integer) arrayList3.get(0)).intValue()], 5, 0.0f);
                    r5Var.d(false);
                    r5Var.c(26.0f, -26.0f);
                    r5Var.a(90);
                    r5Var.d(true);
                    r5Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    x5 x5Var5 = x5VarArr[0];
                    if (x5Var5 != null) {
                        TL_stars.StarGift starGift3 = x5Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            r5Var.e(x5Var5, iArr[0], 0.0f);
                            r5Var.c(25.0f, -22.0f);
                            i10 = 1;
                            x5Var = x5VarArr[1];
                            if (x5Var != null) {
                                TL_stars.StarGift starGift4 = x5Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        r5Var.a(42);
                                    }
                                    r5Var.e(x5VarArr[1], iArr[i10], 0.0f);
                                    r5Var.c(25.0f, 31.0f);
                                    i10++;
                                }
                            }
                            x5Var2 = x5VarArr[2];
                            if (x5Var2 != null) {
                                TL_stars.StarGift starGift5 = x5Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i10 > 0) {
                                        r5Var.a(42);
                                    }
                                    r5Var.e(x5VarArr[2], iArr[i10], 180.0f);
                                    r5Var.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            x5Var3 = x5VarArr[3];
                            if (x5Var3 != null) {
                                TL_stars.StarGift starGift6 = x5Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i10 > 0) {
                                        r5Var.a(42);
                                    }
                                    r5Var.e(x5VarArr[3], iArr[i10], 0.0f);
                                    r5Var.c(-31.0f, 31.0f);
                                    i10++;
                                }
                            }
                            r5Var.d(false);
                            r5Var.a(40);
                            r5Var.d(true);
                            r5Var.a(40);
                            i15 = iArr[i10];
                            i11 = 80;
                        }
                    }
                    i10 = 0;
                    x5Var = x5VarArr[1];
                    if (x5Var != null) {
                    }
                    x5Var2 = x5VarArr[2];
                    if (x5Var2 != null) {
                    }
                    x5Var3 = x5VarArr[3];
                    if (x5Var3 != null) {
                    }
                    r5Var.d(false);
                    r5Var.a(40);
                    r5Var.d(true);
                    r5Var.a(40);
                    i15 = iArr[i10];
                    i11 = 80;
                }
                arrayList2.add(new q5(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new ai.h0(z5Var, i15, starGift, 2)));
                arrayList2.add(new q5(4, 0.0f, 0.0f, i11, i15, -90, null, null));
                ai.e0 e0Var = new ai.e0(z5Var, starGift, arrayList, runnable, 9);
                s5 s5Var = r5Var.a;
                r5Var.d = e0Var;
                r5Var.e = false;
                r5Var.c = 0;
                r5Var.l = false;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj3 = arrayList2.get(i16);
                    i16++;
                    q5 q5Var = (q5) obj3;
                    int i17 = q5Var.e;
                    if (i17 >= 0 && i17 < 6) {
                        float f7 = q5Var.f;
                        if (f7 != 0.0f) {
                            s5Var.y[i17] = f7;
                        }
                    }
                }
                s5Var.H = r5Var;
                r5Var.b();
                return;
            case 1:
                dd.z0((dd) this.b, (u61) this.c, (Boolean) obj, (String) obj2);
                return;
            case 2:
                tc.Q((tc) this.b, (u61) this.c, (Boolean) obj, (String) obj2);
                return;
            case 3:
                uc.Q((uc) this.b, (u61) this.c, (Boolean) obj, (String) obj2);
                return;
            case 4:
                di.m2 m2Var = (di.m2) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                di.b0 b0Var = m2Var.V;
                int i18 = m2Var.N;
                m2Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = m2Var.O;
                if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
                    return;
                }
                if (groupcallstars != null) {
                    MessagesController.getInstance(i18).putUsers(groupcallstars.users, false);
                    MessagesController.getInstance(i18).putChats(groupcallstars.chats, false);
                    int i19 = 0;
                    while (true) {
                        if (i19 < groupcallstars.top_donors.size()) {
                            if (groupcallstars.top_donors.get(i19).my) {
                                z10 = groupcallstars.top_donors.get(i19).stars > 0;
                            } else {
                                i19++;
                            }
                        }
                    }
                    long j10 = groupcallstars.total_stars;
                    boolean z11 = (j10 == m2Var.Q && m2Var.S == z10) ? false : true;
                    m2Var.Q = j10;
                    m2Var.T = groupcallstars.top_donors;
                    m2Var.S = z10;
                    if (z11) {
                        m2Var.j();
                    }
                    m2Var.t();
                }
                if (m2Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(b0Var);
                    AndroidUtilities.runOnUIThread(b0Var, 5000L);
                    return;
                }
                return;
            case 5:
                di.fa faVar = (di.fa) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                di.ga gaVar = faVar.a;
                if (vector != null) {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (int i20 = 0; i20 < vector.objects.size(); i20++) {
                        if (((Long) arrayList4.get(i20)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(gaVar.a).getUser((Long) arrayList4.get(i20));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i20);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList5.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(gaVar.a).getChat((Long) arrayList4.get(i20));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i20);
                                chat3.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat3.flags2 |= 16;
                                } else {
                                    chat3.flags2 &= -17;
                                }
                                arrayList6.add(chat3);
                            }
                        }
                    }
                    MessagesStorage.getInstance(gaVar.a).putUsersAndChats(arrayList5, arrayList6, true, true);
                    NotificationCenter.getInstance(gaVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    return;
                }
                return;
            case 6:
                fi.e6 e6Var = (fi.e6) this.b;
                sg.j jVar = (sg.j) this.c;
                e6Var.getClass();
                ((sg.t0) jVar).r(e6Var.u1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                e6Var.b0(jVar);
                return;
            case 7:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.s) obj2, (androidx.biometric.t) this.c);
                return;
            case 8:
                org.telegram.ui.y yVar = (org.telegram.ui.y) this.b;
                org.telegram.ui.x xVar = (org.telegram.ui.x) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        yVar.run(Boolean.TRUE);
                    }
                    xVar.run();
                    return;
                }
                return;
            case 9:
                wn.W0((wn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 10:
                wn wnVar = (wn) this.b;
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                wnVar.V5 = 0;
                if (webpagepreview != null) {
                    wnVar.getMessagesController().putUsers(webpagepreview.users, false);
                    wnVar.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            q6Var.run(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            q6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i21 = 0; i21 < tL_messageMediaWebPage.webpage.attributes.size(); i21++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i21) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i21);
                                    if (tL_webPageAttributeStory != null) {
                                        q6Var.run(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        q6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        wnVar.getMessagesStorage().getStorageQueue().postRunnable(new m4.v0(wnVar, tL_messageMediaWebPage, tL_webPageAttributeStory, q6Var, 17));
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
            case 11:
                hn hnVar = (hn) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                wn wnVar2 = hnVar.a;
                if (tL_channels_channelParticipant != null) {
                    wnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    wnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        hnVar.e(s1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                oo ooVar = (oo) this.b;
                View view = (View) this.c;
                ooVar.E0 = ((Boolean) obj).booleanValue();
                ooVar.G0 = ((Boolean) obj2).booleanValue();
                di.k4 k4Var = ooVar.e;
                int dp = AndroidUtilities.dp(ooVar.E0 ? 16.0f : 32.0f);
                if (k4Var.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = k4Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(k4Var.getRoundRadius()[0], dp);
                    k4Var.x = ofInt;
                    ofInt.addUpdateListener(new di.u4(k4Var, 7));
                    k4Var.x.setDuration(200L);
                    k4Var.x.start();
                }
                ((org.telegram.ui.Cells.v8) view).setChecked(ooVar.E0);
                ooVar.q0(false, true);
                if (ooVar.M0) {
                    return;
                }
                TLRPC.Chat chat4 = ooVar.w0;
                if (chat4.forum == ooVar.E0 && chat4.forum_tabs == ooVar.G0) {
                    return;
                }
                if (ChatObject.isChannel(chat4) || !ooVar.E0) {
                    boolean z12 = ooVar.w0.forum_tabs != ooVar.G0;
                    ooVar.getMessagesController().toggleChannelForum(ooVar.v0, ooVar.E0, ooVar.G0);
                    TLRPC.Chat chat5 = ooVar.w0;
                    chat5.forum = ooVar.E0;
                    chat5.forum_tabs = ooVar.G0;
                    if (z12) {
                        ooVar.r0();
                        return;
                    }
                    return;
                }
                Context parentActivity = ooVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(parentActivity, 3, null);
                ooVar.M0 = true;
                e2Var.r(250L);
                ooVar.getMessagesController().convertToMegaGroup(ooVar.getParentActivity(), ooVar.v0, ooVar, new m4.s0(22, ooVar, e2Var));
                return;
            case 13:
                ti tiVar = (ti) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                tiVar.j0.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    g1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l4.longValue(), new Object[0]));
                    tiVar.h0.r(l4.longValue());
                    return;
                } else {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    g1Var.setSubtext(null);
                    tiVar.h0.r(0L);
                    return;
                }
            case 14:
                go goVar = (go) this.b;
                sh.e eVar = (sh.e) this.c;
                goVar.getClass();
                goVar.Y((th.e) eVar, true);
                return;
            case 15:
                ct ctVar = (ct) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList7 = ctVar.U;
                ArrayList arrayList8 = ctVar.T;
                int i22 = ctVar.P;
                if (!TextUtils.equals(tL_contacts_search.q, ctVar.g0) || TextUtils.isEmpty(ctVar.g0)) {
                    return;
                }
                ctVar.c0 = false;
                if (tL_contacts_found4 != null) {
                    MessagesStorage.getInstance(i22).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                    MessagesController.getInstance(i22).putUsers(tL_contacts_found4.users, false);
                    MessagesController.getInstance(i22).putChats(tL_contacts_found4.chats, false);
                    tL_contacts_found2 = tL_contacts_found4;
                }
                HashSet hashSet = new HashSet();
                arrayList8.clear();
                if (tL_contacts_found2 != null) {
                    ArrayList<TLRPC.Peer> arrayList9 = tL_contacts_found2.my_results;
                    int size2 = arrayList9.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        TLRPC.Peer peer = arrayList9.get(i23);
                        i23++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i22).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                            hashSet.add(Long.valueOf(user2.id));
                            arrayList8.add(user2);
                        }
                    }
                }
                arrayList7.clear();
                if (tL_contacts_found2 != null) {
                    ArrayList<TLRPC.Peer> arrayList10 = tL_contacts_found2.results;
                    int size3 = arrayList10.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        TLRPC.Peer peer3 = arrayList10.get(i24);
                        i24++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i22).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                            hashSet.add(Long.valueOf(user.id));
                            arrayList7.add(user);
                        }
                    }
                }
                nm0 nm0Var = ctVar.d;
                if (nm0Var != null) {
                    nm0Var.v0(0);
                }
                ctVar.O(true);
                return;
            case 16:
                et etVar = (et) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found5 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList11 = etVar.U;
                ArrayList arrayList12 = etVar.T;
                ArrayList arrayList13 = etVar.S;
                int i25 = etVar.P;
                if (!TextUtils.equals(tL_contacts_search2.q, etVar.d0) || TextUtils.isEmpty(etVar.d0)) {
                    return;
                }
                etVar.Z = false;
                if (tL_contacts_found5 != null) {
                    MessagesStorage.getInstance(i25).putUsersAndChats(tL_contacts_found5.users, tL_contacts_found5.chats, true, true);
                    MessagesController.getInstance(i25).putUsers(tL_contacts_found5.users, false);
                    MessagesController.getInstance(i25).putChats(tL_contacts_found5.chats, false);
                    tL_contacts_found3 = tL_contacts_found5;
                }
                HashSet hashSet2 = new HashSet();
                arrayList13.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList14 = tL_contacts_found3.my_results;
                    int size4 = arrayList14.size();
                    int i26 = 0;
                    while (i26 < size4) {
                        TLRPC.Peer peer5 = arrayList14.get(i26);
                        i26++;
                        TLRPC.Peer peer6 = peer5;
                        if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i25).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            if (!hashSet2.contains(Long.valueOf(chat2.id))) {
                                hashSet2.add(Long.valueOf(chat2.id));
                                arrayList13.add(chat2);
                            }
                        }
                    }
                }
                arrayList12.clear();
                String lowerCase = etVar.d0.toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i25).getCachedChannelRecommendations(0L);
                if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                    ArrayList<TLObject> arrayList15 = cachedChannelRecommendations.chats;
                    int size5 = arrayList15.size();
                    int i27 = 0;
                    while (i27 < size5) {
                        TLObject tLObject = arrayList15.get(i27);
                        i27++;
                        TLObject tLObject2 = tLObject;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                            if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                tL_contacts_found = tL_contacts_found3;
                                TLRPC.Chat chat7 = MessagesController.getInstance(i25).getChat(Long.valueOf(chat6.id));
                                if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                    String lowerCase2 = chat6.title.toLowerCase();
                                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                    if ((lowerCase2.startsWith(lowerCase) || wh.u(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || wh.u(" ", translitSafe, translitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.id))) {
                                        hashSet2.add(Long.valueOf(chat6.id));
                                        arrayList12.add(chat6);
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
                arrayList11.clear();
                if (tL_contacts_found6 != null) {
                    ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found6.results;
                    int size6 = arrayList16.size();
                    int i28 = 0;
                    while (i28 < size6) {
                        TLRPC.Peer peer7 = arrayList16.get(i28);
                        i28++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i25).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                            hashSet2.add(Long.valueOf(chat.id));
                            arrayList11.add(chat);
                        }
                    }
                }
                etVar.O(true);
                return;
            case 17:
                g51.m((g51) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
            case 18:
                x50.q((x50) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                return;
            case 19:
                ob0 ob0Var = (ob0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ob0Var.c();
                if (tL_error == null) {
                    fl0.b(ob0Var.d, ob0Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    ob0.d().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                    return;
                } else {
                    ob0.d().g0(tL_error, false);
                    return;
                }
            case 20:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                zArr[0] = true;
                k3Var.dismiss();
                return;
            case 21:
                ((qf.c) this.b).b();
                ((so0) this.c).run((Boolean) obj);
                return;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                iw0 iw0Var = (iw0) this.c;
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
                iw0Var.b(l10 == null ? 0L : l10.longValue(), true);
                return;
            case 23:
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
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.l0.k("failed to get public key of " + str3, e);
                    }
                }
                callback.run(hexToBytes);
                return;
            case 24:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.x7 x7Var = (org.telegram.ui.Wallet.x7) this.c;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
                String str4 = (String) obj2;
                if (i0Var == null) {
                    org.telegram.ui.Wallet.l0.j("enable backup: didnt get secret phrase: ".concat(str4 == null ? "NULL_ERROR" : str4));
                    x7Var.run(str4 != null ? str4 : "NULL_ERROR");
                    return;
                }
                org.telegram.ui.Wallet.i0 b10 = i0Var.b();
                org.telegram.ui.Wallet.s sVar = new org.telegram.ui.Wallet.s(i13, b10, x7Var);
                org.telegram.ui.Wallet.l0.H("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(l0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.p(l0Var, sVar, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
                    return;
                } catch (Exception e10) {
                    org.telegram.ui.Wallet.l0.k("failed to get public key from secret phrase", e10);
                    sVar.run(e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.z7 z7Var = (org.telegram.ui.Wallet.z7) this.c;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) obj;
                String str5 = (String) obj2;
                if (i0Var2 == null) {
                    org.telegram.ui.Wallet.l0.j("prepare disable backup, cant get secret phrase: ".concat(str5 == null ? "NULL_ERROR" : str5));
                    z7Var.run(null, str5 != null ? str5 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = l0Var2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                org.telegram.ui.Wallet.l0.H("prepare disable backup: preparing transfer");
                l0Var2.b.prepareRotateKey(i0Var2, null, new di.h2(i12, l0Var2, z7Var));
                return;
            case 26:
                org.telegram.ui.Wallet.l0 l0Var3 = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null) {
                    org.telegram.ui.Wallet.l0.H("enable backup: server accepted request");
                    l0Var3.l0(walletState);
                    sVar2.run(null);
                    return;
                }
                org.telegram.ui.Wallet.l0.j("enable backup: server rejected request code=" + tL_error2.code + " error=" + tL_error2.text);
                String str6 = tL_error2.text;
                sVar2.run(str6 != null ? str6 : "NULL_ERROR");
                return;
            case 27:
                boolean[] zArr2 = (boolean[]) this.b;
                ai.e eVar2 = (ai.e) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str7 = (String) obj2;
                if (zArr2[0]) {
                    return;
                }
                eVar2.run(wallettransaction, str7);
                return;
            case 28:
                org.telegram.ui.Wallet.z zVar = (org.telegram.ui.Wallet.z) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                String str8 = (String) obj2;
                if (zVar.a) {
                    return;
                }
                callback2.run(wallettransaction2, str8);
                return;
            default:
                String str9 = (String) this.b;
                fi.c4 c4Var = (fi.c4) this.c;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                            if (str9.equals(jSONObject3.optString("domain"))) {
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
                c4Var.run(str2);
                return;
        }
    }

    public /* synthetic */ m5(org.telegram.ui.Wallet.l0 l0Var, String str, Utilities.Callback callback) {
        this.a = 23;
        this.b = str;
        this.c = callback;
    }
}
