package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
import org.telegram.ui.n80;
import org.telegram.ui.ro0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i10, Object obj, Object obj2) {
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
                n80 n80Var = (n80) obj3;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                n80Var.run(str);
                break;
            case 1:
                ((j0) obj4).close();
                AndroidUtilities.runOnUIThread(new h((s1) obj3, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                break;
            case 2:
                ((j0) obj4).close();
                ((fh) obj3).run((b2) obj, (String) obj2);
                break;
            case 3:
                h8.b0((h8) obj4, (Utilities.Callback) obj3, (j0) obj, (String) obj2);
                break;
            case 4:
                r9 r9Var = (r9) obj4;
                p pVar = (p) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    pVar.run(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    r9Var.V.setLoading(false);
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
                ug.z zVar = (ug.z) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                zVar.q0.a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    la0 la0Var = LaunchActivity.H1.x0;
                    if (U != null) {
                        if (!bool.booleanValue()) {
                            if (str3 != null) {
                                zVar.dismiss();
                                i2.d.s(R.string.UnknownErrorCode, new Object[]{str3}, xc.a0(U), R.raw.error, 36);
                                break;
                            }
                        } else {
                            zVar.dismiss();
                            sn W9 = sn.W9(-zVar.b0.id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new u2.q0(6, W9, tL_starsGiveawayOption));
                            if (la0Var != null) {
                                la0Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
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
                        int i14 = ro0.a;
                        f61 J = f61.J(ro0.class);
                        J.G = savedStarGift;
                        J.K(o2Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList2.add(J);
                    }
                }
                break;
            default:
                zh.i0 i0Var = (zh.i0) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (i0Var.w == ((int[]) obj3)[0]) {
                    i0Var.w = 0;
                }
                if (tL_error2 != null) {
                    FileLog.e("QrShare: setShareTheme " + tL_error2.text);
                    if (!i0Var.E) {
                        zh.u0 u0Var = i0Var.b;
                        u0Var.getClass();
                        u0Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                        break;
                    }
                }
                break;
        }
    }
}
