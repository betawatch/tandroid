package ai;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import ci.e9;
import ci.mb;
import ci.nb;
import ci.v8;
import ci.wb;
import ei.y9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.io;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.f8;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.e51;
import org.telegram.ui.el0;
import org.telegram.ui.hm;
import org.telegram.ui.kl0;
import org.telegram.ui.m90;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
import org.telegram.ui.yh0;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q4(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
        f8 f8Var = (f8) this.c;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
        String str = (String) obj2;
        if (h0Var == null) {
            org.telegram.ui.Wallet.k0.j("enable backup: didnt get secret phrase: ".concat(str == null ? "NULL_ERROR" : str));
            if (str == null) {
                str = "NULL_ERROR";
            }
            f8Var.a(str);
            return;
        }
        org.telegram.ui.Wallet.h0 b10 = h0Var.b();
        e51 e51Var = new e51(3, b10, f8Var);
        org.telegram.ui.Wallet.k0.H("enable backup: got secret phrase");
        try {
            ConnectionsManager.getInstance(k0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new c3.b(1), new org.telegram.ui.Wallet.q(k0Var, e51Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
        } catch (Exception e10) {
            org.telegram.ui.Wallet.k0.k("failed to get public key from secret phrase", e10);
            e51Var.a(e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
        }
    }

    private final void c(Object obj, Object obj2) {
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
        g8 g8Var = (g8) this.c;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
        String str = (String) obj2;
        if (h0Var == null) {
            org.telegram.ui.Wallet.k0.j("prepare disable backup, cant get secret phrase: ".concat(str == null ? "NULL_ERROR" : str));
            if (str == null) {
                str = "NULL_ERROR";
            }
            g8Var.a(null, str);
            return;
        }
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = k0Var.f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
            TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
        }
        org.telegram.ui.Wallet.k0.H("prepare disable backup: preparing transfer");
        k0Var.b.prepareRotateKey(h0Var, null, new ei.f2(2, k0Var, g8Var));
    }

    private final void d(Object obj, Object obj2) {
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
        e51 e51Var = (e51) this.c;
        TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (tL_error == null) {
            org.telegram.ui.Wallet.k0.H("enable backup: server accepted request");
            k0Var.l0(walletState);
            e51Var.a(null);
            return;
        }
        org.telegram.ui.Wallet.k0.j("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
        String str = tL_error.text;
        if (str == null) {
            str = "NULL_ERROR";
        }
        e51Var.a(str);
    }

    private final void e(Object obj, Object obj2) {
        org.telegram.ui.Wallet.y yVar = (org.telegram.ui.Wallet.y) this.b;
        n10 n10Var = (n10) this.c;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        String str = (String) obj2;
        if (yVar.a) {
            return;
        }
        n10Var.a(wallettransaction, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0aca  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        boolean z10;
        int i3;
        ci.f5 f5Var;
        ci.f5 f5Var2;
        ci.f5 f5Var3;
        boolean z11;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.User a22;
        TLRPC.User a23;
        TLRPC.Chat M0;
        int i10;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        TLRPC.EmojiStatus emojiStatus;
        JSONArray jSONArray;
        int i11 = this.a;
        String str = "";
        byte[] bArr = null;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 0:
                t4 t4Var = (t4) obj4;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((v8) obj3).l;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i13 = kl0.b;
                        r31 K = r31.K(kl0.class);
                        K.G = savedStarGift;
                        K.L(t4Var.j1 == savedStarGift.gift.id);
                        K.u = 1;
                        arrayList.add(K);
                    }
                }
                return;
            case 1:
                ci.h5 h5Var = (ci.h5) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                ci.f5[] f5VarArr = h5Var.n;
                gi.l3 l3Var = h5Var.U;
                if (l3Var != null) {
                    z10 = true;
                    l3Var.f(true);
                    starGift = null;
                    h5Var.U = null;
                } else {
                    starGift = null;
                    z10 = true;
                }
                h5Var.j0 = z10;
                h5Var.k0 = starGift2 == null;
                h5Var.l0 = runnable;
                ci.a5 a5Var = new ci.a5(h5Var.h);
                ArrayList arrayList4 = new ArrayList();
                for (int i14 = 0; i14 < f5VarArr.length; i14++) {
                    ci.f5 f5Var4 = f5VarArr[i14];
                    if (f5Var4 != null) {
                        TL_stars.StarGift starGift3 = f5Var4.h;
                        if (starGift3 == null) {
                            starGift3 = starGift;
                        }
                        if (starGift3 != null) {
                            arrayList4.add(Integer.valueOf(i14));
                        }
                    }
                }
                int i15 = 4;
                int i16 = 40;
                if (arrayList4.size() == 1) {
                    a5Var.e(f5VarArr[((Integer) arrayList4.get(0)).intValue()], 5, 0.0f);
                    a5Var.d(false);
                    a5Var.c(26.0f, -26.0f);
                    a5Var.a(90);
                    a5Var.d(true);
                    a5Var.a(20);
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    ci.f5 f5Var5 = f5VarArr[0];
                    if (f5Var5 != null) {
                        TL_stars.StarGift starGift4 = f5Var5.h;
                        if (starGift4 == null) {
                            starGift4 = null;
                        }
                        if (starGift4 != null) {
                            a5Var.e(f5Var5, iArr[0], 0.0f);
                            a5Var.c(25.0f, -22.0f);
                            i3 = 1;
                            f5Var = f5VarArr[1];
                            if (f5Var != null) {
                                TL_stars.StarGift starGift5 = f5Var.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i3 > 0) {
                                        a5Var.a(42);
                                    }
                                    a5Var.e(f5VarArr[1], iArr[i3], 0.0f);
                                    a5Var.c(25.0f, 31.0f);
                                    i3++;
                                }
                            }
                            f5Var2 = f5VarArr[2];
                            if (f5Var2 != null) {
                                TL_stars.StarGift starGift6 = f5Var2.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    if (i3 > 0) {
                                        a5Var.a(42);
                                    }
                                    a5Var.e(f5VarArr[2], iArr[i3], 180.0f);
                                    a5Var.c(-36.0f, -36.0f);
                                    i3++;
                                }
                            }
                            f5Var3 = f5VarArr[3];
                            if (f5Var3 != null) {
                                TL_stars.StarGift starGift7 = f5Var3.h;
                                if (starGift7 == null) {
                                    starGift7 = null;
                                }
                                if (starGift7 != null) {
                                    if (i3 > 0) {
                                        a5Var.a(42);
                                    }
                                    a5Var.e(f5VarArr[3], iArr[i3], 0.0f);
                                    a5Var.c(-31.0f, 31.0f);
                                    i3++;
                                }
                            }
                            a5Var.d(false);
                            a5Var.a(40);
                            a5Var.d(true);
                            a5Var.a(40);
                            i15 = iArr[i3];
                            i16 = 80;
                        }
                    }
                    i3 = 0;
                    f5Var = f5VarArr[1];
                    if (f5Var != null) {
                    }
                    f5Var2 = f5VarArr[2];
                    if (f5Var2 != null) {
                    }
                    f5Var3 = f5VarArr[3];
                    if (f5Var3 != null) {
                    }
                    a5Var.d(false);
                    a5Var.a(40);
                    a5Var.d(true);
                    a5Var.a(40);
                    i15 = iArr[i3];
                    i16 = 80;
                }
                int i17 = i16;
                ci.z4 z4Var = new ci.z4(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new e3(h5Var, i15, starGift2, 2));
                ArrayList arrayList5 = a5Var.b;
                arrayList5.add(z4Var);
                arrayList5.add(new ci.z4(4, 0.0f, 0.0f, i17, i15, -90, null, null));
                a5Var.d = new z3(h5Var, starGift2, arrayList3, runnable, 11);
                a5Var.e = false;
                a5Var.c = 0;
                a5Var.l = false;
                int size2 = arrayList5.size();
                int i18 = 0;
                while (true) {
                    ci.b5 b5Var = a5Var.a;
                    if (i18 >= size2) {
                        b5Var.I = a5Var;
                        a5Var.b();
                        return;
                    }
                    Object obj6 = arrayList5.get(i18);
                    i18++;
                    ci.z4 z4Var2 = (ci.z4) obj6;
                    int i19 = z4Var2.e;
                    if (i19 >= 0 && i19 < 6) {
                        float f10 = z4Var2.f;
                        if (f10 != 0.0f) {
                            b5Var.E[i19] = f10;
                        }
                    }
                }
                break;
            case 2:
                wb.D0((wb) obj4, (r31) obj3, (Boolean) obj, (String) obj2);
                return;
            case 3:
                mb mbVar = (mb) obj4;
                r31 r31Var = (r31) obj3;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                if (mbVar.getContext() == null) {
                    return;
                }
                if (bool.booleanValue()) {
                    new fc((FrameLayout) mbVar.b, mbVar.J0).I(R.raw.stars_topup, bd.M0(2131745169, null), org.telegram.messenger.g0.X2(bd.G((int) r31Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                    mbVar.T1.c(true);
                    e9.y(mbVar.a, false).S(true);
                    return;
                } else {
                    if (str2 != null) {
                        new fc((FrameLayout) mbVar.b, mbVar.J0).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str2)).j();
                        return;
                    }
                    return;
                }
            case 4:
                nb nbVar = (nb) obj4;
                r31 r31Var2 = (r31) obj3;
                Boolean bool2 = (Boolean) obj;
                String str3 = (String) obj2;
                if (nbVar.getContext() == null) {
                    return;
                }
                nbVar.dismiss();
                e9.y(nbVar.a, false).S(true);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                if (!bool2.booleanValue()) {
                    if (str3 != null) {
                        fc.a0(T).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str3)).j();
                        return;
                    }
                    return;
                } else {
                    fc.a0(T).I(R.raw.stars_topup, bd.M0(2131745169, null), org.telegram.messenger.g0.X2(bd.G((int) r31Var2.B, "StarsAcquiredInfo", new Object[0]))).j();
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity != null) {
                        launchActivity.y0.c(true);
                        return;
                    }
                    return;
                }
            case 5:
                ei.k2 k2Var = (ei.k2) obj4;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) obj3;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                ei.c0 c0Var = k2Var.W;
                int i20 = k2Var.O;
                k2Var.V = false;
                TLRPC.InputGroupCall inputGroupCall = k2Var.P;
                if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
                    return;
                }
                if (groupcallstars != null) {
                    hp.s1(i20).Y3(groupcallstars.users, false);
                    hp.s1(i20).S3(groupcallstars.chats, false);
                    int i21 = 0;
                    while (true) {
                        if (i21 < groupcallstars.top_donors.size()) {
                            if (groupcallstars.top_donors.get(i21).my) {
                                z11 = groupcallstars.top_donors.get(i21).stars > 0;
                            } else {
                                i21++;
                            }
                        }
                    }
                    long j10 = groupcallstars.total_stars;
                    boolean z12 = (j10 == k2Var.R && k2Var.T == z11) ? false : true;
                    k2Var.R = j10;
                    k2Var.U = groupcallstars.top_donors;
                    k2Var.T = z11;
                    if (z12) {
                        k2Var.j();
                    }
                    k2Var.t();
                }
                if (k2Var.isAttachedToWindow()) {
                    org.telegram.messenger.g0.r(c0Var);
                    org.telegram.messenger.g0.i3(c0Var, 5000L);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList6 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i22 = ((y9) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < vector.objects.size(); i23++) {
                        if (((Long) arrayList6.get(i23)).longValue() > 0) {
                            TLRPC.User a24 = hp.s1(i22).a2((Long) arrayList6.get(i23));
                            if (a24 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i23);
                                a24.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    a24.flags2 |= 32;
                                } else {
                                    a24.flags2 &= -33;
                                }
                                arrayList7.add(a24);
                            }
                        } else {
                            TLRPC.Chat M02 = hp.s1(i22).M0((Long) arrayList6.get(i23));
                            if (M02 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i23);
                                M02.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    M02.flags2 |= 16;
                                } else {
                                    M02.flags2 &= -17;
                                }
                                arrayList8.add(M02);
                            }
                        }
                    }
                    qr.a0(i22).m1(arrayList7, arrayList8, true, true);
                    hs.f(i22).k(2, 0);
                    return;
                }
                return;
            case 7:
                gi.m5 m5Var = (gi.m5) obj4;
                ug.j jVar = (ug.j) obj3;
                m5Var.getClass();
                ((ug.m0) jVar).r(m5Var.p1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                m5Var.b0(jVar);
                return;
            case 8:
                ((p10) obj4).a((Boolean) obj, (androidx.biometric.u) obj2, (androidx.biometric.v) obj3);
                return;
            case 9:
                org.telegram.ui.z zVar = (org.telegram.ui.z) obj4;
                org.telegram.ui.y yVar = (org.telegram.ui.y) obj3;
                Boolean bool3 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool3.booleanValue()) {
                        zVar.a(Boolean.TRUE);
                    }
                    yVar.run();
                    return;
                }
                return;
            case 10:
                wm.k1((wm) obj4, (zi) obj3, (Long) obj, (Runnable) obj2);
                return;
            case 11:
                wm wmVar = (wm) obj4;
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                wmVar.W5 = 0;
                if (webpagepreview != null) {
                    wmVar.getMessagesController().Y3(webpagepreview.users, false);
                    wmVar.getMessagesController().S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            o6Var.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            o6Var.a(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i24 = 0; i24 < tL_messageMediaWebPage.webpage.attributes.size(); i24++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i24) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i24);
                                    if (tL_webPageAttributeStory != null) {
                                        o6Var.a(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        o6Var.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        wmVar.getMessagesStorage().a.c(new o4.b1(wmVar, tL_messageMediaWebPage, tL_webPageAttributeStory, o6Var, 15));
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
            case 12:
                hm hmVar = (hm) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                wm wmVar2 = hmVar.a;
                if (tL_channels_channelParticipant != null) {
                    wmVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                    wmVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        hmVar.e(q1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                bi biVar = (bi) obj4;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj3;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                biVar.b2.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    y0Var.setText(bd.M0(2131747736, null));
                    y0Var.setSubtext(bd.G((int) l10.longValue(), "Stars", new Object[0]));
                    biVar.Z1.r(l10.longValue());
                    return;
                } else {
                    y0Var.setText(bd.M0(2131747738, null));
                    y0Var.setSubtext(null);
                    biVar.Z1.r(0L);
                    return;
                }
            case 14:
                an anVar = (an) obj4;
                anVar.getClass();
                anVar.a0((uh.e) ((th.c) obj3), true);
                return;
            case 15:
                vr vrVar = (vr) obj4;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = vrVar.V;
                ArrayList arrayList10 = vrVar.U;
                int i25 = vrVar.Q;
                if (!TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, vrVar.h0) || TextUtils.isEmpty(vrVar.h0)) {
                    return;
                }
                vrVar.d0 = false;
                if (tL_contacts_found2 != null) {
                    qr.a0(i25).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    hp.s1(i25).Y3(tL_contacts_found2.users, false);
                    hp.s1(i25).S3(tL_contacts_found2.chats, false);
                    tL_contacts_found = tL_contacts_found2;
                } else {
                    tL_contacts_found = null;
                }
                HashSet hashSet = new HashSet();
                arrayList10.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found.my_results;
                    int size3 = arrayList11.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        TLRPC.Peer peer = arrayList11.get(i26);
                        i26++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (a23 = hp.s1(i25).a2(Long.valueOf(peer2.user_id))) != null && a23.bot && !hashSet.contains(Long.valueOf(a23.id))) {
                            hashSet.add(Long.valueOf(a23.id));
                            arrayList10.add(a23);
                        }
                    }
                }
                arrayList9.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found.results;
                    int size4 = arrayList12.size();
                    int i27 = 0;
                    while (i27 < size4) {
                        TLRPC.Peer peer3 = arrayList12.get(i27);
                        i27++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (a22 = hp.s1(i25).a2(Long.valueOf(peer4.user_id))) != null && a22.bot && !hashSet.contains(Long.valueOf(a22.id))) {
                            hashSet.add(Long.valueOf(a22.id));
                            arrayList9.add(a22);
                        }
                    }
                }
                tj0 tj0Var = vrVar.d;
                if (tj0Var != null) {
                    tj0Var.v0(0);
                }
                vrVar.O(true);
                return;
            case 16:
                xr xrVar = (xr) obj4;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList13 = xrVar.V;
                ArrayList arrayList14 = xrVar.U;
                ArrayList arrayList15 = xrVar.T;
                int i28 = xrVar.Q;
                if (!TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, xrVar.e0) || TextUtils.isEmpty(xrVar.e0)) {
                    return;
                }
                xrVar.a0 = false;
                if (tL_contacts_found3 != null) {
                    qr.a0(i28).m1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    hp.s1(i28).Y3(tL_contacts_found3.users, false);
                    hp.s1(i28).S3(tL_contacts_found3.chats, false);
                } else {
                    tL_contacts_found3 = null;
                }
                HashSet hashSet2 = new HashSet();
                arrayList15.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found3.my_results;
                    int size5 = arrayList16.size();
                    int i29 = 0;
                    while (i29 < size5) {
                        TLRPC.Peer peer5 = arrayList16.get(i29);
                        i29++;
                        TLRPC.Peer peer6 = peer5;
                        if (peer6 instanceof TLRPC.TL_peerChannel) {
                            TLRPC.Chat M03 = hp.s1(i28).M0(Long.valueOf(peer6.channel_id));
                            if (M03 != null && org.telegram.messenger.t3.V(M03) && !hashSet2.contains(Long.valueOf(M03.id))) {
                                hashSet2.add(Long.valueOf(M03.id));
                                arrayList15.add(M03);
                            }
                        }
                    }
                }
                arrayList14.clear();
                String lowerCase = xrVar.e0.toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                HashMap hashMap = hp.s1(i28).Y7;
                io ioVar = hashMap == null ? null : (io) hashMap.get(0L);
                if (ioVar != null) {
                    ArrayList arrayList17 = ioVar.b;
                    if (!arrayList17.isEmpty()) {
                        int size6 = arrayList17.size();
                        int i30 = 0;
                        while (i30 < size6) {
                            Object obj7 = arrayList17.get(i30);
                            i30++;
                            TLObject tLObject = (TLObject) obj7;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (org.telegram.messenger.t3.V(chat)) {
                                    i10 = size6;
                                    TLRPC.Chat M04 = hp.s1(i28).M0(Long.valueOf(chat.id));
                                    if (org.telegram.messenger.t3.r0(chat) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || k2.p1.z(" ", lowerCase, lowerCase2) || O32.startsWith(O3) || O32.contains(" ".concat(O3))) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                            hashSet2.add(Long.valueOf(chat.id));
                                            arrayList14.add(chat);
                                        }
                                    }
                                }
                            } else {
                                i10 = size6;
                            }
                            size6 = i10;
                        }
                    }
                }
                arrayList13.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList18 = tL_contacts_found3.results;
                    int size7 = arrayList18.size();
                    int i31 = 0;
                    while (i31 < size7) {
                        TLRPC.Peer peer7 = arrayList18.get(i31);
                        i31++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (M0 = hp.s1(i28).M0(Long.valueOf(peer8.channel_id))) != null && org.telegram.messenger.t3.V(M0) && !hashSet2.contains(Long.valueOf(M0.id))) {
                            hashSet2.add(Long.valueOf(M0.id));
                            arrayList13.add(M0);
                        }
                    }
                }
                xrVar.O(true);
                return;
            case 17:
                f21 f21Var = (f21) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q11 q11Var = f21Var.w1;
                e21 e21Var = f21Var.F1;
                f21Var.j1 = null;
                if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
                    f21Var.X0();
                    return;
                }
                if (tL_textWithEntities2 != null) {
                    f21Var.M1 = false;
                    TLRPC.TL_textWithEntities P0 = f21.P0(tL_textWithEntities, tL_textWithEntities2);
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                    zi.b(valueOf, P0.entities, false, true, false, false, 0);
                    f21Var.x1.setText(f21Var.Q0(valueOf));
                    e21Var.D(q11Var);
                    return;
                }
                if (f21Var.M1) {
                    f21Var.dismiss();
                    hs.e().k(hs.P4, 1, bd.M0(2131743956, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743956, new fc((FrameLayout) f21Var.b, f21Var.J0), null);
                b21 b21Var = f21Var.u1.e;
                String str4 = f21Var.t1;
                f21Var.s1 = str4;
                b21Var.setText(f21.O0(str4, null, null));
                e21Var.D(q11Var);
                return;
            case 18:
                x30 x30Var = (x30) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj3;
                Boolean bool4 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                if (r3Var2 == null || (groupCall = r3Var2.b) == null) {
                    return;
                }
                String str5 = groupCall.invite_link;
                int size8 = hashSet3.size();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet4 = new HashSet();
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    Long l11 = (Long) it.next();
                    long longValue = l11.longValue();
                    x30Var.S2.a(longValue);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    inviteconferencecallparticipant.call = tL_inputGroupCall;
                    TLRPC.GroupCall groupCall2 = x30Var.S2.b;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    hp s12 = hp.s1(x30Var.a);
                    inviteconferencecallparticipant.user_id = s12.q1(s12.a2(l11));
                    inviteconferencecallparticipant.video = bool4.booleanValue();
                    String str6 = str5;
                    ConnectionsManager.getInstance(x30Var.a).sendRequest(inviteconferencecallparticipant, new ii.x0(x30Var, longValue, hashSet4, atomicInteger, size8, r3Var, str6));
                    str5 = str6;
                }
                x30Var.Q0(true);
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
                x30Var.Q1(true, true);
                return;
            case 19:
                m90 m90Var = (m90) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m90Var.c();
                if (tL_error2 == null) {
                    yh0.b(m90Var.d, m90Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                    m90.d().I(R.raw.error, bd.M0(2131753128, null), bd.M0(2131753129, null)).j();
                    return;
                } else {
                    m90.d().f0(tL_error2, false);
                    return;
                }
            case 20:
                ((boolean[]) obj4)[0] = true;
                ((org.telegram.ui.ActionBar.t2) obj3).dismiss();
                return;
            case 21:
                ((sf.b) obj4).b();
                ((el0) obj3).a((Boolean) obj);
                return;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj4;
                yr0 yr0Var = (yr0) obj3;
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
                yr0Var.b(l12 == null ? 0L : l12.longValue(), true);
                return;
            case 23:
                String str7 = (String) obj4;
                u10 u10Var = (u10) obj3;
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
                            bArr = Utilities.v(str.substring(2));
                        }
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.k0.k("failed to get public key of " + str7, e10);
                    }
                }
                u10Var.a(bArr);
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                c(obj, obj2);
                return;
            case 26:
                c cVar = (c) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str8 = (String) obj2;
                if (((boolean[]) obj4)[0]) {
                    return;
                }
                cVar.a(wallettransaction, str8);
                return;
            case 27:
                d(obj, obj2);
                return;
            case 28:
                e(obj, obj2);
                return;
            default:
                String str9 = (String) obj4;
                gi.s3 s3Var = (gi.s3) obj3;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                            if (str9.equals(jSONObject3.optString("domain"))) {
                                String optString = jSONObject3.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    bArr = optString;
                                }
                            }
                        }
                    } catch (JSONException e11) {
                        a8.g(e11, true);
                    }
                }
                s3Var.a(bArr);
                return;
        }
    }

    public /* synthetic */ q4(org.telegram.ui.Wallet.k0 k0Var, String str, u10 u10Var) {
        this.a = 23;
        this.b = str;
        this.c = u10Var;
    }
}
