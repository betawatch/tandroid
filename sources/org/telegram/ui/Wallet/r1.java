package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.qa0;
import org.telegram.ui.r80;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj4;
                r80 r80Var = (r80) obj3;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                r80Var.run(str);
                break;
            case 1:
                ((i0) obj4).close();
                AndroidUtilities.runOnUIThread(new h((r1) obj3, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                break;
            case 2:
                ((i0) obj4).close();
                ((kh) obj3).run((a2) obj, (String) obj2);
                break;
            case 3:
                h8.c0((h8) obj4, (Utilities.Callback) obj3, (i0) obj, (String) obj2);
                break;
            case 4:
                r9 r9Var = (r9) obj4;
                o oVar = (o) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    oVar.run(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    r9Var.Z.setLoading(false);
                    break;
                }
            case 5:
                sh.r rVar = (sh.r) obj4;
                String str2 = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = rVar.a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i12).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i12).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r1 = messageMedia.webpage;
                    }
                }
                rVar.b.put(str2, r1);
                ArrayList arrayList = (ArrayList) rVar.c.remove(str2);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj5 = arrayList.get(i11);
                        i11++;
                        ((Utilities.Callback2) obj5).run(r1, tL_error);
                    }
                    break;
                }
                break;
            case 6:
                vg.a0 a0Var = (vg.a0) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                a0Var.q0.a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    qa0 qa0Var = LaunchActivity.I1.x0;
                    if (U != null) {
                        if (!bool.booleanValue()) {
                            if (str3 != null) {
                                a0Var.dismiss();
                                ic.a.s(R.string.UnknownErrorCode, new Object[]{str3}, wc.b0(U), R.raw.error, 36);
                                break;
                            }
                        } else {
                            a0Var.dismiss();
                            wn ea2 = wn.ea(-a0Var.b0.id);
                            U.presentFragment(ea2);
                            U.whenFullyVisible(new s9.g(24, ea2, tL_starsGiveawayOption));
                            if (qa0Var != null) {
                                qa0Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                zh.q2 q2Var = (zh.q2) obj4;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((bi.t9) obj3).l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj6 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = ap0.a;
                        u61 K = u61.K(ap0.class);
                        K.G = savedStarGift;
                        K.L(q2Var.b == savedStarGift.gift.id);
                        K.u = 1;
                        arrayList2.add(K);
                    }
                }
                break;
        }
    }
}
