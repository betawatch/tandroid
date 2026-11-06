package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ro;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.messenger.yr;
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
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an;
import org.telegram.ui.bi0;
import org.telegram.ui.c40;
import org.telegram.ui.hs0;
import org.telegram.ui.il0;
import org.telegram.ui.lm;
import org.telegram.ui.p90;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p5(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        org.telegram.ui.Wallet.b0 b0Var = (org.telegram.ui.Wallet.b0) this.b;
        v10 v10Var = (v10) this.c;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        String str = (String) obj2;
        if (b0Var.a) {
            return;
        }
        v10Var.a(wallettransaction, str);
    }

    private final void c(Object obj, Object obj2) {
        String str = (String) this.b;
        fi.t3 t3Var = (fi.t3) this.c;
        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
        String str2 = null;
        if (((TLRPC.TL_error) obj2) == null && apiresponse != null && apiresponse.response != null) {
            try {
                JSONArray optJSONArray = new JSONObject(apiresponse.response.data).optJSONArray("records");
                if (optJSONArray != null && optJSONArray.length() == 1) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(0);
                    if (str.equals(jSONObject.optString("domain"))) {
                        String optString = jSONObject.optString("dns_wallet", "");
                        if (WalletEngine2.isValidAddress(optString)) {
                            str2 = optString;
                        }
                    }
                }
            } catch (JSONException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        t3Var.a(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:349:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0b70  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        boolean z9;
        int i7;
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        int i10;
        boolean z10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.User a22;
        TLRPC.User a23;
        TLRPC.Chat M0;
        int i11;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        TLRPC.EmojiStatus emojiStatus;
        JSONArray jSONArray;
        int i12 = this.a;
        int i13 = 2;
        byte[] bArr = null;
        int i14 = 1;
        int i15 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                d6 d6Var = (d6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                b6[] b6VarArr = d6Var.n;
                fi.m3 m3Var = d6Var.T;
                if (m3Var != null) {
                    z9 = true;
                    m3Var.f(true);
                    starGift = null;
                    d6Var.T = null;
                } else {
                    starGift = null;
                    z9 = true;
                }
                d6Var.i0 = z9;
                d6Var.j0 = starGift2 == null;
                d6Var.k0 = runnable;
                v5 v5Var = new v5(d6Var.h);
                ArrayList arrayList2 = new ArrayList();
                for (int i16 = 0; i16 < b6VarArr.length; i16++) {
                    b6 b6Var4 = b6VarArr[i16];
                    if (b6Var4 != null) {
                        TL_stars.StarGift starGift3 = b6Var4.h;
                        if (starGift3 == null) {
                            starGift3 = starGift;
                        }
                        if (starGift3 != null) {
                            arrayList2.add(Integer.valueOf(i16));
                        }
                    }
                }
                int i17 = 4;
                int i18 = 40;
                if (arrayList2.size() == 1) {
                    v5Var.e(b6VarArr[((Integer) arrayList2.get(0)).intValue()], 5, 0.0f);
                    v5Var.d(false);
                    v5Var.c(26.0f, -26.0f);
                    v5Var.a(90);
                    v5Var.d(true);
                    v5Var.a(20);
                    i10 = 1;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    b6 b6Var5 = b6VarArr[0];
                    if (b6Var5 != null) {
                        TL_stars.StarGift starGift4 = b6Var5.h;
                        if (starGift4 == null) {
                            starGift4 = null;
                        }
                        if (starGift4 != null) {
                            v5Var.e(b6Var5, iArr[0], 0.0f);
                            v5Var.c(25.0f, -22.0f);
                            i7 = 1;
                            b6Var = b6VarArr[1];
                            if (b6Var != null) {
                                TL_stars.StarGift starGift5 = b6Var.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i7 > 0) {
                                        v5Var.a(42);
                                    }
                                    v5Var.e(b6VarArr[1], iArr[i7], 0.0f);
                                    v5Var.c(25.0f, 31.0f);
                                    i7++;
                                }
                            }
                            b6Var2 = b6VarArr[2];
                            if (b6Var2 != null) {
                                TL_stars.StarGift starGift6 = b6Var2.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    if (i7 > 0) {
                                        v5Var.a(42);
                                    }
                                    v5Var.e(b6VarArr[2], iArr[i7], 180.0f);
                                    v5Var.c(-36.0f, -36.0f);
                                    i7++;
                                }
                            }
                            b6Var3 = b6VarArr[3];
                            if (b6Var3 != null) {
                                TL_stars.StarGift starGift7 = b6Var3.h;
                                if (starGift7 == null) {
                                    starGift7 = null;
                                }
                                if (starGift7 != null) {
                                    if (i7 > 0) {
                                        v5Var.a(42);
                                    }
                                    v5Var.e(b6VarArr[3], iArr[i7], 0.0f);
                                    v5Var.c(-31.0f, 31.0f);
                                    i7++;
                                }
                            }
                            v5Var.d(false);
                            v5Var.a(40);
                            i10 = 1;
                            v5Var.d(true);
                            v5Var.a(40);
                            i17 = iArr[i7];
                            i18 = 80;
                        }
                    }
                    i7 = 0;
                    b6Var = b6VarArr[1];
                    if (b6Var != null) {
                    }
                    b6Var2 = b6VarArr[2];
                    if (b6Var2 != null) {
                    }
                    b6Var3 = b6VarArr[3];
                    if (b6Var3 != null) {
                    }
                    v5Var.d(false);
                    v5Var.a(40);
                    i10 = 1;
                    v5Var.d(true);
                    v5Var.a(40);
                    i17 = iArr[i7];
                    i18 = 80;
                }
                int i19 = i18;
                u5 u5Var = new u5(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new ai.e0(d6Var, i17, starGift2, i10));
                ArrayList arrayList3 = v5Var.b;
                arrayList3.add(u5Var);
                arrayList3.add(new u5(4, 0.0f, 0.0f, i19, i17, -90, null, null));
                v5Var.d = new ai.d0(d6Var, starGift2, arrayList, runnable, 9);
                v5Var.e = false;
                v5Var.c = 0;
                v5Var.l = false;
                int size = arrayList3.size();
                int i20 = 0;
                while (true) {
                    w5 w5Var = v5Var.a;
                    if (i20 >= size) {
                        w5Var.H = v5Var;
                        v5Var.b();
                        return;
                    }
                    Object obj5 = arrayList3.get(i20);
                    i20++;
                    u5 u5Var2 = (u5) obj5;
                    int i21 = u5Var2.e;
                    if (i21 >= 0 && i21 < 6) {
                        float f10 = u5Var2.f;
                        if (f10 != 0.0f) {
                            w5Var.D[i21] = f10;
                        }
                    }
                }
                break;
            case 1:
                dd.D0((dd) obj4, (r31) obj3, (Boolean) obj, (String) obj2);
                return;
            case 2:
                tc tcVar = (tc) obj4;
                r31 r31Var = (r31) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                if (tcVar.getContext() == null) {
                    return;
                }
                if (bool.booleanValue()) {
                    new org.telegram.ui.Components.hc((FrameLayout) tcVar.b, tcVar.I0).I(R.raw.stars_topup, org.telegram.messenger.hd.M0(2131745160, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) r31Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                    tcVar.S1.c(true);
                    ea.y(tcVar.a, false).S(true);
                    return;
                } else {
                    if (str != null) {
                        new org.telegram.ui.Components.hc((FrameLayout) tcVar.b, tcVar.I0).Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str)).j();
                        return;
                    }
                    return;
                }
            case 3:
                uc ucVar = (uc) obj4;
                r31 r31Var2 = (r31) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                if (ucVar.getContext() == null) {
                    return;
                }
                ucVar.dismiss();
                ea.y(ucVar.a, false).S(true);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                if (!bool2.booleanValue()) {
                    if (str2 != null) {
                        org.telegram.ui.Components.hc.a0(T).Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str2)).j();
                        return;
                    }
                    return;
                } else {
                    org.telegram.ui.Components.hc.a0(T).I(R.raw.stars_topup, org.telegram.messenger.hd.M0(2131745160, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) r31Var2.B, "StarsAcquiredInfo", new Object[0]))).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.v0.c(true);
                        return;
                    }
                    return;
                }
            case 4:
                di.g2 g2Var = (di.g2) obj4;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) obj3;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                di.a0 a0Var = g2Var.V;
                int i22 = g2Var.N;
                g2Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = g2Var.O;
                if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
                    return;
                }
                if (groupcallstars != null) {
                    qp.s1(i22).Y3(groupcallstars.users, false);
                    qp.s1(i22).S3(groupcallstars.chats, false);
                    int i23 = 0;
                    while (true) {
                        if (i23 < groupcallstars.top_donors.size()) {
                            if (groupcallstars.top_donors.get(i23).my) {
                                z10 = groupcallstars.top_donors.get(i23).stars > 0;
                            } else {
                                i23++;
                            }
                        }
                    }
                    long j3 = groupcallstars.total_stars;
                    boolean z11 = (j3 == g2Var.Q && g2Var.S == z10) ? false : true;
                    g2Var.Q = j3;
                    g2Var.T = groupcallstars.top_donors;
                    g2Var.S = z10;
                    if (z11) {
                        g2Var.j();
                    }
                    g2Var.t();
                }
                if (g2Var.isAttachedToWindow()) {
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.i3(a0Var, 5000L);
                    return;
                }
                return;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i24 = ((di.w9) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (int i25 = 0; i25 < vector.objects.size(); i25++) {
                        if (((Long) arrayList4.get(i25)).longValue() > 0) {
                            TLRPC.User a24 = qp.s1(i24).a2((Long) arrayList4.get(i25));
                            if (a24 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i25);
                                a24.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    a24.flags2 |= 32;
                                } else {
                                    a24.flags2 &= -33;
                                }
                                arrayList5.add(a24);
                            }
                        } else {
                            TLRPC.Chat M02 = qp.s1(i24).M0((Long) arrayList4.get(i25));
                            if (M02 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i25);
                                M02.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    M02.flags2 |= 16;
                                } else {
                                    M02.flags2 &= -17;
                                }
                                arrayList6.add(M02);
                            }
                        }
                    }
                    yr.a0(i24).m1(arrayList5, arrayList6, true, true);
                    qs.f(i24).k(2, 0);
                    return;
                }
                return;
            case 6:
                fi.o5 o5Var = (fi.o5) obj4;
                tg.j jVar = (tg.j) obj3;
                o5Var.getClass();
                ((tg.n0) jVar).r(o5Var.o1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                o5Var.b0(jVar);
                return;
            case 7:
                ((x10) obj4).a((Boolean) obj, (androidx.biometric.u) obj2, (androidx.biometric.v) obj3);
                return;
            case 8:
                org.telegram.ui.y yVar = (org.telegram.ui.y) obj4;
                org.telegram.ui.x xVar = (org.telegram.ui.x) obj3;
                Boolean bool3 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool3.booleanValue()) {
                        yVar.a(Boolean.TRUE);
                    }
                    xVar.run();
                    return;
                }
                return;
            case 9:
                an.k1((an) obj4, (ij) obj3, (Long) obj, (Runnable) obj2);
                return;
            case 10:
                an anVar = (an) obj4;
                org.telegram.ui.n6 n6Var = (org.telegram.ui.n6) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                anVar.V5 = 0;
                if (webpagepreview != null) {
                    anVar.getMessagesController().Y3(webpagepreview.users, false);
                    anVar.getMessagesController().S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            n6Var.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            n6Var.a(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i26 = 0; i26 < tL_messageMediaWebPage.webpage.attributes.size(); i26++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i26) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i26);
                                    if (tL_webPageAttributeStory != null) {
                                        n6Var.a(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        n6Var.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        anVar.getMessagesStorage().a.c(new org.telegram.ui.m6(anVar, tL_messageMediaWebPage, tL_webPageAttributeStory, n6Var, 9));
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
                lm lmVar = (lm) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                an anVar2 = lmVar.a;
                if (tL_channels_channelParticipant != null) {
                    anVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                    anVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        lmVar.c(q1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                di diVar = (di) obj4;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj3;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                diVar.a2.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    z0Var.setText(org.telegram.messenger.hd.M0(2131747727, null));
                    z0Var.setSubtext(org.telegram.messenger.hd.G((int) l10.longValue(), "Stars", new Object[0]));
                    diVar.Y1.r(l10.longValue());
                    return;
                } else {
                    z0Var.setText(org.telegram.messenger.hd.M0(2131747729, null));
                    z0Var.setSubtext(null);
                    diVar.Y1.r(0L);
                    return;
                }
            case 13:
                bn bnVar = (bn) obj4;
                bnVar.getClass();
                bnVar.a0((th.e) ((sh.c) obj3), true);
                return;
            case 14:
                vr vrVar = (vr) obj4;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList7 = vrVar.U;
                ArrayList arrayList8 = vrVar.T;
                int i27 = vrVar.P;
                if (!TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, vrVar.g0) || TextUtils.isEmpty(vrVar.g0)) {
                    return;
                }
                vrVar.c0 = false;
                if (tL_contacts_found2 != null) {
                    yr.a0(i27).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    qp.s1(i27).Y3(tL_contacts_found2.users, false);
                    qp.s1(i27).S3(tL_contacts_found2.chats, false);
                    tL_contacts_found = tL_contacts_found2;
                } else {
                    tL_contacts_found = null;
                }
                HashSet hashSet = new HashSet();
                arrayList8.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList9 = tL_contacts_found.my_results;
                    int size2 = arrayList9.size();
                    int i28 = 0;
                    while (i28 < size2) {
                        TLRPC.Peer peer = arrayList9.get(i28);
                        i28++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (a23 = qp.s1(i27).a2(Long.valueOf(peer2.user_id))) != null && a23.bot && !hashSet.contains(Long.valueOf(a23.id))) {
                            hashSet.add(Long.valueOf(a23.id));
                            arrayList8.add(a23);
                        }
                    }
                }
                arrayList7.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList10 = tL_contacts_found.results;
                    int size3 = arrayList10.size();
                    int i29 = 0;
                    while (i29 < size3) {
                        TLRPC.Peer peer3 = arrayList10.get(i29);
                        i29++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (a22 = qp.s1(i27).a2(Long.valueOf(peer4.user_id))) != null && a22.bot && !hashSet.contains(Long.valueOf(a22.id))) {
                            hashSet.add(Long.valueOf(a22.id));
                            arrayList7.add(a22);
                        }
                    }
                }
                pj0 pj0Var = vrVar.d;
                if (pj0Var != null) {
                    pj0Var.v0(0);
                }
                vrVar.O(true);
                return;
            case 15:
                xr xrVar = (xr) obj4;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList11 = xrVar.U;
                ArrayList arrayList12 = xrVar.T;
                ArrayList arrayList13 = xrVar.S;
                int i30 = xrVar.P;
                if (!TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, xrVar.d0) || TextUtils.isEmpty(xrVar.d0)) {
                    return;
                }
                xrVar.Z = false;
                if (tL_contacts_found3 != null) {
                    yr.a0(i30).m1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    qp.s1(i30).Y3(tL_contacts_found3.users, false);
                    qp.s1(i30).S3(tL_contacts_found3.chats, false);
                } else {
                    tL_contacts_found3 = null;
                }
                HashSet hashSet2 = new HashSet();
                arrayList13.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList14 = tL_contacts_found3.my_results;
                    int size4 = arrayList14.size();
                    int i31 = 0;
                    while (i31 < size4) {
                        TLRPC.Peer peer5 = arrayList14.get(i31);
                        i31++;
                        TLRPC.Peer peer6 = peer5;
                        if (peer6 instanceof TLRPC.TL_peerChannel) {
                            TLRPC.Chat M03 = qp.s1(i30).M0(Long.valueOf(peer6.channel_id));
                            if (M03 != null && org.telegram.messenger.t3.V(M03) && !hashSet2.contains(Long.valueOf(M03.id))) {
                                hashSet2.add(Long.valueOf(M03.id));
                                arrayList13.add(M03);
                            }
                        }
                    }
                }
                arrayList12.clear();
                String lowerCase = xrVar.d0.toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                HashMap hashMap = qp.s1(i30).Y7;
                ro roVar = hashMap == null ? null : (ro) hashMap.get(0L);
                if (roVar != null) {
                    ArrayList arrayList15 = roVar.b;
                    if (!arrayList15.isEmpty()) {
                        int size5 = arrayList15.size();
                        int i32 = 0;
                        while (i32 < size5) {
                            Object obj6 = arrayList15.get(i32);
                            i32++;
                            TLObject tLObject = (TLObject) obj6;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (org.telegram.messenger.t3.V(chat)) {
                                    i11 = size5;
                                    TLRPC.Chat M04 = qp.s1(i30).M0(Long.valueOf(chat.id));
                                    if (org.telegram.messenger.t3.r0(chat) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || jg.g.A(" ", lowerCase, lowerCase2) || O32.startsWith(O3) || O32.contains(" ".concat(O3))) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                            hashSet2.add(Long.valueOf(chat.id));
                                            arrayList12.add(chat);
                                        }
                                    }
                                }
                            } else {
                                i11 = size5;
                            }
                            size5 = i11;
                        }
                    }
                }
                arrayList11.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found3.results;
                    int size6 = arrayList16.size();
                    int i33 = 0;
                    while (i33 < size6) {
                        TLRPC.Peer peer7 = arrayList16.get(i33);
                        i33++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (M0 = qp.s1(i30).M0(Long.valueOf(peer8.channel_id))) != null && org.telegram.messenger.t3.V(M0) && !hashSet2.contains(Long.valueOf(M0.id))) {
                            hashSet2.add(Long.valueOf(M0.id));
                            arrayList11.add(M0);
                        }
                    }
                }
                xrVar.O(true);
                return;
            case 16:
                e21 e21Var = (e21) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p11 p11Var = e21Var.v1;
                d21 d21Var = e21Var.E1;
                e21Var.i1 = null;
                if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
                    e21Var.X0();
                    return;
                }
                if (tL_textWithEntities2 != null) {
                    e21Var.L1 = false;
                    TLRPC.TL_textWithEntities P0 = e21.P0(tL_textWithEntities, tL_textWithEntities2);
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                    ij.b(valueOf, P0.entities, false, true, false, false, 0);
                    e21Var.w1.setText(e21Var.Q0(valueOf));
                    d21Var.D(p11Var);
                    return;
                }
                if (e21Var.L1) {
                    e21Var.dismiss();
                    qs.e().k(qs.P4, 1, org.telegram.messenger.hd.M0(2131743947, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743947, new org.telegram.ui.Components.hc((FrameLayout) e21Var.b, e21Var.I0), null);
                a21 a21Var = e21Var.t1.e;
                String str3 = e21Var.s1;
                e21Var.r1 = str3;
                a21Var.setText(e21.O0(str3, null, null));
                d21Var.D(p11Var);
                return;
            case 17:
                c40 c40Var = (c40) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj3;
                Boolean bool4 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                org.telegram.messenger.r3 r3Var2 = c40Var.R2;
                if (r3Var2 == null || (groupCall = r3Var2.b) == null) {
                    return;
                }
                String str4 = groupCall.invite_link;
                int size7 = hashSet3.size();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet4 = new HashSet();
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    Long l11 = (Long) it.next();
                    long longValue = l11.longValue();
                    c40Var.R2.a(longValue);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    inviteconferencecallparticipant.call = tL_inputGroupCall;
                    TLRPC.GroupCall groupCall2 = c40Var.R2.b;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    qp s12 = qp.s1(c40Var.a);
                    inviteconferencecallparticipant.user_id = s12.q1(s12.a2(l11));
                    inviteconferencecallparticipant.video = bool4.booleanValue();
                    String str5 = str4;
                    ConnectionsManager.getInstance(c40Var.a).sendRequest(inviteconferencecallparticipant, new hi.w0(c40Var, longValue, hashSet4, atomicInteger, size7, r3Var, str5));
                    str4 = str5;
                }
                c40Var.Q0(true);
                if (!bool4.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
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
                c40Var.T1(true, true);
                return;
            case 18:
                p90 p90Var = (p90) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                p90Var.c();
                if (tL_error2 == null) {
                    bi0.b(p90Var.d, p90Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                    p90.d().I(R.raw.error, org.telegram.messenger.hd.M0(2131753128, null), org.telegram.messenger.hd.M0(2131753129, null)).j();
                    return;
                } else {
                    p90.d().f0(tL_error2, false);
                    return;
                }
            case 19:
                ((boolean[]) obj4)[0] = true;
                ((org.telegram.ui.ActionBar.v2) obj3).dismiss();
                return;
            case 20:
                ((vf.b) obj4).b();
                ((il0) obj3).a((Boolean) obj);
                return;
            case 21:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj4;
                hs0 hs0Var = (hs0) obj3;
                Long l12 = (Long) obj;
                Integer num = (Integer) obj2;
                if (l12 == null) {
                    emojiStatus = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l12.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    emojiStatus = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().h5(emojiStatus, null);
                hs0Var.b(l12 == null ? 0L : l12.longValue(), true);
                return;
            case 22:
                String str6 = (String) obj4;
                c20 c20Var = (c20) obj3;
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
                        String string = jSONArray.get(0) instanceof JSONArray ? jSONArray.getJSONArray(0).getString(1) : jSONArray.get(0) instanceof JSONObject ? jSONArray.getJSONObject(0).getString("value") : "";
                        if (string.startsWith("0x")) {
                            bArr = Utilities.v(string.substring(2));
                        }
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.n0.k("failed to get public key of " + str6, e10);
                    }
                }
                c20Var.a(bArr);
                return;
            case 23:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj4;
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) obj3;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                String str7 = (String) obj2;
                if (k0Var == null) {
                    org.telegram.ui.Wallet.n0.j("enable backup: didnt get secret phrase: ".concat(str7 == null ? "NULL_ERROR" : str7));
                    g8Var.a(str7 != null ? str7 : "NULL_ERROR");
                    return;
                }
                org.telegram.ui.Wallet.k0 b10 = k0Var.b();
                org.telegram.ui.Wallet.t tVar = new org.telegram.ui.Wallet.t(i15, b10, g8Var);
                org.telegram.ui.Wallet.n0.H("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(n0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new d3.b(i14), new org.telegram.ui.Wallet.r(n0Var, tVar, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
                    return;
                } catch (Exception e11) {
                    org.telegram.ui.Wallet.n0.k("failed to get public key from secret phrase", e11);
                    tVar.a(e11.getMessage() != null ? e11.getMessage() : "NULL_ERROR");
                    return;
                }
            case 24:
                org.telegram.ui.Wallet.n0 n0Var2 = (org.telegram.ui.Wallet.n0) obj4;
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) obj3;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj;
                String str8 = (String) obj2;
                if (k0Var2 == null) {
                    org.telegram.ui.Wallet.n0.j("prepare disable backup, cant get secret phrase: ".concat(str8 == null ? "NULL_ERROR" : str8));
                    h8Var.a(null, str8 != null ? str8 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = n0Var2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                org.telegram.ui.Wallet.n0.H("prepare disable backup: preparing transfer");
                n0Var2.b.prepareRotateKey(k0Var2, null, new di.b2(i13, n0Var2, h8Var));
                return;
            case 25:
                ai.e eVar = (ai.e) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (((boolean[]) obj4)[0]) {
                    return;
                }
                eVar.a(wallettransaction, str9);
                return;
            case 26:
                org.telegram.ui.Wallet.n0 n0Var3 = (org.telegram.ui.Wallet.n0) obj4;
                org.telegram.ui.Wallet.t tVar2 = (org.telegram.ui.Wallet.t) obj3;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null) {
                    org.telegram.ui.Wallet.n0.H("enable backup: server accepted request");
                    n0Var3.l0(walletState);
                    tVar2.a(null);
                    return;
                }
                org.telegram.ui.Wallet.n0.j("enable backup: server rejected request code=" + tL_error3.code + " error=" + tL_error3.text);
                String str10 = tL_error3.text;
                tVar2.a(str10 != null ? str10 : "NULL_ERROR");
                return;
            case 27:
                b(obj, obj2);
                return;
            case 28:
                c(obj, obj2);
                return;
            default:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj4;
                t60 t60Var = (t60) obj3;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str11 = (String) obj2;
                if (str11 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                t60Var.a(str11);
                return;
        }
    }

    public /* synthetic */ p5(org.telegram.ui.Wallet.n0 n0Var, String str, c20 c20Var) {
        this.a = 22;
        this.b = str;
        this.c = c20Var;
    }
}
