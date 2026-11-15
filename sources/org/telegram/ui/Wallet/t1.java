package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.k60;
import org.telegram.ui.r60;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        int i10 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj4;
                r60 r60Var = (r60) obj3;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                r60Var.a(str);
                break;
            case 1:
                ((i0) obj4).close();
                ((k60) obj3).a((z1) obj, (String) obj2);
                break;
            case 2:
                ((i0) obj4).close();
                org.telegram.messenger.g0.h3(new g((t1) obj3, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                break;
            case 3:
                p8.g0((p8) obj4, (z10) obj3, (i0) obj, (String) obj2);
                break;
            case 4:
                z9 z9Var = (z9) obj4;
                m mVar = (m) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    mVar.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    z9Var.a0.setLoading(false);
                    break;
                }
            case 5:
                sh.o oVar = (sh.o) obj4;
                String str2 = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = oVar.a;
                if (webpagepreview != null) {
                    np.s1(i11).Y3(webpagepreview.users, false);
                    np.s1(i11).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r1 = messageMedia.webpage;
                    }
                }
                oVar.b.put(str2, r1);
                ArrayList arrayList = (ArrayList) oVar.c.remove(str2);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj5 = arrayList.get(i10);
                        i10++;
                        ((s10) obj5).a(r1, tL_error);
                    }
                    break;
                }
                break;
            default:
                wg.y yVar = (wg.y) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                yVar.m2.a.setLoading(false);
                if (yVar.getContext() != null) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    r80 r80Var = LaunchActivity.H1.w0;
                    if (T != null) {
                        if (!bool.booleanValue()) {
                            if (str3 != null) {
                                yVar.dismiss();
                                cc.a0(T).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str3)).j();
                                break;
                            }
                        } else {
                            yVar.dismiss();
                            an ua2 = an.ua(-yVar.X1.id);
                            T.presentFragment(ua2);
                            T.whenFullyVisible(new ug.t1(9, ua2, tL_starsGiveawayOption));
                            if (r80Var != null) {
                                r80Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
