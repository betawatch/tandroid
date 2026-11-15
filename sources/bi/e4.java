package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import di.bb;
import di.cb;
import di.l8;
import di.lb;
import di.u8;
import fi.p9;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.oo;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
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
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.h8;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.di0;
import org.telegram.ui.fs0;
import org.telegram.ui.ll0;
import org.telegram.ui.lm;
import org.telegram.ui.q90;
import org.telegram.ui.rl0;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
        g8 g8Var = (g8) this.c;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
        String str = (String) obj2;
        if (i0Var == null) {
            org.telegram.ui.Wallet.l0.j("enable backup: didnt get secret phrase: ".concat(str == null ? "NULL_ERROR" : str));
            if (str == null) {
                str = "NULL_ERROR";
            }
            g8Var.a(str);
            return;
        }
        org.telegram.ui.Wallet.i0 b10 = i0Var.b();
        x21 x21Var = new x21(5, b10, g8Var);
        org.telegram.ui.Wallet.l0.H("enable backup: got secret phrase");
        try {
            ConnectionsManager.getInstance(l0Var.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new d3.b(1), new org.telegram.ui.Wallet.q(l0Var, x21Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
        } catch (Exception e10) {
            org.telegram.ui.Wallet.l0.k("failed to get public key from secret phrase", e10);
            x21Var.a(e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
        }
    }

    private final void c(Object obj, Object obj2) {
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
        h8 h8Var = (h8) this.c;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
        String str = (String) obj2;
        if (i0Var == null) {
            org.telegram.ui.Wallet.l0.j("prepare disable backup, cant get secret phrase: ".concat(str == null ? "NULL_ERROR" : str));
            if (str == null) {
                str = "NULL_ERROR";
            }
            h8Var.a(null, str);
            return;
        }
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = l0Var.f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
            TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
        }
        org.telegram.ui.Wallet.l0.H("prepare disable backup: preparing transfer");
        l0Var.b.prepareRotateKey(i0Var, null, new fi.y1(2, l0Var, h8Var));
    }

    private final void d(Object obj, Object obj2) {
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
        x21 x21Var = (x21) this.c;
        TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (tL_error == null) {
            org.telegram.ui.Wallet.l0.H("enable backup: server accepted request");
            l0Var.l0(walletState);
            x21Var.a(null);
            return;
        }
        org.telegram.ui.Wallet.l0.j("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
        String str = tL_error.text;
        if (str == null) {
            str = "NULL_ERROR";
        }
        x21Var.a(str);
    }

    private final void e(Object obj, Object obj2) {
        org.telegram.ui.Wallet.z zVar = (org.telegram.ui.Wallet.z) this.b;
        s10 s10Var = (s10) this.c;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        String str = (String) obj2;
        if (zVar.a) {
            return;
        }
        s10Var.a(wallettransaction, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0ace  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        boolean z10;
        int i7;
        di.w4 w4Var;
        di.w4 w4Var2;
        di.w4 w4Var3;
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
                h4 h4Var = (h4) obj4;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((l8) obj3).l;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i13 = rl0.b;
                        b41 K = b41.K(rl0.class);
                        K.G = savedStarGift;
                        K.L(h4Var.m1 == savedStarGift.gift.id);
                        K.u = 1;
                        arrayList.add(K);
                    }
                }
                return;
            case 1:
                di.y4 y4Var = (di.y4) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                di.w4[] w4VarArr = y4Var.n;
                hi.l3 l3Var = y4Var.U;
                if (l3Var != null) {
                    z10 = true;
                    l3Var.f(true);
                    starGift = null;
                    y4Var.U = null;
                } else {
                    starGift = null;
                    z10 = true;
                }
                y4Var.j0 = z10;
                y4Var.k0 = starGift2 == null;
                y4Var.l0 = runnable;
                di.r4 r4Var = new di.r4(y4Var.h);
                ArrayList arrayList4 = new ArrayList();
                for (int i14 = 0; i14 < w4VarArr.length; i14++) {
                    di.w4 w4Var4 = w4VarArr[i14];
                    if (w4Var4 != null) {
                        TL_stars.StarGift starGift3 = w4Var4.h;
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
                    r4Var.e(w4VarArr[((Integer) arrayList4.get(0)).intValue()], 5, 0.0f);
                    r4Var.d(false);
                    r4Var.c(26.0f, -26.0f);
                    r4Var.a(90);
                    r4Var.d(true);
                    r4Var.a(20);
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    di.w4 w4Var5 = w4VarArr[0];
                    if (w4Var5 != null) {
                        TL_stars.StarGift starGift4 = w4Var5.h;
                        if (starGift4 == null) {
                            starGift4 = null;
                        }
                        if (starGift4 != null) {
                            r4Var.e(w4Var5, iArr[0], 0.0f);
                            r4Var.c(25.0f, -22.0f);
                            i7 = 1;
                            w4Var = w4VarArr[1];
                            if (w4Var != null) {
                                TL_stars.StarGift starGift5 = w4Var.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i7 > 0) {
                                        r4Var.a(42);
                                    }
                                    r4Var.e(w4VarArr[1], iArr[i7], 0.0f);
                                    r4Var.c(25.0f, 31.0f);
                                    i7++;
                                }
                            }
                            w4Var2 = w4VarArr[2];
                            if (w4Var2 != null) {
                                TL_stars.StarGift starGift6 = w4Var2.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    if (i7 > 0) {
                                        r4Var.a(42);
                                    }
                                    r4Var.e(w4VarArr[2], iArr[i7], 180.0f);
                                    r4Var.c(-36.0f, -36.0f);
                                    i7++;
                                }
                            }
                            w4Var3 = w4VarArr[3];
                            if (w4Var3 != null) {
                                TL_stars.StarGift starGift7 = w4Var3.h;
                                if ((starGift7 != null ? starGift7 : null) != null) {
                                    if (i7 > 0) {
                                        r4Var.a(42);
                                    }
                                    r4Var.e(w4VarArr[3], iArr[i7], 0.0f);
                                    r4Var.c(-31.0f, 31.0f);
                                    i7++;
                                }
                            }
                            r4Var.d(false);
                            r4Var.a(40);
                            r4Var.d(true);
                            r4Var.a(40);
                            i15 = iArr[i7];
                            i16 = 80;
                        }
                    }
                    i7 = 0;
                    w4Var = w4VarArr[1];
                    if (w4Var != null) {
                    }
                    w4Var2 = w4VarArr[2];
                    if (w4Var2 != null) {
                    }
                    w4Var3 = w4VarArr[3];
                    if (w4Var3 != null) {
                    }
                    r4Var.d(false);
                    r4Var.a(40);
                    r4Var.d(true);
                    r4Var.a(40);
                    i15 = iArr[i7];
                    i16 = 80;
                }
                int i17 = i16;
                di.q4 q4Var = new di.q4(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new ai.a1(y4Var, i15, starGift2, 5));
                ArrayList arrayList5 = r4Var.b;
                arrayList5.add(q4Var);
                arrayList5.add(new di.q4(4, 0.0f, 0.0f, i17, i15, -90, null, null));
                r4Var.d = new ai.r(y4Var, starGift2, arrayList3, runnable, 12);
                r4Var.e = false;
                r4Var.c = 0;
                r4Var.l = false;
                int size2 = arrayList5.size();
                int i18 = 0;
                while (true) {
                    di.s4 s4Var = r4Var.a;
                    if (i18 >= size2) {
                        s4Var.I = r4Var;
                        r4Var.b();
                        return;
                    }
                    Object obj6 = arrayList5.get(i18);
                    i18++;
                    di.q4 q4Var2 = (di.q4) obj6;
                    int i19 = q4Var2.e;
                    if (i19 >= 0 && i19 < 6) {
                        float f10 = q4Var2.f;
                        if (f10 != 0.0f) {
                            s4Var.E[i19] = f10;
                        }
                    }
                }
                break;
            case 2:
                lb.D0((lb) obj4, (b41) obj3, (Boolean) obj, (String) obj2);
                return;
            case 3:
                bb bbVar = (bb) obj4;
                b41 b41Var = (b41) obj3;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                if (bbVar.getContext() == null) {
                    return;
                }
                if (bool.booleanValue()) {
                    new cc((FrameLayout) bbVar.b, bbVar.J0).I(R.raw.stars_topup, hd.M0(2131745159, null), org.telegram.messenger.g0.X2(hd.G((int) b41Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                    bbVar.W1.c(true);
                    u8.y(bbVar.a, false).S(true);
                    return;
                } else {
                    if (str2 != null) {
                        new cc((FrameLayout) bbVar.b, bbVar.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str2)).j();
                        return;
                    }
                    return;
                }
            case 4:
                cb cbVar = (cb) obj4;
                b41 b41Var2 = (b41) obj3;
                Boolean bool2 = (Boolean) obj;
                String str3 = (String) obj2;
                if (cbVar.getContext() == null) {
                    return;
                }
                cbVar.dismiss();
                u8.y(cbVar.a, false).S(true);
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                if (!bool2.booleanValue()) {
                    if (str3 != null) {
                        cc.a0(T).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str3)).j();
                        return;
                    }
                    return;
                } else {
                    cc.a0(T).I(R.raw.stars_topup, hd.M0(2131745159, null), org.telegram.messenger.g0.X2(hd.G((int) b41Var2.B, "StarsAcquiredInfo", new Object[0]))).j();
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.w0.c(true);
                        return;
                    }
                    return;
                }
            case 5:
                fi.c2 c2Var = (fi.c2) obj4;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) obj3;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                fi.a0 a0Var = c2Var.W;
                int i20 = c2Var.O;
                c2Var.V = false;
                TLRPC.InputGroupCall inputGroupCall = c2Var.P;
                if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
                    return;
                }
                if (groupcallstars != null) {
                    np.s1(i20).Y3(groupcallstars.users, false);
                    np.s1(i20).S3(groupcallstars.chats, false);
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
                    long j3 = groupcallstars.total_stars;
                    boolean z12 = (j3 == c2Var.R && c2Var.T == z11) ? false : true;
                    c2Var.R = j3;
                    c2Var.U = groupcallstars.top_donors;
                    c2Var.T = z11;
                    if (z12) {
                        c2Var.j();
                    }
                    c2Var.t();
                }
                if (c2Var.isAttachedToWindow()) {
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.i3(a0Var, 5000L);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList6 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i22 = ((p9) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < vector.objects.size(); i23++) {
                        if (((Long) arrayList6.get(i23)).longValue() > 0) {
                            TLRPC.User a24 = np.s1(i22).a2((Long) arrayList6.get(i23));
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
                            TLRPC.Chat M02 = np.s1(i22).M0((Long) arrayList6.get(i23));
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
                    vr.a0(i22).m1(arrayList7, arrayList8, true, true);
                    ns.f(i22).k(2, 0);
                    return;
                }
                return;
            case 7:
                hi.m5 m5Var = (hi.m5) obj4;
                tg.j jVar = (tg.j) obj3;
                m5Var.getClass();
                ((tg.n0) jVar).r(m5Var.p1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                m5Var.b0(jVar);
                return;
            case 8:
                ((u10) obj4).a((Boolean) obj, (androidx.biometric.u) obj2, (androidx.biometric.v) obj3);
                return;
            case 9:
                org.telegram.ui.x xVar = (org.telegram.ui.x) obj4;
                org.telegram.ui.w wVar = (org.telegram.ui.w) obj3;
                Boolean bool3 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool3.booleanValue()) {
                        xVar.a(Boolean.TRUE);
                    }
                    wVar.run();
                    return;
                }
                return;
            case 10:
                an.e1((an) obj4, (gj) obj3, (Long) obj, (Runnable) obj2);
                return;
            case 11:
                an anVar = (an) obj4;
                org.telegram.ui.n6 n6Var = (org.telegram.ui.n6) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                anVar.W5 = 0;
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
                            for (int i24 = 0; i24 < tL_messageMediaWebPage.webpage.attributes.size(); i24++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i24) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i24);
                                    if (tL_webPageAttributeStory != null) {
                                        n6Var.a(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        n6Var.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        anVar.getMessagesStorage().a.c(new org.telegram.ui.ActionBar.l5((Object) anVar, (Object) tL_messageMediaWebPage, (Object) tL_webPageAttributeStory, (Object) n6Var, 11));
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
                lm lmVar = (lm) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                an anVar2 = lmVar.a;
                if (tL_channels_channelParticipant != null) {
                    anVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                    anVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        lmVar.d(q1Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ki kiVar = (ki) obj4;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj3;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                kiVar.e2.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    z0Var.setText(hd.M0(2131747728, null));
                    z0Var.setSubtext(hd.G((int) l10.longValue(), "Stars", new Object[0]));
                    kiVar.c2.t(l10.longValue());
                    return;
                } else {
                    z0Var.setText(hd.M0(2131747730, null));
                    z0Var.setSubtext(null);
                    kiVar.c2.t(0L);
                    return;
                }
            case 14:
                jn jnVar = (jn) obj4;
                jnVar.getClass();
                jnVar.a0((th.e) ((sh.c) obj3), true);
                return;
            case 15:
                bs bsVar = (bs) obj4;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = bsVar.V;
                ArrayList arrayList10 = bsVar.U;
                int i25 = bsVar.Q;
                if (!TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, bsVar.h0) || TextUtils.isEmpty(bsVar.h0)) {
                    return;
                }
                bsVar.d0 = false;
                if (tL_contacts_found2 != null) {
                    vr.a0(i25).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    np.s1(i25).Y3(tL_contacts_found2.users, false);
                    np.s1(i25).S3(tL_contacts_found2.chats, false);
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
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (a23 = np.s1(i25).a2(Long.valueOf(peer2.user_id))) != null && a23.bot && !hashSet.contains(Long.valueOf(a23.id))) {
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
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (a22 = np.s1(i25).a2(Long.valueOf(peer4.user_id))) != null && a22.bot && !hashSet.contains(Long.valueOf(a22.id))) {
                            hashSet.add(Long.valueOf(a22.id));
                            arrayList9.add(a22);
                        }
                    }
                }
                uj0 uj0Var = bsVar.d;
                if (uj0Var != null) {
                    uj0Var.v0(0);
                }
                bsVar.O(true);
                return;
            case 16:
                ds dsVar = (ds) obj4;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList13 = dsVar.V;
                ArrayList arrayList14 = dsVar.U;
                ArrayList arrayList15 = dsVar.T;
                int i28 = dsVar.Q;
                if (!TextUtils.equals(((TLRPC.TL_contacts_search) obj3).q, dsVar.e0) || TextUtils.isEmpty(dsVar.e0)) {
                    return;
                }
                dsVar.a0 = false;
                if (tL_contacts_found3 != null) {
                    vr.a0(i28).m1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    np.s1(i28).Y3(tL_contacts_found3.users, false);
                    np.s1(i28).S3(tL_contacts_found3.chats, false);
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
                            TLRPC.Chat M03 = np.s1(i28).M0(Long.valueOf(peer6.channel_id));
                            if (M03 != null && org.telegram.messenger.t3.V(M03) && !hashSet2.contains(Long.valueOf(M03.id))) {
                                hashSet2.add(Long.valueOf(M03.id));
                                arrayList15.add(M03);
                            }
                        }
                    }
                }
                arrayList14.clear();
                String lowerCase = dsVar.e0.toLowerCase();
                String N3 = org.telegram.messenger.g0.N3(lowerCase);
                HashMap hashMap = np.s1(i28).Z7;
                oo ooVar = hashMap == null ? null : (oo) hashMap.get(0L);
                if (ooVar != null) {
                    ArrayList arrayList17 = ooVar.b;
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
                                    TLRPC.Chat M04 = np.s1(i28).M0(Long.valueOf(chat.id));
                                    if (org.telegram.messenger.t3.r0(chat) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || i5.c.A(" ", lowerCase, lowerCase2) || N32.startsWith(N3) || N32.contains(" ".concat(N3))) && !hashSet2.contains(Long.valueOf(chat.id))) {
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
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (M0 = np.s1(i28).M0(Long.valueOf(peer8.channel_id))) != null && org.telegram.messenger.t3.V(M0) && !hashSet2.contains(Long.valueOf(M0.id))) {
                            hashSet2.add(Long.valueOf(M0.id));
                            arrayList13.add(M0);
                        }
                    }
                }
                dsVar.O(true);
                return;
            case 17:
                p21 p21Var = (p21) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a21 a21Var = p21Var.z1;
                o21 o21Var = p21Var.I1;
                p21Var.m1 = null;
                if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
                    p21Var.Y0();
                    return;
                }
                if (tL_textWithEntities2 != null) {
                    p21Var.P1 = false;
                    TLRPC.TL_textWithEntities Q0 = p21.Q0(tL_textWithEntities, tL_textWithEntities2);
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(Q0.text);
                    gj.b(valueOf, Q0.entities, false, true, false, false, 0);
                    p21Var.A1.setText(p21Var.R0(valueOf));
                    o21Var.D(a21Var);
                    return;
                }
                if (p21Var.P1) {
                    p21Var.dismiss();
                    ns.e().k(ns.P4, 1, hd.M0(2131743946, null));
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743946, new cc((FrameLayout) p21Var.b, p21Var.J0), null);
                l21 l21Var = p21Var.x1.e;
                String str4 = p21Var.w1;
                p21Var.v1 = str4;
                l21Var.setText(p21.O0(str4, null, null));
                o21Var.D(a21Var);
                return;
            case 18:
                c40 c40Var = (c40) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj3;
                Boolean bool4 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                org.telegram.messenger.r3 r3Var2 = c40Var.V2;
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
                    c40Var.V2.a(longValue);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    inviteconferencecallparticipant.call = tL_inputGroupCall;
                    TLRPC.GroupCall groupCall2 = c40Var.V2.b;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    np s12 = np.s1(c40Var.a);
                    inviteconferencecallparticipant.user_id = s12.q1(s12.a2(l11));
                    inviteconferencecallparticipant.video = bool4.booleanValue();
                    String str6 = str5;
                    ConnectionsManager.getInstance(c40Var.a).sendRequest(inviteconferencecallparticipant, new ki.x0(c40Var, longValue, hashSet4, atomicInteger, size8, r3Var, str6));
                    str5 = str6;
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
                c40Var.V1(true, true);
                return;
            case 19:
                q90 q90Var = (q90) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                q90Var.c();
                if (tL_error2 == null) {
                    di0.b(q90Var.d, q90Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                    q90.d().I(R.raw.error, hd.M0(2131753128, null), hd.M0(2131753129, null)).j();
                    return;
                } else {
                    q90.d().f0(tL_error2, false);
                    return;
                }
            case 20:
                ((boolean[]) obj4)[0] = true;
                ((org.telegram.ui.ActionBar.u2) obj3).dismiss();
                return;
            case 21:
                ((vf.b) obj4).b();
                ((ll0) obj3).a((Boolean) obj);
                return;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj4;
                fs0 fs0Var = (fs0) obj3;
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
                premiumPreviewFragment.getMessagesController().i5(emojiStatus, null);
                fs0Var.b(l12 == null ? 0L : l12.longValue(), true);
                return;
            case 23:
                String str7 = (String) obj4;
                z10 z10Var = (z10) obj3;
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
                        org.telegram.ui.Wallet.l0.k("failed to get public key of " + str7, e10);
                    }
                }
                z10Var.a(bArr);
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                c(obj, obj2);
                return;
            case 26:
                b bVar = (b) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str8 = (String) obj2;
                if (((boolean[]) obj4)[0]) {
                    return;
                }
                bVar.a(wallettransaction, str8);
                return;
            case 27:
                d(obj, obj2);
                return;
            case 28:
                e(obj, obj2);
                return;
            default:
                String str9 = (String) obj4;
                ai.y1 y1Var = (ai.y1) obj3;
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
                y1Var.a(bArr);
                return;
        }
    }

    public /* synthetic */ e4(org.telegram.ui.Wallet.l0 l0Var, String str, z10 z10Var) {
        this.a = 23;
        this.b = str;
        this.c = z10Var;
    }
}
