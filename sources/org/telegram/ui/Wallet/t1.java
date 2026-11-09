package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.n60;
import org.telegram.ui.rl0;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        int i10 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                ((i0) obj4).close();
                ((n60) obj3).a((z1) obj, (String) obj2);
                break;
            case 1:
                ((i0) obj4).close();
                org.telegram.messenger.g0.h3(new g((bi.p5) obj3, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                break;
            case 2:
                m8.g0((m8) obj4, (c20) obj3, (i0) obj, (String) obj2);
                break;
            case 3:
                v9 v9Var = (v9) obj4;
                m mVar = (m) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    mVar.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    v9Var.Z.setLoading(false);
                    break;
                }
            case 4:
                sh.p pVar = (sh.p) obj4;
                String str = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = pVar.a;
                if (webpagepreview != null) {
                    qp.s1(i11).Y3(webpagepreview.users, false);
                    qp.s1(i11).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r1 = messageMedia.webpage;
                    }
                }
                pVar.b.put(str, r1);
                ArrayList arrayList = (ArrayList) pVar.c.remove(str);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj5 = arrayList.get(i10);
                        i10++;
                        ((v10) obj5).a(r1, tL_error);
                    }
                    break;
                }
                break;
            case 5:
                wg.z zVar = (wg.z) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                zVar.i2.a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    t80 t80Var = LaunchActivity.G1.v0;
                    if (T != null) {
                        if (!bool.booleanValue()) {
                            if (str2 != null) {
                                zVar.dismiss();
                                hc.a0(T).Q(R.raw.error, 36, id.a0(null, null, 2131743878, str2)).j();
                                break;
                            }
                        } else {
                            zVar.dismiss();
                            cn ta2 = cn.ta(-zVar.T1.id);
                            T.presentFragment(ta2);
                            T.whenFullyVisible(new u9.f(20, ta2, tL_starsGiveawayOption));
                            if (t80Var != null) {
                                t80Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                zh.c2 c2Var = (zh.c2) obj4;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((bi.v9) obj3).l;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj6 = arrayList3.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    if (savedStarGift.pinned_to_top) {
                        int i13 = rl0.b;
                        y31 K = y31.K(rl0.class);
                        K.G = savedStarGift;
                        K.L(c2Var.i1 == savedStarGift.gift.id);
                        K.u = 1;
                        arrayList2.add(K);
                    }
                }
                break;
        }
    }
}
