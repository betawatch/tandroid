package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f60;
import org.telegram.ui.n60;
import org.telegram.ui.p80;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        int i10 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj4;
                n60 n60Var = (n60) obj3;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                n60Var.a(str);
                break;
            case 1:
                ((h0) obj4).close();
                ((f60) obj3).a((y1) obj, (String) obj2);
                break;
            case 2:
                ((h0) obj4).close();
                org.telegram.messenger.g0.h3(new g((s1) obj3, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                break;
            case 3:
                n8.g0((n8) obj4, (u10) obj3, (h0) obj, (String) obj2);
                break;
            case 4:
                w9 w9Var = (w9) obj4;
                m mVar = (m) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    mVar.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    w9Var.a0.setLoading(false);
                    break;
                }
            case 5:
                th.o oVar = (th.o) obj4;
                String str2 = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = oVar.a;
                if (webpagepreview != null) {
                    hp.s1(i11).Y3(webpagepreview.users, false);
                    hp.s1(i11).S3(webpagepreview.chats, false);
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
                        ((n10) obj5).a(r1, tL_error);
                    }
                    break;
                }
                break;
            default:
                xg.a0 a0Var = (xg.a0) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                a0Var.j2.a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    p80 p80Var = LaunchActivity.K1.y0;
                    if (T != null) {
                        if (!bool.booleanValue()) {
                            if (str3 != null) {
                                a0Var.dismiss();
                                fc.a0(T).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str3)).j();
                                break;
                            }
                        } else {
                            a0Var.dismiss();
                            wm ra2 = wm.ra(-a0Var.U1.id);
                            T.presentFragment(ra2);
                            T.whenFullyVisible(new u9.a(27, ra2, tL_starsGiveawayOption));
                            if (p80Var != null) {
                                p80Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
