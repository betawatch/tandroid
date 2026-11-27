// default package

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nu0 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nu0(muc mucVar, c cVar, TLRPC.User user, String str) {
        this.a = (byte) 17;
        this.b = mucVar;
        this.c = cVar;
        this.e = user;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0673 A[Catch: Exception -> 0x0688, all -> 0x06f6, TRY_LEAVE, TryCatch #16 {all -> 0x06f6, blocks: (B:216:0x055c, B:219:0x0560, B:233:0x05ab, B:234:0x05ae, B:239:0x05a0, B:242:0x05b8, B:260:0x0610, B:261:0x0613, B:263:0x0624, B:266:0x0628, B:279:0x065f, B:280:0x0662, B:282:0x0673, B:285:0x0677, B:292:0x0681), top: B:215:0x055c }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0726 A[Catch: all -> 0x0748, TryCatch #7 {all -> 0x0748, blocks: (B:333:0x0718, B:336:0x072a, B:350:0x0726), top: B:332:0x0718 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0756  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2;
        byte[][] bArr3;
        byte[] c;
        char c2;
        char c3;
        SerializedData serializedData;
        byte[] bArr4;
        Long l;
        Long l2;
        Long l3;
        int i;
        String str3;
        String str4;
        AlertDialog$Builder alertDialog$Builder;
        r47 r47Var;
        str = "NULL_ERROR";
        int i2 = 0;
        switch (this.a) {
            case 0:
                rv0 rv0Var = (rv0) this.b;
                pv0 pv0Var = (pv0) this.c;
                String str5 = (String) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    vnb vnbVar = rv0Var.e;
                    if (tL_error != null) {
                        new d31(rv0Var, vnbVar).g0(tL_error, false);
                        rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str5, "req_id"));
                        return;
                    } else {
                        new d31(rv0Var, vnbVar).f0("UNKNOWN_BUTTON", false);
                        rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str5, "req_id"));
                        return;
                    }
                }
                uc7.s1(rv0Var.N).Y3(updates, false);
                rv0Var.u(pv0Var, "requested_chat_sent", rv0.x(str5, "req_id"));
                long j = rv0Var.V.id;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                ru0 ru0Var = new ru0(rv0Var, bundle, user, j);
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ru0Var);
                }
                uu0 uu0Var = rv0Var.c;
                if (uu0Var != null) {
                    uu0Var.b();
                    return;
                }
                return;
            case 1:
                ov4 ov4Var = (ov4) this.b;
                ky kyVar = (ky) this.c;
                lv4 lv4Var = (lv4) this.d;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) this.e;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    kyVar.a(Boolean.FALSE, tL_error2.text);
                    lv4Var.f = false;
                    return;
                } else if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    kyVar.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                    lv4Var.f = false;
                    return;
                } else {
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                    tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                    ov4Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new ic((byte) 0), new p((Object) ov4Var, (Object) lv4Var, (Object) kyVar, (byte) 10));
                    return;
                }
            case 2:
                c cVar = (c) this.b;
                v25 v25Var = (v25) this.c;
                String str6 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        v25Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (cVar.Q.get(str6) == v25Var) {
                            cVar.y0(v25Var);
                            cVar.T();
                        }
                    } catch (Exception e) {
                        c.n("failed to get balance of " + str6, e);
                    }
                }
                runnable.run();
                return;
            case 3:
                ((c) this.b).e0((c35) this.c, true, new nu0(this.d, obj2, this.e, obj, (byte) 5));
                return;
            case 4:
                c cVar2 = (c) this.b;
                rx1 rx1Var = (rx1) this.c;
                c35 c35Var = (c35) this.d;
                byte[] bArr5 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error3 == null || (str3 = tL_error3.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    c.m("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error3 != null && (str4 = tL_error3.text) != null) {
                        str = str4;
                    }
                    rx1Var.a(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    c.m("enable backup: expected three backup holders");
                    rx1Var.a("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr6 = new byte[size][];
                try {
                    c = c35Var.c();
                    try {
                        bArr2 = c.b0(c);
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "NULL_ERROR";
                        bArr = c;
                        bArr2 = null;
                        bArr3 = null;
                        try {
                            c.n("enable backup", e);
                            rx1Var.a(e.getMessage() == null ? str2 : e.getMessage());
                            byte b = 0;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            byte b2 = 0;
                            if (bArr != null) {
                                Arrays.fill(bArr, (byte) 0);
                            }
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (bArr3 != null) {
                                int length = bArr3.length;
                                int i3 = 0;
                                while (i3 < length) {
                                    Arrays.fill(bArr3[i3], b2);
                                    i3++;
                                    b2 = 0;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bArr = c;
                        bArr2 = null;
                        bArr3 = null;
                        byte b22 = 0;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th3) {
                    th = th3;
                    bArr = null;
                }
                try {
                    bArr3 = c.q0(bArr2, new SecureRandom());
                    try {
                        try {
                        } catch (Exception e4) {
                            e = e4;
                            str2 = "NULL_ERROR";
                        }
                        try {
                            if (f11.a) {
                                c2 = 2;
                                byte[] bArr7 = new byte[jn7.r3];
                                try {
                                    int length2 = bArr3.length;
                                    c3 = 1;
                                    int i4 = 0;
                                    while (i4 < length2) {
                                        byte[] bArr8 = bArr3[i4];
                                        String str7 = str;
                                        while (i2 < bArr8.length) {
                                            try {
                                                bArr7[i2] = (byte) (bArr7[i2] ^ bArr8[i2]);
                                                i2++;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Arrays.fill(bArr7, (byte) 0);
                                                throw th;
                                            }
                                        }
                                        i4++;
                                        str = str7;
                                        i2 = 0;
                                    }
                                    c.P("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr7));
                                    Arrays.fill(bArr7, (byte) 0);
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                c2 = 2;
                                c3 = 1;
                            }
                            int i5 = 0;
                            while (i5 < size) {
                                TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i5);
                                SerializedData serializedData2 = new SerializedData();
                                try {
                                    TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                    mnemonic_decryptedkeypart.share = bArr3[i5];
                                    mnemonic_decryptedkeypart.serializeToStream(serializedData2);
                                    byte[] byteArray = serializedData2.toByteArray();
                                    byte[][] bArr9 = bArr6;
                                    try {
                                        long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                                        l2 = Long.valueOf(key_generate_temporary_private_key);
                                        int i6 = i5;
                                        try {
                                            byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                                            serializedData = serializedData2;
                                            try {
                                                long key_from_public_key = ConferenceCall.key_from_public_key(holderdc.public_key);
                                                l3 = Long.valueOf(key_from_public_key);
                                                try {
                                                    long key_from_ecdh = ConferenceCall.key_from_ecdh(key_generate_temporary_private_key, key_from_public_key);
                                                    Long valueOf = Long.valueOf(key_from_ecdh);
                                                    try {
                                                        byte[] encrypt_message_for_one = ConferenceCall.encrypt_message_for_one(key_from_ecdh, byteArray);
                                                        byte[] bArr10 = new byte[encrypt_message_for_one.length + 32];
                                                        System.arraycopy(key_to_public_key, 0, bArr10, 0, 32);
                                                        System.arraycopy(encrypt_message_for_one, 0, bArr10, 32, encrypt_message_for_one.length);
                                                        bArr9[i6] = bArr10;
                                                        if (byteArray != null) {
                                                            Arrays.fill(byteArray, (byte) 0);
                                                        }
                                                        serializedData.cleanup();
                                                        Long[] lArr = new Long[3];
                                                        lArr[0] = valueOf;
                                                        lArr[c3] = l3;
                                                        lArr[c2] = l2;
                                                        int i7 = 0;
                                                        for (int i8 = 3; i7 < i8; i8 = 3) {
                                                            Long l4 = lArr[i7];
                                                            if (l4 != null) {
                                                                try {
                                                                    ConferenceCall.key_destroy(l4.longValue());
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                            i7++;
                                                        }
                                                        i5 = i6 + 1;
                                                        bArr6 = bArr9;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bArr4 = byteArray;
                                                        l = valueOf;
                                                        if (bArr4 != null) {
                                                        }
                                                        serializedData.cleanup();
                                                        Long[] lArr2 = new Long[3];
                                                        lArr2[0] = l;
                                                        lArr2[c3] = l3;
                                                        lArr2[c2] = l2;
                                                        while (i < 3) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    bArr4 = byteArray;
                                                    l = null;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                bArr4 = byteArray;
                                                l = null;
                                                l3 = null;
                                                if (bArr4 != null) {
                                                    Arrays.fill(bArr4, (byte) 0);
                                                }
                                                serializedData.cleanup();
                                                Long[] lArr22 = new Long[3];
                                                lArr22[0] = l;
                                                lArr22[c3] = l3;
                                                lArr22[c2] = l2;
                                                for (i = 0; i < 3; i++) {
                                                    Long l5 = lArr22[i];
                                                    if (l5 != null) {
                                                        try {
                                                            ConferenceCall.key_destroy(l5.longValue());
                                                        } catch (Exception unused2) {
                                                        }
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            serializedData = serializedData2;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        serializedData = serializedData2;
                                        bArr4 = byteArray;
                                        l = null;
                                        l2 = null;
                                        l3 = null;
                                        if (bArr4 != null) {
                                        }
                                        serializedData.cleanup();
                                        Long[] lArr222 = new Long[3];
                                        lArr222[0] = l;
                                        lArr222[c3] = l3;
                                        lArr222[c2] = l2;
                                        while (i < 3) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    serializedData = serializedData2;
                                    bArr4 = null;
                                }
                            }
                            byte[][] bArr11 = bArr6;
                            byte b3 = 0;
                            Arrays.fill(c, (byte) 0);
                            Arrays.fill(bArr2, (byte) 0);
                            int length3 = bArr3.length;
                            int i9 = 0;
                            while (i9 < length3) {
                                Arrays.fill(bArr3[i9], b3);
                                i9++;
                                b3 = 0;
                            }
                            for (int i10 = 0; i10 < size; i10++) {
                                if (bArr11[i10] == null) {
                                    c.m("part " + i10 + " is null");
                                    rx1Var.a("PART_" + i10 + "_NULL");
                                    return;
                                }
                            }
                            TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                            enablebackup.parts = new ArrayList<>(Arrays.asList(bArr11));
                            enablebackup.new_public_key = bArr5;
                            cVar2.e0(c35Var, false, new p((Object) cVar2, (Object) rx1Var, (Object) enablebackup, (byte) 17));
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            bArr = c;
                            c.n("enable backup", e);
                            rx1Var.a(e.getMessage() == null ? str2 : e.getMessage());
                            byte b4 = 0;
                            if (bArr != null) {
                                Arrays.fill(bArr, (byte) 0);
                            }
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (bArr3 != null) {
                                int length4 = bArr3.length;
                                int i11 = 0;
                                while (i11 < length4) {
                                    Arrays.fill(bArr3[i11], b4);
                                    i11++;
                                    b4 = 0;
                                }
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        bArr = c;
                        byte b222 = 0;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    str2 = "NULL_ERROR";
                    bArr = c;
                    bArr3 = null;
                    c.n("enable backup", e);
                    rx1Var.a(e.getMessage() == null ? str2 : e.getMessage());
                    byte b42 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                } catch (Throwable th13) {
                    th = th13;
                    bArr = c;
                    bArr3 = null;
                    byte b2222 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                    throw th;
                }
                break;
            case 5:
                pcc pccVar = (pcc) this.b;
                pcc pccVar2 = (pcc) this.c;
                byte[] bArr12 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str8 = (String) obj2;
                if (importedWalletProof == null) {
                    pccVar.a(str8 != null ? str8 : "NULL_ERROR");
                    pccVar2.a(null);
                    return;
                }
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                TL_wallet.inputWalletImported inputwalletimported = new TL_wallet.inputWalletImported();
                inputwalletimported.public_key = importedWalletProof.publicKey;
                inputwalletimported.anchor_public_key = bArr12;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                inputwalletimported.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                replacewallet.wallet = inputwalletimported;
                replacewallet.password = inputCheckPasswordSRP;
                pccVar2.a(replacewallet);
                return;
            case 6:
                u25 u25Var = (u25) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str9 = (String) this.d;
                icc iccVar = (icc) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str10 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str9;
                    wallettransaction.date = ConnectionsManager.getInstance(u25Var.h.a).getCurrentTime();
                }
                if (u25Var.a) {
                    return;
                }
                iccVar.a(wallettransaction, str10);
                return;
            case 7:
                b bVar = (b) this.b;
                String str11 = (String) this.d;
                String str12 = (String) this.c;
                String str13 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                bVar.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || uc7.s1(bVar.m.a).X1(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = bVar.b;
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                    if (TextUtils.equals(wallettransaction2.id, str11) && (wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerAddress)) {
                        TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                        wallettransactionpeeruser.user_id = walletuseraddress.user_id;
                        wallettransactionpeeruser.address = str12;
                        wallettransactionpeeruser.domain = str13;
                        wallettransaction2.peer = wallettransactionpeeruser;
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    bVar.k();
                    bVar.i();
                    return;
                }
                return;
            case 8:
                a55 a55Var = (a55) this.b;
                w45 w45Var = (w45) this.c;
                c35 c35Var2 = (c35) this.d;
                v35 v35Var = (v35) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (a55Var.A(w45Var) && !a55Var.i(w45Var)) {
                            a55Var.y(w45Var, c35Var2, new JSONObject().put("internalBoc", str14), -1, null, v35Var);
                            return;
                        }
                    } catch (JSONException e7) {
                        a55Var.y(w45Var, c35Var2, null, 0, a55.h("sign message response", e7), v35Var);
                        return;
                    }
                }
                if (str15 == null) {
                    str15 = "Request expired or wallet changed";
                }
                a55Var.y(w45Var, c35Var2, null, 0, str15, v35Var);
                return;
            case 9:
                a55 a55Var2 = (a55) this.b;
                w45 w45Var2 = (w45) this.c;
                c35 c35Var3 = (c35) this.d;
                pcc pccVar3 = (pcc) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str16 = (String) obj2;
                if (sendtransfer != null && str16 == null && a55Var2.A(w45Var2) && !a55Var2.i(w45Var2)) {
                    Utilities.e.c(new tw4((Object) a55Var2, (Object) sendtransfer, (Object) w45Var2, (Object) pccVar3, (Object) c35Var3, (byte) 3));
                    return;
                }
                if (str16 == null) {
                    str16 = "Transfer unavailable or request expired";
                }
                a55Var2.y(w45Var2, c35Var3, null, 0, str16, pccVar3);
                return;
            case 10:
                v35 v35Var2 = (v35) this.b;
                c35 c35Var4 = (c35) this.c;
                w45 w45Var3 = (w45) this.d;
                s45 s45Var = (s45) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error4 != null) {
                    v35Var2.a(a55.z(tL_error4, "registerKey"));
                    return;
                } else {
                    Utilities.e.c(new tw4((Object) c35Var4, (Object) w45Var3, (Object) tonconnectchallenge, (Object) v35Var2, (Object) s45Var, (byte) 2));
                    return;
                }
            case 11:
                ls6 ls6Var = (ls6) this.b;
                js6 js6Var = (js6) this.c;
                ks6 ks6Var = (ks6) this.d;
                pcc pccVar4 = (pcc) this.e;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                ls6Var.S1.remove(js6Var);
                if (ks6Var == null) {
                    ks6Var = new ks6();
                }
                ArrayList arrayList2 = ks6Var.a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList2.addAll(tL_messages_foundStickers.stickers);
                    ks6Var.b = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
                }
                ls6Var.T1.put(js6Var, ks6Var);
                pccVar4.a(arrayList2);
                return;
            case 12:
                ls6 ls6Var2 = (ls6) this.b;
                String str17 = (String) this.d;
                pcc pccVar5 = (pcc) this.c;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                ls6Var2.J0.remove(str17);
                if (pccVar5 != null) {
                    pccVar5.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        ls6Var2.J.k(stickerSet.id, tL_messages_stickerSet);
                        ls6Var2.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
                            ls6Var2.P = tL_messages_stickerSet;
                            ls6Var2.Q = tL_messages_stickerSet;
                        }
                    }
                    ls6Var2.X1(tL_messages_stickerSet);
                    ls6Var2.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                    return;
                }
                return;
            case 13:
                id idVar = (id) this.b;
                x35 x35Var = (x35) this.c;
                String str18 = (String) this.d;
                vnb vnbVar2 = (vnb) this.e;
                idVar.dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    x35Var.run();
                    return;
                }
                nx0 nx0Var = uq7.a;
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    uq7.a = null;
                }
                uq7.a().I(R.raw.error, ob6.M0(2131753121, null), TextUtils.isEmpty(str18) ? ob6.M0(2131753122, null) : hl.L2(aob.v0(aob.xj, vnbVar2), ob6.a0(null, null, 2131753123, str18))).j();
                return;
            case 14:
                wua wuaVar = (wua) this.b;
                icc iccVar2 = (icc) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (updates2 == null) {
                    if (tL_error5 != null) {
                        if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error5.text)) {
                            alertDialog$Builder = new AlertDialog$Builder(0, new x53(), wuaVar.getContext());
                            alertDialog$Builder.a.S = ob6.M0(2131749701, null);
                            alertDialog$Builder.a.U = hl.S2(ob6.M0(2131749703, null));
                        } else {
                            String str19 = tL_error5.text;
                            if (str19 == null || !str19.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                                wuaVar.j().g0(tL_error5, false);
                                runnable2.run();
                                return;
                            } else {
                                long parseLong = Long.parseLong(tL_error5.text.substring(25)) + ConnectionsManager.getInstance(wuaVar.a).getCurrentTime();
                                alertDialog$Builder = new AlertDialog$Builder(0, new x53(), wuaVar.getContext());
                                alertDialog$Builder.a.S = ob6.M0(2131749701, null);
                                alertDialog$Builder.a.U = hl.S2(ob6.a0(null, null, 2131749702, ob6.x(parseLong, true)));
                            }
                        }
                        c00.u(null, 2131747558, alertDialog$Builder, null);
                        runnable2.run();
                        return;
                    }
                    return;
                }
                ArrayList y0 = uc7.y0(updates2, TL_update.TL_updateNewMessage.class);
                int size3 = y0.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj4 = y0.get(i13);
                        i13++;
                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj4).message;
                        if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                            r47Var = new r47(wuaVar.a, message, false, false);
                        }
                    } else {
                        r47Var = null;
                    }
                }
                uc7.s1(wuaVar.a).Y3(updates2, false);
                if (r47Var != null) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) r47Var.k.action).gift;
                    iccVar2.a(starGift, new vp8((Object) wuaVar, (Object) r47Var, (Object) arrayList3, (Object) starGift, (byte) 28));
                    return;
                }
                iccVar2.a(null, null);
                jxa.v(wuaVar.a, false).L();
                axa D = jxa.v(wuaVar.a, false).D(yac.h(wuaVar.a).e(), false);
                if (D != null) {
                    D.l(arrayList3, null);
                    return;
                }
                return;
            case 15:
                wua wuaVar2 = (wua) this.b;
                l01 l01Var = (l01) this.c;
                bx4 bx4Var = (bx4) this.d;
                hsa hsaVar = (hsa) this.e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    hsaVar.a(stargiftdepositpayload);
                    return;
                } else {
                    l01Var.b();
                    (bx4Var != null ? new d31(bx4Var.c, wuaVar2.J0) : wuaVar2.j()).g0(tL_error6, false);
                    return;
                }
            case 16:
                boolean[] zArr = (boolean[]) this.b;
                jl7[] jl7VarArr = (jl7[]) this.c;
                vnb vnbVar3 = (vnb) this.d;
                tpa tpaVar = (tpa) this.e;
                String str20 = (String) obj;
                String str21 = (String) obj2;
                zArr[0] = false;
                if (str21 != null) {
                    new d31(jl7VarArr[0].F, vnbVar3).f0(str21, false);
                    return;
                }
                tpaVar.setPadding(hl.L(19.0f), hl.L(9.0f), hl.L(15.0f), hl.L(8.0f));
                SpannableString spannableString = new SpannableString(str20);
                rmb rmbVar = new rmb();
                rmbVar.a |= 256;
                spannableString.setSpan(new smb(rmbVar, 0), 0, spannableString.length(), 33);
                tpaVar.setText(spannableString);
                tpaVar.setTextIsSelectable(true);
                tpaVar.setOnClickListener(null);
                tpaVar.setStateListAnimator(null);
                if (tpaVar.d || tpaVar.f) {
                    return;
                }
                tpaVar.e = true;
                if (tpaVar.getLayout() == null || tpaVar.isLayoutRequested()) {
                    return;
                }
                tpaVar.c((tpaVar.getWidth() / 2.0f) - tpaVar.getPaddingLeft(), ((tpaVar.getHeight() / 2.0f) - tpaVar.getPaddingTop()) + tpaVar.getScrollY());
                return;
            default:
                ((muc) this.b).g0((c) this.c, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ nu0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ nu0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }
}
