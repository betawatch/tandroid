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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ft;
import org.telegram.ui.g90;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045d A[Catch: all -> 0x0380, Exception -> 0x0384, TRY_LEAVE, TryCatch #1 {all -> 0x0380, blocks: (B:137:0x032e, B:140:0x0332, B:155:0x0388, B:156:0x038b, B:161:0x037c, B:164:0x0397, B:185:0x03f2, B:186:0x03f5, B:188:0x0406, B:191:0x040a, B:204:0x0449, B:205:0x044c, B:207:0x045d, B:210:0x0461, B:217:0x046b), top: B:136:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0501 A[Catch: all -> 0x0523, TryCatch #5 {all -> 0x0523, blocks: (B:262:0x04f3, B:265:0x0505, B:279:0x0501), top: B:261:0x04f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0531  */
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
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
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
                k0 k0Var = (k0) this.b;
                b0 b0Var = (b0) this.c;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        b0Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (k0Var.J.get(str5) == b0Var) {
                            k0Var.f0(b0Var);
                            k0Var.I();
                        }
                    } catch (Exception e7) {
                        k0.j("failed to get balance of " + str5, e7);
                    }
                }
                runnable.run();
                return;
            case 1:
                k0 k0Var2 = (k0) this.b;
                ft ftVar = (ft) this.c;
                h0 h0Var = (h0) this.d;
                byte[] bArr6 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error == null || (str3 = tL_error.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    k0.i("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error != null && (str4 = tL_error.text) != null) {
                        str = str4;
                    }
                    ftVar.run(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    k0.i("enable backup: expected three backup holders");
                    ftVar.run("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr7 = new byte[size][];
                try {
                    c10 = h0Var.c();
                    try {
                        bArr2 = k0.Q(c10);
                    } catch (Exception e10) {
                        e = e10;
                        str2 = "NULL_ERROR";
                        bArr = c10;
                        bArr2 = null;
                        bArr3 = null;
                        try {
                            k0.j("enable backup", e);
                            ftVar.run(e.getMessage() == null ? str2 : e.getMessage());
                            byte b10 = 0;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
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
                } catch (Exception e11) {
                    e = e11;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th4) {
                    th = th4;
                    bArr = null;
                }
                try {
                    bArr3 = k0.a0(bArr2, new SecureRandom());
                    try {
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            bArr = c10;
                            if (bArr != null) {
                                Arrays.fill(bArr, (byte) 0);
                            }
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (bArr3 != null) {
                                for (byte[] bArr8 : bArr3) {
                                    Arrays.fill(bArr8, (byte) 0);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str2 = "NULL_ERROR";
                    }
                    try {
                        if (BuildVars.LOGS_ENABLED) {
                            byte[] bArr9 = new byte[215];
                            c11 = 1;
                            try {
                                int length = bArr3.length;
                                int i12 = 0;
                                while (i12 < length) {
                                    byte[] bArr10 = bArr3[i12];
                                    String str6 = str;
                                    int i13 = length;
                                    for (int i14 = 0; i14 < bArr10.length; i14++) {
                                        try {
                                            bArr9[i14] = (byte) (bArr9[i14] ^ bArr10[i14]);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            Arrays.fill(bArr9, (byte) 0);
                                            throw th;
                                        }
                                    }
                                    i12++;
                                    length = i13;
                                    str = str6;
                                }
                                k0.E("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr9));
                                Arrays.fill(bArr9, (byte) 0);
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } else {
                            c11 = 1;
                        }
                        int i15 = 0;
                        while (i15 < size) {
                            TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i15);
                            SerializedData serializedData2 = new SerializedData();
                            try {
                                mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                c12 = 2;
                            } catch (Throwable th8) {
                                th = th8;
                                serializedData = serializedData2;
                                c12 = 2;
                            }
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
                                            } catch (Throwable th9) {
                                                th = th9;
                                                bArr4 = byteArray;
                                                l4 = null;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
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
                                    } catch (Throwable th11) {
                                        th = th11;
                                        serializedData = serializedData2;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
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
                            } catch (Throwable th13) {
                                th = th13;
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
                                byte[] bArr11 = new byte[encrypt_message_for_one.length + 32];
                                Vector vector2 = vector;
                                System.arraycopy(key_to_public_key, 0, bArr11, 0, 32);
                                System.arraycopy(encrypt_message_for_one, 0, bArr11, 32, encrypt_message_for_one.length);
                                bArr5[i11] = bArr11;
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
                            } catch (Throwable th14) {
                                th = th14;
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
                        }
                        byte[][] bArr12 = bArr7;
                        byte b11 = 0;
                        Arrays.fill(c10, (byte) 0);
                        Arrays.fill(bArr2, (byte) 0);
                        int length2 = bArr3.length;
                        int i18 = 0;
                        while (i18 < length2) {
                            Arrays.fill(bArr3[i18], b11);
                            i18++;
                            b11 = 0;
                        }
                        for (int i19 = 0; i19 < size; i19++) {
                            if (bArr12[i19] == null) {
                                k0.i("part " + i19 + " is null");
                                ftVar.run("PART_" + i19 + "_NULL");
                                return;
                            }
                        }
                        TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                        enablebackup.parts = new ArrayList<>(Arrays.asList(bArr12));
                        enablebackup.new_public_key = bArr6;
                        k0Var2.R(h0Var, false, new i((Object) k0Var2, (Object) ftVar, (Object) enablebackup, 7));
                        return;
                    } catch (Exception e13) {
                        e = e13;
                        bArr = c10;
                        k0.j("enable backup", e);
                        ftVar.run(e.getMessage() == null ? str2 : e.getMessage());
                        byte b102 = 0;
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
                                Arrays.fill(bArr3[i20], b102);
                                i20++;
                                b102 = 0;
                            }
                            return;
                        }
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
                    str2 = "NULL_ERROR";
                    bArr = c10;
                    bArr3 = null;
                    k0.j("enable backup", e);
                    ftVar.run(e.getMessage() == null ? str2 : e.getMessage());
                    byte b1022 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                } catch (Throwable th15) {
                    th = th15;
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
                break;
            case 2:
                ((k0) this.b).R((h0) this.c, true, new n((Utilities.Callback) this.d, (Utilities.Callback) obj2, (byte[]) this.e, (TLRPC.InputCheckPasswordSRP) obj, 3));
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
                a0 a0Var = (a0) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str8 = (String) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str8;
                    wallettransaction.date = ConnectionsManager.getInstance(a0Var.h.a).getCurrentTime();
                }
                if (a0Var.a) {
                    return;
                }
                callback22.run(wallettransaction, str9);
                return;
            case 5:
                j0 j0Var = (j0) this.b;
                String str10 = (String) this.d;
                String str11 = (String) this.c;
                String str12 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                j0Var.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || MessagesController.getInstance(j0Var.j.a).getUser(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = j0Var.b;
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
                    j0Var.h();
                    j0Var.f();
                    return;
                }
                return;
            case 6:
                ft ftVar2 = (ft) this.b;
                h0 h0Var2 = (h0) this.c;
                z1 z1Var = (z1) this.d;
                s1 s1Var = (s1) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error2 != null) {
                    ftVar2.run(d2.x(tL_error2, "registerKey"));
                    return;
                } else {
                    Utilities.globalQueue.postRunnable(new g90(h0Var2, z1Var, tonconnectchallenge, ftVar2, s1Var, 27));
                    return;
                }
            case 7:
                d2 d2Var = (d2) this.b;
                z1 z1Var2 = (z1) this.c;
                h0 h0Var3 = (h0) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str13 = (String) obj2;
                if (sendtransfer != null && str13 == null && d2Var.y(z1Var2) && !d2Var.i(z1Var2)) {
                    Utilities.globalQueue.postRunnable(new g90(d2Var, sendtransfer, z1Var2, callback3, h0Var3, 28));
                    return;
                }
                if (str13 == null) {
                    str13 = "Transfer unavailable or request expired";
                }
                d2Var.w(z1Var2, h0Var3, null, 0, str13, callback3);
                return;
            case 8:
                d2 d2Var2 = (d2) this.b;
                z1 z1Var3 = (z1) this.c;
                h0 h0Var4 = (h0) this.d;
                ft ftVar3 = (ft) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (d2Var2.y(z1Var3) && !d2Var2.i(z1Var3)) {
                            d2Var2.w(z1Var3, h0Var4, new JSONObject().put("internalBoc", str14), -1, null, ftVar3);
                            return;
                        }
                    } catch (JSONException e15) {
                        d2Var2.w(z1Var3, h0Var4, null, 0, d2.h("sign message response", e15), ftVar3);
                        return;
                    }
                }
                str15 = "Request expired or wallet changed";
                d2Var2.w(z1Var3, h0Var4, null, 0, str15, ftVar3);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                i2[] i2VarArr = (i2[]) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                vh.n nVar = (vh.n) this.e;
                String str16 = (String) obj;
                String str17 = (String) obj2;
                zArr[0] = false;
                if (str17 != null) {
                    new ad(i2VarArr[0].topBulletinContainer, e6Var).e0(str17, false);
                    return;
                }
                nVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
                SpannableString spannableString = new SpannableString(str16);
                t11 t11Var = new t11();
                t11Var.a |= 256;
                spannableString.setSpan(new u11(t11Var, 0), 0, spannableString.length(), 33);
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
                s8.Z((s8) this.c, (k0) this.b, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ n(j0 j0Var, String str, String str2, String str3) {
        this.a = 5;
        this.b = j0Var;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }

    public /* synthetic */ n(s8 s8Var, k0 k0Var, TLRPC.User user, String str) {
        this.a = 10;
        this.c = s8Var;
        this.b = k0Var;
        this.e = user;
        this.d = str;
    }
}
