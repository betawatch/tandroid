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
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.aw0;
import org.telegram.ui.en;
import org.telegram.ui.ho0;
import org.telegram.ui.kb0;
import org.telegram.ui.ko;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.wk0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:364:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0b00  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i10;
        b6 b6Var;
        char c10;
        b6 b6Var2;
        b6 b6Var3;
        int i11;
        int i12;
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
        int i13 = 2;
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
        switch (this.a) {
            case 0:
                d6 d6Var = (d6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                b6[] b6VarArr = d6Var.n;
                ei.x3 x3Var = d6Var.T;
                if (x3Var != null) {
                    x3Var.e(true);
                    d6Var.T = null;
                }
                d6Var.i0 = true;
                d6Var.j0 = starGift == null;
                d6Var.k0 = runnable;
                v5 v5Var = new v5(d6Var.h);
                ArrayList arrayList2 = v5Var.b;
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < b6VarArr.length; i14++) {
                    b6 b6Var4 = b6VarArr[i14];
                    if (b6Var4 != null) {
                        TL_stars.StarGift starGift2 = b6Var4.h;
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
                    v5Var.e(b6VarArr[((Integer) arrayList3.get(0)).intValue()], 5, 0.0f);
                    v5Var.d(false);
                    v5Var.c(26.0f, -26.0f);
                    v5Var.a(90);
                    v5Var.d(true);
                    v5Var.a(20);
                    i11 = 1;
                    i12 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    b6 b6Var5 = b6VarArr[0];
                    if (b6Var5 != null) {
                        TL_stars.StarGift starGift3 = b6Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            v5Var.e(b6Var5, iArr[0], 0.0f);
                            v5Var.c(25.0f, -22.0f);
                            i10 = 1;
                            b6Var = b6VarArr[1];
                            if (b6Var != null) {
                                TL_stars.StarGift starGift4 = b6Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        v5Var.a(42);
                                    }
                                    c10 = 2;
                                    v5Var.e(b6VarArr[1], iArr[i10], 0.0f);
                                    v5Var.c(25.0f, 31.0f);
                                    i10++;
                                    b6Var2 = b6VarArr[c10];
                                    if (b6Var2 != null) {
                                        TL_stars.StarGift starGift5 = b6Var2.h;
                                        if (starGift5 == null) {
                                            starGift5 = null;
                                        }
                                        if (starGift5 != null) {
                                            if (i10 > 0) {
                                                v5Var.a(42);
                                            }
                                            v5Var.e(b6VarArr[c10], iArr[i10], 180.0f);
                                            v5Var.c(-36.0f, -36.0f);
                                            i10++;
                                        }
                                    }
                                    b6Var3 = b6VarArr[3];
                                    if (b6Var3 != null) {
                                        TL_stars.StarGift starGift6 = b6Var3.h;
                                        if ((starGift6 != null ? starGift6 : null) != null) {
                                            if (i10 > 0) {
                                                v5Var.a(42);
                                            }
                                            v5Var.e(b6VarArr[3], iArr[i10], 0.0f);
                                            v5Var.c(-31.0f, 31.0f);
                                            i10++;
                                        }
                                    }
                                    v5Var.d(false);
                                    v5Var.a(40);
                                    i11 = 1;
                                    v5Var.d(true);
                                    v5Var.a(40);
                                    i15 = iArr[i10];
                                    i12 = 80;
                                }
                            }
                            c10 = 2;
                            b6Var2 = b6VarArr[c10];
                            if (b6Var2 != null) {
                            }
                            b6Var3 = b6VarArr[3];
                            if (b6Var3 != null) {
                            }
                            v5Var.d(false);
                            v5Var.a(40);
                            i11 = 1;
                            v5Var.d(true);
                            v5Var.a(40);
                            i15 = iArr[i10];
                            i12 = 80;
                        }
                    }
                    i10 = 0;
                    b6Var = b6VarArr[1];
                    if (b6Var != null) {
                    }
                    c10 = 2;
                    b6Var2 = b6VarArr[c10];
                    if (b6Var2 != null) {
                    }
                    b6Var3 = b6VarArr[3];
                    if (b6Var3 != null) {
                    }
                    v5Var.d(false);
                    v5Var.a(40);
                    i11 = 1;
                    v5Var.d(true);
                    v5Var.a(40);
                    i15 = iArr[i10];
                    i12 = 80;
                }
                arrayList2.add(new u5(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new ah.o(d6Var, i15, starGift, i11)));
                arrayList2.add(new u5(4, 0.0f, 0.0f, i12, i15, -90, null, null));
                y0 y0Var = new y0(d6Var, starGift, arrayList, runnable, 5);
                w5 w5Var = v5Var.a;
                v5Var.d = y0Var;
                v5Var.e = false;
                v5Var.c = 0;
                v5Var.l = false;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj3 = arrayList2.get(i16);
                    i16++;
                    u5 u5Var = (u5) obj3;
                    int i17 = u5Var.e;
                    if (i17 >= 0 && i17 < 6) {
                        float f7 = u5Var.f;
                        if (f7 != 0.0f) {
                            w5Var.y[i17] = f7;
                        }
                    }
                }
                w5Var.H = v5Var;
                v5Var.b();
                return;
            case 1:
                ld.A0((ld) this.b, (f61) this.c, (Boolean) obj, (String) obj2);
                return;
            case 2:
                bd.R((bd) this.b, (f61) this.c, (Boolean) obj, (String) obj2);
                return;
            case 3:
                cd.R((cd) this.b, (f61) this.c, (Boolean) obj, (String) obj2);
                return;
            case 4:
                ci.n2 n2Var = (ci.n2) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                ci.b0 b0Var = n2Var.V;
                int i18 = n2Var.N;
                n2Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = n2Var.O;
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
                    boolean z11 = (j10 == n2Var.Q && n2Var.S == z10) ? false : true;
                    n2Var.Q = j10;
                    n2Var.T = groupcallstars.top_donors;
                    n2Var.S = z10;
                    if (z11) {
                        n2Var.j();
                    }
                    n2Var.t();
                }
                if (n2Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(b0Var);
                    AndroidUtilities.runOnUIThread(b0Var, 5000L);
                    return;
                }
                return;
            case 5:
                ci.ha haVar = (ci.ha) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                ci.ia iaVar = haVar.a;
                if (vector != null) {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (int i20 = 0; i20 < vector.objects.size(); i20++) {
                        if (((Long) arrayList4.get(i20)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(iaVar.a).getUser((Long) arrayList4.get(i20));
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
                            TLRPC.Chat chat3 = MessagesController.getInstance(iaVar.a).getChat((Long) arrayList4.get(i20));
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
                    MessagesStorage.getInstance(iaVar.a).putUsersAndChats(arrayList5, arrayList6, true, true);
                    NotificationCenter.getInstance(iaVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    return;
                }
                return;
            case 6:
                ei.f6 f6Var = (ei.f6) this.b;
                rg.j jVar = (rg.j) this.c;
                f6Var.getClass();
                ((rg.t0) jVar).r(f6Var.F1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                f6Var.d0(jVar);
                return;
            case 7:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.t) obj2, (androidx.biometric.u) this.c);
                return;
            case 8:
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
            case 9:
                sn.A0((sn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 10:
                sn snVar = (sn) this.b;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                snVar.F5 = 0;
                if (webpagepreview != null) {
                    snVar.getMessagesController().putUsers(webpagepreview.users, false);
                    snVar.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            p6Var.run(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            p6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i21 = 0; i21 < tL_messageMediaWebPage.webpage.attributes.size(); i21++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i21) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i21);
                                    if (tL_webPageAttributeStory != null) {
                                        p6Var.run(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        p6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        snVar.getMessagesStorage().getStorageQueue().postRunnable(new org.telegram.messenger.camera.i(snVar, tL_messageMediaWebPage, tL_webPageAttributeStory, p6Var, 14));
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
                en enVar = (en) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                sn snVar2 = enVar.a;
                if (tL_channels_channelParticipant != null) {
                    snVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    snVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        enVar.d(u1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ko koVar = (ko) this.b;
                View view = (View) this.c;
                koVar.F0 = ((Boolean) obj).booleanValue();
                koVar.H0 = ((Boolean) obj2).booleanValue();
                ci.k4 k4Var = koVar.e;
                int dp = AndroidUtilities.dp(koVar.F0 ? 16.0f : 32.0f);
                if (k4Var.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = k4Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(k4Var.getRoundRadius()[0], dp);
                    k4Var.x = ofInt;
                    ofInt.addUpdateListener(new ci.v4(k4Var, 7));
                    k4Var.x.setDuration(200L);
                    k4Var.x.start();
                }
                ((org.telegram.ui.Cells.q8) view).setChecked(koVar.F0);
                koVar.p0(false, true);
                if (koVar.N0) {
                    return;
                }
                TLRPC.Chat chat4 = koVar.x0;
                if (chat4.forum == koVar.F0 && chat4.forum_tabs == koVar.H0) {
                    return;
                }
                if (ChatObject.isChannel(chat4) || !koVar.F0) {
                    boolean z12 = koVar.x0.forum_tabs != koVar.H0;
                    koVar.getMessagesController().toggleChannelForum(koVar.w0, koVar.F0, koVar.H0);
                    TLRPC.Chat chat5 = koVar.x0;
                    chat5.forum = koVar.F0;
                    chat5.forum_tabs = koVar.H0;
                    if (z12) {
                        koVar.q0();
                        return;
                    }
                    return;
                }
                Context parentActivity = koVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
                koVar.N0 = true;
                b2Var.q(250L);
                koVar.getMessagesController().convertToMegaGroup(koVar.getParentActivity(), koVar.w0, koVar, new m4.y0(18, koVar, b2Var));
                return;
            case 13:
                ti tiVar = (ti) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                tiVar.j0.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    e1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    e1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l4.longValue(), new Object[0]));
                    tiVar.h0.s(l4.longValue());
                    return;
                } else {
                    e1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    e1Var.setSubtext(null);
                    tiVar.h0.s(0L);
                    return;
                }
            case 14:
                fo foVar = (fo) this.b;
                rh.e eVar = (rh.e) this.c;
                foVar.getClass();
                foVar.Y((sh.e) eVar, true);
                return;
            case 15:
                at atVar = (at) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList7 = atVar.S;
                ArrayList arrayList8 = atVar.R;
                int i22 = atVar.N;
                if (!TextUtils.equals(tL_contacts_search.q, atVar.e0) || TextUtils.isEmpty(atVar.e0)) {
                    return;
                }
                atVar.a0 = false;
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
                im0 im0Var = atVar.d;
                if (im0Var != null) {
                    im0Var.u0(0);
                }
                atVar.N(true);
                return;
            case 16:
                ct ctVar = (ct) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found5 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList11 = ctVar.S;
                ArrayList arrayList12 = ctVar.R;
                ArrayList arrayList13 = ctVar.Q;
                int i25 = ctVar.N;
                if (!TextUtils.equals(tL_contacts_search2.q, ctVar.b0) || TextUtils.isEmpty(ctVar.b0)) {
                    return;
                }
                ctVar.X = false;
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
                String lowerCase = ctVar.b0.toLowerCase();
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
                                    if ((lowerCase2.startsWith(lowerCase) || wh.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || wh.w(" ", translitSafe, translitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.id))) {
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
                ctVar.N(true);
                return;
            case 17:
                r41.n((r41) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
            case 18:
                s50.r((s50) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                return;
            case 19:
                kb0 kb0Var = (kb0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                kb0Var.c();
                if (tL_error == null) {
                    wk0.b(kb0Var.d, kb0Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    kb0.d().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                    return;
                } else {
                    kb0.d().f0(tL_error, false);
                    return;
                }
            case 20:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                zArr[0] = true;
                f3Var.dismiss();
                return;
            case 21:
                ((pf.c) this.b).b();
                ((ho0) this.c).run((Boolean) obj);
                return;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                aw0 aw0Var = (aw0) this.c;
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
                aw0Var.b(l10 == null ? 0L : l10.longValue(), true);
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
                        org.telegram.ui.Wallet.m0.j("failed to get public key of " + str3, e);
                    }
                }
                callback.run(hexToBytes);
                return;
            case 24:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.b;
                org.telegram.ui.Wallet.a8 a8Var = (org.telegram.ui.Wallet.a8) this.c;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj;
                String str4 = (String) obj2;
                if (j0Var == null) {
                    org.telegram.ui.Wallet.m0.i("enable backup: didnt get secret phrase: ".concat(str4 == null ? "NULL_ERROR" : str4));
                    a8Var.run(str4 != null ? str4 : "NULL_ERROR");
                    return;
                }
                org.telegram.ui.Wallet.j0 b10 = j0Var.b();
                qy qyVar = new qy(28, b10, a8Var);
                org.telegram.ui.Wallet.m0.F("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(m0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.q(m0Var, qyVar, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
                    return;
                } catch (Exception e7) {
                    org.telegram.ui.Wallet.m0.j("failed to get public key from secret phrase", e7);
                    qyVar.run(e7.getMessage() != null ? e7.getMessage() : "NULL_ERROR");
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.b;
                org.telegram.ui.Wallet.c8 c8Var = (org.telegram.ui.Wallet.c8) this.c;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) obj;
                String str5 = (String) obj2;
                if (j0Var2 == null) {
                    org.telegram.ui.Wallet.m0.i("prepare disable backup, cant get secret phrase: ".concat(str5 == null ? "NULL_ERROR" : str5));
                    c8Var.run(null, str5 != null ? str5 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = m0Var2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                org.telegram.ui.Wallet.m0.F("prepare disable backup: preparing transfer");
                m0Var2.b.prepareRotateKey(j0Var2, null, new ci.i2(i13, m0Var2, c8Var));
                return;
            case 26:
                org.telegram.ui.Wallet.m0 m0Var3 = (org.telegram.ui.Wallet.m0) this.b;
                qy qyVar2 = (qy) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null) {
                    org.telegram.ui.Wallet.m0.F("enable backup: server accepted request");
                    m0Var3.i0(walletState);
                    qyVar2.run(null);
                    return;
                }
                org.telegram.ui.Wallet.m0.i("enable backup: server rejected request code=" + tL_error2.code + " error=" + tL_error2.text);
                String str6 = tL_error2.text;
                qyVar2.run(str6 != null ? str6 : "NULL_ERROR");
                return;
            case 27:
                boolean[] zArr2 = (boolean[]) this.b;
                q qVar = (q) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str7 = (String) obj2;
                if (zArr2[0]) {
                    return;
                }
                qVar.run(wallettransaction, str7);
                return;
            case 28:
                org.telegram.ui.Wallet.a0 a0Var = (org.telegram.ui.Wallet.a0) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                String str8 = (String) obj2;
                if (a0Var.a) {
                    return;
                }
                callback2.run(wallettransaction2, str8);
                return;
            default:
                String str9 = (String) this.b;
                ei.e4 e4Var = (ei.e4) this.c;
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
                    } catch (JSONException e10) {
                        FileLog.e(e10);
                    }
                }
                e4Var.run(str2);
                return;
        }
    }

    public /* synthetic */ q5(org.telegram.ui.Wallet.m0 m0Var, String str, Utilities.Callback callback) {
        this.a = 23;
        this.b = str;
        this.c = callback;
    }
}
