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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu0 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eu0(ypc ypcVar, c cVar, TLRPC.User user, String str) {
        this.a = (byte) 17;
        this.b = ypcVar;
        this.c = cVar;
        this.e = user;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0671 A[Catch: Exception -> 0x0686, all -> 0x06f4, TRY_LEAVE, TryCatch #15 {all -> 0x06f4, blocks: (B:216:0x055a, B:219:0x055e, B:233:0x05a9, B:234:0x05ac, B:239:0x059e, B:242:0x05b6, B:260:0x060e, B:261:0x0611, B:263:0x0622, B:266:0x0626, B:279:0x065d, B:280:0x0660, B:282:0x0671, B:285:0x0675, B:292:0x067f), top: B:215:0x055a }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0724 A[Catch: all -> 0x0746, TryCatch #5 {all -> 0x0746, blocks: (B:333:0x0716, B:336:0x0728, B:350:0x0724), top: B:332:0x0716 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0754  */
    @Override // i8c
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
        k27 k27Var;
        str = "NULL_ERROR";
        int i2 = 0;
        switch (this.a) {
            case 0:
                hv0 hv0Var = (hv0) this.b;
                ev0 ev0Var = (ev0) this.c;
                String str5 = (String) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    wjb wjbVar = hv0Var.e;
                    if (tL_error != null) {
                        new u21(hv0Var, wjbVar).g0(tL_error, false);
                        hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str5, "req_id"));
                        return;
                    } else {
                        new u21(hv0Var, wjbVar).f0("UNKNOWN_BUTTON", false);
                        hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str5, "req_id"));
                        return;
                    }
                }
                na7.q1(hv0Var.N).R3(updates, false);
                hv0Var.u(ev0Var, "requested_chat_sent", hv0.x(str5, "req_id"));
                long j = hv0Var.V.id;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                iu0 iu0Var = new iu0(hv0Var, bundle, user, j);
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(iu0Var);
                }
                ku0 ku0Var = hv0Var.c;
                if (ku0Var != null) {
                    ku0Var.b();
                    return;
                }
                return;
            case 1:
                kt4 kt4Var = (kt4) this.b;
                jy jyVar = (jy) this.c;
                ht4 ht4Var = (ht4) this.d;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) this.e;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    jyVar.a(Boolean.FALSE, tL_error2.text);
                    ht4Var.f = false;
                    return;
                }
                byte b = 0;
                if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    jyVar.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                    ht4Var.f = false;
                    return;
                } else {
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                    tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                    kt4Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new hc(b), new p((Object) kt4Var, (Object) ht4Var, (Object) jyVar, (byte) 9));
                    return;
                }
            case 2:
                c cVar = (c) this.b;
                r05 r05Var = (r05) this.c;
                String str6 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        r05Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (cVar.Q.get(str6) == r05Var) {
                            cVar.v0(r05Var);
                            cVar.S();
                        }
                    } catch (Exception e) {
                        c.n("failed to get balance of " + str6, e);
                    }
                }
                runnable.run();
                return;
            case 3:
                ((c) this.b).c0((y05) this.c, true, new eu0(this.d, obj2, this.e, obj, (byte) 5));
                return;
            case 4:
                c cVar2 = (c) this.b;
                pz1 pz1Var = (pz1) this.c;
                y05 y05Var = (y05) this.d;
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
                    pz1Var.a(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    c.m("enable backup: expected three backup holders");
                    pz1Var.a("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr6 = new byte[size][];
                try {
                    c = y05Var.c();
                    try {
                        bArr2 = c.a0(c);
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "NULL_ERROR";
                        bArr = c;
                        bArr2 = null;
                        bArr3 = null;
                        try {
                            c.n("enable backup", e);
                            pz1Var.a(e.getMessage() == null ? str2 : e.getMessage());
                            byte b2 = 0;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            byte b3 = 0;
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
                                    Arrays.fill(bArr3[i3], b3);
                                    i3++;
                                    b3 = 0;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bArr = c;
                        bArr2 = null;
                        bArr3 = null;
                        byte b32 = 0;
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
                    bArr3 = c.o0(bArr2, new SecureRandom());
                    try {
                        try {
                        } catch (Exception e4) {
                            e = e4;
                            str2 = "NULL_ERROR";
                        }
                        try {
                            if (w01.a) {
                                c2 = 2;
                                byte[] bArr7 = new byte[kk7.r3];
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
                                    c.O("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr7));
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
                            byte b4 = 0;
                            Arrays.fill(c, (byte) 0);
                            Arrays.fill(bArr2, (byte) 0);
                            int length3 = bArr3.length;
                            int i9 = 0;
                            while (i9 < length3) {
                                Arrays.fill(bArr3[i9], b4);
                                i9++;
                                b4 = 0;
                            }
                            for (int i10 = 0; i10 < size; i10++) {
                                if (bArr11[i10] == null) {
                                    c.m("part " + i10 + " is null");
                                    pz1Var.a("PART_" + i10 + "_NULL");
                                    return;
                                }
                            }
                            TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                            enablebackup.parts = new ArrayList<>(Arrays.asList(bArr11));
                            enablebackup.new_public_key = bArr5;
                            cVar2.c0(y05Var, false, new p((Object) cVar2, (Object) pz1Var, (Object) enablebackup, (byte) 17));
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            bArr = c;
                            c.n("enable backup", e);
                            pz1Var.a(e.getMessage() == null ? str2 : e.getMessage());
                            byte b22 = 0;
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
                                    Arrays.fill(bArr3[i11], b22);
                                    i11++;
                                    b22 = 0;
                                }
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        bArr = c;
                        byte b322 = 0;
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
                    pz1Var.a(e.getMessage() == null ? str2 : e.getMessage());
                    byte b222 = 0;
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
                    byte b3222 = 0;
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
                p8c p8cVar = (p8c) this.b;
                p8c p8cVar2 = (p8c) this.c;
                byte[] bArr12 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str8 = (String) obj2;
                if (importedWalletProof == null) {
                    p8cVar.a(str8 != null ? str8 : "NULL_ERROR");
                    p8cVar2.a(null);
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
                p8cVar2.a(replacewallet);
                return;
            case 6:
                q05 q05Var = (q05) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str9 = (String) this.d;
                i8c i8cVar = (i8c) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str10 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str9;
                    wallettransaction.date = ConnectionsManager.getInstance(q05Var.h.a).getCurrentTime();
                }
                if (q05Var.a) {
                    return;
                }
                i8cVar.a(wallettransaction, str10);
                return;
            case 7:
                b bVar = (b) this.b;
                String str11 = (String) this.d;
                String str12 = (String) this.c;
                String str13 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                bVar.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || na7.q1(bVar.m.a).V1(Long.valueOf(walletuseraddress.user_id)) == null) {
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
                x15 x15Var = (x15) this.b;
                y05 y05Var2 = (y05) this.c;
                s25 s25Var = (s25) this.d;
                m25 m25Var = (m25) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error4 != null) {
                    x15Var.a(w25.z(tL_error4, "registerKey"));
                    return;
                } else {
                    Utilities.e.c(new vz4(y05Var2, s25Var, tonconnectchallenge, x15Var, m25Var));
                    return;
                }
            case 9:
                w25 w25Var = (w25) this.b;
                s25 s25Var2 = (s25) this.c;
                y05 y05Var3 = (y05) this.d;
                p8c p8cVar3 = (p8c) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str14 = (String) obj2;
                if (sendtransfer != null && str14 == null && w25Var.A(s25Var2) && !w25Var.i(s25Var2)) {
                    Utilities.e.c(new vz4(w25Var, sendtransfer, s25Var2, p8cVar3, y05Var3));
                    return;
                }
                if (str14 == null) {
                    str14 = "Transfer unavailable or request expired";
                }
                w25Var.y(s25Var2, y05Var3, null, 0, str14, p8cVar3);
                return;
            case 10:
                w25 w25Var2 = (w25) this.b;
                s25 s25Var3 = (s25) this.c;
                y05 y05Var4 = (y05) this.d;
                x15 x15Var2 = (x15) this.e;
                String str15 = (String) obj;
                String str16 = (String) obj2;
                if (str15 != null) {
                    try {
                        if (w25Var2.A(s25Var3) && !w25Var2.i(s25Var3)) {
                            w25Var2.y(s25Var3, y05Var4, new JSONObject().put("internalBoc", str15), -1, null, x15Var2);
                            return;
                        }
                    } catch (JSONException e7) {
                        w25Var2.y(s25Var3, y05Var4, null, 0, w25.h("sign message response", e7), x15Var2);
                        return;
                    }
                }
                if (str16 == null) {
                    str16 = "Request expired or wallet changed";
                }
                w25Var2.y(s25Var3, y05Var4, null, 0, str16, x15Var2);
                return;
            case 11:
                hq6 hq6Var = (hq6) this.b;
                fq6 fq6Var = (fq6) this.c;
                gq6 gq6Var = (gq6) this.d;
                p8c p8cVar4 = (p8c) this.e;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                hq6Var.S1.remove(fq6Var);
                if (gq6Var == null) {
                    gq6Var = new gq6();
                }
                ArrayList arrayList2 = gq6Var.a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList2.addAll(tL_messages_foundStickers.stickers);
                    gq6Var.b = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
                }
                hq6Var.T1.put(fq6Var, gq6Var);
                p8cVar4.a(arrayList2);
                return;
            case 12:
                hq6 hq6Var2 = (hq6) this.b;
                String str17 = (String) this.d;
                p8c p8cVar5 = (p8c) this.c;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                hq6Var2.J0.remove(str17);
                if (p8cVar5 != null) {
                    p8cVar5.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        hq6Var2.J.k(tL_messages_stickerSet, stickerSet.id);
                        hq6Var2.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
                            hq6Var2.P = tL_messages_stickerSet;
                            hq6Var2.Q = tL_messages_stickerSet;
                        }
                    }
                    hq6Var2.X1(tL_messages_stickerSet);
                    hq6Var2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                    return;
                }
                return;
            case 13:
                hd hdVar = (hd) this.b;
                r15 r15Var = (r15) this.c;
                String str18 = (String) this.d;
                wjb wjbVar2 = (wjb) this.e;
                hdVar.dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    r15Var.run();
                    return;
                }
                fx0 fx0Var = un7.a;
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    un7.a = null;
                }
                un7.a().I(R.raw.error, k96.M0(2131753125, null), TextUtils.isEmpty(str18) ? k96.M0(2131753126, null) : gl.L2(bkb.v0(bkb.wj, wjbVar2), k96.a0(null, null, 2131753127, str18))).j();
                return;
            case 14:
                vqa vqaVar = (vqa) this.b;
                i8c i8cVar2 = (i8c) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (updates2 == null) {
                    if (tL_error5 != null) {
                        if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error5.text)) {
                            alertDialog$Builder = new AlertDialog$Builder(0, new f53(), vqaVar.getContext());
                            alertDialog$Builder.a.S = k96.M0(2131749739, null);
                            alertDialog$Builder.a.U = gl.S2(k96.M0(2131749741, null));
                        } else {
                            String str19 = tL_error5.text;
                            if (str19 == null || !str19.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                                vqaVar.j().g0(tL_error5, false);
                                runnable2.run();
                                return;
                            } else {
                                long parseLong = Long.parseLong(tL_error5.text.substring(25)) + ConnectionsManager.getInstance(vqaVar.a).getCurrentTime();
                                alertDialog$Builder = new AlertDialog$Builder(0, new f53(), vqaVar.getContext());
                                alertDialog$Builder.a.S = k96.M0(2131749739, null);
                                alertDialog$Builder.a.U = gl.S2(k96.a0(null, null, 2131749740, k96.x(parseLong, true)));
                            }
                        }
                        b00.t(null, 2131747638, alertDialog$Builder, null);
                        runnable2.run();
                        return;
                    }
                    return;
                }
                ArrayList w0 = na7.w0(updates2, TL_update.TL_updateNewMessage.class);
                int size3 = w0.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj4 = w0.get(i13);
                        i13++;
                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj4).message;
                        if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                            k27Var = new k27(vqaVar.a, message, false, false);
                        }
                    } else {
                        k27Var = null;
                    }
                }
                na7.q1(vqaVar.a).R3(updates2, false);
                if (k27Var != null) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) k27Var.k.action).gift;
                    i8cVar2.a(starGift, new bm8((Object) vqaVar, (Object) k27Var, (Object) arrayList3, (Object) starGift, (byte) 27));
                    return;
                }
                i8cVar2.a(null, null);
                gta.v(vqaVar.a, false).L();
                xsa D = gta.v(vqaVar.a, false).D(y6c.h(vqaVar.a).e(), false);
                if (D != null) {
                    D.l(arrayList3, null);
                    return;
                }
                return;
            case 15:
                vqa vqaVar2 = (vqa) this.b;
                c01 c01Var = (c01) this.c;
                xu4 xu4Var = (xu4) this.d;
                hoa hoaVar = (hoa) this.e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    hoaVar.a(stargiftdepositpayload);
                    return;
                } else {
                    c01Var.b();
                    (xu4Var != null ? new u21(xu4Var.c, vqaVar2.J0) : vqaVar2.j()).g0(tL_error6, false);
                    return;
                }
            case 16:
                boolean[] zArr = (boolean[]) this.b;
                cj7[] cj7VarArr = (cj7[]) this.c;
                wjb wjbVar3 = (wjb) this.d;
                wla wlaVar = (wla) this.e;
                String str20 = (String) obj;
                String str21 = (String) obj2;
                zArr[0] = false;
                if (str21 != null) {
                    new u21(cj7VarArr[0].F, wjbVar3).f0(str21, false);
                    return;
                }
                wlaVar.setPadding(gl.L(19.0f), gl.L(9.0f), gl.L(15.0f), gl.L(8.0f));
                SpannableString spannableString = new SpannableString(str20);
                vib vibVar = new vib();
                vibVar.a |= 256;
                spannableString.setSpan(new wib(vibVar, 0), 0, spannableString.length(), 33);
                wlaVar.setText(spannableString);
                wlaVar.setTextIsSelectable(true);
                wlaVar.setOnClickListener(null);
                wlaVar.setStateListAnimator(null);
                if (wlaVar.d || wlaVar.f) {
                    return;
                }
                wlaVar.e = true;
                if (wlaVar.getLayout() == null || wlaVar.isLayoutRequested()) {
                    return;
                }
                wlaVar.c((wlaVar.getWidth() / 2.0f) - wlaVar.getPaddingLeft(), ((wlaVar.getHeight() / 2.0f) - wlaVar.getPaddingTop()) + wlaVar.getScrollY());
                return;
            default:
                ((ypc) this.b).g0((c) this.c, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ eu0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ eu0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }
}
