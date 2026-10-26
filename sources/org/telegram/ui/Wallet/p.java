package org.telegram.ui.Wallet;

import android.text.SpannableString;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.o01;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045b A[Catch: all -> 0x037e, Exception -> 0x0382, TRY_LEAVE, TryCatch #20 {Exception -> 0x0382, blocks: (B:155:0x0386, B:156:0x0389, B:161:0x037a, B:164:0x0395, B:185:0x03f0, B:186:0x03f3, B:188:0x0404, B:204:0x0447, B:205:0x044a, B:207:0x045b, B:217:0x0469), top: B:138:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ff A[Catch: all -> 0x0521, TryCatch #1 {all -> 0x0521, blocks: (B:262:0x04f1, B:265:0x0503, B:279:0x04ff), top: B:261:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x052f  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2;
        byte[][] bArr3;
        byte[] c10;
        char c11;
        SerializedData serializedData;
        char c12;
        byte[] bArr4;
        Long l4;
        Long l10;
        Long l11;
        int i10;
        byte[] byteArray;
        byte[][] bArr5;
        int i11;
        byte[] key_to_public_key;
        long key_from_ecdh;
        Long valueOf;
        String str3;
        String str4;
        str = "NULL_ERROR";
        boolean z10 = false;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.b;
                c0 c0Var = (c0) this.c;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        c0Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (l0Var.N.get(str5) == c0Var) {
                            l0Var.h0(c0Var);
                            l0Var.J();
                        }
                    } catch (Exception e) {
                        l0.j("failed to get balance of " + str5, e);
                    }
                }
                runnable.run();
                return;
            case 1:
                l0 l0Var2 = (l0) this.b;
                s sVar = (s) this.c;
                i0 i0Var = (i0) this.d;
                byte[] bArr6 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error == null || (str3 = tL_error.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    l0.i("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error != null && (str4 = tL_error.text) != null) {
                        str = str4;
                    }
                    sVar.run(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    l0.i("enable backup: expected three backup holders");
                    sVar.run("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr7 = new byte[size][];
                try {
                    c10 = i0Var.c();
                } catch (Exception e10) {
                    e = e10;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                }
                try {
                    bArr2 = l0.R(c10);
                    try {
                        bArr3 = l0.c0(bArr2, new SecureRandom());
                        try {
                            try {
                            } catch (Exception e11) {
                                e = e11;
                                str2 = "NULL_ERROR";
                            }
                            try {
                                if (BuildVars.LOGS_ENABLED) {
                                    byte[] bArr8 = new byte[215];
                                    c11 = 1;
                                    try {
                                        int length = bArr3.length;
                                        int i12 = 0;
                                        while (i12 < length) {
                                            byte[] bArr9 = bArr3[i12];
                                            String str6 = str;
                                            int i13 = length;
                                            for (int i14 = 0; i14 < bArr9.length; i14++) {
                                                try {
                                                    bArr8[i14] = (byte) (bArr8[i14] ^ bArr9[i14]);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    throw th;
                                                }
                                            }
                                            i12++;
                                            length = i13;
                                            str = str6;
                                        }
                                        l0.F("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr8));
                                        Arrays.fill(bArr8, (byte) 0);
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } else {
                                    c11 = 1;
                                }
                                int i15 = 0;
                                while (i15 < size) {
                                    TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i15);
                                    SerializedData serializedData2 = new SerializedData();
                                    try {
                                        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                        c12 = 2;
                                        try {
                                            mnemonic_decryptedkeypart.share = bArr3[i15];
                                            mnemonic_decryptedkeypart.serializeToStream(serializedData2);
                                            byteArray = serializedData2.toByteArray();
                                            bArr5 = bArr7;
                                            try {
                                                long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                                                l10 = Long.valueOf(key_generate_temporary_private_key);
                                                i11 = i15;
                                                try {
                                                    key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                                                    serializedData = serializedData2;
                                                    try {
                                                        long key_from_public_key = ConferenceCall.key_from_public_key(holderdc.public_key);
                                                        l11 = Long.valueOf(key_from_public_key);
                                                        try {
                                                            key_from_ecdh = ConferenceCall.key_from_ecdh(key_generate_temporary_private_key, key_from_public_key);
                                                            valueOf = Long.valueOf(key_from_ecdh);
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            bArr4 = byteArray;
                                                            l4 = null;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bArr4 = byteArray;
                                                        l4 = null;
                                                        l11 = null;
                                                        if (bArr4 != null) {
                                                            Arrays.fill(bArr4, (byte) 0);
                                                        }
                                                        serializedData.cleanup();
                                                        Long[] lArr = new Long[3];
                                                        lArr[0] = l4;
                                                        lArr[c11] = l11;
                                                        lArr[c12] = l10;
                                                        for (i10 = 0; i10 < 3; i10++) {
                                                            Long l12 = lArr[i10];
                                                            if (l12 != null) {
                                                                try {
                                                                    ConferenceCall.key_destroy(l12.longValue());
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    serializedData = serializedData2;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                serializedData = serializedData2;
                                                bArr4 = byteArray;
                                                l4 = null;
                                                l10 = null;
                                                l11 = null;
                                                if (bArr4 != null) {
                                                }
                                                serializedData.cleanup();
                                                Long[] lArr2 = new Long[3];
                                                lArr2[0] = l4;
                                                lArr2[c11] = l11;
                                                lArr2[c12] = l10;
                                                while (i10 < 3) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            serializedData = serializedData2;
                                            bArr4 = null;
                                            l4 = null;
                                            l10 = null;
                                            l11 = null;
                                            if (bArr4 != null) {
                                            }
                                            serializedData.cleanup();
                                            Long[] lArr22 = new Long[3];
                                            lArr22[0] = l4;
                                            lArr22[c11] = l11;
                                            lArr22[c12] = l10;
                                            while (i10 < 3) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            byte[] encrypt_message_for_one = ConferenceCall.encrypt_message_for_one(key_from_ecdh, byteArray);
                                            byte[] bArr10 = new byte[encrypt_message_for_one.length + 32];
                                            Vector vector2 = vector;
                                            System.arraycopy(key_to_public_key, 0, bArr10, 0, 32);
                                            System.arraycopy(encrypt_message_for_one, 0, bArr10, 32, encrypt_message_for_one.length);
                                            bArr5[i11] = bArr10;
                                            if (byteArray != null) {
                                                Arrays.fill(byteArray, (byte) 0);
                                            }
                                            serializedData.cleanup();
                                            Long[] lArr3 = new Long[3];
                                            lArr3[0] = valueOf;
                                            lArr3[c11] = l11;
                                            lArr3[2] = l10;
                                            int i16 = 0;
                                            for (int i17 = 3; i16 < i17; i17 = 3) {
                                                Long l13 = lArr3[i16];
                                                if (l13 != null) {
                                                    try {
                                                        ConferenceCall.key_destroy(l13.longValue());
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                                i16++;
                                            }
                                            i15 = i11 + 1;
                                            bArr7 = bArr5;
                                            vector = vector2;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            bArr4 = byteArray;
                                            l4 = valueOf;
                                            if (bArr4 != null) {
                                            }
                                            serializedData.cleanup();
                                            Long[] lArr222 = new Long[3];
                                            lArr222[0] = l4;
                                            lArr222[c11] = l11;
                                            lArr222[c12] = l10;
                                            while (i10 < 3) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        serializedData = serializedData2;
                                        c12 = 2;
                                    }
                                }
                                byte[][] bArr11 = bArr7;
                                byte b10 = 0;
                                Arrays.fill(c10, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                int length2 = bArr3.length;
                                int i18 = 0;
                                while (i18 < length2) {
                                    Arrays.fill(bArr3[i18], b10);
                                    i18++;
                                    b10 = 0;
                                }
                                for (int i19 = 0; i19 < size; i19++) {
                                    if (bArr11[i19] == null) {
                                        l0.i("part " + i19 + " is null");
                                        sVar.run("PART_" + i19 + "_NULL");
                                        return;
                                    }
                                }
                                TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                                enablebackup.parts = new ArrayList<>(Arrays.asList(bArr11));
                                enablebackup.new_public_key = bArr6;
                                l0Var2.S(i0Var, false, new j((Object) l0Var2, (Object) sVar, (Object) enablebackup, 7));
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                bArr = c10;
                                try {
                                    l0.j("enable backup", e);
                                    sVar.run(e.getMessage() == null ? str2 : e.getMessage());
                                    byte b11 = 0;
                                    if (bArr != null) {
                                        Arrays.fill(bArr, (byte) 0);
                                    }
                                    if (bArr2 != null) {
                                        Arrays.fill(bArr2, (byte) 0);
                                    }
                                    if (bArr3 != null) {
                                        int length3 = bArr3.length;
                                        int i20 = 0;
                                        while (i20 < length3) {
                                            Arrays.fill(bArr3[i20], b11);
                                            i20++;
                                            b11 = 0;
                                        }
                                        return;
                                    }
                                    return;
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (bArr != null) {
                                        Arrays.fill(bArr, (byte) 0);
                                    }
                                    if (bArr2 != null) {
                                        Arrays.fill(bArr2, (byte) 0);
                                    }
                                    if (bArr3 != null) {
                                        for (byte[] bArr12 : bArr3) {
                                            Arrays.fill(bArr12, (byte) 0);
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            bArr = c10;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str2 = "NULL_ERROR";
                        bArr = c10;
                        bArr3 = null;
                        l0.j("enable backup", e);
                        sVar.run(e.getMessage() == null ? str2 : e.getMessage());
                        byte b112 = 0;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        bArr = c10;
                        bArr3 = null;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    str2 = "NULL_ERROR";
                    bArr = c10;
                    bArr2 = null;
                    bArr3 = null;
                    l0.j("enable backup", e);
                    sVar.run(e.getMessage() == null ? str2 : e.getMessage());
                    byte b1122 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                } catch (Throwable th15) {
                    th = th15;
                    bArr = c10;
                    bArr2 = null;
                    bArr3 = null;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                    throw th;
                }
                break;
            case 2:
                ((l0) this.b).S((i0) this.c, true, new p((Utilities.Callback) this.d, (Utilities.Callback) obj2, (byte[]) this.e, (TLRPC.InputCheckPasswordSRP) obj, 3));
                return;
            case 3:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                byte[] bArr13 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str7 = (String) obj2;
                if (importedWalletProof == null) {
                    callback.run(str7 != null ? str7 : "NULL_ERROR");
                    callback2.run(null);
                    return;
                }
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                TL_wallet.inputWalletImported inputwalletimported = new TL_wallet.inputWalletImported();
                inputwalletimported.public_key = importedWalletProof.publicKey;
                inputwalletimported.anchor_public_key = bArr13;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                inputwalletimported.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                replacewallet.wallet = inputwalletimported;
                replacewallet.password = inputCheckPasswordSRP;
                callback2.run(replacewallet);
                return;
            case 4:
                b0 b0Var = (b0) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str8 = (String) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str8;
                    wallettransaction.date = ConnectionsManager.getInstance(b0Var.h.a).getCurrentTime();
                }
                if (b0Var.a) {
                    return;
                }
                callback22.run(wallettransaction, str9);
                return;
            case 5:
                k0 k0Var = (k0) this.b;
                String str10 = (String) this.d;
                String str11 = (String) this.c;
                String str12 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                k0Var.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || MessagesController.getInstance(k0Var.l.a).getUser(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = k0Var.b;
                int size2 = arrayList.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj3 = arrayList.get(i21);
                    i21++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                    if (TextUtils.equals(wallettransaction2.id, str10) && (wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerAddress)) {
                        TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                        wallettransactionpeeruser.user_id = walletuseraddress.user_id;
                        wallettransactionpeeruser.address = str11;
                        wallettransactionpeeruser.domain = str12;
                        wallettransaction2.peer = wallettransactionpeeruser;
                        z10 = true;
                    }
                }
                if (z10) {
                    k0Var.k();
                    k0Var.i();
                    return;
                }
                return;
            case 6:
                s sVar2 = (s) this.b;
                i0 i0Var2 = (i0) this.c;
                a2 a2Var = (a2) this.d;
                bi.n3 n3Var = (bi.n3) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error2 != null) {
                    sVar2.run(e2.x(tL_error2, "registerKey"));
                    return;
                } else {
                    Utilities.globalQueue.postRunnable(new o01(i0Var2, a2Var, tonconnectchallenge, sVar2, n3Var, 5));
                    return;
                }
            case 7:
                e2 e2Var = (e2) this.b;
                a2 a2Var2 = (a2) this.c;
                i0 i0Var3 = (i0) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str13 = (String) obj2;
                if (sendtransfer != null && str13 == null && e2Var.y(a2Var2) && !e2Var.i(a2Var2)) {
                    Utilities.globalQueue.postRunnable(new o01(e2Var, sendtransfer, a2Var2, callback3, i0Var3, 6));
                    return;
                }
                if (str13 == null) {
                    str13 = "Transfer unavailable or request expired";
                }
                e2Var.w(a2Var2, i0Var3, null, 0, str13, callback3);
                return;
            case 8:
                e2 e2Var2 = (e2) this.b;
                a2 a2Var3 = (a2) this.c;
                i0 i0Var4 = (i0) this.d;
                s sVar3 = (s) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (e2Var2.y(a2Var3) && !e2Var2.i(a2Var3)) {
                            e2Var2.w(a2Var3, i0Var4, new JSONObject().put("internalBoc", str14), -1, null, sVar3);
                            return;
                        }
                    } catch (JSONException e15) {
                        e2Var2.w(a2Var3, i0Var4, null, 0, e2.h("sign message response", e15), sVar3);
                        return;
                    }
                }
                str15 = "Request expired or wallet changed";
                e2Var2.w(a2Var3, i0Var4, null, 0, str15, sVar3);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                j2[] j2VarArr = (j2[]) this.c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                xh.n nVar = (xh.n) this.e;
                String str16 = (String) obj;
                String str17 = (String) obj2;
                zArr[0] = false;
                if (str17 != null) {
                    new wc(j2VarArr[0].topBulletinContainer, u6Var).f0(str17, false);
                    return;
                }
                nVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
                SpannableString spannableString = new SpannableString(str16);
                y11 y11Var = new y11();
                y11Var.a |= 256;
                spannableString.setSpan(new z11(y11Var, 0), 0, spannableString.length(), 33);
                nVar.setText(spannableString);
                nVar.setTextIsSelectable(true);
                nVar.setOnClickListener(null);
                nVar.setStateListAnimator(null);
                if (nVar.d || nVar.f) {
                    return;
                }
                nVar.e = true;
                if (nVar.getLayout() == null || nVar.isLayoutRequested()) {
                    return;
                }
                nVar.c((nVar.getWidth() / 2.0f) - nVar.getPaddingLeft(), ((nVar.getHeight() / 2.0f) - nVar.getPaddingTop()) + nVar.getScrollY());
                return;
            default:
                r9.Z((r9) this.c, (l0) this.b, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ p(k0 k0Var, String str, String str2, String str3) {
        this.a = 5;
        this.b = k0Var;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }

    public /* synthetic */ p(r9 r9Var, l0 l0Var, TLRPC.User user, String str) {
        this.a = 10;
        this.c = r9Var;
        this.b = l0Var;
        this.e = user;
        this.d = str;
    }
}
