package ih;

import ag.q0;
import ag.s2;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import k2.u;
import mg.w0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.is;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.messenger.xo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.y21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.a2;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.Wallet.h0;
import org.telegram.ui.Wallet.k0;
import org.telegram.ui.Wallet.l8;
import org.telegram.ui.Wallet.m8;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y;
import org.telegram.ui.a20;
import org.telegram.ui.a50;
import org.telegram.ui.d01;
import org.telegram.ui.fn;
import org.telegram.ui.hj0;
import org.telegram.ui.i70;
import org.telegram.ui.n6;
import org.telegram.ui.ox0;
import org.telegram.ui.q70;
import org.telegram.ui.rm0;
import org.telegram.ui.rt0;
import org.telegram.ui.ta0;
import org.telegram.ui.un;
import org.telegram.ui.v;
import org.telegram.ui.v90;
import org.telegram.ui.w;
import org.telegram.ui.zm0;
import ph.i2;
import rh.b3;
import rh.t2;
import rh.u2;
import rh.v2;
import rh.v5;
import rh.z2;
import vh.p2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:505:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0beb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    @Override // org.telegram.messenger.k20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i10;
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.User Z1;
        TLRPC.User Z12;
        TLRPC.Chat L0;
        TLRPC.Chat L02;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        TLRPC.EmojiStatus emojiStatus;
        JSONArray jSONArray;
        byte[] v;
        String str;
        JSONArray optJSONArray;
        int i11;
        z2 z2Var;
        z2 z2Var2;
        z2 z2Var3;
        int i12;
        String str2 = "";
        int i13 = 5;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                String str3 = (String) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i14 = tVar.a;
                if (webpagepreview != null) {
                    i10 = 0;
                    wp.r1(i14).V3(webpagepreview.users, false);
                    wp.r1(i14).P3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        webPage = messageMedia.webpage;
                        tVar.b.put(str3, webPage);
                        arrayList = (ArrayList) tVar.c.remove(str3);
                        if (arrayList == null) {
                            int size = arrayList.size();
                            int i15 = i10;
                            while (i15 < size) {
                                Object obj3 = arrayList.get(i15);
                                i15++;
                                ((k20) obj3).a(webPage, tL_error);
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    i10 = 0;
                }
                webPage = null;
                tVar.b.put(str3, webPage);
                arrayList = (ArrayList) tVar.c.remove(str3);
                if (arrayList == null) {
                }
            case 1:
                w0 w0Var = (w0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool = (Boolean) obj;
                String str4 = (String) obj2;
                w0Var.i2.a.setLoading(false);
                if (w0Var.getContext() == null) {
                    return;
                }
                k2 T = LaunchActivity.T();
                v90 v90Var = LaunchActivity.I1.x0;
                if (T == null) {
                    return;
                }
                if (!bool.booleanValue()) {
                    if (str4 != null) {
                        w0Var.dismiss();
                        cc.a0(T).Q(R.raw.error, 36, dd.a0(null, null, 2131743903, str4)).j();
                        return;
                    }
                    return;
                }
                w0Var.dismiss();
                un ma2 = un.ma(-w0Var.T1.id);
                T.presentFragment(ma2);
                T.whenFullyVisible(new u(27, ma2, tL_starsGiveawayOption));
                if (v90Var != null) {
                    v90Var.c(true);
                    return;
                }
                return;
            case 2:
                w wVar = (w) this.b;
                v vVar = (v) this.c;
                Boolean bool2 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool2.booleanValue()) {
                        wVar.a(Boolean.TRUE);
                    }
                    vVar.run();
                    return;
                }
                return;
            case 3:
                un.E1((un) this.b, (kj) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 4:
                un unVar = (un) this.b;
                n6 n6Var = (n6) this.c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                unVar.V5 = 0;
                if (webpagepreview2 != null) {
                    unVar.getMessagesController().V3(webpagepreview2.users, false);
                    unVar.getMessagesController().P3(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage != null) {
                            n6Var.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if (webPage2 == null || !"telegram_story".equals(webPage2.type)) {
                            n6Var.a(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i16 = 0; i16 < tL_messageMediaWebPage.webpage.attributes.size(); i16++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i16) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i16);
                                    if (tL_webPageAttributeStory != null) {
                                        n6Var.a(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        n6Var.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        unVar.getMessagesStorage().a.c(new q0((Object) unVar, (Object) tL_messageMediaWebPage, (Object) tL_webPageAttributeStory, (Object) n6Var, 29));
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
            case 5:
                fn fnVar = (fn) this.b;
                q1 q1Var = (q1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                un unVar2 = fnVar.a;
                if (tL_channels_channelParticipant != null) {
                    unVar2.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                    unVar2.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        fnVar.d(q1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                bi biVar = (bi) this.b;
                b1 b1Var = (b1) this.c;
                Long l4 = (Long) obj;
                ((Runnable) obj2).run();
                biVar.a2.setStarsPrice(l4.longValue());
                if (l4.longValue() > 0) {
                    b1Var.setText(dd.L0(2131747744, null));
                    b1Var.setSubtext(dd.G((int) l4.longValue(), "Stars", new Object[0]));
                    biVar.Y1.r(l4.longValue());
                    return;
                } else {
                    b1Var.setText(dd.L0(2131747746, null));
                    b1Var.setSubtext(null);
                    biVar.Y1.r(0L);
                    return;
                }
            case 7:
                jn jnVar = (jn) this.b;
                f fVar = (f) this.c;
                jnVar.getClass();
                jnVar.Y((jh.e) fVar, true);
                return;
            case 8:
                gs gsVar = (gs) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList2 = gsVar.U;
                ArrayList arrayList3 = gsVar.T;
                int i17 = gsVar.P;
                if (!TextUtils.equals(tL_contacts_search.q, gsVar.g0) || TextUtils.isEmpty(gsVar.g0)) {
                    return;
                }
                gsVar.c0 = false;
                if (tL_contacts_found2 != null) {
                    is.a0(i17).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    wp.r1(i17).V3(tL_contacts_found2.users, false);
                    wp.r1(i17).P3(tL_contacts_found2.chats, false);
                    tL_contacts_found = tL_contacts_found2;
                } else {
                    tL_contacts_found = null;
                }
                HashSet hashSet = new HashSet();
                arrayList3.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.my_results;
                    int size2 = arrayList4.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        TLRPC.Peer peer = arrayList4.get(i18);
                        i18++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (Z12 = wp.r1(i17).Z1(Long.valueOf(peer2.user_id))) != null && Z12.bot && !hashSet.contains(Long.valueOf(Z12.id))) {
                            hashSet.add(Long.valueOf(Z12.id));
                            arrayList3.add(Z12);
                        }
                    }
                }
                arrayList2.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.results;
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        TLRPC.Peer peer3 = arrayList5.get(i19);
                        i19++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (Z1 = wp.r1(i17).Z1(Long.valueOf(peer4.user_id))) != null && Z1.bot && !hashSet.contains(Long.valueOf(Z1.id))) {
                            hashSet.add(Long.valueOf(Z1.id));
                            arrayList2.add(Z1);
                        }
                    }
                }
                uk0 uk0Var = gsVar.d;
                if (uk0Var != null) {
                    uk0Var.v0(0);
                }
                gsVar.O(true);
                return;
            case 9:
                org.telegram.ui.Components.is isVar = (org.telegram.ui.Components.is) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList6 = isVar.U;
                ArrayList arrayList7 = isVar.T;
                ArrayList arrayList8 = isVar.S;
                int i20 = isVar.P;
                if (!TextUtils.equals(tL_contacts_search2.q, isVar.d0) || TextUtils.isEmpty(isVar.d0)) {
                    return;
                }
                isVar.Z = false;
                if (tL_contacts_found3 != null) {
                    is.a0(i20).m1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    wp.r1(i20).V3(tL_contacts_found3.users, false);
                    wp.r1(i20).P3(tL_contacts_found3.chats, false);
                } else {
                    tL_contacts_found3 = null;
                }
                HashSet hashSet2 = new HashSet();
                arrayList8.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList9 = tL_contacts_found3.my_results;
                    int size4 = arrayList9.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        TLRPC.Peer peer5 = arrayList9.get(i21);
                        i21++;
                        TLRPC.Peer peer6 = peer5;
                        if ((peer6 instanceof TLRPC.TL_peerChannel) && (L02 = wp.r1(i20).L0(Long.valueOf(peer6.channel_id))) != null && w3.V(L02) && !hashSet2.contains(Long.valueOf(L02.id))) {
                            hashSet2.add(Long.valueOf(L02.id));
                            arrayList8.add(L02);
                        }
                    }
                }
                arrayList7.clear();
                String lowerCase = isVar.d0.toLowerCase();
                String N3 = i0.N3(lowerCase);
                HashMap hashMap = wp.r1(i20).Z7;
                xo xoVar = hashMap == null ? null : (xo) hashMap.get(0L);
                if (xoVar != null) {
                    ArrayList arrayList10 = xoVar.b;
                    if (!arrayList10.isEmpty()) {
                        int size5 = arrayList10.size();
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj4 = arrayList10.get(i22);
                            i22++;
                            TLObject tLObject = (TLObject) obj4;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (w3.V(chat)) {
                                    TLRPC.Chat L03 = wp.r1(i20).L0(Long.valueOf(chat.id));
                                    if (w3.r0(chat) && (L03 == null || w3.r0(L03))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String N32 = i0.N3(lowerCase2);
                                        if (lowerCase2.startsWith(lowerCase) || sc.e.y(" ", lowerCase, lowerCase2) || N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                            if (!hashSet2.contains(Long.valueOf(chat.id))) {
                                                hashSet2.add(Long.valueOf(chat.id));
                                                arrayList7.add(chat);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList6.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found3.results;
                    int size6 = arrayList11.size();
                    int i23 = 0;
                    while (i23 < size6) {
                        TLRPC.Peer peer7 = arrayList11.get(i23);
                        i23++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (L0 = wp.r1(i20).L0(Long.valueOf(peer8.channel_id))) != null && w3.V(L0) && !hashSet2.contains(Long.valueOf(L0.id))) {
                            hashSet2.add(Long.valueOf(L0.id));
                            arrayList6.add(L0);
                        }
                    }
                }
                isVar.O(true);
                return;
            case 10:
                n31 n31Var = (n31) this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                y21 y21Var = n31Var.v1;
                m31 m31Var = n31Var.E1;
                n31Var.i1 = null;
                if (tL_error2 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                    n31Var.X0();
                    return;
                }
                if (tL_textWithEntities2 != null) {
                    n31Var.L1 = false;
                    TLRPC.TL_textWithEntities P0 = n31.P0(tL_textWithEntities, tL_textWithEntities2);
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                    kj.b(valueOf, P0.entities, false, true, false, false, 0);
                    n31Var.w1.setText(n31Var.Q0(valueOf));
                    m31Var.D(y21Var);
                    return;
                }
                if (n31Var.L1) {
                    n31Var.dismiss();
                    at.e().k(at.P4, 1, dd.L0(2131743971, null));
                    return;
                }
                m5.o(null, 2131743971, new cc((FrameLayout) n31Var.b, n31Var.I0), null);
                j31 j31Var = n31Var.t1.e;
                String str5 = n31Var.s1;
                n31Var.r1 = str5;
                j31Var.setText(n31.O0(str5, null, null));
                m31Var.D(y21Var);
                return;
            case 11:
                a50 a50Var = (a50) this.b;
                u3 u3Var = (u3) this.c;
                Boolean bool3 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                u3 u3Var2 = a50Var.R2;
                if (u3Var2 == null || (groupCall = u3Var2.b) == null) {
                    return;
                }
                String str6 = groupCall.invite_link;
                int size7 = hashSet3.size();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet4 = new HashSet();
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    a50Var.R2.a(longValue);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    inviteconferencecallparticipant.call = tL_inputGroupCall;
                    TLRPC.GroupCall groupCall2 = a50Var.R2.b;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    wp r12 = wp.r1(a50Var.a);
                    inviteconferencecallparticipant.user_id = r12.p1(r12.Z1(l10));
                    inviteconferencecallparticipant.video = bool3.booleanValue();
                    ConnectionsManager.getInstance(a50Var.a).sendRequest(inviteconferencecallparticipant, new a20(a50Var, longValue, hashSet4, atomicInteger, size7, u3Var, str6));
                }
                a50Var.Q0(true);
                if (!bool3.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
                    return;
                }
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                a50Var.Q1(true, true);
                return;
            case 12:
                ta0 ta0Var = (ta0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ta0Var.c();
                if (tL_error3 == null) {
                    hj0.b(ta0Var.d, ta0Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                    ta0.d().I(R.raw.error, dd.L0(2131753128, null), dd.L0(2131753129, null)).j();
                    return;
                } else {
                    ta0.d().f0(tL_error3, false);
                    return;
                }
            case 13:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.z2 z2Var4 = (org.telegram.ui.ActionBar.z2) this.c;
                zArr[0] = true;
                z2Var4.dismiss();
                return;
            case 14:
                ((gf.e) this.b).b();
                ((rm0) this.c).a((Boolean) obj);
                return;
            case 15:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                rt0 rt0Var = (rt0) this.c;
                Long l11 = (Long) obj;
                Integer num = (Integer) obj2;
                if (l11 == null) {
                    emojiStatus = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l11.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    emojiStatus = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().e5(emojiStatus, null);
                rt0Var.b(l11 == null ? 0L : l11.longValue(), true);
                return;
            case 16:
                String str7 = (String) this.c;
                r20 r20Var = (r20) this.b;
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
                            str2 = jSONArray.getJSONArray(0).getString(1);
                        } else if (jSONArray.get(0) instanceof JSONObject) {
                            str2 = jSONArray.getJSONObject(0).getString("value");
                        }
                    } catch (Exception e) {
                        k0.k("failed to get public key of " + str7, e);
                    }
                    if (str2.startsWith("0x")) {
                        v = Utilities.v(str2.substring(2));
                        r20Var.a(v);
                        return;
                    }
                }
                v = null;
                r20Var.a(v);
                return;
            case 17:
                k0 k0Var = (k0) this.b;
                l8 l8Var = (l8) this.c;
                h0 h0Var = (h0) obj;
                String str8 = (String) obj2;
                if (h0Var == null) {
                    k0.j("enable backup: didnt get secret phrase: ".concat(str8 == null ? "NULL_ERROR" : str8));
                    l8Var.a(str8 != null ? str8 : "NULL_ERROR");
                    return;
                }
                h0 b10 = h0Var.b();
                d01 d01Var = new d01(7, b10, l8Var);
                k0.H("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(k0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new a3.b(1), new org.telegram.ui.Wallet.q(k0Var, d01Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
                    return;
                } catch (Exception e7) {
                    k0.k("failed to get public key from secret phrase", e7);
                    d01Var.a(e7.getMessage() != null ? e7.getMessage() : "NULL_ERROR");
                    return;
                }
            case 18:
                k0 k0Var2 = (k0) this.b;
                m8 m8Var = (m8) this.c;
                h0 h0Var2 = (h0) obj;
                String str9 = (String) obj2;
                if (h0Var2 == null) {
                    k0.j("prepare disable backup, cant get secret phrase: ".concat(str9 == null ? "NULL_ERROR" : str9));
                    m8Var.a(null, str9 != null ? str9 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = k0Var2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                k0.H("prepare disable backup: preparing transfer");
                k0Var2.b.prepareRotateKey(h0Var2, null, new kt0(1, k0Var2, m8Var));
                return;
            case 19:
                boolean[] zArr2 = (boolean[]) this.b;
                qh.d dVar = (qh.d) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str10 = (String) obj2;
                if (zArr2[0]) {
                    return;
                }
                dVar.a(wallettransaction, str10);
                return;
            case 20:
                k0 k0Var3 = (k0) this.b;
                d01 d01Var2 = (d01) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (tL_error4 == null) {
                    k0.H("enable backup: server accepted request");
                    k0Var3.l0(walletState);
                    d01Var2.a(null);
                    return;
                }
                k0.j("enable backup: server rejected request code=" + tL_error4.code + " error=" + tL_error4.text);
                String str11 = tL_error4.text;
                d01Var2.a(str11 != null ? str11 : "NULL_ERROR");
                return;
            case 21:
                y yVar = (y) this.b;
                k20 k20Var = (k20) this.c;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                String str12 = (String) obj2;
                if (yVar.a) {
                    return;
                }
                k20Var.a(wallettransaction2, str12);
                return;
            case 22:
                String str13 = (String) this.c;
                s2 s2Var = (s2) this.b;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                    } catch (JSONException e10) {
                        f8.g(e10, true);
                    }
                    if (optJSONArray != null && optJSONArray.length() == 1) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                        if (str13.equals(jSONObject3.optString("domain"))) {
                            String optString = jSONObject3.optString("dns_wallet", "");
                            if (WalletEngine2.isValidAddress(optString)) {
                                str = optString;
                                s2Var.a(str);
                                return;
                            }
                        }
                    }
                }
                str = null;
                s2Var.a(str);
                return;
            case 23:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                q70 q70Var = (q70) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str14 = (String) obj2;
                if (str14 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                q70Var.a(str14);
                return;
            case 24:
                ((h0) this.b).close();
                ((i70) this.c).a((a2) obj, (String) obj2);
                return;
            case 25:
                ((h0) this.b).close();
                i0.g3(new org.telegram.ui.Wallet.g((s) this.c, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, i13));
                return;
            case 26:
                t8.g0((t8) this.b, (r20) this.c, (h0) obj, (String) obj2);
                return;
            case 27:
                ba baVar = (ba) this.b;
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.c;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    baVar.Z.setLoading(false);
                    return;
                } else {
                    mVar.a(walletuseraddress == null ? null : walletuseraddress.address);
                    return;
                }
            case 28:
                i2 i2Var = (i2) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                ArrayList arrayList13 = ((v5) this.c).l;
                int size8 = arrayList13.size();
                int i24 = 0;
                while (i24 < size8) {
                    Object obj5 = arrayList13.get(i24);
                    i24++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i25 = zm0.b;
                        b51 K = b51.K(zm0.class);
                        K.G = savedStarGift;
                        K.L(i2Var.i1 == savedStarGift.gift.id);
                        K.u = 1;
                        arrayList12.add(K);
                    }
                }
                return;
            default:
                b3 b3Var = (b3) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                z2[] z2VarArr = b3Var.n;
                p2 p2Var = b3Var.T;
                if (p2Var != null) {
                    p2Var.e(true);
                    b3Var.T = null;
                }
                b3Var.i0 = true;
                b3Var.j0 = starGift == null;
                b3Var.k0 = runnable;
                u2 u2Var = new u2(b3Var.h);
                ArrayList arrayList15 = u2Var.b;
                ArrayList arrayList16 = new ArrayList();
                for (int i26 = 0; i26 < z2VarArr.length; i26++) {
                    z2 z2Var5 = z2VarArr[i26];
                    if (z2Var5 != null) {
                        TL_stars.StarGift starGift2 = z2Var5.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList16.add(Integer.valueOf(i26));
                        }
                    }
                }
                int i27 = 4;
                if (arrayList16.size() == 1) {
                    u2Var.e(z2VarArr[((Integer) arrayList16.get(0)).intValue()], 5, 0.0f);
                    u2Var.d(false);
                    u2Var.c(26.0f, -26.0f);
                    u2Var.a(90);
                    u2Var.d(true);
                    u2Var.a(20);
                    i12 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    z2 z2Var6 = z2VarArr[0];
                    if (z2Var6 != null) {
                        TL_stars.StarGift starGift3 = z2Var6.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            u2Var.e(z2Var6, iArr[0], 0.0f);
                            u2Var.c(25.0f, -22.0f);
                            i11 = 1;
                            z2Var = z2VarArr[1];
                            if (z2Var != null) {
                                TL_stars.StarGift starGift4 = z2Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i11 > 0) {
                                        u2Var.a(42);
                                    }
                                    u2Var.e(z2VarArr[1], iArr[i11], 0.0f);
                                    u2Var.c(25.0f, 31.0f);
                                    i11++;
                                }
                            }
                            z2Var2 = z2VarArr[2];
                            if (z2Var2 != null) {
                                TL_stars.StarGift starGift5 = z2Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i11 > 0) {
                                        u2Var.a(42);
                                    }
                                    u2Var.e(z2VarArr[2], iArr[i11], 180.0f);
                                    u2Var.c(-36.0f, -36.0f);
                                    i11++;
                                }
                            }
                            z2Var3 = z2VarArr[3];
                            if (z2Var3 != null) {
                                TL_stars.StarGift starGift6 = z2Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i11 > 0) {
                                        u2Var.a(42);
                                    }
                                    u2Var.e(z2VarArr[3], iArr[i11], 0.0f);
                                    u2Var.c(-31.0f, 31.0f);
                                    i11++;
                                }
                            }
                            u2Var.d(false);
                            u2Var.a(40);
                            u2Var.d(true);
                            u2Var.a(40);
                            i27 = iArr[i11];
                            i12 = 80;
                        }
                    }
                    i11 = 0;
                    z2Var = z2VarArr[1];
                    if (z2Var != null) {
                    }
                    z2Var2 = z2VarArr[2];
                    if (z2Var2 != null) {
                    }
                    z2Var3 = z2VarArr[3];
                    if (z2Var3 != null) {
                    }
                    u2Var.d(false);
                    u2Var.a(40);
                    u2Var.d(true);
                    u2Var.a(40);
                    i27 = iArr[i11];
                    i12 = 80;
                }
                arrayList15.add(new t2(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new x0(b3Var, i27, starGift, 11)));
                arrayList15.add(new t2(4, 0.0f, 0.0f, i12, i27, -90, null, null));
                ox0 ox0Var = new ox0(b3Var, starGift, arrayList14, runnable, 21);
                v2 v2Var = u2Var.a;
                u2Var.d = ox0Var;
                u2Var.e = false;
                u2Var.c = 0;
                u2Var.l = false;
                int size9 = arrayList15.size();
                int i28 = 0;
                while (i28 < size9) {
                    Object obj6 = arrayList15.get(i28);
                    i28++;
                    t2 t2Var = (t2) obj6;
                    int i29 = t2Var.e;
                    if (i29 >= 0 && i29 < 6) {
                        float f7 = t2Var.f;
                        if (f7 != 0.0f) {
                            v2Var.D[i29] = f7;
                        }
                    }
                }
                v2Var.H = u2Var;
                u2Var.b();
                return;
        }
    }

    public /* synthetic */ s(String str, s2 s2Var) {
        this.a = 22;
        this.c = str;
        this.b = s2Var;
    }

    public /* synthetic */ s(k0 k0Var, String str, r20 r20Var) {
        this.a = 16;
        this.c = str;
        this.b = r20Var;
    }
}
