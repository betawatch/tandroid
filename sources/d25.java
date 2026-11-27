// default package

import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d25 implements Runnable {
    public final /* synthetic */ pcc E;
    public final /* synthetic */ z45 F;
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ pcc d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ a35 s;
    public final /* synthetic */ z45 w;
    public final /* synthetic */ TLRPC.User x;
    public final /* synthetic */ String y;

    public /* synthetic */ d25(c cVar, String str, pcc pccVar, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j, a35 a35Var, z45 z45Var, TLRPC.User user, String str4, pcc pccVar2, z45 z45Var2, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = str;
        this.d = pccVar;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j;
        this.s = a35Var;
        this.w = z45Var;
        this.x = user;
        this.y = str4;
        this.E = pccVar2;
        this.F = z45Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                String str = this.c;
                pcc pccVar = this.d;
                d25 d25Var = new d25(cVar, str, pccVar, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, (byte) 1);
                if (cVar.S() && !cVar.R()) {
                    c.P("send " + str + ": asking passcode");
                    e S = LaunchActivity.S();
                    if (S != null) {
                        bg0 bg0Var = new bg0();
                        bg0Var.a = true;
                        boolean[] zArr = {false};
                        r25 r25Var = new r25(zArr, pccVar);
                        r25Var.W = new se4(zArr, d25Var, (byte) 17);
                        S.showAsSheet(r25Var, bg0Var);
                        break;
                    } else {
                        pccVar.a("PASSCODE_FAILED");
                        break;
                    }
                } else {
                    d25Var.run();
                    break;
                }
                break;
            default:
                StringBuilder sb = new StringBuilder("send ");
                final String str2 = this.c;
                sb.append(str2);
                sb.append(": ready, get secret phrase");
                c.P(sb.toString());
                final c cVar2 = this.b;
                final pcc pccVar2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j = this.r;
                final a35 a35Var = this.s;
                final z45 z45Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final pcc pccVar3 = this.E;
                final z45 z45Var2 = this.F;
                cVar2.E(false, true, true, new icc() { // from class: f25
                    /* JADX WARN: Removed duplicated region for block: B:103:0x02ec  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x021d  */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x02ea  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x02f8  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x0303  */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x0311  */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x0333  */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x0361  */
                    @Override // icc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a(Object obj, Object obj2) {
                        TL_wallet.nftItem nftitem2;
                        b bVar;
                        TL_wallet.nftItem nftitem3;
                        b bVar2;
                        a35 a35Var2;
                        r47 r47Var;
                        pcc pccVar4;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo;
                        String str6;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2;
                        byte[] bArr2;
                        TL_stars.StarGift starGift;
                        ArrayList arrayList;
                        long j2;
                        c35 c35Var = (c35) obj;
                        String str7 = (String) obj2;
                        c cVar3 = c.this;
                        int i = cVar3.a;
                        pcc pccVar5 = pccVar2;
                        if (str7 != null) {
                            pccVar5.a(str7);
                            return;
                        }
                        if (c35Var == null) {
                            pccVar5.a("NULL_ERROR");
                            return;
                        }
                        if (cVar3.b == null) {
                            pccVar5.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem;
                        if (nftitem4 != null) {
                            if (!c.b(str3, cVar3.x())) {
                                pccVar5.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        b G = cVar3.G();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str8 = str4;
                        wallettransaction.comment = str8;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr3 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem4 != null || bArr3 == null || TextUtils.isEmpty(str8)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i).getCurrentTime();
                        long j3 = j;
                        wallettransaction.amount = j3;
                        wallettransaction.nft = nftitem4;
                        a35 a35Var3 = a35Var;
                        z45 z45Var3 = z45Var;
                        TLRPC.User user2 = user;
                        String str9 = str2;
                        if (a35Var3 == null || a35Var3.h == null) {
                            nftitem2 = nftitem4;
                            bVar = G;
                            if (z45Var3 == null || nftitem2 == null) {
                                wallettransaction.peer = c.h(user2, str9, str5);
                            } else {
                                TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                                wallettransactionpeertelegramgift.own_profile = user2 != null && user2.id == yac.h(i).e();
                                wallettransaction.peer = wallettransactionpeertelegramgift;
                            }
                        } else {
                            TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = a35Var3.h;
                            wallettransactionpeeronchaingift.action = walletOnchainGiftAction;
                            wallettransactionpeeronchaingift.address = jt7.a(walletOnchainGiftAction);
                            wallettransaction.peer = wallettransactionpeeronchaingift;
                            wallettransaction.nft = cVar3.c0(a35Var3.i);
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction2 = wallettransactionpeeronchaingift.action;
                            if ((walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferAccept) || (walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferCancel)) {
                                nftitem2 = nftitem4;
                                bVar = G;
                                j2 = 0;
                            } else {
                                nftitem2 = nftitem4;
                                bVar = G;
                                j2 = -Math.abs(j3);
                            }
                            wallettransaction.amount = j2;
                        }
                        TL_wallet.nftItem nftitem5 = nftitem2;
                        b bVar3 = bVar;
                        ao1 ao1Var = new ao1(cVar3, wallettransaction, nftitem5, bVar3, (byte) 24);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        if (a35Var3 != null && a35Var3.j && a35Var3.i != null && (bArr2 = a35Var3.c) != null) {
                            String textCommentFromBody = WalletEngine2.textCommentFromBody(Base64.encodeToString(bArr2, 2));
                            if (!TextUtils.isEmpty(textCommentFromBody)) {
                                cVar3.O();
                                if (!cVar3.S.containsKey(textCommentFromBody)) {
                                    cVar3.R.add(textCommentFromBody);
                                }
                                cVar3.S.put(textCommentFromBody, a35Var3.i);
                                while (cVar3.R.size() > 50) {
                                    cVar3.S.remove(cVar3.R.remove(0));
                                }
                                try {
                                    JSONArray jSONArray = new JSONArray();
                                    ArrayList arrayList2 = cVar3.R;
                                    int size = arrayList2.size();
                                    nftitem3 = nftitem5;
                                    int i2 = 0;
                                    while (i2 < size) {
                                        try {
                                            Object obj3 = arrayList2.get(i2);
                                            int i3 = i2 + 1;
                                            String str10 = (String) obj3;
                                            bVar2 = bVar3;
                                            try {
                                                starGift = (TL_stars.StarGift) cVar3.S.get(str10);
                                                arrayList = arrayList2;
                                                a35Var2 = a35Var3;
                                            } catch (Exception e) {
                                                e = e;
                                                a35Var2 = a35Var3;
                                                c.n("failed to save top-ups", e);
                                                cVar3.p.add(0, wallettransaction);
                                                if (nftitem3 != null) {
                                                }
                                                bVar2.k();
                                                bVar2.i();
                                                cVar3.a0();
                                                r7a B = r7a.B(i);
                                                if (user2 == null) {
                                                }
                                                r47Var = null;
                                                wallettransaction.localMessageId = r47Var == null ? 0 : r47Var.e1();
                                                pccVar4 = pccVar3;
                                                if (pccVar4 != null) {
                                                }
                                                pccVar5.a(null);
                                                tL_updateWalletGaslessInfo = cVar3.f;
                                                if (tL_updateWalletGaslessInfo != null) {
                                                }
                                                str6 = null;
                                                c.P("prepare sending");
                                                TL_wallet.nftItem nftitem6 = nftitem3;
                                                final byte b = 1;
                                                final m25 m25Var = new m25(cVar3, ao1Var, B, r47Var, wallettransaction, str9, bVar2, nextLong, user2, a35Var2);
                                                WalletEngine2 walletEngine2 = cVar3.b;
                                                if (z45Var3 != null) {
                                                }
                                            }
                                            try {
                                                SerializedData serializedData = new SerializedData(starGift.getObjectSize());
                                                starGift.serializeToStream(serializedData);
                                                jSONArray.put(new JSONObject().put("comment", str10).put("gift", Base64.encodeToString(serializedData.toByteArray(), 2)));
                                                serializedData.cleanup();
                                                bVar3 = bVar2;
                                                i2 = i3;
                                                arrayList2 = arrayList;
                                                a35Var3 = a35Var2;
                                            } catch (Exception e2) {
                                                e = e2;
                                                c.n("failed to save top-ups", e);
                                                cVar3.p.add(0, wallettransaction);
                                                if (nftitem3 != null) {
                                                }
                                                bVar2.k();
                                                bVar2.i();
                                                cVar3.a0();
                                                r7a B2 = r7a.B(i);
                                                if (user2 == null) {
                                                }
                                                r47Var = null;
                                                wallettransaction.localMessageId = r47Var == null ? 0 : r47Var.e1();
                                                pccVar4 = pccVar3;
                                                if (pccVar4 != null) {
                                                }
                                                pccVar5.a(null);
                                                tL_updateWalletGaslessInfo = cVar3.f;
                                                if (tL_updateWalletGaslessInfo != null) {
                                                }
                                                str6 = null;
                                                c.P("prepare sending");
                                                TL_wallet.nftItem nftitem62 = nftitem3;
                                                final byte b2 = 1;
                                                final m25 m25Var2 = new m25(cVar3, ao1Var, B2, r47Var, wallettransaction, str9, bVar2, nextLong, user2, a35Var2);
                                                WalletEngine2 walletEngine22 = cVar3.b;
                                                if (z45Var3 != null) {
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            bVar2 = bVar3;
                                            a35Var2 = a35Var3;
                                            c.n("failed to save top-ups", e);
                                            cVar3.p.add(0, wallettransaction);
                                            if (nftitem3 != null) {
                                            }
                                            bVar2.k();
                                            bVar2.i();
                                            cVar3.a0();
                                            r7a B22 = r7a.B(i);
                                            if (user2 == null) {
                                            }
                                            r47Var = null;
                                            wallettransaction.localMessageId = r47Var == null ? 0 : r47Var.e1();
                                            pccVar4 = pccVar3;
                                            if (pccVar4 != null) {
                                            }
                                            pccVar5.a(null);
                                            tL_updateWalletGaslessInfo = cVar3.f;
                                            if (tL_updateWalletGaslessInfo != null) {
                                            }
                                            str6 = null;
                                            c.P("prepare sending");
                                            TL_wallet.nftItem nftitem622 = nftitem3;
                                            final byte b22 = 1;
                                            final m25 m25Var22 = new m25(cVar3, ao1Var, B22, r47Var, wallettransaction, str9, bVar2, nextLong, user2, a35Var2);
                                            WalletEngine2 walletEngine222 = cVar3.b;
                                            if (z45Var3 != null) {
                                            }
                                        }
                                    }
                                    bVar2 = bVar3;
                                    a35Var2 = a35Var3;
                                    c.B().getSharedPreferences("gram_wallet_topups" + i, 0).edit().putString("list", jSONArray.toString()).apply();
                                } catch (Exception e4) {
                                    e = e4;
                                    nftitem3 = nftitem5;
                                }
                                cVar3.p.add(0, wallettransaction);
                                if (nftitem3 != null) {
                                    x25 A = cVar3.A();
                                    A.c.add(wallettransaction);
                                    A.j();
                                    A.g();
                                }
                                bVar2.k();
                                bVar2.i();
                                cVar3.a0();
                                r7a B222 = r7a.B(i);
                                if (user2 == null && user2.id != yac.h(i).e() && nftitem3 == null) {
                                    String str11 = wallettransaction.comment;
                                    boolean z = wallettransaction.comment_encrypted;
                                    boolean z2 = wallettransaction.comment_encrypted_preparing;
                                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                    int i4 = B222.getUserConfig().i();
                                    tL_messageService.id = i4;
                                    tL_messageService.local_id = i4;
                                    tL_messageService.random_id = nextLong;
                                    tL_messageService.dialog_id = user2.id;
                                    tL_messageService.out = true;
                                    tL_messageService.unread = true;
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_messageService.from_id = tL_peerUser;
                                    tL_peerUser.user_id = B222.getUserConfig().e();
                                    tL_messageService.flags |= 256;
                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                    tL_messageService.peer_id = tL_peerUser2;
                                    tL_peerUser2.user_id = user2.id;
                                    tL_messageService.date = B222.getConnectionsManager().getCurrentTime();
                                    tL_messageService.send_state = 1;
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = new TLRPC.TL_messageActionGramTransfer();
                                    tL_messageActionGramTransfer.amount = j3;
                                    tL_messageActionGramTransfer.peer_address = str9;
                                    tL_messageActionGramTransfer.transaction_id = "";
                                    tL_messageActionGramTransfer.comment = str11;
                                    tL_messageActionGramTransfer.comment_encrypted = z;
                                    tL_messageActionGramTransfer.comment_encrypted_preparing = z2;
                                    tL_messageService.action = tL_messageActionGramTransfer;
                                    B222.getUserConfig().u(false);
                                    r47 r47Var2 = new r47(B222.currentAccount, tL_messageService, false, true);
                                    r47Var2.X1 = true;
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(tL_messageService);
                                    B222.getMessagesStorage().g1(arrayList3, false, true, false, 0, false, 0, 0L);
                                    B222.getMessagesController().z5(0, user2.id, qd4.t(r47Var2));
                                    B222.getNotificationCenter().k(3, new Object[0]);
                                    B222.e0(tL_messageService, false);
                                    r47Var = r47Var2;
                                } else {
                                    r47Var = null;
                                }
                                wallettransaction.localMessageId = r47Var == null ? 0 : r47Var.e1();
                                pccVar4 = pccVar3;
                                if (pccVar4 != null) {
                                    pccVar4.a(wallettransaction);
                                }
                                pccVar5.a(null);
                                tL_updateWalletGaslessInfo = cVar3.f;
                                if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                    tL_updateWalletGaslessInfo2 = cVar3.f;
                                    if (tL_updateWalletGaslessInfo2.available) {
                                        str6 = tL_updateWalletGaslessInfo2.relayer_address;
                                        c.P("prepare sending");
                                        TL_wallet.nftItem nftitem6222 = nftitem3;
                                        final byte b222 = 1;
                                        final m25 m25Var222 = new m25(cVar3, ao1Var, B222, r47Var, wallettransaction, str9, bVar2, nextLong, user2, a35Var2);
                                        WalletEngine2 walletEngine2222 = cVar3.b;
                                        if (z45Var3 != null) {
                                            if (nftitem6222 == null) {
                                                walletEngine2222.prepareSend(c35Var, str9, j3, str8, bArr3, str6, m25Var222);
                                                return;
                                            } else {
                                                final byte b3 = 2;
                                                walletEngine2222.prepareSendNFT(c35Var, str9, nftitem6222.address, str8, new icc() { // from class: n25
                                                    @Override // icc
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b3;
                                                        m25 m25Var3 = m25Var222;
                                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                                        String str12 = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                m25Var3.a(sendtransfer, null, str12);
                                                                break;
                                                            case 1:
                                                                m25Var3.a(sendtransfer, null, str12);
                                                                break;
                                                            default:
                                                                m25Var3.a(sendtransfer, null, str12);
                                                                break;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        }
                                        z45 z45Var4 = z45Var2;
                                        if (z45Var4 == null) {
                                            walletEngine2222.prepareTonConnectTransfer(c35Var, z45Var3, qu6.n(nextLong, "deposit:"), new icc() { // from class: n25
                                                @Override // icc
                                                public final void a(Object obj4, Object obj5) {
                                                    byte b4 = b222;
                                                    m25 m25Var3 = m25Var222;
                                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                                    String str12 = (String) obj5;
                                                    switch (b4) {
                                                        case 0:
                                                            m25Var3.a(sendtransfer, null, str12);
                                                            break;
                                                        case 1:
                                                            m25Var3.a(sendtransfer, null, str12);
                                                            break;
                                                        default:
                                                            m25Var3.a(sendtransfer, null, str12);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        } else {
                                            final byte b4 = 0;
                                            walletEngine2222.prepareTonConnectTransferPair(c35Var, z45Var3, z45Var4, qu6.n(nextLong, "prepared:"), new icc() { // from class: n25
                                                @Override // icc
                                                public final void a(Object obj4, Object obj5) {
                                                    byte b42 = b4;
                                                    m25 m25Var3 = m25Var222;
                                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                                    String str12 = (String) obj5;
                                                    switch (b42) {
                                                        case 0:
                                                            m25Var3.a(sendtransfer, null, str12);
                                                            break;
                                                        case 1:
                                                            m25Var3.a(sendtransfer, null, str12);
                                                            break;
                                                        default:
                                                            m25Var3.a(sendtransfer, null, str12);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                }
                                str6 = null;
                                c.P("prepare sending");
                                TL_wallet.nftItem nftitem62222 = nftitem3;
                                final byte b2222 = 1;
                                final m25 m25Var2222 = new m25(cVar3, ao1Var, B222, r47Var, wallettransaction, str9, bVar2, nextLong, user2, a35Var2);
                                WalletEngine2 walletEngine22222 = cVar3.b;
                                if (z45Var3 != null) {
                                }
                            }
                        }
                        nftitem3 = nftitem5;
                        bVar2 = bVar3;
                        a35Var2 = a35Var3;
                        cVar3.p.add(0, wallettransaction);
                        if (nftitem3 != null) {
                        }
                        bVar2.k();
                        bVar2.i();
                        cVar3.a0();
                        r7a B2222 = r7a.B(i);
                        if (user2 == null) {
                        }
                        r47Var = null;
                        wallettransaction.localMessageId = r47Var == null ? 0 : r47Var.e1();
                        pccVar4 = pccVar3;
                        if (pccVar4 != null) {
                        }
                        pccVar5.a(null);
                        tL_updateWalletGaslessInfo = cVar3.f;
                        if (tL_updateWalletGaslessInfo != null) {
                            tL_updateWalletGaslessInfo2 = cVar3.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                            }
                        }
                        str6 = null;
                        c.P("prepare sending");
                        TL_wallet.nftItem nftitem622222 = nftitem3;
                        final byte b22222 = 1;
                        final m25 m25Var22222 = new m25(cVar3, ao1Var, B2222, r47Var, wallettransaction, str9, bVar2, nextLong, user2, a35Var2);
                        WalletEngine2 walletEngine222222 = cVar3.b;
                        if (z45Var3 != null) {
                        }
                    }
                });
                break;
        }
    }
}
