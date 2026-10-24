package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ih;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;
import org.telegram.ui.r80;
import org.telegram.ui.sn;
import org.telegram.ui.so0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ((ih) obj3).run((a2) obj, (String) obj2);
                break;
            case 3:
                i8.b0((i8) obj4, (Utilities.Callback) obj3, (i0) obj, (String) obj2);
                break;
            case 4:
                s9 s9Var = (s9) obj4;
                o oVar = (o) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    oVar.run(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    s9Var.Y.setLoading(false);
                    break;
                }
            case 5:
                rh.r rVar = (rh.r) obj4;
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
                ug.y yVar = (ug.y) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                yVar.q0.a.setLoading(false);
                if (yVar.getContext() != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    pa0 pa0Var = LaunchActivity.J1.x0;
                    if (U != null) {
                        if (!bool.booleanValue()) {
                            if (str3 != null) {
                                yVar.dismiss();
                                i2.o1.t(R.string.UnknownErrorCode, new Object[]{str3}, xc.a0(U), R.raw.error, 36);
                                break;
                            }
                        } else {
                            yVar.dismiss();
                            sn W9 = sn.W9(-yVar.b0.id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new u2.k0(7, W9, tL_starsGiveawayOption));
                            if (pa0Var != null) {
                                pa0Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                yh.o2 o2Var = (yh.o2) obj4;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((ai.y9) obj3).l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj6 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = so0.a;
                        m61 J = m61.J(so0.class);
                        J.G = savedStarGift;
                        J.K(o2Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList2.add(J);
                    }
                }
                break;
        }
    }
}
